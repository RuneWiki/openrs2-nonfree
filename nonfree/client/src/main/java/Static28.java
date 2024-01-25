import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!za;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!o;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBII)V")
	public static void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static71.method1100(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(44) int local44 = -1;
		@Pc(48) int[] local48 = Static46.anIntArrayArray24[arg4];
		@Pc(53) int local53 = arg1 - local15;
		@Pc(57) int local57 = local15 + arg1;
		Static215.method3035(arg1 - arg5, local53, local48, arg0);
		Static215.method3035(local53, local57, local48, arg3);
		Static215.method3035(local57, arg1 + arg5, local48, arg0);
		while (local21 > local10) {
			local42 += 2;
			local44 += 2;
			local40 += local44;
			local24 += local42;
			if (local40 >= 0 && local26 >= 1) {
				Static82.anIntArray354[local26] = local10;
				local26--;
				local40 -= local26 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local24 >= 0) {
				local21--;
				if (local21 < local15) {
					local126 = Static46.anIntArrayArray24[local21 + arg4];
					local133 = Static46.anIntArrayArray24[arg4 - local21];
					local137 = Static82.anIntArray354[local21];
					local141 = local10 + arg1;
					local146 = arg1 - local10;
					local150 = local137 + arg1;
					local155 = arg1 - local137;
					Static215.method3035(local146, local155, local126, arg0);
					Static215.method3035(local155, local150, local126, arg3);
					Static215.method3035(local150, local141, local126, arg0);
					Static215.method3035(local146, local155, local133, arg0);
					Static215.method3035(local155, local150, local133, arg3);
					Static215.method3035(local150, local141, local133, arg0);
				} else {
					local126 = Static46.anIntArrayArray24[arg4 + local21];
					local133 = Static46.anIntArrayArray24[arg4 - local21];
					local137 = local10 + arg1;
					local141 = arg1 - local10;
					Static215.method3035(local141, local137, local126, arg0);
					Static215.method3035(local141, local137, local133, arg0);
				}
				local24 -= local21 << 1;
			}
			local126 = Static46.anIntArrayArray24[arg4 + local10];
			local133 = Static46.anIntArrayArray24[arg4 - local10];
			local137 = local21 + arg1;
			local141 = arg1 - local21;
			if (local15 <= local10) {
				Static215.method3035(local141, local137, local126, arg0);
				Static215.method3035(local141, local137, local133, arg0);
			} else {
				local146 = local10 <= local26 ? local26 : Static82.anIntArray354[local10];
				local150 = arg1 + local146;
				local155 = arg1 - local146;
				Static215.method3035(local141, local155, local126, arg0);
				Static215.method3035(local155, local150, local126, arg3);
				Static215.method3035(local150, local137, local126, arg0);
				Static215.method3035(local141, local155, local133, arg0);
				Static215.method3035(local155, local150, local133, arg3);
				Static215.method3035(local150, local137, local133, arg0);
			}
		}
	}
}
