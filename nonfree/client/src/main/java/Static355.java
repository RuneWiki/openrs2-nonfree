import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!m", name = "P", descriptor = "Lclient!gj;")
	public static Class143 aClass143_89;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "Lclient!ha;")
	public static Class16 aClass16_6;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	public static int anInt6379 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!uv;IIIILclient!uv;II)V")
	public static void method5365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class23_Sub2_Sub1_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method8614();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class102 local21 = (Class102) Static596.aClass279_54.method6631((long) local7);
		if (local21 == null) {
			@Pc(28) Class150[] local28 = Static683.method3282(Static235.aClass143_57, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static582.aClass16_12.method8132(local28[0], true);
			Static596.aClass279_54.method6635(local21, (long) local7);
		}
		Static396.method5704(arg0 >> 1, 0, arg4 >> 1, arg2.anInt10109, arg2.aByte142, arg2.method8625() * 256, arg2.anInt10108);
		@Pc(78) int local78 = arg3 + Static109.anIntArray149[0] - 18;
		@Pc(86) int local86 = local78 + arg6 / 4 * 18;
		@Pc(96) int local96 = Static109.anIntArray149[1] + arg1 - 16 - 54;
		@Pc(104) int local104 = local96 + arg6 % 4 * 18;
		local21.method6961(local86, local104);
		if (arg5 == arg2) {
			Static582.aClass16_12.method8180(-256, local86 - 1, 18, 18, local104 - 1);
		}
		Static120.method2177(local86 - 1, local86 + 18, local104 - 1, local104 - -18);
		@Pc(140) Class23_Sub8 local140 = Static432.method6364();
		local140.anInt6308 = local104;
		local140.anInt6305 = local104 + 16;
		local140.aClass23_Sub2_Sub1_Sub2_1 = arg5;
		local140.anInt6306 = local86;
		local140.anInt6304 = local86 + 16;
		Static57.aClass105_10.method2447(local140);
	}
}
