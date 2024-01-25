import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!su", name = "fb", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!su", name = "R", descriptor = "J")
	public static long aLong258 = 0L;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII)V")
	public static void method7579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg5 + arg0;
		@Pc(13) int local13 = arg1 - arg5;
		for (@Pc(21) int local21 = arg0; local21 < local9; local21++) {
			Static161.method2977(arg2, arg4, arg3, Static120.anIntArrayArray18[local21], -127);
		}
		for (@Pc(43) int local43 = arg1; local43 > local13; local43--) {
			Static161.method2977(arg2, arg4, arg3, Static120.anIntArrayArray18[local43], -107);
		}
		@Pc(66) int local66 = arg2 + arg5;
		@Pc(71) int local71 = arg3 - arg5;
		for (@Pc(73) int local73 = local9; local73 <= local13; local73++) {
			@Pc(81) int[] local81 = Static120.anIntArrayArray18[local73];
			Static161.method2977(arg2, arg4, local66, local81, -112);
			Static161.method2977(local71, arg4, arg3, local81, -110);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIB[B)V")
	public static void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(32) int local32 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local32--;
			if (local32 < 0) {
				local32 = arg2 - arg0 & 0x3;
				while (true) {
					local32--;
					if (local32 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(41) int local41 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg3[local41] = 1;
			@Pc(51) int local51 = local46 + 1;
			arg3[local46] = 1;
			arg1 = local51 + 1;
			arg3[local51] = 1;
		}
	}
}
