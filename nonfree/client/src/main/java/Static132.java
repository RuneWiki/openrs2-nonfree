import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt2639;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!wt;")
	public static Class271 aClass271_5;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!ul;")
	public static Class246 aClass246_83;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_27 = new Class179(64, -1);

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILclient!ya;Lclient!uq;)V")
	private static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) Class251 arg3) {
		@Pc(10) Class133 local10 = arg3.method5550(arg2);
		if (local10 == null) {
			return;
		}
		arg2.OA(arg1, arg0, arg1 + arg3.anInt6687, arg3.anInt6677 + arg0);
		if (Static264.anInt4692 == 2 || Static264.anInt4692 == 5 || Static188.aClass143_20 == null) {
			arg2.ca(-16777216, local10, arg1, arg0);
			return;
		}
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(59) int local59;
		@Pc(51) int local51;
		if (Static345.anInt5797 == 4) {
			local49 = Static2.anInt63;
			local51 = 4096;
			local53 = Static190.anInt3416;
			local59 = (int) -Static142.aFloat89 & 0x3FFF;
		} else {
			local49 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
			local51 = 4096 - Static119.anInt840 * 16;
			local53 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
			local59 = Static82.anInt1815 + (int) -Static142.aFloat89 & 0x3FFF;
		}
		@Pc(95) int local95 = local53 / 32 + 48 - (Static195.anInt3537 + -104) * 2;
		@Pc(112) int local112 = Static118.anInt2419 * 4 + 48 - local49 / 32 - (Static118.anInt2419 - 104) * 2;
		Static188.aClass143_20.method5717((float) arg3.anInt6687 / 2.0F + (float) arg1, (float) arg0 + (float) arg3.anInt6677 / 2.0F, (float) local95, (float) local112, local51, local59 << 2, local10, arg1, arg0);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(182) int local182;
		@Pc(192) int local192;
		for (@Pc(146) Class1_Sub43 local146 = (Class1_Sub43) Static381.aClass181_62.method4112(); local146 != null; local146 = (Class1_Sub43) Static381.aClass181_62.method4104()) {
			@Pc(151) int local151 = local146.anInt6933;
			local162 = (Static236.aClass45_3.anIntArray102[local151] >> 14 & 0x3FFF) - Static165.anInt3049;
			local172 = (Static236.aClass45_3.anIntArray102[local151] & 0x3FFF) - Static345.anInt5799;
			local182 = local162 * 4 + 2 - local53 / 32;
			local192 = local172 * 4 + 2 - local49 / 32;
			Static400.method5335(Static236.aClass45_3.anIntArray103[local151], local10, arg1, arg0, local192, arg3, local182, arg2);
		}
		for (local162 = 0; local162 < Static62.anInt1460; local162++) {
			local172 = Static373.anIntArray567[local162] * 4 + 2 - local53 / 32;
			local182 = Static399.anIntArray651[local162] * 4 + 2 - local49 / 32;
			@Pc(250) Class129 local250 = Static349.aClass115_4.method2766(Static218.anIntArray332[local162]);
			if (local250.anIntArray310 != null) {
				local250 = local250.method3031(Static394.aClass23_1);
				if (local250 == null || local250.anInt3494 == -1) {
					continue;
				}
			}
			Static400.method5335(local250.anInt3494, local10, arg1, arg0, local182, arg3, local172, arg2);
		}
		for (@Pc(287) Class1_Sub25 local287 = (Class1_Sub25) Static129.aClass96_24.method2342(); local287 != null; local287 = (Class1_Sub25) Static129.aClass96_24.method2339()) {
			local182 = (int) (local287.aLong222 >> 28 & 0x3L);
			if (Static446.anInt7163 == local182) {
				local192 = (int) (local287.aLong222 & 0x3FFFL) * 4 + 2 - local53 / 32;
				@Pc(331) int local331 = (int) (local287.aLong222 >> 14 & 0x3FFFL) * 4 + 2 - local49 / 32;
				Static451.method5929(Static118.aClass143Array2[0], arg1, arg0, local331, local192, arg3, local10);
			}
		}
		@Pc(405) int local405;
		for (local182 = 0; local182 < Static5.anInt163; local182++) {
			@Pc(359) Class31_Sub2_Sub1_Sub2 local359 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local182]];
			if (local359 != null && local359.method6001() && local359.aByte100 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
				@Pc(377) Class53 local377 = local359.aClass53_1;
				if (local377 != null && local377.anIntArray131 != null) {
					local377 = local377.method1508(Static394.aClass23_1);
				}
				if (local377 != null && local377.aBoolean97 && local377.aBoolean95) {
					local405 = local359.anInt7300 / 32 - local53 / 32;
					@Pc(415) int local415 = local359.anInt7298 / 32 - local49 / 32;
					if (local377.anInt1730 == -1) {
						Static451.method5929(Static118.aClass143Array2[1], arg1, arg0, local415, local405, arg3, local10);
					} else {
						Static400.method5335(local377.anInt1730, local10, arg1, arg0, local415, arg3, local405, arg2);
					}
				}
			}
		}
		local192 = Static155.anInt2952;
		@Pc(451) int[] local451 = Static381.anIntArray619;
		@Pc(485) int local485;
		@Pc(495) int local495;
		@Pc(499) int local499;
		for (local405 = 0; local405 < local192; local405++) {
			@Pc(461) Class31_Sub2_Sub1_Sub1 local461 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local451[local405]];
			if (local461 != null && local461.method1184() && Static452.aClass31_Sub2_Sub1_Sub1_2 != local461 && Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 == local461.aByte100) {
				local485 = local461.anInt7300 / 32 - local53 / 32;
				local495 = local461.anInt7298 / 32 - local49 / 32;
				@Pc(497) boolean local497 = false;
				for (local499 = 0; local499 < Static313.anInt5409; local499++) {
					if (local461.aString10.equals(Static22.aStringArray6[local499]) && Static83.anIntArray147[local499] != 0) {
						local497 = true;
						break;
					}
				}
				@Pc(526) boolean local526 = false;
				for (@Pc(528) int local528 = 0; local528 < Static266.anInt6939; local528++) {
					if (local461.aString10.equals(Static118.aClass154Array1[local528].aString36)) {
						local526 = true;
						break;
					}
				}
				@Pc(548) boolean local548 = false;
				if (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1302 != 0 && local461.anInt1302 != 0 && local461.anInt1302 == Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1302) {
					local548 = true;
				}
				if (local461.aBoolean70) {
					Static451.method5929(Static118.aClass143Array2[6], arg1, arg0, local495, local485, arg3, local10);
				} else if (local497) {
					Static451.method5929(Static118.aClass143Array2[3], arg1, arg0, local495, local485, arg3, local10);
				} else if (local526) {
					Static451.method5929(Static118.aClass143Array2[5], arg1, arg0, local495, local485, arg3, local10);
				} else if (local548) {
					Static451.method5929(Static118.aClass143Array2[4], arg1, arg0, local495, local485, arg3, local10);
				} else {
					Static451.method5929(Static118.aClass143Array2[2], arg1, arg0, local495, local485, arg3, local10);
				}
			}
		}
		@Pc(647) Class83[] local647 = Static353.aClass83Array2;
		@Pc(739) int local739;
		for (local485 = 0; local485 < local647.length; local485++) {
			@Pc(655) Class83 local655 = local647[local485];
			if (local655 != null && local655.anInt2462 != 0 && Static378.anInt4244 % 20 < 10) {
				@Pc(713) int local713;
				if (local655.anInt2462 == 1 && local655.anInt2459 >= 0 && Static98.aClass31_Sub2_Sub1_Sub2Array1.length > local655.anInt2459) {
					@Pc(691) Class31_Sub2_Sub1_Sub2 local691 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local655.anInt2459];
					if (local691 != null) {
						local499 = local691.anInt7300 / 32 - local53 / 32;
						local713 = local691.anInt7298 / 32 - local49 / 32;
						Static143.method2391(arg1, arg3, arg0, local10, local499, 360000L, local655.anInt2458, local713);
					}
				}
				if (local655.anInt2462 == 2) {
					local739 = local655.anInt2457 / 32 - local53 / 32;
					local499 = local655.anInt2463 / 32 - local49 / 32;
					@Pc(755) long local755 = (long) (local655.anInt2466 << 5);
					@Pc(759) long local759 = local755 * local755;
					Static143.method2391(arg1, arg3, arg0, local10, local739, local759, local655.anInt2458, local499);
				}
				if (local655.anInt2462 == 10 && local655.anInt2459 >= 0 && local655.anInt2459 < Static458.aClass31_Sub2_Sub1_Sub1Array1.length) {
					@Pc(793) Class31_Sub2_Sub1_Sub1 local793 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local655.anInt2459];
					if (local793 != null) {
						local499 = local793.anInt7300 / 32 - local53 / 32;
						local713 = local793.anInt7298 / 32 - local49 / 32;
						Static143.method2391(arg1, arg3, arg0, local10, local499, 360000L, local655.anInt2458, local713);
					}
				}
			}
		}
		if (Static345.anInt5797 == 4) {
			return;
		}
		if (Static414.anInt6715 != 0) {
			local495 = Static414.anInt6715 * 4 + Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() * 2 + 2 - local53 / 32 - 2;
			local739 = Static207.anInt3927 * 4 + (Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() - 1) * 2 + 2 - local49 / 32;
			Static451.method5929(Static17.aClass143Array1[Static229.aBoolean295 ? 1 : 0], arg1, arg0, local739, local495, arg3, local10);
		}
		arg2.method4563(arg3.anInt6677 / 2 + arg0 - 1, -1, 3, arg1 + arg3.anInt6687 / 2 - 1, 3);
		return;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ul;I)V")
	public static void method2289(@OriginalArg(0) Class246 arg0) {
		Static133.aClass246_84 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Lclient!uq;IBIIII)V")
	public static void method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class251[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
		for (@Pc(21) int local21 = 0; local21 < arg3.length; local21++) {
			@Pc(27) Class251 local27 = arg3[local21];
			if (local27 != null && (local27.anInt6722 == arg0 || arg0 == -1412584499 && Static455.aClass251_14 == local27)) {
				@Pc(72) int local72;
				if (arg7 == -1) {
					Class102.aRectangleArray1[Static121.anInt2467].setBounds(local27.anInt6690 + arg5, arg2 + local27.anInt6723, local27.anInt6687, local27.anInt6677);
					local72 = Static121.anInt2467++;
				} else {
					local72 = arg7;
				}
				local27.anInt6742 = Static378.anInt4244;
				local27.anInt6731 = local72;
				if (!Static57.method1250(local27)) {
					if (local27.anInt6660 != 0) {
						Static324.method4616(local27);
					}
					@Pc(100) int local100 = local27.anInt6690 + arg5;
					@Pc(105) int local105 = local27.anInt6723 + arg2;
					@Pc(108) int local108 = local27.anInt6672;
					if (Static313.aBoolean387 && (Static57.method1248(local27).anInt2012 != 0 || local27.anInt6654 == 0) && local108 > 127) {
						local108 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (Static455.aClass251_14 == local27) {
						if (arg0 != -1412584499 && (Static198.anInt3758 == local27.anInt6674 || local27.anInt6674 == Static30.anInt653)) {
							Static338.anInt5726 = arg2;
							Static41.anInt856 = arg5;
							Static155.aClass251Array1 = arg3;
							continue;
						}
						if (Static237.aBoolean415 && Static281.aBoolean419) {
							local160 = Static125.aClass114_1.method2701();
							local164 = Static125.aClass114_1.method2698();
							local164 -= Static296.anInt5168;
							local160 -= Static369.anInt6061;
							if (Static131.anInt2627 > local160) {
								local160 = Static131.anInt2627;
							}
							if (local164 < Static401.anInt6424) {
								local164 = Static401.anInt6424;
							}
							if (Static131.anInt2627 + Static377.aClass251_10.anInt6687 < local27.anInt6687 + local160) {
								local160 = Static131.anInt2627 + Static377.aClass251_10.anInt6687 - local27.anInt6687;
							}
							if (Static401.anInt6424 + Static377.aClass251_10.anInt6677 < local164 - -local27.anInt6677) {
								local164 = Static401.anInt6424 + Static377.aClass251_10.anInt6677 - local27.anInt6677;
							}
							local100 = local160;
							local105 = local164;
						}
						if (Static30.anInt653 == local27.anInt6674) {
							local108 = 128;
						}
					}
					@Pc(293) int local293;
					@Pc(304) int local304;
					@Pc(251) int local251;
					@Pc(256) int local256;
					if (local27.anInt6654 == 2) {
						local304 = arg4;
						local164 = arg6;
						local293 = arg8;
						local160 = arg1;
					} else {
						local251 = local27.anInt6687 + local100;
						local256 = local27.anInt6677 + local105;
						local160 = arg1 < local100 ? local100 : arg1;
						if (local27.anInt6654 == 9) {
							local251++;
							local256++;
						}
						local164 = arg6 >= local105 ? arg6 : local105;
						local293 = arg8 <= local251 ? arg8 : local251;
						local304 = arg4 > local256 ? local256 : arg4;
					}
					if (local160 < local293 && local164 < local304) {
						@Pc(594) int local594;
						@Pc(618) int local618;
						@Pc(620) int local620;
						@Pc(542) int local542;
						@Pc(544) int local544;
						if (local27.anInt6660 != 0) {
							if (local27.anInt6660 == Static406.anInt6511 || Static108.anInt2278 == local27.anInt6660) {
								Static358.method4922(local105, local27.anInt6687, local27.anInt6660 == Static108.anInt2278, local27.anInt6677, local100);
								Static71.aBooleanArray25[local72] = true;
								Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
								continue;
							}
							if (Static94.anInt1952 == local27.anInt6660) {
								if (local27.method5550(Static415.aClass39_11) != null) {
									Static435.method5771();
									method2288(local105, local100, Static415.aClass39_11, local27);
									Static391.aBooleanArray46[local72] = true;
									Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
								}
								continue;
							}
							if (Static264.anInt4695 == local27.anInt6660) {
								if (local27.method5550(Static415.aClass39_11) != null) {
									Static115.method2118(local100, local105, local27);
									Static391.aBooleanArray46[local72] = true;
									Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
								}
								continue;
							}
							if (Static140.anInt2733 == local27.anInt6660) {
								Static261.method3877(local100, Static378.anInterface4_9, Static415.aClass39_11, local27.anInt6687, local27.anInt6677, local105);
								Static71.aBooleanArray25[local72] = true;
								Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
								continue;
							}
							if (Static352.anInt5852 == local27.anInt6660) {
								Static22.method524(local27.anInt6677, local27.anInt6687, local100, local105, Static415.aClass39_11);
								Static71.aBooleanArray25[local72] = true;
								Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
								continue;
							}
							if (Static316.anInt5448 == local27.anInt6660) {
								if (!Static331.aBoolean498 && !Static402.aBoolean443) {
									continue;
								}
								local251 = local27.anInt6687 + local100;
								local256 = local105 + 15;
								if (Static331.aBoolean498) {
									Static312.aClass71_7.method5451(local256, "Fps:" + Static295.anInt5133, local251, -256);
									local256 += 15;
									@Pc(533) Runtime local533 = Runtime.getRuntime();
									local542 = (int) ((local533.totalMemory() - local533.freeMemory()) / 1024L);
									local544 = -256;
									if (local542 > 65536) {
										local544 = -65536;
									}
									Static312.aClass71_7.method5451(local256, "Mem:" + local542 + "k", local251, local544);
									local256 += 15;
									Static312.aClass71_7.method5451(local256, "In:" + Static135.anInt2706 + "B/s Out:" + Static42.anInt862 + "B/s", local251, -256);
									local256 += 15;
									local594 = Static415.aClass39_11.IA() / 1024;
									Static312.aClass71_7.method5451(local256, "Offheap:" + local594 + "k", local251, local594 > 65536 ? -65536 : -256);
									local256 += 15;
									local618 = 0;
									local620 = 0;
									@Pc(622) int local622 = 0;
									for (@Pc(624) int local624 = 0; local624 < 30; local624++) {
										local618 += Static299.aClass90_Sub1Array2[local624].method3352();
										local620 += Static299.aClass90_Sub1Array2[local624].method3349();
										local622 += Static299.aClass90_Sub1Array2[local624].method3351();
									}
									@Pc(662) int local662 = local622 * 100 / local618;
									@Pc(668) int local668 = local620 * 10000 / local618;
									@Pc(688) String local688 = "Cache:" + Static66.method1323(true, 0, (long) local668, 2) + "% (" + local662 + "%)";
									Static26.aClass71_1.method5451(local256, local688, local251, -256);
									local256 += 12;
								}
								if (Static397.anInt6373 > 0) {
									Static26.aClass71_1.method5451(local256, "Particles: " + Static64.anInt1503 + " / " + Static397.anInt6373, local251, -256);
								}
								local256 += 12;
								if (Static402.aBoolean443) {
									Static26.aClass71_1.method5451(local256, "Polys: " + Static415.aClass39_11.ZA() + " Models: " + Static415.aClass39_11.w(), local251, -256);
									local256 += 12;
									Static26.aClass71_1.method5451(local256, "Ls: " + Static56.anInt1297 + " La: " + Static182.anInt3320 + " NPC: " + Static26.anInt585 + " Pl: " + Static57.anInt1398, local251, -256);
									Static115.method2116();
									local256 += 12;
								}
								Static71.aBooleanArray25[local72] = true;
								continue;
							}
						}
						if (local27.anInt6654 == 0) {
							if (Static42.anInt861 == local27.anInt6660 && Static415.aClass39_11.method4547()) {
								Static415.aClass39_11.method4508(local100, local105, local27.anInt6687, local27.anInt6677);
							}
							method2290(local27.anInt6689, local160, local105 - local27.anInt6741, arg3, local304, local100 - local27.anInt6678, local164, local72, local293);
							if (local27.aClass251Array2 != null) {
								method2290(local27.anInt6689, local160, local105 - local27.anInt6741, local27.aClass251Array2, local304, local100 - local27.anInt6678, local164, local72, local293);
							}
							@Pc(851) Class1_Sub23 local851 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local27.anInt6689);
							if (local851 != null) {
								Static35.method5795(local164, local304, local851.anInt3059, local72, local160, local293, local105, local100);
							}
							if (local27.anInt6660 == Static42.anInt861 && Static415.aClass39_11.method4547()) {
								Static415.aClass39_11.method4548();
								Static300.aBoolean490 = true;
							}
							Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
						}
						if (Static193.aBooleanArray27[local72] || Static289.anInt6024 > 1) {
							if (local27.anInt6654 == 3) {
								if (local108 == 0) {
									if (local27.aBoolean458) {
										Static415.aClass39_11.O(local100, local105, local27.anInt6687, local27.anInt6677, local27.anInt6730, 0);
									} else {
										Static415.aClass39_11.method4513(local100, local105, local27.anInt6687, local27.anInt6677, local27.anInt6730, 0);
									}
								} else if (local27.aBoolean458) {
									Static415.aClass39_11.O(local100, local105, local27.anInt6687, local27.anInt6677, 255 - (local108 & 0xFF) << 24 | local27.anInt6730 & 0xFFFFFF, 1);
								} else {
									Static415.aClass39_11.method4513(local100, local105, local27.anInt6687, local27.anInt6677, local27.anInt6730 & 0xFFFFFF | 255 - (local108 & 0xFF) << 24, 1);
								}
							} else if (local27.anInt6654 == 4) {
								@Pc(984) Class71 local984 = local27.method5542(Static415.aClass39_11);
								if (local984 != null) {
									local256 = local27.anInt6730;
									@Pc(999) String local999 = local27.aString67;
									if (local27.anInt6704 != -1) {
										@Pc(1009) Class152 local1009 = Static165.aClass19_1.method560(local27.anInt6704);
										local999 = local1009.aString34;
										if (local999 == null) {
											local999 = "null";
										}
										if ((local1009.anInt4185 == 1 || local27.anInt6673 != 1) && local27.anInt6673 != -1) {
											local999 = "<col=ff9040>" + local999 + "</col> x" + Static344.method4829(local27.anInt6673);
										}
									}
									if (Static182.aClass251_6 == local27) {
										local999 = Static330.aClass7_129.method331(Static341.anInt5770);
										local256 = local27.anInt6730;
									}
									if (Static278.aBoolean321) {
										Static415.aClass39_11.fa(local100, local105, local100 + local27.anInt6687, local27.anInt6677 + local105);
									}
									local984.method5448(local999, local27.anInt6665, 255 - (local108 & 0xFF) << 24 | local256, local105, null, 0, Static148.aClass143Array4, local100, null, local27.anInt6726, local27.anInt6668, local27.aBoolean464 ? 255 - (local108 & 0xFF) << 24 : -1, 0, local27.anInt6720, local27.anInt6687, local27.anInt6677);
									if (Static278.aBoolean321) {
										Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
									}
								} else if (Static26.aBoolean26) {
									Static408.method5469(local27);
								}
							} else {
								@Pc(1207) int local1207;
								if (local27.anInt6654 == 5) {
									if (local27.anInt6703 >= 0) {
										local27.method5545(Static303.aClass161_1, Static117.aClass142_1).method3878(local27.anInt6677, 0, local105, local27.anInt6685 << 3, Static415.aClass39_11, local27.anInt6735 << 3, local27.anInt6687, local100, 0);
									} else {
										@Pc(1171) Class143 local1171;
										if (local27.anInt6704 == -1) {
											local1171 = local27.method5541(Static415.aClass39_11);
										} else {
											@Pc(1181) Class60 local1181 = local27.aBoolean471 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null;
											local1171 = Static165.aClass19_1.method561(local27.anInt6673, local1181, local27.anInt6671, local27.anInt6719, local27.anInt6701 | 0xFF000000, local27.anInt6704, Static415.aClass39_11);
										}
										if (local1171 != null) {
											local256 = local1171.j();
											local1207 = local1171.T();
											local542 = (local27.anInt6730 == 0 ? 16777215 : local27.anInt6730 & 0xFFFFFF) | 255 - (local108 & 0xFF) << 24;
											if (local27.aBoolean469) {
												Static415.aClass39_11.fa(local100, local105, local27.anInt6687 + local100, local105 - -local27.anInt6677);
												if (local27.anInt6736 != 0) {
													local544 = (local256 + local27.anInt6687 - 1) / local256;
													local594 = (local1207 + local27.anInt6677 - 1) / local1207;
													for (local618 = 0; local618 < local544; local618++) {
														for (local620 = 0; local620 < local594; local620++) {
															if (local27.anInt6730 == 0) {
																local1171.method5721((float) local256 / 2.0F + (float) (local256 * local618 + local100), (float) (local105 + local620 * local1207) + (float) local1207 / 2.0F, 4096, local27.anInt6736);
															} else {
																local1171.method5725((float) local256 / 2.0F + (float) (local100 + local618 * local256), (float) local1207 / 2.0F + (float) (local105 + local1207 * local620), 4096, local27.anInt6736, local542);
															}
														}
													}
												} else if (local27.anInt6730 == 0 && local108 == 0) {
													local1171.method5724(local100, local105, local27.anInt6687, local27.anInt6677);
												} else {
													local1171.JA(local100, local105, local27.anInt6687, local27.anInt6677, 0, local542, 1);
												}
												Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
											} else if (local27.anInt6730 == 0 && local108 == 0) {
												if (local27.anInt6736 != 0) {
													local1171.method5721((float) local100 + (float) local27.anInt6687 / 2.0F, (float) local105 + (float) local27.anInt6677 / 2.0F, local27.anInt6687 * 4096 / local256, local27.anInt6736);
												} else if (local27.anInt6687 == local256 && local1207 == local27.anInt6677) {
													local1171.method5723(local100, local105);
												} else {
													local1171.method5719(local100, local105, local27.anInt6687, local27.anInt6677);
												}
											} else if (local27.anInt6736 != 0) {
												local1171.method5725((float) local27.anInt6687 / 2.0F + (float) local100, (float) local105 + (float) local27.anInt6677 / 2.0F, local27.anInt6687 * 4096 / local256, local27.anInt6736, local542);
											} else if (local27.anInt6687 == local256 && local27.anInt6677 == local1207) {
												local1171.r(local100, local105, 0, local542, 1);
											} else {
												local1171.s(local100, local105, local27.anInt6687, local27.anInt6677, 0, local542, 1);
											}
										} else if (Static26.aBoolean26) {
											Static408.method5469(local27);
										}
									}
								} else if (local27.anInt6654 == 6) {
									Static264.method3899();
									@Pc(1540) Class105 local1540 = null;
									local256 = 0;
									@Pc(1648) Class223 local1648;
									@Pc(1658) Class60 local1658;
									if (local27.anInt6704 != -1) {
										@Pc(1764) Class152 local1764 = Static165.aClass19_1.method560(local27.anInt6704);
										if (local1764 != null) {
											local1764 = local1764.method3499(local27.anInt6673);
											local1648 = local27.anInt6699 == -1 ? null : Static293.aClass127_1.method2975(local27.anInt6699);
											local1658 = local27.aBoolean471 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null;
											local1540 = local1764.method3492(local27.anInt6721, local27.anInt6716, 1, local1658, local27.anInt6717, local1648, 2048, Static415.aClass39_11);
											if (local1540 == null) {
												Static408.method5469(local27);
											} else {
												local256 = -local1540.MA() >> 1;
											}
										}
									} else if (local27.anInt6710 == 5) {
										local1207 = local27.anInt6738;
										if (local1207 >= 0 && local1207 < 2048) {
											@Pc(1698) Class31_Sub2_Sub1_Sub1 local1698 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local1207];
											@Pc(1711) Class223 local1711 = local27.anInt6699 == -1 ? null : Static293.aClass127_1.method2975(local27.anInt6699);
											if (local1698 != null && (local1207 == Static102.anInt2165 || Static404.method5427(local1698.aString10) == local27.anInt6743)) {
												local1540 = local1698.aClass60_1.method1648(Static293.aClass127_1, local1711, Static238.aClass116_2, 0, local27.anInt6721, local27.anInt6716, Static415.aClass39_11, Static117.aClass75_1, null, 0, Static165.aClass19_1, -1, null, Static394.aClass23_1, 2048, local27.anInt6717, Static184.aClass158_1);
											}
										}
									} else if (local27.anInt6710 == 8 || local27.anInt6710 == 9) {
										@Pc(1636) Class1_Sub14 local1636 = Static48.method871(false, local27.anInt6738);
										local1648 = local27.anInt6699 == -1 ? null : Static293.aClass127_1.method2975(local27.anInt6699);
										if (local1636 != null) {
											local1658 = local27.aBoolean471 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null;
											local1540 = local1636.method1585(local1658, local1648, local27.anInt6721, local27.anInt6743, local27.anInt6716, Static415.aClass39_11, local27.anInt6717, local27.anInt6710 == 9);
										}
									} else if (local27.anInt6699 == -1) {
										local1540 = local27.method5539(Static394.aClass23_1, null, Static184.aClass158_1, Static415.aClass39_11, Static165.aClass19_1, -1, Static238.aClass116_2, Static117.aClass75_1, -1, Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1, Static293.aClass127_1, 0, 2048);
										if (local1540 == null && Static26.aBoolean26) {
											Static408.method5469(local27);
										}
									} else {
										@Pc(1601) Class223 local1601 = Static293.aClass127_1.method2975(local27.anInt6699);
										local1540 = local27.method5539(Static394.aClass23_1, local1601, Static184.aClass158_1, Static415.aClass39_11, Static165.aClass19_1, local27.anInt6721, Static238.aClass116_2, Static117.aClass75_1, local27.anInt6716, Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1, Static293.aClass127_1, local27.anInt6717, 2048);
										if (local1540 == null && Static26.aBoolean26) {
											Static408.method5469(local27);
										}
									}
									if (local1540 != null) {
										if (local27.anInt6680 > 0) {
											local1207 = (local27.anInt6687 << 9) / local27.anInt6680;
										} else {
											local1207 = 512;
										}
										if (local27.anInt6653 > 0) {
											local542 = (local27.anInt6677 << 9) / local27.anInt6653;
										} else {
											local542 = 512;
										}
										local544 = local100 + local27.anInt6687 / 2 + (local1207 * local27.anInt6692 >> 9);
										local594 = local27.anInt6677 / 2 + local105 + (local542 * local27.anInt6657 >> 9);
										Static260.aClass33_4.xa();
										Static415.aClass39_11.ea(Static260.aClass33_4);
										Static415.aClass39_11.H(local544, local594, local1207, local542);
										Static415.aClass39_11.g((float) (local27.anInt6676 << 0), local27.aBoolean465 ? (float) (local27.anInt6739 << 0) : (float) (local27.anInt6739 << 0) * 1.5F);
										if (arg0 == -1412584499 || Static300.aBoolean490) {
											Static415.aClass39_11.e();
											Static415.aClass39_11.method4524();
											Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
											Static300.aBoolean490 = false;
										}
										if (local27.aBoolean460) {
											Static415.aClass39_11.method4504(false);
										}
										local618 = (local27.anInt6706 << 0) * Class183.anIntArray433[local27.anInt6724 << 3] >> 15;
										local620 = Class183.anIntArray434[local27.anInt6724 << 3] * (local27.anInt6706 << 0) >> 15;
										Static115.aClass33_2.O(-local27.anInt6696 << 3);
										Static115.aClass33_2.ja(local27.anInt6707 << 3);
										Static115.aClass33_2.o(local27.anInt6711 << 0, local256 + (local27.anInt6702 << 0) + local618, (local27.anInt6702 << 0) + local620);
										Static115.aClass33_2.ka(local27.anInt6724 << 3);
										if (Static278.aBoolean321) {
											Static415.aClass39_11.fa(local100, local105, local100 + local27.anInt6687, local27.anInt6677 + local105);
										}
										if (local27.aBoolean465) {
											local1540.method3546(Static115.aClass33_2, null, local27.anInt6706 << 0);
										} else {
											local1540.method3534(Static115.aClass33_2, null, 1);
										}
										if (Static278.aBoolean321) {
											Static415.aClass39_11.OA(arg1, arg6, arg8, arg4);
										}
										if (local27.aBoolean460) {
											Static415.aClass39_11.method4504(true);
										}
										Static415.aClass39_11.g(0.0F, 0.0F);
									}
								} else if (local27.anInt6654 == 9) {
									if (local27.aBoolean457) {
										local542 = local105;
										local1207 = local27.anInt6687 + local100;
										local256 = local27.anInt6677 + local105;
									} else {
										local542 = local105 + local27.anInt6677;
										local256 = local105;
										local1207 = local27.anInt6687 + local100;
									}
									if (local27.anInt6652 == 1) {
										Static415.aClass39_11.method4555(local100, local256, local1207, local542, local27.anInt6730, 0);
									} else {
										Static415.aClass39_11.method4532(local100, local256, local1207, local542, local27.anInt6730, local27.anInt6652);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!ga;)Lclient!ya;")
	public static Class39 method2291(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class39_Sub1(arg0, arg1, arg2);
	}
}
