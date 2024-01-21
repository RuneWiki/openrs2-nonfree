import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_12;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "Z")
	private static boolean aBoolean26;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_335 = Static38.method736("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Lclient!vc;")
	public static Class71 aClass71_336 = Static38.method736("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	public static int anInt601 = -1;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "Lclient!vc;")
	public static Class71 aClass71_337 = Static38.method736("Hidden)2");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method452() {
		try {
			@Pc(11) Graphics local11 = Static105.aCanvas1.getGraphics();
			Static71.aClass7_54.method697(550, local11, 4);
		} catch (@Pc(19) Exception local19) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method456() {
		if (Static81.aClass5_Sub1_Sub11_4 == null) {
			return;
		}
		@Pc(15) Class5_Sub1_Sub11 local15 = Static81.aClass5_Sub1_Sub11_4;
		@Pc(19) Class5_Sub1_Sub11 local19 = Static73.method1218(local15);
		if (local19 == null) {
			Static81.aClass5_Sub1_Sub11_4 = null;
			return;
		}
		Static91.anInt2113++;
		@Pc(32) int[] local32 = Static33.method693(local19);
		@Pc(36) int[] local36 = Static33.method693(local15);
		@Pc(41) int local41 = Static26.anInt1440 - Static46.anInt1116;
		@Pc(46) int local46 = Static107.anInt2563 - Static69.anInt1697;
		if (local46 <= local15.anInt1780 && local46 >= -local15.anInt1780 && local41 <= local15.anInt1780 && -local15.anInt1780 <= local41 && !Static106.aBoolean107) {
			local46 = 0;
			local41 = 0;
		} else if (Static91.anInt2113 > local15.anInt1782 || Static106.aBoolean107) {
			Static106.aBoolean107 = true;
		} else {
			local41 = 0;
			local46 = 0;
		}
		@Pc(105) int local105 = local46 + local36[0] - local32[0];
		@Pc(116) int local116 = local41 + local36[1] - local32[1];
		if (local116 < 0) {
			local116 = 0;
		}
		if (local105 < 0) {
			local105 = 0;
		}
		if (local19.anInt1776 < local105 + local15.anInt1776) {
			local105 = local19.anInt1776 - local15.anInt1776;
		}
		if (local116 + local15.anInt1801 > local19.anInt1801) {
			local116 = local19.anInt1801 - local15.anInt1801;
		}
		if (Static81.aClass5_Sub1_Sub11_4.anObjectArray8 != null && Static106.aBoolean107) {
			Static53.method972(local116, null, local15.anObjectArray8, 0, local105, local15);
		}
		if (Static111.anInt975 != 0) {
			return;
		}
		if (Static106.aBoolean107) {
			@Pc(187) int local187 = Static107.anInt2563 - local32[0];
			if (local187 < 0) {
				local187 = 0;
			}
			if (local19.anInt1776 - 1 < local187) {
				local187 = local19.anInt1776 - 1;
			}
			@Pc(211) int local211 = Static26.anInt1440 - local32[1];
			if (local211 < 0) {
				local211 = 0;
			}
			if (local19.anInt1801 - 1 < local211) {
				local211 = local19.anInt1801 - 1;
			}
			@Pc(236) Class5_Sub1_Sub11 local236 = Static91.method1431(local19, local15, local187, local211);
			if (Static81.aClass5_Sub1_Sub11_4.anObjectArray12 != null) {
				Static53.method972(local116, local236, local15.anObjectArray12, 0, local105, local15);
			}
			if (local236 != null && Static94.method1566(local15) != null) {
				Static61.aClass5_Sub11_Sub1_8.method1553(112);
				Static61.aClass5_Sub11_Sub1_8.method1501(local15.anInt1769);
				Static61.aClass5_Sub11_Sub1_8.method1531(local236.anInt1769);
				Static61.aClass5_Sub11_Sub1_8.method1536(local236.anInt1760);
				Static61.aClass5_Sub11_Sub1_8.method1525(local15.anInt1760);
			}
		} else {
			if (Static81.aClass5_Sub1_Sub11_4.anObjectArray13 != null) {
				Static53.method972(local116, null, local15.anObjectArray13, 0, local105, local15);
			}
			if ((Static17.anInt618 == 1 || Static70.method1171(Static49.anInt1394 - 1)) && Static49.anInt1394 > 2) {
				Static18.method485();
			} else if (Static49.anInt1394 > 0) {
				Static19.method492(Static49.anInt1394 - 1);
			}
		}
		Static81.aClass5_Sub1_Sub11_4 = null;
		return;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Lclient!me;IIIIIBII)Z")
	public static boolean method461(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub11[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static52.method2025(arg5, arg8, arg6, arg3);
		@Pc(12) boolean local12 = true;
		for (@Pc(29) int local29 = 0; local29 < arg1.length; local29++) {
			@Pc(35) Class5_Sub1_Sub11 local35 = arg1[local29];
			if (local35 != null && (arg0 == local35.anInt1785 || arg0 == -1412584499 && local35 == Static81.aClass5_Sub1_Sub11_4)) {
				if (local35.anInt1764 > 0) {
					Static25.method555(local35);
				}
				@Pc(70) int local70 = arg8 + local35.anInt1817 - arg4;
				@Pc(73) int local73 = local35.anInt1773;
				@Pc(80) int local80 = arg5 + local35.anInt1804 - arg7;
				@Pc(127) int local127;
				@Pc(132) int local132;
				@Pc(196) int local196;
				@Pc(207) int local207;
				if (local35 == Static81.aClass5_Sub1_Sub11_4) {
					if (arg0 != -1412584499 && !local35.aBoolean79) {
						Static107.anInt2556 = arg4;
						Static39.aClass5_Sub1_Sub11Array1 = arg1;
						Static33.anInt937 = arg7;
						continue;
					}
					@Pc(103) Class5_Sub1_Sub11 local103 = Static73.method1218(local35);
					if (local103 == null) {
						Static81.aClass5_Sub1_Sub11_4 = null;
					} else {
						@Pc(113) int[] local113 = Static33.method693(local103);
						@Pc(117) int[] local117 = Static33.method693(local35);
						if (!local35.aBoolean79) {
							local73 = 128;
						}
						local127 = Static107.anInt2563 - Static69.anInt1697;
						local132 = Static26.anInt1440 - Static46.anInt1116;
						if (local127 <= local35.anInt1780 && -local35.anInt1780 <= local127 && local35.anInt1780 >= local132 && local132 >= -local35.anInt1780 && !Static106.aBoolean107) {
							local127 = 0;
							local132 = 0;
						} else if (local35.anInt1782 < Static91.anInt2113 || Static106.aBoolean107) {
							Static106.aBoolean107 = true;
						} else {
							local127 = 0;
							local132 = 0;
						}
						local196 = local117[0] + local127 - local113[0];
						local207 = local132 + local117[1] - local113[1];
						if (local196 < 0) {
							local196 = 0;
						}
						if (local207 < 0) {
							local207 = 0;
						}
						if (local35.anInt1776 + local196 > local103.anInt1776) {
							local196 = local103.anInt1776 - local35.anInt1776;
						}
						local80 = local196 + local113[0];
						if (local35.anInt1801 + local207 > local103.anInt1801) {
							local207 = local103.anInt1801 - local35.anInt1801;
						}
						local70 = local207 + local113[1];
					}
				}
				if ((!local35.aBoolean75 || Static52.anInt3018 >= local80 && local70 <= Static52.anInt3019 && Static52.anInt3017 <= local80 + local35.anInt1776 && local35.anInt1801 + local70 >= Static52.anInt3016) && (!local35.aBoolean75 || !Static6.method159(local35))) {
					if (local35.anInt1790 == 0) {
						if (!local35.aBoolean75 && Static6.method159(local35) && !Static9.method198(arg2, local29)) {
							continue;
						}
						if (!local35.aBoolean75) {
							if (local35.anInt1774 > local35.anInt1809 - local35.anInt1801) {
								local35.anInt1774 = local35.anInt1809 - local35.anInt1801;
							}
							if (local35.anInt1774 < 0) {
								local35.anInt1774 = 0;
							}
						}
						local12 &= method461(local35.anInt1760, arg1, arg2, local70 + local35.anInt1801, local35.anInt1774, local80, local35.anInt1776 + local80, local35.anInt1778, local70);
						if (local35.aClass5_Sub1_Sub11Array2 != null) {
							local12 &= method461(local35.anInt1760, local35.aClass5_Sub1_Sub11Array2, arg2, local70 + local35.anInt1801, local35.anInt1774, local80, local80 + local35.anInt1776, local35.anInt1778, local70);
						}
						Static52.method2025(arg5, arg8, arg6, arg3);
						if (local35.anInt1801 < local35.anInt1809 && !local35.aBoolean75) {
							Static97.method1607(local35.anInt1801, local80 + local35.anInt1776, local35.anInt1774, local35.anInt1809, local70);
						}
					}
					if (local35.anInt1790 != 1) {
						@Pc(499) int local499;
						@Pc(703) int local703;
						@Pc(439) int local439;
						@Pc(441) int local441;
						@Pc(445) int local445;
						if (local35.anInt1790 == 2) {
							local439 = 0;
							for (local441 = 0; local441 < local35.anInt1801; local441++) {
								for (local445 = 0; local445 < local35.anInt1776; local445++) {
									local127 = (local35.anInt1779 + 32) * local445 + local80;
									local132 = local70 + local441 * (local35.anInt1822 + 32);
									if (local439 < 20) {
										local127 += local35.anIntArray219[local439];
										local132 += local35.anIntArray223[local439];
									}
									if (local35.anIntArray222[local439] > 0) {
										local499 = local35.anIntArray222[local439] - 1;
										if (Static52.anInt3017 - 32 < local127 && local127 < Static52.anInt3018 && local132 > Static52.anInt3016 - 32 && local132 < Static52.anInt3019 || Static75.anInt1855 != 0 && Static32.anInt850 == local439) {
											@Pc(565) Class5_Sub1_Sub10_Sub3 local565;
											if (Static81.anInt1990 == 1 && Static94.anInt2274 == local439 && local35.anInt1760 == Static116.anInt2808) {
												local565 = method467(2, false, 0, local499, local35.anIntArray217[local439]);
											} else {
												local565 = method467(1, false, 3153952, local499, local35.anIntArray217[local439]);
											}
											if (local565 == null) {
												local12 = false;
											} else if (Static75.anInt1855 != 0 && local439 == Static32.anInt850 && local35.anInt1760 == Static111.anInt978) {
												local196 = Static107.anInt2563 - Static34.anInt969;
												local207 = Static26.anInt1440 - Static58.anInt1516;
												if (local207 < 5 && local207 > -5) {
													local207 = 0;
												}
												if (local196 < 5 && local196 > -5) {
													local196 = 0;
												}
												if (Static20.anInt671 < 5) {
													local207 = 0;
													local196 = 0;
												}
												local565.method1870(local127 + local196, local132 + local207, 128);
												if (arg0 != -1) {
													@Pc(681) Class5_Sub1_Sub11 local681 = arg1[arg0 & 0xFFFF];
													if (Static52.anInt3016 > local207 + local132 && local681.anInt1774 > 0) {
														local703 = Static58.anInt1515 * (Static52.anInt3016 - local207 - local132) / 3;
														if (Static58.anInt1515 * 10 < local703) {
															local703 = Static58.anInt1515 * 10;
														}
														if (local681.anInt1774 < local703) {
															local703 = local681.anInt1774;
														}
														local681.anInt1774 -= local703;
														Static58.anInt1516 += local703;
													}
													if (Static52.anInt3019 < local207 + local132 + 32 && local681.anInt1774 < local681.anInt1809 - local681.anInt1801) {
														local703 = Static58.anInt1515 * (local207 + local132 + 32 - Static52.anInt3019) / 3;
														if (Static58.anInt1515 * 10 < local703) {
															local703 = Static58.anInt1515 * 10;
														}
														if (local681.anInt1809 - local681.anInt1774 - local681.anInt1801 < local703) {
															local703 = local681.anInt1809 - local681.anInt1801 - local681.anInt1774;
														}
														Static58.anInt1516 -= local703;
														local681.anInt1774 += local703;
													}
												}
											} else if (Static48.anInt1378 != 0 && local439 == Static21.anInt698 && Static107.anInt2567 == local35.anInt1760) {
												local565.method1870(local127, local132, 128);
											} else {
												local565.method1862(local127, local132);
											}
										}
									} else if (local35.anIntArray218 != null && local439 < 20) {
										@Pc(825) Class5_Sub1_Sub10_Sub3 local825 = local35.method1201(local439);
										if (local825 != null) {
											local825.method1862(local127, local132);
										} else if (Static69.aBoolean73) {
											local12 = false;
										}
									}
									local439++;
								}
							}
						} else if (local35.anInt1790 == 3) {
							if (Static7.method187(local35)) {
								local439 = local35.anInt1765;
								if (Static9.method198(arg2, local29) && local35.anInt1821 != 0) {
									local439 = local35.anInt1821;
								}
							} else {
								local439 = local35.anInt1777;
								if (Static9.method198(arg2, local29) && local35.anInt1786 != 0) {
									local439 = local35.anInt1786;
								}
							}
							if (local73 == 0) {
								if (local35.aBoolean76) {
									Static52.method2024(local80, local70, local35.anInt1776, local35.anInt1801, local439);
								} else {
									Static52.method2027(local80, local70, local35.anInt1776, local35.anInt1801, local439);
								}
							} else if (local35.aBoolean76) {
								Static52.method2026(local80, local70, local35.anInt1776, local35.anInt1801, local439, 256 - (local73 & 0xFF));
							} else {
								Static52.method2018(local80, local70, local35.anInt1776, local35.anInt1801, local439, 256 - (local73 & 0xFF));
							}
						} else {
							@Pc(964) Class5_Sub1_Sub10_Sub4 local964;
							if (local35.anInt1790 == 4) {
								local964 = local35.method1204();
								if (local964 != null) {
									@Pc(975) Class71 local975 = local35.aClass71_879;
									if (Static7.method187(local35)) {
										local441 = local35.anInt1765;
										if (Static9.method198(arg2, local29) && local35.anInt1821 != 0) {
											local441 = local35.anInt1821;
										}
										if (local35.aClass71_885.method1784() > 0) {
											local975 = local35.aClass71_885;
										}
									} else {
										local441 = local35.anInt1777;
										if (Static9.method198(arg2, local29) && local35.anInt1786 != 0) {
											local441 = local35.anInt1786;
										}
									}
									if (local35.aBoolean75 && local35.anInt1803 != -1) {
										@Pc(1032) Class5_Sub1_Sub17 local1032 = Static33.method691(local35.anInt1803);
										local975 = local1032.aClass71_1359;
										if (local975 == null) {
											local975 = Static30.aClass71_469;
										}
										if ((local1032.anInt2870 == 1 || local35.anInt1794 != 1) && local35.anInt1794 != -1) {
											local975 = Static74.method677(new Class71[] { local975, Static24.aClass71_425, Static38.method731(local35.anInt1794) });
										}
									}
									if (local35.anInt1760 == Static88.anInt2058 && local35.anInt1769 == Static30.anInt799) {
										local975 = Static64.aClass71_1228;
										local441 = local35.anInt1777;
									}
									if (Static52.anInt3020 == 479) {
										if (local441 == 16776960) {
											local441 = 255;
										}
										if (local441 == 49152) {
											local441 = 16777215;
										}
									}
									local975 = Static21.method523(local35, local975);
									local964.method2036(local975, local80, local70, local35.anInt1776, local35.anInt1801, local441, local35.aBoolean81, local35.anInt1807, local35.anInt1800, local35.anInt1761);
								} else if (Static69.aBoolean73) {
									local12 = false;
								}
							} else {
								@Pc(1341) int local1341;
								@Pc(1351) int local1351;
								@Pc(1357) int local1357;
								if (local35.anInt1790 == 5) {
									@Pc(1163) Class5_Sub1_Sub10_Sub3 local1163;
									if (local35.aBoolean75) {
										if (local35.anInt1803 == -1) {
											local1163 = local35.method1194(false);
										} else {
											local1163 = method467(local35.anInt1793, false, local35.anInt1806, local35.anInt1803, local35.anInt1794);
										}
										if (local1163 != null) {
											local445 = local1163.anInt2771;
											local441 = local1163.anInt2774;
											if (local35.aBoolean82) {
												@Pc(1262) int[] local1262 = new int[4];
												Static52.method2019(local1262);
												local132 = local80;
												if (local1262[0] > local80) {
													local132 = local1262[0];
												}
												local207 = local35.anInt1776 + local80;
												local499 = local70 + local35.anInt1801;
												if (local207 > local1262[2]) {
													local207 = local1262[2];
												}
												local196 = local70;
												if (local1262[3] < local499) {
													local499 = local1262[3];
												}
												if (local70 < local1262[1]) {
													local196 = local1262[1];
												}
												Static52.method2025(local132, local196, local207, local499);
												local1341 = (local441 + local35.anInt1776 - 1) / local441;
												local1351 = (local35.anInt1801 + local445 - 1) / local445;
												for (local703 = 0; local703 < local1341; local703++) {
													for (local1357 = 0; local1357 < local1351; local1357++) {
														if (local35.anInt1827 != 0) {
															local1163.method1865(local441 * local703 + local80 + local441 / 2, local1357 * local445 + local70 + local445 / 2, local35.anInt1827, 4096);
														} else if (local73 == 0) {
															local1163.method1862(local80 + local703 * local441, local70 + local1357 * local445);
														} else {
															local1163.method1870(local441 * local703 + local80, local70 + local1357 * local445, 256 - (local73 & 0xFF));
														}
													}
												}
												Static52.method2013(local1262);
											} else {
												local127 = local35.anInt1776 * 4096 / local441;
												if (local35.anInt1827 != 0) {
													local1163.method1865(local80 + local35.anInt1776 / 2, local70 - -(local35.anInt1801 / 2), local35.anInt1827, local127);
												} else if (local73 != 0) {
													local1163.method1867(local80, local70, local35.anInt1776, local35.anInt1801, 256 - (local73 & 0xFF));
												} else if (local441 == local35.anInt1776 && local445 == local35.anInt1801) {
													local1163.method1862(local80, local70);
												} else {
													local1163.method1868(local80, local70, local35.anInt1776, local35.anInt1801);
												}
											}
										} else if (Static69.aBoolean73) {
											local12 = false;
										}
									} else {
										local1163 = local35.method1194(Static7.method187(local35));
										if (local1163 != null) {
											local1163.method1862(local80, local70);
										} else if (Static69.aBoolean73) {
											local12 = false;
										}
									}
								} else {
									@Pc(1563) Class5_Sub1_Sub17 local1563;
									if (local35.anInt1790 == 6) {
										@Pc(1478) boolean local1478 = Static7.method187(local35);
										if (local1478) {
											local441 = local35.anInt1823;
										} else {
											local441 = local35.anInt1788;
										}
										@Pc(1507) Class5_Sub1_Sub1_Sub2 local1507;
										if (local35.anInt1766 == 5) {
											if (local35.anInt1819 == 0) {
												local1507 = Static30.aClass32_1.method927(-1, null, null, -1);
											} else {
												local1507 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.method1976();
											}
										} else if (local441 == -1) {
											local1507 = local35.method1199(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2, -1, local1478, null);
											if (local1507 == null && Static69.aBoolean73) {
												local12 = false;
											}
										} else {
											@Pc(1518) Class5_Sub1_Sub18 local1518 = Static57.method1017(local441);
											local1507 = local35.method1199(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2, local35.anInt1767, local1478, local1518);
											if (local1507 == null && Static69.aBoolean73) {
												local12 = false;
											}
										}
										local127 = 0;
										if (local35.anInt1803 != -1) {
											local1563 = Static33.method691(local35.anInt1803);
											if (local1563 != null) {
												local1563 = local1563.method1931(local35.anInt1794);
												local1507 = local1563.method1922(1);
												if (local1507 != null) {
													local127 = local1507.anInt2987 / 2;
												}
											}
										}
										Static80.method1327(local35.anInt1776 / 2 + local80, local35.anInt1801 / 2 + local70);
										local196 = local35.anInt1810 * Class5_Sub1_Sub10_Sub2.anIntArray240[local35.anInt1829] >> 16;
										local132 = local35.anInt1810 * Class5_Sub1_Sub10_Sub2.anIntArray241[local35.anInt1829] >> 16;
										if (local1507 != null) {
											if (local35.aBoolean75) {
												local1507.method232();
												if (local35.aBoolean83) {
													local1507.method247(local35.anInt1808, local35.anInt1802, local35.anInt1829, local35.anInt1783, local132 + local127 + local35.anInt1814, local35.anInt1814 + local196, local35.anInt1810);
												} else {
													local1507.method250(local35.anInt1808, local35.anInt1802, local35.anInt1829, local35.anInt1783, local35.anInt1814 + local127 + local132, local196 - -local35.anInt1814);
												}
											} else {
												local1507.method250(local35.anInt1808, 0, local35.anInt1829, 0, local132, local196);
											}
										}
										Static80.method1328();
									} else {
										if (local35.anInt1790 == 7) {
											local964 = local35.method1204();
											if (local964 == null) {
												if (Static69.aBoolean73) {
													local12 = false;
												}
												continue;
											}
											local441 = 0;
											for (local445 = 0; local445 < local35.anInt1801; local445++) {
												for (local127 = 0; local127 < local35.anInt1776; local127++) {
													if (local35.anIntArray222[local441] > 0) {
														local1563 = Static33.method691(local35.anIntArray222[local441] - 1);
														@Pc(1738) Class71 local1738 = local1563.aClass71_1359;
														if (local1738 == null) {
															local1738 = Static30.aClass71_469;
														}
														if (local1563.anInt2870 == 1 || local35.anIntArray217[local441] != 1) {
															local1738 = Static74.method677(new Class71[] { local1738, Static24.aClass71_425, Static38.method731(local35.anIntArray217[local441]) });
														}
														local207 = local127 * (local35.anInt1779 + 115) + local80;
														local499 = local445 * (local35.anInt1822 + 12) + local70;
														if (local35.anInt1807 == 0) {
															local964.method2049(local1738, local207, local499, local35.anInt1777, local35.aBoolean81);
														} else if (local35.anInt1807 == 1) {
															local964.method2040(local1738, local207 + local35.anInt1776 / 2, local499, local35.anInt1777, local35.aBoolean81);
														} else {
															local964.method2042(local1738, local35.anInt1776 + local207 - 1, local499, local35.anInt1777, local35.aBoolean81);
														}
													}
													local441++;
												}
											}
										}
										if (local35.anInt1790 == 8 && Static48.method926(arg2, local29) && Static8.anInt277 == Static69.anInt1705) {
											local441 = 0;
											@Pc(1869) Class5_Sub1_Sub10_Sub4 local1869 = Static64.aClass5_Sub1_Sub10_Sub4_6;
											local439 = 0;
											@Pc(1874) Class71 local1874 = local35.aClass71_879;
											local1874 = Static21.method523(local35, local1874);
											@Pc(1896) Class71 local1896;
											while (local1874.method1784() > 0) {
												local196 = local1874.method1790(Static92.aClass71_1087);
												if (local196 == -1) {
													local1896 = local1874;
													local1874 = Static38.aClass71_568;
												} else {
													local1896 = local1874.method1800(local196, 0);
													local1874 = local1874.method1822(local196 + 2);
												}
												local207 = local1869.method2031(local1896);
												local441 += local1869.anInt3022 + 1;
												if (local207 > local439) {
													local439 = local207;
												}
											}
											local439 += 6;
											local196 = local80 + local35.anInt1776 - local439 - 5;
											local441 += 7;
											local207 = local35.anInt1801 + local70 + 5;
											if (local207 + local441 > arg3) {
												local207 = arg3 - local441;
											}
											if (local80 + 5 > local196) {
												local196 = local80 + 5;
											}
											if (arg6 < local439 + local196) {
												local196 = arg6 - local439;
											}
											Static52.method2024(local196, local207, local439, local441, 16777120);
											Static52.method2027(local196, local207, local439, local441, 0);
											local1874 = local35.aClass71_879;
											local499 = local1869.anInt3022 + local207 + 2;
											local1874 = Static21.method523(local35, local1874);
											while (local1874.method1784() > 0) {
												local1341 = local1874.method1790(Static92.aClass71_1087);
												if (local1341 == -1) {
													local1896 = local1874;
													local1874 = Static38.aClass71_568;
												} else {
													local1896 = local1874.method1800(local1341, 0);
													local1874 = local1874.method1822(local1341 + 2);
												}
												local1869.method2049(local1896, local196 + 3, local499, 0, false);
												local499 += local1869.anInt3022 + 1;
											}
										}
										if (local35.anInt1790 == 9) {
											if (local35.anInt1796 == 1) {
												Static52.method2020(local80, local70, local80 + local35.anInt1776, local70 - -local35.anInt1801, local35.anInt1777);
											} else {
												local439 = local35.anInt1776 >= 0 ? local35.anInt1776 : -local35.anInt1776;
												local441 = local35.anInt1801 < 0 ? -local35.anInt1801 : local35.anInt1801;
												local445 = local439;
												if (local439 < local441) {
													local445 = local441;
												}
												if (local445 != 0) {
													local127 = (local35.anInt1776 << 16) / local445;
													local132 = (local35.anInt1801 << 16) / local445;
													if (local127 >= local132) {
														local127 = -local127;
													} else {
														local132 = -local132;
													}
													local196 = local132 * local35.anInt1796 >> 17;
													local499 = local127 * local35.anInt1796 >> 17;
													local1351 = local196 + local80;
													local1341 = local127 * local35.anInt1796 + 1 >> 17;
													local207 = local132 * local35.anInt1796 + 1 >> 17;
													local703 = local80 - local207;
													local1357 = local35.anInt1776 + local80 - local207;
													@Pc(2207) int local2207 = local70 + local499;
													@Pc(2212) int local2212 = local70 - local1341;
													@Pc(2221) int local2221 = local70 + local35.anInt1801 - local1341;
													@Pc(2228) int local2228 = local35.anInt1801 + local70 + local499;
													@Pc(2235) int local2235 = local35.anInt1776 + local80 + local196;
													Static80.method1330(local1351, local703, local1357);
													Static80.method1329(local2207, local2212, local2221, local1351, local703, local1357, local35.anInt1777);
													Static80.method1330(local1351, local1357, local2235);
													Static80.method1329(local2207, local2221, local2228, local1351, local1357, local2235, local35.anInt1777);
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
		return local12;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!oa;")
	public static Class7 method463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class7_Sub1");
			@Pc(15) Class7 local15 = (Class7) local11.getDeclaredConstructor().newInstance();
			local15.method695(arg2, arg1, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class7_Sub2 local28 = new Class7_Sub2();
			local28.method695(arg2, arg1, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZBLclient!fc;IIII)V")
	public static void method465(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class24_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg3 + (arg5 << -321970768));
		@Pc(16) Class5_Sub1_Sub6 local16 = (Class5_Sub1_Sub6) Static99.aClass57_14.method1575(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class5_Sub1_Sub6) Static86.aClass57_17.method1575(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class5_Sub1_Sub6) Static38.aClass57_4.method1575(local6);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class5_Sub1_Sub6) Static61.aClass57_9.method1575(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class5_Sub1_Sub6();
			local16.aClass24_Sub1_8 = arg2;
			local16.aByte2 = arg1;
			local16.anInt852 = arg4;
			if (arg0) {
				Static99.aClass57_14.method1581(local6, local16);
				Static115.anInt2697++;
			} else {
				Static26.aClass6_2.method155(local16);
				Static38.aClass57_4.method1581(local6, local16);
				Static8.anInt281++;
			}
		} else if (arg0) {
			local16.method2009();
			Static99.aClass57_14.method1581(local6, local16);
			Static8.anInt281--;
			Static115.anInt2697++;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIZIII)Lclient!vd;")
	private static Class5_Sub1_Sub10_Sub3 method467(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = ((long) arg4 << 16) + (long) arg3 + ((long) arg0 << 38) + ((long) arg2 << 40);
		@Pc(32) Class5_Sub1_Sub10_Sub3 local32;
		if (!arg1) {
			local32 = (Class5_Sub1_Sub10_Sub3) Static28.aClass54_18.method1397(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class5_Sub1_Sub17 local40 = Static33.method691(arg3);
		if (arg4 > 1 && local40.anIntArray288 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (local40.anIntArray287[local50] <= arg4 && local40.anIntArray287[local50] != 0) {
					local48 = local40.anIntArray288[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static33.method691(local48);
			}
		}
		@Pc(91) Class5_Sub1_Sub1_Sub2 local91 = local40.method1922(1);
		if (local91 == null) {
			return null;
		}
		@Pc(97) Class5_Sub1_Sub10_Sub3 local97 = null;
		if (local40.anInt2905 != -1) {
			local97 = method467(1, true, 0, local40.anInt2895, 10);
			if (local97 == null) {
				return null;
			}
		}
		@Pc(116) int local116 = Static52.anInt3021;
		@Pc(118) int local118 = Static52.anInt3020;
		@Pc(120) int[] local120 = Static52.anIntArray309;
		@Pc(122) int local122 = Static52.anInt3017;
		@Pc(124) int local124 = Static52.anInt3018;
		@Pc(126) int local126 = Static52.anInt3016;
		@Pc(128) int local128 = Static52.anInt3019;
		@Pc(130) int[] local130 = Static80.method1320();
		@Pc(132) int local132 = Static80.anInt1968;
		@Pc(134) int local134 = Static80.anInt1967;
		local32 = new Class5_Sub1_Sub10_Sub3(36, 32);
		Static52.method2015(local32.anIntArray281, 36, 32);
		Static108.anIntArray271 = Static80.method1319(Static108.anIntArray271);
		Static52.method2024(0, 0, 36, 32, 0);
		Static80.aBoolean95 = false;
		Static80.method1327(16, 16);
		@Pc(167) int local167 = local40.anInt2898;
		if (arg1) {
			local167 = (int) ((double) local167 * 1.5D);
		} else if (arg0 == 2) {
			local167 = (int) ((double) local167 * 1.04D);
		}
		@Pc(195) int local195 = Class5_Sub1_Sub10_Sub2.anIntArray241[local40.anInt2871] * local167 >> 16;
		@Pc(204) int local204 = Class5_Sub1_Sub10_Sub2.anIntArray240[local40.anInt2871] * local167 >> 16;
		local91.method232();
		local91.method250(local40.anInt2909, local40.anInt2873, local40.anInt2871, local40.anInt2865, local40.anInt2881 + local91.anInt2987 / 2 + local195, local40.anInt2881 + local204);
		if (arg0 >= 1) {
			local32.method1855(1);
		}
		if (arg0 >= 2) {
			local32.method1855(16777215);
		}
		if (arg2 != 0) {
			local32.method1852(arg2);
		}
		Static52.method2015(local32.anIntArray281, 36, 32);
		if (local40.anInt2905 != -1) {
			local97.method1862(0, 0);
		}
		if (!arg1 && (local40.anInt2870 == 1 || arg4 != 1) && arg4 != -1) {
			Static100.aClass5_Sub1_Sub10_Sub4_5.method2033(Static60.method1037(arg4), 1, 10, 1);
			Static100.aClass5_Sub1_Sub10_Sub4_5.method2033(Static60.method1037(arg4), 0, 9, 16776960);
		}
		if (!arg1) {
			Static28.aClass54_18.method1399(local32, local20);
		}
		Static52.method2015(local120, local118, local116);
		Static52.method2025(local122, local126, local124, local128);
		Static80.method1319(local130);
		Static80.anInt1967 = local134;
		Static80.anInt1968 = local132;
		Static80.method1328();
		Static80.aBoolean95 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public static void method468() {
		for (@Pc(11) Class5_Sub6 local11 = (Class5_Sub6) Static2.aClass52_10.method1358(); local11 != null; local11 = (Class5_Sub6) Static2.aClass52_10.method1363()) {
			if (local11.anInt1582 == -1) {
				local11.anInt1575 = 0;
				Static103.method1650(local11);
			} else {
				local11.method2002();
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	public static void method469() {
		aClass5_Sub1_Sub10_Sub3_12 = null;
		aClass71_336 = null;
		aClass71_337 = null;
		aClass71_335 = null;
		aFrame2 = null;
	}
}
