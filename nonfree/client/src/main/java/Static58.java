import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_447 = Static8.method128("<col=ffb000>");

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_448 = Static8.method128("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
	public static int[] anIntArray140 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!ea;")
	private static Class18 aClass18_449 = Static8.method128("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "J")
	public static long aLong50 = 0L;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!ea;")
	private static Class18 aClass18_450 = Static8.method128("Unexpected server response)3");

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_451 = Static8.method128("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_452 = Static8.method128("mapmarker");

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_453 = aClass18_450;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "[I")
	public static int[] anIntArray141 = new int[5];

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!ea;")
	public static Class18 aClass18_454 = aClass18_449;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!ea;")
	public static Class18 aClass18_455 = Static8.method128("gleiten:");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method1195() {
		aClass18_453 = null;
		anIntArray140 = null;
		aClass18_449 = null;
		aClass18_448 = null;
		aClass18_447 = null;
		aBigInteger1 = null;
		aClass18_455 = null;
		aClass18_454 = null;
		anIntArray141 = null;
		aClass18_452 = null;
		aClass18_451 = null;
		aClass18_450 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1196(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static89.method1924(local13) : local13;
		} else if (arg1 instanceof Class34) {
			@Pc(27) Class34 local27 = (Class34) arg1;
			return local27.method1503();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIBI[Lclient!ef;)V")
	public static void method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20[] arg7) {
		for (@Pc(15) int local15 = 0; local15 < arg7.length; local15++) {
			@Pc(21) Class20 local21 = arg7[local15];
			if (local21 != null && (!local21.aBoolean44 || local21.anInt1213 == 0 || local21.aBoolean51 || Static36.method758(local21) != 0 || local21 == Static157.aClass20_12) && local21.anInt1233 == arg5 && (!local21.aBoolean44 || !Static137.method2606(local21))) {
				@Pc(58) int local58 = arg2 + local21.anInt1199;
				@Pc(64) int local64 = local21.anInt1248 + arg3;
				if (Static41.aClass20_4 == local21) {
					Static36.anInt1163 = local64;
					Static32.anInt1092 = local58;
					Static56.aBoolean87 = true;
				}
				@Pc(148) int local148;
				@Pc(141) int local141;
				@Pc(130) int local130;
				@Pc(160) int local160;
				@Pc(100) int local100;
				if (local21.anInt1213 == 2) {
					local160 = arg6;
					local141 = arg1;
					local130 = arg0;
					local148 = arg4;
				} else {
					@Pc(89) int local89;
					@Pc(87) int local87;
					if (local21.anInt1213 == 9) {
						local87 = local64;
						local89 = local58;
						@Pc(95) int local95 = local58 + local21.anInt1260;
						local100 = local21.anInt1212 + local64;
						if (local58 > local95) {
							local89 = local95;
							local95 = local58;
						}
						local95++;
						if (local64 > local100) {
							local87 = local100;
							local100 = local64;
						}
						local130 = arg0 > local95 ? local95 : arg0;
						local141 = local87 <= arg1 ? arg1 : local87;
						local148 = local89 > arg4 ? local89 : arg4;
						local100++;
						local160 = local100 < arg6 ? local100 : arg6;
					} else {
						local141 = local64 > arg1 ? local64 : arg1;
						local148 = local58 > arg4 ? local58 : arg4;
						local89 = local21.anInt1260 + local58;
						local87 = local21.anInt1212 + local64;
						local160 = local87 >= arg6 ? arg6 : local87;
						local130 = arg0 <= local89 ? arg0 : local89;
					}
				}
				if (!local21.aBoolean44 || local130 > local148 && local160 > local141) {
					if (local21.anInt1221 == 1337) {
						Static152.method2858(local21);
					} else if (local21.anInt1221 == 1338) {
						Static167.method3065(local58, local64);
					} else {
						if (local21.anInt1213 == 0) {
							if (!local21.aBoolean44 && Static137.method2606(local21) && Static95.aClass20_8 != local21) {
								continue;
							}
							method1197(local130, local141, local58 - local21.anInt1219, local64 - local21.anInt1256, local148, local21.anInt1240, local160, arg7);
							if (local21.aClass20Array1 != null) {
								method1197(local130, local141, local58 - local21.anInt1219, -local21.anInt1256 + local64, local148, local21.anInt1240, local160, local21.aClass20Array1);
							}
							@Pc(320) Class1_Sub8 local320 = (Class1_Sub8) Static155.aClass14_14.method569((long) local21.anInt1240);
							if (local320 != null) {
								Static2.method53(local141, local320.anInt1188, local58, local64, local130, local148, local160);
							}
						}
						if (local21.aBoolean44) {
							@Pc(353) boolean local353;
							if (local148 <= Static154.anInt4252 && Static9.anInt293 >= local141 && local130 > Static154.anInt4252 && local160 > Static9.anInt293) {
								local353 = true;
							} else {
								local353 = false;
							}
							@Pc(359) boolean local359 = false;
							@Pc(361) boolean local361 = false;
							if (Static127.anInt3639 == 1 && local353) {
								local361 = true;
							}
							if (Static145.anInt4043 == 1 && Static74.anInt2247 >= local148 && local141 <= Static91.anInt2764 && local130 > Static74.anInt2247 && local160 > Static91.anInt2764) {
								local359 = true;
							}
							if (local359) {
								Static178.method3192(Static74.anInt2247 - local58, local21, Static91.anInt2764 - local64);
							}
							if (Static41.aClass20_4 != null && Static41.aClass20_4 != local21 && local353 && Static82.method1803(Static36.method758(local21))) {
								Static122.aClass20_10 = local21;
							}
							if (Static157.aClass20_12 == local21) {
								Static125.anInt3620 = local58;
								Static73.aBoolean75 = true;
								Static126.anInt3636 = local64;
							}
							if (local21.aBoolean51) {
								@Pc(438) Class1_Sub10 local438;
								if (local353 && Static88.anInt2731 != 0 && local21.anObjectArray26 != null) {
									local438 = new Class1_Sub10();
									local438.anInt1446 = Static88.anInt2731;
									local438.anObjectArray28 = local21.anObjectArray26;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								if (Static41.aClass20_4 != null || Static178.aClass20_14 != null || Static149.aBoolean185) {
									local353 = false;
									local361 = false;
									local359 = false;
								}
								if (!local21.aBoolean48 && local359) {
									local21.aBoolean48 = true;
									if (local21.anObjectArray24 != null) {
										local438 = new Class1_Sub10();
										local438.anObjectArray28 = local21.anObjectArray24;
										local438.anInt1448 = Static74.anInt2247 - local58;
										local438.aClass20_6 = local21;
										local438.anInt1446 = Static91.anInt2764 - local64;
										Static114.aClass59_45.method2411(local438);
									}
								}
								if (local21.aBoolean48 && local361 && local21.anObjectArray17 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray17;
									local438.anInt1446 = Static9.anInt293 - local64;
									local438.aClass20_6 = local21;
									local438.anInt1448 = Static154.anInt4252 - local58;
									Static114.aClass59_45.method2411(local438);
								}
								if (local21.aBoolean48 && !local361) {
									local21.aBoolean48 = false;
									if (local21.anObjectArray21 != null) {
										local438 = new Class1_Sub10();
										local438.anInt1448 = Static154.anInt4252 - local58;
										local438.anInt1446 = Static9.anInt293 - local64;
										local438.aClass20_6 = local21;
										local438.anObjectArray28 = local21.anObjectArray21;
										Static37.aClass59_15.method2411(local438);
									}
								}
								if (local361 && local21.anObjectArray22 != null) {
									local438 = new Class1_Sub10();
									local438.anInt1448 = Static154.anInt4252 - local58;
									local438.anInt1446 = Static9.anInt293 - local64;
									local438.anObjectArray28 = local21.anObjectArray22;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								if (!local21.aBoolean49 && local353) {
									local21.aBoolean49 = true;
									if (local21.anObjectArray23 != null) {
										local438 = new Class1_Sub10();
										local438.aClass20_6 = local21;
										local438.anObjectArray28 = local21.anObjectArray23;
										local438.anInt1446 = Static9.anInt293 - local64;
										local438.anInt1448 = Static154.anInt4252 - local58;
										Static114.aClass59_45.method2411(local438);
									}
								}
								if (local21.aBoolean49 && local353 && local21.anObjectArray15 != null) {
									local438 = new Class1_Sub10();
									local438.anInt1448 = Static154.anInt4252 - local58;
									local438.aClass20_6 = local21;
									local438.anInt1446 = Static9.anInt293 - local64;
									local438.anObjectArray28 = local21.anObjectArray15;
									Static114.aClass59_45.method2411(local438);
								}
								if (local21.aBoolean49 && !local353) {
									local21.aBoolean49 = false;
									if (local21.anObjectArray10 != null) {
										local438 = new Class1_Sub10();
										local438.aClass20_6 = local21;
										local438.anInt1448 = Static154.anInt4252 - local58;
										local438.anObjectArray28 = local21.anObjectArray10;
										local438.anInt1446 = Static9.anInt293 - local64;
										Static37.aClass59_15.method2411(local438);
									}
								}
								if (local21.anObjectArray2 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray2;
									local438.aClass20_6 = local21;
									Static72.aClass59_34.method2411(local438);
								}
								@Pc(778) int local778;
								@Pc(780) int local780;
								@Pc(792) Class1_Sub10 local792;
								if (local21.anObjectArray7 != null && local21.anInt1226 < Static56.anInt2222) {
									if (local21.anIntArray84 == null || Static56.anInt2222 - local21.anInt1226 > 32) {
										local438 = new Class1_Sub10();
										local438.aClass20_6 = local21;
										local438.anObjectArray28 = local21.anObjectArray7;
										Static114.aClass59_45.method2411(local438);
									} else {
										label375: for (local100 = local21.anInt1226; local100 < Static56.anInt2222; local100++) {
											local778 = Static9.anIntArray12[local100 & 0x1F];
											for (local780 = 0; local780 < local21.anIntArray84.length; local780++) {
												if (local778 == local21.anIntArray84[local780]) {
													local792 = new Class1_Sub10();
													local792.anObjectArray28 = local21.anObjectArray7;
													local792.aClass20_6 = local21;
													Static114.aClass59_45.method2411(local792);
													break label375;
												}
											}
										}
									}
									local21.anInt1226 = Static56.anInt2222;
								}
								if (local21.anObjectArray6 != null && Static50.anInt1617 > local21.anInt1254) {
									if (local21.anIntArray76 == null || Static50.anInt1617 - local21.anInt1254 > 32) {
										local438 = new Class1_Sub10();
										local438.anObjectArray28 = local21.anObjectArray6;
										local438.aClass20_6 = local21;
										Static114.aClass59_45.method2411(local438);
									} else {
										label355: for (local100 = local21.anInt1254; local100 < Static50.anInt1617; local100++) {
											local778 = Static46.anIntArray433[local100 & 0x1F];
											for (local780 = 0; local780 < local21.anIntArray76.length; local780++) {
												if (local21.anIntArray76[local780] == local778) {
													local792 = new Class1_Sub10();
													local792.anObjectArray28 = local21.anObjectArray6;
													local792.aClass20_6 = local21;
													Static114.aClass59_45.method2411(local792);
													break label355;
												}
											}
										}
									}
									local21.anInt1254 = Static50.anInt1617;
								}
								if (local21.anObjectArray20 != null && Static15.anInt430 > local21.anInt1238) {
									if (local21.anIntArray81 == null || Static15.anInt430 - local21.anInt1238 > 32) {
										local438 = new Class1_Sub10();
										local438.anObjectArray28 = local21.anObjectArray20;
										local438.aClass20_6 = local21;
										Static114.aClass59_45.method2411(local438);
									} else {
										label335: for (local100 = local21.anInt1238; local100 < Static15.anInt430; local100++) {
											local778 = Static151.anIntArray386[local100 & 0x1F];
											for (local780 = 0; local780 < local21.anIntArray81.length; local780++) {
												if (local778 == local21.anIntArray81[local780]) {
													local792 = new Class1_Sub10();
													local792.aClass20_6 = local21;
													local792.anObjectArray28 = local21.anObjectArray20;
													Static114.aClass59_45.method2411(local792);
													break label335;
												}
											}
										}
									}
									local21.anInt1238 = Static15.anInt430;
								}
								if (Static157.anInt4315 > local21.anInt1257 && local21.anObjectArray13 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray13;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								if (local21.anInt1257 < Static159.anInt4381 && local21.anObjectArray4 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray4;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								if (Static95.anInt2948 > local21.anInt1257 && local21.anObjectArray11 != null) {
									local438 = new Class1_Sub10();
									local438.aClass20_6 = local21;
									local438.anObjectArray28 = local21.anObjectArray11;
									Static114.aClass59_45.method2411(local438);
								}
								if (Static38.anInt1190 > local21.anInt1257 && local21.anObjectArray3 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray3;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								if (Static180.anInt4785 > local21.anInt1257 && local21.anObjectArray9 != null) {
									local438 = new Class1_Sub10();
									local438.anObjectArray28 = local21.anObjectArray9;
									local438.aClass20_6 = local21;
									Static114.aClass59_45.method2411(local438);
								}
								local21.anInt1257 = Static167.anInt4526;
								if (local21.anObjectArray8 != null) {
									for (local100 = 0; local100 < Static89.anInt2750; local100++) {
										@Pc(1134) Class1_Sub10 local1134 = new Class1_Sub10();
										local1134.aClass20_6 = local21;
										local1134.anInt1449 = Static34.anIntArray72[local100];
										local1134.anInt1450 = Static75.anIntArray201[local100];
										local1134.anObjectArray28 = local21.anObjectArray8;
										Static114.aClass59_45.method2411(local1134);
									}
								}
							}
						}
						if (!local21.aBoolean44) {
							if (Static41.aClass20_4 != null || Static178.aClass20_14 != null || Static149.aBoolean185) {
								return;
							}
							if ((local21.anInt1247 >= 0 || local21.anInt1235 != 0) && local148 <= Static154.anInt4252 && local141 <= Static9.anInt293 && Static154.anInt4252 < local130 && local160 > Static9.anInt293) {
								if (local21.anInt1247 >= 0) {
									Static95.aClass20_8 = arg7[local21.anInt1247];
								} else {
									Static95.aClass20_8 = local21;
								}
							}
							if (local21.anInt1213 == 8 && Static154.anInt4252 >= local148 && Static9.anInt293 >= local141 && Static154.anInt4252 < local130 && Static9.anInt293 < local160) {
								Static45.aClass20_7 = local21;
							}
							if (local21.anInt1209 > local21.anInt1212) {
								Static172.method3131(local21, local21.anInt1260 + local58, local21.anInt1212, local21.anInt1209, Static154.anInt4252, local64, Static9.anInt293);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public static void method1198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static48.method1038(arg0)) {
			Static180.method3220(Static148.aClass20ArrayArray1[arg0], arg1);
		}
	}
}
