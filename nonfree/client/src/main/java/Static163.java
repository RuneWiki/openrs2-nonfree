import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_39 = new Class307(10);

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(BI)I")
	public static int method2665(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2666(@OriginalArg(0) String arg0) {
		@Pc(6) Class3_Sub29 local6 = Static248.method3511();
		local6.aClass3_Sub2_Sub1_1.method2065(Static596.aClass146_11.anInt3686);
		local6.aClass3_Sub2_Sub1_1.method2032(0);
		@Pc(21) int local21 = local6.aClass3_Sub2_Sub1_1.anInt2178;
		local6.aClass3_Sub2_Sub1_1.method2032(665);
		@Pc(38) int[] local38 = Static507.method6906(88, local6);
		@Pc(42) int local42 = local6.aClass3_Sub2_Sub1_1.anInt2178;
		local6.aClass3_Sub2_Sub1_1.method2073(arg0);
		local6.aClass3_Sub2_Sub1_1.method2065(Static456.anInt7118);
		local6.aClass3_Sub2_Sub1_1.anInt2178 += 7;
		local6.aClass3_Sub2_Sub1_1.method2021(local38, local6.aClass3_Sub2_Sub1_1.anInt2178, local42);
		local6.aClass3_Sub2_Sub1_1.method2076(local6.aClass3_Sub2_Sub1_1.anInt2178 - local21);
		Static95.aClass292_1.method6855(local6);
		Static468.anInt7366 = -3;
		Static77.anInt1738 = 0;
		Static446.anInt6827 = 1;
		Static266.anInt4140 = 0;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
	public static void method2668() {
		if (Static580.aClass3_Sub22_24.aClass21_Sub21_2.method6042() != 2) {
			return;
		}
		@Pc(22) byte local22 = (byte) (Static247.anInt3877 - 4 & 0xFF);
		@Pc(26) int local26 = Static247.anInt3877 % Static497.anInt7926;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			for (local34 = 0; local34 < Static646.anInt9979; local34++) {
				Static153.aByteArrayArrayArray3[local28][local26][local34] = local22;
			}
		}
		if (Static723.anInt11225 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static694.anIntArray777[local34] = -1000000;
			Static650.anIntArray724[local34] = 1000000;
			Static502.anIntArray581[local34] = 0;
			Static267.anIntArray326[local34] = 1000000;
			Static196.anIntArray284[local34] = 0;
		}
		@Pc(108) int local108 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
		@Pc(119) int local119 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
		@Pc(180) int local180;
		if (Static262.anInt4081 != 1 && Static494.anInt7853 == -1) {
			local180 = Static77.method1633(Static263.anInt4101, Static305.anInt4908, Static723.anInt11225);
			if (local180 - Static490.anInt7687 < 3200 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][Static305.anInt4908 >> 9][Static263.anInt4101 >> 9] & 0x4) != 0) {
				Static677.method9030(1, Static263.anInt4101 >> 9, Static305.anInt4908 >> 9, Static448.aClass364ArrayArrayArray2, false);
				return;
			}
			return;
		}
		if (Static262.anInt4081 != 1) {
			local108 = Static494.anInt7853;
			local119 = Static358.anInt5640;
		}
		if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local108 >> 9][local119 >> 9] & 0x4) != 0) {
			Static677.method9030(0, local119 >> 9, local108 >> 9, Static448.aClass364ArrayArrayArray2, false);
		}
		if (Static171.anInt8707 >= 2560) {
			return;
		}
		local180 = Static305.anInt4908 >> 9;
		@Pc(184) int local184 = Static263.anInt4101 >> 9;
		@Pc(188) int local188 = local108 >> 9;
		@Pc(192) int local192 = local119 >> 9;
		@Pc(204) int local204;
		if (local180 >= local188) {
			local204 = local180 - local188;
		} else {
			local204 = local188 - local180;
		}
		@Pc(223) int local223;
		if (local192 <= local184) {
			local223 = local184 - local192;
		} else {
			local223 = local192 - local184;
		}
		if ((local204 != 0 || local223 != 0) && local204 > -Static497.anInt7926 && local204 < Static497.anInt7926 && local223 > -Static646.anInt9979 && local223 < Static646.anInt9979) {
			@Pc(309) int local309;
			@Pc(311) int local311;
			if (local204 <= local223) {
				local309 = local204 * 65536 / local223;
				local311 = 32768;
				while (local184 != local192) {
					if (local192 > local184) {
						local184++;
					} else if (local184 > local192) {
						local184--;
					}
					if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local180][local184] & 0x4) != 0) {
						Static677.method9030(1, local184, local180, Static448.aClass364ArrayArrayArray2, false);
						return;
					}
					local311 += local309;
					if (local311 >= 65536) {
						local311 -= 65536;
						if (local188 > local180) {
							local180++;
						} else if (local180 > local188) {
							local180--;
						}
						if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local180][local184] & 0x4) != 0) {
							Static677.method9030(1, local184, local180, Static448.aClass364ArrayArrayArray2, false);
							return;
						}
					}
				}
				return;
			}
			local309 = local223 * 65536 / local204;
			local311 = 32768;
			while (local188 != local180) {
				if (local180 < local188) {
					local180++;
				} else if (local180 > local188) {
					local180--;
				}
				if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local180][local184] & 0x4) != 0) {
					Static677.method9030(1, local184, local180, Static448.aClass364ArrayArrayArray2, false);
					return;
				}
				local311 += local309;
				if (local311 >= 65536) {
					local311 -= 65536;
					if (local192 > local184) {
						local184++;
					} else if (local192 < local184) {
						local184--;
					}
					if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local180][local184] & 0x4) != 0) {
						Static677.method9030(1, local184, local180, Static448.aClass364ArrayArrayArray2, false);
						return;
					}
				}
			}
			return;
		}
		Static275.method4893("RC: " + local180 + "," + local184 + " " + local188 + "," + local192 + " " + Static291.anInt4448 + "," + Static189.anInt3243, (Throwable) null);
		return;
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)I")
	public static int method2669() {
		return (int) (1000000000L / Static365.aLong196);
	}
}
