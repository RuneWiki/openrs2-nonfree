import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!g;")
	public static Class26 aClass26_11;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!hc;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	public static int anInt1261;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt1262;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_26;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt1251 = 0;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!u;")
	private static Class74 aClass74_883 = Static72.method1077("Welcome to RuneScape");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_882 = aClass74_883;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public static int anInt1263 = -1;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_884 = Static72.method1077("leuchten3:");

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_885 = Static72.method1077("Benutzername: ");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLclient!g;Lclient!g;)V")
	public static void method873(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		Static82.aClass26_20 = arg0;
		Static101.aClass26_26 = arg1;
		Static54.anInt1335 = Static82.aClass26_20.method1369(3);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!u;Lclient!u;Lclient!u;)V")
	public static void method874(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) Class74 arg2) {
		Static49.aClass74_851 = arg1;
		Static49.aClass74_847 = arg0;
		Static49.aClass74_849 = arg2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method876() {
		aClass74_883 = null;
		aClass74_882 = null;
		aClass26_11 = null;
		aClass33_1 = null;
		aClass74_885 = null;
		aClass74_884 = null;
		aByteArray9 = null;
		anObject1 = null;
		anIntArray142 = null;
		aClass2_Sub2_Sub1_Sub1_26 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method877() {
		@Pc(7) int local7 = Static66.anInt1462;
		@Pc(9) int local9 = Static10.anInt321;
		@Pc(11) int local11 = Static23.anInt642;
		@Pc(13) int local13 = Static9.anInt299;
		Static58.method702(local7, local9, local13, local11, 6116423);
		Static58.method702(local7 + 1, local9 + 1, local13 - 2, 16, 0);
		Static58.method712(local7 + 1, local9 - -18, local13 - 2, local11 + -19, 0);
		Static54.aClass2_Sub2_Sub1_Sub3_7.method308(Static75.aClass74_1111, local7 + 3, local9 + 14, 6116423);
		@Pc(59) int local59 = Static62.anInt1414;
		@Pc(61) int local61 = Static46.anInt1062;
		if (Static78.anInt1701 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static78.anInt1701 == 1) {
			local59 -= 205;
			local61 -= 553;
		}
		if (Static78.anInt1701 == 2) {
			local59 -= 357;
			local61 -= 17;
		}
		for (@Pc(82) int local82 = 0; local82 < Static112.anInt2421; local82++) {
			@Pc(97) int local97 = (Static112.anInt2421 - local82 - 1) * 15 + local9 + 31;
			@Pc(99) int local99 = 16777215;
			if (local61 > local7 && local61 < local13 + local7 && local97 - 13 < local59 && local59 < local97 + 3) {
				local99 = 16776960;
			}
			Static54.aClass2_Sub2_Sub1_Sub3_7.method324(Static92.aClass74Array14[local82], local7 + 3, local97, local99, true);
		}
	}
}
