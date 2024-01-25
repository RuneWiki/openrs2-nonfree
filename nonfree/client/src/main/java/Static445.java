import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rca", name = "B", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "[Lclient!aw;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
	public static int anInt8469 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBLclient!tc;I)V")
	public static void method6950(@OriginalArg(0) int arg0, @OriginalArg(2) Class305 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class93 local8 = arg1.method7501(Static546.aClass15_16);
		if (local8 == null) {
			return;
		}
		Static546.aClass15_16.ca(arg0, arg2, arg0 + arg1.anInt9242, arg1.anInt9160 + arg2);
		if (Static327.anInt6815 >= 3) {
			Static546.aClass15_16.L(-16777216, local8, arg0, arg2);
		} else {
			Static280.aClass37_41.method7084((float) arg1.anInt9242 / 2.0F + (float) arg0, (float) arg2 + (float) arg1.anInt9160 / 2.0F, ((int) -Static533.aFloat188 & 0x3FFF) << 2, local8, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(IB)Z")
	public static boolean method6951(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZII)Z")
	public static boolean method6952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
