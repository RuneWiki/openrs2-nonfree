import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public static int anInt6545;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!rk;")
	public static Class180 aClass180_98;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt6549 = -1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method5576() {
		Static157.aClass74_21 = new Class74();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method5577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 != null && local7.aClass22_Sub1_1 != null) {
			local7.aClass22_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method5578(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static2.anInt17 >= 100) {
			Static16.method2749(Static314.aString387);
			return;
		}
		@Pc(17) String local17 = Static142.method2873(arg0);
		if (local17 == null) {
			return;
		}
		@Pc(56) String local56;
		for (@Pc(22) int local22 = 0; local22 < Static2.anInt17; local22++) {
			@Pc(29) String local29 = Static142.method2873(Static76.aStringArray17[local22]);
			if (local29 != null && local29.equals(local17)) {
				Static16.method2749(arg0 + Static266.aString333);
				return;
			}
			if (Static77.aStringArray18[local22] != null) {
				local56 = Static142.method2873(Static77.aStringArray18[local22]);
				if (local56 != null && local56.equals(local17)) {
					Static16.method2749(arg0 + Static266.aString333);
					return;
				}
			}
		}
		for (@Pc(83) int local83 = 0; local83 < Static124.anInt2775; local83++) {
			local56 = Static142.method2873(Static64.aStringArray15[local83]);
			if (local56 != null && local56.equals(local17)) {
				Static16.method2749(Static237.aString296 + arg0 + Static200.aString258);
				return;
			}
			if (Static323.aStringArray49[local83] != null) {
				@Pc(119) String local119 = Static142.method2873(Static323.aStringArray49[local83]);
				if (local119 != null && local119.equals(local17)) {
					Static16.method2749(Static237.aString296 + arg0 + Static200.aString258);
					return;
				}
			}
		}
		if (Static142.method2873(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78).equals(local17)) {
			Static16.method2749(Static169.aString231);
		} else {
			Static29.aClass7_Sub3_Sub2_1.method2799(214);
			Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0) + 1);
			Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
			Static29.aClass7_Sub3_Sub2_1.method2735(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method5579() {
		for (@Pc(13) int local13 = 0; local13 < Static235.anInt4675; local13++) {
			@Pc(18) int local18 = Static32.anIntArray133[local13]--;
			if (Static32.anIntArray133[local13] >= -10) {
				@Pc(97) Class68 local97 = Static105.aClass68Array3[local13];
				if (local97 == null) {
					local97 = Static359.method1607(Static284.aClass180_77, Static51.anIntArray205[local13], 0);
					if (local97 == null) {
						continue;
					}
					Static32.anIntArray133[local13] += local97.method1604();
					Static105.aClass68Array3[local13] = local97;
				}
				if (Static32.anIntArray133[local13] < 0) {
					@Pc(222) int local222;
					if (Static138.anIntArray397[local13] == 0) {
						local222 = Static105.anIntArray754[local13] * Static110.anInt2524 >> 8;
					} else {
						@Pc(137) int local137 = (Static138.anIntArray397[local13] & 0xFF) * 128;
						@Pc(145) int local145 = Static138.anIntArray397[local13] >> 16 & 0xFF;
						@Pc(155) int local155 = local145 * 128 + 64 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(168) int local168 = Static138.anIntArray397[local13] >> 8 & 0xFF;
						@Pc(178) int local178 = local168 * 128 + 64 - Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967;
						if (local178 < 0) {
							local178 = -local178;
						}
						@Pc(189) int local189 = local155 + local178 - 128;
						if (local137 < local189) {
							Static32.anIntArray133[local13] = -100;
							continue;
						}
						if (local189 < 0) {
							local189 = 0;
						}
						local222 = Static105.anIntArray754[local13] * Static165.anInt3445 * (local137 - local189) / local137 >> 8;
					}
					if (local222 > 0) {
						@Pc(241) Class7_Sub20_Sub1 local241 = local97.method1606().method3185(Static292.aClass76_1);
						@Pc(246) Class7_Sub8_Sub4 local246 = Static367.method4955(local241, local222);
						local246.method4947(Static23.anIntArray726[local13] - 1);
						Static134.aClass7_Sub8_Sub3_2.method3895(local246);
					}
					Static32.anIntArray133[local13] = -100;
				}
			} else {
				Static235.anInt4675--;
				for (@Pc(34) int local34 = local13; local34 < Static235.anInt4675; local34++) {
					Static51.anIntArray205[local34] = Static51.anIntArray205[local34 + 1];
					Static105.aClass68Array3[local34] = Static105.aClass68Array3[local34 + 1];
					Static23.anIntArray726[local34] = Static23.anIntArray726[local34 + 1];
					Static32.anIntArray133[local34] = Static32.anIntArray133[local34 + 1];
					Static138.anIntArray397[local34] = Static138.anIntArray397[local34 + 1];
					Static105.anIntArray754[local34] = Static105.anIntArray754[local34 + 1];
				}
				local13--;
			}
		}
		if (Static85.aBoolean152 && !Static5.method66()) {
			if (Static254.anInt4943 != 0 && Static149.anInt3231 != -1) {
				Static226.method4018(Static149.anInt3231, Static226.aClass180_57, Static254.anInt4943);
			}
			Static85.aBoolean152 = false;
		} else if (Static254.anInt4943 != 0 && Static149.anInt3231 != -1 && !Static5.method66()) {
			Static29.aClass7_Sub3_Sub2_1.method2799(108);
			Static29.aClass7_Sub3_Sub2_1.method2765(Static149.anInt3231);
			Static149.anInt3231 = -1;
		}
	}
}
