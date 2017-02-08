package com.gura.android_git;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // FloatingActionButton 의 참조값 얻어오기
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        // 버튼을 눌럿을때 감시할 리스너 등록
        fab.setOnClickListener(new View.OnClickListener() {
            // 버튼을 눌렀을때 호출되는 메소드
            @Override
            public void onClick(View view) {
                // 하단 스네이크바 띄우기
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    // 우상단 옵션 메뉴 만들기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 메뉴 전개자 객체를 이용해서 res/menu/menu_main.xml 문서를 전개해서
        // 메뉴를 구성해준다.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // 우상단 옵션 메뉴를 클릭했을때 호출되는 메소드
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //눌러진 메뉴 아이템의 아이디를 읽어온다.
        int id = item.getItemId();

        String msg = "";
        if (id == R.id.action_settings) { //설정 메뉴를 눌렀을때
            msg = "설정!";
        } else if (id == R.id.action_add) { //추가 메뉴를 눌렀을때
            msg = "추가!";
        } else if (id == R.id.action_search) {//검색 메뉴를 눌렀을때
            msg = "검색!";
        }
        //토스트 메세지 띄우기
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
