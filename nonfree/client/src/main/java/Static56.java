import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!qa;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt1718;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
	public static int[] anIntArray163 = new int[1000];

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_666 = Static34.method846("@or2@");

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public static int anInt1711 = 256;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[Lclient!ec;")
	public static Class16[] aClass16Array1 = new Class16[50];

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_667 = Static34.method846("gelb:");

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_668 = Static34.method846("welle2:");

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_669 = Static34.method846("leuchten3:");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_670 = Static34.method846(" )2> @whi@");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1173() {
		aClass16Array1 = null;
		aClass55_669 = null;
		aBooleanArray6 = null;
		anIntArray163 = null;
		aClass55_670 = null;
		aClass55_667 = null;
		aClass55_668 = null;
		aClass6_Sub2_Sub2_Sub2Array9 = null;
		anIntArray164 = null;
		aClass55_666 = null;
		aClass51_1 = null;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1174() {
		@Pc(3) Class24 local3 = Static59.aClass24_1;
		synchronized (Static59.aClass24_1) {
			Static17.anInt931 = Static28.anInt1134;
			@Pc(11) int local11;
			if (Static7.anInt285 < 0) {
				for (local11 = 0; local11 < 112; local11++) {
					Static41.aBooleanArray3[local11] = false;
				}
				Static7.anInt285 = Static50.anInt3259;
			} else {
				while (Static50.anInt3259 != Static7.anInt285) {
					local11 = Static69.anIntArray191[Static50.anInt3259];
					Static50.anInt3259 = Static50.anInt3259 + 1 & 0x7F;
					if (local11 < 0) {
						Static41.aBooleanArray3[~local11] = false;
					} else {
						Static41.aBooleanArray3[local11] = true;
					}
				}
			}
			Static28.anInt1134 = Static112.anInt3227;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
	public static int method1175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * local14 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + (arg1 * (arg0 & 0xFF00) + (arg2 & 0xFF00) * local14 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1176() {
		if (Static31.anInt1201 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (Static19.anInt945 != 0) {
			local15 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static29.aClass55Array10[local24] != null) {
				@Pc(34) int local34 = Static100.anIntArray276[local24];
				@Pc(38) Class55 local38 = Static74.aClass55Array16[local24];
				if (local38 != null && local38.method1659(Static63.aClass55_750)) {
					local38 = local38.method1673(5);
				}
				if (local38 != null && local38.method1659(Static34.aClass55_505)) {
					local38 = local38.method1673(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static112.anInt3231 == 0 || Static112.anInt3231 == 1 && Static57.method1186(local38))) {
					@Pc(94) int local94 = 329 - local15 * 13;
					local15++;
					if (Static58.anInt1741 > 4 && local94 - 10 < Static27.anInt1358 + -4 && Static27.anInt1358 - 4 <= local94 - -3) {
						@Pc(141) int local141 = Static4.aClass6_Sub2_Sub2_Sub4_6.method1301(Static89.method1698(new Class55[] { Static7.aClass55_126, Static99.aClass55_1224, local38, Static29.aClass55Array10[local24] })) + 25;
						if (local141 > 450) {
							local141 = 450;
						}
						if (local141 + 4 > Static58.anInt1741) {
							if (Static91.anInt2554 >= 1) {
								Static86.method1643(2017, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local38 }), Static3.aClass55_10, 0);
							}
							Static86.method1643(2041, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local38 }), Static49.aClass55_598, 0);
							Static86.method1643(2050, 0, 0, Static89.method1698(new Class55[] { Static72.aClass55_862, local38 }), Static31.aClass55_447, 0);
						}
					}
					if (local15 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static112.anInt3231 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!te;)Lclient!te;")
	public static Class6_Sub2_Sub14 method1177(@OriginalArg(1) Class6_Sub2_Sub14 arg0) {
		@Pc(19) int local19;
		if (arg0.anInt2920 < 0) {
			local19 = arg0.anInt2880 >> 16;
		} else {
			local19 = arg0.anInt2920 >> 16;
		}
		if (!Static22.method654(local19)) {
			return null;
		} else if (arg0.anInt2906 >= 0) {
			return Static9.aClass6_Sub2_Sub14ArrayArray1[local19][arg0.anInt2906 & 0xFFFF];
		} else {
			@Pc(55) Class6_Sub2_Sub14 local55 = Static9.aClass6_Sub2_Sub14ArrayArray1[local19][arg0.anInt2906 >> 15 & 0xFFFF];
			return local55.aClass6_Sub2_Sub14Array1[arg0.anInt2906 & 0x7FFF];
		}
	}
}
