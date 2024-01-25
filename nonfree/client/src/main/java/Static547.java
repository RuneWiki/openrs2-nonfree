import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
	public static final int[] anIntArray573 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)I")
	public static int method7961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg3;
			arg3 = arg0;
			arg0 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg3 - arg4;
		} else if (local7 == 2) {
			return 1 + 7 - arg5 - arg0;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method7963() {
		Static452.method6948();
		Static71.aBoolean94 = false;
		Static143.method2301(Static483.anInt8373, Static29.anInt622, Static400.anInt7476, Static94.anInt1854);
	}
}
