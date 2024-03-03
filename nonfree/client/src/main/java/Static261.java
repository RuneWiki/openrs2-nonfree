import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt5347;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ci;IIIILclient!wm;)V", line = 61)
	public static void method4882(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class19 arg5) {
		if (Class235.anInt6569 < 100) {
			Static195.method3715(arg5, arg0);
		}
		arg5.method2897(arg4, arg2, arg4 + arg3, arg2 - -arg1);
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (Class235.anInt6569 < 100) {
			local36 = arg3 / 2 + arg4;
			local47 = arg1 / 2 + arg2 - 18 - 20;
			arg5.method2903(arg4, arg2, arg3, arg1, -16777216, 0);
			arg5.method2838(local36 - 152, local47, 304, 34, Class195.aColorArray4[Class51.anInt1553].getRGB(), 0);
			arg5.method2903(local36 - 150, local47 - -2, Class235.anInt6569 * 3, 30, Class2_Sub2_Sub4.aColorArray2[Class51.anInt1553].getRGB(), 0);
			Static49.aClass130_1.method5901(Class2_Sub3_Sub5.aClass79_21.method2269(Class197.anInt5569), -1, local47 + 20, Class2_Sub3_Sub28.aColorArray3[Class51.anInt1553].getRGB(), local36);
			return;
		}
		@Pc(111) int local111 = Static142.anInt2769 - (int) ((float) arg3 / Static321.aFloat71);
		local36 = (int) ((float) arg1 / Static321.aFloat71) + Static89.anInt2001;
		local47 = (int) ((float) arg3 / Static321.aFloat71) + Static142.anInt2769;
		Static343.anInt6917 = (int) ((float) (arg1 * 2) / Static321.aFloat71);
		Static21.anInt548 = Static89.anInt2001 - (int) ((float) arg1 / Static321.aFloat71);
		Static41.anInt1104 = (int) ((float) (arg3 * 2) / Static321.aFloat71);
		@Pc(160) int local160 = Static89.anInt2001 - (int) ((float) arg1 / Static321.aFloat71);
		Static166.anInt2314 = Static142.anInt2769 - (int) ((float) arg3 / Static321.aFloat71);
		Static321.method5531(local111 + Static321.anInt6045, local36 - -Static321.anInt6043, Static321.anInt6045 + local47, Static321.anInt6043 + local160, arg4, arg2, arg3 + arg4, arg2 - (-arg1 - 1));
		Static321.method5523(arg5);
		@Pc(203) Class135 local203 = Static321.method5525(arg5);
		Static280.method5209(local203, arg5);
		if (Static226.anInt4488 > 0) {
			Static84.anInt6624--;
			if (Static84.anInt6624 == 0) {
				Static84.anInt6624 = 20;
				Static226.anInt4488--;
			}
		}
		if (!Class2_Sub2_Sub6_Sub2.aBoolean456) {
			return;
		}
		@Pc(237) int local237 = arg3 + arg4 - 5;
		@Pc(243) int local243 = arg1 + arg2 - 8;
		Static253.aClass130_4.method5899(local237, local243, "Fps:" + Class2_Sub2_Sub1.anInt62, 16776960);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static253.aClass130_4.method5899(local237, local258, "Mem:" + local270 + "k", local272);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z", line = 147)
	public static boolean method4883(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static177.aClass19_8.method2894();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static177.aClass19_8.method2833();
		} else if (!Static177.aClass19_8.method2849()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static203.aClass177_Sub1_2.aBoolean356 = arg0;
			Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!nk;ZI)Ljava/lang/String;", line = 189)
	public static String method4884(@OriginalArg(0) Class161 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method1406(arg0).method1856(arg1) && arg0.anObjectArray27 == null) {
			return null;
		} else if (arg0.aStringArray40 == null || arg1 >= arg0.aStringArray40.length || arg0.aStringArray40[arg1] == null || arg0.aStringArray40[arg1].trim().length() == 0) {
			return Class15_Sub1.aBoolean30 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray40[arg1];
		}
	}
}
