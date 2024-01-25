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

@OriginalClass("client!pa")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[Lclient!al;")
	private Class17[] aClass17Array1;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!sw;")
	private Class309 aClass309_7;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Z")
	private volatile boolean aBoolean483;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Lclient!al;")
	public Class17 method5600(@OriginalArg(0) int arg0) {
		return this.aClass17Array1 == null || arg0 < 0 || arg0 >= this.aClass17Array1.length ? null : this.aClass17Array1[arg0];
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Z")
	public boolean method5606() {
		if (this.aBoolean483) {
			return true;
		}
		if (this.aClass309_7 == null) {
			try {
				@Pc(27) int local27 = Static332.aClass5_3 == Static412.aClass5_7 ? 80 : Static338.aClass212_8.anInt6145 + 7000;
				this.aClass309_7 = Static467.aClass168_12.method4079(new URL("http://" + Static338.aClass212_8.aString157 + ":" + local27 + "/news.ws?game=" + Static31.aClass89_1.anInt2860));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass309_7 == null || this.aClass309_7.anInt8650 == 2) {
			return true;
		} else if (this.aClass309_7.anInt8650 == 1) {
			if (this.aThread4 == null) {
				this.aThread4 = new Thread(this);
				this.aThread4.start();
			}
			return this.aBoolean483;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass309_7.anObject15));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class279 local22 = Static320.method4727();
			while (local19 != null) {
				local22.method6259(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method6261();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass17Array1 = new Class17[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass17Array1[local55 / 3] = new Class17(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean483 = true;
	}
}
