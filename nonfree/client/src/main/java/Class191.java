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

@OriginalClass("client!ju")
public final class Class191 implements Runnable {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "Z")
	private volatile boolean aBoolean299;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "[Lclient!uia;")
	private Class359[] aClass359Array1;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "Lclient!rb;")
	private Class297 aClass297_1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)Z")
	public boolean method3973() {
		if (this.aBoolean299) {
			return true;
		}
		if (this.aClass297_1 == null) {
			try {
				@Pc(26) int local26 = Static99.aClass267_3 == Static71.aClass267_2 ? 80 : Static90.aClass365_2.anInt9973 + 7000;
				this.aClass297_1 = Static150.aClass202_2.method4740(new URL("http://" + Static90.aClass365_2.aString112 + ":" + local26 + "/news.ws?game=" + Static591.aClass174_7.anInt4124));
			} catch (@Pc(53) MalformedURLException local53) {
				return true;
			}
		}
		if (this.aClass297_1 == null || this.aClass297_1.anInt8459 == 2) {
			return true;
		} else if (this.aClass297_1.anInt8459 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean299;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Lclient!uia;")
	public Class359 method3974(@OriginalArg(1) int arg0) {
		return this.aClass359Array1 == null || arg0 < 0 || this.aClass359Array1.length <= arg0 ? null : this.aClass359Array1[arg0];
	}

	@OriginalMember(owner = "client!ju", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass297_1.anObject15));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class243 local22 = Static79.method1210();
			while (local19 != null) {
				local22.method5725(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5724();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass359Array1 = new Class359[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass359Array1[local52 / 3] = new Class359(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean299 = true;
	}
}
