import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!oh;")
	public static Class237 aClass237_23;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!ur;")
	public static Class345 aClass345_6;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt2087 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!d;Lclient!ha;IIII)V")
	public static void method1797(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static489.anInt8687 < 100) {
			Static192.method3628(arg0, arg1);
		}
		arg1.KA(arg2, arg4, arg5 + arg2, arg4 + arg3);
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (Static489.anInt8687 < 100) {
			local34 = arg2 + arg5 / 2;
			arg1.aa(arg2, arg4, arg5, arg3, -16777216, 0);
			local53 = arg3 / 2 + arg4 - 18 - 20;
			arg1.method6106(local34 - 152, local53, 304, 34, Static7.aColorArray5[Static59.anInt1905].getRGB(), 0);
			arg1.aa(local34 - 150, local53 - -2, Static489.anInt8687 * 3, 30, Static384.aColorArray6[Static59.anInt1905].getRGB(), 0);
			Static206.aClass27_20.method7002(-1, Static11.aColorArray2[Static59.anInt1905].getRGB(), Static121.aClass84_18.method2710(Static372.anInt7083), local34, local53 + 20);
			return;
		}
		@Pc(114) int local114 = Static227.anInt5187 - (int) ((float) arg5 / Static110.aFloat176);
		local34 = Static561.anInt9691 + (int) ((float) arg3 / Static110.aFloat176);
		local53 = Static227.anInt5187 + (int) ((float) arg5 / Static110.aFloat176);
		Static407.anInt7789 = (int) ((float) (arg5 * 2) / Static110.aFloat176);
		Class15_Sub1_Sub4_Sub2.lb = (int) ((float) (arg3 * 2) / Static110.aFloat176);
		Static57.anInt1870 = Static227.anInt5187 - (int) ((float) arg5 / Static110.aFloat176);
		Static616.anInt10359 = Static561.anInt9691 - (int) ((float) arg3 / Static110.aFloat176);
		@Pc(174) int local174 = Static561.anInt9691 - (int) ((float) arg3 / Static110.aFloat176);
		Static110.method6389(local114 + Static110.anInt7708, local34 - -Static110.anInt7703, Static110.anInt7708 + local53, local174 + Static110.anInt7703, arg2, arg4, arg2 + arg5, arg3 + 1 + arg4);
		Static110.method6395(arg1);
		@Pc(205) Class43 local205 = Static110.method6397(arg1);
		Static126.method2801(local205, arg1);
		if (Static611.anInt10290 > 0) {
			Static100.anInt2681--;
			if (Static100.anInt2681 == 0) {
				Static611.anInt10290--;
				Static100.anInt2681 = 20;
			}
		}
		if (!Static450.aBoolean595) {
			return;
		}
		@Pc(239) int local239 = arg2 + arg5 - 5;
		@Pc(245) int local245 = arg3 + arg4 - 8;
		Static634.aClass27_19.method6992(16776960, "Fps:" + Static563.anInt9710, local245, -1, local239);
		@Pc(260) int local260 = local245 - 15;
		@Pc(262) Runtime local262 = Runtime.getRuntime();
		@Pc(272) int local272 = (int) ((local262.totalMemory() - local262.freeMemory()) / 1024L);
		@Pc(274) int local274 = 16776960;
		if (local272 > 65536) {
			local274 = 16711680;
		}
		Static634.aClass27_19.method6992(local274, "Mem:" + local272 + "k", local260, -1, local239);
		local245 = local260 - 15;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	public static void method1798() {
		Static594.aClass236_100.method6243(50);
	}
}
