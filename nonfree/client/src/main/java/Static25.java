import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!ca;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!c;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!ec", name = "qb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_335 = Static2.method66("Lade Konfig )2 ");

	@OriginalMember(owner = "client!ec", name = "ub", descriptor = "Lclient!ke;")
	private static Class39 aClass39_336 = Static2.method66("Remove");

	@OriginalMember(owner = "client!ec", name = "yb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_337 = Static2.method66("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ec", name = "Pb", descriptor = "I")
	public static int anInt723 = 127;

	@OriginalMember(owner = "client!ec", name = "lc", descriptor = "[I")
	public static int[] anIntArray81 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ec", name = "qc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_343 = aClass39_336;

	@OriginalMember(owner = "client!ec", name = "sc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_344 = aClass39_337;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)V")
	public static void method508() {
		for (@Pc(3) int local3 = -1; local3 < Static61.anInt1740; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static7.anIntArray21[local3];
			}
			@Pc(21) Class2_Sub1_Sub2_Sub3_Sub1 local21 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local11];
			if (local21 != null) {
				Static39.method819(1, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public static void method509() {
		aClass39_336 = null;
		aClass39_335 = null;
		aClass39_337 = null;
		aClass39_344 = null;
		aClass39_343 = null;
		aClass10_2 = null;
		aClass2_Sub1_Sub4_Sub1_1 = null;
		anIntArray81 = null;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 method510() {
		@Pc(7) Class2_Sub1_Sub4_Sub2 local7 = new Class2_Sub1_Sub4_Sub2();
		local7.anInt1502 = Static76.anInt2102;
		local7.anInt1500 = Static56.anInt1612;
		local7.anInt1499 = Static83.anIntArray297[0];
		local7.anInt1501 = Static10.anIntArray34[0];
		local7.anInt1497 = Static95.anIntArray314[0];
		local7.anInt1498 = Static30.anIntArray94[0];
		@Pc(47) int local47 = local7.anInt1498 * local7.anInt1497;
		@Pc(51) byte[] local51 = Static51.aByteArrayArray10[0];
		local7.anIntArray209 = new int[local47];
		for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
			local7.anIntArray209[local57] = Static46.anIntArray179[local51[local57] & 0xFF];
		}
		Static89.method1677();
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)V")
	public static void method512() {
		Static95.aClass9_1.method810();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static35.aLongArray8[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static9.aLongArray2[local22] = 0L;
		}
		Static20.anInt578 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method514(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		arg0.aBoolean135 = false;
		@Pc(20) Class2_Sub1_Sub1 local20;
		if (arg0.anInt2894 != -1) {
			local20 = Static69.method1439(arg0.anInt2894);
			arg0.anInt2903++;
			if (arg0.anInt2885 < local20.anIntArray7.length && arg0.anInt2903 > local20.anIntArray8[arg0.anInt2885]) {
				arg0.anInt2885++;
				arg0.anInt2903 = 1;
			}
			if (local20.anIntArray7.length <= arg0.anInt2885) {
				arg0.anInt2885 = 0;
				arg0.anInt2903 = 0;
			}
		}
		if (arg0.anInt2904 != -1 && Static64.anInt1889 >= arg0.anInt2907) {
			if (arg0.anInt2912 < 0) {
				arg0.anInt2912 = 0;
			}
			@Pc(93) int local93 = Static5.method79(arg0.anInt2904).anInt2000;
			if (local93 == -1) {
				arg0.anInt2904 = -1;
			} else {
				@Pc(108) Class2_Sub1_Sub1 local108 = Static69.method1439(local93);
				arg0.anInt2924++;
				if (arg0.anInt2912 < local108.anIntArray7.length && arg0.anInt2924 > local108.anIntArray8[arg0.anInt2912]) {
					arg0.anInt2924 = 1;
					arg0.anInt2912++;
				}
				if (arg0.anInt2912 >= local108.anIntArray7.length && (arg0.anInt2912 < 0 || arg0.anInt2912 >= local108.anIntArray7.length)) {
					arg0.anInt2904 = -1;
				}
			}
		}
		if (arg0.anInt2901 != -1 && arg0.anInt2937 <= 1) {
			local20 = Static69.method1439(arg0.anInt2901);
			if (local20.anInt69 == 1 && arg0.anInt2932 > 0 && Static64.anInt1889 >= arg0.anInt2900 && Static64.anInt1889 > arg0.anInt2941) {
				arg0.anInt2937 = 1;
				return;
			}
		}
		if (arg0.anInt2901 != -1 && arg0.anInt2937 == 0) {
			local20 = Static69.method1439(arg0.anInt2901);
			arg0.anInt2919++;
			if (local20.anIntArray7.length > arg0.anInt2928 && local20.anIntArray8[arg0.anInt2928] < arg0.anInt2919) {
				arg0.anInt2919 = 1;
				arg0.anInt2928++;
			}
			if (arg0.anInt2928 >= local20.anIntArray7.length) {
				arg0.anInt2886++;
				if (arg0.anInt2886 >= local20.anInt76) {
					arg0.anInt2901 = -1;
				}
				arg0.anInt2928 -= local20.anInt67;
				if (arg0.anInt2928 < 0 || arg0.anInt2928 >= local20.anIntArray7.length) {
					arg0.anInt2901 = -1;
				}
			}
			arg0.aBoolean135 = local20.aBoolean1;
		}
		if (arg0.anInt2937 > 0) {
			arg0.anInt2937--;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lclient!ne;Lclient!le;I)V")
	public static void method515(@OriginalArg(0) Class47[] arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(40) int local40;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				for (local23 = 0; local23 < 104; local23++) {
					if ((Static96.aByteArrayArrayArray8[local15][local19][local23] & 0x1) == 1) {
						local40 = local15;
						if ((Static96.aByteArrayArrayArray8[1][local19][local23] & 0x2) == 2) {
							local40 = local15 - 1;
						}
						if (local40 >= 0) {
							arg0[local40].method1470(local19, local23);
						}
					}
				}
			}
		}
		Static15.anInt2857 += (int) (Math.random() * 5.0D) - 2;
		Static57.anInt1663 += (int) (Math.random() * 5.0D) - 2;
		if (Static57.anInt1663 < -16) {
			Static57.anInt1663 = -16;
		}
		if (Static57.anInt1663 > 16) {
			Static57.anInt1663 = 16;
		}
		if (Static15.anInt2857 < -8) {
			Static15.anInt2857 = -8;
		}
		if (Static15.anInt2857 > 8) {
			Static15.anInt2857 = 8;
		}
		@Pc(138) int local138;
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(167) int local167;
		@Pc(188) int local188;
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(217) int local217;
		@Pc(234) int local234;
		@Pc(282) int local282;
		@Pc(504) int local504;
		@Pc(543) int local543;
		@Pc(653) int local653;
		@Pc(643) int local643;
		@Pc(681) int local681;
		for (local19 = 0; local19 < 4; local19++) {
			@Pc(128) byte[][] local128 = Static64.aByteArrayArrayArray3[local19];
			local40 = (int) Math.sqrt(5100.0D);
			local138 = local40 * 768 >> 8;
			for (local140 = 1; local140 < 103; local140++) {
				for (local144 = 1; local144 < 103; local144++) {
					local167 = Static22.anIntArrayArrayArray3[local19][local144 + 1][local140] - Static22.anIntArrayArrayArray3[local19][local144 - 1][local140];
					local188 = Static22.anIntArrayArrayArray3[local19][local144][local140 + 1] - Static22.anIntArrayArrayArray3[local19][local144][local140 - 1];
					local201 = (int) Math.sqrt((double) (local188 * local188 + local167 * local167 + 65536));
					local207 = (local167 << 8) / local201;
					local211 = 65536 / local201;
					local217 = (local188 << 8) / local201;
					local234 = (local217 * -50 + local211 * -10 + local207 * -50) / local138 + 96;
					local282 = (local128[local144][local140] >> 1) + (local128[local144][local140 + 1] >> 3) + (local128[local144 + -1][local140] >> 2) + (local128[local144 + 1][local140] >> 3) + (local128[local144][local140 + -1] >> 2);
					Static19.anIntArrayArray6[local144][local140] = local234 - local282;
				}
			}
			for (local144 = 0; local144 < 104; local144++) {
				Static45.anIntArray176[local144] = 0;
				Static29.anIntArray90[local144] = 0;
				Static5.anIntArray13[local144] = 0;
				Static5.anIntArray15[local144] = 0;
				Static73.anIntArray259[local144] = 0;
			}
			for (local167 = -5; local167 < 109; local167++) {
				for (local188 = 0; local188 < 104; local188++) {
					local201 = local167 + 5;
					@Pc(402) int local402;
					if (local201 >= 0 && local201 < 104) {
						local207 = Static96.aByteArrayArrayArray7[local19][local201][local188] & 0xFF;
						if (local207 > 0) {
							@Pc(366) Class2_Sub1_Sub15 local366 = Static60.method1131(local207 - 1);
							Static45.anIntArray176[local188] += local366.anInt2430;
							Static29.anIntArray90[local188] += local366.anInt2432;
							Static5.anIntArray13[local188] += local366.anInt2436;
							Static5.anIntArray15[local188] += local366.anInt2433;
							local402 = Static73.anIntArray259[local188]++;
						}
					}
					local207 = local167 - 5;
					if (local207 >= 0 && local207 < 104) {
						local211 = Static96.aByteArrayArrayArray7[local19][local207][local188] & 0xFF;
						if (local211 > 0) {
							@Pc(435) Class2_Sub1_Sub15 local435 = Static60.method1131(local211 - 1);
							Static45.anIntArray176[local188] -= local435.anInt2430;
							Static29.anIntArray90[local188] -= local435.anInt2432;
							Static5.anIntArray13[local188] -= local435.anInt2436;
							Static5.anIntArray15[local188] -= local435.anInt2433;
							local402 = Static73.anIntArray259[local188]--;
						}
					}
				}
				if (local167 >= 1 && local167 < 103) {
					local201 = 0;
					local217 = 0;
					local211 = 0;
					local207 = 0;
					local234 = 0;
					for (local282 = -5; local282 < 109; local282++) {
						local504 = local282 + 5;
						if (local504 >= 0 && local504 < 104) {
							local217 += Static5.anIntArray15[local504];
							local201 += Static45.anIntArray176[local504];
							local234 += Static73.anIntArray259[local504];
							local207 += Static29.anIntArray90[local504];
							local211 += Static5.anIntArray13[local504];
						}
						local543 = local282 - 5;
						if (local543 >= 0 && local543 < 104) {
							local234 -= Static73.anIntArray259[local543];
							local217 -= Static5.anIntArray15[local543];
							local207 -= Static29.anIntArray90[local543];
							local211 -= Static5.anIntArray13[local543];
							local201 -= Static45.anIntArray176[local543];
						}
						if (local282 >= 1 && local282 < 103 && (!Static35.aBoolean136 || (Static96.aByteArrayArrayArray8[0][local167][local282] & 0x2) != 0 || (Static96.aByteArrayArrayArray8[local19][local167][local282] & 0x10) == 0 && Static2.method63(local19, local282, local167) == Static28.anInt815)) {
							if (local19 < Static83.anInt2274) {
								Static83.anInt2274 = local19;
							}
							local643 = Static96.aByteArrayArrayArray9[local19][local167][local282] & 0xFF;
							local653 = Static96.aByteArrayArrayArray7[local19][local167][local282] & 0xFF;
							if (local653 > 0 || local643 > 0) {
								@Pc(673) int local673 = Static22.anIntArrayArrayArray3[local19][local167 + 1][local282];
								local681 = Static22.anIntArrayArrayArray3[local19][local167][local282];
								@Pc(691) int local691 = Static22.anIntArrayArrayArray3[local19][local167][local282 + 1];
								@Pc(697) int local697 = Static19.anIntArrayArray6[local167][local282];
								@Pc(709) int local709 = Static22.anIntArrayArrayArray3[local19][local167 + 1][local282 + 1];
								@Pc(717) int local717 = Static19.anIntArrayArray6[local167 + 1][local282];
								@Pc(727) int local727 = Static19.anIntArrayArray6[local167 + 1][local282 + 1];
								@Pc(735) int local735 = Static19.anIntArrayArray6[local167][local282 + 1];
								@Pc(737) int local737 = -1;
								@Pc(739) int local739 = -1;
								@Pc(751) int local751;
								@Pc(755) int local755;
								if (local653 > 0) {
									@Pc(745) int local745 = local211 / local234;
									local751 = local201 * 256 / local217;
									local755 = local207 / local234;
									local737 = Static94.method1794(local751, local755, local745);
									@Pc(768) int local768 = local751 + Static15.anInt2857 & 0xFF;
									local745 += Static57.anInt1663;
									if (local745 < 0) {
										local745 = 0;
									} else if (local745 > 255) {
										local745 = 255;
									}
									local739 = Static94.method1794(local768, local755, local745);
								}
								if (local19 > 0) {
									@Pc(795) boolean local795 = true;
									if (local653 == 0 && Static69.aByteArrayArrayArray4[local19][local167][local282] != 0) {
										local795 = false;
									}
									if (local643 > 0 && !Static21.method1870(local643 - 1).aBoolean93) {
										local795 = false;
									}
									if (local795 && local673 == local681 && local681 == local709 && local691 == local681) {
										Static62.anIntArrayArrayArray7[local19][local167][local282] |= 0x924;
									}
								}
								local751 = 0;
								if (local739 != -1) {
									local751 = Static106.anIntArray355[Static60.method1138(local739, 96)];
								}
								if (local643 == 0) {
									arg1.method1212(local19, local167, local282, 0, 0, -1, local681, local673, local709, local691, Static60.method1138(local737, local697), Static60.method1138(local737, local717), Static60.method1138(local737, local727), Static60.method1138(local737, local735), 0, 0, 0, 0, local751, 0);
								} else {
									local755 = Static69.aByteArrayArrayArray4[local19][local167][local282] + 1;
									@Pc(889) byte local889 = Static57.aByteArrayArrayArray2[local19][local167][local282];
									@Pc(895) Class2_Sub1_Sub10 local895 = Static21.method1870(local643 - 1);
									@Pc(898) int local898 = local895.anInt1858;
									@Pc(913) int local913;
									@Pc(911) int local911;
									@Pc(934) int local934;
									@Pc(939) int local939;
									if (local898 >= 0) {
										local911 = Static106.anInterface1_1.method1722(local898);
										local913 = -1;
									} else if (local895.anInt1862 == 16711935) {
										local911 = -2;
										local913 = -2;
										local898 = -1;
									} else {
										local913 = Static94.method1794(local895.anInt1849, local895.anInt1857, local895.anInt1866);
										local934 = local895.anInt1849 + Static15.anInt2857 & 0xFF;
										local939 = Static57.anInt1663 + local895.anInt1866;
										if (local939 < 0) {
											local939 = 0;
										} else if (local939 > 255) {
											local939 = 255;
										}
										local911 = Static94.method1794(local934, local895.anInt1857, local939);
									}
									local934 = 0;
									if (local911 != -2) {
										local934 = Static106.anIntArray355[Static28.method566(96, local911)];
									}
									if (local895.anInt1860 != -1) {
										@Pc(993) int local993 = local895.anInt1859 + Static57.anInt1663;
										local939 = Static15.anInt2857 + local895.anInt1856 & 0xFF;
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										local911 = Static94.method1794(local939, local895.anInt1867, local993);
										local934 = Static106.anIntArray355[Static28.method566(96, local911)];
									}
									arg1.method1212(local19, local167, local282, local755, local889, local898, local681, local673, local709, local691, Static60.method1138(local737, local697), Static60.method1138(local737, local717), Static60.method1138(local737, local727), Static60.method1138(local737, local735), Static28.method566(local697, local913), Static28.method566(local717, local913), Static28.method566(local727, local913), Static28.method566(local735, local913), local751, local934);
								}
							}
						}
					}
				}
			}
			for (local188 = 1; local188 < 103; local188++) {
				for (local201 = 1; local201 < 103; local201++) {
					arg1.method1167(local19, local201, local188, Static2.method63(local19, local188, local201));
				}
			}
			Static96.aByteArrayArrayArray7[local19] = null;
			Static96.aByteArrayArrayArray9[local19] = null;
			Static69.aByteArrayArrayArray4[local19] = null;
			Static57.aByteArrayArrayArray2[local19] = null;
			Static64.aByteArrayArrayArray3[local19] = null;
		}
		arg1.method1170();
		for (local23 = 0; local23 < 104; local23++) {
			for (local40 = 0; local40 < 104; local40++) {
				if ((Static96.aByteArrayArrayArray8[1][local23][local40] & 0x2) == 2) {
					arg1.method1171(local23, local40);
				}
			}
		}
		local40 = 1;
		local140 = 4;
		local138 = 2;
		for (local144 = 0; local144 < 4; local144++) {
			if (local144 > 0) {
				local40 <<= 0x3;
				local140 <<= 0x3;
				local138 <<= 0x3;
			}
			for (local167 = 0; local167 <= local144; local167++) {
				for (local188 = 0; local188 <= 104; local188++) {
					for (local201 = 0; local201 <= 104; local201++) {
						if ((Static62.anIntArrayArrayArray7[local167][local201][local188] & local40) != 0) {
							local211 = local188;
							local234 = local167;
							while (local211 < 104 && (local40 & Static62.anIntArrayArrayArray7[local167][local201][local211 + 1]) != 0) {
								local211++;
							}
							for (local207 = local188; local207 > 0 && (local40 & Static62.anIntArrayArrayArray7[local167][local201][local207 - 1]) != 0; local207--) {
							}
							label347: for (local217 = local167; local217 > 0; local217--) {
								for (local282 = local207; local282 <= local211; local282++) {
									if ((Static62.anIntArrayArrayArray7[local217 - 1][local201][local282] & local40) == 0) {
										break label347;
									}
								}
							}
							label336: while (local234 < local144) {
								for (local282 = local207; local282 <= local211; local282++) {
									if ((Static62.anIntArrayArrayArray7[local234 + 1][local201][local282] & local40) == 0) {
										break label336;
									}
								}
								local234++;
							}
							local282 = (local211 + 1 - local207) * (local234 + 1 - local217);
							if (local282 >= 8) {
								local653 = Static22.anIntArrayArrayArray3[local217][local201][local207];
								local543 = Static22.anIntArrayArrayArray3[local234][local201][local207] - 240;
								Static59.method1175(local144, 1, local201 * 128, local201 * 128, local207 * 128, local211 * 128 + 128, local543, local653);
								for (local643 = local217; local643 <= local234; local643++) {
									for (local681 = local207; local681 <= local211; local681++) {
										Static62.anIntArrayArrayArray7[local643][local201][local681] &= ~local40;
									}
								}
							}
						}
						if ((local138 & Static62.anIntArrayArrayArray7[local167][local201][local188]) != 0) {
							local211 = local201;
							local207 = local201;
							while (local211 < 104 && (local138 & Static62.anIntArrayArrayArray7[local167][local211 + 1][local188]) != 0) {
								local211++;
							}
							while (local207 > 0 && (local138 & Static62.anIntArrayArrayArray7[local167][local207 - 1][local188]) != 0) {
								local207--;
							}
							label403: for (local217 = local167; local217 > 0; local217--) {
								for (local282 = local207; local282 <= local211; local282++) {
									if ((Static62.anIntArrayArrayArray7[local217 - 1][local282][local188] & local138) == 0) {
										break label403;
									}
								}
							}
							label391: for (local234 = local167; local234 < local144; local234++) {
								for (local282 = local207; local282 <= local211; local282++) {
									if ((Static62.anIntArrayArrayArray7[local234 + 1][local282][local188] & local138) == 0) {
										break label391;
									}
								}
							}
							local282 = (local234 + 1 - local217) * (local211 + 1 - local207);
							if (local282 >= 8) {
								local543 = Static22.anIntArrayArrayArray3[local234][local207][local188] - 240;
								local653 = Static22.anIntArrayArrayArray3[local217][local207][local188];
								Static59.method1175(local144, 2, local207 * 128, local211 * 128 + 128, local188 * 128, local188 * 128, local543, local653);
								for (local643 = local217; local643 <= local234; local643++) {
									for (local681 = local207; local681 <= local211; local681++) {
										Static62.anIntArrayArrayArray7[local643][local681][local188] &= ~local138;
									}
								}
							}
						}
						if ((local140 & Static62.anIntArrayArrayArray7[local167][local201][local188]) != 0) {
							local211 = local201;
							local207 = local201;
							for (local234 = local188; local234 < 104 && (local140 & Static62.anIntArrayArrayArray7[local167][local201][local234 + 1]) != 0; local234++) {
							}
							for (local217 = local188; local217 > 0 && (Static62.anIntArrayArrayArray7[local167][local201][local217 - 1] & local140) != 0; local217--) {
							}
							label457: while (local207 > 0) {
								for (local282 = local217; local282 <= local234; local282++) {
									if ((local140 & Static62.anIntArrayArrayArray7[local167][local207 - 1][local282]) == 0) {
										break label457;
									}
								}
								local207--;
							}
							label446: while (local211 < 104) {
								for (local282 = local217; local282 <= local234; local282++) {
									if ((local140 & Static62.anIntArrayArrayArray7[local167][local211 + 1][local282]) == 0) {
										break label446;
									}
								}
								local211++;
							}
							if ((local234 + 1 - local217) * (local211 + 1 - local207) >= 4) {
								local282 = Static22.anIntArrayArrayArray3[local167][local207][local217];
								Static59.method1175(local144, 4, local207 * 128, local211 * 128 + 128, local217 * 128, local234 * 128 + 128, local282, local282);
								for (local504 = local207; local504 <= local211; local504++) {
									for (local543 = local217; local543 <= local234; local543++) {
										Static62.anIntArrayArrayArray7[local167][local504][local543] &= ~local140;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method516() {
		Static95.aClass9_1.method811();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static35.aLongArray8[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static9.aLongArray2[local29] = 0L;
		}
		Static20.anInt578 = 0;
	}
}
