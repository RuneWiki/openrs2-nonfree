import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	public static int anInt3282 = 0;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public static int method2713(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!is;IIII)V")
	public static void method2714(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static210.method3215(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static229.anInt4189) {
			Static210.method3215(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static210.method3215(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static61.anInt1698) {
			Static210.method3215(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static61.anInt1698) {
			Static210.method3215(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static229.anInt4189 && arg4 <= Static61.anInt1698) {
			Static210.method3215(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static210.method3215(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static229.anInt4189 && arg4 > 0) {
			Static210.method3215(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
