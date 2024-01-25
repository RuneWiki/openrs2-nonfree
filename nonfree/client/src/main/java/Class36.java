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

@OriginalClass("client!bs")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[Lclient!nda;")
	private Class225[] aClass225Array1;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Lclient!dn;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "Z")
	private volatile boolean aBoolean89;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!bs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass66_1.anObject4));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class137 local22 = Static572.method8182();
			while (local19 != null) {
				local22.method3279(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method3277();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass225Array1 = new Class225[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass225Array1[local55 / 3] = new Class225(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Z")
	public boolean method1174() {
		if (this.aBoolean89) {
			return true;
		}
		if (this.aClass66_1 == null) {
			try {
				@Pc(22) int local22 = Static51.aClass109_2 == Static508.aClass109_7 ? 80 : Static516.aClass329_3.anInt9698 + 7000;
				this.aClass66_1 = Static480.aClass326_3.method7790(new URL("http://" + Static516.aClass329_3.aString124 + ":" + local22 + "/news.ws?game=" + Static581.aClass335_4.anInt9905));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass66_1 == null || this.aClass66_1.anInt2308 == 2) {
			return true;
		} else if (this.aClass66_1.anInt2308 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean89;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lclient!nda;")
	public Class225 method1175(@OriginalArg(1) int arg0) {
		return this.aClass225Array1 == null || arg0 < 0 || this.aClass225Array1.length <= arg0 ? null : this.aClass225Array1[arg0];
	}
}
