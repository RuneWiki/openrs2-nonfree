import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "Lclient!tn;")
	public static Class307 aClass307_1;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)I")
	public static int method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static284.anIntArrayArray56 == null ? 0 : Static284.anIntArrayArray56[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)I")
	public static int method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > arg0) {
			return arg1;
		} else if (arg2 >= arg0) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
	public static boolean method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
