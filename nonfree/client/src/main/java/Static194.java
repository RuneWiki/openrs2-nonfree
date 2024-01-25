import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!ea;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)I")
	public static int method3425(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
