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

@OriginalClass("client!gm")
public final class Class120 implements Runnable {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Z")
	private volatile boolean aBoolean305;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "[Lclient!uaa;")
	private Class335[] aClass335Array1;

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!sb;")
	private Class301 aClass301_5;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Lclient!uaa;")
	public Class335 method3454(@OriginalArg(1) int arg0) {
		return this.aClass335Array1 == null || arg0 < 0 || arg0 >= this.aClass335Array1.length ? null : this.aClass335Array1[arg0];
	}

	@OriginalMember(owner = "client!gm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass301_5.anObject18));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class178 local22 = Static448.method5824();
			while (local19 != null) {
				local22.method4807(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method4809();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass335Array1 = new Class335[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass335Array1[local55 / 3] = new Class335(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean305 = true;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Z")
	public boolean method3458() {
		if (this.aBoolean305) {
			return true;
		}
		if (this.aClass301_5 == null) {
			try {
				@Pc(21) int local21 = Static277.aClass313_9 == Static101.aClass313_5 ? 80 : Static490.aClass280_4.anInt8497 + 7000;
				this.aClass301_5 = Static51.aClass118_1.method3399(new URL("http://" + Static490.aClass280_4.aString87 + ":" + local21 + "/news.ws?game=" + Static18.aClass217_1.anInt6835));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass301_5 == null || this.aClass301_5.anInt8915 == 2) {
			return true;
		} else if (this.aClass301_5.anInt8915 == 1) {
			if (this.aThread3 == null) {
				this.aThread3 = new Thread(this);
				this.aThread3.start();
			}
			return this.aBoolean305;
		} else {
			return false;
		}
	}
}
