import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString62 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
	public static void method971() {
		for (@Pc(1) int local1 = 0; local1 < Static95.anInt1928; local1++) {
			@Pc(8) Class161 local8 = Static220.aClass161Array1[local1];
			Static26.method438(local8);
			Static220.aClass161Array1[local1] = null;
		}
		Static95.anInt1928 = 0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIILclient!hi;)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class66 arg3) {
		Static115.method2067();
		if (Static156.aBoolean211) {
			Static119.method2138(arg0, arg2, arg0 + arg3.anInt2204, arg2 - -arg3.anInt2207);
		} else {
			Static25.method401(arg0, arg2, arg3.anInt2204 + arg0, arg3.anInt2207 + arg2);
		}
		if (Static12.anInt176 != 2 && Static12.anInt176 != 5 && Static15.aClass1_Sub2_Sub1_1 != null) {
			@Pc(80) int local80 = Static189.anInt3613 + (int) Static49.aFloat32 & 0x7FF;
			@Pc(90) int local90 = Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32 + 48;
			@Pc(100) int local100 = 464 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
			if (Static156.aBoolean211) {
				((Class1_Sub2_Sub1_Sub1) Static15.aClass1_Sub2_Sub1_1).method2603(arg0, arg2, arg3.anInt2204, arg3.anInt2207, local90, local100, local80, Static309.anInt5618 + 256, (Class1_Sub2_Sub1_Sub1) arg3.method1920(false));
			} else {
				((Class1_Sub2_Sub1_Sub2) Static15.aClass1_Sub2_Sub1_1).method3860(arg0, arg2, arg3.anInt2204, arg3.anInt2207, local90, local100, local80, Static309.anInt5618 + 256, arg3.anIntArray198, arg3.anIntArray190);
			}
			@Pc(182) int local182;
			@Pc(192) int local192;
			@Pc(231) int local231;
			@Pc(220) int local220;
			if (Static228.aClass150_2 != null) {
				for (@Pc(148) int local148 = 0; local148 < Static228.aClass150_2.anInt4326; local148++) {
					if (Static228.aClass150_2.aClass1_Sub2_Sub12Array1[local148] != null && Static228.aClass150_2.anIntArray369[local148] >> 28 == Static65.anInt1300) {
						local182 = (Static228.aClass150_2.anIntArray369[local148] >> 14 & 0x3FFF) - Static199.anInt3817;
						local192 = (Static228.aClass150_2.anIntArray369[local148] & 0x3FFF) - Static192.anInt3637;
						if (local182 >= 0 && local182 < 104 && local192 >= 0 && local192 < 104) {
							local220 = local192 * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
							local231 = local182 * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
							Static221.method3447(local220, arg3, local231, Static228.aClass150_2.aClass1_Sub2_Sub12Array1[local148].anInt3591, arg2, arg0);
						}
					}
				}
			}
			for (local182 = 0; local182 < Static287.anInt5146; local182++) {
				local231 = Static138.anIntArray234[local182] * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
				local192 = Static239.anIntArray370[local182] * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
				@Pc(291) Class71 local291 = Static255.method4052(Static97.anIntArray171[local182]);
				if (local291.anIntArray209 != null) {
					local291 = local291.method2039();
					if (local291 == null || local291.anInt2357 == -1) {
						continue;
					}
				}
				Static221.method3447(local231, arg3, local192, local291.anInt2357, arg2, arg0);
			}
			@Pc(367) int local367;
			for (local182 = 0; local182 < 104; local182++) {
				for (local192 = 0; local192 < 104; local192++) {
					@Pc(341) Class59 local341 = Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local182][local192];
					if (local341 != null) {
						local220 = local182 * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
						local367 = local192 * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
						Static17.method244(arg2, arg0, arg3, local367, Static294.aClass1_Sub2_Sub1Array8[0], local220);
					}
				}
			}
			for (local182 = 0; local182 < Static85.anInt1689; local182++) {
				@Pc(398) Class15_Sub5_Sub1 local398 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local182]];
				if (local398 != null && local398.method4685()) {
					@Pc(407) Class99 local407 = local398.aClass99_1;
					if (local407 != null && local407.anIntArray255 != null) {
						local407 = local407.method2647();
					}
					if (local407 != null && local407.aBoolean188 && local407.aBoolean192) {
						local220 = local398.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
						local367 = local398.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
						if (local407.anInt3045 == -1) {
							Static17.method244(arg2, arg0, arg3, local367, Static294.aClass1_Sub2_Sub1Array8[1], local220);
						} else {
							Static221.method3447(local367, arg3, local220, local407.anInt3045, arg2, arg0);
						}
					}
				}
			}
			for (local182 = 0; local182 < Static304.anInt5394; local182++) {
				@Pc(494) Class15_Sub5_Sub2 local494 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local182]];
				if (local494 != null && local494.method4685()) {
					local231 = local494.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
					local220 = local494.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
					@Pc(524) boolean local524 = false;
					@Pc(529) long local529 = Static124.method4681(local494.aString336);
					for (@Pc(531) int local531 = 0; local531 < Static120.anInt2510; local531++) {
						if (local529 == Static204.aLongArray10[local531] && Static170.anIntArray283[local531] != 0) {
							local524 = true;
							break;
						}
					}
					@Pc(557) boolean local557 = false;
					for (@Pc(559) int local559 = 0; local559 < Static140.anInt5208; local559++) {
						if (Static245.aClass1_Sub6Array1[local559].aLong214 == local529) {
							local557 = true;
							break;
						}
					}
					@Pc(583) boolean local583 = false;
					if (Static90.aClass15_Sub5_Sub2_2.anInt5622 != 0 && local494.anInt5622 != 0 && Static90.aClass15_Sub5_Sub2_2.anInt5622 == local494.anInt5622) {
						local583 = true;
					}
					if (local524) {
						Static17.method244(arg2, arg0, arg3, local220, Static294.aClass1_Sub2_Sub1Array8[3], local231);
					} else if (local557) {
						Static17.method244(arg2, arg0, arg3, local220, Static294.aClass1_Sub2_Sub1Array8[5], local231);
					} else if (local583) {
						Static17.method244(arg2, arg0, arg3, local220, Static294.aClass1_Sub2_Sub1Array8[4], local231);
					} else {
						Static17.method244(arg2, arg0, arg3, local220, Static294.aClass1_Sub2_Sub1Array8[2], local231);
					}
				}
			}
			@Pc(666) Class134[] local666 = Static290.aClass134Array1;
			for (local192 = 0; local192 < local666.length; local192++) {
				@Pc(676) Class134 local676 = local666[local192];
				if (local676 != null && local676.anInt4007 != 0 && Static313.anInt2966 % 20 < 10) {
					@Pc(729) int local729;
					if (local676.anInt4007 == 1 && local676.anInt4011 >= 0 && local676.anInt4011 < Static83.aClass15_Sub5_Sub1Array1.length) {
						@Pc(715) Class15_Sub5_Sub1 local715 = Static83.aClass15_Sub5_Sub1Array1[local676.anInt4011];
						if (local715 != null) {
							local729 = local715.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
							local367 = local715.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
							Static236.method3650(arg2, local729, arg3, arg0, local676.anInt4018, local367, 360000);
						}
					}
					if (local676.anInt4007 == 2) {
						local220 = (local676.anInt4012 - Static199.anInt3817) * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
						local367 = (local676.anInt4006 + -Static192.anInt3637) * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
						local729 = local676.anInt4013 * 4;
						local729 *= local729;
						Static236.method3650(arg2, local367, arg3, arg0, local676.anInt4018, local220, local729);
					}
					if (local676.anInt4007 == 10 && local676.anInt4011 >= 0 && local676.anInt4011 < Static17.aClass15_Sub5_Sub2Array1.length) {
						@Pc(834) Class15_Sub5_Sub2 local834 = Static17.aClass15_Sub5_Sub2Array1[local676.anInt4011];
						if (local834 != null) {
							local729 = local834.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
							local367 = local834.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
							Static236.method3650(arg2, local729, arg3, arg0, local676.anInt4018, local367, 360000);
						}
					}
				}
			}
			if (Static162.anInt3171 != 0) {
				local182 = Static162.anInt3171 * 4 + (Static90.aClass15_Sub5_Sub2_2.method4702() + -1) * 2 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
				local192 = Static196.anInt3703 * 4 + Static90.aClass15_Sub5_Sub2_2.method4702() * 2 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32 - 2;
				Static17.method244(arg2, arg0, arg3, local192, Static175.aClass1_Sub2_Sub1Array7[Static52.aBoolean381 ? 1 : 0], local182);
			}
			if (Static156.aBoolean211) {
				Static119.method2129(arg0 + arg3.anInt2204 / 2 - 1, arg3.anInt2207 / 2 + -1 + arg2, 3, 3, 16777215);
			} else {
				Static25.method385(arg0 + arg3.anInt2204 / 2 - 1, arg3.anInt2207 / 2 + -1 + arg2, 3, 3, 16777215);
			}
		} else if (Static156.aBoolean211) {
			@Pc(53) Class1_Sub2_Sub1 local53 = arg3.method1920(false);
			if (local53 != null) {
				local53.method3839(arg0, arg2);
			}
		} else {
			Static25.method387(arg0, arg2, arg3.anIntArray198, arg3.anIntArray190);
		}
		Static116.aBooleanArray8[arg1] = true;
	}
}
