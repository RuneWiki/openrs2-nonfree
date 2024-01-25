import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!lc;)I")
	public static int method4418(@OriginalArg(1) Class219 arg0) {
		if (arg0 == Static321.aClass219_5) {
			return 9216;
		} else if (arg0 == Static261.aClass219_4) {
			return 34065;
		} else if (arg0 == Static630.aClass219_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
