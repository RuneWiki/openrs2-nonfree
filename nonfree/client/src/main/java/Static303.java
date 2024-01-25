import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_76 = new Class171(35, 12);

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_11 = new Class93(8, 0, 4, 1);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BII)V")
	public static void method4401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static499.aClass203_8 == Static227.aClass203_4) {
			if (!Static539.method6916(-2, arg0, 1, 1, 0, false, 0, arg1)) {
				Static539.method6916(-3, arg0, 1, 1, 0, false, 0, arg1);
			}
		} else if (!Static539.method6916(-3, arg0, 1, 1, 0, false, 0, arg1)) {
			Static539.method6916(-2, arg0, 1, 1, 0, false, 0, arg1);
		}
	}
}
