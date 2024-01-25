import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[[[Lclient!gn;")
	public static Class125[][][] aClass125ArrayArrayArray1;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_44 = new Class230(45, 3);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_52 = new Class276(17, 6);

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_53 = new Class276(74, -2);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
	public static int method3300(@OriginalArg(0) int arg0) {
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
