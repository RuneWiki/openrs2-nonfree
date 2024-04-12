import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 9)
	public static void method24() {
		aClass2_Sub2_Sub2_Sub3_2 = null;
		Class4.aClass40_17 = null;
		Class4.aClass40_18 = null;
		Class4.aClass47_2 = null;
		Class4.aClass40_16 = null;
		anIntArray4 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ke;)V", line = 23)
	public static void method25(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		@Pc(24) int local24 = arg0.anInt2277 - Class24.anInt2511;
		if (arg0.anInt2314 == 2) {
			arg0.anInt2283 = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.anInt2283 = 512;
		}
		@Pc(54) int local54 = arg0.anInt2317 * 128 + arg0.anInt2278 * 64;
		arg0.anInt2275 += (local54 - arg0.anInt2275) / local24;
		@Pc(82) int local82 = arg0.anInt2321 * 128 + arg0.anInt2278 * 64;
		arg0.anInt2284 += (local82 - arg0.anInt2284) / local24;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 65)
	public static void method26() {
		@Pc(12) int local12;
		@Pc(27) int local27;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Class54.anInt2083 == 35) {
			local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
			local19 = Static83.anInt2138 + (local12 & 0x7);
			local27 = Static87.anInt2237 + (local12 >> 4 & 0x7);
			local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Class18.anIntArray416[local35];
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				Static21.method1727(0, Static1.anInt8, local43, local39, local35, -1, local19, -1, local27);
			}
		} else if (Class54.anInt2083 == 46) {
			local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
			local27 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
			local19 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
			local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
			local39 = Static83.anInt2138 + (local31 & 0x7);
			local35 = (local31 >> 4 & 0x7) + Static87.anInt2237;
			if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local27 != Class51.anInt1955) {
				@Pc(131) Class2_Sub2_Sub12_Sub3 local131 = new Class2_Sub2_Sub12_Sub3();
				local131.anInt1495 = local12;
				local131.anInt1490 = local19;
				if (Class57.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39] == null) {
					Class57.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39] = new Class44();
				}
				Class57.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39].method1221(local131);
				Static75.method1356(local39, local35);
			}
		} else if (Class54.anInt2083 == 63) {
			local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
			local27 = (local12 >> 4 & 0x7) + Static87.anInt2237;
			local19 = Static83.anInt2138 + (local12 & 0x7);
			local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
			local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
			local39 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				@Pc(230) Class44 local230 = Class57.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19];
				if (local230 != null) {
					for (@Pc(237) Class2_Sub2_Sub12_Sub3 local237 = (Class2_Sub2_Sub12_Sub3) local230.method1224(); local237 != null; local237 = (Class2_Sub2_Sub12_Sub3) local230.method1231()) {
						if ((local31 & 0x7FFF) == local237.anInt1490 && local237.anInt1495 == local35) {
							local237.anInt1495 = local39;
							break;
						}
					}
					Static75.method1356(local19, local27);
				}
			}
		} else {
			if (Class54.anInt2083 == 118) {
				local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local27 = (local12 >> 4 & 0x7) + Static87.anInt2237;
				local19 = Static83.anInt2138 + (local12 & 0x7);
				local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				if (local27 - local39 <= Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] <= local39 + local27 && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] >= local19 - local39 && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] <= local19 + local39 && Class60.anInt2372 != 0 && local43 > 0 && Class5_Sub1.anInt131 < 50) {
					Class2_Sub2_Sub12_Sub1_Sub2.anIntArray497[Class5_Sub1.anInt131] = local31;
					Class11.anIntArray79[Class5_Sub1.anInt131] = local43;
					Class2_Sub2_Sub1.anIntArray36[Class5_Sub1.anInt131] = 0;
					Class44.aClass43Array1[Class5_Sub1.anInt131] = null;
					Class5_Sub1.anInt131++;
				}
			}
			@Pc(425) int local425;
			if (Class54.anInt2083 == 244) {
				local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				local27 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
				local31 = Static83.anInt2138 + (local27 & 0x7);
				local19 = (local27 >> 4 & 0x7) + Static87.anInt2237;
				local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
				local43 = local35 & 0x3;
				local39 = local35 >> 2;
				local425 = Class18.anIntArray416[local39];
				if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
					Static21.method1727(0, Static1.anInt8, local425, local43, local39, local12, local31, -1, local19);
				}
			} else {
				@Pc(503) int local503;
				@Pc(523) int local523;
				if (Class54.anInt2083 == 21) {
					local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
					local27 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
					local19 = (local27 >> 4 & 0x7) + Static87.anInt2237;
					local31 = Static83.anInt2138 + (local27 & 0x7);
					local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
					local39 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
					local43 = local39 >> 2;
					local425 = local39 & 0x3;
					local503 = Class18.anIntArray416[local43];
					@Pc(507) byte local507 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1690();
					@Pc(511) byte local511 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1691();
					@Pc(515) byte local515 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1696();
					@Pc(519) byte local519 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1691();
					local523 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
					@Pc(527) int local527 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
					@Pc(536) Class2_Sub2_Sub12_Sub1_Sub1 local536;
					if (Class51.anInt1955 == local12) {
						local536 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1;
					} else {
						local536 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local12];
					}
					if (local536 != null) {
						@Pc(548) Class2_Sub2_Sub10 local548 = Static83.method1470(local523);
						@Pc(558) int local558 = Class57.anIntArrayArrayArray8[Static1.anInt8][local19 + 1][local31];
						@Pc(566) int local566 = Class57.anIntArrayArrayArray8[Static1.anInt8][local19][local31];
						@Pc(578) int local578 = Class57.anIntArrayArrayArray8[Static1.anInt8][local19 + 1][local31 + 1];
						@Pc(588) int local588 = Class57.anIntArrayArrayArray8[Static1.anInt8][local19][local31 + 1];
						@Pc(598) Class2_Sub2_Sub12_Sub4 local598 = local548.method765(local425, local558, local588, local566, local43, local578);
						if (local598 != null) {
							Static21.method1727(local35 + 1, Static1.anInt8, local503, 0, 0, -1, local31, local527 + 1, local19);
							local536.aClass2_Sub2_Sub12_Sub4_1 = local598;
							@Pc(621) int local621 = local548.anInt1036;
							@Pc(624) int local624 = local548.anInt1040;
							@Pc(633) byte local633;
							if (local511 < local519) {
								local633 = local519;
								local519 = local511;
								local511 = local633;
							}
							local536.anInt1381 = Class24.anInt2511 + local527;
							if (local515 > local507) {
								local633 = local515;
								local515 = local507;
								local507 = local633;
							}
							if (local425 == 1 || local425 == 3) {
								local624 = local548.anInt1036;
								local621 = local548.anInt1040;
							}
							local536.anInt1387 = local621 * 64 + local19 * 128;
							local536.anInt1377 = local35 + Class24.anInt2511;
							local536.anInt1375 = local31 * 128 + local624 * 64;
							local536.anInt1384 = Static78.method1383(Static1.anInt8, local536.anInt1387, local536.anInt1375);
							local536.anInt1386 = local31 + local507;
							local536.anInt1376 = local515 + local31;
							local536.anInt1369 = local511 + local19;
							local536.anInt1368 = local19 + local519;
						}
					}
				}
				@Pc(771) Class2_Sub2_Sub12_Sub3 local771;
				if (Class54.anInt2083 == 56) {
					local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
					local27 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
					local19 = Static87.anInt2237 + (local27 >> 4 & 0x7);
					local31 = Static83.anInt2138 + (local27 & 0x7);
					local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
					if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
						local771 = new Class2_Sub2_Sub12_Sub3();
						local771.anInt1495 = local35;
						local771.anInt1490 = local12;
						if (Class57.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31] == null) {
							Class57.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31] = new Class44();
						}
						Class57.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31].method1221(local771);
						Static75.method1356(local31, local19);
					}
				} else if (Class54.anInt2083 == 135) {
					local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
					local27 = Static87.anInt2237 + (local12 >> 4 & 0x7);
					local19 = (local12 & 0x7) + Static83.anInt2138;
					local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					local35 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
					local39 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						local19 = local19 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(893) Class2_Sub2_Sub12_Sub6 local893 = new Class2_Sub2_Sub12_Sub6(local31, Static1.anInt8, local27, local19, Static78.method1383(Static1.anInt8, local27, local19) - local35, local39, Class24.anInt2511);
						Class2_Sub2_Sub12_Sub1_Sub2.aClass44_8.method1221(local893);
					}
				} else if (Class54.anInt2083 == 221) {
					local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
					local27 = (local12 >> 4 & 0x7) + Static87.anInt2237;
					local19 = (local12 & 0x7) + Static83.anInt2138;
					local31 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						@Pc(950) Class44 local950 = Class57.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19];
						if (local950 != null) {
							for (local771 = (Class2_Sub2_Sub12_Sub3) local950.method1224(); local771 != null; local771 = (Class2_Sub2_Sub12_Sub3) local950.method1231()) {
								if (local771.anInt1490 == (local31 & 0x7FFF)) {
									local771.method1677();
									break;
								}
							}
							if (local950.method1224() == null) {
								Class57.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19] = null;
							}
							Static75.method1356(local19, local27);
						}
					}
				} else {
					@Pc(1060) int local1060;
					@Pc(1064) int local1064;
					@Pc(1068) int local1068;
					if (Class54.anInt2083 == 69) {
						local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
						local27 = Static87.anInt2237 + (local12 >> 4 & 0x7);
						local19 = (local12 & 0x7) + Static83.anInt2138;
						local31 = local27 + Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1696();
						local35 = local19 + Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1696();
						local39 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1701();
						local43 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
						local425 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708() * 4;
						local503 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708() * 4;
						local1060 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
						local1064 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
						local1068 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
						@Pc(1072) int local1072 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
						if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local43 != 65535) {
							local35 = local35 * 128 + 64;
							local27 = local27 * 128 + 64;
							local31 = local31 * 128 + 64;
							local19 = local19 * 128 + 64;
							@Pc(1164) Class2_Sub2_Sub12_Sub2 local1164 = new Class2_Sub2_Sub12_Sub2(local43, Static1.anInt8, local27, local19, Static78.method1383(Static1.anInt8, local27, local19) - local425, Class24.anInt2511 + local1060, local1064 + Class24.anInt2511, local1068, local1072, local39, local503);
							local1164.method939(local31, Static78.method1383(Static1.anInt8, local31, local35) - local503, Class24.anInt2511 + local1060, local35);
							Class2_Sub2_Sub5.aClass44_4.method1221(local1164);
						}
					} else if (Class54.anInt2083 == 129) {
						local12 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
						local27 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
						local19 = local27 >> 2;
						local31 = local27 & 0x3;
						local35 = Class18.anIntArray416[local19];
						local39 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
						local425 = Static83.anInt2138 + (local39 & 0x7);
						local43 = Static87.anInt2237 + (local39 >> 4 & 0x7);
						if (local43 >= 0 && local425 >= 0 && local43 < 103 && local425 < 103) {
							local503 = Class57.anIntArrayArrayArray8[Static1.anInt8][local43][local425];
							local1060 = Class57.anIntArrayArrayArray8[Static1.anInt8][local43 + 1][local425];
							local1064 = Class57.anIntArrayArrayArray8[Static1.anInt8][local43 + 1][local425 + 1];
							local1068 = Class57.anIntArrayArrayArray8[Static1.anInt8][local43][local425 + 1];
							if (local35 == 0) {
								@Pc(1292) Class60 local1292 = Static85.aClass55_1.method1412(Static1.anInt8, local43, local425);
								if (local1292 != null) {
									local523 = local1292.anInt2369 >> 14 & 0x7FFF;
									if (local19 == 2) {
										local1292.aClass2_Sub2_Sub12_7 = new Class2_Sub2_Sub12_Sub5(local523, 2, local31 + 4, local503, local1060, local1064, local1068, local12, false);
										local1292.aClass2_Sub2_Sub12_8 = new Class2_Sub2_Sub12_Sub5(local523, 2, local31 + 1 & 0x3, local503, local1060, local1064, local1068, local12, false);
									} else {
										local1292.aClass2_Sub2_Sub12_7 = new Class2_Sub2_Sub12_Sub5(local523, local19, local31, local503, local1060, local1064, local1068, local12, false);
									}
								}
							}
							if (local35 == 1) {
								@Pc(1365) Class1 local1365 = Static85.aClass55_1.method1428(Static1.anInt8, local43, local425);
								if (local1365 != null) {
									local1365.aClass2_Sub2_Sub12_1 = new Class2_Sub2_Sub12_Sub5(local1365.anInt17 >> 14 & 0x7FFF, 4, 0, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 2) {
								@Pc(1397) Class37 local1397 = Static85.aClass55_1.method1436(Static1.anInt8, local43, local425);
								if (local19 == 11) {
									local19 = 10;
								}
								if (local1397 != null) {
									local1397.aClass2_Sub2_Sub12_3 = new Class2_Sub2_Sub12_Sub5(local1397.anInt1644 >> 14 & 0x7FFF, local19, local31, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 3) {
								@Pc(1432) Class4 local1432 = Static85.aClass55_1.method1441(Static1.anInt8, local43, local425);
								if (local1432 != null) {
									local1432.aClass2_Sub2_Sub12_2 = new Class2_Sub2_Sub12_Sub5(local1432.anInt48 >> 14 & 0x7FFF, 22, local31, local503, local1060, local1064, local1068, local12, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ad;I)V", line = 591)
	public static void method27(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static39.aClass2_Sub3_3 != null) {
			Static39.aClass2_Sub3_3.anInt2546 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static39.aClass2_Sub3_3.method1728();
			arg0.method92(local16);
		}
		Static45.method1535(255, null, 0, (byte) 0, true, 255);
		Class51.aClass5_Sub1Array1[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ud;)Lclient!qb;", line = 654)
	public static Class2_Sub2_Sub2_Sub3 method28(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return Static64.method1113(arg1, arg0) ? Static63.method338() : null;
	}
}
