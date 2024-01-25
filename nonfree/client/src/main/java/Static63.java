import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!uu;")
	public static Class239 aClass239_1;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!sca;")
	public static final Class314 aClass314_1 = new Class314(1);

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_19 = new Class180(55, -2);

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt1267 = 0;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1308(@OriginalArg(1) String arg0) {
		return Static81.method1580(10, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!ln;)I")
	public static int method1309(@OriginalArg(1) Class203 arg0) {
		if (arg0 == Static265.aClass203_3) {
			return 7681;
		} else if (Static580.aClass203_4 == arg0) {
			return 8448;
		} else if (arg0 == Static582.aClass203_5) {
			return 34165;
		} else if (Static191.aClass203_2 == arg0) {
			return 260;
		} else if (arg0 == Static152.aClass203_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
