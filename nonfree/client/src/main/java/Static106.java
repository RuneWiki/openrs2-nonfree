import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array43;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
	public static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
	public static final int[] anIntArray233 = new int[100];

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "F")
	public static float aFloat31 = 0.0F;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!vq;Lclient!uh;ZB[Lclient!qr;)V")
	public static void method2346(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class170[] arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (!arg3) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static350.anInt6637; local13++) {
					for (local17 = 0; local17 < Static105.anInt2647; local17++) {
						if ((Static2.aByteArrayArrayArray1[local9][local13][local17] & 0x1) != 0) {
							local31 = local9;
							if ((Static2.aByteArrayArrayArray1[1][local13][local17] & 0x2) != 0) {
								local31 = local9 - 1;
							}
							if (local31 >= 0) {
								arg4[local31].method4600(local17, local13);
							}
						}
					}
				}
			}
		}
		@Pc(78) int[][] local78 = new int[Static350.anInt6637][Static105.anInt2647];
		for (local13 = 0; local13 < arg0; local13++) {
			for (local17 = 0; local17 < Static105.anInt2647; local17++) {
				Static181.anIntArray325[local17] = 0;
				Static290.anIntArray455[local17] = 0;
				Static319.anIntArray483[local17] = 0;
				Static116.anIntArray240[local17] = 0;
				Static222.anIntArray386[local17] = 0;
			}
			for (local31 = -5; local31 < Static350.anInt6637; local31++) {
				@Pc(126) int local126;
				@Pc(143) int local143;
				@Pc(209) int local209;
				for (@Pc(120) int local120 = 0; local120 < Static105.anInt2647; local120++) {
					local126 = local31 + 5;
					@Pc(187) int local187;
					if (Static350.anInt6637 > local126) {
						local143 = Static67.aByteArrayArrayArray4[local13][local126][local120] & 0xFF;
						if (local143 > 0) {
							@Pc(151) Class156 local151 = Static183.method3514(local143 - 1);
							Static181.anIntArray325[local120] += local151.anInt4819;
							Static290.anIntArray455[local120] += local151.anInt4827;
							Static319.anIntArray483[local120] += local151.anInt4825;
							Static116.anIntArray240[local120] += local151.anInt4820;
							local187 = Static222.anIntArray386[local120]++;
						}
					}
					local143 = local31 - 5;
					if (local143 >= 0) {
						local209 = Static67.aByteArrayArrayArray4[local13][local143][local120] & 0xFF;
						if (local209 > 0) {
							@Pc(217) Class156 local217 = Static183.method3514(local209 - 1);
							Static181.anIntArray325[local120] -= local217.anInt4819;
							Static290.anIntArray455[local120] -= local217.anInt4827;
							Static319.anIntArray483[local120] -= local217.anInt4825;
							Static116.anIntArray240[local120] -= local217.anInt4820;
							local187 = Static222.anIntArray386[local120]--;
						}
					}
				}
				if (local31 >= 0) {
					local126 = 0;
					local143 = 0;
					local209 = 0;
					@Pc(270) int local270 = 0;
					@Pc(272) int local272 = 0;
					for (@Pc(274) int local274 = -5; local274 < Static105.anInt2647; local274++) {
						@Pc(280) int local280 = local274 + 5;
						if (local280 < Static105.anInt2647) {
							local209 += Static319.anIntArray483[local280];
							local126 += Static181.anIntArray325[local280];
							local270 += Static116.anIntArray240[local280];
							local143 += Static290.anIntArray455[local280];
							local272 += Static222.anIntArray386[local280];
						}
						@Pc(321) int local321 = local274 - 5;
						if (local321 >= 0) {
							local126 -= Static181.anIntArray325[local321];
							local209 -= Static319.anIntArray483[local321];
							local272 -= Static222.anIntArray386[local321];
							local270 -= Static116.anIntArray240[local321];
							local143 -= Static290.anIntArray455[local321];
						}
						if (local274 >= 0 && local270 > 0 && local272 > 0) {
							local78[local31][local274] = Static224.method4038(local126 * 256 / local270, local143 / local272, local209 / local272);
						}
					}
				}
			}
			Static183.method3512(arg1, local78, Static261.aClass60Array2[local13], Static80.aByteArrayArrayArray6[local13], Static105.anInt2647, arg2, Static353.aByteArrayArrayArray9[local13], arg3, Static350.anInt6637, Static251.aByteArrayArrayArray12[local13], Static67.aByteArrayArrayArray4[local13], local13);
			Static67.aByteArrayArrayArray4[local13] = null;
			Static251.aByteArrayArrayArray12[local13] = null;
			Static353.aByteArrayArrayArray9[local13] = null;
			Static80.aByteArrayArrayArray6[local13] = null;
		}
		if (!arg3) {
			if (Static237.aBoolean480) {
				Static167.method3264();
			}
			if (Static9.anInt216 != 0) {
				Static186.method3557();
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			Static261.aClass60Array2[local17].method2257();
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Lclient!ao;")
	public static Class10_Sub1 method2348() {
		Static287.anInt4409 = 0;
		return Static223.method4033();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
	public static void method2349(@OriginalArg(1) int arg0) {
		Static184.method3527();
		Static140.method2945();
		Static72.method1718(true, arg0);
		Static86.method2107(Static316.aClass193_99, Static103.aClass193_38, Static274.aClass47_9);
		Static269.method4622(Static274.aClass47_9, Static316.aClass193_99);
		Static244.method4312(Static237.aClass58Array136);
		Static306.method5033();
		Static12.method242();
		if (Static139.anInt3199 == 10) {
			Static339.method10(false);
		} else if (Static139.anInt3199 == 30) {
			Static243.method5095(25);
			return;
		} else if (Static139.anInt3199 == 5) {
			Static90.method2190(Static274.aClass47_9, Static316.aClass193_99);
			return;
		}
	}
}
