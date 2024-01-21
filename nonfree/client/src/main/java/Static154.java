import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1858 = Static122.method531("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array23 = new Class73[1000];

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1859 = aClass73_1858;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1860 = Static122.method531("blaugr-Un:");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lclient!sd;")
	public static Class73 method2485(@OriginalArg(1) int arg0) {
		return Static169.method2645(false, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!sd;Lclient!sd;BLclient!sd;)V")
	public static void method2486(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(3) Class73 arg2) {
		Static12.aClass73_168 = arg2;
		Static12.aClass73_166 = arg0;
		Static12.aClass73_170 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method2487() {
		aClass73_1858 = null;
		aClass73_1859 = null;
		aClass73Array23 = null;
		aClass73_1860 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Z")
	public static boolean method2488() {
		if (Static42.aClass2_2 == null) {
			return false;
		}
		@Pc(149) int local149;
		try {
			@Pc(13) int local13 = Static42.aClass2_2.method16();
			if (local13 == 0) {
				return false;
			}
			if (Static132.anInt3019 == -1) {
				Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, 1);
				local13--;
				Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
				Static132.anInt3019 = Static159.aClass3_Sub12_Sub1_4.method1399();
				Static17.anInt3783 = Static167.anIntArray384[Static132.anInt3019];
			}
			if (Static17.anInt3783 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, 1);
				local13--;
				Static17.anInt3783 = Static159.aClass3_Sub12_Sub1_4.aByteArray16[0] & 0xFF;
			}
			if (Static17.anInt3783 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, 2);
				local13 -= 2;
				Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
				Static17.anInt3783 = Static159.aClass3_Sub12_Sub1_4.method1359();
			}
			if (Static17.anInt3783 > local13) {
				return false;
			}
			Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
			Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, Static17.anInt3783);
			Static100.anInt2226 = 0;
			Static58.anInt1360 = Static144.anInt3454;
			Static144.anInt3454 = Static101.anInt2290;
			Static101.anInt2290 = Static132.anInt3019;
			if (Static132.anInt3019 == 2) {
				Static132.anInt3019 = -1;
				Static14.anInt354 = 0;
				return true;
			}
			@Pc(139) int local139;
			if (Static132.anInt3019 == 222) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1359();
				Static133.anInt3052 = local139;
				Static130.method2166(local139);
				Static119.method2071(Static133.anInt3052);
				for (local149 = 0; local149 < 100; local149++) {
					Static27.aBooleanArray3[local149] = true;
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(196) int local196;
			@Pc(198) int local198;
			@Pc(187) int local187;
			if (Static132.anInt3019 == 255) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1377();
				if (local139 == 65535) {
					local139 = -1;
				}
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1380();
				if (local149 == 65535) {
					local149 = -1;
				}
				local196 = Static159.aClass3_Sub12_Sub1_4.method1373();
				for (local198 = local139; local198 <= local149; local198++) {
					@Pc(208) long local208 = (long) local198 + ((long) local196 << 32);
					@Pc(213) Class3 local213 = Static146.aClass16_10.method554(local208);
					if (local213 != null) {
						local213.method2783();
					}
					Static146.aClass16_10.method546(new Class3_Sub7(local187), local208);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 50) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1381();
				Static20.anIntArray49[local149] = local139;
				if (Static81.anIntArray186[local149] != local139) {
					Static81.anIntArray186[local149] = local139;
					Static136.method2237(local149);
				}
				Static77.anIntArray180[Static162.anInt3544++ & 0x1F] = local149;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 216) {
				Static150.method2601();
				Static10.anInt277 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static132.anInt3019 = -1;
				Static138.anInt3197 = Static84.anInt1893;
				return true;
			}
			if (Static132.anInt3019 == 116) {
				if (Static133.anInt3052 != -1) {
					Static148.method2412(0, Static133.anInt3052);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 155) {
				Static16.method297();
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 15) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				@Pc(341) Class3_Sub13 local341 = (Class3_Sub13) Static91.aClass16_9.method554((long) local139);
				if (local341 != null) {
					Static8.method155(local341, true);
				}
				if (Static11.aClass83_3 != null) {
					Static60.method1104(Static11.aClass83_3);
					Static11.aClass83_3 = null;
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 153) {
				Static68.anInt1579 = Static159.aClass3_Sub12_Sub1_4.method1378();
				Static20.anInt534 = Static159.aClass3_Sub12_Sub1_4.method1347();
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(420) int local420;
			if (Static132.anInt3019 == 131) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1380();
				local187 = local139 >> 10 & 0x1F;
				local196 = local139 >> 5 & 0x1F;
				local198 = local139 & 0x1F;
				@Pc(406) Class83 local406 = Static80.method1396(local149);
				local420 = (local187 << 19) + (local196 << 11) + (local198 << 3);
				if (local406.anInt3712 != local420) {
					local406.anInt3712 = local420;
					Static60.method1104(local406);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 186) {
				Static22.aBoolean40 = true;
				Static4.anInt78 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static142.anInt3267 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static140.anInt3200 = Static159.aClass3_Sub12_Sub1_4.method1359();
				Static120.anInt2826 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static52.anInt1281 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (Static52.anInt1281 >= 100) {
					Static19.anInt513 = Static142.anInt3267 * 128 + 64;
					Static34.anInt834 = Static4.anInt78 * 128 + 64;
					Static55.anInt1291 = Static107.method1922(Static34.anInt834, Static19.anInt513, Static147.anInt3309) - Static140.anInt3200;
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 252) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (Static159.aClass3_Sub12_Sub1_4.method1354() == 0) {
					Static169.aClass63Array1[local139] = new Class63();
				} else {
					Static159.aClass3_Sub12_Sub1_4.anInt1793--;
					Static169.aClass63Array1[local139] = new Class63(Static159.aClass3_Sub12_Sub1_4);
				}
				Static129.anInt2960 = Static84.anInt1893;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 212) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1349();
				Static100.aClass29_8 = Static32.aClass39_2.method1230(local139);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 10) {
				Static22.aBoolean40 = false;
				for (local139 = 0; local139 < 5; local139++) {
					Static26.aBooleanArray2[local139] = false;
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 241) {
				Static60.method1107(Static159.aClass3_Sub12_Sub1_4);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 124) {
				Static20.anInt534 = Static159.aClass3_Sub12_Sub1_4.method1347();
				Static68.anInt1579 = Static159.aClass3_Sub12_Sub1_4.method1354();
				while (Static17.anInt3783 > Static159.aClass3_Sub12_Sub1_4.anInt1793) {
					Static132.anInt3019 = Static159.aClass3_Sub12_Sub1_4.method1354();
					Static87.method1531();
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(660) int local660;
			@Pc(687) int local687;
			@Pc(629) long local629;
			@Pc(637) long local637;
			@Pc(654) long local654;
			@Pc(642) long local642;
			if (Static132.anInt3019 == 44) {
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				Static159.aClass3_Sub12_Sub1_4.method1342();
				local637 = Static159.aClass3_Sub12_Sub1_4.method1339();
				local642 = Static159.aClass3_Sub12_Sub1_4.method1359();
				@Pc(647) long local647 = (long) Static159.aClass3_Sub12_Sub1_4.method1376();
				local654 = (local642 << 32) + local647;
				@Pc(656) boolean local656 = false;
				local660 = Static159.aClass3_Sub12_Sub1_4.method1354();
				for (@Pc(662) int local662 = 0; local662 < 100; local662++) {
					if (Static101.aLongArray2[local662] == local654) {
						local656 = true;
						break;
					}
				}
				if (local660 <= 1) {
					for (local687 = 0; local687 < Static107.anInt2468; local687++) {
						if (Static63.aLongArray1[local687] == local629) {
							local656 = true;
							break;
						}
					}
				}
				if (!local656 && Static51.anInt1228 == 0) {
					Static101.aLongArray2[Static100.anInt2210] = local654;
					Static100.anInt2210 = (Static100.anInt2210 + 1) % 100;
					@Pc(731) Class73 local731 = Static21.method1055(Static30.method578(Static159.aClass3_Sub12_Sub1_4).method2437());
					if (local660 == 2 || local660 == 3) {
						Static50.method910(9, Static19.method372(new Class73[] { Static78.aClass73_930, Static168.method2643(local629).method2451() }), local731, Static168.method2643(local637).method2451());
					} else if (local660 == 1) {
						Static50.method910(9, Static19.method372(new Class73[] { Static80.aClass73_965, Static168.method2643(local629).method2451() }), local731, Static168.method2643(local637).method2451());
					} else {
						Static50.method910(9, Static168.method2643(local629).method2451(), local731, Static168.method2643(local637).method2451());
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(827) Class83 local827;
			if (Static132.anInt3019 == 130) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1356();
				local827 = Static80.method1396(local139);
				if (local149 != local827.anInt3725 || local149 == -1) {
					local827.anInt3693 = 0;
					local827.anInt3688 = 0;
					local827.anInt3725 = local149;
					Static60.method1104(local827);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 146) {
				Static81.method1409();
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(890) int local890;
			@Pc(898) int local898;
			if (Static132.anInt3019 == 16) {
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				local637 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local642 = Static159.aClass3_Sub12_Sub1_4.method1376();
				@Pc(886) boolean local886 = false;
				local890 = Static159.aClass3_Sub12_Sub1_4.method1354();
				@Pc(896) long local896 = (local637 << 32) + local642;
				for (local898 = 0; local898 < 100; local898++) {
					if (local896 == Static101.aLongArray2[local898]) {
						local886 = true;
						break;
					}
				}
				if (local890 <= 1) {
					for (@Pc(919) int local919 = 0; local919 < Static107.anInt2468; local919++) {
						if (local629 == Static63.aLongArray1[local919]) {
							local886 = true;
							break;
						}
					}
				}
				if (!local886 && Static51.anInt1228 == 0) {
					Static101.aLongArray2[Static100.anInt2210] = local896;
					Static100.anInt2210 = (Static100.anInt2210 + 1) % 100;
					@Pc(959) Class73 local959 = Static21.method1055(Static30.method578(Static159.aClass3_Sub12_Sub1_4).method2437());
					if (local890 == 2 || local890 == 3) {
						Static135.method2234(7, local959, Static19.method372(new Class73[] { Static78.aClass73_930, Static168.method2643(local629).method2451() }));
					} else if (local890 == 1) {
						Static135.method2234(7, local959, Static19.method372(new Class73[] { Static80.aClass73_965, Static168.method2643(local629).method2451() }));
					} else {
						Static135.method2234(3, local959, Static168.method2643(local629).method2451());
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(1044) Class83 local1044;
			if (Static132.anInt3019 == 80) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1380();
				local1044 = Static80.method1396(local187);
				Static132.anInt3019 = -1;
				local1044.anInt3703 = local139 + (local149 << 16);
				return true;
			}
			@Pc(1118) int local1118;
			@Pc(1074) boolean local1074;
			if (Static132.anInt3019 == 115) {
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1359();
				@Pc(1072) byte local1072 = Static159.aClass3_Sub12_Sub1_4.method1342();
				local1074 = false;
				if ((Long.MIN_VALUE & local629) != 0L) {
					local1074 = true;
				}
				if (local1074) {
					if (Static52.anInt1279 == 0) {
						Static132.anInt3019 = -1;
						return true;
					}
					local629 &= Long.MAX_VALUE;
					for (local420 = 0; Static52.anInt1279 > local420 && (local629 != Static139.aClass3_Sub5Array2[local420].aLong183 || local187 != Static139.aClass3_Sub5Array2[local420].anInt750); local420++) {
					}
					if (local420 < Static52.anInt1279) {
						while (Static52.anInt1279 - 1 > local420) {
							Static139.aClass3_Sub5Array2[local420] = Static139.aClass3_Sub5Array2[local420 + 1];
							local420++;
						}
						Static52.anInt1279--;
						Static139.aClass3_Sub5Array2[Static52.anInt1279] = null;
					}
				} else {
					@Pc(1088) Class3_Sub5 local1088 = new Class3_Sub5();
					local1088.aLong183 = local629;
					local1088.aClass73_434 = Static168.method2643(local1088.aLong183);
					local1088.anInt750 = local187;
					local1088.aByte1 = local1072;
					for (local890 = Static52.anInt1279 - 1; local890 >= 0; local890--) {
						local1118 = Static139.aClass3_Sub5Array2[local890].aClass73_434.method2408(local1088.aClass73_434);
						if (local1118 == 0) {
							Static139.aClass3_Sub5Array2[local890].anInt750 = local187;
							Static139.aClass3_Sub5Array2[local890].aByte1 = local1072;
							Static132.anInt3019 = -1;
							Static149.anInt3382 = Static84.anInt1893;
							if (Static38.aLong148 == local629) {
								Static88.aByte4 = local1072;
							}
							return true;
						}
						if (local1118 < 0) {
							break;
						}
					}
					if (Static52.anInt1279 >= Static139.aClass3_Sub5Array2.length) {
						Static132.anInt3019 = -1;
						return true;
					}
					for (local1118 = Static52.anInt1279 - 1; local1118 > local890; local1118--) {
						Static139.aClass3_Sub5Array2[local1118 + 1] = Static139.aClass3_Sub5Array2[local1118];
					}
					if (Static52.anInt1279 == 0) {
						Static139.aClass3_Sub5Array2 = new Class3_Sub5[100];
					}
					Static139.aClass3_Sub5Array2[local890 + 1] = local1088;
					Static52.anInt1279++;
					if (local629 == Static38.aLong148) {
						Static88.aByte4 = local1072;
					}
				}
				Static132.anInt3019 = -1;
				Static149.anInt3382 = Static84.anInt1893;
				return true;
			}
			if (Static132.anInt3019 == 161) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1381();
				Static85.method1506(local139);
				Static78.anIntArray181[Static170.anInt3730++ & 0x1F] = local139 & 0x7FFF;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 23) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1359();
				Static88.method1534(local187, local139, local149);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 147) {
				for (local139 = 0; local139 < Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1.length; local139++) {
					if (Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local139] != null) {
						Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local139].anInt3184 = -1;
					}
				}
				for (local149 = 0; local149 < Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1.length; local149++) {
					if (Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local149] != null) {
						Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local149].anInt3184 = -1;
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 191) {
				Static22.aBoolean40 = true;
				Static74.anInt1667 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static102.anInt2294 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static180.anInt3941 = Static159.aClass3_Sub12_Sub1_4.method1359();
				Static28.anInt757 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static72.anInt1641 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (Static72.anInt1641 >= 100) {
					local149 = Static102.anInt2294 * 128 + 64;
					local139 = Static74.anInt1667 * 128 + 64;
					local187 = Static107.method1922(local139, local149, Static147.anInt3309) - Static180.anInt3941;
					local420 = local149 - Static19.anInt513;
					local196 = local139 - Static34.anInt834;
					local198 = local187 - Static55.anInt1291;
					local890 = (int) Math.sqrt((double) (local196 * local196 + local420 * local420));
					Static130.anInt2973 = (int) (Math.atan2((double) local198, (double) local890) * 325.949D) & 0x7FF;
					Static141.anInt3252 = (int) (Math.atan2((double) local196, (double) local420) * -325.949D) & 0x7FF;
					if (Static130.anInt2973 < 128) {
						Static130.anInt2973 = 128;
					}
					if (Static130.anInt2973 > 383) {
						Static130.anInt2973 = 383;
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 88) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1378();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1378();
				Static147.anInt3309 = local187 >> 1;
				Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2267(local139, (local187 & 0x1) == 1, local149);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 254) {
				Static58.method1022(Static17.anInt3783, Static32.aClass39_2, Static159.aClass3_Sub12_Sub1_4);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 194) {
				Static107.anInt2468 = Static17.anInt3783 / 8;
				for (local139 = 0; local139 < Static107.anInt2468; local139++) {
					Static63.aLongArray1[local139] = Static159.aClass3_Sub12_Sub1_4.method1339();
					Static116.aClass73Array18[local139] = Static168.method2643(Static63.aLongArray1[local139]);
				}
				Static116.anInt2760 = Static84.anInt1893;
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(1602) Class73 local1602;
			if (Static132.anInt3019 == 20) {
				local1602 = Static159.aClass3_Sub12_Sub1_4.method1390();
				@Pc(1609) Object[] local1609 = new Object[local1602.method2435() + 1];
				for (local187 = local1602.method2435() - 1; local187 >= 0; local187--) {
					if (local1602.method2444(local187) == 115) {
						local1609[local187 + 1] = Static159.aClass3_Sub12_Sub1_4.method1390();
					} else {
						local1609[local187 + 1] = Integer.valueOf(Static159.aClass3_Sub12_Sub1_4.method1373());
					}
				}
				local1609[0] = Integer.valueOf(Static159.aClass3_Sub12_Sub1_4.method1373());
				@Pc(1660) Class3_Sub17 local1660 = new Class3_Sub17();
				local1660.anObjectArray3 = local1609;
				Static148.method2418(local1660);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 92) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local827 = Static80.method1396(local149);
				if (local827.anInt3734 != 2 || local827.anInt3678 != local139) {
					local827.anInt3678 = local139;
					local827.anInt3734 = 2;
					Static60.method1104(local827);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 109) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1349();
				@Pc(1734) boolean local1734 = Static159.aClass3_Sub12_Sub1_4.method1354() == 1;
				local827 = Static80.method1396(local139);
				if (local827.aBoolean249 != local1734) {
					local827.aBoolean249 = local1734;
					Static60.method1104(local827);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 30) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static111.method2018(local139);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 238) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1352();
				if (local139 == 65535) {
					local139 = -1;
				}
				local149 = Static159.aClass3_Sub12_Sub1_4.method1348();
				Static126.method2144(local139, local149);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 132) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1349();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local827 = Static80.method1396(local139);
				if (local827.anInt3734 != 1 || local827.anInt3678 != local149) {
					local827.anInt3678 = local149;
					local827.anInt3734 = 1;
					Static60.method1104(local827);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(1852) Class83 local1852;
			if (Static132.anInt3019 == 24) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local1852 = Static80.method1396(local139);
				local1852.anInt3734 = 3;
				local1852.anInt3678 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2.method1710();
				Static60.method1104(local1852);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 164) {
				Static150.method2591();
				Static132.anInt3019 = -1;
				return false;
			}
			if (Static132.anInt3019 == 193) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local196 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local198 = Static159.aClass3_Sub12_Sub1_4.method1359();
				Static26.aBooleanArray2[local139] = true;
				Static12.anIntArray14[local139] = local149;
				Static176.anIntArray418[local139] = local187;
				Static180.anIntArray429[local139] = local196;
				Static43.anIntArray95[local139] = local198;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 200) {
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				@Pc(1944) Class73 local1944 = Static21.method1055(Static30.method578(Static159.aClass3_Sub12_Sub1_4).method2437());
				Static135.method2234(6, local1944, Static168.method2643(local629).method2451());
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(1979) Class3_Sub13 local1979;
			if (Static132.anInt3019 == 179) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1377();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1378();
				local1979 = (Class3_Sub13) Static91.aClass16_9.method554((long) local149);
				if (local1979 != null) {
					Static8.method155(local1979, local1979.anInt1133 != local139);
				}
				Static175.method2697(local139, local149, local187);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 79) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (local139 < -70000) {
					local149 += 32768;
				}
				if (local139 >= 0) {
					local827 = Static80.method1396(local139);
				} else {
					local827 = null;
				}
				while (Static159.aClass3_Sub12_Sub1_4.anInt1793 < Static17.anInt3783) {
					local196 = Static159.aClass3_Sub12_Sub1_4.method1379();
					local198 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local420 = 0;
					if (local198 != 0) {
						local420 = Static159.aClass3_Sub12_Sub1_4.method1354();
						if (local420 == 255) {
							local420 = Static159.aClass3_Sub12_Sub1_4.method1373();
						}
					}
					if (local827 != null && local196 >= 0 && local827.anIntArray388.length > local196) {
						local827.anIntArray388[local196] = local198;
						local827.anIntArray389[local196] = local420;
					}
					Static150.method2603(local198 - 1, local196, local420, local149);
				}
				if (local827 != null) {
					Static60.method1104(local827);
				}
				Static150.method2601();
				Static78.anIntArray181[Static170.anInt3730++ & 0x1F] = local149 & 0x7FFF;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 57) {
				Static28.anInt749 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static116.anInt2764 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static103.anInt2327 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(2155) Class73 local2155;
			if (Static132.anInt3019 == 1) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local2155 = Static159.aClass3_Sub12_Sub1_4.method1390();
				local827 = Static80.method1396(local139);
				if (!local2155.method2430(local827.aClass73_1986)) {
					local827.aClass73_1986 = local2155;
					Static60.method1104(local827);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			@Pc(2303) int local2303;
			if (Static132.anInt3019 == 173) {
				Static149.anInt3382 = Static84.anInt1893;
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				if (local629 == 0L) {
					Static11.aClass73_158 = null;
					Static13.aClass73_191 = null;
					Static132.anInt3019 = -1;
					Static139.aClass3_Sub5Array2 = null;
					Static52.anInt1279 = 0;
					return true;
				}
				local637 = Static159.aClass3_Sub12_Sub1_4.method1339();
				Static13.aClass73_191 = Static168.method2643(local637);
				Static11.aClass73_158 = Static168.method2643(local629);
				Static140.aByte9 = Static159.aClass3_Sub12_Sub1_4.method1342();
				local198 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (local198 == 255) {
					Static132.anInt3019 = -1;
					return true;
				}
				Static52.anInt1279 = local198;
				@Pc(2238) Class3_Sub5[] local2238 = new Class3_Sub5[100];
				for (local890 = 0; local890 < Static52.anInt1279; local890++) {
					local2238[local890] = new Class3_Sub5();
					local2238[local890].aLong183 = Static159.aClass3_Sub12_Sub1_4.method1339();
					local2238[local890].aClass73_434 = Static168.method2643(local2238[local890].aLong183);
					local2238[local890].anInt750 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local2238[local890].aByte1 = Static159.aClass3_Sub12_Sub1_4.method1342();
					if (Static38.aLong148 == local2238[local890].aLong183) {
						Static88.aByte4 = local2238[local890].aByte1;
					}
				}
				local2303 = Static52.anInt1279;
				while (local2303 > 0) {
					@Pc(2307) boolean local2307 = true;
					local2303--;
					for (local898 = 0; local898 < local2303; local898++) {
						if (local2238[local898].aClass73_434.method2408(local2238[local898 + 1].aClass73_434) > 0) {
							@Pc(2329) Class3_Sub5 local2329 = local2238[local898];
							local2307 = false;
							local2238[local898] = local2238[local898 + 1];
							local2238[local898 + 1] = local2329;
						}
					}
					if (local2307) {
						break;
					}
				}
				Static132.anInt3019 = -1;
				Static139.aClass3_Sub5Array2 = local2238;
				return true;
			}
			if (Static132.anInt3019 == 159) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1394();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1349();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1356();
				local1044 = Static80.method1396(local149);
				local198 = local139 + local1044.anInt3726;
				local420 = local1044.anInt3668 + local187;
				if (local1044.anInt3667 != local198 || local1044.anInt3707 != local420) {
					local1044.anInt3707 = local420;
					local1044.anInt3667 = local198;
					Static60.method1104(local1044);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 69 || Static132.anInt3019 == 22 || Static132.anInt3019 == 172 || Static132.anInt3019 == 148 || Static132.anInt3019 == 175 || Static132.anInt3019 == 114 || Static132.anInt3019 == 204 || Static132.anInt3019 == 157 || Static132.anInt3019 == 39 || Static132.anInt3019 == 64 || Static132.anInt3019 == 83) {
				Static87.method1531();
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 71) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1380();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1352();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1377();
				local196 = Static159.aClass3_Sub12_Sub1_4.method1377();
				@Pc(2501) Class83 local2501 = Static80.method1396(local139);
				if (local187 != local2501.anInt3672 || local2501.anInt3704 != local149 || local2501.anInt3741 != local196) {
					local2501.anInt3704 = local149;
					local2501.anInt3741 = local196;
					local2501.anInt3672 = local187;
					Static60.method1104(local2501);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 96) {
				@Pc(2540) byte local2540 = Static159.aClass3_Sub12_Sub1_4.method1370();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1352();
				Static20.anIntArray49[local149] = local2540;
				if (local2540 != Static81.anIntArray186[local149]) {
					Static81.anIntArray186[local149] = local2540;
					Static136.method2237(local149);
				}
				Static77.anIntArray180[Static162.anInt3544++ & 0x1F] = local149;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 18) {
				Static150.method2601();
				Static38.anInt3121 = Static159.aClass3_Sub12_Sub1_4.method1375();
				Static138.anInt3197 = Static84.anInt1893;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 145) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local1852 = Static80.method1396(local139);
				for (local187 = 0; local187 < local1852.anIntArray388.length; local187++) {
					local1852.anIntArray388[local187] = -1;
					local1852.anIntArray388[local187] = 0;
				}
				Static60.method1104(local1852);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 230) {
				Static68.anInt1579 = Static159.aClass3_Sub12_Sub1_4.method1378();
				Static20.anInt534 = Static159.aClass3_Sub12_Sub1_4.method1387();
				for (local139 = Static68.anInt1579; local139 < Static68.anInt1579 + 8; local139++) {
					for (local149 = Static20.anInt534; local149 < Static20.anInt534 + 8; local149++) {
						if (Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local139][local149] != null) {
							Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local139][local149] = null;
							Static109.method1954(local149, local139);
						}
					}
				}
				for (@Pc(2695) Class3_Sub10 local2695 = (Class3_Sub10) Static29.aClass72_11.method2401(); local2695 != null; local2695 = (Class3_Sub10) Static29.aClass72_11.method2407()) {
					if (local2695.anInt998 >= Static68.anInt1579 && Static68.anInt1579 + 8 > local2695.anInt998 && Static20.anInt534 <= local2695.anInt996 && local2695.anInt996 < Static20.anInt534 + 8 && local2695.anInt995 == Static147.anInt3309) {
						local2695.anInt989 = 0;
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 7) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local827 = Static80.method1396(local139);
				if (local827 != null && local827.anInt3722 == 0) {
					if (local827.anInt3691 - local827.anInt3708 < local149) {
						local149 = local827.anInt3691 - local827.anInt3708;
					}
					if (local149 < 0) {
						local149 = 0;
					}
					if (local827.anInt3689 != local149) {
						local827.anInt3689 = local149;
						Static60.method1104(local827);
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 68) {
				Static59.anInt2722 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 228) {
				for (local139 = 0; local139 < Static152.anInt3403; local139++) {
					@Pc(2832) Class3_Sub1_Sub12 local2832 = Static62.method1120(local139);
					if (local2832 != null && local2832.anInt1934 == 0) {
						Static20.anIntArray49[local139] = 0;
						Static81.anIntArray186[local139] = 0;
					}
				}
				Static150.method2601();
				Static132.anInt3019 = -1;
				Static162.anInt3544 += 32;
				return true;
			}
			if (Static132.anInt3019 == 188) {
				Static94.anInt2079 = Static159.aClass3_Sub12_Sub1_4.method1381() * 30;
				Static138.anInt3197 = Static84.anInt1893;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 217) {
				Static150.anInt3582 = Static159.aClass3_Sub12_Sub1_4.method1354();
				Static132.anInt3019 = -1;
				Static116.anInt2760 = Static84.anInt1893;
				return true;
			}
			if (Static132.anInt3019 == 47) {
				Static28.method567(true);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 110) {
				for (local139 = 0; local139 < Static81.anIntArray186.length; local139++) {
					if (Static81.anIntArray186[local139] != Static20.anIntArray49[local139]) {
						Static81.anIntArray186[local139] = Static20.anIntArray49[local139];
						Static136.method2237(local139);
						Static77.anIntArray180[Static162.anInt3544++ & 0x1F] = local139;
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 167) {
				local1602 = Static159.aClass3_Sub12_Sub1_4.method1390();
				if (local1602.method2445(Static84.aClass73_1013)) {
					local2155 = local1602.method2413(local1602.method2429(Static128.aClass73_1653), 0);
					local1074 = false;
					local637 = local2155.method2425();
					for (local420 = 0; local420 < Static107.anInt2468; local420++) {
						if (local637 == Static63.aLongArray1[local420]) {
							local1074 = true;
							break;
						}
					}
					if (!local1074 && Static51.anInt1228 == 0) {
						Static135.method2234(4, Static79.aClass73_946, local2155);
					}
				} else if (local1602.method2445(Static44.aClass73_598)) {
					local1074 = false;
					local2155 = local1602.method2413(local1602.method2429(Static128.aClass73_1653), 0);
					local637 = local2155.method2425();
					for (local420 = 0; local420 < Static107.anInt2468; local420++) {
						if (Static63.aLongArray1[local420] == local637) {
							local1074 = true;
							break;
						}
					}
					if (!local1074 && Static51.anInt1228 == 0) {
						Static135.method2234(8, Static20.aClass73_303, local2155);
					}
				} else if (local1602.method2445(Static2.aClass73_2)) {
					local2155 = local1602.method2413(local1602.method2429(Static128.aClass73_1653), 0);
					local637 = local2155.method2425();
					local1074 = false;
					for (local420 = 0; local420 < Static107.anInt2468; local420++) {
						if (Static63.aLongArray1[local420] == local637) {
							local1074 = true;
							break;
						}
					}
					if (!local1074 && Static51.anInt1228 == 0) {
						@Pc(3175) Class73 local3175 = local1602.method2413(local1602.method2435() - 9, local1602.method2429(Static128.aClass73_1653) + 1);
						Static135.method2234(8, local3175, local2155);
					}
				} else if (local1602.method2445(Static101.aClass73_1308)) {
					local1074 = false;
					local2155 = local1602.method2413(local1602.method2429(Static128.aClass73_1653), 0);
					local637 = local2155.method2425();
					for (local420 = 0; local420 < Static107.anInt2468; local420++) {
						if (Static63.aLongArray1[local420] == local637) {
							local1074 = true;
							break;
						}
					}
					if (!local1074 && Static51.anInt1228 == 0) {
						Static135.method2234(10, Static173.aClass73_2030, local2155);
					}
				} else if (local1602.method2445(Static57.aClass73_735)) {
					local2155 = local1602.method2413(local1602.method2429(Static57.aClass73_735), 0);
					Static135.method2234(11, local2155, Static173.aClass73_2030);
				} else if (local1602.method2445(Static136.aClass73_1715)) {
					local2155 = local1602.method2413(local1602.method2429(Static136.aClass73_1715), 0);
					if (Static51.anInt1228 == 0) {
						Static135.method2234(12, local2155, Static173.aClass73_2030);
					}
				} else if (local1602.method2445(Static43.aClass73_584)) {
					local2155 = local1602.method2413(local1602.method2429(Static43.aClass73_584), 0);
					if (Static51.anInt1228 == 0) {
						Static135.method2234(13, local2155, Static173.aClass73_2030);
					}
				} else {
					Static135.method2234(0, local1602, Static173.aClass73_2030);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 224) {
				Static150.method2601();
				local139 = Static159.aClass3_Sub12_Sub1_4.method1349();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1354();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1378();
				Static12.anIntArray15[local187] = local139;
				Static122.anIntArray70[local187] = local149;
				Static54.anIntArray133[local187] = 1;
				for (local196 = 0; local196 < 98; local196++) {
					if (Class3_Sub2_Sub4.anIntArray48[local196] <= local139) {
						Static54.anIntArray133[local187] = local196 + 2;
					}
				}
				Static50.anIntArray112[Static79.anInt1739++ & 0x1F] = local187;
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 27) {
				local139 = Static159.aClass3_Sub12_Sub1_4.anInt1793 + Static17.anInt3783;
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (Static133.anInt3052 != local149) {
					Static133.anInt3052 = local149;
					Static130.method2166(Static133.anInt3052);
					Static119.method2071(Static133.anInt3052);
					for (local196 = 0; local196 < 100; local196++) {
						Static27.aBooleanArray3[local196] = true;
					}
				}
				while (local187-- > 0) {
					local196 = Static159.aClass3_Sub12_Sub1_4.method1373();
					local198 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local420 = Static159.aClass3_Sub12_Sub1_4.method1354();
					@Pc(3416) Class3_Sub13 local3416 = (Class3_Sub13) Static91.aClass16_9.method554((long) local196);
					if (local3416 != null && local3416.anInt1133 != local198) {
						Static8.method155(local3416, true);
						local3416 = null;
					}
					if (local3416 == null) {
						local3416 = Static175.method2697(local198, local196, local420);
					}
					local3416.aBoolean77 = true;
				}
				for (local1979 = (Class3_Sub13) Static91.aClass16_9.method551(); local1979 != null; local1979 = (Class3_Sub13) Static91.aClass16_9.method552()) {
					if (local1979.aBoolean77) {
						local1979.aBoolean77 = false;
					} else {
						Static8.method155(local1979, true);
					}
				}
				Static146.aClass16_10 = new Class16(512);
				while (Static159.aClass3_Sub12_Sub1_4.anInt1793 < local139) {
					local198 = Static159.aClass3_Sub12_Sub1_4.method1373();
					local420 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local890 = Static159.aClass3_Sub12_Sub1_4.method1359();
					local1118 = Static159.aClass3_Sub12_Sub1_4.method1373();
					for (local660 = local420; local660 <= local890; local660++) {
						local654 = ((long) local198 << 32) + ((long) local660);
						Static146.aClass16_10.method546(new Class3_Sub7(local1118), local654);
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 169) {
				Static28.method567(false);
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 129) {
				local629 = Static159.aClass3_Sub12_Sub1_4.method1339();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1359();
				local196 = Static159.aClass3_Sub12_Sub1_4.method1354();
				@Pc(3565) Class73 local3565 = Static168.method2643(local629).method2451();
				for (local420 = 0; local420 < Static166.anInt3619; local420++) {
					if (Static138.aLongArray5[local420] == local629) {
						if (Static109.anIntArray283[local420] != local187) {
							Static109.anIntArray283[local420] = local187;
							if (local187 > 0) {
								Static135.method2234(5, Static19.method372(new Class73[] { local3565, Static32.aClass73_477 }), Static173.aClass73_2030);
							}
							if (local187 == 0) {
								Static135.method2234(5, Static19.method372(new Class73[] { local3565, Static74.aClass73_906 }), Static173.aClass73_2030);
							}
						}
						local3565 = null;
						Static85.anIntArray199[local420] = local196;
						break;
					}
				}
				if (local3565 != null && Static166.anInt3619 < 200) {
					Static138.aLongArray5[Static166.anInt3619] = local629;
					Static115.aClass73Array17[Static166.anInt3619] = local3565;
					Static109.anIntArray283[Static166.anInt3619] = local187;
					Static85.anIntArray199[Static166.anInt3619] = local196;
					Static166.anInt3619++;
				}
				Static116.anInt2760 = Static84.anInt1893;
				local1118 = Static166.anInt3619;
				while (local1118 > 0) {
					local1118--;
					@Pc(3674) boolean local3674 = true;
					for (local660 = 0; local660 < local1118; local660++) {
						if (Static94.anInt2078 != Static109.anIntArray283[local660] && Static109.anIntArray283[local660 + 1] == Static94.anInt2078 || Static109.anIntArray283[local660] == 0 && Static109.anIntArray283[local660 + 1] != 0) {
							local3674 = false;
							local2303 = Static109.anIntArray283[local660];
							Static109.anIntArray283[local660] = Static109.anIntArray283[local660 + 1];
							Static109.anIntArray283[local660 + 1] = local2303;
							@Pc(3734) Class73 local3734 = Static115.aClass73Array17[local660];
							Static115.aClass73Array17[local660] = Static115.aClass73Array17[local660 + 1];
							Static115.aClass73Array17[local660 + 1] = local3734;
							@Pc(3752) long local3752 = Static138.aLongArray5[local660];
							Static138.aLongArray5[local660] = Static138.aLongArray5[local660 + 1];
							Static138.aLongArray5[local660 + 1] = local3752;
							local687 = Static85.anIntArray199[local660];
							Static85.anIntArray199[local660] = Static85.anIntArray199[local660 + 1];
							Static85.anIntArray199[local660 + 1] = local687;
						}
					}
					if (local3674) {
						break;
					}
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 225) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local2155 = Static159.aClass3_Sub12_Sub1_4.method1390();
				local187 = Static159.aClass3_Sub12_Sub1_4.method1347();
				if (local139 >= 1 && local139 <= 8) {
					if (local2155.method2438(Static39.aClass73_542)) {
						local2155 = null;
					}
					Static173.aClass73Array28[local139 - 1] = local2155;
					Static101.aBooleanArray10[local139 - 1] = local187 == 0;
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 89) {
				Static160.anInt3497 = Static159.aClass3_Sub12_Sub1_4.method1354();
				if (Static160.anInt3497 == 1) {
					Static91.anInt2032 = Static159.aClass3_Sub12_Sub1_4.method1359();
				}
				if (Static160.anInt3497 >= 2 && Static160.anInt3497 <= 6) {
					if (Static160.anInt3497 == 2) {
						Static32.anInt820 = 64;
						Static165.anInt322 = 64;
					}
					if (Static160.anInt3497 == 3) {
						Static165.anInt322 = 64;
						Static32.anInt820 = 0;
					}
					if (Static160.anInt3497 == 4) {
						Static32.anInt820 = 128;
						Static165.anInt322 = 64;
					}
					if (Static160.anInt3497 == 5) {
						Static165.anInt322 = 0;
						Static32.anInt820 = 64;
					}
					if (Static160.anInt3497 == 6) {
						Static32.anInt820 = 64;
						Static165.anInt322 = 128;
					}
					Static160.anInt3497 = 2;
					Static78.anInt1721 = Static159.aClass3_Sub12_Sub1_4.method1359();
					Static39.anInt918 = Static159.aClass3_Sub12_Sub1_4.method1359();
					Static28.anInt753 = Static159.aClass3_Sub12_Sub1_4.method1354();
				}
				if (Static160.anInt3497 == 10) {
					Static71.anInt1633 = Static159.aClass3_Sub12_Sub1_4.method1359();
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 181) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (local149 == 65535) {
					local149 = -1;
				}
				local187 = Static159.aClass3_Sub12_Sub1_4.method1384();
				local1044 = Static80.method1396(local139);
				@Pc(3989) Class3_Sub1_Sub7 local3989;
				if (local1044.aBoolean257) {
					local1044.anInt3682 = local149;
					local1044.anInt3732 = local187;
					local3989 = Static3.method42(local149);
					local1044.anInt3704 = local3989.anInt1218;
					local1044.anInt3686 = local3989.anInt1217;
					local1044.anInt3679 = local3989.anInt1202;
					local1044.anInt3695 = local3989.anInt1232;
					local1044.anInt3672 = local3989.anInt1229;
					local1044.anInt3741 = local3989.anInt1244;
					if (local1044.anInt3670 > 0) {
						local1044.anInt3741 = local1044.anInt3741 * 32 / local1044.anInt3670;
					}
					Static60.method1104(local1044);
				} else if (local149 == -1) {
					local1044.anInt3734 = 0;
					Static132.anInt3019 = -1;
					return true;
				} else {
					local3989 = Static3.method42(local149);
					local1044.anInt3741 = local3989.anInt1244 * 100 / local187;
					local1044.anInt3672 = local3989.anInt1229;
					local1044.anInt3704 = local3989.anInt1218;
					local1044.anInt3734 = 4;
					local1044.anInt3678 = local149;
					Static60.method1104(local1044);
				}
				Static132.anInt3019 = -1;
				return true;
			}
			if (Static132.anInt3019 == 43) {
				local139 = Static159.aClass3_Sub12_Sub1_4.method1373();
				local149 = Static159.aClass3_Sub12_Sub1_4.method1359();
				if (local139 < -70000) {
					local149 += 32768;
				}
				if (local139 >= 0) {
					local827 = Static80.method1396(local139);
				} else {
					local827 = null;
				}
				if (local827 != null) {
					for (local196 = 0; local196 < local827.anIntArray388.length; local196++) {
						local827.anIntArray388[local196] = 0;
						local827.anIntArray389[local196] = 0;
					}
				}
				Static141.method2351(local149);
				local196 = Static159.aClass3_Sub12_Sub1_4.method1359();
				for (local198 = 0; local198 < local196; local198++) {
					local420 = Static159.aClass3_Sub12_Sub1_4.method1347();
					if (local420 == 255) {
						local420 = Static159.aClass3_Sub12_Sub1_4.method1373();
					}
					local890 = Static159.aClass3_Sub12_Sub1_4.method1381();
					if (local827 != null && local827.anIntArray388.length > local198) {
						local827.anIntArray388[local198] = local890;
						local827.anIntArray389[local198] = local420;
					}
					Static150.method2603(local890 - 1, local198, local420, local149);
				}
				if (local827 != null) {
					Static60.method1104(local827);
				}
				Static150.method2601();
				Static78.anIntArray181[Static170.anInt3730++ & 0x1F] = local149 & 0x7FFF;
				Static132.anInt3019 = -1;
				return true;
			}
			Static29.method571(null, "T1 - " + Static132.anInt3019 + "," + Static144.anInt3454 + "," + Static58.anInt1360 + " - " + Static17.anInt3783);
			Static150.method2591();
		} catch (@Pc(4233) IOException local4233) {
			Static10.method177();
		} catch (@Pc(4237) Exception local4237) {
			@Pc(4278) String local4278 = "T2 - " + Static132.anInt3019 + "," + Static144.anInt3454 + "," + Static58.anInt1360 + " - " + Static17.anInt3783 + "," + (Static151.anInt3389 + Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0]) + "," + (Static134.anInt3066 + Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0]) + " - ";
			for (local149 = 0; local149 < Static17.anInt3783 && local149 < 50; local149++) {
				local4278 = local4278 + Static159.aClass3_Sub12_Sub1_4.aByteArray16[local149] + ",";
			}
			Static29.method571(local4237, local4278);
			Static150.method2591();
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method2489() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
