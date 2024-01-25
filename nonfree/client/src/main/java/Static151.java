import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_49 = new Class126(70, -1);

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method2609(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static639.anInt9861 = 0;
		Static263.anInt4938 = 0;
		Static553.anInt8943++;
		@Pc(21) Class23_Sub2 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static249.aClass23_Sub2Array2[local5]; local21 != null; local21 = local21.aClass23_Sub2_23) {
				if (!Static382.method5597(local21, arg0, arg1, arg2, arg3)) {
					Static205.method3263(local21);
					if (local21.anInt10106 != -1) {
						Static604.aClass23_Sub2Array4[Static639.anInt9861++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static496.aClass23_Sub2Array3[local5]; local21 != null; local21 = local21.aClass23_Sub2_23) {
				if (!Static382.method5597(local21, arg0, arg1, arg2, arg3)) {
					Static205.method3263(local21);
					if (local21.anInt10106 != -1) {
						Static660.aClass23_Sub2Array5[Static263.anInt4938++] = local21;
					}
				}
			}
			for (@Pc(87) Class23_Sub2 local87 = Static188.aClass23_Sub2Array1[local5]; local87 != null; local87 = local87.aClass23_Sub2_23) {
				if (!Static382.method5597(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8594()) {
						Static205.method3263(local87);
						if (local87.anInt10106 != -1) {
							Static660.aClass23_Sub2Array5[Static263.anInt4938++] = local87;
						}
					} else {
						Static205.method3263(local87);
						if (local87.anInt10106 != -1) {
							Static604.aClass23_Sub2Array4[Static639.anInt9861++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static279.anInt5224; local137++) {
					if (!Static382.method5597(Static594.aClass23_Sub2_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static205.method3263(Static594.aClass23_Sub2_Sub1Array1[local137]);
						if (Static594.aClass23_Sub2_Sub1Array1[local137].anInt10106 != -1) {
							if (Static594.aClass23_Sub2_Sub1Array1[local137].method8594()) {
								Static660.aClass23_Sub2Array5[Static263.anInt4938++] = Static594.aClass23_Sub2_Sub1Array1[local137];
							} else {
								Static604.aClass23_Sub2Array4[Static639.anInt9861++] = Static594.aClass23_Sub2_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static639.anInt9861 > 0) {
			method2612(Static604.aClass23_Sub2Array4, 0, Static639.anInt9861 - 1);
			for (local198 = 0; local198 < Static639.anInt9861; local198++) {
				Static290.method4529(Static604.aClass23_Sub2Array4[local198], arg6);
			}
		}
		if (Static340.aBoolean474) {
			Static486.aClass16_8.method8162(0, (Class3_Sub7[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static111.anInt10340; local198 < Static373.anInt6613; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static569.aBooleanArrayArray6.length;
					if (Static518.anInt8668 + Static569.aBooleanArrayArray6.length > Static410.anInt6962) {
						local230 -= Static518.anInt8668 + Static569.aBooleanArrayArray6.length - Static410.anInt6962;
					}
					local137 = Static569.aBooleanArrayArray6[0].length;
					if (Static664.anInt6954 + Static569.aBooleanArrayArray6[0].length > Static315.anInt5894) {
						local137 -= Static664.anInt6954 + Static569.aBooleanArrayArray6[0].length - Static315.anInt5894;
					}
					local271 = Static452.aBooleanArrayArray4;
					if (Static281.aBoolean409) {
						if (Static284.aBoolean410) {
							local271 = Static252.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static461.anInt7919; local281 < local230; local281++) {
							local288 = local281 + Static518.anInt8668 - Static461.anInt7919;
							for (local290 = Static470.anInt8030; local290 < local137; local290++) {
								if (Static569.aBooleanArrayArray6[local281][local290] && !Static213.method3374(local198, local288, local290 + Static664.anInt6954 - Static470.anInt8030)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static284.aBoolean410) {
						if (arg4 >= 0) {
							Static343.aClass104Array2[local198].method8285(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static343.aClass104Array2[local198].method8278(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static105.anInt2206; local281++) {
							Static94.aClass224Array1[local281].method5154(new Class23_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static343.aClass104Array2[local198].method8285(Static177.anInt3330, Static227.anInt4358, Static641.anInt9890, Static452.aBooleanArrayArray4, true, arg4, arg5);
					} else {
						Static343.aClass104Array2[local198].method8278(Static177.anInt3330, Static227.anInt4358, Static641.anInt9890, Static452.aBooleanArrayArray4, true, arg5);
					}
				} else {
					local230 = Static569.aBooleanArrayArray6.length;
					if (Static518.anInt8668 + Static569.aBooleanArrayArray6.length > Static410.anInt6962) {
						local230 -= Static518.anInt8668 + Static569.aBooleanArrayArray6.length - Static410.anInt6962;
					}
					local137 = Static569.aBooleanArrayArray6[0].length;
					if (Static664.anInt6954 + Static569.aBooleanArrayArray6[0].length > Static315.anInt5894) {
						local137 -= Static664.anInt6954 + Static569.aBooleanArrayArray6[0].length - Static315.anInt5894;
					}
					local271 = Static452.aBooleanArrayArray4;
					if (Static281.aBoolean409) {
						if (Static284.aBoolean410) {
							local271 = Static252.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static461.anInt7919; local281 < local230; local281++) {
							local288 = local281 + Static518.anInt8668 - Static461.anInt7919;
							for (local290 = Static470.anInt8030; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static569.aBooleanArrayArray6[local281][local290]) {
									@Pc(309) int local309 = local290 + Static664.anInt6954 - Static470.anInt8030;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static332.aClass247ArrayArrayArray1[local311][local288][local309] != null && Static332.aClass247ArrayArrayArray1[local311][local288][local309].aByte94 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static213.method3374(local198, local288, local309)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static284.aBoolean410) {
						if (arg4 >= 0) {
							Static343.aClass104Array2[local198].method8285(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static343.aClass104Array2[local198].method8278(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static105.anInt2206; local281++) {
							Static94.aClass224Array1[local281].method5154(new Class23_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static343.aClass104Array2[local198].method8285(Static177.anInt3330, Static227.anInt4358, Static641.anInt9890, Static452.aBooleanArrayArray4, false, arg4, arg5);
					} else {
						Static343.aClass104Array2[local198].method8278(Static177.anInt3330, Static227.anInt4358, Static641.anInt9890, Static452.aBooleanArrayArray4, false, arg5);
					}
				}
			}
		}
		if (Static263.anInt4938 > 0) {
			Static155.method2645(Static660.aClass23_Sub2Array5, 0, Static263.anInt4938 - 1);
			for (local198 = 0; local198 < Static263.anInt4938; local198++) {
				Static290.method4529(Static660.aClass23_Sub2Array5[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!fca;)Ljava/lang/String;")
	public static String method2610(@OriginalArg(1) Class3_Sub17 arg0) {
		return Static296.method6903(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lclient!cn;II)V")
	private static void method2612(@OriginalArg(0) Class23_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class23_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10106;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10106 < local27 + (local29 & 0x1)) {
				@Pc(44) Class23_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method2612(arg0, arg1, local10 - 1);
		method2612(arg0, local10 + 1, arg2);
	}
}
