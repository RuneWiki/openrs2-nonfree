import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt6923;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIZIII)V")
	public static void method6039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static527.anInt8506 = arg3;
		Static358.anInt6209 = arg0;
		Static12.anInt193 = arg1;
		Static594.anInt9868 = arg4;
		Static195.anInt3891 = arg5;
		if (arg2 && Static594.anInt9868 >= 100) {
			Static63.anInt1715 = Static195.anInt3891 * 512 + 256;
			Static576.anInt9403 = Static12.anInt193 * 512 + 256;
			Static479.anInt7769 = Static392.method5799(Static531.anInt8550, Static576.anInt9403, Static63.anInt1715) - Static358.anInt6209;
		}
		Static648.anInt10476 = -1;
		Static644.anInt10415 = -1;
		Static407.anInt6909 = 2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6040(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static627.anInt10196 = 0;
		Static388.anInt6686 = 0;
		Static111.anInt2388++;
		@Pc(21) Class16_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static524.aClass16_Sub1Array5[local5]; local21 != null; local21 = local21.aClass16_Sub1_23) {
				if (!Static329.method5015(local21, arg0, arg1, arg2, arg3)) {
					Static235.method3765(local21);
					if (local21.anInt8035 != -1) {
						Static330.aClass16_Sub1Array2[Static627.anInt10196++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static451.aClass16_Sub1Array3[local5]; local21 != null; local21 = local21.aClass16_Sub1_23) {
				if (!Static329.method5015(local21, arg0, arg1, arg2, arg3)) {
					Static235.method3765(local21);
					if (local21.anInt8035 != -1) {
						Static256.aClass16_Sub1Array1[Static388.anInt6686++] = local21;
					}
				}
			}
			for (@Pc(87) Class16_Sub1 local87 = Static518.aClass16_Sub1Array4[local5]; local87 != null; local87 = local87.aClass16_Sub1_23) {
				if (!Static329.method5015(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method6974()) {
						Static235.method3765(local87);
						if (local87.anInt8035 != -1) {
							Static256.aClass16_Sub1Array1[Static388.anInt6686++] = local87;
						}
					} else {
						Static235.method3765(local87);
						if (local87.anInt8035 != -1) {
							Static330.aClass16_Sub1Array2[Static627.anInt10196++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static184.anInt3672; local137++) {
					if (!Static329.method5015(Static489.aClass16_Sub1_Sub1Array5[local137], arg0, arg1, arg2, arg3)) {
						Static235.method3765(Static489.aClass16_Sub1_Sub1Array5[local137]);
						if (Static489.aClass16_Sub1_Sub1Array5[local137].anInt8035 != -1) {
							if (Static489.aClass16_Sub1_Sub1Array5[local137].method6974()) {
								Static256.aClass16_Sub1Array1[Static388.anInt6686++] = Static489.aClass16_Sub1_Sub1Array5[local137];
							} else {
								Static330.aClass16_Sub1Array2[Static627.anInt10196++] = Static489.aClass16_Sub1_Sub1Array5[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static627.anInt10196 > 0) {
			Static241.method4101(Static330.aClass16_Sub1Array2, 0, Static627.anInt10196 - 1);
			for (local198 = 0; local198 < Static627.anInt10196; local198++) {
				Static593.method8370(Static330.aClass16_Sub1Array2[local198], arg6);
			}
		}
		if (Static463.aBoolean532) {
			Static380.aClass13_86.method8102(0, (Class2_Sub12[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static151.anInt3097; local198 < Static395.anInt6810; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static447.aBooleanArrayArray9.length;
					if (Static590.anInt9801 + Static447.aBooleanArrayArray9.length > Static595.anInt9881) {
						local230 -= Static590.anInt9801 + Static447.aBooleanArrayArray9.length - Static595.anInt9881;
					}
					local137 = Static447.aBooleanArrayArray9[0].length;
					if (Static641.anInt10384 + Static447.aBooleanArrayArray9[0].length > Static389.anInt6693) {
						local137 -= Static641.anInt10384 + Static447.aBooleanArrayArray9[0].length - Static389.anInt6693;
					}
					local271 = Static139.aBooleanArrayArray3;
					if (Static126.aBoolean214) {
						if (Static573.aBoolean668) {
							local271 = Static598.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static399.anInt6858; local281 < local230; local281++) {
							local288 = local281 + Static590.anInt9801 - Static399.anInt6858;
							for (local290 = Static137.anInt2913; local290 < local137; local290++) {
								if (Static447.aBooleanArrayArray9[local281][local290] && !Static213.method3543(local198, local288, local290 + Static641.anInt10384 - Static137.anInt2913)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static573.aBoolean668) {
						if (arg4 >= 0) {
							Static511.aClass91Array3[local198].method7450(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static511.aClass91Array3[local198].method7451(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static601.anInt9959; local281++) {
							Static307.aClass182Array1[local281].method4412(new Class16_Sub3(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static511.aClass91Array3[local198].method7450(Static636.anInt10301, Static66.anInt1803, Static621.anInt10151, Static139.aBooleanArrayArray3, true, arg4, arg5);
					} else {
						Static511.aClass91Array3[local198].method7451(Static636.anInt10301, Static66.anInt1803, Static621.anInt10151, Static139.aBooleanArrayArray3, true, arg5);
					}
				} else {
					local230 = Static447.aBooleanArrayArray9.length;
					if (Static590.anInt9801 + Static447.aBooleanArrayArray9.length > Static595.anInt9881) {
						local230 -= Static590.anInt9801 + Static447.aBooleanArrayArray9.length - Static595.anInt9881;
					}
					local137 = Static447.aBooleanArrayArray9[0].length;
					if (Static641.anInt10384 + Static447.aBooleanArrayArray9[0].length > Static389.anInt6693) {
						local137 -= Static641.anInt10384 + Static447.aBooleanArrayArray9[0].length - Static389.anInt6693;
					}
					local271 = Static139.aBooleanArrayArray3;
					if (Static126.aBoolean214) {
						if (Static573.aBoolean668) {
							local271 = Static598.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static399.anInt6858; local281 < local230; local281++) {
							local288 = local281 + Static590.anInt9801 - Static399.anInt6858;
							for (local290 = Static137.anInt2913; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static447.aBooleanArrayArray9[local281][local290]) {
									@Pc(309) int local309 = local290 + Static641.anInt10384 - Static137.anInt2913;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static348.aClass84ArrayArrayArray5[local311][local288][local309] != null && Static348.aClass84ArrayArrayArray5[local311][local288][local309].aByte42 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static213.method3543(local198, local288, local309)) {
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
					if (Static573.aBoolean668) {
						if (arg4 >= 0) {
							Static511.aClass91Array3[local198].method7450(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static511.aClass91Array3[local198].method7451(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static601.anInt9959; local281++) {
							Static307.aClass182Array1[local281].method4412(new Class16_Sub3(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static511.aClass91Array3[local198].method7450(Static636.anInt10301, Static66.anInt1803, Static621.anInt10151, Static139.aBooleanArrayArray3, false, arg4, arg5);
					} else {
						Static511.aClass91Array3[local198].method7451(Static636.anInt10301, Static66.anInt1803, Static621.anInt10151, Static139.aBooleanArrayArray3, false, arg5);
					}
				}
			}
		}
		if (Static388.anInt6686 > 0) {
			Static531.method7365(Static256.aClass16_Sub1Array1, 0, Static388.anInt6686 - 1);
			for (local198 = 0; local198 < Static388.anInt6686; local198++) {
				Static593.method8370(Static256.aClass16_Sub1Array1[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZILclient!wf;IZLclient!wf;)I")
	public static int method6041(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class362_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class362_Sub1 arg5) {
		@Pc(10) int local10 = Static527.method7325(arg4, arg1, arg5, arg2);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static527.method7325(arg0, arg3, arg5, arg2);
			return arg0 ? -local34 : local34;
		}
	}
}
