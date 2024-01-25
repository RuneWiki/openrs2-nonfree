import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_96 = new Class56(110, 3);

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
	public static final int[] anIntArray260 = new int[200];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method4140() {
		Static212.aClass66Array1 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
	public static int method4142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static void method4146() {
		for (@Pc(10) Class3_Sub7_Sub8 local10 = (Class3_Sub7_Sub8) Static103.aClass112_16.method3088(); local10 != null; local10 = (Class3_Sub7_Sub8) Static103.aClass112_16.method3084()) {
			@Pc(15) Class41_Sub2_Sub1_Sub1 local15 = local10.aClass41_Sub2_Sub1_Sub1_1;
			if (local15.anInt1111 < Static506.anInt8251) {
				local10.method7825();
				local15.method925();
			} else if (Static506.anInt8251 >= local15.anInt1085) {
				if (local15.anInt1095 > 0) {
					@Pc(52) Class3_Sub34 local52 = (Class3_Sub34) Static213.aClass354_37.method7689((long) (local15.anInt1095 - 1));
					if (local52 != null) {
						@Pc(57) Class41_Sub2_Sub1_Sub4_Sub1 local57 = local52.aClass41_Sub2_Sub1_Sub4_Sub1_2;
						if (local57.anInt9444 >= 0 && Static54.anInt1038 * 512 > local57.anInt9444 && local57.anInt9442 >= 0 && local57.anInt9442 < Static140.anInt3026 * 512) {
							local15.method924(local57.anInt9442, local57.anInt9444, Static475.method6537(local57.anInt9442, local15.aByte117, local57.anInt9444) - local15.anInt1093, Static506.anInt8251);
						}
					}
				}
				if (local15.anInt1095 < 0) {
					@Pc(118) int local118 = -local15.anInt1095 - 1;
					@Pc(129) Class41_Sub2_Sub1_Sub4_Sub2 local129;
					if (Static166.anInt3327 == local118) {
						local129 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2;
					} else {
						local129 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local118];
					}
					if (local129 != null && local129.anInt9444 >= 0 && local129.anInt9444 < Static54.anInt1038 * 512 && local129.anInt9442 >= 0 && local129.anInt9442 < Static140.anInt3026 * 512) {
						local15.method924(local129.anInt9442, local129.anInt9444, Static475.method6537(local129.anInt9442, local15.aByte117, local129.anInt9444) - local15.anInt1093, Static506.anInt8251);
					}
				}
				local15.method921(Static541.anInt8161);
				Static586.method1886(local15, true);
			}
		}
	}
}
