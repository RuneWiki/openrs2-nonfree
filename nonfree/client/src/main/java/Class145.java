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

@OriginalClass("client!ih")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!ue;")
	private Class331 aClass331_5;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[Lclient!ti;")
	private Class318[] aClass318Array1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Z")
	private volatile boolean aBoolean289;

	@OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass331_5.anObject18));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class335 local22 = Static497.method6752();
			while (local19 != null) {
				local22.method7310(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method7314();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass318Array1 = new Class318[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass318Array1[local55 / 3] = new Class318(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Lclient!ti;")
	public Class318 method3685(@OriginalArg(0) int arg0) {
		return this.aClass318Array1 == null || arg0 < 0 || arg0 >= this.aClass318Array1.length ? null : this.aClass318Array1[arg0];
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z")
	public boolean method3686() {
		if (this.aBoolean289) {
			return true;
		}
		if (this.aClass331_5 == null) {
			try {
				@Pc(21) int local21 = Static542.aClass194_5 == Static580.aClass194_7 ? 80 : Static226.aClass105_4.anInt3307 + 7000;
				this.aClass331_5 = Static352.aClass272_2.method6128(new URL("http://" + Static226.aClass105_4.aString26 + ":" + local21 + "/news.ws?game=" + Static317.aClass37_3.anInt1063));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass331_5 == null || this.aClass331_5.anInt8818 == 2) {
			return true;
		} else if (this.aClass331_5.anInt8818 == 1) {
			if (this.aThread4 == null) {
				this.aThread4 = new Thread(this);
				this.aThread4.start();
			}
			return this.aBoolean289;
		} else {
			return false;
		}
	}
}
