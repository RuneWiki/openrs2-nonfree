import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	public static int anInt8169;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
	public static boolean method7099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	public static void method7100() {
		Static392.aClass199ArrayArray2 = new Class199[Static358.aClass34_79.method1247()][];
		Static269.aClass199ArrayArray1 = new Class199[Static358.aClass34_79.method1247()][];
		Static335.aBooleanArray11 = new boolean[Static358.aClass34_79.method1247()];
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static47.aByteArrayArrayArray3[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static47.aByteArrayArrayArray3[arg1][arg3][arg0] & 0x10) == 0) {
			return Static509.method6934(arg0, arg1, arg3) == arg2;
		} else {
			return false;
		}
	}
}
