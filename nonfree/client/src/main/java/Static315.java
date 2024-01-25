import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Lclient!rj;")
	public static Class209 aClass209_3;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
	public static int anInt5432;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static22.anInt541++;
		Static187.anInt3381 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static378.anInt4251; local7 < Static68.anInt1553; local7++) {
			@Pc(12) Class80[][] local12 = client.lb[local7];
			for (local14 = Static397.anInt6377; local14 < Static190.anInt3419; local14++) {
				for (@Pc(17) int local17 = Static312.anInt5398; local17 < Static27.anInt608; local17++) {
					@Pc(24) Class80 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static23.aBooleanArrayArray4[local14 + Static75.anInt1695 - Static398.anInt6395][local17 + Static75.anInt1695 - Static350.anInt5829] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean143 = true;
							local24.aBoolean141 = true;
							if (local24.aClass22_2 == null) {
								local24.aBoolean142 = false;
							} else {
								local24.aBoolean142 = true;
							}
							Static187.anInt3381++;
						} else {
							local24.aBoolean143 = false;
							local24.aBoolean141 = false;
							local24.aByte48 = 0;
							if (local14 >= Static398.anInt6395 - 16 && local14 <= Static398.anInt6395 + 16 && local17 >= Static350.anInt5829 - 16 && local17 <= Static350.anInt5829 + 16 && (local24.aClass31_Sub3_3 != null || local24.aClass31_Sub3_2 != null || local24.aClass31_Sub4_2 != null || local24.aClass31_Sub4_1 != null || local24.aClass31_Sub1_2 != null || local24.aClass22_2 != null)) {
								Static135.aClass6_1.method5186(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static277.aClass149Array3 == Static105.aClass149Array1;
		for (local14 = Static378.anInt4251; local14 < Static68.anInt1553; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static242.aClass39_7.method4551() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static23.aBooleanArrayArray4.length;
				if (Static397.anInt6377 + Static23.aBooleanArrayArray4.length > Static132.anInt2639) {
					local172 -= Static397.anInt6377 + Static23.aBooleanArrayArray4.length - Static132.anInt2639;
				}
				@Pc(192) int local192 = Static23.aBooleanArrayArray4[0].length;
				if (Static312.anInt5398 + Static23.aBooleanArrayArray4[0].length > Static87.anInt1875) {
					local192 -= Static312.anInt5398 + Static23.aBooleanArrayArray4[0].length - Static87.anInt1875;
				}
				@Pc(213) int local213 = Static241.anInt4414;
				while (true) {
					if (local213 >= local172) {
						Static135.aClass6_1.method5189(local161, true, local14, Static105.aClass149Array1[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static397.anInt6377 - Static241.anInt4414;
					for (@Pc(222) int local222 = Static408.anInt6575; local222 < local192; local222++) {
						Static390.aBooleanArrayArray8[local213][local222] = false;
						if (Static23.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static312.anInt5398 - Static408.anInt6575;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (client.lb[local243][local220][local241] != null && client.lb[local243][local220][local241].aByte52 == local14) {
									Static390.aBooleanArrayArray8[local213][local222] = client.lb[local243][local220][local241].aBoolean143;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static135.aClass6_1.method5189(local161, false, local14, Static105.aClass149Array1[local14]);
			}
			Static135.aClass6_1.method5192();
		}
		if (!Static100.method1786(true)) {
			Static100.method1786(false);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZIIIII)V")
	public static void method4479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - arg3;
		@Pc(12) int local12 = arg2 - arg4;
		if (local8 == 0) {
			if (local12 != 0) {
				Static400.method5336(arg2, arg4, arg1, arg3);
			}
		} else if (local12 == 0) {
			Static12.method352(arg1, arg0, arg4, arg3);
		} else {
			@Pc(49) int local49 = (local12 << 12) / local8;
			@Pc(58) int local58 = arg4 - (local49 * arg3 >> 12);
			@Pc(74) int local74;
			@Pc(76) int local76;
			if (Static28.anInt644 > arg3) {
				local76 = local58 + (Static28.anInt644 * local49 >> 12);
				local74 = Static28.anInt644;
			} else if (Static125.anInt2545 >= arg3) {
				local74 = arg3;
				local76 = arg4;
			} else {
				local74 = Static125.anInt2545;
				local76 = local58 + (Static125.anInt2545 * local49 >> 12);
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (arg0 < Static28.anInt644) {
				local110 = (local49 * Static28.anInt644 >> 12) + local58;
				local112 = Static28.anInt644;
			} else if (arg0 <= Static125.anInt2545) {
				local110 = arg2;
				local112 = arg0;
			} else {
				local110 = local58 + (local49 * Static125.anInt2545 >> 12);
				local112 = Static125.anInt2545;
			}
			if (local76 < Static108.anInt2276) {
				local74 = (Static108.anInt2276 - local58 << 12) / local49;
				local76 = Static108.anInt2276;
			} else if (local76 > Static173.anInt3208) {
				local76 = Static173.anInt3208;
				local74 = (Static173.anInt3208 - local58 << 12) / local49;
			}
			if (Static108.anInt2276 > local110) {
				local112 = (Static108.anInt2276 - local58 << 12) / local49;
				local110 = Static108.anInt2276;
			} else if (Static173.anInt3208 < local110) {
				local110 = Static173.anInt3208;
				local112 = (Static173.anInt3208 - local58 << 12) / local49;
			}
			Static372.method5077(local112, local74, local110, arg1, local76);
		}
	}
}
