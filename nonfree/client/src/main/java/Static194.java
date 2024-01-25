import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!gs", name = "A", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "Lclient!da;")
	public static Class62 aClass62_22;

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "Lclient!wu;")
	public static Class380 aClass380_126;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
	public static final int anInt9147 = 1405;

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "[B")
	public static final byte[] aByteArray102 = new byte[520];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
	public static int method7690(@OriginalArg(0) int arg0) {
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
