import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_2 = new Class8("WIP", 2);

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_35 = new Class44(10);

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public static int anInt4606 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIILclient!ps;ILclient!eq;)V")
	public static void method3890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5) {
		if (Static263.anInt4747 < 100) {
			Static392.method4237(arg3, arg5);
		}
		arg5.method5044(arg0, arg1, arg0 + arg2, arg4 + arg1);
		@Pc(33) int local33;
		@Pc(44) int local44;
		if (Static263.anInt4747 < 100) {
			local33 = arg0 + arg2 / 2;
			local44 = arg4 / 2 + arg1 - 18 - 20;
			arg5.method5004(arg0, arg1, arg2, arg4, -16777216, 0);
			arg5.method4972(local33 - 152, local44, 304, 34, Static28.aColorArray1[Static35.anInt1085].getRGB(), 0);
			arg5.method5004(local33 - 150, local44 - -2, Static263.anInt4747 * 3, 30, Static71.aColorArray2[Static35.anInt1085].getRGB(), 0);
			Static236.aClass29_2.method4795(local33, Static258.aClass267_62.method6581(Static161.anInt3239), local44 + 20, Static304.aColorArray3[Static35.anInt1085].getRGB(), -1);
			return;
		}
		@Pc(110) int local110 = Static226.anInt5617 - (int) ((float) arg2 / Static7.aFloat8);
		local33 = (int) ((float) arg4 / Static7.aFloat8) + Static242.anInt4490;
		local44 = Static226.anInt5617 + (int) ((float) arg2 / Static7.aFloat8);
		Static71.anInt1871 = Static242.anInt4490 - (int) ((float) arg4 / Static7.aFloat8);
		Static408.anInt7342 = (int) ((float) (arg2 * 2) / Static7.aFloat8);
		Static93.anInt2136 = (int) ((float) (arg4 * 2) / Static7.aFloat8);
		Static348.anInt6271 = Static226.anInt5617 - (int) ((float) arg2 / Static7.aFloat8);
		@Pc(179) int local179 = Static242.anInt4490 - (int) ((float) arg4 / Static7.aFloat8);
		Static7.method934(local110 + Static7.anInt1139, local33 + Static7.anInt1150, Static7.anInt1139 + local44, local179 - -Static7.anInt1150, arg0, arg1, arg0 + arg2, arg4 + 1 + arg1);
		Static7.method926(arg5);
		@Pc(210) Class244 local210 = Static7.method931(arg5);
		Static363.method5365(local210, arg5);
		if (Static224.anInt4061 > 0) {
			Static373.anInt6709--;
			if (Static373.anInt6709 == 0) {
				Static373.anInt6709 = 20;
				Static224.anInt4061--;
			}
		}
		if (!Static250.aBoolean295) {
			return;
		}
		@Pc(238) int local238 = arg2 + arg0 - 5;
		@Pc(244) int local244 = arg4 + arg1 - 8;
		Static35.aClass29_1.method4790(local244, "Fps:" + Static135.anInt2872, local238, 16776960);
		@Pc(259) int local259 = local244 - 15;
		@Pc(261) Runtime local261 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local261.totalMemory() - local261.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static35.aClass29_1.method4790(local259, "Mem:" + local270 + "k", local238, local272);
		local244 = local259 - 15;
	}
}
