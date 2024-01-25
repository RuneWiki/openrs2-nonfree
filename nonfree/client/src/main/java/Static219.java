import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
	public static int anInt3509;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "J")
	public static long aLong120 = 0L;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(BI)V")
	public static void method3080(@OriginalArg(1) int arg0) {
		if (Static231.anIntArray285 == null || Static231.anIntArray285.length < arg0) {
			Static231.anIntArray285 = new int[arg0];
		}
	}
}
