import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
	public static int anInt6390;

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
	public static int anInt6389 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static553.anInt9074 <= arg5 && Static249.anInt4668 >= arg0 && Static326.anInt6028 <= arg1 && arg3 <= Static80.anInt1738) {
			if (arg4 == 1) {
				Static213.method3444(arg1, arg5, arg2, arg3, arg0);
			} else {
				Static163.method2880(arg2, arg1, arg5, arg0, arg4, arg3);
			}
		} else if (arg4 == 1) {
			Static362.method5084(arg5, arg2, arg1, arg0, arg3);
		} else {
			Static480.method6783(arg5, arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
	public static boolean method5304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static110.method1655(arg1, arg0) & Static59.method959(arg0, arg1);
	}
}
