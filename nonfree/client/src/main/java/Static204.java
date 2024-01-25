import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt3568;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!o;")
	public static Class6 aClass6_34;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array9;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_145 = new Class103(47, 3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method2901() {
		for (@Pc(15) int local15 = 0; local15 < Static234.anInt4174; local15++) {
			@Pc(21) Class266 local21 = Static249.aClass266Array1[local15];
			@Pc(23) boolean local23 = false;
			@Pc(249) int local249;
			if (local21.aClass1_Sub6_Sub3_4 == null) {
				local21.anInt7428--;
				if (local21.anInt7428 < (local21.aByte105 == 2 ? -1500 : -10)) {
					local23 = true;
				} else {
					if (local21.aByte105 == 1 && local21.aClass211_1 == null) {
						local21.aClass211_1 = Static467.method4741(Static257.aClass82_59, local21.anInt7422, 0);
						if (local21.aClass211_1 == null) {
							continue;
						}
						local21.anInt7428 += local21.aClass211_1.method4740();
					} else if (local21.aByte105 == 2 && (local21.aClass1_Sub29_1 == null || local21.aClass1_Sub25_Sub1_2 == null)) {
						if (local21.aClass1_Sub29_1 == null) {
							local21.aClass1_Sub29_1 = Static212.method3130(Static348.aClass82_81, local21.anInt7422);
						}
						if (local21.aClass1_Sub29_1 == null) {
							continue;
						}
						if (local21.aClass1_Sub25_Sub1_2 == null) {
							local21.aClass1_Sub25_Sub1_2 = local21.aClass1_Sub29_1.method3135(new int[] { 22050 });
							if (local21.aClass1_Sub25_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local21.anInt7428 < 0) {
						if (local21.anInt7427 == 0) {
							local249 = local21.anInt7426 * Static453.aClass136_Sub1_1.anInt4442 >> 8;
						} else {
							@Pc(150) int local150 = local21.anInt7427 >> 24 & 0x3;
							if (Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 == local150) {
								@Pc(165) int local165 = (local21.anInt7427 & 0xFF) << 7;
								@Pc(172) int local172 = local21.anInt7427 >> 16 & 0xFF;
								@Pc(182) int local182 = (local172 << 7) + 64 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(197) int local197 = local21.anInt7427 >> 8 & 0xFF;
								@Pc(207) int local207 = (local197 << 7) + 64 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
								if (local207 < 0) {
									local207 = -local207;
								}
								@Pc(218) int local218 = local182 + local207 - 128;
								if (local218 > local165) {
									local21.anInt7428 = -99999;
									continue;
								}
								if (local218 < 0) {
									local218 = 0;
								}
								local249 = Static453.aClass136_Sub1_1.anInt4441 * (local165 - local218) * local21.anInt7426 / local165 >> 8;
							} else {
								local249 = 0;
							}
						}
						if (local249 > 0) {
							@Pc(270) Class1_Sub25_Sub1 local270 = null;
							if (local21.aByte105 == 1) {
								local270 = local21.aClass211_1.method4738().method2771(Static250.aClass255_1);
							} else if (local21.aByte105 == 2) {
								local270 = local21.aClass1_Sub25_Sub1_2;
							}
							@Pc(298) Class1_Sub6_Sub3 local298 = local21.aClass1_Sub6_Sub3_4 = Static466.method4661(local270, local249);
							local298.method4638(local21.anInt7425 - 1);
							Static355.aClass1_Sub6_Sub4_2.method5175(local298);
						}
					}
				}
			} else if (!local21.aClass1_Sub6_Sub3_4.method5914()) {
				local23 = true;
			}
			if (local23) {
				Static234.anInt4174--;
				for (local249 = local15; local249 < Static234.anInt4174; local249++) {
					Static249.aClass266Array1[local249] = Static249.aClass266Array1[local249 + 1];
				}
				local15--;
			}
		}
		if (Static328.aBoolean637 && !Static171.method5258()) {
			if (Static453.aClass136_Sub1_1.anInt4444 != 0 && Static143.anInt2345 != -1) {
				Static322.method4324(Static143.anInt2345, Static447.aClass82_54, Static453.aClass136_Sub1_1.anInt4444);
			}
			Static328.aBoolean637 = false;
		} else if (Static453.aClass136_Sub1_1.anInt4444 != 0 && Static143.anInt2345 != -1 && !Static171.method5258()) {
			Static52.method867(Static256.aClass103_170);
			Static18.aClass1_Sub28_Sub1_1.method5347(Static143.anInt2345);
			Static143.anInt2345 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static172.anInt2813++;
		Static19.anInt400 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static79.anInt1470; local7 < Static105.anInt1943; local7++) {
			@Pc(12) Class169[][] local12 = Static359.aClass169ArrayArrayArray5[local7];
			for (local14 = Static235.anInt4212; local14 < Static181.anInt3166; local14++) {
				for (@Pc(17) int local17 = Static54.anInt974; local17 < Static202.anInt3561; local17++) {
					@Pc(24) Class169 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static44.aBooleanArrayArray1[local14 + Static179.anInt3132 - Static321.anInt5494][local17 + Static179.anInt3132 - Static64.anInt1211] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean549 = true;
							local24.aBoolean551 = true;
							if (local24.aClass27_3 == null) {
								local24.aBoolean550 = false;
							} else {
								local24.aBoolean550 = true;
							}
							Static19.anInt400++;
						} else {
							local24.aBoolean549 = false;
							local24.aBoolean551 = false;
							local24.aByte82 = 0;
							if (local14 >= Static321.anInt5494 - 16 && local14 <= Static321.anInt5494 + 16 && local17 >= Static64.anInt1211 - 16 && local17 <= Static64.anInt1211 + 16 && (local24.aClass25_Sub4_2 != null || local24.aClass25_Sub4_1 != null || local24.aClass25_Sub1_2 != null || local24.aClass25_Sub1_3 != null || local24.aClass25_Sub2_2 != null || local24.aClass27_3 != null)) {
								Static344.aClass58_1.method3492(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static343.aClass157Array3 == Static94.aClass157Array1;
		for (local14 = Static79.anInt1470; local14 < Static105.anInt1943; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static52.aClass34_1.method5772() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static44.aBooleanArrayArray1.length;
				if (Static235.anInt4212 + Static44.aBooleanArrayArray1.length > Static37.anInt666) {
					local172 -= Static235.anInt4212 + Static44.aBooleanArrayArray1.length - Static37.anInt666;
				}
				@Pc(192) int local192 = Static44.aBooleanArrayArray1[0].length;
				if (Static54.anInt974 + Static44.aBooleanArrayArray1[0].length > Static408.anInt6716) {
					local192 -= Static54.anInt974 + Static44.aBooleanArrayArray1[0].length - Static408.anInt6716;
				}
				@Pc(213) int local213 = Static458.anInt6289;
				while (true) {
					if (local213 >= local172) {
						Static344.aClass58_1.method3495(Static94.aClass157Array1[local14], local161, true, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static235.anInt4212 - Static458.anInt6289;
					for (@Pc(222) int local222 = Static309.anInt5375; local222 < local192; local222++) {
						Static431.aBooleanArrayArray6[local213][local222] = false;
						if (Static44.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static54.anInt974 - Static309.anInt5375;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static359.aClass169ArrayArrayArray5[local243][local220][local241] != null && Static359.aClass169ArrayArrayArray5[local243][local220][local241].aByte81 == local14) {
									Static431.aBooleanArrayArray6[local213][local222] = Static359.aClass169ArrayArrayArray5[local243][local220][local241].aBoolean549;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static344.aClass58_1.method3495(Static94.aClass157Array1[local14], local161, false, local14);
			}
			Static344.aClass58_1.method3496();
		}
		if (!Static413.method5319(true)) {
			Static413.method5319(false);
		}
	}
}
