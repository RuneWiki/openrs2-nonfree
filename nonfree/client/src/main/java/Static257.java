import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!jo;")
	public static Class168 aClass168_64;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIIIZII)V")
	public static void method4468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static104.aClass6_Sub6_Sub1_4.anInt1155 != 0 && arg1 != 0 && Static521.anInt9062 < 50 && arg0 != -1) {
			Static360.aClass161Array1[Static521.anInt9062++] = new Class161((byte) 2, arg0, arg1, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
	public static void method4469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(42) int local42 = local13 * (1 - local29) + local21;
		@Pc(51) int local51 = local17 - (local29 - 1) * local25;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg1 << 1) - 3) * local25;
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = (arg1 - 1) * local55;
		Static115.method2332(arg2 - arg0, arg0 + arg2, arg4, Static183.anIntArrayArray26[arg3]);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local67;
					local51 += local81;
					local7++;
					local81 += local59;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local67 += local59;
				local7++;
				local81 += local59;
			}
			local42 += -local87;
			local51 += -local75;
			local87 -= local55;
			local75 -= local55;
			local9--;
			@Pc(173) int local173 = arg3 - local9;
			@Pc(177) int local177 = local9 + arg3;
			@Pc(181) int local181 = arg2 + local7;
			@Pc(185) int local185 = arg2 - local7;
			Static115.method2332(local185, local181, arg4, Static183.anIntArrayArray26[local173]);
			Static115.method2332(local185, local181, arg4, Static183.anIntArrayArray26[local177]);
		}
	}
}
