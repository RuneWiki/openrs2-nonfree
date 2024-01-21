import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[S")
	public static short[] aShortArray24;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_735 = Static38.method685("rect_debug=");

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_736 = Static38.method685("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt2568 = 0;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_738 = Static38.method685("Invalid username or password)3");

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_737 = aClass6_738;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_739 = Static38.method685("(Z");

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!ai;")
	private static Class6 aClass6_741 = Static38.method685("Location");

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_740 = aClass6_741;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_742 = Static38.method685("_");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)I")
	public static int method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJ)V")
	public static void method1740(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static66.aClass2_Sub13_Sub1_2.method1455(9);
			Static66.aClass2_Sub13_Sub1_2.method1418(arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	public static int method1741() {
		return Static128.anInt2950++;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method1742() {
		aClass6_740 = null;
		aClass6_736 = null;
		aClass6_737 = null;
		aClass6_742 = null;
		aClass6_741 = null;
		aShortArray24 = null;
		aClass6_738 = null;
		aClass6_739 = null;
		aClass6_735 = null;
	}
}
