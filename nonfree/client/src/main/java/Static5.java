import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
	public static final int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method120(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method121() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static242.aClass292Array1[local7] = null;
		}
		Static558.anInt9332 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public static void method122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static480.aClass6_Sub37_Sub1_1.anInt6060 * arg2 >> 8;
		if (arg0 == -1 && !Static150.aBoolean182) {
			Static161.method2371();
		} else if (arg0 != -1 && (arg0 != Static524.anInt8993 || !Static181.method2731()) && local10 != 0 && !Static150.aBoolean182) {
			Static383.method5694(arg0, local10, arg1, Static375.aClass251_107);
		}
		Static524.anInt8993 = arg0;
	}
}
