import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_3 = new Class25(20, -1);

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_5 = new Class231("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	public static int anInt156 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public static int method121(@OriginalArg(1) int arg0) {
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
