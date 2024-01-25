import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "[I")
	public static int[] anIntArray644;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!fda;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)I")
	public static int method6765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}
}
