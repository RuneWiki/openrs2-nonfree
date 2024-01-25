import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!je", name = "u", descriptor = "[[[Lclient!br;")
	public static Class37[][][] aClass37ArrayArrayArray2;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public static int anInt4353 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
	public static void method3801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static300.aClass5_Sub28_Sub1_1.anInt4871 != 0 && arg3 != 0 && Static469.anInt8085 < 50 && arg0 != -1) {
			Static310.aClass217Array1[Static469.anInt8085++] = new Class217((byte) 2, arg0, arg3, arg1, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Z")
	public static boolean method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static405.method5869(arg1, arg0) | (arg0 & 0x70000) != 0 || Static523.method7171(arg0, arg1);
	}
}
