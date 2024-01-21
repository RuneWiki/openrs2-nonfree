import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 aClass1_Sub2_Sub5_Sub3_7;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!wh;")
	public static Class99 aClass99_13;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2438 = Static118.method2249("(U0a )2 via: ");

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "[I")
	private static final int[] anIntArray465 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public static int anInt4102 = 0;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	public static int anInt4103 = 0;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2439 = Static118.method2249("Welt");

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2440 = Static118.method2249("huffman");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static71.anInt1744 && arg4 <= Static23.anInt685 && arg5 >= Static206.anInt4385 && Static133.anInt3309 >= arg3) {
			Static148.method2648(arg4, arg5, arg0, arg1, arg3, arg2, arg6);
		} else {
			Static60.method1056(arg5, arg0, arg2, arg4, arg1, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!wd;)I")
	public static int method3076(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1) {
		if (arg1.anIntArrayArray40 == null || arg0 >= arg1.anIntArrayArray40.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = arg1.anIntArrayArray40[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(37) int local37 = local22[local24++];
				@Pc(39) byte local39 = 0;
				@Pc(41) int local41 = 0;
				if (local37 == 0) {
					return local17;
				}
				if (local37 == 1) {
					local41 = Static118.anIntArray335[local22[local24++]];
				}
				if (local37 == 15) {
					local39 = 1;
				}
				if (local37 == 2) {
					local41 = Static113.anIntArray327[local22[local24++]];
				}
				if (local37 == 3) {
					local41 = Static37.anIntArray97[local22[local24++]];
				}
				@Pc(99) int local99;
				@Pc(112) Class97 local112;
				@Pc(117) int local117;
				@Pc(132) int local132;
				if (local37 == 4) {
					local99 = local22[local24++] << 16;
					@Pc(106) int local106 = local99 + local22[local24++];
					local112 = Static154.method2691(local106);
					local117 = local22[local24++];
					if (local117 != -1 && (!Static40.method700(local117).aBoolean13 || Static15.aBoolean19)) {
						for (local132 = 0; local132 < local112.anIntArray512.length; local132++) {
							if (local112.anIntArray512[local132] == local117 + 1) {
								local41 += local112.anIntArray507[local132];
							}
						}
					}
				}
				if (local37 == 16) {
					local39 = 2;
				}
				if (local37 == 5) {
					local41 = Static135.anIntArray379[local22[local24++]];
				}
				if (local37 == 6) {
					local41 = Class18.anIntArray447[Static113.anIntArray327[local22[local24++]] - 1];
				}
				if (local37 == 17) {
					local39 = 3;
				}
				if (local37 == 7) {
					local41 = Static135.anIntArray379[local22[local24++]] * 100 / 46875;
				}
				if (local37 == 8) {
					local41 = Static201.aClass6_Sub4_Sub1_3.anInt606;
				}
				if (local37 == 9) {
					for (local99 = 0; local99 < 25; local99++) {
						if (Static29.aBooleanArray4[local99]) {
							local41 += Static113.anIntArray327[local99];
						}
					}
				}
				if (local37 == 10) {
					local99 = local22[local24++] << 16;
					local99 += local22[local24++];
					local112 = Static154.method2691(local99);
					local117 = local22[local24++];
					if (local117 != -1 && (!Static40.method700(local117).aBoolean13 || Static15.aBoolean19)) {
						for (local132 = 0; local132 < local112.anIntArray512.length; local132++) {
							if (local112.anIntArray512[local132] == local117 + 1) {
								local41 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local41 = Static34.anInt998;
				}
				if (local37 == 12) {
					local41 = Static47.anInt1234;
				}
				if (local37 == 13) {
					local99 = Static135.anIntArray379[local22[local24++]];
					@Pc(340) int local340 = local22[local24++];
					local41 = (local99 & 0x1 << local340) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local99 = local22[local24++];
					local41 = Static160.method2103(local99);
				}
				if (local37 == 18) {
					local41 = Static205.anInt4337 + (Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7);
				}
				if (local37 == 19) {
					local41 = Static58.anInt1543 + (Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7);
				}
				if (local37 == 20) {
					local41 = local22[local24++];
				}
				if (local39 == 0) {
					if (local26 == 0) {
						local17 += local41;
					}
					if (local26 == 1) {
						local17 -= local41;
					}
					if (local26 == 2 && local41 != 0) {
						local17 /= local41;
					}
					if (local26 == 3) {
						local17 *= local41;
					}
					local26 = 0;
				} else {
					local26 = local39;
				}
			}
		} catch (@Pc(446) Exception local446) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)V")
	public static void method3077(@OriginalArg(1) boolean arg0) {
		Static138.aBoolean137 = arg0;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(28) int local28;
		@Pc(31) int local31;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(143) int local143;
		@Pc(146) int local146;
		@Pc(149) int local149;
		if (!Static138.aBoolean137) {
			local15 = Static1.aClass1_Sub14_Sub1_43.method1715();
			local19 = Static1.aClass1_Sub14_Sub1_43.method1753();
			local23 = Static1.aClass1_Sub14_Sub1_43.method1715();
			local28 = (Static62.anInt1604 - Static1.aClass1_Sub14_Sub1_43.anInt2306) / 16;
			Static160.anIntArrayArray22 = new int[local28][4];
			for (local31 = 0; local31 < local28; local31++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static160.anIntArrayArray22[local31][local34] = Static1.aClass1_Sub14_Sub1_43.method1705();
				}
			}
			local34 = Static1.aClass1_Sub14_Sub1_43.method1715();
			@Pc(355) boolean local355 = false;
			local40 = Static1.aClass1_Sub14_Sub1_43.method1752();
			Static193.anIntArray476 = new int[local28];
			Static98.aByteArrayArray24 = new byte[local28][];
			Static148.aByteArrayArray32 = new byte[local28][];
			Static93.anIntArray266 = new int[local28];
			Static87.anIntArray241 = new int[local28];
			if ((local34 / 8 == 48 || local34 / 8 == 49) && local19 / 8 == 48) {
				local355 = true;
			}
			local28 = 0;
			if (local34 / 8 == 48 && local19 / 8 == 148) {
				local355 = true;
			}
			for (local143 = (local34 - 6) / 8; local143 <= (local34 + 6) / 8; local143++) {
				for (local146 = (local19 - 6) / 8; local146 <= (local19 + 6) / 8; local146++) {
					local149 = local146 + (local143 << 8);
					if (!local355 || local146 != 49 && local146 != 149 && local146 != 147 && local143 != 50 && (local143 != 49 || local146 != 47)) {
						Static93.anIntArray266[local28] = local149;
						Static193.anIntArray476[local28] = Static121.aClass60_Sub1_115.method2328(Static109.method2004(new Class65[] { Static59.aClass65_956, Static118.method2250(local143), Static137.aClass65_1885, Static118.method2250(local146) }));
						Static87.anIntArray241[local28] = Static121.aClass60_Sub1_115.method2328(Static109.method2004(new Class65[] { Static60.aClass65_960, Static118.method2250(local143), Static137.aClass65_1885, Static118.method2250(local146) }));
						local28++;
					}
				}
			}
			Static176.method2983(local23, local34, local15, local40, local19);
			return;
		}
		local15 = Static1.aClass1_Sub14_Sub1_43.method1722();
		local19 = Static1.aClass1_Sub14_Sub1_43.method1715();
		local23 = Static1.aClass1_Sub14_Sub1_43.method1749();
		Static1.aClass1_Sub14_Sub1_43.method1759();
		for (local28 = 0; local28 < 4; local28++) {
			for (local31 = 0; local31 < 13; local31++) {
				for (local34 = 0; local34 < 13; local34++) {
					local40 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
					if (local40 == 1) {
						Static184.anIntArrayArrayArray7[local28][local31][local34] = Static1.aClass1_Sub14_Sub1_43.method1756(26);
					} else {
						Static184.anIntArrayArrayArray7[local28][local31][local34] = -1;
					}
				}
			}
		}
		Static1.aClass1_Sub14_Sub1_43.method1755();
		local31 = (Static62.anInt1604 - Static1.aClass1_Sub14_Sub1_43.anInt2306) / 16;
		Static160.anIntArrayArray22 = new int[local31][4];
		for (local34 = 0; local34 < local31; local34++) {
			for (local40 = 0; local40 < 4; local40++) {
				Static160.anIntArrayArray22[local34][local40] = Static1.aClass1_Sub14_Sub1_43.method1705();
			}
		}
		local40 = Static1.aClass1_Sub14_Sub1_43.method1715();
		@Pc(124) int local124 = Static1.aClass1_Sub14_Sub1_43.method1704();
		Static98.aByteArrayArray24 = new byte[local31][];
		Static93.anIntArray266 = new int[local31];
		Static193.anIntArray476 = new int[local31];
		Static87.anIntArray241 = new int[local31];
		Static148.aByteArrayArray32 = new byte[local31][];
		local31 = 0;
		for (local143 = 0; local143 < 4; local143++) {
			for (local146 = 0; local146 < 13; local146++) {
				for (local149 = 0; local149 < 13; local149++) {
					@Pc(158) int local158 = Static184.anIntArrayArrayArray7[local143][local146][local149];
					if (local158 != -1) {
						@Pc(167) int local167 = local158 >> 14 & 0x3FF;
						@Pc(173) int local173 = local158 >> 3 & 0x7FF;
						@Pc(183) int local183 = (local167 / 8 << 8) + local173 / 8;
						for (@Pc(185) int local185 = 0; local185 < local31; local185++) {
							if (Static93.anIntArray266[local185] == local183) {
								local183 = -1;
								break;
							}
						}
						if (local183 != -1) {
							Static93.anIntArray266[local31] = local183;
							@Pc(216) int local216 = local183 >> 8 & 0xFF;
							@Pc(220) int local220 = local183 & 0xFF;
							Static193.anIntArray476[local31] = Static121.aClass60_Sub1_115.method2328(Static109.method2004(new Class65[] { Static59.aClass65_956, Static118.method2250(local216), Static137.aClass65_1885, Static118.method2250(local220) }));
							Static87.anIntArray241[local31] = Static121.aClass60_Sub1_115.method2328(Static109.method2004(new Class65[] { Static60.aClass65_960, Static118.method2250(local216), Static137.aClass65_1885, Static118.method2250(local220) }));
							local31++;
						}
					}
				}
			}
		}
		Static176.method2983(local40, local124, local23, local15, local19);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method3078(@OriginalArg(1) Class1_Sub24 arg0) {
		@Pc(1) long local1 = 0L;
		if (arg0.anInt4089 == 0) {
			local1 = Static198.method3219(arg0.anInt4096, arg0.anInt4100, arg0.anInt4087);
		}
		if (arg0.anInt4089 == 1) {
			local1 = Static95.method1805(arg0.anInt4096, arg0.anInt4100, arg0.anInt4087);
		}
		if (arg0.anInt4089 == 2) {
			local1 = Static202.method1711(arg0.anInt4096, arg0.anInt4100, arg0.anInt4087);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = -1;
		if (arg0.anInt4089 == 3) {
			local1 = Static26.method479(arg0.anInt4096, arg0.anInt4100, arg0.anInt4087);
		}
		@Pc(60) int local60 = 0;
		if (local1 != 0L) {
			local44 = (int) local1 >> 14 & 0x1F;
			local46 = Integer.MAX_VALUE & (int) (local1 >>> 32);
			local60 = (int) local1 >> 20 & 0x3;
		}
		arg0.anInt4086 = local60;
		arg0.anInt4092 = local44;
		arg0.anInt4095 = local46;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZIZI)Lclient!nd;")
	public static Class60_Sub1 method3079(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class32 local5 = null;
		if (Static205.aClass72_5 != null) {
			local5 = new Class32(arg3, Static205.aClass72_5, Static71.aClass72Array1[arg3], 1000000);
		}
		return new Class60_Sub1(local5, Static145.aClass32_3, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!gg;Z)V")
	public static void method3080(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static141.aClass91_14.method3151(arg0);
		while (true) {
			@Pc(8) Class1_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub7[][] local30;
			@Pc(47) Class1_Sub7 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class10 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class54 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub7 var32;
										while (true) {
											do {
												local8 = (Class1_Sub7) Static141.aClass91_14.method3145();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean71);
											local17 = local8.anInt1678;
											local20 = local8.anInt1682;
											local23 = local8.anInt1686;
											local26 = local8.anInt1684;
											local30 = Static83.aClass1_Sub7ArrayArrayArray1[local23];
											if (!local8.aBoolean72) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static83.aClass1_Sub7ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean71) {
														continue;
													}
												}
												if (local17 <= Static60.anInt1554 && local17 > Static149.anInt3500) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean71 && (local47.aBoolean72 || (local8.anInt1676 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static60.anInt1554 && local17 < Static157.anInt4277 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean71 && (local47.aBoolean72 || (local8.anInt1676 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static33.anInt964 && local20 > Static143.anInt1630) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean71 && (local47.aBoolean72 || (local8.anInt1676 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static33.anInt964 && local20 < Static65.anInt1687 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean71 && (local47.aBoolean72 || (local8.anInt1676 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean72 = false;
											if (local8.aClass1_Sub7_1 != null) {
												local47 = local8.aClass1_Sub7_1;
												if (local47.aClass93_1 == null) {
													if (local47.aClass76_1 != null && !Static206.method3278(0, local17, local20)) {
														Static128.method2419(local47.aClass76_1, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local17, local20);
													}
												} else if (!Static206.method3278(0, local17, local20)) {
													Static150.method2666(local47.aClass93_1, 0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local17, local20);
												}
												@Pc(219) Class10 local219 = local47.aClass10_1;
												if (local219 != null) {
													local219.aClass6_2.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local219.anInt666 - Static1.anInt4460, local219.anInt658 - Static100.anInt2513, local219.anInt662 - Static66.anInt1691, local219.aLong20);
												}
												for (local245 = 0; local245 < local47.anInt1677; local245++) {
													var11 = local47.aClass54Array2[local245];
													if (var11 != null) {
														var11.aClass6_5.method2989(var11.anInt2635, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, var11.anInt2641 - Static1.anInt4460, var11.anInt2646 - Static100.anInt2513, var11.anInt2633 - Static66.anInt1691, var11.aLong83);
													}
												}
											}
											var21 = false;
											if (local8.aClass93_1 == null) {
												if (local8.aClass76_1 != null && !Static206.method3278(local26, local17, local20)) {
													var21 = true;
													Static128.method2419(local8.aClass76_1, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local17, local20);
												}
											} else if (!Static206.method3278(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass93_1.anInt4267 != 12345678 || Static119.aBoolean120 && local23 <= Static9.anInt236) {
													Static150.method2666(local8.aClass93_1, local26, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class10 local340 = local8.aClass10_1;
											@Pc(343) Class88 local343 = local8.aClass88_1;
											if (local340 != null || local343 != null) {
												if (Static60.anInt1554 == local17) {
													var20++;
												} else if (Static60.anInt1554 < local17) {
													var20 += 2;
												}
												if (Static33.anInt964 == local20) {
													var20 += 3;
												} else if (Static33.anInt964 > local20) {
													var20 += 6;
												}
												local245 = Static20.anIntArray64[var20];
												local8.anInt1681 = Static131.anIntArray372[var20];
											}
											if (local340 != null) {
												if ((local340.anInt663 & Static55.anIntArray133[var20]) == 0) {
													local8.anInt1674 = 0;
												} else if (local340.anInt663 == 16) {
													local8.anInt1674 = 3;
													local8.anInt1675 = anIntArray465[var20];
													local8.anInt1683 = 3 - local8.anInt1675;
												} else if (local340.anInt663 == 32) {
													local8.anInt1674 = 6;
													local8.anInt1675 = Static102.anIntArray291[var20];
													local8.anInt1683 = 6 - local8.anInt1675;
												} else if (local340.anInt663 == 64) {
													local8.anInt1674 = 12;
													local8.anInt1675 = Static190.anIntArray473[var20];
													local8.anInt1683 = 12 - local8.anInt1675;
												} else {
													local8.anInt1674 = 9;
													local8.anInt1675 = Static57.anIntArray147[var20];
													local8.anInt1683 = 9 - local8.anInt1675;
												}
												if ((local340.anInt663 & local245) != 0 && !Static198.method3218(local26, local17, local20, local340.anInt663)) {
													local340.aClass6_2.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local340.anInt666 - Static1.anInt4460, local340.anInt658 - Static100.anInt2513, local340.anInt662 - Static66.anInt1691, local340.aLong20);
												}
												if ((local340.anInt665 & local245) != 0 && !Static198.method3218(local26, local17, local20, local340.anInt665)) {
													local340.aClass6_1.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local340.anInt666 - Static1.anInt4460, local340.anInt658 - Static100.anInt2513, local340.anInt662 - Static66.anInt1691, local340.aLong20);
												}
											}
											if (local343 != null && !Static97.method1845(local26, local17, local20, local343.aClass6_10.method2984())) {
												if ((local343.anInt4108 & local245) != 0) {
													local343.aClass6_10.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local343.anInt4113 + local343.anInt4105 - Static1.anInt4460, local343.anInt4104 - Static100.anInt2513, local343.anInt4109 + local343.anInt4106 - Static66.anInt1691, local343.aLong138);
												} else if (local343.anInt4108 == 256) {
													local579 = local343.anInt4113 - Static1.anInt4460;
													local584 = local343.anInt4104 - Static100.anInt2513;
													local589 = local343.anInt4109 - Static66.anInt1691;
													var16 = local343.anInt4112;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass6_10.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local579 + local343.anInt4105, local584, local589 + local343.anInt4106, local343.aLong138);
													} else if (local343.aClass6_11 != null) {
														local343.aClass6_11.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local579, local584, local589, local343.aLong138);
													}
												}
											}
											if (var21) {
												@Pc(660) Class33 local660 = local8.aClass33_1;
												if (local660 != null) {
													local660.aClass6_3.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local660.anInt1690 - Static1.anInt4460, local660.anInt1689 - Static100.anInt2513, local660.anInt1692 - Static66.anInt1691, local660.aLong53);
												}
												@Pc(687) Class55 local687 = local8.aClass55_1;
												if (local687 != null && local687.anInt2661 == 0) {
													if (local687.aClass6_6 != null) {
														local687.aClass6_6.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local687.anInt2662 - Static1.anInt4460, local687.anInt2665 - Static100.anInt2513, local687.anInt2658 - Static66.anInt1691, local687.aLong85);
													}
													if (local687.aClass6_8 != null) {
														local687.aClass6_8.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local687.anInt2662 - Static1.anInt4460, local687.anInt2665 - Static100.anInt2513, local687.anInt2658 - Static66.anInt1691, local687.aLong85);
													}
													if (local687.aClass6_7 != null) {
														local687.aClass6_7.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local687.anInt2662 - Static1.anInt4460, local687.anInt2665 - Static100.anInt2513, local687.anInt2658 - Static66.anInt1691, local687.aLong85);
													}
												}
											}
											local579 = local8.anInt1676;
											if (local579 != 0) {
												if (local17 < Static60.anInt1554 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean71) {
														Static141.aClass91_14.method3151(var32);
													}
												}
												if (local20 < Static33.anInt964 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean71) {
														Static141.aClass91_14.method3151(var32);
													}
												}
												if (local17 > Static60.anInt1554 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean71) {
														Static141.aClass91_14.method3151(var32);
													}
												}
												if (local20 > Static33.anInt964 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean71) {
														Static141.aClass91_14.method3151(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1674 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1677; var20++) {
												if (local8.aClass54Array2[var20].anInt2634 != Static11.anInt255 && (local8.anIntArray161[var20] & local8.anInt1674) == local8.anInt1675) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass10_1;
												if (!Static198.method3218(local26, local17, local20, local906.anInt663)) {
													local906.aClass6_2.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local906.anInt666 - Static1.anInt4460, local906.anInt658 - Static100.anInt2513, local906.anInt662 - Static66.anInt1691, local906.aLong20);
												}
												local8.anInt1674 = 0;
											}
										}
										if (!local8.aBoolean73) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt1677;
											local8.aBoolean73 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass54Array2[local245];
												if (var11.anInt2634 != Static11.anInt255) {
													for (local964 = var11.anInt2639; local964 <= var11.anInt2636; local964++) {
														for (local579 = var11.anInt2632; local579 <= var11.anInt2640; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean72) {
																local8.aBoolean73 = true;
																continue label558;
															}
															if (var32.anInt1674 != 0) {
																local589 = 0;
																if (local964 > var11.anInt2639) {
																	local589++;
																}
																if (local964 < var11.anInt2636) {
																	local589 += 4;
																}
																if (local579 > var11.anInt2632) {
																	local589 += 8;
																}
																if (local579 < var11.anInt2640) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt1674) == local8.anInt1683) {
																	local8.aBoolean73 = true;
																	continue label558;
																}
															}
														}
													}
													Static2.aClass54Array1[var20++] = var11;
													local579 = Static60.anInt1554 - var11.anInt2639;
													local584 = var11.anInt2636 - Static60.anInt1554;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static33.anInt964 - var11.anInt2632;
													var16 = var11.anInt2640 - Static33.anInt964;
													if (var16 > local589) {
														var11.anInt2642 = local579 + var16;
													} else {
														var11.anInt2642 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class54 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static2.aClass54Array1[local579];
													if (local1088.anInt2634 != Static11.anInt255) {
														if (local1088.anInt2642 > local1079) {
															local1079 = local1088.anInt2642;
															local964 = local579;
														} else if (local1088.anInt2642 == local1079) {
															local589 = local1088.anInt2641 - Static1.anInt4460;
															var16 = local1088.anInt2633 - Static66.anInt1691;
															var17 = Static2.aClass54Array1[local964].anInt2641 - Static1.anInt4460;
															var18 = Static2.aClass54Array1[local964].anInt2633 - Static66.anInt1691;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static2.aClass54Array1[local964];
												local1088.anInt2634 = Static11.anInt255;
												if (!Static161.method2765(local26, local1088.anInt2639, local1088.anInt2636, local1088.anInt2632, local1088.anInt2640, local1088.aClass6_5.method2984())) {
													local1088.aClass6_5.method2989(local1088.anInt2635, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local1088.anInt2641 - Static1.anInt4460, local1088.anInt2646 - Static100.anInt2513, local1088.anInt2633 - Static66.anInt1691, local1088.aLong83);
												}
												for (local589 = local1088.anInt2639; local589 <= local1088.anInt2636; local589++) {
													for (var16 = local1088.anInt2632; var16 <= local1088.anInt2640; var16++) {
														@Pc(1212) Class1_Sub7 local1212 = local30[local589][var16];
														if (local1212.anInt1674 != 0) {
															Static141.aClass91_14.method3151(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean71) {
															Static141.aClass91_14.method3151(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean73) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean73 = false;
											break;
										}
									}
								} while (!local8.aBoolean71);
							} while (local8.anInt1674 != 0);
							if (local17 > Static60.anInt1554 || local17 <= Static149.anInt3500) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean71);
						if (local17 < Static60.anInt1554 || local17 >= Static157.anInt4277 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean71);
					if (local20 > Static33.anInt964 || local20 <= Static143.anInt1630) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean71);
				if (local20 < Static33.anInt964 || local20 >= Static65.anInt1687 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean71);
			local8.aBoolean71 = false;
			Static7.anInt175--;
			@Pc(1354) Class55 local1354 = local8.aClass55_1;
			if (local1354 != null && local1354.anInt2661 != 0) {
				if (local1354.aClass6_6 != null) {
					local1354.aClass6_6.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local1354.anInt2662 - Static1.anInt4460, local1354.anInt2665 - Static100.anInt2513 - local1354.anInt2661, local1354.anInt2658 - Static66.anInt1691, local1354.aLong85);
				}
				if (local1354.aClass6_8 != null) {
					local1354.aClass6_8.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local1354.anInt2662 - Static1.anInt4460, local1354.anInt2665 - Static100.anInt2513 - local1354.anInt2661, local1354.anInt2658 - Static66.anInt1691, local1354.aLong85);
				}
				if (local1354.aClass6_7 != null) {
					local1354.aClass6_7.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local1354.anInt2662 - Static1.anInt4460, local1354.anInt2665 - Static100.anInt2513 - local1354.anInt2661, local1354.anInt2658 - Static66.anInt1691, local1354.aLong85);
				}
			}
			if (local8.anInt1681 != 0) {
				@Pc(1449) Class88 local1449 = local8.aClass88_1;
				if (local1449 != null && !Static97.method1845(local26, local17, local20, local1449.aClass6_10.method2984())) {
					if ((local1449.anInt4108 & local8.anInt1681) != 0) {
						local1449.aClass6_10.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local1449.anInt4113 + local1449.anInt4105 - Static1.anInt4460, local1449.anInt4104 - Static100.anInt2513, local1449.anInt4109 + local1449.anInt4106 - Static66.anInt1691, local1449.aLong138);
					} else if (local1449.anInt4108 == 256) {
						local245 = local1449.anInt4113 - Static1.anInt4460;
						local1079 = local1449.anInt4104 - Static100.anInt2513;
						local964 = local1449.anInt4109 - Static66.anInt1691;
						local579 = local1449.anInt4112;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass6_10.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local245 + local1449.anInt4105, local1079, local964 + local1449.anInt4106, local1449.aLong138);
						} else if (local1449.aClass6_11 != null) {
							local1449.aClass6_11.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local245, local1079, local964, local1449.aLong138);
						}
					}
				}
				local906 = local8.aClass10_1;
				if (local906 != null) {
					if ((local906.anInt665 & local8.anInt1681) != 0 && !Static198.method3218(local26, local17, local20, local906.anInt665)) {
						local906.aClass6_1.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local906.anInt666 - Static1.anInt4460, local906.anInt658 - Static100.anInt2513, local906.anInt662 - Static66.anInt1691, local906.aLong20);
					}
					if ((local906.anInt663 & local8.anInt1681) != 0 && !Static198.method3218(local26, local17, local20, local906.anInt663)) {
						local906.aClass6_2.method2989(0, Static201.anInt3974, Static123.anInt3073, Static36.anInt1022, Static14.anInt388, local906.anInt666 - Static1.anInt4460, local906.anInt658 - Static100.anInt2513, local906.anInt662 - Static66.anInt1691, local906.aLong20);
					}
				}
			}
			@Pc(1669) Class1_Sub7 local1669;
			if (local23 < Static100.anInt2522 - 1) {
				local1669 = Static83.aClass1_Sub7ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean71) {
					Static141.aClass91_14.method3151(local1669);
				}
			}
			if (local17 < Static60.anInt1554) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean71) {
					Static141.aClass91_14.method3151(local1669);
				}
			}
			if (local20 < Static33.anInt964) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean71) {
					Static141.aClass91_14.method3151(local1669);
				}
			}
			if (local17 > Static60.anInt1554) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean71) {
					Static141.aClass91_14.method3151(local1669);
				}
			}
			if (local20 > Static33.anInt964) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean71) {
					Static141.aClass91_14.method3151(local1669);
				}
			}
		}
	}
}
