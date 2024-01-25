import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!ql;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public static int anInt2943;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "Lclient!e;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "[I")
	public static final int[] anIntArray162 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
	public static int anInt2949 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static271.anInt4271 <= arg0 && arg0 <= Static13.anInt263 && Static271.anInt4271 <= arg2 && arg2 <= Static13.anInt263 && arg6 >= Static271.anInt4271 && Static13.anInt263 >= arg6 && arg5 >= Static271.anInt4271 && arg5 <= Static13.anInt263 && Static74.anInt1413 <= arg8 && Static149.anInt7384 >= arg8 && arg4 >= Static74.anInt1413 && Static149.anInt7384 >= arg4 && Static74.anInt1413 <= arg7 && arg7 <= Static149.anInt7384 && arg1 >= Static74.anInt1413 && Static149.anInt7384 >= arg1) {
			Static325.method4178(arg0, arg1, arg3, arg6, arg4, arg8, arg2, arg5, arg7);
		} else {
			Static316.method4086(arg1, arg8, arg3, arg2, arg4, arg0, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[BI)I")
	public static int method2410(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static12.method186(0, arg1, arg0);
	}
}
