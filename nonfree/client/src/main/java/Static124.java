import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray194 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
	public static final int[] anIntArray571 = new int[5];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public static void method7261(@OriginalArg(0) int arg0) {
		Static193.method3260();
		@Pc(11) int local11 = Static29.aClass130_2.method3316(arg0).anInt6962;
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static491.aClass318_1.anIntArray519[arg0];
		if (local11 == 5) {
			Static521.anInt8378 = local26;
		}
		if (local11 == 6) {
			Static487.anInt9194 = local26;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZII)V")
	public static void method7263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1008) {
			Static312.method4573(Static379.aClass137_9, arg1, arg2);
		} else if (arg0 == 1001) {
			Static312.method4573(Static48.aClass137_2, arg1, arg2);
		} else if (arg0 == 1012) {
			Static312.method4573(Static583.aClass137_11, arg1, arg2);
		} else if (arg0 == 1010) {
			Static312.method4573(Static515.aClass137_8, arg1, arg2);
			return;
		} else if (arg0 == 1002) {
			Static312.method4573(Static382.aClass137_10, arg1, arg2);
			return;
		}
	}
}
