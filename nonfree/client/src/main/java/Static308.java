import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array8;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	public static void method4619() {
		Static227.aClass73_16 = null;
		Static492.aClass73_38 = null;
		Static118.aClass73_7 = null;
		Static127.aClass73_8 = null;
		Static115.aClass73_5 = null;
		Static51.aClass73_33 = null;
		Static147.aClass73Array5 = null;
		Static355.aClass73_34 = null;
		Static172.aClass73_14 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)B")
	public static byte method4627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
