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

@OriginalClass("client!lk")
public final class Class215 implements Runnable {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	private volatile boolean aBoolean435;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[Lclient!an;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!hu;")
	private Class150 aClass150_5;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lclient!an;")
	public Class18 method5265(@OriginalArg(0) int arg0) {
		return this.aClass18Array1 == null || arg0 < 0 || arg0 >= this.aClass18Array1.length ? null : this.aClass18Array1[arg0];
	}

	@OriginalMember(owner = "client!lk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass150_5.anObject8));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class29 local22 = Static311.method4972();
			while (local19 != null) {
				local22.method842(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method840();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass18Array1 = new Class18[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass18Array1[local55 / 3] = new Class18(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
	public boolean method5266() {
		if (this.aBoolean435) {
			return true;
		}
		if (this.aClass150_5 == null) {
			try {
				@Pc(30) int local30 = Static420.aClass240_5 == Static513.aClass240_7 ? 80 : Static511.aClass337_4.anInt9843 + 7000;
				this.aClass150_5 = Static234.aClass333_5.method8133(new URL("http://" + Static511.aClass337_4.aString103 + ":" + local30 + "/news.ws?game=" + Static630.aClass77_8.anInt2295));
			} catch (@Pc(57) MalformedURLException local57) {
				return true;
			}
		}
		if (this.aClass150_5 == null || this.aClass150_5.anInt4247 == 2) {
			return true;
		} else if (this.aClass150_5.anInt4247 == 1) {
			if (this.aThread3 == null) {
				this.aThread3 = new Thread(this);
				this.aThread3.start();
			}
			return this.aBoolean435;
		} else {
			return false;
		}
	}
}
