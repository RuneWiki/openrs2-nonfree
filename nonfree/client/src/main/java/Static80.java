import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	public static final int anInt1428 = 1409;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
	public static boolean method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static648.method8947(arg0, arg1) | (arg0 & 0x2000) != 0 | Static509.method7018(arg0, arg1)) & Static457.method6443(arg1, arg0);
	}
}
