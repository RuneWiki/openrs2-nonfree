import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	public static int anInt7210 = 16777215;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!r;IIIIILclient!fa;)V")
	public static void method5949(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface5 arg5) {
		if (Static587.anInt9497 < 100) {
			Static122.method2102(arg5, arg0);
		}
		arg0.da(arg3, arg1, arg3 + arg4, arg1 + arg2);
		@Pc(35) int local35;
		@Pc(47) int local47;
		if (Static587.anInt9497 < 100) {
			local35 = arg3 + arg4 / 2;
			local47 = arg1 + arg2 / 2 - 38;
			arg0.J(arg3, arg1, arg4, arg2, -16777216, 0);
			arg0.method6435(local35 - 152, local47, 304, 34, Static83.aColorArray1[Static490.anInt8273].getRGB(), 0);
			arg0.J(local35 - 150, local47 - -2, Static587.anInt9497 * 3, 30, Static141.aColorArray2[Static490.anInt8273].getRGB(), 0);
			Static260.aClass35_7.method4942(-1, local35, Static510.aColorArray5[Static490.anInt8273].getRGB(), Static103.aClass77_20.method1864(Static562.anInt9127), local47 + 20);
			return;
		}
		@Pc(111) int local111 = Static222.anInt1235 - (int) ((float) arg4 / Static313.aFloat105);
		local35 = Static536.anInt8850 + (int) ((float) arg2 / Static313.aFloat105);
		local47 = Static222.anInt1235 + (int) ((float) arg4 / Static313.aFloat105);
		Static307.anInt5544 = (int) ((float) (arg4 * 2) / Static313.aFloat105);
		@Pc(153) int local153 = Static536.anInt8850 - (int) ((float) arg2 / Static313.aFloat105);
		Static78.anInt1869 = (int) ((float) (arg2 * 2) / Static313.aFloat105);
		Static81.anInt1905 = Static536.anInt8850 - (int) ((float) arg2 / Static313.aFloat105);
		Static518.anInt8571 = Static222.anInt1235 - (int) ((float) arg4 / Static313.aFloat105);
		Static313.method3495(local111 + Static313.anInt4085, local35 - -Static313.anInt4096, local47 + Static313.anInt4085, local153 + Static313.anInt4096, arg3, arg1, arg3 + arg4, arg1 - -arg2 + 1);
		Static313.method3474(arg0);
		@Pc(209) Class361 local209 = Static313.method3485(arg0);
		Static176.method2698(local209, arg0);
		if (Static538.anInt8880 > 0) {
			Static44.anInt1118--;
			if (Static44.anInt1118 == 0) {
				Static44.anInt1118 = 20;
				Static538.anInt8880--;
			}
		}
		if (!Static115.aBoolean175) {
			return;
		}
		@Pc(237) int local237 = arg4 + arg3 - 5;
		@Pc(243) int local243 = arg2 + arg1 - 8;
		Static21.aClass35_1.method4943(16776960, -1, "Fps:" + Static259.anInt4764, local243, local237);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static21.aClass35_1.method4943(local272, -1, "Mem:" + local270 + "k", local258, local237);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method5950() {
		Static556.anIntArray469 = Static9.method138(0.4F);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLjava/awt/Component;)Lclient!ti;")
	public static Class256 method5951(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class256_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class256) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class256_Sub1(arg0, true);
		}
	}
}
