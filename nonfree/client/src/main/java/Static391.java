import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)I")
	public static int method2131() {
		if ((double) Static349.aFloat169 == 3.0D) {
			return 37;
		} else if ((double) Static349.aFloat169 == 4.0D) {
			return 50;
		} else if ((double) Static349.aFloat169 == 6.0D) {
			return 75;
		} else if ((double) Static349.aFloat169 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(JJ)J")
	public static long method2132(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
