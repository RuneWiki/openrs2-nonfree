import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!tw", name = "P", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!tw", name = "F", descriptor = "Lclient!te;")
	public static Class3_Sub33_Sub3 aClass3_Sub33_Sub3_3;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B[S)[S")
	public static short[] method8410(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(21) short[] local21 = new short[arg0.length];
			Static732.method6319(arg0, 0, local21, 0, arg0.length);
			return local21;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)V")
	public static void method8411() {
		if (Static74.anInt1708 == 10) {
			Static74.anInt1708 = 11;
		}
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method8413() {
		@Pc(16) String local16 = "www";
		if (Static416.aClass379_6 == Static585.aClass379_11) {
			local16 = "www-wtrc";
		} else if (Static253.aClass379_7 == Static416.aClass379_6) {
			local16 = "www-wtqa";
		} else if (Static585.aClass379_10 == Static416.aClass379_6) {
			local16 = "www-wtwip";
		}
		@Pc(47) String local47 = "";
		if (Static65.aString113 != null) {
			local47 = "/p=" + Static65.aString113;
		}
		return "http://" + local16 + "." + Static346.aClass309_6.aString103 + ".com/l=" + Static456.anInt7118 + "/a=" + Static281.anInt4321 + local47 + "/";
	}
}
