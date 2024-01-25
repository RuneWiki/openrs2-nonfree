import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qba", name = "F", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_173 = new Class81(73, 7);

	@OriginalMember(owner = "client!qba", name = "H", descriptor = "[I")
	public static final int[] anIntArray492 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qba", name = "I", descriptor = "[I")
	public static final int[] anIntArray493 = new int[4096];

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(IJ)V")
	public static void method5918(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if ((long) 0 == arg0 % 10L) {
			Static469.method6620(arg0 - 1L);
			Static469.method6620(1L);
		} else {
			Static469.method6620(arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method5921() {
		@Pc(7) String local7 = "www";
		if (Static243.aClass218_5 == Static253.aClass218_6) {
			local7 = "www-wtrc";
		} else if (Static428.aClass218_7 == Static253.aClass218_6) {
			local7 = "www-wtqa";
		} else if (Static363.aClass218_9 == Static253.aClass218_6) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static74.aString17 != null) {
			local33 = "/p=" + Static74.aString17;
		}
		return "http://" + local7 + "." + Static275.aClass230_2.aString65 + ".com/l=" + Static562.anInt9127 + "/a=" + Static208.anInt8805 + local33 + "/";
	}
}
