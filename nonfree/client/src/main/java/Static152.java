import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!g", name = "s", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "[Lclient!bba;")
	public static final Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array1 = new Class1_Sub6_Sub1[14];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!la;ZLclient!uq;Lclient!r;BLjava/lang/String;)V")
	public static void method2206(@OriginalArg(0) Class64 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class334 arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(5) String arg4) {
		@Pc(11) int local11;
		@Pc(20) int local20;
		if (Static142.aBoolean201 && Static527.method7249()) {
			@Pc(118) Class334 local118 = Static246.aClass334_7;
			@Pc(124) Class64 local124 = arg3.method6899(local118, Static580.aClass102Array1);
			local11 = local118.method7352(arg4, null, 250);
			local20 = local118.method7351(null, arg4, 250, local118.anInt9012);
			@Pc(143) int local143 = Static401.aClass102_8.anInt2624;
			@Pc(147) int local147 = local143 + 4;
			local11 += local147 * 2;
			local20 += local147 * 2;
			if (Static472.anInt8018 > local11) {
				local11 = Static472.anInt8018;
			}
			if (local20 < Static479.anInt8091) {
				local20 = Static479.anInt8091;
			}
			@Pc(186) int local186 = Static301.aClass335_11.method7396(Static573.anInt9475, local11) + Static6.anInt66;
			@Pc(195) int local195 = Static381.aClass122_11.method2394(Static103.anInt2084, local20) + Static316.anInt5409;
			arg3.method6896(Static548.aClass102_14, false).method7657(local186 + Static422.aClass102_10.anInt2624, Static422.aClass102_10.anInt2626 + local195, local11 - Static422.aClass102_10.anInt2624 * 2, local20 + -(Static422.aClass102_10.anInt2626 * 2));
			arg3.method6896(Static422.aClass102_10, true).method7662(local186, local195);
			Static422.aClass102_10.method2073();
			arg3.method6896(Static422.aClass102_10, true).method7662(local11 + local186 - local143, local195);
			Static422.aClass102_10.method2078();
			arg3.method6896(Static422.aClass102_10, true).method7662(local11 + local186 - local143, local20 + local195 - local143);
			Static422.aClass102_10.method2073();
			arg3.method6896(Static422.aClass102_10, true).method7662(local186, local195 + local20 - local143);
			Static422.aClass102_10.method2078();
			arg3.method6896(Static401.aClass102_8, true).method7657(local186, Static422.aClass102_10.anInt2626 + local195, local143, local20 - Static422.aClass102_10.anInt2626 * 2);
			Static401.aClass102_8.method2080();
			arg3.method6896(Static401.aClass102_8, true).method7657(Static422.aClass102_10.anInt2624 + local186, local195, local11 - Static422.aClass102_10.anInt2624 * 2, local143);
			Static401.aClass102_8.method2080();
			arg3.method6896(Static401.aClass102_8, true).method7657(local11 + local186 - local143, Static422.aClass102_10.anInt2626 + local195, local143, local20 - Static422.aClass102_10.anInt2626 * 2);
			Static401.aClass102_8.method2080();
			arg3.method6896(Static401.aClass102_8, true).method7657(Static422.aClass102_10.anInt2624 + local186, local20 + (local195 - local143), local11 - Static422.aClass102_10.anInt2624 * 2, local143);
			Static401.aClass102_8.method2080();
			local124.method6612(null, 0, local147 + local186, -(local147 * 2) + local20, -1, null, arg4, 1, null, 0, 0, local147 + local195, local11 - local147 * 2, Static33.anInt2647 | 0xFF000000, 1);
			Static14.method148(local195, local186, local20, local11);
		} else {
			local11 = arg2.method7352(arg4, null, 250);
			local20 = arg2.method7361(250, null, arg4) * 13;
			arg3.J(6, 6, local11 + 4 + 4, local20 - -4 + 4, -16777216, 0);
			arg3.method6958(6, 6, local11 + 4 + 4, local20 + 4 + 4, -1, 0);
			arg0.method6612(null, 0, 10, local20, -1, null, arg4, 1, null, 0, 0, 10, local11, -1, 1);
			Static14.method148(6, 6, local20 + 4 + 4, local11 - -4 + 4);
		}
		if (arg1) {
			try {
				arg3.method6944();
			} catch (@Pc(420) Exception_Sub1 local420) {
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	public static void method2208() {
		Static512.aClass222_57.method4428();
	}
}
