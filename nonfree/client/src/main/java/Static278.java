import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!vd;")
	public static Class353 aClass353_50;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[ILclient!bs;[I[I)V")
	public static void method4870(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class20_Sub2_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(14) int local14 = 0; local14 < arg2.length; local14++) {
			@Pc(20) int local20 = arg2[local14];
			@Pc(24) int local24 = arg3[local14];
			@Pc(28) int local28 = arg0[local14];
			@Pc(30) int local30 = 0;
			while (local24 != 0 && arg1.aClass113Array3.length > local30) {
				if ((local24 & 0x1) != 0) {
					if (local20 == -1) {
						arg1.aClass113Array3[local30] = null;
					} else {
						@Pc(51) Class21 local51 = Static294.aClass373_2.method8738(local20);
						@Pc(54) int local54 = local51.anInt351;
						@Pc(59) Class113 local59 = arg1.aClass113Array3[local30];
						if (local59 != null) {
							if (local59.anInt3650 == local20) {
								if (local54 == 0) {
									local59 = arg1.aClass113Array3[local30] = null;
								} else if (local54 == 1) {
									local59.anInt3651 = 1;
									local59.anInt3647 = 0;
									local59.anInt3652 = 0;
									local59.anInt3646 = local28;
									local59.anInt3649 = 0;
									if (!arg1.aBoolean377) {
										Static558.method8052(0, arg1, local51);
									}
								} else if (local54 == 2) {
									local59.anInt3652 = 0;
								}
							} else if (local51.anInt355 >= Static294.aClass373_2.method8738(local59.anInt3650).anInt355) {
								local59 = arg1.aClass113Array3[local30] = null;
							}
						}
						if (local59 == null) {
							local59 = arg1.aClass113Array3[local30] = new Class113();
							local59.anInt3646 = local28;
							local59.anInt3651 = 1;
							local59.anInt3650 = local20;
							local59.anInt3647 = 0;
							local59.anInt3652 = 0;
							local59.anInt3649 = 0;
							if (!arg1.aBoolean377) {
								Static558.method8052(0, arg1, local51);
							}
						}
					}
				}
				local30++;
				local24 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII[F[FFI)V")
	public static void method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg5;
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(24) int local24 = arg3 - arg9;
		@Pc(45) float local45 = (float) local5 * arg6[1] + arg6[0] * (float) local24 + arg6[2] * (float) local9;
		@Pc(66) float local66 = (float) local24 * arg6[3] + arg6[4] * (float) local5 + (float) local9 * arg6[5];
		@Pc(87) float local87 = (float) local9 * arg6[8] + (float) local5 * arg6[7] + (float) local24 * arg6[6];
		@Pc(102) float local102 = (float) Math.sqrt((double) (local66 * local66 + local45 * local45 + local87 * local87));
		@Pc(113) float local113 = (float) Math.atan2((double) local45, (double) local87) / 6.2831855F + 0.5F;
		@Pc(126) float local126 = arg8 + (float) Math.asin((double) (local66 / local102)) / 3.1415927F + 0.5F;
		@Pc(149) float local149;
		if (arg1 == 1) {
			local149 = local113;
			local113 = -local126;
			local126 = local149;
		} else if (arg1 == 2) {
			local126 = -local126;
			local113 = -local113;
		} else if (arg1 == 3) {
			local149 = local113;
			local113 = local126;
			local126 = -local149;
		}
		arg7[0] = local113;
		arg7[1] = local126;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4873(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = Static557.method8051(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!mi;")
	public static Class207 method4874() {
		return new Class207(1, false);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)V")
	public static void method4875(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static417.method6556(Static317.aClass192_12.method5299(Static307.anInt5931), arg1, arg0);
	}
}
