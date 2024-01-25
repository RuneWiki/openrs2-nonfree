import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static701 {

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "[I")
	public static final int[] anIntArray611 = new int[8];

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString94 = null;

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "[Lclient!uaa;")
	public static final Class361[] aClass361Array2 = new Class361[2048];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)I")
	public static int method7635(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static370.method3238(arg0);
	}
}
