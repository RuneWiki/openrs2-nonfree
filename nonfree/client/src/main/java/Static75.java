import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array10;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array2;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!na;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_626 = Static120.method1824("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_624 = aClass80_626;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_625 = Static120.method1824("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!qf;I)Z")
	public static boolean method1107(@OriginalArg(0) Class77 arg0) {
		if (Static106.aBoolean90) {
			if (Static71.method1062(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3206 == 0) {
				return false;
			}
		}
		return arg0.aBoolean122;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIIII)V")
	public static void method1109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg5 + arg1;
		@Pc(14) int local14 = arg2 - arg1;
		@Pc(18) int local18 = arg1 + arg4;
		for (@Pc(20) int local20 = arg5; local20 < local5; local20++) {
			Static46.method726(arg4, arg0, Static96.anIntArrayArray27[local20], arg3);
		}
		@Pc(43) int local43 = arg3 - arg1;
		for (@Pc(45) int local45 = arg2; local45 > local14; local45--) {
			Static46.method726(arg4, arg0, Static96.anIntArrayArray27[local45], arg3);
		}
		for (@Pc(70) int local70 = local5; local70 <= local14; local70++) {
			@Pc(76) int[] local76 = Static96.anIntArrayArray27[local70];
			Static46.method726(arg4, arg0, local76, local18);
			Static46.method726(local43, arg0, local76, arg3);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILclient!dd;Lclient!dd;IIJ)V")
	public static void method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) Class3_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class51 local8 = new Class51();
		local8.aLong69 = arg8;
		local8.anInt2031 = arg1 * 128 + 64;
		local8.anInt2029 = arg2 * 128 + 64;
		local8.anInt2032 = arg3;
		local8.aClass3_Sub1_Sub5_5 = arg4;
		local8.aClass3_Sub1_Sub5_4 = arg5;
		local8.anInt2028 = arg6;
		local8.anInt2030 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static185.aClass3_Sub15ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static185.aClass3_Sub15ArrayArrayArray1[local42][arg1][arg2] = new Class3_Sub15(local42, arg1, arg2);
			}
		}
		Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local8;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method1112() {
		@Pc(3) boolean local3 = true;
		Static88.method1286(false);
		Static175.anInt3942 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static151.aByteArrayArray9.length; local10++) {
			if (Static143.anIntArray394[local10] != -1 && Static151.aByteArrayArray9[local10] == null) {
				Static151.aByteArrayArray9[local10] = Static100.aClass1_Sub1_16.method60(Static143.anIntArray394[local10], 0);
				if (Static151.aByteArrayArray9[local10] == null) {
					local3 = false;
					Static175.anInt3942++;
				}
			}
			if (Static132.anIntArray382[local10] != -1 && Static112.aByteArrayArray6[local10] == null) {
				Static112.aByteArrayArray6[local10] = Static100.aClass1_Sub1_16.method62(0, Static132.anIntArray382[local10], Static92.anIntArrayArray33[local10]);
				if (Static112.aByteArrayArray6[local10] == null) {
					local3 = false;
					Static175.anInt3942++;
				}
			}
		}
		if (!local3) {
			Static106.anInt2202 = 1;
			return;
		}
		local3 = true;
		Static193.anInt4408 = 0;
		@Pc(115) int local115;
		@Pc(125) int local125;
		for (@Pc(97) int local97 = 0; local97 < Static151.aByteArrayArray9.length; local97++) {
			@Pc(103) byte[] local103 = Static112.aByteArrayArray6[local97];
			if (local103 != null) {
				local115 = (Static161.anIntArray451[local97] >> 8) * 64 - Static97.anInt2062;
				local125 = (Static161.anIntArray451[local97] & 0xFF) * 64 - Static39.anInt875;
				if (Static54.aBoolean52) {
					local125 = 10;
					local115 = 10;
				}
				local3 &= Static74.method2639(local125, local103, local115);
			}
		}
		if (!local3) {
			Static106.anInt2202 = 2;
			return;
		}
		if (Static106.anInt2202 != 0) {
			Static126.method1869(Static154.method2467(new Class80[] { Static196.aClass80_1517, Static111.aClass80_988 }), true);
		}
		Static174.method2812();
		Static77.method1272();
		Static174.method2812();
		Static111.method1722();
		Static174.method2812();
		System.gc();
		for (@Pc(189) int local189 = 0; local189 < 4; local189++) {
			Static32.aClass82Array11[local189].method2513();
		}
		@Pc(212) int local212;
		for (local115 = 0; local115 < 4; local115++) {
			for (local125 = 0; local125 < 104; local125++) {
				for (local212 = 0; local212 < 104; local212++) {
					Static18.aByteArrayArrayArray1[local115][local125][local212] = 0;
				}
			}
		}
		Static174.method2812();
		Static90.method1314();
		local125 = Static151.aByteArrayArray9.length;
		Static36.method573();
		Static88.method1286(true);
		@Pc(282) int local282;
		@Pc(267) int local267;
		@Pc(388) int local388;
		@Pc(332) int local332;
		@Pc(377) int local377;
		if (!Static54.aBoolean52) {
			@Pc(271) byte[] local271;
			for (local212 = 0; local212 < local125; local212++) {
				local267 = (Static161.anIntArray451[local212] & 0xFF) * 64 - Static39.anInt875;
				local271 = Static151.aByteArrayArray9[local212];
				local282 = (Static161.anIntArray451[local212] >> 8) * 64 - Static97.anInt2062;
				if (local271 != null) {
					Static174.method2812();
					Static97.method1465(Static32.aClass82Array11, local271, local282, (Static147.anInt3300 - 6) * 8, local267, Static134.anInt3310 * 8 - 48);
				}
			}
			for (local282 = 0; local282 < local125; local282++) {
				local267 = (Static161.anIntArray451[local282] >> 8) * 64 - Static97.anInt2062;
				local332 = (Static161.anIntArray451[local282] & 0xFF) * 64 - Static39.anInt875;
				@Pc(336) byte[] local336 = Static151.aByteArrayArray9[local282];
				if (local336 == null && Static134.anInt3310 < 800) {
					Static174.method2812();
					Static67.method1001(local267, 64, 64, local332);
				}
			}
			Static88.method1286(true);
			for (local267 = 0; local267 < local125; local267++) {
				local271 = Static112.aByteArrayArray6[local267];
				if (local271 != null) {
					local377 = (Static161.anIntArray451[local267] >> 8) * 64 - Static97.anInt2062;
					local388 = (Static161.anIntArray451[local267] & 0xFF) * 64 - Static39.anInt875;
					Static174.method2812();
					Static175.method2825(local388, Static32.aClass82Array11, local271, local377);
				}
			}
		}
		@Pc(445) int local445;
		@Pc(451) int local451;
		if (Static54.aBoolean52) {
			@Pc(457) int local457;
			@Pc(467) int local467;
			@Pc(469) int local469;
			for (local212 = 0; local212 < 4; local212++) {
				Static174.method2812();
				for (local282 = 0; local282 < 13; local282++) {
					for (local267 = 0; local267 < 13; local267++) {
						@Pc(422) boolean local422 = false;
						local377 = Static103.anIntArrayArrayArray6[local212][local282][local267];
						if (local377 != -1) {
							local388 = local377 >> 24 & 0x3;
							local445 = local377 >> 1 & 0x3;
							local451 = local377 >> 14 & 0x3FF;
							local457 = local377 >> 3 & 0x7FF;
							local467 = (local451 / 8 << 8) + local457 / 8;
							for (local469 = 0; local469 < Static161.anIntArray451.length; local469++) {
								if (Static161.anIntArray451[local469] == local467 && Static151.aByteArrayArray9[local469] != null) {
									Static82.method1217(local282 * 8, (local457 & 0x7) * 8, local267 * 8, local445, Static151.aByteArrayArray9[local469], (local451 & 0x7) * 8, Static32.aClass82Array11, local212, local388);
									local422 = true;
									break;
								}
							}
						}
						if (!local422) {
							Static105.method1565(local212, local267 * 8, local282 * 8);
						}
					}
				}
			}
			for (local282 = 0; local282 < 13; local282++) {
				for (local267 = 0; local267 < 13; local267++) {
					local332 = Static103.anIntArrayArrayArray6[0][local282][local267];
					if (local332 == -1) {
						Static67.method1001(local282 * 8, 8, 8, local267 * 8);
					}
				}
			}
			Static88.method1286(true);
			for (local267 = 0; local267 < 4; local267++) {
				Static174.method2812();
				for (local332 = 0; local332 < 13; local332++) {
					for (local377 = 0; local377 < 13; local377++) {
						local388 = Static103.anIntArrayArrayArray6[local267][local332][local377];
						if (local388 != -1) {
							local445 = local388 >> 24 & 0x3;
							local457 = local388 >> 14 & 0x3FF;
							local451 = local388 >> 1 & 0x3;
							local467 = local388 >> 3 & 0x7FF;
							local469 = local467 / 8 + (local457 / 8 << 8);
							for (@Pc(654) int local654 = 0; local654 < Static161.anIntArray451.length; local654++) {
								if (Static161.anIntArray451[local654] == local469 && Static112.aByteArrayArray6[local654] != null) {
									Static90.method1315(local451, local445, Static112.aByteArrayArray6[local654], (local457 & 0x7) * 8, Static32.aClass82Array11, local377 * 8, local267, (local467 & 0x7) * 8, local332 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static88.method1286(true);
		Static77.method1272();
		Static174.method2812();
		Static114.method1766(Static32.aClass82Array11);
		Static88.method1286(true);
		local212 = Static13.anInt315;
		if (local212 > Static153.anInt673) {
			local212 = Static153.anInt673;
		}
		if (local212 < Static153.anInt673 - 1) {
		}
		if (Static96.aBoolean83) {
			Static69.method1033(Static13.anInt315);
		} else {
			Static69.method1033(0);
		}
		for (local282 = 0; local282 < 104; local282++) {
			for (local267 = 0; local267 < 104; local267++) {
				Static166.method2679(local282, local267);
			}
		}
		Static174.method2812();
		Static26.method424();
		Static77.method1272();
		if (Static29.aFrame1 != null) {
			Static146.aClass3_Sub17_Sub1_3.method2146(10);
			Static146.aClass3_Sub17_Sub1_3.method2131(1057001181);
		}
		if (!Static54.aBoolean52) {
			local267 = (Static147.anInt3300 - 6) / 8;
			local377 = (Static134.anInt3310 - 6) / 8;
			local332 = (Static147.anInt3300 + 6) / 8;
			local388 = (Static134.anInt3310 + 6) / 8;
			for (local445 = local267 - 1; local445 <= local332 + 1; local445++) {
				for (local451 = local377 - 1; local451 <= local388 + 1; local451++) {
					if (local267 > local445 || local332 < local445 || local451 < local377 || local451 > local388) {
						Static100.aClass1_Sub1_16.method55(Static154.method2467(new Class80[] { Static81.aClass80_677, Static83.method1219(local445), Static29.aClass80_226, Static83.method1219(local451) }));
						Static100.aClass1_Sub1_16.method55(Static154.method2467(new Class80[] { Static39.aClass80_319, Static83.method1219(local445), Static29.aClass80_226, Static83.method1219(local451) }));
					}
				}
			}
		}
		Static132.method2019(30);
		Static174.method2812();
		Static27.method3151();
		Static146.aClass3_Sub17_Sub1_3.method2146(126);
		Static177.method2837();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIBLclient!ri;I)V")
	public static void method1113(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub15 arg3, @OriginalArg(5) int arg4) {
		if (Static66.anInt1437 >= 50 || (arg3.anIntArray442 == null || arg3.anIntArray442.length <= arg2)) {
			return;
		}
		@Pc(27) int local27 = arg3.anIntArray442[arg2];
		if (local27 == 0) {
			return;
		}
		@Pc(37) int local37 = local27 >> 8;
		@Pc(47) int local47 = local27 >> 4 & 0x7;
		@Pc(51) int local51 = local27 & 0xF;
		if (local51 == 0) {
			if (arg1) {
				Static110.method1707(local37, 0, local47);
			}
		} else if (Static29.anInt739 != 0) {
			Static82.anIntArray215[Static66.anInt1437] = local37;
			Static17.anIntArray63[Static66.anInt1437] = local47;
			Static145.anIntArray411[Static66.anInt1437] = 0;
			@Pc(88) int local88 = (arg0 - 64) / 128;
			Static159.aClass75Array1[Static66.anInt1437] = null;
			@Pc(98) int local98 = (arg4 - 64) / 128;
			Static106.anIntArray303[Static66.anInt1437] = (local88 << 16) - (-(local98 << 8) - local51);
			Static66.anInt1437++;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
	public static void method1116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static172.anInt3861 <= arg2 && arg3 <= Static85.anInt1779 && arg1 >= Static34.anInt790 && arg0 <= Static17.anInt440) {
			Static156.method2498(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static2.method78(arg0, arg3, arg4, arg2, arg1);
		}
	}
}
