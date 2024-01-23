import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "[Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1[] aClass1_Sub2_Sub4_Sub1Array2;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_79;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!lc;")
	public static Class79 aClass79_37 = new Class79(100);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public static int anInt5285 = 0;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!hb;")
	public static Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString376 = "Take";

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method4020() {
		if (Static254.method4105() != 2) {
			return;
		}
		@Pc(16) int local16 = Static82.anInt2220 % 104;
		@Pc(23) byte local23 = (byte) (Static82.anInt2220 - 4 & 0xFF);
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < 104; local29++) {
				Static132.aByteArrayArrayArray10[local25][local16][local29] = local23;
			}
		}
		if (Static137.anInt3321 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static13.anIntArray45[local29] = -1000000;
			Static212.anIntArray355[local29] = 1000000;
			Static101.anIntArray200[local29] = 0;
			Static86.anIntArray179[local29] = 1000000;
			Static4.anIntArray5[local29] = 0;
		}
		@Pc(128) int local128;
		if (Static61.anInt1682 != 1) {
			local128 = Static200.method3326(Static137.anInt3321, Static110.anInt2935, Static174.anInt4003);
			if (local128 - Static109.anInt2904 >= 800 || (Static145.aByteArrayArrayArray13[Static137.anInt3321][Static174.anInt4003 >> 7][Static110.anInt2935 >> 7] & 0x4) == 0) {
				return;
			}
			Static128.method2426(false, 1, Static142.aClass1_Sub16ArrayArrayArray4, Static110.anInt2935 >> 7, Static174.anInt4003 >> 7);
			return;
		}
		if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7][Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7] & 0x4) != 0) {
			Static128.method2426(false, 0, Static142.aClass1_Sub16ArrayArrayArray4, Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7, Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7);
		}
		if (Static200.anInt4412 >= 310) {
			return;
		}
		local128 = Static174.anInt4003 >> 7;
		@Pc(133) int local133 = Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7;
		@Pc(137) int local137 = Static110.anInt2935 >> 7;
		@Pc(149) int local149;
		if (local128 < local133) {
			local149 = local133 - local128;
		} else {
			local149 = local128 - local133;
		}
		@Pc(161) int local161 = Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7;
		@Pc(168) int local168;
		if (local137 < local161) {
			local168 = local161 - local137;
		} else {
			local168 = local137 - local161;
		}
		@Pc(184) int local184;
		@Pc(186) int local186;
		if (local149 > local168) {
			local184 = local168 * 65536 / local149;
			local186 = 32768;
			while (local133 != local128) {
				if (local128 < local133) {
					local128++;
				} else if (local128 > local133) {
					local128--;
				}
				if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][local128][local137] & 0x4) != 0) {
					Static128.method2426(false, 1, Static142.aClass1_Sub16ArrayArrayArray4, local137, local128);
					return;
				}
				local186 += local184;
				if (local186 >= 65536) {
					if (local161 > local137) {
						local137++;
					} else if (local161 < local137) {
						local137--;
					}
					local186 -= 65536;
					if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][local128][local137] & 0x4) != 0) {
						Static128.method2426(false, 1, Static142.aClass1_Sub16ArrayArrayArray4, local137, local128);
						return;
					}
				}
			}
			return;
		}
		local184 = local149 * 65536 / local168;
		local186 = 32768;
		while (local137 != local161) {
			if (local137 < local161) {
				local137++;
			} else if (local161 < local137) {
				local137--;
			}
			if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][local128][local137] & 0x4) != 0) {
				Static128.method2426(false, 1, Static142.aClass1_Sub16ArrayArrayArray4, local137, local128);
				return;
			}
			local186 += local184;
			if (local186 >= 65536) {
				if (local133 > local128) {
					local128++;
				} else if (local128 > local133) {
					local128--;
				}
				local186 -= 65536;
				if ((Static145.aByteArrayArrayArray13[Static137.anInt3321][local128][local137] & 0x4) != 0) {
					Static128.method2426(false, 1, Static142.aClass1_Sub16ArrayArrayArray4, local137, local128);
					return;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!hc;I)Lclient!ug;")
	public static Class1_Sub29 method4021(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(4) byte[] local4 = arg1.method1863(arg0);
		return local4 == null ? null : new Class1_Sub29(local4);
	}
}
