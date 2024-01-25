import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static646 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!ik;")
	public static Class182 aClass182_118;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!sca;")
	public static final Class335 aClass335_14 = new Class335(4);

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	public static int anInt9979 = 104;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	public static void method8497(@OriginalArg(0) int arg0) {
		Static365.aLong196 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public static boolean method8499(@OriginalArg(0) int arg0) {
		return arg0 == 18 || arg0 == 57 || arg0 == 59 || arg0 == 46 || arg0 == 5 || arg0 == 4 || arg0 == 53 || arg0 == 49 || arg0 == 13 || arg0 == 50 || arg0 == 15;
	}
}
