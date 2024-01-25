import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_83 = new Class263(69, 0);

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt3494 = 0;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt3495 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!qs;)V")
	public static void method2728(@OriginalArg(1) Class211 arg0) {
		Static3.anInt53 = 0;
		Static131.anInt2929 = 0;
		Static30.aClass117_1 = new Class117();
		Static124.aClass41_Sub3_Sub2_Sub1Array2 = new Class41_Sub3_Sub2_Sub1[1024];
		Static152.method2398(arg0);
		Static289.method4248(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg5;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(75) int local75 = local25 * (1 - local57) + local41;
		@Pc(84) int local84 = local29 - local45 * (local57 - 1);
		@Pc(93) int local93 = (1 - local61) * local33 + local49;
		@Pc(102) int local102 = local37 - local53 * (local61 - 1);
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = (local57 - 3) * local45;
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = local53 * (local61 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg1 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(158) int[] local158 = Static60.anIntArrayArray14[arg6];
		Static228.method3480(arg2 - arg0, arg3, local158, arg2 - local16);
		Static228.method3480(arg2 - local16, arg4, local158, arg2 + local16);
		Static228.method3480(arg2 + local16, arg3, local158, arg2 + arg0);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local21 >= local9;
			if (local204) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local148 += local118;
						local11++;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local148 += local118;
					local11++;
					local132 += local118;
				}
				local93 += -local154;
				local102 += -local138;
				local154 -= local114;
				local138 -= local114;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local122;
					local84 += local140;
					local122 += local110;
					local7++;
					local140 += local110;
				}
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local7++;
				local140 += local110;
				local122 += local110;
			}
			local75 += -local146;
			local84 += -local128;
			local128 -= local106;
			local146 -= local106;
			local9--;
			@Pc(347) int local347 = arg6 - local9;
			@Pc(351) int local351 = local9 + arg6;
			@Pc(355) int local355 = local7 + arg2;
			@Pc(360) int local360 = arg2 - local7;
			if (local204) {
				@Pc(366) int local366 = arg2 + local11;
				@Pc(371) int local371 = arg2 - local11;
				Static228.method3480(local360, arg3, Static60.anIntArrayArray14[local347], local371);
				Static228.method3480(local371, arg4, Static60.anIntArrayArray14[local347], local366);
				Static228.method3480(local366, arg3, Static60.anIntArrayArray14[local347], local355);
				Static228.method3480(local360, arg3, Static60.anIntArrayArray14[local351], local371);
				Static228.method3480(local371, arg4, Static60.anIntArrayArray14[local351], local366);
				Static228.method3480(local366, arg3, Static60.anIntArrayArray14[local351], local355);
			} else {
				Static228.method3480(local360, arg3, Static60.anIntArrayArray14[local347], local355);
				Static228.method3480(local360, arg3, Static60.anIntArrayArray14[local351], local355);
			}
		}
	}
}
