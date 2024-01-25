import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "Lclient!nl;")
	public static Class171 aClass171_60;

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "Lclient!nl;")
	public static Class171 aClass171_61;

	@OriginalMember(owner = "client!oi", name = "I", descriptor = "[[[Lclient!wr;")
	public static Class251[][][] aClass251ArrayArrayArray3;

	@OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
	public static int anInt4374 = 104;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)I")
	public static int method3932() {
		return ((Static330.anInt5659 == 0 ? 0 : 1) << 22) + (Static81.anInt1473 << 17) + ((Static385.aBoolean467 ? 1 : 0) << 15) + ((Static212.aBoolean293 ? 1 : 0) << 13) + ((Static187.aBoolean270 ? 1 : 0) << 9) + ((Static6.aBoolean21 ? 1 : 0) << 6) + ((Static272.aBoolean352 ? 1 : 0) << 4) + ((Static273.aBoolean353 ? 1 : 0) << 3) + (Static3.anInt131 & 0x7) + ((Static349.aBoolean351 ? 1 : 0) << 5) + ((Static10.aBoolean424 ? 1 : 0) << 8) + ((Static178.aBoolean265 ? 1 : 0) << 10) + ((Static202.anInt3721 & 0x3) << 11) + ((Static58.aBoolean89 ? 1 : 0) << 16) + ((Static343.aBoolean422 ? 1 : 0) << 19) + ((Static143.anInt2862 == 0 ? 0 : 1) << 20) + ((Static322.anInt5529 == 0 ? 0 : 1) << 21) + (Static232.method3779() << 23) + (Static116.anInt2496 << 25) + ((Static358.aBoolean142 ? 1 : 0) << 27) + (Static182.anInt3879 << 28);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3933(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static100.anInt2069++;
		Static24.anInt527 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static119.anInt2585; local7 < Static12.anInt311; local7++) {
			@Pc(12) Class251[][] local12 = Static64.aClass251ArrayArrayArray1[local7];
			for (local14 = Static351.anInt6590; local14 < Static292.anInt5075; local14++) {
				for (@Pc(17) int local17 = client.lb; local17 < Static333.anInt5691; local17++) {
					@Pc(24) Class251 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static199.aBooleanArrayArray4[local14 + Static309.anInt5190 - Static322.anInt5531][local17 + Static309.anInt5190 - Static314.anInt5359] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean475 = true;
							local24.aBoolean473 = true;
							if (local24.aClass46_3 == null) {
								local24.aBoolean474 = false;
							} else {
								local24.aBoolean474 = true;
							}
							Static24.anInt527++;
						} else {
							local24.aBoolean475 = false;
							local24.aBoolean473 = false;
							local24.aByte72 = 0;
							if (local14 >= Static322.anInt5531 - 16 && local14 <= Static322.anInt5531 + 16 && local17 >= Static314.anInt5359 - 16 && local17 <= Static314.anInt5359 + 16 && (local24.aClass1_Sub1_3 != null || local24.aClass1_Sub1_2 != null || local24.aClass1_Sub2_2 != null || local24.aClass1_Sub2_3 != null || local24.aClass1_Sub3_2 != null || local24.aClass46_3 != null)) {
								Static305.aClass29_1.method4183(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static94.aClass107Array2 == Static350.aClass107Array4;
		for (local14 = Static119.anInt2585; local14 < Static12.anInt311; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static350.aClass63_8.method2032() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static199.aBooleanArrayArray4.length;
				if (Static351.anInt6590 + Static199.aBooleanArrayArray4.length > Static12.anInt312) {
					local172 -= Static351.anInt6590 + Static199.aBooleanArrayArray4.length - Static12.anInt312;
				}
				@Pc(192) int local192 = Static199.aBooleanArrayArray4[0].length;
				if (client.lb + Static199.aBooleanArrayArray4[0].length > Static341.anInt5833) {
					local192 -= client.lb + Static199.aBooleanArrayArray4[0].length - Static341.anInt5833;
				}
				@Pc(213) int local213 = Static185.anInt3482;
				while (true) {
					if (local213 >= local172) {
						Static305.aClass29_1.method4193(local161, local14, true, Static350.aClass107Array4[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static351.anInt6590 - Static185.anInt3482;
					for (@Pc(222) int local222 = Static271.anInt4712; local222 < local192; local222++) {
						Static360.aBooleanArrayArray7[local213][local222] = false;
						if (Static199.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + client.lb - Static271.anInt4712;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static64.aClass251ArrayArrayArray1[local243][local220][local241] != null && Static64.aClass251ArrayArrayArray1[local243][local220][local241].aByte71 == local14) {
									Static360.aBooleanArrayArray7[local213][local222] = Static64.aClass251ArrayArrayArray1[local243][local220][local241].aBoolean475;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static305.aClass29_1.method4193(local161, local14, false, Static350.aClass107Array4[local14]);
			}
			Static305.aClass29_1.method4188();
		}
		if (!Static168.method2962(true)) {
			Static168.method2962(false);
		}
	}
}
