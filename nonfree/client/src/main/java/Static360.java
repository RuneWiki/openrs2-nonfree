import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!jl;")
	public static Class4_Sub15_Sub2 aClass4_Sub15_Sub2_2;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_284 = new Class22(106, 10);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!iv;)V")
	public static void method4864(@OriginalArg(1) Class4_Sub12 arg0) {
		if (arg0.aByteArray36.length - arg0.anInt2997 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method2490();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray36.length - arg0.anInt2997 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method2536();
		if (arg0.aByteArray36.length - arg0.anInt2997 != local47 * 6) {
			return;
		}
		while (true) {
			@Pc(67) int local67;
			@Pc(71) int local71;
			do {
				do {
					do {
						if (arg0.aByteArray36.length <= arg0.anInt2997) {
							return;
						}
						local67 = arg0.method2536();
						local71 = arg0.method2529();
					} while (local67 >= Static165.anIntArray210.length);
				} while (!Static22.aBooleanArray3[local67]);
			} while (Static43.aClass93_4.method2430(local67).aChar5 == '1' && (local71 < -1 || local71 > 1));
			Static165.anIntArray210[local67] = local71;
		}
	}
}
