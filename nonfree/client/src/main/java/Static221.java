import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static221 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!je;IB)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2) {
		if (Static227.aClass117_14 != null || Static65.aBoolean115 || (arg1 == null || Static271.method4166(arg1) == null)) {
			return;
		}
		Static227.aClass117_14 = arg1;
		Static197.aClass117_8 = Static271.method4166(arg1);
		Static100.anInt6412 = 0;
		Static211.anInt3646 = arg2;
		Static40.aBoolean70 = false;
		Static252.anInt4375 = arg0;
	}
}
