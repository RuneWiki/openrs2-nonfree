import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static346 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject9 = null;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	public static int anInt5281 = 1;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!oaa;I)Z")
	public static boolean method4666(@OriginalArg(0) Class259 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean514) {
			return false;
		} else if (!arg0.method5863(Static154.anInterface4_2)) {
			return false;
		} else if (Static330.aClass66_24.method1994((long) arg0.anInt6659) == null) {
			return Static287.aClass66_21.method1994((long) arg0.anInt6670) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)J")
	public static long method4668() {
		return Static572.aClass41_1.method6918();
	}
}
