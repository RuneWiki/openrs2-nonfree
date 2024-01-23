import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt3784;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Lclient!nb;")
	public static Class15 aClass15_35;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public static int anInt3785 = 0;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public static int anInt3787 = -1;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_1010 = Static184.method2923("Weiter");

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_1011 = Static184.method2923(":assistreq:");

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public static int[] anIntArray400 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBIII)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static60.anInt4779 <= arg3 && arg3 <= Static11.anInt385) {
			@Pc(19) int local19 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg2);
			@Pc(25) int local25 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg1);
			Static95.method1664(arg0, local19, arg3, local25);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	public static void method2628(@OriginalArg(0) int arg0) {
		Static40.anInt1221 = arg0;
		Static49.anInt1395 = 50;
	}
}
