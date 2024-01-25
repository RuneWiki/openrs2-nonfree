import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt5010;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!vi;")
	public static Class235 aClass235_1;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public static int anInt5022;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	public static int anInt5011 = 0;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_77 = new Class11(54, 3);

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
	public static final int[] anIntArray990 = new int[14];

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public static int anInt5021 = 0;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
	public static final int[] anIntArray991 = new int[14];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!vc;B)V")
	public static void method4377(@OriginalArg(0) Class63 arg0) {
		arg0.method1958(0, 0, Static253.anInt4467, 350);
		arg0.method1982(0, 0, Static253.anInt4467, 350, Static366.anInt6204 << 24 | 0x332277, 1);
		@Pc(39) int local39;
		@Pc(43) int local43;
		for (@Pc(33) int local33 = 0; local33 < 100; local33++) {
			local39 = Static210.anIntArray754[local33];
			local43 = Static263.anIntArray893[local33];
			arg0.method1982(local39, local43, 2, 2, Static217.anIntArray772[local33] << 24 | 0xFFFFFF, 1);
		}
		local39 = 350 / Static84.anInt1555;
		if (Static89.anInt1712 > 0) {
			local43 = 342 - Static84.anInt1555;
			@Pc(87) int local87 = local39 * local43 / (Static89.anInt1712 + local39 - 1);
			@Pc(89) int local89 = 4;
			if (Static89.anInt1712 > 1) {
				local89 = (Static89.anInt1712 - Static337.anInt5767 - 1) * (local43 - local87) / (Static89.anInt1712 - 1) + 4;
			}
			arg0.method1982(Static253.anInt4467 - 16, local89, 12, local87, Static366.anInt6204 << 24 | 0x332277, 2);
			for (@Pc(127) int local127 = Static337.anInt5767; local127 < Static337.anInt5767 + local39 && local127 < Static89.anInt1712; local127++) {
				@Pc(136) String[] local136 = Static104.method2176('\b', Static79.aStringArray120[local127]);
				@Pc(145) int local145 = (Static253.anInt4467 - 16 - 8) / local136.length;
				for (@Pc(147) int local147 = 0; local147 < local136.length; local147++) {
					@Pc(155) int local155 = local147 * local145 + 8;
					arg0.method1958(local155, 0, local155 + local145 - 8, 350);
					Static319.aClass9_3.method5052(-1, 350 - (local127 - Static337.anInt5767) * Static84.anInt1555 - Static302.aClass136_4.anInt3405 - Static337.anInt5770 - 2, local136[local147], -16777216, local155);
				}
			}
		}
		arg0.method1958(0, 0, Static253.anInt4467, 350);
		arg0.method1954(Static253.anInt4467, 350 - Static337.anInt5770, 0, -1);
		Static340.aClass9_4.method5052(-1, 350 - Static238.aClass136_7.anInt3405 - 1, "--> " + Static250.aString52, -16777216, 10);
		local43 = -1;
		if (Static253.anInt4469 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method1999(12, local43, 350 - Static238.aClass136_7.anInt3405 - 11, Static238.aClass136_7.method3125("--> " + Static250.aString52.substring(0, Static98.anInt2060)) + 10);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!ae;B)V")
	public static void method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2) {
		if (!Static110.aBoolean180) {
			@Pc(12) String local12;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local12 = Static201.method3378(arg2, local5);
				if (local12 != null) {
					Static137.method4192(false, arg2.aString2, true, local12, arg2.lb, (long) (local5 + 1), 1002, arg2.anInt94, arg2.anInt58, Static111.method2289(local5, arg2));
				}
			}
			local12 = Static118.method2440(arg2);
			if (local12 != null) {
				Static137.method4192(false, arg2.aString2, true, local12, arg2.lb, 0L, 2, arg2.anInt94, arg2.anInt58, arg2.anInt107);
			}
			for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
				@Pc(80) String local80 = Static201.method3378(arg2, local73);
				if (local80 != null) {
					Static137.method4192(false, arg2.aString2, true, local80, arg2.lb, (long) (local73 + 1), 13, arg2.anInt94, arg2.anInt58, Static111.method2289(local73, arg2));
				}
			}
			if (Static45.method784(arg2).method632()) {
				if (arg2.aString4 == null) {
					Static137.method4192(false, "", true, Static342.aClass32_91.method701(Static107.anInt2498), arg2.lb, 0L, 59, arg2.anInt94, arg2.anInt58, -1);
				} else {
					Static137.method4192(false, "", true, arg2.aString4, arg2.lb, 0L, 59, arg2.anInt94, arg2.anInt58, -1);
				}
			}
		} else if (Static45.method784(arg2).method643() && (Static33.anInt698 & 0x20) != 0) {
			Static137.method4192(false, Static217.aString47 + " -> " + arg2.aString2, true, Static391.aString68, arg2.lb, 0L, 47, arg2.anInt94, arg2.anInt58, Static345.anInt6624);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public static void method4380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static338.aFloat52 > Static338.aFloat53) {
			Static338.aFloat53 = (float) ((double) Static338.aFloat53 + (double) Static338.aFloat53 / 30.0D);
			if (Static338.aFloat53 > Static338.aFloat52) {
				Static338.aFloat53 = Static338.aFloat52;
			}
			Static52.method874();
			Static338.anInt3294 = (int) Static338.aFloat53 >> 1;
			Static338.aByteArrayArrayArray10 = Static303.method4474(Static338.anInt3294);
		} else if (Static338.aFloat53 > Static338.aFloat52) {
			Static338.aFloat53 = (float) ((double) Static338.aFloat53 - (double) Static338.aFloat53 / 30.0D);
			if (Static338.aFloat52 > Static338.aFloat53) {
				Static338.aFloat53 = Static338.aFloat52;
			}
			Static52.method874();
			Static338.anInt3294 = (int) Static338.aFloat53 >> 1;
			Static338.aByteArrayArrayArray10 = Static303.method4474(Static338.anInt3294);
		}
		if (Static280.anInt4835 != -1 && Static24.anInt533 != -1) {
			@Pc(81) int local81 = Static280.anInt4835 - Static82.anInt1484;
			if (local81 < 2 || local81 > 2) {
				local81 /= 8;
			}
			@Pc(98) int local98 = Static24.anInt533 - Static308.anInt5181;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			Static82.anInt1484 += local81;
			if (local81 == 0 && local98 == 0) {
				Static280.anInt4835 = -1;
				Static24.anInt533 = -1;
			}
			Static308.anInt5181 += local98;
			Static52.method874();
		}
		if (Static121.anInt2597 > 0) {
			Static33.anInt699--;
			if (Static33.anInt699 == 0) {
				Static121.anInt2597--;
				Static33.anInt699 = 100;
			}
		} else {
			Static17.anInt398 = -1;
			Static223.anInt3988 = -1;
		}
		if (!Static46.aBoolean79 || Static224.aClass30_32 == null) {
			return;
		}
		for (@Pc(162) Class2_Sub44 local162 = (Class2_Sub44) Static224.aClass30_32.method694(); local162 != null; local162 = (Class2_Sub44) Static224.aClass30_32.method682()) {
			@Pc(171) Class243 local171 = Static338.aClass226_3.method4913(local162.aClass2_Sub23_1.anInt2801);
			if (local162.method5620(arg1, arg0)) {
				if (local171.aStringArray159 != null) {
					if (local171.aStringArray159[4] != null) {
						Static137.method4192(false, local171.aString65, true, local171.aStringArray159[4], local171.anInt6354, (long) local162.aClass2_Sub23_1.anInt2801, 1010, 0, -1, -1);
					}
					if (local171.aStringArray159[3] != null) {
						Static137.method4192(false, local171.aString65, true, local171.aStringArray159[3], local171.anInt6354, (long) local162.aClass2_Sub23_1.anInt2801, 1004, 0, -1, -1);
					}
					if (local171.aStringArray159[2] != null) {
						Static137.method4192(false, local171.aString65, true, local171.aStringArray159[2], local171.anInt6354, (long) local162.aClass2_Sub23_1.anInt2801, 1006, 0, -1, -1);
					}
					if (local171.aStringArray159[1] != null) {
						Static137.method4192(false, local171.aString65, true, local171.aStringArray159[1], local171.anInt6354, (long) local162.aClass2_Sub23_1.anInt2801, 1012, 0, -1, -1);
					}
					if (local171.aStringArray159[0] != null) {
						Static137.method4192(false, local171.aString65, true, local171.aStringArray159[0], local171.anInt6354, (long) local162.aClass2_Sub23_1.anInt2801, 1009, 0, -1, -1);
					}
				}
				if (!local162.aClass2_Sub23_1.aBoolean210) {
					local162.aClass2_Sub23_1.aBoolean210 = true;
					Static256.method4002(Static303.aClass101_11, local162.aClass2_Sub23_1.anInt2801, local171.anInt6354);
				}
				if (local162.aClass2_Sub23_1.aBoolean210) {
					Static256.method4002(Static15.aClass101_2, local162.aClass2_Sub23_1.anInt2801, local171.anInt6354);
				}
			} else if (local162.aClass2_Sub23_1.aBoolean210) {
				local162.aClass2_Sub23_1.aBoolean210 = false;
				Static256.method4002(Static106.aClass101_7, local162.aClass2_Sub23_1.anInt2801, local171.anInt6354);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(22) int local22 = -1;
		Static315.method4662(arg2 + arg0, Static15.anIntArrayArray1[arg1], arg0 - arg2, arg3);
		while (local7 < local9) {
			local22 += 2;
			local12 += local22;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(61) int[] local61 = Static15.anIntArrayArray1[arg1 + local9];
				@Pc(68) int[] local68 = Static15.anIntArrayArray1[arg1 - local9];
				@Pc(72) int local72 = local7 + arg0;
				@Pc(77) int local77 = arg0 - local7;
				Static315.method4662(local72, local61, local77, arg3);
				Static315.method4662(local72, local68, local77, arg3);
			}
			@Pc(94) int local94 = arg0 + local9;
			@Pc(99) int local99 = arg0 - local9;
			@Pc(105) int[] local105 = Static15.anIntArrayArray1[local7 + arg1];
			@Pc(112) int[] local112 = Static15.anIntArrayArray1[arg1 - local7];
			Static315.method4662(local94, local105, local99, arg3);
			Static315.method4662(local94, local112, local99, arg3);
		}
	}
}
