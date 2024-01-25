import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!jq;")
	public static Class156 aClass156_3 = null;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "[Lclient!na;")
	public static final Class199[] aClass199Array1 = new Class199[14];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!n;IIIIILclient!qa;)V")
	public static void method1151(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class122 arg5) {
		if (Static385.anInt6975 < 100) {
			Static152.method2410(arg5, arg0);
		}
		arg5.N(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(33) int local33;
		@Pc(53) int local53;
		if (Static385.anInt6975 < 100) {
			local33 = arg3 / 2 + arg1;
			arg5.f(arg1, arg2, arg3, arg4, -16777216, 0);
			local53 = arg2 + arg4 / 2 - 38;
			arg5.method7282(local33 - 152, local53, 304, 34, Static443.aColorArray1[Static36.anInt790].getRGB(), 0);
			arg5.f(local33 - 150, local53 + 2, Static385.anInt6975 * 3, 30, Static489.aColorArray2[Static36.anInt790].getRGB(), 0);
			Static296.aClass67_9.method7489(Static523.aColorArray3[Static36.anInt790].getRGB(), -1, local53 + 20, local33, Static520.aClass306_130.method7165(Static179.anInt3168));
			return;
		}
		@Pc(109) int local109 = Static103.anInt2070 - (int) ((float) arg3 / Static118.aFloat10);
		local33 = (int) ((float) arg4 / Static118.aFloat10) + Static214.anInt2191;
		local53 = (int) ((float) arg3 / Static118.aFloat10) + Static103.anInt2070;
		@Pc(134) int local134 = Static214.anInt2191 - (int) ((float) arg4 / Static118.aFloat10);
		Static388.anInt7030 = Static214.anInt2191 - (int) ((float) arg4 / Static118.aFloat10);
		Static56.anInt1112 = Static103.anInt2070 - (int) ((float) arg3 / Static118.aFloat10);
		Static431.anInt7507 = (int) ((float) (arg4 * 2) / Static118.aFloat10);
		Static135.anInt2650 = (int) ((float) (arg3 * 2) / Static118.aFloat10);
		Static118.method826(local109 + Static118.anInt815, Static118.anInt813 + local33, Static118.anInt815 + local53, Static118.anInt813 + local134, arg1, arg2, arg3 + arg1, arg4 + arg2 + 1);
		Static118.method824(arg5);
		@Pc(201) Class37 local201 = Static118.method833(arg5);
		Static444.method6364(arg5, local201);
		if (Static546.anInt2811 > 0) {
			Static99.anInt1989--;
			if (Static99.anInt1989 == 0) {
				Static546.anInt2811--;
				Static99.anInt1989 = 20;
			}
		}
		if (!Static135.aBoolean172) {
			return;
		}
		@Pc(237) int local237 = arg3 + arg1 - 5;
		@Pc(244) int local244 = arg2 + arg4 - 8;
		Static112.aClass67_3.method7495(16776960, local244, local237, "Fps:" + Static477.anInt7966);
		@Pc(259) int local259 = local244 - 15;
		@Pc(261) Runtime local261 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local261.totalMemory() - local261.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static112.aClass67_3.method7495(local272, local259, local237, "Mem:" + local270 + "k");
		local244 = local259 - 15;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	public static void method1152() {
		if (Static103.anInt2070 < 0) {
			Static340.anInt6093 = -1;
			Static351.anInt6257 = -1;
			Static103.anInt2070 = 0;
		}
		if (Static103.anInt2070 > Static118.anInt818) {
			Static351.anInt6257 = -1;
			Static340.anInt6093 = -1;
			Static103.anInt2070 = Static118.anInt818;
		}
		if (Static214.anInt2191 < 0) {
			Static340.anInt6093 = -1;
			Static214.anInt2191 = 0;
			Static351.anInt6257 = -1;
		}
		if (Static118.anInt816 < Static214.anInt2191) {
			Static351.anInt6257 = -1;
			Static340.anInt6093 = -1;
			Static214.anInt2191 = Static118.anInt816;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
	public static boolean method1153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method1154(@OriginalArg(1) int arg0) {
		Static98.aLong345 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
	public static boolean method1156(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
