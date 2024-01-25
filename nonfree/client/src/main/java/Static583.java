import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "[[Lclient!n;")
	public static Class225[][] aClass225ArrayArray2;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_231 = new Class362(53, 2);

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_42 = new Class350(16);

	@OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
	public static int anInt10139 = 13156520;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
	public static void method8289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg0 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg0 - 1);
		@Pc(101) int local101;
		@Pc(110) int local110;
		if (Static290.anInt5903 <= arg1 && arg1 <= Static530.anInt9437) {
			local101 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 + arg4);
			local110 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - arg2);
			Static306.method5239(Static46.anIntArrayArray4[arg1], local101, arg3, local110);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local7++;
				local63 += local55;
			}
			local47 += -local71;
			local38 += -local83;
			local71 -= local51;
			local83 -= local51;
			local9--;
			local101 = arg1 - local9;
			local110 = local9 + arg1;
			if (local110 >= Static290.anInt5903 && local101 <= Static530.anInt9437) {
				@Pc(213) int local213 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 + local7);
				@Pc(222) int local222 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg4 - local7);
				if (Static290.anInt5903 <= local101) {
					Static306.method5239(Static46.anIntArrayArray4[local101], local213, arg3, local222);
				}
				if (Static530.anInt9437 >= local110) {
					Static306.method5239(Static46.anIntArrayArray4[local110], local213, arg3, local222);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)I")
	public static int method8290(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
