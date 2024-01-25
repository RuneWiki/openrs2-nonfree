import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!wia;")
	public static Class386 aClass386_142;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt11144;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	public static int anInt11142 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBIII)V")
	public static void method9268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(35) int local35 = local13 << 1;
		@Pc(39) int local39 = arg4 << 1;
		@Pc(49) int local49 = local13 * (1 - local39) + local21;
		@Pc(58) int local58 = local17 - local35 * (local39 - 1);
		@Pc(62) int local62 = local13 << 2;
		@Pc(66) int local66 = local17 << 2;
		@Pc(74) int local74 = local21 * 3;
		@Pc(82) int local82 = ((arg4 << 1) - 3) * local35;
		@Pc(88) int local88 = local66;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (arg0 >= Static468.anInt355 && arg0 <= Static370.anInt10475) {
			local107 = Static258.method3697(arg2 + arg1, Static575.anInt9879, Static313.anInt9045);
			local116 = Static258.method3697(arg2 - arg1, Static575.anInt9879, Static313.anInt9045);
			Static679.method9323(Static274.anIntArrayArray34[arg0], local116, arg3, local107);
		}
		@Pc(130) int local130 = (arg4 - 1) * local62;
		while (local9 > 0) {
			if (local49 < 0) {
				while (local49 < 0) {
					local58 += local88;
					local49 += local74;
					local88 += local66;
					local74 += local66;
					local7++;
				}
			}
			if (local58 < 0) {
				local49 += local74;
				local58 += local88;
				local7++;
				local74 += local66;
				local88 += local66;
			}
			local49 += -local130;
			local58 += -local82;
			local82 -= local62;
			local9--;
			local130 -= local62;
			local107 = arg0 - local9;
			local116 = arg0 + local9;
			if (Static468.anInt355 <= local116 && Static370.anInt10475 >= local107) {
				@Pc(230) int local230 = Static258.method3697(arg2 + local7, Static575.anInt9879, Static313.anInt9045);
				@Pc(239) int local239 = Static258.method3697(arg2 - local7, Static575.anInt9879, Static313.anInt9045);
				if (local107 >= Static468.anInt355) {
					Static679.method9323(Static274.anIntArrayArray34[local107], local239, arg3, local230);
				}
				if (Static370.anInt10475 >= local116) {
					Static679.method9323(Static274.anIntArrayArray34[local116], local239, arg3, local230);
				}
			}
		}
	}
}
