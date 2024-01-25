import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	public static int anInt7579;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt7582;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt7571 = 0;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_42 = new Class324("", 15);

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
	public static final int anInt7575 = 1403;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[Lclient!vg;)V")
	public static void method6030(@OriginalArg(0) int arg0, @OriginalArg(2) Class341[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class341 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt9252 && !Static63.method1134(local13)) {
				if (local13.anInt9309 == 0) {
					method6030(local13.anInt9306, arg1);
					if (local13.aClass341Array2 != null) {
						method6030(local13.anInt9306, local13.aClass341Array2);
					}
					@Pc(50) Class1_Sub44 local50 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local13.anInt9306);
					if (local50 != null) {
						Static508.method7080(local50.anInt7685);
					}
				}
				if (local13.anInt9309 == 6 && local13.anInt9259 != -1) {
					@Pc(71) Class290 local71 = Static192.aClass211_1.method4277(local13.anInt9259);
					if (local71 != null) {
						local13.anInt9246 += Static504.anInt5717;
						@Pc(82) int local82 = local13.anInt9253;
						while (local71.anIntArray603[local13.anInt9253] < local13.anInt9246) {
							local13.anInt9246 -= local71.anIntArray603[local13.anInt9253];
							local13.anInt9253++;
							if (local13.anInt9253 >= local71.anIntArray604.length) {
								local13.anInt9253 -= local71.anInt7806;
								if (local13.anInt9253 < 0 || local71.anIntArray604.length <= local13.anInt9253) {
									local13.anInt9253 = 0;
								}
							}
							local13.anInt9288 = local13.anInt9253 + 1;
							if (local13.anInt9288 >= local71.anIntArray604.length) {
								local13.anInt9288 -= local71.anInt7806;
								if (local13.anInt9288 < 0 || local13.anInt9288 >= local71.anIntArray604.length) {
									local13.anInt9288 = -1;
								}
							}
							Static442.method6111(local13);
						}
						if (local13.anInt9253 != local82) {
							Static236.method3580(local71, local13.anInt9253);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIII)V")
	public static void method6033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static514.anInt8722 <= arg3 && Static451.anInt7775 >= arg3) {
			@Pc(19) int local19 = Static176.method2504(arg1, Static162.anInt2935, Static270.anInt4759);
			@Pc(25) int local25 = Static176.method2504(arg0, Static162.anInt2935, Static270.anInt4759);
			Static75.method7416(local19, arg2, arg3, local25);
		}
	}
}
