import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public static int anInt6286;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	public static int anInt6277 = 0;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
	public static boolean aBoolean573 = false;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_286 = new Class22(9, 6);

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt6287 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!jn;")
	public static Class80 method4882(@OriginalArg(2) Component arg0) {
		return new Class80_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg6 >= Static354.anInt6186 && arg6 <= Static208.anInt2656 && Static354.anInt6186 <= arg4 && Static208.anInt2656 >= arg4 && Static354.anInt6186 <= arg1 && Static208.anInt2656 >= arg1 && Static354.anInt6186 <= arg0 && Static208.anInt2656 >= arg0 && anInt6287 <= arg8 && arg8 <= Static168.anInt3256 && arg2 >= anInt6287 && Static168.anInt3256 >= arg2 && anInt6287 <= arg5 && arg5 <= Static168.anInt3256 && arg3 >= anInt6287 && Static168.anInt3256 >= arg3) {
			Static82.method1468(arg8, arg7, arg3, arg2, arg5, arg0, arg4, arg6, arg1);
		} else {
			Static164.method3579(arg0, arg7, arg4, arg5, arg6, arg2, arg3, arg1, arg8);
		}
	}
}
