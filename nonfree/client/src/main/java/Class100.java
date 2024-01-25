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

@OriginalClass("client!fd")
public final class Class100 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	private volatile boolean aBoolean212;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!oaa;")
	private Class224 aClass224_4;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[Lclient!fi;")
	private Class106[] aClass106Array1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z")
	public boolean method2342() {
		if (this.aBoolean212) {
			return true;
		}
		if (this.aClass224_4 == null) {
			try {
				@Pc(27) int local27 = Static101.aClass45_4 == Static338.aClass45_6 ? 80 : Static259.aClass297_4.anInt8579 + 7000;
				this.aClass224_4 = Static174.aClass313_24.method6995(new URL("http://" + Static259.aClass297_4.aString70 + ":" + local27 + "/news.ws?game=" + Static172.aClass68_4.anInt1509));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass224_4 == null || this.aClass224_4.anInt6632 == 2) {
			return true;
		} else if (this.aClass224_4.anInt6632 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean212;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lclient!fi;")
	public Class106 method2343(@OriginalArg(0) int arg0) {
		return this.aClass106Array1 == null || arg0 < 0 || arg0 >= this.aClass106Array1.length ? null : this.aClass106Array1[arg0];
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass224_4.anObject14));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class285 local22 = Static291.method4407();
			while (local19 != null) {
				local22.method6415(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method6417();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass106Array1 = new Class106[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass106Array1[local52 / 3] = new Class106(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean212 = true;
	}
}
