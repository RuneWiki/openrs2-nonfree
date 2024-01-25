import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
	public static int anInt3843;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_1 = new Class131(0, 3, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_2 = new Class131(1, 3, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_3 = new Class131(2, 4, Static637.aClass376_16);

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_4 = new Class131(3, 1, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_5 = new Class131(4, 2, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_6 = new Class131(5, 3, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!gv;")
	public static final Class131 aClass131_7 = new Class131(6, 4, Static637.aClass376_20);

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	public static final int anInt3842 = Static636.method8709(16);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Lclient!gv;")
	public static Class131 method3398(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass131_1;
		} else if (arg0 == 1) {
			return aClass131_2;
		} else if (arg0 == 2) {
			return aClass131_3;
		} else if (arg0 == 3) {
			return aClass131_4;
		} else if (arg0 == 4) {
			return aClass131_5;
		} else if (arg0 == 5) {
			return aClass131_6;
		} else if (arg0 == 6) {
			return aClass131_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)Z")
	public static boolean method3399(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z")
	public static boolean method3401(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
