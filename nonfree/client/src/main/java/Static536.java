import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "[I")
	public static int[] anIntArray685;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!oa;Lclient!e;III)V")
	public static void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static142.anInt2546 < 100) {
			Static191.method2798(arg2, arg3);
		}
		arg2.ca(arg0, arg5, arg0 + arg1, arg4 + arg5);
		@Pc(33) int local33;
		@Pc(53) int local53;
		if (Static142.anInt2546 < 100) {
			local33 = arg1 / 2 + arg0;
			arg2.C(arg0, arg5, arg1, arg4, -16777216, 0);
			local53 = arg5 + arg4 / 2 - 20 - 18;
			arg2.method7127(local33 - 152, local53, 304, 34, Static361.aColorArray3[Static86.anInt7215].getRGB(), 0);
			arg2.C(local33 - 150, local53 + 2, Static142.anInt2546 * 3, 30, Static92.aColorArray4[Static86.anInt7215].getRGB(), 0);
			Static408.aClass56_4.method7866(local33, -1, Static141.aClass104_63.method2145(Static470.anInt7957), local53 + 20, Static177.aColorArray2[Static86.anInt7215].getRGB());
			return;
		}
		@Pc(109) int local109 = Static95.anInt1576 - (int) ((float) arg1 / Static349.aFloat170);
		local33 = Static387.anInt6906 + (int) ((float) arg4 / Static349.aFloat170);
		local53 = (int) ((float) arg1 / Static349.aFloat170) + Static95.anInt1576;
		@Pc(135) int local135 = Static387.anInt6906 - (int) ((float) arg4 / Static349.aFloat170);
		Static505.anInt8396 = (int) ((float) (arg1 * 2) / Static349.aFloat170);
		Static360.anInt6288 = (int) ((float) (arg4 * 2) / Static349.aFloat170);
		Static411.anInt7201 = Static387.anInt6906 - (int) ((float) arg4 / Static349.aFloat170);
		Static165.anInt3010 = Static95.anInt1576 - (int) ((float) arg1 / Static349.aFloat170);
		Static349.method6181(local109 + Static349.anInt7457, Static349.anInt7465 + local33, Static349.anInt7457 + local53, Static349.anInt7465 + local135, arg0, arg5, arg0 + arg1, arg4 + 1 + arg5);
		Static349.method6191(arg2);
		@Pc(197) Class275 local197 = Static349.method6179(arg2);
		Static274.method2851(arg2, local197);
		if (Static102.anInt1883 > 0) {
			Static104.anInt1939--;
			if (Static104.anInt1939 == 0) {
				Static102.anInt1883--;
				Static104.anInt1939 = 20;
			}
		}
		if (!Static386.aBoolean486) {
			return;
		}
		@Pc(242) int local242 = arg0 + arg1 - 5;
		@Pc(248) int local248 = arg5 + arg4 - 8;
		Static85.aClass56_2.method7867("Fps:" + Static443.anInt7696, -1, local248, local242, 16776960);
		@Pc(263) int local263 = local248 - 15;
		@Pc(265) Runtime local265 = Runtime.getRuntime();
		@Pc(274) int local274 = (int) ((local265.totalMemory() - local265.freeMemory()) / 1024L);
		@Pc(276) int local276 = 16776960;
		if (local274 > 65536) {
			local276 = 16711680;
		}
		Static85.aClass56_2.method7867("Mem:" + local274 + "k", -1, local263, local242, local276);
		local248 = local263 - 15;
	}
}
