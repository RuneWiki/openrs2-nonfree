import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt4361;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1467 = Static49.method1293("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1468 = Static49.method1293("Die Verbindung konnte");

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1469 = Static49.method1293(" <col=ffffff>");

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1470 = Static49.method1293("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
	public static int[] anIntArray418 = new int[32];

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1472 = Static49.method1293("Type");

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1471 = aClass70_1472;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method3349() {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(80) int local80;
		@Pc(28) int local28;
		if (Static98.anInt2835 == 83) {
			local12 = Static98.aClass1_Sub9_Sub1_2.method1234();
			local21 = Static152.anInt2185 + (local12 >> 4 & 0x7);
			local28 = Static100.anInt2854 + (local12 & 0x7);
			local34 = local21 + Static98.aClass1_Sub9_Sub1_2.method1243();
			local42 = local28 + Static98.aClass1_Sub9_Sub1_2.method1243();
			local48 = Static98.aClass1_Sub9_Sub1_2.method1279();
			local52 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local58 = Static98.aClass1_Sub9_Sub1_2.method1234() * 4;
			local64 = Static98.aClass1_Sub9_Sub1_2.method1234() * 4;
			local68 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local72 = Static98.aClass1_Sub9_Sub1_2.method1280();
			@Pc(76) int local76 = Static98.aClass1_Sub9_Sub1_2.method1234();
			local80 = Static98.aClass1_Sub9_Sub1_2.method1234();
			if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104 && local34 >= 0 && local42 >= 0 && local34 < 104 && local42 < 104 && local52 != 65535) {
				local34 = local34 * 128 + 64;
				local42 = local42 * 128 + 64;
				local21 = local21 * 128 + 64;
				local28 = local28 * 128 + 64;
				@Pc(162) Class1_Sub1_Sub4_Sub7 local162 = new Class1_Sub1_Sub4_Sub7(local52, Static56.anInt1784, local21, local28, Static156.method3142(local21, Static56.anInt1784, local28) - local58, local68 - -Static47.anInt1654, Static47.anInt1654 + local72, local76, local80, local48, local64);
				local162.method3070(Static156.method3142(local34, Static56.anInt1784, local42) - local64, local42, local68 + Static47.anInt1654, local34);
				Static144.aClass4_14.method179(local162);
			}
		} else if (Static98.anInt2835 == 53) {
			local12 = Static98.aClass1_Sub9_Sub1_2.method1268();
			local21 = (local12 >> 4 & 0x7) + Static152.anInt2185;
			local28 = Static100.anInt2854 + (local12 & 0x7);
			local34 = Static98.aClass1_Sub9_Sub1_2.method1268();
			local48 = local34 & 0x3;
			local42 = local34 >> 2;
			local52 = Static135.anIntArray336[local42];
			if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
				Static37.method960(local42, 0, local48, -1, -1, local28, Static56.anInt1784, local21, local52);
			}
		} else if (Static98.anInt2835 == 27) {
			local12 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local21 = Static98.aClass1_Sub9_Sub1_2.method1240();
			local28 = Static152.anInt2185 + (local21 >> 4 & 0x7);
			local34 = Static100.anInt2854 + (local21 & 0x7);
			local42 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local48 = Static98.aClass1_Sub9_Sub1_2.method1239();
			if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104 && local12 != Static177.anInt4484) {
				@Pc(312) Class1_Sub1_Sub4_Sub6 local312 = new Class1_Sub1_Sub4_Sub6();
				local312.anInt3603 = local48;
				local312.anInt3602 = local42;
				if (Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34] == null) {
					Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34] = new Class4();
				}
				Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34].method179(local312);
				Static81.method1834(local34, local28);
			}
		} else {
			@Pc(407) Class1_Sub1_Sub4_Sub6 local407;
			if (Static98.anInt2835 == 109) {
				local12 = Static98.aClass1_Sub9_Sub1_2.method1239();
				local21 = Static98.aClass1_Sub9_Sub1_2.method1268();
				local28 = (local21 >> 4 & 0x7) + Static152.anInt2185;
				local34 = Static100.anInt2854 + (local21 & 0x7);
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					@Pc(400) Class4 local400 = Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34];
					if (local400 != null) {
						for (local407 = (Class1_Sub1_Sub4_Sub6) local400.method174(); local407 != null; local407 = (Class1_Sub1_Sub4_Sub6) local400.method181()) {
							if ((local12 & 0x7FFF) == local407.anInt3603) {
								local407.method3499();
								break;
							}
						}
						if (local400.method174() == null) {
							Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34] = null;
						}
						Static81.method1834(local34, local28);
					}
				}
			} else if (Static98.anInt2835 == 107) {
				local12 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local28 = (local12 & 0x7) + Static100.anInt2854;
				local21 = Static152.anInt2185 + (local12 >> 4 & 0x7);
				local34 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local42 = local34 >> 2;
				local48 = local34 & 0x3;
				local52 = Static135.anIntArray336[local42];
				local58 = Static98.aClass1_Sub9_Sub1_2.method1239();
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					Static37.method960(local42, 0, local48, -1, local58, local28, Static56.anInt1784, local21, local52);
				}
			} else if (Static98.anInt2835 == 248) {
				local12 = Static98.aClass1_Sub9_Sub1_2.method1239();
				local21 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local28 = (local21 >> 4 & 0x7) + Static152.anInt2185;
				local34 = (local21 & 0x7) + Static100.anInt2854;
				local42 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					local407 = new Class1_Sub1_Sub4_Sub6();
					local407.anInt3602 = local12;
					local407.anInt3603 = local42;
					if (Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34] == null) {
						Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34] = new Class4();
					}
					Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local28][local34].method179(local407);
					Static81.method1834(local34, local28);
				}
			} else if (Static98.anInt2835 == 198) {
				local12 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local21 = Static152.anInt2185 + (local12 >> 4 & 0x7);
				local28 = Static100.anInt2854 + (local12 & 0x7);
				local34 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local42 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local48 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					@Pc(660) Class4 local660 = Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local21][local28];
					if (local660 != null) {
						for (@Pc(667) Class1_Sub1_Sub4_Sub6 local667 = (Class1_Sub1_Sub4_Sub6) local660.method174(); local667 != null; local667 = (Class1_Sub1_Sub4_Sub6) local660.method181()) {
							if ((local34 & 0x7FFF) == local667.anInt3603 && local667.anInt3602 == local42) {
								local667.anInt3602 = local48;
								break;
							}
						}
						Static81.method1834(local28, local21);
					}
				}
			} else {
				if (Static98.anInt2835 == 212) {
					local12 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local21 = Static98.aClass1_Sub9_Sub1_2.method1280();
					@Pc(713) byte local713 = Static98.aClass1_Sub9_Sub1_2.method1271();
					local34 = Static98.aClass1_Sub9_Sub1_2.method1277();
					local42 = Static98.aClass1_Sub9_Sub1_2.method1240();
					local52 = local42 & 0x3;
					local48 = local42 >> 2;
					local58 = Static135.anIntArray336[local48];
					local64 = Static98.aClass1_Sub9_Sub1_2.method1240();
					local72 = Static100.anInt2854 + (local64 & 0x7);
					local68 = (local64 >> 4 & 0x7) + Static152.anInt2185;
					@Pc(755) byte local755 = Static98.aClass1_Sub9_Sub1_2.method1243();
					local80 = Static98.aClass1_Sub9_Sub1_2.method1280();
					@Pc(763) byte local763 = Static98.aClass1_Sub9_Sub1_2.method1278();
					@Pc(767) byte local767 = Static98.aClass1_Sub9_Sub1_2.method1271();
					@Pc(778) Class1_Sub1_Sub4_Sub2_Sub1 local778;
					if (local12 == Static177.anInt4484) {
						local778 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1;
					} else {
						local778 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local12];
					}
					if (local778 != null) {
						@Pc(788) Class1_Sub1_Sub7 local788 = Static176.method3433(local80);
						@Pc(799) int local799;
						@Pc(802) int local802;
						if (local52 == 1 || local52 == 3) {
							local799 = local788.anInt1813;
							local802 = local788.anInt1818;
						} else {
							local799 = local788.anInt1818;
							local802 = local788.anInt1813;
						}
						@Pc(818) int local818 = (local802 + 1 >> 1) + local72;
						@Pc(824) int local824 = local68 + (local799 >> 1);
						@Pc(832) int local832 = (local799 + 1 >> 1) + local68;
						@Pc(838) int local838 = local72 + (local802 >> 1);
						@Pc(847) int local847 = (local68 << 7) + (local799 << 6);
						@Pc(851) int[][] local851 = Static142.anIntArrayArrayArray8[Static56.anInt1784];
						@Pc(859) int local859 = (local802 << 6) + (local72 << 7);
						@Pc(886) int local886 = local851[local824][local818] + local851[local832][local838] + local851[local824][local838] + local851[local832][local818] >> 2;
						@Pc(896) Class1_Sub1_Sub4_Sub1 local896 = local788.method1397(local847, local48, local886, local851, local859, local52);
						if (local896 != null) {
							Static37.method960(0, local21 + 1, 0, local34 + 1, -1, local72, Static56.anInt1784, local68, local58);
							local778.aClass1_Sub1_Sub4_Sub1_1 = local896;
							local778.anInt1299 = local21 + Static47.anInt1654;
							local778.anInt1312 = Static47.anInt1654 + local34;
							local778.anInt1305 = local72 * 128 + local802 * 64;
							@Pc(945) byte local945;
							if (local755 > local713) {
								local945 = local755;
								local755 = local713;
								local713 = local945;
							}
							local778.anInt1296 = local68 + local755;
							if (local767 > local763) {
								local945 = local767;
								local767 = local763;
								local763 = local945;
							}
							local778.anInt1303 = local72 + local763;
							local778.anInt1306 = local68 * 128 + local799 * 64;
							local778.anInt1297 = local886;
							local778.anInt1295 = local72 + local767;
							local778.anInt1311 = local713 + local68;
						}
					}
				}
				if (Static98.anInt2835 == 179) {
					local12 = Static98.aClass1_Sub9_Sub1_2.method1234();
					local21 = (local12 >> 4 & 0x7) + Static152.anInt2185;
					local28 = Static100.anInt2854 + (local12 & 0x7);
					local34 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local42 = Static98.aClass1_Sub9_Sub1_2.method1234();
					local48 = Static98.aClass1_Sub9_Sub1_2.method1280();
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
						local28 = local28 * 128 + 64;
						local21 = local21 * 128 + 64;
						@Pc(1078) Class1_Sub1_Sub4_Sub5 local1078 = new Class1_Sub1_Sub4_Sub5(local34, Static56.anInt1784, local21, local28, Static156.method3142(local21, Static56.anInt1784, local28) - local42, local48, Static47.anInt1654);
						Static72.aClass4_8.method179(local1078);
					}
				} else {
					if (Static98.anInt2835 == 121) {
						local12 = Static98.aClass1_Sub9_Sub1_2.method1234();
						local21 = (local12 >> 4 & 0x7) + Static152.anInt2185;
						local28 = (local12 & 0x7) + Static100.anInt2854;
						local34 = Static98.aClass1_Sub9_Sub1_2.method1280();
						if (local34 == 65535) {
							local34 = -1;
						}
						local42 = Static98.aClass1_Sub9_Sub1_2.method1234();
						local48 = local42 >> 4 & 0xF;
						local52 = local42 & 0x7;
						local58 = Static98.aClass1_Sub9_Sub1_2.method1234();
						if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
							local64 = local48 + 1;
							if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0] >= local21 - local64 && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0] <= local21 + local64 && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0] >= local28 - local64 && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0] <= local64 + local28 && Static140.anInt3678 != 0 && local52 > 0 && Static88.anInt2601 < 50 && local34 != -1) {
								Static15.anIntArray30[Static88.anInt2601] = local34;
								Static30.anIntArray98[Static88.anInt2601] = local52;
								Static166.anIntArray411[Static88.anInt2601] = local58;
								Static12.aClass47Array1[Static88.anInt2601] = null;
								Static179.anIntArray426[Static88.anInt2601] = (local21 << 16) + (local28 << 8) + local48;
								Static88.anInt2601++;
							}
						}
					}
					if (Static98.anInt2835 == 127) {
						local12 = Static98.aClass1_Sub9_Sub1_2.method1240();
						local21 = local12 >> 2;
						local28 = local12 & 0x3;
						local34 = Static135.anIntArray336[local21];
						local42 = Static98.aClass1_Sub9_Sub1_2.method1280();
						local48 = Static98.aClass1_Sub9_Sub1_2.method1240();
						local52 = Static152.anInt2185 + (local48 >> 4 & 0x7);
						local58 = Static100.anInt2854 + (local48 & 0x7);
						if (local52 >= 0 && local58 >= 0 && local52 < 103 && local58 < 103) {
							if (local34 == 0) {
								@Pc(1310) Class34 local1310 = Static167.method3334(Static56.anInt1784, local52, local58);
								if (local1310 != null) {
									local68 = (int) (local1310.aLong59 >>> 32) & Integer.MAX_VALUE;
									if (local21 == 2) {
										local1310.aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4_Sub4(local68, 2, local28 + 4, Static56.anInt1784, local52, local58, local42, false, local1310.aClass1_Sub1_Sub4_2);
										local1310.aClass1_Sub1_Sub4_3 = new Class1_Sub1_Sub4_Sub4(local68, 2, local28 + 1 & 0x3, Static56.anInt1784, local52, local58, local42, false, local1310.aClass1_Sub1_Sub4_3);
									} else {
										local1310.aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4_Sub4(local68, local21, local28, Static56.anInt1784, local52, local58, local42, false, local1310.aClass1_Sub1_Sub4_2);
									}
								}
							}
							if (local34 == 1) {
								@Pc(1386) Class54 local1386 = Static36.method924(Static56.anInt1784, local52, local58);
								if (local1386 != null) {
									local68 = Integer.MAX_VALUE & (int) (local1386.aLong100 >>> 32);
									if (local21 == 4 || local21 == 5) {
										local1386.aClass1_Sub1_Sub4_6 = new Class1_Sub1_Sub4_Sub4(local68, 4, local28, Static56.anInt1784, local52, local58, local42, false, local1386.aClass1_Sub1_Sub4_6);
									} else if (local21 == 6) {
										local1386.aClass1_Sub1_Sub4_6 = new Class1_Sub1_Sub4_Sub4(local68, 4, local28 + 4, Static56.anInt1784, local52, local58, local42, false, local1386.aClass1_Sub1_Sub4_6);
									} else if (local21 == 7) {
										local1386.aClass1_Sub1_Sub4_6 = new Class1_Sub1_Sub4_Sub4(local68, 4, (local28 + 2 & 0x3) + 4, Static56.anInt1784, local52, local58, local42, false, local1386.aClass1_Sub1_Sub4_6);
									} else if (local21 == 8) {
										local1386.aClass1_Sub1_Sub4_6 = new Class1_Sub1_Sub4_Sub4(local68, 4, local28 + 4, Static56.anInt1784, local52, local58, local42, false, local1386.aClass1_Sub1_Sub4_6);
										local1386.aClass1_Sub1_Sub4_5 = new Class1_Sub1_Sub4_Sub4(local68, 4, (local28 + 2 & 0x3) + 4, Static56.anInt1784, local52, local58, local42, false, local1386.aClass1_Sub1_Sub4_5);
									}
								}
							}
							if (local34 == 2) {
								if (local21 == 11) {
									local21 = 10;
								}
								@Pc(1527) Class53 local1527 = Static8.method247(Static56.anInt1784, local52, local58);
								if (local1527 != null) {
									local1527.aClass1_Sub1_Sub4_4 = new Class1_Sub1_Sub4_Sub4((int) (local1527.aLong99 >>> 32) & Integer.MAX_VALUE, local21, local28, Static56.anInt1784, local52, local58, local42, false, local1527.aClass1_Sub1_Sub4_4);
								}
							}
							if (local34 == 3) {
								@Pc(1558) Class7 local1558 = Static164.method3274(Static56.anInt1784, local52, local58);
								if (local1558 != null) {
									local1558.aClass1_Sub1_Sub4_1 = new Class1_Sub1_Sub4_Sub4((int) (local1558.aLong15 >>> 32) & Integer.MAX_VALUE, 22, local28, Static56.anInt1784, local52, local58, local42, false, local1558.aClass1_Sub1_Sub4_1);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public static void method3351() {
		anIntArrayArray38 = null;
		aBigInteger3 = null;
		aClass70_1468 = null;
		aClass70_1469 = null;
		aClass70_1467 = null;
		aClass70_1472 = null;
		anIntArray418 = null;
		aClass70_1470 = null;
		aClass70_1471 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
	public static void method3352(@OriginalArg(0) int arg0) {
		if (!Static106.method2213(arg0)) {
			return;
		}
		@Pc(14) Class39[] local14 = Static77.aClass39ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(28) Class39 local28 = local14[local16];
			if (local28 != null) {
				local28.anInt2319 = 0;
				local28.anInt2357 = 0;
			}
		}
	}
}
