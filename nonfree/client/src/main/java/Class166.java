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

@OriginalClass("client!ia")
public final class Class166 implements Runnable {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "[Lclient!af;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Z")
	private volatile boolean aBoolean351;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!mba;")
	private Class230 aClass230_4;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lclient!af;")
	public Class11 method4035(@OriginalArg(1) int arg0) {
		return this.aClass11Array1 == null || arg0 < 0 || this.aClass11Array1.length <= arg0 ? null : this.aClass11Array1[arg0];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
	public boolean method4037() {
		if (this.aBoolean351) {
			return true;
		}
		if (this.aClass230_4 == null) {
			try {
				@Pc(30) int local30 = Static548.aClass59_10 == Static115.aClass59_4 ? 80 : Static537.aClass357_3.anInt9936 + 7000;
				this.aClass230_4 = Static344.aClass173_5.method4242(new URL("http://" + Static537.aClass357_3.aString110 + ":" + local30 + "/news.ws?game=" + Static161.aClass80_6.anInt1861));
			} catch (@Pc(61) MalformedURLException local61) {
				return true;
			}
		}
		if (this.aClass230_4 == null || this.aClass230_4.anInt6256 == 2) {
			return true;
		} else if (this.aClass230_4.anInt6256 == 1) {
			if (this.aThread4 == null) {
				this.aThread4 = new Thread(this);
				this.aThread4.start();
			}
			return this.aBoolean351;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass230_4.anObject12));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class126 local22 = Static257.method4318();
			while (local19 != null) {
				local22.method2639(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method2641();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass11Array1 = new Class11[local39.length / 3];
			for (@Pc(60) int local60 = 0; local60 < local39.length; local60 += 3) {
				this.aClass11Array1[local60 / 3] = new Class11(local39[local60], local39[local60 + 1], local39[local60 + 2]);
			}
		} catch (@Pc(95) IOException local95) {
		}
		this.aBoolean351 = true;
	}
}
