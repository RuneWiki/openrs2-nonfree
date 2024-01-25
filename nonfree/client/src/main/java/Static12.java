import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "Lclient!xa;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	public static int anInt559 = 0;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_4 = new Class181(62, -1);

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
	public static int method634(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
