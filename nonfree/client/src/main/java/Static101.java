import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	public static int anInt2104;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lclient!cj;")
	public static final Class51[] aClass51Array1 = new Class51[6];

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)V")
	public static void method1859(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static341.anInt6056 = arg0;
		Static400.aClass20_Sub5Array2 = new Class20_Sub5[Static504.anIntArray578[Static341.anInt6056] + 1];
		Static134.anInt9523 = 0;
		Static469.anInt7951 = 0;
	}
}
