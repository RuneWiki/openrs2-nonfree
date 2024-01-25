import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static517 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public static int anInt8764;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "F")
	public static float aFloat357;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_17 = new Class212(1, 2);

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_91 = new Class236(43, -1);

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_219 = new Class150(22, 3);

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_16 = new Class174(1);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!fm;I)Z")
	public static boolean method7111(@OriginalArg(0) Class101 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean188) {
			return false;
		} else if (!arg0.method2603(Static245.anInterface7_2)) {
			return false;
		} else if (Static142.aClass42_9.method1109((long) arg0.anInt2859) == null) {
			return Static445.aClass42_33.method1109((long) arg0.anInt2886) == null;
		} else {
			return false;
		}
	}
}
