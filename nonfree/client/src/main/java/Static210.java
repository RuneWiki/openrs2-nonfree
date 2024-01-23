import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "Lclient!kb;")
	public static Class83 aClass83_139;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lclient!mf;")
	public static Class100 aClass100_5;

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "Lclient!kb;")
	public static Class83 aClass83_140;

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
	public static int anInt4682 = 127;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
	public static int anInt4683 = -1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZBLclient!ml;)V")
	public static void method3710(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub16 arg1) {
		@Pc(6) int local6;
		if (Static296.aBoolean335 || arg0) {
			local6 = Static144.anInt3368;
			@Pc(12) int local12 = local6 * 956 / 503;
			Static229.aClass1_Sub2_Sub14_7.method2726((Static193.anInt4370 - local12) / 2, 0, local12, local6);
			Static90.aClass7_1.method4259(Static193.anInt4370 / 2 - Static90.aClass7_1.anInt5432 / 2, 18);
		}
		arg1.method3972(Static6.aString75, Static193.anInt4370 / 2, Static144.anInt3368 / 2 - 26, 16777215, -1);
		local6 = Static144.anInt3368 / 2 - 18;
		if (Static296.aBoolean335) {
			Static288.method4709(Static193.anInt4370 / 2 - 152, local6, 304, 34, 9179409);
			Static288.method4709(Static193.anInt4370 / 2 - 151, local6 + 1, 302, 32, 0);
			Static288.method4713(Static193.anInt4370 / 2 - 150, local6 - -2, Static229.anInt5079 * 3, 30, 9179409);
			Static288.method4713(Static229.anInt5079 * 3 + Static193.anInt4370 / 2 - 150, local6 + 2, 300 - Static229.anInt5079 * 3, 30, 0);
		} else {
			Static203.method3598(Static193.anInt4370 / 2 - 152, local6, 304, 34, 9179409);
			Static203.method3598(Static193.anInt4370 / 2 - 151, local6 + 1, 302, 32, 0);
			Static203.method3592(Static193.anInt4370 / 2 - 150, local6 - -2, Static229.anInt5079 * 3, 30, 9179409);
			Static203.method3592(Static229.anInt5079 * 3 + Static193.anInt4370 / 2 - 150, local6 + 2, 300 - Static229.anInt5079 * 3, 30, 0);
		}
		arg1.method3972(Static213.aString149, Static193.anInt4370 / 2, Static144.anInt3368 / 2 + 4, 16777215, -1);
	}
}
