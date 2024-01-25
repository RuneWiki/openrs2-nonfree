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

@OriginalClass("client!bba")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "Lclient!tba;")
	private Class331 aClass331_1;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "Z")
	private volatile boolean aBoolean39;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "[Lclient!vea;")
	private Class364[] aClass364Array1;

	@OriginalMember(owner = "client!bba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass331_1.anObject20));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class215 local22 = Static176.method2983();
			while (local19 != null) {
				local22.method5275(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5279();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass364Array1 = new Class364[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass364Array1[local52 / 3] = new Class364(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(83) IOException local83) {
		}
		this.aBoolean39 = true;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)Z")
	public boolean method493() {
		if (this.aBoolean39) {
			return true;
		}
		if (this.aClass331_1 == null) {
			try {
				@Pc(22) int local22 = Static560.aClass187_13 == Static217.aClass187_7 ? 80 : Static343.aClass395_2.anInt10873 + 7000;
				this.aClass331_1 = Static570.aClass268_5.method6334(new URL("http://" + Static343.aClass395_2.aString122 + ":" + local22 + "/news.ws?game=" + Static218.aClass98_2.anInt2677));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass331_1 == null || this.aClass331_1.anInt9108 == 2) {
			return true;
		} else if (this.aClass331_1.anInt9108 == 1) {
			if (this.aThread3 == null) {
				this.aThread3 = new Thread(this);
				this.aThread3.start();
			}
			return this.aBoolean39;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Lclient!vea;")
	public Class364 method495(@OriginalArg(1) int arg0) {
		return this.aClass364Array1 == null || arg0 < 0 || arg0 >= this.aClass364Array1.length ? null : this.aClass364Array1[arg0];
	}
}
