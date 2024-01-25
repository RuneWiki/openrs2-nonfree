import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "Lclient!im;")
	public static Class147 aClass147_4;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!op", name = "N", descriptor = "I")
	public static int anInt6386 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5421(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, arg1.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(arg0.length() + local14);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I")
	public static int method5422(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static547.method7826(arg0);
	}
}
