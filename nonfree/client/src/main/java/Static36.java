import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	public static final int[] anIntArray30 = new int[1];

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt685 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public static void method607(@OriginalArg(0) int arg0) {
		if (Static18.anInt5702 == 1) {
			Static274.anInt4852 = arg0;
		} else if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
			Static122.anInt2112 = arg0;
		}
	}
}
