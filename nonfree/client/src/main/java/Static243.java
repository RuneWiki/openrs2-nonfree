import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!rl;")
	public static Class7_Sub8_Sub3 aClass7_Sub8_Sub3_3;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt4160 = 0;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_85 = new Class253(75, 0);

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3292(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, local9 + arg2.length())) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(arg0.length() + local9);
		}
		return arg1;
	}
}
