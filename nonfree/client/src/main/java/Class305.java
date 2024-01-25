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

@OriginalClass("client!sc")
public final class Class305 implements Runnable {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lclient!lg;")
	private Class208[] aClass208Array1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private volatile boolean aBoolean653;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!ae;")
	private Class5 aClass5_10;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
	public boolean method6204() {
		if (this.aBoolean653) {
			return true;
		}
		if (this.aClass5_10 == null) {
			try {
				@Pc(21) int local21 = Static416.aClass232_7 == Static340.aClass232_14 ? 80 : Static236.aClass292_2.anInt7261 + 7000;
				this.aClass5_10 = Static169.aClass99_2.method1784(new URL("http://" + Static236.aClass292_2.aString111 + ":" + local21 + "/news.ws?game=" + Static18.aClass308_7.anInt7714));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass5_10 == null || this.aClass5_10.anInt151 == 2) {
			return true;
		} else if (this.aClass5_10.anInt151 == 1) {
			if (this.aThread7 == null) {
				this.aThread7 = new Thread(this);
				this.aThread7.start();
			}
			return this.aBoolean653;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!lg;")
	public Class208 method6205(@OriginalArg(0) int arg0) {
		return this.aClass208Array1 == null || arg0 < 0 || arg0 >= this.aClass208Array1.length ? null : this.aClass208Array1[arg0];
	}

	@OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass5_10.anObject1));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class197 local22 = Static83.method1254();
			while (local19 != null) {
				local22.method4071(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method4072();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass208Array1 = new Class208[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass208Array1[local55 / 3] = new Class208(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean653 = true;
	}
}
