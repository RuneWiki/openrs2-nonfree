import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
	public static int anInt5234;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
	public static int anInt5235;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "Lclient!gd;")
	public static Class61 aClass61_49 = new Class61(4);

	@OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
	public static int anInt5233 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Lclient!tk;")
	public static Class159 method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class159 local13 = Static82.method1361(arg1);
		if (arg0 == -1) {
			return local13;
		} else if (local13 == null || local13.aClass159Array1 == null || local13.aClass159Array1.length <= arg0) {
			return null;
		} else {
			return local13.aClass159Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIII)V")
	public static void method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(14) int local14 = arg1 + arg4;
		@Pc(23) int local23 = arg0 - arg1;
		@Pc(28) int local28 = arg5 + arg1;
		@Pc(30) int local30;
		for (local30 = arg5; local30 < local28; local30++) {
			Static19.method343(arg4, arg2, Static181.anIntArrayArray19[local30], arg0);
		}
		for (local30 = arg3; local30 > local10; local30--) {
			Static19.method343(arg4, arg2, Static181.anIntArrayArray19[local30], arg0);
		}
		for (local30 = local28; local30 <= local10; local30++) {
			@Pc(75) int[] local75 = Static181.anIntArrayArray19[local30];
			Static19.method343(arg4, arg2, local75, local14);
			Static19.method343(local23, arg2, local75, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBZZ)V")
	public static void method3919(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) int local7;
		@Pc(25) Class36_Sub3_Sub2 local25;
		@Pc(92) int local92;
		@Pc(187) int local187;
		@Pc(206) int local206;
		@Pc(220) int local220;
		@Pc(229) int local229;
		@Pc(114) int local114;
		for (local7 = 0; local7 < Static135.anInt2729; local7++) {
			local25 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local7]];
			if (local25 != null && local25.method3112() && local25.aClass173_1.method4241()) {
				@Pc(43) int local43 = local25.method3110();
				if (arg1) {
					if (!local25.aClass173_1.aBoolean471) {
						continue;
					}
				} else if (arg2 != local25.aClass173_1.aBoolean475 || arg0 != 0 && arg0 != local43) {
					continue;
				}
				@Pc(87) int local87;
				if (local43 == 1) {
					if ((local25.anInt4117 & 0x7F) == 64 && (local25.anInt4118 & 0x7F) == 64) {
						local87 = local25.anInt4117 >> 7;
						local92 = local25.anInt4118 >> 7;
						if (local87 >= 0 && local87 < 104 && local92 >= 0 && local92 < 104) {
							local114 = Static82.anIntArrayArray7[local87][local92]++;
						}
					}
				} else if (((local43 & 0x1) != 0 || (local25.anInt4117 & 0x7F) == 0 && (local25.anInt4118 & 0x7F) == 0) && ((local43 & 0x1) != 1 || (local25.anInt4117 & 0x7F) == 64 && (local25.anInt4118 & 0x7F) == 64)) {
					local87 = local25.anInt4117 - local43 * 64 >> 7;
					local92 = local25.anInt4118 - local43 * 64 >> 7;
					local187 = local87 + local25.method3110();
					if (local87 < 0) {
						local87 = 0;
					}
					if (local187 > 104) {
						local187 = 104;
					}
					local206 = local92 + local25.method3110();
					if (local92 < 0) {
						local92 = 0;
					}
					if (local206 > 104) {
						local206 = 104;
					}
					for (local220 = local87; local220 < local187; local220++) {
						for (local229 = local92; local229 < local206; local229++) {
							local114 = Static82.anIntArrayArray7[local220][local229]++;
						}
					}
				}
			}
		}
		label208: for (local7 = 0; local7 < Static135.anInt2729; local7++) {
			@Pc(268) long local268 = (long) Static191.anIntArray285[local7] << 32 | 0x20000000L;
			local25 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local7]];
			if (local25 != null && local25.method3112() && local25.aClass173_1.method4241()) {
				local92 = local25.method3110();
				if (arg1) {
					if (!local25.aClass173_1.aBoolean471) {
						continue;
					}
				} else if (local25.aClass173_1.aBoolean475 != arg2 || arg0 != 0 && arg0 != local92) {
					continue;
				}
				local25.aBoolean332 = true;
				if (local92 == 1) {
					if ((local25.anInt4117 & 0x7F) == 64 && (local25.anInt4118 & 0x7F) == 64) {
						local187 = local25.anInt4117 >> 7;
						local206 = local25.anInt4118 >> 7;
						if (local187 < 0 || local187 >= 104 || local206 < 0 || local206 >= 104) {
							continue;
						}
						if (Static82.anIntArrayArray7[local187][local206] > 1) {
							local114 = Static82.anIntArrayArray7[local187][local206]--;
							continue;
						}
					}
				} else if ((local92 & 0x1) == 0 && (local25.anInt4117 & 0x7F) == 0 && (local25.anInt4118 & 0x7F) == 0 || (local92 & 0x1) == 1 && (local25.anInt4117 & 0x7F) == 64 && (local25.anInt4118 & 0x7F) == 64) {
					local187 = local25.anInt4117 - local92 * 64 >> 7;
					local206 = local25.anInt4118 - local92 * 64 >> 7;
					local220 = local92 + local187;
					if (local187 < 0) {
						local187 = 0;
					}
					if (local220 > 104) {
						local220 = 104;
					}
					@Pc(402) boolean local402 = true;
					local229 = local206 + local92;
					if (local229 > 104) {
						local229 = 104;
					}
					if (local206 < 0) {
						local206 = 0;
					}
					@Pc(423) int local423;
					@Pc(432) int local432;
					for (local423 = local187; local423 < local220; local423++) {
						for (local432 = local206; local432 < local229; local432++) {
							if (Static82.anIntArrayArray7[local423][local432] <= 1) {
								local402 = false;
								break;
							}
						}
					}
					if (local402) {
						local423 = local187;
						while (true) {
							if (local220 <= local423) {
								continue label208;
							}
							for (local432 = local206; local432 < local229; local432++) {
								local114 = Static82.anIntArrayArray7[local423][local432]--;
							}
							local423++;
						}
					}
				}
				if (!local25.aClass173_1.aBoolean472) {
					local268 |= Long.MIN_VALUE;
				}
				local25.aBoolean332 = false;
				local25.anInt4086 = Static59.method927(local25.anInt4117, local25.anInt4118, Static34.anInt770);
				Static37.method3011(Static34.anInt770, local25.anInt4117, local25.anInt4118, local25.anInt4086, (local92 - 1) * 64 + 60, local25, local25.anInt4128, local268, local25.aBoolean330);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IIIIIII)V")
	public static void method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(42) int local42;
		if (Static149.anInt3012 == 0) {
			@Pc(8) int local8 = Static90.anInt1920;
			local10 = Static37.anInt3864;
			@Pc(12) int local12 = Static65.anInt5541;
			@Pc(26) int local26 = local8 + (arg4 - arg0) * (local12 - local8) / arg1;
			@Pc(28) int local28 = Static19.anInt523;
			local42 = (arg5 - arg3) * (local28 - local10) / arg2 + local10;
			if (Static215.aBoolean357 && (Static234.anInt4722 & 0x40) != 0) {
				@Pc(85) Class159 local85 = method3916(Static132.anInt2621, Static106.anInt2200);
				if (local85 == null) {
					Static184.method2848();
				} else {
					Static28.method477(local26, Static47.aString39, local42, " ->", Static57.anInt1261, 0L, (short) 58);
				}
			} else {
				if (Static198.anInt3914 == 1) {
					Static28.method477(local26, Static48.aString40, local42, "", -1, 0L, (short) 45);
				}
				Static28.method477(local26, Static30.aString30, local42, "", -1, 0L, (short) 31);
			}
		}
		@Pc(106) long local106 = -1L;
		for (local10 = 0; local10 < Static88.anInt1896; local10++) {
			@Pc(119) long local119 = Static79.aLongArray4[local10];
			local42 = (int) local119 & 0x7F;
			@Pc(131) int local131 = (int) local119 >> 29 & 0x3;
			@Pc(138) int local138 = (int) local119 >> 7 & 0x7F;
			@Pc(145) int local145 = Integer.MAX_VALUE & (int) (local119 >>> 32);
			if (local119 != local106) {
				local106 = local119;
				@Pc(256) int local256;
				if (local131 == 2 && Static23.method409(Static34.anInt770, local42, local138, local119)) {
					@Pc(168) Class70 local168 = Static235.method3578(local145);
					if (local168.anIntArray145 != null) {
						local168 = local168.method1575();
					}
					if (local168 == null) {
						continue;
					}
					if (Static149.anInt3012 == 1) {
						Static28.method477(local42, Static255.aString176, local138, Static141.aString100 + " -> <col=00ffff>" + local168.aString77, Static241.anInt4825, local119, (short) 57);
					} else if (Static215.aBoolean357) {
						@Pc(194) Class8_Sub1_Sub13 local194 = Static167.anInt3364 == -1 ? null : Static168.method4141(Static167.anInt3364);
						if ((Static234.anInt4722 & 0x4) != 0 && (local194 == null || local168.method1583(Static167.anInt3364, local194.anInt4335) != local194.anInt4335)) {
							Static28.method477(local42, Static47.aString39, local138, Static153.aString105 + " -> <col=00ffff>" + local168.aString77, Static57.anInt1261, local119, (short) 10);
						}
					} else {
						@Pc(244) String[] local244 = local168.aStringArray34;
						if (Static31.aBoolean47) {
							local244 = Static52.method840(local244);
						}
						if (local244 != null) {
							for (local256 = 4; local256 >= 0; local256--) {
								if (local244[local256] != null) {
									@Pc(273) int local273 = -1;
									if (local256 == local168.anInt2082) {
										local273 = local168.anInt2055;
									}
									@Pc(283) short local283 = 0;
									if (local256 == 0) {
										local283 = 17;
									}
									if (local256 == 1) {
										local283 = 23;
									}
									if (local256 == 2) {
										local283 = 5;
									}
									if (local256 == 3) {
										local283 = 22;
									}
									if (local256 == 4) {
										local283 = 1002;
									}
									if (local256 == local168.anInt2050) {
										local273 = local168.anInt2056;
									}
									Static28.method477(local42, local244[local256], local138, "<col=00ffff>" + local168.aString77, local273, local119, local283);
								}
							}
						}
						Static28.method477(local42, Static187.aString131, local138, "<col=00ffff>" + local168.aString77, Static60.anInt1302, (long) local168.anInt2087, (short) 1001);
					}
				}
				@Pc(506) int local506;
				@Pc(518) int local518;
				@Pc(457) int local457;
				@Pc(471) int local471;
				@Pc(480) Class36_Sub3_Sub2 local480;
				@Pc(596) Class36_Sub3_Sub1 local596;
				if (local131 == 1) {
					@Pc(402) Class36_Sub3_Sub2 local402 = Static48.aClass36_Sub3_Sub2Array1[local145];
					if ((local402.aClass173_1.anInt5633 & 0x1) == 0 && (local402.anInt4117 & 0x7F) == 0 && (local402.anInt4118 & 0x7F) == 0 || (local402.aClass173_1.anInt5633 & 0x1) == 1 && (local402.anInt4117 & 0x7F) == 64 && (local402.anInt4118 & 0x7F) == 64) {
						local457 = local402.anInt4117 - (local402.aClass173_1.anInt5633 - 1) * 64;
						local256 = local402.anInt4118 + 64 - local402.aClass173_1.anInt5633 * 64;
						for (local471 = 0; local471 < Static135.anInt2729; local471++) {
							local480 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local471]];
							if (local480 != null && !local480.aBoolean333 && local480 != local402 && local480.aBoolean332) {
								local506 = local480.anInt4117 - (local480.aClass173_1.anInt5633 - 1) * 64;
								local518 = local480.anInt4118 - (local480.aClass173_1.anInt5633 - 1) * 64;
								if (local506 >= local457 && local480.aClass173_1.anInt5633 <= local402.aClass173_1.anInt5633 - (local506 - local457 >> 7) && local518 >= local256 && local402.aClass173_1.anInt5633 - (local518 - local256 >> 7) >= local480.aClass173_1.anInt5633) {
									Static106.method1711(local480.aClass173_1, local42, Static191.anIntArray285[local471], local138);
									local480.aBoolean333 = true;
								}
							}
						}
						for (local471 = 0; local471 < Static61.anInt1336; local471++) {
							local596 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local471]];
							if (local596 != null && !local596.aBoolean333 && local596.aBoolean332) {
								local506 = local596.anInt4117 - (local596.method3110() - 1) * 64;
								local518 = local596.anInt4118 - (local596.method3110() - 1) * 64;
								if (local506 >= local457 && local596.method3110() <= local402.aClass173_1.anInt5633 - (local506 - local457 >> 7) && local256 <= local518 && local596.method3110() <= local402.aClass173_1.anInt5633 - (local518 - local256 >> 7)) {
									Static77.method1227(local42, Static85.anIntArray123[local471], local138, local596);
									local596.aBoolean333 = true;
								}
							}
						}
					}
					if (local402.aBoolean333) {
						continue;
					}
					Static106.method1711(local402.aClass173_1, local42, local145, local138);
					local402.aBoolean333 = true;
				}
				if (local131 == 0) {
					@Pc(708) Class36_Sub3_Sub1 local708 = Static230.aClass36_Sub3_Sub1Array1[local145];
					if ((local708.anInt4117 & 0x7F) == 64 && (local708.anInt4118 & 0x7F) == 64) {
						local457 = local708.anInt4117 + 64 - local708.method3110() * 64;
						local256 = local708.anInt4118 - (local708.method3110() - 1) * 64;
						for (local471 = 0; local471 < Static135.anInt2729; local471++) {
							local480 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local471]];
							if (local480 != null && !local480.aBoolean333 && local480.aBoolean332) {
								local506 = local480.anInt4117 - (local480.aClass173_1.anInt5633 - 1) * 64;
								local518 = local480.anInt4118 - (local480.aClass173_1.anInt5633 - 1) * 64;
								if (local506 >= local457 && local480.aClass173_1.anInt5633 <= local708.method3110() - (local506 - local457 >> 7) && local256 <= local518 && local480.aClass173_1.anInt5633 <= local708.method3110() - (local518 - local256 >> 7)) {
									Static106.method1711(local480.aClass173_1, local42, Static191.anIntArray285[local471], local138);
									local480.aBoolean333 = true;
								}
							}
						}
						for (local471 = 0; local471 < Static61.anInt1336; local471++) {
							local596 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local471]];
							if (local596 != null && !local596.aBoolean333 && local596 != local708 && local596.aBoolean332) {
								local506 = local596.anInt4117 + 64 - local596.method3110() * 64;
								local518 = local596.anInt4118 + 64 - local596.method3110() * 64;
								if (local457 <= local506 && local596.method3110() <= local708.method3110() - (local506 - local457 >> 7) && local256 <= local518 && local596.method3110() <= local708.method3110() - (local518 - local256 >> 7)) {
									Static77.method1227(local42, Static85.anIntArray123[local471], local138, local596);
									local596.aBoolean333 = true;
								}
							}
						}
					}
					if (local708.aBoolean333) {
						continue;
					}
					Static77.method1227(local42, local145, local138, local708);
					local708.aBoolean333 = true;
				}
				if (local131 == 3) {
					@Pc(987) Class182 local987 = Static124.aClass182ArrayArrayArray1[Static34.anInt770][local42][local138];
					if (local987 != null) {
						for (@Pc(996) Class8_Sub1_Sub15 local996 = (Class8_Sub1_Sub15) local987.method4320(); local996 != null; local996 = (Class8_Sub1_Sub15) local987.method4324()) {
							local256 = local996.aClass36_Sub1_1.anInt1114;
							@Pc(1006) Class10 local1006 = Static140.method2222(local256);
							if (Static149.anInt3012 == 1) {
								Static28.method477(local42, Static255.aString176, local138, Static141.aString100 + " -> <col=ff9040>" + local1006.aString13, Static241.anInt4825, (long) local256, (short) 7);
							} else if (Static215.aBoolean357) {
								@Pc(1156) Class8_Sub1_Sub13 local1156 = Static167.anInt3364 == -1 ? null : Static168.method4141(Static167.anInt3364);
								if ((Static234.anInt4722 & 0x1) != 0 && (local1156 == null || local1006.method84(Static167.anInt3364, local1156.anInt4335) != local1156.anInt4335)) {
									Static28.method477(local42, Static47.aString39, local138, Static153.aString105 + " -> <col=ff9040>" + local1006.aString13, Static57.anInt1261, (long) local256, (short) 20);
								}
							} else {
								@Pc(1018) String[] local1018 = local1006.aStringArray1;
								if (Static31.aBoolean47) {
									local1018 = Static52.method840(local1018);
								}
								for (local506 = 4; local506 >= 0; local506--) {
									if (local1018 != null && local1018[local506] != null) {
										@Pc(1046) byte local1046 = 0;
										if (local506 == 0) {
											local1046 = 12;
										}
										if (local506 == 1) {
											local1046 = 44;
										}
										if (local506 == 2) {
											local1046 = 21;
										}
										if (local506 == 3) {
											local1046 = 40;
										}
										if (local506 == 4) {
											local1046 = 60;
										}
										@Pc(1084) int local1084 = -1;
										if (local1006.anInt131 == local506) {
											local1084 = local1006.anInt109;
										}
										if (local506 == local1006.anInt135) {
											local1084 = local1006.anInt115;
										}
										Static28.method477(local42, local1018[local506], local138, "<col=ff9040>" + local1006.aString13, local1084, (long) local256, local1046);
									}
								}
								Static28.method477(local42, Static187.aString131, local138, "<col=ff9040>" + local1006.aString13, Static60.anInt1302, (long) local256, (short) 1005);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IJ)V")
	public static void method3921(@OriginalArg(1) long arg0) {
		Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
		Static66.aClass8_Sub2_Sub1_4.method2340(21);
		Static66.aClass8_Sub2_Sub1_4.method2378(arg0);
		Static242.anInt4854 = -3;
		Static230.anInt4668 = 1;
		Static214.anInt4413 = 0;
		Static90.anInt1918 = 0;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public static void method3922() {
		Static235.aClass182_26 = new Class182();
	}
}
