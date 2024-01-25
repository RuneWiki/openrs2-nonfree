import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt4374;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
	public static int[] anIntArray537;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!iu;")
	public static Class112 aClass112_9;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_113 = new Class211(42, 0);

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public static int anInt4375 = 0;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static372.anInt1561 <= arg4 - arg5 && arg4 + arg5 <= Static98.anInt1774 && Static194.anInt3448 <= arg1 - arg5 && arg1 + arg5 <= Static264.anInt4589) {
			Static128.method1860(arg4, arg3, arg0, arg5, arg1, arg2);
		} else {
			Static102.method2560(arg2, arg5, arg4, arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method3889() {
		Static379.aClass50_1.method5053();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static5.aLongArray1[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static32.aLongArray2[local29] = 0L;
		}
		Static372.anInt1559 = 0;
	}
}
