import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "[Lclient!qda;")
	public static Class6_Sub1_Sub1[] aClass6_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	public static int anInt8373;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "Lclient!wp;")
	public static Class363 aClass363_245 = null;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	public static int anInt8371 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIII)V")
	public static void method6946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg0 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg0 - 1) * local56;
		Static276.method3099(arg4 - arg1, Static582.anIntArrayArray69[arg3], arg2, arg4 + arg1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local52 += local82;
					local68 += local60;
					local7++;
					local82 += local60;
				}
			}
			if (local52 < 0) {
				local38 += local68;
				local52 += local82;
				local82 += local60;
				local68 += local60;
				local7++;
			}
			local52 += -local76;
			local38 += -local88;
			local76 -= local56;
			local88 -= local56;
			local9--;
			@Pc(175) int local175 = arg3 - local9;
			@Pc(180) int local180 = arg3 + local9;
			@Pc(184) int local184 = arg4 + local7;
			@Pc(189) int local189 = arg4 - local7;
			Static276.method3099(local189, Static582.anIntArrayArray69[local175], arg2, local184);
			Static276.method3099(local189, Static582.anIntArrayArray69[local180], arg2, local184);
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
	public static int method6947(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
