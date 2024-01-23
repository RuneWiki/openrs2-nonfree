import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!we", name = "K", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array18;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Lclient!qc;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "Lclient!ph;")
	public static Class138 aClass138_89;

	@OriginalMember(owner = "client!we", name = "U", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!we", name = "W", descriptor = "Lclient!ph;")
	public static Class138 aClass138_90;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString193 = "wave2:";

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "[Lclient!tc;")
	public static Class167[] aClass167Array2 = new Class167[14];

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "[I")
	public static int[] anIntArray529 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString194 = "Continue";

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIIIIIII)V")
	public static void method4584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static312.anInt5850 <= arg2 && Static214.anInt4216 >= arg2 && Static312.anInt5850 <= arg0 && Static214.anInt4216 >= arg0 && Static312.anInt5850 <= arg1 && arg1 <= Static214.anInt4216 && arg6 >= Static312.anInt5850 && arg6 <= Static214.anInt4216 && Static240.anInt1319 <= arg7 && arg7 <= Static59.anInt1155 && arg4 >= Static240.anInt1319 && arg4 <= Static59.anInt1155 && Static240.anInt1319 <= arg8 && arg8 <= Static59.anInt1155 && arg3 >= Static240.anInt1319 && arg3 <= Static59.anInt1155) {
			Static220.method4574(arg7, arg4, arg3, arg2, arg5, arg6, arg8, arg0, arg1);
		} else {
			Static6.method99(arg6, arg2, arg4, arg0, arg1, arg3, arg7, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
	public static void method4585() {
		if (Static258.anInt5016 == 10 && Static291.aBoolean404) {
			Static176.method4598(28);
		}
		if (Static258.anInt5016 == 30) {
			Static176.method4598(25);
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
	public static void method4586() {
		Static237.aClass1_Sub14_Sub1_7.method2659();
		@Pc(13) int local13 = Static237.aClass1_Sub14_Sub1_7.method2657(8);
		@Pc(22) int local22;
		if (local13 < Static105.anInt2015) {
			for (local22 = local13; local22 < Static105.anInt2015; local22++) {
				Static119.anIntArray535[Static110.anInt2185++] = Static7.anIntArray12[local22];
			}
		}
		if (Static105.anInt2015 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static105.anInt2015 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(66) int local66 = Static7.anIntArray12[local22];
			@Pc(70) Class22_Sub3_Sub1 local70 = Static265.aClass22_Sub3_Sub1Array1[local66];
			@Pc(75) int local75 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			if (local75 == 0) {
				Static7.anIntArray12[Static105.anInt2015++] = local66;
				local70.anInt4614 = Static37.anInt757;
			} else {
				@Pc(97) int local97 = Static237.aClass1_Sub14_Sub1_7.method2657(2);
				if (local97 == 0) {
					Static7.anIntArray12[Static105.anInt2015++] = local66;
					local70.anInt4614 = Static37.anInt757;
					Static158.anIntArray179[Static17.anInt300++] = local66;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local97 == 1) {
						Static7.anIntArray12[Static105.anInt2015++] = local66;
						local70.anInt4614 = Static37.anInt757;
						local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
						local70.method3644(1, local143);
						local153 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
						if (local153 == 1) {
							Static158.anIntArray179[Static17.anInt300++] = local66;
						}
					} else if (local97 == 2) {
						Static7.anIntArray12[Static105.anInt2015++] = local66;
						local70.anInt4614 = Static37.anInt757;
						if (Static237.aClass1_Sub14_Sub1_7.method2657(1) == 1) {
							local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local70.method3644(2, local143);
							local153 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local70.method3644(2, local153);
						} else {
							local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local70.method3644(0, local143);
						}
						local143 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
						if (local143 == 1) {
							Static158.anIntArray179[Static17.anInt300++] = local66;
						}
					} else if (local97 == 3) {
						Static119.anIntArray535[Static110.anInt2185++] = local66;
					}
				}
			}
		}
	}
}
