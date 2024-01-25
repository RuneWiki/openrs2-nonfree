import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hq", name = "V", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "I")
	public static int anInt4052 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
	public static boolean method3543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)I")
	public static int method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(II)V")
	public static void method3545(@OriginalArg(1) int arg0) {
		Static384.anInt6757 = arg0;
		Static134.aClass136_32.method3470();
	}
}
