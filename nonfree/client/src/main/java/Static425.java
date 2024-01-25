import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_54 = new Class313(20);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZII)V")
	public static void method6221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static542.aClass101_4 == Static304.aClass101_1) {
			if (!Static430.method5446(arg0, 0, 0, 1, arg1, 1, -2, false)) {
				Static430.method5446(arg0, 0, 0, 1, arg1, 1, -3, false);
			}
		} else if (!Static430.method5446(arg0, 0, 0, 1, arg1, 1, -3, false)) {
			Static430.method5446(arg0, 0, 0, 1, arg1, 1, -2, false);
		}
	}
}
