import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!ke;")
	public static Class43 aClass43_43;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	public static int anInt4465 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method2948() {
		aClass43_43 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ke;II)Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 method2949(@OriginalArg(1) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static152.method2595(arg1, arg2, arg0) ? Static131.method2906() : null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method2950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static40.method798(arg0)) {
			Static145.method2445(Static125.aClass66ArrayArray1[arg0], arg1);
		}
	}
}
