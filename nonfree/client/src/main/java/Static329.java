import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_196 = new Class186(74, 2);

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_103 = new Class36(67, 7);

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_79 = new Class242(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4480(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static244.anInt4451++;
		Static68.anInt4582 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static219.anInt4078; local7 < Static338.anInt5952; local7++) {
			@Pc(12) Class53[][] local12 = Static40.aClass53ArrayArrayArray2[local7];
			for (local14 = Static127.anInt2572; local14 < Static59.anInt1569; local14++) {
				for (@Pc(17) int local17 = Static180.anInt3345; local17 < Static65.anInt1629; local17++) {
					@Pc(24) Class53 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static282.aBooleanArrayArray5[local14 + Static116.anInt2459 - Static50.anInt1363][local17 + Static116.anInt2459 - Static354.anInt6362] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean129 = true;
							local24.aBoolean128 = true;
							if (local24.aClass165_1 == null) {
								local24.aBoolean127 = false;
							} else {
								local24.aBoolean127 = true;
							}
							Static68.anInt4582++;
						} else {
							local24.aBoolean129 = false;
							local24.aBoolean128 = false;
							local24.aByte40 = 0;
							if (local14 >= Static50.anInt1363 - 16 && local14 <= Static50.anInt1363 + 16 && local17 >= Static354.anInt6362 - 16 && local17 <= Static354.anInt6362 + 16 && (local24.aClass6_Sub1_1 != null || local24.aClass6_Sub1_2 != null || local24.aClass6_Sub3_1 != null || local24.aClass6_Sub3_2 != null || local24.aClass6_Sub4_1 != null || local24.aClass165_1 != null)) {
								Static275.aClass16_1.method5259(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static117.aClass146Array1 == Static346.aClass146Array2;
		for (local14 = Static219.anInt4078; local14 < Static338.anInt5952; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static42.aClass30_3.method4682() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static282.aBooleanArrayArray5.length;
				if (Static127.anInt2572 + Static282.aBooleanArrayArray5.length > Static301.anInt5434) {
					local172 -= Static127.anInt2572 + Static282.aBooleanArrayArray5.length - Static301.anInt5434;
				}
				@Pc(192) int local192 = Static282.aBooleanArrayArray5[0].length;
				if (Static180.anInt3345 + Static282.aBooleanArrayArray5[0].length > Static241.anInt4414) {
					local192 -= Static180.anInt3345 + Static282.aBooleanArrayArray5[0].length - Static241.anInt4414;
				}
				@Pc(213) int local213 = Static430.anInt7168;
				while (true) {
					if (local213 >= local172) {
						Static275.aClass16_1.method5258(Static346.aClass146Array2[local14], local161, local14, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static127.anInt2572 - Static430.anInt7168;
					for (@Pc(222) int local222 = Static312.anInt5608; local222 < local192; local222++) {
						Static249.aBooleanArrayArray4[local213][local222] = false;
						if (Static282.aBooleanArrayArray5[local213][local222]) {
							@Pc(241) int local241 = local222 + Static180.anInt3345 - Static312.anInt5608;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static40.aClass53ArrayArrayArray2[local243][local220][local241] != null && Static40.aClass53ArrayArrayArray2[local243][local220][local241].aByte37 == local14) {
									Static249.aBooleanArrayArray4[local213][local222] = Static40.aClass53ArrayArrayArray2[local243][local220][local241].aBoolean129;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static275.aClass16_1.method5258(Static346.aClass146Array2[local14], local161, local14, false);
			}
			Static275.aClass16_1.method5252();
		}
		if (!Static333.method4506(true)) {
			Static333.method4506(false);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FIIIBIIII[F)V")
	public static void method4481(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(5) int local5 = arg3 - arg5;
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(13) int local13 = arg6 - arg7;
		@Pc(38) float local38 = arg8[2] * (float) local13 + arg8[0] * (float) local5 + arg8[1] * (float) local9;
		@Pc(59) float local59 = (float) local13 * arg8[5] + arg8[4] * (float) local9 + (float) local5 * arg8[3];
		@Pc(80) float local80 = arg8[8] * (float) local13 + arg8[6] * (float) local5 + arg8[7] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg0 + 0.5F;
		@Pc(131) float local131;
		if (arg1 == 1) {
			local131 = local111;
			local111 = -local124;
			local124 = local131;
		} else if (arg1 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg1 == 3) {
			local131 = local111;
			local111 = local124;
			local124 = -local131;
		}
		Static399.aFloat198 = local111;
		Static370.aFloat192 = local124;
	}
}
