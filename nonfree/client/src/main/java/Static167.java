import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ha;")
	public static Class87 aClass87_3;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Z")
	public static boolean aBoolean310 = true;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method3079(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static211.method6034(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)Z")
	public static boolean method3081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
