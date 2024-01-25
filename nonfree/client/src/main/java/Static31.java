import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
	public static int anInt617;

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "[I")
	public static final int[] anIntArray45 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BLclient!ig;)I")
	public static int method747(@OriginalArg(1) Class152 arg0) {
		if (arg0 == Static246.aClass152_7) {
			return 5120;
		} else if (arg0 == Static246.aClass152_8) {
			return 5122;
		} else if (Static246.aClass152_9 == arg0) {
			return 5124;
		} else if (arg0 == Static246.aClass152_10) {
			return 5121;
		} else if (Static246.aClass152_11 == arg0) {
			return 5123;
		} else if (Static246.aClass152_12 == arg0) {
			return 5125;
		} else if (arg0 == Static246.aClass152_13) {
			return 5131;
		} else if (Static246.aClass152_14 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
	public static int method748() {
		return Static76.anInt1404 == 1 ? Static125.anInt2572 : 0;
	}
}
