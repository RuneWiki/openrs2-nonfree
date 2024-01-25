import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "[I")
	public static final int[] anIntArray269 = new int[250];

	@OriginalMember(owner = "client!ida", name = "A", descriptor = "Lclient!mb;")
	public static final Class220 aClass220_4 = new Class220();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)I")
	public static int method2730(@OriginalArg(1) int arg0) {
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
