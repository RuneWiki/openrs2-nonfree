import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!na;")
	public static Class56 aClass56_12;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_289 = Static119.method1462(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt629 = 0;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!pe;")
	private static Class65 aClass65_292 = Static119.method1462("slide:");

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_290 = aClass65_292;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_291 = aClass65_292;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_293 = Static119.method1462("::noclip");

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_294 = Static119.method1462("title_mute");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method521() {
		Static6.aClass8_9.method171();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB[Lclient!wa;IIII)V")
	public static void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub22[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static118.method2073(arg1, arg0, arg8, arg5);
		Static87.method1426();
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class2_Sub22 local24 = arg4[local18];
			if (local24 != null && (local24.anInt2800 == arg2 || arg2 == -1412584499 && local24 == Static52.aClass2_Sub22_6)) {
				@Pc(47) int local47;
				if (arg7 == -1) {
					Static41.anIntArray117[Static17.anInt392] = arg3 + local24.anInt2766;
					Static95.anIntArray284[Static17.anInt392] = local24.anInt2770 + arg6;
					Static47.anIntArray143[Static17.anInt392] = local24.anInt2787;
					Static115.anIntArray335[Static17.anInt392] = local24.anInt2765;
					local47 = Static17.anInt392++;
				} else {
					local47 = arg7;
				}
				local24.anInt2776 = local47;
				local24.anInt2824 = Static10.anInt2951;
				if (!local24.aBoolean124 || !Static129.method1958(local24)) {
					if (local24.anInt2801 > 0) {
						Static107.method1738(local24);
					}
					@Pc(107) int local107 = arg3 + local24.anInt2766;
					@Pc(112) int local112 = arg6 + local24.anInt2770;
					@Pc(115) int local115 = local24.anInt2804;
					@Pc(143) int local143;
					@Pc(154) int local154;
					if (local24 == Static52.aClass2_Sub22_6) {
						if (arg2 != -1412584499 && !local24.aBoolean119) {
							Static58.anInt1454 = arg3;
							Static23.anInt1756 = arg6;
							Static90.aClass2_Sub22Array1 = arg4;
							continue;
						}
						if (!local24.aBoolean119) {
							local115 = 128;
						}
						if (aBoolean24 && Static66.aBoolean57) {
							local143 = Static66.anInt1586;
							local143 -= Static48.anInt1180;
							if (Static91.anInt2029 > local143) {
								local143 = Static91.anInt2029;
							}
							local154 = Static39.anInt837;
							if (Static82.aClass2_Sub22_17.anInt2787 + Static91.anInt2029 < local143 + local24.anInt2787) {
								local143 = Static91.anInt2029 + Static82.aClass2_Sub22_17.anInt2787 - local24.anInt2787;
							}
							local107 = local143;
							local154 -= Static60.anInt460;
							if (local154 < Static18.anInt402) {
								local154 = Static18.anInt402;
							}
							if (Static82.aClass2_Sub22_17.anInt2765 + Static18.anInt402 < local154 + local24.anInt2765) {
								local154 = Static82.aClass2_Sub22_17.anInt2765 + Static18.anInt402 - local24.anInt2765;
							}
							local112 = local154;
						}
					}
					@Pc(215) int local215;
					@Pc(213) int local213;
					@Pc(245) int local245;
					@Pc(251) int local251;
					@Pc(279) int local279;
					@Pc(302) int local302;
					if (local24.anInt2813 == 2) {
						local143 = arg1;
						local213 = arg5;
						local215 = arg8;
						local154 = arg0;
					} else if (local24.anInt2813 == 9) {
						local251 = local112;
						local279 = local107 + local24.anInt2787;
						local245 = local107;
						if (local107 > local279) {
							local245 = local279;
							local279 = local107;
						}
						local143 = arg1 < local245 ? local245 : arg1;
						local302 = local24.anInt2765 + local112;
						local279++;
						if (local112 > local302) {
							local251 = local302;
							local302 = local112;
						}
						local215 = arg8 <= local279 ? arg8 : local279;
						local154 = arg0 < local251 ? local251 : arg0;
						local302++;
						local213 = local302 >= arg5 ? arg5 : local302;
					} else {
						local143 = arg1 >= local107 ? arg1 : local107;
						local154 = local112 <= arg0 ? arg0 : local112;
						local245 = local107 + local24.anInt2787;
						local251 = local112 + local24.anInt2765;
						local213 = arg5 <= local251 ? arg5 : local251;
						local215 = arg8 > local245 ? local245 : arg8;
					}
					if (!local24.aBoolean124 || local143 < local215 && local154 < local213) {
						if (local24.anInt2801 != 0) {
							if (local24.anInt2801 == 1337) {
								Static40.anInt846 = local107;
								Static35.anInt794 = local112;
								Static12.method247(local24.anInt2765, local112, local107, local24.anInt2787);
								Static118.method2073(arg1, arg0, arg8, arg5);
								continue;
							}
							if (local24.anInt2801 == 1338) {
								Static44.method757(local47, local107, local112);
								Static118.method2073(arg1, arg0, arg8, arg5);
								continue;
							}
						}
						local245 = Static66.anInt1586;
						local251 = Static39.anInt837;
						if (!Static3.aBoolean5 && local245 >= local143 && local251 >= local154 && local245 < local215 && local213 > local251) {
							Static79.method1301(local245 - local107, -local112 + local251, local24);
						}
						if (local24.anInt2813 == 0) {
							if (!local24.aBoolean124 && Static129.method1958(local24) && Static4.aClass2_Sub22_5 != local24) {
								continue;
							}
							if (!local24.aBoolean124) {
								if (local24.anInt2781 > local24.anInt2785 - local24.anInt2765) {
									local24.anInt2781 = local24.anInt2785 - local24.anInt2765;
								}
								if (local24.anInt2781 < 0) {
									local24.anInt2781 = 0;
								}
							}
							method522(local154, local143, local24.anInt2835, local107 - local24.anInt2817, arg4, local213, local112 - local24.anInt2781, local47, local215);
							if (local24.aClass2_Sub22Array2 != null) {
								method522(local154, local143, local24.anInt2835, local107 - local24.anInt2817, local24.aClass2_Sub22Array2, local213, local112 - local24.anInt2781, local47, local215);
							}
							@Pc(524) Class2_Sub7 local524 = (Class2_Sub7) Static112.aClass40_21.method851((long) local24.anInt2835);
							if (local524 != null) {
								if (local524.anInt1526 == 0 && Static66.anInt1586 >= local143 && local154 <= Static39.anInt837 && Static66.anInt1586 < local215 && local213 > Static39.anInt837 && !Static3.aBoolean5 && !Static12.aBoolean14) {
									Static83.aClass65Array39[0] = Static105.aClass65_995;
									Static126.anIntArray355[0] = 1005;
									Static83.aClass65Array40[0] = Static110.aClass65_1038;
									Static49.anInt1205 = 1;
								}
								Static32.method623(local215, local143, local112, local213, local47, local524.anInt1527, local107, local154);
							}
							Static118.method2073(arg1, arg0, arg8, arg5);
							Static87.method1426();
						}
						if (Static67.aBooleanArray11[local47] || Static20.anInt520 > 1) {
							if (local24.anInt2813 == 0 && !local24.aBoolean124 && local24.anInt2785 > local24.anInt2765) {
								Static54.method956(local24.anInt2765, local24.anInt2787 + local107, local24.anInt2785, local24.anInt2781, local112);
							}
							if (local24.anInt2813 != 1) {
								@Pc(647) int local647;
								@Pc(659) int local659;
								@Pc(827) int local827;
								@Pc(702) int local702;
								@Pc(890) int local890;
								@Pc(668) int local668;
								@Pc(812) int local812;
								if (local24.anInt2813 == 2) {
									local279 = 0;
									for (local302 = 0; local302 < local24.anInt2765; local302++) {
										for (local647 = 0; local647 < local24.anInt2787; local647++) {
											local659 = local107 + (local24.anInt2773 + 32) * local647;
											local668 = local112 + (local24.anInt2783 + 32) * local302;
											if (local279 < 20) {
												local668 += local24.anIntArray367[local279];
												local659 += local24.anIntArray371[local279];
											}
											if (local24.anIntArray374[local279] > 0) {
												local702 = local24.anIntArray374[local279] - 1;
												if (arg1 < local659 + 32 && arg8 > local659 && local668 + 32 > arg0 && arg5 > local668 || local24 == Static95.aClass2_Sub22_11 && local279 == Static72.anInt1649) {
													@Pc(759) Class2_Sub1_Sub4_Sub1 local759;
													if (Static113.anInt2520 == 1 && local279 == Static19.anInt479 && Static103.anInt2355 == local24.anInt2835) {
														local759 = Static129.method1959(local702, 2, false, 0, local24.anIntArray370[local279]);
													} else {
														local759 = Static129.method1959(local702, 1, false, 3153952, local24.anIntArray370[local279]);
													}
													if (local759 == null) {
														Static116.method1853(local24);
													} else if (Static95.aClass2_Sub22_11 == local24 && Static72.anInt1649 == local279) {
														local812 = Static66.anInt1586 - Static111.anInt2491;
														if (local812 < 5 && local812 > -5) {
															local812 = 0;
														}
														local827 = Static39.anInt837 - Static46.anInt1109;
														if (local827 < 5 && local827 > -5) {
															local827 = 0;
														}
														if (Static21.anInt523 < 5) {
															local827 = 0;
															local812 = 0;
														}
														local759.method449(local659 + local812, local827 + local668, 128);
														if (arg2 != -1) {
															@Pc(866) Class2_Sub22 local866 = arg4[arg2 & 0xFFFF];
															if (Static118.anInt2965 > local668 + local827 && local866.anInt2781 > 0) {
																local890 = (Static118.anInt2965 - local827 - local668) * Static117.anInt2579 / 3;
																if (local890 > Static117.anInt2579 * 10) {
																	local890 = Static117.anInt2579 * 10;
																}
																if (local866.anInt2781 < local890) {
																	local890 = local866.anInt2781;
																}
																Static46.anInt1109 += local890;
																local866.anInt2781 -= local890;
																Static116.method1853(local866);
															}
															if (local827 + local668 + 32 > Static118.anInt2969 && local866.anInt2785 - local866.anInt2765 > local866.anInt2781) {
																local890 = Static117.anInt2579 * (local827 + local668 + 32 - Static118.anInt2969) / 3;
																if (local890 > Static117.anInt2579 * 10) {
																	local890 = Static117.anInt2579 * 10;
																}
																if (local890 > local866.anInt2785 - local866.anInt2781 - local866.anInt2765) {
																	local890 = local866.anInt2785 - local866.anInt2765 - local866.anInt2781;
																}
																Static46.anInt1109 -= local890;
																local866.anInt2781 += local890;
																Static116.method1853(local866);
															}
														}
													} else if (Static28.aClass2_Sub22_3 == local24 && Static91.anInt2038 == local279) {
														local759.method449(local659, local668, 128);
													} else {
														local759.method461(local659, local668);
													}
												}
											} else if (local24.anIntArray372 != null && local279 < 20) {
												@Pc(1026) Class2_Sub1_Sub4_Sub1 local1026 = local24.method1976(local279);
												if (local1026 != null) {
													local1026.method461(local659, local668);
												} else if (Static100.aBoolean93) {
													Static116.method1853(local24);
												}
											}
											local279++;
										}
									}
								} else if (local24.anInt2813 == 3) {
									if (Static18.method279(local24)) {
										local279 = local24.anInt2820;
										if (Static4.aClass2_Sub22_5 == local24 && local24.anInt2764 != 0) {
											local279 = local24.anInt2764;
										}
									} else {
										local279 = local24.anInt2793;
										if (Static4.aClass2_Sub22_5 == local24 && local24.anInt2788 != 0) {
											local279 = local24.anInt2788;
										}
									}
									if (local115 == 0) {
										if (local24.aBoolean118) {
											Static118.method2081(local107, local112, local24.anInt2787, local24.anInt2765, local279);
										} else {
											Static118.method2078(local107, local112, local24.anInt2787, local24.anInt2765, local279);
										}
									} else if (local24.aBoolean118) {
										Static118.method2063(local107, local112, local24.anInt2787, local24.anInt2765, local279, 256 - (local115 & 0xFF));
									} else {
										Static118.method2071(local107, local112, local24.anInt2787, local24.anInt2765, local279, 256 - (local115 & 0xFF));
									}
								} else {
									@Pc(1162) Class2_Sub1_Sub4_Sub3_Sub1 local1162;
									if (local24.anInt2813 == 4) {
										local1162 = local24.method1977();
										if (local1162 != null) {
											@Pc(1174) Class65 local1174 = local24.aClass65_1225;
											if (Static18.method279(local24)) {
												local302 = local24.anInt2820;
												if (local24 == Static4.aClass2_Sub22_5 && local24.anInt2764 != 0) {
													local302 = local24.anInt2764;
												}
												if (local24.aClass65_1224.method1502() > 0) {
													local1174 = local24.aClass65_1224;
												}
											} else {
												local302 = local24.anInt2793;
												if (Static4.aClass2_Sub22_5 == local24 && local24.anInt2788 != 0) {
													local302 = local24.anInt2788;
												}
											}
											if (local24.aBoolean124 && local24.anInt2768 != -1) {
												@Pc(1230) Class2_Sub1_Sub11 local1230 = Static4.method872(local24.anInt2768);
												local1174 = local1230.aClass65_870;
												if (local1174 == null) {
													local1174 = Static124.aClass65_1153;
												}
												if ((local1230.anInt2071 == 1 || local24.anInt2811 != 1) && local24.anInt2811 != -1) {
													local1174 = Static35.method647(new Class65[] { Static42.aClass65_462, local1174, Static105.aClass65_993, Static20.method345(local24.anInt2811) });
												}
											}
											if (Static101.aClass2_Sub22_12 == local24) {
												local1174 = Static129.aClass65_1212;
												local302 = local24.anInt2793;
											}
											if (!local24.aBoolean124) {
												local1174 = Static62.method1115(local24, local1174);
											}
											local1162.method2105(local1174, local107, local112, local24.anInt2787, local24.anInt2765, local302, local24.aBoolean120 ? 0 : -1, local24.anInt2799, local24.anInt2798, local24.anInt2775);
										} else if (Static100.aBoolean93) {
											Static116.method1853(local24);
										}
									} else if (local24.anInt2813 == 5) {
										@Pc(1342) Class2_Sub1_Sub4_Sub1 local1342;
										if (local24.aBoolean124) {
											if (local24.anInt2768 == -1) {
												local1342 = local24.method1970(false);
											} else {
												local1342 = Static129.method1959(local24.anInt2768, local24.anInt2836, false, local24.anInt2832, local24.anInt2811);
											}
											if (local1342 != null) {
												local647 = local1342.anInt604;
												local302 = local1342.anInt601;
												if (local24.aBoolean121) {
													Static118.method2069(local107, local112, local107 + local24.anInt2787, local24.anInt2765 + local112);
													local668 = (local647 + local24.anInt2765 - 1) / local647;
													local659 = (local302 + local24.anInt2787 - 1) / local302;
													for (local812 = 0; local812 < local659; local812++) {
														for (local827 = 0; local827 < local668; local827++) {
															if (local24.anInt2818 != 0) {
																local1342.method437(local302 / 2 + local107 + local812 * local302, local647 / 2 + local647 * local827 + local112, local24.anInt2818, 4096);
															} else if (local115 == 0) {
																local1342.method461(local812 * local302 + local107, local827 * local647 + local112);
															} else {
																local1342.method449(local107 + local302 * local812, local827 * local647 + local112, 256 - (local115 & 0xFF));
															}
														}
													}
													Static118.method2073(arg1, arg0, arg8, arg5);
												} else {
													local659 = local24.anInt2787 * 4096 / local302;
													if (local24.anInt2818 != 0) {
														local1342.method437(local24.anInt2787 / 2 + local107, local24.anInt2765 / 2 + local112, local24.anInt2818, local659);
													} else if (local115 != 0) {
														local1342.method454(local107, local112, local24.anInt2787, local24.anInt2765, 256 - (local115 & 0xFF));
													} else if (local24.anInt2787 == local302 && local24.anInt2765 == local647) {
														local1342.method461(local107, local112);
													} else {
														local1342.method442(local107, local112, local24.anInt2787, local24.anInt2765);
													}
												}
											} else if (Static100.aBoolean93) {
												Static116.method1853(local24);
											}
										} else {
											local1342 = local24.method1970(Static18.method279(local24));
											if (local1342 != null) {
												local1342.method461(local107, local112);
											} else if (Static100.aBoolean93) {
												Static116.method1853(local24);
											}
										}
									} else {
										@Pc(1685) Class2_Sub1_Sub11 local1685;
										if (local24.anInt2813 == 6) {
											@Pc(1592) boolean local1592 = Static18.method279(local24);
											@Pc(1594) Class2_Sub1_Sub1_Sub7 local1594 = null;
											local659 = 0;
											if (local1592) {
												local302 = local24.anInt2816;
											} else {
												local302 = local24.anInt2815;
											}
											if (local24.anInt2768 != -1) {
												local1685 = Static4.method872(local24.anInt2768);
												if (local1685 != null) {
													local1685 = local1685.method1536(local24.anInt2811);
													local1594 = local1685.method1537(1);
													if (local1594 == null) {
														Static116.method1853(local24);
													} else {
														local1594.method2006();
														local659 = local1594.anInt2855 / 2;
													}
												}
											} else if (local24.anInt2790 == 5) {
												if (local24.anInt2831 == 0) {
													local1594 = Static14.aClass9_1.method239(-1, -1, null, null);
												} else {
													local1594 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1996();
												}
											} else if (local302 == -1) {
												local1594 = local24.method1972(-1, null, local1592, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2);
												if (local1594 == null && Static100.aBoolean93) {
													Static116.method1853(local24);
												}
											} else {
												@Pc(1624) Class2_Sub1_Sub2 local1624 = Static23.method1313(local302);
												local1594 = local24.method1972(local24.anInt2830, local1624, local1592, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2);
												if (local1594 == null && Static100.aBoolean93) {
													Static116.method1853(local24);
												}
											}
											Static87.method1423(local107 + local24.anInt2787 / 2, local24.anInt2765 / 2 + local112);
											local668 = Class2_Sub1_Sub4_Sub4.anIntArray251[local24.anInt2829] * local24.anInt2826 >> 16;
											local812 = local24.anInt2826 * Class2_Sub1_Sub4_Sub4.anIntArray248[local24.anInt2829] >> 16;
											if (local1594 != null) {
												if (local24.aBoolean124) {
													local1594.method2006();
													if (local24.aBoolean117) {
														local1594.method2002(local24.anInt2812, local24.anInt2809, local24.anInt2829, local24.anInt2806, local24.anInt2821 + local668 + local659, local24.anInt2821 + local812, local24.anInt2826);
													} else {
														local1594.method2009(local24.anInt2812, local24.anInt2809, local24.anInt2829, local24.anInt2806, local659 + local668 + local24.anInt2821, local812 + local24.anInt2821);
													}
												} else {
													local1594.method2009(local24.anInt2812, 0, local24.anInt2829, 0, local668, local812);
												}
											}
											Static87.method1433();
										} else {
											if (local24.anInt2813 == 7) {
												local1162 = local24.method1977();
												if (local1162 == null) {
													if (Static100.aBoolean93) {
														Static116.method1853(local24);
													}
													continue;
												}
												local302 = 0;
												for (local647 = 0; local647 < local24.anInt2765; local647++) {
													for (local659 = 0; local659 < local24.anInt2787; local659++) {
														if (local24.anIntArray374[local302] > 0) {
															local1685 = Static4.method872(local24.anIntArray374[local302] - 1);
															@Pc(1893) Class65 local1893;
															if (local1685.anInt2071 != 1 && local24.anIntArray370[local302] == 1) {
																local1893 = Static35.method647(new Class65[] { Static42.aClass65_462, local1685.aClass65_870, Static77.aClass65_739 });
															} else {
																local1893 = Static35.method647(new Class65[] { Static42.aClass65_462, local1685.aClass65_870, Static105.aClass65_993, Static20.method345(local24.anIntArray370[local302]) });
															}
															local702 = local647 * (local24.anInt2783 + 12) + local112;
															local827 = local107 + local659 * (local24.anInt2773 + 115);
															if (local24.anInt2799 == 0) {
																local1162.method2099(local1893, local827, local702, local24.anInt2793, local24.aBoolean120 ? 0 : -1);
															} else if (local24.anInt2799 == 1) {
																local1162.method2086(local1893, local24.anInt2787 / 2 + local827, local702, local24.anInt2793, local24.aBoolean120 ? 0 : -1);
															} else {
																local1162.method2095(local1893, local827 + local24.anInt2787 - 1, local702, local24.anInt2793, local24.aBoolean120 ? 0 : -1);
															}
														}
														local302++;
													}
												}
											}
											@Pc(2194) int local2194;
											if (local24.anInt2813 == 8 && local24 == Static117.aClass2_Sub22_15 && Static89.anInt1978 == Static113.anInt2529) {
												local279 = 0;
												@Pc(2040) Class2_Sub1_Sub4_Sub3_Sub1 local2040 = Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4;
												local302 = 0;
												@Pc(2045) Class65 local2045 = local24.aClass65_1225;
												local2045 = Static62.method1115(local24, local2045);
												@Pc(2066) Class65 local2066;
												while (local2045.method1502() > 0) {
													local812 = local2045.method1500(Static6.aClass65_78);
													if (local812 == -1) {
														local2066 = local2045;
														local2045 = Static110.aClass65_1038;
													} else {
														local2066 = local2045.method1476(local812, 0);
														local2045 = local2045.method1501(local812 + 4);
													}
													local827 = local2040.method2087(local2066);
													if (local279 < local827) {
														local279 = local827;
													}
													local302 += local2040.anInt2975 + 1;
												}
												local279 += 6;
												local812 = local107 + local24.anInt2787 - local279 - 5;
												local302 += 7;
												if (local812 < local107 + 5) {
													local812 = local107 + 5;
												}
												local827 = local112 + local24.anInt2765 + 5;
												if (arg8 < local812 + local279) {
													local812 = arg8 - local279;
												}
												if (local302 + local827 > arg5) {
													local827 = arg5 - local302;
												}
												Static118.method2081(local812, local827, local279, local302, 16777120);
												Static118.method2078(local812, local827, local279, local302, 0);
												local2045 = local24.aClass65_1225;
												local702 = local2040.anInt2975 + local827 + 2;
												local2045 = Static62.method1115(local24, local2045);
												while (local2045.method1502() > 0) {
													local2194 = local2045.method1500(Static6.aClass65_78);
													if (local2194 == -1) {
														local2066 = local2045;
														local2045 = Static110.aClass65_1038;
													} else {
														local2066 = local2045.method1476(local2194, 0);
														local2045 = local2045.method1501(local2194 + 4);
													}
													local2040.method2099(local2066, local812 + 3, local702, 0, -1);
													local702 += local2040.anInt2975 + 1;
												}
											}
											if (local24.anInt2813 == 9) {
												if (local24.anInt2834 == 1) {
													Static118.method2072(local107, local112, local24.anInt2787 + local107, local112 - -local24.anInt2765, local24.anInt2793);
												} else {
													local279 = local24.anInt2787 >= 0 ? local24.anInt2787 : -local24.anInt2787;
													local302 = local24.anInt2765 >= 0 ? local24.anInt2765 : -local24.anInt2765;
													local647 = local279;
													if (local279 < local302) {
														local647 = local302;
													}
													if (local647 != 0) {
														local668 = (local24.anInt2765 << 16) / local647;
														local659 = (local24.anInt2787 << 16) / local647;
														if (local659 < local668) {
															local668 = -local668;
														} else {
															local659 = -local659;
														}
														local812 = local668 * local24.anInt2834 >> 17;
														local827 = local24.anInt2834 * local668 + 1 >> 17;
														local2194 = local659 * local24.anInt2834 + 1 >> 17;
														local702 = local659 * local24.anInt2834 >> 17;
														@Pc(2360) int local2360 = local812 + local107;
														local890 = local107 - local827;
														@Pc(2371) int local2371 = local107 + local24.anInt2787 - local827;
														@Pc(2378) int local2378 = local812 + local24.anInt2787 + local107;
														@Pc(2383) int local2383 = local112 + local702;
														@Pc(2387) int local2387 = local112 - local2194;
														@Pc(2395) int local2395 = local112 + local24.anInt2765 - local2194;
														@Pc(2402) int local2402 = local702 + local24.anInt2765 + local112;
														Static87.method1418(local2360, local890, local2371);
														Static87.method1419(local2383, local2387, local2395, local2360, local890, local2371, local24.anInt2793);
														Static87.method1418(local2360, local2371, local2378);
														Static87.method1419(local2383, local2395, local2402, local2360, local2371, local2378, local24.anInt2793);
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
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method523() {
		aClass65_291 = null;
		aClass56_12 = null;
		aClass65_289 = null;
		aClass65_290 = null;
		aClass65_292 = null;
		aClass65_294 = null;
		aClass65_293 = null;
	}
}
