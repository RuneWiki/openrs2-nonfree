import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
	public static final int[] anIntArray705 = new int[1024];

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "[B")
	public static byte[] aByteArray92 = null;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
	public static boolean aBoolean655 = false;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt9755 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZI)V")
	public static void method8323(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static698.anInt10887++;
			Static604.method7759();
		}
		if (arg0) {
			Static478.anInt5830++;
			Static126.method2305();
		}
	}
}
