import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt1864 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!is;IIIIIIIII)V")
	public static void method1534(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class155 local6 = arg0[local1];
			if (local6 != null && local6.anInt4769 == arg1) {
				@Pc(17) int local17 = local6.anInt4795 + arg6;
				@Pc(22) int local22 = local6.anInt4799 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4796 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4806;
					@Pc(45) int local45 = local22 + local6.anInt4831;
					if (local6.anInt4796 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4796 == 0 || local6.aBoolean337 || method1542(local6).anInt8126 != 0 || local6 == Static95.aClass155_1 || local6.anInt4825 == Static169.anInt3517 || local6.anInt4825 == Static216.anInt4541) {
					if (!method1547(local6)) {
						if (local6 == Static292.aClass155_7 && Static159.method2598(Static292.aClass155_7) != null) {
							Static525.aBoolean654 = true;
							Static146.anInt3124 = local17;
							Static173.anInt3645 = local22;
						}
						if (local6.aBoolean326 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean322 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class4_Sub37 local156 = (Class4_Sub37) Static197.aClass22_23.method895(); local156 != null; local156 = (Class4_Sub37) Static197.aClass22_23.method889()) {
									if (local156.aBoolean554) {
										local156.method8193();
										local156.aClass155_10.aBoolean330 = false;
									}
								}
								if (Static454.anInt8653 == 0) {
									Static292.aClass155_7 = null;
									Static95.aClass155_1 = null;
								}
								Static322.anInt6367 = 0;
								Static80.aBoolean169 = false;
								Static437.aBoolean597 = false;
								if (!Static117.aBoolean207) {
									Static486.method7075();
								}
							}
							@Pc(212) boolean local212;
							if (Static294.aClass83_1.method6895() >= local28 && Static294.aClass83_1.method6896() >= local30 && Static294.aClass83_1.method6895() < local32 && Static294.aClass83_1.method6896() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static430.aBoolean586 && local212) {
								if (local6.anInt4790 >= 0) {
									Static117.anInt2703 = local6.anInt4790;
								} else if (local6.aBoolean322) {
									Static117.anInt2703 = -1;
								}
							}
							if (!Static117.aBoolean207 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static409.method6225(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(256) boolean local256 = false;
							if (Static294.aClass83_1.method6901() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class4_Sub24 local271 = (Class4_Sub24) Static36.aClass22_13.method895();
							if (local271 != null && local271.method6389() == 0 && local271.method6394() >= local28 && local271.method6390() >= local30 && local271.method6394() < local32 && local271.method6390() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray36 != null && !Static402.method6128()) {
								for (local307 = 0; local307 < local6.aByteArray36.length; local307++) {
									if (Static38.aClass174_1.method4090(local6.aByteArray36[local307])) {
										if (local6.anIntArray228 == null || Static306.anInt6122 >= local6.anIntArray228[local307]) {
											@Pc(339) byte local339 = local6.aByteArray37[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static38.aClass174_1.method4090(86) && !Static38.aClass174_1.method4090(82) && !Static38.aClass174_1.method4090(81)) && ((local339 & 0x2) == 0 || Static38.aClass174_1.method4090(86)) && ((local339 & 0x1) == 0 || Static38.aClass174_1.method4090(82)) && ((local339 & 0x4) == 0 || Static38.aClass174_1.method4090(81))) {
												if (local307 < 10) {
													Static101.method1932("", -1, local6.anInt4793, local307 + 1);
												} else if (local307 == 10) {
													Static263.method4151();
													@Pc(410) Class4_Sub40 local410 = method1542(local6);
													Static331.method7987(local410.anInt8121, local410.method6330(), local6);
													Static317.aString131 = Static476.method6911(local6);
													if (Static317.aString131 == null) {
														Static317.aString131 = "Null";
													}
													Static393.aString154 = local6.aString97 + "<col=ffffff>";
												}
												local441 = local6.anIntArray236[local307];
												if (local6.anIntArray228 == null) {
													local6.anIntArray228 = new int[local6.aByteArray36.length];
												}
												if (local441 == 0) {
													local6.anIntArray228[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray228[local307] = Static306.anInt6122 + local441;
												}
											}
										}
									} else if (local6.anIntArray228 != null) {
										local6.anIntArray228[local307] = 0;
									}
								}
							}
							if (local266) {
								Static189.method3136(local271.method6394() - local17, local6, local271.method6390() - local22);
							}
							if (Static292.aClass155_7 != null && Static292.aClass155_7 != local6 && local212 && method1542(local6).method6324()) {
								Static204.aClass155_13 = local6;
							}
							if (local6 == Static95.aClass155_1) {
								Static325.aBoolean436 = true;
								Static505.anInt9451 = local17;
								Static344.anInt6632 = local22;
							}
							if (local6.aBoolean337 || local6.anInt4825 != 0) {
								@Pc(526) Class4_Sub37 local526;
								if (local212 && Static56.anInt1480 != 0 && local6.anObjectArray18 != null) {
									local526 = new Class4_Sub37();
									local526.aBoolean554 = true;
									local526.aClass155_10 = local6;
									local526.anInt7562 = Static56.anInt1480;
									local526.anObjectArray31 = local6.anObjectArray18;
									Static197.aClass22_23.method894(local526);
								}
								if (Static292.aClass155_7 != null || Static117.aBoolean207 || local6.anInt4825 != Static307.anInt6125 && Static322.anInt6367 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt4825 != 0) {
									if (local6.anInt4825 == Static175.anInt3712 || local6.anInt4825 == Static396.anInt7773) {
										Static375.aClass155_8 = local6;
										if (Static357.aClass260_1 != null) {
											Static357.aClass260_1.method6108(Static39.aClass7_2, local6.anInt4831);
										}
										if (local6.anInt4825 == Static175.anInt3712) {
											if (!Static117.aBoolean207 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static309.method4887(arg8, Static39.aClass7_2, arg9);
												for (@Pc(609) Class21_Sub9 local609 = (Class21_Sub9) Static62.aClass158_19.method3726(); local609 != null; local609 = (Class21_Sub9) Static62.aClass158_19.method3721()) {
													if (arg8 >= local609.anInt8154 && arg8 < local609.anInt8153 && arg9 >= local609.anInt8155 && arg9 < local609.anInt8156) {
														Static486.method7075();
														Static565.method4013(local609.aClass21_Sub1_Sub1_Sub1_1);
													}
												}
											}
											Static212.method3437(local22, local6, local17);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt4825 == Static169.anInt3517) {
										if (local6.method3701(Static39.aClass7_2) == null || Static291.anInt5976 != 0 && Static291.anInt5976 != 3 || Static117.aBoolean207 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray235[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray233[local681]) {
											continue;
										}
										local307 -= local6.anInt4806 / 2;
										local681 -= local6.anInt4831 / 2;
										if (Static300.anInt6053 == 4) {
											local720 = (int) Static189.aFloat83 & 0x3FFF;
										} else {
											local720 = (int) Static189.aFloat83 + Static136.anInt3033 & 0x3FFF;
										}
										@Pc(732) int local732 = Class262.anIntArray420[local720];
										@Pc(736) int local736 = Class262.anIntArray421[local720];
										if (Static300.anInt6053 != 4) {
											local732 = local732 * (Static273.anInt5737 + 256) >> 8;
											local736 = local736 * (Static273.anInt5737 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static300.anInt6053 == 4) {
											local786 = (Static277.anInt5777 >> 9) + (local765 >> 2);
											local794 = (Static27.anInt4151 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() - 1) * 256;
											local786 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 - local803 >> 9) + (local765 >> 2);
											local794 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 - local803 >> 9) - (local775 >> 2);
										}
										if (Static430.aBoolean586 && (Static264.anInt5328 & 0x40) != 0) {
											@Pc(836) Class155 local836 = Static539.method7544(Static286.anInt6126, Static569.anInt7644);
											if (local836 == null) {
												Static263.method4151();
											} else {
												Static437.method6478(local786, 1L, local6.anInt4785, local794, true, Static317.aString131, 16, " ->", false, Static398.anInt7799);
											}
											continue;
										}
										if (Static162.aClass128_1 == Static403.aClass128_3) {
											Static437.method6478(local786, 1L, -1, local794, true, Static223.aClass152_31.method3624(Static142.anInt3088), 17, "", false, -1);
										}
										Static437.method6478(local786, 1L, -1, local794, true, Static541.aString211, 45, "", false, Static545.anInt9970);
										continue;
									}
									if (local6.anInt4825 == Static307.anInt6125) {
										Static571.aClass155_17 = local6;
										if (local212) {
											Static80.aBoolean169 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method6394() - local17 - local6.anInt4806 / 2) * 2.0D / (double) Static572.aFloat202);
											local681 = (int) -((double) (local271.method6390() - local22 - local6.anInt4831 / 2) * 2.0D / (double) Static572.aFloat202);
											local441 = Static43.anInt2490 + local307 + Static572.anInt10056;
											local720 = Static555.anInt10135 + local681 + Static572.anInt10059;
											@Pc(950) Class4_Sub6_Sub16 local950 = Static267.method4195();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method6315(local955, local441, local720);
											if (local955 != null) {
												if (Static38.aClass174_1.method4090(82) && Static100.anInt2432 > 0) {
													Static387.method5969(local955[0], local955[1], local955[2]);
													continue;
												}
												Static437.aBoolean597 = true;
												Static343.anInt6618 = local955[0];
												Static83.anInt2224 = local955[1];
												Static559.anInt10555 = local955[2];
											}
											Static322.anInt6367 = 1;
											Static57.aBoolean124 = false;
											Static221.anInt1106 = Static294.aClass83_1.method6895();
											Static487.anInt9232 = Static294.aClass83_1.method6896();
											continue;
										}
										if (local256 && Static322.anInt6367 > 0) {
											if (Static322.anInt6367 == 1 && (Static221.anInt1106 != Static294.aClass83_1.method6895() || Static487.anInt9232 != Static294.aClass83_1.method6896())) {
												Static500.anInt9367 = Static43.anInt2490;
												Static488.anInt9245 = Static555.anInt10135;
												Static322.anInt6367 = 2;
											}
											if (Static322.anInt6367 == 2) {
												Static57.aBoolean124 = true;
												Static331.method7992(Static500.anInt9367 + (int) ((double) (Static221.anInt1106 - Static294.aClass83_1.method6895()) * 2.0D / (double) Static572.aFloat201));
												Static313.method4935(Static488.anInt9245 - (int) ((double) (Static487.anInt9232 - Static294.aClass83_1.method6896()) * 2.0D / (double) Static572.aFloat201));
											}
											continue;
										}
										if (Static322.anInt6367 > 0 && !Static57.aBoolean124) {
											if ((Static265.anInt5333 == 1 || Static115.method2105()) && Static384.anInt7556 > 2) {
												Static247.method3955(Static487.anInt9232, Static221.anInt1106);
											} else if (Static118.method2163()) {
												Static247.method3955(Static487.anInt9232, Static221.anInt1106);
											}
										}
										Static322.anInt6367 = 0;
										continue;
									}
									if (local6.anInt4825 == Static4.anInt1832) {
										if (local256) {
											Static467.method6807(local6.anInt4831, Static294.aClass83_1.method6895() - local17, Static294.aClass83_1.method6896() - local22, local6.anInt4806);
										}
										continue;
									}
									if (local6.anInt4825 == Static216.anInt4541) {
										Static398.method6103(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean333 && local266) {
									local6.aBoolean333 = true;
									if (local6.anObjectArray14 != null) {
										local526 = new Class4_Sub37();
										local526.aBoolean554 = true;
										local526.aClass155_10 = local6;
										local526.anInt7557 = local271.method6394() - local17;
										local526.anInt7562 = local271.method6390() - local22;
										local526.anObjectArray31 = local6.anObjectArray14;
										Static197.aClass22_23.method894(local526);
									}
								}
								if (local6.aBoolean333 && local256 && local6.anObjectArray17 != null) {
									local526 = new Class4_Sub37();
									local526.aBoolean554 = true;
									local526.aClass155_10 = local6;
									local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
									local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
									local526.anObjectArray31 = local6.anObjectArray17;
									Static197.aClass22_23.method894(local526);
								}
								if (local6.aBoolean333 && !local256) {
									local6.aBoolean333 = false;
									if (local6.anObjectArray10 != null) {
										local526 = new Class4_Sub37();
										local526.aBoolean554 = true;
										local526.aClass155_10 = local6;
										local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
										local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
										local526.anObjectArray31 = local6.anObjectArray10;
										Static72.aClass22_15.method894(local526);
									}
								}
								if (local256 && local6.anObjectArray9 != null) {
									local526 = new Class4_Sub37();
									local526.aBoolean554 = true;
									local526.aClass155_10 = local6;
									local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
									local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
									local526.anObjectArray31 = local6.anObjectArray9;
									Static197.aClass22_23.method894(local526);
								}
								if (!local6.aBoolean330 && local212) {
									local6.aBoolean330 = true;
									if (local6.anObjectArray15 != null) {
										local526 = new Class4_Sub37();
										local526.aBoolean554 = true;
										local526.aClass155_10 = local6;
										local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
										local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
										local526.anObjectArray31 = local6.anObjectArray15;
										Static197.aClass22_23.method894(local526);
									}
								}
								if (local6.aBoolean330 && local212 && local6.anObjectArray21 != null) {
									local526 = new Class4_Sub37();
									local526.aBoolean554 = true;
									local526.aClass155_10 = local6;
									local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
									local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
									local526.anObjectArray31 = local6.anObjectArray21;
									Static197.aClass22_23.method894(local526);
								}
								if (local6.aBoolean330 && !local212) {
									local6.aBoolean330 = false;
									if (local6.anObjectArray19 != null) {
										local526 = new Class4_Sub37();
										local526.aBoolean554 = true;
										local526.aClass155_10 = local6;
										local526.anInt7557 = Static294.aClass83_1.method6895() - local17;
										local526.anInt7562 = Static294.aClass83_1.method6896() - local22;
										local526.anObjectArray31 = local6.anObjectArray19;
										Static72.aClass22_15.method894(local526);
									}
								}
								if (local6.anObjectArray11 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray11;
									Static360.aClass22_45.method894(local526);
								}
								@Pc(1494) Class4_Sub37 local1494;
								if (local6.anObjectArray12 != null && Static517.anInt10520 > local6.anInt4756) {
									if (local6.anIntArray237 == null || Static517.anInt10520 - local6.anInt4756 > 32) {
										local526 = new Class4_Sub37();
										local526.aClass155_10 = local6;
										local526.anObjectArray31 = local6.anObjectArray12;
										Static197.aClass22_23.method894(local526);
									} else {
										label683: for (local307 = local6.anInt4756; local307 < Static517.anInt10520; local307++) {
											local681 = Static562.anIntArray576[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray237.length; local441++) {
												if (local6.anIntArray237[local441] == local681) {
													local1494 = new Class4_Sub37();
													local1494.aClass155_10 = local6;
													local1494.anObjectArray31 = local6.anObjectArray12;
													Static197.aClass22_23.method894(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt4756 = Static517.anInt10520;
								}
								if (local6.anObjectArray16 != null && Static499.anInt8421 > local6.anInt4740) {
									if (local6.anIntArray229 == null || Static499.anInt8421 - local6.anInt4740 > 32) {
										local526 = new Class4_Sub37();
										local526.aClass155_10 = local6;
										local526.anObjectArray31 = local6.anObjectArray16;
										Static197.aClass22_23.method894(local526);
									} else {
										label659: for (local307 = local6.anInt4740; local307 < Static499.anInt8421; local307++) {
											local681 = Static476.anIntArray527[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray229.length; local441++) {
												if (local6.anIntArray229[local441] == local681) {
													local1494 = new Class4_Sub37();
													local1494.aClass155_10 = local6;
													local1494.anObjectArray31 = local6.anObjectArray16;
													Static197.aClass22_23.method894(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt4740 = Static499.anInt8421;
								}
								if (local6.anObjectArray26 != null && Static160.anInt3344 > local6.anInt4767) {
									if (local6.anIntArray232 == null || Static160.anInt3344 - local6.anInt4767 > 32) {
										local526 = new Class4_Sub37();
										local526.aClass155_10 = local6;
										local526.anObjectArray31 = local6.anObjectArray26;
										Static197.aClass22_23.method894(local526);
									} else {
										label635: for (local307 = local6.anInt4767; local307 < Static160.anInt3344; local307++) {
											local681 = Static237.anIntArray270[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray232.length; local441++) {
												if (local6.anIntArray232[local441] == local681) {
													local1494 = new Class4_Sub37();
													local1494.aClass155_10 = local6;
													local1494.anObjectArray31 = local6.anObjectArray26;
													Static197.aClass22_23.method894(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt4767 = Static160.anInt3344;
								}
								if (local6.anObjectArray25 != null && Static419.anInt7995 > local6.anInt4783) {
									if (local6.anIntArray231 == null || Static419.anInt7995 - local6.anInt4783 > 32) {
										local526 = new Class4_Sub37();
										local526.aClass155_10 = local6;
										local526.anObjectArray31 = local6.anObjectArray25;
										Static197.aClass22_23.method894(local526);
									} else {
										label611: for (local307 = local6.anInt4783; local307 < Static419.anInt7995; local307++) {
											local681 = Static80.anIntArray105[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray231.length; local441++) {
												if (local6.anIntArray231[local441] == local681) {
													local1494 = new Class4_Sub37();
													local1494.aClass155_10 = local6;
													local1494.anObjectArray31 = local6.anObjectArray25;
													Static197.aClass22_23.method894(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt4783 = Static419.anInt7995;
								}
								if (local6.anObjectArray24 != null && Static511.anInt9517 > local6.anInt4832) {
									if (local6.anIntArray234 == null || Static511.anInt9517 - local6.anInt4832 > 32) {
										local526 = new Class4_Sub37();
										local526.aClass155_10 = local6;
										local526.anObjectArray31 = local6.anObjectArray24;
										Static197.aClass22_23.method894(local526);
									} else {
										label587: for (local307 = local6.anInt4832; local307 < Static511.anInt9517; local307++) {
											local681 = Static105.anIntArray526[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray234.length; local441++) {
												if (local6.anIntArray234[local441] == local681) {
													local1494 = new Class4_Sub37();
													local1494.aClass155_10 = local6;
													local1494.anObjectArray31 = local6.anObjectArray24;
													Static197.aClass22_23.method894(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt4832 = Static511.anInt9517;
								}
								if (Static173.anInt3651 > local6.anInt4803 && local6.anObjectArray1 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray1;
									Static197.aClass22_23.method894(local526);
								}
								if (Static136.anInt3035 > local6.anInt4803 && local6.anObjectArray4 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray4;
									Static197.aClass22_23.method894(local526);
								}
								if (Static25.anInt1023 > local6.anInt4803 && local6.anObjectArray2 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray2;
									Static197.aClass22_23.method894(local526);
								}
								if (Static162.anInt3368 > local6.anInt4803 && local6.anObjectArray30 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray30;
									Static197.aClass22_23.method894(local526);
								}
								if (Static389.anInt9603 > local6.anInt4803 && local6.anObjectArray27 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray27;
									Static197.aClass22_23.method894(local526);
								}
								local6.anInt4803 = Static422.anInt8117;
								if (local6.lb != null) {
									for (local307 = 0; local307 < Static173.anInt3654; local307++) {
										@Pc(1962) Class4_Sub37 local1962 = new Class4_Sub37();
										local1962.aClass155_10 = local6;
										local1962.anInt7563 = Static504.anInterface19Array2[local307].method5458();
										local1962.anInt7554 = Static504.anInterface19Array2[local307].method5461();
										local1962.anObjectArray31 = local6.lb;
										Static197.aClass22_23.method894(local1962);
									}
								}
								if (Static54.aBoolean118 && local6.anObjectArray5 != null) {
									local526 = new Class4_Sub37();
									local526.aClass155_10 = local6;
									local526.anObjectArray31 = local6.anObjectArray5;
									Static197.aClass22_23.method894(local526);
								}
							}
							if (local6.anInt4796 == 5 && local6.anInt4788 != -1) {
								local6.method3696(Static240.aClass175_1, Static145.aClass56_1).method6108(Static39.aClass7_2, local6.anInt4831);
							}
							Static447.method7797(local6);
							if (local6.anInt4796 == 0) {
								method1534(arg0, local6.anInt4793, local28, local30, local32, local34, local17 - local6.anInt4758, local22 - local6.anInt4762, arg8, arg9);
								if (local6.aClass155Array2 != null) {
									method1534(local6.aClass155Array2, local6.anInt4793, local28, local30, local32, local34, local17 - local6.anInt4758, local22 - local6.anInt4762, arg8, arg9);
								}
								@Pc(2084) Class4_Sub45 local2084 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local6.anInt4793);
								if (local2084 != null) {
									if (Static162.aClass128_1 == Static592.aClass128_4 && local2084.anInt9095 == 0 && !Static117.aBoolean207 && local212 && !Static80.aBoolean170) {
										Static486.method7075();
									}
									Static424.method6350(local30, arg9, local22, local34, local28, local32, local17, local2084.anInt9096, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static447.method7797(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1535() {
		for (@Pc(1) int local1 = 0; local1 < Static338.anInt6508; local1++) {
			@Pc(6) int[] local6 = Static528.anIntArrayArray57[local1];
			for (@Pc(8) int local8 = 0; local8 < Static390.anInt7654; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1536() {
		Static215.anInt4514 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static137.anInt3042; local3++) {
			@Pc(14) Class21_Sub1_Sub1_Sub1_Sub1 local14 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local3])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			if (local14.aBoolean295 && local14.method3327() != -1) {
				@Pc(32) int local32 = (local14.method3339() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10551 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10550 - local32 >> 9;
				@Pc(53) Class21_Sub1_Sub1_Sub1 local53 = Static569.method6001(local14.aByte127, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4256;
					if (local53 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt4202 == 0 && local53.method3327() != -1) {
						Static475.anIntArray590[Static215.anInt4514] = local58;
						Static7.anIntArray11[Static215.anInt4514] = local58;
						Static215.anInt4514++;
						local53.anInt4202++;
					}
					Static475.anIntArray590[Static215.anInt4514] = local58;
					Static7.anIntArray11[Static215.anInt4514] = local14.anInt4256 + 2048;
					Static215.anInt4514++;
					local53.anInt4202++;
				}
			}
		}
		Static520.method8288(0, Static215.anInt4514 - 1, Static475.anIntArray590, Static7.anIntArray11);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1538(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static57.anInt1513;
		@Pc(3) int[] local3 = Static447.anIntArray571;
		@Pc(11) int local11 = Static165.aBoolean249 ? local1 : local1 + Static137.anInt3042;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class21_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local13 - local1])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local23.aByte127 == arg0) {
				local23.anInt4202 = 0;
				if (local23.anInt4220 < 0) {
					local23.aBoolean295 = false;
				} else {
					@Pc(54) int local54 = local23.method3339();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10551 & 0x1FF) != 0 || (local23.anInt10550 & 0x1FF) != 0) {
							local23.aBoolean295 = false;
							continue;
						}
					} else if ((local23.anInt10551 & 0x1FF) != 256 || (local23.anInt10550 & 0x1FF) != 256) {
						local23.aBoolean295 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10551 >> 9;
						local101 = local23.anInt10550 >> 9;
						if (local23.anInt4220 != Static528.anIntArrayArray57[local96][local101]) {
							local23.aBoolean295 = true;
							continue;
						}
						if (Static118.anIntArrayArray12[local96][local101] > 1) {
							local126 = Static118.anIntArrayArray12[local96][local101]--;
							local23.aBoolean295 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10551 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10550 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10551 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10550 + local96 >> 9;
						if (!Static300.method4775(local23.anInt4220, local162, local101, local155, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4220 == Static528.anIntArrayArray57[local180][local183]) {
										local126 = Static118.anIntArrayArray12[local180][local183]--;
									}
								}
							}
							local23.aBoolean295 = true;
							continue;
						}
					}
					local23.aBoolean295 = false;
					local23.anInt10554 = Static461.method6782(local23.anInt10550, local23.aByte127, local23.anInt10551);
					Static542.method7597(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1541() {
		@Pc(1) int local1 = Static57.anInt1513;
		@Pc(3) int[] local3 = Static447.anIntArray571;
		@Pc(20) boolean local20 = Static455.aClass4_Sub35_Sub1_1.anInt9931 == 1 && local1 > 200 || Static455.aClass4_Sub35_Sub1_1.anInt9931 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class21_Sub1_Sub1_Sub1_Sub2 local29 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local3[local22]];
			if (!local29.method3347()) {
				local29.anInt4220 = -1;
			} else if (local29.aBoolean299) {
				local29.anInt4220 = -1;
			} else {
				local29.method7567();
				if (local29.aShort119 >= 0 && local29.aShort121 >= 0 && local29.aShort120 < Static338.anInt6508 && local29.aShort122 < Static390.anInt7654) {
					local29.aBoolean300 = local29.aBoolean294 ? local20 : false;
					if (local29 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2) {
						local29.anInt4220 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean295) {
							local82++;
						}
						if (local29.anInt4264 > Static306.anInt6122) {
							local82 += 2;
						}
						local82 += 5 - local29.method3339() << 2;
						if (local29.aBoolean302) {
							local82 += 512;
						} else {
							if (Static67.anInt1777 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt4220 = local82 + 1;
					}
				} else {
					local29.anInt4220 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static137.anInt3042; local123++) {
			@Pc(134) Class21_Sub1_Sub1_Sub1_Sub1 local134 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local123])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			if (local134.method1709() && local134.aClass51_1.method1367(Static523.aClass173_1)) {
				local134.method7567();
				if (local134.aShort119 >= 0 && local134.aShort121 >= 0 && local134.aShort120 < Static338.anInt6508 && local134.aShort122 < Static390.anInt7654) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean295) {
						local171++;
					}
					if (local134.anInt4264 > Static306.anInt6122) {
						local171 += 2;
					}
					local171 += 5 - local134.method3339() << 2;
					if (Static67.anInt1777 == 0) {
						if (local134.aClass51_1.aBoolean126) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static67.anInt1777 == 1) {
						if (local134.aClass51_1.aBoolean126) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass51_1.aBoolean127) {
						local171 += 1024;
					} else if (!local134.aClass51_1.aBoolean128) {
						local171 += 256;
					}
					local134.anInt4220 = local171 + 1;
				} else {
					local134.anInt4220 = -1;
				}
			} else {
				local134.anInt4220 = -1;
			}
		}
		for (local82 = 0; local82 < Static553.aClass292Array1.length; local82++) {
			@Pc(237) Class292 local237 = Static553.aClass292Array1[local82];
			if (local237 != null) {
				if (local237.anInt8837 == 1) {
					@Pc(251) Class4_Sub29 local251 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local237.anInt8834);
					if (local251 != null) {
						@Pc(256) Class21_Sub1_Sub1_Sub1_Sub1 local256 = local251.aClass21_Sub1_Sub1_Sub1_Sub1_1;
						if (local256.anInt4220 >= 0) {
							local256.anInt4220 += 2048;
						}
					}
				} else if (local237.anInt8837 == 10) {
					@Pc(275) Class21_Sub1_Sub1_Sub1_Sub2 local275 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local237.anInt8834];
					if (local275 != null && local275 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 && local275.anInt4220 >= 0) {
						local275.anInt4220 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!is;)Lclient!qca;")
	public static Class4_Sub40 method1542(@OriginalArg(0) Class155 arg0) {
		@Pc(13) Class4_Sub40 local13 = (Class4_Sub40) Static433.aClass221_29.method5075(((long) arg0.anInt4793 << 32) + (long) arg0.anInt4765);
		return local13 == null ? arg0.aClass4_Sub40_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1543(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static57.anInt1513;
		@Pc(3) int[] local3 = Static447.anIntArray571;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static137.anInt3042; local5++) {
			@Pc(15) Class21_Sub1_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local5 - local1])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local15.aByte127 == arg0 && local15.anInt4220 >= 0) {
				@Pc(39) int local39 = local15.method3339();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10551 & 0x1FF) != 0 || (local15.anInt10550 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10551 & 0x1FF) != 256 || (local15.anInt10550 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10551 >> 9;
					local80 = local15.anInt10550 >> 9;
					if (local15.anInt4220 > Static528.anIntArrayArray57[local75][local80]) {
						Static528.anIntArrayArray57[local75][local80] = local15.anInt4220;
						Static118.anIntArrayArray12[local75][local80] = 1;
					} else if (local15.anInt4220 == Static528.anIntArrayArray57[local75][local80]) {
						local116 = Static118.anIntArrayArray12[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10551 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10550 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10551 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10550 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4220 > Static528.anIntArrayArray57[local158][local161]) {
								Static528.anIntArrayArray57[local158][local161] = local15.anInt4220;
								Static118.anIntArrayArray12[local158][local161] = 1;
							} else if (local15.anInt4220 == Static528.anIntArrayArray57[local158][local161]) {
								local116 = Static118.anIntArrayArray12[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1544() {
		@Pc(1) int local1 = Static57.anInt1513;
		@Pc(3) int[] local3 = Static447.anIntArray571;
		@Pc(11) int local11 = Static165.aBoolean249 ? local1 : local1 + Static137.anInt3042;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class21_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local13 - local1])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local23.anInt4220 >= 0) {
				@Pc(43) int local43 = local23.method3339();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10551 & 0x1FF) == 0 && (local23.anInt10550 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10551 & 0x1FF) == 256 && (local23.anInt10550 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10554 = Static461.method6782(local23.anInt10550, local23.aByte127, local23.anInt10551);
				Static542.method7597(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!is;)Z")
	public static boolean method1547(@OriginalArg(0) Class155 arg0) {
		if (Static80.aBoolean170) {
			if (method1542(arg0).anInt8126 != 0) {
				return false;
			}
			if (arg0.anInt4796 == 0) {
				return false;
			}
		}
		return arg0.aBoolean329;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!is;)Lclient!is;")
	public static Class155 method1548(@OriginalArg(0) Class155 arg0) {
		@Pc(4) int local4 = method1542(arg0).method6328();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static558.method7916(arg0.anInt4769);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
