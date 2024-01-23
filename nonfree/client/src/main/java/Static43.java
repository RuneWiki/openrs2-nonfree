import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	public static int anInt967 = 0;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "S")
	public static short aShort12 = 1;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[Lclient!gn;")
	public static Class66[] aClass66Array1 = new Class66[29];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	public static int[] anIntArray130 = new int[128];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!og;)Lclient!vj;")
	public static Class1_Sub31 method794(@OriginalArg(0) Class127 arg0) {
		@Pc(13) Class1_Sub31 local13 = (Class1_Sub31) Static244.aClass22_18.method633(((long) arg0.anInt3574 << 32) + (long) arg0.anInt3573);
		return local13 == null ? arg0.aClass1_Sub31_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!og;)Lclient!og;")
	public static Class127 method797(@OriginalArg(0) Class127 arg0) {
		@Pc(4) int local4 = method794(arg0).method4338();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static75.method1287(arg0.anInt3563);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Lclient!vk;")
	public static Class1_Sub32 method798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub32 local9 = new Class1_Sub32();
		local9.anInt5663 = arg1;
		local9.anInt5665 = arg2;
		Static67.aClass22_7.method643((long) arg0, local9);
		Static265.method4071(arg2);
		@Pc(28) Class127 local28 = Static75.method1287(arg0);
		if (local28 != null) {
			Static155.method2392(local28);
		}
		if (Static91.aClass127_4 != null) {
			Static155.method2392(Static91.aClass127_4);
			Static91.aClass127_4 = null;
		}
		@Pc(52) int local52 = Static29.anInt626;
		@Pc(54) int local54;
		for (local54 = 0; local54 < local52; local54++) {
			if (Static17.method317(Static276.aShortArray92[local54])) {
				Static292.method4476(local54);
			}
		}
		if (Static29.anInt626 == 1) {
			Static192.aBoolean414 = false;
			Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
		} else {
			Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
			local54 = Static10.aClass1_Sub2_Sub12_1.method4390(Static167.aString104);
			for (@Pc(87) int local87 = 0; local87 < Static29.anInt626; local87++) {
				@Pc(100) int local100 = Static10.aClass1_Sub2_Sub12_1.method4390(Static242.method3843(local87));
				if (local54 < local100) {
					local54 = local100;
				}
			}
			Static229.anInt4793 = (Static91.aBoolean128 ? 26 : 22) + Static29.anInt626 * 15;
			Static210.anInt4223 = local54 + 8;
		}
		if (local28 != null) {
			Static89.method1474(false, local28);
		}
		Static17.method320(arg2);
		if (Static121.anInt2350 != -1) {
			Static244.method3859(1, Static121.anInt2350);
		}
		return local9;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!og;IIIIIII)V")
	public static void method804(@OriginalArg(0) Class127[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class127 local9 = arg0[local1];
			if (local9 != null && local9.anInt3563 == arg1 && (!local9.aBoolean261 || local9.anInt3570 == 0 || local9.aBoolean264 || method794(local9).anInt5647 != 0 || local9 == Static270.aClass127_15 || local9.anInt3566 == 1338) && (!local9.aBoolean261 || !method805(local9))) {
				@Pc(50) int local50 = local9.anInt3594 + arg6;
				@Pc(55) int local55 = local9.anInt3593 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt3570 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt3567;
					@Pc(78) int local78 = local55 + local9.anInt3595;
					if (local9.anInt3570 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static108.aClass127_7) {
					Static259.aBoolean402 = true;
					Static1.anInt1 = local50;
					Static246.anInt3363 = local55;
				}
				if (!local9.aBoolean261 || local61 < local65 && local63 < local67) {
					if (local9.anInt3570 == 0) {
						if (!local9.aBoolean261 && method805(local9) && Static30.aClass127_1 != local9) {
							continue;
						}
						if (local9.aBoolean262 && Static224.anInt4700 >= local61 && Static293.anInt5833 >= local63 && Static224.anInt4700 < local65 && Static293.anInt5833 < local67) {
							for (@Pc(164) Class1_Sub20 local164 = (Class1_Sub20) Static27.aClass69_4.method1636(); local164 != null; local164 = (Class1_Sub20) Static27.aClass69_4.method1631()) {
								if (local164.aBoolean236) {
									local164.method4534();
									local164.aClass127_9.aBoolean265 = false;
								}
							}
							if (Static61.anInt1268 == 0) {
								Static108.aClass127_7 = null;
								Static270.aClass127_15 = null;
							}
							Static33.anInt720 = 0;
						}
					}
					if (local9.aBoolean261) {
						@Pc(207) boolean local207;
						if (Static224.anInt4700 >= local61 && Static293.anInt5833 >= local63 && Static224.anInt4700 < local65 && Static293.anInt5833 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static211.anInt959 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static143.anInt2663 == 1 && Static207.anInt4122 >= local61 && Static72.anInt1427 >= local63 && Static207.anInt4122 < local65 && Static72.anInt1427 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray68 != null) {
							for (local243 = 0; local243 < local9.aByteArray68.length; local243++) {
								if (Static246.aBooleanArray15[local9.aByteArray68[local243]]) {
									if (local9.anIntArray416 == null || Static261.anInt5259 >= local9.anIntArray416[local243]) {
										@Pc(279) byte local279 = local9.aByteArray69[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static246.aBooleanArray15[86] && !Static246.aBooleanArray15[82] && !Static246.aBooleanArray15[81]) && ((local279 & 0x2) == 0 || Static246.aBooleanArray15[86]) && ((local279 & 0x1) == 0 || Static246.aBooleanArray15[82]) && ((local279 & 0x4) == 0 || Static246.aBooleanArray15[81])) {
											Static55.method929(local243 + 1, local9.anInt3574, -1, "");
											local339 = local9.anIntArray427[local243];
											if (local9.anIntArray416 == null) {
												local9.anIntArray416 = new int[local9.aByteArray68.length];
											}
											if (local339 == 0) {
												local9.anIntArray416[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray416[local243] = Static261.anInt5259 + local339;
											}
										}
									}
								} else if (local9.anIntArray416 != null) {
									local9.anIntArray416[local243] = 0;
								}
							}
						}
						if (local221) {
							Static24.method425(local9, Static72.anInt1427 - local55, Static207.anInt4122 - local50);
						}
						if (Static108.aClass127_7 != null && Static108.aClass127_7 != local9 && local207 && method794(local9).method4347()) {
							Static261.aClass127_13 = local9;
						}
						if (local9 == Static270.aClass127_15) {
							Static109.aBoolean150 = true;
							Static14.anInt362 = local50;
							Static117.anInt2232 = local55;
						}
						if (local9.aBoolean264 || local9.anInt3566 != 0) {
							@Pc(416) Class1_Sub20 local416;
							if (local207 && Static286.anInt5073 != 0 && local9.anObjectArray9 != null) {
								local416 = new Class1_Sub20();
								local416.aBoolean236 = true;
								local416.aClass127_9 = local9;
								local416.anInt3123 = Static286.anInt5073;
								local416.anObjectArray2 = local9.anObjectArray9;
								Static27.aClass69_4.method1628(local416);
							}
							if (Static108.aClass127_7 != null || Static284.aClass127_16 != null || Static192.aBoolean414 || local9.anInt3566 != 1400 && Static33.anInt720 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt3566 != 0) {
								if (local9.anInt3566 == 1337) {
									Static298.aClass127_17 = local9;
									continue;
								}
								if (local9.anInt3566 == 1338) {
									if (local221) {
										Static206.anInt4113 = Static207.anInt4122 - local50;
										Static230.anInt4836 = Static72.anInt1427 - local55;
									}
									continue;
								}
								if (local9.anInt3566 == 1400) {
									Static260.aClass127_12 = local9;
									if (local221) {
										if (Static246.aBooleanArray15[82] && Static95.anInt1824 > 0) {
											local243 = (int) ((double) (Static207.anInt4122 - local50 - local9.anInt3567 / 2) * 2.0D / (double) Static243.aFloat145);
											local522 = (int) ((double) (Static72.anInt1427 - local55 - local9.anInt3595 / 2) * 2.0D / (double) Static243.aFloat145);
											local339 = Static36.anInt4790 + local243;
											@Pc(530) int local530 = Static33.anInt717 + local522;
											@Pc(534) int local534 = local339 + Static219.anInt4487;
											@Pc(542) int local542 = Static77.anInt1559 + Static198.anInt3851 - local530 - 1;
											@Pc(545) Class1_Sub2_Sub13 local545 = Static205.method3208();
											@Pc(551) int[] local551 = local545.method2812(local542, local534);
											if (local551 != null) {
												Static138.method2187(local551[0], local551[1], local551[2]);
												Static273.method4182();
											}
											continue;
										}
										Static33.anInt720 = 1;
										Static39.anInt853 = Static224.anInt4700;
										Static108.anInt2042 = Static293.anInt5833;
										continue;
									}
									if (local212 && Static33.anInt720 > 0) {
										if (Static33.anInt720 == 1 && (Static39.anInt853 != Static224.anInt4700 || Static108.anInt2042 != Static293.anInt5833)) {
											Static178.anInt3317 = Static36.anInt4790;
											Static108.anInt2039 = Static33.anInt717;
											Static33.anInt720 = 2;
										}
										if (Static33.anInt720 == 2) {
											Static233.method3723(Static178.anInt3317 + (int) ((double) (Static39.anInt853 - Static224.anInt4700) * 2.0D / (double) Static57.aFloat32));
											Static136.method2156(Static108.anInt2039 + (int) ((double) (Static108.anInt2042 - Static293.anInt5833) * 2.0D / (double) Static57.aFloat32));
										}
										continue;
									}
									Static33.anInt720 = 0;
									continue;
								}
								if (local9.anInt3566 == 1401) {
									if (local212) {
										Static186.method2808(local9.anInt3595, local9.anInt3567, Static224.anInt4700 - local50, Static293.anInt5833 - local55);
									}
									continue;
								}
								if (local9.anInt3566 == 1402) {
									if (!Static240.aBoolean369) {
										Static155.method2392(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean267 && local221) {
								local9.aBoolean267 = true;
								if (local9.anObjectArray31 != null) {
									local416 = new Class1_Sub20();
									local416.aBoolean236 = true;
									local416.aClass127_9 = local9;
									local416.anInt3133 = Static207.anInt4122 - local50;
									local416.anInt3123 = Static72.anInt1427 - local55;
									local416.anObjectArray2 = local9.anObjectArray31;
									Static27.aClass69_4.method1628(local416);
								}
							}
							if (local9.aBoolean267 && local212 && local9.anObjectArray17 != null) {
								local416 = new Class1_Sub20();
								local416.aBoolean236 = true;
								local416.aClass127_9 = local9;
								local416.anInt3133 = Static224.anInt4700 - local50;
								local416.anInt3123 = Static293.anInt5833 - local55;
								local416.anObjectArray2 = local9.anObjectArray17;
								Static27.aClass69_4.method1628(local416);
							}
							if (local9.aBoolean267 && !local212) {
								local9.aBoolean267 = false;
								if (local9.anObjectArray16 != null) {
									local416 = new Class1_Sub20();
									local416.aBoolean236 = true;
									local416.aClass127_9 = local9;
									local416.anInt3133 = Static224.anInt4700 - local50;
									local416.anInt3123 = Static293.anInt5833 - local55;
									local416.anObjectArray2 = local9.anObjectArray16;
									Static106.aClass69_9.method1628(local416);
								}
							}
							if (local212 && local9.anObjectArray20 != null) {
								local416 = new Class1_Sub20();
								local416.aBoolean236 = true;
								local416.aClass127_9 = local9;
								local416.anInt3133 = Static224.anInt4700 - local50;
								local416.anInt3123 = Static293.anInt5833 - local55;
								local416.anObjectArray2 = local9.anObjectArray20;
								Static27.aClass69_4.method1628(local416);
							}
							if (!local9.aBoolean265 && local207) {
								local9.aBoolean265 = true;
								if (local9.anObjectArray32 != null) {
									local416 = new Class1_Sub20();
									local416.aBoolean236 = true;
									local416.aClass127_9 = local9;
									local416.anInt3133 = Static224.anInt4700 - local50;
									local416.anInt3123 = Static293.anInt5833 - local55;
									local416.anObjectArray2 = local9.anObjectArray32;
									Static27.aClass69_4.method1628(local416);
								}
							}
							if (local9.aBoolean265 && local207 && local9.anObjectArray19 != null) {
								local416 = new Class1_Sub20();
								local416.aBoolean236 = true;
								local416.aClass127_9 = local9;
								local416.anInt3133 = Static224.anInt4700 - local50;
								local416.anInt3123 = Static293.anInt5833 - local55;
								local416.anObjectArray2 = local9.anObjectArray19;
								Static27.aClass69_4.method1628(local416);
							}
							if (local9.aBoolean265 && !local207) {
								local9.aBoolean265 = false;
								if (local9.anObjectArray15 != null) {
									local416 = new Class1_Sub20();
									local416.aBoolean236 = true;
									local416.aClass127_9 = local9;
									local416.anInt3133 = Static224.anInt4700 - local50;
									local416.anInt3123 = Static293.anInt5833 - local55;
									local416.anObjectArray2 = local9.anObjectArray15;
									Static106.aClass69_9.method1628(local416);
								}
							}
							if (local9.anObjectArray30 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray30;
								Static24.aClass69_3.method1628(local416);
							}
							@Pc(997) Class1_Sub20 local997;
							if (local9.anObjectArray27 != null && Static236.anInt4920 > local9.anInt3607) {
								if (local9.anIntArray419 == null || Static236.anInt4920 - local9.anInt3607 > 32) {
									local416 = new Class1_Sub20();
									local416.aClass127_9 = local9;
									local416.anObjectArray2 = local9.anObjectArray27;
									Static27.aClass69_4.method1628(local416);
								} else {
									label570: for (local243 = local9.anInt3607; local243 < Static236.anInt4920; local243++) {
										local522 = Static286.anIntArray594[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray419.length; local339++) {
											if (local9.anIntArray419[local339] == local522) {
												local997 = new Class1_Sub20();
												local997.aClass127_9 = local9;
												local997.anObjectArray2 = local9.anObjectArray27;
												Static27.aClass69_4.method1628(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt3607 = Static236.anInt4920;
							}
							if (local9.anObjectArray10 != null && Static237.anInt2921 > local9.anInt3545) {
								if (local9.anIntArray413 == null || Static237.anInt2921 - local9.anInt3545 > 32) {
									local416 = new Class1_Sub20();
									local416.aClass127_9 = local9;
									local416.anObjectArray2 = local9.anObjectArray10;
									Static27.aClass69_4.method1628(local416);
								} else {
									label546: for (local243 = local9.anInt3545; local243 < Static237.anInt2921; local243++) {
										local522 = Static30.anIntArray66[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray413.length; local339++) {
											if (local9.anIntArray413[local339] == local522) {
												local997 = new Class1_Sub20();
												local997.aClass127_9 = local9;
												local997.anObjectArray2 = local9.anObjectArray10;
												Static27.aClass69_4.method1628(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt3545 = Static237.anInt2921;
							}
							if (local9.anObjectArray28 != null && Static151.anInt2791 > local9.anInt3609) {
								if (local9.anIntArray423 == null || Static151.anInt2791 - local9.anInt3609 > 32) {
									local416 = new Class1_Sub20();
									local416.aClass127_9 = local9;
									local416.anObjectArray2 = local9.anObjectArray28;
									Static27.aClass69_4.method1628(local416);
								} else {
									label522: for (local243 = local9.anInt3609; local243 < Static151.anInt2791; local243++) {
										local522 = Static16.anIntArray35[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray423.length; local339++) {
											if (local9.anIntArray423[local339] == local522) {
												local997 = new Class1_Sub20();
												local997.aClass127_9 = local9;
												local997.anObjectArray2 = local9.anObjectArray28;
												Static27.aClass69_4.method1628(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt3609 = Static151.anInt2791;
							}
							if (local9.anObjectArray3 != null && Static130.anInt2506 > local9.anInt3611) {
								if (local9.anIntArray418 == null || Static130.anInt2506 - local9.anInt3611 > 32) {
									local416 = new Class1_Sub20();
									local416.aClass127_9 = local9;
									local416.anObjectArray2 = local9.anObjectArray3;
									Static27.aClass69_4.method1628(local416);
								} else {
									label498: for (local243 = local9.anInt3611; local243 < Static130.anInt2506; local243++) {
										local522 = Static67.anIntArray167[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray418.length; local339++) {
											if (local9.anIntArray418[local339] == local522) {
												local997 = new Class1_Sub20();
												local997.aClass127_9 = local9;
												local997.anObjectArray2 = local9.anObjectArray3;
												Static27.aClass69_4.method1628(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt3611 = Static130.anInt2506;
							}
							if (local9.anObjectArray13 != null && Static18.anInt416 > local9.anInt3637) {
								if (local9.anIntArray411 == null || Static18.anInt416 - local9.anInt3637 > 32) {
									local416 = new Class1_Sub20();
									local416.aClass127_9 = local9;
									local416.anObjectArray2 = local9.anObjectArray13;
									Static27.aClass69_4.method1628(local416);
								} else {
									label474: for (local243 = local9.anInt3637; local243 < Static18.anInt416; local243++) {
										local522 = Static81.anIntArray188[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray411.length; local339++) {
											if (local9.anIntArray411[local339] == local522) {
												local997 = new Class1_Sub20();
												local997.aClass127_9 = local9;
												local997.anObjectArray2 = local9.anObjectArray13;
												Static27.aClass69_4.method1628(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt3637 = Static18.anInt416;
							}
							if (Static123.anInt2373 > local9.anInt3614 && local9.anObjectArray6 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray6;
								Static27.aClass69_4.method1628(local416);
							}
							if (Static145.anInt2688 > local9.anInt3614 && local9.anObjectArray8 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray8;
								Static27.aClass69_4.method1628(local416);
							}
							if (Static9.anInt246 > local9.anInt3614 && local9.anObjectArray24 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray24;
								Static27.aClass69_4.method1628(local416);
							}
							if (Static163.anInt4690 > local9.anInt3614 && local9.anObjectArray29 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray29;
								Static27.aClass69_4.method1628(local416);
							}
							if (Static70.anInt1408 > local9.anInt3614 && local9.anObjectArray14 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray14;
								Static27.aClass69_4.method1628(local416);
							}
							local9.anInt3614 = Static56.anInt1175;
							if (local9.anObjectArray23 != null) {
								for (local243 = 0; local243 < Static57.anInt1183; local243++) {
									@Pc(1461) Class1_Sub20 local1461 = new Class1_Sub20();
									local1461.aClass127_9 = local9;
									local1461.anInt3131 = Static6.anIntArray21[local243];
									local1461.anInt3128 = Static230.anIntArray567[local243];
									local1461.anObjectArray2 = local9.anObjectArray23;
									Static27.aClass69_4.method1628(local1461);
								}
							}
							if (Static165.aBoolean228 && local9.anObjectArray4 != null) {
								local416 = new Class1_Sub20();
								local416.aClass127_9 = local9;
								local416.anObjectArray2 = local9.anObjectArray4;
								Static27.aClass69_4.method1628(local416);
							}
						}
					}
					if (!local9.aBoolean261 && Static108.aClass127_7 == null && Static284.aClass127_16 == null && !Static192.aBoolean414) {
						if ((local9.anInt3587 >= 0 || local9.anInt3598 != 0) && Static224.anInt4700 >= local61 && Static293.anInt5833 >= local63 && Static224.anInt4700 < local65 && Static293.anInt5833 < local67) {
							if (local9.anInt3587 >= 0) {
								Static30.aClass127_1 = arg0[local9.anInt3587];
							} else {
								Static30.aClass127_1 = local9;
							}
						}
						if (local9.anInt3570 == 8 && Static224.anInt4700 >= local61 && Static293.anInt5833 >= local63 && Static224.anInt4700 < local65 && Static293.anInt5833 < local67) {
							Static91.aClass127_5 = local9;
						}
						if (local9.anInt3600 > local9.anInt3595) {
							Static130.method2050(Static293.anInt5833, Static224.anInt4700, local9, local55, local50 + local9.anInt3567, local9.anInt3600, local9.anInt3595);
						}
					}
					if (local9.anInt3570 == 0) {
						method804(arg0, local9.anInt3574, local61, local63, local65, local67, local50 - local9.anInt3583, local55 - local9.anInt3628);
						if (local9.aClass127Array1 != null) {
							method804(local9.aClass127Array1, local9.anInt3574, local61, local63, local65, local67, local50 - local9.anInt3583, local55 - local9.anInt3628);
						}
						@Pc(1626) Class1_Sub32 local1626 = (Class1_Sub32) Static67.aClass22_7.method633((long) local9.anInt3574);
						if (local1626 != null) {
							Static152.method2350(local65, local55, local63, local50, local61, local67, local1626.anInt5665);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!og;)Z")
	public static boolean method805(@OriginalArg(0) Class127 arg0) {
		if (Static26.aBoolean49) {
			if (method794(arg0).anInt5647 != 0) {
				return false;
			}
			if (arg0.anInt3570 == 0) {
				return false;
			}
		}
		return arg0.aBoolean277;
	}
}
