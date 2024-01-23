import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "[Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1[] aClass1_Sub2_Sub14_Sub1Array2;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "Lclient!dm;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Lclient!kb;")
	public static Class83 aClass83_125;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
	public static int[] anIntArray365 = new int[14];

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString119 = "Loaded wordpack";

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "J")
	public static long aLong142 = 0L;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	public static int anInt4085 = 0;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19 = null;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString120 = "slide:";

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)V")
	public static void method3281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19;
		@Pc(33) int local33;
		if (Static272.anInt5854 == 0) {
			@Pc(13) int local13 = Static148.anInt3502;
			@Pc(15) int local15 = Static9.anInt271;
			@Pc(17) int local17 = Static234.anInt5157;
			local19 = Static91.anInt2137;
			local33 = (arg3 - arg1) * (local17 - local19) / arg0 + local19;
			@Pc(47) int local47 = (arg5 - arg4) * (local13 - local15) / arg2 + local15;
			if (Static16.aBoolean22 && (Static177.anInt3986 & 0x40) != 0) {
				@Pc(87) Class116 local87 = Static127.method2179(Static19.anInt461, Static148.anInt3504);
				if (local87 == null) {
					Static2.method4409();
				} else {
					Static106.method1718(Static266.anInt5785, (short) 24, local47, local33, " ->", Static280.aString193, 0L);
				}
			} else {
				if (Static230.anInt5101 == 1) {
					Static106.method1718(-1, (short) 9, local47, local33, "", Static265.aString186, 0L);
				}
				Static106.method1718(-1, (short) 29, local47, local33, "", Static2.aString184, 0L);
			}
		}
		@Pc(109) long local109 = -1L;
		for (local19 = 0; local19 < Static129.anInt2873; local19++) {
			@Pc(122) long local122 = Static174.aLongArray9[local19];
			local33 = (int) local122 & 0x7F;
			@Pc(134) int local134 = (int) local122 >> 7 & 0x7F;
			@Pc(141) int local141 = (int) local122 >> 29 & 0x3;
			@Pc(148) int local148 = (int) (local122 >>> 32) & Integer.MAX_VALUE;
			if (local122 != local109) {
				local109 = local122;
				@Pc(265) int local265;
				if (local141 == 2 && Static14.method316(Static145.anInt3477, local33, local134, local122)) {
					@Pc(174) Class30 local174 = Static268.method4511(local148);
					if (local174.anIntArray93 != null) {
						local174 = local174.method688();
					}
					if (local174 == null) {
						continue;
					}
					if (Static272.anInt5854 == 1) {
						Static106.method1718(Static180.anInt4069, (short) 16, local33, local134, Static95.aString70 + " -> <col=00ffff>" + local174.aString30, Static5.aString3, local122);
					} else if (Static16.aBoolean22) {
						@Pc(203) Class1_Sub2_Sub19 local203 = Static27.anInt755 == -1 ? null : Static114.method1863(Static27.anInt755);
						if ((Static177.anInt3986 & 0x4) != 0 && (local203 == null || local174.method686(local203.anInt5556, Static27.anInt755) != local203.anInt5556)) {
							Static106.method1718(Static266.anInt5785, (short) 36, local33, local134, Static128.aString80 + " -> <col=00ffff>" + local174.aString30, Static280.aString193, local122);
						}
					} else {
						@Pc(250) String[] local250 = local174.aStringArray4;
						if (Static208.aBoolean246) {
							local250 = Static40.method1451(local250);
						}
						if (local250 != null) {
							for (local265 = 4; local265 >= 0; local265--) {
								if (local250[local265] != null) {
									@Pc(282) int local282 = -1;
									@Pc(284) short local284 = 0;
									if (local265 == 0) {
										local284 = 37;
									}
									if (local265 == 1) {
										local284 = 48;
									}
									if (local174.anInt838 == local265) {
										local282 = local174.anInt842;
									}
									if (local265 == 2) {
										local284 = 57;
									}
									if (local265 == local174.anInt859) {
										local282 = local174.anInt854;
									}
									if (local265 == 3) {
										local284 = 51;
									}
									if (local265 == 4) {
										local284 = 1005;
									}
									Static106.method1718(local282, local284, local33, local134, "<col=00ffff>" + local174.aString30, local250[local265], local122);
								}
							}
						}
						Static106.method1718(Static204.anInt4559, (short) 1007, local33, local134, "<col=00ffff>" + local174.aString30, Static140.aString92, (long) local174.anInt875);
					}
				}
				@Pc(515) int local515;
				@Pc(526) int local526;
				@Pc(467) int local467;
				@Pc(481) int local481;
				@Pc(490) Class25_Sub1_Sub2 local490;
				@Pc(605) Class25_Sub1_Sub1 local605;
				if (local141 == 1) {
					@Pc(406) Class25_Sub1_Sub2 local406 = Static27.aClass25_Sub1_Sub2Array1[local148];
					if ((local406.aClass143_1.anInt5188 & 0x1) == 0 && (local406.anInt1635 & 0x7F) == 0 && (local406.anInt1604 & 0x7F) == 0 || (local406.aClass143_1.anInt5188 & 0x1) == 1 && (local406.anInt1635 & 0x7F) == 64 && (local406.anInt1604 & 0x7F) == 64) {
						local467 = local406.anInt1635 - (local406.aClass143_1.anInt5188 - 1) * 64;
						local265 = local406.anInt1604 + 64 - local406.aClass143_1.anInt5188 * 64;
						for (local481 = 0; local481 < Static147.anInt3493; local481++) {
							local490 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local481]];
							if (local490 != null && !local490.aBoolean88 && local490 != local406 && local490.aBoolean89) {
								local515 = local490.anInt1635 - (local490.aClass143_1.anInt5188 - 1) * 64;
								local526 = local490.anInt1604 + 64 - local490.aClass143_1.anInt5188 * 64;
								if (local515 >= local467 && local406.aClass143_1.anInt5188 - (local515 - local467 >> 7) >= local490.aClass143_1.anInt5188 && local265 <= local526 && local490.aClass143_1.anInt5188 <= local406.aClass143_1.anInt5188 - (local526 - local265 >> 7)) {
									Static165.method3077(local33, local134, Static65.anIntArray25[local481], local490.aClass143_1);
									local490.aBoolean88 = true;
								}
							}
						}
						for (local481 = 0; local481 < Static266.anInt5789; local481++) {
							local605 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local481]];
							if (local605 != null && !local605.aBoolean88 && local605.aBoolean89) {
								local515 = local605.anInt1635 + 64 - local605.method1243() * 64;
								local526 = local605.anInt1604 + 64 - local605.method1243() * 64;
								if (local467 <= local515 && local605.method1243() <= local406.aClass143_1.anInt5188 - (local515 - local467 >> 7) && local265 <= local526 && local605.method1243() <= local406.aClass143_1.anInt5188 - (local526 - local265 >> 7)) {
									Static119.method1958(local134, Static39.anIntArray108[local481], local605, local33);
									local605.aBoolean88 = true;
								}
							}
						}
					}
					if (local406.aBoolean88) {
						continue;
					}
					Static165.method3077(local33, local134, local148, local406.aClass143_1);
					local406.aBoolean88 = true;
				}
				if (local141 == 0) {
					@Pc(708) Class25_Sub1_Sub1 local708 = Static271.aClass25_Sub1_Sub1Array1[local148];
					if ((local708.anInt1635 & 0x7F) == 64 && (local708.anInt1604 & 0x7F) == 64) {
						local467 = local708.anInt1635 - (local708.method1243() - 1) * 64;
						local265 = local708.anInt1604 - (local708.method1243() - 1) * 64;
						for (local481 = 0; local481 < Static147.anInt3493; local481++) {
							local490 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local481]];
							if (local490 != null && !local490.aBoolean88 && local490.aBoolean89) {
								local515 = local490.anInt1635 + 64 - local490.aClass143_1.anInt5188 * 64;
								local526 = local490.anInt1604 + 64 - local490.aClass143_1.anInt5188 * 64;
								if (local467 <= local515 && local490.aClass143_1.anInt5188 <= local708.method1243() - (local515 - local467 >> 7) && local526 >= local265 && local490.aClass143_1.anInt5188 <= local708.method1243() - (local526 - local265 >> 7)) {
									Static165.method3077(local33, local134, Static65.anIntArray25[local481], local490.aClass143_1);
									local490.aBoolean88 = true;
								}
							}
						}
						for (local481 = 0; local481 < Static266.anInt5789; local481++) {
							local605 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local481]];
							if (local605 != null && !local605.aBoolean88 && local605 != local708 && local605.aBoolean89) {
								local515 = local605.anInt1635 + 64 - local605.method1243() * 64;
								local526 = local605.anInt1604 - (local605.method1243() - 1) * 64;
								if (local515 >= local467 && local605.method1243() <= local708.method1243() - (local515 - local467 >> 7) && local526 >= local265 && local605.method1243() <= local708.method1243() - (local526 - local265 >> 7)) {
									Static119.method1958(local134, Static39.anIntArray108[local481], local605, local33);
									local605.aBoolean88 = true;
								}
							}
						}
					}
					if (local708.aBoolean88) {
						continue;
					}
					Static119.method1958(local134, local148, local708, local33);
					local708.aBoolean88 = true;
				}
				if (local141 == 3) {
					@Pc(977) Class131 local977 = Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local33][local134];
					if (local977 != null) {
						for (@Pc(986) Class1_Sub2_Sub7 local986 = (Class1_Sub2_Sub7) local977.method3786(); local986 != null; local986 = (Class1_Sub2_Sub7) local977.method3785()) {
							local265 = local986.aClass25_Sub5_1.anInt5784;
							@Pc(997) Class138 local997 = Static238.method4099(local265);
							if (Static272.anInt5854 == 1) {
								Static106.method1718(Static180.anInt4069, (short) 1, local33, local134, Static95.aString70 + " -> <col=ff9040>" + local997.aString159, Static5.aString3, (long) local265);
							} else if (Static16.aBoolean22) {
								@Pc(1011) Class1_Sub2_Sub19 local1011 = Static27.anInt755 == -1 ? null : Static114.method1863(Static27.anInt755);
								if ((Static177.anInt3986 & 0x1) != 0 && (local1011 == null || local997.method4004(Static27.anInt755, local1011.anInt5556) != local1011.anInt5556)) {
									Static106.method1718(Static266.anInt5785, (short) 6, local33, local134, Static128.aString80 + " -> <col=ff9040>" + local997.aString159, Static280.aString193, (long) local265);
								}
							} else {
								@Pc(1064) String[] local1064 = local997.aStringArray27;
								if (Static208.aBoolean246) {
									local1064 = Static40.method1451(local1064);
								}
								for (local515 = 4; local515 >= 0; local515--) {
									if (local1064 != null && local1064[local515] != null) {
										@Pc(1086) int local1086 = -1;
										@Pc(1092) byte local1092 = 0;
										if (local997.anInt5032 == local515) {
											local1086 = local997.anInt5050;
										}
										if (local515 == 0) {
											local1092 = 41;
										}
										if (local515 == 1) {
											local1092 = 8;
										}
										if (local515 == 2) {
											local1092 = 23;
										}
										if (local515 == local997.anInt5042) {
											local1086 = local997.anInt5075;
										}
										if (local515 == 3) {
											local1092 = 50;
										}
										if (local515 == 4) {
											local1092 = 58;
										}
										Static106.method1718(local1086, local1092, local33, local134, "<col=ff9040>" + local997.aString159, local1064[local515], (long) local265);
									}
								}
								Static106.method1718(Static204.anInt4559, (short) 1001, local33, local134, "<col=ff9040>" + local997.aString159, Static140.aString92, (long) local265);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static91.method1593(arg3)) {
			Static37.method860(Static81.aClass116ArrayArray1[arg3], -1, arg0, arg1, arg5, arg2, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method3283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg8 == arg4 && arg2 == arg7 && arg6 == arg3) {
			Static164.method3046(arg8, arg0, arg3, arg2, arg5);
			return;
		}
		@Pc(36) int local36 = arg8;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(72) int local72 = local46 + arg2 - arg0 - local62;
		@Pc(83) int local83 = arg3 + local50 - arg8 - local58;
		@Pc(88) int local88 = local50 - local42;
		@Pc(98) int local98 = local62 + local54 - local46 - local46;
		@Pc(103) int local103 = local46 - local54;
		@Pc(114) int local114 = local58 + local42 - local50 - local50;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(127) int local127 = local116 * local116 >> 12;
			@Pc(133) int local133 = local116 * local127 >> 12;
			@Pc(137) int local137 = local133 * local72;
			@Pc(141) int local141 = local83 * local133;
			@Pc(145) int local145 = local103 * local116;
			@Pc(149) int local149 = local127 * local114;
			@Pc(153) int local153 = local116 * local88;
			@Pc(157) int local157 = local127 * local98;
			@Pc(168) int local168 = arg8 + (local153 + local149 + local141 >> 12);
			@Pc(179) int local179 = arg0 + (local157 + local137 + local145 >> 12);
			Static164.method3046(local36, local38, local168, local179, arg5);
			local38 = local179;
			local36 = local168;
		}
	}
}
