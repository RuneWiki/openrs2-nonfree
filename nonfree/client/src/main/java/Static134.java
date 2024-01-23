import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	public static int anInt2897;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1002 = Static200.method3116("Standort");

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1003 = Static200.method3116("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
	public static int anInt2902 = 0;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method2226() {
		if (Static166.aClass60_1241 == null) {
			return;
		}
		if (Static41.anInt971 < 10) {
			if (!Static198.aClass7_Sub1_30.method3229(Static166.aClass60_1241)) {
				Static41.anInt971 = Static198.aClass7_Sub1_30.method3217(Static166.aClass60_1241) / 10;
				return;
			}
			Static41.anInt971 = 10;
		}
		if (Static41.anInt971 == 10) {
			@Pc(44) Class1_Sub9 local44 = new Class1_Sub9(Static198.aClass7_Sub1_30.method3245(Static41.aClass60_322, Static166.aClass60_1241));
			@Pc(48) int local48 = local44.method946();
			@Pc(52) int local52 = local44.method946();
			@Pc(56) int local56 = local44.method946();
			@Pc(60) int local60 = local44.method946();
			@Pc(64) int local64 = local44.method946();
			@Pc(68) int local68 = local44.method946();
			Static82.aDouble2 = 8.0D;
			Static8.aDouble1 = 8.0D;
			Static73.anInt1791 = local48 * 64;
			Static153.anInt3417 = local52 * 64;
			@Pc(89) int local89 = (Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7) + (Static128.anInt2813 - Static73.anInt1791);
			@Pc(100) int local100 = Static163.anInt3587 + (Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7) - Static153.anInt3417;
			@Pc(109) int local109 = local100 + (int) (Math.random() * 10.0D) - 5;
			Static52.anIntArray164 = new int[Static51.anInt1250 + 1];
			@Pc(120) int local120 = Static142.anInt3199 >> 2 << 10;
			Static211.anInt3462 = (local56 + 1 - local48) * 64;
			@Pc(138) int local138 = local89 + (int) (Math.random() * 10.0D) - 5;
			@Pc(142) int local142 = Static19.anInt473 >> 1;
			@Pc(146) int local146 = Static211.anInt3462 >> 6;
			Static30.anInt724 = (local60 + 1 - local52) * 64;
			@Pc(159) int local159 = Static30.anInt724 >> 6;
			if (local138 >= 0 && Static211.anInt3462 > local138 && local109 >= 0 && local109 < Static30.anInt724) {
				Static1.anInt42 = Static30.anInt724 - local109;
				Static138.anInt3087 = local138;
			} else {
				Static138.anInt3087 = local64 * 64 - Static73.anInt1791;
				Static1.anInt42 = Static153.anInt3417 + Static30.anInt724 - local68 * 64;
			}
			Static146.aByteArrayArrayArray6 = new byte[local146][local159][];
			Static192.aByteArrayArrayArray11 = new byte[local146][local159][];
			Static185.aByteArrayArrayArray10 = new byte[local146][local159][];
			Static180.aByteArrayArrayArray9 = new byte[local146][local159][];
			Static52.anIntArrayArrayArray8 = new int[local146][local159][];
			Static155.anIntArrayArrayArray19 = new int[local146][local159][];
			Static97.aByteArrayArrayArray2 = new byte[local146][local159][];
			Static153.aByteArrayArrayArray7 = new byte[local146][local159][];
			for (@Pc(234) int local234 = 0; local234 < Static51.anInt1250; local234++) {
				@Pc(240) Class1_Sub1_Sub13 local240 = Static129.method887(local234);
				if (local240 != null) {
					@Pc(245) int local245 = local240.anInt2683;
					if (local245 >= 0 && !Static81.anInterface1_1.method1246(local245)) {
						local245 = -1;
					}
					@Pc(266) int local266;
					@Pc(271) int local271;
					@Pc(277) int local277;
					@Pc(306) int local306;
					if (local240.anInt2688 >= 0) {
						local271 = local240.anInt2688;
						local277 = (local271 & 0x7F) + local142;
						if (local277 < 0) {
							local277 = 0;
						} else if (local277 > 127) {
							local277 = 127;
						}
						local306 = local277 + (local120 + local271 & 0xFC00) + (local271 & 0x380);
						local266 = Static81.anIntArray227[Static159.method2684(local306, 96)];
					} else if (local245 >= 0) {
						local266 = Static81.anIntArray227[Static159.method2684(Static81.anInterface1_1.method1250(local245), 96)];
					} else if (local240.anInt2687 == -1) {
						local266 = -1;
					} else {
						local271 = local240.anInt2687;
						local277 = (local271 & 0x7F) + local142;
						if (local277 < 0) {
							local277 = 0;
						} else if (local277 > 127) {
							local277 = 127;
						}
						local306 = (local120 + local271 & 0xFC00) + (local271 & 0x380) + local277;
						local266 = Static81.anIntArray227[Static159.method2684(local306, 96)];
					}
					Static52.anIntArray164[local234 + 1] = local266;
				}
			}
			Static41.anInt971 = 20;
		} else if (Static41.anInt971 == 20) {
			Static147.method2514(Static198.aClass7_Sub1_30.method3245(Static89.aClass60_680, Static166.aClass60_1241));
			Static41.anInt971 = 30;
			Static51.method969();
		} else if (Static41.anInt971 == 30) {
			Static194.method3018(Static198.aClass7_Sub1_30.method3245(Static68.aClass60_534, Static166.aClass60_1241));
			Static41.anInt971 = 50;
			Static51.method969();
		} else if (Static41.anInt971 == 50) {
			Static93.method1623(Static198.aClass7_Sub1_30.method3245(Static143.aClass60_1120, Static166.aClass60_1241));
			Static41.anInt971 = 70;
			Static51.method969();
		} else if (Static41.anInt971 == 70) {
			Static45.method772(Static198.aClass7_Sub1_30.method3245(Static191.aClass60_1379, Static166.aClass60_1241));
			Static41.anInt971 = 90;
			Static51.method969();
		} else {
			Static38.method660(Static198.aClass7_Sub1_30.method3245(Static199.aClass60_1458, Static166.aClass60_1241));
			if (Static41.anInt971 == 90) {
				Static93.aClass88_4 = new Class88(11, true, Static78.aCanvas1);
				Static25.aClass88_2 = new Class88(12, true, Static78.aCanvas1);
				Static154.aClass88_6 = new Class88(14, true, Static78.aCanvas1);
				Static139.aClass88_5 = new Class88(17, true, Static78.aCanvas1);
				Static168.aClass88_7 = new Class88(19, true, Static78.aCanvas1);
				Static199.aClass88_8 = new Class88(22, true, Static78.aCanvas1);
				Static2.aClass88_1 = new Class88(26, true, Static78.aCanvas1);
				Static64.aClass88_3 = new Class88(30, true, Static78.aCanvas1);
				Static41.anInt971 = 100;
			}
			Static188.anInt4036 = -1;
			Static41.anInt971 = 100;
			Static32.anInt816 = -1;
			Static51.method969();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method2227() {
		@Pc(1) Class51 local1 = Static176.aClass51_2;
		synchronized (Static176.aClass51_2) {
			Static24.anInt568++;
			Static27.anInt641 = Static10.anInt342;
			Static122.anInt2732 = Static122.anInt2734;
			Static176.anInt768 = Static46.anInt1055;
			Static192.anInt4115 = Static156.anInt3476;
			Static166.anInt3603 = Static4.anInt88;
			Static39.anInt882 = Static70.anInt1745;
			Static151.aLong115 = Static17.aLong12;
			Static156.anInt3476 = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg0 - arg7;
		@Pc(14) int local14 = arg2 - arg5;
		@Pc(23) int local23 = (arg6 - arg4 << 16) / local9;
		@Pc(32) int local32 = (arg3 - arg1 << 16) / local14;
		if (arg0 < Static211.anInt3462) {
			local9++;
		}
		if (arg2 < Static30.anInt724) {
			local14++;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(94) int local94;
		@Pc(120) int local120;
		@Pc(128) int local128;
		for (@Pc(55) int local55 = 0; local55 < local9; local55++) {
			local63 = local55 * local23 >> 16;
			local71 = (local55 + 1) * local23 >> 16;
			local75 = local71 - local63;
			if (local75 > 0) {
				local63 += arg4;
				local71 += arg4;
				local94 = arg7 + local55 >> 6;
				@Pc(98) byte[][] local98 = Static146.aByteArrayArrayArray6[local94];
				@Pc(102) byte[][] local102 = Static192.aByteArrayArrayArray11[local94];
				@Pc(106) int[][] local106 = Static155.anIntArrayArrayArray19[local94];
				@Pc(110) byte[][] local110 = Static153.aByteArrayArrayArray7[local94];
				@Pc(114) byte[][] local114 = Static180.aByteArrayArrayArray9[local94];
				@Pc(118) byte[][] local118 = Static97.aByteArrayArrayArray2[local94];
				for (local120 = 0; local120 < local14; local120++) {
					local128 = local120 * local32 >> 16;
					@Pc(136) int local136 = local32 * (local120 + 1) >> 16;
					@Pc(141) int local141 = local136 - local128;
					if (local141 > 0) {
						local136 += arg1;
						local128 += arg1;
						@Pc(157) int local157 = local120 + arg5 >> 6;
						@Pc(164) int local164 = local120 + arg5 & 0x3F;
						@Pc(170) int local170 = arg7 + local55 & 0x3F;
						@Pc(177) int local177 = (local164 << 6) + local170;
						@Pc(187) int local187;
						@Pc(196) int local196;
						@Pc(202) int local202;
						if (local106[local157] == null) {
							local196 = local55 + arg7 & 0x4;
							local202 = arg5 + local120 & 0x4;
							if ((local196 >= 2 || local202 <= 2) && (local196 <= 2 || local202 >= 2)) {
								local187 = Static52.anIntArray164[Static143.anInt3208 + 1];
							} else {
								local187 = 4936552;
							}
						} else {
							local187 = local106[local157][local177];
						}
						if (local187 == 0) {
							local187 = 1;
						}
						local196 = local98[local157] == null ? 0 : Static52.anIntArray164[local98[local157][local177] & 0xFF];
						local202 = local102[local157] == null ? 0 : Static52.anIntArray164[local102[local157][local177] & 0xFF];
						@Pc(308) int local308;
						if (local196 == 0 && local202 == 0) {
							Static76.method1367(local63, local128, local75, local141, local187);
						} else {
							@Pc(304) byte local304;
							if (local196 != 0) {
								if (local196 == -1) {
									local196 = 1;
								}
								local304 = local114[local157] == null ? 0 : local114[local157][local177];
								local308 = local304 & 0xFC;
								if (local308 == 0 || local75 <= 1 || local141 <= 1) {
									Static76.method1367(local63, local128, local75, local141, local196);
								} else {
									Static112.method1926(local308 >> 2, local187, true, local141, local75, Static76.anIntArray214, local63, local304 & 0x3, local196, local128);
								}
							}
							if (local202 != 0) {
								if (local202 == -1) {
									local202 = local187;
								}
								local304 = local118[local157][local177];
								local308 = local304 & 0xFC;
								if (local308 == 0 || local75 <= 1 || local141 <= 1) {
									Static76.method1367(local63, local128, local75, local141, local202);
								}
								Static112.method1926(local308 >> 2, 0, local196 == 0, local141, local75, Static76.anIntArray214, local63, local304 & 0x3, local202, local128);
							}
						}
						if (local110[local157] != null) {
							@Pc(415) int local415 = local110[local157][local177] & 0xFF;
							if (local415 != 0) {
								if (local75 == 1) {
									local308 = local63;
								} else {
									local308 = local71 - 1;
								}
								@Pc(433) int local433 = 13421772;
								@Pc(440) int local440;
								if (local141 == 1) {
									local440 = local128;
								} else {
									local440 = local136 - 1;
								}
								if (local415 >= 5 && local415 <= 8 || local415 >= 13 && local415 <= 16 || local415 >= 21 && local415 <= 24 || local415 == 27 || local415 == 28) {
									local433 = 13369344;
									local415 -= 4;
								}
								if (local415 == 1) {
									Static76.method1365(local63, local128, local141, local433);
								} else if (local415 == 2) {
									Static76.method1357(local63, local128, local75, local433);
								} else if (local415 == 3) {
									Static76.method1365(local308, local128, local141, local433);
								} else if (local415 == 4) {
									Static76.method1357(local63, local440, local75, local433);
								} else if (local415 == 9) {
									Static76.method1365(local63, local128, local141, 16777215);
									Static76.method1357(local63, local128, local75, local433);
								} else if (local415 == 10) {
									Static76.method1365(local308, local128, local141, 16777215);
									Static76.method1357(local63, local128, local75, local433);
								} else if (local415 == 11) {
									Static76.method1365(local308, local128, local141, 16777215);
									Static76.method1357(local63, local440, local75, local433);
								} else if (local415 == 12) {
									Static76.method1365(local63, local128, local141, 16777215);
									Static76.method1357(local63, local440, local75, local433);
								} else if (local415 == 17) {
									Static76.method1357(local63, local128, 1, local433);
								} else if (local415 == 18) {
									Static76.method1357(local308, local128, 1, local433);
								} else if (local415 == 19) {
									Static76.method1357(local308, local440, 1, local433);
								} else if (local415 == 20) {
									Static76.method1357(local63, local440, 1, local433);
								} else {
									@Pc(586) int local586;
									if (local415 == 25) {
										for (local586 = 0; local586 < local141; local586++) {
											Static76.method1357(local63 + local586, local440 - local586, 1, local433);
										}
									} else if (local415 == 26) {
										for (local586 = 0; local586 < local141; local586++) {
											Static76.method1357(local63 + local586, local128 + local586, 1, local433);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local63 = 0; local63 < local9; local63++) {
			local75 = local23 * (local63 + 1) >> 16;
			local71 = local63 * local23 >> 16;
			local94 = local75 - local71;
			if (local94 > 0) {
				local71 += arg4;
				@Pc(737) byte[][] local737 = Static185.aByteArrayArrayArray10[local63 + arg7 >> 6];
				for (@Pc(739) int local739 = 0; local739 < local14; local739++) {
					@Pc(749) int local749 = local32 * (local739 + 1) >> 16;
					@Pc(755) int local755 = local32 * local739 >> 16;
					@Pc(760) int local760 = local749 - local755;
					if (local760 > 0) {
						local755 += arg1;
						local120 = ((arg5 + local739 & 0x3F) << 6) + (arg7 + local63 & 0x3F);
						@Pc(795) int local795 = local739 + arg5 >> 6;
						if (local737[local795] != null) {
							local128 = local737[local795][local120] & 0xFF;
							if (local128 != 0) {
								if (local128 == 47 || local128 == 53) {
									Static137.aClass73_Sub1Array3[local128 - 1].method2277(local71, local755, local94 * 2 + 1, local760 * 2 + 1);
								} else {
									Static137.aClass73_Sub1Array3[local128 - 1].method2277(local71 - local94 / 2, -(local760 / 2) + local755, local94 * 2, local760 * 2);
								}
							}
						}
					}
				}
			}
		}
	}
}
