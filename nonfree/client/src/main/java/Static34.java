import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public static int anInt797;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
	public static int anInt802 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method694(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static17.method3926();
		} else if (arg0 == 2) {
			Static56.method1052();
		} else if (arg0 == 3) {
			Static20.method377();
		} else {
			throw new RuntimeException();
		}
	}
}
