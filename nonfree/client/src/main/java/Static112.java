import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
	public static final int[] anIntArray129 = new int[1];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;III)Lclient!lc;")
	public static Class5_Sub24 method1733(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class5_Sub24_Sub1");
			@Pc(10) Class5_Sub24 local10 = (Class5_Sub24) local6.getDeclaredConstructor().newInstance();
			local10.method3659(arg1, arg0, arg2);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class5_Sub24_Sub2 local28 = new Class5_Sub24_Sub2();
			local28.method3659(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!d;ZILclient!ha;III)V")
	public static void method1734(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class133 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static353.anInt5917 < 100) {
			Static499.method8582(arg2, arg0);
		}
		arg2.KA(arg1, arg5, arg3 + arg1, arg4 + arg5);
		@Pc(31) int local31;
		@Pc(50) int local50;
		if (Static353.anInt5917 < 100) {
			local31 = arg1 + arg3 / 2;
			arg2.aa(arg1, arg5, arg3, arg4, -16777216, 0);
			local50 = arg5 + arg4 / 2 - 18 - 20;
			arg2.method7279(local31 - 152, local50, 304, 34, Static390.aColorArray3[Static320.anInt5438].getRGB(), 0);
			arg2.aa(local31 - 150, local50 + 2, Static353.anInt5917 * 3, 30, Static187.aColorArray1[Static320.anInt5438].getRGB(), 0);
			Static16.aClass55_1.method6013(-1, Static174.aClass120_18.method2690(Static266.anInt4796), local50 + 20, Static257.aColorArray2[Static320.anInt5438].getRGB(), local31);
			return;
		}
		@Pc(106) int local106 = Static196.anInt3883 - (int) ((float) arg3 / Static620.aFloat147);
		local31 = (int) ((float) arg4 / Static620.aFloat147) + Static235.anInt4321;
		local50 = (int) ((float) arg3 / Static620.aFloat147) + Static196.anInt3883;
		@Pc(130) int local130 = Static235.anInt4321 - (int) ((float) arg4 / Static620.aFloat147);
		Static511.anInt8846 = (int) ((float) (arg3 * 2) / Static620.aFloat147);
		Static469.anInt7883 = (int) ((float) (arg4 * 2) / Static620.aFloat147);
		Static291.anInt5082 = Static196.anInt3883 - (int) ((float) arg3 / Static620.aFloat147);
		Static586.anInt9840 = Static235.anInt4321 - (int) ((float) arg4 / Static620.aFloat147);
		Static620.method7141(Static620.anInt8206 + local106, Static620.anInt8210 + local31, local50 + Static620.anInt8206, Static620.anInt8210 + local130, arg1, arg5, arg3 + arg1, arg4 + (arg5 - -1));
		Static620.method7133(arg2);
		@Pc(192) Class330 local192 = Static620.method7135(arg2);
		Static298.method4652(local192, arg2);
		if (Static248.anInt4508 > 0) {
			Static374.anInt6199--;
			if (Static374.anInt6199 == 0) {
				Static248.anInt4508--;
				Static374.anInt6199 = 20;
			}
		}
		if (!Static471.aBoolean564) {
			return;
		}
		@Pc(220) int local220 = arg3 + arg1 - 5;
		@Pc(226) int local226 = arg4 + arg5 - 8;
		Static281.aClass55_8.method6022("Fps:" + Static263.anInt4785, -1, local220, 16776960, local226);
		@Pc(241) int local241 = local226 - 15;
		@Pc(243) Runtime local243 = Runtime.getRuntime();
		@Pc(252) int local252 = (int) ((local243.totalMemory() - local243.freeMemory()) / 1024L);
		@Pc(254) int local254 = 16776960;
		if (local252 > 65536) {
			local254 = 16711680;
		}
		Static281.aClass55_8.method6022("Mem:" + local252 + "k", -1, local220, local254, local241);
		local226 = local241 - 15;
	}
}
