import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[J")
	public static final long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_50 = new Class274(16, 11);

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)F")
	public static float method3186(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method3187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + (((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7));
	}
}
