import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!b", name = "g", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "[I")
	public static final int[] anIntArray20 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)I")
	public static int method334(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static483.anInt8236;
		if (local5 == 0) {
			return arg0 ? 0 : Static212.anInt4040;
		} else if (local5 == 1) {
			return Static212.anInt4040;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
