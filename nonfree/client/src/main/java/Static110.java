import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_26;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1643 = Static80.method1463("Loaded interfaces");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1641 = aClass63_1643;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1642 = Static80.method1463("leuchten1:");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1644 = Static80.method1463(" )2> @yel@");

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1645 = Static80.method1463("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1646 = Static80.method1463("Verbindung mit");

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	public static int[] anIntArray351 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1647 = Static80.method1463(" )2> @lre@");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1648 = Static80.method1463("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1649 = aClass63_1645;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	public static volatile int anInt3043 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method2034() {
		aClass63_1649 = null;
		aClass63_1642 = null;
		aClass6_Sub3_Sub3_Sub3_26 = null;
		aClass63_1645 = null;
		aClass63_1647 = null;
		aClass63_1644 = null;
		aClass63_1643 = null;
		aClass63_1641 = null;
		aClass63_1648 = null;
		anIntArray351 = null;
		aClass63_1646 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BZ)[B")
	public static byte[] method2035(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static129.method1440(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2036(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub4 local13 = new Class6_Sub4(arg0);
		@Pc(17) int local17 = local13.method1321();
		@Pc(21) int local21 = local13.method1289();
		if (local21 < 0 || Static81.anInt2212 != 0 && local21 > Static81.anInt2212) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(97) byte[] local97 = new byte[local21];
			local13.method1307(local97, local21);
			return local97;
		} else {
			@Pc(41) int local41 = local13.method1289();
			if (local41 < 0 || Static81.anInt2212 != 0 && Static81.anInt2212 < local41) {
				throw new RuntimeException();
			}
			@Pc(61) byte[] local61 = new byte[local41];
			if (local17 == 1) {
				Static27.method643(local61, local41, arg0, local21);
			} else {
				try {
					@Pc(77) DataInputStream local77 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local77.readFully(local61);
					local77.close();
				} catch (@Pc(84) IOException local84) {
				}
			}
			return local61;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBI)V")
	public static void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static11.anIntArrayArrayArray6[arg2][arg0 + local8][arg1 + local12] = 0;
			}
		}
		if (arg0 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static11.anIntArrayArrayArray6[arg2][arg0][arg1 + local12] = Static11.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 + local12];
			}
		}
		if (arg1 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static11.anIntArrayArrayArray6[arg2][local12 + arg0][arg1] = Static11.anIntArrayArrayArray6[arg2][local12 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static11.anIntArrayArrayArray6[arg2][arg0 - 1][arg1] != 0) {
			Static11.anIntArrayArrayArray6[arg2][arg0][arg1] = Static11.anIntArrayArrayArray6[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static11.anIntArrayArrayArray6[arg2][arg0][arg1 - 1] != 0) {
			Static11.anIntArrayArrayArray6[arg2][arg0][arg1] = Static11.anIntArrayArrayArray6[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static11.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static11.anIntArrayArrayArray6[arg2][arg0][arg1] = Static11.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIBI)I")
	public static int method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(45) int local45 = arg2 & 0x7F;
		@Pc(47) int local47 = arg0;
		if (arg0 < 3 && (Static103.aByteArrayArrayArray92[1][local7][local11] & 0x2) == 2) {
			local47 = arg0 + 1;
		}
		@Pc(95) int local95 = Static11.anIntArrayArrayArray6[local47][local7 + 1][local11 + 1] * local45 + Static11.anIntArrayArrayArray6[local47][local7][local11 + 1] * (128 - local45) >> 7;
		@Pc(99) int local99 = arg1 & 0x7F;
		@Pc(126) int local126 = Static11.anIntArrayArrayArray6[local47][local7][local11] * (128 - local45) + local45 * Static11.anIntArrayArrayArray6[local47][local7 + 1][local11] >> 7;
		return (128 - local99) * local126 + local95 * local99 >> 7;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method2039() {
		while (true) {
			if (Static88.aClass6_Sub4_Sub1_5.method1348(Static14.anInt464) >= 11) {
				@Pc(22) int local22 = Static88.aClass6_Sub4_Sub1_5.method1349(11);
				if (local22 != 2047) {
					@Pc(29) boolean local29 = false;
					if (Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local22] == null) {
						local29 = true;
						Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local22] = new Class6_Sub3_Sub1_Sub2_Sub2();
						if (Static14.aClass6_Sub4Array1[local22] != null) {
							Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local22].method1553(Static14.aClass6_Sub4Array1[local22]);
						}
					}
					Static114.anIntArray356[Static81.anInt2219++] = local22;
					@Pc(65) Class6_Sub3_Sub1_Sub2_Sub2 local65 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local22];
					local65.anInt2324 = Static73.anInt2064;
					@Pc(75) int local75 = Static68.anIntArray224[Static88.aClass6_Sub4_Sub1_5.method1349(3)];
					if (local29) {
						local65.anInt2301 = local75;
					}
					@Pc(85) int local85 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
					@Pc(90) int local90 = Static88.aClass6_Sub4_Sub1_5.method1349(5);
					if (local90 > 15) {
						local90 -= 32;
					}
					@Pc(101) int local101 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
					if (local101 == 1) {
						Static112.anIntArray355[Static43.anInt129++] = local22;
					}
					@Pc(119) int local119 = Static88.aClass6_Sub4_Sub1_5.method1349(5);
					if (local119 > 15) {
						local119 -= 32;
					}
					local65.method1547(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0] + local90, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0] + local119, local85 == 1);
					continue;
				}
			}
			Static88.aClass6_Sub4_Sub1_5.method1341();
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method2040() {
		@Pc(7) int local7 = -1;
		if (Static29.anInt939 == 0 && !Static42.aBoolean63) {
			Static19.method501(Static59.anInt1768, Static111.aClass63_1661, 0, Static102.anInt2823, 51, Static14.aClass63_321);
		}
		for (@Pc(36) int local36 = 0; local36 < Static26.anInt895; local36++) {
			@Pc(42) int local42 = Static26.anIntArray106[local36];
			@Pc(48) int local48 = local42 >> 7 & 0x7F;
			@Pc(54) int local54 = local42 >> 29 & 0x3;
			@Pc(58) int local58 = local42 & 0x7F;
			@Pc(64) int local64 = local42 >> 14 & 0x7FFF;
			if (local42 != local7) {
				local7 = local42;
				@Pc(158) int local158;
				if (local54 == 2 && Static76.aClass19_1.method697(Static101.anInt2810, local58, local48, local42) >= 0) {
					@Pc(88) Class6_Sub3_Sub10 local88 = Static123.method2172(local64);
					if (local88.anIntArray185 != null) {
						local88 = local88.method1123();
					}
					if (local88 == null) {
						continue;
					}
					if (Static29.anInt939 == 1) {
						Static19.method501(local48, Static15.method374(new Class63[] { Static1.aClass63_8, Static64.aClass63_980, local88.aClass63_882 }), local42, local58, 1, Static18.aClass63_385);
					} else if (!Static42.aBoolean63) {
						@Pc(148) Class63[] local148 = local88.aClass63Array15;
						if (Static72.aBoolean109) {
							local148 = Static79.method1453(local148);
						}
						if (local148 != null) {
							for (local158 = 4; local158 >= 0; local158--) {
								if (local148[local158] != null) {
									@Pc(170) short local170 = 0;
									if (local158 == 0) {
										local170 = 26;
									}
									if (local158 == 1) {
										local170 = 58;
									}
									if (local158 == 2) {
										local170 = 23;
									}
									if (local158 == 3) {
										local170 = 52;
									}
									if (local158 == 4) {
										local170 = 1002;
									}
									Static19.method501(local48, Static15.method374(new Class63[] { Static82.aClass63_1194, local88.aClass63_882 }), local42, local58, local170, local148[local158]);
								}
							}
						}
						Static19.method501(local48, Static15.method374(new Class63[] { Static82.aClass63_1194, local88.aClass63_882 }), local88.anInt1674 << 14, local58, 1006, Static117.aClass63_1621);
					} else if ((Static72.anInt2049 & 0x4) == 4) {
						Static19.method501(local48, Static15.method374(new Class63[] { Static50.aClass63_807, Static64.aClass63_980, local88.aClass63_882 }), local42, local58, 48, Static33.aClass63_613);
					}
				}
				@Pc(311) int local311;
				@Pc(319) Class6_Sub3_Sub1_Sub2_Sub1 local319;
				@Pc(368) Class6_Sub3_Sub1_Sub2_Sub2 local368;
				if (local54 == 1) {
					@Pc(288) Class6_Sub3_Sub1_Sub2_Sub1 local288 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local64];
					if (local288.aClass6_Sub3_Sub2_1.anInt466 == 1 && (local288.anInt2319 & 0x7F) == 64 && (local288.anInt2347 & 0x7F) == 64) {
						for (local311 = 0; local311 < Static22.anInt689; local311++) {
							local319 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local311]];
							if (local319 != null && local288 != local319 && local319.aClass6_Sub3_Sub2_1.anInt466 == 1 && local288.anInt2319 == local319.anInt2319 && local288.anInt2347 == local319.anInt2347) {
								Static34.method843(local319.aClass6_Sub3_Sub2_1, Static80.anIntArray247[local311], local48, local58);
							}
						}
						for (local158 = 0; local158 < Static81.anInt2219; local158++) {
							local368 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local158]];
							if (local368 != null && local368.anInt2319 == local288.anInt2319 && local288.anInt2347 == local368.anInt2347) {
								Static85.method1861(local368, Static114.anIntArray356[local158], local48, local58);
							}
						}
					}
					Static34.method843(local288.aClass6_Sub3_Sub2_1, local64, local48, local58);
				}
				if (local54 == 0) {
					@Pc(412) Class6_Sub3_Sub1_Sub2_Sub2 local412 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local64];
					if ((local412.anInt2319 & 0x7F) == 64 && (local412.anInt2347 & 0x7F) == 64) {
						for (local311 = 0; local311 < Static22.anInt689; local311++) {
							local319 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local311]];
							if (local319 != null && local319.aClass6_Sub3_Sub2_1.anInt466 == 1 && local412.anInt2319 == local319.anInt2319 && local319.anInt2347 == local412.anInt2347) {
								Static34.method843(local319.aClass6_Sub3_Sub2_1, Static80.anIntArray247[local311], local48, local58);
							}
						}
						for (local158 = 0; local158 < Static81.anInt2219; local158++) {
							local368 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local158]];
							if (local368 != null && local412 != local368 && local368.anInt2319 == local412.anInt2319 && local412.anInt2347 == local368.anInt2347) {
								Static85.method1861(local368, Static114.anIntArray356[local158], local48, local58);
							}
						}
					}
					Static85.method1861(local412, local64, local48, local58);
				}
				if (local54 == 3) {
					@Pc(532) Class1 local532 = Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local58][local48];
					if (local532 != null) {
						for (@Pc(539) Class6_Sub3_Sub1_Sub7 local539 = (Class6_Sub3_Sub1_Sub7) local532.method5(); local539 != null; local539 = (Class6_Sub3_Sub1_Sub7) local532.method1()) {
							@Pc(546) Class6_Sub3_Sub8 local546 = Static91.method1664(local539.anInt3087);
							if (Static29.anInt939 == 1) {
								Static19.method501(local48, Static15.method374(new Class63[] { Static1.aClass63_8, aClass63_1647, local546.aClass63_742 }), local539.anInt3087, local58, 47, Static18.aClass63_385);
							} else if (!Static42.aBoolean63) {
								@Pc(556) Class63[] local556 = local546.aClass63Array11;
								if (Static72.aBoolean109) {
									local556 = Static79.method1453(local556);
								}
								for (@Pc(568) int local568 = 4; local568 >= 0; local568--) {
									if (local556 != null && local556[local568] != null) {
										@Pc(582) byte local582 = 0;
										if (local568 == 0) {
											local582 = 12;
										}
										if (local568 == 1) {
											local582 = 53;
										}
										if (local568 == 2) {
											local582 = 3;
										}
										if (local568 == 3) {
											local582 = 40;
										}
										if (local568 == 4) {
											local582 = 10;
										}
										Static19.method501(local48, Static15.method374(new Class63[] { Static36.aClass63_646, local546.aClass63_742 }), local539.anInt3087, local58, local582, local556[local568]);
									} else if (local568 == 2) {
										Static19.method501(local48, Static15.method374(new Class63[] { Static36.aClass63_646, local546.aClass63_742 }), local539.anInt3087, local58, 3, Static118.aClass63_1740);
									}
								}
								Static19.method501(local48, Static15.method374(new Class63[] { Static36.aClass63_646, local546.aClass63_742 }), local539.anInt3087, local58, 1003, Static117.aClass63_1621);
							} else if ((Static72.anInt2049 & 0x1) == 1) {
								Static19.method501(local48, Static15.method374(new Class63[] { Static50.aClass63_807, aClass63_1647, local546.aClass63_742 }), local539.anInt3087, local58, 18, Static33.aClass63_613);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!wa;Lclient!wa;BI)Lclient!wa;")
	public static Class6_Sub3_Sub17 method2041(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub3_Sub17 arg1, @OriginalArg(2) Class6_Sub3_Sub17 arg2, @OriginalArg(4) int arg3) {
		@Pc(30) Class6_Sub3_Sub17 local30 = Static84.method1575(arg2.anInt3230, arg0, 0, arg2.anInt3243, arg3, Static68.aClass6_Sub3_Sub17ArrayArray1[arg2.anInt3233 >> 16], arg2.anInt3233, arg2.anInt3264, arg2.anInt3291, arg1, 0);
		if (local30 == null) {
			if (arg2.aClass6_Sub3_Sub17Array2 != null) {
				local30 = Static84.method1575(arg2.anInt3230, arg0, 0, arg2.anInt3243, arg3, arg2.aClass6_Sub3_Sub17Array2, arg2.anInt3233, arg2.anInt3264, arg2.anInt3291, arg1, 0);
			}
			return local30;
		} else {
			return local30;
		}
	}
}
