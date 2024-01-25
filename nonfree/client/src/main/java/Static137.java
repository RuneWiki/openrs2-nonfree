import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "[[Lclient!je;")
	public static Class117[][] aClass117ArrayArray1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_84 = new Class48(80, 3);

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public static int anInt2555 = -1;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!at;")
	public static final Class17 aClass17_23 = new Class17();

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public static int anInt2561 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method2032(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, arg0.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(arg2.length() + local14);
		}
		return arg1;
	}
}
