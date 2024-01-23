import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public static int anInt4738 = 0;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1624 = Static64.method1101("gleiten:");

	@OriginalMember(owner = "client!we", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1625 = Static64.method1101("T");

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1626 = Static64.method1101(":clanreq:");

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Lclient!ia;")
	public static Class51 method3699(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static150.method2574(new Class51[] { Static166.aClass51_1268, Static27.method511(arg0), Static3.aClass51_39 });
		} else if (arg0 < 10000000) {
			return Static150.method2574(new Class51[] { Static99.aClass51_721, Static27.method511(arg0 / 1000), Static219.aClass51_1567, Static3.aClass51_39 });
		} else {
			return Static150.method2574(new Class51[] { Static184.aClass51_1375, Static27.method511(arg0 / 1000000), Static159.aClass51_1219, Static3.aClass51_39 });
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILclient!ba;)V")
	public static void method3701(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11 arg1) {
		if (Static81.aClass11_15 != null) {
			try {
				Static81.aClass11_15.method271();
			} catch (@Pc(8) Exception local8) {
			}
			Static81.aClass11_15 = null;
		}
		Static81.aClass11_15 = arg1;
		Static95.method1603(arg0);
		Static79.aClass1_Sub2_Sub8_1 = null;
		Static174.aClass1_Sub16_5.anInt4860 = 0;
		Static61.aClass1_Sub16_3 = null;
		Static127.anInt2864 = 0;
		while (true) {
			@Pc(33) Class1_Sub2_Sub8 local33 = (Class1_Sub2_Sub8) Static113.aClass102_13.method3086();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub2_Sub8) Static50.aClass102_7.method3086();
					if (local33 == null) {
						if (Static149.aByte14 != 0) {
							try {
								@Pc(88) Class1_Sub16 local88 = new Class1_Sub16(4);
								local88.method3765(4);
								local88.method3765(Static149.aByte14);
								local88.method3807(0);
								Static81.aClass11_15.method269(4, local88.aByteArray62);
							} catch (@Pc(109) IOException local109) {
								try {
									Static81.aClass11_15.method271();
								} catch (@Pc(114) Exception local114) {
								}
								Static81.aClass11_15 = null;
								Static71.anInt1634++;
							}
						}
						Static188.anInt4066 = 0;
						Static176.aLong132 = Static144.method2489();
						return;
					}
					Static2.aClass116_1.method3463(local33);
					Static207.aClass102_21.method3083(local33, local33.aLong170);
					Static216.anInt4584--;
					Static201.anInt4257++;
				}
			}
			Static146.aClass102_5.method3083(local33, local33.aLong170);
			Static144.anInt3150++;
			Static227.anInt4783--;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[[[Lclient!ea;IZI)V")
	public static void method3702(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) byte local10 = (byte) (Static10.anInt217 & 0xFF);
		if (local10 == Static202.aByteArrayArrayArray13[Static197.anInt2422][arg2][arg0]) {
			return;
		}
		@Pc(33) byte local33 = 0;
		Static223.anIntArray372[0] = arg2;
		@Pc(40) int local40 = local33 + 1;
		Static144.anIntArray214[0] = arg0;
		@Pc(44) int local44 = 0;
		Static202.aByteArrayArrayArray13[Static197.anInt2422][arg2][arg0] = local10;
		while (local44 != local40) {
			@Pc(60) int local60 = Static223.anIntArray372[local44] & 0xFFFF;
			@Pc(68) int local68 = Static223.anIntArray372[local44] >> 16 & 0xFF;
			@Pc(76) int local76 = Static223.anIntArray372[local44] >> 24 & 0xFF;
			@Pc(84) int local84 = Static144.anIntArray214[local44] >> 16 & 0xFF;
			@Pc(90) int local90 = Static144.anIntArray214[local44] & 0xFFFF;
			local44 = local44 + 1 & 0xFFF;
			@Pc(98) boolean local98 = false;
			if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][local60][local90] & 0x4) == 0) {
				local98 = true;
			}
			@Pc(112) boolean local112 = false;
			@Pc(151) int local151;
			@Pc(185) int local185;
			label214: for (@Pc(116) int local116 = Static197.anInt2422 + 1; local116 <= 3; local116++) {
				if ((Static150.aByteArrayArrayArray9[local116][local60][local90] & 0x8) == 0) {
					@Pc(314) int local314;
					if (local98 && arg1[local116][local60][local90] != null) {
						if (arg1[local116][local60][local90].aClass62_1 != null) {
							local151 = Static29.method531(local68);
							if (local151 == arg1[local116][local60][local90].aClass62_1.anInt2403 || local151 == arg1[local116][local60][local90].aClass62_1.anInt2396) {
								continue;
							}
							if (local76 != 0) {
								local185 = Static29.method531(local76);
								if (arg1[local116][local60][local90].aClass62_1.anInt2403 == local185 || arg1[local116][local60][local90].aClass62_1.anInt2396 == local185) {
									continue;
								}
							}
							if (local84 != 0) {
								local185 = Static29.method531(local84);
								if (arg1[local116][local60][local90].aClass62_1.anInt2403 == local185 || arg1[local116][local60][local90].aClass62_1.anInt2396 == local185) {
									continue;
								}
							}
						}
						if (arg1[local116][local60][local90].aClass83Array3 != null) {
							for (local151 = 0; local151 < arg1[local116][local60][local90].anInt1124; local151++) {
								local185 = (int) (arg1[local116][local60][local90].aClass83Array3[local151].aLong118 >> 14 & 0x3FL);
								if (local185 == 21) {
									local185 = 19;
								}
								@Pc(308) int local308 = (int) (arg1[local116][local60][local90].aClass83Array3[local151].aLong118 >> 20 & 0x3L);
								local314 = local308 << 6 | local185;
								if (local314 == local68 || local76 != 0 && local314 == local76 || local84 != 0 && local314 == local84) {
									continue label214;
								}
							}
						}
					}
					local112 = true;
					@Pc(361) Class1_Sub7 local361 = arg1[local116][local60][local90];
					if (local361 != null && local361.anInt1124 > 0) {
						for (local185 = 0; local185 < local361.anInt1124; local185++) {
							@Pc(375) Class83 local375 = local361.aClass83Array3[local185];
							if (local375.anInt3340 != local375.anInt3342 || local375.anInt3346 != local375.anInt3336) {
								for (local314 = local375.anInt3340; local314 <= local375.anInt3342; local314++) {
									for (@Pc(397) int local397 = local375.anInt3336; local397 <= local375.anInt3346; local397++) {
										Static202.aByteArrayArrayArray13[local116][local314][local397] = local10;
									}
								}
							}
						}
					}
					Static202.aByteArrayArrayArray13[local116][local60][local90] = local10;
				}
			}
			if (local112) {
				if (Static229.anIntArray377[arg3] < Static20.anIntArrayArrayArray2[Static197.anInt2422 + 1][local60][local90]) {
					Static229.anIntArray377[arg3] = Static20.anIntArrayArrayArray2[Static197.anInt2422 + 1][local60][local90];
				}
				local185 = local90 << 7;
				local151 = local60 << 7;
				if (Static168.anIntArray245[arg3] > local151) {
					Static168.anIntArray245[arg3] = local151;
				} else if (local151 > Static139.anIntArray207[arg3]) {
					Static139.anIntArray207[arg3] = local151;
				}
				if (Static186.anIntArray304[arg3] > local185) {
					Static186.anIntArray304[arg3] = local185;
				} else if (Static77.anIntArray107[arg3] < local185) {
					Static77.anIntArray107[arg3] = local185;
				}
			}
			if (!local98) {
				if (local60 >= 1 && Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] != local10) {
					Static223.anIntArray372[local40] = local60 - 1 | 0x120000 | 0xD3000000;
					Static144.anIntArray214[local40] = local90 | 0x130000;
					Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] = local10;
					local40 = local40 + 1 & 0xFFF;
				}
				local90++;
				if (local90 < 104) {
					if (local60 - 1 >= 0 && Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] != local10 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60][local90] & 0x4) == 0 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60 - 1][local90 - 1] & 0x4) == 0) {
						Static223.anIntArray372[local40] = 0x52000000 | 0x120000 | local60 - 1;
						Static144.anIntArray214[local40] = local90 | 0x130000;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] = local10;
						local40 = local40 + 1 & 0xFFF;
					}
					if (local10 != Static202.aByteArrayArrayArray13[Static197.anInt2422][local60][local90]) {
						Static223.anIntArray372[local40] = local60 | 0x520000 | 0x13000000;
						Static144.anIntArray214[local40] = local90 | 0x530000;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60][local90] = local10;
						local40 = local40 + 1 & 0xFFF;
					}
					if (local60 + 1 < 104 && local10 != Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90] && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60][local90] & 0x4) == 0 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60 + 1][local90 - 1] & 0x4) == 0) {
						Static223.anIntArray372[local40] = local60 + 1 | 0x92000000 | 0x520000;
						Static144.anIntArray214[local40] = local90 | 0x530000;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90] = local10;
						local40 = local40 + 1 & 0xFFF;
					}
				}
				local90--;
				if (local60 + 1 < 104 && local10 != Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90]) {
					Static223.anIntArray372[local40] = local60 + 1 | 0x920000 | 0x53000000;
					Static144.anIntArray214[local40] = local90 | 0x930000;
					Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90] = local10;
					local40 = local40 + 1 & 0xFFF;
				}
				local90--;
				if (local90 >= 0) {
					if (local60 - 1 >= 0 && Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] != local10 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60][local90] & 0x4) == 0 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60 - 1][local90 + 1] & 0x4) == 0) {
						Static223.anIntArray372[local40] = 0x12000000 | 0xD20000 | local60 - 1;
						Static144.anIntArray214[local40] = local90 | 0xD30000;
						local40 = local40 + 1 & 0xFFF;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 - 1][local90] = local10;
					}
					if (local10 != Static202.aByteArrayArrayArray13[Static197.anInt2422][local60][local90]) {
						Static223.anIntArray372[local40] = local60 | 0x93000000 | 0xD20000;
						Static144.anIntArray214[local40] = local90 | 0xD30000;
						local40 = local40 + 1 & 0xFFF;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60][local90] = local10;
					}
					if (local60 + 1 < 104 && Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90] != local10 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60][local90] & 0x4) == 0 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][local60 + 1][local90 + 1] & 0x4) == 0) {
						Static223.anIntArray372[local40] = local60 + 1 | 0x920000 | 0xD2000000;
						Static144.anIntArray214[local40] = local90 | 0x930000;
						local40 = local40 + 1 & 0xFFF;
						Static202.aByteArrayArrayArray13[Static197.anInt2422][local60 + 1][local90] = local10;
					}
				}
			}
		}
		if (Static229.anIntArray377[arg3] == -1000000) {
			return;
		}
		Static229.anIntArray377[arg3] += 10;
		Static168.anIntArray245[arg3] -= 50;
		Static139.anIntArray207[arg3] += 50;
		Static77.anIntArray107[arg3] += 50;
		Static186.anIntArray304[arg3] -= 50;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)V")
	public static void method3703() {
		Static3.aClass70_1 = null;
		Static4.anInt78 = -1;
		Static198.anInt4222 = 1;
		Static191.anInt4125 = 0;
		Static21.aBoolean23 = false;
		Static93.anInt2065 = 2;
		Static124.anInt4550 = -1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!vb;Lclient!s;I)V")
	public static void method3704(@OriginalArg(1) Class70_Sub1 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub12 local7 = new Class1_Sub12();
		local7.aLong170 = arg2;
		local7.aClass70_Sub1_17 = arg0;
		local7.anInt1479 = 1;
		local7.aClass100_32 = arg1;
		@Pc(22) Class105 local22 = Static28.aClass105_4;
		synchronized (Static28.aClass105_4) {
			Static28.aClass105_4.method3119(local7);
		}
		Static42.method3755();
	}
}
