import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[Lclient!uu;")
	public static Class247[] aClass247Array1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
	public static final byte[] aByteArray37 = new byte[520];

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Lclient!hu;")
	public static Class100 aClass100_1 = new Class100(8);

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[S")
	public static short[] aShortArray97 = new short[256];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0];
		@Pc(13) int local13 = Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0];
		if (local8 < 0 || Static326.anInt5666 <= local8 || local13 < 0 || local13 >= Static283.anInt5187) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static326.anInt5666 && arg1 >= 0 && arg1 < Static283.anInt5187) {
			@Pc(82) int local82 = Static6.method49(Static175.aClass213Array1[Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82], local8, arg2, arg5, arg1, Static1.aClass16_Sub1_Sub5_Sub1_1.method4751(), arg6, Static33.anIntArray36, arg0, arg4, Static392.anIntArray498, local13, arg3, arg7);
			if (local82 < 1) {
				return false;
			}
			Static343.anInt771 = Static392.anIntArray498[local82 - 1];
			Static60.anInt1094 = Static33.anIntArray36[local82 - 1];
			Static350.aBoolean556 = false;
			Static75.method1365();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIBII)V")
	public static void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= Static354.anInt6186 && Static208.anInt2656 >= arg0 && Static376.anInt6287 <= arg5 && Static168.anInt3256 >= arg3) {
			if (arg2 == 1) {
				Static450.method5663(arg3, arg0, arg5, arg1, arg4);
			} else {
				Static94.method1653(arg3, arg4, arg1, arg0, arg2, arg5);
			}
		} else if (arg2 == 1) {
			Static375.method5001(arg0, arg3, arg1, arg5, arg4);
		} else {
			Static439.method5548(arg5, arg1, arg4, arg0, arg2, arg3);
		}
	}
}
