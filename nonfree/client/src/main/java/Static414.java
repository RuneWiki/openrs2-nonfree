import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!op", name = "m", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_66 = new Class208(83, -1);

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public static int anInt7551 = -1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	public static int anInt7552 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6512(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static242.anInt4833 = 0;
		Static189.anInt3797 = 0;
		Static299.anInt5834++;
		@Pc(21) Class20_Sub2 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static158.aClass20_Sub2Array7[local5]; local21 != null; local21 = local21.aClass20_Sub2_23) {
				if (!Static394.method6361(local21, arg0, arg1, arg2, arg3)) {
					Static350.method5637(local21);
					if (local21.anInt10727 != -1) {
						Static109.aClass20_Sub2Array13[Static242.anInt4833++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static311.aClass20_Sub2Array11[local5]; local21 != null; local21 = local21.aClass20_Sub2_23) {
				if (!Static394.method6361(local21, arg0, arg1, arg2, arg3)) {
					Static350.method5637(local21);
					if (local21.anInt10727 != -1) {
						Static626.aClass20_Sub2Array14[Static189.anInt3797++] = local21;
					}
				}
			}
			for (@Pc(87) Class20_Sub2 local87 = Static411.aClass20_Sub2Array12[local5]; local87 != null; local87 = local87.aClass20_Sub2_23) {
				if (!Static394.method6361(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method9023()) {
						Static350.method5637(local87);
						if (local87.anInt10727 != -1) {
							Static626.aClass20_Sub2Array14[Static189.anInt3797++] = local87;
						}
					} else {
						Static350.method5637(local87);
						if (local87.anInt10727 != -1) {
							Static109.aClass20_Sub2Array13[Static242.anInt4833++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static205.anInt4091; local137++) {
					if (!Static394.method6361(Static61.aClass20_Sub2_Sub2Array1[local137], arg0, arg1, arg2, arg3)) {
						Static350.method5637(Static61.aClass20_Sub2_Sub2Array1[local137]);
						if (Static61.aClass20_Sub2_Sub2Array1[local137].anInt10727 != -1) {
							if (Static61.aClass20_Sub2_Sub2Array1[local137].method9023()) {
								Static626.aClass20_Sub2Array14[Static189.anInt3797++] = Static61.aClass20_Sub2_Sub2Array1[local137];
							} else {
								Static109.aClass20_Sub2Array13[Static242.anInt4833++] = Static61.aClass20_Sub2_Sub2Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static242.anInt4833 > 0) {
			Static451.method6943(Static109.aClass20_Sub2Array13, 0, Static242.anInt4833 - 1);
			for (local198 = 0; local198 < Static242.anInt4833; local198++) {
				Static372.method7368(Static109.aClass20_Sub2Array13[local198], arg6);
			}
		}
		if (Static92.aBoolean125) {
			Static565.aClass100_15.method8828(0, (Class6_Sub1[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static132.anInt2524; local198 < Static535.anInt9275; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static460.aBooleanArrayArray6.length;
					if (Static43.anInt861 + Static460.aBooleanArrayArray6.length > Static544.anInt9353) {
						local230 -= Static43.anInt861 + Static460.aBooleanArrayArray6.length - Static544.anInt9353;
					}
					local137 = Static460.aBooleanArrayArray6[0].length;
					if (Static555.anInt9436 + Static460.aBooleanArrayArray6[0].length > Static608.anInt10072) {
						local137 -= Static555.anInt9436 + Static460.aBooleanArrayArray6[0].length - Static608.anInt10072;
					}
					local271 = Static195.aBooleanArrayArray4;
					if (Static168.aBoolean253) {
						if (Static101.aBoolean145) {
							local271 = Static431.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static68.anInt1420; local281 < local230; local281++) {
							local288 = local281 + Static43.anInt861 - Static68.anInt1420;
							for (local290 = Static410.anInt7532; local290 < local137; local290++) {
								if (Static460.aBooleanArrayArray6[local281][local290] && !Static606.method7456(local290 + Static555.anInt9436 - Static410.anInt7532, local288, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static101.aBoolean145) {
						if (arg4 >= 0) {
							Static195.aClass199Array1[local198].method8535(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static195.aClass199Array1[local198].method8523(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static253.anInt5086; local281++) {
							Static322.aClass352Array1[local281].method8367(new Class20_Sub9(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static195.aClass199Array1[local198].method8535(Static162.anInt3371, Static313.anInt5975, Static197.anInt10372, Static195.aBooleanArrayArray4, true, arg4, arg5);
					} else {
						Static195.aClass199Array1[local198].method8523(Static162.anInt3371, Static313.anInt5975, Static197.anInt10372, Static195.aBooleanArrayArray4, true, arg5);
					}
				} else {
					local230 = Static460.aBooleanArrayArray6.length;
					if (Static43.anInt861 + Static460.aBooleanArrayArray6.length > Static544.anInt9353) {
						local230 -= Static43.anInt861 + Static460.aBooleanArrayArray6.length - Static544.anInt9353;
					}
					local137 = Static460.aBooleanArrayArray6[0].length;
					if (Static555.anInt9436 + Static460.aBooleanArrayArray6[0].length > Static608.anInt10072) {
						local137 -= Static555.anInt9436 + Static460.aBooleanArrayArray6[0].length - Static608.anInt10072;
					}
					local271 = Static195.aBooleanArrayArray4;
					if (Static168.aBoolean253) {
						if (Static101.aBoolean145) {
							local271 = Static431.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static68.anInt1420; local281 < local230; local281++) {
							local288 = local281 + Static43.anInt861 - Static68.anInt1420;
							for (local290 = Static410.anInt7532; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static460.aBooleanArrayArray6[local281][local290]) {
									@Pc(309) int local309 = local290 + Static555.anInt9436 - Static410.anInt7532;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static272.aClass97ArrayArrayArray3[local311][local288][local309] != null && Static272.aClass97ArrayArrayArray3[local311][local288][local309].aByte52 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static606.method7456(local309, local288, local198)) {
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
					if (Static101.aBoolean145) {
						if (arg4 >= 0) {
							Static195.aClass199Array1[local198].method8535(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static195.aClass199Array1[local198].method8523(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static253.anInt5086; local281++) {
							Static322.aClass352Array1[local281].method8367(new Class20_Sub9(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static195.aClass199Array1[local198].method8535(Static162.anInt3371, Static313.anInt5975, Static197.anInt10372, Static195.aBooleanArrayArray4, false, arg4, arg5);
					} else {
						Static195.aClass199Array1[local198].method8523(Static162.anInt3371, Static313.anInt5975, Static197.anInt10372, Static195.aBooleanArrayArray4, false, arg5);
					}
				}
			}
		}
		if (Static189.anInt3797 > 0) {
			Static38.method8317(Static626.aClass20_Sub2Array14, 0, Static189.anInt3797 - 1);
			for (local198 = 0; local198 < Static189.anInt3797; local198++) {
				Static372.method7368(Static626.aClass20_Sub2Array14[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II[BFFFFIIILclient!oia;IF)V")
	public static void method6514(@OriginalArg(2) byte[] arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) Class206 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			Static251.method4485(arg4, arg0, arg5, arg1, arg6, arg3, arg2, local18, arg7);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method6517(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(25) char local25 = arg0.charAt(local14);
			if (local25 == '%' && local14 + 2 < local12) {
				local25 = arg0.charAt(local14 + 1);
				@Pc(82) int local82;
				if (local25 >= '0' && local25 <= '9') {
					local82 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local82 = local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local82 = local25 - 55;
				}
				local82 *= 16;
				local25 = arg0.charAt(local14 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local82 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local82 += local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local82 += local25 + '\n' - 65;
				}
				if (local82 != 0 && Static573.method8157((byte) local82)) {
					local9.append(Static494.method7395((byte) local82));
				}
				local14 += 2;
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}
}
