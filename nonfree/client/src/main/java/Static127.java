import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "Lclient!ld;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!ok;")
	public static Class147 aClass147_3;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static int anInt2851 = 1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(CI)C")
	public static char method2529(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IC)Z")
	public static boolean method2530(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[[BI[[BZ[[ILclient!vm;Lclient!bl;I[[BILclient!bl;[[B)V")
	public static void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) Class26 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(11) Class26 arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(7) int local7 = 0; local7 < arg8; local7++) {
			@Pc(20) int local20 = arg8 - 1 <= local7 ? local7 : local7 + 1;
			for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
				@Pc(35) int local35 = local22 < arg0 - 1 ? local22 + 1 : local22;
				if (Static313.method5257() || Static213.method3693(local22, arg2, Static45.anInt5654, local7)) {
					@Pc(49) boolean local49 = false;
					@Pc(51) boolean local51 = false;
					@Pc(54) boolean[] local54 = new boolean[4];
					@Pc(60) int local60 = arg11[local7][local22];
					@Pc(66) int local66 = arg3[local7][local22];
					@Pc(74) int local74 = arg1[local7][local22] & 0xFF;
					@Pc(82) int local82 = arg9[local7][local22] & 0xFF;
					@Pc(90) int local90 = arg9[local7][local35] & 0xFF;
					@Pc(98) int local98 = arg9[local20][local35] & 0xFF;
					@Pc(106) int local106 = arg9[local20][local22] & 0xFF;
					if (local74 != 0 || local82 != 0) {
						@Pc(123) Class71 local123 = local74 == 0 ? null : Static125.method5092(local74 - 1);
						if (local60 == 0 && local123 == null) {
							local60 = 12;
						}
						@Pc(142) Class172 local142 = local82 == 0 ? null : Static128.method2580(local82 - 1);
						@Pc(144) Class71 local144 = local123;
						if (local123 != null) {
							if (local123.anInt1792 == -1 && local123.anInt1789 == -1) {
								local144 = local123;
								local123 = null;
							} else if (local142 != null && local60 != 0) {
								local51 = local123.aBoolean142;
							}
						}
						@Pc(216) int local216;
						@Pc(263) int local263;
						@Pc(339) int local339;
						@Pc(351) int local351;
						if ((local60 == 0 || local60 == 12) && local7 > 0 && local22 > 0 && arg8 > local7 && arg0 > local22) {
							local216 = local82 == arg9[local7 - 1][local22 - 1] ? 1 : -1;
							@Pc(235) int local235 = arg9[local20][local22 - 1] == local82 ? 1 : -1;
							@Pc(248) int local248 = local82 == arg9[local20][local35] ? 1 : -1;
							local263 = arg9[local7 - 1][local35] == local82 ? 1 : -1;
							if (arg9[local7][local22 - 1] == local82) {
								local235++;
								local216++;
							} else {
								local235--;
								local216--;
							}
							if (arg9[local20][local22] == local82) {
								local248++;
								local235++;
							} else {
								local248--;
								local235--;
							}
							if (local82 == arg9[local7][local35]) {
								local248++;
								local263++;
							} else {
								local248--;
								local263--;
							}
							if (local82 == arg9[local7 - 1][local22]) {
								local216++;
								local263++;
							} else {
								local263--;
								local216--;
							}
							local339 = local216 - local248;
							if (local339 < 0) {
								local339 = -local339;
							}
							local351 = local235 - local263;
							if (local351 < 0) {
								local351 = -local351;
							}
							if (local351 == local339) {
								local339 = arg7.method4996(local7, local22) - arg7.method4996(local20, local35);
								if (local339 < 0) {
									local339 = -local339;
								}
								local351 = arg7.method4996(local20, local22) - arg7.method4996(local7, local35);
								if (local351 < 0) {
									local351 = -local351;
								}
							}
							local66 = local339 < local351 ? 1 : 0;
						}
						for (local216 = 0; local216 < 13; local216++) {
							Static60.anIntArray143[local216] = -1;
							Static87.anIntArray197[local216] = 1;
						}
						@Pc(436) boolean[] local436 = local123 != null && local123.aBoolean142 ? Static110.aBooleanArrayArray3[local60] : Static37.aBooleanArrayArray1[local60];
						Static323.method5321(arg1, arg11, local54, arg6, arg0, local60, arg3, local123, local142, local7, local22, arg8, local66);
						@Pc(466) boolean local466 = local123 != null && local123.anInt1792 != local123.anInt1789;
						if (!local466) {
							for (local263 = 0; local263 < 8; local263++) {
								if (Static60.anIntArray143[local263] >= 0 && Static222.anIntArray380[local263] != Static151.anIntArray299[local263]) {
									local466 = true;
									break;
								}
							}
						}
						if (!local436[local66 + 1 & 0x3]) {
							local54[1] = Static284.method4851(local54[1], (Static87.anIntArray197[2] & Static87.anIntArray197[4]) == 0);
						}
						if (!local436[local66 + 3 & 0x3]) {
							local54[3] = Static284.method4851(local54[3], (Static87.anIntArray197[0] & Static87.anIntArray197[6]) == 0);
						}
						if (!local436[local66 & 0x3]) {
							local54[0] = Static284.method4851(local54[0], (Static87.anIntArray197[2] & Static87.anIntArray197[0]) == 0);
						}
						if (!local436[local66 + 2 & 0x3]) {
							local54[2] = Static284.method4851(local54[2], (Static87.anIntArray197[4] & Static87.anIntArray197[6]) == 0);
						}
						if (!local51 && (local60 == 0 || local60 == 12)) {
							if (local54[0] && !local54[1] && !local54[2] && local54[3]) {
								local54[0] = local54[3] = false;
								local60 = local60 == 0 ? 13 : 14;
								local66 = 0;
							} else if (local54[0] && local54[1] && !local54[2] && !local54[3]) {
								local66 = 3;
								local54[0] = local54[1] = false;
								local60 = local60 == 0 ? 13 : 14;
							} else if (!local54[0] && local54[1] && local54[2] && !local54[3]) {
								local66 = 2;
								local60 = local60 == 0 ? 13 : 14;
								local54[1] = local54[2] = false;
							} else if (!local54[0] && !local54[1] && local54[2] && local54[3]) {
								local66 = 1;
								local54[2] = local54[3] = false;
								local60 = local60 == 0 ? 13 : 14;
							}
						}
						@Pc(776) boolean local776 = !local51 && !local54[0] && !local54[2] && !local54[1] && !local54[3];
						@Pc(778) int[] local778 = null;
						@Pc(808) int[] local808;
						@Pc(784) int[] local784;
						@Pc(788) int[] local788;
						if (local776) {
							local784 = Static297.anIntArrayArray59[local60];
							local788 = Static226.anIntArrayArray42[local60];
							local339 = local142 == null ? 0 : Static89.anIntArray201[local60];
							local351 = local123 == null ? 0 : Static329.anIntArray520[local60];
							local808 = Static107.anIntArrayArray62[local60];
						} else if (local51) {
							local351 = local123 == null ? 0 : Static27.anIntArray85[local60];
							local339 = local142 == null ? 0 : Static260.anIntArray446[local60];
							local808 = Static292.anIntArrayArray56[local60];
							local784 = Static161.anIntArrayArray35[local60];
							local788 = Static176.anIntArrayArray39[local60];
							local778 = Static189.anIntArrayArray40[local60];
						} else {
							local808 = Static287.anIntArrayArray55[local60];
							local778 = Static72.anIntArrayArray18[local60];
							local339 = local142 == null ? 0 : Static128.anIntArray267[local60];
							local788 = Static100.anIntArrayArray30[local60];
							local351 = local123 == null ? 0 : Static255.anIntArray433[local60];
							local784 = Static268.anIntArrayArray52[local60];
						}
						@Pc(881) int local881 = local339 + local351;
						if (local881 <= 0) {
							Static333.method78(arg2, local7, local22);
						} else {
							if (local54[0]) {
								local881++;
							}
							if (local54[2]) {
								local881++;
							}
							if (local54[1]) {
								local881++;
							}
							if (local54[3]) {
								local881++;
							}
							@Pc(911) int local911 = 0;
							@Pc(913) int local913 = 0;
							@Pc(917) int local917 = local881 * 3;
							@Pc(924) int[] local924 = arg4 ? new int[local917] : null;
							@Pc(931) int[] local931 = local466 ? new int[local917] : null;
							@Pc(934) int[] local934 = new int[local917];
							@Pc(937) int[] local937 = new int[local917];
							@Pc(940) int[] local940 = new int[local917];
							@Pc(943) int[] local943 = new int[local917];
							@Pc(946) int[] local946 = new int[local917];
							@Pc(948) int local948 = -1;
							@Pc(950) int local950 = -1;
							@Pc(952) int local952 = 256;
							@Pc(1062) byte local1062;
							@Pc(1002) int local1002;
							@Pc(1004) int local1004;
							@Pc(1236) int local1236;
							@Pc(1242) int local1242;
							@Pc(1251) int local1251;
							@Pc(1255) int local1255;
							@Pc(1259) int local1259;
							@Pc(1335) int local1335;
							@Pc(1343) int local1343;
							if (local123 != null) {
								local948 = local123.anInt1792;
								local950 = arg6.method4463() ? local123.anInt1788 : local123.anInt1784;
								local952 = local123.anInt1793;
								local1002 = Static145.method2845(local123, arg6);
								for (local1004 = 0; local1004 < local351; local1004++) {
									if (local54[-local66 & 0x3] && local911 == local778[0]) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 1;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 1;
										Static121.anIntArray255[4] = local784[local911];
										Static121.anIntArray255[5] = local788[local911];
										local1062 = 6;
									} else if (local54[2 - local66 & 0x3] && local778[2] == local911) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 5;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 5;
										Static121.anIntArray255[4] = local784[local911];
										local1062 = 6;
										Static121.anIntArray255[5] = local788[local911];
									} else if (local54[1 - local66 & 0x3] && local778[1] == local911) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 3;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 3;
										Static121.anIntArray255[4] = local784[local911];
										local1062 = 6;
										Static121.anIntArray255[5] = local788[local911];
									} else if (local54[3 - local66 & 0x3] && local911 == local778[3]) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 7;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 7;
										Static121.anIntArray255[4] = local784[local911];
										Static121.anIntArray255[5] = local788[local911];
										local1062 = 6;
									} else {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = local784[local911];
										local1062 = 3;
										Static121.anIntArray255[2] = local788[local911];
									}
									local911++;
									for (local1236 = 0; local1236 < local1062; local1236++) {
										local1242 = Static121.anIntArray255[local1236];
										local1251 = local1242 - local66 * 2 & 0x7;
										local1255 = Static327.anIntArray510[local1242];
										local1259 = Static182.anIntArray345[local1242];
										if (local66 == 1) {
											local934[local913] = local1259;
											local937[local913] = 128 - local1255;
										} else if (local66 == 2) {
											local934[local913] = 128 - local1255;
											local937[local913] = 128 - local1259;
										} else if (local66 == 3) {
											local934[local913] = 128 - local1259;
											local937[local913] = local1255;
										} else {
											local934[local913] = local1255;
											local937[local913] = local1259;
										}
										if (arg4 && Static281.aBooleanArrayArray5[local60][local1242]) {
											local1335 = local934[local913] + (local7 << 7);
											local1343 = local937[local913] + (local22 << 7);
											local924[local913] = arg10.method4990(local1335, local1343) - arg7.method4990(local1335, local1343);
										}
										if (local1242 < 8 && Static60.anIntArray143[local1251] > local123.anInt1787) {
											if (local931 != null) {
												local931[local913] = Static222.anIntArray380[local1251];
											}
											local946[local913] = Static159.anIntArray312[local1251];
											local943[local913] = Static84.anIntArray177[local1251];
											local940[local913] = Static151.anIntArray299[local1251];
										} else {
											if (local931 != null) {
												local931[local913] = local1002;
											}
											local943[local913] = arg6.method4463() ? local123.anInt1788 : local123.anInt1784;
											local946[local913] = local123.anInt1793;
											local940[local913] = local948;
										}
										local913++;
									}
								}
								if (!arg4 && arg2 == 0) {
									Static101.method2749(local7, local22, local123.anInt1786, local123.anInt1790 * 8);
								}
								if (local60 != 12 && local123.anInt1792 != -1 && local123.aBoolean143) {
									local49 = true;
								}
							} else if (local776) {
								local911 = Static329.anIntArray520[local60];
							} else if (local51) {
								local911 = Static27.anIntArray85[local60];
							} else {
								local911 = Static255.anIntArray433[local60];
							}
							if (local142 != null) {
								if (local90 == 0) {
									local90 = local82;
								}
								if (local98 == 0) {
									local98 = local82;
								}
								if (local106 == 0) {
									local106 = local82;
								}
								@Pc(1487) Class172 local1487 = Static128.method2580(local82 - 1);
								@Pc(1493) Class172 local1493 = Static128.method2580(local90 - 1);
								@Pc(1499) Class172 local1499 = Static128.method2580(local98 - 1);
								@Pc(1505) Class172 local1505 = Static128.method2580(local106 - 1);
								for (local1251 = 0; local1251 < local339; local1251++) {
									if (local54[-local66 & 0x3] && local911 == local778[0]) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 1;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 1;
										Static121.anIntArray255[4] = local784[local911];
										local1062 = 6;
										Static121.anIntArray255[5] = local788[local911];
									} else if (local54[2 - local66 & 0x3] && local778[2] == local911) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 5;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 5;
										Static121.anIntArray255[4] = local784[local911];
										local1062 = 6;
										Static121.anIntArray255[5] = local788[local911];
									} else if (local54[1 - local66 & 0x3] && local911 == local778[1]) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 3;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 3;
										Static121.anIntArray255[4] = local784[local911];
										Static121.anIntArray255[5] = local788[local911];
										local1062 = 6;
									} else if (local54[3 - local66 & 0x3] && local911 == local778[3]) {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = 7;
										Static121.anIntArray255[2] = local788[local911];
										Static121.anIntArray255[3] = 7;
										Static121.anIntArray255[4] = local784[local911];
										local1062 = 6;
										Static121.anIntArray255[5] = local788[local911];
									} else {
										Static121.anIntArray255[0] = local808[local911];
										Static121.anIntArray255[1] = local784[local911];
										local1062 = 3;
										Static121.anIntArray255[2] = local788[local911];
									}
									for (local1255 = 0; local1255 < local1062; local1255++) {
										local1259 = Static121.anIntArray255[local1255];
										local1335 = local1259 - local66 * 2 & 0x7;
										local1343 = Static327.anIntArray510[local1259];
										@Pc(1755) int local1755 = Static182.anIntArray345[local1259];
										@Pc(1760) int local1760;
										@Pc(1765) int local1765;
										if (local66 == 1) {
											local1760 = local1755;
											local1765 = 128 - local1343;
										} else if (local66 == 2) {
											local1760 = 128 - local1343;
											local1765 = 128 - local1755;
										} else if (local66 == 3) {
											local1765 = local1343;
											local1760 = 128 - local1755;
										} else {
											local1760 = local1343;
											local1765 = local1755;
										}
										local934[local913] = local1760;
										local937[local913] = local1765;
										@Pc(1823) int local1823;
										@Pc(1829) int local1829;
										if (arg4 && Static281.aBooleanArrayArray5[local60][local1259]) {
											local1823 = local1760 + (local7 << 7);
											local1829 = local1765 + (local22 << 7);
											local924[local913] = arg10.method4990(local1823, local1829) - arg7.method4990(local1823, local1829);
										}
										if (local1259 < 8 && Static60.anIntArray143[local1335] >= 0) {
											if (local931 != null) {
												local931[local913] = Static222.anIntArray380[local1335];
											}
											local946[local913] = Static159.anIntArray312[local1335];
											local943[local913] = Static84.anIntArray177[local1335];
											local940[local913] = Static151.anIntArray299[local1335];
										} else {
											if (local51 && Static281.aBooleanArrayArray5[local60][local1259]) {
												local943[local913] = local950;
												local946[local913] = local952;
												local940[local913] = local948;
											} else if (local1760 == 0 && local1765 == 0) {
												local940[local913] = arg5[local7][local22];
												local943[local913] = local1487.anInt5444;
												local946[local913] = local1487.anInt5451;
											} else if (local1760 == 0 && local1765 == 128) {
												local940[local913] = arg5[local7][local35];
												local943[local913] = local1493.anInt5444;
												local946[local913] = local1493.anInt5451;
											} else if (local1760 == 128 && local1765 == 128) {
												local940[local913] = arg5[local20][local35];
												local943[local913] = local1499.anInt5444;
												local946[local913] = local1499.anInt5451;
											} else if (local1760 == 128 && local1765 == 0) {
												local940[local913] = arg5[local20][local22];
												local943[local913] = local1505.anInt5444;
												local946[local913] = local1505.anInt5451;
											} else {
												if (local1760 >= 64) {
													if (local1765 >= 64) {
														local943[local913] = local1499.anInt5444;
														local946[local913] = local1499.anInt5451;
													} else {
														local943[local913] = local1505.anInt5444;
														local946[local913] = local1505.anInt5451;
													}
												} else if (local1765 < 64) {
													local943[local913] = local1487.anInt5444;
													local946[local913] = local1487.anInt5451;
												} else {
													local943[local913] = local1493.anInt5444;
													local946[local913] = local1493.anInt5451;
												}
												local1823 = Static239.method5166(local1760 << 7 >> 7, arg5[local20][local22], arg5[local7][local22]);
												local1829 = Static239.method5166(local1760 << 7 >> 7, arg5[local20][local35], arg5[local7][local35]);
												local940[local913] = Static239.method5166(local1765 << 7 >> 7, local1829, local1823);
											}
											if (local931 != null) {
												local931[local913] = local940[local913];
											}
										}
										local913++;
									}
									local911++;
								}
								if (local60 != 0 && local142.aBoolean483) {
									local49 = true;
								}
							}
							local1002 = arg7.method4996(local7, local22);
							local1004 = arg7.method4996(local20, local22);
							local1236 = arg7.method4996(local20, local35);
							local1242 = arg7.method4996(local7, local35);
							if (arg2 > 0) {
								@Pc(2168) boolean local2168 = true;
								if (local82 == 0 && local60 != 0) {
									local2168 = false;
								}
								if (local74 > 0 && local144 != null && !local144.aBoolean144) {
									local2168 = false;
								}
								if (local2168 && local1002 == local1004 && local1002 == local1236 && local1242 == local1002) {
									Static83.aByteArrayArrayArray2[arg2][local7][local22] = (byte) (Static83.aByteArrayArrayArray2[arg2][local7][local22] | 0x4);
								}
							}
							local1251 = 0;
							local1255 = 0;
							if (arg4) {
								local1251 = Static94.method1676(local7, local22);
								local1255 = Static243.method4214(local7, local22);
							}
							arg7.method5000(local7, local22, local934, local924, local937, local940, local931, local943, local946, local1251, local1255, local49);
							Static333.method78(arg2, local7, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public static void method2539() {
		@Pc(8) int local8 = Static40.aByteArrayArray1.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static40.aByteArrayArray1[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static311.anInt6244; local20++) {
					if (Static313.anIntArray505[local10] == Static265.anIntArray450[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static265.anIntArray450[Static311.anInt6244] = Static313.anIntArray505[local10];
					local18 = Static311.anInt6244++;
				}
				@Pc(60) Class4_Sub7 local60 = new Class4_Sub7(Static40.aByteArrayArray1[local10]);
				@Pc(62) int local62 = 0;
				while (local60.anInt2667 < Static40.aByteArrayArray1[local10].length && local62 < 511 && Static282.anInt5712 < 1023) {
					@Pc(83) int local83 = local18 | local62++ << 6;
					@Pc(87) int local87 = local60.method2404();
					@Pc(91) int local91 = local87 >> 14;
					@Pc(97) int local97 = local87 >> 7 & 0x3F;
					@Pc(101) int local101 = local87 & 0x3F;
					@Pc(113) int local113 = local97 + (Static313.anIntArray505[local10] >> 8) * 64 - Static10.anInt231;
					@Pc(125) int local125 = local101 + (Static313.anIntArray505[local10] & 0xFF) * 64 - Static81.anInt1732;
					@Pc(131) Class34 local131 = Static165.method2927(local60.method2404());
					if (Static101.aClass2_Sub2_Sub1_Sub2Array6[local83] == null && (local131.aByte19 & 0x1) > 0 && Static45.anInt5654 == local91 && local113 >= 0 && Static92.anInt2048 > local113 + local131.anInt842 && local125 >= 0 && Static290.anInt5893 > local125 + local131.anInt842) {
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local83] = new Class2_Sub2_Sub1_Sub2();
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local83].anInt6535 = local83;
						@Pc(179) Class2_Sub2_Sub1_Sub2 local179 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local83];
						Static332.anIntArray523[Static282.anInt5712++] = local83;
						local179.anInt6515 = Static342.anInt6706;
						local179.method5445(local131);
						local179.method5433(local179.aClass34_1.anInt842);
						local179.anInt6514 = local179.aClass34_1.anInt852 << 3;
						if (local179.anInt6514 == 0) {
							local179.method5421(0);
						} else {
							local179.method5421(Static258.anIntArray438[local179.aClass34_1.aByte18 - 1]);
						}
						local179.method5422(local113, local91, true, local179.method5425(), local125);
					}
				}
			}
		}
	}
}
