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

@OriginalClass("client!sca")
public final class Class316 implements Runnable {

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "Z")
	private volatile boolean aBoolean678;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "Lclient!vd;")
	private Class366 aClass366_7;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "[Lclient!cv;")
	private Class78[] aClass78Array1;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)Z")
	public boolean method7637() {
		if (this.aBoolean678) {
			return true;
		}
		if (this.aClass366_7 == null) {
			try {
				@Pc(24) int local24 = Static570.aClass201_10 == Static408.aClass201_8 ? 80 : Static63.aClass54_4.anInt869 + 7000;
				this.aClass366_7 = Static294.aClass230_3.method5352(new URL("http://" + Static63.aClass54_4.aString15 + ":" + local24 + "/news.ws?game=" + Static256.aClass333_3.anInt9710));
			} catch (@Pc(55) MalformedURLException local55) {
				return true;
			}
		}
		if (this.aClass366_7 == null || this.aClass366_7.anInt10206 == 2) {
			return true;
		} else if (this.aClass366_7.anInt10206 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean678;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BI)Lclient!cv;")
	public Class78 method7639(@OriginalArg(1) int arg0) {
		return this.aClass78Array1 == null || arg0 < 0 || arg0 >= this.aClass78Array1.length ? null : this.aClass78Array1[arg0];
	}

	@OriginalMember(owner = "client!sca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass366_7.anObject18));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class121 local22 = Static395.method5774();
			while (local19 != null) {
				local22.method2201(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method2203();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass78Array1 = new Class78[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass78Array1[local57 / 3] = new Class78(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(96) IOException local96) {
		}
		this.aBoolean678 = true;
	}
}
