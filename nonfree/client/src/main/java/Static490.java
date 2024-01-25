import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static490 {

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)I")
	public static int method7817(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
