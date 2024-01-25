import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
	public static int anInt7331 = -1;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_33 = new Class22(20);

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_75 = new Class341(6, 2);

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
	public static int anInt7336 = 0;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6533(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static43.anInt8881 = 0;
		Static644.anInt11134 = 0;
		Static314.anInt5668++;
		@Pc(21) Class15_Sub3 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static603.aClass15_Sub3Array5[local5]; local21 != null; local21 = local21.aClass15_Sub3_23) {
				if (!Static241.method4334(local21, arg0, arg1, arg2, arg3)) {
					Static512.method7981(local21);
					if (local21.anInt11023 != -1) {
						Static8.aClass15_Sub3Array1[Static43.anInt8881++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static440.aClass15_Sub3Array4[local5]; local21 != null; local21 = local21.aClass15_Sub3_23) {
				if (!Static241.method4334(local21, arg0, arg1, arg2, arg3)) {
					Static512.method7981(local21);
					if (local21.anInt11023 != -1) {
						Static425.aClass15_Sub3Array3[Static644.anInt11134++] = local21;
					}
				}
			}
			for (@Pc(87) Class15_Sub3 local87 = Static98.aClass15_Sub3Array2[local5]; local87 != null; local87 = local87.aClass15_Sub3_23) {
				if (!Static241.method4334(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method9434()) {
						Static512.method7981(local87);
						if (local87.anInt11023 != -1) {
							Static425.aClass15_Sub3Array3[Static644.anInt11134++] = local87;
						}
					} else {
						Static512.method7981(local87);
						if (local87.anInt11023 != -1) {
							Static8.aClass15_Sub3Array1[Static43.anInt8881++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static533.anInt9353; local137++) {
					if (!Static241.method4334(Static212.aClass15_Sub3_Sub3Array1[local137], arg0, arg1, arg2, arg3)) {
						Static512.method7981(Static212.aClass15_Sub3_Sub3Array1[local137]);
						if (Static212.aClass15_Sub3_Sub3Array1[local137].anInt11023 != -1) {
							if (Static212.aClass15_Sub3_Sub3Array1[local137].method9434()) {
								Static425.aClass15_Sub3Array3[Static644.anInt11134++] = Static212.aClass15_Sub3_Sub3Array1[local137];
							} else {
								Static8.aClass15_Sub3Array1[Static43.anInt8881++] = Static212.aClass15_Sub3_Sub3Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static43.anInt8881 > 0) {
			Static683.method7820(Static8.aClass15_Sub3Array1, 0, Static43.anInt8881 - 1);
			for (local198 = 0; local198 < Static43.anInt8881; local198++) {
				Static289.method4828(Static8.aClass15_Sub3Array1[local198], arg6);
			}
		}
		if (Static583.aBoolean738) {
			Static64.aClass101_1.method8094(0, (Class2_Sub13[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static601.anInt10526; local198 < Static60.anInt1169; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static423.aBooleanArrayArray8.length;
					if (Static588.anInt10264 + Static423.aBooleanArrayArray8.length > Static585.anInt10170) {
						local230 -= Static588.anInt10264 + Static423.aBooleanArrayArray8.length - Static585.anInt10170;
					}
					local137 = Static423.aBooleanArrayArray8[0].length;
					if (Static166.anInt3589 + Static423.aBooleanArrayArray8[0].length > Static202.anInt4238) {
						local137 -= Static166.anInt3589 + Static423.aBooleanArrayArray8[0].length - Static202.anInt4238;
					}
					local271 = Static85.aBooleanArrayArray3;
					if (Static153.aBoolean254) {
						if (Static27.aBoolean27) {
							local271 = Static151.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static438.anInt7971; local281 < local230; local281++) {
							local288 = local281 + Static588.anInt10264 - Static438.anInt7971;
							for (local290 = Static108.anInt1986; local290 < local137; local290++) {
								if (Static423.aBooleanArrayArray8[local281][local290] && !Static328.method5423(local290 + Static166.anInt3589 - Static108.anInt1986, local288, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static27.aBoolean27) {
						if (arg4 >= 0) {
							Static245.aClass18Array14[local198].method8535(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static245.aClass18Array14[local198].method8538(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static299.anInt5460; local281++) {
							Static647.aClass119Array1[local281].method3566(new Class15_Sub4(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static245.aClass18Array14[local198].method8535(Static440.anInt8000, Static139.anInt2631, Static602.anInt10539, Static85.aBooleanArrayArray3, true, arg4, arg5);
					} else {
						Static245.aClass18Array14[local198].method8538(Static440.anInt8000, Static139.anInt2631, Static602.anInt10539, Static85.aBooleanArrayArray3, true, arg5);
					}
				} else {
					local230 = Static423.aBooleanArrayArray8.length;
					if (Static588.anInt10264 + Static423.aBooleanArrayArray8.length > Static585.anInt10170) {
						local230 -= Static588.anInt10264 + Static423.aBooleanArrayArray8.length - Static585.anInt10170;
					}
					local137 = Static423.aBooleanArrayArray8[0].length;
					if (Static166.anInt3589 + Static423.aBooleanArrayArray8[0].length > Static202.anInt4238) {
						local137 -= Static166.anInt3589 + Static423.aBooleanArrayArray8[0].length - Static202.anInt4238;
					}
					local271 = Static85.aBooleanArrayArray3;
					if (Static153.aBoolean254) {
						if (Static27.aBoolean27) {
							local271 = Static151.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static438.anInt7971; local281 < local230; local281++) {
							local288 = local281 + Static588.anInt10264 - Static438.anInt7971;
							for (local290 = Static108.anInt1986; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static423.aBooleanArrayArray8[local281][local290]) {
									@Pc(309) int local309 = local290 + Static166.anInt3589 - Static108.anInt1986;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static193.aClass291ArrayArrayArray2[local311][local288][local309] != null && Static193.aClass291ArrayArrayArray2[local311][local288][local309].aByte112 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static328.method5423(local309, local288, local198)) {
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
					if (Static27.aBoolean27) {
						if (arg4 >= 0) {
							Static245.aClass18Array14[local198].method8535(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static245.aClass18Array14[local198].method8538(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static299.anInt5460; local281++) {
							Static647.aClass119Array1[local281].method3566(new Class15_Sub4(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static245.aClass18Array14[local198].method8535(Static440.anInt8000, Static139.anInt2631, Static602.anInt10539, Static85.aBooleanArrayArray3, false, arg4, arg5);
					} else {
						Static245.aClass18Array14[local198].method8538(Static440.anInt8000, Static139.anInt2631, Static602.anInt10539, Static85.aBooleanArrayArray3, false, arg5);
					}
				}
			}
		}
		if (Static644.anInt11134 > 0) {
			Static292.method4859(Static425.aClass15_Sub3Array3, 0, Static644.anInt11134 - 1);
			for (local198 = 0; local198 < Static644.anInt11134; local198++) {
				Static289.method4828(Static425.aClass15_Sub3Array3[local198], arg6);
			}
		}
	}
}
