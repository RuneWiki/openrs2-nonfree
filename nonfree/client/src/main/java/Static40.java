import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt843;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!dh;")
	public static Class33 aClass33_5 = new Class33(50);

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt849 = -1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt850 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!p;)Lclient!kh;")
	public static Class91 method670(@OriginalArg(1) Class4_Sub17 arg0) {
		@Pc(12) Class91 local12 = new Class91();
		local12.anInt2857 = arg0.method1837();
		local12.aClass4_Sub2_Sub14_1 = Static248.method3758(local12.anInt2857);
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lclient!m;")
	public static Class104 method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass104_1;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lclient!cf;")
	public static Class24 method673(@OriginalArg(0) int arg0) {
		@Pc(10) Class24 local10 = (Class24) Static150.aClass33_25.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23 = Static95.aClass98_57.method2396(arg0, 31);
		local10 = new Class24();
		if (local23 != null) {
			local10.method485(new Class4_Sub17(local23), arg0);
		}
		Static150.aClass33_25.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method674() {
		aBooleanArrayArray2 = null;
		aClass33_5 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!cc;)Z")
	public static boolean method675(@OriginalArg(0) Class22 arg0) {
		if (Static255.aBoolean311) {
			if (method681(arg0).anInt3558 != 0) {
				return false;
			}
			if (arg0.anInt542 == 0) {
				return false;
			}
		}
		return arg0.aBoolean35;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!cc;IIIIIII)V")
	public static void method677(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class22 local9 = arg0[local1];
			if (local9 != null && local9.anInt587 == arg1 && (!local9.aBoolean33 || local9.anInt542 == 0 || local9.aBoolean48 || method681(local9).anInt3558 != 0 || local9 == Static207.aClass22_17 || local9.anInt612 == 1338) && (!local9.aBoolean33 || !method675(local9))) {
				@Pc(50) int local50 = local9.anInt569 + arg6;
				@Pc(55) int local55 = local9.anInt593 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt542 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt546;
					@Pc(78) int local78 = local55 + local9.anInt602;
					if (local9.anInt542 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static45.aClass22_6) {
					Static136.aBoolean187 = true;
					Static239.anInt4612 = local50;
					Static263.anInt910 = local55;
				}
				if (!local9.aBoolean33 || local61 < local65 && local63 < local67) {
					if (local9.anInt542 == 0) {
						if (!local9.aBoolean33 && method675(local9) && Static126.aClass22_12 != local9) {
							continue;
						}
						if (local9.aBoolean39 && Static72.anInt1326 >= local61 && Static117.anInt2589 >= local63 && Static72.anInt1326 < local65 && Static117.anInt2589 < local67) {
							for (@Pc(164) Class4_Sub22 local164 = (Class4_Sub22) Static243.aClass10_52.method190(); local164 != null; local164 = (Class4_Sub22) Static243.aClass10_52.method191()) {
								if (local164.aBoolean211) {
									local164.method4391();
									local164.aClass22_15.aBoolean32 = false;
								}
							}
							if (Static103.anInt2190 == 0) {
								Static45.aClass22_6 = null;
								Static207.aClass22_17 = null;
							}
							Static277.anInt5174 = 0;
						}
					}
					if (local9.aBoolean33) {
						@Pc(207) boolean local207;
						if (Static72.anInt1326 >= local61 && Static117.anInt2589 >= local63 && Static72.anInt1326 < local65 && Static117.anInt2589 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static71.anInt1316 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static44.anInt885 == 1 && Static35.anInt708 >= local61 && Static147.anInt2993 >= local63 && Static35.anInt708 < local65 && Static147.anInt2993 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray7 != null) {
							for (local243 = 0; local243 < local9.aByteArray7.length; local243++) {
								if (Static96.aBooleanArray15[local9.aByteArray7[local243]]) {
									if (local9.anIntArray53 == null || Static104.anInt2226 >= local9.anIntArray53[local243]) {
										@Pc(279) byte local279 = local9.aByteArray6[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static96.aBooleanArray15[86] && !Static96.aBooleanArray15[82] && !Static96.aBooleanArray15[81]) && ((local279 & 0x2) == 0 || Static96.aBooleanArray15[86]) && ((local279 & 0x1) == 0 || Static96.aBooleanArray15[82]) && ((local279 & 0x4) == 0 || Static96.aBooleanArray15[81])) {
											Static57.method929(-1, local243 + 1, "", local9.anInt596);
											local339 = local9.anIntArray57[local243];
											if (local9.anIntArray53 == null) {
												local9.anIntArray53 = new int[local9.aByteArray7.length];
											}
											if (local339 == 0) {
												local9.anIntArray53[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray53[local243] = Static104.anInt2226 + local339;
											}
										}
									}
								} else if (local9.anIntArray53 != null) {
									local9.anIntArray53[local243] = 0;
								}
							}
						}
						if (local221) {
							Static44.method706(Static35.anInt708 - local50, Static147.anInt2993 - local55, local9);
						}
						if (Static45.aClass22_6 != null && Static45.aClass22_6 != local9 && local207 && method681(local9).method2840()) {
							Static68.aClass22_7 = local9;
						}
						if (local9 == Static207.aClass22_17) {
							Static247.aBoolean304 = true;
							Static214.anInt4262 = local50;
							Static177.anInt3483 = local55;
						}
						if (local9.aBoolean48 || local9.anInt612 != 0) {
							@Pc(416) Class4_Sub22 local416;
							if (local207 && Static44.anInt887 != 0 && local9.anObjectArray20 != null) {
								local416 = new Class4_Sub22();
								local416.aBoolean211 = true;
								local416.aClass22_15 = local9;
								local416.anInt3408 = Static44.anInt887;
								local416.anObjectArray32 = local9.anObjectArray20;
								Static243.aClass10_52.method184(local416);
							}
							if (Static45.aClass22_6 != null || Static24.aClass22_2 != null || Static142.aBoolean192 || local9.anInt612 != 1400 && Static277.anInt5174 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt612 != 0) {
								if (local9.anInt612 == 1337) {
									Static221.aClass22_18 = local9;
									continue;
								}
								if (local9.anInt612 == 1338) {
									if (local221) {
										Static211.anInt4222 = Static35.anInt708 - local50;
										Static11.anInt213 = Static147.anInt2993 - local55;
									}
									continue;
								}
								if (local9.anInt612 == 1400) {
									Static138.aClass22_13 = local9;
									if (local221) {
										if (Static96.aBooleanArray15[82] && Static176.anInt829 > 0) {
											local243 = (int) ((double) (Static35.anInt708 - local50 - local9.anInt546 / 2) * 2.0D / (double) Static251.aFloat47);
											local522 = (int) ((double) (Static147.anInt2993 - local55 - local9.anInt602 / 2) * 2.0D / (double) Static251.aFloat47);
											local339 = Static295.anInt5481 + local243;
											@Pc(530) int local530 = Static96.anInt2064 + local522;
											@Pc(534) int local534 = local339 + Static81.anInt4033;
											@Pc(542) int local542 = Static92.anInt1912 + Static132.anInt2785 - local530 - 1;
											@Pc(545) Class4_Sub2_Sub9 local545 = Static111.method1918();
											@Pc(551) int[] local551 = local545.method1420(local534, local542);
											if (local551 != null) {
												Static213.method3420(local551[2], local551[1], local551[0]);
												Static47.method749();
											}
											continue;
										}
										Static277.anInt5174 = 1;
										Static220.anInt4359 = Static72.anInt1326;
										Static89.anInt1844 = Static117.anInt2589;
										continue;
									}
									if (local212 && Static277.anInt5174 > 0) {
										if (Static277.anInt5174 == 1 && (Static220.anInt4359 != Static72.anInt1326 || Static89.anInt1844 != Static117.anInt2589)) {
											Static157.anInt3151 = Static295.anInt5481;
											Static84.anInt1701 = Static96.anInt2064;
											Static277.anInt5174 = 2;
										}
										if (Static277.anInt5174 == 2) {
											Static246.method4393(Static157.anInt3151 + (int) ((double) (Static220.anInt4359 - Static72.anInt1326) * 2.0D / (double) Static96.aFloat15));
											Static63.method970(Static84.anInt1701 + (int) ((double) (Static89.anInt1844 - Static117.anInt2589) * 2.0D / (double) Static96.aFloat15));
										}
										continue;
									}
									Static277.anInt5174 = 0;
									continue;
								}
								if (local9.anInt612 == 1401) {
									if (local212) {
										Static213.method3418(Static72.anInt1326 - local50, local9.anInt546, Static117.anInt2589 - local55, local9.anInt602);
									}
									continue;
								}
								if (local9.anInt612 == 1402) {
									if (!Static178.aBoolean216) {
										Static81.method3274(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean41 && local221) {
								local9.aBoolean41 = true;
								if (local9.anObjectArray1 != null) {
									local416 = new Class4_Sub22();
									local416.aBoolean211 = true;
									local416.aClass22_15 = local9;
									local416.anInt3402 = Static35.anInt708 - local50;
									local416.anInt3408 = Static147.anInt2993 - local55;
									local416.anObjectArray32 = local9.anObjectArray1;
									Static243.aClass10_52.method184(local416);
								}
							}
							if (local9.aBoolean41 && local212 && local9.anObjectArray12 != null) {
								local416 = new Class4_Sub22();
								local416.aBoolean211 = true;
								local416.aClass22_15 = local9;
								local416.anInt3402 = Static72.anInt1326 - local50;
								local416.anInt3408 = Static117.anInt2589 - local55;
								local416.anObjectArray32 = local9.anObjectArray12;
								Static243.aClass10_52.method184(local416);
							}
							if (local9.aBoolean41 && !local212) {
								local9.aBoolean41 = false;
								if (local9.anObjectArray18 != null) {
									local416 = new Class4_Sub22();
									local416.aBoolean211 = true;
									local416.aClass22_15 = local9;
									local416.anInt3402 = Static72.anInt1326 - local50;
									local416.anInt3408 = Static117.anInt2589 - local55;
									local416.anObjectArray32 = local9.anObjectArray18;
									Static257.aClass10_54.method184(local416);
								}
							}
							if (local212 && local9.anObjectArray28 != null) {
								local416 = new Class4_Sub22();
								local416.aBoolean211 = true;
								local416.aClass22_15 = local9;
								local416.anInt3402 = Static72.anInt1326 - local50;
								local416.anInt3408 = Static117.anInt2589 - local55;
								local416.anObjectArray32 = local9.anObjectArray28;
								Static243.aClass10_52.method184(local416);
							}
							if (!local9.aBoolean32 && local207) {
								local9.aBoolean32 = true;
								if (local9.anObjectArray11 != null) {
									local416 = new Class4_Sub22();
									local416.aBoolean211 = true;
									local416.aClass22_15 = local9;
									local416.anInt3402 = Static72.anInt1326 - local50;
									local416.anInt3408 = Static117.anInt2589 - local55;
									local416.anObjectArray32 = local9.anObjectArray11;
									Static243.aClass10_52.method184(local416);
								}
							}
							if (local9.aBoolean32 && local207 && local9.anObjectArray6 != null) {
								local416 = new Class4_Sub22();
								local416.aBoolean211 = true;
								local416.aClass22_15 = local9;
								local416.anInt3402 = Static72.anInt1326 - local50;
								local416.anInt3408 = Static117.anInt2589 - local55;
								local416.anObjectArray32 = local9.anObjectArray6;
								Static243.aClass10_52.method184(local416);
							}
							if (local9.aBoolean32 && !local207) {
								local9.aBoolean32 = false;
								if (local9.anObjectArray13 != null) {
									local416 = new Class4_Sub22();
									local416.aBoolean211 = true;
									local416.aClass22_15 = local9;
									local416.anInt3402 = Static72.anInt1326 - local50;
									local416.anInt3408 = Static117.anInt2589 - local55;
									local416.anObjectArray32 = local9.anObjectArray13;
									Static257.aClass10_54.method184(local416);
								}
							}
							if (local9.anObjectArray2 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray2;
								Static198.aClass10_25.method184(local416);
							}
							@Pc(997) Class4_Sub22 local997;
							if (local9.anObjectArray21 != null && Static154.anInt3124 > local9.anInt592) {
								if (local9.anIntArray55 == null || Static154.anInt3124 - local9.anInt592 > 32) {
									local416 = new Class4_Sub22();
									local416.aClass22_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray21;
									Static243.aClass10_52.method184(local416);
								} else {
									label570: for (local243 = local9.anInt592; local243 < Static154.anInt3124; local243++) {
										local522 = Static11.anIntArray24[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray55.length; local339++) {
											if (local9.anIntArray55[local339] == local522) {
												local997 = new Class4_Sub22();
												local997.aClass22_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray21;
												Static243.aClass10_52.method184(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt592 = Static154.anInt3124;
							}
							if (local9.anObjectArray26 != null && Static295.anInt5479 > local9.anInt580) {
								if (local9.anIntArray54 == null || Static295.anInt5479 - local9.anInt580 > 32) {
									local416 = new Class4_Sub22();
									local416.aClass22_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray26;
									Static243.aClass10_52.method184(local416);
								} else {
									label546: for (local243 = local9.anInt580; local243 < Static295.anInt5479; local243++) {
										local522 = Static67.anIntArray139[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray54.length; local339++) {
											if (local9.anIntArray54[local339] == local522) {
												local997 = new Class4_Sub22();
												local997.aClass22_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray26;
												Static243.aClass10_52.method184(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt580 = Static295.anInt5479;
							}
							if (local9.anObjectArray17 != null && Static47.anInt944 > local9.anInt624) {
								if (local9.anIntArray59 == null || Static47.anInt944 - local9.anInt624 > 32) {
									local416 = new Class4_Sub22();
									local416.aClass22_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray17;
									Static243.aClass10_52.method184(local416);
								} else {
									label522: for (local243 = local9.anInt624; local243 < Static47.anInt944; local243++) {
										local522 = Static102.anIntArray224[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray59.length; local339++) {
											if (local9.anIntArray59[local339] == local522) {
												local997 = new Class4_Sub22();
												local997.aClass22_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray17;
												Static243.aClass10_52.method184(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt624 = Static47.anInt944;
							}
							if (local9.anObjectArray4 != null && Static215.anInt4270 > local9.anInt631) {
								if (local9.anIntArray58 == null || Static215.anInt4270 - local9.anInt631 > 32) {
									local416 = new Class4_Sub22();
									local416.aClass22_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray4;
									Static243.aClass10_52.method184(local416);
								} else {
									label498: for (local243 = local9.anInt631; local243 < Static215.anInt4270; local243++) {
										local522 = Static273.anIntArray126[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray58.length; local339++) {
											if (local9.anIntArray58[local339] == local522) {
												local997 = new Class4_Sub22();
												local997.aClass22_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray4;
												Static243.aClass10_52.method184(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt631 = Static215.anInt4270;
							}
							if (local9.anObjectArray24 != null && Static231.anInt4523 > local9.anInt551) {
								if (local9.anIntArray62 == null || Static231.anInt4523 - local9.anInt551 > 32) {
									local416 = new Class4_Sub22();
									local416.aClass22_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray24;
									Static243.aClass10_52.method184(local416);
								} else {
									label474: for (local243 = local9.anInt551; local243 < Static231.anInt4523; local243++) {
										local522 = Static61.anIntArray132[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray62.length; local339++) {
											if (local9.anIntArray62[local339] == local522) {
												local997 = new Class4_Sub22();
												local997.aClass22_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray24;
												Static243.aClass10_52.method184(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt551 = Static231.anInt4523;
							}
							if (Static22.anInt422 > local9.anInt573 && local9.anObjectArray3 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray3;
								Static243.aClass10_52.method184(local416);
							}
							if (Static233.anInt4542 > local9.anInt573 && local9.anObjectArray29 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray29;
								Static243.aClass10_52.method184(local416);
							}
							if (Static159.anInt3170 > local9.anInt573 && local9.anObjectArray25 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray25;
								Static243.aClass10_52.method184(local416);
							}
							if (Static28.anInt529 > local9.anInt573 && local9.anObjectArray14 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray14;
								Static243.aClass10_52.method184(local416);
							}
							if (Static105.anInt2257 > local9.anInt573 && local9.anObjectArray8 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray8;
								Static243.aClass10_52.method184(local416);
							}
							local9.anInt573 = Static177.anInt3485;
							if (local9.anObjectArray9 != null) {
								for (local243 = 0; local243 < Static298.anInt5539; local243++) {
									@Pc(1461) Class4_Sub22 local1461 = new Class4_Sub22();
									local1461.aClass22_15 = local9;
									local1461.anInt3403 = Static80.anIntArray167[local243];
									local1461.anInt3405 = Static137.anIntArray252[local243];
									local1461.anObjectArray32 = local9.anObjectArray9;
									Static243.aClass10_52.method184(local1461);
								}
							}
							if (Static225.aBoolean296 && local9.anObjectArray16 != null) {
								local416 = new Class4_Sub22();
								local416.aClass22_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray16;
								Static243.aClass10_52.method184(local416);
							}
						}
					}
					if (!local9.aBoolean33 && Static45.aClass22_6 == null && Static24.aClass22_2 == null && !Static142.aBoolean192) {
						if ((local9.anInt565 >= 0 || local9.anInt620 != 0) && Static72.anInt1326 >= local61 && Static117.anInt2589 >= local63 && Static72.anInt1326 < local65 && Static117.anInt2589 < local67) {
							if (local9.anInt565 >= 0) {
								Static126.aClass22_12 = arg0[local9.anInt565];
							} else {
								Static126.aClass22_12 = local9;
							}
						}
						if (local9.anInt542 == 8 && Static72.anInt1326 >= local61 && Static117.anInt2589 >= local63 && Static72.anInt1326 < local65 && Static117.anInt2589 < local67) {
							Static41.aClass22_5 = local9;
						}
						if (local9.anInt583 > local9.anInt602) {
							Static277.method4114(Static72.anInt1326, Static117.anInt2589, local50 + local9.anInt546, local9.anInt602, local55, local9.anInt583, local9);
						}
					}
					if (local9.anInt542 == 0) {
						method677(arg0, local9.anInt596, local61, local63, local65, local67, local50 - local9.anInt589, local55 - local9.anInt547);
						if (local9.aClass22Array1 != null) {
							method677(local9.aClass22Array1, local9.anInt596, local61, local63, local65, local67, local50 - local9.anInt589, local55 - local9.anInt547);
						}
						@Pc(1626) Class4_Sub10 local1626 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local9.anInt596);
						if (local1626 != null) {
							Static241.method3693(local55, local63, local1626.anInt1032, local65, local50, local61, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!cc;)Lclient!cc;")
	public static Class22 method679(@OriginalArg(0) Class22 arg0) {
		@Pc(4) int local4 = method681(arg0).method2826();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static21.method3453(arg0.anInt587);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!cc;)Lclient!ng;")
	public static Class4_Sub25 method681(@OriginalArg(0) Class22 arg0) {
		@Pc(13) Class4_Sub25 local13 = (Class4_Sub25) Static294.aClass97_18.method2360(((long) arg0.anInt596 << 32) + (long) arg0.anInt561);
		return local13 == null ? arg0.aClass4_Sub25_7 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I")
	public static int method683() {
		if (Static55.aFrame2 != null) {
			return 3;
		} else if (Static178.aBoolean216 && Static255.aBoolean312) {
			return 2;
		} else if (Static178.aBoolean216 && !Static255.aBoolean312) {
			return 1;
		} else {
			return 0;
		}
	}
}
