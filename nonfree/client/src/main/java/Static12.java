import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_126 = Static161.method2452("Type");

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_127 = Static161.method2452("Welt");

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_132 = Static161.method2452("Too many connections from your address)3");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!dc;")
	public static Class20 aClass20_128 = aClass20_132;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_129 = Static161.method2452("(R");

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_130 = aClass20_126;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_131 = Static161.method2452("labels)3dat");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mf;IIIILclient!ji;I)V")
	public static void method228(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub2_Sub10 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static72.anInt1568 + Static79.anInt1777 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg0.anInt2541 / 2, arg0.anInt2471 / 2) + 10;
		@Pc(32) int local32 = arg3 * arg3 + arg2 * arg2;
		if (local32 > local24 * local24) {
			return;
		}
		@Pc(42) int local42 = Class80.anIntArray324[local12];
		@Pc(51) int local51 = Class80.anIntArray327[local12];
		@Pc(59) int local59 = local42 * 256 / (Static109.anInt2292 + 256);
		@Pc(67) int local67 = local51 * 256 / (Static109.anInt2292 + 256);
		@Pc(77) int local77 = arg3 * local67 + local59 * arg2 >> 16;
		@Pc(88) int local88 = local67 * arg2 - local59 * arg3 >> 16;
		((Class5_Sub2_Sub10_Sub1) arg4).method2430(arg5 + arg0.anInt2541 / 2 + local77 - arg4.anInt3216 / 2, -(arg4.anInt3219 / 2) + arg1 - -(arg0.anInt2471 / 2) + -local88, arg0.anIntArray280, arg0.anIntArray282);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZZIIIIII)Z")
	public static boolean method231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static210.aClass1_Sub2_Sub2_2.anInt2238 == 2) {
			return Static142.method2213(arg6, arg1, arg9, arg7, arg5, arg4, arg8, arg3, arg10, arg2, arg0);
		} else if (Static210.aClass1_Sub2_Sub2_2.anInt2238 > 2) {
			return Static173.method2630(arg2, arg5, arg9, arg7, Static210.aClass1_Sub2_Sub2_2.anInt2238, arg0, arg1, arg3, arg8, arg10, arg4, arg6);
		} else {
			return Static72.method1181(arg5, arg3, arg9, arg2, arg4, arg7, arg10, arg6, arg8, arg0, arg1);
		}
	}
}
