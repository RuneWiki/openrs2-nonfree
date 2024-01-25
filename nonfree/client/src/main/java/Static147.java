import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!sc;")
	public static Class210 aClass210_3;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[B")
	public static final byte[] aByteArray36 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt2723 = 999999;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public static boolean method2299(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 1004 || arg0 == 8 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!wp;Lclient!np;IIIII)V")
	public static void method2300(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static130.anInt2452 < 100) {
			Static391.method1843(arg1, arg0);
		}
		arg1.method4867(arg4, arg3, arg5 + arg4, arg3 - -arg2);
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (Static130.anInt2452 < 100) {
			local38 = arg4 + arg5 / 2;
			local48 = arg2 / 2 + arg3 - 18 - 20;
			arg1.method4896(arg4, arg3, arg5, arg2, -16777216, 0);
			arg1.method4855(local38 - 152, local48, 304, 34, Static354.aColorArray2[Static183.anInt3244].getRGB(), 0);
			arg1.method4896(local38 - 150, local48 - -2, Static130.anInt2452 * 3, 30, Static374.aColorArray3[Static183.anInt3244].getRGB(), 0);
			Static95.aClass150_6.method5728(Static121.aClass57_37.method1122(Static66.anInt1307), Static81.aColorArray1[Static183.anInt3244].getRGB(), -1, local48 + 20, local38);
			return;
		}
		@Pc(112) int local112 = Static325.anInt5538 - (int) ((float) arg5 / Static42.aFloat4);
		local38 = (int) ((float) arg2 / Static42.aFloat4) + Static257.anInt4618;
		local48 = Static325.anInt5538 + (int) ((float) arg5 / Static42.aFloat4);
		Static80.anInt1648 = Static325.anInt5538 - (int) ((float) arg5 / Static42.aFloat4);
		@Pc(147) int local147 = Static257.anInt4618 - (int) ((float) arg2 / Static42.aFloat4);
		Static325.anInt5542 = (int) ((float) (arg2 * 2) / Static42.aFloat4);
		Static252.anInt4549 = (int) ((float) (arg5 * 2) / Static42.aFloat4);
		Static75.anInt1607 = Static257.anInt4618 - (int) ((float) arg2 / Static42.aFloat4);
		Static42.method458(local112 + Static42.anInt542, local38 - -Static42.anInt534, Static42.anInt542 + local48, local147 + Static42.anInt534, arg4, arg3, arg5 + arg4, arg3 + arg2 - -1);
		Static42.method453(arg1);
		@Pc(201) Class138 local201 = Static42.method463(arg1);
		Static172.method3204(local201, arg1);
		if (Static179.anInt3177 > 0) {
			Static296.anInt5113--;
			if (Static296.anInt5113 == 0) {
				Static179.anInt3177--;
				Static296.anInt5113 = 20;
			}
		}
		if (!Static383.aBoolean500) {
			return;
		}
		@Pc(235) int local235 = arg5 + arg4 - 5;
		@Pc(241) int local241 = arg3 + arg2 - 8;
		Static140.aClass150_3.method5725(local235, local241, 16776960, "Fps:" + Static296.anInt5115);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static140.aClass150_3.method5725(local235, local256, local270, "Mem:" + local268 + "k");
		local241 = local256 - 15;
	}
}
