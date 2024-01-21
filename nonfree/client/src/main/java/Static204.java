import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	public static int anInt4161;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2068 = Static193.method3027("button near the top of that page)3");

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2069 = aClass70_2068;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2070 = Static193.method3027("OFF");

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2071 = aClass70_2070;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2073 = Static193.method3027("Players");

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2072 = aClass70_2073;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "[S")
	public static final short[] aShortArray67 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBIII)I")
	public static int method3231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(21) int local21 = arg5;
			arg5 = arg2;
			arg2 = local21;
		}
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 + 1 - arg3 - arg5;
		} else if (local12 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)I")
	public static int method3233(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
