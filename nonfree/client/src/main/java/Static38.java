import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] aClass5_Sub1_Sub10_Sub1Array6;

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lclient!ra;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!gb", name = "wb", descriptor = "Lclient!me;")
	public static Class5_Sub1_Sub11 aClass5_Sub1_Sub11_2;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!vc;")
	public static Class71 aClass71_562 = method736("(Y");

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Lclient!rb;")
	public static Class57 aClass57_4 = new Class57(4096);

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_568 = method736("");

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "Lclient!vc;")
	public static Class71 aClass71_563 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_564 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Lclient!vc;")
	public static Class71 aClass71_565 = method736(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_566 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_567 = method736("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_569 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_570 = method736("T");

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_571 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
	public static int anInt1019 = 0;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_572 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_573 = aClass71_568;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
	public static int[] anIntArray120 = new int[5];

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_574 = method736("redstone3");

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "Lclient!qa;")
	public static Class54 aClass54_21 = new Class54(64);

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!gb", name = "xb", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
	public static void method730() {
		Static7.aClass7_14.method699();
		Static41.aClass5_Sub1_Sub10_Sub1_11.method921(0, 0);
		Static4.anIntArray6 = Static80.method1319(Static4.anIntArray6);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lclient!vc;")
	public static Class71 method731(@OriginalArg(1) int arg0) {
		@Pc(9) Class71 local9 = Static51.method962(arg0);
		for (@Pc(15) int local15 = local9.method1784() - 3; local15 > 0; local15 -= 3) {
			local9 = Static74.method677(new Class71[] { local9.method1800(local15, 0), Static31.aClass71_479, local9.method1822(local15) });
		}
		if (local9.method1784() > 8) {
			local9 = Static74.method677(new Class71[] { Static28.aClass71_448, local9.method1800(local9.method1784() - 8, 0), Static8.aClass71_203, Static16.aClass71_331, local9, aClass71_562 });
		} else if (local9.method1784() > 4) {
			local9 = Static74.method677(new Class71[] { Static103.aClass71_1202, local9.method1800(local9.method1784() - 4, 0), Static93.aClass71_1096, Static16.aClass71_331, local9, aClass71_562 });
		}
		return Static74.method677(new Class71[] { Static59.aClass71_778, local9 });
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method733() {
		Static107.anInt2550 = 0;
		@Pc(83) int local83;
		for (@Pc(15) int local15 = -1; local15 < Static90.anInt3005 + Static37.anInt594; local15++) {
			@Pc(22) Class5_Sub1_Sub1_Sub3 local22;
			if (local15 == -1) {
				local22 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1;
			} else if (local15 < Static37.anInt594) {
				local22 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local15]];
			} else {
				local22 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local15 - Static37.anInt594]];
			}
			if (local22 != null && local22.method1680()) {
				@Pc(63) Class5_Sub1_Sub16 local63;
				if (local22 instanceof Class5_Sub1_Sub1_Sub3_Sub1) {
					local63 = ((Class5_Sub1_Sub1_Sub3_Sub1) local22).aClass5_Sub1_Sub16_1;
					if (local63.anIntArray284 != null) {
						local63 = local63.method1891();
					}
					if (local63 == null) {
						continue;
					}
				}
				if (local15 >= Static37.anInt594) {
					local63 = ((Class5_Sub1_Sub1_Sub3_Sub1) local22).aClass5_Sub1_Sub16_1;
					if (local63.anIntArray284 != null) {
						local63 = local63.method1891();
					}
					if (local63.anInt2798 >= 0 && Static91.aClass5_Sub1_Sub10_Sub3Array10.length > local63.anInt2798) {
						Static17.method478(local22.anInt2451 + 15, local22);
						if (Static42.anInt1070 > -1) {
							Static91.aClass5_Sub1_Sub10_Sub3Array10[local63.anInt2798].method1862(Static42.anInt1070 - 12, Static95.anInt2287 - 30);
						}
					}
					if (Static6.anInt227 == 1 && Static61.anIntArray175[local15 - Static37.anInt594] == Static20.anInt678 && Static95.anInt2285 % 20 < 10) {
						Static17.method478(local22.anInt2451 + 15, local22);
						if (Static42.anInt1070 > -1) {
							Static74.aClass5_Sub1_Sub10_Sub3Array7[0].method1862(Static42.anInt1070 - 12, Static95.anInt2287 - 28);
						}
					}
				} else {
					local83 = 30;
					@Pc(86) Class5_Sub1_Sub1_Sub3_Sub2 local86 = (Class5_Sub1_Sub1_Sub3_Sub2) local22;
					if (local86.anInt2506 != -1 || local86.anInt2505 != -1) {
						Static17.method478(local22.anInt2451 + 15, local22);
						if (Static42.anInt1070 > -1) {
							if (local86.anInt2506 != -1) {
								Static115.aClass5_Sub1_Sub10_Sub3Array11[local86.anInt2506].method1862(Static42.anInt1070 - 12, Static95.anInt2287 - 30);
								local83 += 25;
							}
							if (local86.anInt2505 != -1) {
								Static91.aClass5_Sub1_Sub10_Sub3Array10[local86.anInt2505].method1862(Static42.anInt1070 - 12, -local83 + Static95.anInt2287);
								local83 += 25;
							}
						}
					}
					if (local15 >= 0 && Static6.anInt227 == 10 && Static40.anInt713 == Static116.anIntArray285[local15]) {
						Static17.method478(local22.anInt2451 + 15, local22);
						if (Static42.anInt1070 > -1) {
							Static74.aClass5_Sub1_Sub10_Sub3Array7[1].method1862(Static42.anInt1070 - 12, -local83 + Static95.anInt2287);
						}
					}
				}
				if (local22.aClass71_1229 != null && (Static37.anInt594 <= local15 || Static16.anInt518 == 0 || Static16.anInt518 == 3 || Static16.anInt518 == 1 && Static14.method409(((Class5_Sub1_Sub1_Sub3_Sub2) local22).aClass71_1236))) {
					Static17.method478(local22.anInt2451, local22);
					if (Static42.anInt1070 > -1 && Static16.anInt524 > Static107.anInt2550) {
						Static16.anIntArray69[Static107.anInt2550] = Static35.aClass5_Sub1_Sub10_Sub4_2.method2032(local22.aClass71_1229) / 2;
						Static16.anIntArray71[Static107.anInt2550] = Static35.aClass5_Sub1_Sub10_Sub4_2.anInt3022;
						Static16.anIntArray75[Static107.anInt2550] = Static42.anInt1070;
						Static16.anIntArray72[Static107.anInt2550] = Static95.anInt2287;
						Static16.anIntArray73[Static107.anInt2550] = local22.anInt2455;
						Static16.anIntArray70[Static107.anInt2550] = local22.anInt2491;
						Static16.anIntArray74[Static107.anInt2550] = local22.anInt2462;
						Static16.aClass71Array5[Static107.anInt2550] = local22.aClass71_1229;
						Static107.anInt2550++;
					}
				}
				if (Static95.anInt2285 < local22.anInt2445) {
					Static17.method478(local22.anInt2451 + 15, local22);
					if (Static42.anInt1070 > -1) {
						local83 = local22.anInt2473 * 30 / local22.anInt2468;
						if (local83 > 30) {
							local83 = 30;
						}
						Static52.method2024(Static42.anInt1070 - 15, Static95.anInt2287 + -3, local83, 5, 65280);
						Static52.method2024(Static42.anInt1070 + local83 - 15, Static95.anInt2287 + -3, 30 - local83, 5, 16711680);
					}
				}
				for (local83 = 0; local83 < 4; local83++) {
					if (Static95.anInt2285 < local22.anIntArray262[local83]) {
						Static17.method478(local22.anInt2451 / 2, local22);
						if (Static42.anInt1070 > -1) {
							if (local83 == 1) {
								Static95.anInt2287 -= 20;
							}
							if (local83 == 2) {
								Static95.anInt2287 -= 10;
								Static42.anInt1070 -= 15;
							}
							if (local83 == 3) {
								Static42.anInt1070 += 15;
								Static95.anInt2287 -= 10;
							}
							Static26.aClass5_Sub1_Sub10_Sub3Array8[local22.anIntArray263[local83]].method1862(Static42.anInt1070 - 12, Static95.anInt2287 + -12);
							Static7.aClass5_Sub1_Sub10_Sub4_1.method2048(Static51.method962(local22.anIntArray265[local83]), Static42.anInt1070, Static95.anInt2287 + 4, 0);
							Static7.aClass5_Sub1_Sub10_Sub4_1.method2048(Static51.method962(local22.anIntArray265[local83]), Static42.anInt1070 - 1, Static95.anInt2287 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(511) int local511 = 0; local511 < Static107.anInt2550; local511++) {
			@Pc(517) int local517 = Static16.anIntArray72[local511];
			local83 = Static16.anIntArray75[local511];
			@Pc(525) int local525 = Static16.anIntArray69[local511];
			@Pc(529) int local529 = Static16.anIntArray71[local511];
			@Pc(531) boolean local531 = true;
			while (local531) {
				local531 = false;
				for (@Pc(537) int local537 = 0; local537 < local511; local537++) {
					if (local517 + 2 > Static16.anIntArray72[local537] - Static16.anIntArray71[local537] && local517 - local529 < Static16.anIntArray72[local537] - -2 && Static16.anIntArray75[local537] + Static16.anIntArray69[local537] > local83 - local525 && Static16.anIntArray75[local537] - Static16.anIntArray69[local537] < local525 + local83 && Static16.anIntArray72[local537] - Static16.anIntArray71[local537] < local517) {
						local517 = Static16.anIntArray72[local537] - Static16.anIntArray71[local537];
						local531 = true;
					}
				}
			}
			Static42.anInt1070 = Static16.anIntArray75[local511];
			Static95.anInt2287 = Static16.anIntArray72[local511] = local517;
			@Pc(641) Class71 local641 = Static16.aClass71Array5[local511];
			if (Static119.anInt2943 == 0) {
				@Pc(645) int local645 = 16776960;
				if (Static16.anIntArray73[local511] < 6) {
					local645 = Static27.anIntArray94[Static16.anIntArray73[local511]];
				}
				if (Static16.anIntArray73[local511] == 6) {
					local645 = Static91.anInt2117 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static16.anIntArray73[local511] == 7) {
					local645 = Static91.anInt2117 % 20 >= 10 ? 65535 : 255;
				}
				if (Static16.anIntArray73[local511] == 8) {
					local645 = Static91.anInt2117 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(719) int local719;
				if (Static16.anIntArray73[local511] == 9) {
					local719 = 150 - Static16.anIntArray74[local511];
					if (local719 < 50) {
						local645 = local719 * 1280 + 16711680;
					} else if (local719 < 100) {
						local645 = 16776960 - (local719 - 50) * 327680;
					} else if (local719 < 150) {
						local645 = (local719 - 100) * 5 + 65280;
					}
				}
				if (Static16.anIntArray73[local511] == 10) {
					local719 = 150 - Static16.anIntArray74[local511];
					if (local719 < 50) {
						local645 = local719 * 5 + 16711680;
					} else if (local719 < 100) {
						local645 = 16711935 - (local719 - 50) * 327680;
					} else if (local719 < 150) {
						local645 = local719 * 327680 + 255 - (local719 + -100) * 5 - 32768000;
					}
				}
				if (Static16.anIntArray73[local511] == 11) {
					local719 = 150 - Static16.anIntArray74[local511];
					if (local719 < 50) {
						local645 = 16777215 - local719 * 327685;
					} else if (local719 < 100) {
						local645 = local719 * 327685 + 65280 - 16384250;
					} else if (local719 < 150) {
						local645 = 16777215 - (local719 - 100) * 327680;
					}
				}
				if (Static16.anIntArray70[local511] == 0) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, Static95.anInt2287 + 1, 0);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, Static95.anInt2287, local645);
				}
				if (Static16.anIntArray70[local511] == 1) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2035(local641, Static42.anInt1070, Static95.anInt2287 + 1, 0, Static91.anInt2117);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2035(local641, Static42.anInt1070, Static95.anInt2287, local645, Static91.anInt2117);
				}
				if (Static16.anIntArray70[local511] == 2) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2044(local641, Static42.anInt1070, Static95.anInt2287 + 1, 0, Static91.anInt2117);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2044(local641, Static42.anInt1070, Static95.anInt2287, local645, Static91.anInt2117);
				}
				if (Static16.anIntArray70[local511] == 3) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2030(local641, Static42.anInt1070, Static95.anInt2287 + 1, 0, Static91.anInt2117, 150 - Static16.anIntArray74[local511]);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2030(local641, Static42.anInt1070, Static95.anInt2287, local645, Static91.anInt2117, 150 - Static16.anIntArray74[local511]);
				}
				@Pc(983) int local983;
				if (Static16.anIntArray70[local511] == 4) {
					local719 = Static35.aClass5_Sub1_Sub10_Sub4_2.method2032(local641);
					local983 = (local719 + 100) * (150 - Static16.anIntArray74[local511]) / 150;
					Static52.method2025(Static42.anInt1070 - 50, 0, Static42.anInt1070 + 50, 334);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2033(local641, Static42.anInt1070 + 50 - local983, Static95.anInt2287 + 1, 0);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2033(local641, Static42.anInt1070 + 50 - local983, Static95.anInt2287, local645);
					Static52.method2028();
				}
				if (Static16.anIntArray70[local511] == 5) {
					local719 = 150 - Static16.anIntArray74[local511];
					Static52.method2025(0, Static95.anInt2287 - Static35.aClass5_Sub1_Sub10_Sub4_2.anInt3022 - 1, 512, Static95.anInt2287 + 5);
					local983 = 0;
					if (local719 < 25) {
						local983 = local719 - 25;
					} else if (local719 > 125) {
						local983 = local719 - 125;
					}
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, Static95.anInt2287 + local983 + 1, 0);
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, local983 + Static95.anInt2287, local645);
					Static52.method2028();
				}
			} else {
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, Static95.anInt2287 + 1, 0);
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(local641, Static42.anInt1070, Static95.anInt2287, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(II)Lclient!vc;")
	public static Class71 method735(@OriginalArg(0) int arg0) {
		return Static74.method677(new Class71[] { Static51.method962(arg0 >> 24 & 0xFF), Static112.aClass71_1292, Static51.method962(arg0 >> 16 & 0xFF), Static112.aClass71_1292, Static51.method962(arg0 >> 8 & 0xFF), Static112.aClass71_1292, Static51.method962(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vc;")
	public static Class71 method736(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(20) Class71 local20 = new Class71();
		@Pc(22) int local22 = 0;
		local20.aByteArray28 = new byte[local9];
		while (local22 < local9) {
			@Pc(34) int local34 = local6[local22++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local9 <= local22) {
					break;
				}
				@Pc(71) int local71 = local6[local22++] & 0xFF;
				local20.aByteArray28[local20.anInt2736++] = (byte) (local71 + (local34 + -40) * 43 - 48);
			} else if (local34 != 0) {
				local20.aByteArray28[local20.anInt2736++] = (byte) local34;
			}
		}
		local20.method1794();
		return local20.method1789();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V")
	public static void method737() {
		aClass71_566 = null;
		aClass71_574 = null;
		aClass71_565 = null;
		aClass71_567 = null;
		aClass5_Sub1_Sub10_Sub1Array6 = null;
		aClass56_3 = null;
		anIntArray120 = null;
		aClass71_569 = null;
		aClass71_568 = null;
		aClass71_573 = null;
		aClass5_Sub1_Sub11_2 = null;
		aClass71_570 = null;
		aClass71_562 = null;
		aClass71_563 = null;
		aClass71_571 = null;
		aClass54_21 = null;
		aClass57_4 = null;
		aClass71_572 = null;
		aClass71_564 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	public static void method738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static9.anInt303 == 0 || arg2 == 0 || Static57.anInt1480 >= 50) {
			return;
		}
		Static30.anIntArray100[Static57.anInt1480] = arg0;
		Static107.anIntArray270[Static57.anInt1480] = arg2;
		Static32.anIntArray105[Static57.anInt1480] = arg1;
		Static86.aClass50Array10[Static57.anInt1480] = null;
		Static70.anIntArray215[Static57.anInt1480] = 0;
		Static57.anInt1480++;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZII)I")
	public static int method739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static6.method152(arg1 + 91923, 4, arg0 + 45365) + (Static6.method152(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static6.method152(arg1, 1, arg0) - 128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public static void method741(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static79.aClass5_Sub1_Sub10_Sub3_35.anIntArray281;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static59.aByteArrayArrayArray2[arg0][local44][local29] & 0x18) == 0) {
					Static7.aClass43_1.method1064(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static59.aByteArrayArrayArray2[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static7.aClass43_1.method1064(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		Static79.aClass5_Sub1_Sub10_Sub3_35.method1859();
		local42 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local44 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(162) int local162;
		for (@Pc(150) int local150 = 1; local150 < 103; local150++) {
			for (local162 = 1; local162 < 103; local162++) {
				if ((Static59.aByteArrayArrayArray2[arg0][local162][local150] & 0x18) == 0) {
					Static116.method1889(local150, local44, arg0, local162, local42);
				}
				if (arg0 < 3 && (Static59.aByteArrayArrayArray2[arg0 + 1][local162][local150] & 0x8) != 0) {
					Static116.method1889(local150, local44, arg0 + 1, local162, local42);
				}
			}
		}
		Static51.anInt1420 = 0;
		for (local162 = 0; local162 < 104; local162++) {
			for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
				@Pc(234) int local234 = Static7.aClass43_1.method1098(Static23.anInt728, local162, local226);
				if (local234 != 0) {
					local234 = local234 >> 14 & 0x7FFF;
					@Pc(250) int local250 = Static97.method1606(local234).anInt2545;
					if (local250 >= 0) {
						@Pc(257) int local257 = local162;
						@Pc(259) int local259 = local226;
						if (local250 != 22 && local250 != 29 && local250 != 34 && local250 != 36 && local250 != 46 && local250 != 47 && local250 != 48) {
							@Pc(295) int[][] local295 = Static111.aClass33Array3[Static23.anInt728].anIntArrayArray14;
							for (@Pc(297) int local297 = 0; local297 < 10; local297++) {
								@Pc(304) int local304 = (int) (Math.random() * 4.0D);
								if (local304 == 0 && local257 > 0 && local162 - 3 < local257 && (local295[local257 - 1][local259] & 0x1280108) == 0) {
									local257--;
								}
								if (local304 == 1 && local257 < 103 && local162 + 3 > local257 && (local295[local257 + 1][local259] & 0x1280180) == 0) {
									local257++;
								}
								if (local304 == 2 && local259 > 0 && local226 - 3 < local259 && (local295[local257][local259 - 1] & 0x1280102) == 0) {
									local259--;
								}
								if (local304 == 3 && local259 < 103 && local226 + 3 > local259 && (local295[local257][local259 + 1] & 0x1280120) == 0) {
									local259++;
								}
							}
						}
						Static76.aClass5_Sub1_Sub10_Sub3Array9[Static51.anInt1420] = Static6.aClass5_Sub1_Sub10_Sub3Array1[local250];
						Static85.anIntArray252[Static51.anInt1420] = local257;
						Static83.anIntArray248[Static51.anInt1420] = local259;
						Static51.anInt1420++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method742(@OriginalArg(1) Class24 arg0) {
		Static29.aClass24_10 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method743() {
		Static9.aClass54_4.method1402();
		Static2.aClass54_30.method1402();
	}
}
