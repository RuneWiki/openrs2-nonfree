import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_61 = new Class150(40, 2);

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public static int anInt2497 = 0;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "J")
	public static long aLong83 = -1L;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!co;Z)Ljava/lang/String;")
	public static String method2243(@OriginalArg(0) Class5_Sub3 arg0) {
		return Static126.method6807(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IFFFI)F")
	public static float method2244(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static208.aFloatArrayArray10[arg0];
		return local12[2] * arg1 + arg2 * local12[0] + local12[1] * arg3;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z")
	public static boolean method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static523.method7168(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static270.anInt5288;
			@Pc(14) int local14 = arg2 << Static270.anInt5288;
			return Static118.method2275(local10 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static118.method2275(local10 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static118.method2275(local10 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static58.anInt1202 - 1) && Static118.method2275(local10 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static58.anInt1202 - 1);
		} else {
			return false;
		}
	}
}
