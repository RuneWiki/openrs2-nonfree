import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_4 = new Class13();

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_576 = Static151.method2243("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public static int anInt1733 = 2;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_577 = Static151.method2243("<br>(X");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!pb;Lclient!mb;Lclient!mb;)[Lclient!vi;")
	public static Class2_Sub1_Sub2[] method1166(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(8) int local8 = arg0.method2114(arg1);
		@Pc(21) int local21 = arg0.method2142(arg2, local8);
		return Static162.method2387(arg0, local21, local8);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([[II)V")
	public static void method1167(@OriginalArg(0) int[][] arg0) {
		Static55.anIntArrayArray8 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([Lclient!tf;I)V")
	public static void method1168(@OriginalArg(0) Class95[] arg0) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static133.aByteArrayArrayArray11[local3][local7][local11] & 0x1) == 1) {
						@Pc(26) int local26 = local3;
						if ((Static133.aByteArrayArrayArray11[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method2675(local11, local7);
						}
					}
				}
			}
		}
		@Pc(69) int[][] local69 = new int[104][104];
		Static111.anInt2426 += (int) (Math.random() * 5.0D) - 2;
		if (Static111.anInt2426 < -8) {
			Static111.anInt2426 = -8;
		}
		if (Static111.anInt2426 > 8) {
			Static111.anInt2426 = 8;
		}
		@Pc(98) int[][] local98 = new int[104][104];
		Static41.anInt4503 += (int) (Math.random() * 5.0D) - 2;
		if (Static41.anInt4503 < -16) {
			Static41.anInt4503 = -16;
		}
		if (Static41.anInt4503 > 16) {
			Static41.anInt4503 = 16;
		}
		local11 = Static41.anInt4503 >> 1;
		local7 = Static111.anInt2426 >> 2 << 10;
		@Pc(145) int local145;
		@Pc(151) int local151;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(248) int local248;
		@Pc(182) int local182;
		@Pc(203) int local203;
		@Pc(216) int local216;
		@Pc(222) int local222;
		@Pc(226) int local226;
		@Pc(232) int local232;
		@Pc(298) int local298;
		@Pc(513) int local513;
		@Pc(509) int local509;
		@Pc(837) int local837;
		for (@Pc(131) int local131 = 0; local131 < 4; local131++) {
			@Pc(137) byte[][] local137 = Static199.aByteArrayArrayArray17[local131];
			local145 = (int) Math.sqrt(5100.0D);
			local151 = local145 * 768 >> 8;
			for (local153 = 1; local153 < 103; local153++) {
				for (local157 = 1; local157 < 103; local157++) {
					local182 = Static171.anIntArrayArrayArray7[local131][local157 + 1][local153] - Static171.anIntArrayArrayArray7[local131][local157 - 1][local153];
					local203 = Static171.anIntArrayArrayArray7[local131][local157][local153 + 1] - Static171.anIntArrayArrayArray7[local131][local157][local153 - 1];
					local216 = (int) Math.sqrt((double) (local182 * local182 + local203 * local203 + 65536));
					local222 = (local182 << 8) / local216;
					local226 = -65536 / local216;
					local232 = (local203 << 8) / local216;
					local248 = (local232 * -50 + local222 * -50 + local226 * -10) / local151 + 74;
					local298 = (local137[local157][local153] >> 1) + ((local137[local157 - 1][local153] >> 2) + (local137[local157 + 1][local153] >> 3) - (-(local137[local157][local153 - 1] >> 2) + -(local137[local157][local153 + 1] >> 3)));
					local69[local157][local153] = local248 - local298;
				}
			}
			for (local157 = 0; local157 < 104; local157++) {
				Static128.anIntArray15[local157] = 0;
				Static3.anIntArray12[local157] = 0;
				Static195.anIntArray368[local157] = 0;
				Static104.anIntArray217[local157] = 0;
				Static203.anIntArray384[local157] = 0;
			}
			for (local248 = -5; local248 < 104; local248++) {
				for (local182 = 0; local182 < 104; local182++) {
					local203 = local248 + 5;
					@Pc(414) int local414;
					if (local203 < 104) {
						local216 = Static150.aByteArrayArrayArray14[local131][local203][local182] & 0xFF;
						if (local216 > 0) {
							@Pc(378) Class2_Sub1_Sub1 local378 = Static19.method344(local216 - 1);
							Static128.anIntArray15[local182] += local378.anInt76;
							Static3.anIntArray12[local182] += local378.anInt73;
							Static195.anIntArray368[local182] += local378.anInt66;
							Static104.anIntArray217[local182] += local378.anInt82;
							local414 = Static203.anIntArray384[local182]++;
						}
					}
					local216 = local248 - 5;
					if (local216 >= 0) {
						local222 = Static150.aByteArrayArrayArray14[local131][local216][local182] & 0xFF;
						if (local222 > 0) {
							@Pc(444) Class2_Sub1_Sub1 local444 = Static19.method344(local222 - 1);
							Static128.anIntArray15[local182] -= local444.anInt76;
							Static3.anIntArray12[local182] -= local444.anInt73;
							Static195.anIntArray368[local182] -= local444.anInt66;
							Static104.anIntArray217[local182] -= local444.anInt82;
							local414 = Static203.anIntArray384[local182]--;
						}
					}
				}
				if (local248 >= 0) {
					local203 = 0;
					local216 = 0;
					local222 = 0;
					local226 = 0;
					local232 = 0;
					for (local298 = -5; local298 < 104; local298++) {
						local509 = local298 - 5;
						local513 = local298 + 5;
						if (local513 < 104) {
							local203 += Static128.anIntArray15[local513];
							local232 += Static203.anIntArray384[local513];
							local226 += Static104.anIntArray217[local513];
							local216 += Static3.anIntArray12[local513];
							local222 += Static195.anIntArray368[local513];
						}
						if (local509 >= 0) {
							local226 -= Static104.anIntArray217[local509];
							local203 -= Static128.anIntArray15[local509];
							local232 -= Static203.anIntArray384[local509];
							local216 -= Static3.anIntArray12[local509];
							local222 -= Static195.anIntArray368[local509];
						}
						if (local298 >= 0 && local232 > 0) {
							local98[local248][local298] = Static122.method1926(local203 * 256 / local226, local222 / local232, local216 / local232);
						}
					}
				}
			}
			for (local182 = 1; local182 < 103; local182++) {
				for (local203 = 1; local203 < 103; local203++) {
					if (!Static60.aBoolean52 || (Static133.aByteArrayArrayArray11[0][local182][local203] & 0x2) != 0 || (Static133.aByteArrayArrayArray11[local131][local182][local203] & 0x10) == 0 && Static71.method992(local182, local131, local203) == Static119.anInt2627) {
						if (local131 < Static51.anInt1107) {
							Static51.anInt1107 = local131;
						}
						local222 = Static197.aByteArrayArrayArray16[local131][local182][local203] & 0xFF;
						local216 = Static150.aByteArrayArrayArray14[local131][local182][local203] & 0xFF;
						if (local216 > 0 || local222 > 0) {
							local226 = Static171.anIntArrayArrayArray7[local131][local182][local203];
							local232 = Static171.anIntArrayArrayArray7[local131][local182 + 1][local203];
							local298 = Static171.anIntArrayArrayArray7[local131][local182 + 1][local203 + 1];
							local513 = Static171.anIntArrayArrayArray7[local131][local182][local203 + 1];
							if (local131 > 0) {
								@Pc(737) boolean local737 = true;
								if (local216 == 0 && Static50.aByteArrayArrayArray7[local131][local182][local203] != 0) {
									local737 = false;
								}
								if (local222 > 0 && !Static61.method856(local222 - 1).aBoolean35) {
									local737 = false;
								}
								if (local737 && local226 == local232 && local226 == local298 && local226 == local513) {
									Static102.anIntArrayArrayArray4[local131][local182][local203] |= 0x924;
								}
							}
							@Pc(804) int local804;
							@Pc(830) int local830;
							if (local216 > 0) {
								local509 = local98[local182][local203];
								local804 = local11 + (local509 & 0x7F);
								if (local804 < 0) {
									local804 = 0;
								} else if (local804 > 127) {
									local804 = 127;
								}
								local830 = (local509 + local7 & 0xFC00) + (local509 & 0x380) + local804;
								local837 = Static45.anIntArray79[Static205.method2996(local830, 96)];
							} else {
								local837 = 0;
								local509 = -1;
							}
							local804 = local69[local182][local203];
							local830 = local69[local182 + 1][local203];
							@Pc(867) int local867 = local69[local182 + 1][local203 + 1];
							@Pc(875) int local875 = local69[local182][local203 + 1];
							if (local222 == 0) {
								Static33.method573(local131, local182, local203, 0, 0, -1, local226, local232, local298, local513, Static205.method2996(local509, local804), Static205.method2996(local509, local830), Static205.method2996(local509, local867), Static205.method2996(local509, local875), 0, 0, 0, 0, local837, 0);
							} else {
								@Pc(888) byte local888 = Static10.aByteArrayArrayArray2[local131][local182][local203];
								@Pc(898) int local898 = Static50.aByteArrayArrayArray7[local131][local182][local203] + 1;
								@Pc(904) Class2_Sub1_Sub7 local904 = Static61.method856(local222 - 1);
								@Pc(907) int local907 = local904.anInt861;
								if (local907 >= 0 && !Static45.anInterface3_1.method2300(local907)) {
									local907 = -1;
								}
								@Pc(928) int local928;
								@Pc(965) int local965;
								@Pc(934) int local934;
								@Pc(958) int local958;
								if (local907 >= 0) {
									local928 = -1;
									local965 = Static45.anIntArray79[Static146.method2193(Static45.anInterface3_1.method2298(local907), 96)];
								} else if (local904.anInt859 == -1) {
									local928 = -2;
									local965 = 0;
								} else {
									local928 = local904.anInt859;
									local934 = local11 + (local928 & 0x7F);
									if (local934 < 0) {
										local934 = 0;
									} else if (local934 > 127) {
										local934 = 127;
									}
									local958 = local934 + (local928 + local7 & 0xFC00) + (local928 & 0x380);
									local965 = Static45.anIntArray79[Static146.method2193(local958, 96)];
								}
								if (local904.anInt865 >= 0) {
									local934 = local904.anInt865;
									local958 = (local934 & 0x7F) + local11;
									if (local958 < 0) {
										local958 = 0;
									} else if (local958 > 127) {
										local958 = 127;
									}
									@Pc(1027) int local1027 = (local7 + local934 & 0xFC00) + (local934 & 0x380) + local958;
									local965 = Static45.anIntArray79[Static146.method2193(local1027, 96)];
								}
								Static33.method573(local131, local182, local203, local898, local888, local907, local226, local232, local298, local513, Static205.method2996(local509, local804), Static205.method2996(local509, local830), Static205.method2996(local509, local867), Static205.method2996(local509, local875), Static146.method2193(local928, local804), Static146.method2193(local928, local830), Static146.method2193(local928, local867), Static146.method2193(local928, local875), local837, local965);
							}
						}
					}
				}
			}
			for (local203 = 1; local203 < 103; local203++) {
				for (local216 = 1; local216 < 103; local216++) {
					Static6.method125(local131, local216, local203, Static71.method992(local216, local131, local203));
				}
			}
			Static150.aByteArrayArrayArray14[local131] = null;
			Static197.aByteArrayArrayArray16[local131] = null;
			Static50.aByteArrayArrayArray7[local131] = null;
			Static10.aByteArrayArrayArray2[local131] = null;
			Static199.aByteArrayArrayArray17[local131] = null;
		}
		Static99.method1596();
		@Pc(1187) int local1187;
		for (@Pc(1183) int local1183 = 0; local1183 < 104; local1183++) {
			for (local1187 = 0; local1187 < 104; local1187++) {
				if ((Static133.aByteArrayArrayArray11[1][local1183][local1187] & 0x2) == 2) {
					Static141.method1036(local1183, local1187);
				}
			}
		}
		local1187 = 1;
		@Pc(1217) int local1217 = 2;
		local145 = 4;
		for (local151 = 0; local151 < 4; local151++) {
			if (local151 > 0) {
				local1187 <<= 0x3;
				local145 <<= 0x3;
				local1217 <<= 0x3;
			}
			for (local153 = 0; local153 <= local151; local153++) {
				for (local157 = 0; local157 <= 104; local157++) {
					for (local248 = 0; local248 <= 104; local248++) {
						if ((local1187 & Static102.anIntArrayArrayArray4[local153][local248][local157]) != 0) {
							for (local182 = local157; local182 > 0 && (local1187 & Static102.anIntArrayArrayArray4[local153][local248][local182 - 1]) != 0; local182--) {
							}
							local203 = local157;
							local216 = local153;
							while (local203 < 104 && (Static102.anIntArrayArrayArray4[local153][local248][local203 + 1] & local1187) != 0) {
								local203++;
							}
							local222 = local153;
							label350: while (local216 > 0) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((Static102.anIntArrayArrayArray4[local216 - 1][local248][local226] & local1187) == 0) {
										break label350;
									}
								}
								local216--;
							}
							label339: while (local151 > local222) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((Static102.anIntArrayArrayArray4[local222 + 1][local248][local226] & local1187) == 0) {
										break label339;
									}
								}
								local222++;
							}
							local226 = (local203 + 1 - local182) * (local222 + 1 - local216);
							if (local226 >= 8) {
								local298 = Static171.anIntArrayArrayArray7[local222][local248][local182] - 240;
								local513 = Static171.anIntArrayArrayArray7[local216][local248][local182];
								Static169.method2462(local151, 1, local248 * 128, local248 * 128, local182 * 128, local203 * 128 + 128, local298, local513);
								for (local509 = local216; local509 <= local222; local509++) {
									for (local837 = local182; local837 <= local203; local837++) {
										Static102.anIntArrayArrayArray4[local509][local248][local837] &= ~local1187;
									}
								}
							}
						}
						if ((local1217 & Static102.anIntArrayArrayArray4[local153][local248][local157]) != 0) {
							for (local182 = local248; local182 > 0 && (Static102.anIntArrayArrayArray4[local153][local182 - 1][local157] & local1217) != 0; local182--) {
							}
							local216 = local153;
							for (local203 = local248; local203 < 104 && (Static102.anIntArrayArrayArray4[local153][local203 + 1][local157] & local1217) != 0; local203++) {
							}
							label406: while (local216 > 0) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((local1217 & Static102.anIntArrayArrayArray4[local216 - 1][local226][local157]) == 0) {
										break label406;
									}
								}
								local216--;
							}
							label394: for (local222 = local153; local222 < local151; local222++) {
								for (local226 = local182; local226 <= local203; local226++) {
									if ((local1217 & Static102.anIntArrayArrayArray4[local222 + 1][local226][local157]) == 0) {
										break label394;
									}
								}
							}
							local226 = (local222 + 1 - local216) * (local203 + 1 - local182);
							if (local226 >= 8) {
								local298 = Static171.anIntArrayArrayArray7[local222][local182][local157] - 240;
								local513 = Static171.anIntArrayArrayArray7[local216][local182][local157];
								Static169.method2462(local151, 2, local182 * 128, local203 * 128 + 128, local157 * 128, local157 * 128, local298, local513);
								for (local509 = local216; local509 <= local222; local509++) {
									for (local837 = local182; local837 <= local203; local837++) {
										Static102.anIntArrayArrayArray4[local509][local837][local157] &= ~local1217;
									}
								}
							}
						}
						if ((local145 & Static102.anIntArrayArrayArray4[local153][local248][local157]) != 0) {
							local182 = local248;
							local203 = local248;
							for (local222 = local157; local222 < 104 && (local145 & Static102.anIntArrayArrayArray4[local153][local248][local222 + 1]) != 0; local222++) {
							}
							for (local216 = local157; local216 > 0 && (Static102.anIntArrayArrayArray4[local153][local248][local216 - 1] & local145) != 0; local216--) {
							}
							label460: while (local182 > 0) {
								for (local226 = local216; local226 <= local222; local226++) {
									if ((Static102.anIntArrayArrayArray4[local153][local182 - 1][local226] & local145) == 0) {
										break label460;
									}
								}
								local182--;
							}
							label449: while (local203 < 104) {
								for (local226 = local216; local226 <= local222; local226++) {
									if ((local145 & Static102.anIntArrayArrayArray4[local153][local203 + 1][local226]) == 0) {
										break label449;
									}
								}
								local203++;
							}
							if ((local203 + 1 - local182) * (local222 + 1 - local216) >= 4) {
								local226 = Static171.anIntArrayArrayArray7[local153][local182][local216];
								Static169.method2462(local151, 4, local182 * 128, local203 * 128 + 128, local216 * 128, local222 * 128 + 128, local226, local226);
								for (local232 = local182; local232 <= local203; local232++) {
									for (local298 = local216; local298 <= local222; local298++) {
										Static102.anIntArrayArrayArray4[local153][local232][local298] &= ~local145;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBILclient!ii;)V")
	public static void method1169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47 arg2) {
		if (Static13.aClass47_2 != null || Static180.aBoolean167 || (arg2 == null || Static124.method1935(arg2) == null)) {
			return;
		}
		Static13.aClass47_2 = arg2;
		Static35.aClass47_4 = Static124.method1935(arg2);
		Static123.anInt4488 = 0;
		Static169.aBoolean155 = false;
		Static56.anInt1141 = arg0;
		Static203.anInt4218 = arg1;
	}
}
