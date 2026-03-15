package com.example.demo_11;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    EditText urledittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = findViewById(R.id.webview);
        urledittext = findViewById(R.id.URL);

        webview.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://www.google.com");
    }
