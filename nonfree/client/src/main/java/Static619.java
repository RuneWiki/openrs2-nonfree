import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static619 {

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "Z")
	public static boolean aBoolean710 = false;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)Z")
	public static boolean method8706(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
