import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!ao;")
	public static Class17 aClass17_44;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "[I")
	public static int[] anIntArray660;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_23 = new Class225(1, 2, 2, 0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIBI)I")
	public static int method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static387.aByteArrayArrayArray18[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static387.aByteArrayArrayArray18[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
