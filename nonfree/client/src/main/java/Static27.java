import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!eb", name = "Ab", descriptor = "Lclient!va;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
	public static int anInt798 = 3;

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_404 = Static33.method650("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!eb", name = "Nb", descriptor = "I")
	public static int anInt811 = 0;

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!eb", name = "Sb", descriptor = "I")
	public static int anInt812 = 2;

	@OriginalMember(owner = "client!eb", name = "Tb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_405 = Static33.method650("null");

	@OriginalMember(owner = "client!eb", name = "Xb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_406 = Static33.method650("Icons redrawn");

	@OriginalMember(owner = "client!eb", name = "hc", descriptor = "[I")
	public static int[] anIntArray53 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[Lclient!td;BIIIIIII)V")
	public static void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub16[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 < arg2 || arg7 > arg8 || arg5 <= arg4 || arg8 >= arg10) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < arg3.length; local28++) {
			@Pc(34) Class3_Sub1_Sub16 local34 = arg3[local28];
			if (local34 != null && arg6 == local34.anInt2845 && (!local34.aBoolean149 || !Static109.method1157(local34))) {
				@Pc(57) int local57 = local34.anInt2855 + arg2 - arg1;
				@Pc(65) int local65 = arg7 + local34.anInt2797 - arg9;
				if ((local34.anInt2844 >= 0 || local34.anInt2861 != 0) && arg4 >= local57 && local65 <= arg8 && arg4 < local57 + local34.anInt2854 && arg8 < local65 + local34.anInt2827) {
					if (local34.anInt2844 >= 0) {
						Static31.anInt926 = local34.anInt2844;
					} else {
						Static31.anInt926 = local28;
					}
				}
				if (local34.anInt2857 == 8 && arg4 >= local57 && local65 <= arg8 && local34.anInt2854 + local57 > arg4 && local65 + local34.anInt2827 > arg8) {
					Static53.anInt1527 = local28;
				}
				if (local34.anInt2857 == 0) {
					if (!local34.aBoolean149 && Static109.method1157(local34) && !Static2.method15(local28, arg0)) {
						continue;
					}
					method557(arg0, local34.anInt2842, local57, arg3, arg4, local34.anInt2854 + local57, local34.anInt2817, local65, arg8, local34.anInt2806, local34.anInt2827 + local65);
					if (local34.aClass3_Sub1_Sub16Array2 != null) {
						method557(arg0, local34.anInt2842, local57, local34.aClass3_Sub1_Sub16Array2, arg4, local57 + local34.anInt2854, local34.anInt2817, local65, arg8, local34.anInt2806, local65 + local34.anInt2827);
					}
					if (local34.anInt2829 > local34.anInt2827 && !local34.aBoolean149) {
						Static2.method11(local34.anInt2827, local65, local57 + local34.anInt2854, local34.anInt2829, local34, arg4, arg0, arg8);
					}
					if (!local34.aBoolean149) {
						continue;
					}
				}
				if (local34.anInt2823 == 1 && arg4 >= local57 && local65 <= arg8 && arg4 < local34.anInt2854 + local57 && arg8 < local65 + local34.anInt2827) {
					@Pc(265) boolean local265 = false;
					if (local34.anInt2811 != 0) {
						local265 = Static71.method1304(local34);
					}
					if (!local265) {
						Static97.method1702(local34.anInt2817, local34.aClass56_1547, 47, 0, Static122.aClass56_1633, 0);
					}
				}
				if (local34.anInt2823 == 2 && !Static93.aBoolean114 && arg4 >= local57 && arg8 >= local65 && local57 + local34.anInt2854 > arg4 && local34.anInt2827 + local65 > arg8) {
					@Pc(334) Class56 local334 = Static108.method1822(local34);
					if (local334 != null) {
						Static97.method1702(local34.anInt2817, local334, 55, -1, Static84.method1524(new Class56[] { Static50.aClass56_803, local34.aClass56_1548 }), 0);
					}
				}
				if (local34.anInt2823 == 3 && arg4 >= local57 && arg8 >= local65 && local57 + local34.anInt2854 > arg4 && local34.anInt2827 + local65 > arg8) {
					@Pc(400) byte local400;
					if (arg0 == 3) {
						local400 = 17;
					} else {
						local400 = 39;
					}
					Static97.method1702(local34.anInt2817, Static123.aClass56_1668, local400, 0, Static122.aClass56_1633, 0);
				}
				if (local34.anInt2823 == 4 && local57 <= arg4 && arg8 >= local65 && local57 + local34.anInt2854 > arg4 && local65 + local34.anInt2827 > arg8) {
					Static97.method1702(local34.anInt2817, local34.aClass56_1547, 49, 0, Static122.aClass56_1633, 0);
				}
				if (local34.anInt2823 == 5 && arg4 >= local57 && arg8 >= local65 && local57 + local34.anInt2854 > arg4 && arg8 < local65 + local34.anInt2827) {
					Static97.method1702(local34.anInt2817, local34.aClass56_1547, 22, 0, Static122.aClass56_1633, 0);
				}
				if (local34.anInt2823 == 6 && Static79.anInt2107 == -1 && local57 <= arg4 && local65 <= arg8 && local57 + local34.anInt2854 > arg4 && arg8 < local34.anInt2827 + local65) {
					Static97.method1702(local34.anInt2817, local34.aClass56_1547, 1, -1, Static122.aClass56_1633, 0);
				}
				@Pc(582) int local582;
				@Pc(576) int local576;
				if (local34.anInt2857 == 2) {
					local576 = 0;
					for (@Pc(578) int local578 = 0; local578 < local34.anInt2827; local578++) {
						for (local582 = 0; local582 < local34.anInt2854; local582++) {
							@Pc(593) int local593 = local65 + (local34.anInt2839 + 32) * local578;
							@Pc(603) int local603 = (local34.anInt2820 + 32) * local582 + local57;
							if (local576 < 20) {
								local593 += local34.anIntArray269[local576];
								local603 += local34.anIntArray268[local576];
							}
							if (arg4 >= local603 && local593 <= arg8 && arg4 < local603 + 32 && local593 + 32 > arg8) {
								Static46.anInt2263 = local576;
								Static86.anInt2356 = local34.anInt2817;
								if (local34.anIntArray267[local576] > 0) {
									@Pc(666) Class3_Sub1_Sub8 local666 = Static12.method239(local34.anIntArray267[local576] - 1);
									if (Static98.anInt2560 == 1 && Static113.method1867(Static34.method652(local34))) {
										if (local34.anInt2817 != Static12.anInt307 || Static68.anInt1859 != local576) {
											Static97.method1702(local34.anInt2817, Static57.aClass56_890, 58, local576, Static84.method1524(new Class56[] { Static84.aClass56_1217, Static114.aClass56_1564, local666.aClass56_944 }), local666.anInt1734);
										}
									} else if (!Static93.aBoolean114 || !Static113.method1867(Static34.method652(local34))) {
										@Pc(741) Class56[] local741 = local666.aClass56Array7;
										if (Static5.aBoolean5) {
											local741 = Static86.method1600(local741);
										}
										@Pc(757) int local757;
										@Pc(776) byte local776;
										if (Static113.method1867(Static34.method652(local34))) {
											for (local757 = 4; local757 >= 3; local757--) {
												if (local741 != null && local741[local757] != null) {
													if (local757 == 3) {
														local776 = 16;
													} else {
														local776 = 14;
													}
													Static97.method1702(local34.anInt2817, local741[local757], local776, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
												} else if (local757 == 4) {
													Static97.method1702(local34.anInt2817, Static108.aClass56_1496, 14, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
												}
											}
										}
										if (Static100.method1723(Static34.method652(local34))) {
											Static97.method1702(local34.anInt2817, Static57.aClass56_890, 46, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
										}
										if (Static113.method1867(Static34.method652(local34)) && local741 != null) {
											for (local757 = 2; local757 >= 0; local757--) {
												if (local741[local757] != null) {
													local776 = 0;
													if (local757 == 0) {
														local776 = 12;
													}
													if (local757 == 1) {
														local776 = 29;
													}
													if (local757 == 2) {
														local776 = 36;
													}
													Static97.method1702(local34.anInt2817, local741[local757], local776, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
												}
											}
										}
										local741 = local34.aClass56Array13;
										if (Static5.aBoolean5) {
											local741 = Static86.method1600(local741);
										}
										if (local741 != null) {
											for (local757 = 4; local757 >= 0; local757--) {
												if (local741[local757] != null) {
													local776 = 0;
													if (local757 == 0) {
														local776 = 44;
													}
													if (local757 == 1) {
														local776 = 45;
													}
													if (local757 == 2) {
														local776 = 6;
													}
													if (local757 == 3) {
														local776 = 23;
													}
													if (local757 == 4) {
														local776 = 53;
													}
													Static97.method1702(local34.anInt2817, local741[local757], local776, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
												}
											}
										}
										Static97.method1702(local34.anInt2817, Static123.aClass56_1662, 1003, local576, Static84.method1524(new Class56[] { Static1.aClass56_6, local666.aClass56_944 }), local666.anInt1734);
									} else if ((Static63.anInt1819 & 0x10) == 16) {
										Static97.method1702(local34.anInt2817, Static76.aClass56_1114, 33, local576, Static84.method1524(new Class56[] { Static126.aClass56_1702, Static114.aClass56_1564, local666.aClass56_944 }), local666.anInt1734);
									}
								}
							}
							local576++;
						}
					}
				}
				if (local34.aBoolean149) {
					if (Static93.aBoolean114) {
						if (Static106.method1764(Static34.method652(local34)) && (Static63.anInt1819 & 0x20) == 32 && arg4 >= local57 && local65 <= arg8 && arg4 < local34.anInt2854 + local57 && arg8 < local65 + local34.anInt2827) {
							Static97.method1702(local34.anInt2817, Static76.aClass56_1114, 3, local34.anInt2807, Static84.method1524(new Class56[] { Static126.aClass56_1702, Static28.aClass56_412, local34.aClass56_1545 }), 0);
						}
					} else if (arg4 >= local57 && local65 <= arg8 && arg4 < local34.anInt2854 + local57 && arg8 < local65 + local34.anInt2827) {
						@Pc(1151) Class56 local1151;
						for (local576 = 9; local576 >= 5; local576--) {
							local1151 = Static69.method1277(local576, local34);
							if (local1151 != null) {
								Static97.method1702(local34.anInt2817, local1151, 8, local34.anInt2807, local34.aClass56_1545, local576 + 1);
							}
						}
						local1151 = Static108.method1822(local34);
						if (local1151 != null) {
							Static97.method1702(local34.anInt2817, local1151, 55, local34.anInt2807, local34.aClass56_1545, 0);
						}
						for (local582 = 4; local582 >= 0; local582--) {
							@Pc(1204) Class56 local1204 = Static69.method1277(local582, local34);
							if (local1204 != null) {
								Static97.method1702(local34.anInt2817, local1204, 8, local34.anInt2807, local34.aClass56_1545, local582 + 1);
							}
						}
						if (Static86.method1598(Static34.method652(local34))) {
							Static97.method1702(local34.anInt2817, local34.aClass56_1547, 1, local34.anInt2807, Static122.aClass56_1633, 0);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public static void method558(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static98.aBooleanArray11[arg0]) {
			return;
		}
		Static57.aClass44_36.method1154(arg0);
		if (Static31.aClass3_Sub1_Sub16ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static31.aClass3_Sub1_Sub16ArrayArray1[arg0].length; local31++) {
			if (Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local31] != null) {
				if (Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local31].anInt2857 == 2) {
					local29 = false;
				} else {
					Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static31.aClass3_Sub1_Sub16ArrayArray1[arg0] = null;
		}
		Static98.aBooleanArray11[arg0] = false;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lclient!oa;")
	public static Class56 method559(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static111.method1851(arg0);
		} else if (arg0 < 10000000) {
			return Static84.method1524(new Class56[] { Static111.method1851(arg0 / 1000), Static40.aClass56_619 });
		} else {
			return Static84.method1524(new Class56[] { Static111.method1851(arg0 / 1000000), Static70.aClass56_1021 });
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
	public static int method560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg2 & 0x7F;
		@Pc(36) int local36 = arg1;
		@Pc(40) int local40 = arg0 & 0x7F;
		if (arg1 < 3 && (Static66.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
			local36 = arg1 + 1;
		}
		@Pc(86) int local86 = Static22.anIntArrayArrayArray4[local36][local7][local11] * (128 - local34) + local34 * Static22.anIntArrayArrayArray4[local36][local7 + 1][local11] >> 7;
		@Pc(117) int local117 = Static22.anIntArrayArrayArray4[local36][local7 + 1][local11 + 1] * local34 + (128 - local34) * Static22.anIntArrayArrayArray4[local36][local7][local11 + 1] >> 7;
		return (128 - local40) * local86 + local117 * local40 >> 7;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
	public static void method561() {
		aClass56_405 = null;
		aClass56_404 = null;
		aClass56_406 = null;
		anIntArray53 = null;
		aClass76_1 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!kc;Lclient!b;I)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class3_Sub2 arg2) {
		@Pc(5) Class3_Sub7 local5 = new Class3_Sub7();
		local5.anInt1022 = arg2.method270();
		local5.anInt1013 = arg2.method278();
		local5.aClass54Array1 = new Class54[local5.anInt1022];
		local5.anIntArray62 = new int[local5.anInt1022];
		local5.aByteArrayArrayArray4 = new byte[local5.anInt1022][][];
		local5.anIntArray61 = new int[local5.anInt1022];
		local5.aClass54Array2 = new Class54[local5.anInt1022];
		local5.anIntArray60 = new int[local5.anInt1022];
		for (@Pc(55) int local55 = 0; local55 < local5.anInt1022; local55++) {
			try {
				@Pc(61) int local61 = arg2.method270();
				@Pc(83) String local83;
				@Pc(92) String local92;
				@Pc(94) int local94;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local83 = new String(arg2.method301().method1438());
					local92 = new String(arg2.method301().method1438());
					local94 = 0;
					if (local61 == 1) {
						local94 = arg2.method278();
					}
					local5.anIntArray62[local55] = local61;
					local5.anIntArray61[local55] = local94;
					local5.aClass54Array2[local55] = arg1.method1094(local92, Static82.method1468(local83));
				} else if (local61 == 3 || local61 == 4) {
					local83 = new String(arg2.method301().method1438());
					local92 = new String(arg2.method301().method1438());
					local94 = arg2.method270();
					@Pc(163) String[] local163 = new String[local94];
					for (@Pc(165) int local165 = 0; local165 < local94; local165++) {
						local163[local165] = new String(arg2.method301().method1438());
					}
					@Pc(191) byte[][] local191 = new byte[local94][];
					@Pc(202) int local202;
					if (local61 == 3) {
						for (@Pc(196) int local196 = 0; local196 < local94; local196++) {
							local202 = arg2.method278();
							local191[local196] = new byte[local202];
							arg2.method305(local191[local196], local202);
						}
					}
					local5.anIntArray62[local55] = local61;
					@Pc(227) Class[] local227 = new Class[local94];
					for (local202 = 0; local202 < local94; local202++) {
						local227[local202] = Static82.method1468(local163[local202]);
					}
					local5.aClass54Array1[local55] = arg1.method1091(Static82.method1468(local83), local92, local227);
					local5.aByteArrayArrayArray4[local55] = local191;
				}
			} catch (@Pc(266) ClassNotFoundException local266) {
				local5.anIntArray60[local55] = -1;
			} catch (@Pc(273) SecurityException local273) {
				local5.anIntArray60[local55] = -2;
			} catch (@Pc(280) NullPointerException local280) {
				local5.anIntArray60[local55] = -3;
			} catch (@Pc(287) Exception local287) {
				local5.anIntArray60[local55] = -4;
			} catch (@Pc(294) Throwable local294) {
				local5.anIntArray60[local55] = -5;
			}
		}
		Static70.aClass37_9.method985(local5);
	}
}
