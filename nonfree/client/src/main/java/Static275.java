import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public static int anInt5486;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "Lclient!q;")
	public static Class1_Sub2_Sub12_Sub1 aClass1_Sub2_Sub12_Sub1_2;

	@OriginalMember(owner = "client!un", name = "tb", descriptor = "Lclient!ak;")
	public static Class7 aClass7_221;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!un", name = "qb", descriptor = "[I")
	public static int[] anIntArray650 = new int[2];

	@OriginalMember(owner = "client!un", name = "Gb", descriptor = "[I")
	public static int[] anIntArray654 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BC)Z")
	public static boolean method4215(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BJ)V")
	public static void method4233(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static160.method2482(arg0 - 1L);
			Static160.method2482(1L);
		} else {
			Static160.method2482(arg0);
		}
	}
}
