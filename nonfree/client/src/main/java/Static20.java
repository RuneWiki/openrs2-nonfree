import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!e", name = "K", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!p;")
	public static Class45 aClass45_10;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!qc;")
	public static Class47 aClass47_5 = new Class47(64);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!o;")
	public static Class40 aClass40_131 = Static13.method257("huffman");

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!od;")
	public static Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	public static int anInt470 = 0;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "Lclient!o;")
	public static Class40 aClass40_132 = Static13.method257("flash1:");

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!o;")
	public static Class40 aClass40_133 = Static13.method257("@or3@");

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_134 = Static13.method257("@or1@");

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
	public static int[] anIntArray93 = new int[5];

	@OriginalMember(owner = "client!e", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_135 = Static13.method257(":0");

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt477 = -1;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method386() {
		aClass40_133 = null;
		aClass47_5 = null;
		aClass44_2 = null;
		aClass40_135 = null;
		aClass40_131 = null;
		anIntArray93 = null;
		aClass40_134 = null;
		anIntArray92 = null;
		anIntArray91 = null;
		aClass45_10 = null;
		aClass40_132 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I")
	public static int method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static4.method93(arg0 - 1, arg1 - 1) + Static4.method93(arg0 + 1, arg1 + -1) + Static4.method93(arg0 - 1, arg1 - -1) + Static4.method93(arg0 + 1, arg1 - -1);
		@Pc(74) int local74 = Static4.method93(arg0 - 1, arg1) + Static4.method93(arg0 + 1, arg1) + Static4.method93(arg0, arg1 + -1) + Static4.method93(arg0, arg1 + 1);
		@Pc(79) int local79 = Static4.method93(arg0, arg1);
		return local41 / 16 + local74 / 8 + local79 / 4;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	private static void method388() {
		@Pc(3) int local3 = -1;
		if (Static79.anInt1874 == 0 && Static24.anInt641 == 0) {
			Static21.method402(Static33.aClass40_239, 24, Static100.anInt2394, Static32.anInt742, 0);
		}
		for (@Pc(32) int local32 = 0; local32 < Static71.anInt1747; local32++) {
			@Pc(38) int local38 = Static71.anIntArray387[local32];
			@Pc(42) int local42 = local38 & 0x7F;
			@Pc(48) int local48 = local38 >> 7 & 0x7F;
			@Pc(54) int local54 = local38 >> 14 & 0x7FFF;
			@Pc(60) int local60 = local38 >> 29 & 0x3;
			if (local3 != local38) {
				local3 = local38;
				@Pc(119) int local119;
				if (local60 == 2 && Static93.aClass55_1.method1449(Static1.anInt8, local42, local48, local38) >= 0) {
					@Pc(83) Class2_Sub2_Sub10 local83 = Static91.method1470(local54);
					if (local83.anIntArray210 != null) {
						local83 = local83.method766();
					}
					if (local83 == null) {
						continue;
					}
					if (Static79.anInt1874 == 1) {
						Static21.method402(Static80.method1334(new Class40[] { Static27.aClass40_193, Static87.aClass40_601, Static56.aClass40_659, local83.aClass40_315 }), 9, local48, local42, local38);
					} else if (Static24.anInt641 != 1) {
						@Pc(109) Class40[] local109 = local83.aClass40Array20;
						if (Static36.aBoolean60) {
							local109 = Static87.method1404(local109);
						}
						if (local109 != null) {
							for (local119 = 4; local119 >= 0; local119--) {
								if (local109[local119] != null) {
									@Pc(131) short local131 = 0;
									if (local119 == 0) {
										local131 = 34;
									}
									if (local119 == 1) {
										local131 = 41;
									}
									if (local119 == 2) {
										local131 = 10;
									}
									if (local119 == 3) {
										local131 = 5;
									}
									if (local119 == 4) {
										local131 = 1004;
									}
									Static21.method402(Static80.method1334(new Class40[] { local109[local119], Static88.aClass40_602, local83.aClass40_315 }), local131, local48, local42, local38);
								}
							}
						}
						Static21.method402(Static80.method1334(new Class40[] { Static37.aClass40_286, local83.aClass40_315 }), 1005, local48, local42, local83.anInt1033 << 14);
					} else if ((Static86.anInt2027 & 0x4) == 4) {
						Static21.method402(Static80.method1334(new Class40[] { Static83.aClass40_567, Static88.aClass40_602, local83.aClass40_315 }), 6, local48, local42, local38);
					}
				}
				@Pc(316) int local316;
				@Pc(324) Class2_Sub2_Sub12_Sub1_Sub2 local324;
				@Pc(369) Class2_Sub2_Sub12_Sub1_Sub1 local369;
				if (local60 == 1) {
					@Pc(293) Class2_Sub2_Sub12_Sub1_Sub2 local293 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local54];
					if (local293.aClass2_Sub2_Sub7_1.anInt758 == 1 && (local293.anInt2275 & 0x7F) == 64 && (local293.anInt2284 & 0x7F) == 64) {
						for (local316 = 0; local316 < Static73.anInt1800; local316++) {
							local324 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Static63.anIntArray326[local316]];
							if (local324 != null && local324 != local293 && local324.aClass2_Sub2_Sub7_1.anInt758 == 1 && local324.anInt2275 == local293.anInt2275 && local324.anInt2284 == local293.anInt2284) {
								Static48.method822(Static63.anIntArray326[local316], local42, local324.aClass2_Sub2_Sub7_1, local48);
							}
						}
						for (local119 = 0; local119 < Static88.anInt2067; local119++) {
							local369 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static73.anIntArray408[local119]];
							if (local369 != null && local369.anInt2275 == local293.anInt2275 && local369.anInt2284 == local293.anInt2284) {
								Static102.method1638(local48, local369, local42, Static73.anIntArray408[local119]);
							}
						}
					}
					Static48.method822(local54, local42, local293.aClass2_Sub2_Sub7_1, local48);
				}
				if (local60 == 0) {
					@Pc(414) Class2_Sub2_Sub12_Sub1_Sub1 local414 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local54];
					if ((local414.anInt2275 & 0x7F) == 64 && (local414.anInt2284 & 0x7F) == 64) {
						for (local316 = 0; local316 < Static73.anInt1800; local316++) {
							local324 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Static63.anIntArray326[local316]];
							if (local324 != null && local324.aClass2_Sub2_Sub7_1.anInt758 == 1 && local324.anInt2275 == local414.anInt2275 && local414.anInt2284 == local324.anInt2284) {
								Static48.method822(Static63.anIntArray326[local316], local42, local324.aClass2_Sub2_Sub7_1, local48);
							}
						}
						for (local119 = 0; local119 < Static88.anInt2067; local119++) {
							local369 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static73.anIntArray408[local119]];
							if (local369 != null && local369 != local414 && local414.anInt2275 == local369.anInt2275 && local369.anInt2284 == local414.anInt2284) {
								Static102.method1638(local48, local369, local42, Static73.anIntArray408[local119]);
							}
						}
					}
					Static102.method1638(local48, local414, local42, local54);
				}
				if (local60 == 3) {
					@Pc(542) Class44 local542 = Static91.aClass44ArrayArrayArray1[Static1.anInt8][local42][local48];
					if (local542 != null) {
						for (@Pc(549) Class2_Sub2_Sub12_Sub3 local549 = (Class2_Sub2_Sub12_Sub3) local542.method1226(); local549 != null; local549 = (Class2_Sub2_Sub12_Sub3) local542.method1225()) {
							@Pc(558) Class2_Sub2_Sub8 local558 = Static105.method1669(local549.anInt1490);
							if (Static79.anInt1874 == 1) {
								Static21.method402(Static80.method1334(new Class40[] { Static27.aClass40_193, Static87.aClass40_601, Static86.aClass40_590, local558.aClass40_290 }), 11, local48, local42, local549.anInt1490);
							} else if (Static24.anInt641 != 1) {
								@Pc(607) Class40[] local607 = local558.aClass40Array17;
								if (Static36.aBoolean60) {
									local607 = Static87.method1404(local607);
								}
								for (@Pc(615) int local615 = 4; local615 >= 0; local615--) {
									if (local607 != null && local607[local615] != null) {
										@Pc(660) byte local660 = 0;
										if (local615 == 0) {
											local660 = 50;
										}
										if (local615 == 1) {
											local660 = 13;
										}
										if (local615 == 2) {
											local660 = 16;
										}
										if (local615 == 3) {
											local660 = 14;
										}
										if (local615 == 4) {
											local660 = 3;
										}
										Static21.method402(Static80.method1334(new Class40[] { local607[local615], Static85.aClass40_572, local558.aClass40_290 }), local660, local48, local42, local549.anInt1490);
									} else if (local615 == 2) {
										Static21.method402(Static80.method1334(new Class40[] { Static48.aClass40_345, local558.aClass40_290 }), 16, local48, local42, local549.anInt1490);
									}
								}
								Static21.method402(Static80.method1334(new Class40[] { Static12.aClass40_81, local558.aClass40_290 }), 1001, local48, local42, local549.anInt1490);
							} else if ((Static86.anInt2027 & 0x1) == 1) {
								Static21.method402(Static80.method1334(new Class40[] { Static83.aClass40_567, Static85.aClass40_572, local558.aClass40_290 }), 48, local48, local42, local549.anInt1490);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static void method389() {
		if (Static88.anInt2077 != 0) {
			return;
		}
		Static18.aClass40Array8[0] = Static52.aClass40_358;
		Static54.anIntArray287[0] = 1003;
		Static34.anInt797 = 1;
		if (Static84.anInt1971 != -1) {
			Static84.anInt1979 = -1;
			Static38.anInt982 = -1;
			Static79.method1276(Static100.anInt2394, 0, Static84.anInt1971, 765, 0, 0, Static32.anInt742, 503, -1, 0);
			Static41.anInt1012 = Static84.anInt1979;
			Static30.anInt721 = Static38.anInt982;
			return;
		}
		Static86.method1385();
		Static38.anInt982 = -1;
		Static84.anInt1979 = -1;
		if (Static32.anInt742 > 4 && Static100.anInt2394 > 4 && Static32.anInt742 < 516 && Static100.anInt2394 < 338) {
			if (Static22.anInt2585 == -1) {
				method388();
			} else {
				Static79.method1276(Static100.anInt2394, 4, Static22.anInt2585, 516, 0, 0, Static32.anInt742, 338, -1, 4);
			}
		}
		Static30.anInt721 = Static38.anInt982;
		Static41.anInt1012 = Static84.anInt1979;
		Static84.anInt1979 = -1;
		Static38.anInt982 = -1;
		if (Static32.anInt742 > 553 && Static100.anInt2394 > 205 && Static32.anInt742 < 743 && Static100.anInt2394 < 466) {
			if (Static66.anInt1654 != -1) {
				Static79.method1276(Static100.anInt2394, 553, Static66.anInt1654, 743, 0, 1, Static32.anInt742, 466, -1, 205);
			} else if (Static2.anIntArray2[Static62.anInt1551] != -1) {
				Static79.method1276(Static100.anInt2394, 553, Static2.anIntArray2[Static62.anInt1551], 743, 0, 1, Static32.anInt742, 466, -1, 205);
			}
		}
		if (Static58.anInt1496 != Static38.anInt982) {
			Static33.aBoolean59 = true;
			Static58.anInt1496 = Static38.anInt982;
		}
		Static38.anInt982 = -1;
		if (Static96.anInt2340 != Static84.anInt1979) {
			Static33.aBoolean59 = true;
			Static96.anInt2340 = Static84.anInt1979;
		}
		@Pc(175) boolean local175 = false;
		Static84.anInt1979 = -1;
		if (Static32.anInt742 > 17 && Static100.anInt2394 > 357 && Static32.anInt742 < 496 && Static100.anInt2394 < 453) {
			if (Static85.anInt1994 != -1) {
				Static79.method1276(Static100.anInt2394, 17, Static85.anInt1994, 496, 0, 2, Static32.anInt742, 453, -1, 357);
			} else if (Static38.anInt980 != -1) {
				Static79.method1276(Static100.anInt2394, 17, Static38.anInt980, 496, 0, 3, Static32.anInt742, 453, -1, 357);
			} else if (Static100.anInt2394 < 434 && Static32.anInt742 < 426) {
				Static101.method1590(Static100.anInt2394 - 357, Static32.anInt742 - 17);
			}
		}
		if ((Static85.anInt1994 != -1 || Static38.anInt980 != -1) && Static38.anInt982 != Static102.anInt2466) {
			Static73.aBoolean144 = true;
			Static102.anInt2466 = Static38.anInt982;
		}
		if ((Static85.anInt1994 != -1 || Static38.anInt980 != -1) && Static59.anInt1501 != Static84.anInt1979) {
			Static59.anInt1501 = Static84.anInt1979;
			Static73.aBoolean144 = true;
		}
		while (!local175) {
			local175 = true;
			for (@Pc(282) int local282 = 0; local282 < Static34.anInt797 - 1; local282++) {
				if (Static54.anIntArray287[local282] < 1000 && Static54.anIntArray287[local282 + 1] > 1000) {
					@Pc(302) Class40 local302 = Static18.aClass40Array8[local282];
					local175 = false;
					Static18.aClass40Array8[local282] = Static18.aClass40Array8[local282 + 1];
					Static18.aClass40Array8[local282 + 1] = local302;
					@Pc(322) int local322 = Static54.anIntArray287[local282];
					Static54.anIntArray287[local282] = Static54.anIntArray287[local282 + 1];
					Static54.anIntArray287[local282 + 1] = local322;
					@Pc(340) int local340 = Static35.anIntArray161[local282];
					Static35.anIntArray161[local282] = Static35.anIntArray161[local282 + 1];
					Static35.anIntArray161[local282 + 1] = local340;
					@Pc(358) int local358 = Static36.anIntArray165[local282];
					Static36.anIntArray165[local282] = Static36.anIntArray165[local282 + 1];
					Static36.anIntArray165[local282 + 1] = local358;
					@Pc(376) int local376 = Static88.anIntArray454[local282];
					Static88.anIntArray454[local282] = Static88.anIntArray454[local282 + 1];
					Static88.anIntArray454[local282 + 1] = local376;
				}
			}
		}
	}
}
