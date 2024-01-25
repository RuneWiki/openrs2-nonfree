import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	public static int anInt5601;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Lclient!eu;")
	public static final Class12_Sub15 aClass12_Sub15_1 = new Class12_Sub15(0, 0);

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean427 = false;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	public static int anInt5602 = -1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I")
	public static int method4702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 & 0xFF) >> 2 << 10) + (arg0 >> 1);
	}
}
