import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ss", name = "dd", descriptor = "I")
	public static int anInt6428 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([[II)V")
	public static void method5128(@OriginalArg(0) int[][] arg0) {
		Static59.anIntArrayArray34 = arg0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static223.anIntArrayArrayArray10[arg0][local16][local20] == -Static48.anInt907) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static139.anInt2355) + 1;
			@Pc(142) int local142 = (arg3 << Static139.anInt2355) + 2;
			@Pc(151) int local151 = Static92.aClass136Array1[arg0].I(arg1, arg3) + arg5;
			if (!Static64.method1127(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static139.anInt2355) - 1;
			if (!Static64.method1127(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static139.anInt2355) - 1;
			if (!Static64.method1127(local20, local151, local177)) {
				return false;
			} else if (Static64.method1127(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static97.method1525(arg0, arg1, arg3)) {
			local16 = arg1 << Static139.anInt2355;
			local20 = arg3 << Static139.anInt2355;
			return Static64.method1127(local16 + 1, Static92.aClass136Array1[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static64.method1127(local16 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static64.method1127(local16 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static337.anInt7424 - 1) && Static64.method1127(local16 + 1, Static92.aClass136Array1[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static337.anInt7424 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!ss;Lclient!qa;)V")
	public static void method5131(@OriginalArg(1) Class219 arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(36) boolean local36 = Static196.aClass139_1.method3234(arg0.anInt6374, arg0.anInt6421, arg0.aBoolean421 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null, arg0.anInt6403, arg0.anInt6389, arg1, arg0.anInt6405 | 0xFF000000) == null;
		if (local36) {
			Static242.aClass266_36.method5998(new Class1_Sub30(arg0.anInt6421, arg0.anInt6374, arg0.anInt6403, arg0.anInt6405 | 0xFF000000, arg0.anInt6389, arg0.aBoolean421));
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V")
	public static void method5136(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static381.anInt5294 = arg0;
	}
}
