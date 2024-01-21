import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "[[[Lclient!jc;")
	public static Class1_Sub17[][][] aClass1_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1361 = Static120.method2057("Invalid username or password)3");

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1362 = Static120.method2057(")3runescape)3com");

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1363 = aClass81_1361;

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1364 = Static120.method2057("scape main");

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1365 = Static120.method2057("Untersuchen");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method2968() {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(14) int local14;
		@Pc(32) int local32;
		if (Static92.anInt2058 == 25) {
			local14 = Static21.aClass1_Sub8_Sub1_1.method336();
			local22 = Static25.anInt646 + (local14 >> 4 & 0x7);
			local28 = Static53.anInt1292 + (local14 & 0x7);
			local32 = Static21.aClass1_Sub8_Sub1_1.method359();
			local36 = Static21.aClass1_Sub8_Sub1_1.method359();
			local40 = Static21.aClass1_Sub8_Sub1_1.method359();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(58) Class30 local58 = Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28];
				if (local58 != null) {
					for (@Pc(65) Class1_Sub2_Sub1_Sub1 local65 = (Class1_Sub2_Sub1_Sub1) local58.method1115(); local65 != null; local65 = (Class1_Sub2_Sub1_Sub1) local58.method1125()) {
						if (local65.anInt105 == (local32 & 0x7FFF) && local65.anInt106 == local36) {
							local65.anInt106 = local40;
							break;
						}
					}
					Static121.method2084(local22, local28);
				}
			}
		} else if (Static92.anInt2058 == 145) {
			local14 = Static21.aClass1_Sub8_Sub1_1.method359();
			local22 = Static21.aClass1_Sub8_Sub1_1.method320();
			local28 = Static21.aClass1_Sub8_Sub1_1.method338();
			local32 = Static21.aClass1_Sub8_Sub1_1.method353();
			local40 = Static53.anInt1292 + (local32 & 0x7);
			local36 = Static25.anInt646 + (local32 >> 4 & 0x7);
			if (local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104 && Static110.anInt2514 != local22) {
				@Pc(145) Class1_Sub2_Sub1_Sub1 local145 = new Class1_Sub2_Sub1_Sub1();
				local145.anInt106 = local14;
				local145.anInt105 = local28;
				if (Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local36][local40] == null) {
					Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local36][local40] = new Class30();
				}
				Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local36][local40].method1113(local145);
				Static121.method2084(local36, local40);
			}
		} else if (Static92.anInt2058 == 193) {
			local14 = Static21.aClass1_Sub8_Sub1_1.method336();
			local22 = (local14 >> 4 & 0x7) + Static25.anInt646;
			local28 = Static53.anInt1292 + (local14 & 0x7);
			local32 = Static21.aClass1_Sub8_Sub1_1.method359();
			local36 = Static21.aClass1_Sub8_Sub1_1.method336();
			local40 = Static21.aClass1_Sub8_Sub1_1.method359();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local28 = local28 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(258) Class1_Sub2_Sub1_Sub7 local258 = new Class1_Sub2_Sub1_Sub7(local32, Static44.anInt1086, local22, local28, Static102.method1694(local22, Static44.anInt1086, local28) - local36, local40, Static142.anInt3104);
				Static47.aClass30_8.method1113(local258);
			}
		} else {
			@Pc(306) int local306;
			@Pc(312) int local312;
			@Pc(318) int local318;
			@Pc(322) int local322;
			@Pc(330) int local330;
			@Pc(334) int local334;
			if (Static92.anInt2058 == 159) {
				local14 = Static21.aClass1_Sub8_Sub1_1.method336();
				local28 = (local14 & 0x7) + Static53.anInt1292;
				local22 = (local14 >> 4 & 0x7) + Static25.anInt646;
				local32 = local22 + Static21.aClass1_Sub8_Sub1_1.method339();
				local36 = Static21.aClass1_Sub8_Sub1_1.method339() + local28;
				local40 = Static21.aClass1_Sub8_Sub1_1.method332();
				local306 = Static21.aClass1_Sub8_Sub1_1.method359();
				local312 = Static21.aClass1_Sub8_Sub1_1.method336() * 4;
				local318 = Static21.aClass1_Sub8_Sub1_1.method336() * 4;
				local322 = Static21.aClass1_Sub8_Sub1_1.method359();
				local330 = Static21.aClass1_Sub8_Sub1_1.method359();
				local334 = Static21.aClass1_Sub8_Sub1_1.method336();
				@Pc(338) int local338 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local306 != 65535) {
					local32 = local32 * 128 + 64;
					local36 = local36 * 128 + 64;
					local22 = local22 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(418) Class1_Sub2_Sub1_Sub5 local418 = new Class1_Sub2_Sub1_Sub5(local306, Static44.anInt1086, local22, local28, Static102.method1694(local22, Static44.anInt1086, local28) - local312, Static142.anInt3104 + local322, local330 + Static142.anInt3104, local334, local338, local40, local318);
					local418.method1671(local32, local322 + Static142.anInt3104, Static102.method1694(local32, Static44.anInt1086, local36) + -local318, local36);
					Static6.aClass30_3.method1113(local418);
				}
			} else {
				if (Static92.anInt2058 == 200) {
					@Pc(448) byte local448 = Static21.aClass1_Sub8_Sub1_1.method322();
					local22 = Static21.aClass1_Sub8_Sub1_1.method359();
					local28 = Static21.aClass1_Sub8_Sub1_1.method359();
					@Pc(464) byte local464 = Static21.aClass1_Sub8_Sub1_1.method334();
					local36 = Static21.aClass1_Sub8_Sub1_1.method353();
					local306 = Static53.anInt1292 + (local36 & 0x7);
					local40 = Static25.anInt646 + (local36 >> 4 & 0x7);
					local312 = Static21.aClass1_Sub8_Sub1_1.method336();
					local322 = local312 & 0x3;
					local318 = local312 >> 2;
					local330 = Static19.anIntArray22[local318];
					local334 = Static21.aClass1_Sub8_Sub1_1.method338();
					@Pc(507) byte local507 = Static21.aClass1_Sub8_Sub1_1.method325();
					@Pc(511) int local511 = Static21.aClass1_Sub8_Sub1_1.method320();
					@Pc(515) byte local515 = Static21.aClass1_Sub8_Sub1_1.method339();
					@Pc(520) Class1_Sub2_Sub1_Sub3_Sub1 local520;
					if (local334 == Static110.anInt2514) {
						local520 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1;
					} else {
						local520 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local334];
					}
					if (local520 != null) {
						@Pc(532) Class1_Sub2_Sub8 local532 = Static14.method220(local28);
						@Pc(544) int local544;
						@Pc(541) int local541;
						if (local322 == 1 || local322 == 3) {
							local541 = local532.anInt1237;
							local544 = local532.anInt1277;
						} else {
							local541 = local532.anInt1277;
							local544 = local532.anInt1237;
						}
						@Pc(559) int local559 = local40 + (local544 >> 1);
						@Pc(568) int local568 = local40 + (local544 + 1 >> 1);
						@Pc(574) int local574 = (local541 >> 1) + local306;
						@Pc(582) int local582 = local306 + (local541 + 1 >> 1);
						@Pc(586) int[][] local586 = Static157.anIntArrayArrayArray7[Static44.anInt1086];
						@Pc(613) int local613 = local586[local559][local574] + local586[local568][local574] + local586[local559][local582] + local586[local568][local582] >> 2;
						@Pc(622) int local622 = (local40 << 7) + (local544 << 6);
						@Pc(630) int local630 = (local306 << 7) + (local541 << 6);
						@Pc(640) Class1_Sub2_Sub1_Sub4 local640 = local532.method942(local613, local318, local322, local630, local586, local622);
						if (local640 != null) {
							@Pc(651) byte local651;
							if (local507 > local448) {
								local651 = local507;
								local507 = local448;
								local448 = local651;
							}
							Static111.method1958(local22 + 1, local40, -1, local306, Static44.anInt1086, local511 + 1, local330, 0, 0);
							local520.anInt1536 = local507 + local40;
							local520.anInt1540 = local544 * 64 + local40 * 128;
							local520.anInt1523 = Static142.anInt3104 + local22;
							local520.anInt1534 = Static142.anInt3104 + local511;
							if (local464 < local515) {
								local651 = local515;
								local515 = local464;
								local464 = local651;
							}
							local520.anInt1524 = local515 + local306;
							local520.aClass1_Sub2_Sub1_Sub4_1 = local640;
							local520.anInt1535 = local448 + local40;
							local520.anInt1533 = local613;
							local520.anInt1522 = local306 * 128 + local541 * 64;
							local520.anInt1520 = local464 + local306;
						}
					}
				}
				if (Static92.anInt2058 == 175) {
					local14 = Static21.aClass1_Sub8_Sub1_1.method362();
					local22 = local14 >> 2;
					local28 = local14 & 0x3;
					local32 = Static19.anIntArray22[local22];
					local36 = Static21.aClass1_Sub8_Sub1_1.method353();
					local306 = (local36 & 0x7) + Static53.anInt1292;
					local40 = (local36 >> 4 & 0x7) + Static25.anInt646;
					if (local40 >= 0 && local306 >= 0 && local40 < 104 && local306 < 104) {
						Static111.method1958(0, local40, -1, local306, Static44.anInt1086, -1, local32, local22, local28);
					}
				} else {
					@Pc(848) Class1_Sub2_Sub1_Sub1 local848;
					if (Static92.anInt2058 == 209) {
						local14 = Static21.aClass1_Sub8_Sub1_1.method336();
						local22 = Static25.anInt646 + (local14 >> 4 & 0x7);
						local28 = Static53.anInt1292 + (local14 & 0x7);
						local32 = Static21.aClass1_Sub8_Sub1_1.method338();
						local36 = Static21.aClass1_Sub8_Sub1_1.method312();
						if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
							local848 = new Class1_Sub2_Sub1_Sub1();
							local848.anInt106 = local36;
							local848.anInt105 = local32;
							if (Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28] == null) {
								Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28] = new Class30();
							}
							Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28].method1113(local848);
							Static121.method2084(local22, local28);
						}
					} else if (Static92.anInt2058 == 87) {
						local14 = Static21.aClass1_Sub8_Sub1_1.method336();
						local22 = Static25.anInt646 + (local14 >> 4 & 0x7);
						local28 = (local14 & 0x7) + Static53.anInt1292;
						local32 = Static21.aClass1_Sub8_Sub1_1.method336();
						local36 = local32 >> 2;
						local40 = local32 & 0x3;
						local306 = Static19.anIntArray22[local36];
						local312 = Static21.aClass1_Sub8_Sub1_1.method312();
						if (local22 >= 0 && local28 >= 0 && local22 < 103 && local28 < 103) {
							if (local306 == 0) {
								@Pc(947) Class22 local947 = Static64.method1160(Static44.anInt1086, local22, local28);
								if (local947 != null) {
									local322 = Integer.MAX_VALUE & (int) (local947.aLong37 >>> 32);
									if (local36 == 2) {
										local947.aClass1_Sub2_Sub1_1 = new Class1_Sub2_Sub1_Sub2(local322, 2, local40 + 4, Static44.anInt1086, local22, local28, local312, false, local947.aClass1_Sub2_Sub1_1);
										local947.aClass1_Sub2_Sub1_2 = new Class1_Sub2_Sub1_Sub2(local322, 2, local40 + 1 & 0x3, Static44.anInt1086, local22, local28, local312, false, local947.aClass1_Sub2_Sub1_2);
									} else {
										local947.aClass1_Sub2_Sub1_1 = new Class1_Sub2_Sub1_Sub2(local322, local36, local40, Static44.anInt1086, local22, local28, local312, false, local947.aClass1_Sub2_Sub1_1);
									}
								}
							}
							if (local306 == 1) {
								@Pc(1021) Class62 local1021 = Static117.method3139(Static44.anInt1086, local22, local28);
								if (local1021 != null) {
									local322 = (int) (local1021.aLong94 >>> 32) & Integer.MAX_VALUE;
									if (local36 == 4 || local36 == 5) {
										local1021.aClass1_Sub2_Sub1_5 = new Class1_Sub2_Sub1_Sub2(local322, 4, local40, Static44.anInt1086, local22, local28, local312, false, local1021.aClass1_Sub2_Sub1_5);
									} else if (local36 == 6) {
										local1021.aClass1_Sub2_Sub1_5 = new Class1_Sub2_Sub1_Sub2(local322, 4, local40 + 4, Static44.anInt1086, local22, local28, local312, false, local1021.aClass1_Sub2_Sub1_5);
									} else if (local36 == 7) {
										local1021.aClass1_Sub2_Sub1_5 = new Class1_Sub2_Sub1_Sub2(local322, 4, (local40 + 2 & 0x3) + 4, Static44.anInt1086, local22, local28, local312, false, local1021.aClass1_Sub2_Sub1_5);
									} else if (local36 == 8) {
										local1021.aClass1_Sub2_Sub1_5 = new Class1_Sub2_Sub1_Sub2(local322, 4, local40 + 4, Static44.anInt1086, local22, local28, local312, false, local1021.aClass1_Sub2_Sub1_5);
										local1021.aClass1_Sub2_Sub1_6 = new Class1_Sub2_Sub1_Sub2(local322, 4, (local40 + 2 & 0x3) + 4, Static44.anInt1086, local22, local28, local312, false, local1021.aClass1_Sub2_Sub1_6);
									}
								}
							}
							if (local306 == 2) {
								@Pc(1153) Class75 local1153 = Static13.method211(Static44.anInt1086, local22, local28);
								if (local36 == 11) {
									local36 = 10;
								}
								if (local1153 != null) {
									local1153.aClass1_Sub2_Sub1_7 = new Class1_Sub2_Sub1_Sub2(Integer.MAX_VALUE & (int) (local1153.aLong118 >>> 32), local36, local40, Static44.anInt1086, local22, local28, local312, false, local1153.aClass1_Sub2_Sub1_7);
								}
							}
							if (local306 == 3) {
								@Pc(1191) Class42 local1191 = Static115.method2021(Static44.anInt1086, local22, local28);
								if (local1191 != null) {
									local1191.aClass1_Sub2_Sub1_3 = new Class1_Sub2_Sub1_Sub2((int) (local1191.aLong66 >>> 32) & Integer.MAX_VALUE, 22, local40, Static44.anInt1086, local22, local28, local312, false, local1191.aClass1_Sub2_Sub1_3);
								}
							}
						}
					} else {
						if (Static92.anInt2058 == 27) {
							local14 = Static21.aClass1_Sub8_Sub1_1.method336();
							local28 = Static53.anInt1292 + (local14 & 0x7);
							local22 = Static25.anInt646 + (local14 >> 4 & 0x7);
							local32 = Static21.aClass1_Sub8_Sub1_1.method359();
							if (local32 == 65535) {
								local32 = -1;
							}
							local36 = Static21.aClass1_Sub8_Sub1_1.method336();
							local306 = local36 & 0x7;
							local40 = local36 >> 4 & 0xF;
							local312 = Static21.aClass1_Sub8_Sub1_1.method336();
							if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
								local318 = local40 + 1;
								if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0] >= local22 - local318 && Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0] <= local22 + local318 && local28 - local318 <= Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0] && Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0] <= local28 + local318 && Static149.anInt3335 != 0 && local306 > 0 && Static81.anInt1859 < 50 && local32 != -1) {
									Static166.anIntArray399[Static81.anInt1859] = local32;
									Static116.anIntArray276[Static81.anInt1859] = local306;
									Static175.anIntArray308[Static81.anInt1859] = local312;
									Static157.aClass21Array1[Static81.anInt1859] = null;
									Static51.anIntArray103[Static81.anInt1859] = (local28 << 8) + (local22 << 16) + local40;
									Static81.anInt1859++;
								}
							}
						}
						if (Static92.anInt2058 == 212) {
							local14 = Static21.aClass1_Sub8_Sub1_1.method336();
							local22 = (local14 >> 4 & 0x7) + Static25.anInt646;
							local28 = Static53.anInt1292 + (local14 & 0x7);
							local32 = Static21.aClass1_Sub8_Sub1_1.method353();
							local36 = local32 >> 2;
							local306 = Static19.anIntArray22[local36];
							local40 = local32 & 0x3;
							local312 = Static21.aClass1_Sub8_Sub1_1.method338();
							if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
								Static111.method1958(0, local22, local312, local28, Static44.anInt1086, -1, local306, local36, local40);
							}
						} else if (Static92.anInt2058 == 203) {
							local14 = Static21.aClass1_Sub8_Sub1_1.method353();
							local22 = Static25.anInt646 + (local14 >> 4 & 0x7);
							local28 = Static53.anInt1292 + (local14 & 0x7);
							local32 = Static21.aClass1_Sub8_Sub1_1.method359();
							if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
								@Pc(1504) Class30 local1504 = Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28];
								if (local1504 != null) {
									for (local848 = (Class1_Sub2_Sub1_Sub1) local1504.method1115(); local848 != null; local848 = (Class1_Sub2_Sub1_Sub1) local1504.method1125()) {
										if (local848.anInt105 == (local32 & 0x7FFF)) {
											local848.method3134();
											break;
										}
									}
									if (local1504.method1115() == null) {
										Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local22][local28] = null;
									}
									Static121.method2084(local22, local28);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static144.method2427(arg1)) {
			Static48.method2783(arg6, arg0, arg3, Static131.aClass77ArrayArray1[arg1], arg2, arg4, arg5, -1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(II)Lclient!tc;")
	public static Class1_Sub2_Sub17 method2971(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub17 local10 = (Class1_Sub2_Sub17) Static174.aClass59_27.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static21.aClass82_10.method2942(arg0, 5);
		local10 = new Class1_Sub2_Sub17();
		if (local20 != null) {
			local10.method2723(new Class1_Sub8(local20));
		}
		Static174.aClass59_27.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(II)V")
	public static void method2977(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static144.method2427(arg0)) {
			return;
		}
		@Pc(19) Class77[] local19 = Static131.aClass77ArrayArray1[arg0];
		for (@Pc(29) int local29 = 0; local29 < local19.length; local29++) {
			@Pc(35) Class77 local35 = local19[local29];
			if (local35.anObjectArray27 != null) {
				@Pc(42) Class1_Sub3 local42 = new Class1_Sub3();
				local42.anObjectArray1 = local35.anObjectArray27;
				local42.aClass77_1 = local35;
				Static137.method2309(2000000, local42);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method2979() {
		Static115.aClass1_Sub10_Sub3_2.method1311();
		Static89.anInt4032 = 1;
		Static108.aClass82_40 = null;
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	public static void method2980() {
		aClass81_1365 = null;
		aClass81_1361 = null;
		aClass81_1363 = null;
		aClass81_1362 = null;
		aClass81_1364 = null;
		aClass1_Sub17ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tg;IIIZ)V")
	public static void method2981(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class77 local14 = Static166.method2908(arg3, arg1);
		if (local14 == null) {
			return;
		}
		if (local14.anObjectArray2 != null) {
			@Pc(24) Class1_Sub3 local24 = new Class1_Sub3();
			local24.anObjectArray1 = local14.anObjectArray2;
			local24.aClass81_50 = arg0;
			local24.anInt143 = arg2;
			local24.aClass77_1 = local14;
			Static49.method870(local24);
		}
		@Pc(42) boolean local42 = true;
		if (local14.anInt3249 > 0) {
			local42 = Static113.method2000(local14);
		}
		if (!local42 || !Static184.method3131(Static165.method2894(local14), arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static104.aClass1_Sub8_Sub1_2.method366(177);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 2) {
			Static104.aClass1_Sub8_Sub1_2.method366(87);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 3) {
			Static104.aClass1_Sub8_Sub1_2.method366(69);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 4) {
			Static104.aClass1_Sub8_Sub1_2.method366(147);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 5) {
			Static104.aClass1_Sub8_Sub1_2.method366(72);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 6) {
			Static104.aClass1_Sub8_Sub1_2.method366(115);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 7) {
			Static104.aClass1_Sub8_Sub1_2.method366(202);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 8) {
			Static104.aClass1_Sub8_Sub1_2.method366(116);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 9) {
			Static104.aClass1_Sub8_Sub1_2.method366(159);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
		if (arg2 == 10) {
			Static104.aClass1_Sub8_Sub1_2.method366(155);
			Static104.aClass1_Sub8_Sub1_2.method328(arg3);
			Static104.aClass1_Sub8_Sub1_2.method337(arg1);
		}
	}
}
