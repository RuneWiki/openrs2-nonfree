import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!la", name = "u", descriptor = "J")
	public static long aLong200;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt5084 = 0;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!vda;")
	public static final Class299 aClass299_4 = new Class299();

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIBII)V")
	public static void method4395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static521.anInt8752 = arg1;
		Static539.anInt9126 = arg0;
		Static282.anInt7759 = arg5;
		Static410.anInt7289 = arg3;
		Static263.anInt5055 = arg4;
		if (arg2 && Static539.anInt9126 >= 100) {
			Static522.anInt8770 = Static263.anInt5055 * 512 + 256;
			Static516.anInt8682 = Static521.anInt8752 * 512 + 256;
			Static504.anInt8519 = Static38.method884(Static501.anInt8491, Static522.anInt8770, Static516.anInt8682) - Static410.anInt7289;
		}
		Static448.anInt7701 = 2;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!ge;)Lclient!lk;")
	public static Class10_Sub3 method4396(@OriginalArg(1) Class1_Sub6 arg0) {
		return new Class10_Sub3(arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3920(), arg0.method3920(), arg0.method3922());
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method4401(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static337.method5133(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI[Lclient!jq;II)V")
	public static void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class156[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class156 local13 = arg3[local7];
			if (local13 != null && arg0 == local13.anInt4686) {
				Static340.method5163(arg1, local13, arg4, arg2);
				Static374.method5743(arg4, local13, arg2);
				if (local13.anInt4711 > local13.anInt4712 - local13.anInt4732) {
					local13.anInt4711 = local13.anInt4712 - local13.anInt4732;
				}
				if (local13.anInt4711 < 0) {
					local13.anInt4711 = 0;
				}
				if (local13.anInt4719 - local13.anInt4673 < local13.anInt4707) {
					local13.anInt4707 = local13.anInt4719 - local13.anInt4673;
				}
				if (local13.anInt4707 < 0) {
					local13.anInt4707 = 0;
				}
				if (local13.anInt4735 == 0) {
					Static193.method6045(local13, arg1);
				}
			}
		}
	}
}
