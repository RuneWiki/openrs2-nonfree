import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_143 = new Class47(51, 5);

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_162 = new Class73(85, -1);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public static void method7332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static13.anInt7634 <= arg2 - arg1 && arg1 + arg2 <= Static461.anInt7899 && Static583.anInt9478 <= arg3 - arg1 && arg3 + arg1 <= Static415.anInt9494) {
			Static164.method3125(arg1, arg0, arg3, arg2);
		} else {
			Static552.method7483(arg2, arg0, arg3, arg1);
		}
	}
}
