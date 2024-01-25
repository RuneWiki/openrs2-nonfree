import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
	public static final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z")
	public static boolean method3943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZII)V")
	public static void method3944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1003) {
			Static100.method1631(Static129.aClass84_7, arg0, arg2);
		} else if (arg1 == 1011) {
			Static100.method1631(Static397.aClass84_3, arg0, arg2);
		} else if (arg1 == 1001) {
			Static100.method1631(Static266.aClass84_8, arg0, arg2);
		} else if (arg1 == 1008) {
			Static100.method1631(Static297.aClass84_10, arg0, arg2);
		} else if (arg1 == 1007) {
			Static100.method1631(Static18.aClass84_4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)Z")
	public static boolean method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public static int method3947(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
