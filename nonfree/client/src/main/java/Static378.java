import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!pi", name = "Gh", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(IZ)V")
	public static void method6005(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static324.anInt6094 = arg0;
		Static193.aClass7_Sub3Array1 = new Class7_Sub3[Static270.anIntArray597[Static324.anInt6094] + 1];
		Static387.anInt7356 = 0;
		Static72.anInt1748 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(IIII)Z")
	public static boolean method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static214.method3975(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static193.anInt4311;
			@Pc(14) int local14 = arg2 << Static193.anInt4311;
			return Static502.method7462(local10 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static502.method7462(local10 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static502.method7462(local10 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static316.anInt6040 - 1) && Static502.method7462(local10 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static316.anInt6040 - 1);
		} else {
			return false;
		}
	}
}
