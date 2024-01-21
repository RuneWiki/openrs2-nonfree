import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt2447;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
	public static int anInt2462;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt2445 = -1;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1069 = Static51.method932("logo");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt2446 = -1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1070 = Static51.method932("Wordpack geladen)3");

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1071 = Static51.method932("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1072 = Static51.method932("flash1:");

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1073 = Static51.method932("<col=ff7000>");

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1074 = aClass10_1072;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1075 = Static51.method932("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public static int anInt2459 = 0;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1076 = aClass10_1072;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIZII)V")
	public static void method1726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static76.method1263(arg3)) {
			Static120.method1935(-1, arg5, Static90.aClass23ArrayArray1[arg3], arg4, arg0, arg1, arg6, arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1728() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1729() {
		aClass10_1069 = null;
		aClass10_1071 = null;
		aClass10_1072 = null;
		aClass10_1070 = null;
		aClass10_1074 = null;
		aClass10_1073 = null;
		aClass10_1075 = null;
		aClass10_1076 = null;
	}
}
