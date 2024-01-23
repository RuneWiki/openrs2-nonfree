import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!jk;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!cg;")
	public static Class22 aClass22_21;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public static int anInt863 = -1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method795() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(28) int local28;
		if (Static138.anInt2729 == 78) {
			local12 = Static256.aClass4_Sub24_Sub1_3.method3094();
			local16 = local12 & 0x3;
			local20 = local12 >> 2;
			local24 = Static230.anIntArray374[local20];
			local28 = Static256.aClass4_Sub24_Sub1_3.method3101();
			local36 = (local28 >> 4 & 0x7) + Static257.anInt5058;
			local42 = Static260.anInt5846 + (local28 & 0x7);
			local46 = Static256.aClass4_Sub24_Sub1_3.method3085();
			if (local36 >= 0 && local42 >= 0 && local36 < 104 && local42 < 104) {
				Static211.method3083(-1, local24, 0, local36, local42, local20, Static222.anInt4467, local46, local16);
			}
		} else if (Static138.anInt2729 == 17) {
			local12 = Static256.aClass4_Sub24_Sub1_3.method3094();
			local20 = local12 >> 2;
			local24 = Static230.anIntArray374[local20];
			local16 = local12 & 0x3;
			local28 = Static256.aClass4_Sub24_Sub1_3.method3094();
			local42 = (local28 & 0x7) + Static260.anInt5846;
			local36 = (local28 >> 4 & 0x7) + Static257.anInt5058;
			if (local36 >= 0 && local42 >= 0 && local36 < 104 && local42 < 104) {
				Static211.method3083(-1, local24, 0, local36, local42, local20, Static222.anInt4467, -1, local16);
			}
		} else if (Static138.anInt2729 == 191) {
			local12 = Static256.aClass4_Sub24_Sub1_3.method3085();
			local20 = Static256.aClass4_Sub24_Sub1_3.method3110();
			local16 = (local20 >> 4 & 0x7) + Static257.anInt5058;
			local24 = Static260.anInt5846 + (local20 & 0x7);
			local28 = Static256.aClass4_Sub24_Sub1_3.method3096();
			local36 = Static256.aClass4_Sub24_Sub1_3.method3074();
			if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104 && Static169.anInt3387 != local12) {
				@Pc(201) Class13_Sub6 local201 = new Class13_Sub6();
				local201.anInt4616 = local36;
				local201.anInt4615 = local28;
				if (Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local16][local24] == null) {
					Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local16][local24] = new Class17();
				}
				Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local16][local24].method619(new Class4_Sub2_Sub3(local201));
				Static44.method846(local24, local16);
			}
		} else {
			@Pc(300) int local300;
			@Pc(306) int local306;
			@Pc(318) int local318;
			if (Static138.anInt2729 == 138) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3058();
				local20 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local16 = local20 >> 2;
				local24 = local20 & 0x3;
				@Pc(275) byte local275 = Static256.aClass4_Sub24_Sub1_3.method3107();
				local36 = Static256.aClass4_Sub24_Sub1_3.method3108();
				local42 = Static256.aClass4_Sub24_Sub1_3.method3094();
				local46 = (local42 >> 4 & 0x7) + Static257.anInt5058;
				local300 = Static260.anInt5846 + (local42 & 0x7);
				local306 = Static256.aClass4_Sub24_Sub1_3.method3108();
				@Pc(310) byte local310 = Static256.aClass4_Sub24_Sub1_3.method3107();
				@Pc(314) byte local314 = Static256.aClass4_Sub24_Sub1_3.method3119();
				local318 = Static256.aClass4_Sub24_Sub1_3.method3074();
				@Pc(324) byte local324 = Static256.aClass4_Sub24_Sub1_3.method3069();
				if (!Static251.aBoolean330) {
					Static226.method3574(local318, local24, local275, local306, local310, local46, local36, local324, local16, local300, local314, local12);
				}
			}
			@Pc(410) int local410;
			@Pc(416) int local416;
			@Pc(494) Class13_Sub3 local494;
			if (Static138.anInt2729 == 224) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local20 = Static257.anInt5058 * 2 + (local12 >> 4 & 0xF);
				local16 = Static260.anInt5846 * 2 + (local12 & 0xF);
				local24 = Static256.aClass4_Sub24_Sub1_3.method3069() + local20;
				local28 = Static256.aClass4_Sub24_Sub1_3.method3069() + local16;
				local36 = Static256.aClass4_Sub24_Sub1_3.method3072();
				local42 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local46 = Static256.aClass4_Sub24_Sub1_3.method3110() * 4;
				local300 = Static256.aClass4_Sub24_Sub1_3.method3110() * 4;
				local306 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local410 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local416 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local416 == 255) {
					local416 = -1;
				}
				local318 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local20 >= 0 && local16 >= 0 && local20 < 208 && local16 < 208 && local24 >= 0 && local28 >= 0 && local24 < 208 && local28 < 208 && local42 != 65535) {
					local16 *= 64;
					local20 = local20 * 64;
					local494 = new Class13_Sub3(local42, Static222.anInt4467, local20, local16, Static58.method2504(local16, local20, Static222.anInt4467) - local46, local306 + Static50.anInt1118, Static50.anInt1118 + local410, local416, local318, local36, local300);
					local24 = local24 * 64;
					local28 *= 64;
					local494.method1337(Static50.anInt1118 + local306, local24, Static58.method2504(local28, local24, Static222.anInt4467) - local300, local28);
					Static180.aClass17_18.method619(new Class4_Sub2_Sub10(local494));
				}
			} else if (Static138.anInt2729 == 149) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local16 = (local12 & 0x7) + Static260.anInt5846;
				local20 = Static257.anInt5058 + (local12 >> 4 & 0x7);
				local24 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local46 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local24 == 65535) {
					local24 = -1;
				}
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local300 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104) {
					local306 = local36 + 1;
					if (Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] >= local20 - local306 && local20 + local306 >= Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] && Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] >= local16 - local306 && Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] <= local306 + local16 && Static192.anInt815 != 0 && local42 > 0 && Static111.anInt2210 < 50 && local24 != -1) {
						Static246.anIntArray384[Static111.anInt2210] = local24;
						Static161.anIntArray270[Static111.anInt2210] = local42;
						Static32.anIntArray84[Static111.anInt2210] = local46;
						Static68.aClass56Array2[Static111.anInt2210] = null;
						Static97.anIntArray371[Static111.anInt2210] = local36 + (local20 << 16) + (local16 << 8);
						Static173.anIntArray293[Static111.anInt2210] = local300;
						Static111.anInt2210++;
					}
				}
			} else if (Static138.anInt2729 == 109) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local20 = Static257.anInt5058 + (local12 >> 4 & 0x7);
				local16 = Static260.anInt5846 + (local12 & 0x7);
				local24 = local20 + Static256.aClass4_Sub24_Sub1_3.method3069();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3069() + local16;
				local36 = Static256.aClass4_Sub24_Sub1_3.method3072();
				local42 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local46 = Static256.aClass4_Sub24_Sub1_3.method3110() * 4;
				local300 = Static256.aClass4_Sub24_Sub1_3.method3110() * 4;
				local306 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local410 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local416 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local318 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local416 == 255) {
					local416 = -1;
				}
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104 && local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104 && local42 != 65535) {
					local16 = local16 * 128 + 64;
					local28 = local28 * 128 + 64;
					local24 = local24 * 128 + 64;
					local20 = local20 * 128 + 64;
					local494 = new Class13_Sub3(local42, Static222.anInt4467, local20, local16, Static58.method2504(local16, local20, Static222.anInt4467) - local46, Static50.anInt1118 + local306, local410 + Static50.anInt1118, local416, local318, local36, local300);
					local494.method1337(Static50.anInt1118 + local306, local24, Static58.method2504(local28, local24, Static222.anInt4467) - local300, local28);
					Static180.aClass17_18.method619(new Class4_Sub2_Sub10(local494));
				}
			} else if (Static138.anInt2729 == 228) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local20 = Static256.aClass4_Sub24_Sub1_3.method3110();
				Static296.method4591(local12).method1902(local20);
			} else if (Static138.anInt2729 == 122) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3109();
				local20 = (local12 >> 4 & 0x7) + Static257.anInt5058;
				local16 = (local12 & 0x7) + Static260.anInt5846;
				local24 = Static256.aClass4_Sub24_Sub1_3.method3108();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3074();
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104) {
					@Pc(963) Class13_Sub6 local963 = new Class13_Sub6();
					local963.anInt4616 = local28;
					local963.anInt4615 = local24;
					if (Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16] == null) {
						Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16] = new Class17();
					}
					Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16].method619(new Class4_Sub2_Sub3(local963));
					Static44.method846(local16, local20);
				}
			} else if (Static138.anInt2729 == 225) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local20 = Static257.anInt5058 + (local12 >> 4 & 0x7);
				local16 = (local12 & 0x7) + Static260.anInt5846;
				local24 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local36 = Static256.aClass4_Sub24_Sub1_3.method3085();
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104) {
					@Pc(1063) Class17 local1063 = Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16];
					if (local1063 != null) {
						for (@Pc(1073) Class4_Sub2_Sub3 local1073 = (Class4_Sub2_Sub3) local1063.method613(); local1073 != null; local1073 = (Class4_Sub2_Sub3) local1063.method607()) {
							@Pc(1078) Class13_Sub6 local1078 = local1073.aClass13_Sub6_1;
							if ((local24 & 0x7FFF) == local1078.anInt4615 && local1078.anInt4616 == local28) {
								local1078.anInt4616 = local36;
								break;
							}
						}
						Static44.method846(local16, local20);
					}
				}
			} else if (Static138.anInt2729 == 81) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local16 = (local12 & 0x7) + Static260.anInt5846;
				local20 = Static257.anInt5058 + (local12 >> 4 & 0x7);
				local24 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local36 = Static256.aClass4_Sub24_Sub1_3.method3085();
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104) {
					local16 = local16 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(1195) Class13_Sub4 local1195 = new Class13_Sub4(local24, Static222.anInt4467, local20, local16, Static58.method2504(local16, local20, Static222.anInt4467) - local28, local36, Static50.anInt1118);
					Static91.aClass17_12.method619(new Class4_Sub2_Sub22(local1195));
				}
			} else if (Static138.anInt2729 == 199) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3101();
				local20 = (local12 >> 4 & 0x7) + Static257.anInt5058;
				local16 = (local12 & 0x7) + Static260.anInt5846;
				local24 = Static256.aClass4_Sub24_Sub1_3.method3085();
				if (local20 >= 0 && local16 >= 0 && local20 < 104 && local16 < 104) {
					@Pc(1257) Class17 local1257 = Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16];
					if (local1257 != null) {
						for (@Pc(1266) Class4_Sub2_Sub3 local1266 = (Class4_Sub2_Sub3) local1257.method613(); local1266 != null; local1266 = (Class4_Sub2_Sub3) local1257.method607()) {
							if ((local24 & 0x7FFF) == local1266.aClass13_Sub6_1.anInt4615) {
								local1266.method4690();
								break;
							}
						}
						if (local1257.method613() == null) {
							Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local20][local16] = null;
						}
						Static44.method846(local16, local20);
					}
				}
			} else if (Static138.anInt2729 == 73) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local16 = Static260.anInt5846 * 2 + (local12 & 0xF);
				local20 = (local12 >> 4 & 0xF) + Static257.anInt5058 * 2;
				local24 = local20 + Static256.aClass4_Sub24_Sub1_3.method3069();
				local28 = Static256.aClass4_Sub24_Sub1_3.method3069() + local16;
				local36 = Static256.aClass4_Sub24_Sub1_3.method3072();
				local42 = Static256.aClass4_Sub24_Sub1_3.method3072();
				local46 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local300 = Static256.aClass4_Sub24_Sub1_3.method3069();
				local306 = Static256.aClass4_Sub24_Sub1_3.method3110() * 4;
				local410 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local416 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local318 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local318 == 255) {
					local318 = -1;
				}
				@Pc(1399) int local1399 = Static256.aClass4_Sub24_Sub1_3.method3110();
				if (local20 >= 0 && local16 >= 0 && local20 < 208 && local16 < 208 && local24 >= 0 && local28 >= 0 && local24 < 208 && local28 < 208 && local46 != 65535) {
					local28 *= 64;
					local16 *= 64;
					local24 = local24 * 64;
					local20 = local20 * 64;
					if (local36 != 0) {
						@Pc(1458) int local1458;
						@Pc(1473) Class13_Sub5 local1473;
						@Pc(1452) int local1452;
						@Pc(1462) int local1462;
						if (local36 < 0) {
							local1452 = -local36 - 1;
							local1458 = local1452 >> 11 & 0xF;
							local1462 = local1452 & 0x7FF;
							if (Static169.anInt3387 == local1462) {
								local1473 = Static72.aClass13_Sub5_Sub1_1;
							} else {
								local1473 = Static100.aClass13_Sub5_Sub1Array1[local1462];
							}
						} else {
							local1452 = local36 - 1;
							local1458 = local1452 >> 11 & 0xF;
							local1462 = local1452 & 0x7FF;
							local1473 = Static260.aClass13_Sub5_Sub2Array114[local1462];
						}
						if (local1473 != null) {
							@Pc(1504) Class33 local1504 = local1473.method4212();
							if (local1504.anIntArrayArray11 != null && local1504.anIntArrayArray11[local1458] != null) {
								local300 -= local1504.anIntArrayArray11[local1458][1];
								local1462 = local1504.anIntArrayArray11[local1458][0];
								@Pc(1534) int local1534 = Class174.anIntArray443[local1473.anInt5261];
								@Pc(1539) int local1539 = Class174.anIntArray444[local1473.anInt5261];
								@Pc(1546) int local1546 = local1504.anIntArrayArray11[local1458][2];
								@Pc(1556) int local1556 = local1539 * local1546 + local1534 * local1462 >> 16;
								@Pc(1567) int local1567 = local1534 * local1546 - local1462 * local1539 >> 16;
								local16 += local1567;
								local20 += local1556;
							}
						}
					}
					@Pc(1602) Class13_Sub3 local1602 = new Class13_Sub3(local46, Static222.anInt4467, local20, local16, Static58.method2504(local16, local20, Static222.anInt4467) - local300, local410 + Static50.anInt1118, local416 + Static50.anInt1118, local318, local1399, local42, local306);
					local1602.method1337(Static50.anInt1118 + local410, local24, Static58.method2504(local28, local24, Static222.anInt4467) - local306, local28);
					Static180.aClass17_18.method619(new Class4_Sub2_Sub10(local1602));
				}
			} else if (Static138.anInt2729 == 30) {
				local12 = Static256.aClass4_Sub24_Sub1_3.method3074();
				if (local12 == 65535) {
					local12 = -1;
				}
				local20 = Static256.aClass4_Sub24_Sub1_3.method3101();
				local16 = Static257.anInt5058 + (local20 >> 4 & 0x7);
				local24 = Static260.anInt5846 + (local20 & 0x7);
				local28 = Static256.aClass4_Sub24_Sub1_3.method3094();
				local36 = local28 >> 2;
				local42 = local28 & 0x3;
				local46 = Static230.anIntArray374[local36];
				Static79.method1363(local36, local24, local42, local46, Static222.anInt4467, local16, local12);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(CZ)C")
	public static char method796(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
