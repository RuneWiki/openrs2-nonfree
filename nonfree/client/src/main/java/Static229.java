import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "[I")
	public static final int[] anIntArray425 = new int[13];

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20;
		if (Static121.anInt2458 != arg0) {
			Static182.anIntArray374 = new int[arg0];
			for (local20 = 0; local20 < arg0; local20++) {
				Static182.anIntArray374[local20] = (local20 << 12) / arg0;
			}
			Static121.anInt2458 = arg0;
			Static344.anInt5861 = arg0 * 32;
			Static429.anInt7203 = arg0 - 1;
		}
		if (Static190.anInt3835 == arg1) {
			return;
		}
		if (Static121.anInt2458 == arg1) {
			Static67.anIntArray106 = Static182.anIntArray374;
		} else {
			Static67.anIntArray106 = new int[arg1];
			for (local20 = 0; local20 < arg1; local20++) {
				Static67.anIntArray106[local20] = (local20 << 12) / arg1;
			}
		}
		Static190.anInt3835 = arg1;
		Static140.anInt2877 = arg1 - 1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!gh;)Lclient!gh;")
	public static Class89 method3415(@OriginalArg(1) Class89 arg0) {
		@Pc(11) Class89 local11 = Static56.method1005(arg0);
		if (local11 == null) {
			local11 = arg0.aClass89_7;
		}
		return local11;
	}
}
