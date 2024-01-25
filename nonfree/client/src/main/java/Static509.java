import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public static int anInt7969;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "[I")
	public static int[] anIntArray546;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
	public static int anInt7968 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6933(@OriginalArg(1) String arg0) {
		return Static104.method2062(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BIII)I")
	public static int method6934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static47.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static47.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
