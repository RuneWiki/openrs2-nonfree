import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[Lclient!rj;")
	public static Class296[] aClass296Array1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tp;)Lclient!tp;")
	public static Class331 method1920(@OriginalArg(0) Class331 arg0) {
		@Pc(4) int local4 = method1921(arg0).method5216();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static178.method3435(arg0.anInt9509);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tp;)Lclient!lo;")
	public static Class8_Sub34 method1921(@OriginalArg(0) Class331 arg0) {
		@Pc(13) Class8_Sub34 local13 = (Class8_Sub34) Static136.aClass253_11.method6594(((long) arg0.anInt9578 << 32) + (long) arg0.anInt9535);
		return local13 == null ? arg0.aClass8_Sub34_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tp;IIIIIIIIIII)V")
	public static void method1925(@OriginalArg(0) Class331[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class331 local6 = arg0[local1];
			if (local6 != null && local6.anInt9509 == arg1) {
				@Pc(17) int local17 = local6.anInt9528 + arg6;
				@Pc(22) int local22 = local6.anInt9541 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt9490 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt9553;
					local45 = local22 + local6.anInt9505;
					if (local6.anInt9490 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9490 == 0 || local6.aBoolean673 || method1921(local6).anInt6421 != 0 || local6 == Static514.aClass331_15 || local6.anInt9556 == Static418.anInt7918 || local6.anInt9556 == Static466.anInt8484) {
					if (!method1927(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static513.aBoolean642) {
							local40 = Static550.method8313();
							local45 = Static530.method7484();
						}
						if (local6 == Static10.aClass331_3 && Static632.method8494(Static10.aClass331_3) != null) {
							Static228.aBoolean388 = true;
							Static75.anInt2305 = local17;
							Static266.anInt5681 = local22;
						}
						if (local6.aBoolean671 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean680 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class8_Sub40 local168 = (Class8_Sub40) Static203.aClass43_28.method1422(); local168 != null; local168 = (Class8_Sub40) Static203.aClass43_28.method1426()) {
									if (local168.aBoolean565) {
										local168.method8640();
										local168.aClass331_14.aBoolean682 = false;
									}
								}
								if (Static432.anInt8162 == 0) {
									Static10.aClass331_3 = null;
									Static514.aClass331_15 = null;
								}
								Static88.anInt2513 = 0;
								Static342.aBoolean462 = false;
								Static201.aBoolean337 = false;
								if (!Static211.aBoolean370) {
									Static16.method768();
								}
							}
							@Pc(232) boolean local232;
							if (Static288.aClass35_6.method5764() + local40 >= local28 && Static288.aClass35_6.method5761() + local45 >= local30 && Static288.aClass35_6.method5764() + local40 < local32 && Static288.aClass35_6.method5761() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static147.aBoolean270 && local232) {
								if (local6.anInt9514 >= 0) {
									Static341.anInt6662 = local6.anInt9514;
								} else if (local6.aBoolean680) {
									Static341.anInt6662 = -1;
								}
							}
							if (!Static211.aBoolean370 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static572.method7939(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static288.aClass35_6.method5769() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class8_Sub33 local291 = (Class8_Sub33) Static188.aClass43_24.method1422();
							if (local291 != null && local291.method7204() == 0 && local291.method7202() + local40 >= local28 && local291.method7207() + local45 >= local30 && local291.method7202() + local40 < local32 && local291.method7207() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray86 != null && !Static360.method5661()) {
								for (local335 = 0; local335 < local6.aByteArray86.length; local335++) {
									if (Static295.aClass209_1.method5482(local6.aByteArray86[local335])) {
										if (local6.anIntArray523 == null || Static435.anInt8192 >= local6.anIntArray523[local335]) {
											@Pc(367) byte local367 = local6.aByteArray87[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static295.aClass209_1.method5482(86) && !Static295.aClass209_1.method5482(82) && !Static295.aClass209_1.method5482(81)) && ((local367 & 0x2) == 0 || Static295.aClass209_1.method5482(86)) && ((local367 & 0x1) == 0 || Static295.aClass209_1.method5482(82)) && ((local367 & 0x4) == 0 || Static295.aClass209_1.method5482(81))) {
												if (local335 < 10) {
													Static267.method4636(local6.anInt9578, local335 + 1, "", -1);
												} else if (local335 == 10) {
													Static8.method91();
													@Pc(438) Class8_Sub34 local438 = method1921(local6);
													Static471.method7031(local6, local438.anInt6429, local438.method5219());
													Static598.aString17 = Static408.method6463(local6);
													if (Static598.aString17 == null) {
														Static598.aString17 = "Null";
													}
													Static4.aString2 = local6.aString101 + "<col=ffffff>";
												}
												local469 = local6.anIntArray524[local335];
												if (local6.anIntArray523 == null) {
													local6.anIntArray523 = new int[local6.aByteArray86.length];
												}
												if (local469 == 0) {
													local6.anIntArray523[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray523[local335] = Static435.anInt8192 + local469;
												}
											}
										}
									} else if (local6.anIntArray523 != null) {
										local6.anIntArray523[local335] = 0;
									}
								}
							}
							if (local286) {
								Static282.method4764(local45 + local291.method7207() - local22, local6, local40 + local291.method7202() - local17);
							}
							if (Static10.aClass331_3 != null && Static10.aClass331_3 != local6 && local232 && method1921(local6).method5217()) {
								Static367.aClass331_11 = local6;
							}
							if (local6 == Static514.aClass331_15) {
								Static205.aBoolean341 = true;
								Static256.anInt3672 = local17;
								Static258.anInt5551 = local22;
							}
							if (local6.aBoolean673 || local6.anInt9556 != 0) {
								@Pc(558) Class8_Sub40 local558;
								if (local232 && Static92.anInt2553 != 0 && local6.anObjectArray22 != null) {
									local558 = new Class8_Sub40();
									local558.aBoolean565 = true;
									local558.aClass331_14 = local6;
									local558.anInt7837 = Static92.anInt2553;
									local558.anObjectArray2 = local6.anObjectArray22;
									Static203.aClass43_28.method1424(local558);
								}
								if (Static10.aClass331_3 != null || Static211.aBoolean370 || local6.anInt9556 != Static136.anInt3569 && Static88.anInt2513 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt9556 != 0) {
									if (local6.anInt9556 == Static615.anInt10350 || local6.anInt9556 == Static114.anInt2982) {
										Static224.aClass331_7 = local6;
										if (Static328.aClass203_5 != null) {
											Static328.aClass203_5.method5424(local6.anInt9505, Static171.aClass16_5);
										}
										if (local6.anInt9556 == Static615.anInt10350) {
											if (Static211.aBoolean370 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static406.method6448(arg8, arg9, Static171.aClass16_5);
											@Pc(641) Class15_Sub3 local641 = (Class15_Sub3) Static627.aClass123_11.method3537();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt3364 && arg10 < local641.anInt3365 && arg11 >= local641.anInt3362 && arg11 < local641.anInt3363) {
													Static16.method768();
													Static189.method3590(local641.aClass15_Sub1_Sub2_Sub2_1);
												}
												local641 = (Class15_Sub3) Static627.aClass123_11.method3541();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt9556 == Static418.anInt7918) {
										if (local6.method7750(Static171.aClass16_5) == null || Static266.anInt5673 != 0 && Static266.anInt5673 != 3 || Static211.aBoolean370 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray519[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray525[local708]) {
											continue;
										}
										local335 -= local6.anInt9553 / 2;
										local708 -= local6.anInt9505 / 2;
										if (Static427.anInt8005 == 4) {
											local747 = (int) Static499.aFloat185 & 0x3FFF;
										} else {
											local747 = (int) Static499.aFloat185 + Static642.anInt10689 & 0x3FFF;
										}
										@Pc(759) int local759 = Class344.anIntArray579[local747];
										@Pc(763) int local763 = Class344.anIntArray578[local747];
										if (Static427.anInt8005 != 4) {
											local759 = local759 * (Static423.anInt7961 + 256) >> 8;
											local763 = local763 * (Static423.anInt7961 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static427.anInt8005 == 4) {
											local813 = (Static4.anInt24 >> 9) + (local792 >> 2);
											local821 = (Static93.anInt2585 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() - 1) * 256;
											local813 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 - local830 >> 9) + (local792 >> 2);
											local821 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 - local830 >> 9) - (local802 >> 2);
										}
										if (Static147.aBoolean270 && (Static328.anInt9771 & 0x40) != 0) {
											@Pc(863) Class331 local863 = Static201.method3722(Static401.anInt7697, Static391.anInt7576);
											if (local863 == null) {
												Static8.method91();
											} else {
												Static192.method3629((long) (local6.anInt9535 << 0 | local6.anInt9578), true, local6.anInt9570, false, 1L, 6, Static598.aString17, local821, local813, true, Static500.anInt8805, " ->");
											}
											continue;
										}
										if (Static18.aClass217_1 == Static281.aClass217_4) {
											Static192.method3629(0L, true, -1, false, 1L, 22, Static121.aClass84_27.method2710(Static372.anInt7083), local821, local813, true, -1, "");
										}
										Static192.method3629(0L, true, -1, false, 1L, 15, Static289.aString69, local821, local813, true, Static140.anInt3588, "");
										continue;
									}
									if (local6.anInt9556 == Static136.anInt3569) {
										Static261.aClass331_8 = local6;
										if (local232) {
											Static342.aBoolean462 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7202() - local17 - local6.anInt9553 / 2) * 2.0D / (double) Static110.aFloat176);
											local708 = (int) -((double) (local45 + local291.method7207() - local22 - local6.anInt9505 / 2) * 2.0D / (double) Static110.aFloat176);
											local469 = Static227.anInt5187 + local335 + Static110.anInt7708;
											local747 = Static561.anInt9691 + local708 + Static110.anInt7703;
											@Pc(994) Class8_Sub5_Sub4 local994 = Static329.method5389();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method2127(local747, local999, local469);
											if (local999 != null) {
												if (Static295.aClass209_1.method5482(82) && Static190.anInt7431 > 0) {
													Static165.method3305(local999[2], local999[1], local999[0]);
													continue;
												}
												Static201.aBoolean337 = true;
												Static262.anInt5627 = local999[0];
												Static500.anInt8807 = local999[1];
												Static204.anInt4698 = local999[2];
											}
											Static88.anInt2513 = 1;
											Static338.aBoolean461 = false;
											Static39.anInt1469 = Static288.aClass35_6.method5764();
											Static632.anInt10539 = Static288.aClass35_6.method5761();
											continue;
										}
										if (local276 && Static88.anInt2513 > 0) {
											if (Static88.anInt2513 == 1 && (Static39.anInt1469 != Static288.aClass35_6.method5764() || Static632.anInt10539 != Static288.aClass35_6.method5761())) {
												Static391.anInt7575 = Static227.anInt5187;
												Static213.anInt4967 = Static561.anInt9691;
												Static88.anInt2513 = 2;
											}
											if (Static88.anInt2513 == 2) {
												Static338.aBoolean461 = true;
												Static63.method1691(Static391.anInt7575 + (int) ((double) (Static39.anInt1469 - Static288.aClass35_6.method5764()) * 2.0D / (double) Static110.aFloat177));
												Static52.method1577(Static213.anInt4967 - (int) ((double) (Static632.anInt10539 - Static288.aClass35_6.method5761()) * 2.0D / (double) Static110.aFloat177));
											}
											continue;
										}
										if (Static88.anInt2513 > 0 && !Static338.aBoolean461) {
											if ((Static580.anInt5357 == 1 || Static596.method8230()) && Static548.anInt9471 > 2) {
												Static194.method3643(Static632.anInt10539, Static39.anInt1469);
											} else if (Static507.method7335()) {
												Static194.method3643(Static632.anInt10539, Static39.anInt1469);
											}
										}
										Static88.anInt2513 = 0;
										continue;
									}
									if (local6.anInt9556 == Static146.anInt3694) {
										if (local276) {
											Static480.method7074(local40 + Static288.aClass35_6.method5764() - local17, local6.anInt9505, local45 + Static288.aClass35_6.method5761() - local22, local6.anInt9553);
										}
										continue;
									}
									if (local6.anInt9556 == Static466.anInt8484) {
										Static570.method7927(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean686 && local286) {
									local6.aBoolean686 = true;
									if (local6.anObjectArray6 != null) {
										local558 = new Class8_Sub40();
										local558.aBoolean565 = true;
										local558.aClass331_14 = local6;
										local558.anInt7833 = local40 + local291.method7202() - local17;
										local558.anInt7837 = local45 + local291.method7207() - local22;
										local558.anObjectArray2 = local6.anObjectArray6;
										Static203.aClass43_28.method1424(local558);
									}
								}
								if (local6.aBoolean686 && local276 && local6.anObjectArray3 != null) {
									local558 = new Class8_Sub40();
									local558.aBoolean565 = true;
									local558.aClass331_14 = local6;
									local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
									local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
									local558.anObjectArray2 = local6.anObjectArray3;
									Static203.aClass43_28.method1424(local558);
								}
								if (local6.aBoolean686 && !local276) {
									local6.aBoolean686 = false;
									if (local6.anObjectArray14 != null) {
										local558 = new Class8_Sub40();
										local558.aBoolean565 = true;
										local558.aClass331_14 = local6;
										local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
										local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
										local558.anObjectArray2 = local6.anObjectArray14;
										Static471.aClass43_55.method1424(local558);
									}
								}
								if (local276 && local6.anObjectArray29 != null) {
									local558 = new Class8_Sub40();
									local558.aBoolean565 = true;
									local558.aClass331_14 = local6;
									local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
									local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
									local558.anObjectArray2 = local6.anObjectArray29;
									Static203.aClass43_28.method1424(local558);
								}
								if (!local6.aBoolean682 && local232) {
									local6.aBoolean682 = true;
									if (local6.anObjectArray11 != null) {
										local558 = new Class8_Sub40();
										local558.aBoolean565 = true;
										local558.aClass331_14 = local6;
										local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
										local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
										local558.anObjectArray2 = local6.anObjectArray11;
										Static203.aClass43_28.method1424(local558);
									}
								}
								if (local6.aBoolean682 && local232 && local6.anObjectArray9 != null) {
									local558 = new Class8_Sub40();
									local558.aBoolean565 = true;
									local558.aClass331_14 = local6;
									local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
									local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
									local558.anObjectArray2 = local6.anObjectArray9;
									Static203.aClass43_28.method1424(local558);
								}
								if (local6.aBoolean682 && !local232) {
									local6.aBoolean682 = false;
									if (local6.anObjectArray24 != null) {
										local558 = new Class8_Sub40();
										local558.aBoolean565 = true;
										local558.aClass331_14 = local6;
										local558.anInt7833 = local40 + Static288.aClass35_6.method5764() - local17;
										local558.anInt7837 = local45 + Static288.aClass35_6.method5761() - local22;
										local558.anObjectArray2 = local6.anObjectArray24;
										Static471.aClass43_55.method1424(local558);
									}
								}
								if (local6.anObjectArray30 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray30;
									Static148.aClass43_34.method1424(local558);
								}
								@Pc(1570) Class8_Sub40 local1570;
								if (local6.anObjectArray16 != null && Static90.anInt2540 > local6.anInt9507) {
									if (local6.anIntArray527 == null || Static90.anInt2540 - local6.anInt9507 > 32) {
										local558 = new Class8_Sub40();
										local558.aClass331_14 = local6;
										local558.anObjectArray2 = local6.anObjectArray16;
										Static203.aClass43_28.method1424(local558);
									} else {
										label687: for (local335 = local6.anInt9507; local335 < Static90.anInt2540; local335++) {
											local708 = Static160.anIntArray213[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray527.length; local469++) {
												if (local6.anIntArray527[local469] == local708) {
													local1570 = new Class8_Sub40();
													local1570.aClass331_14 = local6;
													local1570.anObjectArray2 = local6.anObjectArray16;
													Static203.aClass43_28.method1424(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt9507 = Static90.anInt2540;
								}
								if (local6.anObjectArray23 != null && Static32.anInt1304 > local6.anInt9574) {
									if (local6.anIntArray520 == null || Static32.anInt1304 - local6.anInt9574 > 32) {
										local558 = new Class8_Sub40();
										local558.aClass331_14 = local6;
										local558.anObjectArray2 = local6.anObjectArray23;
										Static203.aClass43_28.method1424(local558);
									} else {
										label663: for (local335 = local6.anInt9574; local335 < Static32.anInt1304; local335++) {
											local708 = Static504.anIntArray496[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray520.length; local469++) {
												if (local6.anIntArray520[local469] == local708) {
													local1570 = new Class8_Sub40();
													local1570.aClass331_14 = local6;
													local1570.anObjectArray2 = local6.anObjectArray23;
													Static203.aClass43_28.method1424(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt9574 = Static32.anInt1304;
								}
								if (local6.anObjectArray21 != null && Static240.anInt5377 > local6.anInt9537) {
									if (local6.anIntArray526 == null || Static240.anInt5377 - local6.anInt9537 > 32) {
										local558 = new Class8_Sub40();
										local558.aClass331_14 = local6;
										local558.anObjectArray2 = local6.anObjectArray21;
										Static203.aClass43_28.method1424(local558);
									} else {
										label639: for (local335 = local6.anInt9537; local335 < Static240.anInt5377; local335++) {
											local708 = Static15.anIntArray15[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray526.length; local469++) {
												if (local6.anIntArray526[local469] == local708) {
													local1570 = new Class8_Sub40();
													local1570.aClass331_14 = local6;
													local1570.anObjectArray2 = local6.anObjectArray21;
													Static203.aClass43_28.method1424(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt9537 = Static240.anInt5377;
								}
								if (local6.anObjectArray13 != null && Static533.anInt9188 > local6.anInt9565) {
									if (local6.anIntArray522 == null || Static533.anInt9188 - local6.anInt9565 > 32) {
										local558 = new Class8_Sub40();
										local558.aClass331_14 = local6;
										local558.anObjectArray2 = local6.anObjectArray13;
										Static203.aClass43_28.method1424(local558);
									} else {
										label615: for (local335 = local6.anInt9565; local335 < Static533.anInt9188; local335++) {
											local708 = Static2.anIntArray288[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray522.length; local469++) {
												if (local6.anIntArray522[local469] == local708) {
													local1570 = new Class8_Sub40();
													local1570.aClass331_14 = local6;
													local1570.anObjectArray2 = local6.anObjectArray13;
													Static203.aClass43_28.method1424(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt9565 = Static533.anInt9188;
								}
								if (local6.anObjectArray28 != null && Static299.anInt5987 > local6.anInt9499) {
									if (local6.anIntArray528 == null || Static299.anInt5987 - local6.anInt9499 > 32) {
										local558 = new Class8_Sub40();
										local558.aClass331_14 = local6;
										local558.anObjectArray2 = local6.anObjectArray28;
										Static203.aClass43_28.method1424(local558);
									} else {
										label591: for (local335 = local6.anInt9499; local335 < Static299.anInt5987; local335++) {
											local708 = Static464.anIntArray453[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray528.length; local469++) {
												if (local6.anIntArray528[local469] == local708) {
													local1570 = new Class8_Sub40();
													local1570.aClass331_14 = local6;
													local1570.anObjectArray2 = local6.anObjectArray28;
													Static203.aClass43_28.method1424(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt9499 = Static299.anInt5987;
								}
								if (Static383.anInt7458 > local6.anInt9534 && local6.anObjectArray19 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray19;
									Static203.aClass43_28.method1424(local558);
								}
								if (Static198.anInt4606 > local6.anInt9534 && local6.anObjectArray12 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray12;
									Static203.aClass43_28.method1424(local558);
								}
								if (Static173.anInt4160 > local6.anInt9534 && local6.anObjectArray25 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray25;
									Static203.aClass43_28.method1424(local558);
								}
								if (Static297.anInt5985 > local6.anInt9534 && local6.anObjectArray26 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray26;
									Static203.aClass43_28.method1424(local558);
								}
								if (Static409.anInt7812 > local6.anInt9534 && local6.anObjectArray32 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray32;
									Static203.aClass43_28.method1424(local558);
								}
								local6.anInt9534 = Static75.anInt2309;
								if (local6.anObjectArray5 != null) {
									for (local335 = 0; local335 < Static122.anInt3320; local335++) {
										@Pc(2038) Class8_Sub40 local2038 = new Class8_Sub40();
										local2038.aClass331_14 = local6;
										local2038.anInt7832 = Static547.anInterface21Array2[local335].method3240();
										local2038.anInt7831 = Static547.anInterface21Array2[local335].method3239();
										local2038.anObjectArray2 = local6.anObjectArray5;
										Static203.aClass43_28.method1424(local2038);
									}
								}
								if (Static16.aBoolean77 && local6.anObjectArray27 != null) {
									local558 = new Class8_Sub40();
									local558.aClass331_14 = local6;
									local558.anObjectArray2 = local6.anObjectArray27;
									Static203.aClass43_28.method1424(local558);
								}
							}
							if (local6.anInt9490 == 5 && local6.anInt9529 != -1) {
								local6.method7745(Static527.aClass321_1, Static274.aClass270_1).method5424(local6.anInt9505, Static171.aClass16_5);
							}
							Static302.method4922(local6);
							if (local6.anInt9490 == 0) {
								method1925(arg0, local6.anInt9578, local28, local30, local32, local34, local17 - local6.anInt9501, local22 - local6.anInt9503, arg8, arg9, arg10, arg11);
								if (local6.aClass331Array2 != null) {
									method1925(local6.aClass331Array2, local6.anInt9578, local28, local30, local32, local34, local17 - local6.anInt9501, local22 - local6.anInt9503, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class8_Sub51 local2164 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local6.anInt9578);
								if (local2164 != null) {
									if (Static18.aClass217_1 == Static207.aClass217_3 && local2164.anInt10453 == 0 && !Static211.aBoolean370 && local232 && !Static54.aBoolean127) {
										Static16.method768();
									}
									Static289.method4831(local2164.anInt10454, local34, local22, local30, local28, local17, arg10, local32, arg9, arg8, arg11);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static302.method4922(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1926(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static315.anInt9128;
		@Pc(3) int[] local3 = Static533.anIntArray506;
		@Pc(11) int local11 = Static586.aBoolean712 ? local1 : local1 + Static59.anInt1906;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub1_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local13 - local1])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local23.aByte124 == arg0) {
				local23.anInt8067 = 0;
				if (local23.anInt8086 < 0) {
					local23.aBoolean583 = false;
				} else {
					@Pc(54) int local54 = local23.method6692();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10301 & 0x1FF) != 0 || (local23.anInt10298 & 0x1FF) != 0) {
							local23.aBoolean583 = false;
							continue;
						}
					} else if ((local23.anInt10301 & 0x1FF) != 256 || (local23.anInt10298 & 0x1FF) != 256) {
						local23.aBoolean583 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10301 >> 9;
						local101 = local23.anInt10298 >> 9;
						if (local23.anInt8086 != Static391.anIntArrayArray41[local96][local101]) {
							local23.aBoolean583 = true;
							continue;
						}
						if (Static194.anIntArrayArray25[local96][local101] > 1) {
							local126 = Static194.anIntArrayArray25[local96][local101]--;
							local23.aBoolean583 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10301 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10298 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10301 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10298 + local96 >> 9;
						if (!Static43.method1351(local155, local23.anInt8086, local162, local101, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8086 == Static391.anIntArrayArray41[local180][local183]) {
										local126 = Static194.anIntArrayArray25[local180][local183]--;
									}
								}
							}
							local23.aBoolean583 = true;
							continue;
						}
					}
					local23.aBoolean583 = false;
					local23.anInt10297 = Static177.method3098(local23.anInt10298, local23.anInt10301, local23.aByte124);
					Static333.method5408(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tp;)Z")
	public static boolean method1927(@OriginalArg(0) Class331 arg0) {
		if (Static54.aBoolean127) {
			if (method1921(arg0).anInt6421 != 0) {
				return false;
			}
			if (arg0.anInt9490 == 0) {
				return false;
			}
		}
		return arg0.aBoolean681;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1930(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static315.anInt9128;
		@Pc(3) int[] local3 = Static533.anIntArray506;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static59.anInt1906; local5++) {
			@Pc(15) Class15_Sub1_Sub2_Sub2 local15;
			if (local5 < local1) {
				local15 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local5 - local1])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local15.aByte124 == arg0 && local15.anInt8086 >= 0) {
				@Pc(39) int local39 = local15.method6692();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10301 & 0x1FF) != 0 || (local15.anInt10298 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10301 & 0x1FF) != 256 || (local15.anInt10298 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10301 >> 9;
					local80 = local15.anInt10298 >> 9;
					if (local15.anInt8086 > Static391.anIntArrayArray41[local75][local80]) {
						Static391.anIntArrayArray41[local75][local80] = local15.anInt8086;
						Static194.anIntArrayArray25[local75][local80] = 1;
					} else if (local15.anInt8086 == Static391.anIntArrayArray41[local75][local80]) {
						local116 = Static194.anIntArrayArray25[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10301 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10298 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10301 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10298 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8086 > Static391.anIntArrayArray41[local158][local161]) {
								Static391.anIntArrayArray41[local158][local161] = local15.anInt8086;
								Static194.anIntArrayArray25[local158][local161] = 1;
							} else if (local15.anInt8086 == Static391.anIntArrayArray41[local158][local161]) {
								local116 = Static194.anIntArrayArray25[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1931() {
		@Pc(1) int local1 = Static315.anInt9128;
		@Pc(3) int[] local3 = Static533.anIntArray506;
		@Pc(8) int local8 = Static155.aClass8_Sub25_6.aClass36_Sub16_1.method5358();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class15_Sub1_Sub2_Sub2_Sub1 local32 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local3[local25]];
			if (!local32.method2766()) {
				local32.anInt8086 = -1;
			} else if (local32.aBoolean251) {
				local32.anInt8086 = -1;
			} else {
				local32.method7558();
				if (local32.aShort105 >= 0 && local32.aShort103 >= 0 && local32.aShort104 < Static372.anInt7082 && local32.aShort106 < Static218.anInt5023) {
					local32.aBoolean252 = local32.aBoolean585 ? local23 : false;
					if (local32 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2) {
						local32.anInt8086 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean583) {
							local85++;
						}
						if (local32.anInt8136 > Static435.anInt8192) {
							local85 += 2;
						}
						local85 += 5 - local32.method6692() << 2;
						if (local32.aBoolean249) {
							local85 += 512;
						} else {
							if (Static214.anInt4980 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt8086 = local85 + 1;
					}
				} else {
					local32.anInt8086 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static59.anInt1906; local126++) {
			@Pc(137) Class15_Sub1_Sub2_Sub2_Sub2 local137 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local126])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (local137.method6703() && local137.aClass300_1.method7311(Static420.aClass77_1)) {
				local137.method7558();
				if (local137.aShort105 >= 0 && local137.aShort103 >= 0 && local137.aShort104 < Static372.anInt7082 && local137.aShort106 < Static218.anInt5023) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean583) {
						local174++;
					}
					if (local137.anInt8136 > Static435.anInt8192) {
						local174 += 2;
					}
					local174 += 5 - local137.method6692() << 2;
					if (Static214.anInt4980 == 0) {
						if (local137.aClass300_1.aBoolean628) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static214.anInt4980 == 1) {
						if (local137.aClass300_1.aBoolean628) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass300_1.aBoolean633) {
						local174 += 1024;
					} else if (!local137.aClass300_1.aBoolean631) {
						local174 += 256;
					}
					local137.anInt8086 = local174 + 1;
				} else {
					local137.anInt8086 = -1;
				}
			} else {
				local137.anInt8086 = -1;
			}
		}
		for (local85 = 0; local85 < Static447.aClass319Array3.length; local85++) {
			@Pc(240) Class319 local240 = Static447.aClass319Array3[local85];
			if (local240 != null) {
				if (local240.anInt9116 == 1) {
					@Pc(254) Class8_Sub50 local254 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local240.anInt9124);
					if (local254 != null) {
						@Pc(259) Class15_Sub1_Sub2_Sub2_Sub2 local259 = local254.aClass15_Sub1_Sub2_Sub2_Sub2_2;
						if (local259.anInt8086 >= 0) {
							local259.anInt8086 += 2048;
						}
					}
				} else if (local240.anInt9116 == 10) {
					@Pc(278) Class15_Sub1_Sub2_Sub2_Sub1 local278 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local240.anInt9124];
					if (local278 != null && local278 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 && local278.anInt8086 >= 0) {
						local278.anInt8086 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1932() {
		@Pc(1) int local1 = Static315.anInt9128;
		@Pc(3) int[] local3 = Static533.anIntArray506;
		@Pc(11) int local11 = Static586.aBoolean712 ? local1 : local1 + Static59.anInt1906;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub1_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local13 - local1])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local23.anInt8086 >= 0) {
				@Pc(43) int local43 = local23.method6692();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10301 & 0x1FF) == 0 && (local23.anInt10298 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10301 & 0x1FF) == 256 && (local23.anInt10298 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10297 = Static177.method3098(local23.anInt10298, local23.anInt10301, local23.aByte124);
				Static333.method5408(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1933() {
		Static124.anInt3366 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static59.anInt1906; local3++) {
			@Pc(14) Class15_Sub1_Sub2_Sub2_Sub2 local14 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local3])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (local14.aBoolean583 && local14.method6685() != -1) {
				@Pc(32) int local32 = (local14.method6692() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10301 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10298 - local32 >> 9;
				@Pc(53) Class15_Sub1_Sub2_Sub2 local53 = Static425.method5121(local14.aByte124, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8075;
					if (local53 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt8067 == 0 && local53.method6685() != -1) {
						Static197.anIntArray253[Static124.anInt3366] = local58;
						Static172.anIntArray228[Static124.anInt3366] = local58;
						Static124.anInt3366++;
						local53.anInt8067++;
					}
					Static197.anIntArray253[Static124.anInt3366] = local58;
					Static172.anIntArray228[Static124.anInt3366] = local14.anInt8075 + 2048;
					Static124.anInt3366++;
					local53.anInt8067++;
				}
			}
		}
		Static506.method7323(Static197.anIntArray253, 0, Static124.anInt3366 - 1, Static172.anIntArray228);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1934() {
		for (@Pc(1) int local1 = 0; local1 < Static372.anInt7082; local1++) {
			@Pc(6) int[] local6 = Static391.anIntArrayArray41[local1];
			for (@Pc(8) int local8 = 0; local8 < Static218.anInt5023; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
