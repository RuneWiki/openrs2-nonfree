import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
	public static int method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7));
	}
}
