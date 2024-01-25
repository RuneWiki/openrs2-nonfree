import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!paa", name = "W", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!paa", name = "Y", descriptor = "[I")
	public static final int[] anIntArray562 = new int[1000];

	@OriginalMember(owner = "client!paa", name = "ab", descriptor = "I")
	public static int anInt7642 = 0;

	@OriginalMember(owner = "client!paa", name = "Z", descriptor = "[I")
	public static final int[] anIntArray563 = new int[1000];

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(IB)Z")
	public static boolean method6599(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 52 || arg0 == 3 || arg0 == 60 || arg0 == 1010 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 44;
		}
	}
}
