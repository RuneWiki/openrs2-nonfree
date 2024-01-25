import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static595 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Z")
	public static boolean aBoolean786 = false;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!qt;I)I")
	public static int method8339(@OriginalArg(0) Class294 arg0) {
		if (Static256.aClass294_4 == arg0) {
			return 5890;
		} else if (Static18.aClass294_1 == arg0) {
			return 34167;
		} else if (Static131.aClass294_2 == arg0) {
			return 34168;
		} else if (Static645.aClass294_5 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
