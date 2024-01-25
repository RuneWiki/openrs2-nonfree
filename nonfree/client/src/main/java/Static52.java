import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "Lclient!gp;")
	public static Class117 aClass117_28;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I[BB)I")
	public static int method1101(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static518.method7133(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1102(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
