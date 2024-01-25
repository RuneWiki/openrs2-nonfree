import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Lclient!dh;")
	public static Class3_Sub13 aClass3_Sub13_3;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray85 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILclient!pca;I)V")
	public static void method6453(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2) {
		if (Static2.aClass251_1 != null || Static289.aBoolean370 || (arg1 == null || Static111.method2259(arg1) == null)) {
			return;
		}
		Static2.aClass251_1 = arg1;
		Static45.aClass251_3 = Static111.method2259(arg1);
		Static495.anInt8599 = arg0;
		Static558.aBoolean641 = false;
		Static369.anInt6482 = arg2;
		Static514.anInt8866 = 0;
	}
}
