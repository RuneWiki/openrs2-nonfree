import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "Lclient!vg;")
	public static Class341 aClass341_5 = null;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)Z")
	public static boolean method1167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I")
	public static int method1168(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
