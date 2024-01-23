import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!k", name = "S", descriptor = "Lclient!hc;")
	public static Class51 aClass51_39;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	public static int anInt3084 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBII)V")
	public static void method2344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static265.anInt5546 < 100) {
			Static197.method1805();
		}
		Static189.method3190(arg0, arg1, arg0 + arg2, arg1 + arg3);
		@Pc(30) int local30;
		@Pc(44) int local44;
		if (Static265.anInt5546 < 100) {
			local30 = arg0 + arg2 / 2;
			local44 = arg1 + arg3 / 2 - 38;
			Static189.method3193(arg0, arg1, arg2, arg3, 0);
			Static189.method3185(local30 - 152, local44, 304, 34, 9179409);
			Static189.method3185(local30 - 151, local44 - -1, 302, 32, 0);
			Static189.method3193(local30 - 150, local44 + 2, Static265.anInt5546 * 3, 30, 9179409);
			Static189.method3193(local30 + Static265.anInt5546 * 3 - 150, local44 + 2, 300 - Static265.anInt5546 * 3, 30, 0);
			Static120.aClass1_Sub2_Sub7_2.method1923(Static187.aString281, local30, local44 + 20, 16777215, -1);
			return;
		}
		Static239.anInt5156 = (int) ((float) (arg2 * 2) / Static57.aFloat12);
		Static148.anInt478 = (int) ((float) (arg3 * 2) / Static57.aFloat12);
		Static74.anInt2023 = Static239.anInt5151 - (int) ((float) arg3 / Static57.aFloat12);
		local30 = Static239.anInt5151 - (int) ((float) arg3 / Static57.aFloat12);
		@Pc(156) int local156 = Static39.anInt1086 - (int) ((float) arg2 / Static57.aFloat12);
		Static166.anInt3879 = Static39.anInt1086 - (int) ((float) arg2 / Static57.aFloat12);
		local44 = Static39.anInt1086 + (int) ((float) arg2 / Static57.aFloat12);
		@Pc(181) int local181 = Static239.anInt5151 + (int) ((float) arg3 / Static57.aFloat12);
		Static207.method3448(local156, arg0, local44, arg1 + arg3, arg2 + arg0, local30, local181, arg1);
		Static257.method4150(local181, local156, local44, arg0, Static48.aBoolean81, local30, arg1, arg0 + arg2, arg1 - -arg3);
		Static232.method3866(arg1, arg0 + arg2, local156, local30, arg0, local181, local44, arg3 + arg1);
		if (Static168.anInt3925 > 0) {
			Static19.anInt681--;
			if (Static19.anInt681 == 0) {
				Static168.anInt3925--;
				Static19.anInt681 = 20;
			}
		}
		if (!Static266.aBoolean282) {
			return;
		}
		@Pc(249) int local249 = arg0 + arg2 - 5;
		@Pc(256) int local256 = arg1 + arg3 - 8;
		Static63.aClass1_Sub2_Sub7_1.method1927("Fps:" + Static43.anInt1294, local249, local256, 16776960, -1);
		@Pc(271) Runtime local271 = Runtime.getRuntime();
		@Pc(272) int local272 = local256 - 15;
		@Pc(282) int local282 = (int) ((local271.totalMemory() - local271.freeMemory()) / 1024L);
		@Pc(284) int local284 = 16776960;
		if (local282 > 65536) {
			local284 = 16711680;
		}
		Static63.aClass1_Sub2_Sub7_1.method1927("Mem:" + local282 + "k", local249, local272, local284, -1);
		local256 = local272 - 15;
	}
}
