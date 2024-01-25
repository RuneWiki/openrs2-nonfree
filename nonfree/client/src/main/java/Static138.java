import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!er", name = "d", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array2;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "I")
	public static int anInt2851 = -1;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	public static int anInt2852 = 0;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "[S")
	public static short[] aShortArray34 = new short[256];

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method2373(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static141.anInt2883 = 0;
		Static521.anInt8817 = 0;
		Static148.anInt3031++;
		@Pc(21) Class9_Sub2 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static463.aClass9_Sub2Array6[local5]; local21 != null; local21 = local21.aClass9_Sub2_23) {
				if (!Static550.method7853(local21, arg0, arg1, arg2, arg3)) {
					Static227.method3943(local21);
					if (local21.anInt10151 != -1) {
						Static275.aClass9_Sub2Array3[Static141.anInt2883++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static250.aClass9_Sub2Array5[local5]; local21 != null; local21 = local21.aClass9_Sub2_23) {
				if (!Static550.method7853(local21, arg0, arg1, arg2, arg3)) {
					Static227.method3943(local21);
					if (local21.anInt10151 != -1) {
						Static578.aClass9_Sub2Array7[Static521.anInt8817++] = local21;
					}
				}
			}
			for (@Pc(87) Class9_Sub2 local87 = Static164.aClass9_Sub2Array1[local5]; local87 != null; local87 = local87.aClass9_Sub2_23) {
				if (!Static550.method7853(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8607()) {
						Static227.method3943(local87);
						if (local87.anInt10151 != -1) {
							Static578.aClass9_Sub2Array7[Static521.anInt8817++] = local87;
						}
					} else {
						Static227.method3943(local87);
						if (local87.anInt10151 != -1) {
							Static275.aClass9_Sub2Array3[Static141.anInt2883++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static135.anInt2825; local137++) {
					if (!Static550.method7853(Static513.aClass9_Sub2_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static227.method3943(Static513.aClass9_Sub2_Sub1Array1[local137]);
						if (Static513.aClass9_Sub2_Sub1Array1[local137].anInt10151 != -1) {
							if (Static513.aClass9_Sub2_Sub1Array1[local137].method8607()) {
								Static578.aClass9_Sub2Array7[Static521.anInt8817++] = Static513.aClass9_Sub2_Sub1Array1[local137];
							} else {
								Static275.aClass9_Sub2Array3[Static141.anInt2883++] = Static513.aClass9_Sub2_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static141.anInt2883 > 0) {
			Static365.method5857(Static275.aClass9_Sub2Array3, 0, Static141.anInt2883 - 1);
			for (local198 = 0; local198 < Static141.anInt2883; local198++) {
				Static438.method6622(Static275.aClass9_Sub2Array3[local198], arg6);
			}
		}
		if (Static397.aBoolean513) {
			Static568.aClass82_14.method6100(0, (Class3_Sub22[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static128.anInt1667; local198 < Static603.anInt9778; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static140.aBooleanArrayArray2.length;
					if (Static451.anInt7672 + Static140.aBooleanArrayArray2.length > Static573.anInt6750) {
						local230 -= Static451.anInt7672 + Static140.aBooleanArrayArray2.length - Static573.anInt6750;
					}
					local137 = Static140.aBooleanArrayArray2[0].length;
					if (Static584.anInt9489 + Static140.aBooleanArrayArray2[0].length > Static547.anInt9143) {
						local137 -= Static584.anInt9489 + Static140.aBooleanArrayArray2[0].length - Static547.anInt9143;
					}
					local271 = Static642.aBooleanArrayArray7;
					if (Static120.aBoolean206) {
						if (Static302.aBoolean437) {
							local271 = Static38.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static326.anInt6209; local281 < local230; local281++) {
							local288 = local281 + Static451.anInt7672 - Static326.anInt6209;
							for (local290 = Static137.anInt2837; local290 < local137; local290++) {
								if (Static140.aBooleanArrayArray2[local281][local290] && !Static348.method5647(local290 + Static584.anInt9489 - Static137.anInt2837, local198, local288)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static302.aBoolean437) {
						if (arg4 >= 0) {
							Static637.aClass91Array4[local198].method7714(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static637.aClass91Array4[local198].method7719(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static67.anInt1336; local281++) {
							Static197.aClass250Array1[local281].method6321(new Class9_Sub7(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static637.aClass91Array4[local198].method7714(Static281.anInt5392, Static394.anInt7055, Static361.anInt6683, Static642.aBooleanArrayArray7, true, arg4, arg5);
					} else {
						Static637.aClass91Array4[local198].method7719(Static281.anInt5392, Static394.anInt7055, Static361.anInt6683, Static642.aBooleanArrayArray7, true, arg5);
					}
				} else {
					local230 = Static140.aBooleanArrayArray2.length;
					if (Static451.anInt7672 + Static140.aBooleanArrayArray2.length > Static573.anInt6750) {
						local230 -= Static451.anInt7672 + Static140.aBooleanArrayArray2.length - Static573.anInt6750;
					}
					local137 = Static140.aBooleanArrayArray2[0].length;
					if (Static584.anInt9489 + Static140.aBooleanArrayArray2[0].length > Static547.anInt9143) {
						local137 -= Static584.anInt9489 + Static140.aBooleanArrayArray2[0].length - Static547.anInt9143;
					}
					local271 = Static642.aBooleanArrayArray7;
					if (Static120.aBoolean206) {
						if (Static302.aBoolean437) {
							local271 = Static38.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static326.anInt6209; local281 < local230; local281++) {
							local288 = local281 + Static451.anInt7672 - Static326.anInt6209;
							for (local290 = Static137.anInt2837; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static140.aBooleanArrayArray2[local281][local290]) {
									@Pc(309) int local309 = local290 + Static584.anInt9489 - Static137.anInt2837;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static567.aClass351ArrayArrayArray4[local311][local288][local309] != null && Static567.aClass351ArrayArrayArray4[local311][local288][local309].aByte118 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static348.method5647(local309, local198, local288)) {
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
					if (Static302.aBoolean437) {
						if (arg4 >= 0) {
							Static637.aClass91Array4[local198].method7714(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static637.aClass91Array4[local198].method7719(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static67.anInt1336; local281++) {
							Static197.aClass250Array1[local281].method6321(new Class9_Sub7(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static637.aClass91Array4[local198].method7714(Static281.anInt5392, Static394.anInt7055, Static361.anInt6683, Static642.aBooleanArrayArray7, false, arg4, arg5);
					} else {
						Static637.aClass91Array4[local198].method7719(Static281.anInt5392, Static394.anInt7055, Static361.anInt6683, Static642.aBooleanArrayArray7, false, arg5);
					}
				}
			}
		}
		if (Static521.anInt8817 > 0) {
			Static263.method4387(Static578.aClass9_Sub2Array7, 0, Static521.anInt8817 - 1);
			for (local198 = 0; local198 < Static521.anInt8817; local198++) {
				Static438.method6622(Static578.aClass9_Sub2Array7[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI[Ljava/awt/Rectangle;)V")
	public static void method2374(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static424.anInt7715 == 1) {
			Static366.aClass82_11.method6148(arg1, arg0, Static520.anInt8806, Static2.anInt5);
		} else {
			Static366.aClass82_11.method6148(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 <= arg3) {
			Static82.method1400(arg2, arg1, arg3, Static71.anIntArrayArray5[arg0]);
		} else {
			Static82.method1400(arg2, arg3, arg1, Static71.anIntArrayArray5[arg0]);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Lclient!daa;")
	public static Class3_Sub7_Sub5 method2377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7_Sub5 local15 = (Class3_Sub7_Sub5) Static89.aClass25_27.method426((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class3_Sub7_Sub5(arg0, arg1);
			Static89.aClass25_27.method434(local15.aLong277, local15);
		}
		return local15;
	}
}
