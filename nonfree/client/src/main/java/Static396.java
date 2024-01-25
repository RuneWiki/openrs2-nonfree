import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt6822;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public static int anInt6824;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIB)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(26) int local26 = -arg3;
		Static526.method7369(Static299.anIntArrayArray58[arg2], arg0 + arg3, -arg3 + arg0, arg1);
		@Pc(42) int local42 = -1;
		while (local23 > local7) {
			local42 += 2;
			local7++;
			local26 += local42;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				@Pc(69) int[] local69 = Static299.anIntArrayArray58[arg2 + local23];
				@Pc(76) int[] local76 = Static299.anIntArrayArray58[arg2 - local23];
				@Pc(81) int local81 = arg0 + local7;
				@Pc(86) int local86 = arg0 - local7;
				Static526.method7369(local69, local81, local86, arg1);
				Static526.method7369(local76, local81, local86, arg1);
			}
			@Pc(102) int local102 = arg0 + local23;
			@Pc(107) int local107 = arg0 - local23;
			@Pc(113) int[] local113 = Static299.anIntArrayArray58[local7 + arg2];
			@Pc(120) int[] local120 = Static299.anIntArrayArray58[arg2 - local7];
			Static526.method7369(local113, local102, local107, arg1);
			Static526.method7369(local120, local102, local107, arg1);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg6 < 512 || arg3 < 512 || arg6 > (Static251.anInt4680 - 2) * 512 || (Static406.anInt6924 - 2) * 512 < arg3) {
			Static109.anIntArray149[0] = Static109.anIntArray149[1] = -1;
			return;
		}
		@Pc(55) int local55 = Static194.method5133(arg6, arg3, arg4) - arg1;
		if (Static649.aBoolean735) {
			Static431.method6358(true);
		} else {
			Static668.aClass25_9.method4301(arg5, 0, 0);
			Static582.aClass16_12.method8135(Static668.aClass25_9);
		}
		if (Static148.aBoolean221) {
			Static582.aClass16_12.HA(arg6, local55, arg3, Static209.anInt10104, Static109.anIntArray149);
		} else {
			Static582.aClass16_12.da(arg6, local55, arg3, Static109.anIntArray149);
		}
		if (Static649.aBoolean735) {
			Static80.method8694();
		} else {
			Static668.aClass25_9.method4301(-arg5, 0, 0);
			Static582.aClass16_12.method8135(Static668.aClass25_9);
		}
	}
}
