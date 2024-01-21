import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1104 = Static81.method1507("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1103 = aClass24_1104;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public static int anInt3864 = 0;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1105 = Static81.method1507("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1106 = Static81.method1507("Lade Texturen )2 ");

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1107 = aClass24_1104;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[Lclient!mc;[I[I)V")
	public static void method2980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class63[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(22) int local22 = arg0 - 1;
		@Pc(26) int local26 = arg1 + 1;
		@Pc(32) int local32 = (arg0 + arg1) / 2;
		@Pc(36) Class63 local36 = arg2[local32];
		arg2[local32] = arg2[arg0];
		arg2[arg0] = local36;
		while (local26 > local22) {
			@Pc(49) boolean local49 = true;
			@Pc(52) int local52;
			@Pc(68) int local68;
			@Pc(63) int local63;
			do {
				local26--;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg3[local52] == 2) {
						local63 = local36.anInt2665;
						local68 = arg2[local26].anInt2665;
					} else if (arg3[local52] == 1) {
						local68 = arg2[local26].anInt2667;
						local63 = local36.anInt2667;
						if (local63 == -1 && arg4[local52] == 1) {
							local63 = 2001;
						}
						if (local68 == -1 && arg4[local52] == 1) {
							local68 = 2001;
						}
					} else if (arg3[local52] == 3) {
						local68 = arg2[local26].aBoolean121 ? 1 : 0;
						local63 = local36.aBoolean121 ? 1 : 0;
					} else {
						local63 = local36.anInt2671;
						local68 = arg2[local26].anInt2671;
					}
					if (local63 != local68) {
						if ((arg4[local52] != 1 || local63 >= local68) && (arg4[local52] != 0 || local68 >= local63)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			local49 = true;
			do {
				local22++;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg3[local52] == 2) {
						local68 = arg2[local22].anInt2665;
						local63 = local36.anInt2665;
					} else if (arg3[local52] == 1) {
						local68 = arg2[local22].anInt2667;
						local63 = local36.anInt2667;
						if (local68 == -1 && arg4[local52] == 1) {
							local68 = 2001;
						}
						if (local63 == -1 && arg4[local52] == 1) {
							local63 = 2001;
						}
					} else if (arg3[local52] == 3) {
						local68 = arg2[local22].aBoolean121 ? 1 : 0;
						local63 = local36.aBoolean121 ? 1 : 0;
					} else {
						local63 = local36.anInt2671;
						local68 = arg2[local22].anInt2671;
					}
					if (local68 != local63) {
						if ((arg4[local52] != 1 || local63 <= local68) && (arg4[local52] != 0 || local68 <= local63)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			if (local22 < local26) {
				@Pc(310) Class63 local310 = arg2[local22];
				arg2[local22] = arg2[local26];
				arg2[local26] = local310;
			}
		}
		method2980(arg0, local26, arg2, arg3, arg4);
		method2980(local26 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class98 local12 = Static87.method1589(arg0, arg1);
		if (local12 != null && local12.anObjectArray23 != null) {
			@Pc(21) Class1_Sub16 local21 = new Class1_Sub16();
			local21.aClass98_13 = local12;
			local21.anObjectArray1 = local12.anObjectArray23;
			Static131.method2258(local21);
		}
		Static178.aBoolean185 = true;
		Static30.anInt777 = arg0;
		Static4.anInt4608 = arg2;
		Static38.anInt1025 = arg1;
		Static199.method2199(local12);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public static boolean method2983(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIZIII)V")
	public static void method2984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(14) int local14 = arg6;
		@Pc(19) int local19 = arg5 - arg0;
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = arg6 - arg0;
		@Pc(30) int local30 = arg5 * arg5;
		@Pc(34) int local34 = local19 * local19;
		@Pc(38) int local38 = arg6 * arg6;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local38 << 1;
		@Pc(50) int local50 = local42 << 1;
		@Pc(54) int local54 = arg6 << 1;
		@Pc(58) int local58 = local34 << 1;
		@Pc(62) int local62 = local30 << 1;
		@Pc(70) int local70 = local38 - (local54 - 1) * local62;
		@Pc(79) int local79 = local46 + local30 * (1 - local54);
		@Pc(83) int local83 = local26 << 1;
		@Pc(91) int local91 = local34 * (1 - local83) + local50;
		@Pc(100) int local100 = local42 - local58 * (local83 - 1);
		@Pc(104) int local104 = local38 << 2;
		@Pc(108) int local108 = local42 << 2;
		@Pc(112) int local112 = local46 * 3;
		@Pc(116) int local116 = local30 << 2;
		@Pc(120) int local120 = local34 << 2;
		@Pc(124) int local124 = local50 * 3;
		@Pc(130) int local130 = (local54 - 3) * local62;
		@Pc(136) int local136 = local58 * (local83 - 3);
		@Pc(138) int local138 = local104;
		@Pc(144) int local144 = local116 * (arg6 - 1);
		@Pc(146) int local146 = local108;
		@Pc(152) int local152 = local120 * (local26 - 1);
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg1 >= Static13.anInt308 && arg1 <= Static52.anInt1338) {
			@Pc(170) int[] local170 = Static98.anIntArrayArray16[arg1];
			local179 = Static177.method3022(Static63.anInt1608, arg2 - arg5, Static63.anInt1595);
			local187 = Static177.method3022(Static63.anInt1608, arg2 + arg5, Static63.anInt1595);
			local195 = Static177.method3022(Static63.anInt1608, arg2 - local19, Static63.anInt1595);
			local203 = Static177.method3022(Static63.anInt1608, arg2 + local19, Static63.anInt1595);
			Static39.method731(local170, local179, local195, arg4);
			Static39.method731(local170, local195, local203, arg3);
			Static39.method731(local170, local203, local187, arg4);
		}
		while (local14 > 0) {
			@Pc(230) boolean local230 = local26 >= local14;
			if (local230) {
				if (local91 < 0) {
					while (local91 < 0) {
						local21++;
						local100 += local146;
						local91 += local124;
						local146 += local108;
						local124 += local108;
					}
				}
				if (local100 < 0) {
					local21++;
					local91 += local124;
					local124 += local108;
					local100 += local146;
					local146 += local108;
				}
				local91 += -local152;
				local100 += -local136;
				local136 -= local120;
				local152 -= local120;
			}
			if (local79 < 0) {
				while (local79 < 0) {
					local3++;
					local70 += local138;
					local138 += local104;
					local79 += local112;
					local112 += local104;
				}
			}
			if (local70 < 0) {
				local79 += local112;
				local70 += local138;
				local3++;
				local112 += local104;
				local138 += local104;
			}
			local79 += -local144;
			local70 += -local130;
			local144 -= local116;
			local14--;
			local130 -= local116;
			local179 = arg1 - local14;
			local187 = arg1 + local14;
			if (Static13.anInt308 <= local187 && local179 <= Static52.anInt1338) {
				local195 = Static177.method3022(Static63.anInt1608, arg2 + local3, Static63.anInt1595);
				local203 = Static177.method3022(Static63.anInt1608, arg2 - local3, Static63.anInt1595);
				if (local230) {
					@Pc(426) int local426 = Static177.method3022(Static63.anInt1608, local21 + arg2, Static63.anInt1595);
					@Pc(435) int local435 = Static177.method3022(Static63.anInt1608, arg2 - local21, Static63.anInt1595);
					@Pc(446) int[] local446;
					if (Static13.anInt308 <= local179) {
						local446 = Static98.anIntArrayArray16[local179];
						Static39.method731(local446, local203, local435, arg4);
						Static39.method731(local446, local435, local426, arg3);
						Static39.method731(local446, local426, local195, arg4);
					}
					if (Static52.anInt1338 >= local187) {
						local446 = Static98.anIntArrayArray16[local187];
						Static39.method731(local446, local203, local435, arg4);
						Static39.method731(local446, local435, local426, arg3);
						Static39.method731(local446, local426, local195, arg4);
					}
				} else {
					if (local179 >= Static13.anInt308) {
						Static39.method731(Static98.anIntArrayArray16[local179], local203, local195, arg4);
					}
					if (Static52.anInt1338 >= local187) {
						Static39.method731(Static98.anIntArrayArray16[local187], local203, local195, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method2986() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (Static39.anInt1027 == 72) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2799();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static75.anIntArray413[local16];
			local30 = Static192.aClass1_Sub7_Sub1_31.method2799();
			local38 = Static145.anInt3266 + (local30 >> 4 & 0x7);
			local44 = (local30 & 0x7) + Static67.anInt1667;
			if (local38 >= 0 && local44 >= 0 && local38 < 104 && local44 < 104) {
				Static151.method2593(-1, Static170.anInt3799, local20, local24, local16, -1, local44, local38, 0);
			}
			return;
		}
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(153) int local153;
		if (Static39.anInt1027 == 243) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
			local20 = (local12 & 0x7) + Static67.anInt1667;
			local16 = Static145.anInt3266 + (local12 >> 4 & 0x7);
			local24 = local16 + Static192.aClass1_Sub7_Sub1_31.method2770();
			local30 = local20 + Static192.aClass1_Sub7_Sub1_31.method2770();
			local38 = Static192.aClass1_Sub7_Sub1_31.method2779();
			local44 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local125 = Static192.aClass1_Sub7_Sub1_31.method2771() * 4;
			local131 = Static192.aClass1_Sub7_Sub1_31.method2771() * 4;
			local137 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local143 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local147 = Static192.aClass1_Sub7_Sub1_31.method2771();
			local153 = Static192.aClass1_Sub7_Sub1_31.method2771();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104 && local44 != 65535) {
				local16 = local16 * 128 + 64;
				local24 = local24 * 128 + 64;
				local30 = local30 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(237) Class5_Sub4 local237 = new Class5_Sub4(local44, Static170.anInt3799, local16, local20, Static37.method699(local20, Static170.anInt3799, local16) - local125, Static42.anInt1100 + local137, local143 + Static42.anInt1100, local147, local153, local38, local131);
				local237.method2651(local30, Static37.method699(local30, Static170.anInt3799, local24) - local131, local24, local137 + Static42.anInt1100);
				Static201.aClass87_29.method2823(new Class1_Sub2_Sub14(local237));
			}
		} else if (Static39.anInt1027 == 176) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
			local16 = (local12 >> 4 & 0x7) + Static145.anInt3266;
			local20 = (local12 & 0x7) + Static67.anInt1667;
			local24 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local30 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local38 = Static192.aClass1_Sub7_Sub1_31.method2765();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(327) Class87 local327 = Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20];
				if (local327 != null) {
					for (@Pc(334) Class1_Sub2_Sub16 local334 = (Class1_Sub2_Sub16) local327.method2827(); local334 != null; local334 = (Class1_Sub2_Sub16) local327.method2830()) {
						@Pc(339) Class5_Sub7 local339 = local334.aClass5_Sub7_1;
						if ((local24 & 0x7FFF) == local339.anInt4089 && local30 == local339.anInt4083) {
							local339.anInt4083 = local38;
							break;
						}
					}
					Static37.method700(local16, local20);
				}
			}
		} else {
			if (Static39.anInt1027 == 101) {
				local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local20 = Static67.anInt1667 + (local12 & 0x7);
				local16 = (local12 >> 4 & 0x7) + Static145.anInt3266;
				local24 = Static192.aClass1_Sub7_Sub1_31.method2765();
				local30 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local125 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local44 = local30 & 0x7;
				if (local24 == 65535) {
					local24 = -1;
				}
				local38 = local30 >> 4 & 0xF;
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local131 = local38 + 1;
					if (Static87.aClass5_Sub2_Sub1_1.anIntArray199[0] >= local16 - local131 && Static87.aClass5_Sub2_Sub1_1.anIntArray199[0] <= local16 + local131 && local20 - local131 <= Static87.aClass5_Sub2_Sub1_1.anIntArray196[0] && Static87.aClass5_Sub2_Sub1_1.anIntArray196[0] <= local131 + local20 && Static200.anInt4473 != 0 && local44 > 0 && Static66.anInt1660 < 50 && local24 != -1) {
						Static143.anIntArray270[Static66.anInt1660] = local24;
						Static48.anIntArray102[Static66.anInt1660] = local44;
						Static66.anIntArray143[Static66.anInt1660] = local125;
						Static20.aClass11Array1[Static66.anInt1660] = null;
						Static79.anIntArray163[Static66.anInt1660] = (local16 << 16) + (local20 << 8) + local38;
						Static66.anInt1660++;
					}
				}
			}
			if (Static39.anInt1027 == 19) {
				local12 = Static192.aClass1_Sub7_Sub1_31.method2777();
				local16 = (local12 >> 4 & 0x7) + Static145.anInt3266;
				local20 = (local12 & 0x7) + Static67.anInt1667;
				local24 = Static192.aClass1_Sub7_Sub1_31.method2752();
				local30 = Static192.aClass1_Sub7_Sub1_31.method2794();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					@Pc(591) Class5_Sub7 local591 = new Class5_Sub7();
					local591.anInt4089 = local24;
					local591.anInt4083 = local30;
					if (Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20] == null) {
						Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20] = new Class87();
					}
					Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20].method2823(new Class1_Sub2_Sub16(local591));
					Static37.method700(local16, local20);
				}
			} else if (Static39.anInt1027 == 114) {
				local12 = Static192.aClass1_Sub7_Sub1_31.method2799();
				local20 = (local12 & 0x7) + Static67.anInt1667;
				local16 = Static145.anInt3266 + (local12 >> 4 & 0x7);
				local24 = Static192.aClass1_Sub7_Sub1_31.method2769();
				local30 = local24 >> 2;
				local38 = local24 & 0x3;
				local44 = Static75.anIntArray413[local30];
				local125 = Static192.aClass1_Sub7_Sub1_31.method2796();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < 103 && local20 < 103) {
					if (local44 == 0) {
						@Pc(708) Class19 local708 = Static179.method3050(Static170.anInt3799, local16, local20);
						if (local708 != null) {
							local137 = Integer.MAX_VALUE & (int) (local708.aLong26 >>> 32);
							if (local30 == 2) {
								local708.aClass5_1 = new Class5_Sub5(local137, 2, local38 + 4, Static170.anInt3799, local16, local20, local125, false, local708.aClass5_1);
								local708.aClass5_2 = new Class5_Sub5(local137, 2, local38 + 1 & 0x3, Static170.anInt3799, local16, local20, local125, false, local708.aClass5_2);
							} else {
								local708.aClass5_1 = new Class5_Sub5(local137, local30, local38, Static170.anInt3799, local16, local20, local125, false, local708.aClass5_1);
							}
						}
					}
					if (local44 == 1) {
						@Pc(785) Class49 local785 = Static59.method1110(Static170.anInt3799, local16, local20);
						if (local785 != null) {
							local137 = (int) (local785.aLong62 >>> 32) & Integer.MAX_VALUE;
							if (local30 == 4 || local30 == 5) {
								local785.aClass5_5 = new Class5_Sub5(local137, 4, local38, Static170.anInt3799, local16, local20, local125, false, local785.aClass5_5);
							} else if (local30 == 6) {
								local785.aClass5_5 = new Class5_Sub5(local137, 4, local38 + 4, Static170.anInt3799, local16, local20, local125, false, local785.aClass5_5);
							} else if (local30 == 7) {
								local785.aClass5_5 = new Class5_Sub5(local137, 4, (local38 + 2 & 0x3) + 4, Static170.anInt3799, local16, local20, local125, false, local785.aClass5_5);
							} else if (local30 == 8) {
								local785.aClass5_5 = new Class5_Sub5(local137, 4, local38 + 4, Static170.anInt3799, local16, local20, local125, false, local785.aClass5_5);
								local785.aClass5_4 = new Class5_Sub5(local137, 4, (local38 + 2 & 0x3) + 4, Static170.anInt3799, local16, local20, local125, false, local785.aClass5_4);
							}
						}
					}
					if (local44 == 2) {
						if (local30 == 11) {
							local30 = 10;
						}
						@Pc(926) Class51 local926 = Static71.method1354(Static170.anInt3799, local16, local20);
						if (local926 != null) {
							local926.aClass5_6 = new Class5_Sub5((int) (local926.aLong68 >>> 32) & Integer.MAX_VALUE, local30, local38, Static170.anInt3799, local16, local20, local125, false, local926.aClass5_6);
						}
					}
					if (local44 == 3) {
						@Pc(959) Class96 local959 = Static134.method2290(Static170.anInt3799, local16, local20);
						if (local959 != null) {
							local959.aClass5_11 = new Class5_Sub5(Integer.MAX_VALUE & (int) (local959.aLong137 >>> 32), 22, local38, Static170.anInt3799, local16, local20, local125, false, local959.aClass5_11);
						}
					}
				}
			} else if (Static39.anInt1027 == 16) {
				local12 = Static192.aClass1_Sub7_Sub1_31.method2765();
				local16 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local20 = (local16 >> 4 & 0x7) + Static145.anInt3266;
				local24 = (local16 & 0x7) + Static67.anInt1667;
				local30 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local44 = local30 & 0x3;
				local38 = local30 >> 2;
				local125 = Static75.anIntArray413[local38];
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					Static151.method2593(local12, Static170.anInt3799, local44, local125, local38, -1, local24, local20, 0);
				}
			} else if (Static39.anInt1027 == 85) {
				local12 = Static192.aClass1_Sub7_Sub1_31.method2794();
				local16 = Static192.aClass1_Sub7_Sub1_31.method2794();
				local20 = Static192.aClass1_Sub7_Sub1_31.method2769();
				local24 = Static145.anInt3266 + (local20 >> 4 & 0x7);
				local30 = (local20 & 0x7) + Static67.anInt1667;
				local38 = Static192.aClass1_Sub7_Sub1_31.method2752();
				if (local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104 && Static111.anInt2534 != local12) {
					@Pc(1111) Class5_Sub7 local1111 = new Class5_Sub7();
					local1111.anInt4083 = local38;
					local1111.anInt4089 = local16;
					if (Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local24][local30] == null) {
						Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local24][local30] = new Class87();
					}
					Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local24][local30].method2823(new Class1_Sub2_Sub16(local1111));
					Static37.method700(local24, local30);
				}
			} else {
				if (Static39.anInt1027 == 148) {
					local12 = Static192.aClass1_Sub7_Sub1_31.method2794();
					local16 = Static192.aClass1_Sub7_Sub1_31.method2794();
					local20 = Static192.aClass1_Sub7_Sub1_31.method2794();
					@Pc(1172) byte local1172 = Static192.aClass1_Sub7_Sub1_31.method2800();
					local30 = Static192.aClass1_Sub7_Sub1_31.method2794();
					@Pc(1180) byte local1180 = Static192.aClass1_Sub7_Sub1_31.method2760();
					@Pc(1184) byte local1184 = Static192.aClass1_Sub7_Sub1_31.method2800();
					@Pc(1188) byte local1188 = Static192.aClass1_Sub7_Sub1_31.method2760();
					local131 = Static192.aClass1_Sub7_Sub1_31.method2777();
					local143 = (local131 & 0x7) + Static67.anInt1667;
					local137 = (local131 >> 4 & 0x7) + Static145.anInt3266;
					local147 = Static192.aClass1_Sub7_Sub1_31.method2799();
					@Pc(1216) int local1216 = local147 & 0x3;
					local153 = local147 >> 2;
					@Pc(1224) int local1224 = Static75.anIntArray413[local153];
					@Pc(1231) Class5_Sub2_Sub1 local1231;
					if (Static111.anInt2534 == local12) {
						local1231 = Static87.aClass5_Sub2_Sub1_1;
					} else {
						local1231 = Static110.aClass5_Sub2_Sub1Array1[local12];
					}
					if (local1231 != null) {
						@Pc(1241) Class1_Sub2_Sub5 local1241 = Static37.method702(local20);
						@Pc(1254) int local1254;
						@Pc(1257) int local1257;
						if (local1216 == 1 || local1216 == 3) {
							local1254 = local1241.anInt958;
							local1257 = local1241.anInt976;
						} else {
							local1257 = local1241.anInt958;
							local1254 = local1241.anInt976;
						}
						@Pc(1273) int local1273 = (local1254 + 1 >> 1) + local137;
						@Pc(1279) int local1279 = local137 + (local1254 >> 1);
						@Pc(1287) int local1287 = (local1257 + 1 >> 1) + local143;
						@Pc(1293) int local1293 = (local1257 >> 1) + local143;
						@Pc(1297) int[][] local1297 = Static186.anIntArrayArrayArray2[Static170.anInt3799];
						@Pc(1305) int local1305 = (local143 << 7) + (local1257 << 6);
						@Pc(1313) int local1313 = (local137 << 7) + (local1254 << 6);
						@Pc(1340) int local1340 = local1297[local1273][local1287] + local1297[local1279][local1293] + local1297[local1273][local1293] + local1297[local1279][local1287] >> 2;
						@Pc(1353) Class1_Sub2_Sub11 local1353 = local1241.method691(local1297, local1305, false, local1340, local1216, local1313, local153);
						if (local1353 != null) {
							@Pc(1364) byte local1364;
							if (local1188 > local1184) {
								local1364 = local1188;
								local1188 = local1184;
								local1184 = local1364;
							}
							Static151.method2593(-1, Static170.anInt3799, 0, local1224, 0, local30 + 1, local143, local137, local16 + 1);
							local1231.anInt609 = local1340;
							local1231.aClass5_Sub1_1 = (Class5_Sub1) local1353.aClass5_3;
							local1231.anInt621 = local16 + Static42.anInt1100;
							local1231.anInt614 = local1254 * 64 + local137 * 128;
							local1231.anInt625 = local1184 + local137;
							local1231.anInt628 = Static42.anInt1100 + local30;
							if (local1180 > local1172) {
								local1364 = local1180;
								local1180 = local1172;
								local1172 = local1364;
							}
							local1231.anInt616 = local143 + local1172;
							local1231.anInt613 = local1188 + local137;
							local1231.anInt611 = local1257 * 64 + local143 * 128;
							local1231.anInt618 = local143 + local1180;
						}
					}
				}
				if (Static39.anInt1027 == 90) {
					local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local16 = Static145.anInt3266 + (local12 >> 4 & 0x7);
					local20 = Static67.anInt1667 + (local12 & 0x7);
					local24 = Static192.aClass1_Sub7_Sub1_31.method2765();
					local30 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local38 = Static192.aClass1_Sub7_Sub1_31.method2765();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
						local20 = local20 * 128 + 64;
						local16 = local16 * 128 + 64;
						@Pc(1534) Class5_Sub3 local1534 = new Class5_Sub3(local24, Static170.anInt3799, local16, local20, Static37.method699(local20, Static170.anInt3799, local16) - local30, local38, Static42.anInt1100);
						Static207.aClass87_27.method2823(new Class1_Sub2_Sub20(local1534));
					}
				} else if (Static39.anInt1027 == 171) {
					local12 = Static192.aClass1_Sub7_Sub1_31.method2769();
					local16 = (local12 >> 4 & 0x7) + Static145.anInt3266;
					local20 = (local12 & 0x7) + Static67.anInt1667;
					local24 = Static192.aClass1_Sub7_Sub1_31.method2752();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
						@Pc(1597) Class87 local1597 = Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20];
						if (local1597 != null) {
							for (@Pc(1604) Class1_Sub2_Sub16 local1604 = (Class1_Sub2_Sub16) local1597.method2827(); local1604 != null; local1604 = (Class1_Sub2_Sub16) local1597.method2830()) {
								if ((local24 & 0x7FFF) == local1604.aClass5_Sub7_1.anInt4089) {
									local1604.method3563();
									break;
								}
							}
							if (local1597.method2827() == null) {
								Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local16][local20] = null;
							}
							Static37.method700(local16, local20);
						}
					}
				}
			}
		}
	}
}
