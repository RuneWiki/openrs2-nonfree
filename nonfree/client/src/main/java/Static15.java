import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!tj;")
	public static Class193 aClass193_12;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public static int anInt1161;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "Lclient!sp;")
	public static Class4_Sub39 aClass4_Sub39_2;

	@OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
	private static int anInt1186;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
	private static int anInt1187;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "I")
	private static int anInt1188;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "Lclient!cb;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIZII)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static166.method3253(arg7)) {
			Static133.method2846(arg0, arg2, arg4, Static271.aClass21ArrayArray1[arg7], arg6, arg5, arg3, -1, arg1);
		} else if (arg1 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static172.aBooleanArray19[local20] = true;
			}
		} else {
			Static172.aBooleanArray19[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	public static void method862() {
		Static199.aClass116_35 = new Class116();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method863(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)Z")
	public static boolean method865() throws IOException {
		if (Static155.aClass114_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static155.aClass114_3.method3161();
		if (local13 == 0) {
			return false;
		}
		if (Static229.anInt4619 == -1) {
			Static155.aClass114_3.method3168(1, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
			Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
			Static229.anInt4619 = Static127.aClass4_Sub11_Sub1_3.method704();
			local13--;
			Static133.anInt3104 = Static103.anIntArray230[Static229.anInt4619];
		}
		if (Static133.anInt3104 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static155.aClass114_3.method3168(1, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
			Static133.anInt3104 = Static127.aClass4_Sub11_Sub1_3.aByteArray55[0] & 0xFF;
			local13--;
		}
		if (Static133.anInt3104 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static155.aClass114_3.method3168(2, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
			Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
			local13 -= 2;
			Static133.anInt3104 = Static127.aClass4_Sub11_Sub1_3.method3401();
		}
		if (Static133.anInt3104 > local13) {
			return false;
		}
		Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
		Static155.aClass114_3.method3168(Static133.anInt3104, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
		Static57.anInt1518 = 0;
		Static209.anInt4334 = Static205.anInt4305;
		Static205.anInt4305 = Static168.anInt6692;
		Static168.anInt6692 = Static229.anInt4619;
		@Pc(149) String local149;
		if (Static229.anInt4619 == 93) {
			if (Static229.aFrame1 != null) {
				Static195.method3698(-1, Static309.anInt6000, false, -1);
			}
			@Pc(137) byte[] local137 = new byte[Static133.anInt3104];
			Static127.aClass4_Sub11_Sub1_3.method709(local137, Static133.anInt3104);
			local149 = Static57.method1206(0, Static133.anInt3104, local137);
			Static261.method4551(true, Static225.anInt4568 == 1, Static1.aClass134_7, local149);
			Static229.anInt4619 = -1;
			return true;
		} else if (Static229.anInt4619 == 66) {
			Static240.method4266(false);
			Static229.anInt4619 = -1;
			return true;
		} else {
			@Pc(179) int local179;
			if (Static229.anInt4619 == 9) {
				for (local179 = 0; local179 < Static328.anIntArray485.length; local179++) {
					if (Static328.anIntArray485[local179] != Static341.anIntArray9[local179]) {
						Static328.anIntArray485[local179] = Static341.anIntArray9[local179];
						Static198.method3735(local179);
						Static269.anIntArray440[Static2.anInt57++ & 0x1F] = local179;
					}
				}
				Static229.anInt4619 = -1;
				return true;
			}
			@Pc(252) int local252;
			@Pc(233) int local233;
			@Pc(248) int local248;
			@Pc(237) int local237;
			@Pc(263) int local263;
			@Pc(273) long local273;
			@Pc(288) Class4_Sub12 local288;
			@Pc(279) Class4_Sub12 local279;
			if (Static229.anInt4619 == 96) {
				local179 = Static127.aClass4_Sub11_Sub1_3.method3418();
				local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local237 = Static127.aClass4_Sub11_Sub1_3.method3460();
				if (local237 == 65535) {
					local237 = -1;
				}
				local248 = Static127.aClass4_Sub11_Sub1_3.method3425();
				local252 = Static127.aClass4_Sub11_Sub1_3.method3401();
				if (local252 == 65535) {
					local252 = -1;
				}
				if (Static272.method4652(local233)) {
					for (local263 = local252; local263 <= local237; local263++) {
						local273 = (long) local263 + ((long) local248 << 32);
						local279 = (Class4_Sub12) Static33.aClass43_5.method1273(local273);
						if (local279 != null) {
							local288 = new Class4_Sub12(local179, local279.anInt1384);
							local279.method5687();
						} else if (local263 == -1) {
							local288 = new Class4_Sub12(local179, Static92.method534(local248).aClass4_Sub12_1.anInt1384);
						} else {
							local288 = new Class4_Sub12(local179, -1);
						}
						Static33.aClass43_5.method1276(local288, local273);
					}
				}
				Static229.anInt4619 = -1;
				return true;
			} else if (Static229.anInt4619 == 231) {
				local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
				if (local179 == 65535) {
					local179 = -1;
				}
				local233 = Static127.aClass4_Sub11_Sub1_3.method3412();
				local237 = Static127.aClass4_Sub11_Sub1_3.method3417();
				local248 = Static127.aClass4_Sub11_Sub1_3.method3418();
				if (Static272.method4652(local233)) {
					Static195.method3692(local179, local237, local248);
					@Pc(366) Class210 local366 = Static177.method3465(local179);
					Static3.method122(local366.anInt6488, local366.anInt6476, local366.anInt6481, local237);
					Static249.method4400(local366.anInt6478, local366.anInt6513, local366.anInt6517, local237);
				}
				Static229.anInt4619 = -1;
				return true;
			} else if (Static229.anInt4619 == 65) {
				Static127.aClass4_Sub11_Sub1_3.anInt3768 += 28;
				if (Static127.aClass4_Sub11_Sub1_3.method3461()) {
					Static156.method4513(Static127.aClass4_Sub11_Sub1_3.anInt3768 - 28, Static127.aClass4_Sub11_Sub1_3);
				}
				Static229.anInt4619 = -1;
				return true;
			} else if (Static229.anInt4619 == 190) {
				Static129.anInt3035 = Static127.aClass4_Sub11_Sub1_3.method3440();
				for (local179 = 0; local179 < Static129.anInt3035; local179++) {
					Static161.aStringArray39[local179] = Static127.aClass4_Sub11_Sub1_3.method3446();
					Static332.aStringArray78[local179] = Static127.aClass4_Sub11_Sub1_3.method3446();
					if (Static332.aStringArray78[local179].equals("")) {
						Static332.aStringArray78[local179] = Static161.aStringArray39[local179];
					}
					Static45.aStringArray11[local179] = Static127.aClass4_Sub11_Sub1_3.method3446();
					Static292.aStringArray68[local179] = Static127.aClass4_Sub11_Sub1_3.method3446();
					if (Static292.aStringArray68[local179].equals("")) {
						Static292.aStringArray68[local179] = Static45.aStringArray11[local179];
					}
					Static113.aBooleanArray13[local179] = false;
				}
				Static254.anInt2746 = Static66.anInt1751;
				Static229.anInt4619 = -1;
				return true;
			} else {
				@Pc(526) Class4_Sub25 local526;
				if (Static229.anInt4619 == 198) {
					local179 = Static127.aClass4_Sub11_Sub1_3.method3425();
					local233 = Static127.aClass4_Sub11_Sub1_3.method3460();
					local237 = Static127.aClass4_Sub11_Sub1_3.method3417();
					if (Static272.method4652(local233)) {
						@Pc(519) Class4_Sub25 local519 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local237);
						local526 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local179);
						if (local526 != null) {
							Static234.method4154(local519 == null || local526.anInt3695 != local519.anInt3695, local526, false);
						}
						if (local519 != null) {
							local519.method5687();
							Static270.aClass43_29.method1276(local519, (long) local179);
						}
						@Pc(561) Class21 local561 = Static92.method534(local237);
						if (local561 != null) {
							Static349.method5536(local561);
						}
						local561 = Static92.method534(local179);
						if (local561 != null) {
							Static349.method5536(local561);
							Static150.method3012(local561, true);
						}
						if (Static357.anInt6821 != -1) {
							Static318.method5242(1, Static357.anInt6821);
						}
					}
					Static229.anInt4619 = -1;
					return true;
				} else if (Static229.anInt4619 == 23) {
					Static91.method5018();
					Static229.anInt4619 = -1;
					return true;
				} else if (Static229.anInt4619 == 24) {
					local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
					local233 = Static127.aClass4_Sub11_Sub1_3.method3417();
					local237 = Static127.aClass4_Sub11_Sub1_3.method3412();
					if (Static272.method4652(local237)) {
						Static146.method2543(local233, local179);
					}
					Static229.anInt4619 = -1;
					return true;
				} else if (Static229.anInt4619 == 18) {
					local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
					local233 = Static127.aClass4_Sub11_Sub1_3.method3412();
					@Pc(647) byte local647 = Static127.aClass4_Sub11_Sub1_3.method3409();
					if (Static272.method4652(local233)) {
						Static48.method960(local179, local647);
					}
					Static229.anInt4619 = -1;
					return true;
				} else if (Static229.anInt4619 == 187) {
					local179 = Static127.aClass4_Sub11_Sub1_3.method3440();
					local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
					if (local179 == 255) {
						local233 = -1;
						local179 = -1;
					}
					Static201.method3774(local179, local233);
					Static229.anInt4619 = -1;
					return true;
				} else {
					@Pc(694) String local694;
					if (Static229.anInt4619 == 39) {
						local694 = Static127.aClass4_Sub11_Sub1_3.method3446();
						local233 = Static127.aClass4_Sub11_Sub1_3.method3451();
						local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
						if (local237 == 65535) {
							local237 = -1;
						}
						local248 = Static127.aClass4_Sub11_Sub1_3.method3451();
						if (local248 >= 1 && local248 <= 8) {
							if (local694.equalsIgnoreCase("null")) {
								local694 = null;
							}
							Static330.aStringArray76[local248 - 1] = local694;
							Static30.anIntArray40[local248 - 1] = local237;
							Static119.aBooleanArray15[local248 - 1] = local233 == 0;
						}
						Static229.anInt4619 = -1;
						return true;
					} else if (Static229.anInt4619 == 246) {
						anInt1161 = Static127.aClass4_Sub11_Sub1_3.method3440();
						Static122.anInt2887 = Static127.aClass4_Sub11_Sub1_3.method3413();
						Static229.anInt4619 = -1;
						return true;
					} else if (Static229.anInt4619 == 77) {
						local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
						local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local237 = Static127.aClass4_Sub11_Sub1_3.method3440();
						@Pc(794) Class8_Sub1_Sub2_Sub2 local794 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local179];
						if (local794 != null) {
							Static293.method3942(local233, local237, local794);
						}
						Static229.anInt4619 = -1;
						return true;
					} else if (Static229.anInt4619 == 98) {
						local179 = Static127.aClass4_Sub11_Sub1_3.method3453();
						local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
						local237 = Static127.aClass4_Sub11_Sub1_3.method3460();
						local248 = Static127.aClass4_Sub11_Sub1_3.method3425();
						if (Static272.method4652(local237)) {
							local526 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local248);
							if (local526 != null) {
								Static234.method4154(local233 != local526.anInt3695, local526, false);
							}
							Static329.method3593(local248, local233, local179, false);
						}
						Static229.anInt4619 = -1;
						return true;
					} else if (Static229.anInt4619 == 49) {
						local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local237 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local248 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local252 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local263 = Static127.aClass4_Sub11_Sub1_3.method3401();
						if (Static272.method4652(local179)) {
							Static298.aBooleanArray26[local233] = true;
							Static171.anIntArray313[local233] = local237;
							Static305.anIntArray512[local233] = local248;
							Static144.anIntArray280[local233] = local252;
							Static149.anIntArray333[local233] = local263;
						}
						Static229.anInt4619 = -1;
						return true;
					} else {
						@Pc(969) int local969;
						@Pc(940) boolean local940;
						if (Static229.anInt4619 == 148) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
							local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
							local940 = (local233 & 0x1) == 1;
							Static107.method5410(local940, local179);
							local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
							for (local252 = 0; local252 < local248; local252++) {
								local263 = Static127.aClass4_Sub11_Sub1_3.method3451();
								if (local263 == 255) {
									local263 = Static127.aClass4_Sub11_Sub1_3.method3417();
								}
								local969 = Static127.aClass4_Sub11_Sub1_3.method3412();
								Static153.method3026(local969 - 1, local179, local263, local940, local252);
							}
							Static29.anIntArray30[Static278.anInt6682++ & 0x1F] = local179;
							Static229.anInt4619 = -1;
							return true;
						} else if (Static229.anInt4619 == 31) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
							local233 = Static127.aClass4_Sub11_Sub1_3.method3460();
							local237 = Static127.aClass4_Sub11_Sub1_3.method3418();
							local248 = Static127.aClass4_Sub11_Sub1_3.method3425();
							if (Static272.method4652(local179)) {
								Static189.method3599(local233, local237, 5, local248);
							}
							Static229.anInt4619 = -1;
							return true;
						} else if (Static229.anInt4619 == 118) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
							local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
							local237 = Static127.aClass4_Sub11_Sub1_3.method3418();
							if (Static272.method4652(local179)) {
								Static237.method5582(local233, local237);
							}
							Static229.anInt4619 = -1;
							return true;
						} else if (Static229.anInt4619 == 224) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
							local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
							local940 = (local233 & 0x1) == 1;
							while (Static133.anInt3104 > Static127.aClass4_Sub11_Sub1_3.anInt3768) {
								local248 = Static127.aClass4_Sub11_Sub1_3.method3457();
								local252 = Static127.aClass4_Sub11_Sub1_3.method3401();
								local263 = 0;
								if (local252 != 0) {
									local263 = Static127.aClass4_Sub11_Sub1_3.method3440();
									if (local263 == 255) {
										local263 = Static127.aClass4_Sub11_Sub1_3.method3418();
									}
								}
								Static153.method3026(local252 - 1, local179, local263, local940, local248);
							}
							Static29.anIntArray30[Static278.anInt6682++ & 0x1F] = local179;
							Static229.anInt4619 = -1;
							return true;
						} else if (Static229.anInt4619 == 121) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
							local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
							Static191.method3633(local233, local179);
							Static229.anInt4619 = -1;
							return true;
						} else if (Static229.anInt4619 == 185) {
							local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
							if (local179 == 65535) {
								local179 = -1;
							}
							local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
							local237 = Static127.aClass4_Sub11_Sub1_3.method3420();
							if (Static272.method4652(local233)) {
								Static189.method3599(local179, -1, 2, local237);
							}
							Static229.anInt4619 = -1;
							return true;
						} else {
							@Pc(1219) String local1219;
							if (Static229.anInt4619 == 69) {
								local694 = Static127.aClass4_Sub11_Sub1_3.method3446();
								local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
								local1219 = Static318.method5246(local233).method4699(Static127.aClass4_Sub11_Sub1_3);
								Static271.method4637(19, null, local1219, local694, local233, local694, 0);
								Static229.anInt4619 = -1;
								return true;
							}
							@Pc(1456) int local1456;
							@Pc(1338) int local1338;
							@Pc(1304) boolean local1304;
							@Pc(1714) int local1714;
							if (Static229.anInt4619 == 241) {
								local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
								local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
								local237 = Static127.aClass4_Sub11_Sub1_3.method3460();
								local248 = Static127.aClass4_Sub11_Sub1_3.method3425();
								if (local248 >> 30 == 0) {
									@Pc(1322) Class5 local1322;
									@Pc(1370) Class5 local1370;
									@Pc(1335) Class14 local1335;
									@Pc(1384) Class14 local1384;
									@Pc(1389) Class14 local1389;
									if (local248 >> 29 != 0) {
										local252 = local248 & 0xFFFF;
										@Pc(1493) Class8_Sub1_Sub2_Sub2 local1493 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local252];
										if (local1493 != null) {
											if (local179 == 65535) {
												local179 = -1;
											}
											local1304 = true;
											if (local179 != -1 && local1493.anInt4972 != -1) {
												if (local1493.anInt4972 == local179) {
													local1322 = Static116.method2427(local179);
													if (local1322.aBoolean11 && local1322.anInt101 != -1) {
														local1335 = Static225.method4042(local1322.anInt101);
														local1338 = local1335.anInt351;
														if (local1338 == 0 || local1338 == 2) {
															local1304 = false;
														} else if (local1338 == 1) {
															local1304 = true;
														}
													}
												} else {
													local1322 = Static116.method2427(local179);
													local1370 = Static116.method2427(local1493.anInt4972);
													if (local1322.anInt101 != -1 && local1370.anInt101 != -1) {
														local1384 = Static225.method4042(local1322.anInt101);
														local1389 = Static225.method4042(local1370.anInt101);
														if (local1389.anInt344 > local1384.anInt344) {
															local1304 = false;
														}
													}
												}
											}
											if (local1304) {
												local1493.anInt4949 = 0;
												local1493.anInt4943 = local233;
												local1493.anInt4980 = 1;
												local1493.anInt4972 = local179;
												local1493.anInt4971 = 0;
												local1493.anInt4919 = Static199.anInt4137 + local237;
												if (local1493.anInt4919 > Static199.anInt4137) {
													local1493.anInt4971 = -1;
												}
												if (local1493.anInt4972 != -1 && local1493.anInt4919 == Static199.anInt4137) {
													local1456 = Static116.method2427(local1493.anInt4972).anInt101;
													if (local1456 != -1) {
														local1335 = Static225.method4042(local1456);
														if (local1335 != null && local1335.anIntArray12 != null) {
															Static167.method3265(local1493.anInt6701, local1493.anInt6702, 0, false, local1335);
														}
													}
												}
											}
										}
									} else if (local248 >> 28 != 0) {
										local252 = local248 & 0xFFFF;
										@Pc(1289) Class8_Sub1_Sub2_Sub1 local1289;
										if (Static64.anInt1674 == local252) {
											local1289 = Static158.aClass8_Sub1_Sub2_Sub1_1;
										} else {
											local1289 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local252];
										}
										if (local1289 != null) {
											if (local179 == 65535) {
												local179 = -1;
											}
											local1304 = true;
											if (local179 != -1 && local1289.anInt4972 != -1) {
												if (local179 == local1289.anInt4972) {
													local1322 = Static116.method2427(local179);
													if (local1322.aBoolean11 && local1322.anInt101 != -1) {
														local1335 = Static225.method4042(local1322.anInt101);
														local1338 = local1335.anInt351;
														if (local1338 == 0 || local1338 == 2) {
															local1304 = false;
														} else if (local1338 == 1) {
															local1304 = true;
														}
													}
												} else {
													local1322 = Static116.method2427(local179);
													local1370 = Static116.method2427(local1289.anInt4972);
													if (local1322.anInt101 != -1 && local1370.anInt101 != -1) {
														local1384 = Static225.method4042(local1322.anInt101);
														local1389 = Static225.method4042(local1370.anInt101);
														if (local1384.anInt344 < local1389.anInt344) {
															local1304 = false;
														}
													}
												}
											}
											if (local1304) {
												local1289.anInt4972 = local179;
												local1289.anInt4980 = 1;
												local1289.anInt4943 = local233;
												local1289.anInt4949 = 0;
												local1289.anInt4971 = 0;
												local1289.anInt4919 = local237 + Static199.anInt4137;
												if (Static199.anInt4137 < local1289.anInt4919) {
													local1289.anInt4971 = -1;
												}
												if (local1289.anInt4972 == 65535) {
													local1289.anInt4972 = -1;
												}
												if (local1289.anInt4972 != -1 && Static199.anInt4137 == local1289.anInt4919) {
													local1456 = Static116.method2427(local1289.anInt4972).anInt101;
													if (local1456 != -1) {
														local1335 = Static225.method4042(local1456);
														if (local1335 != null && local1335.anIntArray12 != null) {
															Static167.method3265(local1289.anInt6701, local1289.anInt6702, 0, Static158.aClass8_Sub1_Sub2_Sub1_1 == local1289, local1335);
														}
													}
												}
											}
										}
									}
								} else {
									local252 = local248 >> 28 & 0x3;
									local263 = (local248 >> 14 & 0x3FFF) - Static286.anInt6699;
									local969 = (local248 & 0x3FFF) - Static136.anInt3193;
									if (local263 >= 0 && local969 >= 0 && local263 < Static350.anInt6637 && local969 < Static105.anInt2647) {
										local1456 = local263 * 128 + 64;
										local1714 = local969 * 128 + 64;
										@Pc(1736) Class8_Sub1_Sub1 local1736 = new Class8_Sub1_Sub1(local179, 0, Static199.anInt4137, local252, local1456, Static81.method2010(local252, local1714, local1456) - local233, local1714, local263, local263, local969, local969);
										Static337.aClass116_46.method3274(new Class4_Sub4_Sub6(local1736));
									}
								}
								Static229.anInt4619 = -1;
								return true;
							} else if (Static229.anInt4619 == 204) {
								Static12.method243(Static1.aClass134_7, Static133.anInt3104, Static127.aClass4_Sub11_Sub1_3);
								Static229.anInt4619 = -1;
								return true;
							} else if (Static229.anInt4619 == 205) {
								local179 = Static127.aClass4_Sub11_Sub1_3.method3440();
								if (Static127.aClass4_Sub11_Sub1_3.method3440() == 0) {
									Static3.aClass15Array1[local179] = new Class15();
								} else {
									Static127.aClass4_Sub11_Sub1_3.anInt3768--;
									Static3.aClass15Array1[local179] = new Class15(Static127.aClass4_Sub11_Sub1_3);
								}
								Static229.anInt4619 = -1;
								Static229.anInt4617 = Static66.anInt1751;
								return true;
							} else if (Static229.anInt4619 == 35) {
								local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
								@Pc(1810) byte local1810 = Static127.aClass4_Sub11_Sub1_3.method3428();
								Static245.method4358(local1810, local179);
								Static229.anInt4619 = -1;
								return true;
							} else if (Static229.anInt4619 == 248) {
								local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
								local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
								Static191.method3633(local233, local179);
								Static229.anInt4619 = -1;
								return true;
							} else if (Static229.anInt4619 == 88) {
								local179 = Static127.aClass4_Sub11_Sub1_3.method3440();
								local233 = local179 >> 5;
								local237 = local179 & 0x1F;
								if (local237 == 0) {
									Static116.aClass187Array1[local233] = null;
									Static229.anInt4619 = -1;
									return true;
								}
								@Pc(1870) Class187 local1870 = new Class187();
								local1870.anInt5730 = local237;
								local1870.anInt5733 = Static127.aClass4_Sub11_Sub1_3.method3440();
								if (local1870.anInt5733 >= 0 && local1870.anInt5733 < Static348.aClass58Array134.length) {
									if (local1870.anInt5730 == 1 || local1870.anInt5730 == 10) {
										local1870.anInt5734 = Static127.aClass4_Sub11_Sub1_3.method3401();
										Static127.aClass4_Sub11_Sub1_3.anInt3768 += 5;
									} else if (local1870.anInt5730 >= 2 && local1870.anInt5730 <= 6) {
										if (local1870.anInt5730 == 2) {
											local1870.anInt5729 = 64;
											local1870.anInt5738 = 64;
										}
										if (local1870.anInt5730 == 3) {
											local1870.anInt5729 = 0;
											local1870.anInt5738 = 64;
										}
										if (local1870.anInt5730 == 4) {
											local1870.anInt5729 = 128;
											local1870.anInt5738 = 64;
										}
										if (local1870.anInt5730 == 5) {
											local1870.anInt5729 = 64;
											local1870.anInt5738 = 0;
										}
										if (local1870.anInt5730 == 6) {
											local1870.anInt5729 = 64;
											local1870.anInt5738 = 128;
										}
										local1870.anInt5730 = 2;
										local1870.anInt5735 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local1870.anInt5739 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local1870.anInt5731 = Static127.aClass4_Sub11_Sub1_3.method3440();
										local1870.anInt5737 = Static127.aClass4_Sub11_Sub1_3.method3401();
									}
									local1870.anInt5732 = Static127.aClass4_Sub11_Sub1_3.method3401();
									if (local1870.anInt5732 == 65535) {
										local1870.anInt5732 = -1;
									}
									Static116.aClass187Array1[local233] = local1870;
								}
								Static229.anInt4619 = -1;
								return true;
							} else {
								@Pc(2031) boolean local2031;
								@Pc(2267) int local2267;
								@Pc(2049) String local2049;
								@Pc(2228) int local2228;
								@Pc(2285) String local2285;
								@Pc(2321) String local2321;
								@Pc(2303) String local2303;
								if (Static229.anInt4619 == 117) {
									local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
									local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
									local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
									local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
									local252 = Static127.aClass4_Sub11_Sub1_3.method3440();
									local2049 = "";
									local1304 = false;
									if (local248 > 0) {
										local2049 = Static127.aClass4_Sub11_Sub1_3.method3446();
										local1304 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
									}
									for (local1456 = 0; local1456 < Static202.anInt4162; local1456++) {
										if (local2031) {
											if (local1219.equals(Static73.aStringArray21[local1456])) {
												Static73.aStringArray21[local1456] = local149;
												Static345.aStringArray86[local1456] = local1219;
												local149 = null;
												break;
											}
										} else if (local149.equals(Static73.aStringArray21[local1456])) {
											if (Static256.anIntArray425[local1456] != local248) {
												Static256.anIntArray425[local1456] = local248;
												if (local248 > 0) {
													Static69.method1646("", 5, 0, local149 + Static33.aClass159_53.method4311(Static180.anInt3835), "");
												}
												if (local248 == 0) {
													Static69.method1646("", 5, 0, local149 + Static101.aClass159_373.method4311(Static180.anInt3835), "");
												}
											}
											Static345.aStringArray86[local1456] = local1219;
											Static107.aStringArray80[local1456] = local2049;
											Static202.anIntArray348[local1456] = local252;
											Static316.aBooleanArray27[local1456] = local1304;
											local149 = null;
											break;
										}
									}
									if (local149 != null && Static202.anInt4162 < 200) {
										Static73.aStringArray21[Static202.anInt4162] = local149;
										Static345.aStringArray86[Static202.anInt4162] = local1219;
										Static256.anIntArray425[Static202.anInt4162] = local248;
										Static107.aStringArray80[Static202.anInt4162] = local2049;
										Static202.anIntArray348[Static202.anInt4162] = local252;
										Static316.aBooleanArray27[Static202.anInt4162] = local1304;
										Static202.anInt4162++;
									}
									Static254.anInt2746 = Static66.anInt1751;
									local1338 = Static202.anInt4162;
									while (local1338 > 0) {
										@Pc(2225) boolean local2225 = true;
										local1338--;
										for (local2228 = 0; local2228 < local1338; local2228++) {
											if (Static215.anInt4413 != Static256.anIntArray425[local2228] && Static256.anIntArray425[local2228 + 1] == Static215.anInt4413 || Static256.anIntArray425[local2228] == 0 && Static256.anIntArray425[local2228 + 1] != 0) {
												local2267 = Static256.anIntArray425[local2228];
												Static256.anIntArray425[local2228] = Static256.anIntArray425[local2228 + 1];
												Static256.anIntArray425[local2228 + 1] = local2267;
												local2285 = Static107.aStringArray80[local2228];
												Static107.aStringArray80[local2228] = Static107.aStringArray80[local2228 + 1];
												Static107.aStringArray80[local2228 + 1] = local2285;
												local2303 = Static73.aStringArray21[local2228];
												Static73.aStringArray21[local2228] = Static73.aStringArray21[local2228 + 1];
												Static73.aStringArray21[local2228 + 1] = local2303;
												local2321 = Static345.aStringArray86[local2228];
												Static345.aStringArray86[local2228] = Static345.aStringArray86[local2228 + 1];
												Static345.aStringArray86[local2228 + 1] = local2321;
												@Pc(2339) int local2339 = Static202.anIntArray348[local2228];
												Static202.anIntArray348[local2228] = Static202.anIntArray348[local2228 + 1];
												Static202.anIntArray348[local2228 + 1] = local2339;
												@Pc(2357) boolean local2357 = Static316.aBooleanArray27[local2228];
												Static316.aBooleanArray27[local2228] = Static316.aBooleanArray27[local2228 + 1];
												local2225 = false;
												Static316.aBooleanArray27[local2228 + 1] = local2357;
											}
										}
										if (local2225) {
											break;
										}
									}
									Static229.anInt4619 = -1;
									return true;
								} else if (Static229.anInt4619 == 20) {
									Static258.anInt5208 = Static127.aClass4_Sub11_Sub1_3.method3415() * 30;
									Static248.anInt5059 = Static66.anInt1751;
									Static229.anInt4619 = -1;
									return true;
								} else if (Static229.anInt4619 == 64) {
									local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
									local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
									local237 = Static127.aClass4_Sub11_Sub1_3.method3440();
									local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
									local252 = Static127.aClass4_Sub11_Sub1_3.method3440();
									local263 = Static127.aClass4_Sub11_Sub1_3.method3440();
									if (Static272.method4652(local179)) {
										Static108.method2354(local233, local263, local237, local248, local252);
									}
									Static229.anInt4619 = -1;
									return true;
								} else if (Static229.anInt4619 == 232) {
									Static183.method3521();
									Static229.anInt4619 = -1;
									return true;
								} else if (Static229.anInt4619 == 50) {
									Static96.method5420(Static127.aClass4_Sub11_Sub1_3.method3446());
									Static229.anInt4619 = -1;
									return true;
								} else if (Static229.anInt4619 == 61) {
									local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
									if (local179 == 65535) {
										local179 = -1;
									}
									local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
									local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
									local248 = Static127.aClass4_Sub11_Sub1_3.method3440();
									Static24.method403(local237, local248, local233, local179);
									Static229.anInt4619 = -1;
									return true;
								} else {
									@Pc(2538) long local2538;
									@Pc(2543) long local2543;
									if (Static229.anInt4619 == 218) {
										local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
										local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
										local1219 = local149;
										if (local2031) {
											local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
										}
										local2538 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local2543 = Static127.aClass4_Sub11_Sub1_3.method3442();
										local1456 = Static127.aClass4_Sub11_Sub1_3.method3440();
										local1714 = Static127.aClass4_Sub11_Sub1_3.method3401();
										@Pc(2557) long local2557 = (local2538 << 32) + local2543;
										@Pc(2559) boolean local2559 = false;
										@Pc(2561) int local2561 = 0;
										while (true) {
											if (local2561 >= 100) {
												if (local1456 <= 1 && Static343.method5479(local1219)) {
													local2559 = true;
												}
												break;
											}
											if (Static319.aLongArray8[local2561] == local2557) {
												local2559 = true;
												break;
											}
											local2561++;
										}
										if (!local2559 && Static234.anInt4720 == 0) {
											Static319.aLongArray8[Static133.anInt3106] = local2557;
											Static133.anInt3106 = (Static133.anInt3106 + 1) % 100;
											local2285 = Static318.method5246(local1714).method4699(Static127.aClass4_Sub11_Sub1_3);
											if (local1456 == 2) {
												Static271.method4637(18, null, local2285, "<img=1>" + local1219, local1714, "<img=1>" + local149, 0);
											} else if (local1456 == 1) {
												Static271.method4637(18, null, local2285, "<img=0>" + local1219, local1714, "<img=0>" + local149, 0);
											} else {
												Static271.method4637(18, null, local2285, local1219, local1714, local149, 0);
											}
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 193) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
										if (Static272.method4652(local179)) {
											Static189.method3599(2047, 0, 5, local233);
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 5) {
										Static249.anInt5064 = Static127.aClass4_Sub11_Sub1_3.method3440();
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 146) {
										anInt1161 = Static127.aClass4_Sub11_Sub1_3.method3413();
										Static122.anInt2887 = Static127.aClass4_Sub11_Sub1_3.method3440();
										for (@Pc(2735) Class4_Sub19 local2735 = (Class4_Sub19) Static165.aClass43_20.method1283(); local2735 != null; local2735 = (Class4_Sub19) Static165.aClass43_20.method1278()) {
											local233 = (int) (local2735.aLong223 & 0x3FFFL);
											local237 = (int) (local2735.aLong223 >> 14 & 0x3FFFL);
											local248 = (int) (local2735.aLong223 >> 28 & 0x3L);
											if (Static12.anInt267 == local248 && anInt1161 <= local233 && local233 < anInt1161 + 8 && local237 >= Static122.anInt2887 && Static122.anInt2887 + 8 > local237) {
												local2735.method5687();
												Static253.method4460(Static12.anInt267, local233, local237);
											}
										}
										for (@Pc(2806) Class4_Sub32 local2806 = (Class4_Sub32) Static82.aClass116_11.method3270(); local2806 != null; local2806 = (Class4_Sub32) Static82.aClass116_11.method3272()) {
											if (anInt1161 <= local2806.anInt4726 && anInt1161 + 8 > local2806.anInt4726 && Static122.anInt2887 <= local2806.anInt4722 && Static122.anInt2887 + 8 > local2806.anInt4722 && Static12.anInt267 == local2806.anInt4721) {
												local2806.anInt4728 = 0;
											}
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 70) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3417();
										local237 = Static127.aClass4_Sub11_Sub1_3.method3415();
										if (Static272.method4652(local179)) {
											Static48.method960(local237, local233);
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 255) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3451();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
										if (local233 == 65535) {
											local233 = -1;
										}
										Static252.method4452(local233, local179);
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 43) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3442();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
										if (local233 == 65535) {
											local233 = -1;
										}
										local237 = Static127.aClass4_Sub11_Sub1_3.method3451();
										Static24.method402(local237, local233, local179);
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 12) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
										@Pc(2963) Object[] local2963 = new Object[local149.length() + 1];
										for (local248 = local149.length() - 1; local248 >= 0; local248--) {
											if (local149.charAt(local248) == 's') {
												local2963[local248 + 1] = Static127.aClass4_Sub11_Sub1_3.method3446();
											} else {
												local2963[local248 + 1] = Integer.valueOf(Static127.aClass4_Sub11_Sub1_3.method3418());
											}
										}
										local2963[0] = Integer.valueOf(Static127.aClass4_Sub11_Sub1_3.method3418());
										if (Static272.method4652(local179)) {
											@Pc(3018) Class4_Sub34 local3018 = new Class4_Sub34();
											local3018.anObjectArray34 = local2963;
											Static164.method3189(local3018);
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 72) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
										local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local248 = Static127.aClass4_Sub11_Sub1_3.method3415();
										local252 = Static127.aClass4_Sub11_Sub1_3.method3415();
										if (Static272.method4652(local248)) {
											Static3.method122(local237, local179, local252, local233);
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 27) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3420();
										local237 = Static127.aClass4_Sub11_Sub1_3.method3412();
										local248 = Static127.aClass4_Sub11_Sub1_3.method3460();
										if (Static272.method4652(local179)) {
											Static83.method2099(local233, (local237 << 16) + local248);
										}
										Static229.anInt4619 = -1;
										return true;
									} else if (Static229.anInt4619 == 25) {
										local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
										local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
										if (Static272.method4652(local179) && Static271.aClass21ArrayArray1[local233] != null) {
											for (local252 = local237; local252 < local248; local252++) {
												local263 = Static127.aClass4_Sub11_Sub1_3.method3442();
												if (Static271.aClass21ArrayArray1[local233].length > local252 && Static271.aClass21ArrayArray1[local233][local252] != null) {
													Static271.aClass21ArrayArray1[local233][local252].anInt721 = local263;
												}
											}
										}
										Static229.anInt4619 = -1;
										return true;
									} else {
										@Pc(3211) long local3211;
										if (Static229.anInt4619 == 68) {
											local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
											local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
											local1219 = local149;
											if (local2031) {
												local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
											}
											local2538 = Static127.aClass4_Sub11_Sub1_3.method3407();
											local2543 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local3211 = Static127.aClass4_Sub11_Sub1_3.method3442();
											local1338 = Static127.aClass4_Sub11_Sub1_3.method3440();
											@Pc(3222) long local3222 = (local2543 << 32) + local3211;
											@Pc(3224) boolean local3224 = false;
											@Pc(3226) int local3226 = 0;
											while (true) {
												if (local3226 >= 100) {
													if (local1338 <= 1) {
														if (Static230.aBoolean459 && !Static321.aBoolean363 || Static162.aBoolean273) {
															local3224 = true;
														} else if (Static343.method5479(local1219)) {
															local3224 = true;
														}
													}
													break;
												}
												if (Static319.aLongArray8[local3226] == local3222) {
													local3224 = true;
													break;
												}
												local3226++;
											}
											if (!local3224 && Static234.anInt4720 == 0) {
												Static319.aLongArray8[Static133.anInt3106] = local3222;
												Static133.anInt3106 = (Static133.anInt3106 + 1) % 100;
												local2303 = Static341.method236(Static107.method5414(Static172.method3323(Static127.aClass4_Sub11_Sub1_3)));
												if (local1338 == 2 || local1338 == 3) {
													Static271.method4637(9, Static84.method2102(local2538), local2303, "<img=1>" + local1219, -1, "<img=1>" + local149, 0);
												} else if (local1338 == 1) {
													Static271.method4637(9, Static84.method2102(local2538), local2303, "<img=0>" + local1219, -1, "<img=0>" + local149, 0);
												} else {
													Static271.method4637(9, Static84.method2102(local2538), local2303, local1219, -1, local149, 0);
												}
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 144) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
											if (local179 == 65535) {
												local179 = -1;
											}
											local233 = Static127.aClass4_Sub11_Sub1_3.method3425();
											local237 = local233 >> 28 & 0x3;
											local248 = local233 >> 14 & 0x3FFF;
											local252 = local233 & 0x3FFF;
											local263 = Static127.aClass4_Sub11_Sub1_3.method3451();
											local969 = local263 >> 2;
											local1456 = local263 & 0x3;
											local1714 = Static217.anIntArray382[local969];
											local248 -= Static286.anInt6699;
											local252 -= Static136.anInt3193;
											Static291.method4883(local252, local969, local1456, local237, local179, local1714, local248);
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 71) {
											Static7.anInt189 = Static127.aClass4_Sub11_Sub1_3.method3440();
											Static248.anInt5059 = Static66.anInt1751;
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 38) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3403();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3420();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
											if (Static272.method4652(local237)) {
												Static263.method5704(local179, local233);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 14) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3453();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3460();
											if (Static272.method4652(local237)) {
												Static122.method2534(local233, local179);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 113) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
											if (local179 == 65535) {
												local179 = -1;
											}
											local233 = Static127.aClass4_Sub11_Sub1_3.method3460();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3415();
											local248 = Static127.aClass4_Sub11_Sub1_3.method3417();
											local252 = Static127.aClass4_Sub11_Sub1_3.method3412();
											if (local252 == 65535) {
												local252 = -1;
											}
											if (Static272.method4652(local237)) {
												for (local263 = local179; local263 <= local252; local263++) {
													local273 = (long) local263 + ((long) local248 << 32);
													local279 = (Class4_Sub12) Static33.aClass43_5.method1273(local273);
													if (local279 != null) {
														local288 = new Class4_Sub12(local279.anInt1386, local233);
														local279.method5687();
													} else if (local263 == -1) {
														local288 = new Class4_Sub12(Static92.method534(local248).aClass4_Sub12_1.anInt1386, local233);
													} else {
														local288 = new Class4_Sub12(0, local233);
													}
													Static33.aClass43_5.method1276(local288, local273);
												}
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 73) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3413();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3401();
											if (Static272.method4652(local179)) {
												if (local233 == 2) {
													Static76.method1752();
												}
												Static357.anInt6821 = local237;
												Static355.method5669(local237);
												Static196.method5556(false);
												Static164.method3191(Static357.anInt6821);
												for (local248 = 0; local248 < 100; local248++) {
													Static172.aBooleanArray19[local248] = true;
												}
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 191) {
											Static122.anInt2887 = Static127.aClass4_Sub11_Sub1_3.method3413();
											anInt1161 = Static127.aClass4_Sub11_Sub1_3.method3453();
											while (Static127.aClass4_Sub11_Sub1_3.anInt3768 < Static133.anInt3104) {
												Static229.anInt4619 = Static127.aClass4_Sub11_Sub1_3.method3440();
												Static122.method2531();
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 237) {
											Static127.anInt3000 = Static127.aClass4_Sub11_Sub1_3.method3440();
											Static157.anInt3360 = Static127.aClass4_Sub11_Sub1_3.method3440();
											Static307.anInt5956 = Static127.aClass4_Sub11_Sub1_3.method3440();
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 197) {
											local694 = Static127.aClass4_Sub11_Sub1_3.method3446();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3412();
											if (Static272.method4652(local237)) {
												Static48.method956(local233, local694);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 156) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3425();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3412();
											if (local233 == 65535) {
												local233 = -1;
											}
											local237 = Static127.aClass4_Sub11_Sub1_3.method3415();
											if (Static272.method4652(local237)) {
												Static35.method717(local233, local179);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 56) {
											Static155.anInt3335 = Static127.aClass4_Sub11_Sub1_3.method3447();
											Static229.anInt4619 = -1;
											Static248.anInt5059 = Static66.anInt1751;
											return true;
										} else if (Static229.anInt4619 == 60) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3440();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3440();
											local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local252 = Static127.aClass4_Sub11_Sub1_3.method3440();
											local263 = Static127.aClass4_Sub11_Sub1_3.method3440();
											if (Static272.method4652(local179)) {
												Static206.method3874(local252, local233, local248, local237, true, local263);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 110) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3418();
											local248 = Static127.aClass4_Sub11_Sub1_3.method3412();
											local252 = Static127.aClass4_Sub11_Sub1_3.method3460();
											if (Static272.method4652(local252)) {
												Static189.method3599(local233 | local179 << 16, local248, 7, local237);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 153) {
											for (local179 = 0; local179 < Static327.aClass8_Sub1_Sub2_Sub1Array1.length; local179++) {
												if (Static327.aClass8_Sub1_Sub2_Sub1Array1[local179] != null) {
													Static327.aClass8_Sub1_Sub2_Sub1Array1[local179].anInt4954 = -1;
												}
											}
											for (local233 = 0; local233 < Static169.aClass8_Sub1_Sub2_Sub2Array1.length; local233++) {
												if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local233] != null) {
													Static169.aClass8_Sub1_Sub2_Sub2Array1[local233].anInt4954 = -1;
												}
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 89) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3415();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3401();
											if (local233 == 65535) {
												local233 = -1;
											}
											local237 = Static127.aClass4_Sub11_Sub1_3.method3420();
											if (Static272.method4652(local179)) {
												Static189.method3599(local233, -1, 1, local237);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 162) {
											Static206.method3875();
											Static2.anInt57 += 32;
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 186) {
											local694 = Static127.aClass4_Sub11_Sub1_3.method3446();
											local149 = Static341.method236(Static107.method5414(Static172.method3323(Static127.aClass4_Sub11_Sub1_3)));
											Static69.method1646(local694, 6, 0, local149, local694);
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 79) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
											local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
											if (Static272.method4652(local233)) {
												Static48.method956(local179, local1219);
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 216) {
											Static240.method4266(true);
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 207) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
											if (Static272.method4652(local179)) {
												Static47.method955();
											}
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 239) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3425();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
											Static245.method4358(local179, local233);
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 223) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3413();
											local233 = Static127.aClass4_Sub11_Sub1_3.method3413();
											local237 = Static127.aClass4_Sub11_Sub1_3.method3413();
											Static12.anInt267 = local179 >> 1;
											Static158.aClass8_Sub1_Sub2_Sub1_1.method2084(Static12.anInt267, local233, (local179 & 0x1) == 1, local237);
											Static229.anInt4619 = -1;
											return true;
										} else if (Static229.anInt4619 == 134) {
											local179 = Static127.aClass4_Sub11_Sub1_3.method3418();
											Static265.aClass185_7 = Static1.aClass134_7.method3754(local179);
											Static229.anInt4619 = -1;
											return true;
										} else {
											@Pc(4207) String local4207;
											@Pc(4217) String local4217;
											if (Static229.anInt4619 == 4) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3440();
												@Pc(4197) boolean local4197 = (local179 & 0x1) == 1;
												local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local4207 = Static127.aClass4_Sub11_Sub1_3.method3446();
												if (local4207.equals("")) {
													local4207 = local1219;
												}
												local4217 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local2049 = Static127.aClass4_Sub11_Sub1_3.method3446();
												if (local2049.equals("")) {
													local2049 = local4217;
												}
												if (local4197) {
													for (local969 = 0; local969 < Static129.anInt3035; local969++) {
														if (Static332.aStringArray78[local969].equals(local2049)) {
															Static161.aStringArray39[local969] = local1219;
															Static332.aStringArray78[local969] = local4207;
															Static45.aStringArray11[local969] = local4217;
															Static292.aStringArray68[local969] = local2049;
															break;
														}
													}
												} else {
													Static161.aStringArray39[Static129.anInt3035] = local1219;
													Static332.aStringArray78[Static129.anInt3035] = local4207;
													Static45.aStringArray11[Static129.anInt3035] = local4217;
													Static292.aStringArray68[Static129.anInt3035] = local2049;
													Static113.aBooleanArray13[Static129.anInt3035] = (local179 & 0x2) == 2;
													Static129.anInt3035++;
												}
												Static229.anInt4619 = -1;
												Static254.anInt2746 = Static66.anInt1751;
												return true;
											}
											@Pc(4484) Class56 local4484;
											if (Static229.anInt4619 == 221) {
												Static1.anInt5230 = Static66.anInt1751;
												if (Static133.anInt3104 == 0) {
													Static66.aClass56Array1 = null;
													Static42.aString14 = null;
													Static229.anInt4619 = -1;
													Static351.anInt6666 = 0;
													Static5.aString28 = null;
													return true;
												}
												Static5.aString28 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
												if (local2031) {
													Static127.aClass4_Sub11_Sub1_3.method3446();
												}
												@Pc(4346) long local4346 = Static127.aClass4_Sub11_Sub1_3.method3407();
												Static42.aString14 = Static58.method1229(local4346);
												Static322.aByte32 = Static127.aClass4_Sub11_Sub1_3.method3426();
												local248 = Static127.aClass4_Sub11_Sub1_3.method3440();
												if (local248 == 255) {
													Static229.anInt4619 = -1;
													return true;
												}
												Static351.anInt6666 = local248;
												@Pc(4370) Class56[] local4370 = new Class56[100];
												for (local263 = 0; local263 < Static351.anInt6666; local263++) {
													local4370[local263] = new Class56();
													local4370[local263].aString18 = Static127.aClass4_Sub11_Sub1_3.method3446();
													local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
													if (local2031) {
														local4370[local263].aString16 = Static127.aClass4_Sub11_Sub1_3.method3446();
													} else {
														local4370[local263].aString16 = local4370[local263].aString18;
													}
													local4370[local263].anInt1948 = Static127.aClass4_Sub11_Sub1_3.method3401();
													local4370[local263].aByte16 = Static127.aClass4_Sub11_Sub1_3.method3426();
													local4370[local263].aString17 = Static127.aClass4_Sub11_Sub1_3.method3446();
													if (local4370[local263].aString16.equals(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24)) {
														Static295.aByte65 = local4370[local263].aByte16;
													}
												}
												local1714 = Static351.anInt6666;
												while (local1714 > 0) {
													local1304 = true;
													local1714--;
													for (local1338 = 0; local1338 < local1714; local1338++) {
														if (local4370[local1338].aString18.compareTo(local4370[local1338 + 1].aString18) > 0) {
															local4484 = local4370[local1338];
															local4370[local1338] = local4370[local1338 + 1];
															local4370[local1338 + 1] = local4484;
															local1304 = false;
														}
													}
													if (local1304) {
														break;
													}
												}
												Static229.anInt4619 = -1;
												Static66.aClass56Array1 = local4370;
												return true;
											} else if (Static229.anInt4619 == 208) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
												if (Static272.method4652(local179)) {
													@Pc(4543) Class4_Sub25 local4543 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local233);
													if (local4543 != null) {
														Static234.method4154(true, local4543, false);
													}
													if (Static16.aClass21_1 != null) {
														Static349.method5536(Static16.aClass21_1);
														Static16.aClass21_1 = null;
													}
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 115) {
												if (Static133.anInt3104 == 0) {
													Static333.aString63 = Static55.aClass159_80.method4311(Static180.anInt3835);
												} else {
													Static333.aString63 = Static127.aClass4_Sub11_Sub1_3.method3446();
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 135) {
												local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
												local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local1219 = local149;
												if (local2031) {
													local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
												}
												local2538 = Static127.aClass4_Sub11_Sub1_3.method3407();
												local2543 = Static127.aClass4_Sub11_Sub1_3.method3401();
												local3211 = Static127.aClass4_Sub11_Sub1_3.method3442();
												local1338 = Static127.aClass4_Sub11_Sub1_3.method3440();
												local2228 = Static127.aClass4_Sub11_Sub1_3.method3401();
												@Pc(4641) long local4641 = local3211 + (local2543 << 32);
												@Pc(4643) boolean local4643 = false;
												@Pc(4645) int local4645 = 0;
												while (true) {
													if (local4645 >= 100) {
														if (local1338 <= 1 && Static343.method5479(local1219)) {
															local4643 = true;
														}
														break;
													}
													if (local4641 == Static319.aLongArray8[local4645]) {
														local4643 = true;
														break;
													}
													local4645++;
												}
												if (!local4643 && Static234.anInt4720 == 0) {
													Static319.aLongArray8[Static133.anInt3106] = local4641;
													Static133.anInt3106 = (Static133.anInt3106 + 1) % 100;
													local2321 = Static318.method5246(local2228).method4699(Static127.aClass4_Sub11_Sub1_3);
													if (local1338 == 2) {
														Static271.method4637(20, Static84.method2102(local2538), local2321, "<img=1>" + local1219, local2228, "<img=1>" + local149, 0);
													} else if (local1338 == 1) {
														Static271.method4637(20, Static84.method2102(local2538), local2321, "<img=0>" + local1219, local2228, "<img=0>" + local149, 0);
													} else {
														Static271.method4637(20, Static84.method2102(local2538), local2321, local1219, local2228, local149, 0);
													}
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 206) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3420();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
												local237 = Static127.aClass4_Sub11_Sub1_3.method3447();
												local248 = Static127.aClass4_Sub11_Sub1_3.method3427();
												if (Static272.method4652(local233)) {
													Static319.method5251(local237, local179, local248);
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 94) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3425();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3460();
												if (Static272.method4652(local233)) {
													Static189.method3599(-1, -1, 3, local179);
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 101) {
												Static237.anInt6657 = Static127.aClass4_Sub11_Sub1_3.method3440();
												Static229.anInt4619 = -1;
												Static254.anInt2746 = Static66.anInt1751;
												return true;
											} else if (Static229.anInt4619 == 109) {
												local694 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local940 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
												if (local940) {
													local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
												} else {
													local149 = local694;
												}
												local248 = Static127.aClass4_Sub11_Sub1_3.method3401();
												@Pc(4874) byte local4874 = Static127.aClass4_Sub11_Sub1_3.method3426();
												@Pc(4876) boolean local4876 = false;
												if (local4874 == -128) {
													local4876 = true;
												}
												if (local4876) {
													if (Static351.anInt6666 == 0) {
														Static229.anInt4619 = -1;
														return true;
													}
													for (local969 = 0; local969 < Static351.anInt6666 && (!Static66.aClass56Array1[local969].aString16.equals(local149) || Static66.aClass56Array1[local969].anInt1948 != local248); local969++) {
													}
													if (Static351.anInt6666 > local969) {
														while (local969 < Static351.anInt6666 - 1) {
															Static66.aClass56Array1[local969] = Static66.aClass56Array1[local969 + 1];
															local969++;
														}
														Static351.anInt6666--;
														Static66.aClass56Array1[Static351.anInt6666] = null;
													}
												} else {
													@Pc(4964) String local4964 = Static127.aClass4_Sub11_Sub1_3.method3446();
													local4484 = new Class56();
													local4484.aString16 = local149;
													local4484.aString17 = local4964;
													local4484.aString18 = local694;
													local4484.anInt1948 = local248;
													local4484.aByte16 = local4874;
													for (local1714 = Static351.anInt6666 - 1; local1714 >= 0; local1714--) {
														local1338 = Static66.aClass56Array1[local1714].aString16.compareTo(local4484.aString16);
														if (local1338 == 0) {
															Static66.aClass56Array1[local1714].anInt1948 = local248;
															Static66.aClass56Array1[local1714].aByte16 = local4874;
															Static66.aClass56Array1[local1714].aString17 = local4964;
															if (local149.equals(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24)) {
																Static295.aByte65 = local4874;
															}
															Static229.anInt4619 = -1;
															Static1.anInt5230 = Static66.anInt1751;
															return true;
														}
														if (local1338 < 0) {
															break;
														}
													}
													if (Static351.anInt6666 >= Static66.aClass56Array1.length) {
														Static229.anInt4619 = -1;
														return true;
													}
													for (local1338 = Static351.anInt6666 - 1; local1338 > local1714; local1338--) {
														Static66.aClass56Array1[local1338 + 1] = Static66.aClass56Array1[local1338];
													}
													if (Static351.anInt6666 == 0) {
														Static66.aClass56Array1 = new Class56[100];
													}
													Static66.aClass56Array1[local1714 + 1] = local4484;
													Static351.anInt6666++;
													if (local149.equals(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24)) {
														Static295.aByte65 = local4874;
													}
												}
												Static1.anInt5230 = Static66.anInt1751;
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 104) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3420();
												local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
												if (Static272.method4652(local179)) {
													Static263.method5691(local1219, local233);
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 6) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3453();
												local940 = (local233 & 0x1) == 1;
												Static319.method5253(local179, local940);
												Static29.anIntArray30[Static278.anInt6682++ & 0x1F] = local179;
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 139 || Static229.anInt4619 == 106 || Static229.anInt4619 == 177 || Static229.anInt4619 == 214 || Static229.anInt4619 == 55 || Static229.anInt4619 == 155 || Static229.anInt4619 == 67 || Static229.anInt4619 == 130 || Static229.anInt4619 == 188 || Static229.anInt4619 == 225 || Static229.anInt4619 == 62 || Static229.anInt4619 == 160 || Static229.anInt4619 == 13 || Static229.anInt4619 == 111 || Static229.anInt4619 == 165) {
												Static122.method2531();
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 107) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3457();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3418();
												local237 = Static127.aClass4_Sub11_Sub1_3.method3440();
												local4207 = "";
												local4217 = local4207;
												if ((local237 & 0x1) != 0) {
													local4207 = Static127.aClass4_Sub11_Sub1_3.method3446();
													if ((local237 & 0x2) == 0) {
														local4217 = local4207;
													} else {
														local4217 = Static127.aClass4_Sub11_Sub1_3.method3446();
													}
												}
												local2049 = Static127.aClass4_Sub11_Sub1_3.method3446();
												if (local179 == 99) {
													Static224.method4040(local2049);
												} else if (local4217.equals("") || !Static343.method5479(local4217)) {
													Static69.method1646(local4217, local179, local233, local2049, local4207);
												} else {
													Static229.anInt4619 = -1;
													return true;
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 105) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3451();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3412();
												if (Static272.method4652(local233)) {
													Static317.anInt6159 = local179;
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 59) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3412();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3415();
												local237 = Static127.aClass4_Sub11_Sub1_3.method3415();
												if (Static272.method4652(local233)) {
													Static161.method3160(local179, local237);
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 54) {
												if (Static357.anInt6821 != -1) {
													Static318.method5242(0, Static357.anInt6821);
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 195) {
												local2031 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
												local149 = Static127.aClass4_Sub11_Sub1_3.method3446();
												local1219 = local149;
												if (local2031) {
													local1219 = Static127.aClass4_Sub11_Sub1_3.method3446();
												}
												local2538 = Static127.aClass4_Sub11_Sub1_3.method3401();
												local2543 = Static127.aClass4_Sub11_Sub1_3.method3442();
												local1456 = Static127.aClass4_Sub11_Sub1_3.method3440();
												@Pc(5442) long local5442 = (local2538 << 32) + local2543;
												@Pc(5444) boolean local5444 = false;
												local2267 = 0;
												while (true) {
													if (local2267 >= 100) {
														if (local1456 <= 1) {
															if (Static230.aBoolean459 && !Static321.aBoolean363 || Static162.aBoolean273) {
																local5444 = true;
															} else if (Static343.method5479(local1219)) {
																local5444 = true;
															}
														}
														break;
													}
													if (Static319.aLongArray8[local2267] == local5442) {
														local5444 = true;
														break;
													}
													local2267++;
												}
												if (!local5444 && Static234.anInt4720 == 0) {
													Static319.aLongArray8[Static133.anInt3106] = local5442;
													Static133.anInt3106 = (Static133.anInt3106 + 1) % 100;
													@Pc(5513) String local5513 = Static341.method236(Static107.method5414(Static172.method3323(Static127.aClass4_Sub11_Sub1_3)));
													if (local1456 == 2) {
														Static271.method4637(7, null, local5513, "<img=1>" + local1219, -1, "<img=1>" + local149, 0);
													} else if (local1456 == 1) {
														Static271.method4637(7, null, local5513, "<img=0>" + local1219, -1, "<img=0>" + local149, 0);
													} else {
														Static271.method4637(3, null, local5513, local1219, -1, local149, 0);
													}
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 124) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3440();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3425();
												local237 = Static127.aClass4_Sub11_Sub1_3.method3451();
												Static213.anIntArray381[local179] = local233;
												Static294.anIntArray456[local179] = local237;
												Static29.anIntArray29[local179] = 1;
												local248 = Static339.anIntArray3[local179] - 1;
												for (local252 = 0; local252 < local248; local252++) {
													if (Class64.anIntArray204[local252] <= local233) {
														Static29.anIntArray29[local179] = local252 + 2;
													}
												}
												Static204.anIntArray364[Static305.anInt6787++ & 0x1F] = local179;
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 42) {
												Static232.method4122();
												Static229.anInt4619 = -1;
												return false;
											} else if (Static229.anInt4619 == 169) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3401();
												if (Static272.method4652(local179)) {
													Static146.method2546();
												}
												Static229.anInt4619 = -1;
												return true;
											} else if (Static229.anInt4619 == 236) {
												local179 = Static127.aClass4_Sub11_Sub1_3.method3460();
												local233 = Static127.aClass4_Sub11_Sub1_3.method3417();
												local237 = Static127.aClass4_Sub11_Sub1_3.method3415();
												if (Static272.method4652(local237)) {
													Static215.method3921(local179, local233);
												}
												Static229.anInt4619 = -1;
												return true;
											} else {
												Static289.method4874("T1 - " + Static229.anInt4619 + "," + Static205.anInt4305 + "," + Static209.anInt4334 + " - " + Static133.anInt3104, null);
												Static232.method4122();
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

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
	public static void method869(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			Static139.aByteArrayArrayArray10 = null;
		}
		Static253.anInt5160 = 99;
		Static67.aByteArrayArrayArray4 = new byte[arg0][Static350.anInt6637][Static105.anInt2647];
		Static290.anIntArray455 = new int[Static105.anInt2647];
		Static222.anIntArray386 = new int[Static105.anInt2647];
		Static72.aByteArrayArrayArray5 = new byte[arg0][Static350.anInt6637 + 1][Static105.anInt2647 + 1];
		Static76.anIntArray115 = new int[5];
		Static338.anIntArrayArrayArray40 = new int[arg0][Static350.anInt6637 + 1][Static105.anInt2647 + 1];
		Static319.anIntArray483 = new int[Static105.anInt2647];
		Static80.aByteArrayArrayArray6 = new byte[arg0][Static350.anInt6637][Static105.anInt2647];
		Static353.aByteArrayArrayArray9 = new byte[arg0][Static350.anInt6637][Static105.anInt2647];
		Static251.aByteArrayArrayArray12 = new byte[arg0][Static350.anInt6637][Static105.anInt2647];
		Static116.anIntArray240 = new int[Static105.anInt2647];
		Static181.anIntArray325 = new int[Static105.anInt2647];
	}

	@OriginalMember(owner = "client!ar", name = "providesignlink", descriptor = "(Lclient!ml;)V")
	private static void method870(@OriginalArg(0) Class134 arg0) {
		Static1.aClass134_7 = arg0;
		Static230.aClass134_8 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)Z")
	public static boolean method871(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static346.anInt6569; local1 < Static327.anInt6252; local1++) {
			@Pc(6) Class128[][] local6 = Static273.aClass128ArrayArrayArray4[local1];
			for (@Pc(9) int local9 = -Static328.anInt6272; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static61.anInt1578 + local9;
				@Pc(18) int local18 = Static61.anInt1578 - local9;
				if (local14 >= Static22.anInt442 || local18 < Static17.anInt349) {
					for (@Pc(27) int local27 = -Static328.anInt6272; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static246.anInt5043 + local27;
						@Pc(36) int local36 = Static246.anInt5043 - local27;
						@Pc(48) Class128 local48;
						if (local14 >= Static22.anInt442) {
							if (local32 >= Static342.anInt6527) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean309) {
									Static122.aBoolean207 = arg0;
									Static57.aClass45_1.method3941(local48);
									Static57.aClass45_1.method3950();
								}
							}
							if (local36 < Static91.anInt5895) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean309) {
									Static122.aBoolean207 = arg0;
									Static57.aClass45_1.method3941(local48);
									Static57.aClass45_1.method3950();
								}
							}
						}
						if (local18 < Static17.anInt349) {
							if (local32 >= Static342.anInt6527) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean309) {
									Static122.aBoolean207 = arg0;
									Static57.aClass45_1.method3941(local48);
									Static57.aClass45_1.method3950();
								}
							}
							if (local36 < Static91.anInt5895) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean309) {
									Static122.aBoolean207 = arg0;
									Static57.aClass45_1.method3941(local48);
									Static57.aClass45_1.method3950();
								}
							}
						}
						if (Static189.anInt3960 == 0) {
							if (Static308.aBoolean444) {
								Static57.aClass45_1.method3951(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!fa;I)V")
	public static void method873(@OriginalArg(0) Class8_Sub1_Sub2_Sub1 arg0) {
		@Pc(17) Class4_Sub29 local17 = (Class4_Sub29) Static74.aClass43_11.method1273((long) arg0.anInt4916);
		if (local17 == null) {
			Static312.method5146(arg0.anIntArray416[0], null, Static12.anInt267, null, arg0, 0, arg0.anIntArray415[0]);
		} else {
			local17.method3871();
		}
	}
}
