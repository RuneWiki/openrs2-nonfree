import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array10;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt2339;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!re;")
	public static Class9 aClass9_52;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	public static int anInt2343;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static int anInt2338 = 0;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1501 = Static72.method1077("Please try again)3");

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1495 = aClass74_1501;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1496 = Static72.method1077("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1497 = Static72.method1077("@or1@");

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!u;")
	private static Class74 aClass74_1500 = Static72.method1077("No response from server)3");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_1498 = aClass74_1500;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_1499 = Static72.method1077("gelb:");

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)Lclient!u;")
	public static Class74 method1600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static98.aClass74_1414;
		} else if (local8 < -6) {
			return Static21.aClass74_476;
		} else if (local8 < -3) {
			return Static36.aClass74_658;
		} else if (local8 < 0) {
			return aClass74_1497;
		} else if (local8 > 9) {
			return Static70.aClass74_1086;
		} else if (local8 > 6) {
			return Static81.aClass74_1226;
		} else if (local8 > 3) {
			return Static32.aClass74_606;
		} else if (local8 > 0) {
			return Static48.aClass74_835;
		} else {
			return Static20.aClass74_469;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZII)I")
	public static int method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub12 local10 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray155.length > arg0) {
			return local10.anIntArray155[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZB)Lclient!u;")
	public static Class74 method1602(@OriginalArg(0) int arg0) {
		return Static45.method731(true, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lclient!ob;ILclient!sd;)V")
	public static void method1603(@OriginalArg(0) Class55[] arg0, @OriginalArg(2) Class69 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static17.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static17.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method1278(local11, local7);
						}
					}
				}
			}
		}
		Static17.anInt540 += (int) (Math.random() * 5.0D) - 2;
		if (Static17.anInt540 < -16) {
			Static17.anInt540 = -16;
		}
		if (Static17.anInt540 > 16) {
			Static17.anInt540 = 16;
		}
		Static98.anInt2118 += (int) (Math.random() * 5.0D) - 2;
		if (Static98.anInt2118 < -8) {
			Static98.anInt2118 = -8;
		}
		if (Static98.anInt2118 > 8) {
			Static98.anInt2118 = 8;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(182) int local182;
		@Pc(161) int local161;
		@Pc(195) int local195;
		@Pc(260) int local260;
		@Pc(199) int local199;
		@Pc(205) int local205;
		@Pc(276) int local276;
		@Pc(254) int local254;
		@Pc(500) int local500;
		@Pc(544) int local544;
		@Pc(644) int local644;
		@Pc(654) int local654;
		@Pc(672) int local672;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(122) byte[][] local122 = Static45.aByteArrayArrayArray3[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local132 = local26 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local138 = 1; local138 < 103; local138++) {
					local161 = Static56.anIntArrayArrayArray2[local7][local138][local134 + 1] - Static56.anIntArrayArrayArray2[local7][local138][local134 - 1];
					local182 = Static56.anIntArrayArrayArray2[local7][local138 + 1][local134] - Static56.anIntArrayArrayArray2[local7][local138 - 1][local134];
					local195 = (int) Math.sqrt((double) (local161 * local161 + local182 * local182 + 65536));
					local199 = 65536 / local195;
					local205 = (local161 << 8) / local195;
					local254 = (local122[local138][local134 - 1] >> 2) + (local122[local138 - 1][local134] >> 2) + (local122[local138 - -1][local134] >> 3) + (local122[local138][local134 + 1] >> 3) + (local122[local138][local134] >> 1);
					local260 = (local182 << 8) / local195;
					local276 = (local199 * -10 + local260 * -50 + local205 * -50) / local132 + 96;
					Static27.anIntArrayArray7[local138][local134] = local276 - local254;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static103.anIntArray327[local138] = 0;
				Static97.anIntArray414[local138] = 0;
				Static99.anIntArray310[local138] = 0;
				Static116.anIntArray361[local138] = 0;
				Static128.anIntArray418[local138] = 0;
			}
			for (local182 = -5; local182 < 109; local182++) {
				for (local161 = 0; local161 < 104; local161++) {
					local195 = local182 + 5;
					@Pc(396) int local396;
					if (local195 >= 0 && local195 < 104) {
						local260 = Static38.aByteArrayArrayArray2[local7][local195][local161] & 0xFF;
						if (local260 > 0) {
							@Pc(360) Class2_Sub2_Sub5 local360 = Static77.method1207(local260 - 1);
							Static103.anIntArray327[local161] += local360.anInt644;
							Static97.anIntArray414[local161] += local360.anInt646;
							Static99.anIntArray310[local161] += local360.anInt635;
							Static116.anIntArray361[local161] += local360.anInt643;
							local396 = Static128.anIntArray418[local161]++;
						}
					}
					local260 = local182 - 5;
					if (local260 >= 0 && local260 < 104) {
						local199 = Static38.aByteArrayArrayArray2[local7][local260][local161] & 0xFF;
						if (local199 > 0) {
							@Pc(433) Class2_Sub2_Sub5 local433 = Static77.method1207(local199 - 1);
							Static103.anIntArray327[local161] -= local433.anInt644;
							Static97.anIntArray414[local161] -= local433.anInt646;
							Static99.anIntArray310[local161] -= local433.anInt635;
							Static116.anIntArray361[local161] -= local433.anInt643;
							local396 = Static128.anIntArray418[local161]--;
						}
					}
				}
				if (local182 >= 1 && local182 < 103) {
					local260 = 0;
					local199 = 0;
					local195 = 0;
					local276 = 0;
					local205 = 0;
					for (local254 = -5; local254 < 109; local254++) {
						local500 = local254 + 5;
						if (local500 >= 0 && local500 < 104) {
							local260 += Static97.anIntArray414[local500];
							local199 += Static99.anIntArray310[local500];
							local205 += Static116.anIntArray361[local500];
							local195 += Static103.anIntArray327[local500];
							local276 += Static128.anIntArray418[local500];
						}
						local544 = local254 - 5;
						if (local544 >= 0 && local544 < 104) {
							local199 -= Static99.anIntArray310[local544];
							local205 -= Static116.anIntArray361[local544];
							local276 -= Static128.anIntArray418[local544];
							local260 -= Static97.anIntArray414[local544];
							local195 -= Static103.anIntArray327[local544];
						}
						if (local254 >= 1 && local254 < 103 && (!Static84.aBoolean73 || (Static17.aByteArrayArrayArray1[0][local182][local254] & 0x2) != 0 || (Static17.aByteArrayArrayArray1[local7][local182][local254] & 0x10) == 0 && Static61.method1095(local7, local182, local254) == Static71.anInt1547)) {
							if (local7 < Static109.anInt2400) {
								Static109.anInt2400 = local7;
							}
							local644 = Static38.aByteArrayArrayArray2[local7][local182][local254] & 0xFF;
							local654 = Static113.aByteArrayArrayArray7[local7][local182][local254] & 0xFF;
							if (local644 > 0 || local654 > 0) {
								local672 = Static56.anIntArrayArrayArray2[local7][local182][local254];
								@Pc(682) int local682 = Static56.anIntArrayArrayArray2[local7][local182 + 1][local254];
								@Pc(692) int local692 = Static56.anIntArrayArrayArray2[local7][local182][local254 + 1];
								@Pc(698) int local698 = Static27.anIntArrayArray7[local182][local254];
								@Pc(706) int local706 = Static27.anIntArrayArray7[local182 + 1][local254];
								@Pc(718) int local718 = Static56.anIntArrayArrayArray2[local7][local182 + 1][local254 + 1];
								@Pc(728) int local728 = Static27.anIntArrayArray7[local182 + 1][local254 + 1];
								@Pc(736) int local736 = Static27.anIntArrayArray7[local182][local254 + 1];
								@Pc(738) int local738 = -1;
								@Pc(740) int local740 = -1;
								@Pc(751) int local751;
								@Pc(755) int local755;
								if (local644 > 0) {
									local751 = local195 * 256 / local205;
									local755 = local260 / local276;
									@Pc(759) int local759 = local199 / local276;
									local738 = Static71.method1074(local755, local759, local751);
									local759 += Static17.anInt540;
									@Pc(776) int local776 = local751 + Static98.anInt2118 & 0xFF;
									if (local759 < 0) {
										local759 = 0;
									} else if (local759 > 255) {
										local759 = 255;
									}
									local740 = Static71.method1074(local755, local759, local776);
								}
								if (local7 > 0) {
									@Pc(802) boolean local802 = true;
									if (local644 == 0 && Static91.aByteArrayArrayArray6[local7][local182][local254] != 0) {
										local802 = false;
									}
									if (local654 > 0 && !Static53.method892(local654 - 1).aBoolean70) {
										local802 = false;
									}
									if (local802 && local672 == local682 && local672 == local718 && local692 == local672) {
										Static113.anIntArrayArrayArray5[local7][local182][local254] |= 0x924;
									}
								}
								local751 = 0;
								if (local740 != -1) {
									local751 = Static44.anIntArray121[Static124.method1875(96, local740)];
								}
								if (local654 == 0) {
									arg1.method1646(local7, local182, local254, 0, 0, -1, local672, local682, local718, local692, Static124.method1875(local698, local738), Static124.method1875(local706, local738), Static124.method1875(local728, local738), Static124.method1875(local736, local738), 0, 0, 0, 0, local751, 0);
								} else {
									local755 = Static91.aByteArrayArrayArray6[local7][local182][local254] + 1;
									@Pc(931) byte local931 = Static81.aByteArrayArrayArray5[local7][local182][local254];
									@Pc(937) Class2_Sub2_Sub13 local937 = Static53.method892(local654 - 1);
									@Pc(940) int local940 = local937.anInt1757;
									@Pc(952) int local952;
									@Pc(950) int local950;
									@Pc(982) int local982;
									@Pc(988) int local988;
									if (local940 >= 0) {
										local950 = Static44.anInterface2_1.method1058(local940);
										local952 = -1;
									} else if (local937.anInt1762 == 16711935) {
										local952 = -2;
										local940 = -1;
										local950 = -2;
									} else {
										local952 = Static71.method1074(local937.anInt1763, local937.anInt1768, local937.anInt1770);
										local982 = local937.anInt1770 + Static98.anInt2118 & 0xFF;
										local988 = local937.anInt1768 + Static17.anInt540;
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										local950 = Static71.method1074(local937.anInt1763, local988, local982);
									}
									local982 = 0;
									if (local950 != -2) {
										local982 = Static44.anIntArray121[Static125.method1885(96, local950)];
									}
									if (local937.anInt1765 != -1) {
										@Pc(1031) int local1031 = local937.anInt1774 + Static17.anInt540;
										if (local1031 < 0) {
											local1031 = 0;
										} else if (local1031 > 255) {
											local1031 = 255;
										}
										local988 = local937.anInt1755 + Static98.anInt2118 & 0xFF;
										local950 = Static71.method1074(local937.anInt1764, local1031, local988);
										local982 = Static44.anIntArray121[Static125.method1885(96, local950)];
									}
									arg1.method1646(local7, local182, local254, local755, local931, local940, local672, local682, local718, local692, Static124.method1875(local698, local738), Static124.method1875(local706, local738), Static124.method1875(local728, local738), Static124.method1875(local736, local738), Static125.method1885(local698, local952), Static125.method1885(local706, local952), Static125.method1885(local728, local952), Static125.method1885(local736, local952), local751, local982);
								}
							}
						}
					}
				}
			}
			for (local161 = 1; local161 < 103; local161++) {
				for (local195 = 1; local195 < 103; local195++) {
					arg1.method1645(local7, local195, local161, Static61.method1095(local7, local195, local161));
				}
			}
			Static38.aByteArrayArrayArray2[local7] = null;
			Static113.aByteArrayArrayArray7[local7] = null;
			Static91.aByteArrayArrayArray6[local7] = null;
			Static81.aByteArrayArrayArray5[local7] = null;
			Static45.aByteArrayArrayArray3[local7] = null;
		}
		arg1.method1633();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static17.aByteArrayArrayArray1[1][local11][local26] & 0x2) == 2) {
					arg1.method1609(local11, local26);
				}
			}
		}
		local26 = 1;
		local132 = 2;
		local134 = 4;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local134 <<= 0x3;
				local132 <<= 0x3;
				local26 <<= 0x3;
			}
			for (local182 = 0; local182 <= local138; local182++) {
				for (local161 = 0; local161 <= 104; local161++) {
					for (local195 = 0; local195 <= 104; local195++) {
						if ((Static113.anIntArrayArrayArray5[local182][local195][local161] & local26) != 0) {
							local199 = local161;
							for (local260 = local161; local260 > 0 && (local26 & Static113.anIntArrayArrayArray5[local182][local195][local260 - 1]) != 0; local260--) {
							}
							local205 = local182;
							local276 = local182;
							while (local199 < 104 && (Static113.anIntArrayArrayArray5[local182][local195][local199 + 1] & local26) != 0) {
								local199++;
							}
							label347: while (local205 > 0) {
								for (local254 = local260; local254 <= local199; local254++) {
									if ((local26 & Static113.anIntArrayArrayArray5[local205 - 1][local195][local254]) == 0) {
										break label347;
									}
								}
								local205--;
							}
							label336: while (local138 > local276) {
								for (local254 = local260; local254 <= local199; local254++) {
									if ((local26 & Static113.anIntArrayArrayArray5[local276 + 1][local195][local254]) == 0) {
										break label336;
									}
								}
								local276++;
							}
							local254 = (local276 + 1 - local205) * (local199 + 1 - local260);
							if (local254 >= 8) {
								local544 = Static56.anIntArrayArrayArray2[local276][local195][local260] - 240;
								local644 = Static56.anIntArrayArrayArray2[local205][local195][local260];
								Static108.method1650(local138, 1, local195 * 128, local195 * 128, local260 * 128, local199 * 128 + 128, local544, local644);
								for (local654 = local205; local654 <= local276; local654++) {
									for (local672 = local260; local672 <= local199; local672++) {
										Static113.anIntArrayArrayArray5[local654][local195][local672] &= ~local26;
									}
								}
							}
						}
						if ((local132 & Static113.anIntArrayArrayArray5[local182][local195][local161]) != 0) {
							local199 = local195;
							local205 = local182;
							while (local199 < 104 && (local132 & Static113.anIntArrayArrayArray5[local182][local199 + 1][local161]) != 0) {
								local199++;
							}
							local260 = local195;
							local276 = local182;
							while (local260 > 0 && (local132 & Static113.anIntArrayArrayArray5[local182][local260 - 1][local161]) != 0) {
								local260--;
							}
							label401: while (local205 > 0) {
								for (local254 = local260; local254 <= local199; local254++) {
									if ((Static113.anIntArrayArrayArray5[local205 - 1][local254][local161] & local132) == 0) {
										break label401;
									}
								}
								local205--;
							}
							label390: while (local276 < local138) {
								for (local254 = local260; local254 <= local199; local254++) {
									if ((local132 & Static113.anIntArrayArrayArray5[local276 + 1][local254][local161]) == 0) {
										break label390;
									}
								}
								local276++;
							}
							local254 = (local199 + 1 - local260) * ((local276 - local205) + 1);
							if (local254 >= 8) {
								local544 = Static56.anIntArrayArrayArray2[local276][local260][local161] - 240;
								local644 = Static56.anIntArrayArrayArray2[local205][local260][local161];
								Static108.method1650(local138, 2, local260 * 128, local199 * 128 + 128, local161 * 128, local161 * 128, local544, local644);
								for (local654 = local205; local654 <= local276; local654++) {
									for (local672 = local260; local672 <= local199; local672++) {
										Static113.anIntArrayArrayArray5[local654][local672][local161] &= ~local132;
									}
								}
							}
						}
						if ((local134 & Static113.anIntArrayArrayArray5[local182][local195][local161]) != 0) {
							local199 = local195;
							local260 = local195;
							local276 = local161;
							for (local205 = local161; local205 > 0 && (Static113.anIntArrayArrayArray5[local182][local195][local205 - 1] & local134) != 0; local205--) {
							}
							while (local276 < 104 && (Static113.anIntArrayArrayArray5[local182][local195][local276 + 1] & local134) != 0) {
								local276++;
							}
							label455: while (local260 > 0) {
								for (local254 = local205; local254 <= local276; local254++) {
									if ((Static113.anIntArrayArrayArray5[local182][local260 - 1][local254] & local134) == 0) {
										break label455;
									}
								}
								local260--;
							}
							label444: while (local199 < 104) {
								for (local254 = local205; local254 <= local276; local254++) {
									if ((local134 & Static113.anIntArrayArrayArray5[local182][local199 + 1][local254]) == 0) {
										break label444;
									}
								}
								local199++;
							}
							if ((local199 + 1 - local260) * (local276 + (-local205 - -1)) >= 4) {
								local254 = Static56.anIntArrayArrayArray2[local182][local260][local205];
								Static108.method1650(local138, 4, local260 * 128, local199 * 128 + 128, local205 * 128, local276 * 128 + 128, local254, local254);
								for (local500 = local260; local500 <= local199; local500++) {
									for (local544 = local205; local544 <= local276; local544++) {
										Static113.anIntArrayArrayArray5[local182][local500][local544] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1604() {
		Static65.aClass16_53.method485();
		Static120.aClass16_85.method485();
		Static27.aClass16_26.method485();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method1605() {
		aClass74_1495 = null;
		aClass74_1499 = null;
		aClass74_1500 = null;
		aClass74_1496 = null;
		aClass74_1497 = null;
		aClass74_1501 = null;
		aClass2_Sub2_Sub1_Sub1Array10 = null;
		aClass74_1498 = null;
		aClass9_52 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!r;I)V")
	public static void method1606(@OriginalArg(1) Class2_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) Static3.aClass13_3.method415();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1356; local22++) {
				if (local15.aClass37Array1[local22] != null) {
					if (local15.aClass37Array1[local22].anInt1337 == 2) {
						local15.anIntArray151[local22] = -5;
					}
					if (local15.aClass37Array1[local22].anInt1337 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass37Array2[local22] != null) {
					if (local15.aClass37Array2[local22].anInt1337 == 2) {
						local15.anIntArray151[local22] = -6;
					}
					if (local15.aClass37Array2[local22].anInt1337 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1533(47);
			arg0.method1486(0);
			@Pc(102) int local102 = arg0.anInt2187;
			arg0.method1497(local15.anInt1359);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt1356; local109++) {
				if (local15.anIntArray151[local109] == 0) {
					try {
						@Pc(133) int local133 = local15.anIntArray152[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local133 == 0) {
							local142 = (Field) local15.aClass37Array1[local109].anObject3;
							local146 = local142.getInt(null);
							arg0.method1486(0);
							arg0.method1497(local146);
						} else if (local133 == 1) {
							local142 = (Field) local15.aClass37Array1[local109].anObject3;
							local142.setInt(null, local15.anIntArray153[local109]);
							arg0.method1486(0);
						} else if (local133 == 2) {
							local142 = (Field) local15.aClass37Array1[local109].anObject3;
							local146 = local142.getModifiers();
							arg0.method1486(0);
							arg0.method1497(local146);
						}
						@Pc(213) Method local213;
						if (local133 == 3) {
							local213 = (Method) local15.aClass37Array2[local109].anObject3;
							@Pc(238) byte[][] local238 = local15.aByteArrayArrayArray4[local109];
							@Pc(242) Object[] local242 = new Object[local238.length];
							for (@Pc(244) int local244 = 0; local244 < local238.length; local244++) {
								@Pc(256) ObjectInputStream local256 = new ObjectInputStream(new ByteArrayInputStream(local238[local244]));
								local242[local244] = local256.readObject();
							}
							@Pc(271) Object local271 = local213.invoke(null, local242);
							if (local271 == null) {
								arg0.method1486(0);
							} else if (local271 instanceof Number) {
								arg0.method1486(1);
								arg0.method1495(((Number) local271).longValue());
							} else if (local271 instanceof Class74) {
								arg0.method1486(2);
								arg0.method1494((Class74) local271);
							} else {
								arg0.method1486(4);
							}
						} else if (local133 == 4) {
							local213 = (Method) local15.aClass37Array2[local109].anObject3;
							local146 = local213.getModifiers();
							arg0.method1486(0);
							arg0.method1497(local146);
						}
					} catch (@Pc(314) ClassNotFoundException local314) {
						arg0.method1486(-10);
					} catch (@Pc(320) InvalidClassException local320) {
						arg0.method1486(-11);
					} catch (@Pc(326) StreamCorruptedException local326) {
						arg0.method1486(-12);
					} catch (@Pc(332) OptionalDataException local332) {
						arg0.method1486(-13);
					} catch (@Pc(338) IllegalAccessException local338) {
						arg0.method1486(-14);
					} catch (@Pc(344) IllegalArgumentException local344) {
						arg0.method1486(-15);
					} catch (@Pc(350) InvocationTargetException local350) {
						arg0.method1486(-16);
					} catch (@Pc(356) SecurityException local356) {
						arg0.method1486(-17);
					} catch (@Pc(362) IOException local362) {
						arg0.method1486(-18);
					} catch (@Pc(368) NullPointerException local368) {
						arg0.method1486(-19);
					} catch (@Pc(374) Exception local374) {
						arg0.method1486(-20);
					} catch (@Pc(380) Throwable local380) {
						arg0.method1486(-21);
					}
				} else {
					arg0.method1486(local15.anIntArray151[local109]);
				}
			}
			arg0.method1507(local102);
			arg0.method1510(arg0.anInt2187 - local102);
			local15.method1930();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method1607() {
		if (Static39.anInt951 == 104) {
			@Pc(20) int local20;
			if (Static18.anInt558 == -1) {
				local20 = Static50.anInt1174;
			} else {
				local20 = Static18.anInt558;
			}
			if (Static50.anInt1174 != Static18.anInt558) {
				local20--;
				if (local20 < 0) {
					local20 = 19;
				}
				if (Static24.aClass74Array4[local20] != null) {
					Static97.aClass74_1737 = Static24.aClass74Array4[local20];
					Static55.aBoolean16 = true;
					Static18.anInt558 = local20;
				}
			}
		}
		if (Static39.anInt951 != 105 || Static18.anInt558 == -1) {
			return;
		}
		Static18.anInt558++;
		if (Static18.anInt558 >= 20) {
			Static18.anInt558 = 0;
		}
		if (Static50.anInt1174 == Static18.anInt558) {
			Static18.anInt558 = -1;
			Static55.aBoolean16 = true;
			Static97.aClass74_1737 = Static97.aClass74_1736;
			return;
		}
		if (Static24.aClass74Array4[Static18.anInt558] != null) {
			Static97.aClass74_1737 = Static24.aClass74Array4[Static18.anInt558];
			Static55.aBoolean16 = true;
			return;
		}
	}
}
