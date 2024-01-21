import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_1;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt621 = -2;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt624 = 0;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
	public static final int[] anIntArray64 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_485 = Static118.method2249("(U1");

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_486 = Static118.method2249("Registrierter Benutzer");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILclient!wd;III)V")
	public static void method383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = arg3 * arg3 + arg5 * arg5;
		if (local11 > 360000) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg2.anInt4353 / 2, arg2.anInt4354 / 2);
		if (local32 * local32 >= local11) {
			Static119.method2263(arg3, arg2, arg4, Static94.aClass1_Sub2_Sub5_Sub3Array2[arg0], arg1, arg5);
			return;
		}
		local32 -= 10;
		@Pc(48) int local48 = Static82.anInt2025 + Static105.anInt2597 & 0x7FF;
		@Pc(52) int local52 = Class1_Sub2_Sub5_Sub2.anIntArray138[local48];
		@Pc(56) int local56 = Class1_Sub2_Sub5_Sub2.anIntArray142[local48];
		@Pc(64) int local64 = local56 * 256 / (Static130.anInt3193 + 256);
		@Pc(72) int local72 = local52 * 256 / (Static130.anInt3193 + 256);
		@Pc(82) int local82 = local64 * arg5 + local72 * arg3 >> 16;
		@Pc(92) int local92 = arg3 * local64 - local72 * arg5 >> 16;
		@Pc(98) double local98 = Math.atan2((double) local82, (double) local92);
		@Pc(105) int local105 = (int) ((double) local32 * Math.sin(local98));
		@Pc(112) int local112 = (int) ((double) local32 * Math.cos(local98));
		Static197.aClass1_Sub2_Sub5_Sub3Array13[arg0].method1319(local105 + arg2.anInt4353 / 2 + arg1 - 10, -local112 + arg2.anInt4354 / 2 + (arg4 - 10), local98);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method385() {
		for (@Pc(1) int local1 = 0; local1 < Static161.anInt3642; local1++) {
			@Pc(6) int local6 = Static134.anIntArray377[local1]--;
			if (Static134.anIntArray377[local1] >= -10) {
				@Pc(71) Class84 local71 = Static122.aClass84Array2[local1];
				if (local71 == null) {
					local71 = Static218.method2937(Static52.aClass60_Sub1_55, Static111.anIntArray309[local1], 0);
					if (local71 == null) {
						continue;
					}
					Static134.anIntArray377[local1] += local71.method2940();
					Static122.aClass84Array2[local1] = local71;
				}
				if (Static134.anIntArray377[local1] < 0) {
					@Pc(195) int local195;
					if (Static53.anIntArray130[local1] == 0) {
						local195 = Static7.anInt172;
					} else {
						@Pc(117) int local117 = (Static53.anIntArray130[local1] & 0xFF) * 128;
						@Pc(125) int local125 = Static53.anIntArray130[local1] >> 16 & 0xFF;
						@Pc(134) int local134 = local125 * 128 + 64 - Static201.aClass6_Sub4_Sub1_3.anInt3934;
						if (local134 < 0) {
							local134 = -local134;
						}
						@Pc(147) int local147 = Static53.anIntArray130[local1] >> 8 & 0xFF;
						@Pc(157) int local157 = local147 * 128 + 64 - Static201.aClass6_Sub4_Sub1_3.anInt3976;
						if (local157 < 0) {
							local157 = -local157;
						}
						@Pc(171) int local171 = local157 + local134 - 128;
						if (local171 > local117) {
							Static134.anIntArray377[local1] = -100;
							continue;
						}
						if (local171 < 0) {
							local171 = 0;
						}
						local195 = Static53.anInt1436 * (local117 - local171) / local117;
					}
					if (local195 > 0) {
						@Pc(205) Class1_Sub19_Sub1 local205 = local71.method2938().method2171(Static171.aClass43_1);
						@Pc(210) Class1_Sub6_Sub3 local210 = Static216.method2203(local205, local195);
						local210.method2184(Static104.anIntArray292[local1] - 1);
						Static93.aClass1_Sub6_Sub1_1.method1995(local210);
					}
					Static134.anIntArray377[local1] = -100;
				}
			} else {
				Static161.anInt3642--;
				for (@Pc(20) int local20 = local1; local20 < Static161.anInt3642; local20++) {
					Static111.anIntArray309[local20] = Static111.anIntArray309[local20 + 1];
					Static122.aClass84Array2[local20] = Static122.aClass84Array2[local20 + 1];
					Static104.anIntArray292[local20] = Static104.anIntArray292[local20 + 1];
					Static134.anIntArray377[local20] = Static134.anIntArray377[local20 + 1];
					Static53.anIntArray130[local20] = Static53.anIntArray130[local20 + 1];
				}
				local1--;
			}
		}
		if (Static128.aBoolean132 && !Static169.method1450()) {
			if (Static135.anInt3352 != 0 && Static12.anInt306 != -1) {
				Static165.method2842(Static16.aClass60_Sub1_15, Static135.anInt3352, Static12.anInt306);
			}
			Static128.aBoolean132 = false;
		} else if (Static135.anInt3352 != 0 && Static12.anInt306 != -1 && !Static169.method1450()) {
			Static45.aClass1_Sub14_Sub1_8.method1761(166);
			Static45.aClass1_Sub14_Sub1_8.method1724(Static12.anInt306);
			Static12.anInt306 = -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)I")
	public static int method386(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!sd;)V")
	public static void method388(@OriginalArg(1) Class60 arg0) {
		Static52.aClass60_10 = arg0;
		Static181.anInt4056 = Static52.aClass60_10.method2342(4);
	}
}
