import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!la;")
	public static final Class136 aClass136_123 = new Class136(53, 0);

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[Lclient!kg;")
	public static final Class128[] aClass128Array1 = new Class128[4];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIB)I")
	public static int method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7);
	}
}
