import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public static int anInt6536;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_248 = new Class67(89, -1);

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public static int anInt6537 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)I")
	public static int method5239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
