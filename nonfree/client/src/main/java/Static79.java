import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_597 = Static38.method685("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_598 = Static38.method685("null");

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!ai;")
	private static Class6 aClass6_599 = Static38.method685("Login");

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_600 = aClass6_599;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
	public static void method1237() {
		aClass6_600 = null;
		aClass6_598 = null;
		aClass6_599 = null;
		aClass6_597 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
	public static boolean method1239(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
