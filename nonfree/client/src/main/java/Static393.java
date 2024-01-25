import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!kha;")
	public static Class181 aClass181_30;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[Lclient!lea;")
	public static final Class2_Sub3_Sub1_Sub2_Sub2[] aClass2_Sub3_Sub1_Sub2_Sub2Array2 = new Class2_Sub3_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
	public static int[] anIntArray156 = null;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!k;")
	public static final Class171 aClass171_6 = new Class171();

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[Lclient!kga;")
	public static final Class3_Sub1_Sub12[] aClass3_Sub1_Sub12Array3 = new Class3_Sub1_Sub12[14];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static398.method6370(arg1, arg0) || Static25.method426(arg1, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
	public static int method2874(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method2876(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static161.anInt3884 = 0;
		Static592.anInt9872 = 0;
		Static398.anInt7623++;
		@Pc(21) Class2_Sub3 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static44.aClass2_Sub3Array3[local5]; local21 != null; local21 = local21.aClass2_Sub3_23) {
				if (!Static529.method7520(local21, arg0, arg1, arg2, arg3)) {
					Static446.method6762(local21);
					if (local21.anInt10423 != -1) {
						Static132.aClass2_Sub3Array4[Static161.anInt3884++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static464.aClass2_Sub3Array6[local5]; local21 != null; local21 = local21.aClass2_Sub3_23) {
				if (!Static529.method7520(local21, arg0, arg1, arg2, arg3)) {
					Static446.method6762(local21);
					if (local21.anInt10423 != -1) {
						Static199.aClass2_Sub3Array5[Static592.anInt9872++] = local21;
					}
				}
			}
			for (@Pc(87) Class2_Sub3 local87 = Static634.aClass2_Sub3Array7[local5]; local87 != null; local87 = local87.aClass2_Sub3_23) {
				if (!Static529.method7520(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8579()) {
						Static446.method6762(local87);
						if (local87.anInt10423 != -1) {
							Static199.aClass2_Sub3Array5[Static592.anInt9872++] = local87;
						}
					} else {
						Static446.method6762(local87);
						if (local87.anInt10423 != -1) {
							Static132.aClass2_Sub3Array4[Static161.anInt3884++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static185.anInt4396; local137++) {
					if (!Static529.method7520(Static113.aClass2_Sub3_Sub1Array3[local137], arg0, arg1, arg2, arg3)) {
						Static446.method6762(Static113.aClass2_Sub3_Sub1Array3[local137]);
						if (Static113.aClass2_Sub3_Sub1Array3[local137].anInt10423 != -1) {
							if (Static113.aClass2_Sub3_Sub1Array3[local137].method8579()) {
								Static199.aClass2_Sub3Array5[Static592.anInt9872++] = Static113.aClass2_Sub3_Sub1Array3[local137];
							} else {
								Static132.aClass2_Sub3Array4[Static161.anInt3884++] = Static113.aClass2_Sub3_Sub1Array3[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static161.anInt3884 > 0) {
			Static242.method4626(Static132.aClass2_Sub3Array4, 0, Static161.anInt3884 - 1);
			for (local198 = 0; local198 < Static161.anInt3884; local198++) {
				Static111.method2710(Static132.aClass2_Sub3Array4[local198], arg6);
			}
		}
		if (Static181.aBoolean367) {
			Static185.aClass33_8.method6203(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static155.anInt3811; local198 < Static626.anInt10336; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static622.aBooleanArrayArray11.length;
					if (Static474.anInt8502 + Static622.aBooleanArrayArray11.length > Static642.anInt10523) {
						local230 -= Static474.anInt8502 + Static622.aBooleanArrayArray11.length - Static642.anInt10523;
					}
					local137 = Static622.aBooleanArrayArray11[0].length;
					if (Static36.anInt695 + Static622.aBooleanArrayArray11[0].length > Static158.anInt3845) {
						local137 -= Static36.anInt695 + Static622.aBooleanArrayArray11[0].length - Static158.anInt3845;
					}
					local271 = Static49.aBooleanArrayArray1;
					if (Static242.aBoolean481) {
						if (Static441.aBoolean681) {
							local271 = Static437.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static619.anInt10222; local281 < local230; local281++) {
							local288 = local281 + Static474.anInt8502 - Static619.anInt10222;
							for (local290 = Static140.anInt3546; local290 < local137; local290++) {
								if (Static622.aBooleanArrayArray11[local281][local290] && !Static562.method7912(local198, local288, local290 + Static36.anInt695 - Static140.anInt3546)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static441.aBoolean681) {
						if (arg4 >= 0) {
							Static500.aClass274Array2[local198].method8035(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static500.aClass274Array2[local198].method8044(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static199.anInt4633; local281++) {
							Static162.aClass56Array1[local281].method2239(new Class2_Sub8(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static500.aClass274Array2[local198].method8035(Static607.anInt10024, Static23.anInt369, Static157.anInt3831, Static49.aBooleanArrayArray1, true, arg4, arg5);
					} else {
						Static500.aClass274Array2[local198].method8044(Static607.anInt10024, Static23.anInt369, Static157.anInt3831, Static49.aBooleanArrayArray1, true, arg5);
					}
				} else {
					local230 = Static622.aBooleanArrayArray11.length;
					if (Static474.anInt8502 + Static622.aBooleanArrayArray11.length > Static642.anInt10523) {
						local230 -= Static474.anInt8502 + Static622.aBooleanArrayArray11.length - Static642.anInt10523;
					}
					local137 = Static622.aBooleanArrayArray11[0].length;
					if (Static36.anInt695 + Static622.aBooleanArrayArray11[0].length > Static158.anInt3845) {
						local137 -= Static36.anInt695 + Static622.aBooleanArrayArray11[0].length - Static158.anInt3845;
					}
					local271 = Static49.aBooleanArrayArray1;
					if (Static242.aBoolean481) {
						if (Static441.aBoolean681) {
							local271 = Static437.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static619.anInt10222; local281 < local230; local281++) {
							local288 = local281 + Static474.anInt8502 - Static619.anInt10222;
							for (local290 = Static140.anInt3546; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static622.aBooleanArrayArray11[local281][local290]) {
									@Pc(309) int local309 = local290 + Static36.anInt695 - Static140.anInt3546;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static170.aClass106ArrayArrayArray1[local311][local288][local309] != null && Static170.aClass106ArrayArrayArray1[local311][local288][local309].aByte46 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static562.method7912(local198, local288, local309)) {
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
					if (Static441.aBoolean681) {
						if (arg4 >= 0) {
							Static500.aClass274Array2[local198].method8035(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static500.aClass274Array2[local198].method8044(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static199.anInt4633; local281++) {
							Static162.aClass56Array1[local281].method2239(new Class2_Sub8(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static500.aClass274Array2[local198].method8035(Static607.anInt10024, Static23.anInt369, Static157.anInt3831, Static49.aBooleanArrayArray1, false, arg4, arg5);
					} else {
						Static500.aClass274Array2[local198].method8044(Static607.anInt10024, Static23.anInt369, Static157.anInt3831, Static49.aBooleanArrayArray1, false, arg5);
					}
				}
			}
		}
		if (Static592.anInt9872 > 0) {
			Static300.method5149(Static199.aClass2_Sub3Array5, 0, Static592.anInt9872 - 1);
			for (local198 = 0; local198 < Static592.anInt9872; local198++) {
				Static111.method2710(Static199.aClass2_Sub3Array5[local198], arg6);
			}
		}
	}
}
