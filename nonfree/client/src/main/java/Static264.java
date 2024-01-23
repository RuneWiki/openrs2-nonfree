import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
	public static int anInt5577;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!ok;")
	public static Class125 aClass125_53 = new Class125(64);

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray82 = new String[100];

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method4221() {
		Static170.aClass61_29.method1379();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
	public static void method4228(@OriginalArg(0) boolean arg0) {
		if (Static53.aBoolean84 != arg0) {
			Static53.aBoolean84 = arg0;
			Static299.method4327();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BII)I")
	public static int method4229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
