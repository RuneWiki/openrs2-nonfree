import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_119 = new Class154(3, -1);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!ps;)Ljava/lang/String;")
	public static String method6727(@OriginalArg(1) Class273 arg0) {
		if (Static70.method1164(arg0).method2767() == 0) {
			return null;
		} else if (arg0.aString101 == null || arg0.aString101.trim().length() == 0) {
			return Static440.aBoolean582 ? "Hidden-use" : null;
		} else {
			return arg0.aString101;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!fa;IIIILclient!r;I)V")
	public static void method6729(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class162 arg4, @OriginalArg(6) int arg5) {
		if (Static559.anInt9135 < 100) {
			Static499.method6464(arg0, arg4);
		}
		arg4.da(arg2, arg5, arg2 + arg1, arg3 + arg5);
		@Pc(39) int local39;
		@Pc(50) int local50;
		if (Static559.anInt9135 < 100) {
			local39 = arg2 + arg1 / 2;
			local50 = arg5 + arg3 / 2 - 20 - 18;
			arg4.J(arg2, arg5, arg1, arg3, -16777216, 0);
			arg4.method6827(local39 - 152, local50, 304, 34, Static560.aColorArray3[Static401.anInt6601].getRGB(), 0);
			arg4.J(local39 - 150, local50 + 2, Static559.anInt9135 * 3, 30, Static333.aColorArray1[Static401.anInt6601].getRGB(), 0);
			Static81.aClass37_16.method7724(Static400.aColorArray2[Static401.anInt6601].getRGB(), -1, Static229.aClass159_20.method2776(Static261.anInt4297), local50 + 20, local39);
			return;
		}
		@Pc(116) int local116 = Static26.anInt449 - (int) ((float) arg1 / Static476.aFloat197);
		local39 = Static366.anInt6166 + (int) ((float) arg3 / Static476.aFloat197);
		local50 = (int) ((float) arg1 / Static476.aFloat197) + Static26.anInt449;
		Static560.anInt9173 = Static366.anInt6166 - (int) ((float) arg3 / Static476.aFloat197);
		Static367.anInt6180 = (int) ((float) (arg3 * 2) / Static476.aFloat197);
		Static343.anInt5955 = Static26.anInt449 - (int) ((float) arg1 / Static476.aFloat197);
		@Pc(168) int local168 = Static366.anInt6166 - (int) ((float) arg3 / Static476.aFloat197);
		Static50.anInt903 = (int) ((float) (arg1 * 2) / Static476.aFloat197);
		Static476.method6100(local116 + Static476.anInt7583, Static476.anInt7584 + local39, local50 + Static476.anInt7583, local168 - -Static476.anInt7584, arg2, arg5, arg1 + arg2, arg5 + arg3 + 1);
		Static476.method6108(arg4);
		@Pc(206) Class70 local206 = Static476.method6111(arg4);
		Static318.method4635(local206, arg4);
		if (Static150.anInt2432 > 0) {
			Static82.anInt1424--;
			if (Static82.anInt1424 == 0) {
				Static150.anInt2432--;
				Static82.anInt1424 = 20;
			}
		}
		if (!Static222.aBoolean232) {
			return;
		}
		@Pc(234) int local234 = arg1 + arg2 - 5;
		@Pc(240) int local240 = arg5 + arg3 - 8;
		Static322.aClass37_20.method7709(16776960, "Fps:" + Static112.anInt1993, -1, local234, local240);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static322.aClass37_20.method7709(local269, "Mem:" + local267 + "k", -1, local234, local255);
		local240 = local255 - 15;
	}
}
