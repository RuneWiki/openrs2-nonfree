import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
	public static boolean aBoolean527 = true;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	public static void method5824() {
		Static632.aClass62_50.method1683();
		Static57.aClass62_33.method1683();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIBII)V")
	public static void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(79) int local79 = ((arg0 << 1) - 3) * local25;
		@Pc(85) int local85 = local55;
		@Pc(91) int local91 = local51 * (arg0 - 1);
		@Pc(113) int local113;
		@Pc(122) int local122;
		if (arg2 >= Static255.anInt4818 && Static658.anInt10079 >= arg2) {
			local113 = Static400.method5735(Static303.anInt9951, arg4 + arg3, Static408.anInt6951);
			local122 = Static400.method5735(Static303.anInt9951, arg3 - arg4, Static408.anInt6951);
			Static526.method7369(Static299.anIntArrayArray58[arg2], local113, local122, arg1);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local85;
					local63 += local55;
					local85 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local85;
				local7++;
				local85 += local55;
				local63 += local55;
			}
			local38 += -local91;
			local47 += -local79;
			local91 -= local51;
			local9--;
			local79 -= local51;
			local113 = arg2 - local9;
			local122 = local9 + arg2;
			if (local122 >= Static255.anInt4818 && Static658.anInt10079 >= local113) {
				@Pc(223) int local223 = Static400.method5735(Static303.anInt9951, arg3 + local7, Static408.anInt6951);
				@Pc(232) int local232 = Static400.method5735(Static303.anInt9951, arg3 - local7, Static408.anInt6951);
				if (Static255.anInt4818 <= local113) {
					Static526.method7369(Static299.anIntArrayArray58[local113], local223, local232, arg1);
				}
				if (local122 <= Static658.anInt10079) {
					Static526.method7369(Static299.anIntArrayArray58[local122], local223, local232, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!fca;)Lclient!uo;")
	public static Class363 method5828(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4868();
		return new Class363(local7);
	}
}
