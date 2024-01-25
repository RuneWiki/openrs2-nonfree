import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static497 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	public static int[] anIntArray571;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt8117;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public static int anInt8119 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
	public static boolean method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static451.method2189(arg1, arg0) | (arg1 & 0x70000) != 0 || Static102.method1050(arg0, arg1);
	}
}
