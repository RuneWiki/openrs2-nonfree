import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public static int anInt2915;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt2918 = 0;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIIIII)V")
	public static void method2671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		if (local9 == 0) {
			if (local14 != 0) {
				Static318.method4085(arg2, arg3, arg0, arg1);
			}
		} else if (local14 == 0) {
			Static291.method4429(arg2, arg1, arg0, arg4);
		} else {
			@Pc(47) int local47 = (local14 << 12) / local9;
			@Pc(56) int local56 = arg1 - (arg0 * local47 >> 12);
			@Pc(74) int local74;
			@Pc(72) int local72;
			if (Static332.anInt5823 > arg0) {
				local72 = local56 + (Static332.anInt5823 * local47 >> 12);
				local74 = Static332.anInt5823;
			} else if (Static202.anInt3722 >= arg0) {
				local74 = arg0;
				local72 = arg1;
			} else {
				local72 = local56 + (local47 * Static202.anInt3722 >> 12);
				local74 = Static202.anInt3722;
			}
			@Pc(115) int local115;
			@Pc(113) int local113;
			if (arg4 < Static332.anInt5823) {
				local115 = Static332.anInt5823;
				local113 = (Static332.anInt5823 * local47 >> 12) + local56;
			} else if (Static202.anInt3722 < arg4) {
				local113 = (local47 * Static202.anInt3722 >> 12) + local56;
				local115 = Static202.anInt3722;
			} else {
				local113 = arg3;
				local115 = arg4;
			}
			if (local113 < Static313.anInt5542) {
				local113 = Static313.anInt5542;
				local115 = (Static313.anInt5542 - local56 << 12) / local47;
			} else if (local113 > Static345.anInt6084) {
				local115 = (Static345.anInt6084 - local56 << 12) / local47;
				local113 = Static345.anInt6084;
			}
			if (Static313.anInt5542 > local72) {
				local72 = Static313.anInt5542;
				local74 = (Static313.anInt5542 - local56 << 12) / local47;
			} else if (local72 > Static345.anInt6084) {
				local74 = (Static345.anInt6084 - local56 << 12) / local47;
				local72 = Static345.anInt6084;
			}
			Static390.method5729(local72, local74, local115, arg2, local113);
		}
	}
}
