import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt1510;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public static int anInt1515;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!qs;")
	public static Class211 aClass211_17;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIBZII)Z")
	public static boolean method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0];
		@Pc(13) int local13 = Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0];
		if (local8 < 0 || local8 >= Static209.anInt4283 || local13 < 0 || Static211.anInt4295 <= local13) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static209.anInt4283 && arg3 >= 0 && arg3 < Static211.anInt4295) {
			@Pc(79) int local79 = Static267.method3957(arg4, arg3, arg1, arg2, Static114.anIntArray278, Static19.aClass120Array1[Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102], local8, local13, arg0, Static429.aClass30_Sub1_Sub1_Sub2_2.method944(), arg7, arg5, Static313.anIntArray547, arg6);
			if (local79 < 1) {
				return false;
			}
			Static270.anInt5251 = Static114.anIntArray278[local79 - 1];
			Static57.anInt1519 = Static313.anIntArray547[local79 - 1];
			Static110.aBoolean473 = false;
			Static283.method4168();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
	public static boolean method1069(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}
}
