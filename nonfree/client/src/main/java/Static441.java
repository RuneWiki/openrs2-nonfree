import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static int anInt8404;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!qe;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!ufa;")
	public static Class326 aClass326_2;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_118 = new Class276(21, 4);

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method6901() {
		if (Static75.anInt1880 == 9) {
			Static168.method3104(5);
		} else if (Static75.anInt1880 == 5 || Static75.anInt1880 == 6) {
			Static168.method3104(3);
		} else if (Static75.anInt1880 == 12) {
			Static168.method3104(3);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z")
	public static boolean method6902(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
