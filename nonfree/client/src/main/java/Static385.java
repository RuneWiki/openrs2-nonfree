import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static385 {

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
	public static int[] anIntArray429;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
	public static boolean method5050(@OriginalArg(1) int arg0) {
		if (arg0 == 58 || arg0 == 30 || arg0 == 47 || arg0 == 13 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
	public static void method5053() {
		Static191.anInt3304 = 0;
		Static232.anInt4096 = -1;
		Static11.anInt185 = -1;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
	public static void method5054() {
		Static313.aClass124Array2 = null;
		Static416.method5405(0, 0, -1, 0, 0, Static207.anInt6026, Static338.anInt5777, Static69.anInt1304);
		if (Static313.aClass124Array2 != null) {
			Static54.method921(Static441.anInt7358, 0, Static69.anInt1304, Static338.anInt5777, -1412584499, Static313.aClass124Array2, Static121.anInt2247, 0, Static401.aClass124_12.anInt3396);
			Static313.aClass124Array2 = null;
		}
	}
}
