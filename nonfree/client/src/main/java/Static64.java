import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_19 = new Class67("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIZI)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static62.method7109(arg0)) {
			Static176.method3399(arg1, arg3, Static459.aClass245ArrayArray2[arg0], -1, arg2);
		}
	}
}
