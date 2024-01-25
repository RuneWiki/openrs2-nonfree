import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!bi;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_10 = new Class200("", 10);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method5261(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0];
		@Pc(13) int local13 = Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0];
		if (local8 < 0 || Static195.anInt3537 <= local8 || local13 < 0 || Static118.anInt2419 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static195.anInt3537 > arg6 && arg0 >= 0 && Static118.anInt2419 > arg0) {
			@Pc(79) int local79 = Static210.method3331(Static452.aClass31_Sub2_Sub1_Sub1_2.method5989(), Static295.anIntArray443, arg6, arg5, arg0, arg7, Static125.aClass188Array1[Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100], arg4, local13, arg3, arg1, Static119.anIntArray65, arg2, local8);
			if (local79 < 1) {
				return false;
			}
			Static414.anInt6715 = Static295.anIntArray443[local79 - 1];
			Static207.anInt3927 = Static119.anIntArray65[local79 - 1];
			Static229.aBoolean295 = false;
			Static246.method4273();
			return true;
		} else {
			return false;
		}
	}
}
