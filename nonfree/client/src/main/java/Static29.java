import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!lm;")
	public static Class134 aClass134_12;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt545;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	public static int anInt547;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString20 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString21 = "glow2:";

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIZI)V")
	public static void method490(@OriginalArg(2) boolean arg0) {
		Static348.anInt6162 = 22050;
		Static340.aBoolean542 = arg0;
		Static100.anInt1935 = 2;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	public static void method492() {
		Static276.method4932();
		Static47.method939();
		Static345.method5770();
		Static250.method4496();
		Static286.method5010();
		Static165.method2899();
		method494();
		Static10.method162();
		Static211.method3855();
		Static166.method2922();
		Static86.method1394();
		Static295.method5179();
		Static352.method5837();
		Static73.method744();
		Static112.method1809();
		Static35.method685();
		Static14.method206();
		Static148.method2609();
		Static328.method440();
		Static32.method510();
		Static57.method1115();
		Static135.method2291();
		Static262.method1690();
		Static9.aClass37_2.method914();
		Static89.aClass37_33.method914();
		Static120.aClass37_41.method914();
		Static11.aClass37_96.method914();
		Static122.aClass37_42.method914();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ii;ILclient!fh;IIZ)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static132.anInt6774 < 100) {
			Static314.method5373(arg3, arg1);
		}
		arg1.method4268(arg5, arg4, arg5 + arg2, arg4 - -arg0);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static132.anInt6774 < 100) {
			local34 = arg5 + arg2 / 2;
			local45 = arg0 / 2 + arg4 - 20 - 18;
			arg1.method4249(arg5, arg4, arg2, arg0, -16777216, 0);
			arg1.method4275(local34 - 152, local45, 304, 34, Static75.aColorArray2[Static235.anInt6127].getRGB(), 0);
			arg1.method4249(local34 - 150, local45 - -2, Static132.anInt6774 * 3, 30, Static182.aColorArray3[Static235.anInt6127].getRGB(), 0);
			Static286.aClass29_3.method3746(local34, Static19.aString13, local45 + 20, -1, Static58.aColorArray1[Static235.anInt6127].getRGB());
			return;
		}
		@Pc(110) int local110 = Static22.anInt428 - (int) ((float) arg2 / Static150.aFloat19);
		local34 = (int) ((float) arg0 / Static150.aFloat19) + Static24.anInt439;
		local45 = (int) ((float) arg2 / Static150.aFloat19) + Static22.anInt428;
		Static136.anInt2697 = (int) ((float) (arg2 * 2) / Static150.aFloat19);
		Static130.anInt4850 = (int) ((float) (arg0 * 2) / Static150.aFloat19);
		Static260.anInt5344 = Static22.anInt428 - (int) ((float) arg2 / Static150.aFloat19);
		Static310.anInt6180 = Static24.anInt439 - (int) ((float) arg0 / Static150.aFloat19);
		@Pc(169) int local169 = Static24.anInt439 - (int) ((float) arg0 / Static150.aFloat19);
		Static150.method2264(Static150.anInt2643 + local110, Static150.anInt2638 + local34, local45 + Static150.anInt2643, local169 + Static150.anInt2638, arg5, arg4, arg2 + arg5, arg4 - -arg0 + 1);
		Static150.method2254(arg1);
		@Pc(199) Class14 local199 = Static150.method2257(arg1);
		Static187.method3325(arg1, local199);
		if (Static284.anInt5720 > 0) {
			Static72.anInt1505--;
			if (Static72.anInt1505 == 0) {
				Static72.anInt1505 = 20;
				Static284.anInt5720--;
			}
		}
		if (!Static248.aBoolean4) {
			return;
		}
		@Pc(230) int local230 = arg2 + arg5 - 5;
		@Pc(236) int local236 = arg0 + arg4 - 8;
		Static233.aClass29_2.method3740("Fps:" + Static79.anInt6704, local230, 16776960, local236);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static233.aClass29_2.method3740("Mem:" + local262 + "k", local230, local264, local251);
		local236 = local251 - 15;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	private static void method494() {
		@Pc(5) Class37 local5 = Static129.aClass37_44;
		synchronized (Static129.aClass37_44) {
			Static129.aClass37_44.method914();
		}
		local5 = Static50.aClass37_23;
		synchronized (Static50.aClass37_23) {
			Static50.aClass37_23.method914();
		}
	}
}
