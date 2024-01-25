import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static363 {

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIB)Z")
	public static boolean method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static231.method4128(arg1, arg0) || Static226.method4100(arg1, arg0);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(II)Z")
	public static boolean method5670(@OriginalArg(0) int arg0) {
		Static344.aBoolean476 = true;
		Static105.anInt2402 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	public static void method5672() {
		if (Static366.aBoolean639) {
			return;
		}
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static49.aFloat10 = (int) Static49.aFloat10 - 17 & 0xFFFFFFF0;
		} else {
			Static360.aFloat146 += (-Static360.aFloat146 - 12.0F) / 2.0F;
		}
		Static497.aBoolean640 = true;
		Static366.aBoolean639 = true;
	}
}
