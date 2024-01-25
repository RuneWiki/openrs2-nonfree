import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!sd;")
	public static Class266 aClass266_2;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public static int anInt8330;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "[I")
	public static final int[] anIntArray652 = new int[8];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lclient!bo;")
	public static Class35_Sub1 method6705() {
		Static544.anInt2286 = 0;
		return Static112.method2221();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method6709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static398.anInt7144 <= arg6 && arg6 <= Static71.anInt4958 && arg3 >= Static398.anInt7144 && Static71.anInt4958 >= arg3 && Static398.anInt7144 <= arg2 && Static71.anInt4958 >= arg2 && arg7 >= Static398.anInt7144 && Static71.anInt4958 >= arg7 && arg0 >= Static4.anInt6709 && arg0 <= Static492.anInt8451 && Static4.anInt6709 <= arg1 && arg1 <= Static492.anInt8451 && arg5 >= Static4.anInt6709 && arg5 <= Static492.anInt8451 && Static4.anInt6709 <= arg4 && arg4 <= Static492.anInt8451) {
			Static348.method5411(arg0, arg7, arg8, arg6, arg2, arg1, arg4, arg3, arg5);
		} else {
			Static425.method6097(arg6, arg3, arg1, arg5, arg7, arg0, arg4, arg2, arg8);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BIIB)[B")
	public static byte[] method6714(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(20) byte[] local20 = new byte[32768];
		Static553.method2534(arg0, arg1, local20, 0, 32768);
		return local20;
	}
}
