import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	public static int anInt2979;

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "[[Lclient!hn;")
	public static Class108[][] aClass108ArrayArray1;

	@OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "S")
	public static short aShort52 = 1;

	@OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
	public static int anInt2989 = -1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIB)Z")
	public static boolean method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static288.method4245(arg1, arg0) & Static373.method5208(arg0, arg1);
	}
}
