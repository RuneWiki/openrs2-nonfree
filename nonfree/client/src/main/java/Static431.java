import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
	public static int[] anIntArray632;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_56 = new Class134(8);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIB)I")
	public static int method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
