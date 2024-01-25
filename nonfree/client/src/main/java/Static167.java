import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZBIIIII)Z")
	public static boolean method3514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0];
		@Pc(18) int local18 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0];
		if (local13 < 0 || local13 >= Static394.anInt7540 || local18 < 0 || local18 >= Static462.anInt8391) {
			return false;
		} else if (arg7 >= 0 && Static394.anInt7540 > arg7 && arg5 >= 0 && Static462.anInt8391 > arg5) {
			@Pc(87) int local87 = Static392.method6267(Static334.aClass291Array20[Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128], arg6, local13, arg3, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308(), Static420.anIntArray483, local18, arg5, arg4, arg7, arg0, arg2, Static105.anIntArray116, arg1);
			if (local87 < 1) {
				return false;
			}
			Static326.anInt6537 = Static105.anIntArray116[local87 - 1];
			Static29.anInt565 = Static420.anIntArray483[local87 - 1];
			Static160.aBoolean329 = false;
			Static159.method3385();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBI)V")
	public static void method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378() != 0 && arg3 != 0 && Static224.anInt5125 < 50 && arg1 != -1) {
			Static620.aClass208Array1[Static224.anInt5125++] = new Class208((byte) 1, arg1, arg3, arg4, arg0, 0, arg2, null);
		}
	}
}
