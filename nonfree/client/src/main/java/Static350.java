import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!ac;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_67 = new Class341(70, -1);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[FIBFI[FIFI)V")
	public static void method6051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg2 - arg8;
		@Pc(9) int local9 = arg1 - arg10;
		@Pc(13) int local13 = arg0 - arg4;
		@Pc(38) float local38 = (float) local13 * arg7[1] + (float) local9 * arg7[0] + (float) local5 * arg7[2];
		@Pc(63) float local63 = (float) local9 * arg7[3] + arg7[4] * (float) local13 + (float) local5 * arg7[5];
		@Pc(84) float local84 = (float) local5 * arg7[8] + (float) local13 * arg7[7] + (float) local9 * arg7[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local95 *= arg9;
		}
		@Pc(109) float local109 = arg5 + local63 + 0.5F;
		@Pc(122) float local122;
		if (arg6 == 1) {
			local122 = local95;
			local95 = -local109;
			local109 = local122;
		} else if (arg6 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg6 == 3) {
			local122 = local95;
			local95 = local109;
			local109 = -local122;
		}
		arg3[0] = local95;
		arg3[1] = local109;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ha;IIILclient!sea;I)V")
	public static void method6052(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class331 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class104 local9 = Static157.aClass353_1.method8902(arg3.anInt9453);
		if (local9.anInt3416 == -1) {
			return;
		}
		if (arg3.aBoolean690) {
			@Pc(35) int local35 = arg2 + arg3.anInt9441;
			arg2 = local35 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(47) Class71 local47 = local9.method3189(arg2, arg0, arg3.aBoolean689);
		if (local47 == null) {
			return;
		}
		@Pc(53) int local53 = arg3.anInt9454;
		@Pc(56) int local56 = arg3.anInt9425;
		if ((arg2 & 0x1) == 1) {
			local56 = arg3.anInt9454;
			local53 = arg3.anInt9425;
		}
		@Pc(70) int local70 = local47.method7709();
		@Pc(73) int local73 = local47.method7711();
		if (local9.aBoolean257) {
			local73 = local56 * 4;
			local70 = local53 * 4;
		}
		if (local9.anInt3417 == 0) {
			local47.method7699(arg4, arg1 - (local56 - 1) * 4, local70, local73);
		} else {
			local47.method7702(arg4, arg1 - (local56 - 1) * 4, local70, local73, 0, local9.anInt3417 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII[BB)V")
	public static void method6054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(19) int local19 = arg1 - arg2 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg1 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg0 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)Z")
	public static boolean method6055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
