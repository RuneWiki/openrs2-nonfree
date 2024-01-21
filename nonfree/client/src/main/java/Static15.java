import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt301;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!pc;")
	public static Class12 aClass12_10;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!fc;")
	public static Class21 aClass21_10 = new Class21(64);

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!qb;")
	public static Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "J")
	public static long aLong17 = 0L;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "[I")
	public static int[] anIntArray54 = new int[128];

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
	public static int anInt302 = -1;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!hb;")
	public static Class27 aClass27_155 = Static87.method1648("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!hb;")
	public static Class27 aClass27_156 = Static87.method1648("Benutzen");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method248() {
		aClass27_155 = null;
		aClass21_10 = null;
		aClass27_156 = null;
		aClass12_10 = null;
		anIntArray54 = null;
		aClass53_1 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLclient!ja;)V")
	public static void method249(@OriginalArg(1) Class3_Sub3_Sub1_Sub4 arg0) {
		if (arg0.anInt2401 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0.anInt2403 != -1 && arg0.anInt2403 < 32768) {
			@Pc(25) Class3_Sub3_Sub1_Sub4_Sub1 local25 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[arg0.anInt2403];
			if (local25 != null) {
				local34 = arg0.anInt2408 - local25.anInt2408;
				local40 = arg0.anInt2399 - local25.anInt2399;
				if (local34 != 0 || local40 != 0) {
					arg0.anInt2422 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2403 >= 32768) {
			local67 = arg0.anInt2403 - 32768;
			if (Static53.anInt1423 == local67) {
				local67 = 2047;
			}
			@Pc(80) Class3_Sub3_Sub1_Sub4_Sub2 local80 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local67];
			if (local80 != null) {
				@Pc(89) int local89 = arg0.anInt2399 - local80.anInt2399;
				local40 = arg0.anInt2408 - local80.anInt2408;
				if (local40 != 0 || local89 != 0) {
					arg0.anInt2422 = (int) (Math.atan2((double) local40, (double) local89) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2428 != 0 || arg0.anInt2406 != 0) && (arg0.anInt2405 == 0 || arg0.anInt2387 > 0)) {
			local67 = arg0.anInt2408 - (arg0.anInt2428 - Static89.anInt2464 - Static89.anInt2464) * 64;
			local34 = arg0.anInt2399 - (arg0.anInt2406 - Static101.anInt2631 - Static101.anInt2631) * 64;
			if (local67 != 0 || local34 != 0) {
				arg0.anInt2422 = (int) (Math.atan2((double) local67, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt2428 = 0;
			arg0.anInt2406 = 0;
		}
		local67 = arg0.anInt2422 - arg0.anInt2432 & 0x7FF;
		if (local67 == 0) {
			arg0.anInt2429 = 0;
			return;
		}
		arg0.anInt2429++;
		@Pc(227) boolean local227;
		if (local67 > 1024) {
			arg0.anInt2432 -= arg0.anInt2401;
			local227 = true;
			if (arg0.anInt2401 > local67 || 2048 - arg0.anInt2401 < local67) {
				local227 = false;
				arg0.anInt2432 = arg0.anInt2422;
			}
			if (arg0.anInt2390 == arg0.anInt2410 && (arg0.anInt2429 > 25 || local227)) {
				if (arg0.anInt2412 == -1) {
					arg0.anInt2390 = arg0.anInt2411;
				} else {
					arg0.anInt2390 = arg0.anInt2412;
				}
			}
		} else {
			arg0.anInt2432 += arg0.anInt2401;
			local227 = true;
			if (arg0.anInt2401 > local67 || local67 > 2048 - arg0.anInt2401) {
				arg0.anInt2432 = arg0.anInt2422;
				local227 = false;
			}
			if (arg0.anInt2410 == arg0.anInt2390 && (arg0.anInt2429 > 25 || local227)) {
				if (arg0.anInt2386 == -1) {
					arg0.anInt2390 = arg0.anInt2411;
				} else {
					arg0.anInt2390 = arg0.anInt2386;
				}
			}
		}
		arg0.anInt2432 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method250() {
		for (@Pc(7) int local7 = 0; local7 < Static104.anInt2724; local7++) {
			@Pc(13) int local13 = Static85.anIntArray349[local7];
			@Pc(17) Class3_Sub3_Sub1_Sub4_Sub1 local17 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local13];
			if (local17 != null) {
				Static68.method1246(local17, local17.aClass3_Sub3_Sub3_1.anInt920);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZBIIIIIIIIII)Z")
	public static boolean method251(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static56.anIntArrayArray40[local3][local7] = 0;
				Static105.anIntArrayArray73[local3][local7] = 99999999;
			}
		}
		local7 = arg8;
		Static56.anIntArrayArray40[arg8][arg5] = 99;
		@Pc(43) byte local43 = 0;
		Static105.anIntArrayArray73[arg8][arg5] = 0;
		@Pc(51) int local51 = arg5;
		Static96.anIntArray299[0] = arg8;
		@Pc(58) int local58 = local43 + 1;
		Static86.anIntArray350[0] = arg5;
		@Pc(62) int local62 = 0;
		@Pc(64) boolean local64 = false;
		@Pc(69) int[][] local69 = Static57.aClass49Array1[Static68.anInt1747].anIntArrayArray56;
		@Pc(72) int local72 = Static96.anIntArray299.length;
		@Pc(183) int local183;
		while (local62 != local58) {
			local51 = Static86.anIntArray350[local62];
			local7 = Static96.anIntArray299[local62];
			local62 = (local62 + 1) % local72;
			if (local7 == arg6 && local51 == arg3) {
				local64 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static57.aClass49Array1[Static68.anInt1747].method1522(arg7 - 1, arg6, local7, local51, arg9, arg3)) {
					local64 = true;
					break;
				}
				if (arg7 < 10 && Static57.aClass49Array1[Static68.anInt1747].method1524(arg6, local51, local7, arg3, arg9, arg7 - 1)) {
					local64 = true;
					break;
				}
			}
			if (arg1 != 0 && arg4 != 0 && Static57.aClass49Array1[Static68.anInt1747].method1528(arg6, arg1, local51, local7, arg4, arg3, arg10)) {
				local64 = true;
				break;
			}
			local183 = Static105.anIntArrayArray73[local7][local51] + 1;
			if (local7 > 0 && Static56.anIntArrayArray40[local7 - 1][local51] == 0 && (local69[local7 - 1][local51] & 0x1280108) == 0) {
				Static96.anIntArray299[local58] = local7 - 1;
				Static86.anIntArray350[local58] = local51;
				Static56.anIntArrayArray40[local7 - 1][local51] = 2;
				Static105.anIntArrayArray73[local7 - 1][local51] = local183;
				local58 = (local58 + 1) % local72;
			}
			if (local7 < 103 && Static56.anIntArrayArray40[local7 + 1][local51] == 0 && (local69[local7 + 1][local51] & 0x1280180) == 0) {
				Static96.anIntArray299[local58] = local7 + 1;
				Static86.anIntArray350[local58] = local51;
				local58 = (local58 + 1) % local72;
				Static56.anIntArrayArray40[local7 + 1][local51] = 8;
				Static105.anIntArrayArray73[local7 + 1][local51] = local183;
			}
			if (local51 > 0 && Static56.anIntArrayArray40[local7][local51 - 1] == 0 && (local69[local7][local51 - 1] & 0x1280102) == 0) {
				Static96.anIntArray299[local58] = local7;
				Static86.anIntArray350[local58] = local51 - 1;
				local58 = (local58 + 1) % local72;
				Static56.anIntArrayArray40[local7][local51 - 1] = 1;
				Static105.anIntArrayArray73[local7][local51 - 1] = local183;
			}
			if (local51 < 103 && Static56.anIntArrayArray40[local7][local51 + 1] == 0 && (local69[local7][local51 + 1] & 0x1280120) == 0) {
				Static96.anIntArray299[local58] = local7;
				Static86.anIntArray350[local58] = local51 + 1;
				Static56.anIntArrayArray40[local7][local51 + 1] = 4;
				local58 = (local58 + 1) % local72;
				Static105.anIntArrayArray73[local7][local51 + 1] = local183;
			}
			if (local7 > 0 && local51 > 0 && Static56.anIntArrayArray40[local7 - 1][local51 - 1] == 0 && (local69[local7 - 1][local51 - 1] & 0x128010E) == 0 && (local69[local7 - 1][local51] & 0x1280108) == 0 && (local69[local7][local51 - 1] & 0x1280102) == 0) {
				Static96.anIntArray299[local58] = local7 - 1;
				Static86.anIntArray350[local58] = local51 - 1;
				Static56.anIntArrayArray40[local7 - 1][local51 - 1] = 3;
				Static105.anIntArrayArray73[local7 - 1][local51 - 1] = local183;
				local58 = (local58 + 1) % local72;
			}
			if (local7 < 103 && local51 > 0 && Static56.anIntArrayArray40[local7 + 1][local51 - 1] == 0 && (local69[local7 + 1][local51 - 1] & 0x1280183) == 0 && (local69[local7 + 1][local51] & 0x1280180) == 0 && (local69[local7][local51 - 1] & 0x1280102) == 0) {
				Static96.anIntArray299[local58] = local7 + 1;
				Static86.anIntArray350[local58] = local51 - 1;
				local58 = (local58 + 1) % local72;
				Static56.anIntArrayArray40[local7 + 1][local51 - 1] = 9;
				Static105.anIntArrayArray73[local7 + 1][local51 - 1] = local183;
			}
			if (local7 > 0 && local51 < 103 && Static56.anIntArrayArray40[local7 - 1][local51 + 1] == 0 && (local69[local7 - 1][local51 + 1] & 0x1280138) == 0 && (local69[local7 - 1][local51] & 0x1280108) == 0 && (local69[local7][local51 + 1] & 0x1280120) == 0) {
				Static96.anIntArray299[local58] = local7 - 1;
				Static86.anIntArray350[local58] = local51 + 1;
				Static56.anIntArrayArray40[local7 - 1][local51 + 1] = 6;
				Static105.anIntArrayArray73[local7 - 1][local51 + 1] = local183;
				local58 = (local58 + 1) % local72;
			}
			if (local7 < 103 && local51 < 103 && Static56.anIntArrayArray40[local7 + 1][local51 + 1] == 0 && (local69[local7 + 1][local51 + 1] & 0x12801E0) == 0 && (local69[local7 + 1][local51] & 0x1280180) == 0 && (local69[local7][local51 + 1] & 0x1280120) == 0) {
				Static96.anIntArray299[local58] = local7 + 1;
				Static86.anIntArray350[local58] = local51 + 1;
				Static56.anIntArrayArray40[local7 + 1][local51 + 1] = 12;
				local58 = (local58 + 1) % local72;
				Static105.anIntArrayArray73[local7 + 1][local51 + 1] = local183;
			}
		}
		Static93.anInt2545 = 0;
		@Pc(789) int local789;
		@Pc(795) int local795;
		@Pc(801) int local801;
		if (!local64) {
			if (!arg0) {
				return false;
			}
			local183 = 1000;
			local789 = 100;
			for (local795 = arg6 - 10; local795 <= arg6 + 10; local795++) {
				for (local801 = arg3 - 10; local801 <= arg3 + 10; local801++) {
					if (local795 >= 0 && local801 >= 0 && local795 < 104 && local801 < 104 && Static105.anIntArrayArray73[local795][local801] < 100) {
						@Pc(825) int local825 = 0;
						@Pc(827) int local827 = 0;
						if (arg6 > local795) {
							local825 = arg6 - local795;
						} else if (arg1 + arg6 - 1 < local795) {
							local825 = local795 + 1 - arg6 - arg1;
						}
						if (arg3 > local801) {
							local827 = arg3 - local801;
						} else if (local801 > arg3 + arg4 - 1) {
							local827 = local801 + 1 - arg3 - arg4;
						}
						@Pc(893) int local893 = local825 * local825 + local827 * local827;
						if (local183 > local893 || local893 == local183 && local789 > Static105.anIntArrayArray73[local795][local801]) {
							local183 = local893;
							local7 = local795;
							local789 = Static105.anIntArrayArray73[local795][local801];
							local51 = local801;
						}
					}
				}
			}
			if (local183 == 1000) {
				return false;
			}
			if (local7 == arg8 && local51 == arg5) {
				return false;
			}
			Static93.anInt2545 = 1;
		}
		@Pc(964) byte local964 = 0;
		Static96.anIntArray299[0] = local7;
		local62 = local964 + 1;
		Static86.anIntArray350[0] = local51;
		local183 = local789 = Static56.anIntArrayArray40[local7][local51];
		while (arg8 != local7 || local51 != arg5) {
			if (local789 != local183) {
				local789 = local183;
				Static96.anIntArray299[local62] = local7;
				Static86.anIntArray350[local62++] = local51;
			}
			if ((local183 & 0x2) != 0) {
				local7++;
			} else if ((local183 & 0x8) != 0) {
				local7--;
			}
			if ((local183 & 0x1) != 0) {
				local51++;
			} else if ((local183 & 0x4) != 0) {
				local51--;
			}
			local183 = Static56.anIntArrayArray40[local7][local51];
		}
		if (local62 > 0) {
			local72 = local62;
			if (local62 > 25) {
				local72 = 25;
			}
			local62--;
			local795 = Static86.anIntArray350[local62];
			@Pc(1067) int local1067 = Static96.anIntArray299[local62];
			if (arg2 == 0) {
				Static78.aClass3_Sub11_Sub1_3.method1478(111);
				Static78.aClass3_Sub11_Sub1_3.method1443(local72 + local72 + 3);
			}
			if (arg2 == 1) {
				Static78.aClass3_Sub11_Sub1_3.method1478(226);
				Static78.aClass3_Sub11_Sub1_3.method1443(local72 + local72 + 14 + 3);
			}
			if (arg2 == 2) {
				Static78.aClass3_Sub11_Sub1_3.method1478(94);
				Static78.aClass3_Sub11_Sub1_3.method1443(local72 + local72 + 3);
			}
			Static78.aClass3_Sub11_Sub1_3.method1448(local795 + Static101.anInt2631);
			Static77.anInt2150 = Static96.anIntArray299[0];
			Static97.anInt2290 = Static86.anIntArray350[0];
			for (local801 = 1; local801 < local72; local801++) {
				local62--;
				Static78.aClass3_Sub11_Sub1_3.method1462(Static96.anIntArray299[local62] - local1067);
				Static78.aClass3_Sub11_Sub1_3.method1447(Static86.anIntArray350[local62] - local795);
			}
			Static78.aClass3_Sub11_Sub1_3.method1467(local1067 + Static89.anInt2464);
			Static78.aClass3_Sub11_Sub1_3.method1452(Static10.aBooleanArray3[82] ? 1 : 0);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!fb;ZI)V")
	public static void method252(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		if (Static25.aClass20_13 != null) {
			try {
				Static25.aClass20_13.method656();
			} catch (@Pc(13) Exception local13) {
			}
			Static25.aClass20_13 = null;
		}
		Static25.aClass20_13 = arg0;
		Static42.method896(arg1);
		Static104.anInt2722 = 0;
		Static84.aClass3_Sub11_5 = null;
		Static2.aClass3_Sub3_Sub16_1 = null;
		Static57.aClass3_Sub11_4.anInt2060 = 0;
		while (true) {
			@Pc(38) Class3_Sub3_Sub16 local38 = (Class3_Sub3_Sub16) Static36.aClass14_4.method316();
			if (local38 == null) {
				while (true) {
					local38 = (Class3_Sub3_Sub16) Static64.aClass14_5.method316();
					if (local38 == null) {
						if (Static104.aByte2 != 0) {
							try {
								@Pc(97) Class3_Sub11 local97 = new Class3_Sub11(4);
								local97.method1443(4);
								local97.method1443(Static104.aByte2);
								local97.method1467(0);
								Static25.aClass20_13.method651(4, local97.aByteArray17);
							} catch (@Pc(120) IOException local120) {
								try {
									Static25.aClass20_13.method656();
								} catch (@Pc(125) Exception local125) {
								}
								Static25.aClass20_13 = null;
								Static98.anInt2574++;
							}
						}
						Static65.anInt1669 = 0;
						Static106.aLong31 = System.currentTimeMillis();
						return;
					}
					Static61.aClass11_2.method255(local38);
					Static8.aClass14_1.method321(local38.aLong83, local38);
					Static10.anInt267--;
					Static19.anInt459++;
				}
			}
			Static35.aClass14_3.method321(local38.aLong83, local38);
			Static48.anInt2393++;
			Static33.anInt812--;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method256() {
		if (!Static8.aBoolean12) {
			return;
		}
		Static52.aClass3_Sub3_Sub2_Sub4_59 = null;
		Static8.anIntArray44 = null;
		Static67.aClass12_51 = null;
		Static77.aClass3_Sub3_Sub2_Sub4_88 = null;
		Static91.anIntArray371 = null;
		Static72.anIntArray319 = null;
		Static105.aClass12_81 = null;
		Static12.aClass3_Sub3_Sub2_Sub4_17 = null;
		Static8.aBoolean12 = false;
		Static106.aClass3_Sub3_Sub2_Sub4Array3 = null;
		Static102.aClass12_78 = null;
		Static50.aClass3_Sub3_Sub2_Sub4_50 = null;
		Static105.aClass3_Sub3_Sub2_Sub4_111 = null;
		Static98.aClass12_75 = null;
		Static53.aClass12_41 = null;
		Static28.aClass12_22 = null;
		Static90.aClass12_71 = null;
		Static105.aClass3_Sub3_Sub2_Sub4_110 = null;
		Static45.aClass3_Sub3_Sub2_Sub4_19 = null;
		Static84.aClass12_65 = null;
		Static74.aClass3_Sub3_Sub2_Sub4_85 = null;
		aClass12_10 = null;
		Static75.aClass12_64 = null;
		Static59.anIntArray255 = null;
		Static83.aClass12_69 = null;
		Static47.aClass3_Sub3_Sub2_Sub4_47 = null;
		Static35.anIntArray157 = null;
		Static94.aClass3_Sub3_Sub2_Sub4_98 = null;
		Static87.aClass12_67 = null;
		Static24.aClass3_Sub3_Sub2_Sub4_30 = null;
		Static34.anIntArray155 = null;
		Static83.anIntArray353 = null;
		Static61.aClass12_46 = null;
		Static54.aClass3_Sub3_Sub2_Sub4_60 = null;
		Static101.aClass3_Sub3_Sub2_Sub4_103 = null;
		Static86.aClass12_66 = null;
		Static80.aClass3_Sub3_Sub2_Sub4_89 = null;
		Static109.aClass12_62 = null;
		Static30.aClass3_Sub3_Sub2_Sub4_36 = null;
		Static69.aClass3_Sub3_Sub2_Sub4_75 = null;
		Static39.aClass12_25 = null;
	}
}
