import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!wi", name = "P", descriptor = "Lclient!he;")
	public static Class100 aClass100_94;

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
	public static int anInt7803;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_26 = new Class10(1, 2, 2, 0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIB)I")
	public static int method6378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg2 & 0xFF) >> 2 << 10) + (arg1 >> 1);
	}
}
