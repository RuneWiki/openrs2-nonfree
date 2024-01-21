import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!b;")
	public static Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!b;")
	public static Class6_Sub1 aClass6_Sub1_4;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_866 = Static34.method846("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!rc;")
	private static Class55 aClass55_867 = Static34.method846("No response from server)3");

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public static final int anInt2132 = 2301979;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_868 = Static34.method846(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_869 = aClass55_867;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!rc;Lclient!pb;ILclient!rc;)Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 method1434(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(13) int local13 = arg1.method1229(arg2);
		@Pc(19) int local19 = arg1.method1242(local13, arg0);
		return Static21.method651(arg1, local13, local19);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1435() {
		while (true) {
			if (Static13.aClass6_Sub1_Sub1_2.method1514(Static63.anInt1889) >= 27) {
				@Pc(20) int local20 = Static13.aClass6_Sub1_Sub1_2.method1519(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local20] == null) {
						local27 = true;
						Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local20] = new Class6_Sub2_Sub3_Sub1_Sub2();
					}
					@Pc(43) Class6_Sub2_Sub3_Sub1_Sub2 local43 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local20];
					Static19.anIntArray60[Static111.anInt3173++] = local20;
					local43.anInt2739 = Static85.anInt2389;
					@Pc(59) int local59 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
					if (local59 == 1) {
						Static102.anIntArray288[Static59.anInt1826++] = local20;
					}
					@Pc(77) int local77 = Static13.aClass6_Sub1_Sub1_2.method1519(5);
					@Pc(82) int local82 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
					@Pc(91) int local91 = Static18.anIntArray59[Static13.aClass6_Sub1_Sub1_2.method1519(3)];
					if (local27) {
						local43.anInt2707 = local91;
					}
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(107) int local107 = Static13.aClass6_Sub1_Sub1_2.method1519(5);
					local43.aClass6_Sub2_Sub4_1 = Static8.method326(Static13.aClass6_Sub1_Sub1_2.method1519(13));
					local43.anInt2736 = local43.aClass6_Sub2_Sub4_1.anInt880;
					local43.anInt2756 = local43.aClass6_Sub2_Sub4_1.anInt855;
					if (local107 > 15) {
						local107 -= 32;
					}
					local43.anInt2732 = local43.aClass6_Sub2_Sub4_1.anInt861;
					local43.anInt2751 = local43.aClass6_Sub2_Sub4_1.anInt873;
					local43.anInt2728 = local43.aClass6_Sub2_Sub4_1.anInt866;
					local43.anInt2701 = local43.aClass6_Sub2_Sub4_1.anInt862;
					local43.anInt2709 = local43.aClass6_Sub2_Sub4_1.anInt863;
					if (local43.anInt2728 == 0) {
						local43.anInt2707 = 0;
					}
					local43.anInt2708 = local43.aClass6_Sub2_Sub4_1.anInt857;
					local43.anInt2747 = local43.aClass6_Sub2_Sub4_1.anInt878;
					local43.method1832(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0] + local107, local82 == 1, local77 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0]);
					continue;
				}
			}
			Static13.aClass6_Sub1_Sub1_2.method1523();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIZIIIIIII)Z")
	public static boolean method1436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static96.anIntArrayArray21[local7][local11] = 0;
				Static70.anIntArrayArray15[local7][local11] = 99999999;
			}
		}
		Static96.anIntArrayArray21[arg2][arg8] = 99;
		local11 = arg2;
		Static70.anIntArrayArray15[arg2][arg8] = 0;
		@Pc(49) int local49 = 0;
		@Pc(51) boolean local51 = false;
		@Pc(53) byte local53 = 0;
		Static54.anIntArray161[0] = arg2;
		@Pc(59) int local59 = arg8;
		@Pc(62) int local62 = local53 + 1;
		Static34.anIntArray81[0] = arg8;
		@Pc(67) int local67 = Static54.anIntArray161.length;
		@Pc(72) int[][] local72 = Static96.aClass57Array1[Static56.anInt1718].anIntArrayArray20;
		@Pc(180) int local180;
		while (local49 != local62) {
			local11 = Static54.anIntArray161[local49];
			local59 = Static34.anIntArray81[local49];
			local49 = (local49 + 1) % local67;
			if (arg10 == local11 && arg0 == local59) {
				local51 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static96.aClass57Array1[Static56.anInt1718].method1729(arg1 - 1, local59, arg5, arg10, local11, arg0)) {
					local51 = true;
					break;
				}
				if (arg1 < 10 && Static96.aClass57Array1[Static56.anInt1718].method1741(arg5, arg0, local59, arg1 - 1, arg10, local11)) {
					local51 = true;
					break;
				}
			}
			if (arg9 != 0 && arg6 != 0 && Static96.aClass57Array1[Static56.anInt1718].method1737(arg6, arg4, local59, arg0, arg9, local11, arg10)) {
				local51 = true;
				break;
			}
			local180 = Static70.anIntArrayArray15[local11][local59] + 1;
			if (local11 > 0 && Static96.anIntArrayArray21[local11 - 1][local59] == 0 && (local72[local11 - 1][local59] & 0x1280108) == 0) {
				Static54.anIntArray161[local62] = local11 - 1;
				Static34.anIntArray81[local62] = local59;
				local62 = (local62 + 1) % local67;
				Static96.anIntArrayArray21[local11 - 1][local59] = 2;
				Static70.anIntArrayArray15[local11 - 1][local59] = local180;
			}
			if (local11 < 103 && Static96.anIntArrayArray21[local11 + 1][local59] == 0 && (local72[local11 + 1][local59] & 0x1280180) == 0) {
				Static54.anIntArray161[local62] = local11 + 1;
				Static34.anIntArray81[local62] = local59;
				local62 = (local62 + 1) % local67;
				Static96.anIntArrayArray21[local11 + 1][local59] = 8;
				Static70.anIntArrayArray15[local11 + 1][local59] = local180;
			}
			if (local59 > 0 && Static96.anIntArrayArray21[local11][local59 - 1] == 0 && (local72[local11][local59 - 1] & 0x1280102) == 0) {
				Static54.anIntArray161[local62] = local11;
				Static34.anIntArray81[local62] = local59 - 1;
				local62 = (local62 + 1) % local67;
				Static96.anIntArrayArray21[local11][local59 - 1] = 1;
				Static70.anIntArrayArray15[local11][local59 - 1] = local180;
			}
			if (local59 < 103 && Static96.anIntArrayArray21[local11][local59 + 1] == 0 && (local72[local11][local59 + 1] & 0x1280120) == 0) {
				Static54.anIntArray161[local62] = local11;
				Static34.anIntArray81[local62] = local59 + 1;
				Static96.anIntArrayArray21[local11][local59 + 1] = 4;
				local62 = (local62 + 1) % local67;
				Static70.anIntArrayArray15[local11][local59 + 1] = local180;
			}
			if (local11 > 0 && local59 > 0 && Static96.anIntArrayArray21[local11 - 1][local59 - 1] == 0 && (local72[local11 - 1][local59 - 1] & 0x128010E) == 0 && (local72[local11 - 1][local59] & 0x1280108) == 0 && (local72[local11][local59 - 1] & 0x1280102) == 0) {
				Static54.anIntArray161[local62] = local11 - 1;
				Static34.anIntArray81[local62] = local59 - 1;
				Static96.anIntArrayArray21[local11 - 1][local59 - 1] = 3;
				local62 = (local62 + 1) % local67;
				Static70.anIntArrayArray15[local11 - 1][local59 - 1] = local180;
			}
			if (local11 < 103 && local59 > 0 && Static96.anIntArrayArray21[local11 + 1][local59 - 1] == 0 && (local72[local11 + 1][local59 - 1] & 0x1280183) == 0 && (local72[local11 + 1][local59] & 0x1280180) == 0 && (local72[local11][local59 - 1] & 0x1280102) == 0) {
				Static54.anIntArray161[local62] = local11 + 1;
				Static34.anIntArray81[local62] = local59 - 1;
				local62 = (local62 + 1) % local67;
				Static96.anIntArrayArray21[local11 + 1][local59 - 1] = 9;
				Static70.anIntArrayArray15[local11 + 1][local59 - 1] = local180;
			}
			if (local11 > 0 && local59 < 103 && Static96.anIntArrayArray21[local11 - 1][local59 + 1] == 0 && (local72[local11 - 1][local59 + 1] & 0x1280138) == 0 && (local72[local11 - 1][local59] & 0x1280108) == 0 && (local72[local11][local59 + 1] & 0x1280120) == 0) {
				Static54.anIntArray161[local62] = local11 - 1;
				Static34.anIntArray81[local62] = local59 + 1;
				Static96.anIntArrayArray21[local11 - 1][local59 + 1] = 6;
				Static70.anIntArrayArray15[local11 - 1][local59 + 1] = local180;
				local62 = (local62 + 1) % local67;
			}
			if (local11 < 103 && local59 < 103 && Static96.anIntArrayArray21[local11 + 1][local59 + 1] == 0 && (local72[local11 + 1][local59 + 1] & 0x12801E0) == 0 && (local72[local11 + 1][local59] & 0x1280180) == 0 && (local72[local11][local59 + 1] & 0x1280120) == 0) {
				Static54.anIntArray161[local62] = local11 + 1;
				Static34.anIntArray81[local62] = local59 + 1;
				local62 = (local62 + 1) % local67;
				Static96.anIntArrayArray21[local11 + 1][local59 + 1] = 12;
				Static70.anIntArrayArray15[local11 + 1][local59 + 1] = local180;
			}
		}
		Static79.anInt2290 = 0;
		@Pc(806) int local806;
		@Pc(811) int local811;
		@Pc(818) int local818;
		if (!local51) {
			if (!arg3) {
				return false;
			}
			local180 = 1000;
			local806 = 100;
			for (local811 = arg10 - 10; local811 <= arg10 + 10; local811++) {
				for (local818 = arg0 - 10; local818 <= arg0 + 10; local818++) {
					if (local811 >= 0 && local818 >= 0 && local811 < 104 && local818 < 104 && Static70.anIntArrayArray15[local811][local818] < 100) {
						@Pc(841) int local841 = 0;
						if (local811 < arg10) {
							local841 = arg10 - local811;
						} else if (local811 > arg10 + arg9 - 1) {
							local841 = local811 + 1 - arg10 - arg9;
						}
						@Pc(868) int local868 = 0;
						if (arg0 > local818) {
							local868 = arg0 - local818;
						} else if (local818 > arg6 + arg0 - 1) {
							local868 = local818 + 1 - arg6 - arg0;
						}
						@Pc(906) int local906 = local841 * local841 + local868 * local868;
						if (local906 < local180 || local906 == local180 && Static70.anIntArrayArray15[local811][local818] < local806) {
							local806 = Static70.anIntArrayArray15[local811][local818];
							local11 = local811;
							local59 = local818;
							local180 = local906;
						}
					}
				}
			}
			if (local180 == 1000) {
				return false;
			}
			if (local11 == arg2 && arg8 == local59) {
				return false;
			}
			Static79.anInt2290 = 1;
		}
		@Pc(978) byte local978 = 0;
		Static54.anIntArray161[0] = local11;
		local49 = local978 + 1;
		Static34.anIntArray81[0] = local59;
		local180 = local806 = Static96.anIntArrayArray21[local11][local59];
		while (arg2 != local11 || arg8 != local59) {
			if (local180 != local806) {
				Static54.anIntArray161[local49] = local11;
				local806 = local180;
				Static34.anIntArray81[local49++] = local59;
			}
			if ((local180 & 0x2) != 0) {
				local11++;
			} else if ((local180 & 0x8) != 0) {
				local11--;
			}
			if ((local180 & 0x1) != 0) {
				local59++;
			} else if ((local180 & 0x4) != 0) {
				local59--;
			}
			local180 = Static96.anIntArrayArray21[local11][local59];
		}
		if (local49 > 0) {
			local67 = local49--;
			@Pc(1074) int local1074 = Static54.anIntArray161[local49];
			local811 = Static34.anIntArray81[local49];
			if (local67 > 25) {
				local67 = 25;
			}
			if (arg7 == 0) {
				Static51.aClass6_Sub1_Sub1_3.method1515(157);
				Static51.aClass6_Sub1_Sub1_3.method1501(local67 + local67 + 3);
			}
			if (arg7 == 1) {
				Static51.aClass6_Sub1_Sub1_3.method1515(158);
				Static51.aClass6_Sub1_Sub1_3.method1501(local67 + local67 + 17);
			}
			if (arg7 == 2) {
				Static51.aClass6_Sub1_Sub1_3.method1515(217);
				Static51.aClass6_Sub1_Sub1_3.method1501(local67 + local67 + 3);
			}
			Static8.anInt378 = Static54.anIntArray161[0];
			Static41.anInt1398 = Static34.anIntArray81[0];
			for (local818 = 1; local818 < local67; local818++) {
				local49--;
				Static51.aClass6_Sub1_Sub1_3.method1469(Static54.anIntArray161[local49] - local1074);
				Static51.aClass6_Sub1_Sub1_3.method1459(Static34.anIntArray81[local49] - local811);
			}
			Static51.aClass6_Sub1_Sub1_3.method1476(Static41.aBooleanArray3[82] ? 1 : 0);
			Static51.aClass6_Sub1_Sub1_3.method1467(local1074 + Static18.anInt938);
			Static51.aClass6_Sub1_Sub1_3.method1510(local811 + Static88.anInt3276);
			return true;
		} else if (arg7 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method1437() {
		if (Static19.aClass65_1 != null) {
			Static19.aClass65_1.method2012();
			Static19.aClass65_1 = null;
		}
		Static47.method1012();
		Static109.aClass34_1.method1064();
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			Static96.aClass57Array1[local20].method1735();
		}
		System.gc();
		Static77.method1536();
		Static6.anInt268 = -1;
		Static46.anInt3212 = 0;
		Static58.method1191();
		Static114.method2097(10);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public static void method1438() {
		aClass6_Sub1_3 = null;
		aClass55_867 = null;
		aByteArrayArray7 = null;
		aClass55_869 = null;
		aClass55_868 = null;
		aClass55_866 = null;
		anIntArray211 = null;
		aClass6_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public static void method1439() {
		@Pc(11) int local11 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 + Static94.anInt2648;
		@Pc(16) int local16 = Static35.anInt1336 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710;
		if (Static65.anInt1948 - local16 < -500 || Static65.anInt1948 - local16 > 500 || Static97.anInt2828 - local11 < -500 || Static97.anInt2828 - local11 > 500) {
			Static65.anInt1948 = local16;
			Static97.anInt2828 = local11;
		}
		if (Static65.anInt1948 != local16) {
			Static65.anInt1948 += (local16 - Static65.anInt1948) / 16;
		}
		if (local11 != Static97.anInt2828) {
			Static97.anInt2828 += (local11 - Static97.anInt2828) / 16;
		}
		if (Static41.aBooleanArray3[96]) {
			Static86.anInt2408 += (-Static86.anInt2408 - 24) / 2;
		} else if (Static41.aBooleanArray3[97]) {
			Static86.anInt2408 += (24 - Static86.anInt2408) / 2;
		} else {
			Static86.anInt2408 /= 2;
		}
		@Pc(106) int local106 = Static97.anInt2828 >> 7;
		if (Static41.aBooleanArray3[98]) {
			Static69.anInt2030 += (12 - Static69.anInt2030) / 2;
		} else if (Static41.aBooleanArray3[99]) {
			Static69.anInt2030 += (-Static69.anInt2030 - 12) / 2;
		} else {
			Static69.anInt2030 /= 2;
		}
		Static26.anInt2144 += Static69.anInt2030 / 2;
		if (Static26.anInt2144 < 128) {
			Static26.anInt2144 = 128;
		}
		if (Static26.anInt2144 > 383) {
			Static26.anInt2144 = 383;
		}
		Static14.anInt811 = Static14.anInt811 + Static86.anInt2408 / 2 & 0x7FF;
		@Pc(168) int local168 = 0;
		@Pc(172) int local172 = Static65.anInt1948 >> 7;
		@Pc(178) int local178 = Static112.method2073(Static56.anInt1718, Static65.anInt1948, Static97.anInt2828);
		@Pc(202) int local202;
		if (local172 > 3 && local106 > 3 && local172 < 100 && local106 < 100) {
			for (local202 = local172 - 4; local202 <= local172 + 4; local202++) {
				for (@Pc(208) int local208 = local106 - 4; local208 <= local106 + 4; local208++) {
					@Pc(212) int local212 = Static56.anInt1718;
					if (local212 < 3 && (Static43.aByteArrayArrayArray8[1][local202][local208] & 0x2) == 2) {
						local212++;
					}
					@Pc(240) int local240 = local178 - Static6.anIntArrayArrayArray1[local212][local202][local208];
					if (local168 < local240) {
						local168 = local240;
					}
				}
			}
		}
		local202 = local168 * 192;
		if (local202 > 98048) {
			local202 = 98048;
		}
		if (local202 < 32768) {
			local202 = 32768;
		}
		if (Static54.anInt1685 < local202) {
			Static54.anInt1685 += (local202 - Static54.anInt1685) / 24;
		} else if (local202 < Static54.anInt1685) {
			Static54.anInt1685 += (local202 - Static54.anInt1685) / 80;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1440() {
		Static88.method2093();
		if (Static61.anInt1879 != 10) {
			return;
		}
		@Pc(21) int local21 = Static68.anInt2013 - 202;
		@Pc(23) int local23 = Static85.anInt2400;
		@Pc(27) int local27 = Static23.anInt1030 - 171;
		if (Static6.anInt267 == 0) {
			if (local23 == 1 && local21 >= 25 && local21 <= 175 && local27 >= 100 && local27 <= 140) {
				Static6.anInt267 = 3;
				Static106.anInt2349 = 0;
			}
			if (local23 == 1 && local21 >= 185 && local21 <= 335 && local27 >= 100 && local27 <= 140) {
				Static29.aClass55_424 = Static92.aClass55_1064;
				Static29.aClass55_433 = Static92.aClass55_1067;
				Static106.anInt2349 = 0;
				Static6.anInt267 = 2;
				Static29.aClass55_430 = Static83.aClass55_955;
				return;
			}
			return;
		}
		if (Static6.anInt267 == 2) {
			@Pc(130) byte local130 = 60;
			@Pc(131) int local131 = local130 + 30;
			if (local23 == 1 && local27 >= 75 && local27 < 90) {
				Static106.anInt2349 = 0;
			}
			local131 += 15;
			if (local23 == 1 && local27 >= 90 && local27 < 105) {
				Static106.anInt2349 = 1;
			}
			local131 += 15;
			if (local23 == 1 && local21 >= 25 && local21 <= 175 && local27 >= 130 && local27 <= 170) {
				Static29.aClass55_429 = Static29.aClass55_429.method1637().method1655();
				Static45.method987(Static108.aClass55_1303, Static92.aClass55_1099, Static92.aClass55_1102);
				Static114.method2097(20);
				return;
			}
			if (local23 == 1 && local21 >= 185 && local21 <= 335 && local27 >= 130 && local27 <= 170) {
				Static29.aClass55_425 = Static29.aClass55_431;
				Static6.anInt267 = 0;
				Static29.aClass55_429 = Static29.aClass55_431;
			}
			while (true) {
				@Pc(264) boolean local264;
				label138: do {
					while (Static9.method353()) {
						local264 = false;
						for (@Pc(266) int local266 = 0; local266 < Static22.aClass55_369.method1674(); local266++) {
							if (Static11.anInt692 == Static22.aClass55_369.method1648(local266)) {
								local264 = true;
								break;
							}
						}
						if (Static106.anInt2349 != 0) {
							continue label138;
						}
						if (Static104.anInt3065 == 85 && Static29.aClass55_429.method1674() > 0) {
							Static29.aClass55_429 = Static29.aClass55_429.method1671(0, Static29.aClass55_429.method1674() - 1);
						}
						if (Static104.anInt3065 == 84 || Static104.anInt3065 == 80) {
							Static106.anInt2349 = 1;
						}
						if (local264 && Static29.aClass55_429.method1674() < 12) {
							Static29.aClass55_429 = Static29.aClass55_429.method1668(Static11.anInt692);
						}
					}
					return;
				} while (Static106.anInt2349 != 1);
				if (Static104.anInt3065 == 85 && Static29.aClass55_425.method1674() > 0) {
					Static29.aClass55_425 = Static29.aClass55_425.method1671(0, Static29.aClass55_425.method1674() - 1);
				}
				if (Static104.anInt3065 == 84 || Static104.anInt3065 == 80) {
					Static106.anInt2349 = 0;
				}
				if (local264 && Static29.aClass55_425.method1674() < 20) {
					Static29.aClass55_425 = Static29.aClass55_425.method1668(Static11.anInt692);
				}
			}
		}
		if (Static6.anInt267 != 3 || local23 != 1 || local21 < 105 || local21 > 255 || local27 < 130 || local27 > 170) {
			return;
		}
		Static6.anInt267 = 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class55 method1441(@OriginalArg(0) int arg0) {
		return Static89.method1698(new Class55[] { Static58.method1196(arg0 >> 24 & 0xFF), Static112.aClass55_1358, Static58.method1196(arg0 >> 16 & 0xFF), Static112.aClass55_1358, Static58.method1196(arg0 >> 8 & 0xFF), Static112.aClass55_1358, Static58.method1196(arg0 & 0xFF) });
	}
}
