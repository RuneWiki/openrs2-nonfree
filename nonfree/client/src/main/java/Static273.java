import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Lclient!ha;")
	public static Class20 aClass20_8;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
	public static boolean method4995(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ii;I)Z")
	public static boolean method5008(@OriginalArg(0) Class153 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean385) {
			return false;
		} else if (!arg0.method4493(Static303.anInterface6_2)) {
			return false;
		} else if (Static409.aClass99_56.method3056((long) arg0.anInt5227) == null) {
			return Static83.aClass99_21.method3056((long) arg0.anInt5239) == null;
		} else {
			return false;
		}
	}
}
