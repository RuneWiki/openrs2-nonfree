import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!si", name = "h", descriptor = "[Lclient!cl;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_5;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_6;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	public static int[] anIntArray524 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString303 = "Cancel";

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	public static int anInt4845 = -1;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static int anInt4847 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void method4023() {
		Static263.aClass26_53.method517(5);
		Static294.aClass26_49.method517(5);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!to;IIIIIIZ)V")
	public static void method4024(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray583.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray583[local5] - Static277.anInt5282;
			local22 = arg0.anIntArray584[local5] - Static228.anInt4376;
			local29 = arg0.anIntArray581[local5] - Static230.anInt4401;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray572 != null) {
				Static274.anIntArray585[local5] = local39;
				Static274.anIntArray578[local5] = local61;
				Static274.anIntArray573[local5] = local71;
			}
			Static274.anIntArray577[local5] = Static158.anInt3125 + (local39 << 9) / local71;
			Static274.anIntArray582[local5] = Static158.anInt3126 + (local61 << 9) / local71;
		}
		Static158.anInt3127 = 0;
		local3 = arg0.anIntArray580.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray580[local5];
			local22 = arg0.anIntArray579[local5];
			local29 = arg0.anIntArray586[local5];
			local39 = Static274.anIntArray577[local15];
			@Pc(148) int local148 = Static274.anIntArray577[local22];
			@Pc(152) int local152 = Static274.anIntArray577[local29];
			@Pc(156) int local156 = Static274.anIntArray582[local15];
			@Pc(160) int local160 = Static274.anIntArray582[local22];
			@Pc(164) int local164 = Static274.anIntArray582[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static73.aBoolean101 && Static75.method1223(Static22.anInt315 + Static158.anInt3125, Static305.anInt5807 + Static158.anInt3126, local156, local160, local164, local39, local148, local152)) {
					Static32.anInt528 = arg5;
					Static28.anInt420 = arg6;
				}
				if (!Static94.aBoolean138 && !arg7) {
					Static158.aBoolean217 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static158.anInt3129 || local148 > Static158.anInt3129 || local152 > Static158.anInt3129) {
						Static158.aBoolean217 = true;
					}
					if (arg0.anIntArray572 == null || arg0.anIntArray572[local5] == -1) {
						if (arg0.anIntArray576[local5] != 12345678) {
							Static158.method2556(local156, local160, local164, local39, local148, local152, arg0.anIntArray576[local5], arg0.anIntArray575[local5], arg0.anIntArray574[local5]);
						}
					} else if (!Static27.aBoolean27) {
						@Pc(373) int local373 = Static158.anInterface5_1.method446(arg0.anIntArray572[local5]);
						Static158.method2556(local156, local160, local164, local39, local148, local152, Static22.method302(local373, arg0.anIntArray576[local5]), Static22.method302(local373, arg0.anIntArray575[local5]), Static22.method302(local373, arg0.anIntArray574[local5]));
					} else if (arg0.aBoolean354) {
						Static158.method2571(local156, local160, local164, local39, local148, local152, arg0.anIntArray576[local5], arg0.anIntArray575[local5], arg0.anIntArray574[local5], Static274.anIntArray585[0], Static274.anIntArray585[1], Static274.anIntArray585[3], Static274.anIntArray578[0], Static274.anIntArray578[1], Static274.anIntArray578[3], Static274.anIntArray573[0], Static274.anIntArray573[1], Static274.anIntArray573[3], arg0.anIntArray572[local5]);
					} else {
						Static158.method2571(local156, local160, local164, local39, local148, local152, arg0.anIntArray576[local5], arg0.anIntArray575[local5], arg0.anIntArray574[local5], Static274.anIntArray585[local15], Static274.anIntArray585[local22], Static274.anIntArray585[local29], Static274.anIntArray578[local15], Static274.anIntArray578[local22], Static274.anIntArray578[local29], Static274.anIntArray573[local15], Static274.anIntArray573[local22], Static274.anIntArray573[local29], arg0.anIntArray572[local5]);
					}
				}
			}
		}
	}
}
