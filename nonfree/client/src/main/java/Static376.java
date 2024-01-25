import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static final int anInt1806 = 1400;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIZFIII)[[I")
	public static int[][] method1507(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub1_Sub8 local13 = new Class1_Sub1_Sub8();
		local13.anInt1852 = (int) (arg0 * 4096.0F);
		local13.anInt1855 = 4;
		local13.anInt1849 = 4;
		local13.anInt1846 = 3;
		local13.aBoolean125 = false;
		local13.method7831();
		Static584.method7821(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method1547(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([FFIFFIIIIIIII)V")
	public static void method1508(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(9) int local9 = arg5 - arg7;
		@Pc(13) int local13 = arg11 - arg6;
		@Pc(17) int local17 = arg2 - arg10;
		@Pc(38) float local38 = arg0[1] * (float) local17 + arg0[0] * (float) local9 + (float) local13 * arg0[2];
		@Pc(59) float local59 = arg0[5] * (float) local13 + arg0[4] * (float) local17 + arg0[3] * (float) local9;
		@Pc(80) float local80 = arg0[8] * (float) local13 + arg0[6] * (float) local9 + arg0[7] * (float) local17;
		@Pc(107) float local107;
		@Pc(100) float local100;
		if (arg9 == 0) {
			local107 = local38 + arg1 + 0.5F;
			local100 = arg4 + 0.5F - local80;
		} else if (arg9 == 1) {
			local107 = local38 + arg1 + 0.5F;
			local100 = local80 + arg4 + 0.5F;
		} else if (arg9 == 2) {
			local100 = arg3 + 0.5F - local59;
			local107 = arg1 + 0.5F - local38;
		} else if (arg9 == 3) {
			local100 = arg3 + 0.5F - local59;
			local107 = arg1 + local38 + 0.5F;
		} else if (arg9 == 4) {
			local100 = arg3 + 0.5F - local59;
			local107 = arg4 + local80 + 0.5F;
		} else {
			local107 = arg4 + 0.5F - local80;
			local100 = arg3 + 0.5F - local59;
		}
		@Pc(195) float local195;
		if (arg8 == 1) {
			local195 = local107;
			local107 = -local100;
			local100 = local195;
		} else if (arg8 == 2) {
			local100 = -local100;
			local107 = -local107;
		} else if (arg8 == 3) {
			local195 = local107;
			local107 = local100;
			local100 = -local195;
		}
		Static390.aFloat238 = local107;
		Static379.aFloat180 = local100;
	}
}
