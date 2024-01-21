import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!re", name = "Vb", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_984 = null;

	@OriginalMember(owner = "client!re", name = "ob", descriptor = "[I")
	private static int[] anIntArray309 = new int[5];

	@OriginalMember(owner = "client!re", name = "rb", descriptor = "I")
	public static volatile int anInt2333 = 0;

	@OriginalMember(owner = "client!re", name = "ub", descriptor = "Lclient!pe;")
	private static Class65 aClass65_985 = Static119.method1462("Loading fonts )2 ");

	@OriginalMember(owner = "client!re", name = "zb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_986 = aClass65_985;

	@OriginalMember(owner = "client!re", name = "Ab", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!re", name = "Db", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!re", name = "Gb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_987 = Static119.method1462("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!re", name = "Lb", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!re", name = "Nb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_988 = Static119.method1462("(Y<)4col>");

	@OriginalMember(owner = "client!re", name = "Pb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_989 = Static119.method1462("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	public static void method1691(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static114.aClass2_Sub1_Sub4_Sub1_5.anIntArray54;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (103 - local29) * 512 * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static88.aByteArrayArrayArray3[arg0][local44][local29] & 0x18) == 0) {
					Static124.aClass49_1.method1194(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static88.aByteArrayArrayArray3[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static124.aClass49_1.method1194(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		Static114.aClass2_Sub1_Sub4_Sub1_5.method438();
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local42 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		@Pc(162) int local162;
		for (@Pc(158) int local158 = 1; local158 < 103; local158++) {
			for (local162 = 1; local162 < 103; local162++) {
				if ((Static88.aByteArrayArrayArray3[arg0][local162][local158] & 0x18) == 0) {
					Static1.method17(local158, local44, local162, arg0, local42);
				}
				if (arg0 < 3 && (Static88.aByteArrayArrayArray3[arg0 + 1][local162][local158] & 0x8) != 0) {
					Static1.method17(local158, local44, local162, arg0 + 1, local42);
				}
			}
		}
		Static6.anInt185 = 0;
		for (local162 = 0; local162 < 104; local162++) {
			for (@Pc(230) int local230 = 0; local230 < 104; local230++) {
				@Pc(238) int local238 = Static124.aClass49_1.method1170(Static59.anInt1479, local162, local230);
				if (local238 != 0) {
					local238 = local238 >> 14 & 0x7FFF;
					@Pc(251) int local251 = Static73.method1248(local238).anInt2688;
					if (local251 >= 0) {
						@Pc(258) int local258 = local162;
						@Pc(260) int local260 = local230;
						if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
							@Pc(294) int[][] local294 = Static90.aClass46Array1[Static59.anInt1479].anIntArrayArray13;
							for (@Pc(296) int local296 = 0; local296 < 10; local296++) {
								@Pc(303) int local303 = (int) (Math.random() * 4.0D);
								if (local303 == 0 && local258 > 0 && local162 - 3 < local258 && (local294[local258 - 1][local260] & 0x12C0108) == 0) {
									local258--;
								}
								if (local303 == 1 && local258 < 103 && local258 < local162 + 3 && (local294[local258 + 1][local260] & 0x12C0180) == 0) {
									local258++;
								}
								if (local303 == 2 && local260 > 0 && local260 > local230 - 3 && (local294[local258][local260 - 1] & 0x12C0102) == 0) {
									local260--;
								}
								if (local303 == 3 && local260 < 103 && local230 + 3 > local260 && (local294[local258][local260 + 1] & 0x12C0120) == 0) {
									local260++;
								}
							}
						}
						Static105.aClass2_Sub1_Sub4_Sub1Array10[Static6.anInt185] = Static108.aClass2_Sub1_Sub4_Sub1Array11[local251];
						Static121.anIntArray342[Static6.anInt185] = local258;
						Static3.anIntArray11[Static6.anInt185] = local260;
						Static6.anInt185++;
					}
				}
			}
		}
		Static59.aClass6_1.method1597();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B)Z")
	public static boolean method1692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class2_Sub4 local19 = new Class2_Sub4(arg2);
		label70: while (true) {
			@Pc(23) int local23 = local19.method938();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(62) int local62;
				@Pc(96) Class2_Sub1_Sub15 local96;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local19.method938();
										if (local39 == 0) {
											continue label70;
										}
										local19.method933();
									}
									local39 = local19.method938();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(56) int local56 = local31 >> 6 & 0x3F;
									local62 = local19.method933() >> 2;
									@Pc(66) int local66 = local31 & 0x3F;
									local70 = arg0 + local56;
									local74 = local66 + arg1;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= 103);
					} while (local74 >= 103);
					local96 = Static73.method1248(local14);
				} while (local62 == 22 && Static48.aBoolean47 && local96.anInt2662 == 0 && local96.anInt2695 != 1 && !local96.aBoolean108);
				if (!local96.method1914()) {
					local7 = false;
					Static102.anInt2297++;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	public static void method1696() {
		if (Static117.anInt2578 > 0) {
			Static117.anInt2578--;
		}
		if (Static93.anInt2077 > 1) {
			Static93.anInt2077--;
		}
		if (Static129.aBoolean116) {
			Static129.aBoolean116 = false;
			Static13.method1865();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static126.method1930(); local27++) {
		}
		if (Static129.anInt2753 != 30) {
			return;
		}
		Static106.method1721(Static49.aClass2_Sub4_Sub1_1);
		@Pc(51) Object local51 = Static17.aClass33_1.anObject19;
		@Pc(81) int local81;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(96) int local96;
		@Pc(115) int local115;
		synchronized (Static17.aClass33_1.anObject19) {
			if (!Static123.aBoolean106) {
				Static17.aClass33_1.anInt845 = 0;
			} else if (Static17.anInt390 != 0 || Static17.aClass33_1.anInt845 >= 40) {
				Static49.aClass2_Sub4_Sub1_1.method962(91);
				local74 = 0;
				Static49.aClass2_Sub4_Sub1_1.method926(0);
				local81 = Static49.aClass2_Sub4_Sub1_1.anInt1298;
				for (local83 = 0; local83 < Static17.aClass33_1.anInt845 && Static49.aClass2_Sub4_Sub1_1.anInt1298 - local81 < 240; local83++) {
					local96 = Static17.aClass33_1.anIntArray101[local83];
					local74++;
					if (local96 < 0) {
						local96 = 0;
					} else if (local96 > 502) {
						local96 = 502;
					}
					local115 = Static17.aClass33_1.anIntArray102[local83];
					if (local115 < 0) {
						local115 = 0;
					} else if (local115 > 764) {
						local115 = 764;
					}
					@Pc(135) int local135 = local96 * 765 + local115;
					if (Static17.aClass33_1.anIntArray101[local83] == -1 && Static17.aClass33_1.anIntArray102[local83] == -1) {
						local96 = -1;
						local115 = -1;
						local135 = 524287;
					}
					if (Static7.anInt207 != local115 || Static38.anInt834 != local96) {
						@Pc(181) int local181 = local115 - Static7.anInt207;
						Static7.anInt207 = local115;
						@Pc(188) int local188 = local96 - Static38.anInt834;
						Static38.anInt834 = local96;
						if (anInt2340 < 8 && local181 >= -32 && local181 <= 31 && local188 >= -32 && local188 <= 31) {
							local181 += 32;
							local188 += 32;
							Static49.aClass2_Sub4_Sub1_1.method925(local188 + (anInt2340 << 12) + (local181 << 6));
							anInt2340 = 0;
						} else if (anInt2340 < 8) {
							Static49.aClass2_Sub4_Sub1_1.method941(local135 + (anInt2340 << 19) + 8388608);
							anInt2340 = 0;
						} else {
							Static49.aClass2_Sub4_Sub1_1.method914((anInt2340 << 19) + local135 - 1073741824);
							anInt2340 = 0;
						}
					} else if (anInt2340 < 2047) {
						anInt2340++;
					}
				}
				Static49.aClass2_Sub4_Sub1_1.method945(Static49.aClass2_Sub4_Sub1_1.anInt1298 - local81);
				if (Static17.aClass33_1.anInt845 > local74) {
					Static17.aClass33_1.anInt845 -= local74;
					for (local96 = 0; local96 < Static17.aClass33_1.anInt845; local96++) {
						Static17.aClass33_1.anIntArray102[local96] = Static17.aClass33_1.anIntArray102[local96 + local74];
						Static17.aClass33_1.anIntArray101[local96] = Static17.aClass33_1.anIntArray101[local96 + local74];
					}
				} else {
					Static17.aClass33_1.anInt845 = 0;
				}
			}
		}
		if (Static17.anInt390 != 0) {
			@Pc(349) long local349 = (Static121.aLong88 - Static43.aLong33) / 50L;
			if (local349 > 4095L) {
				local349 = 4095L;
			}
			local81 = Static100.anInt2282;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 502) {
				local81 = 502;
			}
			Static43.aLong33 = Static121.aLong88;
			@Pc(375) byte local375 = 0;
			if (Static17.anInt390 == 2) {
				local375 = 1;
			}
			local74 = Static96.anInt2190;
			Static49.aClass2_Sub4_Sub1_1.method962(64);
			local115 = (int) local349;
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 764) {
				local74 = 764;
			}
			local83 = local81 * 765 + local74;
			Static49.aClass2_Sub4_Sub1_1.method901((local375 << 19) + ((local115 << 20) + local83));
		}
		if (Static35.aBooleanArray6[96] || Static35.aBooleanArray6[97] || Static35.aBooleanArray6[98] || Static35.aBooleanArray6[99]) {
			Static2.aBoolean4 = true;
		}
		if (Static96.anInt2192 > 0) {
			Static96.anInt2192--;
		}
		if (Static2.aBoolean4 && Static96.anInt2192 <= 0) {
			Static2.aBoolean4 = false;
			Static96.anInt2192 = 20;
			Static49.aClass2_Sub4_Sub1_1.method962(154);
			Static49.aClass2_Sub4_Sub1_1.method925(Static44.anInt1082);
			Static49.aClass2_Sub4_Sub1_1.method925(Static82.anInt2719);
		}
		if (Static73.aBoolean61 && !Static79.aBoolean65) {
			Static79.aBoolean65 = true;
			Static49.aClass2_Sub4_Sub1_1.method962(137);
			Static49.aClass2_Sub4_Sub1_1.method926(1);
		}
		if (!Static73.aBoolean61 && Static79.aBoolean65) {
			Static79.aBoolean65 = false;
			Static49.aClass2_Sub4_Sub1_1.method962(137);
			Static49.aClass2_Sub4_Sub1_1.method926(0);
		}
		Static28.method579();
		if (Static129.anInt2753 != 30) {
			return;
		}
		Static59.method1094();
		Static69.method1226();
		Static76.anInt1698++;
		if (Static76.anInt1698 > 750) {
			Static13.method1865();
			return;
		}
		Static77.method1290();
		Static42.method738();
		Static130.method1982();
		Static117.anInt2579++;
		if (Static14.anInt351 != 0) {
			Static14.anInt355 += 20;
			if (Static14.anInt355 >= 400) {
				Static14.anInt351 = 0;
			}
		}
		if (Static28.aClass2_Sub22_3 != null) {
			Static11.anInt1293++;
			if (Static11.anInt1293 >= 15) {
				Static116.method1853(Static28.aClass2_Sub22_3);
				Static28.aClass2_Sub22_3 = null;
			}
		}
		@Pc(652) Class2_Sub22 local652;
		if (Static95.aClass2_Sub22_11 != null) {
			Static116.method1853(Static95.aClass2_Sub22_11);
			if (Static66.anInt1586 > Static111.anInt2491 + 5 || Static66.anInt1586 < Static111.anInt2491 - 5 || Static39.anInt837 > Static46.anInt1109 + 5 || Static46.anInt1109 - 5 > Static39.anInt837) {
				Static123.aBoolean107 = true;
			}
			Static21.anInt523++;
			if (Static17.anInt380 == 0) {
				if (Static123.aBoolean107 && Static21.anInt523 >= 5) {
					if (Static102.aClass2_Sub22_13 == Static95.aClass2_Sub22_11 && Static72.anInt1649 != Static76.anInt1704) {
						local652 = Static95.aClass2_Sub22_11;
						@Pc(654) byte local654 = 0;
						if (Static101.anInt2290 == 1 && local652.anInt2801 == 206) {
							local654 = 1;
						}
						if (local652.anIntArray374[Static76.anInt1704] <= 0) {
							local654 = 0;
						}
						if (Static62.method1121(Static114.method1834(local652))) {
							local74 = Static76.anInt1704;
							local81 = Static72.anInt1649;
							local652.anIntArray374[local74] = local652.anIntArray374[local81];
							local652.anIntArray370[local74] = local652.anIntArray370[local81];
							local652.anIntArray374[local81] = -1;
							local652.anIntArray370[local81] = 0;
						} else if (local654 == 1) {
							local81 = Static72.anInt1649;
							local74 = Static76.anInt1704;
							while (local81 != local74) {
								if (local81 > local74) {
									local652.method1969(local81, local81 - 1);
									local81--;
								} else if (local81 < local74) {
									local652.method1969(local81, local81 + 1);
									local81++;
								}
							}
						} else {
							local652.method1969(Static72.anInt1649, Static76.anInt1704);
						}
						Static49.aClass2_Sub4_Sub1_1.method962(143);
						Static49.aClass2_Sub4_Sub1_1.method929(local654);
						Static49.aClass2_Sub4_Sub1_1.method937(Static72.anInt1649);
						Static49.aClass2_Sub4_Sub1_1.method920(Static76.anInt1704);
						Static49.aClass2_Sub4_Sub1_1.method909(Static95.aClass2_Sub22_11.anInt2835);
					}
				} else if ((Static107.anInt2410 == 1 || Static20.method343(Static49.anInt1205 - 1)) && Static49.anInt1205 > 2) {
					Static33.method631();
				} else if (Static49.anInt1205 > 0) {
					Static76.method1279(Static49.anInt1205 - 1);
				}
				Static17.anInt390 = 0;
				Static95.aClass2_Sub22_11 = null;
				Static11.anInt1293 = 10;
			}
		}
		Static66.aBoolean57 = false;
		Static61.anInt1501 = 0;
		local652 = Static4.aClass2_Sub22_5;
		Static94.aBoolean85 = false;
		@Pc(831) Class2_Sub22 local831 = Static117.aClass2_Sub22_15;
		Static17.aClass2_Sub22_2 = null;
		Static4.aClass2_Sub22_5 = null;
		Static117.aClass2_Sub22_15 = null;
		while (Static115.method1838() && Static61.anInt1501 < 128) {
			Static114.anIntArray334[Static61.anInt1501] = Static70.anInt1633;
			Static111.anIntArray331[Static61.anInt1501] = Static94.anInt2129;
			Static61.anInt1501++;
		}
		Static75.method1671(0, 503, Static17.anInt384, 0, 0, 765, 0);
		Static8.anInt228++;
		while (true) {
			@Pc(875) Class2_Sub9 local875;
			@Pc(888) Class2_Sub22 local888;
			@Pc(880) Class2_Sub22 local880;
			do {
				local875 = (Class2_Sub9) Static32.aClass13_7.method267();
				if (local875 == null) {
					while (true) {
						do {
							local875 = (Class2_Sub9) Static54.aClass13_8.method267();
							if (local875 == null) {
								while (true) {
									do {
										local875 = (Class2_Sub9) Static97.aClass13_13.method267();
										if (local875 == null) {
											if (Static52.aClass2_Sub22_6 != null) {
												Static124.method1894();
											}
											if (Static65.anInt1551 != -1) {
												local81 = Static65.anInt1551;
												local74 = Static65.anInt1545;
												@Pc(1045) boolean local1045 = Static70.method1234(local74, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local81, true);
												if (local1045) {
													Static14.anInt351 = 1;
													Static14.anInt355 = 0;
													Static49.anInt1206 = Static96.anInt2190;
													Static97.anInt2215 = Static100.anInt2282;
												}
												Static65.anInt1551 = -1;
											}
											Static54.method959();
											if (Static4.aClass2_Sub22_5 != local652) {
												if (local652 != null) {
													Static116.method1853(local652);
												}
												if (Static4.aClass2_Sub22_5 != null) {
													Static116.method1853(Static4.aClass2_Sub22_5);
												}
											}
											if (local831 != Static117.aClass2_Sub22_15 && Static89.anInt1978 == Static113.anInt2529) {
												if (local831 != null) {
													Static116.method1853(local831);
												}
												if (Static117.aClass2_Sub22_15 != null) {
													Static116.method1853(Static117.aClass2_Sub22_15);
												}
											}
											if (Static117.aClass2_Sub22_15 == null) {
												if (Static113.anInt2529 > 0) {
													Static113.anInt2529--;
												}
											} else if (Static89.anInt1978 > Static113.anInt2529) {
												Static113.anInt2529++;
												if (Static89.anInt1978 == Static113.anInt2529) {
													Static116.method1853(Static117.aClass2_Sub22_15);
												}
											}
											Static108.method1748();
											if (Static38.aBoolean36) {
												Static59.method1096();
											}
											for (local81 = 0; local81 < 5; local81++) {
												@Pc(1132) int local1132 = Static28.anIntArray75[local81]++;
											}
											local74 = Static112.method1821();
											local83 = Static127.method1941();
											if (local74 > 4500 && local83 > 4500) {
												Static117.anInt2578 = 250;
												Static102.method1664(4000);
												Static49.aClass2_Sub4_Sub1_1.method962(167);
											}
											Static112.anInt2518++;
											Static26.anInt629++;
											if (Static26.anInt629 > 500) {
												Static26.anInt629 = 0;
												local96 = (int) (Math.random() * 8.0D);
												if ((local96 & 0x1) == 1) {
													Static84.anInt1812 += Static79.anInt1736;
												}
												if ((local96 & 0x4) == 4) {
													Static13.anInt2586 += Static13.anInt2585;
												}
												if ((local96 & 0x2) == 2) {
													Static4.anInt1236 += Static58.anInt1458;
												}
											}
											Static111.anInt2492++;
											if (Static13.anInt2586 < -40) {
												Static13.anInt2585 = 1;
											}
											if (Static84.anInt1812 < -50) {
												Static79.anInt1736 = 2;
											}
											if (Static84.anInt1812 > 50) {
												Static79.anInt1736 = -2;
											}
											if (Static4.anInt1236 < -55) {
												Static58.anInt1458 = 2;
											}
											if (Static112.anInt2518 > 500) {
												Static112.anInt2518 = 0;
												local96 = (int) (Math.random() * 8.0D);
												if ((local96 & 0x1) == 1) {
													Static117.anInt2576 += Static59.anInt1484;
												}
												if ((local96 & 0x2) == 2) {
													Static54.anInt1338 += Static4.anInt1241;
												}
											}
											if (Static4.anInt1236 > 55) {
												Static58.anInt1458 = -2;
											}
											if (Static117.anInt2576 < -60) {
												Static59.anInt1484 = 2;
											}
											if (Static54.anInt1338 < -20) {
												Static4.anInt1241 = 1;
											}
											if (Static54.anInt1338 > 10) {
												Static4.anInt1241 = -1;
											}
											if (Static13.anInt2586 > 40) {
												Static13.anInt2585 = -1;
											}
											if (Static117.anInt2576 > 60) {
												Static59.anInt1484 = -2;
											}
											if (Static111.anInt2492 > 50) {
												Static49.aClass2_Sub4_Sub1_1.method962(7);
											}
											try {
												if (Static129.aClass7_6 != null && Static49.aClass2_Sub4_Sub1_1.anInt1298 > 0) {
													Static129.aClass7_6.method161(Static49.aClass2_Sub4_Sub1_1.aByteArray20, Static49.aClass2_Sub4_Sub1_1.anInt1298);
													Static49.aClass2_Sub4_Sub1_1.anInt1298 = 0;
													Static111.anInt2492 = 0;
													return;
												}
												return;
											} catch (@Pc(1343) IOException local1343) {
												Static13.method1865();
												return;
											}
										}
										local880 = local875.aClass2_Sub22_7;
										if (local880.anInt2814 < 0) {
											break;
										}
										local888 = Static35.method645(local880.anInt2800);
									} while (local888 == null || local888.aClass2_Sub22Array2 == null || local880.anInt2814 >= local888.aClass2_Sub22Array2.length || local880 != local888.aClass2_Sub22Array2[local880.anInt2814]);
									method1703(local875);
								}
							}
							local880 = local875.aClass2_Sub22_7;
							if (local880.anInt2814 < 0) {
								break;
							}
							local888 = Static35.method645(local880.anInt2800);
						} while (local888 == null || local888.aClass2_Sub22Array2 == null || local880.anInt2814 >= local888.aClass2_Sub22Array2.length || local880 != local888.aClass2_Sub22Array2[local880.anInt2814]);
						method1703(local875);
					}
				}
				local880 = local875.aClass2_Sub22_7;
				if (local880.anInt2814 < 0) {
					break;
				}
				local888 = Static35.method645(local880.anInt2800);
			} while (local888 == null || local888.aClass2_Sub22Array2 == null || local888.aClass2_Sub22Array2.length <= local880.anInt2814 || local880 != local888.aClass2_Sub22Array2[local880.anInt2814]);
			method1703(local875);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
	public static void method1697() {
		aClass65_987 = null;
		aClass65_988 = null;
		anIntArray309 = null;
		aClass65_985 = null;
		aClass65_984 = null;
		aClass65_986 = null;
		aClass65_989 = null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ILclient!pe;)Z")
	private static boolean method1700(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static49.anInt1201; local11++) {
			if (arg0.method1488(Static120.aClass65Array69[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public static void method1701() {
		Static49.aClass2_Sub4_Sub1_1.method962(146);
		for (@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) Static112.aClass40_21.method854(); local18 != null; local18 = (Class2_Sub7) Static112.aClass40_21.method852()) {
			if (local18.anInt1526 == 0 || local18.anInt1526 == 3) {
				Static13.method1866(true, local18);
			}
		}
		if (Static101.aClass2_Sub22_12 != null) {
			Static116.method1853(Static101.aClass2_Sub22_12);
			Static101.aClass2_Sub22_12 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!nc;B)V")
	public static void method1703(@OriginalArg(0) Class2_Sub9 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray2;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub1_Sub17 local18 = Static49.method845(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = -1;
		Static95.anInt2164 = 0;
		@Pc(30) int[] local30 = local18.anIntArray411;
		@Pc(32) byte local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(41) int[] local41 = local18.anIntArray410;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static128.anIntArray358 = new int[local18.anInt2892];
			@Pc(47) int local47 = 0;
			Static19.aClass65Array9 = new Class65[local18.anInt2894];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt1723;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt1718;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass2_Sub22_7 == null ? -1 : arg0.aClass2_Sub22_7.anInt2835;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt1717;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass2_Sub22_7 == null ? -1 : arg0.aClass2_Sub22_7.anInt2814;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass2_Sub22_8 == null ? -1 : arg0.aClass2_Sub22_8.anInt2835;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass2_Sub22_8 == null ? -1 : arg0.aClass2_Sub22_8.anInt2814;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt1721;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt1726;
					}
					Static128.anIntArray358[local53++] = local93;
				} else if (local8[local55] instanceof Class65) {
					@Pc(72) Class65 local72 = (Class65) local8[local55];
					if (local72.method1512(Static49.aClass65_535)) {
						local72 = arg0.aClass65_744;
					}
					Static19.aClass65Array9[local47++] = local72;
				}
			}
			local93 = 0;
			label1974: while (true) {
				local93++;
				if (local93 > 200000) {
					throw new RuntimeException("slow");
				}
				local25++;
				@Pc(213) int local213 = local30[local25];
				@Pc(648) int local648;
				@Pc(773) int local773;
				@Pc(623) int local623;
				@Pc(768) int local768;
				@Pc(583) Class65 local583;
				if (local213 < 100) {
					if (local213 == 0) {
						Static11.anIntArray164[local34++] = local41[local25];
						continue;
					}
					@Pc(239) int local239;
					if (local213 == 1) {
						local239 = local41[local25];
						Static11.anIntArray164[local34++] = Static129.anIntArray363[local239];
						continue;
					}
					if (local213 == 2) {
						local239 = local41[local25];
						local34--;
						Static129.anIntArray363[local239] = Static11.anIntArray164[local34];
						continue;
					}
					if (local213 == 3) {
						Static86.aClass65Array43[local23++] = local18.aClass65Array82[local25];
						continue;
					}
					if (local213 == 6) {
						local25 += local41[local25];
						continue;
					}
					if (local213 == 7) {
						local34 -= 2;
						if (Static11.anIntArray164[local34 + 1] != Static11.anIntArray164[local34]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 8) {
						local34 -= 2;
						if (Static11.anIntArray164[local34] == Static11.anIntArray164[local34 + 1]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 9) {
						local34 -= 2;
						if (Static11.anIntArray164[local34 + 1] > Static11.anIntArray164[local34]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 10) {
						local34 -= 2;
						if (Static11.anIntArray164[local34 + 1] < Static11.anIntArray164[local34]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 21) {
						if (Static95.anInt2164 == 0) {
							return;
						}
						@Pc(404) Class82 local404 = Static8.aClass82Array1[--Static95.anInt2164];
						Static128.anIntArray358 = local404.anIntArray356;
						Static19.aClass65Array9 = local404.aClass65Array75;
						local18 = local404.aClass2_Sub1_Sub17_1;
						local30 = local18.anIntArray411;
						local41 = local18.anIntArray410;
						local25 = local404.anInt2725;
						continue;
					}
					if (local213 == 25) {
						local239 = local41[local25];
						Static11.anIntArray164[local34++] = Static100.method1644(local239);
						continue;
					}
					if (local213 == 27) {
						local239 = local41[local25];
						local34--;
						Static79.method1300(Static11.anIntArray164[local34], local239);
						continue;
					}
					if (local213 == 31) {
						local34 -= 2;
						if (Static11.anIntArray164[local34] <= Static11.anIntArray164[local34 + 1]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 32) {
						local34 -= 2;
						if (Static11.anIntArray164[local34 + 1] <= Static11.anIntArray164[local34]) {
							local25 += local41[local25];
						}
						continue;
					}
					if (local213 == 33) {
						Static11.anIntArray164[local34++] = Static128.anIntArray358[local41[local25]];
						continue;
					}
					@Pc(529) int local529;
					if (local213 == 34) {
						local529 = local41[local25];
						local34--;
						Static128.anIntArray358[local529] = Static11.anIntArray164[local34];
						continue;
					}
					if (local213 == 35) {
						Static86.aClass65Array43[local23++] = Static19.aClass65Array9[local41[local25]];
						continue;
					}
					if (local213 == 36) {
						local529 = local41[local25];
						local23--;
						Static19.aClass65Array9[local529] = Static86.aClass65Array43[local23];
						continue;
					}
					if (local213 == 37) {
						local239 = local41[local25];
						local23 -= local239;
						local583 = Static125.method1913(Static86.aClass65Array43, local23, local239);
						Static86.aClass65Array43[local23++] = local583;
						continue;
					}
					if (local213 == 38) {
						local34--;
						continue;
					}
					if (local213 == 39) {
						local23--;
						continue;
					}
					if (local213 == 40) {
						local239 = local41[local25];
						@Pc(613) Class2_Sub1_Sub17 local613 = Static49.method845(local239);
						@Pc(617) Class65[] local617 = new Class65[local613.anInt2894];
						@Pc(621) int[] local621 = new int[local613.anInt2892];
						for (local623 = 0; local623 < local613.anInt2890; local623++) {
							local621[local623] = Static11.anIntArray164[local623 + local34 - local613.anInt2890];
						}
						for (local648 = 0; local648 < local613.anInt2893; local648++) {
							local617[local648] = Static86.aClass65Array43[local648 + local23 - local613.anInt2893];
						}
						local34 -= local613.anInt2890;
						local23 -= local613.anInt2893;
						@Pc(685) Class82 local685 = new Class82();
						local685.aClass65Array75 = Static19.aClass65Array9;
						local685.anIntArray356 = Static128.anIntArray358;
						local685.aClass2_Sub1_Sub17_1 = local18;
						local18 = local613;
						local685.anInt2725 = local25;
						local25 = -1;
						Static8.aClass82Array1[Static95.anInt2164++] = local685;
						Static19.aClass65Array9 = local617;
						Static128.anIntArray358 = local621;
						local41 = local613.anIntArray410;
						local30 = local613.anIntArray411;
						continue;
					}
					if (local213 == 42) {
						Static11.anIntArray164[local34++] = Static120.anIntArray341[local41[local25]];
						continue;
					}
					if (local213 == 43) {
						local529 = local41[local25];
						local34--;
						Static120.anIntArray341[local529] = Static11.anIntArray164[local34];
						continue;
					}
					if (local213 == 44) {
						local239 = local41[local25] >> 16;
						local768 = local41[local25] & 0xFFFF;
						local34--;
						local773 = Static11.anIntArray164[local34];
						if (local773 >= 0 && local773 <= 5000) {
							anIntArray309[local239] = local773;
							@Pc(790) byte local790 = -1;
							if (local768 == 105) {
								local790 = 0;
							}
							local623 = 0;
							while (true) {
								if (local623 >= local773) {
									continue label1974;
								}
								Static83.anIntArrayArray18[local239][local623] = local790;
								local623++;
							}
						}
						throw new RuntimeException();
					}
					if (local213 == 45) {
						local239 = local41[local25];
						local34--;
						local768 = Static11.anIntArray164[local34];
						if (local768 >= 0 && local768 < anIntArray309[local239]) {
							Static11.anIntArray164[local34++] = Static83.anIntArrayArray18[local239][local768];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 46) {
						local34 -= 2;
						local239 = local41[local25];
						local768 = Static11.anIntArray164[local34];
						if (local768 >= 0 && anIntArray309[local239] > local768) {
							Static83.anIntArrayArray18[local239][local768] = Static11.anIntArray164[local34 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 47) {
						@Pc(899) Class65 local899 = Static10.aClass65Array85[local41[local25]];
						if (local899 == null) {
							local899 = Static44.aClass65_490;
						}
						Static86.aClass65Array43[local23++] = local899;
						continue;
					}
					if (local213 == 48) {
						local529 = local41[local25];
						local23--;
						Static10.aClass65Array85[local529] = Static86.aClass65Array43[local23];
						continue;
					}
				}
				@Pc(931) boolean local931;
				if (local41[local25] == 1) {
					local931 = true;
				} else {
					local931 = false;
				}
				@Pc(975) Class2_Sub22 local975;
				@Pc(4147) int local4147;
				@Pc(1579) int local1579;
				@Pc(5904) Class2_Sub22 local5904;
				@Pc(5922) Class2_Sub22 local5922;
				if (local213 < 1000) {
					if (local213 == 100) {
						local34 -= 3;
						local1579 = Static11.anIntArray164[local34 + 2];
						local768 = Static11.anIntArray164[local34];
						local773 = Static11.anIntArray164[local34 + 1];
						if (local773 == 0) {
							throw new RuntimeException();
						}
						local5904 = Static35.method645(local768);
						if (local5904.aClass2_Sub22Array2 == null) {
							local5904.aClass2_Sub22Array2 = new Class2_Sub22[local1579 + 1];
						}
						if (local1579 >= local5904.aClass2_Sub22Array2.length) {
							@Pc(6872) Class2_Sub22[] local6872 = new Class2_Sub22[local1579 + 1];
							for (local4147 = 0; local4147 < local5904.aClass2_Sub22Array2.length; local4147++) {
								local6872[local4147] = local5904.aClass2_Sub22Array2[local4147];
							}
							local5904.aClass2_Sub22Array2 = local6872;
						}
						if (local1579 > 0 && local5904.aClass2_Sub22Array2[local1579 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1579 - 1));
						}
						@Pc(6918) Class2_Sub22 local6918 = new Class2_Sub22();
						local6918.anInt2814 = local1579;
						local6918.aBoolean124 = true;
						local6918.anInt2800 = local6918.anInt2835 = local5904.anInt2835;
						local6918.anInt2813 = local773;
						local5904.aClass2_Sub22Array2[local1579] = local6918;
						if (local931) {
							Static113.aClass2_Sub22_14 = local6918;
						} else {
							Static82.aClass2_Sub22_16 = local6918;
						}
						Static116.method1853(local5904);
						continue;
					}
					if (local213 == 101) {
						local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
						@Pc(6966) Class2_Sub22 local6966 = Static35.method645(local975.anInt2835);
						local6966.aClass2_Sub22Array2[local975.anInt2814] = null;
						Static116.method1853(local6966);
						continue;
					}
					if (local213 == 102) {
						local34--;
						local975 = Static35.method645(Static11.anIntArray164[local34]);
						local975.aClass2_Sub22Array2 = null;
						Static116.method1853(local975);
						continue;
					}
					if (local213 == 200) {
						local34 -= 2;
						local768 = Static11.anIntArray164[local34];
						local773 = Static11.anIntArray164[local34 + 1];
						local5922 = Static84.method1365(local768, local773);
						if (local5922 != null && local773 != -1) {
							Static11.anIntArray164[local34++] = 1;
							if (local931) {
								Static113.aClass2_Sub22_14 = local5922;
							} else {
								Static82.aClass2_Sub22_16 = local5922;
							}
							continue;
						}
						Static11.anIntArray164[local34++] = 0;
						continue;
					}
				} else if (local213 >= 1000 && local213 < 1100 || local213 >= 2000 && local213 < 2100) {
					if (local213 < 2000) {
						local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
					} else {
						local213 -= 1000;
						local34--;
						local975 = Static35.method645(Static11.anIntArray164[local34]);
					}
					if (local213 == 1000) {
						local34 -= 2;
						local975.anInt2766 = Static11.anIntArray164[local34];
						local975.anInt2770 = Static11.anIntArray164[local34 + 1];
						Static116.method1853(local975);
						continue;
					}
					if (local213 == 1001) {
						local34 -= 2;
						local975.anInt2787 = Static11.anIntArray164[local34];
						local975.anInt2765 = Static11.anIntArray164[local34 + 1];
						Static116.method1853(local975);
						continue;
					}
					if (local213 == 1003) {
						local34--;
						@Pc(6802) boolean local6802 = Static11.anIntArray164[local34] == 1;
						if (local6802 != local975.aBoolean128) {
							local975.aBoolean128 = local6802;
							Static116.method1853(local975);
						}
						continue;
					}
				} else {
					@Pc(1306) Class65 local1306;
					if (local213 >= 1100 && local213 < 1200 || !(local213 < 2100 || local213 >= 2200)) {
						if (local213 >= 2000) {
							local213 -= 1000;
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
						} else {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
						}
						if (local213 == 1100) {
							local34 -= 2;
							local975.anInt2817 = Static11.anIntArray164[local34];
							if (local975.anInt2817 > local975.anInt2789 - local975.anInt2787) {
								local975.anInt2817 = local975.anInt2789 - local975.anInt2787;
							}
							if (local975.anInt2817 < 0) {
								local975.anInt2817 = 0;
							}
							local975.anInt2781 = Static11.anIntArray164[local34 + 1];
							if (local975.anInt2781 > local975.anInt2785 - local975.anInt2765) {
								local975.anInt2781 = local975.anInt2785 - local975.anInt2765;
							}
							if (local975.anInt2781 < 0) {
								local975.anInt2781 = 0;
							}
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1101) {
							local34--;
							local975.anInt2793 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1102) {
							local34--;
							local975.aBoolean118 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1103) {
							local34--;
							local975.anInt2804 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1104) {
							local34--;
							local975.anInt2834 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1105) {
							local34--;
							local975.anInt2786 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1106) {
							local34--;
							local975.anInt2818 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1107) {
							local34--;
							local975.aBoolean121 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1108) {
							local975.anInt2790 = 1;
							local34--;
							local975.anInt2831 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1109) {
							local34 -= 6;
							local975.anInt2806 = Static11.anIntArray164[local34];
							local975.anInt2821 = Static11.anIntArray164[local34 + 1];
							local975.anInt2829 = Static11.anIntArray164[local34 + 2];
							local975.anInt2812 = Static11.anIntArray164[local34 + 3];
							local975.anInt2809 = Static11.anIntArray164[local34 + 4];
							local975.anInt2826 = Static11.anIntArray164[local34 + 5];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1110) {
							local34--;
							local773 = Static11.anIntArray164[local34];
							if (local773 != local975.anInt2815) {
								local975.anInt2830 = 0;
								local975.anInt2815 = local773;
								local975.anInt2771 = 0;
								Static116.method1853(local975);
							}
							continue;
						}
						if (local213 == 1111) {
							local34--;
							local975.aBoolean117 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1112) {
							local23--;
							local1306 = Static86.aClass65Array43[local23];
							if (!local1306.method1512(local975.aClass65_1225)) {
								local975.aClass65_1225 = local1306;
								Static116.method1853(local975);
							}
							continue;
						}
						if (local213 == 1113) {
							local34--;
							local975.anInt2828 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1114) {
							local34 -= 3;
							local975.anInt2799 = Static11.anIntArray164[local34];
							local975.anInt2798 = Static11.anIntArray164[local34 + 1];
							local975.anInt2775 = Static11.anIntArray164[local34 + 2];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1115) {
							local34--;
							local975.aBoolean120 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1116) {
							local34--;
							local975.anInt2836 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1117) {
							local34--;
							local975.anInt2832 = Static11.anIntArray164[local34];
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1118) {
							local34--;
							local975.aBoolean127 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1119) {
							local34--;
							local975.aBoolean126 = Static11.anIntArray164[local34] == 1;
							Static116.method1853(local975);
							continue;
						}
						if (local213 == 1120) {
							local34 -= 2;
							local975.anInt2789 = Static11.anIntArray164[local34];
							local975.anInt2785 = Static11.anIntArray164[local34 + 1];
							Static116.method1853(local975);
							continue;
						}
					} else if (local213 >= 1200 && local213 < 1300 || local213 >= 2200 && local213 < 2300) {
						if (local213 < 2000) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
						} else {
							local213 -= 1000;
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
						}
						Static116.method1853(local975);
						if (local213 == 1200) {
							local34 -= 2;
							local773 = Static11.anIntArray164[local34];
							local1579 = Static11.anIntArray164[local34 + 1];
							local975.anInt2811 = local1579;
							local975.anInt2768 = local773;
							@Pc(6656) Class2_Sub1_Sub11 local6656 = Static4.method872(local773);
							local975.anInt2829 = local6656.anInt2069;
							local975.anInt2821 = local6656.anInt2061;
							local975.anInt2826 = local6656.anInt2076;
							local975.anInt2809 = local6656.anInt2060;
							if (local975.anInt2787 > 0) {
								local975.anInt2826 = local975.anInt2826 * 32 / local975.anInt2787;
							}
							local975.anInt2806 = local6656.anInt2068;
							local975.anInt2812 = local6656.anInt2080;
							continue;
						}
						if (local213 == 1201) {
							local975.anInt2790 = 2;
							local34--;
							local975.anInt2831 = Static11.anIntArray164[local34];
							continue;
						}
						if (local213 == 1202) {
							local975.anInt2790 = 3;
							local975.anInt2831 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2.method250();
							continue;
						}
					} else if (local213 >= 1300 && local213 < 1400 || local213 >= 2300 && local213 < 2400) {
						if (local213 < 2000) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
						} else {
							local213 -= 1000;
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
						}
						if (local213 == 1300) {
							local34--;
							local773 = Static11.anIntArray164[local34] - 1;
							if (local773 >= 0 && local773 <= 9) {
								local23--;
								local975.method1973(local773, Static86.aClass65Array43[local23]);
								continue;
							}
							local23--;
							continue;
						}
						if (local213 == 1301) {
							local34 -= 2;
							local773 = Static11.anIntArray164[local34];
							local1579 = Static11.anIntArray164[local34 + 1];
							local975.aClass2_Sub22_18 = Static84.method1365(local773, local1579);
							continue;
						}
						if (local213 == 1302) {
							local34--;
							local975.aBoolean119 = Static11.anIntArray164[local34] == 1;
							continue;
						}
						if (local213 == 1303) {
							local34--;
							local975.anInt2772 = Static11.anIntArray164[local34];
							continue;
						}
						if (local213 == 1304) {
							local34--;
							local975.anInt2827 = Static11.anIntArray164[local34];
							continue;
						}
						if (local213 == 1305) {
							local23--;
							local975.aClass65_1226 = Static86.aClass65Array43[local23];
							continue;
						}
						if (local213 == 1306) {
							local23--;
							local975.aClass65_1222 = Static86.aClass65Array43[local23];
							continue;
						}
						if (local213 == 1307) {
							local975.aClass65Array79 = null;
							continue;
						}
					} else {
						if (local213 >= 1400 && local213 < 1500 || local213 >= 2400 && local213 < 2500) {
							if (local213 >= 2000) {
								local213 -= 1000;
								local34--;
								local975 = Static35.method645(Static11.anIntArray164[local34]);
							} else {
								local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
							}
							local23--;
							local1306 = Static86.aClass65Array43[local23];
							@Pc(6303) int[] local6303 = null;
							if (local1306.method1502() > 0 && local1306.method1510(local1306.method1502() - 1) == 89) {
								local34--;
								local623 = Static11.anIntArray164[local34];
								if (local623 > 0) {
									local6303 = new int[local623];
									while (local623-- > 0) {
										local34--;
										local6303[local623] = Static11.anIntArray164[local34];
									}
								}
								local1306 = local1306.method1476(local1306.method1502() - 1, 0);
							}
							@Pc(6367) Object[] local6367 = new Object[local1306.method1502() + 1];
							for (local648 = local6367.length - 1; local648 >= 1; local648--) {
								if (local1306.method1510(local648 - 1) == 115) {
									local23--;
									local6367[local648] = Static86.aClass65Array43[local23];
								} else {
									local34--;
									local6367[local648] = Integer.valueOf(Static11.anIntArray164[local34]);
								}
							}
							local34--;
							local4147 = Static11.anIntArray164[local34];
							if (local4147 == -1) {
								local6367 = null;
							} else {
								local6367[0] = Integer.valueOf(local4147);
							}
							if (local213 == 1407) {
								local975.anObjectArray14 = local6367;
								local975.anIntArray368 = local6303;
							}
							if (local213 == 1412) {
								local975.anObjectArray15 = local6367;
							}
							if (local213 == 1421) {
								local975.anObjectArray9 = local6367;
							}
							if (local213 == 1415) {
								local975.anIntArray369 = local6303;
								local975.anObjectArray12 = local6367;
							}
							if (local213 == 1418) {
								local975.anObjectArray5 = local6367;
							}
							if (local213 == 1401) {
								local975.anObjectArray6 = local6367;
							}
							if (local213 == 1424) {
								local975.anObjectArray19 = local6367;
							}
							if (local213 == 1419) {
								local975.anObjectArray27 = local6367;
							}
							if (local213 == 1406) {
								local975.anObjectArray24 = local6367;
							}
							if (local213 == 1422) {
								local975.anObjectArray28 = local6367;
							}
							if (local213 == 1404) {
								local975.anObjectArray8 = local6367;
							}
							if (local213 == 1423) {
								local975.anObjectArray11 = local6367;
							}
							if (local213 == 1416) {
								local975.anObjectArray26 = local6367;
							}
							if (local213 == 1417) {
								local975.anObjectArray7 = local6367;
							}
							if (local213 == 1409) {
								local975.anObjectArray22 = local6367;
							}
							if (local213 == 1403) {
								local975.anObjectArray21 = local6367;
							}
							local975.aBoolean123 = true;
							if (local213 == 1405) {
								local975.anObjectArray20 = local6367;
							}
							if (local213 == 1402) {
								local975.anObjectArray25 = local6367;
							}
							if (local213 == 1420) {
								local975.anObjectArray10 = local6367;
							}
							if (local213 == 1408) {
								local975.anObjectArray13 = local6367;
							}
							if (local213 == 1400) {
								local975.anObjectArray18 = local6367;
							}
							if (local213 == 1411) {
								local975.anObjectArray4 = local6367;
							}
							if (local213 == 1410) {
								local975.anObjectArray23 = local6367;
							}
							if (local213 == 1414) {
								local975.anIntArray366 = local6303;
								local975.anObjectArray17 = local6367;
							}
							continue;
						}
						if (local213 < 1600) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
							if (local213 == 1500) {
								Static11.anIntArray164[local34++] = local975.anInt2766;
								continue;
							}
							if (local213 == 1501) {
								Static11.anIntArray164[local34++] = local975.anInt2770;
								continue;
							}
							if (local213 == 1502) {
								Static11.anIntArray164[local34++] = local975.anInt2787;
								continue;
							}
							if (local213 == 1503) {
								Static11.anIntArray164[local34++] = local975.anInt2765;
								continue;
							}
							if (local213 == 1504) {
								Static11.anIntArray164[local34++] = local975.aBoolean128 ? 1 : 0;
								continue;
							}
							if (local213 == 1505) {
								Static11.anIntArray164[local34++] = local975.anInt2800;
								continue;
							}
						} else if (local213 < 1700) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
							if (local213 == 1600) {
								Static11.anIntArray164[local34++] = local975.anInt2817;
								continue;
							}
							if (local213 == 1601) {
								Static11.anIntArray164[local34++] = local975.anInt2781;
								continue;
							}
							if (local213 == 1602) {
								Static86.aClass65Array43[local23++] = local975.aClass65_1225;
								continue;
							}
							if (local213 == 1603) {
								Static11.anIntArray164[local34++] = local975.anInt2789;
								continue;
							}
							if (local213 == 1604) {
								Static11.anIntArray164[local34++] = local975.anInt2785;
								continue;
							}
							if (local213 == 1605) {
								Static11.anIntArray164[local34++] = local975.anInt2826;
								continue;
							}
							if (local213 == 1606) {
								Static11.anIntArray164[local34++] = local975.anInt2829;
								continue;
							}
							if (local213 == 1607) {
								Static11.anIntArray164[local34++] = local975.anInt2809;
								continue;
							}
							if (local213 == 1608) {
								Static11.anIntArray164[local34++] = local975.anInt2812;
								continue;
							}
						} else if (local213 < 1800) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
							if (local213 == 1700) {
								Static11.anIntArray164[local34++] = local975.anInt2768;
								continue;
							}
							if (local213 == 1701) {
								if (local975.anInt2768 == -1) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = local975.anInt2811;
								}
								continue;
							}
							if (local213 == 1702) {
								Static11.anIntArray164[local34++] = local975.anInt2814;
								continue;
							}
						} else if (local213 < 1900) {
							local975 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
							if (local213 == 1800) {
								Static11.anIntArray164[local34++] = Static83.method1356(Static114.method1834(local975));
								continue;
							}
							if (local213 == 1801) {
								local34--;
								local773 = Static11.anIntArray164[local34];
								local773--;
								if (local975.aClass65Array79 != null && local773 < local975.aClass65Array79.length && local975.aClass65Array79[local773] != null) {
									Static86.aClass65Array43[local23++] = local975.aClass65Array79[local773];
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 1802) {
								if (local975.aClass65_1226 == null) {
									Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								} else {
									Static86.aClass65Array43[local23++] = local975.aClass65_1226;
								}
								continue;
							}
						} else if (local213 < 2600) {
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
							if (local213 == 2500) {
								Static11.anIntArray164[local34++] = local975.anInt2766;
								continue;
							}
							if (local213 == 2501) {
								Static11.anIntArray164[local34++] = local975.anInt2770;
								continue;
							}
							if (local213 == 2502) {
								Static11.anIntArray164[local34++] = local975.anInt2787;
								continue;
							}
							if (local213 == 2503) {
								Static11.anIntArray164[local34++] = local975.anInt2765;
								continue;
							}
							if (local213 == 2504) {
								Static11.anIntArray164[local34++] = local975.aBoolean128 ? 1 : 0;
								continue;
							}
							if (local213 == 2505) {
								Static11.anIntArray164[local34++] = local975.anInt2800;
								continue;
							}
						} else if (local213 < 2700) {
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
							if (local213 == 2600) {
								Static11.anIntArray164[local34++] = local975.anInt2817;
								continue;
							}
							if (local213 == 2601) {
								Static11.anIntArray164[local34++] = local975.anInt2781;
								continue;
							}
							if (local213 == 2602) {
								Static86.aClass65Array43[local23++] = local975.aClass65_1225;
								continue;
							}
							if (local213 == 2603) {
								Static11.anIntArray164[local34++] = local975.anInt2789;
								continue;
							}
							if (local213 == 2604) {
								Static11.anIntArray164[local34++] = local975.anInt2785;
								continue;
							}
							if (local213 == 2605) {
								Static11.anIntArray164[local34++] = local975.anInt2826;
								continue;
							}
							if (local213 == 2606) {
								Static11.anIntArray164[local34++] = local975.anInt2829;
								continue;
							}
							if (local213 == 2607) {
								Static11.anIntArray164[local34++] = local975.anInt2809;
								continue;
							}
							if (local213 == 2608) {
								Static11.anIntArray164[local34++] = local975.anInt2812;
								continue;
							}
						} else if (local213 < 2800) {
							if (local213 == 2700) {
								local34--;
								local975 = Static35.method645(Static11.anIntArray164[local34]);
								Static11.anIntArray164[local34++] = local975.anInt2768;
								continue;
							}
							if (local213 == 2701) {
								local34--;
								local975 = Static35.method645(Static11.anIntArray164[local34]);
								if (local975.anInt2768 == -1) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = local975.anInt2811;
								}
								continue;
							}
							if (local213 == 2702) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								@Pc(1961) Class2_Sub7 local1961 = (Class2_Sub7) Static112.aClass40_21.method851((long) local768);
								if (local1961 == null) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = 1;
								}
								continue;
							}
						} else if (local213 < 2900) {
							local34--;
							local975 = Static35.method645(Static11.anIntArray164[local34]);
							if (local213 == 2800) {
								Static11.anIntArray164[local34++] = Static83.method1356(Static114.method1834(local975));
								continue;
							}
							if (local213 == 2801) {
								local34--;
								local773 = Static11.anIntArray164[local34];
								local773--;
								if (local975.aClass65Array79 != null && local975.aClass65Array79.length > local773 && local975.aClass65Array79[local773] != null) {
									Static86.aClass65Array43[local23++] = local975.aClass65Array79[local773];
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 2802) {
								if (local975.aClass65_1226 == null) {
									Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								} else {
									Static86.aClass65Array43[local23++] = local975.aClass65_1226;
								}
								continue;
							}
						} else if (local213 < 3200) {
							if (local213 == 3100) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static59.method1098(0, Static79.aClass65_751, local583);
								continue;
							}
							if (local213 == 3101) {
								local34 -= 2;
								Static21.method353(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1, Static11.anIntArray164[local34], Static11.anIntArray164[local34 + 1]);
								continue;
							}
							if (local213 == 3103) {
								method1701();
								continue;
							}
							if (local213 == 3104) {
								local773 = 0;
								local23--;
								local583 = Static86.aClass65Array43[local23];
								if (local583.method1479()) {
									local773 = local583.method1497();
								}
								Static49.aClass2_Sub4_Sub1_1.method962(89);
								Static49.aClass2_Sub4_Sub1_1.method914(local773);
								continue;
							}
							if (local213 == 3105) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static49.aClass2_Sub4_Sub1_1.method962(39);
								Static49.aClass2_Sub4_Sub1_1.method948(local583.method1493());
								continue;
							}
							if (local213 == 3106) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static49.aClass2_Sub4_Sub1_1.method962(40);
								Static49.aClass2_Sub4_Sub1_1.method926(local583.method1502() + 1);
								Static49.aClass2_Sub4_Sub1_1.method943(local583);
								continue;
							}
							if (local213 == 3107) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								local23--;
								local1306 = Static86.aClass65Array43[local23];
								Static79.method1299(local1306, local768);
								continue;
							}
							if (local213 == 3108) {
								local34 -= 3;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								local1579 = Static11.anIntArray164[local34 + 2];
								local5904 = Static35.method645(local1579);
								Static34.method637(local768, local5904, local773);
								continue;
							}
							if (local213 == 3109) {
								local5922 = local931 ? Static113.aClass2_Sub22_14 : Static82.aClass2_Sub22_16;
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static34.method637(local768, local5922, local773);
								continue;
							}
						} else if (local213 < 3300) {
							if (local213 == 3200) {
								local34 -= 3;
								Static49.method847(Static11.anIntArray164[local34 + 2], Static11.anIntArray164[local34 + 1], Static11.anIntArray164[local34]);
								continue;
							}
							if (local213 == 3201) {
								local34--;
								Static43.method742(Static11.anIntArray164[local34]);
								continue;
							}
							if (local213 == 3202) {
								local34 -= 2;
								Static94.method1559(Static11.anIntArray164[local34], Static11.anIntArray164[local34 + 1]);
								continue;
							}
						} else if (local213 < 3400) {
							if (local213 == 3300) {
								Static11.anIntArray164[local34++] = Static10.anInt2951;
								continue;
							}
							if (local213 == 3301) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static10.method2056(local773, local768);
								continue;
							}
							if (local213 == 3302) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static113.method1826(local773, local768);
								continue;
							}
							if (local213 == 3303) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = Static110.method1791(local768, local773);
								continue;
							}
							if (local213 == 3304) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static100.method1648(local768).anInt1086;
								continue;
							}
							if (local213 == 3305) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static60.anIntArray39[local768];
								continue;
							}
							if (local213 == 3306) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static12.anIntArray33[local768];
								continue;
							}
							if (local213 == 3307) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static76.anIntArray222[local768];
								continue;
							}
							if (local213 == 3308) {
								local768 = Static59.anInt1479;
								local773 = Static34.anInt791 + (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7);
								local1579 = Static66.anInt1577 + (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7);
								Static11.anIntArray164[local34++] = (local773 << 14) + (local768 << 28) + local1579;
								continue;
							}
							if (local213 == 3309) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 >> 14 & 0x3FFF;
								continue;
							}
							if (local213 == 3310) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 >> 28;
								continue;
							}
							if (local213 == 3311) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 & 0x3FFF;
								continue;
							}
							if (local213 == 3312) {
								Static11.anIntArray164[local34++] = Static49.aBoolean48 ? 1 : 0;
								continue;
							}
							if (local213 == 3313) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34] + 32768;
								Static11.anIntArray164[local34++] = Static10.method2056(local773, local768);
								continue;
							}
							if (local213 == 3314) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34] + 32768;
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = Static113.method1826(local773, local768);
								continue;
							}
							if (local213 == 3315) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34] + 32768;
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = Static110.method1791(local768, local773);
								continue;
							}
							if (local213 == 3316) {
								if (Static4.anInt1223 >= 2) {
									Static11.anIntArray164[local34++] = Static4.anInt1223;
								} else {
									Static11.anIntArray164[local34++] = 0;
								}
								continue;
							}
							if (local213 == 3317) {
								Static11.anIntArray164[local34++] = Static93.anInt2077;
								continue;
							}
							if (local213 == 3318) {
								Static11.anIntArray164[local34++] = Static17.anInt386;
								continue;
							}
							if (local213 == 3321) {
								Static11.anIntArray164[local34++] = Static84.anInt1817;
								continue;
							}
							if (local213 == 3322) {
								Static11.anIntArray164[local34++] = Static100.anInt2280;
								continue;
							}
							if (local213 == 3323) {
								if (Static4.anInt1223 == 1) {
									Static11.anIntArray164[local34++] = 1;
								} else {
									Static11.anIntArray164[local34++] = 0;
								}
								continue;
							}
						} else if (local213 < 3500) {
							if (local213 == 3400) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								@Pc(5139) Class2_Sub1_Sub14 local5139 = Static23.method1315(local768);
								for (local623 = 0; local623 < local5139.anInt2565; local623++) {
									if (local773 == local5139.anIntArray338[local623]) {
										Static86.aClass65Array43[local23++] = local5139.aClass65Array68[local623];
										local5139 = null;
										break;
									}
								}
								if (local5139 != null) {
									Static86.aClass65Array43[local23++] = local5139.aClass65_1104;
								}
								continue;
							}
							if (local213 == 3408) {
								local34 -= 4;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								local1579 = Static11.anIntArray164[local34 + 2];
								local623 = Static11.anIntArray164[local34 + 3];
								@Pc(5209) Class2_Sub1_Sub14 local5209 = Static23.method1315(local1579);
								if (local5209.anInt2563 == local768 && local773 == local5209.anInt2571) {
									for (local4147 = 0; local4147 < local5209.anInt2565; local4147++) {
										if (local623 == local5209.anIntArray338[local4147]) {
											if (local773 == 115) {
												Static86.aClass65Array43[local23++] = local5209.aClass65Array68[local4147];
											} else {
												Static11.anIntArray164[local34++] = local5209.anIntArray339[local4147];
											}
											local5209 = null;
											break;
										}
									}
									if (local5209 != null) {
										if (local773 == 115) {
											Static86.aClass65Array43[local23++] = local5209.aClass65_1104;
										} else {
											Static11.anIntArray164[local34++] = local5209.anInt2568;
										}
									}
									continue;
								}
								if (local773 == 115) {
									Static86.aClass65Array43[local23++] = Static44.aClass65_490;
								} else {
									Static11.anIntArray164[local34++] = 0;
								}
								continue;
							}
						} else if (local213 < 3700) {
							if (local213 == 3600) {
								if (Static79.anInt1739 == 0) {
									Static11.anIntArray164[local34++] = -2;
								} else if (Static79.anInt1739 == 1) {
									Static11.anIntArray164[local34++] = -1;
								} else {
									Static11.anIntArray164[local34++] = Static91.anInt2030;
								}
								continue;
							}
							if (local213 == 3601) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static79.anInt1739 == 2 && Static91.anInt2030 > local768) {
									Static86.aClass65Array43[local23++] = Static88.aClass65Array45[local768];
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 3602) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static79.anInt1739 == 2 && local768 < Static91.anInt2030) {
									Static11.anIntArray164[local34++] = Static61.anIntArray178[local768];
									continue;
								}
								Static11.anIntArray164[local34++] = 0;
								continue;
							}
							if (local213 == 3603) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static79.anInt1739 == 2 && local768 < Static91.anInt2030) {
									Static11.anIntArray164[local34++] = Static11.anIntArray163[local768];
									continue;
								}
								Static11.anIntArray164[local34++] = 0;
								continue;
							}
							if (local213 == 3604) {
								local34--;
								local773 = Static11.anIntArray164[local34];
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static110.method1793(local773, local583);
								continue;
							}
							if (local213 == 3605) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static114.method1835(local583.method1493());
								continue;
							}
							if (local213 == 3606) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static4.method856(local583.method1493());
								continue;
							}
							if (local213 == 3607) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static45.method767(local583.method1493());
								continue;
							}
							if (local213 == 3608) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static53.method883(local583.method1493());
								continue;
							}
							if (local213 == 3609) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								if (local583.method1490(Static45.aClass65_497) || local583.method1490(Static117.aClass65_1118)) {
									local583 = local583.method1501(7);
								}
								Static11.anIntArray164[local34++] = Static32.method622(local583) ? 1 : 0;
								continue;
							}
							if (local213 == 3611) {
								if (Static111.aClass65_1056 == null) {
									Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								} else {
									Static86.aClass65Array43[local23++] = Static111.aClass65_1056.method1506();
								}
								continue;
							}
							if (local213 == 3612) {
								if (Static111.aClass65_1056 == null) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = Static57.anInt1440;
								}
								continue;
							}
							if (local213 == 3613) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static111.aClass65_1056 != null && Static57.anInt1440 > local768) {
									Static86.aClass65Array43[local23++] = Static73.aClass2_Sub16Array1[local768].aClass65_1018.method1506();
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 3614) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static111.aClass65_1056 != null && local768 < Static57.anInt1440) {
									Static11.anIntArray164[local34++] = Static73.aClass2_Sub16Array1[local768].anInt2423;
									continue;
								}
								Static11.anIntArray164[local34++] = 0;
								continue;
							}
							if (local213 == 3615) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static111.aClass65_1056 != null && Static57.anInt1440 > local768) {
									Static11.anIntArray164[local34++] = Static73.aClass2_Sub16Array1[local768].aByte4;
									continue;
								}
								Static11.anIntArray164[local34++] = 0;
								continue;
							}
							if (local213 == 3616) {
								Static11.anIntArray164[local34++] = Static128.aByte6;
								continue;
							}
							if (local213 == 3617) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static59.method1097(local583);
								continue;
							}
							if (local213 == 3618) {
								Static11.anIntArray164[local34++] = Static3.aByte1;
								continue;
							}
							if (local213 == 3619) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static130.method1981(local583.method1493());
								continue;
							}
							if (local213 == 3620) {
								Static33.method632();
								continue;
							}
							if (local213 == 3621) {
								if (Static79.anInt1739 == 0) {
									Static11.anIntArray164[local34++] = -1;
								} else {
									Static11.anIntArray164[local34++] = Static49.anInt1201;
								}
								continue;
							}
							if (local213 == 3622) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static79.anInt1739 != 0 && local768 < Static49.anInt1201) {
									Static86.aClass65Array43[local23++] = Static57.method1080(Static30.aLongArray1[local768]).method1506();
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 3623) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								if (local583.method1490(Static45.aClass65_497) || local583.method1490(Static117.aClass65_1118)) {
									local583 = local583.method1501(7);
								}
								Static11.anIntArray164[local34++] = method1700(local583) ? 1 : 0;
								continue;
							}
							if (local213 == 3624) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (Static73.aClass2_Sub16Array1 != null && Static57.anInt1440 > local768 && Static73.aClass2_Sub16Array1[local768].aClass65_1018.method1488(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass65_457)) {
									Static11.anIntArray164[local34++] = 1;
									continue;
								}
								Static11.anIntArray164[local34++] = 0;
								continue;
							}
							if (local213 == 3625) {
								if (Static125.aClass65_1168 == null) {
									Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								} else {
									Static86.aClass65Array43[local23++] = Static125.aClass65_1168.method1506();
								}
								continue;
							}
						} else if (local213 < 4100) {
							if (local213 == 4000) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 + local773;
								continue;
							}
							if (local213 == 4001) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = local768 - local773;
								continue;
							}
							if (local213 == 4002) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = local768 * local773;
								continue;
							}
							if (local213 == 4003) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = local768 / local773;
								continue;
							}
							if (local213 == 4004) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = (int) (Math.random() * (double) local768);
								continue;
							}
							if (local213 == 4005) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = (int) ((double) (local768 + 1) * Math.random());
								continue;
							}
							if (local213 == 4006) {
								local34 -= 5;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								local623 = Static11.anIntArray164[local34 + 3];
								local1579 = Static11.anIntArray164[local34 + 2];
								local648 = Static11.anIntArray164[local34 + 4];
								Static11.anIntArray164[local34++] = local768 + (local773 - local768) * (local648 - local1579) / (local623 - local1579);
								continue;
							}
							if (local213 == 4007) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local773 * local768 / 100 + local768;
								continue;
							}
							if (local213 == 4008) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = 0x1 << local773 | local768;
								continue;
							}
							if (local213 == 4009) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = -(0x1 << local773) - 1 & local768;
								continue;
							}
							if (local213 == 4010) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = (0x1 << local773 & local768) == 0 ? 0 : 1;
								continue;
							}
							if (local213 == 4011) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								Static11.anIntArray164[local34++] = local768 % local773;
								continue;
							}
							if (local213 == 4012) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								if (local768 == 0) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = (int) Math.pow((double) local768, (double) local773);
								}
								continue;
							}
							if (local213 == 4013) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								if (local768 == 0) {
									Static11.anIntArray164[local34++] = 0;
								} else if (local773 == 0) {
									Static11.anIntArray164[local34++] = Integer.MAX_VALUE;
								} else {
									Static11.anIntArray164[local34++] = (int) Math.pow((double) local768, 1.0D / (double) local773);
								}
								continue;
							}
							if (local213 == 4014) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 & local773;
								continue;
							}
							if (local213 == 4015) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local768 | local773;
								continue;
							}
						} else if (local213 < 4200) {
							if (local213 == 4100) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local34--;
								local773 = Static11.anIntArray164[local34];
								Static86.aClass65Array43[local23++] = Static35.method647(new Class65[] { local583, Static120.method1871(local773) });
								continue;
							}
							if (local213 == 4101) {
								local23 -= 2;
								local1306 = Static86.aClass65Array43[local23 + 1];
								local583 = Static86.aClass65Array43[local23];
								Static86.aClass65Array43[local23++] = Static35.method647(new Class65[] { local583, local1306 });
								continue;
							}
							if (local213 == 4102) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local34--;
								local773 = Static11.anIntArray164[local34];
								Static86.aClass65Array43[local23++] = Static35.method647(new Class65[] { local583, Static82.method1932(local773) });
								continue;
							}
							if (local213 == 4103) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static86.aClass65Array43[local23++] = local583.method1486();
								continue;
							}
							if (local213 == 4104) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								@Pc(4129) long local4129 = (long) local768 * 86400000L + 1014768000000L;
								Static86.aCalendar1.setTime(new Date(local4129));
								local623 = Static86.aCalendar1.get(5);
								local648 = Static86.aCalendar1.get(2);
								local4147 = Static86.aCalendar1.get(1);
								Static86.aClass65Array43[local23++] = Static35.method647(new Class65[] { Static120.method1871(local623), Static75.aClass65_982, Static28.aClass65Array17[local648], Static75.aClass65_982, Static120.method1871(local4147) });
								continue;
							}
							if (local213 == 4105) {
								local23 -= 2;
								local1306 = Static86.aClass65Array43[local23 + 1];
								local583 = Static86.aClass65Array43[local23];
								if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2 != null && Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2.aBoolean13) {
									Static86.aClass65Array43[local23++] = local1306;
									continue;
								}
								Static86.aClass65Array43[local23++] = local583;
								continue;
							}
							if (local213 == 4106) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static86.aClass65Array43[local23++] = Static120.method1871(local768);
								continue;
							}
							if (local213 == 4107) {
								local23 -= 2;
								Static11.anIntArray164[local34++] = Static86.aClass65Array43[local23].method1505(Static86.aClass65Array43[local23 + 1]);
								continue;
							}
							@Pc(4291) Class2_Sub1_Sub4_Sub3_Sub1 local4291;
							@Pc(4286) byte[] local4286;
							if (local213 == 4108) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local34 -= 2;
								local773 = Static11.anIntArray164[local34];
								local1579 = Static11.anIntArray164[local34 + 1];
								local4286 = Static86.aClass56_Sub1_18.method1666(0, local1579);
								local4291 = new Class2_Sub1_Sub4_Sub3_Sub1(local4286);
								Static11.anIntArray164[local34++] = local4291.method2096(local583, local773);
								continue;
							}
							if (local213 == 4109) {
								local34 -= 2;
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local773 = Static11.anIntArray164[local34];
								local1579 = Static11.anIntArray164[local34 + 1];
								local4286 = Static86.aClass56_Sub1_18.method1666(0, local1579);
								local4291 = new Class2_Sub1_Sub4_Sub3_Sub1(local4286);
								Static11.anIntArray164[local34++] = local4291.method2082(local583, local773);
								continue;
							}
							if (local213 == 4110) {
								local23 -= 2;
								local583 = Static86.aClass65Array43[local23];
								local1306 = Static86.aClass65Array43[local23 + 1];
								local34--;
								if (Static11.anIntArray164[local34] == 1) {
									Static86.aClass65Array43[local23++] = local583;
								} else {
									Static86.aClass65Array43[local23++] = local1306;
								}
								continue;
							}
							if (local213 == 4111) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static86.aClass65Array43[local23++] = Static55.method2091(local583);
								continue;
							}
							if (local213 == 4112) {
								local34--;
								local773 = Static11.anIntArray164[local34];
								local23--;
								local583 = Static86.aClass65Array43[local23];
								Static86.aClass65Array43[local23++] = local583.method1475(local773);
								continue;
							}
							if (local213 == 4113) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static61.method1103(local768) ? 1 : 0;
								continue;
							}
							if (local213 == 4114) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static95.method1570(local768) ? 1 : 0;
								continue;
							}
							if (local213 == 4115) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static13.method1864(local768) ? 1 : 0;
								continue;
							}
							if (local213 == 4116) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static43.method741(local768) ? 1 : 0;
								continue;
							}
							if (local213 == 4117) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								if (local583 == null) {
									Static11.anIntArray164[local34++] = 0;
								} else {
									Static11.anIntArray164[local34++] = local583.method1502();
								}
								continue;
							}
							if (local213 == 4118) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34];
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local1579 = Static11.anIntArray164[local34 + 1];
								Static86.aClass65Array43[local23++] = local583.method1476(local1579, local773);
								continue;
							}
							if (local213 == 4119) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local1306 = Static133.method2042(local583.method1502());
								@Pc(4580) boolean local4580 = false;
								for (local623 = 0; local583.method1502() > local623; local623++) {
									local648 = local583.method1510(local623);
									if (local648 == 60) {
										local4580 = true;
									} else if (local648 == 62) {
										local4580 = false;
									} else if (!local4580) {
										local1306.method1492(local648);
									}
								}
								local1306.method1485();
								Static86.aClass65Array43[local23++] = local1306;
								continue;
							}
							if (local213 == 4120) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local34--;
								local773 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = local583.method1483(local773);
								continue;
							}
						} else if (local213 < 4300) {
							if (local213 == 4200) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static86.aClass65Array43[local23++] = Static4.method872(local768).aClass65_870;
								continue;
							}
							@Pc(2810) Class2_Sub1_Sub11 local2810;
							if (local213 == 4201) {
								local34 -= 2;
								local768 = Static11.anIntArray164[local34];
								local773 = Static11.anIntArray164[local34 + 1];
								local2810 = Static4.method872(local768);
								if (local773 >= 1 && local773 <= 5 && local2810.aClass65Array48[local773 - 1] != null) {
									Static86.aClass65Array43[local23++] = local2810.aClass65Array48[local773 - 1];
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 4202) {
								local34 -= 2;
								local773 = Static11.anIntArray164[local34 + 1];
								local768 = Static11.anIntArray164[local34];
								local2810 = Static4.method872(local768);
								if (local773 >= 1 && local773 <= 5 && local2810.aClass65Array49[local773 - 1] != null) {
									Static86.aClass65Array43[local23++] = local2810.aClass65Array49[local773 - 1];
									continue;
								}
								Static86.aClass65Array43[local23++] = Static79.aClass65_751;
								continue;
							}
							if (local213 == 4203) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static4.method872(local768).anInt2095;
								continue;
							}
							if (local213 == 4204) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static4.method872(local768).anInt2071 == 1 ? 1 : 0;
								continue;
							}
							@Pc(2957) Class2_Sub1_Sub11 local2957;
							if (local213 == 4205) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								local2957 = Static4.method872(local768);
								if (local2957.anInt2091 == -1 && local2957.anInt2101 >= 0) {
									Static11.anIntArray164[local34++] = local2957.anInt2101;
									continue;
								}
								Static11.anIntArray164[local34++] = local768;
								continue;
							}
							if (local213 == 4206) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								local2957 = Static4.method872(local768);
								if (local2957.anInt2091 >= 0 && local2957.anInt2101 >= 0) {
									Static11.anIntArray164[local34++] = local2957.anInt2101;
									continue;
								}
								Static11.anIntArray164[local34++] = local768;
								continue;
							}
							if (local213 == 4207) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								Static11.anIntArray164[local34++] = Static4.method872(local768).aBoolean80 ? 1 : 0;
								continue;
							}
						} else if (local213 < 5100) {
							if (local213 == 5000) {
								Static11.anIntArray164[local34++] = Static42.anInt1050;
								continue;
							}
							if (local213 == 5001) {
								local34 -= 3;
								Static42.anInt1050 = Static11.anIntArray164[local34];
								Static6.anInt187 = Static11.anIntArray164[local34 + 1];
								Static58.anInt1460 = Static11.anIntArray164[local34 + 2];
								Static49.aClass2_Sub4_Sub1_1.method962(184);
								Static49.aClass2_Sub4_Sub1_1.method926(Static42.anInt1050);
								Static49.aClass2_Sub4_Sub1_1.method926(Static6.anInt187);
								Static49.aClass2_Sub4_Sub1_1.method926(Static58.anInt1460);
								continue;
							}
							if (local213 == 5002) {
								local34 -= 2;
								local23--;
								local583 = Static86.aClass65Array43[local23];
								local1579 = Static11.anIntArray164[local34 + 1];
								local773 = Static11.anIntArray164[local34];
								Static49.aClass2_Sub4_Sub1_1.method962(30);
								Static49.aClass2_Sub4_Sub1_1.method948(local583.method1493());
								Static49.aClass2_Sub4_Sub1_1.method926(local773 - 1);
								Static49.aClass2_Sub4_Sub1_1.method926(local1579);
								continue;
							}
							if (local213 == 5003) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								local1306 = null;
								if (local768 < 100) {
									local1306 = Static101.aClass65Array57[local768];
								}
								if (local1306 == null) {
									local1306 = Static79.aClass65_751;
								}
								Static86.aClass65Array43[local23++] = local1306;
								continue;
							}
							if (local213 == 5004) {
								local773 = -1;
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (local768 < 100 && Static101.aClass65Array57[local768] != null) {
									local773 = Static132.anIntArray414[local768];
								}
								Static11.anIntArray164[local34++] = local773;
								continue;
							}
							if (local213 == 5005) {
								Static11.anIntArray164[local34++] = Static6.anInt187;
								continue;
							}
							if (local213 == 5008) {
								local23--;
								local583 = Static86.aClass65Array43[local23];
								if (local583.method1490(Static13.aClass65_1122)) {
									Static121.method1876(local583);
								} else {
									local1306 = local583.method1486();
									@Pc(3250) byte local3250 = 0;
									if (local1306.method1490(Static91.aClass65_854)) {
										local583 = local583.method1501(Static91.aClass65_854.method1502());
										local3250 = 0;
									} else if (local1306.method1490(Static91.aClass65_858)) {
										local3250 = 1;
										local583 = local583.method1501(Static91.aClass65_858.method1502());
									} else if (local1306.method1490(Static70.aClass65_701)) {
										local583 = local583.method1501(Static70.aClass65_701.method1502());
										local3250 = 2;
									} else if (local1306.method1490(Static94.aClass65_898)) {
										local3250 = 3;
										local583 = local583.method1501(Static94.aClass65_898.method1502());
									} else if (local1306.method1490(Static33.aClass65_356)) {
										local3250 = 4;
										local583 = local583.method1501(Static33.aClass65_356.method1502());
									} else if (local1306.method1490(Static7.aClass65_97)) {
										local3250 = 5;
										local583 = local583.method1501(Static7.aClass65_97.method1502());
									} else if (local1306.method1490(Static101.aClass65_968)) {
										local3250 = 6;
										local583 = local583.method1501(Static101.aClass65_968.method1502());
									} else if (local1306.method1490(Static122.aClass65_1145)) {
										local583 = local583.method1501(Static122.aClass65_1145.method1502());
										local3250 = 7;
									} else if (local1306.method1490(Static60.aClass65_225)) {
										local583 = local583.method1501(Static60.aClass65_225.method1502());
										local3250 = 8;
									} else if (local1306.method1490(Static128.aClass65_1209)) {
										local3250 = 9;
										local583 = local583.method1501(Static128.aClass65_1209.method1502());
									} else if (local1306.method1490(Static77.aClass65_737)) {
										local583 = local583.method1501(Static77.aClass65_737.method1502());
										local3250 = 10;
									} else if (local1306.method1490(Static19.aClass65_230)) {
										local583 = local583.method1501(Static19.aClass65_230.method1502());
										local3250 = 11;
									} else if (Static73.anInt1662 != 0) {
										if (local1306.method1490(Static91.aClass65_851)) {
											local583 = local583.method1501(Static91.aClass65_851.method1502());
											local3250 = 0;
										} else if (local1306.method1490(Static91.aClass65_855)) {
											local3250 = 1;
											local583 = local583.method1501(Static91.aClass65_855.method1502());
										} else if (local1306.method1490(Static70.aClass65_695)) {
											local583 = local583.method1501(Static70.aClass65_695.method1502());
											local3250 = 2;
										} else if (local1306.method1490(Static94.aClass65_897)) {
											local3250 = 3;
											local583 = local583.method1501(Static94.aClass65_897.method1502());
										} else if (local1306.method1490(Static33.aClass65_363)) {
											local583 = local583.method1501(Static33.aClass65_363.method1502());
											local3250 = 4;
										} else if (local1306.method1490(Static7.aClass65_94)) {
											local3250 = 5;
											local583 = local583.method1501(Static7.aClass65_94.method1502());
										} else if (local1306.method1490(Static101.aClass65_969)) {
											local3250 = 6;
											local583 = local583.method1501(Static101.aClass65_969.method1502());
										} else if (local1306.method1490(Static122.aClass65_1144)) {
											local583 = local583.method1501(Static122.aClass65_1144.method1502());
											local3250 = 7;
										} else if (local1306.method1490(Static60.aClass65_204)) {
											local3250 = 8;
											local583 = local583.method1501(Static60.aClass65_204.method1502());
										} else if (local1306.method1490(Static128.aClass65_1210)) {
											local3250 = 9;
											local583 = local583.method1501(Static128.aClass65_1210.method1502());
										} else if (local1306.method1490(Static77.aClass65_735)) {
											local583 = local583.method1501(Static77.aClass65_735.method1502());
											local3250 = 10;
										} else if (local1306.method1490(Static19.aClass65_233)) {
											local583 = local583.method1501(Static19.aClass65_233.method1502());
											local3250 = 11;
										}
									}
									@Pc(3639) byte local3639 = 0;
									local1306 = local583.method1486();
									if (local1306.method1490(Static63.aClass65_663)) {
										local583 = local583.method1501(Static63.aClass65_663.method1502());
										local3639 = 1;
									} else if (local1306.method1490(Static32.aClass65_350)) {
										local3639 = 2;
										local583 = local583.method1501(Static32.aClass65_350.method1502());
									} else if (local1306.method1490(Static52.aClass65_552)) {
										local3639 = 3;
										local583 = local583.method1501(Static52.aClass65_552.method1502());
									} else if (local1306.method1490(Static28.aClass65_328)) {
										local3639 = 4;
										local583 = local583.method1501(Static28.aClass65_328.method1502());
									} else if (local1306.method1490(Static26.aClass65_291)) {
										local3639 = 5;
										local583 = local583.method1501(Static26.aClass65_291.method1502());
									} else if (Static73.anInt1662 != 0) {
										if (local1306.method1490(Static63.aClass65_666)) {
											local3639 = 1;
											local583 = local583.method1501(Static63.aClass65_666.method1502());
										} else if (local1306.method1490(Static32.aClass65_352)) {
											local583 = local583.method1501(Static32.aClass65_352.method1502());
											local3639 = 2;
										} else if (local1306.method1490(Static52.aClass65_550)) {
											local583 = local583.method1501(Static52.aClass65_550.method1502());
											local3639 = 3;
										} else if (local1306.method1490(Static28.aClass65_335)) {
											local583 = local583.method1501(Static28.aClass65_335.method1502());
											local3639 = 4;
										} else if (local1306.method1490(Static26.aClass65_290)) {
											local583 = local583.method1501(Static26.aClass65_290.method1502());
											local3639 = 5;
										}
									}
									Static49.aClass2_Sub4_Sub1_1.method962(27);
									Static49.aClass2_Sub4_Sub1_1.method926(0);
									local648 = Static49.aClass2_Sub4_Sub1_1.anInt1298;
									Static49.aClass2_Sub4_Sub1_1.method926(local3250);
									Static49.aClass2_Sub4_Sub1_1.method926(local3639);
									Static111.method1810(local583, Static49.aClass2_Sub4_Sub1_1);
									Static49.aClass2_Sub4_Sub1_1.method945(Static49.aClass2_Sub4_Sub1_1.anInt1298 - local648);
								}
								continue;
							}
							if (local213 == 5009) {
								local23 -= 2;
								local1306 = Static86.aClass65Array43[local23 + 1];
								local583 = Static86.aClass65Array43[local23];
								Static49.aClass2_Sub4_Sub1_1.method962(224);
								Static49.aClass2_Sub4_Sub1_1.method926(0);
								local1579 = Static49.aClass2_Sub4_Sub1_1.anInt1298;
								Static49.aClass2_Sub4_Sub1_1.method948(local583.method1493());
								Static111.method1810(local1306, Static49.aClass2_Sub4_Sub1_1);
								Static49.aClass2_Sub4_Sub1_1.method945(Static49.aClass2_Sub4_Sub1_1.anInt1298 - local1579);
								continue;
							}
							if (local213 == 5010) {
								local1306 = null;
								local34--;
								local768 = Static11.anIntArray164[local34];
								if (local768 < 100) {
									local1306 = Static97.aClass65Array53[local768];
								}
								if (local1306 == null) {
									local1306 = Static79.aClass65_751;
								}
								Static86.aClass65Array43[local23++] = local1306;
								continue;
							}
							if (local213 == 5011) {
								local34--;
								local768 = Static11.anIntArray164[local34];
								local1306 = null;
								if (local768 < 100) {
									local1306 = Static123.aClass65Array71[local768];
								}
								if (local1306 == null) {
									local1306 = Static79.aClass65_751;
								}
								Static86.aClass65Array43[local23++] = local1306;
								continue;
							}
							if (local213 == 5015) {
								if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1 == null || Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass65_457 == null) {
									local583 = Static57.aClass65_627;
								} else {
									local583 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass65_457;
								}
								Static86.aClass65Array43[local23++] = local583;
								continue;
							}
							if (local213 == 5016) {
								Static11.anIntArray164[local34++] = Static58.anInt1460;
								continue;
							}
							if (local213 == 5017) {
								Static11.anIntArray164[local34++] = Static60.anInt467;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7046) Exception local7046) {
			if (local18.aClass65_1252 == null) {
				if (Static67.anInt1595 != 0) {
					Static59.method1098(0, Static79.aClass65_751, Static93.aClass65_876);
				}
				Static93.method1535("CS2 - scr:" + local18.aLong100 + " op:" + local32, local7046);
			} else {
				@Pc(7079) Class65 local7079 = Static133.method2042(30);
				local7079.method1504(Static132.aClass65_1256).method1504(local18.aClass65_1252);
				for (local55 = Static95.anInt2164 - 1; local55 >= 0; local55--) {
					local7079.method1504(Static129.aClass65_1214).method1504(Static8.aClass82Array1[local55].aClass2_Sub1_Sub17_1.aClass65_1252);
				}
				if (local32 == 40) {
					local93 = local41[local25];
					local7079.method1504(Static116.aClass65_1103).method1504(Static120.method1871(local93));
				}
				if (Static67.anInt1595 != 0) {
					Static59.method1098(0, Static79.aClass65_751, Static35.method647(new Class65[] { Static88.aClass65_820, local18.aClass65_1252 }));
				}
				Static93.method1535("CS2 - scr:" + local18.aLong100 + " op:" + local32 + new String(local7079.method1478()), local7046);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BIILclient!na;Lclient!na;)Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 method1704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) Class56 arg3) {
		return Static10.method2052(arg2, arg1, arg0) ? Static113.method1823(arg3.method1666(arg0, arg1)) : null;
	}
}
