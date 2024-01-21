import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	public static int anInt1055;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
	public static int anInt1057;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_457 = Static24.method441("@gr1@");

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1044 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_461 = Static24.method441(" seconds)3");

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_458 = aClass65_461;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_459 = Static24.method441("backtop1");

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_460 = Static24.method441("Handel)4Duell");

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
	public static int[] anIntArray147 = new int[4000];

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_465 = Static24.method441("Login server offline)3");

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_462 = aClass65_465;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_463 = Static24.method441("Mem:");

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_464 = Static24.method441("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZ)V")
	public static void method628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) int local8 = arg0; local8 <= arg3 + arg0; local8++) {
			for (@Pc(12) int local12 = arg1; local12 <= arg2 + arg1; local12++) {
				if (local12 >= 0 && local12 < 104 && local8 >= 0 && local8 < 104) {
					Static100.aByteArrayArrayArray9[0][local12][local8] = 127;
					if (local12 == arg1 && local12 > 0) {
						Static61.anIntArrayArrayArray6[0][local12][local8] = Static61.anIntArrayArrayArray6[0][local12 - 1][local8];
					}
					if (local12 == arg2 + arg1 && local12 < 103) {
						Static61.anIntArrayArrayArray6[0][local12][local8] = Static61.anIntArrayArrayArray6[0][local12 + 1][local8];
					}
					if (local8 == arg0 && local8 > 0) {
						Static61.anIntArrayArrayArray6[0][local12][local8] = Static61.anIntArrayArrayArray6[0][local12][local8 - 1];
					}
					if (local8 == arg0 + arg3 && local8 < 103) {
						Static61.anIntArrayArrayArray6[0][local12][local8] = Static61.anIntArrayArrayArray6[0][local12][local8 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method629() {
		aClass65_460 = null;
		anIntArray147 = null;
		aClass65_458 = null;
		aClass65_463 = null;
		aClass65_465 = null;
		aClass65_464 = null;
		anIntArray148 = null;
		aClass65_461 = null;
		aClass65_457 = null;
		aClass65_462 = null;
		aClass65_459 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBII)V")
	public static void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static36.aClass2_Sub1_Sub4_Sub3Array3[0].method1479(arg0, arg3);
		@Pc(13) int local13 = (arg2 - 32) * arg2 / arg1;
		Static36.aClass2_Sub1_Sub4_Sub3Array3[1].method1479(arg0, arg3 + arg2 - 16);
		Static43.method1815(arg0, arg3 + 16, 16, arg2 - 32, Static34.anInt1141);
		if (local13 < 8) {
			local13 = 8;
		}
		@Pc(63) int local63 = (arg2 - local13 - 32) * arg4 / (arg1 - arg2);
		Static43.method1815(arg0, local63 + arg3 + 16, 16, local13, Static65.anInt1960);
		Static43.method1809(arg0, local63 + arg3 + 16, local13, Static62.anInt1878);
		Static43.method1809(arg0 + 1, local63 + 16 + arg3, local13, Static62.anInt1878);
		Static43.method1813(arg0, local63 + arg3 + 16, 16, Static62.anInt1878);
		Static43.method1813(arg0, arg3 + local63 + 17, 16, Static62.anInt1878);
		Static43.method1809(arg0 + 15, arg3 - -16 + local63, local13, Static75.anInt2183);
		Static43.method1809(arg0 + 14, arg3 + 17 - -local63, local13 - 1, Static75.anInt2183);
		Static43.method1813(arg0, local13 + arg3 + local63 + 15, 16, Static75.anInt2183);
		Static43.method1813(arg0 + 1, local13 + local63 + 14 + arg3, 15, Static75.anInt2183);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method631() {
		if (Static40.anInt1296 != 0) {
			return;
		}
		@Pc(10) int local10 = Static101.anInt2793;
		if (Static37.anInt1224 == 1 && Static89.anInt2559 >= 516 && anInt1044 >= 160 && Static89.anInt2559 <= 765 && anInt1044 <= 205) {
			local10 = 0;
		}
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(129) int local129;
		if (!Static51.aBoolean83) {
			if (local10 == 1 && Static24.anInt719 > 0) {
				local45 = Static3.anIntArray20[Static24.anInt719 - 1];
				if (local45 == 38 || local45 == 2 || local45 == 56 || local45 == 43 || local45 == 17 || local45 == 8 || local45 == 18 || local45 == 5 || local45 == 10 || local45 == 50 || local45 == 37 || local45 == 1002) {
					local47 = Static12.anIntArray70[Static24.anInt719 - 1];
					local129 = Static41.anIntArray171[Static24.anInt719 - 1];
					@Pc(308) Class2_Sub1_Sub2 local308 = Static28.method503(local129);
					if (local308.aBoolean13 || local308.aBoolean12) {
						Static6.aBoolean19 = false;
						Static7.anInt298 = anInt1044;
						Static40.anInt1296 = 2;
						Static80.anInt2293 = local129;
						if (local129 >> 16 == Static98.anInt2770) {
							Static40.anInt1296 = 1;
						}
						Static13.anInt446 = 0;
						Static93.anInt2615 = local47;
						if (local129 >> 16 == Static21.anInt2494) {
							Static40.anInt1296 = 3;
						}
						Static18.anInt2532 = Static89.anInt2559;
						return;
					}
				}
			}
			if (local10 == 1 && (Static100.anInt2779 == 1 || Static25.method448(Static24.anInt719 - 1)) && Static24.anInt719 > 2) {
				local10 = 2;
			}
			if (local10 == 1 && Static24.anInt719 > 0) {
				Static93.method1614(Static24.anInt719 - 1);
			}
			if (local10 != 2 || Static24.anInt719 <= 0) {
				return;
			}
			Static78.method356();
			return;
		}
		if (local10 != 1) {
			local45 = Static16.anInt480;
			local47 = Static85.anInt2459;
			if (Static99.anInt2540 == 0) {
				local45 -= 4;
				local47 -= 4;
			}
			if (Static99.anInt2540 == 1) {
				local45 -= 553;
				local47 -= 205;
			}
			if (Static99.anInt2540 == 2) {
				local45 -= 17;
				local47 -= 357;
			}
			if (Static16.anInt489 - 10 > local45 || Static101.anInt2788 + Static16.anInt489 + 10 < local45 || Static61.anInt1849 - 10 > local47 || local47 > Static61.anInt1849 + anInt1055 + 10) {
				if (Static99.anInt2540 == 2) {
					Static107.aBoolean156 = true;
				}
				if (Static99.anInt2540 == 1) {
					Static19.aBoolean99 = true;
				}
				Static51.aBoolean83 = false;
			}
		}
		if (local10 != 1) {
			return;
		}
		local45 = Static16.anInt489;
		local47 = Static61.anInt1849;
		local129 = Static101.anInt2788;
		@Pc(131) int local131 = Static89.anInt2559;
		@Pc(133) int local133 = anInt1044;
		if (Static99.anInt2540 == 0) {
			local133 -= 4;
			local131 -= 4;
		}
		@Pc(142) int local142 = -1;
		if (Static99.anInt2540 == 1) {
			local131 -= 553;
			local133 -= 205;
		}
		if (Static99.anInt2540 == 2) {
			local133 -= 357;
			local131 -= 17;
		}
		for (@Pc(156) int local156 = 0; local156 < Static24.anInt719; local156++) {
			@Pc(171) int local171 = (Static24.anInt719 - local156 - 1) * 15 + local47 + 31;
			if (local45 < local131 && local45 + local129 > local131 && local133 > local171 - 13 && local133 < local171 + 3) {
				local142 = local156;
			}
		}
		if (local142 != -1) {
			Static93.method1614(local142);
		}
		Static51.aBoolean83 = false;
		if (Static99.anInt2540 == 1) {
			Static19.aBoolean99 = true;
		}
		if (Static99.anInt2540 == 2) {
			Static107.aBoolean156 = true;
			return;
		}
	}
}
