import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "Lclient!vo;")
	public static Class348 aClass348_52;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V")
	public static void method3648() {
		Static232.method3764();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIZIII)Z")
	public static boolean method3649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0];
		@Pc(13) int local13 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0];
		if (local8 < 0 || Static338.anInt6508 <= local8 || local13 < 0 || local13 >= Static390.anInt7654) {
			return false;
		} else if (arg7 >= 0 && Static338.anInt6508 > arg7 && arg0 >= 0 && Static390.anInt7654 > arg0) {
			@Pc(80) int local80 = Static235.method3837(Static526.aClass232Array1[Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127], arg6, arg4, arg5, local13, arg3, Static245.anIntArray276, arg0, arg7, arg1, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339(), arg2, local8, Static302.anIntArray333);
			if (local80 < 1) {
				return false;
			}
			Static384.anInt7552 = Static245.anIntArray276[local80 - 1];
			Static226.anInt4729 = Static302.anIntArray333[local80 - 1];
			Static401.aBoolean564 = false;
			Static2.method7();
			return true;
		} else {
			return false;
		}
	}
}
