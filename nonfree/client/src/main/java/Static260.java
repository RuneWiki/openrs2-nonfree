import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!ika", name = "r", descriptor = "Lclient!wm;")
	public static Class390 aClass390_61;

	@OriginalMember(owner = "client!ika", name = "w", descriptor = "I")
	public static int anInt4823;

	@OriginalMember(owner = "client!ika", name = "z", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!ika", name = "v", descriptor = "Z")
	public static boolean aBoolean411 = true;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(III)Z")
	public static boolean method4075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)I")
	public static int method4076() {
		return 16;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIIZ)I")
	public static int method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static7.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static7.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
