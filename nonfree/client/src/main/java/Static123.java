import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "Lclient!bk;")
	public static Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_88 = new Class92(56, 1);

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_87 = new Class175("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
	public static int anInt2661 = 0;

	@OriginalMember(owner = "client!ft", name = "cb", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIB)I")
	public static int method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg1 > 0) {
			local5 = arg0 & 0x1 | local5 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static207.anInt4137++;
		Static291.anInt5336 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static205.anInt4114; local7 < Static281.anInt5169; local7++) {
			@Pc(12) Class217[][] local12 = Static151.aClass217ArrayArrayArray3[local7];
			for (local14 = Static16.anInt537; local14 < Static454.anInt7692; local14++) {
				for (@Pc(17) int local17 = Static341.anInt6226; local17 < Static169.anInt3554; local17++) {
					@Pc(24) Class217 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static200.aBooleanArrayArray2[local14 + Static251.anInt4730 - Static444.anInt7531][local17 + Static251.anInt4730 - Static340.anInt6288] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean466 = true;
							local24.aBoolean465 = true;
							if (local24.aClass182_3 == null) {
								local24.aBoolean464 = false;
							} else {
								local24.aBoolean464 = true;
							}
							Static291.anInt5336++;
						} else {
							local24.aBoolean466 = false;
							local24.aBoolean465 = false;
							local24.aByte94 = 0;
							if (local14 >= Static444.anInt7531 - 16 && local14 <= Static444.anInt7531 + 16 && local17 >= Static340.anInt6288 - 16 && local17 <= Static340.anInt6288 + 16 && (local24.aClass1_Sub5_2 != null || local24.aClass1_Sub5_3 != null || local24.aClass1_Sub1_2 != null || local24.aClass1_Sub1_3 != null || local24.aClass1_Sub2_1 != null || local24.aClass182_3 != null)) {
								Static137.aClass6_1.method4730(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static401.aClass64Array3 == Static120.aClass64Array1;
		for (local14 = Static205.anInt4114; local14 < Static281.anInt5169; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static355.aClass75_10.method2617() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static200.aBooleanArrayArray2.length;
				if (Static16.anInt537 + Static200.aBooleanArrayArray2.length > Static177.anInt3621) {
					local172 -= Static16.anInt537 + Static200.aBooleanArrayArray2.length - Static177.anInt3621;
				}
				@Pc(192) int local192 = Static200.aBooleanArrayArray2[0].length;
				if (Static341.anInt6226 + Static200.aBooleanArrayArray2[0].length > Static57.anInt1411) {
					local192 -= Static341.anInt6226 + Static200.aBooleanArrayArray2[0].length - Static57.anInt1411;
				}
				@Pc(213) int local213 = Static24.anInt727;
				while (true) {
					if (local213 >= local172) {
						Static137.aClass6_1.method4738(Static120.aClass64Array1[local14], local14, local161, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static16.anInt537 - Static24.anInt727;
					for (@Pc(222) int local222 = Static286.anInt6051; local222 < local192; local222++) {
						Static435.aBooleanArrayArray6[local213][local222] = false;
						if (Static200.aBooleanArrayArray2[local213][local222]) {
							@Pc(241) int local241 = local222 + Static341.anInt6226 - Static286.anInt6051;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static151.aClass217ArrayArrayArray3[local243][local220][local241] != null && Static151.aClass217ArrayArrayArray3[local243][local220][local241].aByte93 == local14) {
									Static435.aBooleanArrayArray6[local213][local222] = Static151.aClass217ArrayArrayArray3[local243][local220][local241].aBoolean466;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static137.aClass6_1.method4738(Static120.aClass64Array1[local14], local14, local161, false);
			}
			Static137.aClass6_1.method4729();
		}
		if (!Static158.method2738(true)) {
			Static158.method2738(false);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z[B)Lclient!pl;")
	public static Class3_Sub3_Sub17 method2194(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub3_Sub17 local12 = new Class3_Sub3_Sub17();
		@Pc(17) Class3_Sub2 local17 = new Class3_Sub2(arg0);
		local17.anInt7620 = local17.aByteArray95.length - 2;
		@Pc(28) int local28 = local17.method6004();
		@Pc(39) int local39 = local17.aByteArray95.length - local28 - 12 - 2;
		local17.anInt7620 = local39;
		@Pc(46) int local46 = local17.method6014();
		local12.anInt5633 = local17.method6004();
		local12.anInt5629 = local17.method6004();
		local12.anInt5627 = local17.method6004();
		local12.anInt5631 = local17.method6004();
		@Pc(70) int local70 = local17.method6053();
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (local70 > 0) {
			local12.aClass127Array1 = new Class127[local70];
			for (local81 = 0; local81 < local70; local81++) {
				local86 = local17.method6004();
				@Pc(93) Class127 local93 = new Class127(Static350.method4984(local86));
				local12.aClass127Array1[local81] = local93;
				while (local86-- > 0) {
					@Pc(103) int local103 = local17.method6014();
					@Pc(107) int local107 = local17.method6014();
					local93.method3257((long) local103, new Class3_Sub25(local107));
				}
			}
		}
		local17.anInt7620 = 0;
		local12.aString55 = local17.method6005();
		local12.anIntArray422 = new int[local46];
		local12.anIntArray421 = new int[local46];
		local12.aStringArray132 = new String[local46];
		local81 = 0;
		while (local17.anInt7620 < local39) {
			local86 = local17.method6004();
			if (local86 == 3) {
				local12.aStringArray132[local81] = local17.method6027().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local12.anIntArray421[local81] = local17.method6053();
			} else {
				local12.anIntArray421[local81] = local17.method6014();
			}
			local12.anIntArray422[local81++] = local86;
		}
		return local12;
	}
}
