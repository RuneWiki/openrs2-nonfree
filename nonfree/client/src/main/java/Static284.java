import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array20;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!tj;IILclient!wh;BII)V")
	public static void method4888(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static134.anInt2769 < 100) {
			Static87.method1388(arg0, arg3);
		}
		arg0.method4768(arg1, arg2, arg1 + arg5, arg2 + arg4);
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (Static134.anInt2769 < 100) {
			local32 = arg5 / 2 + arg1;
			local43 = arg2 + arg4 / 2 - 20 - 18;
			arg0.method4732(arg1, arg2, arg5, arg4, -16777216, 0);
			arg0.method4728(local32 - 152, local43, 304, 34, Static184.aColorArray33[Static11.anInt258].getRGB(), 0);
			arg0.method4732(local32 - 150, local43 + 2, Static134.anInt2769 * 3, 30, Static250.aColorArray26[Static11.anInt258].getRGB(), 0);
			Static243.aClass120_6.method5547(-1, Static197.aString153, local32, Static235.aColorArray25[Static11.anInt258].getRGB(), local43 + 20);
			return;
		}
		@Pc(105) int local105 = Static330.anInt6402 - (int) ((float) arg5 / Static193.aFloat14);
		local32 = Static114.anInt2413 + (int) ((float) arg4 / Static193.aFloat14);
		local43 = (int) ((float) arg5 / Static193.aFloat14) + Static330.anInt6402;
		Static78.anInt1560 = Static330.anInt6402 - (int) ((float) arg5 / Static193.aFloat14);
		Static240.anInt4810 = Static114.anInt2413 - (int) ((float) arg4 / Static193.aFloat14);
		Static20.anInt547 = (int) ((float) (arg4 * 2) / Static193.aFloat14);
		@Pc(156) int local156 = Static114.anInt2413 - (int) ((float) arg4 / Static193.aFloat14);
		Static12.anInt312 = (int) ((float) (arg5 * 2) / Static193.aFloat14);
		Static193.method1927(local105 + Static193.anInt2349, local32 + Static193.anInt2354, Static193.anInt2349 + local43, Static193.anInt2354 + local156, arg1, arg2, arg1 + arg5, arg4 + 1 + arg2);
		Static193.method1915(arg0);
		@Pc(199) Class127 local199 = Static193.method1925(arg0);
		Static240.method4144(arg0, local199);
		if (Static13.anInt346 > 0) {
			Static277.anInt5533--;
			if (Static277.anInt5533 == 0) {
				Static13.anInt346--;
				Static277.anInt5533 = 20;
			}
		}
		if (!Static276.aBoolean345) {
			return;
		}
		@Pc(232) int local232 = arg5 + arg1 - 5;
		@Pc(239) int local239 = arg2 + arg4 - 8;
		Static83.aClass120_1.method5544(16776960, "Fps:" + Static115.anInt2445, local232, local239);
		@Pc(254) int local254 = local239 - 15;
		@Pc(256) Runtime local256 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local256.totalMemory() - local256.freeMemory()) / 1024L);
		@Pc(268) int local268 = 16776960;
		if (local266 > 65536) {
			local268 = 16711680;
		}
		Static83.aClass120_1.method5544(local268, "Mem:" + local266 + "k", local232, local254);
		local239 = local254 - 15;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
	public static void method4891(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub7_Sub11 local19 = Static116.method2029(arg0, 7);
		local19.method2502();
	}
}
