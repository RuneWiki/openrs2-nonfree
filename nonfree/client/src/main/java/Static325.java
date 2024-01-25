import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "Lclient!uq;")
	public static Class251 aClass251_9;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "Lclient!lm;")
	public static Class151 aClass151_103;

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
	public static int anInt5554 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIII)V")
	public static void method4643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(11, arg2);
		local8.method1778();
		local8.anInt2056 = arg0;
		local8.anInt2055 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	public static void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1012) {
			Static13.method355(Static394.aClass200_10, arg2, arg0);
		} else if (arg1 == 1002) {
			Static13.method355(Static447.aClass200_12, arg2, arg0);
		} else if (arg1 == 1008) {
			Static13.method355(Static7.aClass200_2, arg2, arg0);
		} else if (arg1 == 1011) {
			Static13.method355(Static395.aClass200_11, arg2, arg0);
		} else if (arg1 == 1009) {
			Static13.method355(Static383.aClass200_9, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method4645(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static107.method1961(arg0);
	}
}
