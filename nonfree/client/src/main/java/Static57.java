import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "Lclient!d;")
	public static Class1_Sub2_Sub6 aClass1_Sub2_Sub6_42;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!jb;")
	public static Class28 aClass28_83;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1339 = Static231.method3737("0(U");

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1340 = Static231.method3737("sl_stars");

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "Lclient!jd;")
	public static Class61 aClass61_93 = new Class61(64);

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method3702() {
		Static36.aClass61_15.method1689();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(6) int local6 = arg6 - arg1;
		@Pc(11) int local11 = arg5 - arg4;
		if (Static170.anInt3706 > arg6) {
			local6++;
		}
		if (Static152.anInt3375 > arg5) {
			local11++;
		}
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(83) int local83;
		@Pc(139) int local139;
		@Pc(151) int local151;
		@Pc(156) int local156;
		@Pc(202) int local202;
		@Pc(222) int local222;
		@Pc(214) int local214;
		@Pc(227) int local227;
		for (@Pc(29) int local29 = 0; local29 < local6; local29++) {
			local39 = local29 * arg0 >> 16;
			local50 = (local29 + 1) * arg0 >> 16;
			local54 = local50 - local39;
			if (local54 > 0) {
				local62 = arg1 + local29 >> 6;
				if (local62 >= 0 && local62 <= Static43.anIntArrayArrayArray4.length - 1) {
					local39 += arg3;
					@Pc(176) int[][] local176 = Static43.anIntArrayArrayArray4[local62];
					@Pc(180) byte[][] local180 = Static81.aByteArrayArrayArray6[local62];
					local50 += arg3;
					@Pc(188) byte[][] local188 = Static83.aByteArrayArrayArray7[local62];
					@Pc(192) byte[][] local192 = Static150.aByteArrayArrayArray10[local62];
					@Pc(196) byte[][] local196 = Static212.aByteArrayArrayArray12[local62];
					@Pc(200) byte[][] local200 = Static13.aByteArrayArrayArray1[local62];
					for (local202 = 0; local202 < local11; local202++) {
						local214 = (local202 + 1) * arg2 >> 16;
						local222 = local202 * arg2 >> 16;
						local227 = local214 - local222;
						if (local227 > 0) {
							local214 += arg7;
							local222 += arg7;
							@Pc(243) int local243 = local202 + arg4 >> 6;
							@Pc(250) int local250 = local202 + arg4 & 0x3F;
							@Pc(256) int local256 = arg1 + local29 & 0x3F;
							@Pc(262) int local262 = local256 + (local250 << 6);
							@Pc(304) int local304;
							if (local243 < 0 || local243 > local176.length - 1 || local176[local243] == null) {
								if (aClass1_Sub2_Sub6_42.anInt753 != -1) {
									local304 = aClass1_Sub2_Sub6_42.anInt753;
								} else if ((local202 + arg4 & 0x4) == (local29 + arg1 & 0x4)) {
									local304 = Static1.anIntArray1[Static51.anInt3027 + 1];
								} else {
									local304 = 4936552;
								}
								if (local243 < 0 || local243 > local176.length - 1) {
									if (local304 == 0) {
										local304 = 1;
									}
									Static205.method3250(local39, local222, local54, local227, local304);
									continue;
								}
							} else {
								local304 = local176[local243][local262];
							}
							@Pc(362) int local362 = local180[local243] == null ? 0 : Static1.anIntArray1[local180[local243][local262] & 0xFF];
							if (local304 == 0) {
								local304 = 1;
							}
							@Pc(382) int local382 = local200[local243] == null ? 0 : Static1.anIntArray1[local200[local243][local262] & 0xFF];
							@Pc(415) int local415;
							if (local362 == 0 && local382 == 0) {
								Static205.method3250(local39, local222, local54, local227, local304);
							} else {
								@Pc(411) byte local411;
								if (local362 != 0) {
									if (local362 == -1) {
										local362 = 1;
									}
									local411 = local192[local243] == null ? 0 : local192[local243][local262];
									local415 = local411 & 0xFC;
									if (local415 == 0 || local54 <= 1 || local227 <= 1) {
										Static205.method3250(local39, local222, local54, local227, local362);
									} else {
										Static58.method1129(Static205.anIntArray358, local415 >> 2, local54, local411 & 0x3, local39, local362, true, local227, local222, local304);
									}
								}
								if (local382 != 0) {
									if (local382 == -1) {
										local382 = local304;
									}
									local411 = local188[local243][local262];
									local415 = local411 & 0xFC;
									if (local415 == 0 || local54 <= 1 || local227 <= 1) {
										Static205.method3250(local39, local222, local54, local227, local382);
									}
									Static58.method1129(Static205.anIntArray358, local415 >> 2, local54, local411 & 0x3, local39, local382, local362 == 0, local227, local222, 0);
								}
							}
							if (local196[local243] != null) {
								@Pc(527) int local527 = local196[local243][local262] & 0xFF;
								if (local527 != 0) {
									if (local54 == 1) {
										local415 = local39;
									} else {
										local415 = local50 - 1;
									}
									@Pc(554) int local554;
									if (local227 == 1) {
										local554 = local222;
									} else {
										local554 = local214 - 1;
									}
									@Pc(560) int local560 = 13421772;
									if (local527 >= 5 && local527 <= 8 || local527 >= 13 && local527 <= 16 || local527 >= 21 && local527 <= 24 || local527 == 27 || local527 == 28) {
										local560 = 13369344;
										local527 -= 4;
									}
									if (local527 == 1) {
										Static205.method3246(local39, local222, local227, local560);
									} else if (local527 == 2) {
										Static205.method3261(local39, local222, local54, local560);
									} else if (local527 == 3) {
										Static205.method3246(local415, local222, local227, local560);
									} else if (local527 == 4) {
										Static205.method3261(local39, local554, local54, local560);
									} else if (local527 == 9) {
										Static205.method3246(local39, local222, local227, 16777215);
										Static205.method3261(local39, local222, local54, local560);
									} else if (local527 == 10) {
										Static205.method3246(local415, local222, local227, 16777215);
										Static205.method3261(local39, local222, local54, local560);
									} else if (local527 == 11) {
										Static205.method3246(local415, local222, local227, 16777215);
										Static205.method3261(local39, local554, local54, local560);
									} else if (local527 == 12) {
										Static205.method3246(local39, local222, local227, 16777215);
										Static205.method3261(local39, local554, local54, local560);
									} else if (local527 == 17) {
										Static205.method3261(local39, local222, 1, local560);
									} else if (local527 == 18) {
										Static205.method3261(local415, local222, 1, local560);
									} else if (local527 == 19) {
										Static205.method3261(local415, local554, 1, local560);
									} else if (local527 == 20) {
										Static205.method3261(local39, local554, 1, local560);
									} else {
										@Pc(711) int local711;
										if (local527 == 25) {
											for (local711 = 0; local711 < local227; local711++) {
												Static205.method3261(local711 + local39, -local711 + local554, 1, local560);
											}
										} else if (local527 == 26) {
											for (local711 = 0; local711 < local227; local711++) {
												Static205.method3261(local39 + local711, local711 + local222, 1, local560);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local39 += arg3;
					for (local83 = 0; local83 < local11; local83++) {
						@Pc(93) int local93;
						if (aClass1_Sub2_Sub6_42.anInt753 != -1) {
							local93 = aClass1_Sub2_Sub6_42.anInt753;
						} else if ((local83 + arg4 & 0x4) == (arg1 + local29 & 0x4)) {
							local93 = Static1.anIntArray1[Static51.anInt3027 + 1];
						} else {
							local93 = 4936552;
						}
						if (local93 == 0) {
							local93 = 1;
						}
						local139 = arg7 + (local83 * arg2 >> 16);
						local151 = arg7 + ((local83 + 1) * arg2 >> 16);
						local156 = local151 - local139;
						Static205.method3250(local39, local139, local54, local156, local93);
					}
				}
			}
		}
		for (local39 = -2; local39 < local6 + 2; local39++) {
			local54 = arg0 * (local39 + 1) >> 16;
			local50 = local39 * arg0 >> 16;
			local62 = local54 - local50;
			if (local62 > 0) {
				local83 = arg1 + local39 >> 6;
				local50 += arg3;
				if (local83 >= 0 && local83 <= Static88.aShortArrayArrayArray1.length - 1) {
					@Pc(874) short[][] local874 = Static88.aShortArrayArrayArray1[local83];
					for (local139 = -2; local139 < local11 + 2; local139++) {
						local151 = arg2 * local139 >> 16;
						local156 = (local139 + 1) * arg2 >> 16;
						@Pc(901) int local901 = local156 - local151;
						if (local901 > 0) {
							local202 = local139 + arg4 >> 6;
							local151 += arg7;
							if (local202 >= 0 && local202 <= local874.length - 1) {
								local222 = ((local139 + arg4 & 0x3F) << 6) + (arg1 + local39 & 0x3F);
								if (local874[local202] != null) {
									local214 = local874[local202][local222] & 0x3FFF;
									local227 = local874[local202][local222] >> 14 & 0x3;
									if (local214 != 0) {
										if (local227 == 0) {
											Static44.aClass64_Sub1Array2[local214 - 1].method1878(local50, local151, local62 * 2, local901 * 2);
										} else if (local227 == 1) {
											Static195.aClass64_Sub1Array8[local214 - 1].method1878(local50, local151, local62 * 2, local901 * 2);
										} else if (local227 == 2) {
											Static178.aClass64_Sub1Array6[local214 - 1].method1878(local50, local151, local62 * 2, local901 * 2);
										} else if (local227 == 3) {
											Static98.aClass64_Sub1Array5[local214 - 1].method1878(local50, local151, local62 * 2, local901 * 2);
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

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)I")
	public static int method3708(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local20 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local20 += 8;
		}
		if (arg0 >= 16) {
			local20 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local20 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local20++;
			arg0 >>>= 0x1;
		}
		return arg0 + local20;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)I")
	public static int method3712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub20 local18 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray263.length) {
			return local18.anIntArray263[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!qh;)V")
	public static void method3715(@OriginalArg(0) Class99 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3819; local2 <= arg0.anInt3807; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3808; local6 <= arg0.anInt3811; local6++) {
				@Pc(16) Class1_Sub9 local16 = Static174.aClass1_Sub9ArrayArrayArray2[arg0.anInt3806][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1416; local20++) {
						if (local16.aClass99Array2[local20] == arg0) {
							local16.anInt1416--;
							for (local35 = local20; local35 < local16.anInt1416; local35++) {
								local16.aClass99Array2[local35] = local16.aClass99Array2[local35 + 1];
								local16.anIntArray125[local35] = local16.anIntArray125[local35 + 1];
							}
							local16.aClass99Array2[local16.anInt1416] = null;
							break;
						}
					}
					local16.anInt1414 = 0;
					for (local35 = 0; local35 < local16.anInt1416; local35++) {
						local16.anInt1414 |= local16.anIntArray125[local35];
					}
				}
			}
		}
	}
}
