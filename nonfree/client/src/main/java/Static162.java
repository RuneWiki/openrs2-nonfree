import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "Lclient!ec;")
	public static Class86 aClass86_2;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIII)V")
	public static void method3522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg1 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (arg2 >= Static380.anInt7421 && arg2 <= Static237.anInt5159) {
			local99 = Static317.method5515(Static38.anInt823, arg0 + arg4, Static161.anInt7734);
			local108 = Static317.method5515(Static38.anInt823, arg0 - arg4, Static161.anInt7734);
			Static280.method5108(local99, Static208.anIntArrayArray20[arg2], local108, arg3);
		}
		@Pc(122) int local122 = local51 * (arg1 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local122;
			local122 -= local51;
			local71 -= local51;
			local9--;
			local99 = arg2 - local9;
			local108 = local9 + arg2;
			if (Static380.anInt7421 <= local108 && Static237.anInt5159 >= local99) {
				@Pc(225) int local225 = Static317.method5515(Static38.anInt823, arg0 + local7, Static161.anInt7734);
				@Pc(234) int local234 = Static317.method5515(Static38.anInt823, arg0 - local7, Static161.anInt7734);
				if (local99 >= Static380.anInt7421) {
					Static280.method5108(local225, Static208.anIntArrayArray20[local99], local234, arg3);
				}
				if (local108 <= Static237.anInt5159) {
					Static280.method5108(local225, Static208.anIntArrayArray20[local108], local234, arg3);
				}
			}
		}
	}
}
