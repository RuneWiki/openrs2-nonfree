import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "F")
	public static float aFloat80 = 0.0F;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
	public static void method5640(@OriginalArg(1) int arg0) {
		Static183.anInt3716 = arg0;
		Static216.aClass103_41.method2678();
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)I")
	public static int method5641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
