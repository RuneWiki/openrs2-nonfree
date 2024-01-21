import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "J")
	public static long aLong112;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "Lclient!ag;")
	public static Class4 aClass4_85;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1133 = Static161.method2971("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1134 = Static161.method2971("Wordpack geladen)3");

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1135 = Static161.method2971("<br>(X100(U(Y");

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1136 = Static161.method2971(")2");

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1137 = Static161.method2971("Abbrechen");

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "[Lclient!ce;")
	public static Class1_Sub8[] aClass1_Sub8Array1 = new Class1_Sub8[2048];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!dd;BLclient!dd;Lclient!dd;I)V")
	public static void method2402(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static103.anIntArray267[local7] = Static103.anIntArray267[local7 - 1];
			Static81.aClass13Array18[local7] = Static81.aClass13Array18[local7 - 1];
			Static54.aClass13Array14[local7] = Static54.aClass13Array14[local7 - 1];
			Static22.aClass13Array17[local7] = Static22.aClass13Array17[local7 - 1];
		}
		Static103.anIntArray267[0] = arg3;
		Static81.aClass13Array18[0] = arg1;
		Static54.aClass13Array14[0] = arg0;
		Static114.anInt3070++;
		Static22.aClass13Array17[0] = arg2;
		Static164.anInt3862 = Static10.anInt388;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIII)V")
	public static void method2403(@OriginalArg(0) boolean arg0) {
		Static135.anInt3382 = 22050;
		Static97.aBoolean323 = arg0;
		Static162.anInt3811 = 2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!d;I)V")
	public static void method2404(@OriginalArg(0) Class12[] arg0) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local19 = 0; local19 < 104; local19++) {
				for (local23 = 0; local23 < 104; local23++) {
					if ((Static35.aByteArrayArrayArray20[local7][local19][local23] & 0x1) == 1) {
						@Pc(38) int local38 = local7;
						if ((Static35.aByteArrayArrayArray20[1][local19][local23] & 0x2) == 2) {
							local38 = local7 - 1;
						}
						if (local38 >= 0) {
							arg0[local38].method813(local19, local23);
						}
					}
				}
			}
		}
		Static55.anInt1770 += (int) (Math.random() * 5.0D) - 2;
		Static157.anInt3725 += (int) (Math.random() * 5.0D) - 2;
		if (Static55.anInt1770 < -8) {
			Static55.anInt1770 = -8;
		}
		if (Static157.anInt3725 < -16) {
			Static157.anInt3725 = -16;
		}
		if (Static157.anInt3725 > 16) {
			Static157.anInt3725 = 16;
		}
		if (Static55.anInt1770 > 8) {
			Static55.anInt1770 = 8;
		}
		local19 = Static55.anInt1770 >> 2 << 10;
		@Pc(125) int[][] local125 = new int[104][104];
		local23 = Static157.anInt3725 >> 1;
		@Pc(133) int[][] local133 = new int[104][104];
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(157) int local157;
		@Pc(161) int local161;
		@Pc(253) int local253;
		@Pc(186) int local186;
		@Pc(207) int local207;
		@Pc(220) int local220;
		@Pc(232) int local232;
		@Pc(236) int local236;
		@Pc(226) int local226;
		@Pc(302) int local302;
		@Pc(522) int local522;
		@Pc(561) int local561;
		@Pc(825) int local825;
		for (@Pc(135) int local135 = 0; local135 < 4; local135++) {
			@Pc(141) byte[][] local141 = Static81.aByteArrayArrayArray27[local135];
			local149 = (int) Math.sqrt(5100.0D);
			local155 = local149 * 768 >> 8;
			for (local157 = 1; local157 < 103; local157++) {
				for (local161 = 1; local161 < 103; local161++) {
					local186 = Static183.anIntArrayArrayArray8[local135][local161 + 1][local157] - Static183.anIntArrayArrayArray8[local135][local161 - 1][local157];
					local207 = Static183.anIntArrayArrayArray8[local135][local161][local157 + 1] - Static183.anIntArrayArrayArray8[local135][local161][local157 - 1];
					local220 = (int) Math.sqrt((double) (local186 * local186 + local207 * local207 + 65536));
					local226 = (local207 << 8) / local220;
					local232 = (local186 << 8) / local220;
					local236 = -65536 / local220;
					local253 = (local226 * -50 + local232 * -50 + local236 * -10) / local155 + 74;
					local302 = (local141[local161][local157] >> 1) + (local141[local161][local157 - 1] >> 2) + (local141[local161 - -1][local157] >> 3) + (local141[local161 - 1][local157] >> 2) + (local141[local161][local157 + 1] >> 3);
					local133[local161][local157] = local253 - local302;
				}
			}
			for (local161 = 0; local161 < 104; local161++) {
				Static62.anIntArray249[local161] = 0;
				Static87.anIntArray240[local161] = 0;
				Static90.anIntArray252[local161] = 0;
				Static67.anIntArray207[local161] = 0;
				Static176.anIntArray444[local161] = 0;
			}
			for (local253 = -5; local253 < 104; local253++) {
				for (local186 = 0; local186 < 104; local186++) {
					local207 = local253 + 5;
					@Pc(421) int local421;
					if (local207 < 104) {
						local220 = Static62.aByteArrayArrayArray30[local135][local207][local186] & 0xFF;
						if (local220 > 0) {
							@Pc(385) Class1_Sub2_Sub17 local385 = Static181.method2981(local220 - 1);
							Static62.anIntArray249[local186] += local385.anInt3622;
							Static87.anIntArray240[local186] += local385.anInt3613;
							Static90.anIntArray252[local186] += local385.anInt3617;
							Static67.anIntArray207[local186] += local385.anInt3616;
							local421 = Static176.anIntArray444[local186]++;
						}
					}
					local220 = local253 - 5;
					if (local220 >= 0) {
						local232 = Static62.aByteArrayArrayArray30[local135][local220][local186] & 0xFF;
						if (local232 > 0) {
							@Pc(454) Class1_Sub2_Sub17 local454 = Static181.method2981(local232 - 1);
							Static62.anIntArray249[local186] -= local454.anInt3622;
							Static87.anIntArray240[local186] -= local454.anInt3613;
							Static90.anIntArray252[local186] -= local454.anInt3617;
							Static67.anIntArray207[local186] -= local454.anInt3616;
							local421 = Static176.anIntArray444[local186]--;
						}
					}
				}
				if (local253 >= 0) {
					local207 = 0;
					local232 = 0;
					local220 = 0;
					local226 = 0;
					local236 = 0;
					for (local302 = -5; local302 < 104; local302++) {
						local522 = local302 + 5;
						if (local522 < 104) {
							local226 += Static176.anIntArray444[local522];
							local232 += Static90.anIntArray252[local522];
							local236 += Static67.anIntArray207[local522];
							local207 += Static62.anIntArray249[local522];
							local220 += Static87.anIntArray240[local522];
						}
						local561 = local302 - 5;
						if (local561 >= 0) {
							local232 -= Static90.anIntArray252[local561];
							local226 -= Static176.anIntArray444[local561];
							local236 -= Static67.anIntArray207[local561];
							local207 -= Static62.anIntArray249[local561];
							local220 -= Static87.anIntArray240[local561];
						}
						if (local302 >= 0 && local226 > 0) {
							local125[local253][local302] = Static156.method2670(local207 * 256 / local236, local232 / local226, local220 / local226);
						}
					}
				}
			}
			for (local186 = 1; local186 < 103; local186++) {
				for (local207 = 1; local207 < 103; local207++) {
					if (!Static30.aBoolean72 || (Static35.aByteArrayArrayArray20[0][local186][local207] & 0x2) != 0 || (Static35.aByteArrayArrayArray20[local135][local186][local207] & 0x10) == 0 && Static30.method879(local186, local207, local135) == Static136.anInt3397) {
						if (Static21.anInt782 > local135) {
							Static21.anInt782 = local135;
						}
						local232 = Static131.aByteArrayArrayArray36[local135][local186][local207] & 0xFF;
						local220 = Static62.aByteArrayArrayArray30[local135][local186][local207] & 0xFF;
						if (local220 > 0 || local232 > 0) {
							local236 = Static183.anIntArrayArrayArray8[local135][local186][local207];
							local226 = Static183.anIntArrayArrayArray8[local135][local186 + 1][local207];
							local302 = Static183.anIntArrayArrayArray8[local135][local186 + 1][local207 + 1];
							local522 = Static183.anIntArrayArrayArray8[local135][local186][local207 + 1];
							if (local135 > 0) {
								@Pc(759) boolean local759 = true;
								if (local220 == 0 && Static170.aByteArrayArrayArray43[local135][local186][local207] != 0) {
									local759 = false;
								}
								if (local232 > 0 && !Static151.method3034(local232 - 1).aBoolean174) {
									local759 = false;
								}
								if (local759 && local236 == local226 && local302 == local236 && local522 == local236) {
									Static160.anIntArrayArrayArray7[local135][local186][local207] |= 0x924;
								}
							}
							@Pc(840) int local840;
							@Pc(863) int local863;
							if (local220 <= 0) {
								local561 = -1;
								local825 = 0;
							} else {
								local561 = local125[local186][local207];
								local840 = (local561 & 0x7F) + local23;
								if (local840 < 0) {
									local840 = 0;
								} else if (local840 > 127) {
									local840 = 127;
								}
								local863 = (local561 & 0x380) + (local561 + local19 & 0xFC00) + local840;
								local825 = Static9.anIntArray39[Static21.method688(local863, 96)];
							}
							local863 = local133[local186 + 1][local207];
							local840 = local133[local186][local207];
							@Pc(894) int local894 = local133[local186 + 1][local207 + 1];
							@Pc(902) int local902 = local133[local186][local207 + 1];
							if (local232 == 0) {
								Static94.method1978(local135, local186, local207, 0, 0, -1, local236, local226, local302, local522, Static21.method688(local561, local840), Static21.method688(local561, local863), Static21.method688(local561, local894), Static21.method688(local561, local902), 0, 0, 0, 0, local825, 0);
							} else {
								@Pc(949) int local949 = Static170.aByteArrayArrayArray43[local135][local186][local207] + 1;
								@Pc(957) byte local957 = Static19.aByteArrayArrayArray15[local135][local186][local207];
								@Pc(963) Class1_Sub2_Sub9 local963 = Static151.method3034(local232 - 1);
								@Pc(966) int local966 = local963.anInt2300;
								if (local966 >= 0 && !Static9.anInterface3_1.method2052(local966)) {
									local966 = -1;
								}
								@Pc(988) int local988;
								@Pc(986) int local986;
								@Pc(999) int local999;
								@Pc(1026) int local1026;
								if (local966 >= 0) {
									local986 = Static9.anIntArray39[Static64.method1437(96, Static9.anInterface3_1.method2048(local966))];
									local988 = -1;
								} else if (local963.anInt2306 == -1) {
									local986 = 0;
									local988 = -2;
								} else {
									local988 = local963.anInt2306;
									local999 = (local988 & 0x7F) + local23;
									if (local999 < 0) {
										local999 = 0;
									} else if (local999 > 127) {
										local999 = 127;
									}
									local1026 = (local988 & 0x380) + (local988 + local19 & 0xFC00) + local999;
									local986 = Static9.anIntArray39[Static64.method1437(96, local1026)];
								}
								if (local963.anInt2298 >= 0) {
									local999 = local963.anInt2298;
									local1026 = local23 + (local999 & 0x7F);
									if (local1026 < 0) {
										local1026 = 0;
									} else if (local1026 > 127) {
										local1026 = 127;
									}
									@Pc(1087) int local1087 = local1026 + (local19 + local999 & 0xFC00) + (local999 & 0x380);
									local986 = Static9.anIntArray39[Static64.method1437(96, local1087)];
								}
								Static94.method1978(local135, local186, local207, local949, local957, local966, local236, local226, local302, local522, Static21.method688(local561, local840), Static21.method688(local561, local863), Static21.method688(local561, local894), Static21.method688(local561, local902), Static64.method1437(local840, local988), Static64.method1437(local863, local988), Static64.method1437(local894, local988), Static64.method1437(local902, local988), local825, local986);
							}
						}
					}
				}
			}
			for (local207 = 1; local207 < 103; local207++) {
				for (local220 = 1; local220 < 103; local220++) {
					Static142.method2534(local135, local220, local207, Static30.method879(local220, local207, local135));
				}
			}
			Static62.aByteArrayArrayArray30[local135] = null;
			Static131.aByteArrayArrayArray36[local135] = null;
			Static170.aByteArrayArrayArray43[local135] = null;
			Static19.aByteArrayArrayArray15[local135] = null;
			Static81.aByteArrayArrayArray27[local135] = null;
		}
		Static162.method2776();
		@Pc(1214) int local1214;
		for (@Pc(1210) int local1210 = 0; local1210 < 104; local1210++) {
			for (local1214 = 0; local1214 < 104; local1214++) {
				if ((Static35.aByteArrayArrayArray20[1][local1210][local1214] & 0x2) == 2) {
					Static123.method2283(local1210, local1214);
				}
			}
		}
		@Pc(1244) int local1244 = 2;
		local1214 = 1;
		local149 = 4;
		for (local155 = 0; local155 < 4; local155++) {
			if (local155 > 0) {
				local149 <<= 0x3;
				local1244 <<= 0x3;
				local1214 <<= 0x3;
			}
			for (local157 = 0; local157 <= local155; local157++) {
				for (local161 = 0; local161 <= 104; local161++) {
					for (local253 = 0; local253 <= 104; local253++) {
						if ((Static160.anIntArrayArrayArray7[local157][local253][local161] & local1214) != 0) {
							for (local186 = local161; local186 > 0 && (Static160.anIntArrayArrayArray7[local157][local253][local186 - 1] & local1214) != 0; local186--) {
							}
							local207 = local161;
							local232 = local157;
							while (local207 < 104 && (local1214 & Static160.anIntArrayArrayArray7[local157][local253][local207 + 1]) != 0) {
								local207++;
							}
							label350: for (local220 = local157; local220 > 0; local220--) {
								for (local236 = local186; local236 <= local207; local236++) {
									if ((Static160.anIntArrayArrayArray7[local220 - 1][local253][local236] & local1214) == 0) {
										break label350;
									}
								}
							}
							label339: while (local155 > local232) {
								for (local236 = local186; local236 <= local207; local236++) {
									if ((local1214 & Static160.anIntArrayArrayArray7[local232 + 1][local253][local236]) == 0) {
										break label339;
									}
								}
								local232++;
							}
							local236 = (local207 + 1 - local186) * ((local232 - local220) + 1);
							if (local236 >= 8) {
								local302 = Static183.anIntArrayArrayArray8[local232][local253][local186] - 240;
								local522 = Static183.anIntArrayArrayArray8[local220][local253][local186];
								Static135.method2425(local155, 1, local253 * 128, local253 * 128, local186 * 128, local207 * 128 + 128, local302, local522);
								for (local561 = local220; local561 <= local232; local561++) {
									for (local825 = local186; local825 <= local207; local825++) {
										Static160.anIntArrayArrayArray7[local561][local253][local825] &= ~local1214;
									}
								}
							}
						}
						if ((local1244 & Static160.anIntArrayArrayArray7[local157][local253][local161]) != 0) {
							local186 = local253;
							for (local207 = local253; local207 < 104 && (Static160.anIntArrayArrayArray7[local157][local207 + 1][local161] & local1244) != 0; local207++) {
							}
							while (local186 > 0 && (Static160.anIntArrayArrayArray7[local157][local186 - 1][local161] & local1244) != 0) {
								local186--;
							}
							label406: for (local220 = local157; local220 > 0; local220--) {
								for (local236 = local186; local236 <= local207; local236++) {
									if ((Static160.anIntArrayArrayArray7[local220 - 1][local236][local161] & local1244) == 0) {
										break label406;
									}
								}
							}
							label394: for (local232 = local157; local232 < local155; local232++) {
								for (local236 = local186; local236 <= local207; local236++) {
									if ((local1244 & Static160.anIntArrayArrayArray7[local232 + 1][local236][local161]) == 0) {
										break label394;
									}
								}
							}
							local236 = (local232 + 1 - local220) * (local207 + 1 - local186);
							if (local236 >= 8) {
								local302 = Static183.anIntArrayArrayArray8[local232][local186][local161] - 240;
								local522 = Static183.anIntArrayArrayArray8[local220][local186][local161];
								Static135.method2425(local155, 2, local186 * 128, local207 * 128 + 128, local161 * 128, local161 * 128, local302, local522);
								for (local561 = local220; local561 <= local232; local561++) {
									for (local825 = local186; local825 <= local207; local825++) {
										Static160.anIntArrayArrayArray7[local561][local825][local161] &= ~local1244;
									}
								}
							}
						}
						if ((Static160.anIntArrayArrayArray7[local157][local253][local161] & local149) != 0) {
							local186 = local253;
							local207 = local253;
							for (local232 = local161; local232 < 104 && (local149 & Static160.anIntArrayArrayArray7[local157][local253][local232 + 1]) != 0; local232++) {
							}
							for (local220 = local161; local220 > 0 && (Static160.anIntArrayArrayArray7[local157][local253][local220 - 1] & local149) != 0; local220--) {
							}
							label460: while (local186 > 0) {
								for (local236 = local220; local236 <= local232; local236++) {
									if ((Static160.anIntArrayArrayArray7[local157][local186 - 1][local236] & local149) == 0) {
										break label460;
									}
								}
								local186--;
							}
							label449: while (local207 < 104) {
								for (local236 = local220; local236 <= local232; local236++) {
									if ((local149 & Static160.anIntArrayArrayArray7[local157][local207 + 1][local236]) == 0) {
										break label449;
									}
								}
								local207++;
							}
							if ((local232 + 1 - local220) * (-local186 + 1 + local207) >= 4) {
								local236 = Static183.anIntArrayArrayArray8[local157][local186][local220];
								Static135.method2425(local155, 4, local186 * 128, local207 * 128 + 128, local220 * 128, local232 * 128 + 128, local236, local236);
								for (local226 = local186; local226 <= local207; local226++) {
									for (local302 = local220; local302 <= local232; local302++) {
										Static160.anIntArrayArrayArray7[local157][local226][local302] &= ~local149;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BB)V")
	public static void method2405(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		local10.anInt2195 = arg0.length - 2;
		Static123.anInt3217 = local10.method1642();
		Static180.aByteArrayArray10 = new byte[Static123.anInt3217][];
		Static106.anIntArray285 = new int[Static123.anInt3217];
		Static12.anIntArray51 = new int[Static123.anInt3217];
		Static184.anIntArray449 = new int[Static123.anInt3217];
		Static130.anIntArray324 = new int[Static123.anInt3217];
		local10.anInt2195 = arg0.length - Static123.anInt3217 * 8 - 7;
		Static32.anInt4094 = local10.method1642();
		Static51.anInt1673 = local10.method1642();
		@Pc(62) int local62 = (local10.method1607() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static123.anInt3217; local64++) {
			Static184.anIntArray449[local64] = local10.method1642();
		}
		for (@Pc(78) int local78 = 0; local78 < Static123.anInt3217; local78++) {
			Static130.anIntArray324[local78] = local10.method1642();
		}
		for (@Pc(96) int local96 = 0; local96 < Static123.anInt3217; local96++) {
			Static12.anIntArray51[local96] = local10.method1642();
		}
		for (@Pc(122) int local122 = 0; local122 < Static123.anInt3217; local122++) {
			Static106.anIntArray285[local122] = local10.method1642();
		}
		local10.anInt2195 = arg0.length - Static123.anInt3217 * 8 - (local62 - 1) * 3 - 7;
		Static104.anIntArray268 = new int[local62];
		for (@Pc(155) int local155 = 1; local155 < local62; local155++) {
			Static104.anIntArray268[local155] = local10.method1618();
			if (Static104.anIntArray268[local155] == 0) {
				Static104.anIntArray268[local155] = 1;
			}
		}
		local10.anInt2195 = 0;
		for (@Pc(184) int local184 = 0; local184 < Static123.anInt3217; local184++) {
			@Pc(190) int local190 = Static106.anIntArray285[local184];
			@Pc(194) int local194 = Static12.anIntArray51[local184];
			@Pc(198) int local198 = local194 * local190;
			@Pc(201) byte[] local201 = new byte[local198];
			Static180.aByteArrayArray10[local184] = local201;
			@Pc(209) int local209 = local10.method1607();
			@Pc(218) int local218;
			if (local209 == 0) {
				for (local218 = 0; local218 < local198; local218++) {
					local201[local218] = local10.method1611();
				}
			} else if (local209 == 1) {
				for (local218 = 0; local218 < local194; local218++) {
					for (@Pc(222) int local222 = 0; local222 < local190; local222++) {
						local201[local218 + local222 * local194] = local10.method1611();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	public static void method2406() {
		aClass13_1136 = null;
		aClass13_1137 = null;
		aClass1_Sub8Array1 = null;
		aClass13_1133 = null;
		aClass13_1134 = null;
		aClass13_1135 = null;
		aClass4_85 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!dd;)V")
	public static void method2407(@OriginalArg(1) Class13 arg0) {
		if (Static163.aClass16_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class13 local13 = Static117.aClass13_1041.method909(Static163.aClass16_5.anApplet1);
			@Pc(19) Class13 local19 = Static82.aClass13_773.method909(Static163.aClass16_5.anApplet1);
			@Pc(44) Class13 local44 = Static57.method1349(new Class13[] { local13, Static147.aClass13_1231, arg0, Static57.aClass13_607, local19 });
			if (arg0.method904() == 0) {
				local44 = Static57.method1349(new Class13[] { local44, Static125.aClass13_1077 });
			} else {
				local44 = Static57.method1349(new Class13[] { local44, Static22.aClass13_743, Static133.method2391(Static169.method2888() + 94608000000L), Static142.aClass13_1207, Static110.method2154(94608000L) });
			}
			Static57.method1349(new Class13[] { Static3.aClass13_34, local44, Static145.aClass13_1229 }).method907(Static163.aClass16_5.anApplet1);
		} catch (@Pc(125) Throwable local125) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public static void method2408() {
		for (@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static124.aClass82_9.method2849(); local14 != null; local14 = (Class1_Sub7) Static124.aClass82_9.method2855()) {
			if (local14.anInt712 > 0) {
				local14.anInt712--;
			}
			if (local14.anInt712 != 0) {
				if (local14.anInt719 > 0) {
					local14.anInt719--;
				}
				if (local14.anInt719 == 0 && local14.anInt718 >= 1 && local14.anInt727 >= 1 && local14.anInt718 <= 102 && local14.anInt727 <= 102 && (local14.anInt725 < 0 || Static181.method2985(local14.anInt725, local14.anInt713))) {
					Static8.method304(local14.anInt727, local14.anInt717, local14.anInt718, local14.anInt728, local14.anInt729, local14.anInt713, local14.anInt725);
					local14.anInt719 = -1;
					if (local14.anInt720 == local14.anInt725 && local14.anInt720 == -1) {
						local14.method3056();
					} else if (local14.anInt725 == local14.anInt720 && local14.anInt728 == local14.anInt714 && local14.anInt713 == local14.anInt722) {
						local14.method3056();
					}
				}
			} else if (local14.anInt720 < 0 || Static181.method2985(local14.anInt720, local14.anInt722)) {
				Static8.method304(local14.anInt727, local14.anInt717, local14.anInt718, local14.anInt714, local14.anInt729, local14.anInt722, local14.anInt720);
				local14.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method2409() {
		for (@Pc(3) int local3 = -1; local3 < Static65.anInt1929; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static30.anIntArray116[local3];
			}
			@Pc(21) Class1_Sub2_Sub2_Sub2_Sub2 local21 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local11];
			if (local21 != null && local21.anInt2589 > 0) {
				local21.anInt2589--;
				if (local21.anInt2589 == 0) {
					local21.aClass13_846 = null;
				}
			}
		}
		for (@Pc(59) int local59 = 0; local59 < Static74.anInt2127; local59++) {
			@Pc(65) int local65 = Static66.anIntArray202[local59];
			@Pc(69) Class1_Sub2_Sub2_Sub2_Sub1 local69 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local65];
			if (local69 != null && local69.anInt2589 > 0) {
				local69.anInt2589--;
				if (local69.anInt2589 == 0) {
					local69.aClass13_846 = null;
				}
			}
		}
	}
}
