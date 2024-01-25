import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z")
	public static boolean method1521() {
		return Static37.anInt1104 > 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method1523() {
		if (!Static329.aBoolean166) {
			return;
		}
		@Pc(11) Class208 local11 = Static108.method2085(Static452.anInt7746, Static395.anInt6819);
		if (local11 != null && local11.anObjectArray29 != null) {
			@Pc(20) Class3_Sub13 local20 = new Class3_Sub13();
			local20.aClass208_2 = local11;
			local20.anObjectArray1 = local11.anObjectArray29;
			Static543.method7498(local20);
		}
		Static267.anInt5035 = -1;
		Static329.aBoolean166 = false;
		Static169.anInt3050 = -1;
		if (local11 != null) {
			Static374.method5525(local11);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIII[Lclient!kh;IIII)V")
	public static void method1524(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class208[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class208 local23 = arg5[local17];
			if (local23 != null && (arg1 == local23.anInt5634 || arg1 == -1412584499 && local23 == Static503.aClass208_9)) {
				@Pc(49) int local49 = local23.anInt5592 + arg7;
				@Pc(54) int local54 = arg3 + local23.anInt5680;
				@Pc(61) int local61 = local23.anInt5639 + local49 + 1;
				@Pc(68) int local68 = local54 + local23.anInt5630 + 1;
				@Pc(73) int local73;
				if (arg4 == -1) {
					Class84_Sub2.aRectangleArray2[Static47.anInt1250].setBounds(local23.anInt5592 + arg7, arg3 + local23.anInt5680, local23.anInt5639, local23.anInt5630);
					local73 = Static47.anInt1250++;
				} else {
					local73 = arg4;
				}
				local23.anInt5615 = local73;
				local23.anInt5611 = Static621.anInt9665;
				if (!Static82.method1768(local23)) {
					if (local23.anInt5659 != 0) {
						Static320.method5019(local23);
					}
					@Pc(118) int local118 = arg7 + local23.anInt5592;
					@Pc(123) int local123 = local23.anInt5680 + arg3;
					@Pc(125) int local125 = 0;
					@Pc(127) int local127 = 0;
					if (Static649.aBoolean735) {
						local125 = Static359.method5380();
						local127 = Static265.method7952();
					}
					@Pc(140) int local140 = local23.anInt5590;
					if (Static605.aBoolean708 && (Static82.method1754(local23).anInt19 != 0 || local23.anInt5643 == 0) && local140 > 127) {
						local140 = 127;
					}
					@Pc(195) int local195;
					@Pc(201) int local201;
					if (local23 == Static503.aClass208_9) {
						if (arg1 != -1412584499 && (Static643.anInt9914 == local23.anInt5675 || Static26.anInt758 == local23.anInt5675)) {
							Static325.anInt6036 = arg7;
							Static331.aClass208Array32 = arg5;
							Static396.anInt6824 = arg3;
							continue;
						}
						if (Static514.aBoolean645 && Static363.aBoolean495) {
							local195 = Static542.aClass75_1.method8412() + local125;
							local201 = local127 + Static542.aClass75_1.method8405();
							local195 -= Static67.anInt9111;
							local201 -= Static595.anInt9374;
							if (Static216.anInt3996 > local195) {
								local195 = Static216.anInt3996;
							}
							if (local201 < Static551.anInt8933) {
								local201 = Static551.anInt8933;
							}
							if (Static216.anInt3996 + Static526.aClass208_10.anInt5639 < local23.anInt5639 + local195) {
								local195 = Static216.anInt3996 + Static526.aClass208_10.anInt5639 - local23.anInt5639;
							}
							local118 = local195;
							if (Static526.aClass208_10.anInt5630 + Static551.anInt8933 < local201 - -local23.anInt5630) {
								local201 = Static526.aClass208_10.anInt5630 + Static551.anInt8933 - local23.anInt5630;
							}
							local123 = local201;
						}
						if (Static26.anInt758 == local23.anInt5675) {
							local140 = 128;
						}
					}
					@Pc(326) int local326;
					@Pc(337) int local337;
					@Pc(287) int local287;
					@Pc(293) int local293;
					if (local23.anInt5643 == 2) {
						local195 = arg8;
						local326 = arg6;
						local337 = arg9;
						local201 = arg2;
					} else {
						local287 = local118 + local23.anInt5639;
						local293 = local123 + local23.anInt5630;
						local195 = arg8 < local118 ? local118 : arg8;
						if (local23.anInt5643 == 9) {
							local287++;
							local293++;
						}
						local201 = arg2 >= local123 ? arg2 : local123;
						local326 = arg6 <= local287 ? arg6 : local287;
						local337 = local293 >= arg9 ? arg9 : local293;
					}
					if (local195 < local326 && local201 < local337) {
						@Pc(644) int local644;
						@Pc(689) int local689;
						@Pc(783) int local783;
						@Pc(785) int local785;
						@Pc(676) int local676;
						@Pc(678) int local678;
						if (local23.anInt5659 != 0) {
							if (Static62.anInt1560 == local23.anInt5659 || Static517.anInt8661 == local23.anInt5659) {
								Static250.method3961(local118, local23, local123);
								if (!Static649.aBoolean735) {
									Static626.method8270(local123, local118, local23.anInt5639, local23.anInt5630, local23.anInt5659 == Static517.anInt8661);
									Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
								}
								Static119.aBooleanArray10[local73] = true;
								continue;
							}
							if (Static656.anInt1400 == local23.anInt5659) {
								if (local23.method4715(Static582.aClass16_12) != null) {
									Static312.method4827();
									Static47.method1249(local123, local118, Static582.aClass16_12, local23);
									Static496.aBooleanArray23[local73] = true;
									Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
									if (Static649.aBoolean735) {
										if (arg0) {
											Static120.method2177(local49, local61, local54, local68);
										} else {
											Static566.method4440(local49, local61, local68, local54);
										}
									}
								}
								continue;
							}
							if (Static221.anInt4056 == local23.anInt5659) {
								Static555.method7595(local118, local123, Static582.aClass16_12, local23);
								continue;
							}
							if (local23.anInt5659 == Static295.anInt5410) {
								Static242.method3908(local23, local23.anInt5600 % 64, local123, local118, Static582.aClass16_12);
								continue;
							}
							if (local23.anInt5659 == Static654.anInt10067) {
								if (local23.method4715(Static582.aClass16_12) != null) {
									Static373.method5517(local23, local118, local123);
									Static496.aBooleanArray23[local73] = true;
									Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
									if (Static649.aBoolean735) {
										if (arg0) {
											Static120.method2177(local49, local61, local54, local68);
										} else {
											Static566.method4440(local49, local61, local68, local54);
										}
									}
								}
								continue;
							}
							if (local23.anInt5659 == Static422.anInt7132) {
								Static532.method7416(local123, Static582.aClass16_12, local23.anInt5639, local23.anInt5630, Static166.anInterface5_5, local118);
								Static119.aBooleanArray10[local73] = true;
								Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
								continue;
							}
							if (local23.anInt5659 == Static73.anInt1677) {
								Static459.method6585(local23.anInt5639, local123, local118, local23.anInt5630, Static582.aClass16_12);
								Static119.aBooleanArray10[local73] = true;
								Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
								continue;
							}
							if (Static458.anInt7842 == local23.anInt5659) {
								if (!Static408.aBoolean526 && !Static311.aBoolean452) {
									continue;
								}
								local287 = local118 + local23.anInt5639;
								if (Static649.aBoolean735) {
									if (arg0) {
										Static120.method2177(local49, local61, local54, local68);
									} else {
										Static566.method4440(local49, local61, local68, local54);
									}
								}
								local293 = local123 + 15;
								if (Static408.aBoolean526) {
									local644 = -256;
									if (Static3.anInt18 < 20) {
										local644 = -65536;
									}
									Static277.aClass69_9.method7458(local293, local287, "Fps:" + Static3.anInt18, -1, local644);
									local293 += 15;
									@Pc(666) Runtime local666 = Runtime.getRuntime();
									local676 = (int) ((local666.totalMemory() - local666.freeMemory()) / 1024L);
									local678 = -256;
									if (local676 > 98304) {
										if (Static415.aBoolean533) {
											Static4.method44();
											for (local689 = 0; local689 < 10; local689++) {
												System.gc();
											}
											local676 = (int) ((local666.totalMemory() - local666.freeMemory()) / 1024L);
											if (local676 > 65536) {
												Static304.method4693("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local678 = -65536;
									}
									Static277.aClass69_9.method7458(local293, local287, "Mem:" + local676 + "k", -1, local678);
									local293 += 15;
									Static277.aClass69_9.method7458(local293, local287, "In:" + Static369.anInt1973 + "B/s Out:" + Static67.anInt9107 + "B/s", -1, -256);
									local293 += 15;
									local689 = Static582.aClass16_12.E() / 1024;
									Static277.aClass69_9.method7458(local293, local287, "Offheap:" + local689 + "k", -1, ~local689 >= -65537 ? -256 : -65536);
									local293 += 15;
									local783 = 0;
									local785 = 0;
									@Pc(787) int local787 = 0;
									for (@Pc(789) int local789 = 0; local789 < 37; local789++) {
										if (Static601.aClass89_Sub1Array2[local789] != null) {
											local783 += Static601.aClass89_Sub1Array2[local789].method2164();
											local785 += Static601.aClass89_Sub1Array2[local789].method2157();
											local787 += Static601.aClass89_Sub1Array2[local789].method2163();
										}
									}
									@Pc(829) int local829 = local787 * 100 / local783;
									@Pc(835) int local835 = local785 * 10000 / local783;
									@Pc(857) String local857 = "Cache:" + Static529.method7390((long) local835, true, 2, 0) + "% (" + local829 + "%)";
									Static157.aClass69_2.method7458(local293, local287, local857, -1, -256);
									local293 += 12;
								}
								if (Static442.anInt7680 > 0) {
									Static157.aClass69_2.method7458(local293, local287, "Particles: " + Static250.anInt4672 + " / " + Static442.anInt7680, -1, -256);
								}
								local293 += 12;
								if (Static311.aBoolean452) {
									Static157.aClass69_2.method7458(local293, local287, "Polys: " + Static582.aClass16_12.I() + " Models: " + Static582.aClass16_12.M(), -1, -256);
									local293 += 12;
									Static157.aClass69_2.method7458(local293, local287, "Ls: " + Static538.anInt8816 + " La: " + Static53.anInt1411 + " NPC: " + Static346.anInt6225 + " Pl: " + Static469.anInt8009, -1, -256);
									local293 += 12;
									Static376.method5543();
								}
								Static119.aBooleanArray10[local73] = true;
								continue;
							}
						}
						@Pc(1016) Class3_Sub28 local1016;
						if (local23.anInt5643 == 0) {
							if (Static281.anInt5254 == local23.anInt5659 && Static582.aClass16_12.method8186()) {
								Static582.aClass16_12.method8143(local118, local123, local23.anInt5639, local23.anInt5630);
							}
							method1524(arg0, local23.anInt5653, local201, local123 - local23.anInt5648, local73, arg5, local326, local118 - local23.anInt5594, local195, local337);
							if (local23.aClass208Array20 != null) {
								method1524(arg0, local23.anInt5653, local201, local123 - local23.anInt5648, local73, local23.aClass208Array20, local326, local118 - local23.anInt5594, local195, local337);
							}
							local1016 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local23.anInt5653);
							if (local1016 != null) {
								Static101.method1998(local118, local337, local201, local123, local326, local195, local1016.anInt5252, local73);
							}
							if (Static281.anInt5254 == local23.anInt5659 && Static582.aClass16_12.method8186()) {
								Static582.aClass16_12.method8172();
							}
							Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
						}
						if (Static389.aBooleanArray18[local73] || Static339.anInt6143 > 1) {
							if (local23.anInt5643 == 3) {
								if (local140 == 0) {
									if (local23.aBoolean447) {
										Static582.aClass16_12.aa(local118, local123, local23.anInt5639, local23.anInt5630, local23.anInt5600, 0);
									} else {
										Static582.aClass16_12.method8146(local118, local123, local23.anInt5639, local23.anInt5630, local23.anInt5600, 0);
									}
								} else if (local23.aBoolean447) {
									Static582.aClass16_12.aa(local118, local123, local23.anInt5639, local23.anInt5630, local23.anInt5600 & 0xFFFFFF | 255 - (local140 & 0xFF) << 24, 1);
								} else {
									Static582.aClass16_12.method8146(local118, local123, local23.anInt5639, local23.anInt5630, 255 - (local140 & 0xFF) << 24 | local23.anInt5600 & 0xFFFFFF, 1);
								}
								if (Static649.aBoolean735) {
									if (arg0) {
										Static120.method2177(local49, local61, local54, local68);
									} else {
										Static566.method4440(local49, local61, local68, local54);
									}
								}
							} else {
								@Pc(1204) Class146 local1204;
								if (local23.anInt5643 == 4) {
									@Pc(1176) Class69 local1176 = local23.method4726(Static582.aClass16_12);
									if (local1176 != null) {
										local293 = local23.anInt5600;
										@Pc(1193) String local1193 = local23.aString69;
										if (local23.anInt5645 != -1) {
											local1204 = Static237.aClass371_2.method8305(local23.anInt5645);
											local1193 = local1204.aString46;
											if (local1193 == null) {
												local1193 = "null";
											}
											if ((local1204.anInt3696 == 1 || local23.anInt5605 != 1) && local23.anInt5605 != -1) {
												local1193 = "<col=ff9040>" + local1193 + "</col> x" + Static356.method5367(local23.anInt5605);
											}
										}
										if (local23.anInt5625 != -1) {
											local1193 = Static506.method7175(local23.anInt5625);
											if (local1193 == null) {
												local1193 = "";
											}
										}
										if (local23 == Static339.aClass208_8) {
											local1193 = Static569.aClass335_32.method7694(Static319.anInt5939);
											local293 = local23.anInt5600;
										}
										if (Static650.aBoolean739) {
											Static582.aClass16_12.T(local118, local123, local23.anInt5639 + local118, local23.anInt5630 + local123);
										}
										local1176.method7457(0, local23.anInt5609, local23.aBoolean442 ? 255 - (local140 & 0xFF) << 24 : -1, (int[]) null, local1193, local118, local293 | 255 - (local140 & 0xFF) << 24, local23.anInt5676, local23.anInt5639, local23.anInt5630, Static111.aClass102Array25, local23.anInt5638, 0, local23.lb, (Class1) null, local123);
										if (Static650.aBoolean739) {
											Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
										}
										if (local1193.trim().length() > 0) {
											if (!Static650.aBoolean739) {
												@Pc(1351) Class202 local1351 = Static582.method7835(Static582.aClass16_12, local23.anInt5641);
												local676 = local1351.method4626(local23.anInt5639, Static111.aClass102Array25, local1193);
												local678 = local1351.method4625(Static111.aClass102Array25, local23.anInt5676, local1193, local23.anInt5639);
												if (Static649.aBoolean735) {
													if (arg0) {
														Static120.method2177(local118, local676 + local118, local123, local678 + local123);
													} else {
														Static566.method4440(local118, local118 + local676, local123 + local678, local123);
													}
												}
											} else if (Static649.aBoolean735) {
												if (arg0) {
													Static120.method2177(local49, local61, local54, local68);
												} else {
													Static566.method4440(local49, local61, local68, local54);
												}
											}
										}
									} else if (Static515.aBoolean647) {
										Static374.method5525(local23);
									}
								} else {
									@Pc(1510) int local1510;
									if (local23.anInt5643 == 5) {
										if (local23.anInt5644 < 0) {
											@Pc(1445) Class102 local1445;
											if (local23.anInt5645 != -1) {
												@Pc(1462) Class293 local1462 = local23.aBoolean433 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null;
												local1445 = Static237.aClass371_2.method8306(local23.anInt5645, local23.anInt5665 | 0xFF000000, local23.anInt5606, local23.anInt5605, Static582.aClass16_12, local1462, local23.anInt5612);
											} else if (local23.anInt5625 == -1) {
												local1445 = local23.method4721(Static582.aClass16_12);
											} else {
												local1445 = Static641.method8424(Static582.aClass16_12, local23.anInt5625);
											}
											if (local1445 != null) {
												local293 = local1445.method6951();
												local644 = local1445.method6958();
												local1510 = 255 - (local140 & 0xFF) << 24 | (local23.anInt5600 == 0 ? 16777215 : local23.anInt5600 & 0xFFFFFF);
												if (local23.aBoolean440) {
													Static582.aClass16_12.T(local118, local123, local118 + local23.anInt5639, local123 + local23.anInt5630);
													if (local23.anInt5616 != 0) {
														local676 = (local23.anInt5639 + local293 - 1) / local293;
														local678 = (local23.anInt5630 + local644 - 1) / local644;
														for (local689 = 0; local689 < local676; local689++) {
															for (local783 = 0; local783 < local678; local783++) {
																if (local23.anInt5600 == 0) {
																	local1445.method6963((float) local293 / 2.0F + (float) (local689 * local293 + local118), (float) (local783 * local644 + local123) + (float) local644 / 2.0F, 4096, local23.anInt5616);
																} else {
																	local1445.method6956((float) local293 / 2.0F + (float) (local293 * local689 + local118), (float) local644 / 2.0F + (float) (local123 + local644 * local783), 4096, local23.anInt5616, local1510);
																}
															}
														}
													} else if (local23.anInt5600 == 0 && local140 == 0) {
														local1445.method6949(local118, local123, local23.anInt5639, local23.anInt5630);
													} else {
														local1445.method6964(local118, local123, local23.anInt5639, local23.anInt5630, 0, local1510, 1);
													}
													Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
												} else if (local23.anInt5600 == 0 && local140 == 0) {
													if (local23.anInt5616 != 0) {
														local1445.method6963((float) local118 + (float) local23.anInt5639 / 2.0F, (float) local123 + (float) local23.anInt5630 / 2.0F, local23.anInt5639 * 4096 / local293, local23.anInt5616);
													} else if (local293 == local23.anInt5639 && local644 == local23.anInt5630) {
														local1445.method6961(local118, local123);
													} else {
														local1445.method6947(local118, local123, local23.anInt5639, local23.anInt5630);
													}
												} else if (local23.anInt5616 != 0) {
													local1445.method6956((float) local23.anInt5639 / 2.0F + (float) local118, (float) local123 + (float) local23.anInt5630 / 2.0F, local23.anInt5639 * 4096 / local293, local23.anInt5616, local1510);
												} else if (local23.anInt5639 == local293 && local23.anInt5630 == local644) {
													local1445.method6955(local118, local123, 0, local1510, 1);
												} else {
													local1445.method6970(local118, local123, local23.anInt5639, local23.anInt5630, 0, local1510, 1);
												}
											} else if (Static515.aBoolean647) {
												Static374.method5525(local23);
											}
										} else {
											local23.method4731(Static357.aClass322_4, Static377.aClass222_1).method88(local23.anInt5639, local23.anInt5630, local118, local23.anInt5622 << 3, Static582.aClass16_12, local123, 0, 0, local23.anInt5658 << 3);
										}
										if (Static649.aBoolean735) {
											if (arg0) {
												Static120.method2177(local49, local61, local54, local68);
											} else {
												Static566.method4440(local49, local61, local68, local54);
											}
										}
									} else if (local23.anInt5643 == 6) {
										Static481.method6841();
										local1016 = null;
										@Pc(1878) Class28 local1878 = null;
										local644 = 0;
										@Pc(1911) Class48 local1911;
										@Pc(1919) Class293 local1919;
										if (local23.anInt5645 != -1) {
											local1204 = Static237.aClass371_2.method8305(local23.anInt5645);
											if (local1204 != null) {
												local1204 = local1204.method3190(local23.anInt5605);
												local1911 = local23.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(local23.anInt5596);
												local1919 = local23.aBoolean433 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null;
												local1878 = local1204.method3197(Static582.aClass16_12, 2048, local23.anInt5655, local1919, 1, local1911, local23.anInt5656, local23.anInt5591);
												if (local1878 == null) {
													Static374.method5525(local23);
												} else {
													local644 = -local1878.fa() >> 1;
												}
											}
										} else if (local23.anInt5599 == 5) {
											local1510 = local23.anInt5636;
											if (local1510 >= 0 && local1510 < 2048) {
												@Pc(1968) Class23_Sub2_Sub1_Sub2_Sub1 local1968 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local1510];
												@Pc(1980) Class48 local1980 = local23.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(local23.anInt5596);
												if (local1968 != null && (local1510 == Static251.anInt4687 || Static104.method2037(local1968.aString34) == local23.anInt5603)) {
													local1878 = local1968.aClass293_1.method6981(0, Static483.aClass373_2, local23.anInt5591, -1, (int[]) null, local23.anInt5655, 2048, local1980, 0, (Class48) null, Static592.aClass47_2, Static481.aClass241_2, Static237.aClass371_2, 0, (Class140[]) null, Static605.aClass43_1, Static582.aClass16_12, Static658.aClass88_2, local23.anInt5656);
												}
											}
										} else if (local23.anInt5599 == 8 || local23.anInt5599 == 9) {
											@Pc(2039) Class3_Sub29 local2039 = Static577.method7771(false, local23.anInt5636);
											local1911 = local23.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(local23.anInt5596);
											if (local2039 != null) {
												local1919 = local23.aBoolean433 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null;
												local1878 = local2039.method4563(local23.anInt5656, local23.anInt5655, local1911, local23.anInt5591, local23.anInt5599 == 9, local23.anInt5603, Static582.aClass16_12, local1919);
											}
										} else if (local23.anInt5596 == -1) {
											local1878 = local23.method4719(local1016, 2048, -1, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1, Static582.aClass16_12, 0, Static481.aClass241_2, -1, Static237.aClass371_2, (Class48) null, Static658.aClass88_2, Static592.aClass47_2, Static605.aClass43_1, Static483.aClass373_2);
											if (local1878 == null && Static515.aBoolean647) {
												Static374.method5525(local23);
											}
										} else {
											@Pc(2126) Class48 local2126 = Static483.aClass373_2.method8323(local23.anInt5596);
											local1878 = local23.method4719(local1016, 2048, local23.anInt5591, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1, Static582.aClass16_12, local23.anInt5655, Static481.aClass241_2, local23.anInt5656, Static237.aClass371_2, local2126, Static658.aClass88_2, Static592.aClass47_2, Static605.aClass43_1, Static483.aClass373_2);
											if (local1878 == null && Static515.aBoolean647) {
												Static374.method5525(local23);
											}
										}
										if (local1878 != null) {
											if (local23.anInt5660 > 0) {
												local1510 = (local23.anInt5639 << 9) / local23.anInt5660;
											} else {
												local1510 = 512;
											}
											if (local23.anInt5668 <= 0) {
												local676 = 512;
											} else {
												local676 = (local23.anInt5630 << 9) / local23.anInt5668;
											}
											local678 = local23.anInt5639 / 2 + local118;
											local689 = local123 + local23.anInt5630 / 2;
											if (!local23.aBoolean431) {
												local689 += local676 * local23.anInt5661 >> 9;
												local678 += local1510 * local23.anInt5598 >> 9;
											}
											Static668.aClass25_9.method4291();
											Static582.aClass16_12.method8135(Static668.aClass25_9);
											Static582.aClass16_12.DA(local678, local689, local1510, local676);
											Static582.aClass16_12.ya();
											if (local23.aBoolean437) {
												Static582.aClass16_12.C(false);
											}
											if (local23.aBoolean431) {
												Static366.aClass25_4.method4285(local23.anInt5614);
												Static366.aClass25_4.method4288(local23.anInt5679);
												Static366.aClass25_4.method4293(local23.anInt5672);
												Static366.aClass25_4.method4301(local23.anInt5598, local23.anInt5661, local23.anInt5664);
											} else {
												local783 = (local23.anInt5678 << 2) * Class3_Sub7_Sub2.anIntArray171[local23.anInt5614 << 3] >> 14;
												local785 = (local23.anInt5678 << 2) * Class3_Sub7_Sub2.anIntArray170[local23.anInt5614 << 3] >> 14;
												Static366.aClass25_4.method4298(-local23.anInt5672 << 3);
												Static366.aClass25_4.method4288(local23.anInt5679 << 3);
												Static366.aClass25_4.method4301(local23.anInt5628 << 2, local644 + local783 + (local23.anInt5624 << 2), (local23.anInt5624 << 2) + local785);
												Static366.aClass25_4.method4284(local23.anInt5614 << 3);
											}
											local23.method4723(Static621.anInt9665, Static582.aClass16_12, local1878, Static366.aClass25_4);
											if (Static650.aBoolean739) {
												Static582.aClass16_12.T(local118, local123, local118 + local23.anInt5639, local123 - -local23.anInt5630);
											}
											if (local23.aBoolean431) {
												if (local23.aBoolean446) {
													local1878.method6894(Static366.aClass25_4, (Class23_Sub4) null, local23.anInt5678, 1);
												} else {
													local1878.method6908(Static366.aClass25_4, (Class23_Sub4) null, 1);
													if (local23.aClass23_Sub5_5 != null) {
														Static582.aClass16_12.method8119(local23.aClass23_Sub5_5.method2592());
													}
												}
											} else if (local23.aBoolean446) {
												local1878.method6894(Static366.aClass25_4, (Class23_Sub4) null, local23.anInt5678 << 2, 1);
											} else {
												local1878.method6908(Static366.aClass25_4, (Class23_Sub4) null, 1);
												if (local23.aClass23_Sub5_5 != null) {
													Static582.aClass16_12.method8119(local23.aClass23_Sub5_5.method2592());
												}
											}
											if (Static650.aBoolean739) {
												Static582.aClass16_12.KA(arg8, arg2, arg6, arg9);
											}
											if (local23.aBoolean437) {
												Static582.aClass16_12.C(true);
											}
										}
										if (Static649.aBoolean735) {
											if (arg0) {
												Static120.method2177(local49, local61, local54, local68);
											} else {
												Static566.method4440(local49, local61, local68, local54);
											}
										}
									} else if (local23.anInt5643 == 9) {
										if (local23.aBoolean436) {
											local644 = local118 + local23.anInt5639;
											local1510 = local123;
											local293 = local123 + local23.anInt5630;
										} else {
											local293 = local123;
											local1510 = local123 + local23.anInt5630;
											local644 = local23.anInt5639 + local118;
										}
										if (local23.anInt5627 == 1) {
											Static582.aClass16_12.method8140(local118, local293, local644, local1510, local23.anInt5600, 0);
										} else {
											Static582.aClass16_12.method8147(local118, local293, local644, local1510, local23.anInt5600, local23.anInt5627);
										}
										if (Static649.aBoolean735) {
											if (arg0) {
												Static120.method2177(local49, local61, local54, local68);
											} else {
												Static566.method4440(local49, local61, local68, local54);
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fca;Ljava/lang/String;I)I")
	public static int method1525(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) String arg1) {
		@Pc(11) int local11 = arg0.lb;
		@Pc(15) byte[] local15 = Static497.method7095(arg1);
		arg0.method4857(local15.length);
		arg0.lb += Static255.aClass332_1.method7672(arg0.aByteArray59, 0, arg0.lb, local15.length, local15);
		return arg0.lb - local11;
	}
}
