import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!db;")
	public static final Class64 aClass64_230 = new Class64(31, -2);

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "[I")
	public static final int[] anIntArray441 = new int[14];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ne;I)I")
	public static int method4336(@OriginalArg(0) Class239 arg0) {
		if (arg0 == Static349.aClass239_9) {
			return 5120;
		} else if (arg0 == Static349.aClass239_10) {
			return 5122;
		} else if (arg0 == Static349.aClass239_11) {
			return 5124;
		} else if (Static349.aClass239_12 == arg0) {
			return 5121;
		} else if (Static349.aClass239_13 == arg0) {
			return 5123;
		} else if (Static349.aClass239_14 == arg0) {
			return 5125;
		} else if (Static349.aClass239_15 == arg0) {
			return 5131;
		} else if (arg0 == Static349.aClass239_16) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (Static68.anInt1306 <= arg5 && arg5 <= Static589.anInt9684 && arg4 >= Static68.anInt1306 && arg4 <= Static589.anInt9684 && Static68.anInt1306 <= arg0 && Static589.anInt9684 >= arg0 && arg6 >= Static68.anInt1306 && Static589.anInt9684 >= arg6 && arg3 >= Static252.anInt4971 && arg3 <= Static359.anInt6232 && Static252.anInt4971 <= arg8 && Static359.anInt6232 >= arg8 && Static252.anInt4971 <= arg7 && Static359.anInt6232 >= arg7 && arg1 >= Static252.anInt4971 && arg1 <= Static359.anInt6232) {
			Static371.method5571(arg6, arg5, arg2, arg3, arg1, arg7, arg8, arg0, arg4);
		} else {
			Static493.method7054(arg8, arg1, arg4, arg3, arg7, arg5, arg0, arg2, arg6);
		}
	}
}
