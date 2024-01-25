import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt787 = 104;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_19 = new Class57("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)V")
	public static void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 - arg5 >= Static221.anInt3917 && arg3 + arg5 <= Static365.anInt6140 && Static26.anInt345 <= arg2 - arg5 && Static272.anInt4750 >= arg5 + arg2) {
			Static232.method3858(arg5, arg0, arg3, arg1, arg2, arg4);
		} else {
			Static182.method2844(arg1, arg5, arg0, arg3, arg4, arg2);
		}
	}
}
