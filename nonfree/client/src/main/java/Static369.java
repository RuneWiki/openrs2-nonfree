import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
	public static void method5536(@OriginalArg(1) int arg0) {
		Static579.aLong295 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public static boolean method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static646.method9071(arg0, arg1) || Static190.method2832(-1, arg0, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method5538(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0];
		@Pc(13) int local13 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0];
		if (local8 < 0 || local8 >= Static380.anInt6689 || local13 < 0 || local13 >= Static542.anInt9214) {
			return false;
		} else if (arg7 >= 0 && Static380.anInt6689 > arg7 && arg0 >= 0 && arg0 < Static542.anInt9214) {
			@Pc(99) int local99 = Static686.method9454(arg6, Static40.aClass289Array1[Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146], Static310.anIntArray306, arg2, local8, arg4, Static684.anIntArray600, local13, arg1, arg3, arg7, arg5, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0), arg0);
			if (local99 < 1) {
				return false;
			}
			Static60.anInt998 = Static684.anIntArray600[local99 - 1];
			Static605.anInt7003 = Static310.anIntArray306[local99 - 1];
			Static483.aBoolean590 = false;
			Static428.method6435();
			return true;
		} else {
			return false;
		}
	}
}
