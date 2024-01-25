import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "Lclient!ig;")
	public static Class12 aClass12_16;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "[S")
	public static short[] aShortArray85;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)V")
	public static void method4939(@OriginalArg(0) long arg0) {
		Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
		Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_7.anInt414);
		Static449.aClass6_Sub15_Sub1_2.method3115(arg0);
		Static264.anInt4544 = 0;
		Static201.anInt3540 = -3;
		Static90.anInt1675 = 1;
		Static376.anInt5177 = 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBI)I")
	public static int method4941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}
}
