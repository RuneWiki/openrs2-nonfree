import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt2261;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lclient!du;")
	public static Class57 aClass57_6;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString21 = "";

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
	public static int method1920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	public static void method1923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static210.method5503(arg1, arg2, arg4, arg3);
		} else if (Static293.anInt4886 <= arg3 - arg2 && arg2 + arg3 <= Static137.anInt2576 && Static316.anInt5188 <= arg4 - arg0 && arg4 + arg0 <= Static82.anInt1667) {
			Static248.method3343(arg4, arg0, arg2, arg3, arg1);
		} else {
			Static279.method5725(arg2, arg3, arg0, arg4, arg1);
		}
	}
}
