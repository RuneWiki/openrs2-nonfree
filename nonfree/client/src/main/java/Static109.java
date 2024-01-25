import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "Lclient!a;")
	public static Class1 aClass1_2;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!cn;")
	public static final Class44 aClass44_7 = new Class44();

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "[Lclient!cq;")
	public static final Class2_Sub5_Sub3[] aClass2_Sub5_Sub3Array8 = new Class2_Sub5_Sub3[14];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3957(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static318.anInt6744++;
		Static441.anInt301 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static190.anInt3695; local7 < Static254.anInt4782; local7++) {
			@Pc(12) Class106[][] local12 = Static440.aClass106ArrayArrayArray3[local7];
			for (local14 = Static154.anInt3163; local14 < Static234.anInt4528; local14++) {
				for (@Pc(17) int local17 = Static316.anInt5472; local17 < Static248.anInt4698; local17++) {
					@Pc(24) Class106 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static281.aBooleanArrayArray41[local14 + Static182.anInt3568 - Static312.anInt5514][local17 + Static182.anInt3568 - Static402.anInt6690] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean237 = true;
							local24.aBoolean236 = true;
							if (local24.aClass4_3 == null) {
								local24.aBoolean235 = false;
							} else {
								local24.aBoolean235 = true;
							}
							Static441.anInt301++;
						} else {
							local24.aBoolean237 = false;
							local24.aBoolean236 = false;
							local24.aByte47 = 0;
							if (local14 >= Static312.anInt5514 - 16 && local14 <= Static312.anInt5514 + 16 && local17 >= Static402.anInt6690 - 16 && local17 <= Static402.anInt6690 + 16 && (local24.aClass3_Sub5_1 != null || local24.aClass3_Sub5_2 != null || local24.aClass3_Sub3_1 != null || local24.aClass3_Sub3_2 != null || local24.aClass3_Sub1_2 != null || local24.aClass4_3 != null)) {
								Static260.aClass37_1.method5287(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static440.aClass64Array3 == Static58.aClass64Array1;
		for (local14 = Static190.anInt3695; local14 < Static254.anInt4782; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static332.aClass49_10.method4465() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static281.aBooleanArrayArray41.length;
				if (Static154.anInt3163 + Static281.aBooleanArrayArray41.length > Static42.anInt4340) {
					local172 -= Static154.anInt3163 + Static281.aBooleanArrayArray41.length - Static42.anInt4340;
				}
				@Pc(192) int local192 = Static281.aBooleanArrayArray41[0].length;
				if (Static316.anInt5472 + Static281.aBooleanArrayArray41[0].length > Static386.anInt6463) {
					local192 -= Static316.anInt5472 + Static281.aBooleanArrayArray41[0].length - Static386.anInt6463;
				}
				@Pc(213) int local213 = Static181.anInt3544;
				while (true) {
					if (local213 >= local172) {
						Static260.aClass37_1.method5285(local161, local14, Static58.aClass64Array1[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static154.anInt3163 - Static181.anInt3544;
					for (@Pc(222) int local222 = Static286.anInt5139; local222 < local192; local222++) {
						Static223.aBooleanArrayArray19[local213][local222] = false;
						if (Static281.aBooleanArrayArray41[local213][local222]) {
							@Pc(241) int local241 = local222 + Static316.anInt5472 - Static286.anInt5139;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static440.aClass106ArrayArrayArray3[local243][local220][local241] != null && Static440.aClass106ArrayArrayArray3[local243][local220][local241].aByte43 == local14) {
									Static223.aBooleanArrayArray19[local213][local222] = Static440.aClass106ArrayArrayArray3[local243][local220][local241].aBoolean237;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static260.aClass37_1.method5285(local161, local14, Static58.aClass64Array1[local14], false);
			}
			Static260.aClass37_1.method5288();
		}
		if (!Static342.method4714(true)) {
			Static342.method4714(false);
		}
	}
}
