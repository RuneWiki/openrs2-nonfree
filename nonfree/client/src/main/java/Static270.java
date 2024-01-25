import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "Lclient!mr;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
	public static int anInt5118 = -2;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V")
	public static void method4435() {
		if (Static305.aBoolean409) {
			Static136.aClass2_17 = null;
			Static305.aBoolean409 = false;
			Static146.aClass2_18 = null;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 >= Static358.anInt8908 && Static216.anInt4203 >= arg2 && Static99.anInt1988 <= arg4 && arg3 <= Static205.anInt4042) {
			Static144.method2329(arg5, arg6, arg3, arg1, arg0, arg2, arg4);
		} else {
			Static276.method7424(arg1, arg6, arg5, arg0, arg4, arg2, arg3);
		}
	}
}
