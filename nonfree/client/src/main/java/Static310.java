import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "Lclient!cc;")
	public static final Class2_Sub11 aClass2_Sub11_2 = new Class2_Sub11(0, -1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIIII)V")
	public static void method4550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg3 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg3 - 1) * local51;
		Static315.method4662(arg4 + arg0, Static15.anIntArrayArray1[arg2], arg0 - arg4, arg1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local47 += local82;
					local68 += local60;
					local82 += local60;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local68;
				local47 += local82;
				local82 += local60;
				local7++;
				local68 += local60;
			}
			local38 += -local88;
			local47 += -local76;
			local88 -= local51;
			local76 -= local51;
			local9--;
			@Pc(171) int local171 = arg2 - local9;
			@Pc(176) int local176 = arg2 + local9;
			@Pc(180) int local180 = local7 + arg0;
			@Pc(185) int local185 = arg0 - local7;
			Static315.method4662(local180, Static15.anIntArrayArray1[local171], local185, arg1);
			Static315.method4662(local180, Static15.anIntArrayArray1[local176], local185, arg1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method4551() {
		if (Static315.anInt5369 != -1) {
			Static53.method898(-1, Static315.anInt5369, false, -1);
			Static315.anInt5369 = -1;
		}
	}
}
