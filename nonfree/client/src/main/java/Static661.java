import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method8825(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static407.anInt7263 = 0;
		Static81.anInt1265 = 0;
		Static257.anInt4776++;
		@Pc(22) Class19_Sub1 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static660.aClass19_Sub1Array5[local6]; local22 != null; local22 = local22.aClass19_Sub1_25) {
				if (!Static70.method894(local22, arg0, arg1, arg2, arg3)) {
					Static643.method8690(local22);
					if (local22.anInt11205 != -1) {
						Static325.aClass19_Sub1Array1[Static407.anInt7263++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static358.aClass19_Sub1Array2[local6]; local22 != null; local22 = local22.aClass19_Sub1_25) {
				if (!Static70.method894(local22, arg0, arg1, arg2, arg3)) {
					Static643.method8690(local22);
					if (local22.anInt11205 != -1) {
						Static626.aClass19_Sub1Array3[Static81.anInt1265++] = local22;
					}
				}
			}
			for (@Pc(98) Class19_Sub1 local98 = Static634.aClass19_Sub1Array4[local6]; local98 != null; local98 = local98.aClass19_Sub1_25) {
				if (!Static70.method894(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method9360()) {
						Static643.method8690(local98);
						if (local98.anInt11205 != -1) {
							Static626.aClass19_Sub1Array3[Static81.anInt1265++] = local98;
						}
					} else {
						Static643.method8690(local98);
						if (local98.anInt11205 != -1) {
							Static325.aClass19_Sub1Array1[Static407.anInt7263++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static612.anInt9915; local157++) {
					if (!Static70.method894(Static339.aClass19_Sub1_Sub3Array1[local157], arg0, arg1, arg2, arg3)) {
						Static643.method8690(Static339.aClass19_Sub1_Sub3Array1[local157]);
						if (Static339.aClass19_Sub1_Sub3Array1[local157].anInt11205 != -1) {
							if (Static339.aClass19_Sub1_Sub3Array1[local157].method9360()) {
								Static626.aClass19_Sub1Array3[Static81.anInt1265++] = Static339.aClass19_Sub1_Sub3Array1[local157];
							} else {
								Static325.aClass19_Sub1Array1[Static407.anInt7263++] = Static339.aClass19_Sub1_Sub3Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static407.anInt7263 > 0) {
			Static658.method8808(Static325.aClass19_Sub1Array1, 0, Static407.anInt7263 - 1);
			for (local225 = 0; local225 < Static407.anInt7263; local225++) {
				Static684.method9026(Static325.aClass19_Sub1Array1[local225], arg6);
			}
		}
		if (Static668.aBoolean281) {
			Static626.aClass67_16.method7694(0, (Class3_Sub16[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static74.anInt1137; local225 < Static241.anInt4521; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static624.aBooleanArrayArray7.length;
					if (Static431.anInt7577 + Static624.aBooleanArrayArray7.length > Static509.anInt8656) {
						local263 -= Static431.anInt7577 + Static624.aBooleanArrayArray7.length - Static509.anInt8656;
					}
					local157 = Static624.aBooleanArrayArray7[0].length;
					if (Static712.anInt11116 + Static624.aBooleanArrayArray7[0].length > Static164.anInt3059) {
						local157 -= Static712.anInt11116 + Static624.aBooleanArrayArray7[0].length - Static164.anInt3059;
					}
					local304 = Static39.aBooleanArrayArray1;
					if (Static608.aBoolean715) {
						if (Static67.aBoolean81) {
							local304 = Static71.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static362.anInt8651; local316 < local263; local316++) {
							local323 = local316 + Static431.anInt7577 - Static362.anInt8651;
							for (local325 = Static697.anInt10943; local325 < local157; local325++) {
								if (Static624.aBooleanArrayArray7[local316][local325] && !Static601.method8270(local325 + Static712.anInt11116 - Static697.anInt10943, local323, local225)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static67.aBoolean81) {
						if (arg4 >= 0) {
							Static639.aClass313Array2[local225].method9092(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static639.aClass313Array2[local225].method9087(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static459.anInt2357; local316++) {
							Static307.aClass198Array1[local316].method4823(new Class19_Sub7(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static639.aClass313Array2[local225].method9092(Static296.anInt3655, Static450.anInt7928, Static726.anInt11312, Static39.aBooleanArrayArray1, true, arg4, arg5);
					} else {
						Static639.aClass313Array2[local225].method9087(Static296.anInt3655, Static450.anInt7928, Static726.anInt11312, Static39.aBooleanArrayArray1, true, arg5);
					}
				} else {
					local263 = Static624.aBooleanArrayArray7.length;
					if (Static431.anInt7577 + Static624.aBooleanArrayArray7.length > Static509.anInt8656) {
						local263 -= Static431.anInt7577 + Static624.aBooleanArrayArray7.length - Static509.anInt8656;
					}
					local157 = Static624.aBooleanArrayArray7[0].length;
					if (Static712.anInt11116 + Static624.aBooleanArrayArray7[0].length > Static164.anInt3059) {
						local157 -= Static712.anInt11116 + Static624.aBooleanArrayArray7[0].length - Static164.anInt3059;
					}
					local304 = Static39.aBooleanArrayArray1;
					if (Static608.aBoolean715) {
						if (Static67.aBoolean81) {
							local304 = Static71.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static362.anInt8651; local316 < local263; local316++) {
							local323 = local316 + Static431.anInt7577 - Static362.anInt8651;
							for (local325 = Static697.anInt10943; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static624.aBooleanArrayArray7[local316][local325]) {
									@Pc(344) int local344 = local325 + Static712.anInt11116 - Static697.anInt10943;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static584.aClass262ArrayArrayArray2[local346][local323][local344] != null && Static584.aClass262ArrayArrayArray2[local346][local323][local344].aByte113 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static601.method8270(local344, local323, local225)) {
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
					if (Static67.aBoolean81) {
						if (arg4 >= 0) {
							Static639.aClass313Array2[local225].method9092(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static639.aClass313Array2[local225].method9087(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static459.anInt2357; local316++) {
							Static307.aClass198Array1[local316].method4823(new Class19_Sub7(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static639.aClass313Array2[local225].method9092(Static296.anInt3655, Static450.anInt7928, Static726.anInt11312, Static39.aBooleanArrayArray1, false, arg4, arg5);
					} else {
						Static639.aClass313Array2[local225].method9087(Static296.anInt3655, Static450.anInt7928, Static726.anInt11312, Static39.aBooleanArrayArray1, false, arg5);
					}
				}
			}
		}
		if (Static81.anInt1265 > 0) {
			Static590.method8098(Static626.aClass19_Sub1Array3, 0, Static81.anInt1265 - 1);
			for (local225 = 0; local225 < Static81.anInt1265; local225++) {
				Static684.method9026(Static626.aClass19_Sub1Array3[local225], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!da;Lclient!av;IZILclient!saa;ILclient!aa;ILjava/lang/String;)V")
	public static void method8826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class330 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10) {
		@Pc(16) int local16;
		if (Static175.anInt10579 == 4) {
			local16 = (int) Static658.aFloat196 & 0x3FFF;
		} else {
			local16 = (int) Static658.aFloat196 + Static543.anInt9108 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt509 / 2, arg3.anInt569 / 2) + 10;
		@Pc(61) int local61 = arg1 * arg1 + arg5 * arg5;
		if (local61 > local35 * local35) {
			return;
		}
		@Pc(72) int local72 = Class3_Sub2_Sub21.anIntArray358[local16];
		@Pc(76) int local76 = Class3_Sub2_Sub21.anIntArray356[local16];
		if (Static175.anInt10579 != 4) {
			local72 = local72 * 256 / (Static61.anInt953 + 256);
			local76 = local76 * 256 / (Static61.anInt953 + 256);
		}
		@Pc(105) int local105 = local76 * arg5 + arg1 * local72 >> 14;
		@Pc(116) int local116 = arg1 * local76 - arg5 * local72 >> 14;
		@Pc(123) int local123 = arg6.method7907(arg10, 100, (Class9[]) null);
		@Pc(129) int local129 = local105 - local123 / 2;
		@Pc(137) int local137 = arg6.method7909(arg10, 0, (Class9[]) null, 100);
		if (-arg3.anInt509 <= local129 && arg3.anInt509 >= local129 && -arg3.anInt569 <= local116 && local116 <= arg3.anInt569) {
			arg2.method8132(arg7 + arg3.anInt569 / 2 - arg0 - local116 - local137, (Class9[]) null, 0, arg10, 0, local129 + arg9 + arg3.anInt509 / 2, local123, arg8, (int[]) null, 0, arg9, arg4, arg7, 50, 1);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method8827() {
		Static622.aClass67_15.method7642(Static437.aClass181_8);
		Static622.aClass67_15.DA(Static595.anInt9721, Static23.anInt403, Static516.anInt9693, Static51.anInt860);
	}
}
