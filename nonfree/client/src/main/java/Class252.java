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

@OriginalClass("client!pb")
public final class Class252 implements Runnable {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[Lclient!mc;")
	private Class213[] aClass213Array1;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private volatile boolean aBoolean574;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!av;")
	private Class26 aClass26_30;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!mc;")
	public Class213 method6397(@OriginalArg(0) int arg0) {
		return this.aClass213Array1 == null || arg0 < 0 || this.aClass213Array1.length <= arg0 ? null : this.aClass213Array1[arg0];
	}

	@OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass26_30.anObject3));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class280 local22 = Static567.method7828();
			while (local19 != null) {
				local22.method6726(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method6722();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass213Array1 = new Class213[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass213Array1[local55 / 3] = new Class213(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean574 = true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z")
	public boolean method6399() {
		if (this.aBoolean574) {
			return true;
		}
		if (this.aClass26_30 == null) {
			try {
				@Pc(21) int local21 = Static267.aClass86_7 == Static95.aClass86_5 ? 80 : Static478.aClass322_4.anInt9045 + 7000;
				this.aClass26_30 = Static375.aClass359_4.method8274(new URL("http://" + Static478.aClass322_4.aString83 + ":" + local21 + "/news.ws?game=" + Static499.aClass63_15.anInt1690));
			} catch (@Pc(50) MalformedURLException local50) {
				return true;
			}
		}
		if (this.aClass26_30 == null || this.aClass26_30.anInt762 == 2) {
			return true;
		} else if (this.aClass26_30.anInt762 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean574;
		} else {
			return false;
		}
	}
}
