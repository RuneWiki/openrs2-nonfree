import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!ti;")
	public static Class256 aClass256_8;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!fn;")
	public static final Class103 aClass103_13 = new Class103();

	@OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
	public static final int[] anIntArray371 = new int[6];

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!mt;")
	public static final Class220 aClass220_14 = new Class220();

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)I")
	public static int method4939(@OriginalArg(0) int arg0) {
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
