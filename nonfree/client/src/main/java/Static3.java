import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!qc;")
	public static Class47 aClass47_2 = new Class47(100);

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt50 = 0;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt51 = -1;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_16 = Static13.method257("titlebox");

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_17 = Static13.method257("@yel@0 unread messages");

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_18 = Static13.method257("From:  ");

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method24() {
		aClass2_Sub2_Sub2_Sub3_2 = null;
		aClass40_17 = null;
		aClass40_18 = null;
		aClass47_2 = null;
		aClass40_16 = null;
		anIntArray4 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ke;)V")
	public static void method25(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		@Pc(24) int local24 = arg0.anInt2277 - Static107.anInt2511;
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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method26() {
		@Pc(12) int local12;
		@Pc(27) int local27;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static88.anInt2083 == 35) {
			local12 = Static56.aClass2_Sub3_Sub1_5.method1708();
			local19 = Static91.anInt2138 + (local12 & 0x7);
			local27 = Static95.anInt2237 + (local12 >> 4 & 0x7);
			local31 = Static56.aClass2_Sub3_Sub1_5.method1708();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static79.anIntArray416[local35];
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				Static22.method1727(0, Static1.anInt8, local43, local39, local35, -1, local19, -1, local27);
			}
		} else if (Static88.anInt2083 == 46) {
			local12 = Static56.aClass2_Sub3_Sub1_5.method1681();
			local27 = Static56.aClass2_Sub3_Sub1_5.method1705();
			local19 = Static56.aClass2_Sub3_Sub1_5.method1714();
			local31 = Static56.aClass2_Sub3_Sub1_5.method1730();
			local39 = Static91.anInt2138 + (local31 & 0x7);
			local35 = (local31 >> 4 & 0x7) + Static95.anInt2237;
			if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local27 != Static83.anInt1955) {
				@Pc(131) Class2_Sub2_Sub12_Sub3 local131 = new Class2_Sub2_Sub12_Sub3();
				local131.anInt1495 = local12;
				local131.anInt1490 = local19;
				if (Static91.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39] == null) {
					Static91.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39] = new Class44();
				}
				Static91.aClass44ArrayArrayArray1[Static1.anInt8][local35][local39].method1221(local131);
				Static83.method1356(local39, local35);
			}
		} else if (Static88.anInt2083 == 63) {
			local12 = Static56.aClass2_Sub3_Sub1_5.method1708();
			local27 = (local12 >> 4 & 0x7) + Static95.anInt2237;
			local19 = Static91.anInt2138 + (local12 & 0x7);
			local31 = Static56.aClass2_Sub3_Sub1_5.method1704();
			local35 = Static56.aClass2_Sub3_Sub1_5.method1704();
			local39 = Static56.aClass2_Sub3_Sub1_5.method1704();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				@Pc(230) Class44 local230 = Static91.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19];
				if (local230 != null) {
					for (@Pc(237) Class2_Sub2_Sub12_Sub3 local237 = (Class2_Sub2_Sub12_Sub3) local230.method1224(); local237 != null; local237 = (Class2_Sub2_Sub12_Sub3) local230.method1231()) {
						if ((local31 & 0x7FFF) == local237.anInt1490 && local237.anInt1495 == local35) {
							local237.anInt1495 = local39;
							break;
						}
					}
					Static83.method1356(local19, local27);
				}
			}
		} else {
			if (Static88.anInt2083 == 118) {
				local12 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local27 = (local12 >> 4 & 0x7) + Static95.anInt2237;
				local19 = Static91.anInt2138 + (local12 & 0x7);
				local31 = Static56.aClass2_Sub3_Sub1_5.method1704();
				local35 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				if (local27 - local39 <= Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] && Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] <= local39 + local27 && Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] >= local19 - local39 && Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] <= local19 + local39 && Static98.anInt2372 != 0 && local43 > 0 && Static4.anInt131 < 50) {
					Static96.anIntArray497[Static4.anInt131] = local31;
					Static13.anIntArray79[Static4.anInt131] = local43;
					Static5.anIntArray36[Static4.anInt131] = 0;
					Static75.aClass43Array1[Static4.anInt131] = null;
					Static4.anInt131++;
				}
			}
			@Pc(425) int local425;
			if (Static88.anInt2083 == 244) {
				local12 = Static56.aClass2_Sub3_Sub1_5.method1714();
				local27 = Static56.aClass2_Sub3_Sub1_5.method1715();
				local31 = Static91.anInt2138 + (local27 & 0x7);
				local19 = (local27 >> 4 & 0x7) + Static95.anInt2237;
				local35 = Static56.aClass2_Sub3_Sub1_5.method1730();
				local43 = local35 & 0x3;
				local39 = local35 >> 2;
				local425 = Static79.anIntArray416[local39];
				if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
					Static22.method1727(0, Static1.anInt8, local425, local43, local39, local12, local31, -1, local19);
				}
			} else {
				@Pc(503) int local503;
				@Pc(523) int local523;
				if (Static88.anInt2083 == 21) {
					local12 = Static56.aClass2_Sub3_Sub1_5.method1705();
					local27 = Static56.aClass2_Sub3_Sub1_5.method1706();
					local19 = (local27 >> 4 & 0x7) + Static95.anInt2237;
					local31 = Static91.anInt2138 + (local27 & 0x7);
					local35 = Static56.aClass2_Sub3_Sub1_5.method1681();
					local39 = Static56.aClass2_Sub3_Sub1_5.method1706();
					local43 = local39 >> 2;
					local425 = local39 & 0x3;
					local503 = Static79.anIntArray416[local43];
					@Pc(507) byte local507 = Static56.aClass2_Sub3_Sub1_5.method1690();
					@Pc(511) byte local511 = Static56.aClass2_Sub3_Sub1_5.method1691();
					@Pc(515) byte local515 = Static56.aClass2_Sub3_Sub1_5.method1696();
					@Pc(519) byte local519 = Static56.aClass2_Sub3_Sub1_5.method1691();
					local523 = Static56.aClass2_Sub3_Sub1_5.method1705();
					@Pc(527) int local527 = Static56.aClass2_Sub3_Sub1_5.method1714();
					@Pc(536) Class2_Sub2_Sub12_Sub1_Sub1 local536;
					if (Static83.anInt1955 == local12) {
						local536 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1;
					} else {
						local536 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local12];
					}
					if (local536 != null) {
						@Pc(548) Class2_Sub2_Sub10 local548 = Static91.method1470(local523);
						@Pc(558) int local558 = Static91.anIntArrayArrayArray8[Static1.anInt8][local19 + 1][local31];
						@Pc(566) int local566 = Static91.anIntArrayArrayArray8[Static1.anInt8][local19][local31];
						@Pc(578) int local578 = Static91.anIntArrayArrayArray8[Static1.anInt8][local19 + 1][local31 + 1];
						@Pc(588) int local588 = Static91.anIntArrayArrayArray8[Static1.anInt8][local19][local31 + 1];
						@Pc(598) Class2_Sub2_Sub12_Sub4 local598 = local548.method765(local425, local558, local588, local566, local43, local578);
						if (local598 != null) {
							Static22.method1727(local35 + 1, Static1.anInt8, local503, 0, 0, -1, local31, local527 + 1, local19);
							local536.aClass2_Sub2_Sub12_Sub4_1 = local598;
							@Pc(621) int local621 = local548.anInt1036;
							@Pc(624) int local624 = local548.anInt1040;
							@Pc(633) byte local633;
							if (local511 < local519) {
								local633 = local519;
								local519 = local511;
								local511 = local633;
							}
							local536.anInt1381 = Static107.anInt2511 + local527;
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
							local536.anInt1377 = local35 + Static107.anInt2511;
							local536.anInt1375 = local31 * 128 + local624 * 64;
							local536.anInt1384 = Static86.method1383(Static1.anInt8, local536.anInt1387, local536.anInt1375);
							local536.anInt1386 = local31 + local507;
							local536.anInt1376 = local515 + local31;
							local536.anInt1369 = local511 + local19;
							local536.anInt1368 = local19 + local519;
						}
					}
				}
				@Pc(771) Class2_Sub2_Sub12_Sub3 local771;
				if (Static88.anInt2083 == 56) {
					local12 = Static56.aClass2_Sub3_Sub1_5.method1705();
					local27 = Static56.aClass2_Sub3_Sub1_5.method1730();
					local19 = Static95.anInt2237 + (local27 >> 4 & 0x7);
					local31 = Static91.anInt2138 + (local27 & 0x7);
					local35 = Static56.aClass2_Sub3_Sub1_5.method1714();
					if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
						local771 = new Class2_Sub2_Sub12_Sub3();
						local771.anInt1495 = local35;
						local771.anInt1490 = local12;
						if (Static91.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31] == null) {
							Static91.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31] = new Class44();
						}
						Static91.aClass44ArrayArrayArray1[Static1.anInt8][local19][local31].method1221(local771);
						Static83.method1356(local31, local19);
					}
				} else if (Static88.anInt2083 == 135) {
					local12 = Static56.aClass2_Sub3_Sub1_5.method1708();
					local27 = Static95.anInt2237 + (local12 >> 4 & 0x7);
					local19 = (local12 & 0x7) + Static91.anInt2138;
					local31 = Static56.aClass2_Sub3_Sub1_5.method1704();
					local35 = Static56.aClass2_Sub3_Sub1_5.method1708();
					local39 = Static56.aClass2_Sub3_Sub1_5.method1704();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						local19 = local19 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(893) Class2_Sub2_Sub12_Sub6 local893 = new Class2_Sub2_Sub12_Sub6(local31, Static1.anInt8, local27, local19, Static86.method1383(Static1.anInt8, local27, local19) - local35, local39, Static107.anInt2511);
						Static96.aClass44_8.method1221(local893);
					}
				} else if (Static88.anInt2083 == 221) {
					local12 = Static56.aClass2_Sub3_Sub1_5.method1706();
					local27 = (local12 >> 4 & 0x7) + Static95.anInt2237;
					local19 = (local12 & 0x7) + Static91.anInt2138;
					local31 = Static56.aClass2_Sub3_Sub1_5.method1704();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						@Pc(950) Class44 local950 = Static91.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19];
						if (local950 != null) {
							for (local771 = (Class2_Sub2_Sub12_Sub3) local950.method1224(); local771 != null; local771 = (Class2_Sub2_Sub12_Sub3) local950.method1231()) {
								if (local771.anInt1490 == (local31 & 0x7FFF)) {
									local771.method1677();
									break;
								}
							}
							if (local950.method1224() == null) {
								Static91.aClass44ArrayArrayArray1[Static1.anInt8][local27][local19] = null;
							}
							Static83.method1356(local19, local27);
						}
					}
				} else {
					@Pc(1060) int local1060;
					@Pc(1064) int local1064;
					@Pc(1068) int local1068;
					if (Static88.anInt2083 == 69) {
						local12 = Static56.aClass2_Sub3_Sub1_5.method1708();
						local27 = Static95.anInt2237 + (local12 >> 4 & 0x7);
						local19 = (local12 & 0x7) + Static91.anInt2138;
						local31 = local27 + Static56.aClass2_Sub3_Sub1_5.method1696();
						local35 = local19 + Static56.aClass2_Sub3_Sub1_5.method1696();
						local39 = Static56.aClass2_Sub3_Sub1_5.method1701();
						local43 = Static56.aClass2_Sub3_Sub1_5.method1704();
						local425 = Static56.aClass2_Sub3_Sub1_5.method1708() * 4;
						local503 = Static56.aClass2_Sub3_Sub1_5.method1708() * 4;
						local1060 = Static56.aClass2_Sub3_Sub1_5.method1704();
						local1064 = Static56.aClass2_Sub3_Sub1_5.method1704();
						local1068 = Static56.aClass2_Sub3_Sub1_5.method1708();
						@Pc(1072) int local1072 = Static56.aClass2_Sub3_Sub1_5.method1708();
						if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local43 != 65535) {
							local35 = local35 * 128 + 64;
							local27 = local27 * 128 + 64;
							local31 = local31 * 128 + 64;
							local19 = local19 * 128 + 64;
							@Pc(1164) Class2_Sub2_Sub12_Sub2 local1164 = new Class2_Sub2_Sub12_Sub2(local43, Static1.anInt8, local27, local19, Static86.method1383(Static1.anInt8, local27, local19) - local425, Static107.anInt2511 + local1060, local1064 + Static107.anInt2511, local1068, local1072, local39, local503);
							local1164.method939(local31, Static86.method1383(Static1.anInt8, local31, local35) - local503, Static107.anInt2511 + local1060, local35);
							Static24.aClass44_4.method1221(local1164);
						}
					} else if (Static88.anInt2083 == 129) {
						local12 = Static56.aClass2_Sub3_Sub1_5.method1714();
						local27 = Static56.aClass2_Sub3_Sub1_5.method1715();
						local19 = local27 >> 2;
						local31 = local27 & 0x3;
						local35 = Static79.anIntArray416[local19];
						local39 = Static56.aClass2_Sub3_Sub1_5.method1706();
						local425 = Static91.anInt2138 + (local39 & 0x7);
						local43 = Static95.anInt2237 + (local39 >> 4 & 0x7);
						if (local43 >= 0 && local425 >= 0 && local43 < 103 && local425 < 103) {
							local503 = Static91.anIntArrayArrayArray8[Static1.anInt8][local43][local425];
							local1060 = Static91.anIntArrayArrayArray8[Static1.anInt8][local43 + 1][local425];
							local1064 = Static91.anIntArrayArrayArray8[Static1.anInt8][local43 + 1][local425 + 1];
							local1068 = Static91.anIntArrayArrayArray8[Static1.anInt8][local43][local425 + 1];
							if (local35 == 0) {
								@Pc(1292) Class60 local1292 = Static93.aClass55_1.method1412(Static1.anInt8, local43, local425);
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
								@Pc(1365) Class1 local1365 = Static93.aClass55_1.method1428(Static1.anInt8, local43, local425);
								if (local1365 != null) {
									local1365.aClass2_Sub2_Sub12_1 = new Class2_Sub2_Sub12_Sub5(local1365.anInt17 >> 14 & 0x7FFF, 4, 0, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 2) {
								@Pc(1397) Class37 local1397 = Static93.aClass55_1.method1436(Static1.anInt8, local43, local425);
								if (local19 == 11) {
									local19 = 10;
								}
								if (local1397 != null) {
									local1397.aClass2_Sub2_Sub12_3 = new Class2_Sub2_Sub12_Sub5(local1397.anInt1644 >> 14 & 0x7FFF, local19, local31, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 3) {
								@Pc(1432) Class4 local1432 = Static93.aClass55_1.method1441(Static1.anInt8, local43, local425);
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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ad;I)V")
	public static void method27(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static42.aClass2_Sub3_3 != null) {
			Static42.aClass2_Sub3_3.anInt2546 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static42.aClass2_Sub3_3.method1728();
			arg0.method92(local16);
		}
		Static49.method1535(255, null, 0, (byte) 0, true, 255);
		Static83.aClass5_Sub1Array1[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ud;)Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 method28(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return Static70.method1113(arg1, arg0) ? Static68.method338() : null;
	}
}
