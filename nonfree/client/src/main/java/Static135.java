import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_63 = new Class211(48, 1);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2024(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static382.method5421(arg0, arg2, arg1, arg5, 0, arg4, arg3);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public static void method2025() {
		for (@Pc(7) int local7 = 0; local7 < Static104.anInt1830; local7++) {
			@Pc(13) int local13 = Static255.anIntArray542[local7]--;
			if (Static255.anIntArray542[local7] >= -10) {
				@Pc(92) Class159 local92 = Static311.aClass159Array1[local7];
				if (local92 == null) {
					local92 = Static403.method3166(Static134.aClass230_35, Static300.anIntArray609[local7], 0);
					if (local92 == null) {
						continue;
					}
					Static255.anIntArray542[local7] += local92.method3167();
					Static311.aClass159Array1[local7] = local92;
				}
				if (Static255.anIntArray542[local7] < 0) {
					@Pc(133) int local133;
					if (Static57.anIntArray700[local7] == 0) {
						local133 = Static188.aClass135_Sub1_1.anInt3382 * Static190.anIntArray390[local7] >> 8;
					} else {
						@Pc(143) int local143 = Static57.anIntArray700[local7] >> 24 & 0x3;
						if (Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 == local143) {
							@Pc(155) int local155 = (Static57.anIntArray700[local7] & 0xFF) * 128;
							@Pc(163) int local163 = Static57.anIntArray700[local7] >> 16 & 0xFF;
							@Pc(172) int local172 = local163 * 128 + 64 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080;
							if (local172 < 0) {
								local172 = -local172;
							}
							@Pc(185) int local185 = Static57.anIntArray700[local7] >> 8 & 0xFF;
							@Pc(194) int local194 = local185 * 128 + 64 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077;
							if (local194 < 0) {
								local194 = -local194;
							}
							@Pc(208) int local208 = local172 + local194 - 128;
							if (local155 < local208) {
								Static255.anIntArray542[local7] = -100;
								continue;
							}
							if (local208 < 0) {
								local208 = 0;
							}
							local133 = Static190.anIntArray390[local7] * (local155 - local208) * Static188.aClass135_Sub1_1.anInt3374 / local155 >> 8;
						} else {
							local133 = 0;
						}
					}
					if (local133 > 0) {
						@Pc(254) Class1_Sub31_Sub1 local254 = local92.method3168().method5003(Static173.aClass195_1);
						@Pc(259) Class1_Sub7_Sub2 local259 = Static399.method2255(local254, local133);
						local259.method2238(Static254.anIntArray539[local7] - 1);
						Static366.aClass1_Sub7_Sub4_2.method4413(local259);
					}
					Static255.anIntArray542[local7] = -100;
				}
			} else {
				Static104.anInt1830--;
				for (@Pc(27) int local27 = local7; local27 < Static104.anInt1830; local27++) {
					Static300.anIntArray609[local27] = Static300.anIntArray609[local27 + 1];
					Static311.aClass159Array1[local27] = Static311.aClass159Array1[local27 + 1];
					Static254.anIntArray539[local27] = Static254.anIntArray539[local27 + 1];
					Static255.anIntArray542[local27] = Static255.anIntArray542[local27 + 1];
					Static57.anIntArray700[local27] = Static57.anIntArray700[local27 + 1];
					Static190.anIntArray390[local27] = Static190.anIntArray390[local27 + 1];
				}
				local7--;
			}
		}
		if (Static12.aBoolean13 && !Static247.method3678()) {
			if (Static188.aClass135_Sub1_1.anInt3379 != 0 && Static91.anInt1663 != -1) {
				Static346.method4883(Static156.aClass230_44, Static91.anInt1663, Static188.aClass135_Sub1_1.anInt3379);
			}
			Static12.aBoolean13 = false;
		} else if (Static188.aClass135_Sub1_1.anInt3379 != 0 && Static91.anInt1663 != -1 && !Static247.method3678()) {
			Static177.method1119(Static88.aClass48_53);
			Static209.aClass1_Sub33_Sub2_2.method5142(Static91.anInt1663);
			Static91.anInt1663 = -1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ILclient!re;)I")
	public static int method2026(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		@Pc(6) int local6 = arg1.lb;
		@Pc(10) byte[] local10 = Static386.method5465(arg0);
		arg1.method5185(local10.length);
		arg1.lb += Static201.aClass220_1.method4813(0, arg1.aByteArray86, arg1.lb, local10.length, local10);
		return arg1.lb - local6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!h;)V")
	public static void method2029(@OriginalArg(1) Class25_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(15) Class1_Sub18 local15 = (Class1_Sub18) Static102.aClass17_30.method202(); local15 != null; local15 = (Class1_Sub18) Static102.aClass17_30.method207()) {
			if (arg0 == local15.aClass25_Sub1_Sub1_Sub2_1) {
				if (local15.aClass1_Sub7_Sub2_2 != null) {
					Static366.aClass1_Sub7_Sub4_2.method4410(local15.aClass1_Sub7_Sub2_2);
					local15.aClass1_Sub7_Sub2_2 = null;
				}
				local15.method5577();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method2031(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static77.method2280(arg0);
	}
}
