import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public static int anInt2863;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public static int anInt2862 = 0;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
	public static int[] anIntArray356 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
	public static void method2384(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static183.aBoolean435) {
			Static183.aBoolean435 = arg0;
			Static234.method3736();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method2385(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
