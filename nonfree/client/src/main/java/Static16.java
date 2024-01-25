import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	public static int anInt334;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "[Lclient!qr;")
	public static final Class170[] aClass170Array1 = new Class170[4];

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Lclient!br;")
	public static Class21 aClass21_1 = null;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III[BZIII[Lclient!qr;Lclient!vq;IZ)[I")
	public static int[] method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class170[] arg8, @OriginalArg(9) Class47 arg9, @OriginalArg(10) int arg10) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(17) int local17 = (arg10 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg4) {
			@Pc(23) Class170 local23 = arg8[arg2];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = Static327.method5293(local29 & 0x7, arg7, local25 & 0x7) + arg0;
					@Pc(56) int local56 = arg6 + Static25.method421(local25 & 0x7, local29 & 0x7, arg7);
					if (local43 > 0 && local43 < Static350.anInt6637 - 1 && local56 > 0 && Static105.anInt2647 - 1 > local56) {
						local23.method4595(local43, local56);
					}
				}
			}
		}
		@Pc(95) byte local95;
		if (arg4) {
			local95 = 1;
		} else {
			local95 = 4;
		}
		@Pc(104) Class4_Sub11 local104 = new Class4_Sub11(arg3);
		local25 = (arg5 & 0xFFFFFFF8) << 3;
		local29 = (arg10 & 0xFFFFFFF8) << 3;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (arg7 == 1) {
			local120 = 1;
		} else if (arg7 == 2) {
			local118 = 1;
			local120 = 1;
		} else if (arg7 == 3) {
			local118 = 1;
		}
		@Pc(224) int local224;
		@Pc(233) int local233;
		@Pc(367) int local367;
		@Pc(374) int local374;
		@Pc(397) int local397;
		@Pc(391) int local391;
		for (@Pc(147) int local147 = 0; local147 < local95; local147++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (arg1 != local147 || local11 > local151 || local151 > local11 + 8 || local155 < local17 || local17 + 8 < local155) {
						Static291.method4885(0, 0, 0, -1, local104, arg4, 0, false, -1, 0, 0);
					} else if (local151 == local11 + 8 || local17 + 8 == local155) {
						if (arg7 == 0) {
							local224 = local151 + arg0 - local11;
							local233 = local155 + arg6 - local17;
						} else if (arg7 == 1) {
							local224 = local155 + arg0 - local17;
							local233 = arg6 + local11 + 8 - local151;
						} else if (arg7 == 2) {
							local233 = local17 + arg6 + 8 - local155;
							local224 = local11 + arg0 + 8 - local151;
						} else {
							local224 = local17 + arg0 + 8 - local155;
							local233 = local151 + arg6 - local11;
						}
						Static291.method4885(0, local155 + local29, 0, local233, local104, arg4, arg2, true, local224, 0, local25 + local151);
					} else {
						local224 = arg0 + Static327.method5293(local155 & 0x7, arg7, local151 & 0x7);
						local233 = Static25.method421(local151 & 0x7, local155 & 0x7, arg7) + arg6;
						Static291.method4885(local118, local29 + local155, arg7, local233, local104, arg4, arg2, false, local224, local120, local151 + local25);
						if (local151 == 63 || local155 == 63) {
							local367 = local151 == 63 ? 64 : local151;
							local374 = local155 == 63 ? 64 : local155;
							if (arg7 == 0) {
								local397 = arg0 + local367 - local11;
								local391 = arg6 + local374 - local17;
							} else if (arg7 == 1) {
								local391 = arg6 + local11 + 8 - local367;
								local397 = arg0 + local374 - local17;
							} else if (arg7 == 2) {
								local391 = local17 + arg6 + 8 - local374;
								local397 = local11 + arg0 + 8 - local367;
							} else {
								local391 = arg6 + local367 - local11;
								local397 = arg0 + local17 + 8 - local374;
							}
							if (local397 >= 0 && Static350.anInt6637 > local397 && local391 >= 0 && Static105.anInt2647 > local391) {
								Static338.anIntArrayArrayArray40[arg2][local397][local391] = Static338.anIntArrayArrayArray40[arg2][local118 + local224][local233 + local120];
							}
						}
					}
				}
			}
		}
		@Pc(516) boolean local516 = false;
		@Pc(633) int local633;
		@Pc(637) int local637;
		@Pc(675) int local675;
		while (local104.aByteArray55.length > local104.anInt3768) {
			local224 = local104.method3440();
			if (local224 == 128) {
				Static76.anIntArray115[0] = local104.method3401();
				Static76.anIntArray115[1] = local104.method3447();
				Static76.anIntArray115[2] = local104.method3447();
				Static76.anIntArray115[3] = local104.method3447();
				local516 = true;
				Static76.anIntArray115[4] = local104.method3401();
			} else {
				if (local224 != 129) {
					local104.anInt3768--;
					break;
				}
				if (Static139.aByteArrayArrayArray10 == null) {
					Static139.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local233 = 0; local233 < 4; local233++) {
					@Pc(589) byte local589 = local104.method3426();
					if (local589 == 0 && Static139.aByteArrayArrayArray10[arg2] != null) {
						if (local233 <= arg1) {
							local374 = arg0;
							local397 = arg0 + 7;
							local391 = arg6;
							if (local397 < 0) {
								local397 = 0;
							} else if (local397 >= Static350.anInt6637) {
								local397 = Static350.anInt6637;
							}
							if (arg0 < 0) {
								local374 = 0;
							} else if (Static350.anInt6637 <= arg0) {
								local374 = Static350.anInt6637;
							}
							local633 = arg6 + 7;
							if (arg6 < 0) {
								local391 = 0;
							} else if (arg6 >= Static105.anInt2647) {
								local391 = Static105.anInt2647;
							}
							if (local633 < 0) {
								local633 = 0;
							} else if (Static105.anInt2647 <= local633) {
								local633 = Static105.anInt2647;
							}
							while (local374 < local397) {
								while (local391 < local633) {
									Static139.aByteArrayArrayArray10[arg2][local374][local391] = 0;
									local391++;
								}
								local374++;
							}
						}
					} else if (local589 == 1) {
						if (Static139.aByteArrayArrayArray10[arg2] == null) {
							Static139.aByteArrayArrayArray10[arg2] = new byte[Static350.anInt6637 + 1][Static105.anInt2647 + 1];
						}
						for (local374 = 0; local374 < 64; local374 += 4) {
							for (local397 = 0; local397 < 64; local397 += 4) {
								@Pc(624) byte local624 = local104.method3426();
								if (arg1 >= local233) {
									for (local633 = local374; local633 < local374 + 4; local633++) {
										for (local637 = local397; local637 < local397 + 4; local637++) {
											if (local633 >= local11 && local633 < local11 + 8 && local17 <= local637 && local17 < local17 + 8) {
												local675 = Static327.method5293(local637 & 0x7, arg7, local633 & 0x7) + arg0;
												@Pc(687) int local687 = Static25.method421(local633 & 0x7, local637 & 0x7, arg7) + arg6;
												if (local675 >= 0 && Static350.anInt6637 > local675 && local687 >= 0 && Static105.anInt2647 > local687) {
													Static139.aByteArrayArrayArray10[arg2][local675][local687] = local624;
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
		if (!arg4) {
			@Pc(865) Class50 local865 = null;
			while (true) {
				while (local104.anInt3768 < local104.aByteArray55.length) {
					local233 = local104.method3440();
					if (local233 == 0) {
						local865 = new Class50(local104);
					} else if (local233 == 1) {
						local367 = local104.method3440();
						if (local367 > 0) {
							for (local374 = 0; local374 < local367; local374++) {
								@Pc(902) Class4_Sub33_Sub1 local902 = new Class4_Sub33_Sub1(local104);
								if (local902.anInt5303 == 31) {
									@Pc(914) Class173 local914 = Static33.method569(local104.method3401());
									local902.method4564(local914.anInt5379, local914.anInt5376, local914.anInt5380, local914.anInt5378);
								}
								local391 = local902.anInt5295 >> 7;
								local633 = local902.anInt5298 >> 7;
								if (arg1 == local902.anInt5312 && local391 >= local11 && local11 + 8 > local391 && local17 <= local633 && local633 < local17 + 8) {
									local637 = (arg0 << 7) + Static295.method4916(local902.anInt5295 & 0x3FF, arg7, local902.anInt5298 & 0x3FF);
									local675 = Static60.method1267(local902.anInt5298 & 0x3FF, local902.anInt5295 & 0x3FF, arg7) + (arg6 << 7);
									local902.anInt5295 = local637;
									local902.anInt5298 = local675;
									local391 = local902.anInt5295 >> 7;
									local633 = local902.anInt5298 >> 7;
									if (local391 >= 0 && local633 >= 0 && Static350.anInt6637 > local391 && Static105.anInt2647 > local633) {
										local902.anInt5294 = Static338.anIntArrayArrayArray40[arg1][local391][local633] - local902.anInt5294;
										if (arg9.method2745() > 0) {
											Static116.method2421(local902);
										}
									}
								}
							}
						}
					} else if (local233 == 2) {
						if (local865 == null) {
							local865 = new Class50();
						}
						local865.method1650(local104);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local865 != null) {
					Static196.method5562(local865, arg6 >> 3, arg0 >> 3);
				}
				break;
			}
		}
		if (Static139.aByteArrayArrayArray10 != null && Static139.aByteArrayArrayArray10[arg2] != null) {
			local224 = arg0 + 7;
			local233 = arg6 + 7;
			for (local367 = arg0; local367 < local224; local367++) {
				for (local374 = arg6; local374 < local233; local374++) {
					Static139.aByteArrayArrayArray10[arg2][local367][local374] = 0;
				}
			}
		}
		if (local516) {
			return Static76.anIntArray115;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIII)V")
	public static void method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static324.method5273(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static223.anIntArrayArray124[arg0];
		@Pc(45) int local45 = arg2 - local15;
		@Pc(49) int local49 = local15 + arg2;
		Static135.method2878(local40, local45, arg1, arg2 - arg5);
		Static135.method2878(local40, local49, arg3, local45);
		Static135.method2878(local40, arg2 + arg5, arg1, local49);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static83.anIntArray201[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(157) int local157;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local15 > local24) {
					local128 = Static223.anIntArrayArray124[local24 + arg0];
					local135 = Static223.anIntArrayArray124[arg0 - local24];
					local139 = Static83.anIntArray201[local24];
					local144 = arg2 + local10;
					local149 = arg2 - local10;
					local153 = local139 + arg2;
					local157 = arg2 - local139;
					Static135.method2878(local128, local157, arg1, local149);
					Static135.method2878(local128, local153, arg3, local157);
					Static135.method2878(local128, local144, arg1, local153);
					Static135.method2878(local135, local157, arg1, local149);
					Static135.method2878(local135, local153, arg3, local157);
					Static135.method2878(local135, local144, arg1, local153);
				} else {
					local128 = Static223.anIntArrayArray124[local24 + arg0];
					local135 = Static223.anIntArrayArray124[arg0 - local24];
					local139 = arg2 + local10;
					local144 = arg2 - local10;
					Static135.method2878(local128, local139, arg1, local144);
					Static135.method2878(local135, local139, arg1, local144);
				}
			}
			local128 = Static223.anIntArrayArray124[local10 + arg0];
			local135 = Static223.anIntArrayArray124[arg0 - local10];
			local139 = local24 + arg2;
			local144 = arg2 - local24;
			if (local10 < local15) {
				local149 = local29 >= local10 ? local29 : Static83.anIntArray201[local10];
				local153 = arg2 + local149;
				local157 = arg2 - local149;
				Static135.method2878(local128, local157, arg1, local144);
				Static135.method2878(local128, local153, arg3, local157);
				Static135.method2878(local128, local139, arg1, local153);
				Static135.method2878(local135, local157, arg1, local144);
				Static135.method2878(local135, local153, arg3, local157);
				Static135.method2878(local135, local139, arg1, local153);
			} else {
				Static135.method2878(local128, local139, arg1, local144);
				Static135.method2878(local135, local139, arg1, local144);
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILclient!n;II)V")
	public static void method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt4304 == -1 && arg2.anIntArray366 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg2.anInt4307 * Static8.anInt192 >> 8;
		if (arg0 > arg2.anInt4299) {
			local15 = arg0 - arg2.anInt4299;
		} else if (arg2.anInt4300 > arg0) {
			local15 = arg2.anInt4300 - arg0;
		}
		if (arg2.anInt4313 < arg3) {
			local15 += arg3 - arg2.anInt4313;
		} else if (arg2.anInt4306 > arg3) {
			local15 += arg2.anInt4306 - arg3;
		}
		if (arg2.anInt4309 == 0 || local15 - 64 > arg2.anInt4309 || Static8.anInt192 == 0 || arg2.anInt4315 != arg4) {
			if (arg2.aClass4_Sub1_Sub1_1 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(arg2.aClass4_Sub1_Sub1_1);
				arg2.aClass4_Sub1_Sub1_1 = null;
			}
			if (arg2.aClass4_Sub1_Sub1_2 != null) {
				Static196.aClass4_Sub1_Sub3_3.method3510(arg2.aClass4_Sub1_Sub1_2);
				arg2.aClass4_Sub1_Sub1_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(158) int local158 = local22 * (arg2.anInt4309 - local15) / arg2.anInt4309;
		if (arg2.aClass4_Sub1_Sub1_1 != null) {
			arg2.aClass4_Sub1_Sub1_1.method91(local158);
		} else if (arg2.anInt4304 >= 0) {
			@Pc(176) Class152 local176 = Static365.method4183(Static146.aClass193_43, arg2.anInt4304, 0);
			if (local176 != null) {
				@Pc(183) Class4_Sub7_Sub1 local183 = local176.method4185().method394(Static37.aClass150_1);
				@Pc(188) Class4_Sub1_Sub1 local188 = Static358.method110(local183, local158);
				local188.method108(-1);
				Static196.aClass4_Sub1_Sub3_3.method3505(local188);
				arg2.aClass4_Sub1_Sub1_1 = local188;
			}
		}
		if (arg2.aClass4_Sub1_Sub1_2 != null) {
			arg2.aClass4_Sub1_Sub1_2.method91(local158);
			if (arg2.aClass4_Sub1_Sub1_2.method5689()) {
				return;
			}
			arg2.aClass4_Sub1_Sub1_2 = null;
		} else if (arg2.anIntArray366 != null && (arg2.anInt4312 -= arg1) <= 0) {
			@Pc(219) int local219 = (int) ((double) arg2.anIntArray366.length * Math.random());
			@Pc(227) Class152 local227 = Static365.method4183(Static146.aClass193_43, arg2.anIntArray366[local219], 0);
			if (local227 != null) {
				@Pc(234) Class4_Sub7_Sub1 local234 = local227.method4185().method394(Static37.aClass150_1);
				@Pc(239) Class4_Sub1_Sub1 local239 = Static358.method110(local234, local158);
				local239.method108(0);
				Static196.aClass4_Sub1_Sub3_3.method3505(local239);
				arg2.aClass4_Sub1_Sub1_2 = local239;
				arg2.anInt4312 = (int) (Math.random() * (double) (arg2.anInt4302 - arg2.anInt4308)) + arg2.anInt4308;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	public static void method300(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 5);
		local8.method4902();
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
	public static void method303() {
		Static171.aClass198_132.method5202(5);
	}
}
