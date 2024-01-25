import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Lclient!ns;")
	public static Class166 aClass166_304;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Lclient!si;")
	public static final Class217 aClass217_42 = new Class217(1, 3);

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	public static int anInt7599 = 1;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "[I")
	public static int[] anIntArray673 = new int[1];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ns;I)V")
	public static void method5859(@OriginalArg(0) Class166 arg0) {
		Static267.aClass166_190 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)V")
	public static void method5860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class80[] local10 = Static118.aClass80Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class80 local18 = local10[local12];
			if (local18 != null && local18.anInt2470 == 2) {
				Static106.method1665(local18.anInt2467, arg1 >> 1, arg0 >> 1, local18.anInt2469, local18.anInt2463, local18.anInt2461 * 2);
				if (Static370.anIntArray573[0] > -1 && Static175.anInt3261 % 20 < 10) {
					Static39.aClass3Array2[local18.anInt2468].method5877(arg3 + Static370.anIntArray573[0] - 12, Static370.anIntArray573[1] + arg2 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!jb;)Z")
	public static boolean method5862(@OriginalArg(1) Class126 arg0) {
		if (arg0.anInt3434 == Static291.anInt5273) {
			Static134.anInt2618 = 250;
			return true;
		} else {
			return false;
		}
	}
}
