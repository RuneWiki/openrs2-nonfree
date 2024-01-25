import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "L", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!al", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
	public static void method202(@OriginalArg(0) int arg0) {
		Static381.method5020();
		@Pc(11) int local11 = Static208.aClass151_1.method3512(arg0).anInt5696;
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static320.aClass249_2.anIntArray473[arg0];
		if (local11 == 5) {
			Static40.anInt703 = local27;
		}
		if (local11 == 6) {
			Static353.anInt6051 = local27;
		}
	}
}
