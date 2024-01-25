import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt6910 = 0;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "[I")
	public static final int[] anIntArray496 = new int[2048];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static175.method2501(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static194.anIntArrayArray28[arg5];
		@Pc(49) int local49 = arg4 - local15;
		Static298.method3977(arg4 - arg2, arg1, local49, local44);
		@Pc(62) int local62 = arg4 + local15;
		Static298.method3977(local49, arg3, local62, local44);
		Static298.method3977(local62, arg1, arg4 + arg2, local44);
		while (local10 < local24) {
			local40 += 2;
			local38 += 2;
			local27 += local38;
			local32 += local40;
			if (local32 >= 0 && local29 >= 1) {
				Static191.anIntArray263[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(133) int[] local133;
			@Pc(140) int[] local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local133 = Static194.anIntArrayArray28[arg5 + local24];
					local140 = Static194.anIntArrayArray28[arg5 - local24];
					local144 = Static191.anIntArray263[local24];
					local149 = arg4 + local10;
					local154 = arg4 - local10;
					local158 = arg4 + local144;
					local163 = arg4 - local144;
					Static298.method3977(local154, arg1, local163, local133);
					Static298.method3977(local163, arg3, local158, local133);
					Static298.method3977(local158, arg1, local149, local133);
					Static298.method3977(local154, arg1, local163, local140);
					Static298.method3977(local163, arg3, local158, local140);
					Static298.method3977(local158, arg1, local149, local140);
				} else {
					local133 = Static194.anIntArrayArray28[arg5 + local24];
					local140 = Static194.anIntArrayArray28[arg5 - local24];
					local144 = arg4 + local10;
					local149 = arg4 - local10;
					Static298.method3977(local149, arg1, local144, local133);
					Static298.method3977(local149, arg1, local144, local140);
				}
			}
			local133 = Static194.anIntArrayArray28[local10 + arg5];
			local140 = Static194.anIntArrayArray28[arg5 - local10];
			local144 = local24 + arg4;
			local149 = arg4 - local24;
			if (local15 > local10) {
				local154 = local10 <= local29 ? local29 : Static191.anIntArray263[local10];
				local158 = arg4 + local154;
				local163 = arg4 - local154;
				Static298.method3977(local149, arg1, local163, local133);
				Static298.method3977(local163, arg3, local158, local133);
				Static298.method3977(local158, arg1, local144, local133);
				Static298.method3977(local149, arg1, local163, local140);
				Static298.method3977(local163, arg3, local158, local140);
				Static298.method3977(local158, arg1, local144, local140);
			} else {
				Static298.method3977(local149, arg1, local144, local133);
				Static298.method3977(local149, arg1, local144, local140);
			}
		}
	}
}
