import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static234 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public static void method3908(@OriginalArg(0) int arg0) {
		if (Static443.anIntArray408 == null || Static443.anIntArray408.length < arg0) {
			Static443.anIntArray408 = new int[arg0];
		}
	}
}
