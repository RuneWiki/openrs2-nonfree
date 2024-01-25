import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static656 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(CI)Z")
	public static boolean method9007(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!tfa;)I")
	public static int method9008(@OriginalArg(1) Class352 arg0) {
		if (Static231.aClass352_5 == arg0) {
			return 5890;
		} else if (arg0 == Static150.aClass352_4) {
			return 34167;
		} else if (Static240.aClass352_6 == arg0) {
			return 34168;
		} else if (Static45.aClass352_1 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
