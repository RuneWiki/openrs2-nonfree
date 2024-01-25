import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
	public static int anInt4573;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public static int anInt4577 = -1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!nn;)Lclient!nf;")
	public static Class20_Sub4 method3687(@OriginalArg(1) Class10_Sub8 arg0) {
		return new Class20_Sub4(arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2507(), arg0.method2502());
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)I")
	public static int method3688(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BIB)Ljava/lang/String;")
	public static String method3689(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) char[] local15 = new char[arg2];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg1[local19 + arg0] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(47) char local47 = Static191.aCharArray5[local29 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local29 = local47;
				}
				local15[local17++] = (char) local29;
			}
		}
		return new String(local15, 0, local17);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3691(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static85.anInt7651++;
		Static168.anInt3351 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static222.anInt4181; local7 < Static285.anInt5004; local7++) {
			@Pc(12) Class11[][] local12 = Static309.aClass11ArrayArrayArray2[local7];
			for (local14 = Static12.anInt226; local14 < Static430.anInt7228; local14++) {
				for (@Pc(17) int local17 = Static137.anInt2871; local17 < Static256.anInt4594; local17++) {
					@Pc(24) Class11 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static460.aBooleanArrayArray9[local14 + Static451.anInt7524 - Static18.anInt316][local17 + Static451.anInt7524 - Static265.anInt4683] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean9 = true;
							local24.aBoolean11 = true;
							if (local24.aClass1_3 == null) {
								local24.aBoolean10 = false;
							} else {
								local24.aBoolean10 = true;
							}
							Static168.anInt3351++;
						} else {
							local24.aBoolean9 = false;
							local24.aBoolean11 = false;
							local24.aByte5 = 0;
							if (local14 >= Static18.anInt316 - 16 && local14 <= Static18.anInt316 + 16 && local17 >= Static265.anInt4683 - 16 && local17 <= Static265.anInt4683 + 16 && (local24.aClass24_Sub5_1 != null || local24.aClass24_Sub5_2 != null || local24.aClass24_Sub1_2 != null || local24.aClass24_Sub1_1 != null || local24.aClass24_Sub4_1 != null || local24.aClass1_3 != null)) {
								Static39.aClass8_1.method3751(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static173.aClass154Array1 == Static332.aClass154Array3;
		for (local14 = Static222.anInt4181; local14 < Static285.anInt5004; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static142.aClass50_5.method5830() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static460.aBooleanArrayArray9.length;
				if (Static12.anInt226 + Static460.aBooleanArrayArray9.length > Static54.anInt998) {
					local172 -= Static12.anInt226 + Static460.aBooleanArrayArray9.length - Static54.anInt998;
				}
				@Pc(192) int local192 = Static460.aBooleanArrayArray9[0].length;
				if (Static137.anInt2871 + Static460.aBooleanArrayArray9[0].length > Static24.anInt401) {
					local192 -= Static137.anInt2871 + Static460.aBooleanArrayArray9[0].length - Static24.anInt401;
				}
				@Pc(213) int local213 = Static115.anInt2361;
				while (true) {
					if (local213 >= local172) {
						Static39.aClass8_1.method3749(local161, true, Static332.aClass154Array3[local14], local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static12.anInt226 - Static115.anInt2361;
					for (@Pc(222) int local222 = Static326.anInt5607; local222 < local192; local222++) {
						Static432.aBooleanArrayArray7[local213][local222] = false;
						if (Static460.aBooleanArrayArray9[local213][local222]) {
							@Pc(241) int local241 = local222 + Static137.anInt2871 - Static326.anInt5607;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static309.aClass11ArrayArrayArray2[local243][local220][local241] != null && Static309.aClass11ArrayArrayArray2[local243][local220][local241].aByte1 == local14) {
									Static432.aBooleanArrayArray7[local213][local222] = Static309.aClass11ArrayArrayArray2[local243][local220][local241].aBoolean9;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static39.aClass8_1.method3749(local161, false, Static332.aClass154Array3[local14], local14);
			}
			Static39.aClass8_1.method3750();
		}
		if (!Static176.method2938(true)) {
			Static176.method2938(false);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3694(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static315.aClass182_194.method4155(Static191.anInt3842) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static248.aClass182_151.method4155(Static191.anInt3842) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
