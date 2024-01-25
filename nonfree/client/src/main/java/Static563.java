import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!fg;")
	public static Class108 aClass108_8;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "Lclient!cba;")
	public static Class45 aClass45_4;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIZIBI)Z")
	public static boolean method7723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0];
		@Pc(13) int local13 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0];
		if (local8 < 0 || Static228.anInt3704 <= local8 || local13 < 0 || Static162.anInt2911 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static228.anInt3704 > arg6 && arg2 >= 0 && Static162.anInt2911 > arg2) {
			@Pc(70) int local70 = Static183.method2679(arg7, Static210.anIntArray231, Static75.anIntArray107, arg3, arg6, arg5, Static230.aClass240Array1[Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127], arg0, local8, arg1, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950(), arg2, local13, arg4);
			if (local70 < 1) {
				return false;
			}
			Static621.anInt9980 = Static75.anIntArray107[local70 - 1];
			Static507.anInt8466 = Static210.anIntArray231[local70 - 1];
			Static643.aBoolean747 = false;
			Static46.method751();
			return true;
		} else {
			return false;
		}
	}
}
