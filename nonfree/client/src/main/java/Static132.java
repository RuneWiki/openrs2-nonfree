import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
	public static int anInt7160 = 0;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
	public static final int[] anIntArray486 = new int[1];

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
	public static boolean method6006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(FFIF)F")
	public static float method6009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg2 - arg1) + arg1;
	}
}
