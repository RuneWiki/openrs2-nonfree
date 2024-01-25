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

@OriginalClass("client!kv")
public final class Class178 implements Runnable {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
	private volatile boolean aBoolean394;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[Lclient!qh;")
	private Class272[] aClass272Array1;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!tj;")
	private Class328 aClass328_4;

	@OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass328_4.anObject21));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class207 local22 = Static629.method8731();
			while (local19 != null) {
				local22.method5617(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5615();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass272Array1 = new Class272[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass272Array1[local55 / 3] = new Class272(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean394 = true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lclient!qh;")
	public Class272 method5143(@OriginalArg(0) int arg0) {
		return this.aClass272Array1 == null || arg0 < 0 || arg0 >= this.aClass272Array1.length ? null : this.aClass272Array1[arg0];
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z")
	public boolean method5144() {
		if (this.aBoolean394) {
			return true;
		}
		if (this.aClass328_4 == null) {
			try {
				@Pc(30) int local30 = Static418.aClass35_3 == Static212.aClass35_2 ? 80 : Static29.aClass56_2.anInt1712 + 7000;
				this.aClass328_4 = Static529.aClass112_6.method3236(new URL("http://" + Static29.aClass56_2.aString17 + ":" + local30 + "/news.ws?game=" + Static630.aClass271_17.anInt8162));
			} catch (@Pc(57) MalformedURLException local57) {
				return true;
			}
		}
		if (this.aClass328_4 == null || this.aClass328_4.anInt9389 == 2) {
			return true;
		} else if (this.aClass328_4.anInt9389 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean394;
		} else {
			return false;
		}
	}
}
