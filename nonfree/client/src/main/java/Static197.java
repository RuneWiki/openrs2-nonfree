import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public static int anInt4207;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "J")
	public static long aLong133;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1435 = Static200.method3116("Konfig geladen)3");

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public static int anInt4201 = 0;

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1439 = Static200.method3116("World");

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1436 = aClass60_1439;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1437 = Static200.method3116(")1 ");

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1438 = Static200.method3116("<img=1>");

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1440 = aClass60_1439;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1441 = Static200.method3116("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)I")
	public static int method3068(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(20) int local20 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local20 * arg0 >> 12) + 40960;
		return local14 * local32 >> 12;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
	public static boolean method3069() throws IOException {
		if (Static184.aClass55_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static184.aClass55_3.method1757();
		if (local13 == 0) {
			return false;
		}
		if (Static172.anInt3718 == -1) {
			Static184.aClass55_3.method1759(1, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
			local13--;
			Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
			Static172.anInt3718 = Static16.aClass1_Sub9_Sub1_1.method957();
			Static27.anInt644 = Static25.anIntArray98[Static172.anInt3718];
		}
		if (Static27.anInt644 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static184.aClass55_3.method1759(1, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
			Static27.anInt644 = Static16.aClass1_Sub9_Sub1_1.aByteArray20[0] & 0xFF;
		}
		if (Static27.anInt644 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static184.aClass55_3.method1759(2, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
			Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
			Static27.anInt644 = Static16.aClass1_Sub9_Sub1_1.method946();
		}
		if (Static27.anInt644 > local13) {
			return false;
		}
		Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
		Static184.aClass55_3.method1759(Static27.anInt644, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
		Static7.anInt182 = Static52.anInt1420;
		Static52.anInt1420 = Static161.anInt3566;
		Static42.anInt909 = 0;
		Static161.anInt3566 = Static172.anInt3718;
		@Pc(139) int local139;
		@Pc(156) int local156;
		@Pc(135) int local135;
		@Pc(148) Class6 local148;
		@Pc(196) int local196;
		@Pc(204) int local204;
		@Pc(208) int local208;
		if (Static172.anInt3718 == 186) {
			local135 = Static16.aClass1_Sub9_Sub1_1.method915();
			local139 = Static16.aClass1_Sub9_Sub1_1.method946();
			if (local135 >= 0) {
				local148 = Static107.method1857(local135);
			} else {
				local148 = null;
			}
			if (local148 != null) {
				for (local156 = 0; local156 < local148.anIntArray31.length; local156++) {
					local148.anIntArray31[local156] = 0;
					local148.anIntArray26[local156] = 0;
				}
			}
			if (local135 < -70000) {
				local139 += 32768;
			}
			Static206.method3208(local139);
			local156 = Static16.aClass1_Sub9_Sub1_1.method946();
			for (local196 = 0; local196 < local156; local196++) {
				local204 = Static16.aClass1_Sub9_Sub1_1.method901();
				local208 = Static16.aClass1_Sub9_Sub1_1.method930();
				if (local208 == 255) {
					local208 = Static16.aClass1_Sub9_Sub1_1.method905();
				}
				if (local148 != null && local148.anIntArray31.length > local196) {
					local148.anIntArray31[local196] = local204;
					local148.anIntArray26[local196] = local208;
				}
				Static152.method2599(local204 - 1, local196, local139, local208);
			}
			if (local148 != null) {
				Static57.method1068(local148);
			}
			Static79.method1400();
			Static152.anIntArray442[Static18.anInt465++ & 0x1F] = local139 & 0x7FFF;
			Static172.anInt3718 = -1;
			return true;
		}
		@Pc(302) int local302;
		if (Static172.anInt3718 == 86) {
			local135 = Static16.aClass1_Sub9_Sub1_1.method895();
			local139 = Static16.aClass1_Sub9_Sub1_1.method885();
			if (local135 == 1) {
				Static26.method432();
				for (local302 = 0; local302 < 4; local302++) {
					Static153.aClass3Array1[local302].method43();
				}
				System.gc();
			} else if (local135 == 2) {
				Static49.method958();
				System.gc();
				Static85.method1486(25);
			}
			Static83.anInt1958 = local139;
			Static93.method1621(local139);
			Static64.method1159();
			Static129.method922(Static83.anInt1958);
			for (local302 = 0; local302 < 100; local302++) {
				Static153.aBooleanArray19[local302] = true;
			}
			Static172.anInt3718 = -1;
			return true;
		} else if (Static172.anInt3718 == 240) {
			Static189.method2975();
			Static172.anInt3718 = -1;
			return false;
		} else if (Static172.anInt3718 == 197) {
			Static69.aShort14 = (short) Static16.aClass1_Sub9_Sub1_1.method885();
			if (Static69.aShort14 <= 0) {
				Static69.aShort14 = 320;
			}
			Static165.aShort28 = (short) Static16.aClass1_Sub9_Sub1_1.method901();
			if (Static165.aShort28 <= 0) {
				Static165.aShort28 = 256;
			}
			Static172.anInt3718 = -1;
			return true;
		} else {
			@Pc(418) Class6 local418;
			if (Static172.anInt3718 == 244) {
				local135 = Static16.aClass1_Sub9_Sub1_1.method892();
				local139 = Static16.aClass1_Sub9_Sub1_1.method934();
				local302 = Static16.aClass1_Sub9_Sub1_1.method931();
				local418 = Static107.method1857(local135);
				local418.anInt262 = local418.anInt252 = local139;
				local418.anInt235 = local418.anInt197 = local302;
				local418.aByte5 = 0;
				local418.aByte6 = 0;
				Static57.method1068(local418);
				Static172.anInt3718 = -1;
				return true;
			} else if (Static172.anInt3718 == 66) {
				@Pc(451) byte[] local451 = new byte[Static27.anInt644];
				Static16.aClass1_Sub9_Sub1_1.method956(local451, Static27.anInt644);
				Static156.method2636(Static102.method1755(Static27.anInt644, 0, local451));
				Static172.anInt3718 = -1;
				return true;
			} else if (Static172.anInt3718 == 204) {
				Static79.method1400();
				local135 = Static16.aClass1_Sub9_Sub1_1.method939();
				local139 = Static16.aClass1_Sub9_Sub1_1.method942();
				local302 = Static16.aClass1_Sub9_Sub1_1.method923();
				Static157.anIntArray452[local135] = local302;
				Static173.anIntArray493[local135] = local139;
				Static105.anIntArray305[local135] = 1;
				for (local156 = 0; local156 < 98; local156++) {
					if (Class79.anIntArray458[local156] <= local302) {
						Static105.anIntArray305[local135] = local156 + 2;
					}
				}
				Static172.anIntArray487[Static38.anInt874++ & 0x1F] = local135;
				Static172.anInt3718 = -1;
				return true;
			} else if (Static172.anInt3718 == 54) {
				Static79.method1400();
				Static56.anInt1486 = Static16.aClass1_Sub9_Sub1_1.method932();
				Static172.anInt3718 = -1;
				Static46.anInt1054 = Static171.anInt3707;
				return true;
			} else if (Static172.anInt3718 == 21) {
				Static110.method1905(true);
				Static172.anInt3718 = -1;
				return true;
			} else if (Static172.anInt3718 == 242) {
				local135 = Static16.aClass1_Sub9_Sub1_1.method915();
				@Pc(577) Class1_Sub11 local577 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local135);
				if (local577 != null) {
					Static92.method1615(local577, true);
				}
				if (Static168.aClass6_14 != null) {
					Static57.method1068(Static168.aClass6_14);
					Static168.aClass6_14 = null;
				}
				Static172.anInt3718 = -1;
				return true;
			} else if (Static172.anInt3718 == 114) {
				local135 = Static16.aClass1_Sub9_Sub1_1.method895();
				local139 = Static16.aClass1_Sub9_Sub1_1.method930();
				local302 = Static16.aClass1_Sub9_Sub1_1.method939();
				Static180.anInt3841 = local135 >> 1;
				Static84.aClass9_Sub4_Sub1_2.method2909(local139, local302, (local135 & 0x1) == 1);
				Static172.anInt3718 = -1;
				return true;
			} else {
				@Pc(660) Class1_Sub11 local660;
				if (Static172.anInt3718 == 25) {
					local135 = Static16.aClass1_Sub9_Sub1_1.method915();
					local139 = Static16.aClass1_Sub9_Sub1_1.method946();
					local302 = Static16.aClass1_Sub9_Sub1_1.method895();
					local660 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local135);
					if (local660 != null) {
						Static92.method1615(local660, local139 != local660.anInt1626);
					}
					Static157.method2656(local302, local139, local135);
					Static172.anInt3718 = -1;
					return true;
				} else if (Static172.anInt3718 == 184) {
					Static9.anInt4431 = Static16.aClass1_Sub9_Sub1_1.method916() * 30;
					Static46.anInt1054 = Static171.anInt3707;
					Static172.anInt3718 = -1;
					return true;
				} else if (Static172.anInt3718 == 249) {
					local135 = Static16.aClass1_Sub9_Sub1_1.method885();
					local139 = Static16.aClass1_Sub9_Sub1_1.method915();
					local302 = local135 >> 10 & 0x1F;
					local156 = local135 >> 5 & 0x1F;
					local196 = local135 & 0x1F;
					@Pc(730) Class6 local730 = Static107.method1857(local139);
					local204 = (local156 << 11) + ((local302 << 19) + (local196 << 3));
					if (local730.anInt191 != local204) {
						local730.anInt191 = local204;
						Static57.method1068(local730);
					}
					Static172.anInt3718 = -1;
					return true;
				} else {
					@Pc(766) Class60 local766;
					if (Static172.anInt3718 == 53) {
						local766 = Static16.aClass1_Sub9_Sub1_1.method935();
						@Pc(773) Object[] local773 = new Object[local766.method1835() + 1];
						for (local302 = local766.method1835() - 1; local302 >= 0; local302--) {
							if (local766.method1793(local302) == 115) {
								local773[local302 + 1] = Static16.aClass1_Sub9_Sub1_1.method935();
							} else {
								local773[local302 + 1] = Integer.valueOf(Static16.aClass1_Sub9_Sub1_1.method915());
							}
						}
						local773[0] = Integer.valueOf(Static16.aClass1_Sub9_Sub1_1.method915());
						@Pc(830) Class1_Sub8 local830 = new Class1_Sub8();
						local830.anObjectArray29 = local773;
						Static93.method1622(local830);
						Static172.anInt3718 = -1;
						return true;
					}
					@Pc(901) Class6 local901;
					if (Static172.anInt3718 == 239) {
						local135 = Static16.aClass1_Sub9_Sub1_1.method915();
						local139 = Static16.aClass1_Sub9_Sub1_1.method915();
						@Pc(860) Class1_Sub11 local860 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local135);
						local660 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local139);
						if (local660 != null) {
							Static92.method1615(local660, local860 == null || local660.anInt1626 != local860.anInt1626);
						}
						if (local860 != null) {
							local860.method3530();
							Static10.aClass33_1.method1072((long) local139, local860);
						}
						local901 = Static107.method1857(local135);
						if (local901 != null) {
							Static57.method1068(local901);
						}
						local901 = Static107.method1857(local139);
						if (local901 != null) {
							Static57.method1068(local901);
							Static178.method2848(true, local901);
						}
						if (Static83.anInt1958 != -1) {
							Static140.method2400(Static83.anInt1958, 1);
						}
						Static172.anInt3718 = -1;
						return true;
					}
					@Pc(946) Class6 local946;
					if (Static172.anInt3718 == 200) {
						local135 = Static16.aClass1_Sub9_Sub1_1.method923();
						local946 = Static107.method1857(local135);
						for (local302 = 0; local302 < local946.anIntArray31.length; local302++) {
							local946.anIntArray31[local302] = -1;
							local946.anIntArray31[local302] = 0;
						}
						Static57.method1068(local946);
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 248) {
						for (local135 = 0; local135 < Static41.aClass9_Sub4_Sub1Array2.length; local135++) {
							if (Static41.aClass9_Sub4_Sub1Array2[local135] != null) {
								Static41.aClass9_Sub4_Sub1Array2[local135].anInt3896 = -1;
							}
						}
						for (local139 = 0; local139 < Static1.aClass9_Sub4_Sub2Array1.length; local139++) {
							if (Static1.aClass9_Sub4_Sub2Array1[local139] != null) {
								Static1.aClass9_Sub4_Sub2Array1[local139].anInt3896 = -1;
							}
						}
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 77) {
						local135 = Static16.aClass1_Sub9_Sub1_1.method923();
						local139 = Static16.aClass1_Sub9_Sub1_1.method885();
						local302 = Static16.aClass1_Sub9_Sub1_1.method946();
						local156 = Static16.aClass1_Sub9_Sub1_1.method946();
						if (local135 >> 30 != 0) {
							local196 = local135 >> 28 & 0x3;
							local208 = (local135 & 0x3FFF) - Static163.anInt3587;
							local204 = (local135 >> 14 & 0x3FFF) - Static128.anInt2813;
							if (local204 >= 0 && local208 >= 0 && local204 < 104 && local208 < 104) {
								local208 = local208 * 128 + 64;
								local204 = local204 * 128 + 64;
								@Pc(1111) Class9_Sub6 local1111 = new Class9_Sub6(local139, local196, local204, local208, Static165.method2268(local208, local196, local204) - local156, local302, Static42.anInt910);
								Static107.aClass19_10.method620(new Class1_Sub1_Sub25(local1111));
							}
						} else if (local135 >> 29 != 0) {
							local196 = local135 & 0xFFFF;
							@Pc(1190) Class9_Sub4_Sub2 local1190 = Static1.aClass9_Sub4_Sub2Array1[local196];
							if (local1190 != null) {
								local1190.anInt3934 = local156;
								local1190.anInt3929 = 0;
								local1190.anInt3904 = local302 + Static42.anInt910;
								local1190.anInt3893 = 0;
								local1190.anInt3914 = local139;
								if (local1190.anInt3914 == 65535) {
									local1190.anInt3914 = -1;
								}
								if (local1190.anInt3904 > Static42.anInt910) {
									local1190.anInt3893 = -1;
								}
							}
						} else if (local135 >> 28 != 0) {
							local196 = local135 & 0xFFFF;
							@Pc(1139) Class9_Sub4_Sub1 local1139;
							if (local196 == Static65.anInt1615) {
								local1139 = Static84.aClass9_Sub4_Sub1_2;
							} else {
								local1139 = Static41.aClass9_Sub4_Sub1Array2[local196];
							}
							if (local1139 != null) {
								local1139.anInt3904 = Static42.anInt910 + local302;
								local1139.anInt3934 = local156;
								local1139.anInt3893 = 0;
								if (Static42.anInt910 < local1139.anInt3904) {
									local1139.anInt3893 = -1;
								}
								local1139.anInt3929 = 0;
								local1139.anInt3914 = local139;
								if (local1139.anInt3914 == 65535) {
									local1139.anInt3914 = -1;
								}
							}
						}
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 191) {
						@Pc(1249) boolean local1249 = Static16.aClass1_Sub9_Sub1_1.method939() == 1;
						local139 = Static16.aClass1_Sub9_Sub1_1.method923();
						local148 = Static107.method1857(local139);
						if (local1249 != local148.aBoolean21) {
							local148.aBoolean21 = local1249;
							Static57.method1068(local148);
						}
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 134) {
						Static180.anInt3843 = Static16.aClass1_Sub9_Sub1_1.method942();
						Static194.anInt4138 = Static16.aClass1_Sub9_Sub1_1.method895();
						while (Static16.aClass1_Sub9_Sub1_1.anInt1192 < Static27.anInt644) {
							Static172.anInt3718 = Static16.aClass1_Sub9_Sub1_1.method895();
							Static29.method538();
						}
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 253) {
						Static144.aBoolean179 = false;
						for (local135 = 0; local135 < 5; local135++) {
							Static216.aBooleanArray25[local135] = false;
						}
						Static172.anInt3718 = -1;
						return true;
					} else if (Static172.anInt3718 == 19) {
						Static209.method3285();
						Static172.anInt3718 = -1;
						return true;
					} else {
						@Pc(1343) long local1343;
						@Pc(1375) int local1375;
						@Pc(1449) Class60 local1449;
						@Pc(1351) long local1351;
						@Pc(1363) long local1363;
						@Pc(1369) int local1369;
						@Pc(1356) long local1356;
						@Pc(1383) int local1383;
						if (Static172.anInt3718 == 129) {
							local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
							Static16.aClass1_Sub9_Sub1_1.method891();
							local1351 = Static16.aClass1_Sub9_Sub1_1.method909();
							local1356 = Static16.aClass1_Sub9_Sub1_1.method946();
							local1363 = Static16.aClass1_Sub9_Sub1_1.method920();
							local1369 = Static16.aClass1_Sub9_Sub1_1.method895();
							@Pc(1371) boolean local1371 = false;
							local1375 = Static16.aClass1_Sub9_Sub1_1.method946();
							@Pc(1381) long local1381 = (local1356 << 32) + local1363;
							local1383 = 0;
							label1135: while (true) {
								if (local1383 >= 100) {
									if (local1369 <= 1) {
										for (@Pc(1408) int local1408 = 0; local1408 < Static78.anInt1884; local1408++) {
											if (local1343 == Static140.aLongArray7[local1408]) {
												local1371 = true;
												break label1135;
											}
										}
									}
									break;
								}
								if (local1381 == Static186.aLongArray9[local1383]) {
									local1371 = true;
									break;
								}
								local1383++;
							}
							if (!local1371 && Static142.anInt3197 == 0) {
								Static186.aLongArray9[Static147.anInt3284] = local1381;
								Static147.anInt3284 = (Static147.anInt3284 + 1) % 100;
								local1449 = Static152.method2598(local1375).method2397(Static16.aClass1_Sub9_Sub1_1);
								if (local1369 == 2 || local1369 == 3) {
									Static135.method2255(local1375, 20, Static34.method611(new Class60[] { Static12.aClass60_101, Static144.method2484(local1343).method1812() }), Static144.method2484(local1351).method1812(), local1449);
								} else if (local1369 == 1) {
									Static135.method2255(local1375, 20, Static34.method611(new Class60[] { Static94.aClass60_709, Static144.method2484(local1343).method1812() }), Static144.method2484(local1351).method1812(), local1449);
								} else {
									Static135.method2255(local1375, 20, Static144.method2484(local1343).method1812(), Static144.method2484(local1351).method1812(), local1449);
								}
							}
							Static172.anInt3718 = -1;
							return true;
						} else if (Static172.anInt3718 == 72) {
							local135 = Static16.aClass1_Sub9_Sub1_1.method901();
							local139 = Static16.aClass1_Sub9_Sub1_1.method905();
							Static103.anIntArray299[local135] = local139;
							if (local139 != Static126.anIntArray358[local135]) {
								Static126.anIntArray358[local135] = local139;
								Static193.method3013(local135);
							}
							Static50.anIntArray221[Static164.anInt3597++ & 0x1F] = local135;
							Static172.anInt3718 = -1;
							return true;
						} else if (Static172.anInt3718 == 113) {
							local135 = Static16.aClass1_Sub9_Sub1_1.method946();
							if (local135 == 65535) {
								local135 = -1;
							}
							local139 = Static16.aClass1_Sub9_Sub1_1.method895();
							local302 = Static16.aClass1_Sub9_Sub1_1.method946();
							Static66.method1182(local135, local139, local302);
							Static172.anInt3718 = -1;
							return true;
						} else {
							@Pc(1770) int local1770;
							@Pc(1783) long local1783;
							if (Static172.anInt3718 == 12) {
								local135 = Static16.aClass1_Sub9_Sub1_1.anInt1192 + Static27.anInt644;
								local139 = Static16.aClass1_Sub9_Sub1_1.method946();
								local302 = Static16.aClass1_Sub9_Sub1_1.method946();
								if (local139 != Static83.anInt1958) {
									Static83.anInt1958 = local139;
									Static93.method1621(Static83.anInt1958);
									Static64.method1159();
									Static129.method922(Static83.anInt1958);
									for (local156 = 0; local156 < 100; local156++) {
										Static153.aBooleanArray19[local156] = true;
									}
								}
								while (local302-- > 0) {
									local156 = Static16.aClass1_Sub9_Sub1_1.method915();
									local196 = Static16.aClass1_Sub9_Sub1_1.method946();
									local204 = Static16.aClass1_Sub9_Sub1_1.method895();
									@Pc(1684) Class1_Sub11 local1684 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local156);
									if (local1684 != null && local1684.anInt1626 != local196) {
										Static92.method1615(local1684, true);
										local1684 = null;
									}
									if (local1684 == null) {
										local1684 = Static157.method2656(local204, local196, local156);
									}
									local1684.aBoolean84 = true;
								}
								for (local660 = (Class1_Sub11) Static10.aClass33_1.method1067(); local660 != null; local660 = (Class1_Sub11) Static10.aClass33_1.method1070()) {
									if (local660.aBoolean84) {
										local660.aBoolean84 = false;
									} else {
										Static92.method1615(local660, true);
									}
								}
								Static163.aClass33_13 = new Class33(512);
								while (local135 > Static16.aClass1_Sub9_Sub1_1.anInt1192) {
									local196 = Static16.aClass1_Sub9_Sub1_1.method915();
									local204 = Static16.aClass1_Sub9_Sub1_1.method946();
									local208 = Static16.aClass1_Sub9_Sub1_1.method946();
									local1770 = Static16.aClass1_Sub9_Sub1_1.method915();
									for (local1369 = local204; local1369 <= local208; local1369++) {
										local1783 = ((long) local196 << 32) + ((long) local1369);
										Static163.aClass33_13.method1072(local1783, new Class1_Sub16(local1770));
									}
								}
								Static172.anInt3718 = -1;
								return true;
							} else if (Static172.anInt3718 == 22) {
								Static129.method933(Static16.aClass1_Sub9_Sub1_1);
								Static172.anInt3718 = -1;
								return true;
							} else {
								@Pc(1965) int local1965;
								if (Static172.anInt3718 == 229) {
									Static106.anInt2406 = Static171.anInt3707;
									local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
									if (local1343 == 0L) {
										Static35.aClass60_275 = null;
										Static172.anInt3718 = -1;
										Static188.anInt4037 = 0;
										Static37.aClass1_Sub26Array1 = null;
										Static207.aClass60_1509 = null;
										return true;
									}
									local1351 = Static16.aClass1_Sub9_Sub1_1.method909();
									Static207.aClass60_1509 = Static144.method2484(local1351);
									Static35.aClass60_275 = Static144.method2484(local1343);
									Static187.aByte14 = Static16.aClass1_Sub9_Sub1_1.method891();
									local196 = Static16.aClass1_Sub9_Sub1_1.method895();
									if (local196 == 255) {
										Static172.anInt3718 = -1;
										return true;
									}
									Static188.anInt4037 = local196;
									@Pc(1880) Class1_Sub26[] local1880 = new Class1_Sub26[100];
									for (local208 = 0; local208 < Static188.anInt4037; local208++) {
										local1880[local208] = new Class1_Sub26();
										local1880[local208].aLong150 = Static16.aClass1_Sub9_Sub1_1.method909();
										local1880[local208].aClass60_1412 = Static144.method2484(local1880[local208].aLong150);
										local1880[local208].anInt4154 = Static16.aClass1_Sub9_Sub1_1.method946();
										local1880[local208].aByte16 = Static16.aClass1_Sub9_Sub1_1.method891();
										local1880[local208].aClass60_1411 = Static16.aClass1_Sub9_Sub1_1.method935();
										if (aLong133 == local1880[local208].aLong150) {
											Static116.aByte9 = local1880[local208].aByte16;
										}
									}
									local1375 = Static188.anInt4037;
									while (local1375 > 0) {
										@Pc(1962) boolean local1962 = true;
										local1375--;
										for (local1965 = 0; local1965 < local1375; local1965++) {
											if (local1880[local1965].aClass60_1412.method1821(local1880[local1965 + 1].aClass60_1412) > 0) {
												local1962 = false;
												@Pc(1989) Class1_Sub26 local1989 = local1880[local1965];
												local1880[local1965] = local1880[local1965 + 1];
												local1880[local1965 + 1] = local1989;
											}
										}
										if (local1962) {
											break;
										}
									}
									Static172.anInt3718 = -1;
									Static37.aClass1_Sub26Array1 = local1880;
									return true;
								}
								@Pc(2063) int local2063;
								@Pc(2086) int local2086;
								if (Static172.anInt3718 == 203) {
									local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
									local1351 = Static16.aClass1_Sub9_Sub1_1.method946();
									local1356 = Static16.aClass1_Sub9_Sub1_1.method920();
									local208 = Static16.aClass1_Sub9_Sub1_1.method895();
									local1770 = Static16.aClass1_Sub9_Sub1_1.method946();
									@Pc(2059) long local2059 = (local1351 << 32) + local1356;
									@Pc(2061) boolean local2061 = false;
									local2063 = 0;
									label1199: while (true) {
										if (local2063 >= 100) {
											if (local208 <= 1) {
												for (local2086 = 0; local2086 < Static78.anInt1884; local2086++) {
													if (local1343 == Static140.aLongArray7[local2086]) {
														local2061 = true;
														break label1199;
													}
												}
											}
											break;
										}
										if (Static186.aLongArray9[local2063] == local2059) {
											local2061 = true;
											break;
										}
										local2063++;
									}
									if (!local2061 && Static142.anInt3197 == 0) {
										Static186.aLongArray9[Static147.anInt3284] = local2059;
										Static147.anInt3284 = (Static147.anInt3284 + 1) % 100;
										@Pc(2127) Class60 local2127 = Static152.method2598(local1770).method2397(Static16.aClass1_Sub9_Sub1_1);
										if (local208 == 2) {
											Static135.method2255(local1770, 18, Static34.method611(new Class60[] { Static12.aClass60_101, Static144.method2484(local1343).method1812() }), null, local2127);
										} else if (local208 == 1) {
											Static135.method2255(local1770, 18, Static34.method611(new Class60[] { Static94.aClass60_709, Static144.method2484(local1343).method1812() }), null, local2127);
										} else {
											Static135.method2255(local1770, 18, Static144.method2484(local1343).method1812(), null, local2127);
										}
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 172) {
									local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
									@Pc(2212) Class60 local2212 = Static123.method3304(Static7.method144(Static16.aClass1_Sub9_Sub1_1).method1827());
									Static13.method239(Static144.method2484(local1343).method1812(), local2212, 6);
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 65) {
									Static99.aShort23 = (short) Static16.aClass1_Sub9_Sub1_1.method946();
									if (Static99.aShort23 <= 0) {
										Static99.aShort23 = 32767;
									} else if (Static99.aShort23 < Static35.aShort11) {
										Static99.aShort23 = Static35.aShort11;
									}
									Static176.aShort10 = (short) Static16.aClass1_Sub9_Sub1_1.method916();
									if (Static176.aShort10 <= 0) {
										Static176.aShort10 = 1;
									}
									Static187.aShort30 = (short) Static16.aClass1_Sub9_Sub1_1.method916();
									if (Static187.aShort30 <= 0) {
										Static187.aShort30 = 32767;
									} else if (Static176.aShort10 > Static187.aShort30) {
										Static187.aShort30 = Static176.aShort10;
									}
									Static35.aShort11 = (short) Static16.aClass1_Sub9_Sub1_1.method885();
									if (Static35.aShort11 <= 0) {
										Static35.aShort11 = 1;
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 110) {
									Static147.method2515(Static116.aClass65_4, Static16.aClass1_Sub9_Sub1_1, Static27.anInt644);
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 17) {
									local135 = Static16.aClass1_Sub9_Sub1_1.method915();
									local139 = Static16.aClass1_Sub9_Sub1_1.method946();
									if (local135 >= 0) {
										local148 = Static107.method1857(local135);
									} else {
										local148 = null;
									}
									if (local135 < -70000) {
										local139 += 32768;
									}
									while (Static16.aClass1_Sub9_Sub1_1.anInt1192 < Static27.anInt644) {
										local156 = Static16.aClass1_Sub9_Sub1_1.method900();
										local196 = Static16.aClass1_Sub9_Sub1_1.method946();
										local204 = 0;
										if (local196 != 0) {
											local204 = Static16.aClass1_Sub9_Sub1_1.method895();
											if (local204 == 255) {
												local204 = Static16.aClass1_Sub9_Sub1_1.method915();
											}
										}
										if (local148 != null && local156 >= 0 && local156 < local148.anIntArray31.length) {
											local148.anIntArray31[local156] = local196;
											local148.anIntArray26[local156] = local204;
										}
										Static152.method2599(local196 - 1, local156, local139, local204);
									}
									if (local148 != null) {
										Static57.method1068(local148);
									}
									Static79.method1400();
									Static152.anIntArray442[Static18.anInt465++ & 0x1F] = local139 & 0x7FFF;
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 88) {
									Static194.anInt4138 = Static16.aClass1_Sub9_Sub1_1.method942();
									Static180.anInt3843 = Static16.aClass1_Sub9_Sub1_1.method939();
									for (local135 = Static194.anInt4138; local135 < Static194.anInt4138 + 8; local135++) {
										for (local139 = Static180.anInt3843; local139 < Static180.anInt3843 + 8; local139++) {
											if (Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local135][local139] != null) {
												Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local135][local139] = null;
												Static124.method2105(local139, local135);
											}
										}
									}
									for (@Pc(2508) Class1_Sub21 local2508 = (Class1_Sub21) Static129.aClass19_7.method609(); local2508 != null; local2508 = (Class1_Sub21) Static129.aClass19_7.method615()) {
										if (Static194.anInt4138 <= local2508.anInt3155 && Static194.anInt4138 + 8 > local2508.anInt3155 && local2508.anInt3148 >= Static180.anInt3843 && local2508.anInt3148 < Static180.anInt3843 + 8 && local2508.anInt3156 == Static180.anInt3841) {
											local2508.anInt3151 = 0;
										}
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 223) {
									Static144.aBoolean179 = true;
									Static75.anInt1838 = Static16.aClass1_Sub9_Sub1_1.method895();
									Static49.anInt1245 = Static16.aClass1_Sub9_Sub1_1.method895();
									Static210.anInt3901 = Static16.aClass1_Sub9_Sub1_1.method946();
									Static188.anInt4008 = Static16.aClass1_Sub9_Sub1_1.method895();
									Static16.anInt435 = Static16.aClass1_Sub9_Sub1_1.method895();
									if (Static16.anInt435 >= 100) {
										local135 = Static75.anInt1838 * 128 + 64;
										local139 = Static49.anInt1245 * 128 + 64;
										local302 = Static165.method2268(local139, Static180.anInt3841, local135) - Static210.anInt3901;
										local156 = local135 - Static17.anInt438;
										local204 = local139 - Static165.anInt2958;
										local196 = local302 - Static28.anInt2840;
										local208 = (int) Math.sqrt((double) (local204 * local204 + local156 * local156));
										Static134.anInt2897 = (int) (Math.atan2((double) local196, (double) local208) * 325.949D) & 0x7FF;
										Static79.anInt1908 = (int) (-325.949D * Math.atan2((double) local156, (double) local204)) & 0x7FF;
										if (Static134.anInt2897 < 128) {
											Static134.anInt2897 = 128;
										}
										if (Static134.anInt2897 > 383) {
											Static134.anInt2897 = 383;
										}
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 163) {
									Static194.anInt4138 = Static16.aClass1_Sub9_Sub1_1.method895();
									Static180.anInt3843 = Static16.aClass1_Sub9_Sub1_1.method942();
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 213) {
									local135 = Static16.aClass1_Sub9_Sub1_1.method895();
									local139 = local135 >> 6;
									@Pc(2715) Class94 local2715 = new Class94();
									local2715.anInt3978 = local135 & 0x3F;
									local2715.anInt3972 = Static16.aClass1_Sub9_Sub1_1.method895();
									if (local2715.anInt3972 >= 0 && local2715.anInt3972 < Static122.aClass1_Sub1_Sub6Array7.length) {
										if (local2715.anInt3978 == 1 || local2715.anInt3978 == 10) {
											local2715.anInt3970 = Static16.aClass1_Sub9_Sub1_1.method946();
											Static16.aClass1_Sub9_Sub1_1.anInt1192 += 3;
										} else if (local2715.anInt3978 >= 2 && local2715.anInt3978 <= 6) {
											if (local2715.anInt3978 == 2) {
												local2715.anInt3971 = 64;
												local2715.anInt3968 = 64;
											}
											if (local2715.anInt3978 == 3) {
												local2715.anInt3971 = 0;
												local2715.anInt3968 = 64;
											}
											if (local2715.anInt3978 == 4) {
												local2715.anInt3971 = 128;
												local2715.anInt3968 = 64;
											}
											if (local2715.anInt3978 == 5) {
												local2715.anInt3968 = 0;
												local2715.anInt3971 = 64;
											}
											if (local2715.anInt3978 == 6) {
												local2715.anInt3968 = 128;
												local2715.anInt3971 = 64;
											}
											local2715.anInt3978 = 2;
											local2715.anInt3966 = Static16.aClass1_Sub9_Sub1_1.method946();
											local2715.anInt3969 = Static16.aClass1_Sub9_Sub1_1.method946();
											local2715.anInt3967 = Static16.aClass1_Sub9_Sub1_1.method895();
										}
										local2715.anInt3974 = Static16.aClass1_Sub9_Sub1_1.method946();
										if (local2715.anInt3974 == 65535) {
											local2715.anInt3974 = -1;
										}
										Static77.aClass94Array1[local139] = local2715;
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 255) {
									Static56.anInt1484 = 0;
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 101) {
									if (Static27.anInt644 == 0) {
										Static94.aClass60_708 = Static194.aClass60_1405;
									} else {
										Static94.aClass60_708 = Static16.aClass1_Sub9_Sub1_1.method935();
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 220) {
									local135 = Static16.aClass1_Sub9_Sub1_1.method923();
									local139 = Static16.aClass1_Sub9_Sub1_1.method901();
									local148 = Static107.method1857(local135);
									if (local148 != null && local148.anInt233 == 0) {
										if (local148.anInt266 - local148.anInt221 < local139) {
											local139 = local148.anInt266 - local148.anInt221;
										}
										if (local139 < 0) {
											local139 = 0;
										}
										if (local139 != local148.anInt247) {
											local148.anInt247 = local139;
											Static57.method1068(local148);
										}
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 162) {
									local135 = Static16.aClass1_Sub9_Sub1_1.method905();
									local139 = Static16.aClass1_Sub9_Sub1_1.method934();
									local148 = Static107.method1857(local135);
									if (local139 != local148.anInt264 || local139 == -1) {
										local148.anInt264 = local139;
										local148.anInt258 = 0;
										local148.anInt269 = 0;
										Static57.method1068(local148);
									}
									Static172.anInt3718 = -1;
									return true;
								} else if (Static172.anInt3718 == 26) {
									local135 = Static16.aClass1_Sub9_Sub1_1.method892();
									local139 = Static16.aClass1_Sub9_Sub1_1.method885();
									local148 = Static107.method1857(local135);
									if (local139 == 65535) {
										local139 = -1;
									}
									if (local148.anInt246 != 2 || local139 != local148.anInt239) {
										local148.anInt246 = 2;
										local148.anInt239 = local139;
										Static57.method1068(local148);
									}
									Static172.anInt3718 = -1;
									return true;
								} else {
									@Pc(3134) boolean local3134;
									@Pc(3414) Class60 local3414;
									@Pc(3072) Class60 local3072;
									if (Static172.anInt3718 == 117) {
										local766 = Static16.aClass1_Sub9_Sub1_1.method935();
										if (local766.method1808(Static214.aClass60_1570)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (local1351 == Static140.aLongArray7[local204]) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												Static13.method239(local3072, Static88.aClass60_672, 4);
											}
										} else if (local766.method1808(Static141.aClass60_1113)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (local1351 == Static140.aLongArray7[local204]) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												local3414 = local766.method1797(local766.method1815(Static35.aClass60_276) + 1, local766.method1835() - 9);
												Static13.method239(local3072, local3414, 8);
											}
										} else if (local766.method1808(Static83.aClass60_645)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (local1351 == Static140.aLongArray7[local204]) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												Static13.method239(local3072, Static149.aClass60_1155, 10);
											}
										} else if (local766.method1808(Static41.aClass60_323)) {
											local3072 = local766.method1797(0, local766.method1815(Static41.aClass60_323));
											Static13.method239(Static149.aClass60_1155, local3072, 11);
										} else if (local766.method1808(Static154.aClass60_1192)) {
											local3072 = local766.method1797(0, local766.method1815(Static154.aClass60_1192));
											if (Static142.anInt3197 == 0) {
												Static13.method239(Static149.aClass60_1155, local3072, 12);
											}
										} else if (local766.method1808(Static11.aClass60_1649)) {
											local3072 = local766.method1797(0, local766.method1815(Static11.aClass60_1649));
											if (Static142.anInt3197 == 0) {
												Static13.method239(Static149.aClass60_1155, local3072, 13);
											}
										} else if (local766.method1808(Static214.aClass60_1568)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (Static140.aLongArray7[local204] == local1351) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												Static13.method239(local3072, Static149.aClass60_1155, 14);
											}
										} else if (local766.method1808(Static44.aClass60_335)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (local1351 == Static140.aLongArray7[local204]) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												Static13.method239(local3072, Static149.aClass60_1155, 15);
											}
										} else if (local766.method1808(Static19.aClass60_157)) {
											local3072 = local766.method1797(0, local766.method1815(Static35.aClass60_276));
											local1351 = local3072.method1829();
											local3134 = false;
											for (local204 = 0; local204 < Static78.anInt1884; local204++) {
												if (local1351 == Static140.aLongArray7[local204]) {
													local3134 = true;
													break;
												}
											}
											if (!local3134 && Static142.anInt3197 == 0) {
												Static13.method239(local3072, Static149.aClass60_1155, 16);
											}
										} else {
											Static13.method239(Static149.aClass60_1155, local766, 0);
										}
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 100) {
										local135 = Static16.aClass1_Sub9_Sub1_1.method915();
										local946 = Static107.method1857(local135);
										local946.anInt246 = 3;
										local946.anInt239 = Static84.aClass9_Sub4_Sub1_2.aClass50_2.method1517();
										Static57.method1068(local946);
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 188) {
										Static78.anInt1884 = Static27.anInt644 / 8;
										for (local135 = 0; local135 < Static78.anInt1884; local135++) {
											Static140.aLongArray7[local135] = Static16.aClass1_Sub9_Sub1_1.method909();
											Static8.aClass60Array2[local135] = Static144.method2484(Static140.aLongArray7[local135]);
										}
										Static172.anInt3718 = -1;
										Static181.anInt3848 = Static171.anInt3707;
										return true;
									} else if (Static172.anInt3718 == 243) {
										local135 = Static16.aClass1_Sub9_Sub1_1.method916();
										local139 = Static16.aClass1_Sub9_Sub1_1.method901();
										Static31.anInt799 = local139;
										Static124.anInt2765 = local135;
										Static95.method2547();
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 6) {
										local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
										local1351 = Static16.aClass1_Sub9_Sub1_1.method946();
										local1356 = Static16.aClass1_Sub9_Sub1_1.method920();
										local208 = Static16.aClass1_Sub9_Sub1_1.method895();
										@Pc(3592) boolean local3592 = false;
										@Pc(3599) long local3599 = (local1351 << 32) + local1356;
										local1965 = 0;
										label1325: while (true) {
											if (local1965 >= 100) {
												if (local208 <= 1) {
													if (Static175.anInt3770 == 1 || Static60.anInt1524 == 1) {
														local3592 = true;
													} else {
														for (local2063 = 0; local2063 < Static78.anInt1884; local2063++) {
															if (Static140.aLongArray7[local2063] == local1343) {
																local3592 = true;
																break label1325;
															}
														}
													}
												}
												break;
											}
											if (Static186.aLongArray9[local1965] == local3599) {
												local3592 = true;
												break;
											}
											local1965++;
										}
										if (!local3592 && Static142.anInt3197 == 0) {
											Static186.aLongArray9[Static147.anInt3284] = local3599;
											Static147.anInt3284 = (Static147.anInt3284 + 1) % 100;
											@Pc(3685) Class60 local3685 = Static123.method3304(Static7.method144(Static16.aClass1_Sub9_Sub1_1).method1827());
											if (local208 == 2 || local208 == 3) {
												Static13.method239(Static34.method611(new Class60[] { Static12.aClass60_101, Static144.method2484(local1343).method1812() }), local3685, 7);
											} else if (local208 == 1) {
												Static13.method239(Static34.method611(new Class60[] { Static94.aClass60_709, Static144.method2484(local1343).method1812() }), local3685, 7);
											} else {
												Static13.method239(Static144.method2484(local1343).method1812(), local3685, 3);
											}
										}
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 116) {
										Static173.method2791();
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 4) {
										local135 = Static16.aClass1_Sub9_Sub1_1.method885();
										local139 = Static16.aClass1_Sub9_Sub1_1.method946();
										local302 = Static16.aClass1_Sub9_Sub1_1.method892();
										local418 = Static107.method1857(local302);
										Static172.anInt3718 = -1;
										local418.anInt224 = (local139 << 16) + local135;
										return true;
									} else if (Static172.anInt3718 == 24) {
										for (local135 = 0; local135 < Static126.anIntArray358.length; local135++) {
											if (Static103.anIntArray299[local135] != Static126.anIntArray358[local135]) {
												Static126.anIntArray358[local135] = Static103.anIntArray299[local135];
												Static193.method3013(local135);
												Static50.anIntArray221[Static164.anInt3597++ & 0x1F] = local135;
											}
										}
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 123 || Static172.anInt3718 == 52 || Static172.anInt3718 == 232 || Static172.anInt3718 == 61 || Static172.anInt3718 == 135 || Static172.anInt3718 == 173 || Static172.anInt3718 == 150 || Static172.anInt3718 == 198 || Static172.anInt3718 == 99 || Static172.anInt3718 == 171 || Static172.anInt3718 == 75 || Static172.anInt3718 == 44) {
										Static29.method538();
										Static172.anInt3718 = -1;
										return true;
									} else if (Static172.anInt3718 == 108) {
										local135 = Static16.aClass1_Sub9_Sub1_1.method895();
										if (Static16.aClass1_Sub9_Sub1_1.method895() == 0) {
											Static155.aClass86Array1[local135] = new Class86();
										} else {
											Static16.aClass1_Sub9_Sub1_1.anInt1192--;
											Static155.aClass86Array1[local135] = new Class86(Static16.aClass1_Sub9_Sub1_1);
										}
										Static172.anInt3718 = -1;
										Static115.anInt2627 = Static171.anInt3707;
										return true;
									} else if (Static172.anInt3718 == 189) {
										Static156.aShort29 = (short) Static16.aClass1_Sub9_Sub1_1.method946();
										if (Static156.aShort29 <= 0) {
											Static156.aShort29 = 256;
										}
										Static112.aShort26 = (short) Static16.aClass1_Sub9_Sub1_1.method901();
										Static172.anInt3718 = -1;
										if (Static112.aShort26 <= 0) {
											Static112.aShort26 = 205;
										}
										return true;
									} else {
										@Pc(4085) Class60 local4085;
										if (Static172.anInt3718 == 74) {
											local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
											Static16.aClass1_Sub9_Sub1_1.method891();
											local1351 = Static16.aClass1_Sub9_Sub1_1.method909();
											local1356 = Static16.aClass1_Sub9_Sub1_1.method946();
											local1363 = Static16.aClass1_Sub9_Sub1_1.method920();
											@Pc(3997) boolean local3997 = false;
											local1783 = (local1356 << 32) + local1363;
											local1369 = Static16.aClass1_Sub9_Sub1_1.method895();
											local2086 = 0;
											label1352: while (true) {
												if (local2086 >= 100) {
													if (local1369 <= 1) {
														if (Static175.anInt3770 == 1 || Static60.anInt1524 == 1) {
															local3997 = true;
														} else {
															for (local1383 = 0; local1383 < Static78.anInt1884; local1383++) {
																if (Static140.aLongArray7[local1383] == local1343) {
																	local3997 = true;
																	break label1352;
																}
															}
														}
													}
													break;
												}
												if (Static186.aLongArray9[local2086] == local1783) {
													local3997 = true;
													break;
												}
												local2086++;
											}
											if (!local3997 && Static142.anInt3197 == 0) {
												Static186.aLongArray9[Static147.anInt3284] = local1783;
												Static147.anInt3284 = (Static147.anInt3284 + 1) % 100;
												local4085 = Static123.method3304(Static7.method144(Static16.aClass1_Sub9_Sub1_1).method1827());
												if (local1369 == 2 || local1369 == 3) {
													Static37.method654(Static34.method611(new Class60[] { Static12.aClass60_101, Static144.method2484(local1343).method1812() }), local4085, Static144.method2484(local1351).method1812());
												} else if (local1369 == 1) {
													Static37.method654(Static34.method611(new Class60[] { Static94.aClass60_709, Static144.method2484(local1343).method1812() }), local4085, Static144.method2484(local1351).method1812());
												} else {
													Static37.method654(Static144.method2484(local1343).method1812(), local4085, Static144.method2484(local1351).method1812());
												}
											}
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 120) {
											local135 = Static16.aClass1_Sub9_Sub1_1.method901();
											local139 = Static16.aClass1_Sub9_Sub1_1.method901();
											local302 = Static16.aClass1_Sub9_Sub1_1.method923();
											local156 = Static16.aClass1_Sub9_Sub1_1.method916();
											local901 = Static107.method1857(local302);
											if (local901.anInt237 != local156 || local901.anInt223 != local139 || local901.anInt212 != local135) {
												local901.anInt237 = local156;
												local901.anInt212 = local135;
												local901.anInt223 = local139;
												Static57.method1068(local901);
											}
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 149) {
											local135 = Static16.aClass1_Sub9_Sub1_1.method885();
											local139 = Static16.aClass1_Sub9_Sub1_1.method942();
											local302 = Static16.aClass1_Sub9_Sub1_1.method946();
											@Pc(4248) Class9_Sub4_Sub2 local4248 = Static1.aClass9_Sub4_Sub2Array1[local302];
											if (local4248 != null) {
												Static97.method1672(local139, local135, local4248);
											}
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 11) {
											@Pc(4266) byte local4266 = Static16.aClass1_Sub9_Sub1_1.method906();
											local139 = Static16.aClass1_Sub9_Sub1_1.method885();
											Static103.anIntArray299[local139] = local4266;
											if (Static126.anIntArray358[local139] != local4266) {
												Static126.anIntArray358[local139] = local4266;
												Static193.method3013(local139);
											}
											Static50.anIntArray221[Static164.anInt3597++ & 0x1F] = local139;
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 237) {
											Static118.anInt2663 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static15.anInt412 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static42.anInt907 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 230) {
											local135 = Static16.aClass1_Sub9_Sub1_1.method939();
											local139 = local135 >> 2;
											local156 = Static66.anIntArray190[local139];
											local196 = Static16.aClass1_Sub9_Sub1_1.method946();
											if (local196 == 65535) {
												local196 = -1;
											}
											local302 = local135 & 0x3;
											local204 = Static16.aClass1_Sub9_Sub1_1.method892();
											local208 = local204 >> 28 & 0x3;
											local1770 = local204 >> 14 & 0x3FFF;
											local1369 = local204 & 0x3FFF;
											local1770 -= Static128.anInt2813;
											local1369 -= Static163.anInt3587;
											Static108.method1886(local196, local1770, local208, local139, local302, local156, local1369);
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 241) {
											local135 = Static16.aClass1_Sub9_Sub1_1.method946();
											Static4.method80(local135);
											Static152.anIntArray442[Static18.anInt465++ & 0x1F] = local135 & 0x7FFF;
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 187) {
											local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
											local302 = Static16.aClass1_Sub9_Sub1_1.method946();
											@Pc(4448) Class60 local4448 = Static152.method2598(local302).method2397(Static16.aClass1_Sub9_Sub1_1);
											Static135.method2255(local302, 19, Static144.method2484(local1343).method1812(), null, local4448);
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 70) {
											for (local135 = 0; local135 < Static158.anInt3543; local135++) {
												@Pc(4476) Class1_Sub1_Sub2 local4476 = Static218.method3519(local135);
												if (local4476 != null && local4476.anInt368 == 0) {
													Static103.anIntArray299[local135] = 0;
													Static126.anIntArray358[local135] = 0;
												}
											}
											Static79.method1400();
											Static164.anInt3597 += 32;
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 233) {
											local766 = Static16.aClass1_Sub9_Sub1_1.method935();
											local139 = Static16.aClass1_Sub9_Sub1_1.method895();
											local302 = Static16.aClass1_Sub9_Sub1_1.method895();
											if (local139 >= 1 && local139 <= 8) {
												if (local766.method1805(Static159.aClass60_1222)) {
													local766 = null;
												}
												Static82.aClass60Array13[local139 - 1] = local766;
												Static99.aBooleanArray16[local139 - 1] = local302 == 0;
											}
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 79) {
											Static110.method1905(false);
											Static172.anInt3718 = -1;
											return true;
										} else if (Static172.anInt3718 == 192) {
											Static144.aBoolean179 = true;
											Static141.anInt3154 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static172.anInt3710 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static82.anInt1950 = Static16.aClass1_Sub9_Sub1_1.method946();
											Static144.anInt3246 = Static16.aClass1_Sub9_Sub1_1.method895();
											Static161.anInt3563 = Static16.aClass1_Sub9_Sub1_1.method895();
											if (Static161.anInt3563 >= 100) {
												Static165.anInt2958 = Static172.anInt3710 * 128 + 64;
												Static17.anInt438 = Static141.anInt3154 * 128 + 64;
												Static28.anInt2840 = Static165.method2268(Static165.anInt2958, Static180.anInt3841, Static17.anInt438) - Static82.anInt1950;
											}
											Static172.anInt3718 = -1;
											return true;
										} else {
											@Pc(4663) Class60 local4663;
											if (Static172.anInt3718 == 205) {
												local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
												local302 = Static16.aClass1_Sub9_Sub1_1.method946();
												@Pc(4645) byte local4645 = Static16.aClass1_Sub9_Sub1_1.method891();
												local3134 = false;
												if ((local1343 & Long.MIN_VALUE) != 0L) {
													local3134 = true;
												}
												if (local3134) {
													if (Static188.anInt4037 == 0) {
														Static172.anInt3718 = -1;
														return true;
													}
													local1343 &= Long.MAX_VALUE;
													for (local204 = 0; Static188.anInt4037 > local204 && (local1343 != Static37.aClass1_Sub26Array1[local204].aLong150 || Static37.aClass1_Sub26Array1[local204].anInt4154 != local302); local204++) {
													}
													if (local204 < Static188.anInt4037) {
														while (local204 < Static188.anInt4037 - 1) {
															Static37.aClass1_Sub26Array1[local204] = Static37.aClass1_Sub26Array1[local204 + 1];
															local204++;
														}
														Static188.anInt4037--;
														Static37.aClass1_Sub26Array1[Static188.anInt4037] = null;
													}
												} else {
													local4663 = Static16.aClass1_Sub9_Sub1_1.method935();
													@Pc(4667) Class1_Sub26 local4667 = new Class1_Sub26();
													local4667.aLong150 = local1343;
													local4667.aClass60_1412 = Static144.method2484(local4667.aLong150);
													local4667.aClass60_1411 = local4663;
													local4667.anInt4154 = local302;
													local4667.aByte16 = local4645;
													for (local1770 = Static188.anInt4037 - 1; local1770 >= 0; local1770--) {
														local1369 = Static37.aClass1_Sub26Array1[local1770].aClass60_1412.method1821(local4667.aClass60_1412);
														if (local1369 == 0) {
															Static37.aClass1_Sub26Array1[local1770].anInt4154 = local302;
															Static37.aClass1_Sub26Array1[local1770].aByte16 = local4645;
															Static37.aClass1_Sub26Array1[local1770].aClass60_1411 = local4663;
															Static106.anInt2406 = Static171.anInt3707;
															if (local1343 == aLong133) {
																Static116.aByte9 = local4645;
															}
															Static172.anInt3718 = -1;
															return true;
														}
														if (local1369 < 0) {
															break;
														}
													}
													if (Static188.anInt4037 >= Static37.aClass1_Sub26Array1.length) {
														Static172.anInt3718 = -1;
														return true;
													}
													for (local1369 = Static188.anInt4037 - 1; local1369 > local1770; local1369--) {
														Static37.aClass1_Sub26Array1[local1369 + 1] = Static37.aClass1_Sub26Array1[local1369];
													}
													if (Static188.anInt4037 == 0) {
														Static37.aClass1_Sub26Array1 = new Class1_Sub26[100];
													}
													Static37.aClass1_Sub26Array1[local1770 + 1] = local4667;
													if (local1343 == aLong133) {
														Static116.aByte9 = local4645;
													}
													Static188.anInt4037++;
												}
												Static172.anInt3718 = -1;
												Static106.anInt2406 = Static171.anInt3707;
												return true;
											} else if (Static172.anInt3718 == 146) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method905();
												local139 = Static16.aClass1_Sub9_Sub1_1.method892();
												local302 = Static16.aClass1_Sub9_Sub1_1.method946();
												local156 = Static16.aClass1_Sub9_Sub1_1.method885();
												if (local302 == 65535) {
													local302 = -1;
												}
												if (local156 == 65535) {
													local156 = -1;
												}
												for (local196 = local302; local196 <= local156; local196++) {
													@Pc(4921) long local4921 = (long) local196 + ((long) local139 << 32);
													@Pc(4926) Class1 local4926 = Static163.aClass33_13.method1071(local4921);
													if (local4926 != null) {
														local4926.method3530();
													}
													Static163.aClass33_13.method1072(local4921, new Class1_Sub16(local135));
												}
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 139) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method923();
												local139 = Static16.aClass1_Sub9_Sub1_1.method923();
												local302 = Static16.aClass1_Sub9_Sub1_1.method901();
												if (local302 == 65535) {
													local302 = -1;
												}
												local418 = Static107.method1857(local135);
												@Pc(4993) Class1_Sub1_Sub18 local4993;
												if (local418.aBoolean13) {
													local418.anInt195 = local302;
													local418.anInt193 = local139;
													local4993 = Static191.method2990(local302);
													local418.anInt192 = local4993.anInt2995;
													local418.anInt265 = local4993.anInt2999;
													local418.anInt212 = local4993.anInt3013;
													local418.anInt223 = local4993.anInt2994;
													local418.anInt237 = local4993.anInt3018;
													local418.anInt216 = local4993.anInt2988;
													if (local418.anInt205 > 0) {
														local418.anInt212 = local418.anInt212 * 32 / local418.anInt205;
													} else if (local418.anInt232 > 0) {
														local418.anInt212 = local418.anInt212 * 32 / local418.anInt232;
													}
													Static57.method1068(local418);
												} else if (local302 == -1) {
													local418.anInt246 = 0;
													Static172.anInt3718 = -1;
													return true;
												} else {
													local4993 = Static191.method2990(local302);
													local418.anInt212 = local4993.anInt3013 * 100 / local139;
													local418.anInt237 = local4993.anInt3018;
													local418.anInt239 = local302;
													local418.anInt246 = 4;
													local418.anInt223 = local4993.anInt2994;
													Static57.method1068(local418);
												}
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 221) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method895();
												local139 = Static16.aClass1_Sub9_Sub1_1.method895();
												local302 = Static16.aClass1_Sub9_Sub1_1.method895();
												local156 = Static16.aClass1_Sub9_Sub1_1.method895();
												local196 = Static16.aClass1_Sub9_Sub1_1.method946();
												Static216.aBooleanArray25[local135] = true;
												Static201.anIntArray559[local135] = local139;
												Static5.anIntArray13[local135] = local302;
												Static206.anIntArray573[local135] = local156;
												Static68.anIntArray198[local135] = local196;
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 214) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method923();
												local3072 = Static16.aClass1_Sub9_Sub1_1.method935();
												local148 = Static107.method1857(local135);
												if (!local3072.method1826(local148.aClass60_73)) {
													local148.aClass60_73 = local3072;
													Static57.method1068(local148);
												}
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 84) {
												Static149.anInt3339 = Static16.aClass1_Sub9_Sub1_1.method895();
												Static172.anInt3718 = -1;
												Static181.anInt3848 = Static171.anInt3707;
												return true;
											} else if (Static172.anInt3718 == 68) {
												Static79.method1400();
												Static206.anInt4384 = Static16.aClass1_Sub9_Sub1_1.method895();
												Static46.anInt1054 = Static171.anInt3707;
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 147) {
												Static178.anInt3828 = Static16.aClass1_Sub9_Sub1_1.method895();
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 96) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method916();
												local139 = Static16.aClass1_Sub9_Sub1_1.method905();
												local148 = Static107.method1857(local139);
												if (local135 == 65535) {
													local135 = -1;
												}
												if (local148.anInt246 != 1 || local148.anInt239 != local135) {
													local148.anInt246 = 1;
													local148.anInt239 = local135;
													Static57.method1068(local148);
												}
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 10) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method916();
												if (local135 == 65535) {
													local135 = -1;
												}
												Static37.method656(local135);
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 89) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method885();
												local139 = Static16.aClass1_Sub9_Sub1_1.method940();
												if (local135 == 65535) {
													local135 = -1;
												}
												Static53.method1019(local135, local139);
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 166) {
												if (Static83.anInt1958 != -1) {
													Static140.method2400(Static83.anInt1958, 0);
												}
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 235) {
												Static4.aClass60_42 = Static16.aClass1_Sub9_Sub1_1.method935();
												Static203.method3161(Static4.aClass60_42);
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 177) {
												local135 = Static16.aClass1_Sub9_Sub1_1.method892();
												Static140.aClass36_7 = Static116.aClass65_4.method2008(local135);
												Static172.anInt3718 = -1;
												return true;
											} else if (Static172.anInt3718 == 16) {
												local1343 = Static16.aClass1_Sub9_Sub1_1.method909();
												local302 = Static16.aClass1_Sub9_Sub1_1.method946();
												local3134 = true;
												if (local1343 < 0L) {
													local1343 &= Long.MAX_VALUE;
													local3134 = false;
												}
												local156 = Static16.aClass1_Sub9_Sub1_1.method895();
												local4663 = Static149.aClass60_1155;
												if (local302 > 0) {
													local4663 = Static16.aClass1_Sub9_Sub1_1.method935();
												}
												local3414 = Static144.method2484(local1343).method1812();
												for (local1770 = 0; local1770 < Static135.anInt2930; local1770++) {
													if (Static29.aLongArray1[local1770] == local1343) {
														if (Static90.anIntArray247[local1770] != local302) {
															Static90.anIntArray247[local1770] = local302;
															if (local302 > 0) {
																Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { local3414, Static49.aClass60_389 }), 5);
															}
															if (local302 == 0) {
																Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { local3414, Static144.aClass60_1127 }), 5);
															}
														}
														Static167.aClass60Array27[local1770] = local4663;
														local3414 = null;
														Static213.anIntArray610[local1770] = local156;
														Static132.aBooleanArray18[local1770] = local3134;
														break;
													}
												}
												if (local3414 != null && Static135.anInt2930 < 200) {
													Static29.aLongArray1[Static135.anInt2930] = local1343;
													Static61.aClass60Array9[Static135.anInt2930] = local3414;
													Static90.anIntArray247[Static135.anInt2930] = local302;
													Static167.aClass60Array27[Static135.anInt2930] = local4663;
													Static213.anIntArray610[Static135.anInt2930] = local156;
													Static132.aBooleanArray18[Static135.anInt2930] = local3134;
													Static135.anInt2930++;
												}
												local1375 = Static135.anInt2930;
												Static181.anInt3848 = Static171.anInt3707;
												while (local1375 > 0) {
													local1375--;
													@Pc(5535) boolean local5535 = true;
													for (local1965 = 0; local1965 < local1375; local1965++) {
														if (Static90.anIntArray247[local1965] != Static9.anInt4432 && Static90.anIntArray247[local1965 + 1] == Static9.anInt4432 || Static90.anIntArray247[local1965] == 0 && Static90.anIntArray247[local1965 + 1] != 0) {
															local5535 = false;
															local2063 = Static90.anIntArray247[local1965];
															Static90.anIntArray247[local1965] = Static90.anIntArray247[local1965 + 1];
															Static90.anIntArray247[local1965 + 1] = local2063;
															local4085 = Static167.aClass60Array27[local1965];
															Static167.aClass60Array27[local1965] = Static167.aClass60Array27[local1965 + 1];
															Static167.aClass60Array27[local1965 + 1] = local4085;
															local1449 = Static61.aClass60Array9[local1965];
															Static61.aClass60Array9[local1965] = Static61.aClass60Array9[local1965 + 1];
															Static61.aClass60Array9[local1965 + 1] = local1449;
															@Pc(5632) long local5632 = Static29.aLongArray1[local1965];
															Static29.aLongArray1[local1965] = Static29.aLongArray1[local1965 + 1];
															Static29.aLongArray1[local1965 + 1] = local5632;
															@Pc(5650) int local5650 = Static213.anIntArray610[local1965];
															Static213.anIntArray610[local1965] = Static213.anIntArray610[local1965 + 1];
															Static213.anIntArray610[local1965 + 1] = local5650;
															@Pc(5668) boolean local5668 = Static132.aBooleanArray18[local1965];
															Static132.aBooleanArray18[local1965] = Static132.aBooleanArray18[local1965 + 1];
															Static132.aBooleanArray18[local1965 + 1] = local5668;
														}
													}
													if (local5535) {
														break;
													}
												}
												Static172.anInt3718 = -1;
												return true;
											} else {
												Static131.method2194("T1 - " + Static172.anInt3718 + "," + Static52.anInt1420 + "," + Static7.anInt182 + " - " + Static27.anInt644, null);
												Static189.method2975();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ai;IIZ)[Lclient!r;")
	public static Class73[] method3070(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static87.method1515(arg1, arg2, arg0) ? Static91.method1590() : null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BII[IIIIIIII)V")
	public static void method3072(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(23) int local23 = ((arg1 & 0xFF00) * arg2 & 0xFF0000) + (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00) >> 8;
		@Pc(27) int local27 = 256 - arg2;
		for (@Pc(37) int local37 = -arg4; local37 < 0; local37++) {
			for (@Pc(42) int local42 = -arg7; local42 < 0; local42++) {
				if (arg0[arg9++] == 0) {
					arg5++;
				} else {
					@Pc(53) int local53 = arg3[arg5];
					arg3[arg5++] = local23 + ((local27 * (local53 & 0xFF00) & 0xFF0000) + (local27 * (local53 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg5 += arg8;
			arg9 += arg6;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
	public static void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class106 local13 = local7.aClass106_1;
		if (local13 != null) {
			local13.anInt4528 = local13.anInt4528 * arg3 / 16;
			local13.anInt4526 = local13.anInt4526 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BJ)V")
	public static void method3074(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static78.anInt1884; local14++) {
			if (arg0 == Static140.aLongArray7[local14]) {
				Static78.anInt1884--;
				for (@Pc(32) int local32 = local14; local32 < Static78.anInt1884; local32++) {
					Static140.aLongArray7[local32] = Static140.aLongArray7[local32 + 1];
					Static8.aClass60Array2[local32] = Static8.aClass60Array2[local32 + 1];
				}
				Static181.anInt3848 = Static171.anInt3707;
				Static96.aClass1_Sub9_Sub1_3.method953(126);
				Static96.aClass1_Sub9_Sub1_3.method897(arg0);
				break;
			}
		}
	}
}
