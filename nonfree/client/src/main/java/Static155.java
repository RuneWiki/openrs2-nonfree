import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public static int anInt3521;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_54 = new Class287(48, -1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V")
	public static void method2857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg0 >= Static384.anInt6641 && Static191.anInt4134 >= arg4 + arg0 && arg5 - arg0 >= Static112.anInt2687 && Static333.anInt6022 >= arg5 + arg0) {
			Static581.method7905(arg0, arg1, arg5, arg4, arg2, arg3);
		} else {
			Static58.method1409(arg4, arg2, arg0, arg1, arg5, arg3);
		}
	}
}
