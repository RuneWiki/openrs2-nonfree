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

@OriginalClass("client!is")
public final class Class165 implements Runnable {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[Lclient!cfa;")
	private Class53[] aClass53Array1;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Z")
	private volatile boolean aBoolean350;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!vfa;")
	private Class347 aClass347_1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lclient!cfa;")
	public Class53 method3613(@OriginalArg(0) int arg0) {
		return this.aClass53Array1 == null || arg0 < 0 || this.aClass53Array1.length <= arg0 ? null : this.aClass53Array1[arg0];
	}

	@OriginalMember(owner = "client!is", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass347_1.anObject49));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class94 local22 = Static565.method7677();
			while (local19 != null) {
				local22.method1774(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method1775();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass53Array1 = new Class53[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass53Array1[local55 / 3] = new Class53(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean350 = true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Z")
	public boolean method3615() {
		if (this.aBoolean350) {
			return true;
		}
		if (this.aClass347_1 == null) {
			try {
				@Pc(26) int local26 = Static207.aClass258_3 == Static375.aClass258_6 ? 80 : Static275.aClass170_5.anInt4548 + 7000;
				this.aClass347_1 = Static356.aClass287_5.method6531(new URL("http://" + Static275.aClass170_5.aString35 + ":" + local26 + "/news.ws?game=" + Static328.aClass284_2.anInt7923));
			} catch (@Pc(53) MalformedURLException local53) {
				return true;
			}
		}
		if (this.aClass347_1 == null || this.aClass347_1.anInt9172 == 2) {
			return true;
		} else if (this.aClass347_1.anInt9172 == 1) {
			if (this.aThread3 == null) {
				this.aThread3 = new Thread(this);
				this.aThread3.start();
			}
			return this.aBoolean350;
		} else {
			return false;
		}
	}
}
