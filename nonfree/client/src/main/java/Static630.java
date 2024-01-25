import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lclient!mu;")
	public static Class212 aClass212_18;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!ha;Lclient!d;IIIBI)V")
	public static void method8578(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static382.anInt7220 < 100) {
			Static577.method5567(arg0, arg1);
		}
		arg0.KA(arg3, arg2, arg5 + arg3, arg2 + arg4);
		@Pc(31) int local31;
		@Pc(42) int local42;
		if (Static382.anInt7220 < 100) {
			local31 = arg5 / 2 + arg3;
			local42 = arg2 + arg4 / 2 - 18 - 20;
			arg0.aa(arg3, arg2, arg5, arg4, -16777216, 0);
			arg0.method6142(local31 - 152, local42, 304, 34, Static85.aColorArray1[Static87.anInt2632].getRGB(), 0);
			arg0.aa(local31 - 150, local42 - -2, Static382.anInt7220 * 3, 30, Static523.aColorArray3[Static87.anInt2632].getRGB(), 0);
			Static537.aClass34_12.method8602(Static157.aColorArray2[Static87.anInt2632].getRGB(), Static536.aClass316_20.method7577(Static638.anInt10709), local31, -1, local42 + 20);
			return;
		}
		@Pc(105) int local105 = Static468.anInt8336 - (int) ((float) arg5 / Static491.aFloat158);
		local31 = (int) ((float) arg4 / Static491.aFloat158) + Static457.anInt8209;
		local42 = (int) ((float) arg5 / Static491.aFloat158) + Static468.anInt8336;
		Static411.anInt7649 = Static457.anInt8209 - (int) ((float) arg4 / Static491.aFloat158);
		Static1.anInt7047 = (int) ((float) (arg5 * 2) / Static491.aFloat158);
		Static560.anInt9628 = (int) ((float) (arg4 * 2) / Static491.aFloat158);
		@Pc(163) int local163 = Static457.anInt8209 - (int) ((float) arg4 / Static491.aFloat158);
		Static308.anInt6199 = Static468.anInt8336 - (int) ((float) arg5 / Static491.aFloat158);
		Static491.method6578(Static491.anInt7783 + local105, Static491.anInt7785 + local31, local42 + Static491.anInt7783, Static491.anInt7785 + local163, arg3, arg2, arg5 + arg3, arg4 + arg2 + 1);
		Static491.method6579(arg0);
		@Pc(200) Class163 local200 = Static491.method6585(arg0);
		Static159.method3112(arg0, local200);
		if (Static591.anInt9999 > 0) {
			Static502.anInt7199--;
			if (Static502.anInt7199 == 0) {
				Static591.anInt9999--;
				Static502.anInt7199 = 20;
			}
		}
		if (!Static164.aBoolean291) {
			return;
		}
		@Pc(231) int local231 = arg5 + arg3 - 5;
		@Pc(237) int local237 = arg4 + arg2 - 8;
		Static359.aClass34_7.method8584(16776960, local231, -1, "Fps:" + Static576.anInt9821, local237);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static359.aClass34_7.method8584(local266, local231, -1, "Mem:" + local264 + "k", local252);
		local237 = local252 - 15;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIILclient!ni;IZB)V")
	public static void method8579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class223 arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= 0) {
			Static406.method6373(arg2, arg0, arg1);
			return;
		}
		Static214.aClass6_Sub4_Sub2_2 = null;
		Static224.anInt5036 = arg1;
		Static453.anInt8163 = 1;
		Static473.aClass223_111 = arg2;
		Static309.anInt6223 = 0;
		Static3.aBoolean7 = false;
		Static619.anInt7284 = arg0;
		Static597.anInt10148 = Static623.aClass6_Sub4_Sub2_4.method4801() / arg3;
		if (Static597.anInt10148 < 1) {
			Static597.anInt10148 = 1;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(II)Ljava/lang/String;")
	public static String method8580(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static536.aClass316_35.method7577(Static638.anInt10709) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static536.aClass316_37.method7577(Static638.anInt10709) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
