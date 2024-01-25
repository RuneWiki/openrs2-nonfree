import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!n;ILclient!qa;)V")
	public static void method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5) {
		if (Static52.anInt1508 < 100) {
			Static63.method1762(arg3, arg5);
		}
		arg5.N(arg2, arg1, arg2 + arg0, arg4 + arg1);
		@Pc(35) int local35;
		@Pc(54) int local54;
		if (Static52.anInt1508 < 100) {
			local35 = arg0 / 2 + arg2;
			arg5.f(arg2, arg1, arg0, arg4, -16777216, 0);
			local54 = arg4 / 2 + arg1 - 20 - 18;
			arg5.method7568(local35 - 152, local54, 304, 34, Static215.aColorArray3[Static226.anInt4529].getRGB(), 0);
			arg5.f(local35 - 150, local54 + 2, Static52.anInt1508 * 3, 30, Static6.aColorArray1[Static226.anInt4529].getRGB(), 0);
			Static106.aClass27_3.method7824(local54 + 20, Static227.aClass114_166.method3330(Static315.anInt5993), Static203.aColorArray2[Static226.anInt4529].getRGB(), local35, -1);
			return;
		}
		@Pc(112) int local112 = Static211.anInt4386 - (int) ((float) arg0 / Static451.aFloat84);
		local35 = Static181.anInt3889 + (int) ((float) arg4 / Static451.aFloat84);
		local54 = Static211.anInt4386 + (int) ((float) arg0 / Static451.aFloat84);
		Static469.anInt8066 = Static211.anInt4386 - (int) ((float) arg0 / Static451.aFloat84);
		Static358.anInt2384 = (int) ((float) (arg4 * 2) / Static451.aFloat84);
		Static413.anInt7199 = Static181.anInt3889 - (int) ((float) arg4 / Static451.aFloat84);
		Static117.anInt2851 = (int) ((float) (arg0 * 2) / Static451.aFloat84);
		@Pc(173) int local173 = Static181.anInt3889 - (int) ((float) arg4 / Static451.aFloat84);
		Static451.method3227(local112 + Static451.anInt3553, local35 + Static451.anInt3558, Static451.anInt3553 + local54, local173 - -Static451.anInt3558, arg2, arg1, arg0 + arg2, arg4 + 1 + arg1);
		Static451.method3220(arg5);
		@Pc(203) Class38 local203 = Static451.method3219(arg5);
		Static31.method1232(arg5, local203);
		if (Static173.anInt3748 > 0) {
			Static527.anInt8941--;
			if (Static527.anInt8941 == 0) {
				Static527.anInt8941 = 20;
				Static173.anInt3748--;
			}
		}
		if (!Static184.aBoolean244) {
			return;
		}
		@Pc(231) int local231 = arg0 + arg2 - 5;
		@Pc(237) int local237 = arg4 + arg1 - 8;
		Static268.aClass27_4.method7818("Fps:" + Static193.anInt4053, local237, 16776960, local231);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static268.aClass27_4.method7818("Mem:" + local264 + "k", local252, local266, local231);
		local237 = local252 - 15;
	}
}
