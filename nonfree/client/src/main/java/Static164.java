import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public static int anInt2527;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public static int anInt2529;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static final int[] anIntArray144 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JJ)J")
	public static long method2212(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
