import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public static int anInt1588;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public static int anInt1580 = 1;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public static int anInt1582 = 1;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_693 = Static51.method932("K");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_692 = aClass10_693;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static volatile int anInt1586 = 0;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_694 = Static51.method932("Texturen geladen)3");

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_695 = null;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_696 = aClass10_693;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "I")
	public static int anInt1597 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
	public static int method1131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg0;
			arg0 = local10;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 7 + 1 - arg2 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1133() {
		aClass10_696 = null;
		aClass10_692 = null;
		aClass10_694 = null;
		aClass10_693 = null;
		aClass10_695 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
	public static int method1137(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
