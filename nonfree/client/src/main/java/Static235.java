import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt4528 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
	public static void method4192(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg3) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg2; local55 < arg3; local55++) {
			if (arg0[local55] < (long) (local53 & local55) + local21) {
				@Pc(76) long local76 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17] = local76;
				@Pc(90) Object local90 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17++] = local90;
			}
		}
		arg0[arg3] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method4192(arg0, arg1, arg2, local17 - 1);
		method4192(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
	public static void method4193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(52) int local52 = local17 - local25 * (local29 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg4 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg4 - 1);
		@Pc(112) int local112;
		@Pc(122) int local122;
		if (Static94.anInt2057 <= arg3 && arg3 <= Static187.anInt3872) {
			local112 = Static452.method6975(Static119.anInt2469, arg1 + arg0, Static325.anInt6148);
			local122 = Static452.method6975(Static119.anInt2469, arg1 - arg0, Static325.anInt6148);
			Static313.method5430(local112, arg2, Static143.anIntArrayArray33[arg3], local122);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local52 += local82;
					local7++;
					local68 += local60;
					local82 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local38 += local68;
				local7++;
				local82 += local60;
				local68 += local60;
			}
			local38 += -local88;
			local52 += -local76;
			local76 -= local56;
			local88 -= local56;
			local9--;
			local112 = arg3 - local9;
			local122 = local9 + arg3;
			if (local122 >= Static94.anInt2057 && local112 <= Static187.anInt3872) {
				@Pc(231) int local231 = Static452.method6975(Static119.anInt2469, arg1 + local7, Static325.anInt6148);
				@Pc(240) int local240 = Static452.method6975(Static119.anInt2469, arg1 - local7, Static325.anInt6148);
				if (local112 >= Static94.anInt2057) {
					Static313.method5430(local231, arg2, Static143.anIntArrayArray33[local112], local240);
				}
				if (local122 <= Static187.anInt3872) {
					Static313.method5430(local231, arg2, Static143.anIntArrayArray33[local122], local240);
				}
			}
		}
	}
}
