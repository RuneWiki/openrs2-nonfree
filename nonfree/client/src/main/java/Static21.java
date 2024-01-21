import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!v;")
	private static Class76 aClass76_190 = Static134.method2017("Loading)3)3)3");

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!v;")
	public static Class76 aClass76_191 = Static134.method2017("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!dd", name = "gc", descriptor = "Lclient!v;")
	private static Class76 aClass76_201 = Static134.method2017("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Lclient!v;")
	public static Class76 aClass76_192 = aClass76_201;

	@OriginalMember(owner = "client!dd", name = "Kb", descriptor = "Lclient!v;")
	public static Class76 aClass76_196 = Static134.method2017("(U(Y");

	@OriginalMember(owner = "client!dd", name = "Mb", descriptor = "Lclient!v;")
	public static Class76 aClass76_197 = Static134.method2017("leuchten2:");

	@OriginalMember(owner = "client!dd", name = "Nb", descriptor = "Lclient!v;")
	public static Class76 aClass76_198 = Static134.method2017("Abbrechen");

	@OriginalMember(owner = "client!dd", name = "Ub", descriptor = "Lclient!v;")
	public static Class76 aClass76_199 = aClass76_190;

	@OriginalMember(owner = "client!dd", name = "ac", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!dd", name = "mc", descriptor = "I")
	public static int anInt508 = 0;

	@OriginalMember(owner = "client!dd", name = "Vc", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 method323() {
		@Pc(7) Class4_Sub4_Sub5_Sub4 local7 = new Class4_Sub4_Sub5_Sub4();
		local7.anInt2610 = Static31.anIntArray96[0];
		local7.anInt2608 = Static55.anInt1464;
		local7.anIntArray388 = Static49.anIntArray159;
		local7.anInt2607 = Static34.anIntArray107[0];
		local7.anInt2611 = Static18.anInt350;
		local7.aByteArray69 = Static38.aByteArrayArray3[0];
		local7.anInt2609 = Static102.anIntArray321[0];
		local7.anInt2612 = Static25.anIntArray80[0];
		Static57.method1000();
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILclient!ie;)V")
	public static void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub4_Sub5_Sub2 arg4) {
		if (arg4 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 * arg1 + arg3 * arg3;
		@Pc(21) int local21 = Static14.anInt244 + Static60.anInt1576 & 0x7FF;
		if (local15 > 6400) {
			return;
		}
		@Pc(29) int local29 = Class4_Sub4_Sub5_Sub1.anIntArray119[local21];
		@Pc(37) int local37 = local29 * 256 / (Static27.anInt2814 + 256);
		@Pc(41) int local41 = Class4_Sub4_Sub5_Sub1.anIntArray118[local21];
		@Pc(49) int local49 = local41 * 256 / (Static27.anInt2814 + 256);
		@Pc(64) int local64 = local37 * arg3 - arg1 * local49 >> 16;
		@Pc(74) int local74 = arg3 * local49 + arg1 * local37 >> 16;
		if (local15 > 2500) {
			arg4.method909(Static65.aClass4_Sub4_Sub5_Sub4_2, arg0 + local74 + 94 + 4 - arg4.anInt1333 / 2, -(arg4.anInt1334 / 2) + arg2 - -83 - (local64 + 4));
		} else {
			arg4.method903(arg0 + local74 + 94 + 4 - arg4.anInt1333 / 2, -(arg4.anInt1334 / 2) + (arg2 - -83) + (-local64 - 4));
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ld;)V")
	public static void method325(@OriginalArg(1) Class4_Sub12 arg0) {
		arg0.aBoolean142 = false;
		if (arg0.aClass4_Sub6_5 != null) {
			arg0.aClass4_Sub6_5.anInt2131 = 0;
		}
		for (@Pc(24) Class4_Sub12 local24 = arg0.method1696(); local24 != null; local24 = arg0.method1694()) {
			method325(local24);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lclient!na;ILclient!wc;)V")
	public static void method327(@OriginalArg(0) Class50[] arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static62.aByteArrayArrayArray4[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static62.aByteArrayArrayArray4[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method1375(local11, local7);
						}
					}
				}
			}
		}
		Static81.anInt2004 += (int) (Math.random() * 5.0D) - 2;
		Static65.anInt423 += (int) (Math.random() * 5.0D) - 2;
		if (Static81.anInt2004 < -16) {
			Static81.anInt2004 = -16;
		}
		if (Static65.anInt423 < -8) {
			Static65.anInt423 = -8;
		}
		if (Static65.anInt423 > 8) {
			Static65.anInt423 = 8;
		}
		if (Static81.anInt2004 > 16) {
			Static81.anInt2004 = 16;
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(159) int local159;
		@Pc(180) int local180;
		@Pc(193) int local193;
		@Pc(209) int local209;
		@Pc(203) int local203;
		@Pc(199) int local199;
		@Pc(225) int local225;
		@Pc(273) int local273;
		@Pc(499) int local499;
		@Pc(543) int local543;
		@Pc(653) int local653;
		@Pc(643) int local643;
		@Pc(678) int local678;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(121) byte[][] local121 = Static84.aByteArrayArrayArray5[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local131 = local26 * 768 >> 8;
			for (local133 = 1; local133 < 103; local133++) {
				for (local137 = 1; local137 < 103; local137++) {
					local159 = Static66.anIntArrayArrayArray3[local7][local137 + 1][local133] - Static66.anIntArrayArrayArray3[local7][local137 - 1][local133];
					local180 = Static66.anIntArrayArrayArray3[local7][local137][local133 + 1] - Static66.anIntArrayArrayArray3[local7][local137][local133 - 1];
					local193 = (int) Math.sqrt((double) (local180 * local180 + local159 * local159 + 65536));
					local199 = (local180 << 8) / local193;
					local203 = 65536 / local193;
					local209 = (local159 << 8) / local193;
					local225 = (local199 * -50 + local209 * -50 + local203 * -10) / local131 + 96;
					local273 = (local121[local137][local133] >> 1) + (local121[local137][local133 + 1] >> 3) + (local121[local137][local133 + -1] >> 2) + (local121[local137 + -1][local133] >> 2) + (local121[local137 + 1][local133] >> 3);
					Static124.anIntArrayArray27[local137][local133] = local225 - local273;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static123.anIntArray392[local137] = 0;
				Static95.anIntArray312[local137] = 0;
				Static122.anIntArray390[local137] = 0;
				Static67.anIntArray232[local137] = 0;
				Static49.anIntArray158[local137] = 0;
			}
			for (local159 = -5; local159 < 109; local159++) {
				for (local180 = 0; local180 < 104; local180++) {
					local193 = local159 + 5;
					@Pc(393) int local393;
					if (local193 >= 0 && local193 < 104) {
						local209 = Static31.aByteArrayArrayArray2[local7][local193][local180] & 0xFF;
						if (local209 > 0) {
							@Pc(357) Class4_Sub4_Sub1 local357 = Static77.method1394(local209 - 1);
							Static123.anIntArray392[local180] += local357.anInt209;
							Static95.anIntArray312[local180] += local357.anInt199;
							Static122.anIntArray390[local180] += local357.anInt210;
							Static67.anIntArray232[local180] += local357.anInt211;
							local393 = Static49.anIntArray158[local180]++;
						}
					}
					local209 = local159 - 5;
					if (local209 >= 0 && local209 < 104) {
						local203 = Static31.aByteArrayArrayArray2[local7][local209][local180] & 0xFF;
						if (local203 > 0) {
							@Pc(428) Class4_Sub4_Sub1 local428 = Static77.method1394(local203 - 1);
							Static123.anIntArray392[local180] -= local428.anInt209;
							Static95.anIntArray312[local180] -= local428.anInt199;
							Static122.anIntArray390[local180] -= local428.anInt210;
							Static67.anIntArray232[local180] -= local428.anInt211;
							local393 = Static49.anIntArray158[local180]--;
						}
					}
				}
				if (local159 >= 1 && local159 < 103) {
					local209 = 0;
					local203 = 0;
					local199 = 0;
					local193 = 0;
					local225 = 0;
					for (local273 = -5; local273 < 109; local273++) {
						local499 = local273 + 5;
						if (local499 >= 0 && local499 < 104) {
							local225 += Static49.anIntArray158[local499];
							local193 += Static123.anIntArray392[local499];
							local203 += Static122.anIntArray390[local499];
							local199 += Static67.anIntArray232[local499];
							local209 += Static95.anIntArray312[local499];
						}
						local543 = local273 - 5;
						if (local543 >= 0 && local543 < 104) {
							local199 -= Static67.anIntArray232[local543];
							local225 -= Static49.anIntArray158[local543];
							local203 -= Static122.anIntArray390[local543];
							local209 -= Static95.anIntArray312[local543];
							local193 -= Static123.anIntArray392[local543];
						}
						if (local273 >= 1 && local273 < 103 && (!Static76.aBoolean119 || (Static62.aByteArrayArrayArray4[0][local159][local273] & 0x2) != 0 || (Static62.aByteArrayArrayArray4[local7][local159][local273] & 0x10) == 0 && Static38.method739(local159, local7, local273) == Static8.anInt164)) {
							if (Static132.anInt2824 > local7) {
								Static132.anInt2824 = local7;
							}
							local643 = Static31.aByteArrayArrayArray3[local7][local159][local273] & 0xFF;
							local653 = Static31.aByteArrayArrayArray2[local7][local159][local273] & 0xFF;
							if (local653 > 0 || local643 > 0) {
								@Pc(670) int local670 = Static66.anIntArrayArrayArray3[local7][local159 + 1][local273];
								local678 = Static66.anIntArrayArrayArray3[local7][local159][local273];
								@Pc(684) int local684 = Static124.anIntArrayArray27[local159][local273];
								@Pc(694) int local694 = Static66.anIntArrayArrayArray3[local7][local159][local273 + 1];
								@Pc(706) int local706 = Static66.anIntArrayArrayArray3[local7][local159 + 1][local273 + 1];
								@Pc(714) int local714 = Static124.anIntArrayArray27[local159 + 1][local273];
								@Pc(722) int local722 = Static124.anIntArrayArray27[local159][local273 + 1];
								@Pc(732) int local732 = Static124.anIntArrayArray27[local159 + 1][local273 + 1];
								@Pc(734) int local734 = -1;
								@Pc(736) int local736 = -1;
								@Pc(751) int local751;
								@Pc(745) int local745;
								if (local653 > 0) {
									local745 = local209 / local225;
									local751 = local193 * 256 / local199;
									@Pc(755) int local755 = local203 / local225;
									local734 = Static58.method1014(local745, local755, local751);
									local755 += Static81.anInt2004;
									@Pc(771) int local771 = Static65.anInt423 + local751 & 0xFF;
									if (local755 < 0) {
										local755 = 0;
									} else if (local755 > 255) {
										local755 = 255;
									}
									local736 = Static58.method1014(local745, local755, local771);
								}
								if (local7 > 0) {
									@Pc(795) boolean local795 = true;
									if (local653 == 0 && Static129.aByteArrayArrayArray7[local7][local159][local273] != 0) {
										local795 = false;
									}
									if (local643 > 0 && !Static114.method1725(local643 - 1).aBoolean112) {
										local795 = false;
									}
									if (local795 && local670 == local678 && local706 == local678 && local678 == local694) {
										Static29.anIntArrayArrayArray1[local7][local159][local273] |= 0x924;
									}
								}
								local751 = 0;
								if (local736 != -1) {
									local751 = Static37.anIntArray121[Static133.method2014(local736, 96)];
								}
								if (local643 == 0) {
									arg1.method1976(local7, local159, local273, 0, 0, -1, local678, local670, local706, local694, Static133.method2014(local734, local684), Static133.method2014(local734, local714), Static133.method2014(local734, local732), Static133.method2014(local734, local722), 0, 0, 0, 0, local751, 0);
								} else {
									@Pc(907) byte local907 = Static24.aByteArrayArrayArray1[local7][local159][local273];
									local745 = Static129.aByteArrayArrayArray7[local7][local159][local273] + 1;
									@Pc(923) Class4_Sub4_Sub11 local923 = Static114.method1725(local643 - 1);
									@Pc(926) int local926 = local923.anInt1785;
									@Pc(938) int local938;
									@Pc(940) int local940;
									@Pc(958) int local958;
									@Pc(963) int local963;
									if (local926 >= 0) {
										local940 = Static37.anInterface1_1.method777(local926);
										local938 = -1;
									} else if (local923.anInt1787 == 16711935) {
										local926 = -1;
										local938 = -2;
										local940 = -2;
									} else {
										local938 = Static58.method1014(local923.anInt1782, local923.anInt1779, local923.anInt1778);
										local958 = Static65.anInt423 + local923.anInt1778 & 0xFF;
										local963 = Static81.anInt2004 + local923.anInt1779;
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										local940 = Static58.method1014(local923.anInt1782, local963, local958);
									}
									local958 = 0;
									if (local940 != -2) {
										local958 = Static37.anIntArray121[Static96.method1547(local940, 96)];
									}
									if (local923.anInt1794 != -1) {
										local963 = local923.anInt1788 + Static65.anInt423 & 0xFF;
										@Pc(1019) int local1019 = Static81.anInt2004 + local923.anInt1784;
										if (local1019 < 0) {
											local1019 = 0;
										} else if (local1019 > 255) {
											local1019 = 255;
										}
										local940 = Static58.method1014(local923.anInt1780, local1019, local963);
										local958 = Static37.anIntArray121[Static96.method1547(local940, 96)];
									}
									arg1.method1976(local7, local159, local273, local745, local907, local926, local678, local670, local706, local694, Static133.method2014(local734, local684), Static133.method2014(local734, local714), Static133.method2014(local734, local732), Static133.method2014(local734, local722), Static96.method1547(local938, local684), Static96.method1547(local938, local714), Static96.method1547(local938, local732), Static96.method1547(local938, local722), local751, local958);
								}
							}
						}
					}
				}
			}
			for (local180 = 1; local180 < 103; local180++) {
				for (local193 = 1; local193 < 103; local193++) {
					arg1.method1973(local7, local193, local180, Static38.method739(local193, local7, local180));
				}
			}
			Static31.aByteArrayArrayArray2[local7] = null;
			Static31.aByteArrayArrayArray3[local7] = null;
			Static129.aByteArrayArrayArray7[local7] = null;
			Static24.aByteArrayArrayArray1[local7] = null;
			Static84.aByteArrayArrayArray5[local7] = null;
		}
		arg1.method1958();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static62.aByteArrayArrayArray4[1][local11][local26] & 0x2) == 2) {
					arg1.method1980(local11, local26);
				}
			}
		}
		local26 = 1;
		local133 = 4;
		local131 = 2;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local133 <<= 0x3;
				local26 <<= 0x3;
				local131 <<= 0x3;
			}
			for (local159 = 0; local159 <= local137; local159++) {
				for (local180 = 0; local180 <= 104; local180++) {
					for (local193 = 0; local193 <= 104; local193++) {
						if ((local26 & Static29.anIntArrayArrayArray1[local159][local193][local180]) != 0) {
							local199 = local159;
							for (local203 = local180; local203 < 104 && (Static29.anIntArrayArrayArray1[local159][local193][local203 + 1] & local26) != 0; local203++) {
							}
							local209 = local180;
							local225 = local159;
							while (local209 > 0 && (local26 & Static29.anIntArrayArrayArray1[local159][local193][local209 - 1]) != 0) {
								local209--;
							}
							label347: while (local199 > 0) {
								for (local273 = local209; local273 <= local203; local273++) {
									if ((Static29.anIntArrayArrayArray1[local199 - 1][local193][local273] & local26) == 0) {
										break label347;
									}
								}
								local199--;
							}
							label336: while (local225 < local137) {
								for (local273 = local209; local273 <= local203; local273++) {
									if ((local26 & Static29.anIntArrayArrayArray1[local225 + 1][local193][local273]) == 0) {
										break label336;
									}
								}
								local225++;
							}
							local273 = (local203 + 1 - local209) * (local225 + 1 - local199);
							if (local273 >= 8) {
								local543 = Static66.anIntArrayArrayArray3[local225][local193][local209] - 240;
								local653 = Static66.anIntArrayArrayArray3[local199][local193][local209];
								Static131.method1963(local137, 1, local193 * 128, local193 * 128, local209 * 128, local203 * 128 + 128, local543, local653);
								for (local643 = local199; local643 <= local225; local643++) {
									for (local678 = local209; local678 <= local203; local678++) {
										Static29.anIntArrayArrayArray1[local643][local193][local678] &= ~local26;
									}
								}
							}
						}
						if ((local131 & Static29.anIntArrayArrayArray1[local159][local193][local180]) != 0) {
							for (local209 = local193; local209 > 0 && (local131 & Static29.anIntArrayArrayArray1[local159][local209 - 1][local180]) != 0; local209--) {
							}
							local203 = local193;
							local199 = local159;
							while (local203 < 104 && (Static29.anIntArrayArrayArray1[local159][local203 + 1][local180] & local131) != 0) {
								local203++;
							}
							label402: while (local199 > 0) {
								for (local273 = local209; local273 <= local203; local273++) {
									if ((Static29.anIntArrayArrayArray1[local199 - 1][local273][local180] & local131) == 0) {
										break label402;
									}
								}
								local199--;
							}
							label390: for (local225 = local159; local225 < local137; local225++) {
								for (local273 = local209; local273 <= local203; local273++) {
									if ((Static29.anIntArrayArrayArray1[local225 + 1][local273][local180] & local131) == 0) {
										break label390;
									}
								}
							}
							local273 = (local225 + 1 - local199) * (local203 + 1 - local209);
							if (local273 >= 8) {
								local543 = Static66.anIntArrayArrayArray3[local225][local209][local180] - 240;
								local653 = Static66.anIntArrayArrayArray3[local199][local209][local180];
								Static131.method1963(local137, 2, local209 * 128, local203 * 128 + 128, local180 * 128, local180 * 128, local543, local653);
								for (local643 = local199; local643 <= local225; local643++) {
									for (local678 = local209; local678 <= local203; local678++) {
										Static29.anIntArrayArrayArray1[local643][local678][local180] &= ~local131;
									}
								}
							}
						}
						if ((local133 & Static29.anIntArrayArrayArray1[local159][local193][local180]) != 0) {
							local209 = local193;
							local203 = local193;
							for (local199 = local180; local199 > 0 && (Static29.anIntArrayArrayArray1[local159][local193][local199 - 1] & local133) != 0; local199--) {
							}
							for (local225 = local180; local225 < 104 && (Static29.anIntArrayArrayArray1[local159][local193][local225 + 1] & local133) != 0; local225++) {
							}
							label456: while (local209 > 0) {
								for (local273 = local199; local273 <= local225; local273++) {
									if ((Static29.anIntArrayArrayArray1[local159][local209 - 1][local273] & local133) == 0) {
										break label456;
									}
								}
								local209--;
							}
							label445: while (local203 < 104) {
								for (local273 = local199; local273 <= local225; local273++) {
									if ((local133 & Static29.anIntArrayArrayArray1[local159][local203 + 1][local273]) == 0) {
										break label445;
									}
								}
								local203++;
							}
							if ((local203 + 1 - local209) * (local225 + 1 - local199) >= 4) {
								local273 = Static66.anIntArrayArrayArray3[local159][local209][local199];
								Static131.method1963(local137, 4, local209 * 128, local203 * 128 + 128, local199 * 128, local225 * 128 + 128, local273, local273);
								for (local499 = local209; local499 <= local203; local499++) {
									for (local543 = local199; local543 <= local225; local543++) {
										Static29.anIntArrayArrayArray1[local159][local499][local543] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!v;BLclient!v;)V")
	public static void method328(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) Class76 arg2) {
		Static34.method618(arg2, arg0, null, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method330() {
		aClass76_192 = null;
		aClass76_201 = null;
		aClass76_198 = null;
		aClass76_199 = null;
		aClass76_191 = null;
		aClass76_190 = null;
		aBooleanArray4 = null;
		aClass76_197 = null;
		aClass76_196 = null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
	public static boolean method334(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
