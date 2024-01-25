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

@OriginalClass("client!eb")
public final class Class77 implements Runnable {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lclient!mn;")
	private Class228[] aClass228Array1;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!fe;")
	private Class103 aClass103_4;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
	private volatile boolean aBoolean125;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lclient!mn;")
	public Class228 method1836(@OriginalArg(0) int arg0) {
		return this.aClass228Array1 == null || arg0 < 0 || this.aClass228Array1.length <= arg0 ? null : this.aClass228Array1[arg0];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
	public boolean method1837() {
		if (this.aBoolean125) {
			return true;
		}
		if (this.aClass103_4 == null) {
			try {
				@Pc(26) int local26 = Static74.aClass104_2 == Static648.aClass104_9 ? 80 : Static506.aClass354_5.anInt9837 + 7000;
				this.aClass103_4 = Static569.aClass380_6.method8811(new URL("http://" + Static506.aClass354_5.aString135 + ":" + local26 + "/news.ws?game=" + Static457.aClass176_6.anInt4801));
			} catch (@Pc(55) MalformedURLException local55) {
				return true;
			}
		}
		if (this.aClass103_4 == null || this.aClass103_4.anInt2541 == 2) {
			return true;
		} else if (this.aClass103_4.anInt2541 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean125;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass103_4.anObject9));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class343 local22 = Static538.method1734();
			while (local19 != null) {
				local22.method8072(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method8071();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass228Array1 = new Class228[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass228Array1[local55 / 3] = new Class228(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean125 = true;
	}
}
