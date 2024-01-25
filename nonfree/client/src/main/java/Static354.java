import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public static int anInt5768;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt5770;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_203 = new Class48(72, 2);

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt5766 = 0;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!gu;)Z")
	public static boolean method4948(@OriginalArg(1) Class97 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean185) {
			return false;
		} else if (!arg0.method1857(Static353.anInterface4_2)) {
			return false;
		} else if (Static114.aClass77_15.method1368((long) arg0.anInt2284) == null) {
			return Static76.aClass77_36.method1368((long) arg0.anInt2292) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILclient!cp;ZLclient!tq;I)V")
	public static void method4949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(5) Class164 arg4, @OriginalArg(6) int arg5) {
		if (Static240.anInt4008 < 100) {
			Static335.method4798(arg3, arg4);
		}
		arg4.method5313(arg5, arg2, arg5 + arg0, arg1 + arg2);
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (Static240.anInt4008 < 100) {
			local37 = arg5 + arg0 / 2;
			local48 = arg2 + arg1 / 2 - 38;
			arg4.method5321(arg5, arg2, arg0, arg1, -16777216, 0);
			arg4.method5382(local37 - 152, local48, 304, 34, Static300.aColorArray2[Static172.anInt3129].getRGB(), 0);
			arg4.method5321(local37 - 150, local48 + 2, Static240.anInt4008 * 3, 30, Static73.aColorArray1[Static172.anInt3129].getRGB(), 0);
			Static101.aClass137_2.method5098(-1, Static366.aColorArray3[Static172.anInt3129].getRGB(), local37, Static57.aClass169_321.method3680(Static48.anInt952), local48 + 20);
			return;
		}
		@Pc(112) int local112 = Static386.anInt6289 - (int) ((float) arg0 / Static353.aFloat15);
		local37 = (int) ((float) arg1 / Static353.aFloat15) + Static299.anInt6015;
		local48 = Static386.anInt6289 + (int) ((float) arg0 / Static353.aFloat15);
		Static125.anInt2254 = Static386.anInt6289 - (int) ((float) arg0 / Static353.aFloat15);
		Static335.anInt5582 = (int) ((float) (arg1 * 2) / Static353.aFloat15);
		Static142.anInt2666 = Static299.anInt6015 - (int) ((float) arg1 / Static353.aFloat15);
		@Pc(162) int local162 = Static299.anInt6015 - (int) ((float) arg1 / Static353.aFloat15);
		Static57.anInt5865 = (int) ((float) (arg0 * 2) / Static353.aFloat15);
		Static353.method2124(Static353.anInt2629 + local112, Static353.anInt2623 + local37, local48 + Static353.anInt2629, local162 + Static353.anInt2623, arg5, arg2, arg5 + arg0, arg1 + arg2 + 1);
		Static353.method2121(arg4);
		@Pc(205) Class17 local205 = Static353.method2125(arg4);
		Static300.method4492(local205, arg4);
		if (Static346.anInt5675 > 0) {
			Static134.anInt2508--;
			if (Static134.anInt2508 == 0) {
				Static346.anInt5675--;
				Static134.anInt2508 = 20;
			}
		}
		if (!Static260.aBoolean445) {
			return;
		}
		@Pc(236) int local236 = arg5 + arg0 - 5;
		@Pc(242) int local242 = arg1 + arg2 - 8;
		Static334.aClass137_7.method5094("Fps:" + Static37.anInt718, 16776960, local236, local242);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static334.aClass137_7.method5094("Mem:" + local268 + "k", local270, local236, local257);
		local242 = local257 - 15;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!re;B)Lclient!ub;")
	public static Class43_Sub4 method4950(@OriginalArg(0) Class1_Sub33 arg0) {
		return new Class43_Sub4(arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5159(), arg0.method5159(), arg0.method5174());
	}
}
