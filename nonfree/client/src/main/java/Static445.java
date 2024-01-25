import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_33 = new Class42(8);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public static void method6296(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub2_Sub13 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class131 local8 = Static493.aClass131Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static430.anInt7565; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static374.anInt6925; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static270.anInt5288;
							@Pc(32) int local32 = local12 << Static270.anInt5288;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class131 local41 = Static493.aClass131Array5[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIFI[FIIBIFF)V")
	public static void method6297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float arg11) {
		@Pc(9) int local9 = arg7 - arg8;
		@Pc(13) int local13 = arg1 - arg0;
		@Pc(17) int local17 = arg3 - arg9;
		@Pc(38) float local38 = arg6[1] * (float) local13 + arg6[0] * (float) local9 + arg6[2] * (float) local17;
		@Pc(59) float local59 = (float) local13 * arg6[4] + arg6[3] * (float) local9 + (float) local17 * arg6[5];
		@Pc(80) float local80 = (float) local17 * arg6[8] + (float) local9 * arg6[6] + arg6[7] * (float) local13;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (arg2 == 0) {
			local100 = arg4 + 0.5F - local80;
			local94 = arg10 + local38 + 0.5F;
		} else if (arg2 == 1) {
			local94 = arg10 + local38 + 0.5F;
			local100 = arg4 + local80 + 0.5F;
		} else if (arg2 == 2) {
			local100 = arg11 + 0.5F - local59;
			local94 = arg10 + 0.5F - local38;
		} else if (arg2 == 3) {
			local94 = local38 + arg10 + 0.5F;
			local100 = arg11 + 0.5F - local59;
		} else if (arg2 == 4) {
			local100 = arg11 + 0.5F - local59;
			local94 = local80 + arg4 + 0.5F;
		} else {
			local94 = arg4 + 0.5F - local80;
			local100 = arg11 + 0.5F - local59;
		}
		@Pc(193) float local193;
		if (arg5 == 1) {
			local193 = local94;
			local94 = -local100;
			local100 = local193;
		} else if (arg5 == 2) {
			local94 = -local94;
			local100 = -local100;
		} else if (arg5 == 3) {
			local193 = local94;
			local94 = local100;
			local100 = -local193;
		}
		Static255.aFloat218 = local94;
		Static61.aFloat41 = local100;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method6298() {
		Static164.aClass5_Sub3_Sub1_2.method4184(Static46.aClass117_21.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static454.aClass117_190.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static212.aClass117_110.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static52.aClass117_28.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static371.aClass117_157.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static338.aClass117_151.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static108.aClass117_61.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static290.aClass117_131.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static533.aClass117_228.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static533.aClass117_229.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static193.aClass117_104.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static56.aClass117_29.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static497.aClass117_234.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static145.aClass117_76.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static476.aClass117_204.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static393.aClass117_164.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static382.aClass117_162.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static437.aClass117_181.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static315.aClass117_141.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static178.aClass117_97.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static444.aClass117_183.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static162.aClass117_88.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static435.aClass117_180.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static317.aClass117_142.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static539.aClass117_232.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static72.aClass117_35.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static419.aClass117_175.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static79.aClass117_38.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static541.aClass117_233.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static466.aClass117_199.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static530.aClass117_226.method2950());
		Static164.aClass5_Sub3_Sub1_2.method4184(Static337.aClass117_149.method2950());
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!bda;III)V")
	public static void method6300(@OriginalArg(1) Class15_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray306[0];
		@Pc(15) int local15 = arg0.anIntArray307[0];
		if (local10 < 0 || Static460.anInt7894 <= local10 || local15 < 0 || Static235.anInt4493 <= local15 || (arg2 < 0 || arg2 >= Static460.anInt7894 || arg1 < 0 || arg1 >= Static235.anInt4493)) {
			return;
		}
		@Pc(81) int local81 = Static402.method5842(arg2, arg1, Static71.aClass10Array3[arg0.aByte91], Static218.anIntArray285, 0, 0, Static226.anIntArray321, local10, local15, 0, arg0.method4035(), 0, -4, true);
		if (local81 >= 1 && local81 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local81 - 1; local91++) {
				arg0.method801((byte) 2, Static218.anIntArray285[local91], Static226.anIntArray321[local91]);
			}
		}
	}
}
