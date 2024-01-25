import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Z")
	public static boolean method4445(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg3 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg3.startsWith("#")) {
			return arg0.equals(arg3);
		} else {
			return arg2.equals(arg1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method4449(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static457.anInt7457 = 0;
		Static689.anInt10611 = 0;
		Static9.anInt163++;
		@Pc(22) Class4_Sub2 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static594.aClass4_Sub2Array5[local6]; local22 != null; local22 = local22.aClass4_Sub2_25) {
				if (!Static289.method4069(local22, arg0, arg1, arg2, arg3)) {
					Static422.method6172(local22);
					if (local22.anInt10233 != -1) {
						Static503.aClass4_Sub2Array3[Static457.anInt7457++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static161.aClass4_Sub2Array1[local6]; local22 != null; local22 = local22.aClass4_Sub2_25) {
				if (!Static289.method4069(local22, arg0, arg1, arg2, arg3)) {
					Static422.method6172(local22);
					if (local22.anInt10233 != -1) {
						Static248.aClass4_Sub2Array4[Static689.anInt10611++] = local22;
					}
				}
			}
			for (@Pc(98) Class4_Sub2 local98 = Static699.aClass4_Sub2Array6[local6]; local98 != null; local98 = local98.aClass4_Sub2_25) {
				if (!Static289.method4069(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method8976()) {
						Static422.method6172(local98);
						if (local98.anInt10233 != -1) {
							Static248.aClass4_Sub2Array4[Static689.anInt10611++] = local98;
						}
					} else {
						Static422.method6172(local98);
						if (local98.anInt10233 != -1) {
							Static503.aClass4_Sub2Array3[Static457.anInt7457++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static240.anInt10693; local157++) {
					if (!Static289.method4069(Static505.aClass4_Sub2_Sub1Array1[local157], arg0, arg1, arg2, arg3)) {
						Static422.method6172(Static505.aClass4_Sub2_Sub1Array1[local157]);
						if (Static505.aClass4_Sub2_Sub1Array1[local157].anInt10233 != -1) {
							if (Static505.aClass4_Sub2_Sub1Array1[local157].method8976()) {
								Static248.aClass4_Sub2Array4[Static689.anInt10611++] = Static505.aClass4_Sub2_Sub1Array1[local157];
							} else {
								Static503.aClass4_Sub2Array3[Static457.anInt7457++] = Static505.aClass4_Sub2_Sub1Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static457.anInt7457 > 0) {
			Static567.method7862(Static503.aClass4_Sub2Array3, 0, Static457.anInt7457 - 1);
			for (local225 = 0; local225 < Static457.anInt7457; local225++) {
				Static184.method2658(Static503.aClass4_Sub2Array3[local225], arg6);
			}
		}
		if (Static400.aBoolean558) {
			Static689.aClass145_16.method9655(0, (Class2_Sub7[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static726.anInt11286; local225 < Static97.anInt1761; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static208.aBooleanArrayArray6.length;
					if (Static51.anInt855 + Static208.aBooleanArrayArray6.length > Static372.anInt5930) {
						local263 -= Static51.anInt855 + Static208.aBooleanArrayArray6.length - Static372.anInt5930;
					}
					local157 = Static208.aBooleanArrayArray6[0].length;
					if (Static459.anInt7474 + Static208.aBooleanArrayArray6[0].length > Static545.anInt8590) {
						local157 -= Static459.anInt7474 + Static208.aBooleanArrayArray6[0].length - Static545.anInt8590;
					}
					local304 = Static605.aBooleanArrayArray10;
					if (Static575.aBoolean776) {
						if (Static4.aBoolean8) {
							local304 = Static9.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static682.anInt11015; local316 < local263; local316++) {
							local323 = local316 + Static51.anInt855 - Static682.anInt11015;
							for (local325 = Static50.anInt823; local325 < local157; local325++) {
								if (Static208.aBooleanArrayArray6[local316][local325] && !Static471.method6762(local323, local225, local325 + Static459.anInt7474 - Static50.anInt823)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static4.aBoolean8) {
						if (arg4 >= 0) {
							Static158.aClass133Array4[local225].method8222(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static158.aClass133Array4[local225].method8218(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static445.anInt7219; local316++) {
							Static444.aClass324Array1[local316].method7737(new Class4_Sub4(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static158.aClass133Array4[local225].method8222(Static20.anInt267, Static503.anInt2766, Static128.anInt2136, Static605.aBooleanArrayArray10, true, arg4, arg5);
					} else {
						Static158.aClass133Array4[local225].method8218(Static20.anInt267, Static503.anInt2766, Static128.anInt2136, Static605.aBooleanArrayArray10, true, arg5);
					}
				} else {
					local263 = Static208.aBooleanArrayArray6.length;
					if (Static51.anInt855 + Static208.aBooleanArrayArray6.length > Static372.anInt5930) {
						local263 -= Static51.anInt855 + Static208.aBooleanArrayArray6.length - Static372.anInt5930;
					}
					local157 = Static208.aBooleanArrayArray6[0].length;
					if (Static459.anInt7474 + Static208.aBooleanArrayArray6[0].length > Static545.anInt8590) {
						local157 -= Static459.anInt7474 + Static208.aBooleanArrayArray6[0].length - Static545.anInt8590;
					}
					local304 = Static605.aBooleanArrayArray10;
					if (Static575.aBoolean776) {
						if (Static4.aBoolean8) {
							local304 = Static9.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static682.anInt11015; local316 < local263; local316++) {
							local323 = local316 + Static51.anInt855 - Static682.anInt11015;
							for (local325 = Static50.anInt823; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static208.aBooleanArrayArray6[local316][local325]) {
									@Pc(344) int local344 = local325 + Static459.anInt7474 - Static50.anInt823;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static632.aClass311ArrayArrayArray3[local346][local323][local344] != null && Static632.aClass311ArrayArrayArray3[local346][local323][local344].aByte118 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static471.method6762(local323, local225, local344)) {
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
					if (Static4.aBoolean8) {
						if (arg4 >= 0) {
							Static158.aClass133Array4[local225].method8222(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static158.aClass133Array4[local225].method8218(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static445.anInt7219; local316++) {
							Static444.aClass324Array1[local316].method7737(new Class4_Sub4(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static158.aClass133Array4[local225].method8222(Static20.anInt267, Static503.anInt2766, Static128.anInt2136, Static605.aBooleanArrayArray10, false, arg4, arg5);
					} else {
						Static158.aClass133Array4[local225].method8218(Static20.anInt267, Static503.anInt2766, Static128.anInt2136, Static605.aBooleanArrayArray10, false, arg5);
					}
				}
			}
		}
		if (Static689.anInt10611 > 0) {
			Static458.method6646(Static248.aClass4_Sub2Array4, 0, Static689.anInt10611 - 1);
			for (local225 = 0; local225 < Static689.anInt10611; local225++) {
				Static184.method2658(Static248.aClass4_Sub2Array4[local225], arg6);
			}
		}
	}
}
