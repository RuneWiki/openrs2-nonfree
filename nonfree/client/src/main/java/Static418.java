import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static418 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString85 = null;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
	public static final int[] anIntArray491 = new int[8];

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public static int anInt6410 = -1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)Z")
	public static boolean method5548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static541.method7183(arg1, arg0) || Static459.method6218(arg0, arg1);
	}
}
