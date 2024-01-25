import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
	public static int anInt3903 = 0;

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "[Lclient!va;")
	public static final Class5_Sub2_Sub20[] aClass5_Sub2_Sub20Array1 = new Class5_Sub2_Sub20[14];

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method3447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0];
		@Pc(18) int local18 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0];
		if (local13 < 0 || local13 >= Static124.anInt2150 || local18 < 0 || Static64.anInt1015 <= local18) {
			return false;
		} else if (arg1 >= 0 && Static124.anInt2150 > arg1 && arg7 >= 0 && arg7 < Static64.anInt1015) {
			@Pc(80) int local80 = Static170.method2525(arg1, arg0, arg6, local13, arg4, Static137.aClass234Array1[Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149], Static273.anIntArray256, arg2, arg5, arg3, Static502.anIntArray465, local18, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917(), arg7);
			if (local80 < 1) {
				return false;
			}
			Static443.anInt7790 = Static273.anIntArray256[local80 - 1];
			Static154.anInt2536 = Static502.anIntArray465[local80 - 1];
			Static390.aBoolean744 = false;
			Static394.method5730();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)I")
	public static int method3454(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static634.anInt10113;
		if (local5 == 0) {
			return arg0 ? 0 : Static435.anInt7679;
		} else if (local5 == 1) {
			return Static435.anInt7679;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
