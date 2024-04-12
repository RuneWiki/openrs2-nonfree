import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!e", name = "K", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!p;")
	public static Class45 aClass45_10;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 80)
	public static void method386() {
		Class18_Sub1.aClass40_133 = null;
		Class18_Sub1.aClass47_5 = null;
		Class18_Sub1.aClass44_2 = null;
		Class18_Sub1.aClass40_135 = null;
		Class18_Sub1.aClass40_131 = null;
		Class18_Sub1.anIntArray93 = null;
		Class18_Sub1.aClass40_134 = null;
		anIntArray92 = null;
		anIntArray91 = null;
		aClass45_10 = null;
		Class18_Sub1.aClass40_132 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I", line = 110)
	public static int method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static4.method93(arg0 - 1, arg1 - 1) + Static4.method93(arg0 + 1, arg1 + -1) + Static4.method93(arg0 - 1, arg1 - -1) + Static4.method93(arg0 + 1, arg1 - -1);
		@Pc(74) int local74 = Static4.method93(arg0 - 1, arg1) + Static4.method93(arg0 + 1, arg1) + Static4.method93(arg0, arg1 + -1) + Static4.method93(arg0, arg1 + 1);
		@Pc(79) int local79 = Static4.method93(arg0, arg1);
		return local41 / 16 + local74 / 8 + local79 / 4;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 228)
	private static void method388() {
		@Pc(3) int local3 = -1;
		if (Class18.anInt1874 == 0 && Class2_Sub2_Sub5.anInt641 == 0) {
			Static20.method402(Class2_Sub2_Sub7.aClass40_239, 24, Class2_Sub2_Sub15.anInt2394, Class2_Sub5.anInt742, 0);
		}
		for (@Pc(32) int local32 = 0; local32 < Class2_Sub2_Sub12_Sub4.anInt1747; local32++) {
			@Pc(38) int local38 = Class2_Sub2_Sub12_Sub4.anIntArray387[local32];
			@Pc(42) int local42 = local38 & 0x7F;
			@Pc(48) int local48 = local38 >> 7 & 0x7F;
			@Pc(54) int local54 = local38 >> 14 & 0x7FFF;
			@Pc(60) int local60 = local38 >> 29 & 0x3;
			if (local3 != local38) {
				local3 = local38;
				@Pc(119) int local119;
				if (local60 == 2 && Static85.aClass55_1.method1449(Static1.anInt8, local42, local48, local38) >= 0) {
					@Pc(83) Class2_Sub2_Sub10 local83 = Static83.method1470(local54);
					if (local83.anIntArray210 != null) {
						local83 = local83.method766();
					}
					if (local83 == null) {
						continue;
					}
					if (Class18.anInt1874 == 1) {
						Static20.method402(Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class2_Sub2_Sub12_Sub1.aClass40_659, local83.aClass40_315 }), 9, local48, local42, local38);
					} else if (Class2_Sub2_Sub5.anInt641 != 1) {
						@Pc(109) Class40[] local109 = local83.aClass40Array20;
						if (Class23.aBoolean60) {
							local109 = Static79.method1404(local109);
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
									Static20.method402(Static72.method1334(new Class40[] { local109[local119], Class54.aClass40_602, local83.aClass40_315 }), local131, local48, local42, local38);
								}
							}
						}
						Static20.method402(Static72.method1334(new Class40[] { Class2_Sub2_Sub8.aClass40_286, local83.aClass40_315 }), 1005, local48, local42, local83.anInt1033 << 14);
					} else if ((Static78.anInt2027 & 0x4) == 4) {
						Static20.method402(Static72.method1334(new Class40[] { Class51.aClass40_567, Class54.aClass40_602, local83.aClass40_315 }), 6, local48, local42, local38);
					}
				}
				@Pc(316) int local316;
				@Pc(324) Class2_Sub2_Sub12_Sub1_Sub2 local324;
				@Pc(369) Class2_Sub2_Sub12_Sub1_Sub1 local369;
				if (local60 == 1) {
					@Pc(293) Class2_Sub2_Sub12_Sub1_Sub2 local293 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local54];
					if (local293.aClass2_Sub2_Sub7_1.anInt758 == 1 && (local293.anInt2275 & 0x7F) == 64 && (local293.anInt2284 & 0x7F) == 64) {
						for (local316 = 0; local316 < Class41.anInt1800; local316++) {
							local324 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Class2_Sub2_Sub13.anIntArray326[local316]];
							if (local324 != null && local324 != local293 && local324.aClass2_Sub2_Sub7_1.anInt758 == 1 && local324.anInt2275 == local293.anInt2275 && local324.anInt2284 == local293.anInt2284) {
								Static44.method822(Class2_Sub2_Sub13.anIntArray326[local316], local42, local324.aClass2_Sub2_Sub7_1, local48);
							}
						}
						for (local119 = 0; local119 < Class54.anInt2067; local119++) {
							local369 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Class41.anIntArray408[local119]];
							if (local369 != null && local369.anInt2275 == local293.anInt2275 && local369.anInt2284 == local293.anInt2284) {
								Static94.method1638(local48, local369, local42, Class41.anIntArray408[local119]);
							}
						}
					}
					Static44.method822(local54, local42, local293.aClass2_Sub2_Sub7_1, local48);
				}
				if (local60 == 0) {
					@Pc(414) Class2_Sub2_Sub12_Sub1_Sub1 local414 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local54];
					if ((local414.anInt2275 & 0x7F) == 64 && (local414.anInt2284 & 0x7F) == 64) {
						for (local316 = 0; local316 < Class41.anInt1800; local316++) {
							local324 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Class2_Sub2_Sub13.anIntArray326[local316]];
							if (local324 != null && local324.aClass2_Sub2_Sub7_1.anInt758 == 1 && local324.anInt2275 == local414.anInt2275 && local414.anInt2284 == local324.anInt2284) {
								Static44.method822(Class2_Sub2_Sub13.anIntArray326[local316], local42, local324.aClass2_Sub2_Sub7_1, local48);
							}
						}
						for (local119 = 0; local119 < Class54.anInt2067; local119++) {
							local369 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Class41.anIntArray408[local119]];
							if (local369 != null && local369 != local414 && local414.anInt2275 == local369.anInt2275 && local369.anInt2284 == local414.anInt2284) {
								Static94.method1638(local48, local369, local42, Class41.anIntArray408[local119]);
							}
						}
					}
					Static94.method1638(local48, local414, local42, local54);
				}
				if (local60 == 3) {
					@Pc(542) Class44 local542 = Class57.aClass44ArrayArrayArray1[Static1.anInt8][local42][local48];
					if (local542 != null) {
						for (@Pc(549) Class2_Sub2_Sub12_Sub3 local549 = (Class2_Sub2_Sub12_Sub3) local542.method1226(); local549 != null; local549 = (Class2_Sub2_Sub12_Sub3) local542.method1225()) {
							@Pc(558) Class2_Sub2_Sub8 local558 = Static97.method1669(local549.anInt1490);
							if (Class18.anInt1874 == 1) {
								Static20.method402(Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class2_Sub2_Sub12_Sub5.aClass40_590, local558.aClass40_290 }), 11, local48, local42, local549.anInt1490);
							} else if (Class2_Sub2_Sub5.anInt641 != 1) {
								@Pc(607) Class40[] local607 = local558.aClass40Array17;
								if (Class23.aBoolean60) {
									local607 = Static79.method1404(local607);
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
										Static20.method402(Static72.method1334(new Class40[] { local607[local615], Class53.aClass40_572, local558.aClass40_290 }), local660, local48, local42, local549.anInt1490);
									} else if (local615 == 2) {
										Static20.method402(Static72.method1334(new Class40[] { Class12_Sub2.aClass40_345, local558.aClass40_290 }), 16, local48, local42, local549.anInt1490);
									}
								}
								Static20.method402(Static72.method1334(new Class40[] { Class2_Sub2_Sub3.aClass40_81, local558.aClass40_290 }), 1001, local48, local42, local549.anInt1490);
							} else if ((Static78.anInt2027 & 0x1) == 1) {
								Static20.method402(Static72.method1334(new Class40[] { Class51.aClass40_567, Class53.aClass40_572, local558.aClass40_290 }), 48, local48, local42, local549.anInt1490);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 519)
	public static void method389() {
		if (Class54.anInt2077 != 0) {
			return;
		}
		Class15.aClass40Array8[0] = Class30.aClass40_358;
		Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[0] = 1003;
		Class2_Sub6.anInt797 = 1;
		if (Class52.anInt1971 != -1) {
			Class52.anInt1979 = -1;
			Class25.anInt982 = -1;
			Static71.method1276(Class2_Sub2_Sub15.anInt2394, 0, Class52.anInt1971, 765, 0, 0, Class2_Sub5.anInt742, 503, -1, 0);
			Class2_Sub2_Sub9.anInt1012 = Class52.anInt1979;
			Class22.anInt721 = Class25.anInt982;
			return;
		}
		Static78.method1385();
		Class25.anInt982 = -1;
		Class52.anInt1979 = -1;
		if (Class2_Sub5.anInt742 > 4 && Class2_Sub2_Sub15.anInt2394 > 4 && Class2_Sub5.anInt742 < 516 && Class2_Sub2_Sub15.anInt2394 < 338) {
			if (Class2_Sub3.anInt2585 == -1) {
				method388();
			} else {
				Static71.method1276(Class2_Sub2_Sub15.anInt2394, 4, Class2_Sub3.anInt2585, 516, 0, 0, Class2_Sub5.anInt742, 338, -1, 4);
			}
		}
		Class22.anInt721 = Class25.anInt982;
		Class2_Sub2_Sub9.anInt1012 = Class52.anInt1979;
		Class52.anInt1979 = -1;
		Class25.anInt982 = -1;
		if (Class2_Sub5.anInt742 > 553 && Class2_Sub2_Sub15.anInt2394 > 205 && Class2_Sub5.anInt742 < 743 && Class2_Sub2_Sub15.anInt2394 < 466) {
			if (Class37.anInt1654 != -1) {
				Static71.method1276(Class2_Sub2_Sub15.anInt2394, 553, Class37.anInt1654, 743, 0, 1, Class2_Sub5.anInt742, 466, -1, 205);
			} else if (Class3.anIntArray2[Class35.anInt1551] != -1) {
				Static71.method1276(Class2_Sub2_Sub15.anInt2394, 553, Class3.anIntArray2[Class35.anInt1551], 743, 0, 1, Class2_Sub5.anInt742, 466, -1, 205);
			}
		}
		if (Class2_Sub2_Sub12_Sub3.anInt1496 != Class25.anInt982) {
			Class2_Sub2_Sub7.aBoolean59 = true;
			Class2_Sub2_Sub12_Sub3.anInt1496 = Class25.anInt982;
		}
		Class25.anInt982 = -1;
		if (Class2_Sub2_Sub12_Sub1_Sub2.anInt2340 != Class52.anInt1979) {
			Class2_Sub2_Sub7.aBoolean59 = true;
			Class2_Sub2_Sub12_Sub1_Sub2.anInt2340 = Class52.anInt1979;
		}
		@Pc(175) boolean local175 = false;
		Class52.anInt1979 = -1;
		if (Class2_Sub5.anInt742 > 17 && Class2_Sub2_Sub15.anInt2394 > 357 && Class2_Sub5.anInt742 < 496 && Class2_Sub2_Sub15.anInt2394 < 453) {
			if (Class53.anInt1994 != -1) {
				Static71.method1276(Class2_Sub2_Sub15.anInt2394, 17, Class53.anInt1994, 496, 0, 2, Class2_Sub5.anInt742, 453, -1, 357);
			} else if (Class25.anInt980 != -1) {
				Static71.method1276(Class2_Sub2_Sub15.anInt2394, 17, Class25.anInt980, 496, 0, 3, Class2_Sub5.anInt742, 453, -1, 357);
			} else if (Class2_Sub2_Sub15.anInt2394 < 434 && Class2_Sub5.anInt742 < 426) {
				Static93.method1590(Class2_Sub2_Sub15.anInt2394 - 357, Class2_Sub5.anInt742 - 17);
			}
		}
		if ((Class53.anInt1994 != -1 || Class25.anInt980 != -1) && Class25.anInt982 != Class2_Sub2_Sub16.anInt2466) {
			Class41.aBoolean144 = true;
			Class2_Sub2_Sub16.anInt2466 = Class25.anInt982;
		}
		if ((Class53.anInt1994 != -1 || Class25.anInt980 != -1) && Class32.anInt1501 != Class52.anInt1979) {
			Class32.anInt1501 = Class52.anInt1979;
			Class41.aBoolean144 = true;
		}
		while (!local175) {
			local175 = true;
			for (@Pc(282) int local282 = 0; local282 < Class2_Sub6.anInt797 - 1; local282++) {
				if (Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282] < 1000 && Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282 + 1] > 1000) {
					@Pc(302) Class40 local302 = Class15.aClass40Array8[local282];
					local175 = false;
					Class15.aClass40Array8[local282] = Class15.aClass40Array8[local282 + 1];
					Class15.aClass40Array8[local282 + 1] = local302;
					@Pc(322) int local322 = Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282];
					Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282] = Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282 + 1];
					Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[local282 + 1] = local322;
					@Pc(340) int local340 = Class2_Sub7.anIntArray161[local282];
					Class2_Sub7.anIntArray161[local282] = Class2_Sub7.anIntArray161[local282 + 1];
					Class2_Sub7.anIntArray161[local282 + 1] = local340;
					@Pc(358) int local358 = Class23.anIntArray165[local282];
					Class23.anIntArray165[local282] = Class23.anIntArray165[local282 + 1];
					Class23.anIntArray165[local282 + 1] = local358;
					@Pc(376) int local376 = Class54.anIntArray454[local282];
					Class54.anIntArray454[local282] = Class54.anIntArray454[local282 + 1];
					Class54.anIntArray454[local282 + 1] = local376;
				}
			}
		}
	}
}
