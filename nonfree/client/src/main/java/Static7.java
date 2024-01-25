import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	public static int anInt112 = 1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)Lclient!cw;")
	public static Class46 method93() {
		try {
			return (Class46) Class.forName("Class46_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Z")
	public static boolean method94(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static140.method2190(arg0, arg1) | (arg1 & 0x2000) != 0 | Static2.method31(arg1, arg0)) & Static380.method5247(arg1, arg0);
	}
}
