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

@OriginalClass("client!um")
public final class Class338 implements Runnable {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "[Lclient!ai;")
	private Class12[] aClass12Array1;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Z")
	private volatile boolean aBoolean630;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Lclient!sa;")
	private Class299 aClass299_9;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z")
	public boolean method7446() {
		if (this.aBoolean630) {
			return true;
		}
		if (this.aClass299_9 == null) {
			try {
				@Pc(21) int local21 = Static106.aClass315_4 == Static327.aClass315_8 ? 80 : Static27.aClass300_1.anInt7993 + 7000;
				this.aClass299_9 = Static147.aClass161_4.method3817(new URL("http://" + Static27.aClass300_1.aString89 + ":" + local21 + "/news.ws?game=" + Static538.aClass263_5.anInt6964));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass299_9 == null || this.aClass299_9.anInt7985 == 2) {
			return true;
		} else if (this.aClass299_9.anInt7985 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean630;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass299_9.anObject41));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class281 local22 = Static385.method5688();
			while (local19 != null) {
				local22.method6124(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method6123();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass12Array1 = new Class12[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass12Array1[local52 / 3] = new Class12(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean630 = true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Lclient!ai;")
	public Class12 method7447(@OriginalArg(1) int arg0) {
		return this.aClass12Array1 == null || arg0 < 0 || arg0 >= this.aClass12Array1.length ? null : this.aClass12Array1[arg0];
	}
}
