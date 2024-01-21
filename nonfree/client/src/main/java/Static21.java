import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "Lclient!ge;")
	public static Class7 aClass7_11;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
	public static int anInt678 = -1;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_438 = Static80.method1463("Could not complete login)3");

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_439 = Static80.method1463(" weitere Optionen");

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
	public static int anInt683 = 0;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "Lclient!rd;")
	public static Class63 aClass63_440 = aClass63_438;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_441 = Static80.method1463(" (X");

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_442 = Static80.method1463("Einloggen");

	@OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
	public static int anInt685 = -1;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	public static void method526() {
		aClass63_439 = null;
		aClass63_440 = null;
		aClass63_442 = null;
		aClass63_438 = null;
		aClass6_Sub3_Sub3_Sub2Array4 = null;
		aClass7_11 = null;
		aClass63_441 = null;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	public static void method527() {
		for (@Pc(7) int local7 = 0; local7 < Static22.anInt689; local7++) {
			@Pc(13) int local13 = Static80.anIntArray247[local7];
			@Pc(17) Class6_Sub3_Sub1_Sub2_Sub1 local17 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local13];
			if (local17 != null) {
				Static20.method509(local17.aClass6_Sub3_Sub2_1.anInt466, local17);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(I)Z")
	public static boolean method529() {
		try {
			if (Static69.anInt1998 == 2) {
				if (Static49.aClass6_Sub2_1 == null) {
					Static49.aClass6_Sub2_1 = Static125.method137(Static29.aClass7_17, Static64.anInt1833, Static37.anInt1224);
					if (Static49.aClass6_Sub2_1 == null) {
						return false;
					}
				}
				if (Static11.aClass4_2 == null) {
					Static11.aClass4_2 = new Class4(Static52.aClass7_31, aClass7_11);
				}
				if (Static1.aClass6_Sub6_Sub4_1.method1932(Static11.aClass4_2, Static22.aClass7_12, Static49.aClass6_Sub2_1)) {
					Static1.aClass6_Sub6_Sub4_1.method1928();
					Static1.aClass6_Sub6_Sub4_1.method1925(Static68.anInt1982);
					Static1.aClass6_Sub6_Sub4_1.method1935(Static114.aBoolean166, Static49.aClass6_Sub2_1);
					Static49.aClass6_Sub2_1 = null;
					Static69.anInt1998 = 0;
					Static11.aClass4_2 = null;
					Static29.aClass7_17 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static1.aClass6_Sub6_Sub4_1.method1930();
			Static49.aClass6_Sub2_1 = null;
			Static69.anInt1998 = 0;
			Static29.aClass7_17 = null;
			Static11.aClass4_2 = null;
		}
		return false;
	}
}
