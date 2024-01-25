import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "[S")
	private static final short[] aShortArray106 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "[S")
	private static final short[] aShortArray107 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "[S")
	private static final short[] aShortArray108 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_136 = new Class44(112, 1);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "[S")
	private static final short[] aShortArray109 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray16 = new short[][] { aShortArray108, aShortArray107, aShortArray106, aShortArray109 };

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)I")
	public static int method6043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
