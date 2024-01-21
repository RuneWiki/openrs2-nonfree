import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray2 = new int[6];

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[I")
	public static int[] anIntArray7 = new int[6];

	@OriginalMember(owner = "client!a", name = "k", descriptor = "[I")
	public static int[] anIntArray9 = new int[6];

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
	public static int[] anIntArray10 = new int[6];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
	public static int[] anIntArray14 = new int[6];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	public static void method1() {
		anIntArray2 = null;
		anIntArray14 = null;
		anIntArray10 = null;
		anIntArray9 = null;
		anIntArray7 = null;
		anIntArrayArray2 = null;
		anIntArrayArray1 = null;
	}
}
