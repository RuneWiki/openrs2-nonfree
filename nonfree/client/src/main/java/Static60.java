import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_9;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt1347;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_460 = Static161.method2452("Service unavailable)3");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_459 = aClass20_460;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt1348 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!mf;BIIIII)V")
	public static void method1018(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 * arg2 + arg3 * arg3;
		if (local7 > 360000) {
			return;
		}
		@Pc(25) int local25 = Math.min(arg0.anInt2541 / 2, arg0.anInt2471 / 2);
		if (local25 * local25 >= local7) {
			Static12.method228(arg0, arg1, arg2, arg3, Static16.aClass5_Sub2_Sub10Array2[arg5], arg4);
			return;
		}
		local25 -= 10;
		@Pc(52) int local52 = Static79.anInt1777 + Static72.anInt1568 & 0x7FF;
		@Pc(56) int local56 = Class80.anIntArray324[local52];
		@Pc(64) int local64 = local56 * 256 / (Static109.anInt2292 + 256);
		@Pc(68) int local68 = Class80.anIntArray327[local52];
		@Pc(76) int local76 = local68 * 256 / (Static109.anInt2292 + 256);
		@Pc(87) int local87 = arg2 * local76 - local64 * arg3 >> 16;
		@Pc(97) int local97 = arg2 * local64 + arg3 * local76 >> 16;
		@Pc(103) double local103 = Math.atan2((double) local97, (double) local87);
		@Pc(110) int local110 = (int) ((double) local25 * Math.sin(local103));
		@Pc(117) int local117 = (int) ((double) local25 * Math.cos(local103));
		((Class5_Sub2_Sub10_Sub1) Static73.aClass5_Sub2_Sub10Array7[arg5]).method2415(arg0.anInt2541 / 2 + arg4 + local110 - 10, -local117 + (arg1 - -(arg0.anInt2471 / 2)) - 10, local103);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!wa;Lclient!fb;Lclient!wa;)V")
	public static void method1019(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) Class23 arg2) {
		Static191.anInterface2_1 = arg1;
		Static30.aClass23_17 = arg2;
		Static70.aClass23_29 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method1020() {
		Static36.aFont1 = null;
		Static30.aFontMetrics1 = null;
		Static218.anImage4 = null;
	}
}
