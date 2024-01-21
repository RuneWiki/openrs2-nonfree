import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!bg;")
	public static Class11 aClass11_139;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1744 = Static32.method683("<col=ffff00>*V");

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt4025 = -1;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1745 = Static32.method683("Loaded textures");

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1746 = aClass49_1745;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1747 = Static32.method683("jlv");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method3005() {
		aClass49_1746 = null;
		aClass49_1744 = null;
		aClass11_139 = null;
		aClass49_1745 = null;
		aClass49_1747 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII[Lclient!vg;III)V")
	public static void method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class85[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(20) int local20 = 0; local20 < arg4.length; local20++) {
			@Pc(26) Class85 local26 = arg4[local20];
			if (local26 != null && (!local26.aBoolean171 || local26.anInt3855 == 0 || local26.aBoolean166 || Static111.method1895(local26) != 0 || Static42.aClass85_2 == local26 || local26.anInt3876 == 1338) && arg6 == local26.anInt3851 && (!local26.aBoolean171 || !Static100.method1729(local26))) {
				@Pc(71) int local71 = local26.anInt3827 + arg7;
				@Pc(77) int local77 = local26.anInt3886 + arg3;
				if (local26 == Static160.aClass85_14) {
					anInt4025 = local77;
					Static48.aBoolean42 = true;
					Static123.anInt2732 = local71;
				}
				@Pc(101) int local101;
				@Pc(112) int local112;
				@Pc(134) int local134;
				@Pc(141) int local141;
				@Pc(153) int local153;
				if (local26.anInt3855 == 2) {
					local141 = arg0;
					local101 = arg5;
					local112 = arg2;
					local134 = arg1;
				} else {
					@Pc(123) int local123;
					@Pc(118) int local118;
					if (local26.anInt3855 == 9) {
						local123 = local71;
						local118 = local77;
						local153 = local77 + local26.anInt3867;
						@Pc(158) int local158 = local26.anInt3858 + local71;
						if (local71 > local158) {
							local123 = local158;
							local158 = local71;
						}
						if (local153 < local77) {
							local118 = local153;
							local153 = local77;
						}
						local158++;
						local153++;
						local101 = arg5 >= local123 ? arg5 : local123;
						local134 = local158 < arg1 ? local158 : arg1;
						local141 = local153 < arg0 ? local153 : arg0;
						local112 = local118 <= arg2 ? arg2 : local118;
					} else {
						local101 = local71 <= arg5 ? arg5 : local71;
						local112 = local77 <= arg2 ? arg2 : local77;
						local118 = local77 + local26.anInt3867;
						local123 = local71 + local26.anInt3858;
						local134 = arg1 <= local123 ? arg1 : local123;
						local141 = arg0 > local118 ? local118 : arg0;
					}
				}
				if (!local26.aBoolean171 || local134 > local101 && local141 > local112) {
					if (local26.anInt3876 == 1337) {
						Static102.method1756(local26);
					} else {
						if (local26.anInt3855 == 0) {
							if (!local26.aBoolean171 && Static100.method1729(local26) && Static184.aClass85_16 != local26) {
								continue;
							}
							method3008(local141, local134, local112, local77 - local26.anInt3891, arg4, local101, local26.anInt3849, local71 - local26.anInt3822);
							if (local26.aClass85Array2 != null) {
								method3008(local141, local134, local112, local77 - local26.anInt3891, local26.aClass85Array2, local101, local26.anInt3849, local71 - local26.anInt3822);
							}
							@Pc(313) Class2_Sub8 local313 = (Class2_Sub8) Static100.aClass25_7.method836((long) local26.anInt3849);
							if (local313 != null) {
								Static92.method1582(local71, local141, local112, local101, local134, local77, local313.anInt1201);
							}
						}
						if (local26.aBoolean171) {
							@Pc(350) boolean local350;
							if (Static20.anInt449 >= local101 && local112 <= Static96.anInt2022 && local134 > Static20.anInt449 && local141 > Static96.anInt2022) {
								local350 = true;
							} else {
								local350 = false;
							}
							@Pc(356) boolean local356 = false;
							if (Static182.anInt4058 == 1 && local350) {
								local356 = true;
							}
							@Pc(365) boolean local365 = false;
							if (Static63.anInt1351 == 1 && local101 <= Static114.anInt2394 && local112 <= Static61.anInt1320 && Static114.anInt2394 < local134 && local141 > Static61.anInt1320) {
								local365 = true;
							}
							if (local26.anInt3876 == 1338) {
								if (local365) {
									Static55.method950(Static61.anInt1320 - local77, local26, Static114.anInt2394 - local71);
								}
								continue;
							}
							if (local365) {
								Static72.method1207(Static61.anInt1320 - local77, local26, Static114.anInt2394 - local71);
							}
							if (Static160.aClass85_14 != null && local26 != Static160.aClass85_14 && local350 && Static45.method829(Static111.method1895(local26))) {
								Static44.aClass85_9 = local26;
							}
							if (Static42.aClass85_2 == local26) {
								Static170.anInt3721 = local77;
								Static25.aBoolean20 = true;
								Static20.anInt443 = local71;
							}
							if (local26.aBoolean166) {
								@Pc(452) Class2_Sub12 local452;
								if (local350 && Static42.anInt1030 != 0 && local26.anObjectArray25 != null) {
									local452 = new Class2_Sub12();
									local452.anInt1560 = Static42.anInt1030;
									local452.anObjectArray2 = local26.anObjectArray25;
									local452.aClass85_4 = local26;
									Static155.aClass81_13.method2683(local452);
								}
								if (Static160.aClass85_14 != null || Static154.aClass85_13 != null || Static47.aBoolean40) {
									local365 = false;
									local350 = false;
									local356 = false;
								}
								if (!local26.aBoolean170 && local365) {
									local26.aBoolean170 = true;
									if (local26.anObjectArray15 != null) {
										local452 = new Class2_Sub12();
										local452.aClass85_4 = local26;
										local452.anInt1560 = Static61.anInt1320 - local77;
										local452.anInt1567 = Static114.anInt2394 - local71;
										local452.anObjectArray2 = local26.anObjectArray15;
										Static155.aClass81_13.method2683(local452);
									}
								}
								if (local26.aBoolean170 && local356 && local26.anObjectArray12 != null) {
									local452 = new Class2_Sub12();
									local452.anObjectArray2 = local26.anObjectArray12;
									local452.anInt1567 = Static20.anInt449 - local71;
									local452.aClass85_4 = local26;
									local452.anInt1560 = Static96.anInt2022 - local77;
									Static155.aClass81_13.method2683(local452);
								}
								if (local26.aBoolean170 && !local356) {
									local26.aBoolean170 = false;
									if (local26.anObjectArray13 != null) {
										local452 = new Class2_Sub12();
										local452.anInt1567 = Static20.anInt449 - local71;
										local452.anObjectArray2 = local26.anObjectArray13;
										local452.anInt1560 = Static96.anInt2022 - local77;
										local452.aClass85_4 = local26;
										Static185.aClass81_16.method2683(local452);
									}
								}
								if (local356 && local26.anObjectArray20 != null) {
									local452 = new Class2_Sub12();
									local452.anInt1560 = Static96.anInt2022 - local77;
									local452.aClass85_4 = local26;
									local452.anInt1567 = Static20.anInt449 - local71;
									local452.anObjectArray2 = local26.anObjectArray20;
									Static155.aClass81_13.method2683(local452);
								}
								if (!local26.aBoolean163 && local350) {
									local26.aBoolean163 = true;
									if (local26.anObjectArray8 != null) {
										local452 = new Class2_Sub12();
										local452.anInt1567 = Static20.anInt449 - local71;
										local452.anObjectArray2 = local26.anObjectArray8;
										local452.anInt1560 = Static96.anInt2022 - local77;
										local452.aClass85_4 = local26;
										Static155.aClass81_13.method2683(local452);
									}
								}
								if (local26.aBoolean163 && local350 && local26.anObjectArray6 != null) {
									local452 = new Class2_Sub12();
									local452.aClass85_4 = local26;
									local452.anInt1560 = Static96.anInt2022 - local77;
									local452.anObjectArray2 = local26.anObjectArray6;
									local452.anInt1567 = Static20.anInt449 - local71;
									Static155.aClass81_13.method2683(local452);
								}
								if (local26.aBoolean163 && !local350) {
									local26.aBoolean163 = false;
									if (local26.anObjectArray11 != null) {
										local452 = new Class2_Sub12();
										local452.aClass85_4 = local26;
										local452.anInt1560 = Static96.anInt2022 - local77;
										local452.anInt1567 = Static20.anInt449 - local71;
										local452.anObjectArray2 = local26.anObjectArray11;
										Static185.aClass81_16.method2683(local452);
									}
								}
								if (local26.anObjectArray27 != null) {
									local452 = new Class2_Sub12();
									local452.aClass85_4 = local26;
									local452.anObjectArray2 = local26.anObjectArray27;
									Static96.aClass81_7.method2683(local452);
								}
								@Pc(800) int local800;
								@Pc(802) int local802;
								@Pc(818) Class2_Sub12 local818;
								if (local26.anObjectArray7 != null && local26.anInt3834 < Static57.anInt1209) {
									if (local26.anIntArray351 == null || Static57.anInt1209 - local26.anInt3834 > 32) {
										local452 = new Class2_Sub12();
										local452.anObjectArray2 = local26.anObjectArray7;
										local452.aClass85_4 = local26;
										Static155.aClass81_13.method2683(local452);
									} else {
										label384: for (local153 = local26.anInt3834; local153 < Static57.anInt1209; local153++) {
											local800 = Static151.anIntArray292[local153 & 0x1F];
											for (local802 = 0; local802 < local26.anIntArray351.length; local802++) {
												if (local800 == local26.anIntArray351[local802]) {
													local818 = new Class2_Sub12();
													local818.aClass85_4 = local26;
													local818.anObjectArray2 = local26.anObjectArray7;
													Static155.aClass81_13.method2683(local818);
													break label384;
												}
											}
										}
									}
									local26.anInt3834 = Static57.anInt1209;
								}
								if (local26.anObjectArray28 != null && Static123.anInt2733 > local26.anInt3893) {
									if (local26.anIntArray350 == null || Static123.anInt2733 - local26.anInt3893 > 32) {
										local452 = new Class2_Sub12();
										local452.anObjectArray2 = local26.anObjectArray28;
										local452.aClass85_4 = local26;
										Static155.aClass81_13.method2683(local452);
									} else {
										label360: for (local153 = local26.anInt3893; local153 < Static123.anInt2733; local153++) {
											local800 = Static71.anIntArray173[local153 & 0x1F];
											for (local802 = 0; local802 < local26.anIntArray350.length; local802++) {
												if (local800 == local26.anIntArray350[local802]) {
													local818 = new Class2_Sub12();
													local818.anObjectArray2 = local26.anObjectArray28;
													local818.aClass85_4 = local26;
													Static155.aClass81_13.method2683(local818);
													break label360;
												}
											}
										}
									}
									local26.anInt3893 = Static123.anInt2733;
								}
								if (local26.anObjectArray22 != null && local26.anInt3877 < Static94.anInt1977) {
									if (local26.anIntArray355 == null || Static94.anInt1977 - local26.anInt3877 > 32) {
										local452 = new Class2_Sub12();
										local452.aClass85_4 = local26;
										local452.anObjectArray2 = local26.anObjectArray22;
										Static155.aClass81_13.method2683(local452);
									} else {
										label336: for (local153 = local26.anInt3877; local153 < Static94.anInt1977; local153++) {
											local800 = Static83.anIntArray187[local153 & 0x1F];
											for (local802 = 0; local802 < local26.anIntArray355.length; local802++) {
												if (local800 == local26.anIntArray355[local802]) {
													local818 = new Class2_Sub12();
													local818.aClass85_4 = local26;
													local818.anObjectArray2 = local26.anObjectArray22;
													Static155.aClass81_13.method2683(local818);
													break label336;
												}
											}
										}
									}
									local26.anInt3877 = Static94.anInt1977;
								}
								if (local26.anInt3870 < Static160.anInt3496 && local26.anObjectArray18 != null) {
									local452 = new Class2_Sub12();
									local452.anObjectArray2 = local26.anObjectArray18;
									local452.aClass85_4 = local26;
									Static155.aClass81_13.method2683(local452);
								}
								if (Static95.anInt2012 > local26.anInt3870 && local26.anObjectArray24 != null) {
									local452 = new Class2_Sub12();
									local452.anObjectArray2 = local26.anObjectArray24;
									local452.aClass85_4 = local26;
									Static155.aClass81_13.method2683(local452);
								}
								if (Static144.anInt3045 > local26.anInt3870 && local26.anObjectArray14 != null) {
									local452 = new Class2_Sub12();
									local452.aClass85_4 = local26;
									local452.anObjectArray2 = local26.anObjectArray14;
									Static155.aClass81_13.method2683(local452);
								}
								if (local26.anInt3870 < Static131.anInt3735 && local26.anObjectArray9 != null) {
									local452 = new Class2_Sub12();
									local452.aClass85_4 = local26;
									local452.anObjectArray2 = local26.anObjectArray9;
									Static155.aClass81_13.method2683(local452);
								}
								if (local26.anInt3870 < Static88.anInt1858 && local26.anObjectArray4 != null) {
									local452 = new Class2_Sub12();
									local452.anObjectArray2 = local26.anObjectArray4;
									local452.aClass85_4 = local26;
									Static155.aClass81_13.method2683(local452);
								}
								local26.anInt3870 = Static69.anInt1431;
								if (local26.anObjectArray17 != null) {
									for (local153 = 0; local153 < Static44.anInt2154; local153++) {
										@Pc(1172) Class2_Sub12 local1172 = new Class2_Sub12();
										local1172.aClass85_4 = local26;
										local1172.anInt1569 = Static23.anIntArray44[local153];
										local1172.anInt1561 = Static177.anIntArray363[local153];
										local1172.anObjectArray2 = local26.anObjectArray17;
										Static155.aClass81_13.method2683(local1172);
									}
								}
							}
						}
						if (!local26.aBoolean171) {
							if (Static160.aClass85_14 != null || Static154.aClass85_13 != null || Static47.aBoolean40) {
								return;
							}
							if ((local26.anInt3872 >= 0 || local26.anInt3835 != 0) && local101 <= Static20.anInt449 && Static96.anInt2022 >= local112 && Static20.anInt449 < local134 && Static96.anInt2022 < local141) {
								if (local26.anInt3872 >= 0) {
									Static184.aClass85_16 = arg4[local26.anInt3872];
								} else {
									Static184.aClass85_16 = local26;
								}
							}
							if (local26.anInt3855 == 8 && local101 <= Static20.anInt449 && local112 <= Static96.anInt2022 && Static20.anInt449 < local134 && Static96.anInt2022 < local141) {
								Static84.aClass85_6 = local26;
							}
							if (local26.anInt3839 > local26.anInt3867) {
								Static132.method2211(local26.anInt3839, Static20.anInt449, local26.anInt3867, local26, local26.anInt3858 + local71, local77, Static96.anInt2022);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([Lclient!lb;B)V")
	public static void method3009(@OriginalArg(0) Class48[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static81.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
						@Pc(32) int local32 = local7;
						if ((Static81.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method1596(local11, local15);
						}
					}
				}
			}
		}
		Static179.anInt3980 += (int) (Math.random() * 5.0D) - 2;
		Static74.anInt1529 += (int) (Math.random() * 5.0D) - 2;
		if (Static179.anInt3980 < -16) {
			Static179.anInt3980 = -16;
		}
		if (Static179.anInt3980 > 16) {
			Static179.anInt3980 = 16;
		}
		@Pc(107) int[][] local107 = new int[104][104];
		local15 = Static179.anInt3980 >> 1;
		if (Static74.anInt1529 < -8) {
			Static74.anInt1529 = -8;
		}
		@Pc(120) int[][] local120 = new int[104][104];
		if (Static74.anInt1529 > 8) {
			Static74.anInt1529 = 8;
		}
		local11 = Static74.anInt1529 >> 2 << 10;
		@Pc(145) int local145;
		@Pc(153) int local153;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(251) int local251;
		@Pc(184) int local184;
		@Pc(205) int local205;
		@Pc(218) int local218;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(230) int local230;
		@Pc(300) int local300;
		@Pc(522) int local522;
		@Pc(518) int local518;
		@Pc(854) int local854;
		for (@Pc(133) int local133 = 0; local133 < 4; local133++) {
			@Pc(139) byte[][] local139 = Static180.aByteArrayArrayArray9[local133];
			local145 = (int) Math.sqrt(5100.0D);
			local153 = local145 * 768 >> 8;
			for (local155 = 1; local155 < 103; local155++) {
				for (local159 = 1; local159 < 103; local159++) {
					local184 = Static162.anIntArrayArrayArray7[local133][local159 + 1][local155] - Static162.anIntArrayArrayArray7[local133][local159 - 1][local155];
					local205 = Static162.anIntArrayArrayArray7[local133][local159][local155 + 1] - Static162.anIntArrayArrayArray7[local133][local159][local155 - 1];
					local218 = (int) Math.sqrt((double) (local205 * local205 + local184 * local184 + 65536));
					local224 = (local184 << 8) / local218;
					local230 = (local205 << 8) / local218;
					local234 = 65536 / local218;
					local251 = (local230 * -50 + local224 * -50 + local234 * -10) / local153 + 96;
					local300 = (local139[local159][local155] >> 1) + (local139[local159][local155 - 1] >> 2) + (local139[local159 + 1][local155] >> 3) + (local139[local159 + -1][local155] >> 2) + (local139[local159][local155 + 1] >> 3);
					local120[local159][local155] = local251 - local300;
				}
			}
			for (local159 = 0; local159 < 104; local159++) {
				Static91.anIntArray197[local159] = 0;
				Static32.anIntArray77[local159] = 0;
				Static163.anIntArray57[local159] = 0;
				Static54.anIntArray110[local159] = 0;
				Static36.anIntArray81[local159] = 0;
			}
			for (local251 = -5; local251 < 104; local251++) {
				for (local184 = 0; local184 < 104; local184++) {
					local205 = local251 + 5;
					@Pc(423) int local423;
					if (local205 < 104) {
						local218 = Static81.aByteArrayArrayArray3[local133][local205][local184] & 0xFF;
						if (local218 > 0) {
							@Pc(387) Class2_Sub2_Sub12 local387 = Static30.method576(local218 - 1);
							Static91.anIntArray197[local184] += local387.anInt2343;
							Static32.anIntArray77[local184] += local387.anInt2346;
							Static163.anIntArray57[local184] += local387.anInt2342;
							Static54.anIntArray110[local184] += local387.anInt2339;
							local423 = Static36.anIntArray81[local184]++;
						}
					}
					local218 = local251 - 5;
					if (local218 >= 0) {
						local224 = Static81.aByteArrayArrayArray3[local133][local218][local184] & 0xFF;
						if (local224 > 0) {
							@Pc(453) Class2_Sub2_Sub12 local453 = Static30.method576(local224 - 1);
							Static91.anIntArray197[local184] -= local453.anInt2343;
							Static32.anIntArray77[local184] -= local453.anInt2346;
							Static163.anIntArray57[local184] -= local453.anInt2342;
							Static54.anIntArray110[local184] -= local453.anInt2339;
							local423 = Static36.anIntArray81[local184]--;
						}
					}
				}
				if (local251 >= 0) {
					local205 = 0;
					local224 = 0;
					local230 = 0;
					local218 = 0;
					local234 = 0;
					for (local300 = -5; local300 < 104; local300++) {
						local518 = local300 - 5;
						local522 = local300 + 5;
						if (local522 < 104) {
							local234 += Static54.anIntArray110[local522];
							local218 += Static32.anIntArray77[local522];
							local230 += Static36.anIntArray81[local522];
							local224 += Static163.anIntArray57[local522];
							local205 += Static91.anIntArray197[local522];
						}
						if (local518 >= 0) {
							local224 -= Static163.anIntArray57[local518];
							local205 -= Static91.anIntArray197[local518];
							local234 -= Static54.anIntArray110[local518];
							local218 -= Static32.anIntArray77[local518];
							local230 -= Static36.anIntArray81[local518];
						}
						if (local300 >= 0 && local230 > 0) {
							local107[local251][local300] = Static165.method2740(local205 * 256 / local234, local218 / local230, local224 / local230);
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local205 = 1; local205 < 103; local205++) {
					if (!Static159.aBoolean148 || (Static81.aByteArrayArrayArray2[0][local184][local205] & 0x2) != 0 || (Static81.aByteArrayArrayArray2[local133][local184][local205] & 0x10) == 0 && Static143.method2366(local205, local133, local184) == Static147.anInt3141) {
						if (Static77.anInt1626 > local133) {
							Static77.anInt1626 = local133;
						}
						local224 = Static126.aByteArrayArrayArray7[local133][local184][local205] & 0xFF;
						local218 = Static81.aByteArrayArrayArray3[local133][local184][local205] & 0xFF;
						if (local218 > 0 || local224 > 0) {
							local230 = Static162.anIntArrayArrayArray7[local133][local184 + 1][local205];
							local234 = Static162.anIntArrayArrayArray7[local133][local184][local205];
							local300 = Static162.anIntArrayArrayArray7[local133][local184 + 1][local205 + 1];
							local522 = Static162.anIntArrayArrayArray7[local133][local184][local205 + 1];
							if (local133 > 0) {
								@Pc(747) boolean local747 = true;
								if (local218 == 0 && Static8.aByteArrayArrayArray6[local133][local184][local205] != 0) {
									local747 = false;
								}
								if (local224 > 0 && !Static51.method906(local224 - 1).aBoolean21) {
									local747 = false;
								}
								if (local747 && local234 == local230 && local234 == local300 && local234 == local522) {
									Static165.anIntArrayArrayArray6[local133][local184][local205] |= 0x924;
								}
							}
							@Pc(821) int local821;
							@Pc(847) int local847;
							if (local218 > 0) {
								local518 = local107[local184][local205];
								local821 = local15 + (local518 & 0x7F);
								if (local821 < 0) {
									local821 = 0;
								} else if (local821 > 127) {
									local821 = 127;
								}
								local847 = local821 + (local518 & 0x380) + (local518 + local11 & 0xFC00);
								local854 = Static109.anIntArray216[Static105.method1785(96, local847)];
							} else {
								local854 = 0;
								local518 = -1;
							}
							local821 = local120[local184][local205];
							local847 = local120[local184 + 1][local205];
							@Pc(884) int local884 = local120[local184 + 1][local205 + 1];
							@Pc(892) int local892 = local120[local184][local205 + 1];
							if (local224 == 0) {
								Static67.method1130(local133, local184, local205, 0, 0, -1, local234, local230, local300, local522, Static105.method1785(local821, local518), Static105.method1785(local847, local518), Static105.method1785(local884, local518), Static105.method1785(local892, local518), 0, 0, 0, 0, local854, 0);
							} else {
								@Pc(937) byte local937 = Static94.aByteArrayArrayArray5[local133][local184][local205];
								@Pc(947) int local947 = Static8.aByteArrayArrayArray6[local133][local184][local205] + 1;
								@Pc(953) Class2_Sub2_Sub5 local953 = Static51.method906(local224 - 1);
								@Pc(956) int local956 = local953.anInt582;
								if (local956 >= 0 && !Static109.anInterface1_2.method193(local956)) {
									local956 = -1;
								}
								@Pc(982) int local982;
								@Pc(980) int local980;
								@Pc(998) int local998;
								@Pc(1026) int local1026;
								if (local956 >= 0) {
									local980 = Static109.anIntArray216[Static25.method460(Static109.anInterface1_2.method188(local956), 96)];
									local982 = -1;
								} else if (local953.anInt581 == -1) {
									local980 = 0;
									local982 = -2;
								} else {
									local982 = local953.anInt581;
									local998 = (local982 & 0x7F) + local15;
									if (local998 < 0) {
										local998 = 0;
									} else if (local998 > 127) {
										local998 = 127;
									}
									local1026 = (local982 + local11 & 0xFC00) + (local982 & 0x380) + local998;
									local980 = Static109.anIntArray216[Static25.method460(local1026, 96)];
								}
								if (local953.anInt580 >= 0) {
									local998 = local953.anInt580;
									local1026 = local15 + (local998 & 0x7F);
									if (local1026 < 0) {
										local1026 = 0;
									} else if (local1026 > 127) {
										local1026 = 127;
									}
									@Pc(1080) int local1080 = (local998 & 0x380) + ((local998 + local11 & 0xFC00) + local1026);
									local980 = Static109.anIntArray216[Static25.method460(local1080, 96)];
								}
								Static67.method1130(local133, local184, local205, local947, local937, local956, local234, local230, local300, local522, Static105.method1785(local821, local518), Static105.method1785(local847, local518), Static105.method1785(local884, local518), Static105.method1785(local892, local518), Static25.method460(local982, local821), Static25.method460(local982, local847), Static25.method460(local982, local884), Static25.method460(local982, local892), local854, local980);
							}
						}
					}
				}
			}
			for (local205 = 1; local205 < 103; local205++) {
				for (local218 = 1; local218 < 103; local218++) {
					Static169.method2801(local133, local218, local205, Static143.method2366(local205, local133, local218));
				}
			}
			Static81.aByteArrayArrayArray3[local133] = null;
			Static126.aByteArrayArrayArray7[local133] = null;
			Static8.aByteArrayArrayArray6[local133] = null;
			Static94.aByteArrayArrayArray5[local133] = null;
			Static180.aByteArrayArrayArray9[local133] = null;
		}
		Static90.method1571();
		@Pc(1207) int local1207;
		for (@Pc(1203) int local1203 = 0; local1203 < 104; local1203++) {
			for (local1207 = 0; local1207 < 104; local1207++) {
				if ((Static81.aByteArrayArrayArray2[1][local1203][local1207] & 0x2) == 2) {
					Static55.method952(local1203, local1207);
				}
			}
		}
		local1207 = 1;
		@Pc(1237) int local1237 = 2;
		local145 = 4;
		for (local153 = 0; local153 < 4; local153++) {
			if (local153 > 0) {
				local1237 <<= 0x3;
				local1207 <<= 0x3;
				local145 <<= 0x3;
			}
			for (local155 = 0; local155 <= local153; local155++) {
				for (local159 = 0; local159 <= 104; local159++) {
					for (local251 = 0; local251 <= 104; local251++) {
						if ((local1207 & Static165.anIntArrayArrayArray6[local155][local251][local159]) != 0) {
							for (local184 = local159; local184 > 0 && (Static165.anIntArrayArrayArray6[local155][local251][local184 - 1] & local1207) != 0; local184--) {
							}
							for (local205 = local159; local205 < 104 && (local1207 & Static165.anIntArrayArrayArray6[local155][local251][local205 + 1]) != 0; local205++) {
							}
							label351: for (local218 = local155; local218 > 0; local218--) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static165.anIntArrayArrayArray6[local218 - 1][local251][local234] & local1207) == 0) {
										break label351;
									}
								}
							}
							label339: for (local224 = local155; local224 < local153; local224++) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static165.anIntArrayArrayArray6[local224 + 1][local251][local234] & local1207) == 0) {
										break label339;
									}
								}
							}
							local234 = (local224 + 1 - local218) * (local205 + 1 - local184);
							if (local234 >= 8) {
								local300 = Static162.anIntArrayArrayArray7[local224][local251][local184] - 240;
								local522 = Static162.anIntArrayArrayArray7[local218][local251][local184];
								Static3.method47(local153, 1, local251 * 128, local251 * 128, local184 * 128, local205 * 128 + 128, local300, local522);
								for (local518 = local218; local518 <= local224; local518++) {
									for (local854 = local184; local854 <= local205; local854++) {
										Static165.anIntArrayArrayArray6[local518][local251][local854] &= ~local1207;
									}
								}
							}
						}
						if ((local1237 & Static165.anIntArrayArrayArray6[local155][local251][local159]) != 0) {
							local184 = local251;
							local205 = local251;
							local218 = local155;
							while (local205 < 104 && (local1237 & Static165.anIntArrayArrayArray6[local155][local205 + 1][local159]) != 0) {
								local205++;
							}
							local224 = local155;
							while (local184 > 0 && (Static165.anIntArrayArrayArray6[local155][local184 - 1][local159] & local1237) != 0) {
								local184--;
							}
							label406: while (local218 > 0) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static165.anIntArrayArrayArray6[local218 - 1][local234][local159] & local1237) == 0) {
										break label406;
									}
								}
								local218--;
							}
							label395: while (local153 > local224) {
								for (local234 = local184; local234 <= local205; local234++) {
									if ((Static165.anIntArrayArrayArray6[local224 + 1][local234][local159] & local1237) == 0) {
										break label395;
									}
								}
								local224++;
							}
							local234 = (local205 + 1 - local184) * (local224 + 1 - local218);
							if (local234 >= 8) {
								local300 = Static162.anIntArrayArrayArray7[local224][local184][local159] - 240;
								local522 = Static162.anIntArrayArrayArray7[local218][local184][local159];
								Static3.method47(local153, 2, local184 * 128, local205 * 128 + 128, local159 * 128, local159 * 128, local300, local522);
								for (local518 = local218; local518 <= local224; local518++) {
									for (local854 = local184; local854 <= local205; local854++) {
										Static165.anIntArrayArrayArray6[local518][local854][local159] &= ~local1237;
									}
								}
							}
						}
						if ((local145 & Static165.anIntArrayArrayArray6[local155][local251][local159]) != 0) {
							local205 = local251;
							local224 = local159;
							local184 = local251;
							local218 = local159;
							while (local224 < 104 && (local145 & Static165.anIntArrayArrayArray6[local155][local251][local224 + 1]) != 0) {
								local224++;
							}
							while (local218 > 0 && (local145 & Static165.anIntArrayArrayArray6[local155][local251][local218 - 1]) != 0) {
								local218--;
							}
							label460: while (local184 > 0) {
								for (local234 = local218; local234 <= local224; local234++) {
									if ((Static165.anIntArrayArrayArray6[local155][local184 - 1][local234] & local145) == 0) {
										break label460;
									}
								}
								local184--;
							}
							label449: while (local205 < 104) {
								for (local234 = local218; local234 <= local224; local234++) {
									if ((Static165.anIntArrayArrayArray6[local155][local205 + 1][local234] & local145) == 0) {
										break label449;
									}
								}
								local205++;
							}
							if ((local224 + 1 - local218) * (-local184 + 1 + local205) >= 4) {
								local234 = Static162.anIntArrayArrayArray7[local155][local184][local218];
								Static3.method47(local153, 4, local184 * 128, local205 * 128 + 128, local218 * 128, local224 * 128 + 128, local234, local234);
								for (local230 = local184; local230 <= local205; local230++) {
									for (local300 = local218; local300 <= local224; local300++) {
										Static165.anIntArrayArrayArray6[local155][local230][local300] &= ~local145;
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
