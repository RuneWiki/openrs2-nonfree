import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static630 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "Lclient!oh;")
	public static Class237 aClass237_149;

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "[I")
	public static int[] anIntArray621;

	@OriginalMember(owner = "client!wj", name = "I", descriptor = "J")
	public static long aLong279 = 0L;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
	public static int method8491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (((arg2 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7));
	}
}
