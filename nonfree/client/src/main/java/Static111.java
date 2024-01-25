import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Lclient!tf;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public static int anInt2269;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "Z")
	public static boolean aBoolean191;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_18 = new Class195();

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	public static int anInt2268 = 1;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "[S")
	public static short[] aShortArray42 = new short[256];

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "[Lclient!f;")
	public static final Class56_Sub1[] aClass56_Sub1Array1 = new Class56_Sub1[29];

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	public static int anInt2271 = 0;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
	public static int anInt2273 = -1;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = null;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)V")
	public static void method2066() {
		@Pc(5) Class140 local5 = Static69.aClass140_39;
		synchronized (Static69.aClass140_39) {
			Static69.aClass140_39.method3813();
		}
		local5 = Static102.aClass140_59;
		synchronized (Static102.aClass140_59) {
			Static102.aClass140_59.method3813();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!aa;[[BI[[IIILclient!sm;[[B[[BLclient!sm;[[BZ)V")
	public static void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class41 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class41 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) boolean arg11) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(25) int local25 = local7 >= arg0 - 1 ? local7 : local7 + 1;
			for (@Pc(27) int local27 = 0; local27 < arg5; local27++) {
				@Pc(40) int local40 = local27 >= arg5 - 1 ? local27 : local27 + 1;
				if (Static123.method2195() || Static350.method5668(Static47.anInt1095, local7, arg4, local27)) {
					@Pc(54) boolean local54 = false;
					@Pc(56) boolean local56 = false;
					@Pc(59) boolean[] local59 = new boolean[4];
					@Pc(65) int local65 = arg7[local7][local27];
					@Pc(71) int local71 = arg2[local7][local27];
					@Pc(79) int local79 = arg8[local7][local27] & 0xFF;
					@Pc(87) int local87 = arg10[local7][local27] & 0xFF;
					@Pc(95) int local95 = arg10[local7][local40] & 0xFF;
					@Pc(103) int local103 = arg10[local25][local40] & 0xFF;
					@Pc(111) int local111 = arg10[local25][local27] & 0xFF;
					if (local79 != 0 || local87 != 0) {
						@Pc(131) Class199 local131 = local79 == 0 ? null : Static340.method3663(local79 - 1);
						if (local65 == 0 && local131 == null) {
							local65 = 12;
						}
						@Pc(150) Class9 local150 = local87 == 0 ? null : Static33.method873(local87 - 1);
						@Pc(152) Class199 local152 = local131;
						if (local131 != null) {
							if (local131.anInt5865 == -1 && local131.anInt5853 == -1) {
								local152 = local131;
								local131 = null;
							} else if (local150 != null && local65 != 0) {
								local56 = local131.aBoolean513;
							}
						}
						@Pc(267) int local267;
						@Pc(286) int local286;
						@Pc(351) int local351;
						@Pc(364) int local364;
						if ((local65 == 0 || local65 == 12) && local7 > 0 && local27 > 0 && local7 < arg0 && arg5 > local27) {
							@Pc(231) int local231 = local87 == arg10[local25][local27 - 1] ? 1 : -1;
							@Pc(248) int local248 = local87 == arg10[local25][local40] ? 1 : -1;
							local267 = arg10[local7 - 1][local27 - 1] == local87 ? 1 : -1;
							local286 = local87 == arg10[local7 - 1][local40] ? 1 : -1;
							if (local87 == arg10[local7][local27 - 1]) {
								local231++;
								local267++;
							} else {
								local267--;
								local231--;
							}
							if (local87 == arg10[local25][local27]) {
								local248++;
								local231++;
							} else {
								local248--;
								local231--;
							}
							if (local87 == arg10[local7][local40]) {
								local286++;
								local248++;
							} else {
								local248--;
								local286--;
							}
							if (arg10[local7 - 1][local27] == local87) {
								local286++;
								local267++;
							} else {
								local286--;
								local267--;
							}
							local351 = local267 - local248;
							if (local351 < 0) {
								local351 = -local351;
							}
							local364 = local231 - local286;
							if (local364 < 0) {
								local364 = -local364;
							}
							if (local364 == local351) {
								local351 = arg6.method5434(local7, local27) - arg6.method5434(local25, local40);
								local364 = arg6.method5434(local25, local27) - arg6.method5434(local7, local40);
								if (local351 < 0) {
									local351 = -local351;
								}
								if (local364 < 0) {
									local364 = -local364;
								}
							}
							local71 = local364 > local351 ? 1 : 0;
						}
						for (local267 = 0; local267 < 13; local267++) {
							Static221.anIntArray557[local267] = -1;
							Static251.anIntArray807[local267] = 1;
						}
						@Pc(449) boolean[] local449 = local131 != null && local131.aBoolean513 ? Static251.aBooleanArrayArray24[local65] : Static262.aBooleanArrayArray20[local65];
						Static34.method901(local150, local27, local65, local131, arg2, arg7, arg1, arg0, local71, local7, arg5, arg8, local59);
						@Pc(479) boolean local479 = local131 != null && local131.anInt5853 != local131.anInt5865;
						if (!local479) {
							for (local286 = 0; local286 < 8; local286++) {
								if (Static221.anIntArray557[local286] >= 0 && Static253.anIntArray631[local286] != Static269.anIntArray657[local286]) {
									local479 = true;
									break;
								}
							}
						}
						if (!local449[local71 + 1 & 0x3]) {
							local59[1] = Static181.method3550(local59[1], (Static251.anIntArray807[2] & Static251.anIntArray807[4]) == 0);
						}
						if (!local449[local71 + 3 & 0x3]) {
							local59[3] = Static181.method3550(local59[3], (Static251.anIntArray807[0] & Static251.anIntArray807[6]) == 0);
						}
						if (!local449[--local71 & 0x3]) {
							local59[0] = Static181.method3550(local59[0], (Static251.anIntArray807[0] & Static251.anIntArray807[2]) == 0);
						}
						if (!local449[local71 + 2 & 0x3]) {
							local59[2] = Static181.method3550(local59[2], (Static251.anIntArray807[6] & Static251.anIntArray807[4]) == 0);
						}
						if (!local56 && (local65 == 0 || local65 == 12)) {
							if (local59[0] && !local59[1] && !local59[2] && local59[3]) {
								local59[0] = local59[3] = false;
								local65 = local65 == 0 ? 13 : 14;
								local71 = 0;
							} else if (local59[0] && local59[1] && !local59[2] && !local59[3]) {
								local71 = 3;
								local59[0] = local59[1] = false;
								local65 = local65 == 0 ? 13 : 14;
							} else if (!local59[0] && local59[1] && local59[2] && !local59[3]) {
								local65 = local65 == 0 ? 13 : 14;
								local59[1] = local59[2] = false;
								local71 = 2;
							} else if (!local59[0] && !local59[1] && local59[2] && local59[3]) {
								local59[2] = local59[3] = false;
								local65 = local65 == 0 ? 13 : 14;
								local71 = 1;
							}
						}
						@Pc(798) boolean local798 = !local56 && !local59[0] && !local59[2] && !local59[1] && !local59[3];
						@Pc(800) int[] local800 = null;
						@Pc(828) int[] local828;
						@Pc(836) int[] local836;
						@Pc(808) int[] local808;
						if (local798) {
							local808 = Static45.anIntArrayArray4[local65];
							local828 = Static299.anIntArrayArray59[local65];
							local351 = local150 == null ? 0 : Static307.anIntArray743[local65];
							local364 = local131 == null ? 0 : Static138.anIntArray326[local65];
							local836 = Static338.anIntArrayArray65[local65];
						} else if (local56) {
							local364 = local131 == null ? 0 : Static61.anIntArray151[local65];
							local808 = Static114.anIntArrayArray25[local65];
							local828 = Static162.anIntArrayArray30[local65];
							local800 = Static40.anIntArrayArray48[local65];
							local836 = Static156.anIntArrayArray28[local65];
							local351 = local150 == null ? 0 : Static62.anIntArray152[local65];
						} else {
							local808 = Static270.anIntArrayArray55[local65];
							local364 = local131 == null ? 0 : Static82.anIntArray193[local65];
							local351 = local150 == null ? 0 : Static165.anIntArray408[local65];
							local828 = Static75.anIntArrayArray10[local65];
							local800 = Static105.anIntArrayArray20[local65];
							local836 = Static163.anIntArrayArray31[local65];
						}
						@Pc(902) int local902 = local351 + local364;
						if (local902 <= 0) {
							Static148.method4534(arg4, local7, local27);
						} else {
							if (local59[0]) {
								local902++;
							}
							if (local59[2]) {
								local902++;
							}
							if (local59[1]) {
								local902++;
							}
							if (local59[3]) {
								local902++;
							}
							@Pc(935) int local935 = 0;
							@Pc(937) int local937 = 0;
							@Pc(941) int local941 = local902 * 3;
							@Pc(948) int[] local948 = arg11 ? new int[local941] : null;
							@Pc(955) int[] local955 = local479 ? new int[local941] : null;
							@Pc(958) int[] local958 = new int[local941];
							@Pc(961) int[] local961 = new int[local941];
							@Pc(964) int[] local964 = new int[local941];
							@Pc(967) int[] local967 = new int[local941];
							@Pc(970) int[] local970 = new int[local941];
							@Pc(972) int local972 = -1;
							@Pc(974) int local974 = -1;
							@Pc(976) int local976 = 256;
							@Pc(1093) byte local1093;
							@Pc(998) int local998;
							@Pc(1000) int local1000;
							@Pc(1240) int local1240;
							@Pc(1246) int local1246;
							@Pc(1254) int local1254;
							@Pc(1258) int local1258;
							@Pc(1262) int local1262;
							@Pc(1339) int local1339;
							@Pc(1347) int local1347;
							if (local131 != null) {
								local972 = local131.anInt5865;
								local974 = arg1.method3305() ? local131.anInt5861 : local131.anInt5857;
								local976 = local131.anInt5856;
								local998 = Static219.method3992(arg1, local131);
								for (local1000 = 0; local1000 < local364; local1000++) {
									if (local59[-local71 & 0x3] && local800[0] == local935) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 1;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 1;
										Static199.anIntArray480[4] = local836[local935];
										local1093 = 6;
										Static199.anIntArray480[5] = local808[local935];
									} else if (local59[2 - local71 & 0x3] && local935 == local800[2]) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 5;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 5;
										Static199.anIntArray480[4] = local836[local935];
										local1093 = 6;
										Static199.anIntArray480[5] = local808[local935];
									} else if (local59[1 - local71 & 0x3] && local800[1] == local935) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 3;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 3;
										Static199.anIntArray480[4] = local836[local935];
										Static199.anIntArray480[5] = local808[local935];
										local1093 = 6;
									} else if (local59[3 - local71 & 0x3] && local800[3] == local935) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 7;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 7;
										Static199.anIntArray480[4] = local836[local935];
										Static199.anIntArray480[5] = local808[local935];
										local1093 = 6;
									} else {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = local836[local935];
										Static199.anIntArray480[2] = local808[local935];
										local1093 = 3;
									}
									local935++;
									for (local1240 = 0; local1240 < local1093; local1240++) {
										local1246 = Static199.anIntArray480[local1240];
										local1254 = local1246 - local71 * 2 & 0x7;
										local1258 = Static193.anIntArray472[local1246];
										local1262 = Static102.anIntArray254[local1246];
										if (local71 == 1) {
											local958[local937] = local1262;
											local961[local937] = 128 - local1258;
										} else if (local71 == 2) {
											local958[local937] = 128 - local1258;
											local961[local937] = 128 - local1262;
										} else if (local71 == 3) {
											local958[local937] = 128 - local1262;
											local961[local937] = local1258;
										} else {
											local958[local937] = local1258;
											local961[local937] = local1262;
										}
										if (arg11 && Static100.aBooleanArrayArray11[local65][local1246]) {
											local1339 = (local7 << 7) + local958[local937];
											local1347 = local961[local937] + (local27 << 7);
											local948[local937] = arg9.method5433(local1339, local1347) - arg6.method5433(local1339, local1347);
										}
										if (local1246 < 8 && Static221.anIntArray557[local1254] > local131.anInt5862) {
											if (local955 != null) {
												local955[local937] = Static253.anIntArray631[local1254];
											}
											local970[local937] = Static312.anIntArray808[local1254];
											local967[local937] = Static299.anIntArray723[local1254];
											local964[local937] = Static269.anIntArray657[local1254];
										} else {
											if (local955 != null) {
												local955[local937] = local998;
											}
											local967[local937] = arg1.method3305() ? local131.anInt5861 : local131.anInt5857;
											local970[local937] = local131.anInt5856;
											local964[local937] = local972;
										}
										local937++;
									}
								}
								if (!arg11 && arg4 == 0) {
									Static82.method1590(local7, local27, local131.anInt5864, local131.anInt5859 * 8);
								}
								if (local65 != 12 && local131.anInt5865 != -1 && local131.aBoolean512) {
									local54 = true;
								}
							} else if (local798) {
								local935 = Static138.anIntArray326[local65];
							} else if (local56) {
								local935 = Static61.anIntArray151[local65];
							} else {
								local935 = Static82.anIntArray193[local65];
							}
							if (local150 != null) {
								if (local95 == 0) {
									local95 = local87;
								}
								if (local103 == 0) {
									local103 = local87;
								}
								if (local111 == 0) {
									local111 = local87;
								}
								@Pc(1516) Class9 local1516 = Static33.method873(local87 - 1);
								@Pc(1522) Class9 local1522 = Static33.method873(local95 - 1);
								@Pc(1528) Class9 local1528 = Static33.method873(local103 - 1);
								@Pc(1534) Class9 local1534 = Static33.method873(local111 - 1);
								for (local1254 = 0; local1254 < local351; local1254++) {
									if (local59[-local71 & 0x3] && local800[0] == local935) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 1;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 1;
										Static199.anIntArray480[4] = local836[local935];
										local1093 = 6;
										Static199.anIntArray480[5] = local808[local935];
									} else if (local59[2 - local71 & 0x3] && local935 == local800[2]) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 5;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 5;
										Static199.anIntArray480[4] = local836[local935];
										Static199.anIntArray480[5] = local808[local935];
										local1093 = 6;
									} else if (local59[1 - local71 & 0x3] && local935 == local800[1]) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 3;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 3;
										Static199.anIntArray480[4] = local836[local935];
										local1093 = 6;
										Static199.anIntArray480[5] = local808[local935];
									} else if (local59[3 - local71 & 0x3] && local935 == local800[3]) {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = 7;
										Static199.anIntArray480[2] = local808[local935];
										Static199.anIntArray480[3] = 7;
										Static199.anIntArray480[4] = local836[local935];
										local1093 = 6;
										Static199.anIntArray480[5] = local808[local935];
									} else {
										Static199.anIntArray480[0] = local828[local935];
										Static199.anIntArray480[1] = local836[local935];
										Static199.anIntArray480[2] = local808[local935];
										local1093 = 3;
									}
									for (local1258 = 0; local1258 < local1093; local1258++) {
										local1262 = Static199.anIntArray480[local1258];
										local1339 = local1262 - local71 * 2 & 0x7;
										local1347 = Static193.anIntArray472[local1262];
										@Pc(1785) int local1785 = Static102.anIntArray254[local1262];
										@Pc(1801) int local1801;
										@Pc(1796) int local1796;
										if (local71 == 1) {
											local1801 = local1785;
											local1796 = 128 - local1347;
										} else if (local71 == 2) {
											local1796 = 128 - local1785;
											local1801 = 128 - local1347;
										} else if (local71 == 3) {
											local1796 = local1347;
											local1801 = 128 - local1785;
										} else {
											local1801 = local1347;
											local1796 = local1785;
										}
										local958[local937] = local1801;
										local961[local937] = local1796;
										@Pc(1851) int local1851;
										@Pc(1858) int local1858;
										if (arg11 && Static100.aBooleanArrayArray11[local65][local1262]) {
											local1851 = (local7 << 7) + local1801;
											local1858 = (local27 << 7) + local1796;
											local948[local937] = arg9.method5433(local1851, local1858) - arg6.method5433(local1851, local1858);
										}
										if (local1262 < 8 && Static221.anIntArray557[local1339] >= 0) {
											if (local955 != null) {
												local955[local937] = Static253.anIntArray631[local1339];
											}
											local970[local937] = Static312.anIntArray808[local1339];
											local967[local937] = Static299.anIntArray723[local1339];
											local964[local937] = Static269.anIntArray657[local1339];
										} else {
											if (local56 && Static100.aBooleanArrayArray11[local65][local1262]) {
												local967[local937] = local974;
												local970[local937] = local976;
												local964[local937] = local972;
											} else if (local1801 == 0 && local1796 == 0) {
												local964[local937] = arg3[local7][local27];
												local967[local937] = local1516.anInt235;
												local970[local937] = local1516.anInt238;
											} else if (local1801 == 0 && local1796 == 128) {
												local964[local937] = arg3[local7][local40];
												local967[local937] = local1522.anInt235;
												local970[local937] = local1522.anInt238;
											} else if (local1801 == 128 && local1796 == 128) {
												local964[local937] = arg3[local25][local40];
												local967[local937] = local1528.anInt235;
												local970[local937] = local1528.anInt238;
											} else if (local1801 == 128 && local1796 == 0) {
												local964[local937] = arg3[local25][local27];
												local967[local937] = local1534.anInt235;
												local970[local937] = local1534.anInt238;
											} else {
												if (local1801 < 64) {
													if (local1796 >= 64) {
														local967[local937] = local1522.anInt235;
														local970[local937] = local1522.anInt238;
													} else {
														local967[local937] = local1516.anInt235;
														local970[local937] = local1516.anInt238;
													}
												} else if (local1796 < 64) {
													local967[local937] = local1534.anInt235;
													local970[local937] = local1534.anInt238;
												} else {
													local967[local937] = local1528.anInt235;
													local970[local937] = local1528.anInt238;
												}
												local1851 = Static78.method1538(arg3[local25][local27], local1801 << 7 >> 7, arg3[local7][local27]);
												local1858 = Static78.method1538(arg3[local25][local40], local1801 << 7 >> 7, arg3[local7][local40]);
												local964[local937] = Static78.method1538(local1858, local1796 << 7 >> 7, local1851);
											}
											if (local955 != null) {
												local955[local937] = local964[local937];
											}
										}
										local937++;
									}
									local935++;
								}
								if (local65 != 0 && local150.aBoolean29) {
									local54 = true;
								}
							}
							local998 = arg6.method5434(local7, local27);
							local1000 = arg6.method5434(local25, local27);
							local1240 = arg6.method5434(local25, local40);
							local1246 = arg6.method5434(local7, local40);
							if (arg4 > 0) {
								@Pc(2208) boolean local2208 = true;
								if (local87 == 0 && local65 != 0) {
									local2208 = false;
								}
								if (local79 > 0 && local152 != null && !local152.aBoolean514) {
									local2208 = false;
								}
								if (local2208 && local1000 == local998 && local1240 == local998 && local998 == local1246) {
									Static337.aByteArrayArrayArray12[arg4][local7][local27] = (byte) (Static337.aByteArrayArrayArray12[arg4][local7][local27] | 0x4);
								}
							}
							local1254 = 0;
							local1258 = 0;
							if (arg11) {
								local1254 = Static125.method2398(local7, local27);
								local1258 = Static245.method4328(local7, local27);
							}
							arg6.method5420(local7, local27, local958, local948, local961, local964, local955, local967, local970, local1254, local1258, local54);
							Static148.method4534(arg4, local7, local27);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V")
	public static void method2068() {
		@Pc(5) Class140 local5 = Static99.aClass140_56;
		synchronized (Static99.aClass140_56) {
			Static99.aClass140_56.method3819();
		}
		local5 = Static259.aClass140_131;
		synchronized (Static259.aClass140_131) {
			Static259.aClass140_131.method3819();
		}
		@Pc(35) Class33 local35 = Static234.aClass33_1;
		synchronized (Static234.aClass33_1) {
			Static234.aClass33_1.method1155();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZB)V")
	public static void method2071(@OriginalArg(0) boolean arg0) {
		Static278.method4804();
		if (Static239.anInt4649 != 30 && Static239.anInt4649 != 25) {
			return;
		}
		Static331.anInt6346++;
		if (Static331.anInt6346 < 50 && !arg0) {
			return;
		}
		Static331.anInt6346 = 0;
		if (!Static335.aBoolean560 && Static153.aClass158_2 != null) {
			Static248.aClass1_Sub7_Sub1_2.method728(185);
			try {
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
			} catch (@Pc(58) IOException local58) {
				Static335.aBoolean560 = true;
			}
		}
		Static278.method4804();
	}
}
