import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_55 = new Class5(64);

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_259 = new Class184(92, -1);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZII)I")
	public static int method5493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
