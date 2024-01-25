import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt3565;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
	public static boolean aBoolean267;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public static int anInt3548 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ab;Lclient!oj;IIZ)V")
	public static void method3094(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class8 local10 = arg0.method45(arg1);
		if (local10 == null) {
			return;
		}
		arg1.method2496(arg3, arg2, arg0.anInt64 + arg3, arg2 + arg0.anInt116);
		if (Static55.anInt1202 == 2 || Static55.anInt1202 == 5 || Static93.aClass27_10 == null) {
			arg1.method2513(local10, arg3, arg2);
			return;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(59) int local59;
		@Pc(51) int local51;
		if (Static198.anInt4108 == 4) {
			local51 = 4096;
			local53 = Static124.anInt4240;
			local59 = (int) -Static350.aFloat74 & 0x3FFF;
			local61 = Static273.anInt5127;
		} else {
			local51 = 4096 - Static59.anInt1283 * 16;
			local61 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798;
			local53 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800;
			local59 = (int) -Static350.aFloat74 + Static319.anInt5841 & 0x3FFF;
		}
		@Pc(96) int local96 = local53 / 32 + 48 + 208 - Static89.anInt1891 * 2;
		@Pc(113) int local113 = Static85.anInt1839 * 4 + 48 + 208 - local61 / 32 - Static85.anInt1839 * 2;
		Static93.aClass27_10.method5324((float) arg0.anInt64 / 2.0F + (float) arg3, (float) arg0.anInt116 / 2.0F + (float) arg2, (float) local96, (float) local113, local51, local59 << 2, local10, arg3, arg2);
		@Pc(163) int local163;
		@Pc(172) int local172;
		@Pc(182) int local182;
		@Pc(192) int local192;
		for (@Pc(147) Class2_Sub16 local147 = (Class2_Sub16) Static230.aClass238_23.method5795(); local147 != null; local147 = (Class2_Sub16) Static230.aClass238_23.method5799()) {
			@Pc(152) int local152 = local147.anInt2601;
			local163 = (Static206.aClass215_2.anIntArray533[local152] >> 14 & 0x3FFF) - Static279.anInt5198;
			local172 = (Static206.aClass215_2.anIntArray533[local152] & 0x3FFF) - Static350.anInt6470;
			local182 = local163 * 4 + 2 - local53 / 32;
			local192 = local172 * 4 + 2 - local61 / 32;
			Static2.method6063(local192, local10, arg2, Static206.aClass215_2.anIntArray532[local152], arg0, local182, arg3, arg1);
		}
		for (local163 = 0; local163 < Static269.anInt5104; local163++) {
			local172 = Static342.anIntArray539[local163] * 4 + 2 - local53 / 32;
			local182 = Static52.anIntArray223[local163] * 4 + 2 - local61 / 32;
			@Pc(248) Class47 local248 = Static230.aClass96_4.method2303(Static312.anIntArray500[local163]);
			if (local248.anIntArray95 != null) {
				local248 = local248.method903(Static179.aClass115_1);
				if (local248 == null || local248.anInt1251 == -1) {
					continue;
				}
			}
			Static2.method6063(local182, local10, arg2, local248.anInt1251, arg0, local172, arg3, arg1);
		}
		for (@Pc(289) Class2_Sub30 local289 = (Class2_Sub30) Static301.aClass243_24.method5975(); local289 != null; local289 = (Class2_Sub30) Static301.aClass243_24.method5973()) {
			local182 = (int) (local289.aLong213 >> 28 & 0x3L);
			if (Static278.anInt5164 == local182) {
				local192 = (int) (local289.aLong213 & 0x3FFFL) * 4 + 2 - local53 / 32;
				@Pc(337) int local337 = (int) (local289.aLong213 >> 14 & 0x3FFFL) * 4 + 2 - local61 / 32;
				Static294.method4826(local192, local10, local337, arg3, Static321.aClass27Array53[0], arg2, arg0);
			}
		}
		@Pc(411) int local411;
		for (local182 = 0; local182 < Static123.anInt5933; local182++) {
			@Pc(365) Class1_Sub2_Sub1_Sub2 local365 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local182]];
			if (local365 != null && local365.method4809() && local365.aByte73 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
				@Pc(383) Class197 local383 = local365.aClass197_1;
				if (local383 != null && local383.anIntArray468 != null) {
					local383 = local383.method4832(Static179.aClass115_1);
				}
				if (local383 != null && local383.aBoolean404 && local383.aBoolean407) {
					local411 = local365.anInt6800 / 32 - local53 / 32;
					@Pc(421) int local421 = local365.anInt6798 / 32 - local61 / 32;
					if (local383.anInt5508 == -1) {
						Static294.method4826(local411, local10, local421, arg3, Static321.aClass27Array53[1], arg2, arg0);
					} else {
						Static2.method6063(local421, local10, arg2, local383.anInt5508, arg0, local411, arg3, arg1);
					}
				}
			}
		}
		local192 = Static97.anInt2139;
		@Pc(461) int[] local461 = Static321.anIntArray512;
		@Pc(499) int local499;
		@Pc(509) int local509;
		@Pc(513) int local513;
		for (local411 = 0; local411 < local192; local411++) {
			@Pc(471) Class1_Sub2_Sub1_Sub1 local471 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local461[local411]];
			if (local471 != null && local471.method700() && Static182.aClass1_Sub2_Sub1_Sub1_1 != local471 && local471.aByte73 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
				local499 = local471.anInt6800 / 32 - local53 / 32;
				local509 = local471.anInt6798 / 32 - local61 / 32;
				@Pc(511) boolean local511 = false;
				for (local513 = 0; local513 < Static139.anInt2976; local513++) {
					if (local471.aString12.equals(Static30.aStringArray6[local513]) && Static23.anIntArray42[local513] != 0) {
						local511 = true;
						break;
					}
				}
				@Pc(536) boolean local536 = false;
				for (@Pc(538) int local538 = 0; local538 < Static29.anInt438; local538++) {
					if (local471.aString12.equals(Static43.aClass163Array2[local538].aString40)) {
						local536 = true;
						break;
					}
				}
				@Pc(558) boolean local558 = false;
				if (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt970 != 0 && local471.anInt970 != 0 && Static182.aClass1_Sub2_Sub1_Sub1_1.anInt970 == local471.anInt970) {
					local558 = true;
				}
				if (local511) {
					Static294.method4826(local499, local10, local509, arg3, Static321.aClass27Array53[3], arg2, arg0);
				} else if (local536) {
					Static294.method4826(local499, local10, local509, arg3, Static321.aClass27Array53[5], arg2, arg0);
				} else if (local558) {
					Static294.method4826(local499, local10, local509, arg3, Static321.aClass27Array53[4], arg2, arg0);
				} else {
					Static294.method4826(local499, local10, local509, arg3, Static321.aClass27Array53[2], arg2, arg0);
				}
			}
		}
		@Pc(637) Class247[] local637 = Static16.aClass247Array1;
		@Pc(722) int local722;
		for (local499 = 0; local499 < local637.length; local499++) {
			@Pc(645) Class247 local645 = local637[local499];
			if (local645 != null && local645.anInt6960 != 0 && Static339.anInt6265 % 20 < 10) {
				@Pc(694) int local694;
				if (local645.anInt6960 == 1 && local645.anInt6955 >= 0 && Static223.aClass1_Sub2_Sub1_Sub2Array1.length > local645.anInt6955) {
					@Pc(672) Class1_Sub2_Sub1_Sub2 local672 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local645.anInt6955];
					if (local672 != null) {
						local513 = local672.anInt6800 / 32 - local53 / 32;
						local694 = local672.anInt6798 / 32 - local61 / 32;
						Static96.method1639(local513, arg3, arg0, arg2, 360000, local694, local10, local645.anInt6956);
					}
				}
				if (local645.anInt6960 == 2) {
					local722 = (local645.anInt6958 - Static279.anInt5198) * 4 + 2 - local53 / 32;
					local513 = (local645.anInt6957 - Static350.anInt6470) * 4 + 2 - local61 / 32;
					local694 = local645.anInt6963 * 4;
					local694 *= local694;
					Static96.method1639(local722, arg3, arg0, arg2, local694, local513, local10, local645.anInt6956);
				}
				if (local645.anInt6960 == 10 && local645.anInt6955 >= 0 && Static42.aClass1_Sub2_Sub1_Sub1Array1.length > local645.anInt6955) {
					@Pc(780) Class1_Sub2_Sub1_Sub1 local780 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local645.anInt6955];
					if (local780 != null) {
						local513 = local780.anInt6800 / 32 - local53 / 32;
						local694 = local780.anInt6798 / 32 - local61 / 32;
						Static96.method1639(local513, arg3, arg0, arg2, 360000, local694, local10, local645.anInt6956);
					}
				}
			}
		}
		if (Static198.anInt4108 == 4) {
			return;
		}
		if (Static391.anInt7123 != 0) {
			local509 = Static391.anInt7123 * 4 + Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() * 2 + 2 - local53 / 32 - 2;
			local722 = Static280.anInt5248 * 4 + Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() * 2 + 2 - local61 / 32 - 2;
			Static294.method4826(local509, local10, local722, arg3, Static220.aClass27Array38[Static177.aBoolean270 ? 1 : 0], arg2, arg0);
		}
		arg1.method2509(3, 3, arg0.anInt116 / 2 + arg2 - 1, -1, arg3 + arg0.anInt64 / 2 - 1);
		return;
	}
}
