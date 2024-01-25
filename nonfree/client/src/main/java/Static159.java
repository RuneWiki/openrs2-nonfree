import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "[B")
	public static byte[] aByteArray235;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIII)I")
	public static int method7736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static428.aByteArrayArrayArray4[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static428.aByteArrayArrayArray4[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
