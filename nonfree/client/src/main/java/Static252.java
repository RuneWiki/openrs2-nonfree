import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ku;)I")
	public static int method3907(@OriginalArg(1) Class199 arg0) {
		if (arg0 == Static133.aClass199_2) {
			return 9216;
		} else if (Static424.aClass199_4 == arg0) {
			return 34065;
		} else if (Static559.aClass199_5 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
