import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	public static int anInt1658;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	public static int anInt1660;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	public static int anInt1661;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_15 = new Class208(47, 3);

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!de;")
	public static final Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!eia;")
	public static final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
	public static final boolean aBoolean116 = false;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "J")
	public static long aLong37 = 1L;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sca;)Lclient!ue;")
	public static Class6_Sub47 method1364(@OriginalArg(0) Class302 arg0) {
		@Pc(13) Class6_Sub47 local13 = (Class6_Sub47) Static284.aClass128_35.method3560(((long) arg0.anInt8838 << 32) + (long) arg0.anInt8834);
		return local13 == null ? arg0.aClass6_Sub47_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!sca;)Lclient!sca;")
	public static Class302 method1365(@OriginalArg(0) Class302 arg0) {
		@Pc(4) int local4 = method1364(arg0).method8146();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static386.method4914(arg0.anInt8806);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!sca;)Z")
	public static boolean method1367(@OriginalArg(0) Class302 arg0) {
		if (Static321.aBoolean412) {
			if (method1364(arg0).anInt9595 != 0) {
				return false;
			}
			if (arg0.anInt8816 == 0) {
				return false;
			}
		}
		return arg0.aBoolean601;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!sca;IIIIIIIIIII)V")
	public static void method1368(@OriginalArg(0) Class302[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class302 local6 = arg0[local1];
			if (local6 != null && local6.anInt8806 == arg1) {
				@Pc(17) int local17 = local6.anInt8866 + arg6;
				@Pc(22) int local22 = local6.anInt8854 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt8816 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt8801;
					local45 = local22 + local6.anInt8814;
					if (local6.anInt8816 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt8816 == 0 || local6.aBoolean592 || method1364(local6).anInt9595 != 0 || local6 == Static228.aClass302_30 || local6.anInt8784 == Static217.anInt4255 || local6.anInt8784 == Static301.anInt5872) {
					if (!method1367(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static389.aBoolean497) {
							local40 = Static240.method4161();
							local45 = Static452.method6945();
						}
						if (local6 == Static478.aClass302_56 && Static245.method5547(Static478.aClass302_56) != null) {
							Static479.aBoolean562 = true;
							Static64.anInt10318 = local17;
							Static269.anInt5358 = local22;
						}
						if (local6.aBoolean591 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean598 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class6_Sub10 local168 = (Class6_Sub10) Static218.aClass8_26.method149(); local168 != null; local168 = (Class6_Sub10) Static218.aClass8_26.method155()) {
									if (local168.aBoolean127) {
										local168.method9043();
										local168.aClass302_14.aBoolean593 = false;
									}
								}
								if (Static511.anInt8900 == 0) {
									Static478.aClass302_56 = null;
									Static228.aClass302_30 = null;
								}
								Static614.anInt10101 = 0;
								Static203.aBoolean291 = false;
								Static343.aBoolean427 = false;
								if (!Static71.aBoolean94) {
									Static370.method5839();
								}
							}
							@Pc(232) boolean local232;
							if (Static429.aClass71_1.method7701() + local40 >= local28 && Static429.aClass71_1.method7702() + local45 >= local30 && Static429.aClass71_1.method7701() + local40 < local32 && Static429.aClass71_1.method7702() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static280.aBoolean380 && local232) {
								if (local6.anInt8859 >= 0) {
									Static351.anInt6586 = local6.anInt8859;
								} else if (local6.aBoolean598) {
									Static351.anInt6586 = -1;
								}
							}
							if (!Static71.aBoolean94 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static82.method1425(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static429.aClass71_1.method7694() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class6_Sub15 local291 = (Class6_Sub15) Static334.aClass8_33.method149();
							if (local291 != null && local291.method8390() == 0 && local291.method8383() + local40 >= local28 && local291.method8387() + local45 >= local30 && local291.method8383() + local40 < local32 && local291.method8387() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray99 != null && !Static368.method5827()) {
								for (local335 = 0; local335 < local6.aByteArray99.length; local335++) {
									if (Static647.aClass251_1.method6712(local6.aByteArray99[local335])) {
										if (local6.anIntArray549 == null || Static113.anInt2243 >= local6.anIntArray549[local335]) {
											@Pc(367) byte local367 = local6.aByteArray100[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static647.aClass251_1.method6712(86) && !Static647.aClass251_1.method6712(82) && !Static647.aClass251_1.method6712(81)) && ((local367 & 0x2) == 0 || Static647.aClass251_1.method6712(86)) && ((local367 & 0x1) == 0 || Static647.aClass251_1.method6712(82)) && ((local367 & 0x4) == 0 || Static647.aClass251_1.method6712(81))) {
												if (local335 < 10) {
													Static418.method6583(local6.anInt8838, "", -1, local335 + 1);
												} else if (local335 == 10) {
													Static633.method8924();
													@Pc(438) Class6_Sub47 local438 = method1364(local6);
													Static326.method5411(local438.method8147(), local6, local438.anInt9598);
													Static173.aString38 = Static255.method4577(local6);
													if (Static173.aString38 == null) {
														Static173.aString38 = "Null";
													}
													Static391.aString87 = local6.aString103 + "<col=ffffff>";
												}
												local469 = local6.anIntArray548[local335];
												if (local6.anIntArray549 == null) {
													local6.anIntArray549 = new int[local6.aByteArray99.length];
												}
												if (local469 == 0) {
													local6.anIntArray549[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray549[local335] = Static113.anInt2243 + local469;
												}
											}
										}
									} else if (local6.anIntArray549 != null) {
										local6.anIntArray549[local335] = 0;
									}
								}
							}
							if (local286) {
								Static288.method5010(local6, local45 + local291.method8387() - local22, local40 + local291.method8383() - local17);
							}
							if (Static478.aClass302_56 != null && Static478.aClass302_56 != local6 && local232 && method1364(local6).method8143()) {
								Static94.aClass302_16 = local6;
							}
							if (local6 == Static228.aClass302_30) {
								Static66.aBoolean91 = true;
								Static618.anInt10218 = local17;
								Static112.anInt2201 = local22;
							}
							if (local6.aBoolean592 || local6.anInt8784 != 0) {
								@Pc(558) Class6_Sub10 local558;
								if (local232 && Static3.anInt51 != 0 && local6.anObjectArray20 != null) {
									local558 = new Class6_Sub10();
									local558.aBoolean127 = true;
									local558.aClass302_14 = local6;
									local558.anInt1847 = Static3.anInt51;
									local558.anObjectArray1 = local6.anObjectArray20;
									Static218.aClass8_26.method157(local558);
								}
								if (Static478.aClass302_56 != null || Static71.aBoolean94 || local6.anInt8784 != Static233.anInt4693 && Static614.anInt10101 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt8784 != 0) {
									if (local6.anInt8784 == Static185.anInt3788 || local6.anInt8784 == Static283.anInt6253) {
										Static196.aClass302_28 = local6;
										if (Static382.aClass264_1 != null) {
											Static382.aClass264_1.method6929(Static162.aClass100_7, local6.anInt8814);
										}
										if (local6.anInt8784 == Static185.anInt3788) {
											if (Static71.aBoolean94 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static559.method8061(Static162.aClass100_7, arg8, arg9);
											@Pc(641) Class20_Sub5 local641 = (Class20_Sub5) Static165.aClass81_4.method2118();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt3942 && arg10 < local641.anInt3939 && arg11 >= local641.anInt3943 && arg11 < local641.anInt3938) {
													Static370.method5839();
													Static495.method7406(local641.aClass20_Sub2_Sub2_Sub1_1);
												}
												local641 = (Class20_Sub5) Static165.aClass81_4.method2128();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt8784 == Static217.anInt4255) {
										if (local6.method7554(Static162.aClass100_7) == null || Static273.anInt5414 != 0 && Static273.anInt5414 != 3 || Static71.aBoolean94 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray550[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray545[local708]) {
											continue;
										}
										local335 -= local6.anInt8801 / 2;
										local708 -= local6.anInt8814 / 2;
										if (Static334.anInt6354 == 4) {
											local747 = (int) Static284.aFloat164 & 0x3FFF;
										} else {
											local747 = (int) Static284.aFloat164 + Static298.anInt6417 & 0x3FFF;
										}
										@Pc(759) int local759 = Class100_Sub1.anIntArray428[local747];
										@Pc(763) int local763 = Class100_Sub1.anIntArray429[local747];
										if (Static334.anInt6354 != 4) {
											local759 = local759 * (Static620.anInt10702 + 256) >> 8;
											local763 = local763 * (Static620.anInt10702 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static334.anInt6354 == 4) {
											local813 = (Static614.anInt10099 >> 9) + (local792 >> 2);
											local821 = (Static559.anInt9491 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() - 1) * 256;
											local813 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 - local830 >> 9) + (local792 >> 2);
											local821 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 - local830 >> 9) - (local802 >> 2);
										}
										if (Static280.aBoolean380 && (Static543.anInt9347 & 0x40) != 0) {
											@Pc(863) Class302 local863 = Static110.method1816(Static30.anInt4466, Static453.anInt8081);
											if (local863 == null) {
												Static633.method8924();
											} else {
												Static542.method7932(Static173.aString38, local813, false, 1L, Static1.anInt8260, true, local6.anInt8877, 6, local821, true, (long) (local6.anInt8834 << 0 | local6.anInt8838), " ->");
											}
											continue;
										}
										if (Static630.aClass271_17 == Static646.aClass271_15) {
											Static542.method7932(Static317.aClass192_27.method5299(Static307.anInt5931), local813, false, 1L, -1, true, -1, 50, local821, true, 0L, "");
										}
										Static542.method7932(Static412.aString55, local813, false, 1L, Static36.anInt716, true, -1, 58, local821, true, 0L, "");
										continue;
									}
									if (local6.anInt8784 == Static233.anInt4693) {
										Static176.aClass302_57 = local6;
										if (local232) {
											Static203.aBoolean291 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method8383() - local17 - local6.anInt8801 / 2) * 2.0D / (double) Static487.aFloat144);
											local708 = (int) -((double) (local45 + local291.method8387() - local22 - local6.anInt8814 / 2) * 2.0D / (double) Static487.aFloat144);
											local469 = Static526.anInt9146 + local335 + Static487.anInt7459;
											local747 = anInt1658 + local708 + Static487.anInt7453;
											@Pc(994) Class6_Sub2_Sub11 local994 = Static639.method8959();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method4680(local469, local747, local999);
											if (local999 != null) {
												if (Static647.aClass251_1.method6712(82) && Static578.anInt6641 > 0) {
													Static372.method7366(local999[0], local999[2], local999[1]);
													continue;
												}
												Static343.aBoolean427 = true;
												Static154.anInt2809 = local999[0];
												Static497.anInt8609 = local999[1];
												Static175.anInt3639 = local999[2];
											}
											Static614.anInt10101 = 1;
											Static129.aBoolean181 = false;
											Static262.anInt5205 = Static429.aClass71_1.method7701();
											Static393.anInt7353 = Static429.aClass71_1.method7702();
											continue;
										}
										if (local276 && Static614.anInt10101 > 0) {
											if (Static614.anInt10101 == 1 && (Static262.anInt5205 != Static429.aClass71_1.method7701() || Static393.anInt7353 != Static429.aClass71_1.method7702())) {
												Static563.anInt9559 = Static526.anInt9146;
												Static175.anInt3640 = anInt1658;
												Static614.anInt10101 = 2;
											}
											if (Static614.anInt10101 == 2) {
												Static129.aBoolean181 = true;
												Static185.method3357(Static563.anInt9559 + (int) ((double) (Static262.anInt5205 - Static429.aClass71_1.method7701()) * 2.0D / (double) Static487.aFloat145));
												Static23.method3612(Static175.anInt3640 - (int) ((double) (Static393.anInt7353 - Static429.aClass71_1.method7702()) * 2.0D / (double) Static487.aFloat145));
											}
											continue;
										}
										if (Static614.anInt10101 > 0 && !Static129.aBoolean181) {
											if ((Static414.anInt7552 == 1 || Static77.method1324()) && Static462.anInt8179 > 2) {
												Static64.method8730(Static262.anInt5205, Static393.anInt7353);
											} else if (Static490.method7377()) {
												Static64.method8730(Static262.anInt5205, Static393.anInt7353);
											}
										}
										Static614.anInt10101 = 0;
										continue;
									}
									if (local6.anInt8784 == Static98.anInt1920) {
										if (local276) {
											Static582.method8190(local6.anInt8814, local40 + Static429.aClass71_1.method7701() - local17, local6.anInt8801, local45 + Static429.aClass71_1.method7702() - local22);
										}
										continue;
									}
									if (local6.anInt8784 == Static301.anInt5872) {
										Static275.method4852(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean594 && local286) {
									local6.aBoolean594 = true;
									if (local6.anObjectArray24 != null) {
										local558 = new Class6_Sub10();
										local558.aBoolean127 = true;
										local558.aClass302_14 = local6;
										local558.anInt1851 = local40 + local291.method8383() - local17;
										local558.anInt1847 = local45 + local291.method8387() - local22;
										local558.anObjectArray1 = local6.anObjectArray24;
										Static218.aClass8_26.method157(local558);
									}
								}
								if (local6.aBoolean594 && local276 && local6.anObjectArray18 != null) {
									local558 = new Class6_Sub10();
									local558.aBoolean127 = true;
									local558.aClass302_14 = local6;
									local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
									local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
									local558.anObjectArray1 = local6.anObjectArray18;
									Static218.aClass8_26.method157(local558);
								}
								if (local6.aBoolean594 && !local276) {
									local6.aBoolean594 = false;
									if (local6.anObjectArray14 != null) {
										local558 = new Class6_Sub10();
										local558.aBoolean127 = true;
										local558.aClass302_14 = local6;
										local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
										local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
										local558.anObjectArray1 = local6.anObjectArray14;
										Static369.aClass8_40.method157(local558);
									}
								}
								if (local276 && local6.anObjectArray3 != null) {
									local558 = new Class6_Sub10();
									local558.aBoolean127 = true;
									local558.aClass302_14 = local6;
									local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
									local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
									local558.anObjectArray1 = local6.anObjectArray3;
									Static218.aClass8_26.method157(local558);
								}
								if (!local6.aBoolean593 && local232) {
									local6.aBoolean593 = true;
									if (local6.anObjectArray27 != null) {
										local558 = new Class6_Sub10();
										local558.aBoolean127 = true;
										local558.aClass302_14 = local6;
										local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
										local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
										local558.anObjectArray1 = local6.anObjectArray27;
										Static218.aClass8_26.method157(local558);
									}
								}
								if (local6.aBoolean593 && local232 && local6.anObjectArray6 != null) {
									local558 = new Class6_Sub10();
									local558.aBoolean127 = true;
									local558.aClass302_14 = local6;
									local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
									local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
									local558.anObjectArray1 = local6.anObjectArray6;
									Static218.aClass8_26.method157(local558);
								}
								if (local6.aBoolean593 && !local232) {
									local6.aBoolean593 = false;
									if (local6.anObjectArray31 != null) {
										local558 = new Class6_Sub10();
										local558.aBoolean127 = true;
										local558.aClass302_14 = local6;
										local558.anInt1851 = local40 + Static429.aClass71_1.method7701() - local17;
										local558.anInt1847 = local45 + Static429.aClass71_1.method7702() - local22;
										local558.anObjectArray1 = local6.anObjectArray31;
										Static369.aClass8_40.method157(local558);
									}
								}
								if (local6.anObjectArray30 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray30;
									Static97.aClass8_10.method157(local558);
								}
								@Pc(1570) Class6_Sub10 local1570;
								if (local6.anObjectArray10 != null && Static188.anInt5447 > local6.anInt8782) {
									if (local6.anIntArray543 == null || Static188.anInt5447 - local6.anInt8782 > 32) {
										local558 = new Class6_Sub10();
										local558.aClass302_14 = local6;
										local558.anObjectArray1 = local6.anObjectArray10;
										Static218.aClass8_26.method157(local558);
									} else {
										label687: for (local335 = local6.anInt8782; local335 < Static188.anInt5447; local335++) {
											local708 = Static610.anIntArray612[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray543.length; local469++) {
												if (local6.anIntArray543[local469] == local708) {
													local1570 = new Class6_Sub10();
													local1570.aClass302_14 = local6;
													local1570.anObjectArray1 = local6.anObjectArray10;
													Static218.aClass8_26.method157(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt8782 = Static188.anInt5447;
								}
								if (local6.anObjectArray21 != null && Static188.anInt5450 > local6.anInt8796) {
									if (local6.anIntArray546 == null || Static188.anInt5450 - local6.anInt8796 > 32) {
										local558 = new Class6_Sub10();
										local558.aClass302_14 = local6;
										local558.anObjectArray1 = local6.anObjectArray21;
										Static218.aClass8_26.method157(local558);
									} else {
										label663: for (local335 = local6.anInt8796; local335 < Static188.anInt5450; local335++) {
											local708 = Static27.anIntArray32[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray546.length; local469++) {
												if (local6.anIntArray546[local469] == local708) {
													local1570 = new Class6_Sub10();
													local1570.aClass302_14 = local6;
													local1570.anObjectArray1 = local6.anObjectArray21;
													Static218.aClass8_26.method157(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt8796 = Static188.anInt5450;
								}
								if (local6.anObjectArray11 != null && Static267.anInt5319 > local6.anInt8847) {
									if (local6.anIntArray551 == null || Static267.anInt5319 - local6.anInt8847 > 32) {
										local558 = new Class6_Sub10();
										local558.aClass302_14 = local6;
										local558.anObjectArray1 = local6.anObjectArray11;
										Static218.aClass8_26.method157(local558);
									} else {
										label639: for (local335 = local6.anInt8847; local335 < Static267.anInt5319; local335++) {
											local708 = Static618.anIntArray614[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray551.length; local469++) {
												if (local6.anIntArray551[local469] == local708) {
													local1570 = new Class6_Sub10();
													local1570.aClass302_14 = local6;
													local1570.anObjectArray1 = local6.anObjectArray11;
													Static218.aClass8_26.method157(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt8847 = Static267.anInt5319;
								}
								if (local6.lb != null && Static145.anInt2727 > local6.anInt8793) {
									if (local6.anIntArray547 == null || Static145.anInt2727 - local6.anInt8793 > 32) {
										local558 = new Class6_Sub10();
										local558.aClass302_14 = local6;
										local558.anObjectArray1 = local6.lb;
										Static218.aClass8_26.method157(local558);
									} else {
										label615: for (local335 = local6.anInt8793; local335 < Static145.anInt2727; local335++) {
											local708 = Static637.anIntArray643[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray547.length; local469++) {
												if (local6.anIntArray547[local469] == local708) {
													local1570 = new Class6_Sub10();
													local1570.aClass302_14 = local6;
													local1570.anObjectArray1 = local6.lb;
													Static218.aClass8_26.method157(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt8793 = Static145.anInt2727;
								}
								if (local6.anObjectArray2 != null && Static207.anInt4101 > local6.anInt8820) {
									if (local6.anIntArray544 == null || Static207.anInt4101 - local6.anInt8820 > 32) {
										local558 = new Class6_Sub10();
										local558.aClass302_14 = local6;
										local558.anObjectArray1 = local6.anObjectArray2;
										Static218.aClass8_26.method157(local558);
									} else {
										label591: for (local335 = local6.anInt8820; local335 < Static207.anInt4101; local335++) {
											local708 = Static524.anIntArray560[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray544.length; local469++) {
												if (local6.anIntArray544[local469] == local708) {
													local1570 = new Class6_Sub10();
													local1570.aClass302_14 = local6;
													local1570.anObjectArray1 = local6.anObjectArray2;
													Static218.aClass8_26.method157(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt8820 = Static207.anInt4101;
								}
								if (Static198.anInt4016 > local6.anInt8870 && local6.anObjectArray5 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray5;
									Static218.aClass8_26.method157(local558);
								}
								if (Static533.anInt9234 > local6.anInt8870 && local6.anObjectArray4 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static218.aClass8_26.method157(local558);
								}
								if (Static328.anInt6239 > local6.anInt8870 && local6.anObjectArray17 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray17;
									Static218.aClass8_26.method157(local558);
								}
								if (Static431.anInt7824 > local6.anInt8870 && local6.anObjectArray23 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray23;
									Static218.aClass8_26.method157(local558);
								}
								if (Static30.anInt4467 > local6.anInt8870 && local6.anObjectArray12 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray12;
									Static218.aClass8_26.method157(local558);
								}
								local6.anInt8870 = Static320.anInt6118;
								if (local6.anObjectArray9 != null) {
									for (local335 = 0; local335 < Static519.anInt9082; local335++) {
										@Pc(2038) Class6_Sub10 local2038 = new Class6_Sub10();
										local2038.aClass302_14 = local6;
										local2038.anInt1850 = Static191.anInterface18Array1[local335].method4141();
										local2038.anInt1849 = Static191.anInterface18Array1[local335].method4142();
										local2038.anObjectArray1 = local6.anObjectArray9;
										Static218.aClass8_26.method157(local2038);
									}
								}
								if (Static146.aBoolean367 && local6.anObjectArray8 != null) {
									local558 = new Class6_Sub10();
									local558.aClass302_14 = local6;
									local558.anObjectArray1 = local6.anObjectArray8;
									Static218.aClass8_26.method157(local558);
								}
							}
							if (local6.anInt8816 == 5 && local6.anInt8807 != -1) {
								local6.method7555(Static22.aClass354_1, Static25.aClass355_1).method6929(Static162.aClass100_7, local6.anInt8814);
							}
							Static536.method7899(local6);
							if (local6.anInt8816 == 0) {
								method1368(arg0, local6.anInt8838, local28, local30, local32, local34, local17 - local6.anInt8787, local22 - local6.anInt8804, arg8, arg9, arg10, arg11);
								if (local6.aClass302Array2 != null) {
									method1368(local6.aClass302Array2, local6.anInt8838, local28, local30, local32, local34, local17 - local6.anInt8787, local22 - local6.anInt8804, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class6_Sub29 local2164 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local6.anInt8838);
								if (local2164 != null) {
									if (Static630.aClass271_17 == Static237.aClass271_11 && local2164.anInt6363 == 0 && !Static71.aBoolean94 && local232 && !Static321.aBoolean412) {
										Static370.method5839();
									}
									Static76.method1322(arg10, local34, local32, local30, local22, local2164.anInt6361, arg9, local28, local17, arg8, arg11);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static536.method7899(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1369() {
		@Pc(1) int local1 = Static530.anInt8592;
		@Pc(3) int[] local3 = Static551.anIntArray576;
		@Pc(11) int local11 = Static643.aBoolean726 ? local1 : local1 + Static252.anInt5066;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local13 - local1])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			}
			if (local23.anInt5564 >= 0) {
				@Pc(43) int local43 = local23.method4913();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10725 & 0x1FF) == 0 && (local23.anInt10729 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10725 & 0x1FF) == 256 && (local23.anInt10729 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10724 = Static138.method2248(local23.anInt10725, local23.aByte131, local23.anInt10729);
				Static152.method4562(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	public static void method1370(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static487.aClass6_Sub2_Sub11_2 != null) {
			Static205.anInt4092 = Static487.aClass6_Sub2_Sub11_2.anInt5230;
		} else {
			Static205.anInt4092 = -1;
		}
		Static176.aClass302_57 = null;
		Static433.anInt7858 = 0;
		Static485.aClass8_56 = null;
		Static487.aClass6_Sub2_Sub11_2 = null;
		Static487.method6422();
		Static487.aClass8_51.method154();
		Static501.aClass276_6 = null;
		Static384.aClass276_4 = null;
		Static160.aClass276_2 = null;
		Static497.anInt8613 = -1;
		Static408.aClass276_5 = null;
		Static112.aClass276_1 = null;
		Static574.aClass276_8 = null;
		Static164.aClass32_7 = null;
		Static414.anInt7551 = -1;
		Static487.aClass356_3 = null;
		Static293.aClass276_3 = null;
		Static525.aClass276_7 = null;
		if (Static487.aClass337_4 != null) {
			Static487.aClass337_4.method8115();
			Static487.aClass337_4.method8118(128, 64);
		}
		if (Static487.aClass304_2 != null) {
			Static487.aClass304_2.method7760(64, 64);
		}
		if (Static487.aClass210_4 != null) {
			Static487.aClass210_4.method5638(64);
		}
		Static230.aClass233_3.method6392(64);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
	public static int method1372(@OriginalArg(1) int arg0) {
		@Pc(22) byte local22;
		if (arg0 > 12000) {
			Static308.method5205();
			local22 = 4;
		} else if (arg0 > 5000) {
			Static600.method8452();
			local22 = 3;
		} else if (arg0 <= 2000) {
			Static488.method8558();
			local22 = 1;
		} else {
			local22 = 2;
			Static112.method1848();
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 2) {
			Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
			Static278.method4875(2, false);
		}
		Static289.method5031();
		return local22;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1373() {
		Static233.anInt4696 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static252.anInt5066; local3++) {
			@Pc(14) Class20_Sub2_Sub2_Sub1_Sub2 local14 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local3])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (local14.aBoolean377 && local14.method4917() != -1) {
				@Pc(32) int local32 = (local14.method4913() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10725 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10729 - local32 >> 9;
				@Pc(53) Class20_Sub2_Sub2_Sub1 local53 = Static10.method208(local14.aByte131, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5567;
					if (local53 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt5524 == 0 && local53.method4917() != -1) {
						Static146.anIntArray320[Static233.anInt4696] = local58;
						Static36.anIntArray42[Static233.anInt4696] = local58;
						Static233.anInt4696++;
						local53.anInt5524++;
					}
					Static146.anIntArray320[Static233.anInt4696] = local58;
					Static36.anIntArray42[Static233.anInt4696] = local14.anInt5567 + 2048;
					Static233.anInt4696++;
					local53.anInt5524++;
				}
			}
		}
		Static442.method6836(Static233.anInt4696 - 1, 0, Static36.anIntArray42, Static146.anIntArray320);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1376() {
		for (@Pc(1) int local1 = 0; local1 < Static442.anInt7975; local1++) {
			@Pc(6) int[] local6 = Static394.anIntArrayArray30[local1];
			for (@Pc(8) int local8 = 0; local8 < Static284.anInt7916; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sca;II)I")
	public static int method1379(@OriginalArg(0) Class302 arg0, @OriginalArg(2) int arg1) {
		if (!method1364(arg0).method8148(arg1) && arg0.anObjectArray15 == null) {
			return -1;
		} else if (arg0.anIntArray552 == null || arg0.anIntArray552.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray552[arg1];
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	public static void method1380(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static530.anInt8592;
		@Pc(3) int[] local3 = Static551.anIntArray576;
		@Pc(11) int local11 = Static643.aBoolean726 ? local1 : local1 + Static252.anInt5066;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local13 - local1])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			}
			if (local23.aByte131 == arg0) {
				local23.anInt5524 = 0;
				if (local23.anInt5564 < 0) {
					local23.aBoolean377 = false;
				} else {
					@Pc(54) int local54 = local23.method4913();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10725 & 0x1FF) != 0 || (local23.anInt10729 & 0x1FF) != 0) {
							local23.aBoolean377 = false;
							continue;
						}
					} else if ((local23.anInt10725 & 0x1FF) != 256 || (local23.anInt10729 & 0x1FF) != 256) {
						local23.aBoolean377 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10725 >> 9;
						local101 = local23.anInt10729 >> 9;
						if (local23.anInt5564 != Static394.anIntArrayArray30[local96][local101]) {
							local23.aBoolean377 = true;
							continue;
						}
						if (Static7.anIntArrayArray1[local96][local101] > 1) {
							local126 = Static7.anIntArrayArray1[local96][local101]--;
							local23.aBoolean377 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10725 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10729 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10725 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10729 + local96 >> 9;
						if (!Static343.method5559(local101, local162, local23.anInt5564, local169, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5564 == Static394.anIntArrayArray30[local180][local183]) {
										local126 = Static7.anIntArrayArray1[local180][local183]--;
									}
								}
							}
							local23.aBoolean377 = true;
							continue;
						}
					}
					local23.aBoolean377 = false;
					local23.anInt10724 = Static138.method2248(local23.anInt10725, local23.aByte131, local23.anInt10729);
					Static152.method4562(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1381() {
		@Pc(1) int local1 = Static530.anInt8592;
		@Pc(3) int[] local3 = Static551.anIntArray576;
		@Pc(8) int local8 = Static348.aClass6_Sub22_19.aClass15_Sub21_1.method6488();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class20_Sub2_Sub2_Sub1_Sub1 local32 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local3[local25]];
			if (!local32.method1029()) {
				local32.anInt5564 = -1;
			} else if (local32.aBoolean77) {
				local32.anInt5564 = -1;
			} else {
				local32.method9025();
				if (local32.aShort124 >= 0 && local32.aShort123 >= 0 && local32.aShort125 < Static442.anInt7975 && local32.aShort122 < Static284.anInt7916) {
					local32.aBoolean75 = local32.aBoolean375 ? local23 : false;
					if (local32 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1) {
						local32.anInt5564 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean377) {
							local85++;
						}
						if (local32.anInt5493 > Static113.anInt2243) {
							local85 += 2;
						}
						local85 += 5 - local32.method4913() << 2;
						if (local32.aBoolean74) {
							local85 += 512;
						} else {
							if (Static101.anInt1980 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt5564 = local85 + 1;
					}
				} else {
					local32.anInt5564 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static252.anInt5066; local126++) {
			@Pc(137) Class20_Sub2_Sub2_Sub1_Sub2 local137 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local126])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (local137.method4929() && local137.aClass247_1.method6602(Static279.aClass294_1)) {
				local137.method9025();
				if (local137.aShort124 >= 0 && local137.aShort123 >= 0 && local137.aShort125 < Static442.anInt7975 && local137.aShort122 < Static284.anInt7916) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean377) {
						local174++;
					}
					if (local137.anInt5493 > Static113.anInt2243) {
						local174 += 2;
					}
					local174 += 5 - local137.method4913() << 2;
					if (Static101.anInt1980 == 0) {
						if (local137.aClass247_1.aBoolean516) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static101.anInt1980 == 1) {
						if (local137.aClass247_1.aBoolean516) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass247_1.aBoolean511) {
						local174 += 1024;
					} else if (!local137.aClass247_1.aBoolean514) {
						local174 += 256;
					}
					local137.anInt5564 = local174 + 1;
				} else {
					local137.anInt5564 = -1;
				}
			} else {
				local137.anInt5564 = -1;
			}
		}
		for (local85 = 0; local85 < Static325.aClass19Array1.length; local85++) {
			@Pc(240) Class19 local240 = Static325.aClass19Array1[local85];
			if (local240 != null) {
				if (local240.anInt332 == 1) {
					@Pc(254) Class6_Sub46 local254 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local240.anInt331);
					if (local254 != null) {
						@Pc(259) Class20_Sub2_Sub2_Sub1_Sub2 local259 = local254.aClass20_Sub2_Sub2_Sub1_Sub2_1;
						if (local259.anInt5564 >= 0) {
							local259.anInt5564 += 2048;
						}
					}
				} else if (local240.anInt332 == 10) {
					@Pc(278) Class20_Sub2_Sub2_Sub1_Sub1 local278 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local240.anInt331];
					if (local278 != null && local278 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 && local278.anInt5564 >= 0) {
						local278.anInt5564 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	public static void method1382(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static530.anInt8592;
		@Pc(3) int[] local3 = Static551.anIntArray576;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static252.anInt5066; local5++) {
			@Pc(15) Class20_Sub2_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local5 - local1])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			}
			if (local15.aByte131 == arg0 && local15.anInt5564 >= 0) {
				@Pc(39) int local39 = local15.method4913();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10725 & 0x1FF) != 0 || (local15.anInt10729 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10725 & 0x1FF) != 256 || (local15.anInt10729 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10725 >> 9;
					local80 = local15.anInt10729 >> 9;
					if (local15.anInt5564 > Static394.anIntArrayArray30[local75][local80]) {
						Static394.anIntArrayArray30[local75][local80] = local15.anInt5564;
						Static7.anIntArrayArray1[local75][local80] = 1;
					} else if (local15.anInt5564 == Static394.anIntArrayArray30[local75][local80]) {
						local116 = Static7.anIntArrayArray1[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10725 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10729 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10725 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10729 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5564 > Static394.anIntArrayArray30[local158][local161]) {
								Static394.anIntArrayArray30[local158][local161] = local15.anInt5564;
								Static7.anIntArrayArray1[local158][local161] = 1;
							} else if (local15.anInt5564 == Static394.anIntArrayArray30[local158][local161]) {
								local116 = Static7.anIntArrayArray1[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
