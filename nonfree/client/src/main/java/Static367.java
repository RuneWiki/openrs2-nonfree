import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "S")
	public static short aShort70;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_88 = new Class349(9, 3);

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt5880 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)V")
	public static void method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static249.aClass150_6 == Static174.aClass150_3) {
			if (!Static633.method8625(-2, 1, arg0, 0, 1, arg1, false, 0)) {
				Static633.method8625(-3, 1, arg0, 0, 1, arg1, false, 0);
			}
		} else if (!Static633.method8625(-3, 1, arg0, 0, 1, arg1, false, 0)) {
			Static633.method8625(-2, 1, arg0, 0, 1, arg1, false, 0);
		}
	}
}
