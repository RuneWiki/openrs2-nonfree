import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "J")
	public static long aLong28;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!qea;")
	public static Class3_Sub41 aClass3_Sub41_3;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_16 = new Class194(46, 6);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public static int anInt482 = -2;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jo;Z)Z")
	public static boolean method455(@OriginalArg(0) Class179 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean389) {
			return false;
		} else if (!arg0.method4532(Static598.anInterface16_2)) {
			return false;
		} else if (Static347.aClass25_26.method426((long) arg0.anInt5341) == null) {
			return Static618.aClass25_47.method426((long) arg0.anInt5334) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBIIII)V")
	public static void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg1) {
			Static12.method219(arg4, arg6, arg0, arg2, arg5, arg1);
		} else if (Static474.anInt8118 <= arg5 - arg1 && Static576.anInt9425 >= arg5 + arg1 && Static298.anInt5919 <= arg2 - arg3 && Static596.anInt9703 >= arg2 + arg3) {
			Static360.method5784(arg3, arg2, arg6, arg4, arg5, arg0, arg1);
		} else {
			Static320.method7571(arg5, arg4, arg3, arg6, arg2, arg1, arg0);
		}
	}
}
