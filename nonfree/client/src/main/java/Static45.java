import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
	public static int anInt1131;

	@OriginalMember(owner = "client!fb", name = "gb", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array4;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_518 = Static51.method932("p11_full");

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!fb", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_519 = Static51.method932("mapscene");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	public static void method869() {
		aClass10_519 = null;
		anIntArray135 = null;
		aClass2_Sub1_Sub4_Sub2Array4 = null;
		aClass10_518 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public static void method870(@OriginalArg(0) int arg0) {
		if (Static49.anInt1185 == arg0) {
			return;
		}
		if (Static49.anInt1185 == 0) {
			Static161.method2443();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static60.anInt1504 = 0;
			Static149.anInt3226 = 0;
			Static81.anInt1870 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static74.aClass34_6 != null) {
			Static74.aClass34_6.method1136();
			Static74.aClass34_6 = null;
		}
		if (Static49.anInt1185 == 25) {
			Static65.anInt1582 = 1;
			Static152.anInt3301 = 0;
			Static91.anInt2156 = 0;
			Static28.anInt773 = 1;
			Static156.anInt3342 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static67.method2099(Static26.aClass29_Sub1_17, Static25.aCanvas1, Static101.aClass29_Sub1_34);
		} else {
			Static101.method1661();
		}
		Static49.anInt1185 = arg0;
	}
}
