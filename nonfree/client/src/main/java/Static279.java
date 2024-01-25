import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_76 = new Class100(15, -1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIBI)V")
	public static void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static405.method6009(arg0, arg2, arg4, arg3);
			}
		} else if (local10 == 0) {
			Static130.method2121(arg0, arg1, arg3, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(69) boolean local69 = local15 < local10;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg3;
				local75 = arg1;
				arg3 = arg4;
				arg1 = arg2;
				arg4 = local73;
				arg2 = local75;
			}
			if (arg1 < arg3) {
				local73 = arg3;
				local75 = arg4;
				arg3 = arg1;
				arg1 = local73;
				arg4 = arg2;
				arg2 = local75;
			}
			local73 = arg4;
			local75 = arg1 - arg3;
			@Pc(108) int local108 = arg2 - arg4;
			@Pc(113) int local113 = -(local75 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(132) int local132 = arg4 >= arg2 ? -1 : 1;
			@Pc(136) int local136;
			if (local69) {
				for (local136 = arg3; local136 <= arg1; local136++) {
					local113 += local108;
					Static274.anIntArrayArray34[local136][local73] = arg0;
					if (local113 > 0) {
						local73 += local132;
						local113 -= local75;
					}
				}
			} else {
				for (local136 = arg3; local136 <= arg1; local136++) {
					local113 += local108;
					Static274.anIntArrayArray34[local73][local136] = arg0;
					if (local113 > 0) {
						local73 += local132;
						local113 -= local75;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	public static void method4042() {
		Static117.aClass137_46.method7950(Static345.aClass26_5);
		Static117.aClass137_46.DA(Static207.anInt3881, Static92.anInt2035, Static674.anInt11178, Static382.anInt7017);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)I")
	public static int method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg3 : arg1;
		@Pc(31) int local31 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg1 : arg0) : arg3;
		return ((local7 & 0x2) == 0 ? local31 : -local31) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIII)V")
	public static void method4046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class14_Sub3_Sub9 local11 = Static142.method2219((long) arg1, 8);
		local11.method2817();
		local11.anInt3419 = arg0;
		local11.anInt3413 = arg3;
		local11.anInt3409 = arg2;
	}
}
