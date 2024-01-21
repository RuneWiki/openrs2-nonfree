import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lclient!te;")
	public static final Class6_Sub4_Sub2[] aClass6_Sub4_Sub2Array1 = new Class6_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray67 = new byte[4][104][104];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
	public static int method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I")
	public static int method1970(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(II)I")
	public static int method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
