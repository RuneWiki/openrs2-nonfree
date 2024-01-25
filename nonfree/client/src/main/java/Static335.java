import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static335 {

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method4744() {
		if (Static403.anInt6667 == 10) {
			Static187.method2932(28);
		}
		if (Static403.anInt6667 == 30) {
			Static187.method2932(25);
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public static int method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static447.anIntArrayArray64 == null ? 0 : Static447.anIntArrayArray64[arg0][arg1] & 0xFFFFFF;
	}
}
