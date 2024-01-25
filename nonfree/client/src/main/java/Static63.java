import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public static int anInt1626;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	public static int anInt1628 = -1;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "[I")
	public static final int[] anIntArray79 = new int[16];

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I")
	public static int method1591() {
		if ((double) Static87.aFloat149 == 3.0D) {
			return 37;
		} else if ((double) Static87.aFloat149 == 4.0D) {
			return 50;
		} else if ((double) Static87.aFloat149 == 6.0D) {
			return 75;
		} else if ((double) Static87.aFloat149 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public static void method1592(@OriginalArg(0) int arg0) {
		Static121.method3342(arg0, Static139.aClass101_11.method2841(Static126.anInt2904));
	}
}
