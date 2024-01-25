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

@OriginalClass("client!nt")
public final class Class255 implements Runnable {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!fo;")
	private Class129 aClass129_14;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
	private volatile boolean aBoolean525;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[Lclient!aha;")
	private Class14[] aClass14Array1;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lclient!aha;")
	public Class14 method5810(@OriginalArg(0) int arg0) {
		return this.aClass14Array1 == null || arg0 < 0 || this.aClass14Array1.length <= arg0 ? null : this.aClass14Array1[arg0];
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z")
	public boolean method5811() {
		if (this.aBoolean525) {
			return true;
		}
		if (this.aClass129_14 == null) {
			try {
				@Pc(22) int local22 = Static229.aClass309_8 == Static216.aClass309_6 ? 80 : Static110.aClass161_1.anInt4423 + 7000;
				this.aClass129_14 = Static499.aClass231_4.method5292(new URL("http://" + Static110.aClass161_1.aString54 + ":" + local22 + "/news.ws?game=" + Static102.aClass181_38.anInt4848));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass129_14 == null || this.aClass129_14.anInt3299 == 2) {
			return true;
		} else if (this.aClass129_14.anInt3299 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean525;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass129_14.anObject7));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class4 local22 = Static316.method4976();
			while (local19 != null) {
				local22.method43(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method45();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass14Array1 = new Class14[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass14Array1[local55 / 3] = new Class14(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean525 = true;
	}
}
