import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!o;")
	public static final Class246 aClass246_34 = new Class246(13, 0, 1, 0);

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
	public static boolean aBoolean723 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)I")
	public static int method8739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
	}
}
