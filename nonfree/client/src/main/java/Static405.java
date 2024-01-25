import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	public static int anInt7545;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!up;Z)I")
	public static int method6680(@OriginalArg(0) Class362 arg0) {
		if (Static147.aClass362_51 == arg0) {
			return 9216;
		} else if (arg0 == Static434.aClass362_93) {
			return 34065;
		} else if (arg0 == Static610.aClass362_153) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
