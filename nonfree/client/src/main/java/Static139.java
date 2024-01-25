import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!es", name = "x", descriptor = "I")
	public static int anInt2421;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method2082(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static241.anInt4291 = 0;
		Static335.anInt5753 = 0;
		Static237.anInt4278++;
		@Pc(21) Class2_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static229.aClass2_Sub1Array2[local5]; local21 != null; local21 = local21.aClass2_Sub1_22) {
				if (!Static159.method2245(local21, arg0, arg1, arg2, arg3)) {
					Static641.method8752(local21);
					if (local21.anInt10007 != -1) {
						Static370.aClass2_Sub1Array3[Static241.anInt4291++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static643.aClass2_Sub1Array5[local5]; local21 != null; local21 = local21.aClass2_Sub1_22) {
				if (!Static159.method2245(local21, arg0, arg1, arg2, arg3)) {
					Static641.method8752(local21);
					if (local21.anInt10007 != -1) {
						Static15.aClass2_Sub1Array1[Static335.anInt5753++] = local21;
					}
				}
			}
			for (@Pc(87) Class2_Sub1 local87 = Static512.aClass2_Sub1Array4[local5]; local87 != null; local87 = local87.aClass2_Sub1_22) {
				if (!Static159.method2245(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8446()) {
						Static641.method8752(local87);
						if (local87.anInt10007 != -1) {
							Static15.aClass2_Sub1Array1[Static335.anInt5753++] = local87;
						}
					} else {
						Static641.method8752(local87);
						if (local87.anInt10007 != -1) {
							Static370.aClass2_Sub1Array3[Static241.anInt4291++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static25.anInt3151; local137++) {
					if (!Static159.method2245(Static493.aClass2_Sub1_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static641.method8752(Static493.aClass2_Sub1_Sub1Array1[local137]);
						if (Static493.aClass2_Sub1_Sub1Array1[local137].anInt10007 != -1) {
							if (Static493.aClass2_Sub1_Sub1Array1[local137].method8446()) {
								Static15.aClass2_Sub1Array1[Static335.anInt5753++] = Static493.aClass2_Sub1_Sub1Array1[local137];
							} else {
								Static370.aClass2_Sub1Array3[Static241.anInt4291++] = Static493.aClass2_Sub1_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static241.anInt4291 > 0) {
			Static41.method907(Static370.aClass2_Sub1Array3, 0, Static241.anInt4291 - 1);
			for (local198 = 0; local198 < Static241.anInt4291; local198++) {
				Static631.method8684(Static370.aClass2_Sub1Array3[local198], arg6);
			}
		}
		if (Static47.aBoolean49) {
			Static576.aClass132_15.method7504(0, (Class6_Sub17[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static368.anInt6287; local198 < Static633.anInt10310; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static443.aBooleanArrayArray8.length;
					if (Static254.anInt4362 + Static443.aBooleanArrayArray8.length > Static209.anInt3602) {
						local230 -= Static254.anInt4362 + Static443.aBooleanArrayArray8.length - Static209.anInt3602;
					}
					local137 = Static443.aBooleanArrayArray8[0].length;
					if (Static620.anInt10119 + Static443.aBooleanArrayArray8[0].length > Static245.anInt4308) {
						local137 -= Static620.anInt10119 + Static443.aBooleanArrayArray8[0].length - Static245.anInt4308;
					}
					local271 = Static349.aBooleanArrayArray7;
					if (Static256.aBoolean274) {
						if (Static251.aBoolean272) {
							local271 = Static597.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static639.anInt10355; local281 < local230; local281++) {
							local288 = local281 + Static254.anInt4362 - Static639.anInt10355;
							for (local290 = Static75.anInt1433; local290 < local137; local290++) {
								if (Static443.aBooleanArrayArray8[local281][local290] && !Static354.method5134(local288, local290 + Static620.anInt10119 - Static75.anInt1433, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static251.aBoolean272) {
						if (arg4 >= 0) {
							Static289.aClass12Array3[local198].method7859(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static289.aClass12Array3[local198].method7858(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static140.anInt2434; local281++) {
							Static364.aClass40Array1[local281].method978(new Class2_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static289.aClass12Array3[local198].method7859(Static608.anInt9872, Static370.anInt6309, Static514.anInt8546, Static349.aBooleanArrayArray7, true, arg4, arg5);
					} else {
						Static289.aClass12Array3[local198].method7858(Static608.anInt9872, Static370.anInt6309, Static514.anInt8546, Static349.aBooleanArrayArray7, true, arg5);
					}
				} else {
					local230 = Static443.aBooleanArrayArray8.length;
					if (Static254.anInt4362 + Static443.aBooleanArrayArray8.length > Static209.anInt3602) {
						local230 -= Static254.anInt4362 + Static443.aBooleanArrayArray8.length - Static209.anInt3602;
					}
					local137 = Static443.aBooleanArrayArray8[0].length;
					if (Static620.anInt10119 + Static443.aBooleanArrayArray8[0].length > Static245.anInt4308) {
						local137 -= Static620.anInt10119 + Static443.aBooleanArrayArray8[0].length - Static245.anInt4308;
					}
					local271 = Static349.aBooleanArrayArray7;
					if (Static256.aBoolean274) {
						if (Static251.aBoolean272) {
							local271 = Static597.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static639.anInt10355; local281 < local230; local281++) {
							local288 = local281 + Static254.anInt4362 - Static639.anInt10355;
							for (local290 = Static75.anInt1433; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static443.aBooleanArrayArray8[local281][local290]) {
									@Pc(309) int local309 = local290 + Static620.anInt10119 - Static75.anInt1433;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static441.aClass351ArrayArrayArray1[local311][local288][local309] != null && Static441.aClass351ArrayArrayArray1[local311][local288][local309].aByte139 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static354.method5134(local288, local309, local198)) {
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
					if (Static251.aBoolean272) {
						if (arg4 >= 0) {
							Static289.aClass12Array3[local198].method7859(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static289.aClass12Array3[local198].method7858(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static140.anInt2434; local281++) {
							Static364.aClass40Array1[local281].method978(new Class2_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static289.aClass12Array3[local198].method7859(Static608.anInt9872, Static370.anInt6309, Static514.anInt8546, Static349.aBooleanArrayArray7, false, arg4, arg5);
					} else {
						Static289.aClass12Array3[local198].method7858(Static608.anInt9872, Static370.anInt6309, Static514.anInt8546, Static349.aBooleanArrayArray7, false, arg5);
					}
				}
			}
		}
		if (Static335.anInt5753 > 0) {
			Static256.method3693(Static15.aClass2_Sub1Array1, 0, Static335.anInt5753 - 1);
			for (local198 = 0; local198 < Static335.anInt5753; local198++) {
				Static631.method8684(Static15.aClass2_Sub1Array1[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	public static void method2087() {
		Static346.aBoolean394 = true;
	}
}
