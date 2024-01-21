import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt1851;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!b;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_493 = Static60.method1113("Fallen lassen");

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!wd;")
	public static Class82 aClass82_6 = new Class82();

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!ec;")
	private static Class22 aClass22_494 = Static60.method1113("wishes to trade with you)3");

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_495 = aClass22_494;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt1863 = 0;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_496 = Static60.method1113("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1155() {
		Static8.aClass33_27.method1003();
		Static120.aClass33_32.method1003();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1156() {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(34) int local34;
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (Static72.anInt1915 == 164) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method711();
			@Pc(18) byte local18 = Static133.aClass4_Sub11_Sub1_3.method721();
			local22 = Static133.aClass4_Sub11_Sub1_3.method711();
			local26 = Static133.aClass4_Sub11_Sub1_3.method722();
			local30 = local26 >> 2;
			local34 = Static113.anIntArray305[local30];
			local38 = local26 & 0x3;
			@Pc(42) byte local42 = Static133.aClass4_Sub11_Sub1_3.method723();
			local46 = Static133.aClass4_Sub11_Sub1_3.method705();
			@Pc(50) byte local50 = Static133.aClass4_Sub11_Sub1_3.method698();
			local56 = Static133.aClass4_Sub11_Sub1_3.method718();
			@Pc(60) byte local60 = Static133.aClass4_Sub11_Sub1_3.method723();
			local64 = Static133.aClass4_Sub11_Sub1_3.method722();
			@Pc(72) int local72 = (local64 >> 4 & 0x7) + Static37.anInt901;
			@Pc(78) int local78 = Static16.anInt377 + (local64 & 0x7);
			@Pc(85) Class4_Sub1_Sub3_Sub2_Sub1 local85;
			if (local46 == Static32.anInt824) {
				local85 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1;
			} else {
				local85 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local46];
			}
			if (local85 != null) {
				@Pc(95) Class4_Sub1_Sub5 local95 = Static5.method45(local56);
				@Pc(109) int local109;
				@Pc(106) int local106;
				if (local38 == 1 || local38 == 3) {
					local106 = local95.anInt1256;
					local109 = local95.anInt1267;
				} else {
					local106 = local95.anInt1267;
					local109 = local95.anInt1256;
				}
				@Pc(124) int local124 = local72 + (local109 >> 1);
				@Pc(133) int local133 = local72 + (local109 + 1 >> 1);
				@Pc(139) int local139 = (local106 >> 1) + local78;
				@Pc(147) int local147 = (local106 + 1 >> 1) + local78;
				@Pc(151) int[][] local151 = Static57.anIntArrayArrayArray4[Static37.anInt895];
				@Pc(179) int local179 = local151[local133][local147] + local151[local124][local139] + local151[local133][local139] + local151[local124][local147] >> 2;
				@Pc(187) int local187 = (local109 << 6) + (local72 << 7);
				@Pc(196) int local196 = (local78 << 7) + (local106 << 6);
				@Pc(208) Class4_Sub1_Sub3_Sub3 local208 = local95.method875(local187, local30, local196, local151, local38, local179);
				if (local208 != null) {
					@Pc(215) byte local215;
					if (local50 > local42) {
						local215 = local50;
						local50 = local42;
						local42 = local215;
					}
					Static121.method1881(local78, local22 + 1, local72, local34, 0, Static37.anInt895, local12 + 1, 0, -1);
					local85.anInt1747 = Static117.anInt2877 + local12;
					local85.anInt1735 = Static117.anInt2877 + local22;
					if (local18 > local60) {
						local215 = local18;
						local18 = local60;
						local60 = local215;
					}
					local85.anInt1727 = local72 * 128 + local109 * 64;
					local85.anInt1739 = local179;
					local85.anInt1740 = local18 + local78;
					local85.anInt1730 = local50 + local72;
					local85.anInt1737 = local42 + local72;
					local85.aClass4_Sub1_Sub3_Sub3_1 = local208;
					local85.anInt1733 = local60 + local78;
					local85.anInt1743 = local106 * 64 + local78 * 128;
				}
			}
		}
		@Pc(308) int local308;
		@Pc(345) Class4_Sub1_Sub3_Sub1 local345;
		if (Static72.anInt1915 == 26) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method711();
			local308 = Static133.aClass4_Sub11_Sub1_3.method719();
			local22 = Static37.anInt901 + (local308 >> 4 & 0x7);
			local26 = Static16.anInt377 + (local308 & 0x7);
			local30 = Static133.aClass4_Sub11_Sub1_3.method706();
			if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104) {
				local345 = new Class4_Sub1_Sub3_Sub1();
				local345.anInt363 = local12;
				local345.anInt361 = local30;
				if (Static19.aClass82ArrayArrayArray1[Static37.anInt895][local22][local26] == null) {
					Static19.aClass82ArrayArrayArray1[Static37.anInt895][local22][local26] = new Class82();
				}
				Static19.aClass82ArrayArrayArray1[Static37.anInt895][local22][local26].method2028(local345);
				Static132.method2019(local26, local22);
			}
			return;
		}
		@Pc(427) int local427;
		@Pc(461) int local461;
		if (Static72.anInt1915 == 147) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method719();
			local22 = local12 & 0x3;
			local308 = local12 >> 2;
			local26 = Static113.anIntArray305[local308];
			local30 = Static133.aClass4_Sub11_Sub1_3.method716();
			local34 = (local30 & 0x7) + Static16.anInt377;
			local38 = (local30 >> 4 & 0x7) + Static37.anInt901;
			local427 = Static133.aClass4_Sub11_Sub1_3.method705();
			if (local38 >= 0 && local34 >= 0 && local38 < 103 && local34 < 103) {
				if (local26 == 0) {
					@Pc(452) Class3 local452 = Static134.aClass77_1.method1927(Static37.anInt895, local38, local34);
					if (local452 != null) {
						local461 = local452.anInt26 >> 14 & 0x7FFF;
						if (local308 == 2) {
							local452.aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3_Sub5(local461, 2, local22 + 4, Static37.anInt895, local38, local34, local427, false, local452.aClass4_Sub1_Sub3_1);
							local452.aClass4_Sub1_Sub3_2 = new Class4_Sub1_Sub3_Sub5(local461, 2, local22 + 1 & 0x3, Static37.anInt895, local38, local34, local427, false, local452.aClass4_Sub1_Sub3_2);
						} else {
							local452.aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3_Sub5(local461, local308, local22, Static37.anInt895, local38, local34, local427, false, local452.aClass4_Sub1_Sub3_1);
						}
					}
				}
				if (local26 == 1) {
					@Pc(528) Class61 local528 = Static134.aClass77_1.method1954(Static37.anInt895, local38, local34);
					if (local528 != null) {
						local461 = local528.anInt2578 >> 14 & 0x7FFF;
						if (local308 == 4 || local308 == 5) {
							local528.aClass4_Sub1_Sub3_9 = new Class4_Sub1_Sub3_Sub5(local461, 4, local22, Static37.anInt895, local38, local34, local427, false, local528.aClass4_Sub1_Sub3_9);
						} else if (local308 == 6) {
							local528.aClass4_Sub1_Sub3_9 = new Class4_Sub1_Sub3_Sub5(local461, 4, local22 + 4, Static37.anInt895, local38, local34, local427, false, local528.aClass4_Sub1_Sub3_9);
						} else if (local308 == 7) {
							local528.aClass4_Sub1_Sub3_9 = new Class4_Sub1_Sub3_Sub5(local461, 4, (local22 + 2 & 0x3) + 4, Static37.anInt895, local38, local34, local427, false, local528.aClass4_Sub1_Sub3_9);
						} else if (local308 == 8) {
							local528.aClass4_Sub1_Sub3_9 = new Class4_Sub1_Sub3_Sub5(local461, 4, local22 + 4, Static37.anInt895, local38, local34, local427, false, local528.aClass4_Sub1_Sub3_9);
							local528.aClass4_Sub1_Sub3_8 = new Class4_Sub1_Sub3_Sub5(local461, 4, (local22 + 2 & 0x3) + 4, Static37.anInt895, local38, local34, local427, false, local528.aClass4_Sub1_Sub3_8);
						}
					}
				}
				if (local26 == 2) {
					@Pc(658) Class26 local658 = Static134.aClass77_1.method1923(Static37.anInt895, local38, local34);
					if (local308 == 11) {
						local308 = 10;
					}
					if (local658 != null) {
						local658.aClass4_Sub1_Sub3_3 = new Class4_Sub1_Sub3_Sub5(local658.anInt972 >> 14 & 0x7FFF, local308, local22, Static37.anInt895, local38, local34, local427, false, local658.aClass4_Sub1_Sub3_3);
					}
				}
				if (local26 == 3) {
					@Pc(694) Class40 local694 = Static134.aClass77_1.method1964(Static37.anInt895, local38, local34);
					if (local694 != null) {
						local694.aClass4_Sub1_Sub3_4 = new Class4_Sub1_Sub3_Sub5(local694.anInt1809 >> 14 & 0x7FFF, 22, local22, Static37.anInt895, local38, local34, local427, false, local694.aClass4_Sub1_Sub3_4);
					}
				}
			}
		} else if (Static72.anInt1915 == 32) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method716();
			local308 = (local12 >> 4 & 0x7) + Static37.anInt901;
			local22 = (local12 & 0x7) + Static16.anInt377;
			local26 = Static133.aClass4_Sub11_Sub1_3.method711();
			if (local308 >= 0 && local22 >= 0 && local308 < 104 && local22 < 104) {
				@Pc(765) Class82 local765 = Static19.aClass82ArrayArrayArray1[Static37.anInt895][local308][local22];
				if (local765 != null) {
					for (local345 = (Class4_Sub1_Sub3_Sub1) local765.method2025(); local345 != null; local345 = (Class4_Sub1_Sub3_Sub1) local765.method2023()) {
						if ((local26 & 0x7FFF) == local345.anInt361) {
							local345.method1999();
							break;
						}
					}
					if (local765.method2025() == null) {
						Static19.aClass82ArrayArrayArray1[Static37.anInt895][local308][local22] = null;
					}
					Static132.method2019(local22, local308);
				}
			}
		} else if (Static72.anInt1915 == 138) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method719();
			local308 = (local12 >> 4 & 0x7) + Static37.anInt901;
			local22 = (local12 & 0x7) + Static16.anInt377;
			local26 = Static133.aClass4_Sub11_Sub1_3.method718();
			local30 = Static133.aClass4_Sub11_Sub1_3.method718();
			local38 = Static133.aClass4_Sub11_Sub1_3.method718();
			if (local308 >= 0 && local22 >= 0 && local308 < 104 && local22 < 104) {
				@Pc(875) Class82 local875 = Static19.aClass82ArrayArrayArray1[Static37.anInt895][local308][local22];
				if (local875 != null) {
					for (@Pc(882) Class4_Sub1_Sub3_Sub1 local882 = (Class4_Sub1_Sub3_Sub1) local875.method2025(); local882 != null; local882 = (Class4_Sub1_Sub3_Sub1) local875.method2023()) {
						if ((local26 & 0x7FFF) == local882.anInt361 && local30 == local882.anInt363) {
							local882.anInt363 = local38;
							break;
						}
					}
					Static132.method2019(local22, local308);
				}
			}
		} else if (Static72.anInt1915 == 150) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method707();
			local308 = local12 >> 2;
			local22 = local12 & 0x3;
			local26 = Static113.anIntArray305[local308];
			local30 = Static133.aClass4_Sub11_Sub1_3.method716();
			local38 = Static37.anInt901 + (local30 >> 4 & 0x7);
			local34 = Static16.anInt377 + (local30 & 0x7);
			if (local38 >= 0 && local34 >= 0 && local38 < 104 && local34 < 104) {
				Static121.method1881(local34, 0, local38, local26, local22, Static37.anInt895, -1, local308, -1);
			}
		} else if (Static72.anInt1915 == 120) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method719();
			local22 = Static16.anInt377 + (local12 & 0x7);
			local308 = (local12 >> 4 & 0x7) + Static37.anInt901;
			local26 = Static133.aClass4_Sub11_Sub1_3.method718();
			local30 = Static133.aClass4_Sub11_Sub1_3.method719();
			local38 = Static133.aClass4_Sub11_Sub1_3.method718();
			if (local308 >= 0 && local22 >= 0 && local308 < 104 && local22 < 104) {
				local22 = local22 * 128 + 64;
				local308 = local308 * 128 + 64;
				@Pc(1062) Class4_Sub1_Sub3_Sub7 local1062 = new Class4_Sub1_Sub3_Sub7(local26, Static37.anInt895, local308, local22, Static69.method1173(Static37.anInt895, local308, local22) - local30, local38, Static117.anInt2877);
				Static132.aClass82_14.method2028(local1062);
			}
		} else if (Static72.anInt1915 == 103) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method711();
			local308 = Static133.aClass4_Sub11_Sub1_3.method705();
			local22 = Static133.aClass4_Sub11_Sub1_3.method722();
			local26 = Static37.anInt901 + (local22 >> 4 & 0x7);
			local30 = Static16.anInt377 + (local22 & 0x7);
			local38 = Static133.aClass4_Sub11_Sub1_3.method706();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && Static32.anInt824 != local308) {
				@Pc(1131) Class4_Sub1_Sub3_Sub1 local1131 = new Class4_Sub1_Sub3_Sub1();
				local1131.anInt361 = local38;
				local1131.anInt363 = local12;
				if (Static19.aClass82ArrayArrayArray1[Static37.anInt895][local26][local30] == null) {
					Static19.aClass82ArrayArrayArray1[Static37.anInt895][local26][local30] = new Class82();
				}
				Static19.aClass82ArrayArrayArray1[Static37.anInt895][local26][local30].method2028(local1131);
				Static132.method2019(local30, local26);
			}
		} else if (Static72.anInt1915 == 105) {
			local12 = Static133.aClass4_Sub11_Sub1_3.method716();
			local308 = local12 >> 2;
			local22 = local12 & 0x3;
			local26 = Static113.anIntArray305[local308];
			local30 = Static133.aClass4_Sub11_Sub1_3.method705();
			local38 = Static133.aClass4_Sub11_Sub1_3.method707();
			local34 = (local38 >> 4 & 0x7) + Static37.anInt901;
			local427 = (local38 & 0x7) + Static16.anInt377;
			if (local34 >= 0 && local427 >= 0 && local34 < 104 && local427 < 104) {
				Static121.method1881(local427, 0, local34, local26, local22, Static37.anInt895, -1, local308, local30);
			}
		} else {
			if (Static72.anInt1915 == 195) {
				local12 = Static133.aClass4_Sub11_Sub1_3.method719();
				local308 = Static37.anInt901 + (local12 >> 4 & 0x7);
				local22 = (local12 & 0x7) + Static16.anInt377;
				local26 = Static133.aClass4_Sub11_Sub1_3.method718();
				local30 = Static133.aClass4_Sub11_Sub1_3.method719();
				local427 = Static133.aClass4_Sub11_Sub1_3.method719();
				local34 = local30 & 0x7;
				local38 = local30 >> 4 & 0xF;
				if (local308 >= 0 && local22 >= 0 && local308 < 104 && local22 < 104) {
					local46 = local38 + 1;
					if (local308 - local46 <= Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0] && Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0] <= local46 + local308 && local22 - local46 <= Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0] && Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0] <= local22 + local46 && Static95.anInt1927 != 0 && local34 > 0 && Static120.anInt2929 < 50) {
						Static45.anIntArray133[Static120.anInt2929] = local26;
						Static105.anIntArray296[Static120.anInt2929] = local34;
						Static93.anIntArray281[Static120.anInt2929] = local427;
						Static54.aClass65Array1[Static120.anInt2929] = null;
						Static95.anIntArray198[Static120.anInt2929] = local38 + (local22 << 8) + (local308 << 16);
						Static120.anInt2929++;
					}
				}
			}
			if (Static72.anInt1915 == 82) {
				local12 = Static133.aClass4_Sub11_Sub1_3.method719();
				local308 = (local12 >> 4 & 0x7) + Static37.anInt901;
				local22 = Static16.anInt377 + (local12 & 0x7);
				local26 = local308 + Static133.aClass4_Sub11_Sub1_3.method731();
				local30 = Static133.aClass4_Sub11_Sub1_3.method731() + local22;
				local38 = Static133.aClass4_Sub11_Sub1_3.method738();
				local34 = Static133.aClass4_Sub11_Sub1_3.method718();
				local427 = Static133.aClass4_Sub11_Sub1_3.method719() * 4;
				local46 = Static133.aClass4_Sub11_Sub1_3.method719() * 4;
				local461 = Static133.aClass4_Sub11_Sub1_3.method718();
				local56 = Static133.aClass4_Sub11_Sub1_3.method718();
				@Pc(1467) int local1467 = Static133.aClass4_Sub11_Sub1_3.method719();
				local64 = Static133.aClass4_Sub11_Sub1_3.method719();
				if (local308 >= 0 && local22 >= 0 && local308 < 104 && local22 < 104 && local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local34 != 65535) {
					local22 = local22 * 128 + 64;
					local308 = local308 * 128 + 64;
					local30 = local30 * 128 + 64;
					@Pc(1550) Class4_Sub1_Sub3_Sub6 local1550 = new Class4_Sub1_Sub3_Sub6(local34, Static37.anInt895, local308, local22, Static69.method1173(Static37.anInt895, local308, local22) - local427, Static117.anInt2877 + local461, Static117.anInt2877 + local56, local1467, local64, local38, local46);
					local26 = local26 * 128 + 64;
					local1550.method1752(local30, local26, local461 + Static117.anInt2877, -local46 + Static69.method1173(Static37.anInt895, local26, local30));
					Static73.aClass82_7.method2028(local1550);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIII)V")
	public static void method1157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub7 local8 = Static108.method1767(arg0, arg1);
		if (local8 != null && local8.anObjectArray20 != null) {
			@Pc(17) Class4_Sub3 local17 = new Class4_Sub3();
			local17.aClass4_Sub7_3 = local8;
			local17.anObjectArray1 = local8.anObjectArray20;
			Static133.method2036(local17);
		}
		Static123.anInt3082 = arg0;
		Static73.anInt1961 = arg2;
		Static37.anInt903 = arg1;
		Static128.aBoolean274 = true;
		Static110.method1772(local8);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Lclient!ue;")
	public static Class4_Sub21 method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class4_Sub21 local3 = new Class4_Sub21();
		local3.anInt2946 = arg0;
		local3.anInt2939 = arg1;
		Static90.aClass81_11.method2015((long) arg2, local3);
		Static18.method359(arg1);
		Static53.method1006(arg1);
		@Pc(34) Class4_Sub7 local34 = Static106.method1749(arg2);
		if (local34 != null) {
			Static110.method1772(local34);
		}
		if (Static43.aClass4_Sub7_9 != null) {
			Static110.method1772(Static43.aClass4_Sub7_9);
			Static43.aClass4_Sub7_9 = null;
		}
		Static22.aBoolean250 = false;
		Static99.anInt2589 = 0;
		Static51.method989(Static31.anInt801, Static101.anInt2612, Static39.anInt974, Static91.anInt2422);
		if (Static11.anInt2982 != -1) {
			Static130.method2006(Static11.anInt2982, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!vd;[B[Lclient!qf;II)V")
	public static void method1159(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class60[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class4_Sub11 local17 = new Class4_Sub11(arg2);
		while (true) {
			@Pc(21) int local21 = local17.method692();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local17.method692();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(47) int local47 = local29 >> 6 & 0x3F;
				@Pc(51) int local51 = local29 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local17.method719();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg0 + local47;
				@Pc(75) int local75 = arg4 + local51;
				if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
					@Pc(92) int local92 = local55;
					if ((Static3.aByteArrayArrayArray1[1][local71][local75] & 0x2) == 2) {
						local92 = local55 - 1;
					}
					@Pc(108) Class60 local108 = null;
					if (local92 >= 0) {
						local108 = arg3[local92];
					}
					Static90.method1577(arg1, local75, local63, local12, local67, local108, local55, local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1160() {
		aClass22_495 = null;
		aClass22_493 = null;
		aClass6_3 = null;
		aClass4_Sub1_Sub2_Sub3_3 = null;
		aClass82_6 = null;
		aClass22_496 = null;
		aClass22_494 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lclient!ac;")
	public static Class4_Sub1_Sub1 method1161(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub1 local10 = (Class4_Sub1_Sub1) Static51.aClass33_19.method998((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static60.aClass20_33.method597(14, arg0);
		local10 = new Class4_Sub1_Sub1();
		if (local28 != null) {
			local10.method36(new Class4_Sub11(local28));
		}
		Static51.aClass33_19.method997((long) arg0, local10);
		return local10;
	}
}
