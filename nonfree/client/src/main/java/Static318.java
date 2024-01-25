import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "I")
	public static int anInt5845;

	@OriginalMember(owner = "client!nda", name = "t", descriptor = "Lclient!im;")
	public static final Class140 aClass140_83 = new Class140(48, 4);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)I")
	public static int method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (((arg2 & 0xFF) >> 2 << 10) + (arg1 >> 1));
	}
}
