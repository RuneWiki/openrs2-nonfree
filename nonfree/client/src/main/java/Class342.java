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

@OriginalClass("client!ul")
public final class Class342 implements Runnable {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Lclient!sca;")
	private Class304 aClass304_9;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	private volatile boolean aBoolean686;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[Lclient!mu;")
	private Class225[] aClass225Array1;

	@OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass304_9.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class285 local22 = Static465.method7059();
			while (local19 != null) {
				local22.method7179(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method7174();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass225Array1 = new Class225[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass225Array1[local52 / 3] = new Class225(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean686 = true;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Lclient!mu;")
	public Class225 method8225(@OriginalArg(0) int arg0) {
		return this.aClass225Array1 == null || arg0 < 0 || this.aClass225Array1.length <= arg0 ? null : this.aClass225Array1[arg0];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
	public boolean method8227() {
		if (this.aBoolean686) {
			return true;
		}
		if (this.aClass304_9 == null) {
			try {
				@Pc(27) int local27 = Static42.aClass135_2 == Static2.aClass135_1 ? 80 : Static495.aClass363_5.anInt9891 + 7000;
				this.aClass304_9 = Static205.aClass138_2.method3576(new URL("http://" + Static495.aClass363_5.aString109 + ":" + local27 + "/news.ws?game=" + Static212.aClass222_2.anInt6790));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass304_9 == null || this.aClass304_9.anInt8838 == 2) {
			return true;
		} else if (this.aClass304_9.anInt8838 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean686;
		} else {
			return false;
		}
	}
}
