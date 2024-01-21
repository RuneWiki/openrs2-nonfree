import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!hc;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public static int anInt506;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
	public static int[] anIntArray45 = new int[100];

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!a;")
	private static Class1 aClass1_427 = Static94.method1596("Please contact customer support)3");

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_421 = aClass1_427;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt507 = 1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_422 = Static94.method1596("backvmid3");

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt509 = 0;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public static int anInt510 = 127;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!a;")
	private static Class1 aClass1_423 = Static94.method1596("red:");

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_424 = Static94.method1596("mapmarker");

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!a;")
	public static Class1 aClass1_425 = aClass1_423;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_426 = Static94.method1596(" )2> @lre@");

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public static int anInt514 = 3;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII[B[Lclient!ad;)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) Class5[] arg8) {
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				if (arg4 + local17 > 0 && local17 + arg4 < 103 && arg0 + local21 > 0 && local21 + arg0 < 103) {
					arg8[arg3].anIntArrayArray3[arg4 + local17][local21 + arg0] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(93) Class2_Sub3 local93 = new Class2_Sub3(arg7);
		for (@Pc(95) int local95 = 0; local95 < 4; local95++) {
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					if (arg2 == local95 && local99 >= arg1 && arg1 + 8 > local99 && local103 >= arg5 && arg5 + 8 > local103) {
						Static81.method1489(arg4 + Static45.method1021(arg6, local99 & 0x7, local103 & 0x7), arg6, local93, arg0 + Static60.method1283(local99 & 0x7, local103 & 0x7, arg6), 0, 0, arg3);
					} else {
						Static81.method1489(-1, 0, local93, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method297() {
		aClass1_422 = null;
		aClass1_425 = null;
		aClass1_423 = null;
		aClass1_426 = null;
		anIntArray45 = null;
		aClass14_1 = null;
		aClass1_424 = null;
		aClass1_421 = null;
		aClass1_427 = null;
		anIntArray46 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method298() {
		Static107.method1776(Static37.anInt1369);
		if (Static64.anInt1914 != -1) {
			Static107.method1776(Static64.anInt1914);
		}
		anInt509 = 0;
		Static4.aClass4_8.method1527();
		Static2.anIntArray23 = Static24.method696(Static2.anIntArray23);
		Static92.method1127();
		Static41.method960(Static37.anInt1369, 503, 0, 765);
		if (Static64.anInt1914 != -1) {
			Static41.method960(Static64.anInt1914, 503, 0, 765);
		}
		if (Static6.aBoolean11) {
			Static41.method965();
		} else {
			Static72.method1371();
			Static28.method741();
		}
		try {
			@Pc(63) Graphics local63 = Static103.aCanvas1.getGraphics();
			Static4.aClass4_8.method1525(0, local63, 0);
		} catch (@Pc(71) Exception local71) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method299() {
		@Pc(9) int local9 = Static59.anInt1823 * 128 + 64;
		@Pc(15) int local15 = Static40.anInt1615 * 128 + 64;
		@Pc(24) int local24 = Static65.method1338(Static2.anInt287, local15, local9) - anInt506;
		if (local15 > Static21.anInt916) {
			Static21.anInt916 += Static98.anInt2513 * (local15 - Static21.anInt916) / 1000 + Static6.anInt412;
			if (Static21.anInt916 > local15) {
				Static21.anInt916 = local15;
			}
		}
		if (local24 > Static59.anInt1824) {
			Static59.anInt1824 += Static98.anInt2513 * (local24 - Static59.anInt1824) / 1000 + Static6.anInt412;
			if (local24 < Static59.anInt1824) {
				Static59.anInt1824 = local24;
			}
		}
		if (Static21.anInt916 > local15) {
			Static21.anInt916 -= Static6.anInt412 + Static98.anInt2513 * (Static21.anInt916 - local15) / 1000;
			if (local15 > Static21.anInt916) {
				Static21.anInt916 = local15;
			}
		}
		if (Static41.anInt1396 < local9) {
			Static41.anInt1396 += Static6.anInt412 + Static98.anInt2513 * (local9 - Static41.anInt1396) / 1000;
			if (Static41.anInt1396 > local9) {
				Static41.anInt1396 = local9;
			}
		}
		if (Static59.anInt1824 > local24) {
			Static59.anInt1824 -= (Static59.anInt1824 - local24) * Static98.anInt2513 / 1000 + Static6.anInt412;
			if (local24 > Static59.anInt1824) {
				Static59.anInt1824 = local24;
			}
		}
		local15 = Static43.anInt1455 * 128 + 64;
		if (Static41.anInt1396 > local9) {
			Static41.anInt1396 -= Static6.anInt412 + Static98.anInt2513 * (Static41.anInt1396 - local9) / 1000;
			if (Static41.anInt1396 < local9) {
				Static41.anInt1396 = local9;
			}
		}
		local9 = Static64.anInt1923 * 128 + 64;
		local24 = Static65.method1338(Static2.anInt287, local15, local9) - Static66.anInt2356;
		@Pc(203) int local203 = local24 - Static59.anInt1824;
		@Pc(207) int local207 = local9 - Static41.anInt1396;
		@Pc(211) int local211 = local15 - Static21.anInt916;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local211 * local211 + local207 * local207));
		@Pc(234) int local234 = (int) (Math.atan2((double) local203, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		@Pc(250) int local250 = (int) (-325.949D * Math.atan2((double) local211, (double) local207)) & 0x7FF;
		if (local234 > 383) {
			local234 = 383;
		}
		@Pc(262) int local262 = local250 - Static4.anInt376;
		if (local262 > 1024) {
			local262 -= 2048;
		}
		if (local262 < -1024) {
			local262 += 2048;
		}
		if (local262 > 0) {
			Static4.anInt376 += Static33.anInt1257 * local262 / 1000 + Static99.anInt2524;
			Static4.anInt376 &= 0x7FF;
		}
		if (local262 < 0) {
			Static4.anInt376 -= Static99.anInt2524 + Static33.anInt1257 * -local262 / 1000;
			Static4.anInt376 &= 0x7FF;
		}
		if (local234 > Static47.anInt1561) {
			Static47.anInt1561 += Static99.anInt2524 + Static33.anInt1257 * (local234 - Static47.anInt1561) / 1000;
			if (Static47.anInt1561 > local234) {
				Static47.anInt1561 = local234;
			}
		}
		if (Static47.anInt1561 > local234) {
			Static47.anInt1561 -= Static33.anInt1257 * (Static47.anInt1561 - local234) / 1000 + Static99.anInt2524;
			if (Static47.anInt1561 < local234) {
				Static47.anInt1561 = local234;
			}
		}
		@Pc(360) int local360 = local250 - Static4.anInt376;
		if (local360 > 1024) {
			local360 -= 2048;
		}
		if (local360 < -1024) {
			local360 += 2048;
		}
		if (local360 < 0 && local262 > 0 || local360 > 0 && local262 < 0) {
			Static4.anInt376 = local250;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!qd;)Z")
	public static boolean method300(@OriginalArg(1) Class2_Sub1_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2169;
		if (Static21.anInt915 == 2) {
			if (local6 == 201) {
				Static65.anInt1941 = 1;
				Static111.aClass1_2896 = Static83.aClass1_2345;
				Static32.aBoolean54 = true;
				Static95.anInt2396 = 0;
				Static111.aClass1_2897 = Static111.aClass1_2898;
				Static87.aBoolean137 = true;
			}
			if (local6 == 202) {
				Static65.anInt1941 = 2;
				Static111.aClass1_2896 = Static22.aClass1_856;
				Static87.aBoolean137 = true;
				Static95.anInt2396 = 0;
				Static32.aBoolean54 = true;
				Static111.aClass1_2897 = Static111.aClass1_2898;
			}
		}
		if (local6 == 205) {
			Static59.anInt1826 = 250;
			return true;
		}
		if (local6 == 501) {
			Static95.anInt2396 = 0;
			Static65.anInt1941 = 4;
			Static87.aBoolean137 = true;
			Static111.aClass1_2896 = Static85.aClass1_2369;
			Static111.aClass1_2897 = Static111.aClass1_2898;
			Static32.aBoolean54 = true;
		}
		if (local6 == 502) {
			Static87.aBoolean137 = true;
			Static95.anInt2396 = 0;
			Static65.anInt1941 = 5;
			Static32.aBoolean54 = true;
			Static111.aClass1_2897 = Static111.aClass1_2898;
			Static111.aClass1_2896 = Static21.aClass1_851;
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (local6 >= 300 && local6 <= 313) {
			local98 = (local6 - 300) / 2;
			local102 = local6 & 0x1;
			Static76.aClass33_2.method1248(local98, local102 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = (local6 - 314) / 2;
			local102 = local6 & 0x1;
			Static76.aClass33_2.method1250(local102 == 1, local98);
		}
		if (local6 == 324) {
			Static76.aClass33_2.method1249(false);
		}
		if (local6 == 325) {
			Static76.aClass33_2.method1249(true);
		}
		if (local6 == 326) {
			Static59.aClass2_Sub3_Sub1_2.method841(231);
			Static76.aClass33_2.method1241(Static59.aClass2_Sub3_Sub1_2);
			return true;
		}
		if (local6 == 620) {
			Static112.aBoolean161 = !Static112.aBoolean161;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static31.method839();
			if (Static111.aClass1_2890.method10() > 0) {
				Static59.aClass2_Sub3_Sub1_2.method841(202);
				Static59.aClass2_Sub3_Sub1_2.method804(Static111.aClass1_2890.method9());
				Static59.aClass2_Sub3_Sub1_2.method788(local6 - 601);
				Static59.aClass2_Sub3_Sub1_2.method788(Static112.aBoolean161 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method301() {
		Static22.aClass11_7.method435();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIBLclient!qd;III)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static102.aBoolean153) {
			Static84.anInt2250 = 32;
		} else {
			Static84.anInt2250 = 0;
		}
		Static102.aBoolean153 = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.anInt2215 -= Static109.anInt2768 * 4;
			if (arg6 == 1) {
				Static34.aBoolean60 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Static87.aBoolean137 = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.anInt2215 += Static109.anInt2768 * 4;
			if (arg6 == 2 || arg6 == 3) {
				Static87.aBoolean137 = true;
			}
			if (arg6 == 1) {
				Static34.aBoolean60 = true;
			}
		} else if (arg5 - Static84.anInt2250 <= arg2 && arg2 < arg5 + Static84.anInt2250 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && Static109.anInt2768 > 0) {
			Static102.aBoolean153 = true;
			@Pc(131) int local131 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				Static87.aBoolean137 = true;
			}
			if (arg6 == 1) {
				Static34.aBoolean60 = true;
			}
			if (local131 < 8) {
				local131 = 8;
			}
			@Pc(160) int local160 = arg0 - local131 - 32;
			@Pc(172) int local172 = arg1 - local131 / 2 - arg7 - 16;
			arg4.anInt2215 = (arg3 - arg0) * local172 / local160;
		}
	}
}
