import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!hc;")
	public static Class51 aClass51_78;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[J")
	public static long[] aLongArray35 = new long[32];

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt5110 = 1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!se;II)I")
	public static int method3880(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray30 == null || arg1 >= arg0.anIntArrayArray30.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) byte local21 = 0;
			@Pc(26) int[] local26 = arg0.anIntArrayArray30[arg1];
			while (true) {
				@Pc(28) int local28 = 0;
				@Pc(33) int local33 = local26[local19++];
				@Pc(35) byte local35 = 0;
				if (local33 == 0) {
					return local17;
				}
				if (local33 == 1) {
					local28 = Static48.anIntArray106[local26[local19++]];
				}
				if (local33 == 15) {
					local35 = 1;
				}
				if (local33 == 16) {
					local35 = 2;
				}
				if (local33 == 17) {
					local35 = 3;
				}
				if (local33 == 2) {
					local28 = Static259.anIntArray466[local26[local19++]];
				}
				if (local33 == 3) {
					local28 = Static195.anIntArray339[local26[local19++]];
				}
				@Pc(101) int local101;
				@Pc(112) Class122 local112;
				@Pc(117) int local117;
				@Pc(129) int local129;
				if (local33 == 4) {
					local101 = local26[local19++] << 16;
					@Pc(108) int local108 = local101 + local26[local19++];
					local112 = Static206.method3444(local108);
					local117 = local26[local19++];
					if (local117 != -1 && (!Static93.method2006(local117).aBoolean189 || Static48.aBoolean81)) {
						for (local129 = 0; local129 < local112.anIntArray362.length; local129++) {
							if (local117 + 1 == local112.anIntArray362[local129]) {
								local28 += local112.anIntArray360[local129];
							}
						}
					}
				}
				if (local33 == 5) {
					local28 = Static91.anIntArray189[local26[local19++]];
				}
				if (local33 == 6) {
					local28 = Class125.anIntArray380[Static259.anIntArray466[local26[local19++]] - 1];
				}
				if (local33 == 7) {
					local28 = Static91.anIntArray189[local26[local19++]] * 100 / 46875;
				}
				if (local33 == 8) {
					local28 = Static83.aClass9_Sub1_Sub1_1.anInt356;
				}
				if (local33 == 9) {
					for (local101 = 0; local101 < 25; local101++) {
						if (Static164.aBooleanArray13[local101]) {
							local28 += Static259.anIntArray466[local101];
						}
					}
				}
				if (local33 == 10) {
					local101 = local26[local19++] << 16;
					local101 += local26[local19++];
					local112 = Static206.method3444(local101);
					local117 = local26[local19++];
					if (local117 != -1 && (!Static93.method2006(local117).aBoolean189 || Static48.aBoolean81)) {
						for (local129 = 0; local129 < local112.anIntArray362.length; local129++) {
							if (local117 + 1 == local112.anIntArray362[local129]) {
								local28 = 999999999;
								break;
							}
						}
					}
				}
				if (local33 == 11) {
					local28 = Static212.anInt4628;
				}
				if (local33 == 12) {
					local28 = Static198.anInt4582;
				}
				if (local33 == 13) {
					local101 = Static91.anIntArray189[local26[local19++]];
					@Pc(325) int local325 = local26[local19++];
					local28 = (local101 & 0x1 << local325) == 0 ? 0 : 1;
				}
				if (local33 == 14) {
					local101 = local26[local19++];
					local28 = Static250.method4062(local101);
				}
				if (local33 == 18) {
					local28 = (Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7) + Static64.anInt1786;
				}
				if (local33 == 19) {
					local28 = (Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7) + Static29.anInt907;
				}
				if (local33 == 20) {
					local28 = local26[local19++];
				}
				if (local35 == 0) {
					if (local21 == 0) {
						local17 += local28;
					}
					if (local21 == 1) {
						local17 -= local28;
					}
					if (local21 == 2 && local28 != 0) {
						local17 /= local28;
					}
					if (local21 == 3) {
						local17 *= local28;
					}
					local21 = 0;
				} else {
					local21 = local35;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method3881() {
		Static17.aClass79_2.method2489();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method3884() {
		@Pc(11) int local11 = Static58.aClass1_Sub13_Sub1_1.method1826(8);
		@Pc(24) int local24;
		if (local11 < Static238.anInt5146) {
			for (local24 = local11; local24 < Static238.anInt5146; local24++) {
				Static223.anIntArray429[Static186.anInt4188++] = Static237.anIntArray447[local24];
			}
		}
		if (Static238.anInt5146 < local11) {
			throw new RuntimeException("gppov1");
		}
		Static238.anInt5146 = 0;
		for (local24 = 0; local24 < local11; local24++) {
			@Pc(66) int local66 = Static237.anIntArray447[local24];
			@Pc(70) Class9_Sub1_Sub1 local70 = Static147.aClass9_Sub1_Sub1Array1[local66];
			@Pc(77) int local77 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			if (local77 == 0) {
				Static237.anIntArray447[Static238.anInt5146++] = local66;
				local70.anInt484 = Static156.anInt3722;
			} else {
				@Pc(97) int local97 = Static58.aClass1_Sub13_Sub1_1.method1826(2);
				if (local97 == 0) {
					Static237.anIntArray447[Static238.anInt5146++] = local66;
					local70.anInt484 = Static156.anInt3722;
					Static126.anIntArray244[Static253.anInt3818++] = local66;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static237.anIntArray447[Static238.anInt5146++] = local66;
						local70.anInt484 = Static156.anInt3722;
						local139 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
						local70.method210(1, local139);
						local149 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
						if (local149 == 1) {
							Static126.anIntArray244[Static253.anInt3818++] = local66;
						}
					} else if (local97 == 2) {
						Static237.anIntArray447[Static238.anInt5146++] = local66;
						local70.anInt484 = Static156.anInt3722;
						if (Static58.aClass1_Sub13_Sub1_1.method1826(1) == 1) {
							local139 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local70.method210(2, local139);
							local149 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local70.method210(2, local149);
						} else {
							local139 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local70.method210(0, local139);
						}
						local139 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
						if (local139 == 1) {
							Static126.anIntArray244[Static253.anInt3818++] = local66;
						}
					} else if (local97 == 3) {
						Static223.anIntArray429[Static186.anInt4188++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public static void method3885() {
		for (@Pc(1) int local1 = 0; local1 < Static256.anInt5440; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static94.anInt4252; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static239.anInt5153; local7++) {
					@Pc(16) Class1_Sub16 local16 = Static142.aClass1_Sub16ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class144 local21 = local16.aClass144_1;
						if (local21 != null && local21.aClass9_8.method3597()) {
							Static166.method2884(local21.aClass9_8, local1, local4, local7, 1, 1);
							if (local21.aClass9_9 != null && local21.aClass9_9.method3597()) {
								Static166.method2884(local21.aClass9_9, local1, local4, local7, 1, 1);
								local21.aClass9_8.method3596(local21.aClass9_9, 0, 0, 0, false);
								local21.aClass9_9 = local21.aClass9_9.method3595();
							}
							local21.aClass9_8 = local21.aClass9_8.method3595();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt2929; local77++) {
							@Pc(83) Class47 local83 = local16.aClass47Array1[local77];
							if (local83 != null && local83.aClass9_1.method3597()) {
								Static166.method2884(local83.aClass9_1, local1, local4, local7, local83.anInt2160 + 1 - local83.anInt2146, local83.anInt2158 - local83.anInt2148 + 1);
								local83.aClass9_1 = local83.aClass9_1.method3595();
							}
						}
						@Pc(125) Class148 local125 = local16.aClass148_1;
						if (local125 != null && local125.aClass9_10.method3597()) {
							Static227.method3786(local125.aClass9_10, local1, local4, local7);
							local125.aClass9_10 = local125.aClass9_10.method3595();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!ql;)V")
	public static void method3886(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (Static211.aClass5_15 == null) {
			return;
		}
		try {
			Static211.aClass5_15.method90(0L);
			Static211.aClass5_15.method85(arg0, 24, arg1.aByteArray29);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public static void method3887() {
		Static58.aClass1_Sub13_Sub1_1.method1817();
		@Pc(9) int local9 = Static58.aClass1_Sub13_Sub1_1.method1826(8);
		@Pc(14) int local14;
		if (local9 < Static16.anInt4955) {
			for (local14 = local9; local14 < Static16.anInt4955; local14++) {
				Static223.anIntArray429[Static186.anInt4188++] = Static142.anIntArray260[local14];
			}
		}
		if (Static16.anInt4955 < local9) {
			throw new RuntimeException("gnpov1");
		}
		Static16.anInt4955 = 0;
		for (local14 = 0; local14 < local9; local14++) {
			@Pc(54) int local54 = Static142.anIntArray260[local14];
			@Pc(58) Class9_Sub1_Sub2 local58 = Static36.aClass9_Sub1_Sub2Array2[local54];
			@Pc(65) int local65 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			if (local65 == 0) {
				Static142.anIntArray260[Static16.anInt4955++] = local54;
				local58.anInt484 = Static156.anInt3722;
			} else {
				@Pc(85) int local85 = Static58.aClass1_Sub13_Sub1_1.method1826(2);
				if (local85 == 0) {
					Static142.anIntArray260[Static16.anInt4955++] = local54;
					local58.anInt484 = Static156.anInt3722;
					Static126.anIntArray244[Static253.anInt3818++] = local54;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local85 == 1) {
						Static142.anIntArray260[Static16.anInt4955++] = local54;
						local58.anInt484 = Static156.anInt3722;
						local129 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
						local58.method210(1, local129);
						local139 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
						if (local139 == 1) {
							Static126.anIntArray244[Static253.anInt3818++] = local54;
						}
					} else if (local85 == 2) {
						Static142.anIntArray260[Static16.anInt4955++] = local54;
						local58.anInt484 = Static156.anInt3722;
						if (Static58.aClass1_Sub13_Sub1_1.method1826(1) == 1) {
							local129 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local58.method210(2, local129);
							local139 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local58.method210(2, local139);
						} else {
							local129 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
							local58.method210(0, local129);
						}
						local129 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
						if (local129 == 1) {
							Static126.anIntArray244[Static253.anInt3818++] = local54;
						}
					} else if (local85 == 3) {
						Static223.anIntArray429[Static186.anInt4188++] = local54;
					}
				}
			}
		}
	}
}
