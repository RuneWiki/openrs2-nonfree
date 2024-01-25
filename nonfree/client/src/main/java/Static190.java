import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
	public static int anInt3965;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "Ljava/lang/String;")
	public static final String aString147 = "flash1:";

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "[I")
	public static final int[] anIntArray377 = new int[50];

	@OriginalMember(owner = "client!mq", name = "U", descriptor = "I")
	public static int anInt3971 = 0;

	@OriginalMember(owner = "client!mq", name = "V", descriptor = "I")
	public static int anInt3972 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([[B[[I[[B[[BLclient!ii;Lclient!ck;Z[[BIIIILclient!ck;)V")
	public static void method3363(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class105 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class12 arg11) {
		for (@Pc(11) int local11 = 0; local11 < arg8; local11++) {
			@Pc(24) int local24 = arg8 - 1 <= local11 ? local11 : local11 + 1;
			for (@Pc(26) int local26 = 0; local26 < arg10; local26++) {
				@Pc(43) int local43 = arg10 - 1 <= local26 ? local26 : local26 + 1;
				if (Static25.method408() || Static217.method739(arg9, local26, local11, Static98.anInt1912)) {
					@Pc(57) boolean local57 = false;
					@Pc(59) boolean local59 = false;
					@Pc(62) boolean[] local62 = new boolean[4];
					@Pc(68) int local68 = arg2[local11][local26];
					@Pc(74) int local74 = arg0[local11][local26];
					@Pc(82) int local82 = arg3[local11][local26] & 0xFF;
					@Pc(90) int local90 = arg7[local11][local26] & 0xFF;
					@Pc(98) int local98 = arg7[local11][local43] & 0xFF;
					@Pc(106) int local106 = arg7[local24][local43] & 0xFF;
					@Pc(114) int local114 = arg7[local24][local26] & 0xFF;
					if (local82 != 0 || local90 != 0) {
						@Pc(131) Class175 local131 = local82 == 0 ? null : Static338.method5610(local82 - 1);
						if (local68 == 0 && local131 == null) {
							local68 = 12;
						}
						@Pc(153) Class107 local153 = local90 == 0 ? null : Static1.method14(local90 - 1);
						@Pc(155) Class175 local155 = local131;
						if (local131 != null) {
							if (local131.anInt5263 == -1 && local131.anInt5273 == -1) {
								local155 = local131;
								local131 = null;
							} else if (local153 != null && local68 != 0) {
								local59 = local131.aBoolean437;
							}
						}
						@Pc(243) int local243;
						@Pc(288) int local288;
						@Pc(337) int local337;
						@Pc(347) int local347;
						if ((local68 == 0 || local68 == 12) && local11 > 0 && local26 > 0 && arg8 > local11 && local26 < arg10) {
							@Pc(226) int local226 = local90 == arg7[local24][local43] ? 1 : -1;
							local243 = local90 == arg7[local11 - 1][local26 - 1] ? 1 : -1;
							@Pc(258) int local258 = local90 == arg7[local24][local26 - 1] ? 1 : -1;
							if (arg7[local11][local26 - 1] == local90) {
								local258++;
								local243++;
							} else {
								local258--;
								local243--;
							}
							local288 = arg7[local11 - 1][local43] == local90 ? 1 : -1;
							if (local90 == arg7[local24][local26]) {
								local226++;
								local258++;
							} else {
								local258--;
								local226--;
							}
							if (local90 == arg7[local11][local43]) {
								local288++;
								local226++;
							} else {
								local288--;
								local226--;
							}
							if (arg7[local11 - 1][local26] == local90) {
								local243++;
								local288++;
							} else {
								local288--;
								local243--;
							}
							local337 = local243 - local226;
							if (local337 < 0) {
								local337 = -local337;
							}
							local347 = local258 - local288;
							if (local347 < 0) {
								local347 = -local347;
							}
							if (local337 == local347) {
								local337 = arg11.method2704(local11, local26) - arg11.method2704(local24, local43);
								local347 = arg11.method2704(local24, local26) - arg11.method2704(local11, local43);
								if (local337 < 0) {
									local337 = -local337;
								}
								if (local347 < 0) {
									local347 = -local347;
								}
							}
							local74 = local337 < local347 ? 1 : 0;
						}
						for (local243 = 0; local243 < 13; local243++) {
							Static37.anIntArray60[local243] = -1;
							Static175.anIntArray350[local243] = 1;
						}
						@Pc(429) boolean[] local429 = local131 != null && local131.aBoolean437 ? Static50.aBooleanArrayArray2[local68] : Static94.aBooleanArrayArray3[local68];
						Static322.method5497(local153, arg2, local11, arg0, arg4, local62, local26, local68, arg10, arg8, local74, arg3, local131);
						@Pc(455) boolean local455 = local131 != null && local131.anInt5263 != local131.anInt5273;
						if (!local455) {
							for (local288 = 0; local288 < 8; local288++) {
								if (Static37.anIntArray60[local288] >= 0 && Static135.anIntArray270[local288] != Static147.anIntArray297[local288]) {
									local455 = true;
									break;
								}
							}
						}
						if (!local429[local74 + 1 & 0x3]) {
							local62[1] = Static273.method4894(local62[1], (Static175.anIntArray350[4] & Static175.anIntArray350[2]) == 0);
						}
						if (!local429[local74 + 3 & 0x3]) {
							local62[3] = Static273.method4894(local62[3], (Static175.anIntArray350[0] & Static175.anIntArray350[6]) == 0);
						}
						if (!local429[--local74 & 0x3]) {
							local62[0] = Static273.method4894(local62[0], (Static175.anIntArray350[2] & Static175.anIntArray350[0]) == 0);
						}
						if (!local429[local74 + 2 & 0x3]) {
							local62[2] = Static273.method4894(local62[2], (Static175.anIntArray350[6] & Static175.anIntArray350[4]) == 0);
						}
						if (!local59 && (local68 == 0 || local68 == 12)) {
							if (local62[0] && !local62[1] && !local62[2] && local62[3]) {
								local74 = 0;
								local62[0] = local62[3] = false;
								local68 = local68 == 0 ? 13 : 14;
							} else if (local62[0] && local62[1] && !local62[2] && !local62[3]) {
								local62[0] = local62[1] = false;
								local74 = 3;
								local68 = local68 == 0 ? 13 : 14;
							} else if (!local62[0] && local62[1] && local62[2] && !local62[3]) {
								local62[1] = local62[2] = false;
								local74 = 2;
								local68 = local68 == 0 ? 13 : 14;
							} else if (!local62[0] && !local62[1] && local62[2] && local62[3]) {
								local68 = local68 == 0 ? 13 : 14;
								local74 = 1;
								local62[2] = local62[3] = false;
							}
						}
						@Pc(769) boolean local769 = !local59 && !local62[0] && !local62[2] && !local62[1] && !local62[3];
						@Pc(771) int[] local771 = null;
						@Pc(779) int[] local779;
						@Pc(791) int[] local791;
						@Pc(783) int[] local783;
						if (local769) {
							local347 = local131 == null ? 0 : Static330.anIntArray649[local68];
							local783 = Static69.anIntArrayArray10[local68];
							local779 = Static293.anIntArrayArray46[local68];
							local337 = local153 == null ? 0 : Static22.anIntArray22[local68];
							local791 = Static120.anIntArrayArray23[local68];
						} else if (local59) {
							local779 = Static2.anIntArrayArray1[local68];
							local783 = Static313.anIntArrayArray53[local68];
							local771 = Static14.anIntArrayArray2[local68];
							local791 = Static246.anIntArrayArray40[local68];
							local347 = local131 == null ? 0 : Static154.anIntArray309[local68];
							local337 = local153 == null ? 0 : Static311.anIntArray621[local68];
						} else {
							local779 = Static191.anIntArrayArray34[local68];
							local791 = Static92.anIntArrayArray16[local68];
							local783 = Static98.anIntArrayArray17[local68];
							local337 = local153 == null ? 0 : Static115.anIntArray193[local68];
							local347 = local131 == null ? 0 : Static327.anIntArray647[local68];
							local771 = Static22.anIntArrayArray6[local68];
						}
						@Pc(873) int local873 = local347 + local337;
						if (local873 <= 0) {
							Static313.method5368(arg9, local11, local26);
						} else {
							if (local62[0]) {
								local873++;
							}
							if (local62[2]) {
								local873++;
							}
							if (local62[1]) {
								local873++;
							}
							if (local62[3]) {
								local873++;
							}
							@Pc(906) int local906 = 0;
							@Pc(908) int local908 = 0;
							@Pc(912) int local912 = local873 * 3;
							@Pc(919) int[] local919 = arg6 ? new int[local912] : null;
							@Pc(926) int[] local926 = local455 ? new int[local912] : null;
							@Pc(929) int[] local929 = new int[local912];
							@Pc(932) int[] local932 = new int[local912];
							@Pc(935) int[] local935 = new int[local912];
							@Pc(938) int[] local938 = new int[local912];
							@Pc(941) int[] local941 = new int[local912];
							@Pc(943) int local943 = -1;
							@Pc(945) int local945 = -1;
							@Pc(947) int local947 = 256;
							@Pc(1025) byte local1025;
							@Pc(969) int local969;
							@Pc(971) int local971;
							@Pc(1211) int local1211;
							@Pc(1217) int local1217;
							@Pc(1226) int local1226;
							@Pc(1230) int local1230;
							@Pc(1234) int local1234;
							@Pc(1311) int local1311;
							@Pc(1319) int local1319;
							if (local131 != null) {
								local943 = local131.anInt5263;
								local945 = arg4.method4259() ? local131.anInt5275 : local131.anInt5265;
								local947 = local131.anInt5268;
								local969 = Static344.method5761(arg4, local131);
								for (local971 = 0; local971 < local347; local971++) {
									if (local62[-local74 & 0x3] && local771[0] == local906) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 1;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 1;
										Static267.anIntArray537[4] = local791[local906];
										Static267.anIntArray537[5] = local783[local906];
										local1025 = 6;
									} else if (local62[2 - local74 & 0x3] && local771[2] == local906) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 5;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 5;
										Static267.anIntArray537[4] = local791[local906];
										local1025 = 6;
										Static267.anIntArray537[5] = local783[local906];
									} else if (local62[1 - local74 & 0x3] && local906 == local771[1]) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 3;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 3;
										Static267.anIntArray537[4] = local791[local906];
										local1025 = 6;
										Static267.anIntArray537[5] = local783[local906];
									} else if (local62[3 - local74 & 0x3] && local906 == local771[3]) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 7;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 7;
										Static267.anIntArray537[4] = local791[local906];
										local1025 = 6;
										Static267.anIntArray537[5] = local783[local906];
									} else {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = local791[local906];
										Static267.anIntArray537[2] = local783[local906];
										local1025 = 3;
									}
									local906++;
									for (local1211 = 0; local1211 < local1025; local1211++) {
										local1217 = Static267.anIntArray537[local1211];
										local1226 = local1217 - local74 * 2 & 0x7;
										local1230 = Static25.anIntArray24[local1217];
										local1234 = Static330.anIntArray650[local1217];
										if (local74 == 1) {
											local929[local908] = local1234;
											local932[local908] = 128 - local1230;
										} else if (local74 == 2) {
											local929[local908] = 128 - local1230;
											local932[local908] = 128 - local1234;
										} else if (local74 == 3) {
											local929[local908] = 128 - local1234;
											local932[local908] = local1230;
										} else {
											local929[local908] = local1230;
											local932[local908] = local1234;
										}
										if (arg6 && Static123.aBooleanArrayArray7[local68][local1217]) {
											local1311 = local929[local908] + (local11 << 7);
											local1319 = local932[local908] + (local26 << 7);
											local919[local908] = arg5.method2698(local1311, local1319) - arg11.method2698(local1311, local1319);
										}
										if (local1217 < 8 && local131.anInt5267 < Static37.anIntArray60[local1226]) {
											if (local926 != null) {
												local926[local908] = Static147.anIntArray297[local1226];
											}
											local941[local908] = Static85.anIntArray127[local1226];
											local938[local908] = Static201.anIntArray665[local1226];
											local935[local908] = Static135.anIntArray270[local1226];
										} else {
											if (local926 != null) {
												local926[local908] = local969;
											}
											local938[local908] = arg4.method4259() ? local131.anInt5275 : local131.anInt5265;
											local941[local908] = local131.anInt5268;
											local935[local908] = local943;
										}
										local908++;
									}
								}
								if (!arg6 && arg9 == 0) {
									Static77.method1306(local11, local26, local131.anInt5274, local131.anInt5270 * 8);
								}
								if (local68 != 12 && local131.anInt5263 != -1 && local131.aBoolean435) {
									local57 = true;
								}
							} else if (local769) {
								local906 = Static330.anIntArray649[local68];
							} else if (local59) {
								local906 = Static154.anIntArray309[local68];
							} else {
								local906 = Static327.anIntArray647[local68];
							}
							if (local153 != null) {
								if (local98 == 0) {
									local98 = local90;
								}
								if (local106 == 0) {
									local106 = local90;
								}
								if (local114 == 0) {
									local114 = local90;
								}
								@Pc(1494) Class107 local1494 = Static1.method14(local90 - 1);
								@Pc(1502) Class107 local1502 = Static1.method14(local98 - 1);
								@Pc(1508) Class107 local1508 = Static1.method14(local106 - 1);
								@Pc(1514) Class107 local1514 = Static1.method14(local114 - 1);
								for (local1226 = 0; local1226 < local337; local1226++) {
									if (local62[-local74 & 0x3] && local906 == local771[0]) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 1;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 1;
										Static267.anIntArray537[4] = local791[local906];
										Static267.anIntArray537[5] = local783[local906];
										local1025 = 6;
									} else if (local62[2 - local74 & 0x3] && local771[2] == local906) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 5;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 5;
										Static267.anIntArray537[4] = local791[local906];
										Static267.anIntArray537[5] = local783[local906];
										local1025 = 6;
									} else if (local62[1 - local74 & 0x3] && local906 == local771[1]) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 3;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 3;
										Static267.anIntArray537[4] = local791[local906];
										local1025 = 6;
										Static267.anIntArray537[5] = local783[local906];
									} else if (local62[3 - local74 & 0x3] && local771[3] == local906) {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = 7;
										Static267.anIntArray537[2] = local783[local906];
										Static267.anIntArray537[3] = 7;
										Static267.anIntArray537[4] = local791[local906];
										local1025 = 6;
										Static267.anIntArray537[5] = local783[local906];
									} else {
										Static267.anIntArray537[0] = local779[local906];
										Static267.anIntArray537[1] = local791[local906];
										local1025 = 3;
										Static267.anIntArray537[2] = local783[local906];
									}
									local906++;
									for (local1230 = 0; local1230 < local1025; local1230++) {
										local1234 = Static267.anIntArray537[local1230];
										local1311 = local1234 - local74 * 2 & 0x7;
										local1319 = Static25.anIntArray24[local1234];
										@Pc(1771) int local1771 = Static330.anIntArray650[local1234];
										@Pc(1778) int local1778;
										@Pc(1783) int local1783;
										if (local74 == 1) {
											local1778 = local1771;
											local1783 = 128 - local1319;
										} else if (local74 == 2) {
											local1778 = 128 - local1319;
											local1783 = 128 - local1771;
										} else if (local74 == 3) {
											local1778 = 128 - local1771;
											local1783 = local1319;
										} else {
											local1778 = local1319;
											local1783 = local1771;
										}
										local929[local908] = local1778;
										local932[local908] = local1783;
										@Pc(1839) int local1839;
										@Pc(1845) int local1845;
										if (arg6 && Static123.aBooleanArrayArray7[local68][local1234]) {
											local1839 = local1778 + (local11 << 7);
											local1845 = (local26 << 7) + local1783;
											local919[local908] = arg5.method2698(local1839, local1845) - arg11.method2698(local1839, local1845);
										}
										if (local1234 < 8 && Static37.anIntArray60[local1311] >= 0) {
											if (local926 != null) {
												local926[local908] = Static147.anIntArray297[local1311];
											}
											local941[local908] = Static85.anIntArray127[local1311];
											local938[local908] = Static201.anIntArray665[local1311];
											local935[local908] = Static135.anIntArray270[local1311];
										} else {
											if (local59 && Static123.aBooleanArrayArray7[local68][local1234]) {
												local938[local908] = local945;
												local941[local908] = local947;
												local935[local908] = local943;
											} else if (local1778 == 0 && local1783 == 0) {
												local935[local908] = arg1[local11][local26];
												local938[local908] = local1494.anInt2603;
												local941[local908] = local1494.anInt2594;
											} else if (local1778 == 0 && local1783 == 128) {
												local935[local908] = arg1[local11][local43];
												local938[local908] = local1502.anInt2603;
												local941[local908] = local1502.anInt2594;
											} else if (local1778 == 128 && local1783 == 128) {
												local935[local908] = arg1[local24][local43];
												local938[local908] = local1508.anInt2603;
												local941[local908] = local1508.anInt2594;
											} else if (local1778 == 128 && local1783 == 0) {
												local935[local908] = arg1[local24][local26];
												local938[local908] = local1514.anInt2603;
												local941[local908] = local1514.anInt2594;
											} else {
												if (local1778 >= 64) {
													if (local1783 < 64) {
														local938[local908] = local1514.anInt2603;
														local941[local908] = local1514.anInt2594;
													} else {
														local938[local908] = local1508.anInt2603;
														local941[local908] = local1508.anInt2594;
													}
												} else if (local1783 < 64) {
													local938[local908] = local1494.anInt2603;
													local941[local908] = local1494.anInt2594;
												} else {
													local938[local908] = local1502.anInt2603;
													local941[local908] = local1502.anInt2594;
												}
												local1839 = Static58.method1137(arg1[local11][local26], local1778 << 7 >> 7, arg1[local24][local26]);
												local1845 = Static58.method1137(arg1[local11][local43], local1778 << 7 >> 7, arg1[local24][local43]);
												local935[local908] = Static58.method1137(local1839, local1783 << 7 >> 7, local1845);
											}
											if (local926 != null) {
												local926[local908] = local935[local908];
											}
										}
										local908++;
									}
								}
								if (local68 != 0 && local153.aBoolean210) {
									local57 = true;
								}
							}
							local969 = arg11.method2704(local11, local26);
							local971 = arg11.method2704(local24, local26);
							local1211 = arg11.method2704(local24, local43);
							local1217 = arg11.method2704(local11, local43);
							if (arg9 > 0) {
								@Pc(2184) boolean local2184 = true;
								if (local90 == 0 && local68 != 0) {
									local2184 = false;
								}
								if (local82 > 0 && local155 != null && !local155.aBoolean436) {
									local2184 = false;
								}
								if (local2184 && local971 == local969 && local1211 == local969 && local969 == local1217) {
									Static268.aByteArrayArrayArray10[arg9][local11][local26] = (byte) (Static268.aByteArrayArrayArray10[arg9][local11][local26] | 0x4);
								}
							}
							local1226 = 0;
							local1230 = 0;
							if (arg6) {
								local1226 = Static2.method30(local11, local26);
								local1230 = Static209.method3766(local11, local26);
							}
							arg11.method2700(local11, local26, local929, local919, local932, local935, local926, local938, local941, local1226, local1230, local57);
							Static313.method5368(arg9, local11, local26);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZ)I")
	public static int method3364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray4.length; local25++) {
				if (arg0 == local12.anIntArray3[local25]) {
					local23 += local12.anIntArray4[local25];
				}
			}
			return local23;
		}
	}
}
