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

@OriginalClass("client!cv")
public final class Class63 implements Runnable {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Z")
	private volatile boolean aBoolean153;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "[Lclient!vr;")
	private Class349[] aClass349Array1;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!tj;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)Lclient!vr;")
	public Class349 method1610(@OriginalArg(1) int arg0) {
		return this.aClass349Array1 == null || arg0 < 0 || this.aClass349Array1.length <= arg0 ? null : this.aClass349Array1[arg0];
	}

	@OriginalMember(owner = "client!cv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass316_1.anObject136));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class244 local22 = Static494.method7139();
			while (local19 != null) {
				local22.method5571(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5573();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass349Array1 = new Class349[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass349Array1[local52 / 3] = new Class349(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean153 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)Z")
	public boolean method1612() {
		if (this.aBoolean153) {
			return true;
		}
		if (this.aClass316_1 == null) {
			try {
				@Pc(21) int local21 = Static383.aClass326_7 == Static342.aClass326_6 ? 80 : Static454.aClass271_4.anInt7991 + 7000;
				this.aClass316_1 = Static372.aClass366_5.method8268(new URL("http://" + Static454.aClass271_4.aString164 + ":" + local21 + "/news.ws?game=" + Static162.aClass128_1.anInt3622));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass316_1 == null || this.aClass316_1.anInt9478 == 2) {
			return true;
		} else if (this.aClass316_1.anInt9478 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean153;
		} else {
			return false;
		}
	}
}
