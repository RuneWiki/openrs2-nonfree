import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "Lclient!us;")
	public static final Class234 aClass234_106 = new Class234(56, -2);

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "[I")
	public static final int[] anIntArray574 = new int[14];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
	public static int method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static13.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static13.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
