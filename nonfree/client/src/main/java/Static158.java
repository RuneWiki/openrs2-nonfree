import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray37;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1598 = Static187.method3089("Free world");

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1597 = aClass92_1598;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array23 = new Class92[500];

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt3294 = 0;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1599 = Static187.method3089(":clan:");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1600 = Static187.method3089("<img=0>");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public static int method2475() {
		if (Static94.aDouble10 == 3.0D) {
			return 37;
		} else if (Static94.aDouble10 == 4.0D) {
			return 50;
		} else if (Static94.aDouble10 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static24.method463(arg5)) {
			Static53.method907(arg6, arg0, -1, arg1, arg2, Static194.aClass11ArrayArray1[arg5], arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z")
	public static boolean method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static196.method3212(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static169.method2639(local10 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg2] + arg3, local14 + 1) && Static169.method2639(local10 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static169.method2639(local10 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static169.method2639(local10 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
