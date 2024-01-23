import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt4981;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[Lclient!re;")
	public static Class150[] aClass150Array2;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
	public static int anInt4996 = 2;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!g;I)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) int arg3) {
		Static220.method3662();
		if (Static116.aBoolean184) {
			Static111.method1895(arg3, arg1, arg3 + arg2.anInt2057, arg2.anInt2031 + arg1);
		} else {
			Static77.method1444(arg3, arg1, arg2.anInt2057 + arg3, arg2.anInt2031 + arg1);
		}
		if (Static180.anInt3906 != 2 && Static180.anInt3906 != 5 && Static58.aClass2_Sub8_Sub1_6 != null) {
			@Pc(66) int local66;
			@Pc(63) int local63;
			@Pc(73) int local73;
			@Pc(69) int local69;
			if (Static16.anInt342 == 4) {
				local66 = Static279.anInt5490;
				local63 = (int) Static239.aFloat51 & 0x7FF;
				local69 = Static75.anInt1869;
				local73 = 256;
			} else {
				local63 = (int) Static239.aFloat51 + Static301.anInt5810 & 0x7FF;
				local66 = Static22.aClass15_Sub2_Sub2_1.anInt5371;
				local69 = Static22.aClass15_Sub2_Sub2_1.anInt5358;
				local73 = Static141.anInt3097 + 256;
			}
			@Pc(93) int local93 = 464 - local66 / 32;
			@Pc(101) int local101 = local69 / 32 + 48;
			if (Static116.aBoolean184) {
				((Class2_Sub8_Sub1_Sub2) Static58.aClass2_Sub8_Sub1_6).method4378(arg3, arg1, arg2.anInt2057, arg2.anInt2031, local101, local93, local63, local73, (Class2_Sub8_Sub1_Sub2) arg2.method1555(false));
			} else {
				((Class2_Sub8_Sub1_Sub1) Static58.aClass2_Sub8_Sub1_6).method2785(arg3, arg1, arg2.anInt2057, arg2.anInt2031, local101, local93, local63, local73, arg2.anIntArray181, arg2.anIntArray176);
			}
			@Pc(193) int local193;
			@Pc(181) int local181;
			@Pc(227) int local227;
			@Pc(216) int local216;
			if (Static27.aClass57_7 != null) {
				for (@Pc(145) int local145 = 0; local145 < Static27.aClass57_7.anInt2126; local145++) {
					if (Static27.aClass57_7.aClass2_Sub8_Sub21Array1[local145] != null && Static27.aClass57_7.anIntArray193[local145] >> 28 == Static32.anInt876) {
						local181 = (Static27.aClass57_7.anIntArray193[local145] & 0x3FFF) - Static234.anInt4705;
						local193 = (Static27.aClass57_7.anIntArray193[local145] >> 14 & 0x3FFF) - Static160.anInt5159;
						if (local193 >= 0 && local193 < 104 && local181 >= 0 && local181 < 104) {
							local216 = local181 * 4 + 2 - local66 / 32;
							local227 = local193 * 4 + 2 - local69 / 32;
							Static132.method2434(arg2, local216, arg1, local227, Static27.aClass57_7.aClass2_Sub8_Sub21Array1[local145].anInt4970, arg3);
						}
					}
				}
			}
			for (local193 = 0; local193 < Static277.anInt5481; local193++) {
				local227 = Static263.anIntArray494[local193] * 4 + 2 - local66 / 32;
				local181 = Static81.anIntArray166[local193] * 4 + 2 - local69 / 32;
				@Pc(283) Class146 local283 = Static10.method158(Static120.anIntArray234[local193]);
				if (local283.anIntArray467 != null) {
					local283 = local283.method3815();
					if (local283 == null || local283.anInt4723 == -1) {
						continue;
					}
				}
				Static132.method2434(arg2, local227, arg1, local181, local283.anInt4723, arg3);
			}
			@Pc(354) int local354;
			for (local193 = 0; local193 < 104; local193++) {
				for (local181 = 0; local181 < 104; local181++) {
					@Pc(330) Class44 local330 = Static121.aClass44ArrayArrayArray1[Static32.anInt876][local193][local181];
					if (local330 != null) {
						local216 = local193 * 4 + 2 - local69 / 32;
						local354 = local181 * 4 + 2 - local66 / 32;
						Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[0], arg2, local216, arg3, local354, arg1);
					}
				}
			}
			for (local193 = 0; local193 < Static57.anInt1448; local193++) {
				@Pc(385) Class15_Sub2_Sub1 local385 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local193]];
				if (local385 != null && local385.method4282()) {
					@Pc(396) Class188 local396 = local385.aClass188_1;
					if (local396 != null && local396.anIntArray572 != null) {
						local396 = local396.method4618();
					}
					if (local396 != null && local396.aBoolean389 && local396.aBoolean392) {
						local216 = local385.anInt5358 / 32 - local69 / 32;
						local354 = local385.anInt5371 / 32 - local66 / 32;
						if (local396.anInt5882 == -1) {
							Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[1], arg2, local216, arg3, local354, arg1);
						} else {
							Static132.method2434(arg2, local354, arg1, local216, local396.anInt5882, arg3);
						}
					}
				}
			}
			@Pc(504) int local504;
			for (local193 = 0; local193 < Static191.anInt4008; local193++) {
				@Pc(475) Class15_Sub2_Sub2 local475 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local193]];
				if (local475 != null && local475.method4282()) {
					local227 = local475.anInt5358 / 32 - local69 / 32;
					local216 = local475.anInt5371 / 32 - local66 / 32;
					@Pc(502) boolean local502 = false;
					for (local504 = 0; local504 < Static41.anInt999; local504++) {
						if (local475.aString184.equals(Static222.aStringArray34[local504]) && Static102.anIntArray207[local504] != 0) {
							local502 = true;
							break;
						}
					}
					@Pc(528) boolean local528 = false;
					for (@Pc(530) int local530 = 0; local530 < Static284.anInt5619; local530++) {
						if (local475.aString184.equals(Static150.aClass165Array1[local530].aString176)) {
							local528 = true;
							break;
						}
					}
					@Pc(550) boolean local550 = false;
					if (Static22.aClass15_Sub2_Sub2_1.anInt5387 != 0 && local475.anInt5387 != 0 && local475.anInt5387 == Static22.aClass15_Sub2_Sub2_1.anInt5387) {
						local550 = true;
					}
					if (local502) {
						Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[3], arg2, local227, arg3, local216, arg1);
					} else if (local528) {
						Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[5], arg2, local227, arg3, local216, arg1);
					} else if (local550) {
						Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[4], arg2, local227, arg3, local216, arg1);
					} else {
						Static201.method3409(Static258.aClass2_Sub8_Sub1Array9[2], arg2, local227, arg3, local216, arg1);
					}
				}
			}
			@Pc(624) Class47[] local624 = Static308.aClass47Array1;
			for (local181 = 0; local181 < local624.length; local181++) {
				@Pc(638) Class47 local638 = local624[local181];
				if (local638 != null && local638.anInt1830 != 0 && Static268.anInt5236 % 20 < 10) {
					if (local638.anInt1830 == 1 && local638.anInt1838 >= 0 && Static35.aClass15_Sub2_Sub1Array2.length > local638.anInt1838) {
						@Pc(674) Class15_Sub2_Sub1 local674 = Static35.aClass15_Sub2_Sub1Array2[local638.anInt1838];
						if (local674 != null) {
							local354 = local674.anInt5358 / 32 - local69 / 32;
							local504 = local674.anInt5371 / 32 - local66 / 32;
							Static141.method2496(local638.anInt1845, 360000, local354, arg2, local504, arg3, arg1);
						}
					}
					if (local638.anInt1830 == 2) {
						local354 = (local638.anInt1832 - Static234.anInt4705) * 4 + 2 - local66 / 32;
						local216 = (local638.anInt1846 - Static160.anInt5159) * 4 + 2 - local69 / 32;
						local504 = local638.anInt1834 * 4;
						local504 *= local504;
						Static141.method2496(local638.anInt1845, local504, local216, arg2, local354, arg3, arg1);
					}
					if (local638.anInt1830 == 10 && local638.anInt1838 >= 0 && local638.anInt1838 < Static188.aClass15_Sub2_Sub2Array41.length) {
						@Pc(782) Class15_Sub2_Sub2 local782 = Static188.aClass15_Sub2_Sub2Array41[local638.anInt1838];
						if (local782 != null) {
							local354 = local782.anInt5358 / 32 - local69 / 32;
							local504 = local782.anInt5371 / 32 - local66 / 32;
							Static141.method2496(local638.anInt1845, 360000, local354, arg2, local504, arg3, arg1);
						}
					}
				}
			}
			if (Static16.anInt342 != 4) {
				if (Static302.anInt5847 != 0) {
					local193 = Static302.anInt5847 * 4 + (Static22.aClass15_Sub2_Sub2_1.method4286() + -1) * 2 + 2 - local69 / 32;
					local181 = Static269.anInt5272 * 4 + Static22.aClass15_Sub2_Sub2_1.method4286() * 2 + 2 - local66 / 32 - 2;
					Static201.method3409(Static134.aClass2_Sub8_Sub1Array5[Static34.aBoolean52 ? 1 : 0], arg2, local193, arg3, local181, arg1);
				}
				if (Static116.aBoolean184) {
					Static111.method1888(arg3 + arg2.anInt2057 / 2 - 1, arg2.anInt2031 / 2 + -1 + arg1, 3, 3, 16777215);
				} else {
					Static77.method1447(arg2.anInt2057 / 2 + arg3 - 1, arg2.anInt2031 / 2 + (arg1 - 1), 3, 3, 16777215);
				}
			}
		} else if (Static116.aBoolean184) {
			@Pc(934) Class2_Sub8_Sub1 local934 = arg2.method1555(false);
			if (local934 != null) {
				local934.method4364(arg3, arg1);
			}
		} else {
			Static77.method1449(arg3, arg1, arg2.anIntArray181, arg2.anIntArray176);
		}
		Static214.aBooleanArray19[arg0] = true;
	}
}
