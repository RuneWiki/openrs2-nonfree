import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static546 {

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public static int anInt9152;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_101 = new Class236(35, 3);

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_231 = new Class150(103, 6);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!kl;B)I")
	public static int method7437(@OriginalArg(0) Class174 arg0) {
		if (Static296.aClass174_9 == arg0) {
			return 6407;
		} else if (arg0 == Static189.aClass174_6) {
			return 6408;
		} else if (Static301.aClass174_10 == arg0) {
			return 6406;
		} else if (arg0 == Static517.aClass174_16) {
			return 6409;
		} else if (arg0 == Static167.aClass174_5) {
			return 6410;
		} else if (arg0 == Static475.aClass174_15) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
