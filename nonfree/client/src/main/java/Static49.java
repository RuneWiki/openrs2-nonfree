import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg1, 6);
		local14.method7441();
		local14.anInt8635 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method899(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static347.anInt5727 = 0;
		Static574.anInt8994 = 0;
		Static489.anInt7963++;
		@Pc(22) Class4_Sub1 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static623.aClass4_Sub1Array11[local6]; local22 != null; local22 = local22.aClass4_Sub1_23) {
				if (!Static347.method5133(local22, arg0, arg1, arg2, arg3)) {
					Static244.method3875(local22);
					if (local22.anInt9798 != -1) {
						Static552.aClass4_Sub1Array10[Static347.anInt5727++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static194.aClass4_Sub1Array13[local6]; local22 != null; local22 = local22.aClass4_Sub1_23) {
				if (!Static347.method5133(local22, arg0, arg1, arg2, arg3)) {
					Static244.method3875(local22);
					if (local22.anInt9798 != -1) {
						Static388.aClass4_Sub1Array8[Static574.anInt8994++] = local22;
					}
				}
			}
			for (@Pc(98) Class4_Sub1 local98 = Static321.aClass4_Sub1Array5[local6]; local98 != null; local98 = local98.aClass4_Sub1_23) {
				if (!Static347.method5133(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method8344()) {
						Static244.method3875(local98);
						if (local98.anInt9798 != -1) {
							Static388.aClass4_Sub1Array8[Static574.anInt8994++] = local98;
						}
					} else {
						Static244.method3875(local98);
						if (local98.anInt9798 != -1) {
							Static552.aClass4_Sub1Array10[Static347.anInt5727++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static107.anInt1735; local157++) {
					if (!Static347.method5133(Static414.aClass4_Sub1_Sub1Array1[local157], arg0, arg1, arg2, arg3)) {
						Static244.method3875(Static414.aClass4_Sub1_Sub1Array1[local157]);
						if (Static414.aClass4_Sub1_Sub1Array1[local157].anInt9798 != -1) {
							if (Static414.aClass4_Sub1_Sub1Array1[local157].method8344()) {
								Static388.aClass4_Sub1Array8[Static574.anInt8994++] = Static414.aClass4_Sub1_Sub1Array1[local157];
							} else {
								Static552.aClass4_Sub1Array10[Static347.anInt5727++] = Static414.aClass4_Sub1_Sub1Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static347.anInt5727 > 0) {
			Static102.method1576(Static552.aClass4_Sub1Array10, 0, Static347.anInt5727 - 1);
			for (local225 = 0; local225 < Static347.anInt5727; local225++) {
				Static608.method8370(Static552.aClass4_Sub1Array10[local225], arg6);
			}
		}
		if (Static342.aBoolean380) {
			Static44.aClass100_1.method8609(0, (Class5_Sub12[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static255.anInt6561; local225 < Static237.anInt4100; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static407.aBooleanArrayArray8.length;
					if (Static603.anInt9713 + Static407.aBooleanArrayArray8.length > Static672.anInt10829) {
						local263 -= Static603.anInt9713 + Static407.aBooleanArrayArray8.length - Static672.anInt10829;
					}
					local157 = Static407.aBooleanArrayArray8[0].length;
					if (Static57.anInt1008 + Static407.aBooleanArrayArray8[0].length > Static532.anInt8517) {
						local157 -= Static57.anInt1008 + Static407.aBooleanArrayArray8[0].length - Static532.anInt8517;
					}
					local304 = Static241.aBooleanArrayArray5;
					if (Static603.aBoolean683) {
						if (Static205.aBoolean259) {
							local304 = Static115.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static110.anInt9533; local316 < local263; local316++) {
							local323 = local316 + Static603.anInt9713 - Static110.anInt9533;
							for (local325 = Static13.anInt168; local325 < local157; local325++) {
								if (Static407.aBooleanArrayArray8[local316][local325] && !Static339.method5086(local323, local225, local325 + Static57.anInt1008 - Static13.anInt168)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static205.aBoolean259) {
						if (arg4 >= 0) {
							Static177.aClass84Array2[local225].method7626(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static177.aClass84Array2[local225].method7618(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static549.anInt8710; local316++) {
							Static57.aClass287Array1[local316].method6431(new Class4_Sub5(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static177.aClass84Array2[local225].method7626(Static220.anInt3838, Static377.anInt6335, Static553.anInt8738, Static241.aBooleanArrayArray5, true, arg4, arg5);
					} else {
						Static177.aClass84Array2[local225].method7618(Static220.anInt3838, Static377.anInt6335, Static553.anInt8738, Static241.aBooleanArrayArray5, true, arg5);
					}
				} else {
					local263 = Static407.aBooleanArrayArray8.length;
					if (Static603.anInt9713 + Static407.aBooleanArrayArray8.length > Static672.anInt10829) {
						local263 -= Static603.anInt9713 + Static407.aBooleanArrayArray8.length - Static672.anInt10829;
					}
					local157 = Static407.aBooleanArrayArray8[0].length;
					if (Static57.anInt1008 + Static407.aBooleanArrayArray8[0].length > Static532.anInt8517) {
						local157 -= Static57.anInt1008 + Static407.aBooleanArrayArray8[0].length - Static532.anInt8517;
					}
					local304 = Static241.aBooleanArrayArray5;
					if (Static603.aBoolean683) {
						if (Static205.aBoolean259) {
							local304 = Static115.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static110.anInt9533; local316 < local263; local316++) {
							local323 = local316 + Static603.anInt9713 - Static110.anInt9533;
							for (local325 = Static13.anInt168; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static407.aBooleanArrayArray8[local316][local325]) {
									@Pc(344) int local344 = local325 + Static57.anInt1008 - Static13.anInt168;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static283.aClass128ArrayArrayArray1[local346][local323][local344] != null && Static283.aClass128ArrayArrayArray1[local346][local323][local344].aByte40 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static339.method5086(local323, local225, local344)) {
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
					if (Static205.aBoolean259) {
						if (arg4 >= 0) {
							Static177.aClass84Array2[local225].method7626(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static177.aClass84Array2[local225].method7618(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static549.anInt8710; local316++) {
							Static57.aClass287Array1[local316].method6431(new Class4_Sub5(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static177.aClass84Array2[local225].method7626(Static220.anInt3838, Static377.anInt6335, Static553.anInt8738, Static241.aBooleanArrayArray5, false, arg4, arg5);
					} else {
						Static177.aClass84Array2[local225].method7618(Static220.anInt3838, Static377.anInt6335, Static553.anInt8738, Static241.aBooleanArrayArray5, false, arg5);
					}
				}
			}
		}
		if (Static574.anInt8994 > 0) {
			Static393.method5791(Static388.aClass4_Sub1Array8, 0, Static574.anInt8994 - 1);
			for (local225 = 0; local225 < Static574.anInt8994; local225++) {
				Static608.method8370(Static388.aClass4_Sub1Array8[local225], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)V")
	public static void method901(@OriginalArg(1) int arg0) {
		if (Static310.anInt5335 == 0) {
			Static445.aClass5_Sub4_Sub2_6.method1808(arg0);
		} else {
			Static524.anInt8330 = arg0;
		}
	}
}
