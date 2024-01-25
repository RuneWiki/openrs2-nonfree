import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public static int anInt9458;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_12 = new Class312("", 12);

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
	public static final int[] anIntArray684 = new int[5];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
	public static int method8031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg1 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}
}
