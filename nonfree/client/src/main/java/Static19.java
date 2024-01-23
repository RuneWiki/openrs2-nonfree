import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!ek;")
	public static Class42 aClass42_6;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!lj;")
	public static Class106 aClass106_1 = new Class106(64);

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public static int anInt410 = 0;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I")
	public static int method321() {
		return 2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
	public static int method323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 2 << 10) + (arg1 >> 5 << 7);
	}
}
