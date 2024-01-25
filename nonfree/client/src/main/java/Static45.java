import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "Lclient!rh;")
	public static Class308 aClass308_1;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_1 = new Class37(0, 3, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_2 = new Class37(1, 3, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_3 = new Class37(2, 4, Static553.aClass330_14);

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_4 = new Class37(3, 1, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "k", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_5 = new Class37(4, 2, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_6 = new Class37(5, 3, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "Lclient!bha;")
	public static final Class37 aClass37_7 = new Class37(6, 4, Static553.aClass330_18);

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
	public static final int anInt1238 = Static289.method7950(16);

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_17 = new Class126(12, -2);

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)Lclient!bha;")
	public static Class37 method1239(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass37_1;
		} else if (arg0 == 1) {
			return aClass37_2;
		} else if (arg0 == 2) {
			return aClass37_3;
		} else if (arg0 == 3) {
			return aClass37_4;
		} else if (arg0 == 4) {
			return aClass37_5;
		} else if (arg0 == 5) {
			return aClass37_6;
		} else if (arg0 == 6) {
			return aClass37_7;
		} else {
			return null;
		}
	}
}
