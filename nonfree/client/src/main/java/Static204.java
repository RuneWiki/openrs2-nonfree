import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIB)I")
	public static int method3498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg0 >> 1);
	}
}
