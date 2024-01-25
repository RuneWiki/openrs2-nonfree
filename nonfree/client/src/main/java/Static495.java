import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static495 {

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray59;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "Lclient!h;")
	public static final Class125 aClass125_63 = new Class125(20);

	@OriginalMember(owner = "client!um", name = "w", descriptor = "I")
	public static final int anInt8946 = 1339;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(III)Z")
	public static boolean method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static440.method6681(arg1, arg0) || Static43.method849(arg0, arg1);
	}
}
