import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Lclient!fe;")
	public static Class103 aClass103_8;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Z")
	public static boolean aBoolean613 = true;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIBII)V")
	public static void method7369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static574.method7983(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg0;
		@Pc(26) int local26 = -arg0;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static173.anIntArrayArray15[arg5];
		@Pc(44) int local44 = arg3 - local14;
		Static270.method3998(arg1, arg3 - arg0, local44, local39);
		@Pc(57) int local57 = arg3 + local14;
		Static270.method3998(arg4, local44, local57, local39);
		Static270.method3998(arg1, local57, arg3 + arg0, local39);
		while (local23 > local10) {
			local35 += 2;
			local33 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				Static227.anIntArray100[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(124) int[] local124;
			@Pc(131) int[] local131;
			@Pc(135) int local135;
			@Pc(139) int local139;
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				if (local23 < local14) {
					local124 = Static173.anIntArrayArray15[arg5 + local23];
					local131 = Static173.anIntArrayArray15[arg5 - local23];
					local135 = Static227.anIntArray100[local23];
					local139 = local10 + arg3;
					local143 = arg3 - local10;
					local148 = arg3 + local135;
					local153 = arg3 - local135;
					Static270.method3998(arg1, local143, local153, local124);
					Static270.method3998(arg4, local153, local148, local124);
					Static270.method3998(arg1, local148, local139, local124);
					Static270.method3998(arg1, local143, local153, local131);
					Static270.method3998(arg4, local153, local148, local131);
					Static270.method3998(arg1, local148, local139, local131);
				} else {
					local124 = Static173.anIntArrayArray15[arg5 + local23];
					local131 = Static173.anIntArrayArray15[arg5 - local23];
					local135 = arg3 + local10;
					local139 = arg3 - local10;
					Static270.method3998(arg1, local139, local135, local124);
					Static270.method3998(arg1, local139, local135, local131);
				}
			}
			local124 = Static173.anIntArrayArray15[arg5 + local10];
			local131 = Static173.anIntArrayArray15[arg5 - local10];
			local135 = arg3 + local23;
			local139 = arg3 - local23;
			if (local10 >= local14) {
				Static270.method3998(arg1, local139, local135, local124);
				Static270.method3998(arg1, local139, local135, local131);
			} else {
				local143 = local10 <= local28 ? local28 : Static227.anIntArray100[local10];
				local148 = local143 + arg3;
				local153 = arg3 - local143;
				Static270.method3998(arg1, local139, local153, local124);
				Static270.method3998(arg4, local153, local148, local124);
				Static270.method3998(arg1, local148, local135, local124);
				Static270.method3998(arg1, local139, local153, local131);
				Static270.method3998(arg4, local153, local148, local131);
				Static270.method3998(arg1, local148, local135, local131);
			}
		}
	}
}
