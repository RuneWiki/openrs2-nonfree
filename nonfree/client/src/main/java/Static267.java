import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "Lclient!hba;")
	public static Class115 aClass115_2;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "[I")
	public static final int[] anIntArray255 = new int[50];

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	public static int anInt5761 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIII)Z")
	public static boolean method4826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static211.aBoolean331 || !Static260.aBoolean441) {
			return false;
		} else if (Static8.anInt519 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static483.anIntArrayArrayArray14[arg0][arg2][arg1];
			if (local22 == -Static608.anInt10289) {
				return false;
			} else if (Static608.anInt10289 == local22) {
				return true;
			} else if (Static148.aClass245Array1 == Static152.aClass245Array3) {
				return false;
			} else {
				@Pc(54) int local54 = arg2 << Static606.anInt10280;
				@Pc(58) int local58 = arg1 << Static606.anInt10280;
				if (Static447.method6818(Static148.aClass245Array1[arg0].method7583(arg1 + 1, arg2 + 1), local54 + 1, local58 - -1, Static148.aClass245Array1[arg0].method7583(arg1, arg2), local58 + Static190.anInt4138 - 1, Static148.aClass245Array1[arg0].method7583(arg1 + 1, arg2), local58 + Static190.anInt4138 - 1, Static190.anInt4138 + local54 + -1, local54 + 1) && Static447.method6818(Static148.aClass245Array1[arg0].method7583(arg1, arg2 + 1), Static190.anInt4138 + local54 - 1, local58 + 1, Static148.aClass245Array1[arg0].method7583(arg1, arg2), Static190.anInt4138 + local58 - 1, Static148.aClass245Array1[arg0].method7583(arg1 + 1, arg2 - -1), local58 + 1, local54 - -Static190.anInt4138 + -1, local54 + 1)) {
					Static525.anInt9175++;
					Static483.anIntArrayArrayArray14[arg0][arg2][arg1] = Static608.anInt10289;
					return true;
				} else {
					Static483.anIntArrayArrayArray14[arg0][arg2][arg1] = -Static608.anInt10289;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B[[I)V")
	public static void method4827(@OriginalArg(1) int[][] arg0) {
		Static173.anIntArrayArray15 = arg0;
	}
}
