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

@OriginalClass("client!pha")
public final class Class289 implements Runnable {

	@OriginalMember(owner = "client!pha", name = "h", descriptor = "Lclient!sfa;")
	private Class338 aClass338_5;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "Z")
	private volatile boolean aBoolean531;

	@OriginalMember(owner = "client!pha", name = "e", descriptor = "[Lclient!lia;")
	private Class230[] aClass230Array1;

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)Z")
	public boolean method6805() {
		if (this.aBoolean531) {
			return true;
		}
		if (this.aClass338_5 == null) {
			try {
				@Pc(23) int local23 = Static416.aClass379_6 == Static286.aClass379_8 ? 80 : Static320.aClass43_4.anInt1402 + 7000;
				this.aClass338_5 = Static122.aClass47_1.method1393(new URL("http://" + Static320.aClass43_4.aString20 + ":" + local23 + "/news.ws?game=" + Static346.aClass309_6.anInt8217));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass338_5 == null || this.aClass338_5.anInt8934 == 2) {
			return true;
		} else if (this.aClass338_5.anInt8934 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean531;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)Lclient!lia;")
	public Class230 method6806(@OriginalArg(1) int arg0) {
		return this.aClass230Array1 == null || arg0 < 0 || arg0 >= this.aClass230Array1.length ? null : this.aClass230Array1[arg0];
	}

	@OriginalMember(owner = "client!pha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass338_5.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class142 local22 = Static494.method6742();
			while (local19 != null) {
				local22.method3258(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method3260();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass230Array1 = new Class230[local39.length / 3];
			for (@Pc(60) int local60 = 0; local60 < local39.length; local60 += 3) {
				this.aClass230Array1[local60 / 3] = new Class230(local39[local60], local39[local60 + 1], local39[local60 + 2]);
			}
		} catch (@Pc(99) IOException local99) {
		}
		this.aBoolean531 = true;
	}
}
