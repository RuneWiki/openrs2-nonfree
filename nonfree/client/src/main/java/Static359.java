import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array11;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
	public static int anInt5450;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_95 = new Class216(14, 0);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method4794() {
		for (@Pc(10) Class4_Sub5_Sub10 local10 = (Class4_Sub5_Sub10) Static153.aClass163_19.method3639(); local10 != null; local10 = (Class4_Sub5_Sub10) Static153.aClass163_19.method3640()) {
			@Pc(23) Class3_Sub1_Sub2_Sub5 local23 = local10.aClass3_Sub1_Sub2_Sub5_1;
			if (local23.aBoolean544) {
				local10.method9000();
				local23.method6184();
			} else if (local23.anInt7023 <= Static177.anInt3088) {
				local23.method6183(Static88.anInt1794);
				if (local23.aBoolean544) {
					local10.method9000();
				} else {
					Static573.method7594(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method4795(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static215.anInt3488 = 0;
		Static522.anInt8084 = 0;
		Static79.anInt1702++;
		@Pc(21) Class3_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static114.aClass3_Sub1Array1[local5]; local21 != null; local21 = local21.aClass3_Sub1_23) {
				if (!Static139.method8868(local21, arg0, arg1, arg2, arg3)) {
					Static342.method7463(local21);
					if (local21.anInt9920 != -1) {
						Static668.aClass3_Sub1Array5[Static215.anInt3488++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static506.aClass3_Sub1Array3[local5]; local21 != null; local21 = local21.aClass3_Sub1_23) {
				if (!Static139.method8868(local21, arg0, arg1, arg2, arg3)) {
					Static342.method7463(local21);
					if (local21.anInt9920 != -1) {
						Static269.aClass3_Sub1Array2[Static522.anInt8084++] = local21;
					}
				}
			}
			for (@Pc(87) Class3_Sub1 local87 = Static596.aClass3_Sub1Array4[local5]; local87 != null; local87 = local87.aClass3_Sub1_23) {
				if (!Static139.method8868(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8501()) {
						Static342.method7463(local87);
						if (local87.anInt9920 != -1) {
							Static269.aClass3_Sub1Array2[Static522.anInt8084++] = local87;
						}
					} else {
						Static342.method7463(local87);
						if (local87.anInt9920 != -1) {
							Static668.aClass3_Sub1Array5[Static215.anInt3488++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static239.anInt3959; local137++) {
					if (!Static139.method8868(Static321.aClass3_Sub1_Sub2Array1[local137], arg0, arg1, arg2, arg3)) {
						Static342.method7463(Static321.aClass3_Sub1_Sub2Array1[local137]);
						if (Static321.aClass3_Sub1_Sub2Array1[local137].anInt9920 != -1) {
							if (Static321.aClass3_Sub1_Sub2Array1[local137].method8501()) {
								Static269.aClass3_Sub1Array2[Static522.anInt8084++] = Static321.aClass3_Sub1_Sub2Array1[local137];
							} else {
								Static668.aClass3_Sub1Array5[Static215.anInt3488++] = Static321.aClass3_Sub1_Sub2Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static215.anInt3488 > 0) {
			Static295.method4177(Static668.aClass3_Sub1Array5, 0, Static215.anInt3488 - 1);
			for (local198 = 0; local198 < Static215.anInt3488; local198++) {
				Static289.method4138(Static668.aClass3_Sub1Array5[local198], arg6);
			}
		}
		if (Static95.aBoolean132) {
			Static246.aClass33_6.method8090(0, (Class4_Sub29[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static117.anInt2243; local198 < Static539.anInt8345; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static537.aBooleanArrayArray32.length;
					if (Static358.anInt5430 + Static537.aBooleanArrayArray32.length > Static51.anInt1108) {
						local230 -= Static358.anInt5430 + Static537.aBooleanArrayArray32.length - Static51.anInt1108;
					}
					local137 = Static537.aBooleanArrayArray32[0].length;
					if (Static355.anInt5409 + Static537.aBooleanArrayArray32[0].length > Static245.anInt7888) {
						local137 -= Static355.anInt5409 + Static537.aBooleanArrayArray32[0].length - Static245.anInt7888;
					}
					local271 = Static211.aBooleanArrayArray37;
					if (Static284.aBoolean342) {
						if (Static186.aBoolean244) {
							local271 = Static444.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static169.anInt3015; local281 < local230; local281++) {
							local288 = local281 + Static358.anInt5430 - Static169.anInt3015;
							for (local290 = Static71.anInt1499; local290 < local137; local290++) {
								if (Static537.aBooleanArrayArray32[local281][local290] && !Static592.method7783(local198, local290 + Static355.anInt5409 - Static71.anInt1499, local288)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static186.aBoolean244) {
						if (arg4 >= 0) {
							Static140.aClass42Array4[local198].method7456(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static140.aClass42Array4[local198].method7455(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static290.anInt4589; local281++) {
							Static48.aClass394Array1[local281].method8977(new Class3_Sub8(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static140.aClass42Array4[local198].method7456(Static323.anInt5049, Static417.anInt6041, Static112.anInt2200, Static211.aBooleanArrayArray37, true, arg4, arg5);
					} else {
						Static140.aClass42Array4[local198].method7455(Static323.anInt5049, Static417.anInt6041, Static112.anInt2200, Static211.aBooleanArrayArray37, true, arg5);
					}
				} else {
					local230 = Static537.aBooleanArrayArray32.length;
					if (Static358.anInt5430 + Static537.aBooleanArrayArray32.length > Static51.anInt1108) {
						local230 -= Static358.anInt5430 + Static537.aBooleanArrayArray32.length - Static51.anInt1108;
					}
					local137 = Static537.aBooleanArrayArray32[0].length;
					if (Static355.anInt5409 + Static537.aBooleanArrayArray32[0].length > Static245.anInt7888) {
						local137 -= Static355.anInt5409 + Static537.aBooleanArrayArray32[0].length - Static245.anInt7888;
					}
					local271 = Static211.aBooleanArrayArray37;
					if (Static284.aBoolean342) {
						if (Static186.aBoolean244) {
							local271 = Static444.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static169.anInt3015; local281 < local230; local281++) {
							local288 = local281 + Static358.anInt5430 - Static169.anInt3015;
							for (local290 = Static71.anInt1499; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static537.aBooleanArrayArray32[local281][local290]) {
									@Pc(309) int local309 = local290 + Static355.anInt5409 - Static71.anInt1499;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static267.aClass73ArrayArrayArray2[local311][local288][local309] != null && Static267.aClass73ArrayArrayArray2[local311][local288][local309].aByte20 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static592.method7783(local198, local309, local288)) {
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
					if (Static186.aBoolean244) {
						if (arg4 >= 0) {
							Static140.aClass42Array4[local198].method7456(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static140.aClass42Array4[local198].method7455(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static290.anInt4589; local281++) {
							Static48.aClass394Array1[local281].method8977(new Class3_Sub8(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static140.aClass42Array4[local198].method7456(Static323.anInt5049, Static417.anInt6041, Static112.anInt2200, Static211.aBooleanArrayArray37, false, arg4, arg5);
					} else {
						Static140.aClass42Array4[local198].method7455(Static323.anInt5049, Static417.anInt6041, Static112.anInt2200, Static211.aBooleanArrayArray37, false, arg5);
					}
				}
			}
		}
		if (Static522.anInt8084 > 0) {
			Static253.method3681(Static269.aClass3_Sub1Array2, 0, Static522.anInt8084 - 1);
			for (local198 = 0; local198 < Static522.anInt8084; local198++) {
				Static289.method4138(Static269.aClass3_Sub1Array2[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZBILclient!bt;J)V")
	public static void method4797(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class34 arg2, @OriginalArg(6) long arg3) {
		Static6.method114(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z")
	public static boolean method4798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
