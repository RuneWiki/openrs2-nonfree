import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "Lclient!q;")
	public static Class113 aClass113_5;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!lj", name = "cb", descriptor = "Lclient!ut;")
	public static Class335 aClass335_11;

	@OriginalMember(owner = "client!lj", name = "db", descriptor = "[Lclient!mc;")
	public static Class218[] aClass218Array1;

	@OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lclient!pu;")
	public static Class270 aClass270_59;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
	public static int anInt5192 = 0;

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "Lclient!so;")
	public static final Class309 aClass309_5 = new Class309();

	@OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
	public static int anInt5197 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4223(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(13) int local13 = arg2.indexOf(arg1); local13 != -1; local13 = arg2.indexOf(arg1, local13 + arg0.length())) {
			arg2 = arg2.substring(0, local13) + arg0 + arg2.substring(arg1.length() + local13);
		}
		return arg2;
	}
}
