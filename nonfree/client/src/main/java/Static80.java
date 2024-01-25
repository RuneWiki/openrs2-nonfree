import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!jj;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public static int anInt1302 = 0;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1257(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg2); local14 != -1; local14 = arg0.indexOf(arg2, arg1.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg1 + arg0.substring(arg2.length() + local14);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)Z")
	public static boolean method1260(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
