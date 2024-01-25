import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Z")
	public static boolean aBoolean202;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_21 = new Class210();

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
	public static int anInt2699 = 0;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_76 = new Class41(44, 15);

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "[Lclient!ks;")
	public static final Class106_Sub1[] aClass106_Sub1Array2 = new Class106_Sub1[29];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBIIIIII)V")
	public static void method2525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static332.anInt5823 <= arg4 && arg5 <= Static202.anInt3722 && arg2 >= Static313.anInt5542 && Static345.anInt6084 >= arg6) {
			Static290.method4419(arg0, arg5, arg3, arg4, arg2, arg1, arg6);
		} else {
			Static319.method4936(arg2, arg1, arg5, arg4, arg3, arg6, arg0);
		}
	}
}
