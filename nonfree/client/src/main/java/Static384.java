import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
	public static boolean method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static465.method5695(arg0, arg1) || Static275.method3737(arg0, arg1) || Static303.method4048(arg0, arg1);
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
	public static void method4938() {
		if (Static135.anInt2114 == 8) {
			Static154.method1923(4);
		} else if (Static135.anInt2114 == 4 || Static135.anInt2114 == 5) {
			Static154.method1923(2);
		} else if (Static135.anInt2114 == 11) {
			Static154.method1923(2);
		}
	}
}
