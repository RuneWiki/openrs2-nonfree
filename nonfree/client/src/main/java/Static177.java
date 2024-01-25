import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
	public static void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static192.method3535(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static383.anIntArrayArray62[arg0];
		@Pc(44) int local44 = arg5 - local15;
		Static336.method5023(arg4, local44, local40, arg5 - arg2);
		@Pc(58) int local58 = arg5 + local15;
		Static336.method5023(arg1, local58, local40, local44);
		Static336.method5023(arg4, arg2 + arg5, local40, local58);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static114.anIntArray244[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(120) int[] local120;
			@Pc(127) int[] local127;
			@Pc(131) int local131;
			@Pc(135) int local135;
			@Pc(174) int local174;
			@Pc(179) int local179;
			@Pc(184) int local184;
			if (local27 >= 0) {
				local24--;
				if (local15 <= local24) {
					local120 = Static383.anIntArrayArray62[local24 + arg0];
					local127 = Static383.anIntArrayArray62[arg0 - local24];
					local131 = local10 + arg5;
					local135 = arg5 - local10;
					Static336.method5023(arg4, local131, local120, local135);
					Static336.method5023(arg4, local131, local127, local135);
				} else {
					local120 = Static383.anIntArrayArray62[arg0 + local24];
					local127 = Static383.anIntArrayArray62[arg0 - local24];
					local131 = Static114.anIntArray244[local24];
					local135 = local10 + arg5;
					local174 = arg5 - local10;
					local179 = arg5 + local131;
					local184 = arg5 - local131;
					Static336.method5023(arg4, local184, local120, local174);
					Static336.method5023(arg1, local179, local120, local184);
					Static336.method5023(arg4, local135, local120, local179);
					Static336.method5023(arg4, local184, local127, local174);
					Static336.method5023(arg1, local179, local127, local184);
					Static336.method5023(arg4, local135, local127, local179);
				}
				local27 -= local24 << 1;
			}
			local120 = Static383.anIntArrayArray62[arg0 + local10];
			local127 = Static383.anIntArrayArray62[arg0 - local10];
			local131 = local24 + arg5;
			local135 = arg5 - local24;
			if (local10 >= local15) {
				Static336.method5023(arg4, local131, local120, local135);
				Static336.method5023(arg4, local131, local127, local135);
			} else {
				local174 = local10 > local29 ? Static114.anIntArray244[local10] : local29;
				local179 = local174 + arg5;
				local184 = arg5 - local174;
				Static336.method5023(arg4, local184, local120, local135);
				Static336.method5023(arg1, local179, local120, local184);
				Static336.method5023(arg4, local131, local120, local179);
				Static336.method5023(arg4, local184, local127, local135);
				Static336.method5023(arg1, local179, local127, local184);
				Static336.method5023(arg4, local131, local127, local179);
			}
		}
	}
}
