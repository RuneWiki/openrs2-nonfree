import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt3979;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!l;")
	public static Class57 aClass57_11;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_34 = new Class198(50);

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
	public static final int[] anIntArray334 = new int[64];

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public static int anInt3978 = 0;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method3408() {
		Static251.anInt4974 = 0;
		Static355.anInt6865 = -1;
		Static154.anInt6365 = -1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z")
	public static boolean method3409(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static212.aClass122_2.method4774();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static212.aClass122_2.method4735();
		} else if (!Static212.aClass122_2.method4769()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static172.aBoolean196 = arg0;
			Static261.method4409(Static353.aClass42_5);
			return true;
		}
	}
}
