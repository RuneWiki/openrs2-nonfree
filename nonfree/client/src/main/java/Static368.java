import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_210 = new Class48(13, -1);

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public static int anInt5965 = 20;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5118(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static404.method4337(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(21) int local21 = arg1 - arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local21 * local21;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local45 + (1 - local61) * local29;
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(91) int local91 = (1 - local65) * local37 + local53;
		@Pc(99) int local99 = local41 - (local65 - 1) * local57;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 << 2;
		@Pc(119) int local119 = local45 * 3;
		@Pc(125) int local125 = (local61 - 3) * local49;
		@Pc(129) int local129 = local53 * 3;
		@Pc(135) int local135 = (local65 - 3) * local57;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg1 - 1);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = local111 * (local21 - 1);
		@Pc(155) int[] local155 = Static369.anIntArrayArray35[arg4];
		Static382.method5419(local155, arg2 - arg0, -local16 + arg2, arg3);
		Static382.method5419(local155, arg2 - local16, local16 + arg2, arg5);
		Static382.method5419(local155, arg2 + local16, arg0 + arg2, arg3);
		while (local9 > 0) {
			@Pc(197) boolean local197 = local9 <= local21;
			if (local197) {
				if (local91 < 0) {
					while (local91 < 0) {
						local99 += local145;
						local91 += local129;
						local129 += local115;
						local145 += local115;
						local11++;
					}
				}
				if (local99 < 0) {
					local91 += local129;
					local99 += local145;
					local11++;
					local129 += local115;
					local145 += local115;
				}
				local99 += -local135;
				local91 += -local151;
				local135 -= local111;
				local151 -= local111;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local119;
					local82 += local137;
					local119 += local107;
					local137 += local107;
					local7++;
				}
			}
			if (local82 < 0) {
				local82 += local137;
				local74 += local119;
				local119 += local107;
				local7++;
				local137 += local107;
			}
			local74 += -local143;
			local82 += -local125;
			local125 -= local103;
			local9--;
			local143 -= local103;
			@Pc(331) int local331 = arg4 - local9;
			@Pc(335) int local335 = local9 + arg4;
			@Pc(339) int local339 = local7 + arg2;
			@Pc(344) int local344 = arg2 - local7;
			if (local197) {
				@Pc(350) int local350 = local11 + arg2;
				@Pc(355) int local355 = arg2 - local11;
				Static382.method5419(Static369.anIntArrayArray35[local331], local344, local355, arg3);
				Static382.method5419(Static369.anIntArrayArray35[local331], local355, local350, arg5);
				Static382.method5419(Static369.anIntArrayArray35[local331], local350, local339, arg3);
				Static382.method5419(Static369.anIntArrayArray35[local335], local344, local355, arg3);
				Static382.method5419(Static369.anIntArrayArray35[local335], local355, local350, arg5);
				Static382.method5419(Static369.anIntArrayArray35[local335], local350, local339, arg3);
			} else {
				Static382.method5419(Static369.anIntArrayArray35[local331], local344, local339, arg3);
				Static382.method5419(Static369.anIntArrayArray35[local335], local344, local339, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5120(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static177.method1119(Static39.aClass48_27);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg0));
			Static209.aClass1_Sub33_Sub2_2.method5143(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!je;)V")
	public static void method5122(@OriginalArg(1) Class117 arg0) {
		@Pc(7) Class117 local7 = Static258.method3962(arg0);
		@Pc(17) int local17;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static218.anInt3871;
			local17 = Static136.anInt6304;
		} else {
			local15 = local7.anInt3071;
			local17 = local7.anInt3074;
		}
		Static212.method2972(false, local15, arg0, local17);
		Static48.method743(local15, arg0, local17);
	}
}
