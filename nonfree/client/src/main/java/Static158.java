import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!l;")
	public static Interface9 anInterface9_7;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "Lclient!rg;")
	public static Class2_Sub5_Sub15 aClass2_Sub5_Sub15_4;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
	public static final int[] anIntArray186 = new int[200];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBIIII)V")
	public static void method2005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg0 - arg4;
		@Pc(23) int local23 = arg3 - arg1;
		if (local18 == 0) {
			if (local23 != 0) {
				Static204.method2722(arg4, arg2, arg1, arg3);
			}
		} else if (local23 == 0) {
			Static360.method4752(arg4, arg2, arg1, arg0);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(63) int local63 = arg1 - (local55 * arg4 >> 12);
			@Pc(77) int local77;
			@Pc(75) int local75;
			if (arg0 < Static317.anInt6670) {
				local75 = (Static317.anInt6670 * local55 >> 12) + local63;
				local77 = Static317.anInt6670;
			} else if (Static215.anInt3546 >= arg0) {
				local75 = arg3;
				local77 = arg0;
			} else {
				local77 = Static215.anInt3546;
				local75 = (Static215.anInt3546 * local55 >> 12) + local63;
			}
			@Pc(114) int local114;
			@Pc(112) int local112;
			if (Static317.anInt6670 > arg4) {
				local112 = (local55 * Static317.anInt6670 >> 12) + local63;
				local114 = Static317.anInt6670;
			} else if (arg4 <= Static215.anInt3546) {
				local112 = arg1;
				local114 = arg4;
			} else {
				local112 = (Static215.anInt3546 * local55 >> 12) + local63;
				local114 = Static215.anInt3546;
			}
			if (Static219.anInt6125 > local112) {
				local112 = Static219.anInt6125;
				local114 = (Static219.anInt6125 - local63 << 12) / local55;
			} else if (local112 > Static155.anInt2670) {
				local114 = (Static155.anInt2670 - local63 << 12) / local55;
				local112 = Static155.anInt2670;
			}
			if (Static219.anInt6125 > local75) {
				local75 = Static219.anInt6125;
				local77 = (Static219.anInt6125 - local63 << 12) / local55;
			} else if (local75 > Static155.anInt2670) {
				local75 = Static155.anInt2670;
				local77 = (Static155.anInt2670 - local63 << 12) / local55;
			}
			Static170.method2386(local114, local75, arg2, local77, local112);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!za;Lclient!ti;Lclient!fk;ZI)Z")
	public static boolean method2006(@OriginalArg(1) Class163 arg0, @OriginalArg(2) Class2_Sub40 arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray161 != null) {
			local9 = Static282.anInt3476 + (arg2.anInt2133 + arg1.anInt6349 - Static282.anInt3471) * (-Static282.anInt3476 + Static282.anInt3470) / (Static282.anInt3478 - Static282.anInt3471);
			local7 = Static282.anInt3476 + (Static282.anInt3470 - Static282.anInt3476) * (arg2.anInt2166 - (Static282.anInt3471 - arg1.anInt6349)) / (Static282.anInt3478 - Static282.anInt3471);
			local11 = Static282.anInt3469 - (arg2.anInt2145 + arg1.anInt6347 - Static282.anInt3473) * (-Static282.anInt3474 + Static282.anInt3469) / (Static282.anInt3472 - Static282.anInt3473);
			local13 = Static282.anInt3469 - (Static282.anInt3469 - Static282.anInt3474) * (arg1.anInt6347 + arg2.anInt2148 + -Static282.anInt3473) / (Static282.anInt3472 - Static282.anInt3473);
		}
		@Pc(107) Class13 local107 = null;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (arg2.anInt2137 != -1) {
			if (arg1.aBoolean455 && arg2.anInt2140 != -1) {
				local107 = arg2.method1750(arg0, true);
			} else {
				local107 = arg2.method1750(arg0, false);
			}
			if (local107 != null) {
				local109 = arg1.anInt6351 - (local107.RA() + 1 >> 1);
				if (local109 < local7) {
					local7 = local109;
				}
				local111 = arg1.anInt6351 + (local107.RA() + 1 >> 1);
				local113 = arg1.anInt6355 - (local107.Q() + 1 >> 1);
				if (local111 > local9) {
					local9 = local111;
				}
				if (local113 < local11) {
					local11 = local113;
				}
				local115 = arg1.anInt6355 + (local107.Q() + 1 >> 1);
				if (local13 < local115) {
					local13 = local115;
				}
			}
		}
		@Pc(214) Class260 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(300) int local300;
		if (arg2.aString66 != null) {
			local214 = Static204.method2723(arg2.anInt2164);
			if (local214 != null) {
				local216 = Static251.aClass141_6.method2910(null, null, arg2.aString66, Static428.aStringArray40);
				local218 = arg1.anInt6355;
				if (local107 == null) {
					local218 -= local214.method5478() * local216 / 2;
				} else {
					local218 -= (local107.Q() >> 1) + local216 * local214.method5479();
				}
				for (local277 = 0; local277 < local216; local277++) {
					@Pc(283) String local283 = Static428.aStringArray40[local277];
					if (local216 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local300 = local214.method5482(local283);
					if (local300 > local220) {
						local220 = local300;
					}
				}
				local222 = arg1.anInt6351 - local220 / 2;
				local224 = arg1.anInt6351 + local220 / 2;
				if (local222 < local7) {
					local7 = local222;
				}
				if (local9 < local224) {
					local9 = local224;
				}
				local226 = local218;
				if (local226 < local11) {
					local11 = local226;
				}
				local228 = local214.method5479() * local216 + local218;
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (Static282.anInt3476 > local9 || local7 > Static282.anInt3470 || local13 < Static282.anInt3474 || local11 > Static282.anInt3469) {
			return true;
		}
		@Pc(410) int local410;
		if (arg2.anIntArray161 != null) {
			@Pc(408) int[] local408 = new int[arg2.anIntArray161.length];
			for (local410 = 0; local410 < local408.length / 2; local410++) {
				local300 = arg1.anInt6349 + arg2.anIntArray161[local410 * 2];
				@Pc(434) int local434 = arg2.anIntArray161[local410 * 2 + 1] + arg1.anInt6347;
				local408[local410 * 2] = Static282.anInt3476 + (local300 - Static282.anInt3471) * (Static282.anInt3470 - Static282.anInt3476) / (Static282.anInt3478 - Static282.anInt3471);
				local408[local410 * 2 + 1] = Static282.anInt3469 - (local434 - Static282.anInt3473) * (-Static282.anInt3474 + Static282.anInt3469) / (Static282.anInt3472 - Static282.anInt3473);
			}
			Static66.method971(arg0, local408, arg2.anInt2160);
			for (local300 = 0; local300 < local408.length / 2 - 1; local300++) {
				arg0.method5501(local408[(local300 + 1) * 2], local408[local300 * 2 + 1], local408[(local300 + 1) * 2 + 1], local408[local300 * 2], arg2.anInt2136);
			}
			arg0.method5501(local408[0], local408[local408.length - 1], local408[1], local408[local408.length - 2], arg2.anInt2136);
		}
		if (local107 != null) {
			if (Static162.anInt2742 > 0 && (Static120.anInt2210 != -1 && arg1.anInt6352 == Static120.anInt2210 || Static47.anInt838 != -1 && arg2.anInt2163 == Static47.anInt838)) {
				if (Static237.anInt3819 <= 50) {
					local277 = Static237.anInt3819 * 2;
				} else {
					local277 = (100 - Static237.anInt3819) * 2;
				}
				local410 = local277 << 24 | 0xFFFF00;
				arg0.method5532(local410, arg1.anInt6351, local107.YA() / 2 + 7, arg1.anInt6355);
				arg0.method5532(local410, arg1.anInt6351, local107.YA() / 2 + 5, arg1.anInt6355);
				arg0.method5532(local410, arg1.anInt6351, local107.YA() / 2 + 3, arg1.anInt6355);
				arg0.method5532(local410, arg1.anInt6351, local107.YA() / 2 + 1, arg1.anInt6355);
				arg0.method5532(local410, arg1.anInt6351, local107.YA() / 2, arg1.anInt6355);
			}
			local107.method5668(arg1.anInt6351 - (local107.RA() >> 1), arg1.anInt6355 + -(local107.Q() >> 1));
		}
		if (arg2.aString66 != null && local214 != null) {
			Static261.method1846(arg1, arg0, local220, local214, local218, local216, arg2);
		}
		if (arg2.anInt2137 != -1 || arg2.aString66 != null) {
			@Pc(729) Class2_Sub18 local729 = new Class2_Sub18(arg1);
			local729.anInt2088 = local228;
			local729.anInt2086 = local113;
			local729.anInt2090 = local226;
			local729.anInt2091 = local222;
			local729.anInt2083 = local109;
			local729.anInt2093 = local115;
			local729.anInt2081 = local224;
			local729.anInt2092 = local111;
			Static144.aClass156_14.method3157(local729);
		}
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)V")
	public static void method2007() {
		Static419.aClass132_57.method2698();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIII)V")
	public static void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static172.anInt3016 = arg3;
		Static330.anInt5575 = arg4;
		Static98.anInt1863 = arg0;
		Static334.anInt5640 = arg2;
		Static338.anInt5763 = arg1;
		if (Static98.anInt1863 >= 100) {
			@Pc(22) int local22 = Static338.anInt5763 * 128 + 64;
			@Pc(28) int local28 = Static330.anInt5575 * 128 + 64;
			@Pc(37) int local37 = Static302.method3973(local28, local22, Static61.anInt1129) - Static172.anInt3016;
			@Pc(42) int local42 = local22 - Static174.anInt3028;
			@Pc(46) int local46 = local37 - Static40.anInt771;
			@Pc(51) int local51 = local28 - Static143.anInt2544;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local42 * local42));
			Static235.anInt3805 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static310.anInt5375 = (int) (Math.atan2((double) local42, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static235.anInt3805 < 1024) {
				Static235.anInt3805 = 1024;
			}
			Static381.anInt6280 = 0;
			if (Static235.anInt3805 > 3072) {
				Static235.anInt3805 = 3072;
			}
		}
		Static414.anInt6776 = 2;
	}
}
