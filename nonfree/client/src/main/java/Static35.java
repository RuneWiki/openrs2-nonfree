import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!cc;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!ai;")
	private static Class6 aClass6_263 = Static38.method685("glow2:");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_262 = aClass6_263;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_264 = aClass6_263;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)Z")
	public static boolean method622(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method623() {
		aClass6_262 = null;
		aClass6_264 = null;
		aClass13_1 = null;
		aClass6_263 = null;
	}
}
