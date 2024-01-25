import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static383 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "Lclient!nc;")
	public static Class233 aClass233_150;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "Lclient!uu;")
	public static Class343 aClass343_273;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public static int anInt10301 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!iv;I)I")
	public static int method8680(@OriginalArg(0) Class168 arg0) {
		if (Static361.aClass168_7 == arg0) {
			return 6407;
		} else if (arg0 == Static95.aClass168_2) {
			return 6408;
		} else if (Static491.aClass168_11 == arg0) {
			return 6406;
		} else if (Static480.aClass168_10 == arg0) {
			return 6409;
		} else if (Static168.aClass168_3 == arg0) {
			return 6410;
		} else if (arg0 == Static66.aClass168_1) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
