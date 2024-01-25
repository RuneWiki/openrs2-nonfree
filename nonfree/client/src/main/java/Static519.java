import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static519 {

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "Z")
	public static boolean aBoolean656;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public static int anInt8675 = 0;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public static int anInt8681 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method7350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static643.method8446(arg1, arg0) | Static304.method4692(arg0, arg1) | Static430.method6355(arg0, arg1)) & Static433.method6369(arg1, arg0);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7352(@OriginalArg(1) String arg0) {
		return Static99.method1964(arg0, w.class);
	}
}
