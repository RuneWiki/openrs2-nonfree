import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_96 = new Class235(49, -2);

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "[I")
	public static final int[] anIntArray231 = new int[50];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg1) {
			Static123.method1923(arg5, arg2, arg3, arg6, arg4, arg0);
		} else if (arg5 - arg6 >= Static270.anInt4759 && Static162.anInt2935 >= arg6 + arg5 && arg3 - arg1 >= Static514.anInt8722 && arg1 + arg3 <= Static451.anInt7775) {
			Static484.method6555(arg0, arg4, arg2, arg3, arg1, arg5, arg6);
		} else {
			Static245.method3671(arg0, arg5, arg1, arg4, arg6, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public static void method2189() {
		if (Static521.aClass163_1 != null) {
			Static521.aClass163_1.method3468();
		}
		if (Static484.aThread7 == null) {
			return;
		}
		while (true) {
			try {
				Static484.aThread7.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}
}
