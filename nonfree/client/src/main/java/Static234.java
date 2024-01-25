import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
	public static int anInt4537;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_31 = new Class359(64);

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "[I")
	public static final int[] anIntArray232 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!ha;I)Lclient!cd;")
	public static Class53 method4144(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class92 local9 = Static228.method4065(arg0, true, arg1);
		return local9 == null ? null : local9.aClass53_2;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method4145(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static261.anInt5002 = 0;
		Static676.anInt10367 = 0;
		Static395.anInt6854++;
		@Pc(22) Class60_Sub1 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static403.aClass60_Sub1Array5[local6]; local22 != null; local22 = local22.aClass60_Sub1_23) {
				if (!Static299.method4829(local22, arg0, arg1, arg2, arg3)) {
					Static187.method3522(local22);
					if (local22.anInt9049 != -1) {
						Static434.aClass60_Sub1Array6[Static261.anInt5002++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static265.aClass60_Sub1Array4[local6]; local22 != null; local22 = local22.aClass60_Sub1_23) {
				if (!Static299.method4829(local22, arg0, arg1, arg2, arg3)) {
					Static187.method3522(local22);
					if (local22.anInt9049 != -1) {
						Static580.aClass60_Sub1Array7[Static676.anInt10367++] = local22;
					}
				}
			}
			for (@Pc(98) Class60_Sub1 local98 = Static535.aClass60_Sub1Array3[local6]; local98 != null; local98 = local98.aClass60_Sub1_23) {
				if (!Static299.method4829(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method7918()) {
						Static187.method3522(local98);
						if (local98.anInt9049 != -1) {
							Static580.aClass60_Sub1Array7[Static676.anInt10367++] = local98;
						}
					} else {
						Static187.method3522(local98);
						if (local98.anInt9049 != -1) {
							Static434.aClass60_Sub1Array6[Static261.anInt5002++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static243.anInt4671; local157++) {
					if (!Static299.method4829(Static469.aClass60_Sub1_Sub1Array1[local157], arg0, arg1, arg2, arg3)) {
						Static187.method3522(Static469.aClass60_Sub1_Sub1Array1[local157]);
						if (Static469.aClass60_Sub1_Sub1Array1[local157].anInt9049 != -1) {
							if (Static469.aClass60_Sub1_Sub1Array1[local157].method7918()) {
								Static580.aClass60_Sub1Array7[Static676.anInt10367++] = Static469.aClass60_Sub1_Sub1Array1[local157];
							} else {
								Static434.aClass60_Sub1Array6[Static261.anInt5002++] = Static469.aClass60_Sub1_Sub1Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static261.anInt5002 > 0) {
			Static407.method6251(Static434.aClass60_Sub1Array6, 0, Static261.anInt5002 - 1);
			for (local225 = 0; local225 < Static261.anInt5002; local225++) {
				Static298.method4811(Static434.aClass60_Sub1Array6[local225], arg6);
			}
		}
		if (Static519.aBoolean663) {
			Static277.aClass75_7.method6682(0, (Class6_Sub10[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static265.anInt5019; local225 < Static66.anInt802; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static488.aBooleanArrayArray4.length;
					if (Static599.anInt5622 + Static488.aBooleanArrayArray4.length > Static230.anInt4470) {
						local263 -= Static599.anInt5622 + Static488.aBooleanArrayArray4.length - Static230.anInt4470;
					}
					local157 = Static488.aBooleanArrayArray4[0].length;
					if (Static115.anInt2266 + Static488.aBooleanArrayArray4[0].length > Static63.anInt777) {
						local157 -= Static115.anInt2266 + Static488.aBooleanArrayArray4[0].length - Static63.anInt777;
					}
					local304 = Static544.aBooleanArrayArray6;
					if (Static681.aBoolean769) {
						if (Static398.aBoolean515) {
							local304 = Static195.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static473.anInt8080; local316 < local263; local316++) {
							local323 = local316 + Static599.anInt5622 - Static473.anInt8080;
							for (local325 = Static147.anInt3099; local325 < local157; local325++) {
								if (Static488.aBooleanArrayArray4[local316][local325] && !Static240.method4227(local225, local325 + Static115.anInt2266 - Static147.anInt3099, local323)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static398.aBoolean515) {
						if (arg4 >= 0) {
							Static555.aClass96Array3[local225].method8079(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static555.aClass96Array3[local225].method8082(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static261.anInt5003; local316++) {
							Static489.aClass15Array1[local316].method205(new Class60_Sub5(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static555.aClass96Array3[local225].method8079(Static506.anInt8446, Static676.anInt10368, Static382.anInt6636, Static544.aBooleanArrayArray6, true, arg4, arg5);
					} else {
						Static555.aClass96Array3[local225].method8082(Static506.anInt8446, Static676.anInt10368, Static382.anInt6636, Static544.aBooleanArrayArray6, true, arg5);
					}
				} else {
					local263 = Static488.aBooleanArrayArray4.length;
					if (Static599.anInt5622 + Static488.aBooleanArrayArray4.length > Static230.anInt4470) {
						local263 -= Static599.anInt5622 + Static488.aBooleanArrayArray4.length - Static230.anInt4470;
					}
					local157 = Static488.aBooleanArrayArray4[0].length;
					if (Static115.anInt2266 + Static488.aBooleanArrayArray4[0].length > Static63.anInt777) {
						local157 -= Static115.anInt2266 + Static488.aBooleanArrayArray4[0].length - Static63.anInt777;
					}
					local304 = Static544.aBooleanArrayArray6;
					if (Static681.aBoolean769) {
						if (Static398.aBoolean515) {
							local304 = Static195.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static473.anInt8080; local316 < local263; local316++) {
							local323 = local316 + Static599.anInt5622 - Static473.anInt8080;
							for (local325 = Static147.anInt3099; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static488.aBooleanArrayArray4[local316][local325]) {
									@Pc(344) int local344 = local325 + Static115.anInt2266 - Static147.anInt3099;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static334.aClass243ArrayArrayArray2[local346][local323][local344] != null && Static334.aClass243ArrayArrayArray2[local346][local323][local344].aByte97 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static240.method4227(local225, local344, local323)) {
												local304[local316][local325] = true;
												break;
											}
											local304[local316][local325] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static398.aBoolean515) {
						if (arg4 >= 0) {
							Static555.aClass96Array3[local225].method8079(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static555.aClass96Array3[local225].method8082(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static261.anInt5003; local316++) {
							Static489.aClass15Array1[local316].method205(new Class60_Sub5(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static555.aClass96Array3[local225].method8079(Static506.anInt8446, Static676.anInt10368, Static382.anInt6636, Static544.aBooleanArrayArray6, false, arg4, arg5);
					} else {
						Static555.aClass96Array3[local225].method8082(Static506.anInt8446, Static676.anInt10368, Static382.anInt6636, Static544.aBooleanArrayArray6, false, arg5);
					}
				}
			}
		}
		if (Static676.anInt10367 > 0) {
			Static16.method207(Static580.aClass60_Sub1Array7, 0, Static676.anInt10367 - 1);
			for (local225 = 0; local225 < Static676.anInt10367; local225++) {
				Static298.method4811(Static580.aClass60_Sub1Array7[local225], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(III)Z")
	public static boolean method4147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static669.method8875(arg0, arg1) | Static680.method8956(arg0, arg1) | Static116.method2163(arg1, arg0)) & Static153.method3056(arg1, arg0);
	}
}
