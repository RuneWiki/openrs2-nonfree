import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
	public static int anInt10488;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[F)[F")
	public static float[] method8747(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(15) float[] local15 = new float[arg0];
		Static681.method2477(arg1, 0, local15, 0, arg0);
		return local15;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
	public static void method8749(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 7);
		local9.method2822();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)Z")
	public static boolean method8750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static12.aBoolean9 || !Static33.aBoolean71) {
			return false;
		} else if (Static24.anInt440 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static369.anIntArrayArrayArray11[arg2][arg1][arg0];
			if (-Static337.anInt6353 == local22) {
				return false;
			} else if (Static337.anInt6353 == local22) {
				return true;
			} else if (Static473.aClass51Array2 == Static576.aClass51Array3) {
				return false;
			} else {
				@Pc(46) int local46 = arg1 << Static579.anInt9935;
				@Pc(50) int local50 = arg0 << Static579.anInt9935;
				if (Static8.method51(Static576.aClass51Array3[arg2].method7857(arg0 + 1, arg1 + 1), Static222.anInt4166 + local50 - 1, Static576.aClass51Array3[arg2].method7857(arg0 + 1, arg1), local50 + 1, local46 + 1, local46 + Static222.anInt4166 - 1, Static576.aClass51Array3[arg2].method7857(arg0, arg1), local50 + Static222.anInt4166 - 1, local46 + 1) && Static8.method51(Static576.aClass51Array3[arg2].method7857(arg0, arg1 + 1), local50 + Static222.anInt4166 - 1, Static576.aClass51Array3[arg2].method7857(arg0 + 1, arg1 + 1), local50 + 1, local46 + 1, Static222.anInt4166 + local46 - 1, Static576.aClass51Array3[arg2].method7857(arg0, arg1), local50 + 1, Static222.anInt4166 + -1 + local46)) {
					Static333.anInt6303++;
					Static369.anIntArrayArrayArray11[arg2][arg1][arg0] = Static337.anInt6353;
					return true;
				} else {
					Static369.anIntArrayArrayArray11[arg2][arg1][arg0] = -Static337.anInt6353;
					return false;
				}
			}
		}
	}
}
