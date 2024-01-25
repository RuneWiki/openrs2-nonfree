import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public static int anInt874;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
	public static final int[] anIntArray22 = new int[5];

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!nb;")
	public static Class217 aClass217_1 = null;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public static int anInt872 = -1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)I")
	public static int method812(@OriginalArg(1) int arg0) {
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
