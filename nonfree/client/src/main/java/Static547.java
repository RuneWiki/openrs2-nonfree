import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
	public static final int[] anIntArray521 = new int[5];

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_21 = new Class96(10, 2, 2, 0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method7960(@OriginalArg(1) Class57 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static470.anInt8834 == 0 || Static373.anInt6397 == 0) {
			return;
		}
		@Pc(32) Class203 local32;
		@Pc(51) int local51;
		@Pc(47) int local47;
		@Pc(43) int local43;
		@Pc(39) int local39;
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (Static40.aBoolean61) {
			Static235.method3415(false);
			local32 = arg0.method7720();
			@Pc(35) int[] local35 = arg0.Y();
			local39 = local35[3];
			local43 = local35[2];
			local47 = local35[1];
			local51 = local35[0];
			local57 = Static167.method2411(false) + arg2;
			local63 = arg1 + Static529.method7636(false);
		} else {
			arg0.DA(Static492.anInt8231, Static105.anInt1713, Static470.anInt8834, Static373.anInt6397);
			local39 = Static373.anInt6397;
			local47 = Static105.anInt1713;
			local43 = Static470.anInt8834;
			local51 = Static492.anInt8231;
			arg0.KA(Static319.anInt5702, Static64.anInt1059, Static470.anInt8834, Static373.anInt6397);
			local32 = arg0.method7676();
			local32.method8327(Static455.anInt7797, Static330.anInt5899, Static361.anInt6291, Static674.anInt10793, Static65.anInt1064, Static291.anInt5067);
			local63 = arg1;
			local57 = arg2;
			arg0.method7657(local32);
		}
		if (local43 == 0) {
			local43 = 1;
		}
		Static281.method4144(true);
		if (local39 == 0) {
			local39 = 1;
		}
		@Pc(145) int local145;
		@Pc(173) int local173;
		@Pc(182) int local182;
		@Pc(283) int local283;
		@Pc(292) int local292;
		@Pc(303) int local303;
		@Pc(314) int local314;
		@Pc(137) int local137;
		@Pc(363) int local363;
		if (Static220.aClass22Array2 != null && (!Static199.aBoolean706 || (Static382.anInt9821 & 0x40) != 0)) {
			local137 = -1;
			@Pc(139) int local139 = -1;
			@Pc(142) int local142 = arg0.i();
			local145 = arg0.XA();
			@Pc(165) int local165;
			@Pc(156) int local156;
			if (Static565.aBoolean768) {
				local165 = local182 = (local63 - local47) * Static243.anInt4189 / local39;
				local173 = local156 = (local57 - local51) * Static243.anInt4189 / local43;
			} else {
				local156 = local145 * (local57 - local51) / local43;
				local165 = (local63 - local47) * local142 / local39;
				local173 = local142 * (local57 - local51) / local43;
				local182 = local145 * (local63 - local47) / local39;
			}
			@Pc(221) int[] local221 = new int[] { local173, local165, local142 };
			local32.method8333(local221);
			@Pc(239) int[] local239 = new int[] { local156, local182, local145 };
			local32.method8333(local239);
			@Pc(270) float local270 = Static225.method3215((float) local239[1], (float) local221[0], (float) local239[0], (float) local239[2], 4, (float) local221[2], (float) local221[1]);
			if (local270 > 0.0F) {
				local283 = local239[0] - local221[0];
				local292 = local239[2] - local221[2];
				local303 = (int) ((float) local221[0] + local270 * (float) local283);
				local314 = (int) (local270 * (float) local292 + (float) local221[2]);
				local137 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() - 1 << 8) + local303 >> 9;
				local139 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() - 1 << 8) + local314 >> 9;
				@Pc(341) byte local341 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145;
				if (local341 < 3 && (Static220.aByteArrayArrayArray14[1][local303 >> 9][local314 >> 9] & 0x2) != 0) {
					local363 = local341 + 1;
				}
			}
			if (local137 != -1 && local139 != -1) {
				if (Static199.aBoolean706 && (Static382.anInt9821 & 0x40) != 0) {
					@Pc(393) Class73 local393 = Static506.method9206(Static7.anInt85, Static400.anInt6886);
					if (local393 == null) {
						Static179.method2592();
					} else {
						Static152.method2122(local137, (long) (local137 << 0 | local139), false, 0L, Static211.aString54, local139, true, " ->", Static586.anInt9800, 11, true, -1);
					}
				} else {
					if (Static434.aBoolean573) {
						Static152.method2122(local137, (long) (local139 | local137 << 0), false, 0L, Static582.aClass335_28.method8349(Static323.anInt5795), local139, true, "", -1, 6, true, -1);
					}
					Static152.method2122(local137, (long) (local139 | local137 << 0), false, 0L, Static416.aString133, local139, true, "", Static195.anInt3175, 12, true, -1);
				}
			}
		}
		if (Static40.aBoolean61) {
			Static26.method424();
		}
		for (local137 = 0; (Static40.aBoolean61 ? 2 : 1) > local137; local137++) {
			@Pc(497) boolean local497 = local137 == 0;
			@Pc(504) Class339 local504 = local497 ? Static51.aClass339_1 : Static496.aClass339_3;
			local145 = arg2;
			local173 = arg1;
			if (Static40.aBoolean61) {
				Static235.method3415(local497);
				local145 = arg2 + Static167.method2411(local497);
				local173 = arg1 + Static529.method7636(local497);
			}
			@Pc(528) Class98 local528 = local504.aClass98_8;
			for (@Pc(533) Class8_Sub10 local533 = (Class8_Sub10) local528.method1777(); local533 != null; local533 = (Class8_Sub10) local528.method1782()) {
				if ((Static224.aBoolean289 || Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 == local533.aClass8_Sub1_21.aByte145) && local533.method8161(arg0, local145, local173)) {
					@Pc(580) int local580;
					if (local533.aClass8_Sub1_21 instanceof Class8_Sub1_Sub3) {
						local580 = ((Class8_Sub1_Sub3) local533.aClass8_Sub1_21).aShort108;
						local182 = ((Class8_Sub1_Sub3) local533.aClass8_Sub1_21).aShort109;
					} else {
						local182 = local533.aClass8_Sub1_21.anInt10355 >> 9;
						local580 = local533.aClass8_Sub1_21.anInt10363 >> 9;
					}
					@Pc(726) int local726;
					@Pc(738) int local738;
					@Pc(860) int local860;
					@Pc(604) int local604;
					if (local533.aClass8_Sub1_21 instanceof Class8_Sub1_Sub3_Sub2_Sub1) {
						@Pc(600) Class8_Sub1_Sub3_Sub2_Sub1 local600 = (Class8_Sub1_Sub3_Sub2_Sub1) local533.aClass8_Sub1_21;
						local604 = local600.method5993();
						if ((local604 & 0x1) == 0 && (local600.anInt10355 & 0x1FF) == 0 && (local600.anInt10363 & 0x1FF) == 0 || (local604 & 0x1) == 1 && (local600.anInt10355 & 0x1FF) == 256 && (local600.anInt10363 & 0x1FF) == 256) {
							local283 = local600.anInt10355 - (local600.method5993() - 1 << 8);
							local292 = local600.anInt10363 - (local600.method5993() - 1 << 8);
							for (local303 = 0; local303 < Static247.anInt4256; local303++) {
								@Pc(692) Class5_Sub35 local692 = (Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local303], 1);
								if (local692 != null) {
									@Pc(697) Class8_Sub1_Sub3_Sub2_Sub2 local697 = local692.aClass8_Sub1_Sub3_Sub2_Sub2_2;
									if (Static44.anInt740 != local697.anInt7042 && local697.aBoolean540) {
										local726 = local697.anInt10355 - (local697.aClass227_1.anInt6248 - 1 << 8);
										local738 = local697.anInt10363 - (local697.aClass227_1.anInt6248 - 1 << 8);
										if (local283 <= local726 && local697.aClass227_1.anInt6248 <= local600.method5993() - (local726 - local283 >> 9) && local738 >= local292 && local697.aClass227_1.anInt6248 <= local600.method5993() - (local738 - local292 >> 9)) {
											Static549.method7980(-127, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 != local533.aClass8_Sub1_21.aByte145, local697);
											local697.anInt7042 = Static44.anInt740;
										}
									}
								}
							}
							local314 = Static116.anInt3318;
							@Pc(817) int[] local817 = Static88.anIntArray464;
							for (local726 = 0; local726 < local314; local726++) {
								@Pc(827) Class8_Sub1_Sub3_Sub2_Sub1 local827 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local817[local726]];
								if (local827 != null && local827.anInt7042 != Static44.anInt740 && local827 != local600 && local827.aBoolean540) {
									local860 = local827.anInt10355 - (local827.method5993() - 1 << 8);
									@Pc(872) int local872 = local827.anInt10363 - (local827.method5993() - 1 << 8);
									if (local283 <= local860 && local827.method5993() <= local600.method5993() - (local860 - local283 >> 9) && local872 >= local292 && local827.method5993() <= local600.method5993() - (local872 - local292 >> 9)) {
										Static302.method4634(local827, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145);
										local827.anInt7042 = Static44.anInt740;
									}
								}
							}
						}
						if (local600.anInt7042 == Static44.anInt740) {
							continue;
						}
						Static302.method4634(local600, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145);
						local600.anInt7042 = Static44.anInt740;
					}
					if (local533.aClass8_Sub1_21 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
						@Pc(988) Class8_Sub1_Sub3_Sub2_Sub2 local988 = (Class8_Sub1_Sub3_Sub2_Sub2) local533.aClass8_Sub1_21;
						if (local988.aClass227_1 != null) {
							if ((local988.aClass227_1.anInt6248 & 0x1) == 0 && (local988.anInt10355 & 0x1FF) == 0 && (local988.anInt10363 & 0x1FF) == 0 || (local988.aClass227_1.anInt6248 & 0x1) == 1 && (local988.anInt10355 & 0x1FF) == 256 && (local988.anInt10363 & 0x1FF) == 256) {
								local604 = local988.anInt10355 - (local988.aClass227_1.anInt6248 - 1 << 8);
								local283 = local988.anInt10363 - (local988.aClass227_1.anInt6248 - 1 << 8);
								for (local292 = 0; local292 < Static247.anInt4256; local292++) {
									@Pc(1075) Class5_Sub35 local1075 = (Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local292], 1);
									if (local1075 != null) {
										@Pc(1080) Class8_Sub1_Sub3_Sub2_Sub2 local1080 = local1075.aClass8_Sub1_Sub3_Sub2_Sub2_2;
										if (Static44.anInt740 != local1080.anInt7042 && local1080 != local988 && local1080.aBoolean540) {
											local363 = local1080.anInt10355 - (local1080.aClass227_1.anInt6248 - 1 << 8);
											local726 = local1080.anInt10363 - (local1080.aClass227_1.anInt6248 - 1 << 8);
											if (local363 >= local604 && local1080.aClass227_1.anInt6248 <= local988.aClass227_1.anInt6248 - (local363 - local604 >> 9) && local726 >= local283 && local988.aClass227_1.anInt6248 - (local726 - local283 >> 9) >= local1080.aClass227_1.anInt6248) {
												Static549.method7980(-123, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, local1080);
												local1080.anInt7042 = Static44.anInt740;
											}
										}
									}
								}
								local303 = Static116.anInt3318;
								@Pc(1197) int[] local1197 = Static88.anIntArray464;
								for (local363 = 0; local363 < local303; local363++) {
									@Pc(1207) Class8_Sub1_Sub3_Sub2_Sub1 local1207 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local1197[local363]];
									if (local1207 != null && Static44.anInt740 != local1207.anInt7042 && local1207.aBoolean540) {
										local738 = local1207.anInt10355 - (local1207.method5993() - 1 << 8);
										local860 = local1207.anInt10363 - (local1207.method5993() - 1 << 8);
										if (local604 <= local738 && local1207.method5993() <= local988.aClass227_1.anInt6248 - (local738 - local604 >> 9) && local860 >= local283 && local1207.method5993() <= local988.aClass227_1.anInt6248 - (local860 - local283 >> 9)) {
											Static302.method4634(local1207, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145);
											local1207.anInt7042 = Static44.anInt740;
										}
									}
								}
							}
							if (Static44.anInt740 == local988.anInt7042) {
								continue;
							}
							Static549.method7980(-126, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, local988);
							local988.anInt7042 = Static44.anInt740;
						}
					}
					if (local533.aClass8_Sub1_21 instanceof Class8_Sub1_Sub5_Sub1) {
						@Pc(1357) int local1357 = Static622.anInt10188 + local182;
						local604 = local580 + Static668.anInt10683;
						@Pc(1379) Class5_Sub25 local1379 = (Class5_Sub25) Static466.aClass291_33.method6993((long) (local1357 | local533.aClass8_Sub1_21.aByte145 << 28 | local604 << 14), 1);
						if (local1379 != null) {
							local292 = 0;
							@Pc(1389) Class5_Sub15 local1389 = (Class5_Sub15) local1379.aClass102_34.method1924();
							while (local1389 != null) {
								@Pc(1397) Class204 local1397 = Static201.aClass127_1.method2501(local1389.anInt2420);
								if (Static199.aBoolean706 && local533.aClass8_Sub1_21.aByte145 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145) {
									@Pc(1425) Class152 local1425 = Static187.anInt3082 == -1 ? null : Static4.aClass355_1.method8693(Static187.anInt3082);
									if ((Static382.anInt9821 & 0x1) != 0 && (local1425 == null || local1397.method4860(Static187.anInt3082, local1425.anInt3373) != local1425.anInt3373)) {
										Static152.method2122(local182, (long) local292, false, (long) local1389.anInt2420, Static211.aString54, local580, false, Static352.aString75 + " -> <col=ff9040>" + local1397.aString72, Static586.anInt9800, 30, true, -1);
									}
								}
								if (local533.aClass8_Sub1_21.aByte145 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145) {
									@Pc(1495) String[] local1495 = local1397.aStringArray36;
									for (local726 = 4; local726 >= 0; local726--) {
										if (local1495 != null && local1495[local726] != null) {
											@Pc(1511) byte local1511 = 0;
											local860 = Static640.anInt10423;
											if (local726 == 0) {
												local1511 = 58;
											}
											if (local726 == 1) {
												local1511 = 44;
											}
											if (local726 == 2) {
												local1511 = 18;
											}
											if (local726 == 3) {
												local1511 = 49;
											}
											if (local1397.anInt5676 == local726) {
												local860 = local1397.anInt5692;
											}
											if (local726 == 4) {
												local1511 = 57;
											}
											if (local726 == local1397.anInt5709) {
												local860 = local1397.anInt5700;
											}
											Static152.method2122(local182, (long) local292, false, (long) local1389.anInt2420, local1495[local726], local580, false, "<col=ff9040>" + local1397.aString72, local860, local1511, true, -1);
										}
									}
								}
								Static152.method2122(local182, (long) local292, local533.aClass8_Sub1_21.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, (long) local1389.anInt2420, Static582.aClass335_23.method8349(Static323.anInt5795), local580, false, "<col=ff9040>" + local1397.aString72, Static571.anInt9569, 1009, true, -1);
								local1389 = (Class5_Sub15) local1379.aClass102_34.method1922();
								local292++;
							}
						}
					}
					if (local533.aClass8_Sub1_21 instanceof Interface16) {
						@Pc(1662) Interface16 local1662 = (Interface16) local533.aClass8_Sub1_21;
						@Pc(1669) Class55 local1669 = Static536.aClass392_2.method9293(0, local1662.method8089());
						if (local1669.anIntArray46 != null) {
							local1669 = local1669.method847(Static413.aClass118_1);
						}
						if (local1669 != null) {
							if (Static199.aBoolean706 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 == local533.aClass8_Sub1_21.aByte145) {
								@Pc(1708) Class152 local1708 = Static187.anInt3082 == -1 ? null : Static4.aClass355_1.method8693(Static187.anInt3082);
								if ((Static382.anInt9821 & 0x4) != 0 && (local1708 == null || local1669.method845(Static187.anInt3082, local1708.anInt3373) != local1708.anInt3373)) {
									Static152.method2122(local182, (long) local1662.hashCode(), false, Static151.method2114(local1662, local580, local182), Static211.aString54, local580, false, Static352.aString75 + " -> <col=00ffff>" + local1669.aString16, Static586.anInt9800, 51, true, -1);
								}
							}
							if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 == local533.aClass8_Sub1_21.aByte145) {
								@Pc(1778) String[] local1778 = local1669.aStringArray6;
								if (local1778 != null) {
									for (local292 = 4; local292 >= 0; local292--) {
										if (local1778[local292] != null) {
											@Pc(1792) short local1792 = 0;
											local314 = Static640.anInt10423;
											if (local292 == 0) {
												local1792 = 22;
											}
											if (local292 == 1) {
												local1792 = 15;
											}
											if (local292 == 2) {
												local1792 = 3;
											}
											if (local292 == 3) {
												local1792 = 16;
											}
											if (local292 == local1669.anInt924) {
												local314 = local1669.anInt922;
											}
											if (local292 == 4) {
												local1792 = 1002;
											}
											if (local292 == local1669.anInt947) {
												local314 = local1669.anInt946;
											}
											Static152.method2122(local182, (long) local1662.hashCode(), false, Static151.method2114(local1662, local580, local182), local1778[local292], local580, false, "<col=00ffff>" + local1669.aString16, local314, local1792, true, -1);
										}
									}
								}
								Static152.method2122(local182, (long) local1662.hashCode(), Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 != local533.aClass8_Sub1_21.aByte145, (long) local1669.anInt911, Static582.aClass335_23.method8349(Static323.anInt5795), local580, false, "<col=00ffff>" + local1669.aString16, Static571.anInt9569, 1003, true, -1);
							}
						}
					}
				}
			}
			if (Static40.aBoolean61) {
				Static26.method424();
			}
		}
		Static281.method4144(false);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!cn;IZ)V")
	public static void method7962(@OriginalArg(0) Class73 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt1421 == 0 ? arg0.anInt1384 : arg0.anInt1421;
		@Pc(29) int local29 = arg0.anInt1414 == 0 ? arg0.anInt1394 : arg0.anInt1414;
		Static367.method8724(local16, Static489.aClass73ArrayArray2[arg0.anInt1388 >> 16], local29, arg1, arg0.anInt1388);
		if (arg0.aClass73Array1 != null) {
			Static367.method8724(local16, arg0.aClass73Array1, local29, arg1, arg0.anInt1388);
		}
		@Pc(71) Class5_Sub49 local71 = (Class5_Sub49) Static549.aClass291_37.method6993((long) arg0.anInt1388, 1);
		if (local71 != null) {
			Static250.method3677(local71.anInt9322, local16, local29, arg1);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(JIBZ)Ljava/lang/String;")
	public static String method7963(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static140.method1963(arg0);
		@Pc(10) Calendar local10 = Static242.aCalendar1;
		@Pc(21) int local21 = local10.get(5);
		@Pc(27) int local27 = local10.get(2) + 1;
		@Pc(31) int local31 = local10.get(1);
		@Pc(35) int local35 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local35 / 10 + local35 % 10 + ":" + local46 / 10 + local46 % 10;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method7966(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static45.method8836(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(47) int local47;
			do {
				local47 = arg1.nextInt();
			} while (local47 >= local44);
			return Static92.method1361(arg0, local47);
		}
	}
}
