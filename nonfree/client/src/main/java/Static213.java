import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
	public static int anInt3686;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Lclient!hr;")
	public static Class3_Sub26 aClass3_Sub26_2;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	public static int anInt3691 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ID)V")
	public static void method3146(@OriginalArg(1) double arg0) {
		if (arg0 == Static399.aDouble19) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static356.anIntArray330[local7] = local19 <= 255 ? local19 : 255;
		}
		Static399.aDouble19 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)Z")
	public static boolean method3147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BIIIIILclient!ha;I)V")
	public static void method3149(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class95 arg4) {
		arg4.method8054(arg1, arg3, arg2, arg0, -10660793);
		arg4.method8054(16, arg3 + 1, arg2 + -2, arg0 + 1, -16777216);
		arg4.method8071(arg2 - 2, arg0 + 1, arg3 + 18, -16777216, -19 + arg1);
	}
}
