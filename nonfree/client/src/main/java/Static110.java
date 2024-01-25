import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[Lclient!gl;")
	public static Class130[] aClass130Array1 = new Class130[50];

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
	public static int anInt2203 = 0;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Lclient!qi;")
	public static final Class282 aClass282_1 = new Class282(64);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z")
	public static boolean method1823(@OriginalArg(0) int arg0) {
		if (arg0 == 23 || arg0 == 19 || arg0 == 16 || arg0 == 57 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1009;
		}
	}
}
