import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_18 = new Class160(47, 10);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	public static boolean method806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static148.method2180(arg1, arg0) & Static43.method710(arg0, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!pj;)I")
	public static int method809(@OriginalArg(1) Class287 arg0) {
		if (arg0 == Static284.aClass287_1) {
			return 7681;
		} else if (Static345.aClass287_2 == arg0) {
			return 8448;
		} else if (arg0 == Static448.aClass287_4) {
			return 34165;
		} else if (arg0 == Static408.aClass287_3) {
			return 260;
		} else if (Static650.aClass287_5 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
