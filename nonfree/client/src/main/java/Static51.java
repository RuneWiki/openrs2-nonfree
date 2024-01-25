import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
	public static int anInt1124;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZILclient!ha;Lclient!d;II)V")
	public static void method1003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static306.anInt5140 < 100) {
			Static125.method1868(arg2, arg3);
		}
		arg2.KA(arg5, arg1, arg5 + arg4, arg1 - -arg0);
		@Pc(32) int local32;
		@Pc(52) int local52;
		if (Static306.anInt5140 < 100) {
			local32 = arg5 + arg4 / 2;
			arg2.aa(arg5, arg1, arg4, arg0, -16777216, 0);
			local52 = arg1 + arg0 / 2 - 20 - 18;
			arg2.method8062(local32 - 152, local52, 304, 34, Static292.aColorArray4[Static520.anInt8219].getRGB(), 0);
			arg2.aa(local32 - 150, local52 - -2, Static306.anInt5140 * 3, 30, Static111.aColorArray1[Static520.anInt8219].getRGB(), 0);
			Static293.aClass67_14.method7676(Static514.aColorArray5[Static520.anInt8219].getRGB(), Static114.aClass84_18.method1729(Static654.anInt10668), -1, local52 + 20, local32);
			return;
		}
		@Pc(108) int local108 = Static81.anInt10273 - (int) ((float) arg4 / Static671.aFloat183);
		local32 = (int) ((float) arg0 / Static671.aFloat183) + Static594.anInt9606;
		local52 = Static81.anInt10273 + (int) ((float) arg4 / Static671.aFloat183);
		Static127.anInt2265 = (int) ((float) (arg0 * 2) / Static671.aFloat183);
		@Pc(142) int local142 = Static594.anInt9606 - (int) ((float) arg0 / Static671.aFloat183);
		Static377.anInt7878 = (int) ((float) (arg4 * 2) / Static671.aFloat183);
		Static64.anInt1327 = Static81.anInt10273 - (int) ((float) arg4 / Static671.aFloat183);
		Static27.anInt680 = Static594.anInt9606 - (int) ((float) arg0 / Static671.aFloat183);
		Static671.method7639(local108 + Static671.anInt9357, local32 + Static671.anInt9358, Static671.anInt9357 + local52, Static671.anInt9358 + local142, arg5, arg1, arg5 + arg4, arg0 + arg1 + 1);
		Static671.method7634(arg2);
		@Pc(200) Class302 local200 = Static671.method7636(arg2);
		Static270.method3998(arg2, local200);
		if (Static270.anInt4659 > 0) {
			Static258.anInt4526--;
			if (Static258.anInt4526 == 0) {
				Static258.anInt4526 = 20;
				Static270.anInt4659--;
			}
		}
		if (!Static421.aBoolean485) {
			return;
		}
		@Pc(229) int local229 = arg5 + arg4 - 5;
		@Pc(235) int local235 = arg0 + arg1 - 8;
		Static184.aClass67_3.method7675(local235, local229, -1, 16776960, "Fps:" + Static451.anInt7260);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static184.aClass67_3.method7675(local250, local229, -1, local263, "Mem:" + local261 + "k");
		local235 = local250 - 15;
	}
}
