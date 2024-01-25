import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[Lclient!dv;")
	public static Class54[] aClass54Array131;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method6284() {
		Static63.aClass2Array18 = null;
		Static264.aClass2Array14 = null;
		Static353.aClass2Array19 = null;
		Static125.aClass2Array6 = null;
		Static248.aClass2Array13 = null;
		Static40.aClass2Array2 = null;
		Static278.aClass2_9 = null;
		Static330.aClass2_13 = null;
		Static275.aClass18_3 = null;
		Static107.aClass2Array5 = null;
		Static93.aClass2Array4 = null;
		Static244.aClass18_1 = null;
		Static230.aClass2Array11 = null;
		Static215.aClass2Array12 = null;
		Static153.aClass2Array10 = null;
		Static3.aClass2Array1 = null;
		Static419.aClass2Array17 = null;
		Static266.aClass18_2 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	public static void method6285(@OriginalArg(1) int arg0) {
		Static214.anInt3717 = arg0;
		@Pc(7) Class268 local7 = Static232.aClass268_33;
		synchronized (Static232.aClass268_33) {
			Static232.aClass268_33.method6160();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!te;")
	public static Class116 method6289(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class116_Sub1(arg0, 5000);
	}
}
