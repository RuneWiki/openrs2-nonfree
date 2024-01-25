import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt5169;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_46 = new Class5(20);

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	public static int anInt5170 = -1;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[Lclient!iu;")
	public static final Class3_Sub3_Sub13[] aClass3_Sub3_Sub13Array4 = new Class3_Sub3_Sub13[14];

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!oe;")
	public static final Class173 aClass173_2 = new Class173(16);

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt5171 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method4136() {
		for (@Pc(5) int local5 = 0; local5 < Static453.anInt7682; local5++) {
			@Pc(10) int local10 = Static29.anIntArray56[local5];
			@Pc(14) Class1_Sub3_Sub3_Sub2 local14 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local10];
			if (local14 != null) {
				Static345.method4952(local14.aClass47_1.anInt1578, local14);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method4137() {
		if (Static123.aClass21_Sub1_1.method790(Static347.anInt6318) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static164.anInt3507 - 4 & 0xFF);
		@Pc(25) int local25 = Static164.anInt3507 % Static399.anInt6923;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static127.anInt2696; local36++) {
				Static344.aByteArrayArrayArray16[local32][local25][local36] = local21;
			}
		}
		if (Static124.anInt2688 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static116.anIntArray477[local36] = -1000000;
			Static158.anIntArray257[local36] = 1000000;
			Static348.anIntArray563[local36] = 0;
			Static83.anIntArray161[local36] = 1000000;
			Static430.anIntArray518[local36] = 0;
		}
		@Pc(103) int local103;
		if (Static107.anInt2382 != 1) {
			local103 = Static124.method2209(Static124.anInt2688, Static398.anInt6901, Static80.anInt1722);
			if (local103 - Static422.anInt7281 < 800 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][Static398.anInt6901 >> 7][Static80.anInt1722 >> 7] & 0x4) != 0) {
				Static32.method785(Static398.anInt6901 >> 7, Static151.aClass217ArrayArrayArray3, Static80.anInt1722 >> 7, false, 1);
				return;
			}
			return;
		}
		if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7][Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7] & 0x4) != 0) {
			Static32.method785(Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7, Static151.aClass217ArrayArrayArray3, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7, false, 0);
		}
		if (Static141.anInt3177 >= 2560) {
			return;
		}
		local103 = Static398.anInt6901 >> 7;
		@Pc(179) int local179 = Static80.anInt1722 >> 7;
		@Pc(184) int local184 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7;
		@Pc(189) int local189 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7;
		@Pc(196) int local196;
		if (local103 < local184) {
			local196 = local184 - local103;
		} else {
			local196 = local103 - local184;
		}
		@Pc(210) int local210;
		if (local189 > local179) {
			local210 = local189 - local179;
		} else {
			local210 = local179 - local189;
		}
		if (local196 == 0 && local210 == 0 || local196 <= -Static399.anInt6923 || local196 >= Static399.anInt6923 || local210 <= -Static127.anInt2696 || Static127.anInt2696 <= local210) {
			Static379.method1671(null, "RC: " + local103 + "," + local179 + " " + local184 + "," + local189 + " " + Static108.anInt3458 + "," + Static339.anInt6223);
			return;
		}
		@Pc(291) int local291;
		@Pc(293) int local293;
		if (local196 > local210) {
			local291 = local210 * 65536 / local196;
			local293 = 32768;
			while (local103 != local184) {
				if (local103 < local184) {
					local103++;
				} else if (local184 < local103) {
					local103--;
				}
				if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][local103][local179] & 0x4) != 0) {
					Static32.method785(local103, Static151.aClass217ArrayArrayArray3, local179, false, 1);
					return;
				}
				local293 += local291;
				if (local293 >= 65536) {
					local293 -= 65536;
					if (local189 > local179) {
						local179++;
					} else if (local179 > local189) {
						local179--;
					}
					if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][local103][local179] & 0x4) != 0) {
						Static32.method785(local103, Static151.aClass217ArrayArrayArray3, local179, false, 1);
						return;
					}
				}
			}
			return;
		}
		local291 = local196 * 65536 / local210;
		local293 = 32768;
		while (local179 != local189) {
			if (local189 > local179) {
				local179++;
			} else if (local189 < local179) {
				local179--;
			}
			if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][local103][local179] & 0x4) != 0) {
				Static32.method785(local103, Static151.aClass217ArrayArrayArray3, local179, false, 1);
				return;
			}
			local293 += local291;
			if (local293 >= 65536) {
				if (local184 > local103) {
					local103++;
				} else if (local103 > local184) {
					local103--;
				}
				local293 -= 65536;
				if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][local103][local179] & 0x4) != 0) {
					Static32.method785(local103, Static151.aClass217ArrayArrayArray3, local179, false, 1);
					return;
				}
			}
		}
	}
}
