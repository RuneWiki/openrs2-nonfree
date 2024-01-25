import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	public static int anInt1770;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!df;")
	public static final Class73 aClass73_1 = new Class73(0, 3, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!df;")
	public static final Class73 aClass73_2 = new Class73(1, 3, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!df;")
	public static final Class73 aClass73_3 = new Class73(2, 4, Static18.aClass19_4);

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!df;")
	public static final Class73 aClass73_4 = new Class73(3, 1, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!df;")
	public static final Class73 aClass73_5 = new Class73(4, 2, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!df;")
	public static final Class73 aClass73_6 = new Class73(5, 3, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!df;")
	public static final Class73 aClass73_7 = new Class73(6, 4, Static18.aClass19_8);

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static final int anInt1769 = Static220.method3803(16);

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lclient!df;")
	public static Class73 method1699(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass73_1;
		} else if (arg0 == 1) {
			return aClass73_2;
		} else if (arg0 == 2) {
			return aClass73_3;
		} else if (arg0 == 3) {
			return aClass73_4;
		} else if (arg0 == 4) {
			return aClass73_5;
		} else if (arg0 == 5) {
			return aClass73_6;
		} else if (arg0 == 6) {
			return aClass73_7;
		} else {
			return null;
		}
	}
}
