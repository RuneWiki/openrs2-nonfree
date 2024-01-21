import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "I")
	public static int anInt3987 = 0;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!nd;")
	public static Class59 aClass59_28 = new Class59(30);

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1392 = Static120.method2057("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	public static int anInt3995 = 0;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1394 = Static120.method2057("Please contact customer support)3");

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1393 = aClass81_1394;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	public static int anInt3996 = -1;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	public static int anInt3997 = 0;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(III)V")
	public static void method3033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass42_1 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
	public static void method3034(@OriginalArg(0) int arg0) {
		Static116.anInt2613 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIII)V")
	private static void method3035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local12 == null) {
			local12 = new Class1_Sub12();
			Static157.aClass5_11.method138(local12, (long) arg0);
		}
		if (local12.anIntArray73.length <= arg3) {
			@Pc(34) int[] local34 = new int[arg3 + 1];
			@Pc(39) int[] local39 = new int[arg3 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray73.length; local41++) {
				local34[local41] = local12.anIntArray73[local41];
				local39[local41] = local12.anIntArray72[local41];
			}
			for (@Pc(71) int local71 = local12.anIntArray73.length; local71 < arg3; local71++) {
				local34[local71] = -1;
				local39[local71] = 0;
			}
			local12.anIntArray73 = local34;
			local12.anIntArray72 = local39;
		}
		local12.anIntArray73[arg3] = arg2;
		local12.anIntArray72[arg3] = arg1;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method3036() {
		anIntArray420 = null;
		aClass81_1392 = null;
		aClass81_1393 = null;
		aClass59_28 = null;
		aClass81_1394 = null;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method3037() {
		for (@Pc(3) int local3 = 0; local3 < Static35.anInt962; local3++) {
			@Pc(14) int local14 = Static85.anIntArray15[local3];
			@Pc(18) Class1_Sub2_Sub1_Sub3_Sub2 local18 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local14];
			if (local18 != null) {
				Static50.method890(local18.aClass1_Sub2_Sub5_1.anInt1010, local18);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
	public static boolean method3038() {
		if (Static158.aClass41_3 == null) {
			return false;
		}
		@Pc(132) int local132;
		try {
			@Pc(13) int local13 = Static158.aClass41_3.method1344();
			if (local13 == 0) {
				return false;
			}
			if (Static92.anInt2058 == -1) {
				local13--;
				Static158.aClass41_3.method1345(1, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
				Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
				Static92.anInt2058 = Static21.aClass1_Sub8_Sub1_1.method372();
				Static98.anInt2162 = Static174.anIntArray411[Static92.anInt2058];
			}
			if (Static98.anInt2162 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static158.aClass41_3.method1345(1, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
				Static98.anInt2162 = Static21.aClass1_Sub8_Sub1_1.aByteArray3[0] & 0xFF;
				local13--;
			}
			if (Static98.anInt2162 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static158.aClass41_3.method1345(2, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
				Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
				local13 -= 2;
				Static98.anInt2162 = Static21.aClass1_Sub8_Sub1_1.method359();
			}
			if (Static98.anInt2162 > local13) {
				return false;
			}
			Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
			Static158.aClass41_3.method1345(Static98.anInt2162, 0, Static21.aClass1_Sub8_Sub1_1.aByteArray3);
			Static86.anInt1952 = anInt3987;
			Static70.anInt1716 = 0;
			anInt3987 = Static43.anInt1082;
			Static43.anInt1082 = Static92.anInt2058;
			@Pc(128) int local128;
			@Pc(143) int local143;
			if (Static92.anInt2058 == 106) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method359();
				local132 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (local128 == 65535) {
					local128 = -1;
				}
				local143 = Static21.aClass1_Sub8_Sub1_1.method359();
				Static141.method603(local132, local128, local143);
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(177) int local177;
			@Pc(181) int local181;
			@Pc(193) int local193;
			if (Static92.anInt2058 == 172) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method314();
				local132 = Static21.aClass1_Sub8_Sub1_1.method312();
				local143 = local132 >> 10 & 0x1F;
				local177 = local132 >> 5 & 0x1F;
				local181 = local132 & 0x1F;
				local193 = (local181 << 3) + (local177 << 11) + (local143 << 19);
				@Pc(199) Class77 local199 = Static41.method800(local128);
				if (local199.anInt3223 != local193) {
					local199.anInt3223 = local193;
					Static51.method913(local199);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 72) {
				Static63.method1120();
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(256) Class77 local256;
			if (Static92.anInt2058 == 88) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method347();
				local132 = Static21.aClass1_Sub8_Sub1_1.method359();
				if (local128 < -70000) {
					local132 += 32768;
				}
				if (local128 >= 0) {
					local256 = Static41.method800(local128);
				} else {
					local256 = null;
				}
				while (Static98.anInt2162 > Static21.aClass1_Sub8_Sub1_1.anInt446) {
					local177 = Static21.aClass1_Sub8_Sub1_1.method330();
					local181 = Static21.aClass1_Sub8_Sub1_1.method359();
					local193 = 0;
					if (local181 != 0) {
						local193 = Static21.aClass1_Sub8_Sub1_1.method336();
						if (local193 == 255) {
							local193 = Static21.aClass1_Sub8_Sub1_1.method347();
						}
					}
					if (local256 != null && local177 >= 0 && local256.anIntArray348.length > local177) {
						local256.anIntArray348[local177] = local181;
						local256.anIntArray342[local177] = local193;
					}
					method3035(local132, local193, local181 - 1, local177);
				}
				if (local256 != null) {
					Static51.method913(local256);
				}
				Static136.method2286();
				Static118.anIntArray279[Static184.anInt4114++ & 0x1F] = local132 & 0x7FFF;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 0) {
				Static184.aBoolean171 = false;
				for (local128 = 0; local128 < 5; local128++) {
					Static34.aBooleanArray2[local128] = false;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 227) {
				Static17.method374(false);
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(392) long local392;
			@Pc(399) Class81 local399;
			if (Static92.anInt2058 == 135) {
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				local399 = Static186.method1941(Static164.method2872(Static21.aClass1_Sub8_Sub1_1).method2813());
				Static131.method2247(6, local399, Static106.method1751(local392).method2808());
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 56) {
				@Pc(426) boolean local426 = Static21.aClass1_Sub8_Sub1_1.method353() == 1;
				local132 = Static21.aClass1_Sub8_Sub1_1.method358();
				local256 = Static41.method800(local132);
				if (local426 != local256.aBoolean134) {
					local256.aBoolean134 = local426;
					Static51.method913(local256);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 221) {
				Static136.method2286();
				Static120.anInt2668 = Static21.aClass1_Sub8_Sub1_1.method332();
				Static168.anInt3912 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 224) {
				Static53.anInt1292 = Static21.aClass1_Sub8_Sub1_1.method326();
				Static25.anInt646 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 230) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method362();
				local132 = Static21.aClass1_Sub8_Sub1_1.method353();
				local399 = Static21.aClass1_Sub8_Sub1_1.method344();
				if (local128 >= 1 && local128 <= 8) {
					if (local399.method2811(Static187.aClass81_1450)) {
						local399 = null;
					}
					Static170.aClass81Array21[local128 - 1] = local399;
					Static81.aBooleanArray8[local128 - 1] = local132 == 0;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 142) {
				Static184.aBoolean171 = true;
				Static85.anInt416 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static103.anInt2265 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static70.anInt1715 = Static21.aClass1_Sub8_Sub1_1.method359();
				Static41.anInt1063 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static183.anInt4107 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (Static183.anInt4107 >= 100) {
					Static69.anInt1702 = Static103.anInt2265 * 128 + 64;
					Static53.anInt1289 = Static85.anInt416 * 128 + 64;
					Static126.anInt2769 = Static102.method1694(Static53.anInt1289, Static44.anInt1086, Static69.anInt1702) - Static70.anInt1715;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(606) Class77 local606;
			if (Static92.anInt2058 == 6) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method314();
				local606 = Static41.method800(local128);
				for (local143 = 0; local143 < local606.anIntArray348.length; local143++) {
					local606.anIntArray348[local143] = -1;
					local606.anIntArray348[local143] = 0;
				}
				Static51.method913(local606);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 196) {
				Static37.anInt977 = 0;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 54) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method323();
				Static151.aClass47_7 = Static86.aClass68_2.method2230(local128);
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(802) int local802;
			@Pc(813) int local813;
			@Pc(687) boolean local687;
			if (Static92.anInt2058 == 4) {
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				local143 = Static21.aClass1_Sub8_Sub1_1.method359();
				@Pc(685) byte local685 = Static21.aClass1_Sub8_Sub1_1.method339();
				local687 = false;
				if ((Long.MIN_VALUE & local392) != 0L) {
					local687 = true;
				}
				if (local687) {
					if (Static94.anInt2072 == 0) {
						Static92.anInt2058 = -1;
						return true;
					}
					local392 &= Long.MAX_VALUE;
					for (local193 = 0; Static94.anInt2072 > local193 && (local392 != Static163.aClass1_Sub13Array1[local193].aLong148 || Static163.aClass1_Sub13Array1[local193].anInt1078 != local143); local193++) {
					}
					if (local193 < Static94.anInt2072) {
						while (Static94.anInt2072 - 1 > local193) {
							Static163.aClass1_Sub13Array1[local193] = Static163.aClass1_Sub13Array1[local193 + 1];
							local193++;
						}
						Static94.anInt2072--;
						Static163.aClass1_Sub13Array1[Static94.anInt2072] = null;
					}
				} else {
					@Pc(783) Class1_Sub13 local783 = new Class1_Sub13();
					local783.aLong148 = local392;
					local783.aClass81_378 = Static106.method1751(local783.aLong148);
					local783.aByte1 = local685;
					local783.anInt1078 = local143;
					for (local802 = Static94.anInt2072 - 1; local802 >= 0; local802--) {
						local813 = Static163.aClass1_Sub13Array1[local802].aClass81_378.method2827(local783.aClass81_378);
						if (local813 == 0) {
							Static163.aClass1_Sub13Array1[local802].anInt1078 = local143;
							Static163.aClass1_Sub13Array1[local802].aByte1 = local685;
							Static155.anInt3531 = Static121.anInt2701;
							Static92.anInt2058 = -1;
							if (Static90.aLong73 == local392) {
								Static128.aByte7 = local685;
							}
							return true;
						}
						if (local813 < 0) {
							break;
						}
					}
					if (Static94.anInt2072 >= Static163.aClass1_Sub13Array1.length) {
						Static92.anInt2058 = -1;
						return true;
					}
					for (local813 = Static94.anInt2072 - 1; local813 > local802; local813--) {
						Static163.aClass1_Sub13Array1[local813 + 1] = Static163.aClass1_Sub13Array1[local813];
					}
					if (Static94.anInt2072 == 0) {
						Static163.aClass1_Sub13Array1 = new Class1_Sub13[100];
					}
					Static163.aClass1_Sub13Array1[local802 + 1] = local783;
					Static94.anInt2072++;
					if (Static90.aLong73 == local392) {
						Static128.aByte7 = local685;
					}
				}
				Static155.anInt3531 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 48) {
				Static17.method374(true);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 197) {
				for (local128 = 0; local128 < Static83.anIntArray178.length; local128++) {
					if (Static83.anIntArray178[local128] != Static33.anIntArray71[local128]) {
						Static83.anIntArray178[local128] = Static33.anIntArray71[local128];
						Static87.method1496(local128);
						Static114.anIntArray238[Static82.anInt1884++ & 0x1F] = local128;
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 130) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method314();
				local132 = Static21.aClass1_Sub8_Sub1_1.method359();
				local256 = Static41.method800(local128);
				if (local256 != null && local256.anInt3226 == 0) {
					if (local256.anInt3247 - local256.anInt3245 < local132) {
						local132 = local256.anInt3247 - local256.anInt3245;
					}
					if (local132 < 0) {
						local132 = 0;
					}
					if (local132 != local256.anInt3234) {
						local256.anInt3234 = local132;
						Static51.method913(local256);
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 16) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method323();
				local132 = Static21.aClass1_Sub8_Sub1_1.method338();
				if (local132 == 65535) {
					local132 = -1;
				}
				local256 = Static41.method800(local128);
				if (local256.anInt3190 != 2 || local256.anInt3222 != local132) {
					local256.anInt3222 = local132;
					local256.anInt3190 = 2;
					Static51.method913(local256);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(1204) int local1204;
			@Pc(1104) long local1104;
			@Pc(1197) int local1197;
			if (Static92.anInt2058 == 8) {
				Static155.anInt3531 = Static121.anInt2701;
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				if (local392 == 0L) {
					Static112.aClass81_923 = null;
					Static12.aClass81_1448 = null;
					Static94.anInt2072 = 0;
					Static163.aClass1_Sub13Array1 = null;
					Static92.anInt2058 = -1;
					return true;
				}
				local1104 = Static21.aClass1_Sub8_Sub1_1.method363();
				Static12.aClass81_1448 = Static106.method1751(local1104);
				Static112.aClass81_923 = Static106.method1751(local392);
				Static113.aByte4 = Static21.aClass1_Sub8_Sub1_1.method339();
				local181 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (local181 == 255) {
					Static92.anInt2058 = -1;
					return true;
				}
				@Pc(1130) Class1_Sub13[] local1130 = new Class1_Sub13[100];
				Static94.anInt2072 = local181;
				for (local802 = 0; local802 < Static94.anInt2072; local802++) {
					local1130[local802] = new Class1_Sub13();
					local1130[local802].aLong148 = Static21.aClass1_Sub8_Sub1_1.method363();
					local1130[local802].aClass81_378 = Static106.method1751(local1130[local802].aLong148);
					local1130[local802].anInt1078 = Static21.aClass1_Sub8_Sub1_1.method359();
					local1130[local802].aByte1 = Static21.aClass1_Sub8_Sub1_1.method339();
					if (local1130[local802].aLong148 == Static90.aLong73) {
						Static128.aByte7 = local1130[local802].aByte1;
					}
				}
				local1197 = Static94.anInt2072;
				while (local1197 > 0) {
					@Pc(1201) boolean local1201 = true;
					local1197--;
					for (local1204 = 0; local1204 < local1197; local1204++) {
						if (local1130[local1204].aClass81_378.method2827(local1130[local1204 + 1].aClass81_378) > 0) {
							local1201 = false;
							@Pc(1225) Class1_Sub13 local1225 = local1130[local1204];
							local1130[local1204] = local1130[local1204 + 1];
							local1130[local1204 + 1] = local1225;
						}
					}
					if (local1201) {
						break;
					}
				}
				Static92.anInt2058 = -1;
				Static163.aClass1_Sub13Array1 = local1130;
				return true;
			}
			if (Static92.anInt2058 == 46) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method359();
				@Pc(1270) byte local1270 = Static21.aClass1_Sub8_Sub1_1.method334();
				Static33.anIntArray71[local128] = local1270;
				if (local1270 != Static83.anIntArray178[local128]) {
					Static83.anIntArray178[local128] = local1270;
					Static87.method1496(local128);
				}
				Static114.anIntArray238[Static82.anInt1884++ & 0x1F] = local128;
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(1434) int local1434;
			@Pc(1518) int local1518;
			if (Static92.anInt2058 == 153) {
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				local143 = Static21.aClass1_Sub8_Sub1_1.method359();
				local177 = Static21.aClass1_Sub8_Sub1_1.method336();
				@Pc(1323) Class81 local1323 = Static106.method1751(local392).method2808();
				for (local193 = 0; local193 < Static58.anInt1378; local193++) {
					if (Static121.aLongArray6[local193] == local392) {
						if (Static179.anIntArray428[local193] != local143) {
							Static179.anIntArray428[local193] = local143;
							if (local143 > 0) {
								Static131.method2247(5, Static127.method2169(new Class81[] { local1323, Static87.aClass81_689 }), Static149.aClass81_1213);
							}
							if (local143 == 0) {
								Static131.method2247(5, Static127.method2169(new Class81[] { local1323, Static97.aClass81_754 }), Static149.aClass81_1213);
							}
						}
						Static111.anIntArray270[local193] = local177;
						local1323 = null;
						break;
					}
				}
				if (local1323 != null && Static58.anInt1378 < 200) {
					Static121.aLongArray6[Static58.anInt1378] = local392;
					Static178.aClass81Array22[Static58.anInt1378] = local1323;
					Static179.anIntArray428[Static58.anInt1378] = local143;
					Static111.anIntArray270[Static58.anInt1378] = local177;
					Static58.anInt1378++;
				}
				local813 = Static58.anInt1378;
				Static140.anInt3066 = Static121.anInt2701;
				while (local813 > 0) {
					@Pc(1431) boolean local1431 = true;
					local813--;
					for (local1434 = 0; local1434 < local813; local1434++) {
						if (Static48.anInt3637 != Static179.anIntArray428[local1434] && Static179.anIntArray428[local1434 + 1] == Static48.anInt3637 || Static179.anIntArray428[local1434] == 0 && Static179.anIntArray428[local1434 + 1] != 0) {
							local1431 = false;
							local1197 = Static179.anIntArray428[local1434];
							Static179.anIntArray428[local1434] = Static179.anIntArray428[local1434 + 1];
							Static179.anIntArray428[local1434 + 1] = local1197;
							@Pc(1482) Class81 local1482 = Static178.aClass81Array22[local1434];
							Static178.aClass81Array22[local1434] = Static178.aClass81Array22[local1434 + 1];
							Static178.aClass81Array22[local1434 + 1] = local1482;
							@Pc(1500) long local1500 = Static121.aLongArray6[local1434];
							Static121.aLongArray6[local1434] = Static121.aLongArray6[local1434 + 1];
							Static121.aLongArray6[local1434 + 1] = local1500;
							local1518 = Static111.anIntArray270[local1434];
							Static111.anIntArray270[local1434] = Static111.anIntArray270[local1434 + 1];
							Static111.anIntArray270[local1434 + 1] = local1518;
						}
					}
					if (local1431) {
						break;
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 27 || Static92.anInt2058 == 25 || Static92.anInt2058 == 200 || Static92.anInt2058 == 145 || Static92.anInt2058 == 193 || Static92.anInt2058 == 159 || Static92.anInt2058 == 203 || Static92.anInt2058 == 209 || Static92.anInt2058 == 87 || Static92.anInt2058 == 175 || Static92.anInt2058 == 212) {
				Static167.method2968();
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(1609) Class81 local1609;
			if (Static92.anInt2058 == 115) {
				local1609 = Static21.aClass1_Sub8_Sub1_1.method344();
				local132 = Static21.aClass1_Sub8_Sub1_1.method358();
				local256 = Static41.method800(local132);
				if (!local1609.method2800(local256.aClass81_1144)) {
					local256.aClass81_1144 = local1609;
					Static51.method913(local256);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 225) {
				for (local128 = 0; local128 < Static132.anInt2861; local128++) {
					@Pc(1646) Class1_Sub2_Sub11 local1646 = Static52.method933(local128);
					if (local1646 != null && local1646.anInt2132 == 0) {
						Static33.anIntArray71[local128] = 0;
						Static83.anIntArray178[local128] = 0;
					}
				}
				Static136.method2286();
				Static82.anInt1884 += 32;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 7) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (Static21.aClass1_Sub8_Sub1_1.method336() == 0) {
					Static54.aClass61Array1[local128] = new Class61();
				} else {
					Static21.aClass1_Sub8_Sub1_1.anInt446--;
					Static54.aClass61Array1[local128] = new Class61(Static21.aClass1_Sub8_Sub1_1);
				}
				Static92.anInt2058 = -1;
				Static157.anInt3572 = Static121.anInt2701;
				return true;
			}
			@Pc(1742) Class77 local1742;
			if (Static92.anInt2058 == 234) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method359();
				if (local128 == 65535) {
					local128 = -1;
				}
				local132 = Static21.aClass1_Sub8_Sub1_1.method314();
				local143 = Static21.aClass1_Sub8_Sub1_1.method314();
				local1742 = Static41.method800(local143);
				@Pc(1757) Class1_Sub2_Sub12 local1757;
				if (local1742.aBoolean138) {
					local1742.anInt3211 = local128;
					local1742.anInt3220 = local132;
					local1757 = Static54.method969(local128);
					local1742.anInt3214 = local1757.anInt2389;
					local1742.anInt3259 = local1757.anInt2405;
					if (local1742.anInt3217 > 0) {
						local1742.anInt3259 = local1742.anInt3259 * 32 / local1742.anInt3217;
					}
					local1742.anInt3194 = local1757.anInt2392;
					local1742.anInt3221 = local1757.anInt2396;
					local1742.anInt3210 = local1757.anInt2382;
					local1742.anInt3263 = local1757.anInt2397;
					Static51.method913(local1742);
				} else if (local128 == -1) {
					Static92.anInt2058 = -1;
					local1742.anInt3190 = 0;
					return true;
				} else {
					local1757 = Static54.method969(local128);
					local1742.anInt3259 = local1757.anInt2405 * 100 / local132;
					local1742.anInt3214 = local1757.anInt2389;
					local1742.anInt3210 = local1757.anInt2382;
					local1742.anInt3222 = local128;
					local1742.anInt3190 = 4;
					Static51.method913(local1742);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 254) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method332();
				local132 = Static21.aClass1_Sub8_Sub1_1.method309();
				local143 = Static21.aClass1_Sub8_Sub1_1.method323();
				local1742 = Static41.method800(local143);
				local193 = local1742.anInt3241 + local132;
				local181 = local128 + local1742.anInt3239;
				if (local1742.anInt3258 != local181 || local193 != local1742.anInt3230) {
					local1742.anInt3258 = local181;
					local1742.anInt3230 = local193;
					Static51.method913(local1742);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 174) {
				Static106.anInt2330 = Static21.aClass1_Sub8_Sub1_1.method320() * 30;
				Static168.anInt3912 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 255) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method312();
				Static98.method1642(local128);
				Static118.anIntArray279[Static184.anInt4114++ & 0x1F] = local128 & 0x7FFF;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 192) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method347();
				@Pc(1965) Class1_Sub4 local1965 = (Class1_Sub4) Static119.aClass5_8.method134((long) local128);
				if (local1965 != null) {
					Static139.method2337(true, local1965);
				}
				if (Static46.aClass77_7 != null) {
					Static51.method913(Static46.aClass77_7);
					Static46.aClass77_7 = null;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 99) {
				Static53.anInt1292 = Static21.aClass1_Sub8_Sub1_1.method362();
				Static25.anInt646 = Static21.aClass1_Sub8_Sub1_1.method362();
				while (Static21.aClass1_Sub8_Sub1_1.anInt446 < Static98.anInt2162) {
					Static92.anInt2058 = Static21.aClass1_Sub8_Sub1_1.method336();
					Static167.method2968();
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 108) {
				local1609 = Static21.aClass1_Sub8_Sub1_1.method344();
				@Pc(2043) Class81 local2043;
				if (local1609.method2798(Static21.aClass81_178)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					local687 = false;
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (local1104 == Static90.aLongArray4[local193]) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						Static131.method2247(4, Static185.aClass81_1371, local2043);
					}
				} else if (local1609.method2798(Static98.aClass81_764)) {
					local687 = false;
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (local1104 == Static90.aLongArray4[local193]) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						@Pc(2091) Class81 local2091 = local1609.method2823(local1609.method2803(Static89.aClass81_1410) + 1, local1609.method2820() - 9);
						Static131.method2247(8, local2091, local2043);
					}
				} else if (local1609.method2798(Static78.aClass81_630)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					local687 = false;
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (Static90.aLongArray4[local193] == local1104) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						Static131.method2247(10, Static149.aClass81_1213, local2043);
					}
				} else if (local1609.method2798(Static56.aClass81_471)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static56.aClass81_471));
					Static131.method2247(11, local2043, Static149.aClass81_1213);
				} else if (local1609.method2798(Static173.aClass81_1399)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static173.aClass81_1399));
					if (Static57.anInt1360 == 0) {
						Static131.method2247(12, local2043, Static149.aClass81_1213);
					}
				} else if (local1609.method2798(Static178.aClass81_1413)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static178.aClass81_1413));
					if (Static57.anInt1360 == 0) {
						Static131.method2247(13, local2043, Static149.aClass81_1213);
					}
				} else if (local1609.method2798(Static155.aClass81_1265)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					local687 = false;
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (Static90.aLongArray4[local193] == local1104) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						Static131.method2247(14, Static149.aClass81_1213, local2043);
					}
				} else if (local1609.method2798(Static176.aClass81_1405)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					local687 = false;
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (local1104 == Static90.aLongArray4[local193]) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						Static131.method2247(15, Static149.aClass81_1213, local2043);
					}
				} else if (local1609.method2798(Static148.aClass81_1198)) {
					local2043 = local1609.method2823(0, local1609.method2803(Static89.aClass81_1410));
					local1104 = local2043.method2821();
					local687 = false;
					for (local193 = 0; local193 < Static9.anInt178; local193++) {
						if (Static90.aLongArray4[local193] == local1104) {
							local687 = true;
							break;
						}
					}
					if (!local687 && Static57.anInt1360 == 0) {
						Static131.method2247(16, Static149.aClass81_1213, local2043);
					}
				} else {
					Static131.method2247(0, local1609, Static149.aClass81_1213);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 177) {
				for (local128 = 0; local128 < Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1.length; local128++) {
					if (Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local128] != null) {
						Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local128].anInt3024 = -1;
					}
				}
				for (local132 = 0; local132 < Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11.length; local132++) {
					if (Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local132] != null) {
						Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local132].anInt3024 = -1;
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 140) {
				local1609 = Static21.aClass1_Sub8_Sub1_1.method344();
				@Pc(2522) Object[] local2522 = new Object[local1609.method2820() + 1];
				for (local143 = local1609.method2820() - 1; local143 >= 0; local143--) {
					if (local1609.method2826(local143) == 115) {
						local2522[local143 + 1] = Static21.aClass1_Sub8_Sub1_1.method344();
					} else {
						local2522[local143 + 1] = Integer.valueOf(Static21.aClass1_Sub8_Sub1_1.method347());
					}
				}
				local2522[0] = Integer.valueOf(Static21.aClass1_Sub8_Sub1_1.method347());
				@Pc(2575) Class1_Sub3 local2575 = new Class1_Sub3();
				local2575.anObjectArray1 = local2522;
				Static49.method870(local2575);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 39) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method338();
				if (local128 == 65535) {
					local128 = -1;
				}
				local132 = Static21.aClass1_Sub8_Sub1_1.method314();
				local143 = Static21.aClass1_Sub8_Sub1_1.method312();
				local177 = Static21.aClass1_Sub8_Sub1_1.method323();
				if (local143 == 65535) {
					local143 = -1;
				}
				for (local181 = local128; local181 <= local143; local181++) {
					@Pc(2628) long local2628 = (long) local181 + ((long) local177 << 32);
					@Pc(2633) Class1 local2633 = Static180.aClass5_12.method134(local2628);
					if (local2633 != null) {
						local2633.method3134();
					}
					Static180.aClass5_12.method138(new Class1_Sub9(local132), local2628);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 229) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method323();
				local132 = Static21.aClass1_Sub8_Sub1_1.method359();
				local256 = Static41.method800(local128);
				if (local132 == 65535) {
					local132 = -1;
				}
				if (local256.anInt3190 != 1 || local256.anInt3222 != local132) {
					local256.anInt3222 = local132;
					local256.anInt3190 = 1;
					Static51.method913(local256);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 215) {
				if (Static97.anInt2134 != -1) {
					Static162.method2839(0, Static97.anInt2134);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 38) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method314();
				local132 = Static21.aClass1_Sub8_Sub1_1.method312();
				Static33.anIntArray71[local132] = local128;
				if (Static83.anIntArray178[local132] != local128) {
					Static83.anIntArray178[local132] = local128;
					Static87.method1496(local132);
				}
				Static114.anIntArray238[Static82.anInt1884++ & 0x1F] = local132;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 120) {
				Static11.method560(Static21.aClass1_Sub8_Sub1_1);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 89) {
				Static52.method939();
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 32) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method362();
				local132 = Static21.aClass1_Sub8_Sub1_1.method336();
				local143 = Static21.aClass1_Sub8_Sub1_1.method353();
				Static44.anInt1086 = local143 >> 1;
				Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2362(local132, local128, (local143 & 0x1) == 1);
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(2855) long local2855;
			if (Static92.anInt2058 == 65) {
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				local1104 = Static21.aClass1_Sub8_Sub1_1.method359();
				@Pc(2850) boolean local2850 = false;
				local2855 = Static21.aClass1_Sub8_Sub1_1.method316();
				@Pc(2861) long local2861 = local2855 + (local1104 << 32);
				local802 = Static21.aClass1_Sub8_Sub1_1.method336();
				for (local1204 = 0; local1204 < 100; local1204++) {
					if (local2861 == Static126.aLongArray7[local1204]) {
						local2850 = true;
						break;
					}
				}
				if (local802 <= 1) {
					for (@Pc(2892) int local2892 = 0; local2892 < Static9.anInt178; local2892++) {
						if (Static90.aLongArray4[local2892] == local392) {
							local2850 = true;
							break;
						}
					}
				}
				if (!local2850 && Static57.anInt1360 == 0) {
					Static126.aLongArray7[Static148.anInt3302] = local2861;
					Static148.anInt3302 = (Static148.anInt3302 + 1) % 100;
					@Pc(2938) Class81 local2938 = Static186.method1941(Static164.method2872(Static21.aClass1_Sub8_Sub1_1).method2813());
					if (local802 == 2 || local802 == 3) {
						Static131.method2247(7, local2938, Static127.method2169(new Class81[] { Static158.aClass81_1284, Static106.method1751(local392).method2808() }));
					} else if (local802 == 1) {
						Static131.method2247(7, local2938, Static127.method2169(new Class81[] { Static93.aClass81_726, Static106.method1751(local392).method2808() }));
					} else {
						Static131.method2247(3, local2938, Static106.method1751(local392).method2808());
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 59) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method336();
				local132 = Static21.aClass1_Sub8_Sub1_1.method336();
				local143 = Static21.aClass1_Sub8_Sub1_1.method336();
				local177 = Static21.aClass1_Sub8_Sub1_1.method336();
				local181 = Static21.aClass1_Sub8_Sub1_1.method359();
				Static34.aBooleanArray2[local128] = true;
				Static21.anIntArray25[local128] = local132;
				Static72.anIntArray152[local128] = local143;
				Static19.anIntArray20[local128] = local177;
				Static95.anIntArray235[local128] = local181;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 188) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method309();
				local132 = Static21.aClass1_Sub8_Sub1_1.method347();
				local256 = Static41.method800(local132);
				if (local256.anInt3212 != local128 || local128 == -1) {
					local256.anInt3246 = 0;
					local256.anInt3216 = 0;
					local256.anInt3212 = local128;
					Static51.method913(local256);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(3119) Class1_Sub4 local3119;
			if (Static92.anInt2058 == 35) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method338();
				local132 = Static21.aClass1_Sub8_Sub1_1.method358();
				local143 = Static21.aClass1_Sub8_Sub1_1.method353();
				local3119 = (Class1_Sub4) Static119.aClass5_8.method134((long) local132);
				if (local3119 != null) {
					Static139.method2337(local3119.anInt155 != local128, local3119);
				}
				Static120.method2061(local143, local132, local128);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 161) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method359();
				local132 = Static21.aClass1_Sub8_Sub1_1.method314();
				local143 = Static21.aClass1_Sub8_Sub1_1.method359();
				local1742 = Static41.method800(local132);
				Static92.anInt2058 = -1;
				local1742.anInt3204 = local128 + (local143 << 16);
				return true;
			}
			if (Static92.anInt2058 == 60) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method323();
				local606 = Static41.method800(local128);
				local606.anInt3190 = 3;
				local606.anInt3222 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.method3111();
				Static51.method913(local606);
				Static92.anInt2058 = -1;
				return true;
			}
			@Pc(3250) long local3250;
			if (Static92.anInt2058 == 166) {
				local392 = Static21.aClass1_Sub8_Sub1_1.method363();
				Static21.aClass1_Sub8_Sub1_1.method339();
				@Pc(3225) boolean local3225 = false;
				local1104 = Static21.aClass1_Sub8_Sub1_1.method363();
				local2855 = Static21.aClass1_Sub8_Sub1_1.method359();
				@Pc(3239) long local3239 = (long) Static21.aClass1_Sub8_Sub1_1.method316();
				local1434 = Static21.aClass1_Sub8_Sub1_1.method336();
				local3250 = (local2855 << 32) + local3239;
				for (@Pc(3252) int local3252 = 0; local3252 < 100; local3252++) {
					if (Static126.aLongArray7[local3252] == local3250) {
						local3225 = true;
						break;
					}
				}
				if (local1434 <= 1) {
					for (local1518 = 0; local1518 < Static9.anInt178; local1518++) {
						if (Static90.aLongArray4[local1518] == local392) {
							local3225 = true;
							break;
						}
					}
				}
				if (!local3225 && Static57.anInt1360 == 0) {
					Static126.aLongArray7[Static148.anInt3302] = local3250;
					Static148.anInt3302 = (Static148.anInt3302 + 1) % 100;
					@Pc(3323) Class81 local3323 = Static186.method1941(Static164.method2872(Static21.aClass1_Sub8_Sub1_1).method2813());
					if (local1434 == 2 || local1434 == 3) {
						Static34.method738(Static106.method1751(local1104).method2808(), 9, local3323, Static127.method2169(new Class81[] { Static158.aClass81_1284, Static106.method1751(local392).method2808() }));
					} else if (local1434 == 1) {
						Static34.method738(Static106.method1751(local1104).method2808(), 9, local3323, Static127.method2169(new Class81[] { Static93.aClass81_726, Static106.method1751(local392).method2808() }));
					} else {
						Static34.method738(Static106.method1751(local1104).method2808(), 9, local3323, Static106.method1751(local392).method2808());
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 28) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method336();
				@Pc(3423) Class80 local3423 = new Class80();
				local132 = local128 >> 6;
				local3423.anInt3569 = local128 & 0x3F;
				local3423.anInt3567 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (local3423.anInt3567 >= 0 && local3423.anInt3567 < Static107.aClass1_Sub2_Sub2_Sub3Array8.length) {
					if (local3423.anInt3569 == 1 || local3423.anInt3569 == 10) {
						local3423.anInt3564 = Static21.aClass1_Sub8_Sub1_1.method359();
					}
					if (local3423.anInt3569 >= 2 && local3423.anInt3569 <= 6) {
						if (local3423.anInt3569 == 2) {
							local3423.anInt3568 = 64;
							local3423.anInt3566 = 64;
						}
						if (local3423.anInt3569 == 3) {
							local3423.anInt3568 = 0;
							local3423.anInt3566 = 64;
						}
						if (local3423.anInt3569 == 4) {
							local3423.anInt3566 = 64;
							local3423.anInt3568 = 128;
						}
						if (local3423.anInt3569 == 5) {
							local3423.anInt3566 = 0;
							local3423.anInt3568 = 64;
						}
						if (local3423.anInt3569 == 6) {
							local3423.anInt3568 = 64;
							local3423.anInt3566 = 128;
						}
						local3423.anInt3569 = 2;
						local3423.anInt3563 = Static21.aClass1_Sub8_Sub1_1.method359();
						local3423.anInt3561 = Static21.aClass1_Sub8_Sub1_1.method359();
						local3423.anInt3565 = Static21.aClass1_Sub8_Sub1_1.method336();
					}
					Static2.aClass80Array1[local132] = local3423;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 40) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method323();
				local132 = Static21.aClass1_Sub8_Sub1_1.method312();
				local143 = Static21.aClass1_Sub8_Sub1_1.method338();
				local177 = Static21.aClass1_Sub8_Sub1_1.method312();
				@Pc(3585) Class77 local3585 = Static41.method800(local128);
				if (local3585.anInt3214 != local132 || local3585.anInt3210 != local143 || local177 != local3585.anInt3259) {
					local3585.anInt3210 = local143;
					local3585.anInt3259 = local177;
					local3585.anInt3214 = local132;
					Static51.method913(local3585);
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 107) {
				local128 = Static21.aClass1_Sub8_Sub1_1.anInt446 + Static98.anInt2162;
				local132 = Static21.aClass1_Sub8_Sub1_1.method359();
				local143 = Static21.aClass1_Sub8_Sub1_1.method359();
				if (Static97.anInt2134 != local132) {
					Static97.anInt2134 = local132;
					Static136.method2284(Static97.anInt2134);
					Static167.method2977(Static97.anInt2134);
					for (local177 = 0; local177 < 100; local177++) {
						Static87.aBooleanArray11[local177] = true;
					}
				}
				while (local143-- > 0) {
					local177 = Static21.aClass1_Sub8_Sub1_1.method347();
					local181 = Static21.aClass1_Sub8_Sub1_1.method359();
					local193 = Static21.aClass1_Sub8_Sub1_1.method336();
					@Pc(3677) Class1_Sub4 local3677 = (Class1_Sub4) Static119.aClass5_8.method134((long) local177);
					if (local3677 != null && local181 != local3677.anInt155) {
						Static139.method2337(true, local3677);
						local3677 = null;
					}
					if (local3677 == null) {
						local3677 = Static120.method2061(local193, local177, local181);
					}
					local3677.aBoolean4 = true;
				}
				for (local3119 = (Class1_Sub4) Static119.aClass5_8.method140(); local3119 != null; local3119 = (Class1_Sub4) Static119.aClass5_8.method132()) {
					if (local3119.aBoolean4) {
						local3119.aBoolean4 = false;
					} else {
						Static139.method2337(true, local3119);
					}
				}
				Static180.aClass5_12 = new Class5(512);
				while (Static21.aClass1_Sub8_Sub1_1.anInt446 < local128) {
					local181 = Static21.aClass1_Sub8_Sub1_1.method347();
					local193 = Static21.aClass1_Sub8_Sub1_1.method359();
					local802 = Static21.aClass1_Sub8_Sub1_1.method359();
					local813 = Static21.aClass1_Sub8_Sub1_1.method347();
					for (local1434 = local193; local1434 <= local802; local1434++) {
						local3250 = (long) local1434 + ((long) local181 << 32);
						Static180.aClass5_12.method138(new Class1_Sub9(local813), local3250);
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 191) {
				Static184.aBoolean171 = true;
				Static23.anInt588 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static59.anInt1396 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static122.anInt2744 = Static21.aClass1_Sub8_Sub1_1.method359();
				Static72.anInt1735 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static109.anInt2437 = Static21.aClass1_Sub8_Sub1_1.method336();
				if (Static109.anInt2437 >= 100) {
					local128 = Static23.anInt588 * 128 + 64;
					local132 = Static59.anInt1396 * 128 + 64;
					local143 = Static102.method1694(local128, Static44.anInt1086, local132) - Static122.anInt2744;
					local181 = local143 - Static126.anInt2769;
					local177 = local128 - Static53.anInt1289;
					local193 = local132 - Static69.anInt1702;
					local802 = (int) Math.sqrt((double) (local193 * local193 + local177 * local177));
					Static106.anInt2331 = (int) (Math.atan2((double) local181, (double) local802) * 325.949D) & 0x7FF;
					Static31.anInt838 = (int) (Math.atan2((double) local177, (double) local193) * -325.949D) & 0x7FF;
					if (Static106.anInt2331 < 128) {
						Static106.anInt2331 = 128;
					}
					if (Static106.anInt2331 > 383) {
						Static106.anInt2331 = 383;
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 21) {
				Static49.method867(Static98.anInt2162, Static86.aClass68_2, Static21.aClass1_Sub8_Sub1_1);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 176) {
				Static120.method2056();
				Static92.anInt2058 = -1;
				return false;
			}
			if (Static92.anInt2058 == 218) {
				Static9.anInt178 = Static98.anInt2162 / 8;
				for (local128 = 0; local128 < Static9.anInt178; local128++) {
					Static90.aLongArray4[local128] = Static21.aClass1_Sub8_Sub1_1.method363();
					Static105.aClass81Array8[local128] = Static106.method1751(Static90.aLongArray4[local128]);
				}
				Static140.anInt3066 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 70) {
				Static53.anInt1292 = Static21.aClass1_Sub8_Sub1_1.method353();
				Static25.anInt646 = Static21.aClass1_Sub8_Sub1_1.method362();
				for (local128 = Static25.anInt646; local128 < Static25.anInt646 + 8; local128++) {
					for (local132 = Static53.anInt1292; local132 < Static53.anInt1292 + 8; local132++) {
						if (Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local128][local132] != null) {
							Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local128][local132] = null;
							Static121.method2084(local128, local132);
						}
					}
				}
				for (@Pc(4044) Class1_Sub23 local4044 = (Class1_Sub23) Static70.aClass30_11.method1115(); local4044 != null; local4044 = (Class1_Sub23) Static70.aClass30_11.method1125()) {
					if (Static25.anInt646 <= local4044.anInt3742 && Static25.anInt646 + 8 > local4044.anInt3742 && local4044.anInt3739 >= Static53.anInt1292 && local4044.anInt3739 < Static53.anInt1292 + 8 && Static44.anInt1086 == local4044.anInt3733) {
						local4044.anInt3735 = 0;
					}
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 149) {
				Static136.method2286();
				local128 = Static21.aClass1_Sub8_Sub1_1.method314();
				local132 = Static21.aClass1_Sub8_Sub1_1.method362();
				local143 = Static21.aClass1_Sub8_Sub1_1.method353();
				Static113.anIntArray272[local132] = local128;
				Static70.anIntArray149[local132] = local143;
				Static16.anIntArray13[local132] = 1;
				for (local177 = 0; local177 < 98; local177++) {
					if (Class34.anIntArray239[local177] <= local128) {
						Static16.anIntArray13[local132] = local177 + 2;
					}
				}
				Static15.anIntArray12[Static57.anInt1370++ & 0x1F] = local132;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 84) {
				Static136.method2286();
				Static168.anInt3907 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static168.anInt3912 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 220) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method347();
				local132 = Static21.aClass1_Sub8_Sub1_1.method359();
				if (local128 < 0) {
					local256 = null;
				} else {
					local256 = Static41.method800(local128);
				}
				if (local128 < -70000) {
					local132 += 32768;
				}
				if (local256 != null) {
					for (local177 = 0; local177 < local256.anIntArray348.length; local177++) {
						local256.anIntArray348[local177] = 0;
						local256.anIntArray342[local177] = 0;
					}
				}
				Static112.method1960(local132);
				local177 = Static21.aClass1_Sub8_Sub1_1.method359();
				for (local181 = 0; local181 < local177; local181++) {
					local193 = Static21.aClass1_Sub8_Sub1_1.method359();
					local802 = Static21.aClass1_Sub8_Sub1_1.method336();
					if (local802 == 255) {
						local802 = Static21.aClass1_Sub8_Sub1_1.method358();
					}
					if (local256 != null && local256.anIntArray348.length > local181) {
						local256.anIntArray348[local181] = local193;
						local256.anIntArray342[local181] = local802;
					}
					method3035(local132, local802, local193 - 1, local181);
				}
				if (local256 != null) {
					Static51.method913(local256);
				}
				Static136.method2286();
				Static118.anIntArray279[Static184.anInt4114++ & 0x1F] = local132 & 0x7FFF;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 114) {
				Static150.anInt3394 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static140.anInt3066 = Static121.anInt2701;
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 13) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method312();
				Static97.anInt2134 = local128;
				Static136.method2284(local128);
				Static167.method2977(Static97.anInt2134);
				for (local132 = 0; local132 < 100; local132++) {
					Static87.aBooleanArray11[local132] = true;
				}
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 179) {
				Static89.anInt4029 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 157) {
				Static70.anInt1713 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static64.anInt1610 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static44.anInt1085 = Static21.aClass1_Sub8_Sub1_1.method336();
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 61) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method312();
				if (local128 == 65535) {
					local128 = -1;
				}
				Static25.method553(local128);
				Static92.anInt2058 = -1;
				return true;
			}
			if (Static92.anInt2058 == 68) {
				local128 = Static21.aClass1_Sub8_Sub1_1.method327();
				local132 = Static21.aClass1_Sub8_Sub1_1.method312();
				if (local132 == 65535) {
					local132 = -1;
				}
				Static67.method1202(local128, local132);
				Static92.anInt2058 = -1;
				return true;
			}
			Static5.method115("T1 - " + Static92.anInt2058 + "," + anInt3987 + "," + Static86.anInt1952 + " - " + Static98.anInt2162, null);
			Static120.method2056();
		} catch (@Pc(4481) IOException local4481) {
			Static146.method2499();
		} catch (@Pc(4485) Exception local4485) {
			@Pc(4525) String local4525 = "T2 - " + Static92.anInt2058 + "," + anInt3987 + "," + Static86.anInt1952 + " - " + Static98.anInt2162 + "," + (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0] + Static51.anInt1219) + "," + (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0] + Static114.anInt2140) + " - ";
			for (local132 = 0; Static98.anInt2162 > local132 && local132 < 50; local132++) {
				local4525 = local4525 + Static21.aClass1_Sub8_Sub1_1.aByteArray3[local132] + ",";
			}
			Static5.method115(local4525, local4485);
			Static120.method2056();
		}
		return true;
	}
}
