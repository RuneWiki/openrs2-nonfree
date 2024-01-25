import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "[[[Lclient!ds;")
	public static Class84[][][] aClass84ArrayArrayArray6;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	public static int anInt8606 = 0;

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "Lclient!eha;")
	public static final Class97 aClass97_14 = new Class97();

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
	public static int anInt8615 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLclient!bp;)I")
	public static int method7423(@OriginalArg(1) Class43 arg0) {
		if (arg0 == Static338.aClass43_3) {
			return 5890;
		} else if (arg0 == Static23.aClass43_1) {
			return 34167;
		} else if (Static287.aClass43_8 == arg0) {
			return 34168;
		} else if (Static470.aClass43_5 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
