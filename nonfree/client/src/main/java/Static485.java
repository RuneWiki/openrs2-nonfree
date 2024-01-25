import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!rca", name = "F", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
	public static int anInt8420 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!kw;IIZ[BIII)Lclient!of;")
	public static Class76_Sub3_Sub1 method7223(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean379 || Static323.method5278(arg1) && Static323.method5278(arg3)) {
			return new Class76_Sub3_Sub1(arg0, 3553, 6406, arg1, arg3, false, arg2, 6406);
		} else if (arg0.aBoolean384) {
			return new Class76_Sub3_Sub1(arg0, 34037, 6406, arg1, arg3, false, arg2, 6406);
		} else {
			return new Class76_Sub3_Sub1(arg0, 6406, arg1, arg3, Static109.method2234(arg1), Static109.method2234(arg3), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BII)Z")
	public static boolean method7224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
