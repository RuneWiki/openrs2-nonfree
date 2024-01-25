import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
	public static boolean aBoolean383;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_91;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lclient!up;")
	public static final Class205[] aClass205Array1 = new Class205[29];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!bk;Lclient!vq;IIIIZ)V")
	public static void method4499(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static72.anInt1882 < 100) {
			Static314.method5187(arg1, arg0);
		}
		arg1.method2709(arg5, arg2, arg5 + arg3, arg4 + arg2);
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (Static72.anInt1882 < 100) {
			local34 = arg3 / 2 + arg5;
			arg1.method2682(arg5, arg2, arg3, arg4, -16777216, 0);
			local53 = arg4 / 2 + arg2 - 38;
			arg1.method2759(local34 - 152, local53, 304, 34, Static233.aColorArray2[Static160.anInt3457].getRGB(), 0);
			arg1.method2682(local34 - 150, local53 + 2, Static72.anInt1882 * 3, 30, Static170.aColorArray1[Static160.anInt3457].getRGB(), 0);
			Static282.aClass51_4.method4233(Static248.aColorArray3[Static160.anInt3457].getRGB(), local53 + 20, Static19.aClass159_24.method4311(Static180.anInt3835), -1, local34);
			return;
		}
		@Pc(115) int local115 = Static8.anInt200 - (int) ((float) arg3 / Static54.aFloat69);
		local34 = (int) ((float) arg4 / Static54.aFloat69) + Static60.anInt1574;
		local53 = (int) ((float) arg3 / Static54.aFloat69) + Static8.anInt200;
		Static205.anInt4310 = (int) ((float) (arg3 * 2) / Static54.aFloat69);
		Static331.anInt6341 = (int) ((float) (arg4 * 2) / Static54.aFloat69);
		Static73.anInt2036 = Static8.anInt200 - (int) ((float) arg3 / Static54.aFloat69);
		Static193.anInt4280 = Static60.anInt1574 - (int) ((float) arg4 / Static54.aFloat69);
		@Pc(174) int local174 = Static60.anInt1574 - (int) ((float) arg4 / Static54.aFloat69);
		Static54.method4155(local115 + Static54.anInt4745, Static54.anInt4748 + local34, Static54.anInt4745 + local53, Static54.anInt4748 + local174, arg5, arg2, arg5 + arg3, arg2 + 1 - -arg4);
		Static54.method4169(arg1);
		@Pc(204) Class116 local204 = Static54.method4163(arg1);
		Static223.method4032(local204, arg1);
		if (Static33.anInt820 > 0) {
			Static273.anInt5435--;
			if (Static273.anInt5435 == 0) {
				Static273.anInt5435 = 20;
				Static33.anInt820--;
			}
		}
		if (!Static274.aBoolean398) {
			return;
		}
		@Pc(235) int local235 = arg3 + arg5 - 5;
		@Pc(241) int local241 = arg2 + arg4 - 8;
		Static238.aClass51_6.method4247(local235, "Fps:" + Static296.anInt5726, local241, 16776960);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static238.aClass51_6.method4247(local235, "Mem:" + local267 + "k", local256, local269);
		local241 = local256 - 15;
	}
}
