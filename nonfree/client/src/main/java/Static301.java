import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	public static boolean method5343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5344(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static143.anInt2891++;
		Static314.anInt5476 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static358.anInt6251; local7 < Static235.anInt4487; local7++) {
			@Pc(12) Class164[][] local12 = Static202.aClass164ArrayArrayArray5[local7];
			for (local14 = Static105.anInt2325; local14 < Static343.anInt775; local14++) {
				for (@Pc(17) int local17 = Static243.anInt4530; local17 < Static153.anInt3087; local17++) {
					@Pc(24) Class164 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static252.aBooleanArrayArray4[local14 + Static230.anInt4431 - Static431.anInt7073][local17 + Static230.anInt4431 - Static93.anInt1887] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean464 = true;
							local24.aBoolean466 = true;
							if (local24.aClass7_3 == null) {
								local24.aBoolean465 = false;
							} else {
								local24.aBoolean465 = true;
							}
							Static314.anInt5476++;
						} else {
							local24.aBoolean464 = false;
							local24.aBoolean466 = false;
							local24.aByte49 = 0;
							if (local14 >= Static431.anInt7073 - 16 && local14 <= Static431.anInt7073 + 16 && local17 >= Static93.anInt1887 - 16 && local17 <= Static93.anInt1887 + 16 && (local24.aClass16_Sub5_3 != null || local24.aClass16_Sub5_2 != null || local24.aClass16_Sub2_2 != null || local24.aClass16_Sub2_3 != null || local24.aClass16_Sub4_2 != null || local24.aClass7_3 != null)) {
								Static433.aClass70_1.method5076(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static285.aClass65Array3 == Static417.aClass65Array4;
		for (local14 = Static358.anInt6251; local14 < Static235.anInt4487; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static390.aClass19_37.method4243() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static252.aBooleanArrayArray4.length;
				if (Static105.anInt2325 + Static252.aBooleanArrayArray4.length > Static422.anInt6945) {
					local172 -= Static105.anInt2325 + Static252.aBooleanArrayArray4.length - Static422.anInt6945;
				}
				@Pc(192) int local192 = Static252.aBooleanArrayArray4[0].length;
				if (Static243.anInt4530 + Static252.aBooleanArrayArray4[0].length > Static171.anInt3361) {
					local192 -= Static243.anInt4530 + Static252.aBooleanArrayArray4[0].length - Static171.anInt3361;
				}
				@Pc(213) int local213 = Static453.anInt7371;
				while (true) {
					if (local213 >= local172) {
						Static433.aClass70_1.method5079(local14, true, Static417.aClass65Array4[local14], local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static105.anInt2325 - Static453.anInt7371;
					for (@Pc(222) int local222 = Static59.anInt1088; local222 < local192; local222++) {
						Static440.aBooleanArrayArray6[local213][local222] = false;
						if (Static252.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static243.anInt4530 - Static59.anInt1088;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static202.aClass164ArrayArrayArray5[local243][local220][local241] != null && Static202.aClass164ArrayArrayArray5[local243][local220][local241].aByte53 == local14) {
									Static440.aBooleanArrayArray6[local213][local222] = Static202.aClass164ArrayArrayArray5[local243][local220][local241].aBoolean464;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static433.aClass70_1.method5079(local14, false, Static417.aClass65Array4[local14], local161);
			}
			Static433.aClass70_1.method5074();
		}
		if (!Static356.method4833(true)) {
			Static356.method4833(false);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[I[[B[BI[I[[B)I")
	public static int method5345(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg1[arg4];
		@Pc(15) int local15 = arg5[arg4] + local9;
		@Pc(19) int local19 = arg1[arg0];
		@Pc(26) int local26 = local19 + arg5[arg0];
		@Pc(28) int local28 = local9;
		if (local9 < local19) {
			local28 = local19;
		}
		@Pc(39) int local39 = local15;
		if (local15 > local26) {
			local39 = local26;
		}
		@Pc(54) int local54 = arg3[arg4] & 0xFF;
		if ((arg3[arg0] & 0xFF) < local54) {
			local54 = arg3[arg0] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg2[arg4];
		@Pc(79) byte[] local79 = arg6[arg0];
		@Pc(84) int local84 = local28 - local9;
		@Pc(88) int local88 = local28 - local19;
		for (@Pc(98) int local98 = local28; local98 < local39; local98++) {
			@Pc(110) int local110 = local79[local88++] + local75[local84++];
			if (local110 < local54) {
				local54 = local110;
			}
		}
		return -local54;
	}
}
