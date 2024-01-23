import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!ml;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "Lclient!qd;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
	public static int anInt2190;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
	public static int anInt2191 = -1;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZLjava/lang/String;Lclient!cc;)Ljava/lang/String;")
	public static String method1660(@OriginalArg(1) String arg0, @OriginalArg(2) Class22 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(17) int local17 = arg0.indexOf("%1");
			if (local17 == -1) {
				while (true) {
					local17 = arg0.indexOf("%2");
					if (local17 == -1) {
						while (true) {
							local17 = arg0.indexOf("%3");
							if (local17 == -1) {
								while (true) {
									local17 = arg0.indexOf("%4");
									if (local17 == -1) {
										while (true) {
											local17 = arg0.indexOf("%5");
											if (local17 == -1) {
												while (true) {
													local17 = arg0.indexOf("%dns");
													if (local17 == -1) {
														return arg0;
													}
													@Pc(189) String local189 = "";
													if (Static248.aClass123_5 != null) {
														if (Static248.aClass123_5.anObject4 == null) {
															local189 = Static257.method3884(Static248.aClass123_5.anInt3793);
														} else {
															local189 = (String) Static248.aClass123_5.anObject4;
														}
													}
													arg0 = arg0.substring(0, local17) + local189 + arg0.substring(local17 + 4);
												}
											}
											arg0 = arg0.substring(0, local17) + Static179.method2815(Static277.method4118(arg1, 4)) + arg0.substring(local17 + 2);
										}
									}
									arg0 = arg0.substring(0, local17) + Static179.method2815(Static277.method4118(arg1, 3)) + arg0.substring(local17 + 2);
								}
							}
							arg0 = arg0.substring(0, local17) + Static179.method2815(Static277.method4118(arg1, 2)) + arg0.substring(local17 + 2);
						}
					}
					arg0 = arg0.substring(0, local17) + Static179.method2815(Static277.method4118(arg1, 1)) + arg0.substring(local17 + 2);
				}
			}
			arg0 = arg0.substring(0, local17) + Static179.method2815(Static277.method4118(arg1, 0)) + arg0.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method1663() {
		if (Static298.aBoolean356) {
			return;
		}
		Static298.aBoolean356 = true;
		Static114.aBoolean167 = true;
		if (Static74.aBoolean115) {
			Static96.aFloat16 = (int) Static96.aFloat16 - 17 & 0xFFFFFFF0;
		} else {
			Static86.aFloat13 += (-12.0F - Static86.aFloat13) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public static void method1664() {
		aClass113_1 = null;
		aRandom1 = null;
		anIntArray225 = null;
		aClass137_1 = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([[I[[I[[B[[F[[B[[B[[F[[BI[[[B[[FB)[Lclient!gj;")
	public static Class4_Sub14[] method1667(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][][] arg9, @OriginalArg(10) float[][] arg10) {
		@Pc(10) Class97 local10 = new Class97(128);
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(138) int local138;
		@Pc(150) int local150;
		@Pc(148) int local148;
		@Pc(160) int local160;
		@Pc(192) int local192;
		@Pc(170) int local170;
		@Pc(204) int local204;
		@Pc(216) int local216;
		@Pc(182) int local182;
		@Pc(228) int local228;
		@Pc(265) byte local265;
		@Pc(299) int local299;
		@Pc(313) int local313;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(759) int local759;
		@Pc(1013) int local1013;
		@Pc(1033) boolean[] local1033;
		@Pc(1055) boolean[] local1055;
		@Pc(1068) boolean[] local1068;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local34 = arg4[local12][local23] & 0xFF;
				local42 = arg7[local12][local23] & 0xFF;
				if (local42 != 0) {
					@Pc(54) Class35 local54 = Static171.method2693(local42 - 1);
					if (local54.anInt1071 == -1) {
						continue;
					}
					@Pc(65) Class4_Sub14 local65 = Static230.method3623(local10, local54);
					@Pc(71) byte local71 = arg5[local12][local23];
					@Pc(75) int[] local75 = Static270.anIntArrayArray42[local71];
					local65.anInt1877 += local75.length / 2;
					local65.anInt1880++;
					if (local54.aBoolean78 && local34 != 0) {
						local65.anInt1877 += Static218.anIntArray477[local71];
					}
				}
				if ((arg4[local12][local23] & 0xFF) != 0 || local42 != 0 && arg5[local12][local23] == 0) {
					local129 = 0;
					@Pc(132) int[] local132 = new int[8];
					local134 = 0;
					@Pc(136) int local136 = 0;
					local138 = 0;
					local148 = arg7[local12][local23 + 1] & 0xFF;
					local150 = 0;
					local160 = arg7[local12 - 1][local23] & 0xFF;
					local170 = arg7[local12 + 1][local23] & 0xFF;
					local182 = arg7[local12 + 1][local23 - 1] & 0xFF;
					local192 = arg7[local12][local23 - 1] & 0xFF;
					local204 = arg7[local12 - 1][local23 + 1] & 0xFF;
					local216 = arg7[local12 - 1][local23 - 1] & 0xFF;
					local228 = arg7[local12 + 1][local23 + 1] & 0xFF;
					@Pc(243) Class35 local243;
					@Pc(275) byte local275;
					@Pc(287) int local287;
					if (local204 != 0 && local204 != local42) {
						local243 = Static171.method2693(local204 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local265 = arg5[local12 - 1][local23 + 1];
							local275 = arg2[local12 - 1][local23 + 1];
							local287 = Static19.anIntArray39[(local275 + 2 & 0x3) + local265 * 4];
							local299 = Static19.anIntArray39[(local275 + 3 & 0x3) + local265 * 4];
							if (!Static5.aBooleanArrayArray1[local299][1] || !Static5.aBooleanArrayArray1[local287][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local313 == 0) {
										local129++;
										local132[0] = local204;
										break;
									}
									if (local132[local313] == local204) {
										break;
									}
								}
							}
						}
					}
					if (local216 != 0 && local216 != local42) {
						local243 = Static171.method2693(local216 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local275 = arg2[local12 - 1][local23 - 1];
							local265 = arg5[local12 - 1][local23 - 1];
							local287 = Static19.anIntArray39[local265 * 4 + (local275 & 0x3)];
							local299 = Static19.anIntArray39[local265 * 4 + (local275 + 3 & 0x3)];
							if (!Static5.aBooleanArrayArray1[local287][1] || !Static5.aBooleanArrayArray1[local299][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local129 == local313) {
										local132[local129++] = local216;
										break;
									}
									if (local132[local313] == local216) {
										break;
									}
								}
							}
						}
					}
					if (local182 != 0 && local42 != local182) {
						local243 = Static171.method2693(local182 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local265 = arg5[local12 + 1][local23 - 1];
							local275 = arg2[local12 + 1][local23 - 1];
							local287 = Static19.anIntArray39[local265 * 4 + (local275 & 0x3)];
							local299 = Static19.anIntArray39[(local275 + 1 & 0x3) + local265 * 4];
							if (!Static5.aBooleanArrayArray1[local299][1] || !Static5.aBooleanArrayArray1[local287][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local129 == local313) {
										local132[local129++] = local182;
										break;
									}
									if (local132[local313] == local182) {
										break;
									}
								}
							}
						}
					}
					if (local228 != 0 && local228 != local42) {
						local243 = Static171.method2693(local228 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local275 = arg2[local12 + 1][local23 + 1];
							local265 = arg5[local12 + 1][local23 + 1];
							local287 = Static19.anIntArray39[(local275 + 2 & 0x3) + local265 * 4];
							local299 = Static19.anIntArray39[local265 * 4 + (local275 + 1 & 0x3)];
							if (!Static5.aBooleanArrayArray1[local287][1] || !Static5.aBooleanArrayArray1[local299][0]) {
								for (local313 = 0; local313 < 8; local313++) {
									if (local313 == local129) {
										local132[local129++] = local228;
										break;
									}
									if (local228 == local132[local313]) {
										break;
									}
								}
							}
						}
					}
					if (local148 != 0 && local42 != local148) {
						local243 = Static171.method2693(local148 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local136 = Static19.anIntArray39[arg5[local12][local23 + 1] * 4 + (arg2[local12][local23 + 1] + 2 & 0x3)];
							for (local759 = 0; local759 < 8; local759++) {
								if (local129 == local759) {
									local132[local129++] = local148;
									break;
								}
								if (local132[local759] == local148) {
									break;
								}
							}
						}
					}
					if (local160 != 0 && local160 != local42) {
						local243 = Static171.method2693(local160 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local134 = Static19.anIntArray39[(arg2[local12 - 1][local23] + 3 & 0x3) + arg5[local12 - 1][local23] * 4];
							for (local759 = 0; local759 < 8; local759++) {
								if (local129 == local759) {
									local132[local129++] = local160;
									break;
								}
								if (local132[local759] == local160) {
									break;
								}
							}
						}
					}
					if (local192 != 0 && local42 != local192) {
						local243 = Static171.method2693(local192 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local138 = Static19.anIntArray39[(arg2[local12][local23 - 1] & 0x3) + arg5[local12][local23 - 1] * 4];
							for (local759 = 0; local759 < 8; local759++) {
								if (local759 == local129) {
									local132[local129++] = local192;
									break;
								}
								if (local132[local759] == local192) {
									break;
								}
							}
						}
					}
					if (local170 != 0 && local42 != local170) {
						local243 = Static171.method2693(local170 - 1);
						if (local243.aBoolean78 && local243.anInt1071 != -1) {
							local150 = Static19.anIntArray39[(arg2[local12 + 1][local23] + 1 & 0x3) + arg5[local12 + 1][local23] * 4];
							for (local759 = 0; local759 < 8; local759++) {
								if (local129 == local759) {
									local132[local129++] = local170;
									break;
								}
								if (local132[local759] == local170) {
									break;
								}
							}
						}
					}
					for (local1013 = 0; local1013 < local129; local1013++) {
						local759 = local132[local1013];
						local1033 = Static5.aBooleanArrayArray1[local759 == local160 ? local134 : 0];
						@Pc(1042) boolean[] local1042 = Static5.aBooleanArrayArray1[local759 == local148 ? local136 : 0];
						local1055 = Static5.aBooleanArrayArray1[local192 == local759 ? local138 : 0];
						local1068 = Static5.aBooleanArrayArray1[local759 == local170 ? local150 : 0];
						@Pc(1074) Class35 local1074 = Static171.method2693(local759 - 1);
						@Pc(1079) Class4_Sub14 local1079 = Static230.method3623(local10, local1074);
						local1079.anInt1877 += 5;
						local1079.anInt1877 += local1042.length - 2;
						local1079.anInt1877 += local1033.length - 2;
						local1079.anInt1877 += local1055.length - 2;
						local1079.anInt1877 += local1068.length - 2;
						local1079.anInt1880++;
					}
				}
			}
		}
		@Pc(1141) Class4_Sub14 local1141;
		for (local1141 = (Class4_Sub14) local10.method2363(); local1141 != null; local1141 = (Class4_Sub14) local10.method2367()) {
			local1141.method1456();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if ((arg9[arg8][local12][local23] & 0x8) != 0) {
					local34 = 0;
				} else if ((arg9[1][local12][local23] & 0x2) == 2 && arg8 > 0) {
					local34 = arg8 - 1;
				} else {
					local34 = arg8;
				}
				local42 = arg4[local12][local23] & 0xFF;
				local129 = arg7[local12][local23] & 0xFF;
				if (local129 != 0) {
					@Pc(1227) Class35 local1227 = Static171.method2693(local129 - 1);
					if (local1227.anInt1071 == -1) {
						continue;
					}
					@Pc(1240) Class4_Sub14 local1240 = Static230.method3623(local10, local1227);
					@Pc(1246) byte local1246 = arg5[local12][local23];
					@Pc(1252) byte local1252 = arg2[local12][local23];
					local150 = Static153.method2442(local1227.anInt1071, local1227.anInt1069, arg0[local12][local23]);
					local148 = Static153.method2442(local1227.anInt1071, local1227.anInt1069, arg0[local12 + 1][local23]);
					local160 = Static153.method2442(local1227.anInt1071, local1227.anInt1069, arg0[local12 + 1][local23 + 1]);
					local192 = Static153.method2442(local1227.anInt1071, local1227.anInt1069, arg0[local12][local23 + 1]);
					Static238.method3676(local148, local160, local12, arg6, arg1, local23, local1240, local1252, local150, arg3, local1246, local192, arg10, local34, local42 != 0 && local1227.aBoolean78);
				}
				if ((arg4[local12][local23] & 0xFF) != 0 || local129 != 0 && arg5[local12][local23] == 0) {
					@Pc(1357) int local1357 = 0;
					@Pc(1360) int[] local1360 = new int[8];
					local148 = 0;
					local150 = 0;
					local138 = 0;
					local160 = arg7[local12][local23 + 1] & 0xFF;
					local134 = 0;
					local192 = arg7[local12 - 1][local23] & 0xFF;
					local170 = arg7[local12][local23 - 1] & 0xFF;
					local204 = arg7[local12 + 1][local23] & 0xFF;
					local182 = arg7[local12 - 1][local23 - 1] & 0xFF;
					local228 = arg7[local12 + 1][local23 - 1] & 0xFF;
					local216 = arg7[local12 - 1][local23 + 1] & 0xFF;
					local1013 = arg7[local12 + 1][local23 + 1] & 0xFF;
					@Pc(1497) byte local1497;
					@Pc(1468) Class35 local1468;
					@Pc(1539) int local1539;
					if (local216 == 0 || local129 == local216) {
						local216 = 0;
					} else {
						local1468 = Static171.method2693(local216 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local265 = arg2[local12 - 1][local23 + 1];
							local1497 = arg5[local12 - 1][local23 + 1];
							local299 = Static19.anIntArray39[(local265 + 2 & 0x3) + local1497 * 4];
							local313 = Static19.anIntArray39[(local265 + 3 & 0x3) + local1497 * 4];
							if (Static5.aBooleanArrayArray1[local313][1] && Static5.aBooleanArrayArray1[local299][0]) {
								local216 = 0;
							} else {
								for (local1539 = 0; local1539 < 8; local1539++) {
									if (local1539 == 0) {
										local1357++;
										local1360[0] = local216;
										break;
									}
									if (local1360[local1539] == local216) {
										break;
									}
								}
							}
						} else {
							local216 = 0;
						}
					}
					if (local182 == 0 || local129 == local182) {
						local182 = 0;
					} else {
						local1468 = Static171.method2693(local182 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local265 = arg2[local12 - 1][local23 - 1];
							local1497 = arg5[local12 - 1][local23 - 1];
							local299 = Static19.anIntArray39[local1497 * 4 + (local265 & 0x3)];
							local313 = Static19.anIntArray39[local1497 * 4 + (local265 + 3 & 0x3)];
							if (Static5.aBooleanArrayArray1[local299][1] && Static5.aBooleanArrayArray1[local313][0]) {
								local182 = 0;
							} else {
								for (local1539 = 0; local1539 < 8; local1539++) {
									if (local1539 == local1357) {
										local1360[local1357++] = local182;
										break;
									}
									if (local1360[local1539] == local182) {
										break;
									}
								}
							}
						} else {
							local182 = 0;
						}
					}
					if (local228 == 0 || local228 == local129) {
						local228 = 0;
					} else {
						local1468 = Static171.method2693(local228 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local265 = arg2[local12 + 1][local23 - 1];
							local1497 = arg5[local12 + 1][local23 - 1];
							local299 = Static19.anIntArray39[(local265 & 0x3) + local1497 * 4];
							local313 = Static19.anIntArray39[(local265 + 1 & 0x3) + local1497 * 4];
							if (Static5.aBooleanArrayArray1[local313][1] && Static5.aBooleanArrayArray1[local299][0]) {
								local228 = 0;
							} else {
								for (local1539 = 0; local1539 < 8; local1539++) {
									if (local1539 == local1357) {
										local1360[local1357++] = local228;
										break;
									}
									if (local228 == local1360[local1539]) {
										break;
									}
								}
							}
						} else {
							local228 = 0;
						}
					}
					if (local1013 == 0 || local1013 == local129) {
						local1013 = 0;
					} else {
						local1468 = Static171.method2693(local1013 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local265 = arg2[local12 + 1][local23 + 1];
							local1497 = arg5[local12 + 1][local23 + 1];
							local299 = Static19.anIntArray39[(local265 + 2 & 0x3) + local1497 * 4];
							local313 = Static19.anIntArray39[local1497 * 4 + (local265 + 1 & 0x3)];
							if (Static5.aBooleanArrayArray1[local299][1] && Static5.aBooleanArrayArray1[local313][0]) {
								local1013 = 0;
							} else {
								for (local1539 = 0; local1539 < 8; local1539++) {
									if (local1539 == local1357) {
										local1360[local1357++] = local1013;
										break;
									}
									if (local1360[local1539] == local1013) {
										break;
									}
								}
							}
						} else {
							local1013 = 0;
						}
					}
					@Pc(1981) int local1981;
					if (local160 != 0 && local129 != local160) {
						local1468 = Static171.method2693(local160 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local134 = Static19.anIntArray39[(arg2[local12][local23 + 1] + 2 & 0x3) + arg5[local12][local23 + 1] * 4];
							for (local1981 = 0; local1981 < 8; local1981++) {
								if (local1357 == local1981) {
									local1360[local1357++] = local160;
									break;
								}
								if (local160 == local1360[local1981]) {
									break;
								}
							}
						}
					}
					if (local192 != 0 && local129 != local192) {
						local1468 = Static171.method2693(local192 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local138 = Static19.anIntArray39[arg5[local12 - 1][local23] * 4 + (arg2[local12 - 1][local23] + 3 & 0x3)];
							for (local1981 = 0; local1981 < 8; local1981++) {
								if (local1357 == local1981) {
									local1360[local1357++] = local192;
									break;
								}
								if (local1360[local1981] == local192) {
									break;
								}
							}
						}
					}
					if (local170 != 0 && local170 != local129) {
						local1468 = Static171.method2693(local170 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local150 = Static19.anIntArray39[arg5[local12][local23 - 1] * 4 + (arg2[local12][local23 - 1] & 0x3)];
							for (local1981 = 0; local1981 < 8; local1981++) {
								if (local1981 == local1357) {
									local1360[local1357++] = local170;
									break;
								}
								if (local170 == local1360[local1981]) {
									break;
								}
							}
						}
					}
					if (local204 != 0 && local129 != local204) {
						local1468 = Static171.method2693(local204 - 1);
						if (local1468.aBoolean78 && local1468.anInt1071 != -1) {
							local148 = Static19.anIntArray39[(arg2[local12 + 1][local23] + 1 & 0x3) + arg5[local12 + 1][local23] * 4];
							for (local1981 = 0; local1981 < 8; local1981++) {
								if (local1357 == local1981) {
									local1360[local1357++] = local204;
									break;
								}
								if (local1360[local1981] == local204) {
									break;
								}
							}
						}
					}
					for (local759 = 0; local759 < local1357; local759++) {
						local1981 = local1360[local759];
						local1033 = Static5.aBooleanArrayArray1[local1981 == local160 ? local134 : 0];
						local1055 = Static5.aBooleanArrayArray1[local1981 == local192 ? local138 : 0];
						local1068 = Static5.aBooleanArrayArray1[local170 == local1981 ? local150 : 0];
						@Pc(2307) boolean[] local2307 = Static5.aBooleanArrayArray1[local204 == local1981 ? local148 : 0];
						@Pc(2313) Class35 local2313 = Static171.method2693(local1981 - 1);
						@Pc(2318) Class4_Sub14 local2318 = Static230.method3623(local10, local2313);
						@Pc(2336) int local2336 = Static153.method2442(local2313.anInt1071, local2313.anInt1069, arg0[local12][local23]) << 8 | 0xFF;
						@Pc(2354) int local2354 = Static153.method2442(local2313.anInt1071, local2313.anInt1069, arg0[local12 + 1][local23]) << 8 | 0xFF;
						@Pc(2376) int local2376 = Static153.method2442(local2313.anInt1071, local2313.anInt1069, arg0[local12 + 1][local23 + 1]) << 8 | 0xFF;
						@Pc(2394) int local2394 = Static153.method2442(local2313.anInt1071, local2313.anInt1069, arg0[local12][local23 + 1]) << 8 | 0xFF;
						@Pc(2409) boolean local2409 = local216 != local1981 && local1055[0] && local1033[1];
						@Pc(2424) boolean local2424 = local1013 != local1981 && local1033[0] && local2307[1];
						@Pc(2443) boolean local2443 = local1981 != local228 && local2307[0] && local1068[1];
						@Pc(2458) boolean local2458 = local182 != local1981 && local1068[0] && local1055[1];
						@Pc(2465) int local2465 = local1033.length + 6 - 2;
						@Pc(2472) int local2472 = local2465 + local1055.length - 2;
						@Pc(2479) int local2479 = local2472 + local1068.length - 2;
						@Pc(2486) int local2486 = local2479 + local2307.length - 2;
						@Pc(2507) int local2507 = Static255.method3848(local2336, arg6, local2376, local12, local2318, 64, local23, arg1, local2394, arg10, true, 0.0F, arg3, local2354, null, 64, 0);
						@Pc(2528) int local2528 = Static255.method3848(local2336, arg6, local2376, local12, local2318, 0, local23, arg1, local2394, arg10, local2409, 0.0F, arg3, local2354, null, 128, 0);
						@Pc(2531) int[] local2531 = new int[local2486];
						@Pc(2533) byte local2533 = 0;
						@Pc(2554) int local2554 = Static255.method3848(local2336, arg6, local2376, local12, local2318, 128, local23, arg1, local2394, arg10, local2424, 0.0F, arg3, local2354, null, 128, 0);
						@Pc(2575) int local2575 = Static255.method3848(local2336, arg6, local2376, local12, local2318, 0, local23, arg1, local2394, arg10, local2458, 0.0F, arg3, local2354, null, 0, 0);
						@Pc(2596) int local2596 = Static255.method3848(local2336, arg6, local2376, local12, local2318, 128, local23, arg1, local2394, arg10, local2443, 0.0F, arg3, local2354, null, 0, 0);
						@Pc(2599) int local2599 = local2533 + 1;
						local2531[0] = local2507;
						@Pc(2604) int local2604 = local2599 + 1;
						local2531[1] = local2554;
						if (local1033.length > 2) {
							local2604++;
							local2531[2] = Static255.method3848(local2336, arg6, local2376, local12, local2318, 64, local23, arg1, local2394, arg10, local1033[2], 0.0F, arg3, local2354, null, 128, 0);
						}
						local2531[local2604++] = local2528;
						if (local1055.length > 2) {
							local2531[local2604++] = Static255.method3848(local2336, arg6, local2376, local12, local2318, 0, local23, arg1, local2394, arg10, local1055[2], 0.0F, arg3, local2354, null, 64, 0);
						}
						local2531[local2604++] = local2575;
						if (local1068.length > 2) {
							local2531[local2604++] = Static255.method3848(local2336, arg6, local2376, local12, local2318, 64, local23, arg1, local2394, arg10, local1068[2], 0.0F, arg3, local2354, null, 0, 0);
						}
						local2531[local2604++] = local2596;
						if (local2307.length > 2) {
							local2531[local2604++] = Static255.method3848(local2336, arg6, local2376, local12, local2318, 128, local23, arg1, local2394, arg10, local2307[2], 0.0F, arg3, local2354, null, 64, 0);
						}
						local2531[local2604++] = local2554;
						local2318.method1451(local34, local12, local23, local2531, null, true);
					}
				}
			}
		}
		for (local1141 = (Class4_Sub14) local10.method2363(); local1141 != null; local1141 = (Class4_Sub14) local10.method2367()) {
			if (local1141.anInt1873 == 0) {
				local1141.method4391();
			} else {
				local1141.method1452();
			}
		}
		local12 = local10.method2362();
		@Pc(2802) Class4_Sub14[] local2802 = new Class4_Sub14[local12];
		@Pc(2805) long[] local2805 = new long[local12];
		local10.method2359(local2802);
		for (local42 = 0; local42 < local12; local42++) {
			local2805[local42] = local2802[local42].aLong200;
		}
		Static65.method1010(local2802, local2805);
		return local2802;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!lc;B)[Lclient!tb;")
	public static Class59_Sub2[] method1673(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1) {
		return Static243.method3715(arg0, arg1) ? Static2.method12() : null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)V")
	public static void method1676() {
		Static150.aClass33_25.method838(5);
	}
}
