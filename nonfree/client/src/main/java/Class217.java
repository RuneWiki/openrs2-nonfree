import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "[Lclient!bm;")
	private Class27[] aClass27Array1;

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "Lclient!kl;")
	private Class191 aClass191_13;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "Z")
	private volatile boolean aBoolean444;

	@OriginalMember(owner = "client!maa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass191_13.anObject11));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class133 local22 = Static559.method7557();
			while (local19 != null) {
				local22.method3056(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method3057();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass27Array1 = new Class27[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass27Array1[local55 / 3] = new Class27(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Z")
	public boolean method4656() {
		if (this.aBoolean444) {
			return true;
		}
		if (this.aClass191_13 == null) {
			try {
				@Pc(26) int local26 = Static405.aClass93_6 == Static76.aClass93_3 ? 80 : Static211.aClass261_2.anInt6921 + 7000;
				this.aClass191_13 = Static361.aClass198_3.method4303(new URL("http://" + Static211.aClass261_2.aString81 + ":" + local26 + "/news.ws?game=" + Static101.aClass42_1.anInt1150));
			} catch (@Pc(53) MalformedURLException local53) {
				return true;
			}
		}
		if (this.aClass191_13 == null || this.aClass191_13.anInt5014 == 2) {
			return true;
		} else if (this.aClass191_13.anInt5014 == 1) {
			if (this.aThread7 == null) {
				this.aThread7 = new Thread(this);
				this.aThread7.start();
			}
			return this.aBoolean444;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Lclient!bm;")
	public Class27 method4658(@OriginalArg(0) int arg0) {
		return this.aClass27Array1 == null || arg0 < 0 || this.aClass27Array1.length <= arg0 ? null : this.aClass27Array1[arg0];
	}
}
