import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public static int anInt3565;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!efa;")
	public static Class89 aClass89_3;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!ip;)I")
	public static int method3060(@OriginalArg(1) Class165 arg0) {
		if (arg0 == Static527.aClass165_4) {
			return 5890;
		} else if (Static309.aClass165_2 == arg0) {
			return 34167;
		} else if (Static430.aClass165_3 == arg0) {
			return 34168;
		} else if (arg0 == Static302.aClass165_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
