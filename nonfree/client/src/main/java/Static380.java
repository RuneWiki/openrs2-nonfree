import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_104 = new Class194(59, -1);

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_36 = new Class252(64);

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_105 = new Class194(24, 7);

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	public static int anInt6264 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!l;IIIIILclient!za;)V")
	public static void method4955(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5) {
		if (Static35.anInt4183 < 100) {
			Static377.method4934(arg0, arg5);
		}
		arg5.ba(arg3, arg4, arg3 + arg1, arg2 + arg4);
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (Static35.anInt4183 < 100) {
			local33 = arg3 + arg1 / 2;
			arg5.P(arg3, arg4, arg1, arg2, -16777216, 0);
			local52 = arg2 / 2 + arg4 - 20 - 18;
			arg5.method5814(local33 - 152, local52, 304, 34, Static300.aColorArray1[Static457.anInt7468].getRGB(), 0);
			arg5.P(local33 - 150, local52 - -2, Static35.anInt4183 * 3, 30, Static312.aColorArray2[Static457.anInt7468].getRGB(), 0);
			Static56.aClass23_1.method5739(local33, Static349.aClass198_102.method4012(Static38.anInt4834), local52 + 20, Static453.aColorArray5[Static457.anInt7468].getRGB(), -1);
			return;
		}
		@Pc(112) int local112 = Static282.anInt4369 - (int) ((float) arg1 / Static98.aFloat84);
		local33 = Static110.anInt1841 + (int) ((float) arg2 / Static98.aFloat84);
		local52 = (int) ((float) arg1 / Static98.aFloat84) + Static282.anInt4369;
		Static404.anInt6787 = Static282.anInt4369 - (int) ((float) arg1 / Static98.aFloat84);
		Static37.anInt728 = (int) ((float) (arg2 * 2) / Static98.aFloat84);
		@Pc(155) int local155 = Static110.anInt1841 - (int) ((float) arg2 / Static98.aFloat84);
		Static226.anInt3767 = Static110.anInt1841 - (int) ((float) arg2 / Static98.aFloat84);
		Static387.anInt6381 = (int) ((float) (arg1 * 2) / Static98.aFloat84);
		Static98.method2668(local112 + Static98.anInt3332, Static98.anInt3328 + local33, Static98.anInt3332 + local52, local155 + Static98.anInt3328, arg3, arg4, arg1 + arg3, arg4 + (arg2 - -1));
		Static98.method2672(arg5);
		@Pc(205) Class177 local205 = Static98.method2663(arg5);
		Static241.method3138(arg5, local205);
		if (Static320.anInt4977 > 0) {
			Static350.anInt5747--;
			if (Static350.anInt5747 == 0) {
				Static320.anInt4977--;
				Static350.anInt5747 = 20;
			}
		}
		if (!Static9.aBoolean30) {
			return;
		}
		@Pc(236) int local236 = arg1 + arg3 - 5;
		@Pc(242) int local242 = arg2 + arg4 - 8;
		Static428.aClass23_4.method5742(local236, "Fps:" + Static150.anInt2694, local242, 16776960);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static428.aClass23_4.method5742(local236, "Mem:" + local268 + "k", local257, local270);
		local242 = local257 - 15;
	}
}
