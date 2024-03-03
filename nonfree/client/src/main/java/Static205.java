import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIIII)V", line = 5)
	public static void method3871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		@Pc(18) int local18 = -1;
		Static94.method2165(arg3 + arg0, Static332.anIntArrayArray58[arg1], arg2, arg3 - arg0);
		while (local13 > local11) {
			local18 += 2;
			local11++;
			local16 += local18;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(56) int[] local56 = Static332.anIntArrayArray58[local13 + arg1];
				@Pc(63) int[] local63 = Static332.anIntArrayArray58[arg1 - local13];
				@Pc(67) int local67 = local11 + arg3;
				@Pc(72) int local72 = arg3 - local11;
				Static94.method2165(local67, local56, arg2, local72);
				Static94.method2165(local67, local63, arg2, local72);
			}
			@Pc(89) int local89 = arg3 + local13;
			@Pc(94) int local94 = arg3 - local13;
			@Pc(100) int[] local100 = Static332.anIntArrayArray58[local11 + arg1];
			@Pc(107) int[] local107 = Static332.anIntArrayArray58[arg1 - local11];
			Static94.method2165(local89, local100, arg2, local94);
			Static94.method2165(local89, local107, arg2, local94);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 121)
	public static void method3875(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Class195.anIntArray373[local3] = Class195.anIntArray373[local3 - 1];
			Class15_Sub1.anIntArray27[local3] = Class15_Sub1.anIntArray27[local3 - 1];
			Class11_Sub3.aStringArray59[local3] = Class11_Sub3.aStringArray59[local3 - 1];
			Class12_Sub3.aStringArray26[local3] = Class12_Sub3.aStringArray26[local3 - 1];
			Class65.aStringArray13[local3] = Class65.aStringArray13[local3 - 1];
			Class2_Sub3_Sub13.aStringArray20[local3] = Class2_Sub3_Sub13.aStringArray20[local3 - 1];
			RuntimeException_Sub1.anIntArray162[local3] = RuntimeException_Sub1.anIntArray162[local3 - 1];
		}
		Class195.anIntArray373[0] = arg4;
		Class11_Sub3.aStringArray59[0] = arg6;
		Class15_Sub1.anIntArray27[0] = arg0;
		Class12_Sub3.aStringArray26[0] = arg5;
		Class65.aStringArray13[0] = arg2;
		Class18.anInt551 = Class65.anInt1874;
		Class2_Sub3_Sub22.anInt4011++;
		Class2_Sub3_Sub13.aStringArray20[0] = arg1;
		RuntimeException_Sub1.anIntArray162[0] = arg3;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZII)I", line = 190)
	public static int method3877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
