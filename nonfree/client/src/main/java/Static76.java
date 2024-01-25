import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(CIB)C")
	public static char method1206(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V")
	public static void method1207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static64.aClass251ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 << 14 | arg1 << 28 | arg0);
		@Pc(25) Class2_Sub28 local25 = (Class2_Sub28) Static94.aClass246_6.method5613(local19);
		if (local25 == null) {
			Static275.method4181(arg1, arg0, arg2);
			return;
		}
		@Pc(39) Class2_Sub40 local39 = (Class2_Sub40) local25.aClass30_31.method694();
		if (local39 == null) {
			Static275.method4181(arg1, arg0, arg2);
			return;
		}
		@Pc(53) Class1_Sub4_Sub1 local53 = (Class1_Sub4_Sub1) Static275.method4181(arg1, arg0, arg2);
		if (local53 == null) {
			local53 = new Class1_Sub4_Sub1();
		} else {
			local53.anInt1546 = local53.anInt1543 = -1;
		}
		local53.anInt1554 = local39.anInt5736;
		local53.anInt1556 = local39.anInt5732;
		label44: while (true) {
			@Pc(89) Class2_Sub40 local89 = (Class2_Sub40) local25.aClass30_31.method682();
			if (local89 == null) {
				break;
			}
			if (local89.anInt5732 != local53.anInt1556) {
				local53.anInt1553 = local89.anInt5736;
				local53.anInt1546 = local89.anInt5732;
				while (true) {
					@Pc(114) Class2_Sub40 local114 = (Class2_Sub40) local25.aClass30_31.method682();
					if (local114 == null) {
						break label44;
					}
					if (local53.anInt1556 != local114.anInt5732 && local114.anInt5732 != local53.anInt1546) {
						local53.anInt1543 = local114.anInt5732;
						local53.anInt1545 = local114.anInt5736;
					}
				}
			}
		}
		@Pc(154) int local154 = Static170.method3006((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static95.method5557(arg1, arg0, arg2, local154, local53);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public static void method1208() {
		if (Static322.anInt5530 > 0) {
			Static322.anInt5530--;
		}
		if (Static358.anInt2087 > 1) {
			Static321.anInt5507 = Static102.anInt2133;
			Static358.anInt2087--;
		}
		if (Static55.aBoolean87) {
			Static55.aBoolean87 = false;
			Static17.method320();
			return;
		}
		if (!Static269.aBoolean349) {
			Static123.method2499();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static145.method4672(); local35++) {
		}
		if (Static391.anInt6627 != 30) {
			return;
		}
		Static300.method1284(Static95.aClass11_94.method258(), Static372.aClass2_Sub16_Sub2_4);
		if (Static160.aClass2_Sub21_1 == null) {
			if (Static125.aLong95 <= Static39.method699()) {
				Static160.aClass2_Sub21_1 = Static114.aClass156_1.method3507(Static61.aString15);
			}
		} else if (Static160.aClass2_Sub21_1.anInt2612 != -1) {
			Static216.method3597(Static367.aClass11_90);
			Static372.aClass2_Sub16_Sub2_4.method5351(Static160.aClass2_Sub21_1.anInt2612);
			Static160.aClass2_Sub21_1 = null;
			Static125.aLong95 = Static39.method699() + 30000L;
		}
		@Pc(113) int local113;
		@Pc(136) int local136;
		@Pc(156) int local156;
		@Pc(172) boolean local172;
		@Pc(227) int local227;
		@Pc(233) int local233;
		@Pc(245) int local245;
		if (Static29.aClass2_Sub19_1 != null || Static39.method699() - 2000L > Static262.aLong152) {
			@Pc(110) boolean local110 = false;
			local113 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
			for (@Pc(118) Class2_Sub19 local118 = (Class2_Sub19) Static234.aClass30_35.method694(); local118 != null && Static372.aClass2_Sub16_Sub2_4.anInt6145 - local113 < 240; local118 = (Class2_Sub19) Static234.aClass30_35.method682()) {
				local118.method5617();
				local136 = local118.method2380();
				if (local136 < 0) {
					local136 = 0;
				} else if (local136 > 65534) {
					local136 = 65534;
				}
				local156 = local118.method2378();
				if (local156 < 0) {
					local156 = 0;
				} else if (local156 > 65534) {
					local156 = 65534;
				}
				local172 = false;
				if (local118.method2380() == -1 && local118.method2378() == -1) {
					local136 = -1;
					local172 = true;
					local156 = -1;
				}
				if (local156 != Static109.anInt2318 || local136 != Static380.anInt6477) {
					if (!local110) {
						Static216.method3597(Static165.aClass11_54);
						Static372.aClass2_Sub16_Sub2_4.method5358(0);
						local113 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
						local110 = true;
					}
					local227 = local156 - Static109.anInt2318;
					Static109.anInt2318 = local156;
					local233 = local136 - Static380.anInt6477;
					Static380.anInt6477 = local136;
					local245 = (int) ((local118.method2377() - Static262.aLong152) / 20L);
					if (local245 < 8 && local227 >= -32 && local227 <= 31 && local233 >= -32 && local233 <= 31) {
						local233 += 32;
						local227 += 32;
						Static372.aClass2_Sub16_Sub2_4.method5351((local227 << 6) + ((local245 << 12) + local233));
					} else if (local245 < 32 && local227 >= -128 && local227 <= 127 && local233 >= -128 && local233 <= 127) {
						Static372.aClass2_Sub16_Sub2_4.method5358(local245 + 128);
						local233 += 128;
						local227 += 128;
						Static372.aClass2_Sub16_Sub2_4.method5351(local233 + (local227 << 8));
					} else if (local245 < 32) {
						Static372.aClass2_Sub16_Sub2_4.method5358(local245 + 192);
						if (local172) {
							Static372.aClass2_Sub16_Sub2_4.method5355(Integer.MIN_VALUE);
						} else {
							Static372.aClass2_Sub16_Sub2_4.method5355(local136 << 16 | local156);
						}
					} else {
						Static372.aClass2_Sub16_Sub2_4.method5351(local245 + 57344);
						if (local172) {
							Static372.aClass2_Sub16_Sub2_4.method5355(Integer.MIN_VALUE);
						} else {
							Static372.aClass2_Sub16_Sub2_4.method5355(local136 << 16 | local156);
						}
					}
					Static262.aLong152 = local118.method2377();
				}
			}
			if (local110) {
				Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local113);
			}
		}
		@Pc(414) int local414;
		@Pc(464) int local464;
		if (Static29.aClass2_Sub19_1 != null) {
			@Pc(400) long local400 = (Static29.aClass2_Sub19_1.method2377() - Static83.aLong61) / 50L;
			Static83.aLong61 = Static29.aClass2_Sub19_1.method2377();
			if (local400 > 32767L) {
				local400 = 32767L;
			}
			local414 = Static29.aClass2_Sub19_1.method2380();
			if (local414 < 0) {
				local414 = 0;
			} else if (local414 > 65535) {
				local414 = 65535;
			}
			local136 = Static29.aClass2_Sub19_1.method2378();
			if (local136 < 0) {
				local136 = 0;
			} else if (local136 > 65535) {
				local136 = 65535;
			}
			@Pc(452) byte local452 = 0;
			if (Static29.aClass2_Sub19_1.method2379() == 2) {
				local452 = 1;
			}
			local464 = (int) local400;
			Static216.method3597(Static292.aClass11_78);
			Static372.aClass2_Sub16_Sub2_4.method5365(local464 | local452 << 15);
			Static372.aClass2_Sub16_Sub2_4.method5355(local136 | local414 << 16);
		}
		@Pc(491) int local491;
		if (Static184.anInt3459 > 0) {
			local491 = 0;
			for (local113 = 0; local113 < Static184.anInt3459; local113++) {
				if (Static360.aClass162Array1[local113].method4031()) {
					local491++;
				}
			}
			if (local491 > 0) {
				Static216.method3597(Static165.aClass11_55);
				if (local491 > 75) {
					local491 = 75;
				}
				Static372.aClass2_Sub16_Sub2_4.method5358(local491 * 3);
				for (local414 = 0; local414 < Static184.anInt3459; local414++) {
					@Pc(536) Class162 local536 = Static360.aClass162Array1[local414];
					if (local536.method4031()) {
						@Pc(549) long local549 = (local536.method4026() - Static93.aLong71) / 50L;
						Static93.aLong71 = local536.method4026();
						if (local549 > 65535L) {
							local549 = 65535L;
						}
						Static372.aClass2_Sub16_Sub2_4.method5358(local536.method4027());
						Static372.aClass2_Sub16_Sub2_4.method5351((int) local549);
					}
				}
			}
		}
		if (Static81.anInt1472 > 0) {
			Static81.anInt1472--;
		}
		if (Static285.aBoolean378 && Static81.anInt1472 <= 0) {
			Static81.anInt1472 = 20;
			Static285.aBoolean378 = false;
			Static216.method3597(Static55.aClass11_19);
			Static372.aClass2_Sub16_Sub2_4.method5318((int) Static1.aFloat80 >> 3);
			Static372.aClass2_Sub16_Sub2_4.method5365((int) Static127.aFloat41 >> 3);
		}
		if (Static90.aBoolean129 && !Static331.aBoolean417) {
			Static331.aBoolean417 = true;
			Static216.method3597(Static282.aClass11_75);
			Static372.aClass2_Sub16_Sub2_4.method5358(1);
		}
		if (!Static90.aBoolean129 && Static331.aBoolean417) {
			Static331.aBoolean417 = false;
			Static216.method3597(Static282.aClass11_75);
			Static372.aClass2_Sub16_Sub2_4.method5358(0);
		}
		if (!Static64.aBoolean92) {
			Static216.method3597(Static148.aClass11_51);
			Static372.aClass2_Sub16_Sub2_4.method5372(Static246.method3932());
			Static64.aBoolean92 = true;
		}
		if (Static64.aClass251ArrayArrayArray1 != null) {
			if (Static79.anInt4624 == 2) {
				Static178.method3130();
			} else if (Static79.anInt4624 == 3) {
				Static176.method3102();
			}
		}
		if (Static82.aBoolean110) {
			Static82.aBoolean110 = false;
		} else {
			Static283.aFloat70 /= 2.0F;
		}
		if (Static378.aBoolean451) {
			Static378.aBoolean451 = false;
		} else {
			Static345.aFloat82 /= 2.0F;
		}
		Static42.method4248();
		if (Static391.anInt6627 != 30) {
			return;
		}
		Static359.method5248();
		Static339.method4972();
		Static28.method501();
		Static154.method2829();
		Static218.anInt4548++;
		if (Static218.anInt4548 > 750) {
			Static17.method320();
			return;
		}
		Static35.method633();
		Static285.method4333();
		Static381.method5581();
		for (local491 = Static321.aClass211_1.method4466(true); local491 != -1; local491 = Static321.aClass211_1.method4466(false)) {
			Static128.method2522(local491);
			Static392.anIntArray1319[Static212.anInt3858++ & 0x1F] = local491;
		}
		@Pc(870) Class4 local870;
		for (@Pc(800) Class2_Sub10_Sub2 local800 = Static25.method467(); local800 != null; local800 = Static25.method467()) {
			local414 = local800.method862();
			local136 = local800.method865();
			if (local414 == 1) {
				Static330.anIntArray1157[local136] = local800.anInt1037;
				Static10.aBoolean423 |= Static88.aBooleanArray13[local136];
				Static132.anIntArray559[Static222.anInt3959++ & 0x1F] = local136;
			} else if (local414 == 2) {
				Static245.aStringArray108[local136] = local800.aString14;
				Static190.anIntArray702[Static200.anInt3685++ & 0x1F] = local136;
			} else if (local414 == 3) {
				local870 = Static380.method5560(local136);
				if (!local800.aString14.equals(local870.aString1)) {
					local870.aString1 = local800.aString14;
					Static51.method872(local870);
				}
			} else if (local414 == 4) {
				local870 = Static380.method5560(local136);
				local464 = local800.anInt1037;
				local227 = local800.anInt1027;
				local233 = local800.anInt1028;
				if (local870.anInt60 != local464 || local870.anInt99 != local227 || local870.anInt62 != local233) {
					local870.anInt60 = local464;
					local870.anInt99 = local227;
					local870.anInt62 = local233;
					Static51.method872(local870);
				}
			} else if (local414 == 5) {
				local870 = Static380.method5560(local136);
				if (local870.anInt124 != local800.anInt1037 || local800.anInt1037 == -1) {
					local870.anInt105 = 1;
					local870.anInt85 = 0;
					local870.anInt124 = local800.anInt1037;
					local870.anInt117 = 0;
					Static51.method872(local870);
				}
			} else if (local414 == 6) {
				local156 = local800.anInt1037;
				local464 = local156 >> 10 & 0x1F;
				local227 = local156 >> 5 & 0x1F;
				local233 = local156 & 0x1F;
				local245 = (local233 << 3) + (local464 << 19) + (local227 << 11);
				@Pc(1318) Class4 local1318 = Static380.method5560(local136);
				if (local245 != local1318.anInt57) {
					local1318.anInt57 = local245;
					Static51.method872(local1318);
				}
			} else if (local414 == 7) {
				local870 = Static380.method5560(local136);
				local172 = local800.anInt1037 == 1;
				if (local172 != local870.aBoolean9) {
					local870.aBoolean9 = local172;
					Static51.method872(local870);
				}
			} else if (local414 == 8) {
				local870 = Static380.method5560(local136);
				if (local800.anInt1037 != local870.anInt112 || local870.anInt103 != local800.anInt1027 || local870.anInt79 != local800.anInt1028) {
					local870.anInt112 = local800.anInt1037;
					local870.anInt103 = local800.anInt1027;
					local870.anInt79 = local800.anInt1028;
					if (local870.anInt58 != -1) {
						if (local870.anInt81 > 0) {
							local870.anInt79 = local870.anInt79 * 32 / local870.anInt81;
						} else if (local870.anInt114 > 0) {
							local870.anInt79 = local870.anInt79 * 32 / local870.anInt114;
						}
					}
					Static51.method872(local870);
				}
			} else if (local414 == 9) {
				local870 = Static380.method5560(local136);
				if (local800.anInt1037 != local870.anInt58 || local870.anInt127 != local800.anInt1027) {
					local870.anInt127 = local800.anInt1027;
					local870.anInt58 = local800.anInt1037;
					Static51.method872(local870);
				}
			} else if (local414 == 10) {
				local870 = Static380.method5560(local136);
				if (local800.anInt1037 != local870.anInt123 || local800.anInt1027 != local870.anInt115 || local870.anInt61 != local800.anInt1028) {
					local870.anInt123 = local800.anInt1037;
					local870.anInt115 = local800.anInt1027;
					local870.anInt61 = local800.anInt1028;
					Static51.method872(local870);
				}
			} else if (local414 == 11) {
				local870 = Static380.method5560(local136);
				local870.anInt48 = local870.anInt100 = local800.anInt1027;
				local870.aByte4 = 0;
				local870.anInt71 = local870.anInt91 = local800.anInt1037;
				local870.aByte3 = 0;
				Static51.method872(local870);
			} else if (local414 == 12) {
				local870 = Static380.method5560(local136);
				local464 = local800.anInt1037;
				if (local870 != null && local870.anInt125 == 0) {
					if (local870.anInt72 - local870.anInt113 < local464) {
						local464 = local870.anInt72 - local870.anInt113;
					}
					if (local464 < 0) {
						local464 = 0;
					}
					if (local870.anInt78 != local464) {
						local870.anInt78 = local464;
						Static51.method872(local870);
					}
				}
			} else if (local414 == 14) {
				local870 = Static380.method5560(local136);
				local870.anInt64 = local800.anInt1037;
			} else if (local414 == 15) {
				Static60.anInt1159 = local800.anInt1037;
				Static331.aBoolean415 = true;
				Static358.anInt2084 = local800.anInt1027;
			} else if (local414 == 16) {
				local870 = Static380.method5560(local136);
				local870.anInt51 = local800.anInt1037;
			}
		}
		if (Static159.anInt3048 != 0) {
			Static103.anInt2136 += 20;
			if (Static103.anInt2136 >= 400) {
				Static159.anInt3048 = 0;
			}
		}
		Static64.anInt1278++;
		if (Static93.aClass4_10 != null) {
			Static361.anInt6050++;
			if (Static361.anInt6050 >= 15) {
				Static51.method872(Static93.aClass4_10);
				Static93.aClass4_10 = null;
			}
		}
		Static18.aClass4_4 = null;
		Static41.aBoolean62 = false;
		Static264.aBoolean343 = false;
		Static240.aClass4_18 = null;
		Static270.method2995(-1, null, -1);
		Static94.method1873(null, -1, -1);
		Static162.method2890();
		Static102.anInt2133++;
		if (Static263.aBoolean342) {
			Static216.method3597(Static361.aClass11_87);
			Static372.aClass2_Sub16_Sub2_4.method5336(Static193.anInt3630 << 14 | Static369.anInt6249 << 28 | Static70.anInt1247);
			Static263.aBoolean342 = false;
		}
		while (true) {
			@Pc(1444) Class2_Sub22 local1444;
			@Pc(1449) Class4 local1449;
			do {
				local1444 = (Class2_Sub22) Static110.aClass30_15.method695();
				if (local1444 == null) {
					while (true) {
						do {
							local1444 = (Class2_Sub22) Static184.aClass30_27.method695();
							if (local1444 == null) {
								while (true) {
									do {
										local1444 = (Class2_Sub22) Static206.aClass30_29.method695();
										if (local1444 == null) {
											if (Static240.aClass4_18 == null) {
												Static6.anInt204 = 0;
											}
											if (Static242.aClass4_22 != null) {
												Static196.method3727();
											}
											if (Static303.anInt5133 > 0 && Static48.aClass69_1.method2261(82) && Static48.aClass69_1.method2261(81) && Static303.anInt5140 != 0) {
												local414 = Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 - Static303.anInt5140;
												if (local414 < 0) {
													local414 = 0;
												} else if (local414 > 3) {
													local414 = 3;
												}
												Static304.method5619(Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] + Static28.anInt606, local414, Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] + Static319.anInt5425);
											}
											Static193.method3304();
											for (local414 = 0; local414 < 5; local414++) {
												@Pc(1641) int local1641 = Static47.anIntArray190[local414]++;
											}
											if (Static10.aBoolean423 && Static39.method699() - 60000L > Static69.aLong51) {
												Static37.method675();
											}
											Static316.anInt5407++;
											if (Static316.anInt5407 > 500) {
												Static316.anInt5407 = 0;
												local136 = (int) (Math.random() * 8.0D);
												if ((local136 & 0x2) == 2) {
													Static250.anInt4448 += Static210.anInt3829;
												}
												if ((local136 & 0x4) == 4) {
													Static189.anInt6619 += Static74.anInt1435;
												}
												if ((local136 & 0x1) == 1) {
													Static174.anInt3329 += Static60.anInt1157;
												}
											}
											if (Static174.anInt3329 < -50) {
												Static60.anInt1157 = 2;
											}
											if (Static174.anInt3329 > 50) {
												Static60.anInt1157 = -2;
											}
											if (Static250.anInt4448 < -55) {
												Static210.anInt3829 = 2;
											}
											if (Static250.anInt4448 > 55) {
												Static210.anInt3829 = -2;
											}
											if (Static189.anInt6619 < -40) {
												Static74.anInt1435 = 1;
											}
											Static339.anInt5792++;
											if (Static189.anInt6619 > 40) {
												Static74.anInt1435 = -1;
											}
											if (Static339.anInt5792 > 500) {
												Static339.anInt5792 = 0;
												local136 = (int) (Math.random() * 8.0D);
												if ((local136 & 0x1) == 1) {
													Static190.anInt3567 += Static368.anInt5300;
												}
												if ((local136 & 0x2) == 2) {
													Static30.anInt643 += Static143.anInt2868;
												}
											}
											if (Static190.anInt3567 < -60) {
												Static368.anInt5300 = 2;
											}
											if (Static190.anInt3567 > 60) {
												Static368.anInt5300 = -2;
											}
											if (Static30.anInt643 < -20) {
												Static143.anInt2868 = 1;
											}
											Static149.anInt6254++;
											if (Static30.anInt643 > 10) {
												Static143.anInt2868 = -1;
											}
											if (Static149.anInt6254 > 50) {
												Static216.method3597(Static21.aClass11_5);
											}
											if (Static367.aBoolean440) {
												Static113.method2347();
												Static367.aBoolean440 = false;
											}
											try {
												if (Static88.aClass221_1 != null && Static372.aClass2_Sub16_Sub2_4.anInt6145 > 0) {
													Static297.anInt5090 += Static372.aClass2_Sub16_Sub2_4.anInt6145;
													Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
													Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
													Static149.anInt6254 = 0;
													return;
												}
												return;
											} catch (@Pc(1853) IOException local1853) {
												Static17.method320();
												return;
											}
										}
										local1449 = local1444.aClass4_15;
										if (local1449.lb < 0) {
											break;
										}
										local870 = Static380.method5560(local1449.anInt88);
									} while (local870 == null || local870.aClass4Array1 == null || local870.aClass4Array1.length <= local1449.lb || local1449 != local870.aClass4Array1[local1449.lb]);
									Static256.method4003(local1444);
								}
							}
							local1449 = local1444.aClass4_15;
							if (local1449.lb < 0) {
								break;
							}
							local870 = Static380.method5560(local1449.anInt88);
						} while (local870 == null || local870.aClass4Array1 == null || local870.aClass4Array1.length <= local1449.lb || local1449 != local870.aClass4Array1[local1449.lb]);
						Static256.method4003(local1444);
					}
				}
				local1449 = local1444.aClass4_15;
				if (local1449.lb < 0) {
					break;
				}
				local870 = Static380.method5560(local1449.anInt88);
			} while (local870 == null || local870.aClass4Array1 == null || local1449.lb >= local870.aClass4Array1.length || local870.aClass4Array1[local1449.lb] != local1449);
			Static256.method4003(local1444);
		}
	}
}
