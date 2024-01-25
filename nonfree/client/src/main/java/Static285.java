import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "Lclient!om;")
	public static Class246 aClass246_133;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "[I")
	public static final int[] anIntArray389 = new int[2];

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)V")
	public static void method4535(@OriginalArg(0) int arg0) {
		Static187.method3225();
		@Pc(11) int local11 = Static157.aClass195_1.method4539(arg0).anInt2613;
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static427.aClass56_1.anIntArray125[arg0];
		if (local11 == 6) {
			Static123.anInt2784 = local27;
		}
		if (local11 == 5) {
			Static451.anInt7402 = local27;
		}
	}
}
