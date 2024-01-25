import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "Lclient!pf;")
	public static final Class279 aClass279_2 = new Class279();

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
	public static int anInt626 = -1;

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
	public static int anInt627 = 0;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Lclient!in;")
	public static final Class169 aClass169_23 = new Class169(11, 2);

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_4 = new Class271();

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)I")
	public static int method624(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
