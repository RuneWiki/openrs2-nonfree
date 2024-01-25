import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "Lclient!gj;")
	public static Class143 aClass143_102;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_38 = new Class279(20);

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
	public static int anInt7045 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	public static void method5963(@OriginalArg(0) Class16 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		arg0.method8113(arg2, arg4, arg1, -10660793, arg3);
		arg0.method8113(16, arg4 + 1, arg1 + -2, -16777216, arg3 + 1);
		arg0.method8180(-16777216, arg4 + 1, arg1 - 2, arg2 - 19, arg3 - -18);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIII)I")
	public static int method5965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}
}
