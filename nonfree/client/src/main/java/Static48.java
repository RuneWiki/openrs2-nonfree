import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "Lclient!mv;")
	public static Class229 aClass229_11;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "[I")
	public static int[] anIntArray101 = null;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "Lclient!id;")
	public static final Class155 aClass155_2 = new Class155();

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "Lclient!au;")
	public static final Class21 aClass21_12 = new Class21(8);

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
	public static int anInt898 = 100;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIII[Lclient!ps;I)V")
	public static void method857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class273[] arg7, @OriginalArg(9) int arg8) {
		Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
		for (@Pc(21) int local21 = 0; local21 < arg7.length; local21++) {
			@Pc(27) Class273 local27 = arg7[local21];
			if (local27 != null && (local27.anInt6820 == arg6 || arg6 == -1412584499 && Class12_Sub2_Sub1_Sub3.lb == local27)) {
				@Pc(48) int local48;
				if (arg2 == -1) {
					Class198.aRectangleArray2[Static292.anInt4935].setBounds(arg8 + local27.anInt6817, arg4 + local27.anInt6855, local27.anInt6883, local27.anInt6814);
					local48 = Static292.anInt4935++;
				} else {
					local48 = arg2;
				}
				local27.anInt6816 = local48;
				local27.anInt6870 = Static532.anInt8757;
				if (!Static70.method1167(local27)) {
					if (local27.anInt6825 != 0) {
						Static108.method1583(local27);
					}
					@Pc(95) int local95 = local27.anInt6817 + arg8;
					@Pc(100) int local100 = arg4 + local27.anInt6855;
					@Pc(103) int local103 = local27.anInt6873;
					if (Static440.aBoolean582 && (Static70.method1164(local27).anInt3330 != 0 || local27.anInt6868 == 0) && local103 > 127) {
						local103 = 127;
					}
					@Pc(158) int local158;
					@Pc(162) int local162;
					if (local27 == Class12_Sub2_Sub1_Sub3.lb) {
						if (arg6 != -1412584499 && (Static524.anInt8327 == local27.anInt6877 || local27.anInt6877 == Static26.anInt450)) {
							Static23.anInt408 = arg4;
							Static354.anInt6048 = arg8;
							Static101.aClass273Array1 = arg7;
							continue;
						}
						if (Static489.aBoolean658 && Static469.aBoolean646) {
							local158 = Static205.aClass131_1.method6544();
							local162 = Static205.aClass131_1.method6542();
							local162 -= Static385.anInt6376;
							local158 -= Static529.anInt8481;
							if (local158 < Static490.anInt7768) {
								local158 = Static490.anInt7768;
							}
							if (Static344.aClass273_8.anInt6883 + Static490.anInt7768 < local27.anInt6883 + local158) {
								local158 = Static344.aClass273_8.anInt6883 + Static490.anInt7768 - local27.anInt6883;
							}
							if (Static434.anInt6970 > local162) {
								local162 = Static434.anInt6970;
							}
							if (local27.anInt6814 + local162 > Static344.aClass273_8.anInt6814 + Static434.anInt6970) {
								local162 = Static344.aClass273_8.anInt6814 + Static434.anInt6970 - local27.anInt6814;
							}
							local95 = local158;
							local100 = local162;
						}
						if (local27.anInt6877 == Static26.anInt450) {
							local103 = 128;
						}
					}
					@Pc(282) int local282;
					@Pc(293) int local293;
					@Pc(244) int local244;
					@Pc(249) int local249;
					if (local27.anInt6868 == 2) {
						local293 = arg1;
						local162 = arg0;
						local158 = arg3;
						local282 = arg5;
					} else {
						local244 = local27.anInt6883 + local95;
						local249 = local27.anInt6814 + local100;
						local158 = arg3 >= local95 ? arg3 : local95;
						if (local27.anInt6868 == 9) {
							local244++;
							local249++;
						}
						local162 = local100 <= arg0 ? arg0 : local100;
						local282 = local244 >= arg5 ? arg5 : local244;
						local293 = local249 < arg1 ? local249 : arg1;
					}
					if (local158 < local282 && local162 < local293) {
						@Pc(527) int local527;
						@Pc(536) int local536;
						@Pc(631) int local631;
						@Pc(492) int local492;
						@Pc(525) int local525;
						if (local27.anInt6825 != 0) {
							if (local27.anInt6825 == Static318.anInt5356 || local27.anInt6825 == Static246.anInt4067) {
								Static424.method5664(local27.anInt6883, local95, local27.anInt6814, local100, local27.anInt6825 == Static246.anInt4067);
								Static255.aBooleanArray17[local48] = true;
								Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
								continue;
							}
							if (local27.anInt6825 == Static433.anInt6961) {
								if (local27.method5632(Static417.aClass162_17) != null) {
									Static574.method7450();
									Static290.method4093(local27, local100, local95, Static417.aClass162_17);
									Static217.aBooleanArray11[local48] = true;
									Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
								}
								continue;
							}
							if (local27.anInt6825 == Static458.anInt7368) {
								if (local27.method5632(Static417.aClass162_17) != null) {
									Static301.method4361(local100, local27, local95);
									Static217.aBooleanArray11[local48] = true;
									Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
								}
								continue;
							}
							if (Static63.anInt1136 == local27.anInt6825) {
								Static522.method6729(Static45.anInterface9_1, local27.anInt6883, local95, local27.anInt6814, Static417.aClass162_17, local100);
								Static255.aBooleanArray17[local48] = true;
								Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
								continue;
							}
							if (Static452.anInt7230 == local27.anInt6825) {
								Static558.method7306(local27.anInt6814, local27.anInt6883, Static417.aClass162_17, local100, local95);
								Static255.aBooleanArray17[local48] = true;
								Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
								continue;
							}
							if (local27.anInt6825 == Static543.anInt8920) {
								if (!Static222.aBoolean232 && !Static249.aBoolean308) {
									continue;
								}
								local244 = local95 + local27.anInt6883;
								local249 = local100 + 15;
								if (Static222.aBoolean232) {
									local492 = -256;
									if (Static112.anInt1993 < 20) {
										local492 = -65536;
									}
									Static322.aClass37_20.method7709(local492, "Fps:" + Static112.anInt1993, -1, local244, local249);
									local249 += 15;
									@Pc(516) Runtime local516 = Runtime.getRuntime();
									local525 = (int) ((local516.totalMemory() - local516.freeMemory()) / 1024L);
									local527 = -256;
									if (local525 > 98304) {
										if (Static116.aBoolean134) {
											Static567.method5987();
											for (local536 = 0; local536 < 10; local536++) {
												System.gc();
											}
											local525 = (int) ((local516.totalMemory() - local516.freeMemory()) / 1024L);
											if (local525 > 65536) {
												Static581.method7527("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local527 = -65536;
									}
									Static322.aClass37_20.method7709(local527, "Mem:" + local525 + "k", -1, local244, local249);
									local249 += 15;
									Static322.aClass37_20.method7709(-256, "In:" + Static379.anInt6315 + "B/s Out:" + Static270.anInt4402 + "B/s", -1, local244, local249);
									local249 += 15;
									local536 = Static417.aClass162_17.b() / 1024;
									Static322.aClass37_20.method7709(local536 <= 65536 ? -256 : -65536, "Offheap:" + local536 + "k", -1, local244, local249);
									local249 += 15;
									local631 = 0;
									@Pc(633) int local633 = 0;
									@Pc(635) int local635 = 0;
									for (@Pc(637) int local637 = 0; local637 < 35; local637++) {
										if (Static55.aClass102_Sub1Array1[local637] != null) {
											local631 += Static55.aClass102_Sub1Array1[local637].method6647();
											local633 += Static55.aClass102_Sub1Array1[local637].method6644();
											local635 += Static55.aClass102_Sub1Array1[local637].method6639();
										}
									}
									@Pc(679) int local679 = local635 * 100 / local631;
									@Pc(685) int local685 = local633 * 10000 / local631;
									@Pc(705) String local705 = "Cache:" + Static170.method2219((long) local685, 2, 0, true) + "% (" + local679 + "%)";
									Static71.aClass37_11.method7709(-256, local705, -1, local244, local249);
									local249 += 12;
								}
								if (Static94.anInt1652 > 0) {
									Static71.aClass37_11.method7709(-256, "Particles: " + Static230.anInt3347 + " / " + Static94.anInt1652, -1, local244, local249);
								}
								local249 += 12;
								if (Static249.aBoolean308) {
									Static71.aClass37_11.method7709(-256, "Polys: " + Static417.aClass162_17.DA() + " Models: " + Static417.aClass162_17.T(), -1, local244, local249);
									local249 += 12;
									Static71.aClass37_11.method7709(-256, "Ls: " + Static440.anInt7076 + " La: " + Static196.anInt2848 + " NPC: " + Static172.anInt2629 + " Pl: " + Static570.anInt9302, -1, local244, local249);
									local249 += 12;
									Static82.method1250();
								}
								Static255.aBooleanArray17[local48] = true;
								continue;
							}
						}
						if (local27.anInt6868 == 0) {
							if (Static221.anInt3209 == local27.anInt6825 && Static417.aClass162_17.method6880()) {
								Static417.aClass162_17.method6852(local95, local100, local27.anInt6883, local27.anInt6814);
							}
							method857(local162, local293, local48, local158, local100 - local27.anInt6880, local282, local27.anInt6810, arg7, local95 - local27.anInt6812);
							if (local27.aClass273Array2 != null) {
								method857(local162, local293, local48, local158, local100 - local27.anInt6880, local282, local27.anInt6810, local27.aClass273Array2, local95 - local27.anInt6812);
							}
							@Pc(873) Class2_Sub33 local873 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local27.anInt6810);
							if (local873 != null) {
								Static24.method348(local293, local48, local282, local95, local873.anInt5981, local100, local162, local158);
							}
							if (local27.anInt6825 == Static221.anInt3209 && Static417.aClass162_17.method6880()) {
								Static417.aClass162_17.method6857();
							}
							Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
						}
						if (Static232.aBooleanArray16[local48] || Static527.anInt8456 > 1) {
							if (local27.anInt6868 == 3) {
								if (local103 == 0) {
									if (local27.aBoolean560) {
										Static417.aClass162_17.J(local95, local100, local27.anInt6883, local27.anInt6814, local27.anInt6854, 0);
									} else {
										Static417.aClass162_17.method6827(local95, local100, local27.anInt6883, local27.anInt6814, local27.anInt6854, 0);
									}
								} else if (local27.aBoolean560) {
									Static417.aClass162_17.J(local95, local100, local27.anInt6883, local27.anInt6814, 255 - (local103 & 0xFF) << 24 | local27.anInt6854 & 0xFFFFFF, 1);
								} else {
									Static417.aClass162_17.method6827(local95, local100, local27.anInt6883, local27.anInt6814, local27.anInt6854 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								}
							} else if (local27.anInt6868 == 4) {
								@Pc(1014) Class37 local1014 = local27.method5649(Static417.aClass162_17);
								if (local1014 != null) {
									local249 = local27.anInt6854;
									@Pc(1029) String local1029 = local27.aString104;
									if (local27.anInt6805 != -1) {
										@Pc(1040) Class164 local1040 = Static466.aClass130_2.method2311(local27.anInt6805);
										local1029 = local1040.aString48;
										if (local1029 == null) {
											local1029 = "null";
										}
										if ((local1040.anInt3860 == 1 || local27.anInt6830 != 1) && local27.anInt6830 != -1) {
											local1029 = "<col=ff9040>" + local1029 + "</col> x" + Static487.method6251(local27.anInt6830);
										}
									}
									if (local27 == Static396.aClass273_10) {
										local1029 = Static229.aClass159_33.method2776(Static261.anInt4297);
										local249 = local27.anInt6854;
									}
									if (Static470.aBoolean648) {
										Static417.aClass162_17.V(local95, local100, local95 + local27.anInt6883, local27.anInt6814 + local100);
									}
									local1014.method7716(local27.anInt6814, local27.anInt6841, 0, Static331.aClass38Array18, local27.anInt6883, 0, local1029, null, local27.anInt6865, local27.anInt6815, null, 255 - (local103 & 0xFF) << 24 | local249, local100, local95, local27.anInt6806, local27.aBoolean558 ? 255 - (local103 & 0xFF) << 24 : -1);
									if (Static470.aBoolean648) {
										Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
									}
								} else if (Static332.aBoolean802) {
									Static155.method2111(local27);
								}
							} else {
								@Pc(1262) int local1262;
								if (local27.anInt6868 == 5) {
									if (local27.anInt6790 >= 0) {
										local27.method5643(Static496.aClass39_1, Static403.aClass123_2).method7473(0, local95, local27.anInt6845 << 3, local27.anInt6883, local27.anInt6814, 0, Static417.aClass162_17, local100, local27.anInt6807 << 3);
									} else {
										@Pc(1207) Class38 local1207;
										if (local27.anInt6805 == -1) {
											local1207 = local27.method5640(Static417.aClass162_17);
										} else {
											@Pc(1217) Class300 local1217 = local27.aBoolean547 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null;
											local1207 = Static466.aClass130_2.method2314(local27.anInt6805, local1217, Static417.aClass162_17, local27.anInt6813, local27.anInt6867 | 0xFF000000, local27.anInt6830, local27.anInt6824);
										}
										if (local1207 != null) {
											local249 = local1207.A();
											local492 = local1207.ca();
											local1262 = (local27.anInt6854 == 0 ? 16777215 : local27.anInt6854 & 0xFFFFFF) | 255 - (local103 & 0xFF) << 24;
											if (local27.aBoolean546) {
												Static417.aClass162_17.V(local95, local100, local27.anInt6883 + local95, local100 + local27.anInt6814);
												if (local27.anInt6796 != 0) {
													local525 = (local249 + local27.anInt6883 - 1) / local249;
													local527 = (local27.anInt6814 + local492 - 1) / local492;
													for (local536 = 0; local536 < local525; local536++) {
														for (local631 = 0; local631 < local527; local631++) {
															if (local27.anInt6854 == 0) {
																local1207.method7456((float) local249 / 2.0F + (float) (local95 + local536 * local249), (float) (local100 - -(local492 * local631)) + (float) local492 / 2.0F, 4096, local27.anInt6796);
															} else {
																local1207.method7455((float) (local95 + local249 * local536) + (float) local249 / 2.0F, (float) (local492 * local631 + local100) + (float) local492 / 2.0F, 4096, local27.anInt6796, local1262);
															}
														}
													}
												} else if (local27.anInt6854 == 0 && local103 == 0) {
													local1207.method7457(local95, local100, local27.anInt6883, local27.anInt6814);
												} else {
													local1207.DA(local95, local100, local27.anInt6883, local27.anInt6814, 0, local1262, 1);
												}
												Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
											} else if (local27.anInt6854 == 0 && local103 == 0) {
												if (local27.anInt6796 != 0) {
													local1207.method7456((float) local95 + (float) local27.anInt6883 / 2.0F, (float) local100 + (float) local27.anInt6814 / 2.0F, local27.anInt6883 * 4096 / local249, local27.anInt6796);
												} else if (local249 == local27.anInt6883 && local492 == local27.anInt6814) {
													local1207.method7463(local95, local100);
												} else {
													local1207.method7466(local95, local100, local27.anInt6883, local27.anInt6814);
												}
											} else if (local27.anInt6796 != 0) {
												local1207.method7455((float) local95 + (float) local27.anInt6883 / 2.0F, (float) local100 + (float) local27.anInt6814 / 2.0F, local27.anInt6883 * 4096 / local249, local27.anInt6796, local1262);
											} else if (local27.anInt6883 == local249 && local27.anInt6814 == local492) {
												local1207.V(local95, local100, 0, local1262, 1);
											} else {
												local1207.method7461(local95, local100, local27.anInt6883, local27.anInt6814, 0, local1262, 1);
											}
										} else if (Static332.aBoolean802) {
											Static155.method2111(local27);
										}
									}
								} else if (local27.anInt6868 == 6) {
									Static332.method7661();
									@Pc(1587) Class33 local1587 = null;
									local249 = 0;
									@Pc(1628) Class148 local1628;
									@Pc(1638) Class300 local1638;
									if (local27.anInt6805 != -1) {
										@Pc(1801) Class164 local1801 = Static466.aClass130_2.method2311(local27.anInt6805);
										if (local1801 != null) {
											local1801 = local1801.method3313(local27.anInt6830);
											local1628 = local27.anInt6799 == -1 ? null : Static117.aClass18_1.method296(local27.anInt6799);
											local1638 = local27.aBoolean547 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null;
											local1587 = local1801.method3331(2048, 1, local27.anInt6811, local27.anInt6802, local27.anInt6833, local1628, Static417.aClass162_17, local1638);
											if (local1587 == null) {
												Static155.method2111(local27);
											} else {
												local249 = -local1587.J() >> 1;
											}
										}
									} else if (local27.anInt6850 == 5) {
										local492 = local27.anInt6828;
										if (local492 >= 0 && local492 < 2048) {
											@Pc(1741) Class12_Sub2_Sub1_Sub4_Sub1 local1741 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local492];
											@Pc(1754) Class148 local1754 = local27.anInt6799 == -1 ? null : Static117.aClass18_1.method296(local27.anInt6799);
											if (local1741 != null && (Static18.anInt4109 == local492 || Static275.method3998(local1741.aString75) == local27.anInt6874)) {
												local1587 = local1741.aClass300_1.method6025(local27.anInt6811, 2048, Static380.aClass221_3, Static25.aClass286_1, 0, Static117.aClass18_1, local27.anInt6833, Static417.aClass162_17, -1, 0, local27.anInt6802, Static426.aClass160_1, null, local1754, null, 0, null, Static76.aClass361_1, Static466.aClass130_2);
											}
										}
									} else if (local27.anInt6850 == 8 || local27.anInt6850 == 9) {
										@Pc(1616) Class2_Sub16 local1616 = Static261.method3663(local27.anInt6828, false);
										local1628 = local27.anInt6799 == -1 ? null : Static117.aClass18_1.method296(local27.anInt6799);
										if (local1616 != null) {
											local1638 = local27.aBoolean547 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null;
											local1587 = local1616.method2195(local1638, local27.anInt6850 == 9, Static417.aClass162_17, local27.anInt6811, local27.anInt6802, local1628, local27.anInt6874, local27.anInt6833);
										}
									} else if (local27.anInt6799 == -1) {
										local1587 = local27.method5637(Static380.aClass221_3, Static76.aClass361_1, -1, Static417.aClass162_17, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1, 0, Static466.aClass130_2, Static117.aClass18_1, 2048, Static426.aClass160_1, Static25.aClass286_1, -1, null);
										if (local1587 == null && Static332.aBoolean802) {
											Static155.method2111(local27);
										}
									} else {
										@Pc(1674) Class148 local1674 = Static117.aClass18_1.method296(local27.anInt6799);
										local1587 = local27.method5637(Static380.aClass221_3, Static76.aClass361_1, local27.anInt6833, Static417.aClass162_17, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1, local27.anInt6811, Static466.aClass130_2, Static117.aClass18_1, 2048, Static426.aClass160_1, Static25.aClass286_1, local27.anInt6802, local1674);
										if (local1587 == null && Static332.aBoolean802) {
											Static155.method2111(local27);
										}
									}
									if (local1587 != null) {
										if (local27.anInt6849 <= 0) {
											local492 = 512;
										} else {
											local492 = (local27.anInt6883 << 9) / local27.anInt6849;
										}
										if (local27.anInt6866 <= 0) {
											local1262 = 512;
										} else {
											local1262 = (local27.anInt6814 << 9) / local27.anInt6866;
										}
										local525 = local95 + local27.anInt6883 / 2;
										local527 = local100 + local27.anInt6814 / 2;
										if (!local27.aBoolean555) {
											local527 += local1262 * local27.anInt6791 >> 9;
											local525 += local492 * local27.anInt6840 >> 9;
										}
										Static468.aClass25_6.Y();
										Static417.aClass162_17.method6816(Static468.aClass25_6);
										Static417.aClass162_17.la(local525, local527, local492, local1262);
										Static417.aClass162_17.ya();
										if (local27.aBoolean557) {
											Static417.aClass162_17.ZA(false);
										}
										if (local27.aBoolean555) {
											Static300.aClass25_4.oa(local27.anInt6863);
											Static300.aClass25_4.ZA(local27.anInt6801);
											Static300.aClass25_4.AA(local27.anInt6846);
											Static300.aClass25_4.U(local27.anInt6840, local27.anInt6791, local27.anInt6827);
										} else {
											local536 = (local27.anInt6847 << 2) * Class285.anIntArray476[local27.anInt6863 << 3] >> 14;
											local631 = (local27.anInt6847 << 2) * Class285.anIntArray475[local27.anInt6863 << 3] >> 14;
											Static300.aClass25_4.J(-local27.anInt6846 << 3);
											Static300.aClass25_4.ZA(local27.anInt6801 << 3);
											Static300.aClass25_4.U(local27.anInt6798 << 2, local249 + (local27.anInt6838 << 2) + local536, (local27.anInt6838 << 2) + local631);
											Static300.aClass25_4.w(local27.anInt6863 << 3);
										}
										local27.method5631(Static300.aClass25_4, Static532.anInt8757, Static417.aClass162_17, local1587);
										if (Static470.aBoolean648) {
											Static417.aClass162_17.V(local95, local100, local95 + local27.anInt6883, local27.anInt6814 + local100);
										}
										if (local27.aBoolean555) {
											if (local27.aBoolean556) {
												local1587.method7183(Static300.aClass25_4, null, local27.anInt6847, 1);
											} else {
												local1587.method7192(Static300.aClass25_4, null, 1);
												if (local27.aClass12_Sub4_5 != null) {
													Static417.aClass162_17.method6860(local27.aClass12_Sub4_5.method4135());
												}
											}
										} else if (local27.aBoolean556) {
											local1587.method7183(Static300.aClass25_4, null, local27.anInt6847 << 2, 1);
										} else {
											local1587.method7192(Static300.aClass25_4, null, 1);
											if (local27.aClass12_Sub4_5 != null) {
												Static417.aClass162_17.method6860(local27.aClass12_Sub4_5.method4135());
											}
										}
										if (Static470.aBoolean648) {
											Static417.aClass162_17.da(arg3, arg0, arg5, arg1);
										}
										if (local27.aBoolean557) {
											Static417.aClass162_17.ZA(true);
										}
									}
								} else if (local27.anInt6868 == 9) {
									if (local27.aBoolean551) {
										local249 = local27.anInt6814 + local100;
										local1262 = local100;
										local492 = local95 + local27.anInt6883;
									} else {
										local1262 = local27.anInt6814 + local100;
										local492 = local27.anInt6883 + local95;
										local249 = local100;
									}
									if (local27.anInt6794 == 1) {
										Static417.aClass162_17.method6810(local95, local249, local492, local1262, local27.anInt6854, 0);
									} else {
										Static417.aClass162_17.method6878(local95, local249, local492, local1262, local27.anInt6854, local27.anInt6794);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIBIIII[[[BLclient!r;II)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) Class162 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg1 == 0 || arg7 == 0) {
			return;
		}
		if (arg1 == 9) {
			arg1 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg4 = arg4 + 3 & 0x3;
			arg1 = 1;
		}
		if (arg1 == 11) {
			arg4 = arg4 + 3 & 0x3;
			arg1 = 8;
		}
		arg9.IA(arg3, arg2, arg11, arg10, arg6, arg5, arg8[arg1 - 1][arg4], arg7, arg0);
	}
}
