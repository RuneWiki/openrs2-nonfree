import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!nq;")
	public static Class144 aClass144_89;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!uo;")
	public static Class129 aClass129_9;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_48 = new Class26(50);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt5355 = 0;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_49 = new Class26(64);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public static int anInt5359 = 0;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt5361 = 500;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZIZIIILclient!uo;IIILclient!hh;)V")
	public static void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class129 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class92 arg11) {
		if (!Static283.method4712() && !Static14.method210(Static141.anInt2602, arg10, arg5, arg9)) {
			return;
		}
		if (arg5 < Static217.anInt4442) {
			Static217.anInt4442 = arg5;
		}
		@Pc(29) Class84 local29 = Static108.method1650(arg3);
		if (Static74.anInt1413 == 1 && local29.aBoolean131) {
			return;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (arg7 == 1 || arg7 == 3) {
			local49 = local29.anInt2035;
			local52 = local29.anInt1988;
		} else {
			local52 = local29.anInt2035;
			local49 = local29.anInt1988;
		}
		@Pc(71) int local71;
		@Pc(79) int local79;
		if (local49 + arg9 <= Static24.anInt454) {
			local71 = (local49 >> 1) + arg9;
			local79 = (local49 + 1 >> 1) + arg9;
		} else {
			local79 = arg9 + 1;
			local71 = arg9;
		}
		@Pc(98) int local98;
		@Pc(96) int local96;
		if (Static240.anInt4832 < local52 + arg10) {
			local96 = arg10 + 1;
			local98 = arg10;
		} else {
			local96 = arg10 + (local52 + 1 >> 1);
			local98 = arg10 + (local52 >> 1);
		}
		@Pc(119) Class77 local119 = Static108.aClass77Array2[arg6];
		@Pc(144) int local144 = local119.method4122(local71, local98) + local119.method4122(local79, local98) + local119.method4122(local71, local96) + local119.method4122(local79, local96) >> 2;
		@Pc(152) int local152 = (arg9 << 7) + (local49 << 6);
		@Pc(160) int local160 = (local52 << 6) + (arg10 << 7);
		@Pc(171) boolean local171 = arg4 && !arg2 && local29.aBoolean130;
		if (local29.method1631()) {
			Static308.method5158(arg10, null, arg7, null, arg9, local29, arg5);
		}
		@Pc(205) boolean local205 = arg0 == -1 && local29.anInt1991 == -1 && local29.anIntArray141 == null && local29.anIntArray142 == null && !local29.aBoolean134;
		if (Static307.aBoolean318 && local29.anInt2001 != 1) {
			return;
		}
		if (arg1 != 22) {
			@Pc(336) Class67_Sub3 local336;
			@Pc(307) Class67_Sub3_Sub5 local307;
			@Pc(338) int local338;
			@Pc(403) int local403;
			if (arg1 == 10 || arg1 == 11) {
				local307 = null;
				if (local205) {
					@Pc(367) Class67_Sub3_Sub5 local367 = new Class67_Sub3_Sub5(arg8, local29, arg5, arg6, local152, local144, local160, arg2, arg9, arg9 + local49 - 1, arg10, arg10 + local52 - 1, arg1, arg7, local171);
					local336 = local367;
					local338 = local367.method5419();
					local307 = local367;
				} else {
					local336 = new Class67_Sub3_Sub1(arg8, local29, arg1, arg7, arg5, arg6, local152, local144, local160, arg2, arg9, arg9 + local49 - 1, arg10, local52 + arg10 - 1, arg0);
					local338 = 15;
				}
				if (Static349.method5649(local336, false)) {
					if (local307 != null && local307.method5412()) {
						local307.method5417(arg8);
					}
					if (local29.aBoolean136 && arg4) {
						if (local338 > 30) {
							local338 = 30;
						}
						for (local403 = 0; local403 <= local49; local403++) {
							for (@Pc(407) int local407 = 0; local407 <= local52; local407++) {
								local119.method4132(local403 + arg9, arg10 - -local407, local338);
							}
						}
					}
				}
				if (local29.anInt2006 != 0 && arg11 != null) {
					arg11.method1767(local29.aBoolean137, !local29.aBoolean132, local49, arg9, arg10, local52);
				}
			} else if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
				if (local205) {
					local307 = new Class67_Sub3_Sub5(arg8, local29, arg5, arg6, local152, local144, local160, arg2, arg9, arg9 + local49 - 1, arg10, arg10 + local52 - 1, arg1, arg7, local171);
					local336 = local307;
					if (local307.method5412()) {
						local307.method5417(arg8);
					}
				} else {
					local336 = new Class67_Sub3_Sub1(arg8, local29, arg1, arg7, arg5, arg6, local152, local144, local160, arg2, arg9, local49 + arg9 - 1, arg10, arg10 + local52 - 1, arg0);
				}
				Static349.method5649(local336, false);
				if (arg4 && !arg2 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0 && local29.anInt2001 != 0) {
					Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x4);
				}
				if (local29.anInt2006 != 0 && arg11 != null) {
					arg11.method1767(local29.aBoolean137, !local29.aBoolean132, local49, arg9, arg10, local52);
				}
			} else {
				@Pc(630) Class67_Sub2_Sub1 local630;
				@Pc(632) Class67_Sub2 local632;
				if (arg1 == 0) {
					if (local205) {
						local630 = new Class67_Sub2_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg1, arg7, local171);
						local632 = local630;
						if (local630.method5412()) {
							local630.method5417(arg8);
						}
					} else {
						local632 = new Class67_Sub2_Sub2(arg8, local29, 0, arg7, arg5, arg6, local152, local144, local160, arg2, arg0);
					}
					Static62.method922(arg5, arg9, arg10, local632, null);
					if (arg4) {
						if (arg7 == 0) {
							if (local29.aBoolean136) {
								local119.method4132(arg9, arg10, 50);
								local119.method4132(arg9, arg10 + 1, 50);
							}
							if (local29.anInt2001 == 1 && !arg2) {
								Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x1);
							}
						} else if (arg7 == 1) {
							if (local29.aBoolean136) {
								local119.method4132(arg9, arg10 + 1, 50);
								local119.method4132(arg9 + 1, arg10 + 1, 50);
							}
							if (local29.anInt2001 == 1 && !arg2) {
								Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] | 0x2);
							}
						} else if (arg7 == 2) {
							if (local29.aBoolean136) {
								local119.method4132(arg9 + 1, arg10, 50);
								local119.method4132(arg9 + 1, arg10 + 1, 50);
							}
							if (local29.anInt2001 == 1 && !arg2) {
								Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] | 0x1);
							}
						} else if (arg7 == 3) {
							if (local29.aBoolean136) {
								local119.method4132(arg9, arg10, 50);
								local119.method4132(arg9 + 1, arg10, 50);
							}
							if (local29.anInt2001 == 1 && !arg2) {
								Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x2);
							}
						}
					}
					if (local29.anInt2006 != 0 && arg11 != null) {
						arg11.method1763(!local29.aBoolean132, arg9, local29.aBoolean137, arg1, arg7, arg10);
					}
					if (local29.anInt2030 != 16) {
						Static301.method5129(arg5, arg9, arg10, local29.anInt2030);
					}
				} else if (arg1 == 1) {
					if (local205) {
						local630 = new Class67_Sub2_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg1, arg7, local171);
						if (local630.method5412()) {
							local630.method5417(arg8);
						}
						local632 = local630;
					} else {
						local632 = new Class67_Sub2_Sub2(arg8, local29, 1, arg7, arg5, arg6, local152, local144, local160, arg2, arg0);
					}
					Static62.method922(arg5, arg9, arg10, local632, null);
					if (local29.aBoolean136 && arg4) {
						if (arg7 == 0) {
							local119.method4132(arg9, arg10 + 1, 50);
						} else if (arg7 == 1) {
							local119.method4132(arg9 + 1, arg10 - -1, 50);
						} else if (arg7 == 2) {
							local119.method4132(arg9 + 1, arg10, 50);
						} else if (arg7 == 3) {
							local119.method4132(arg9, arg10, 50);
						}
					}
					if (local29.anInt2006 != 0 && arg11 != null) {
						arg11.method1763(!local29.aBoolean132, arg9, local29.aBoolean137, arg1, arg7, arg10);
					}
				} else if (arg1 == 2) {
					local338 = arg7 + 1 & 0x3;
					@Pc(1064) Class67_Sub2 local1064;
					if (local205) {
						@Pc(1040) Class67_Sub2_Sub1 local1040 = new Class67_Sub2_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg1, arg7 + 4, local171);
						@Pc(1054) Class67_Sub2_Sub1 local1054 = new Class67_Sub2_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg1, local338, local171);
						if (local1040.method5412()) {
							local1040.method5417(arg8);
						}
						local1064 = local1054;
						if (local1054.method5412()) {
							local1054.method5417(arg8);
						}
						local632 = local1040;
					} else {
						local632 = new Class67_Sub2_Sub2(arg8, local29, 2, arg7 + 4, arg5, arg6, local152, local144, local160, arg2, arg0);
						local1064 = new Class67_Sub2_Sub2(arg8, local29, 2, local338, arg5, arg6, local152, local144, local160, arg2, arg0);
					}
					Static62.method922(arg5, arg9, arg10, local632, local1064);
					if (local29.anInt2001 == 1 && arg4 && !arg2) {
						if (arg7 == 0) {
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x1);
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] | 0x2);
						} else if (arg7 == 1) {
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10 + 1] | 0x2);
							Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] | 0x1);
						} else if (arg7 == 2) {
							Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9 + 1][arg10] | 0x1);
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x2);
						} else if (arg7 == 3) {
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x2);
							Static277.aByteArrayArrayArray11[arg5][arg9][arg10] = (byte) (Static277.aByteArrayArrayArray11[arg5][arg9][arg10] | 0x1);
						}
					}
					if (local29.anInt2006 != 0 && arg11 != null) {
						arg11.method1763(!local29.aBoolean132, arg9, local29.aBoolean137, arg1, arg7, arg10);
					}
					if (local29.anInt2030 != 16) {
						Static301.method5129(arg5, arg9, arg10, local29.anInt2030);
					}
				} else if (arg1 == 3) {
					if (local205) {
						local630 = new Class67_Sub2_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg1, arg7, local171);
						if (local630.method5412()) {
							local630.method5417(arg8);
						}
						local632 = local630;
					} else {
						local632 = new Class67_Sub2_Sub2(arg8, local29, 3, arg7, arg5, arg6, local152, local144, local160, arg2, arg0);
					}
					Static62.method922(arg5, arg9, arg10, local632, null);
					if (local29.aBoolean136 && arg4) {
						if (arg7 == 0) {
							local119.method4132(arg9, arg10 + 1, 50);
						} else if (arg7 == 1) {
							local119.method4132(arg9 + 1, arg10 - -1, 50);
						} else if (arg7 == 2) {
							local119.method4132(arg9 + 1, arg10, 50);
						} else if (arg7 == 3) {
							local119.method4132(arg9, arg10, 50);
						}
					}
					if (local29.anInt2006 != 0 && arg11 != null) {
						arg11.method1763(!local29.aBoolean132, arg9, local29.aBoolean137, arg1, arg7, arg10);
					}
				} else if (arg1 == 9) {
					if (local205) {
						local307 = new Class67_Sub3_Sub5(arg8, local29, arg5, arg6, local152, local144, local160, arg2, arg9, arg9, arg10, arg10, arg1, arg7, local171);
						if (local307.method5412()) {
							local307.method5417(arg8);
						}
						local336 = local307;
					} else {
						local336 = new Class67_Sub3_Sub1(arg8, local29, arg1, arg7, arg5, arg6, local152, local144, local160, arg2, arg9, arg9 + local49 - 1, arg10, arg10 + local52 - 1, arg0);
					}
					Static349.method5649(local336, false);
					if (local29.anInt2006 != 0 && arg11 != null) {
						arg11.method1767(local29.aBoolean137, !local29.aBoolean132, local49, arg9, arg10, local52);
					}
					if (local29.anInt2030 != 16) {
						Static301.method5129(arg5, arg9, arg10, local29.anInt2030);
					}
				} else {
					@Pc(1588) Class67_Sub1 local1588;
					if (arg1 == 4) {
						if (local205) {
							@Pc(1586) Class67_Sub1_Sub2 local1586 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, 0, 0, 0, arg1, arg7);
							local1588 = local1586;
							if (local1586.method5412()) {
								local1586.method5417(arg8);
							}
						} else {
							local1588 = new Class67_Sub1_Sub1(arg8, local29, arg1, arg7, arg5, arg6, local152, local144, local160, arg2, 0, 0, 0, arg0);
						}
						Static237.method4185(arg5, arg9, arg10, local1588, null);
					} else {
						@Pc(1630) int local1630;
						@Pc(1636) Interface7 local1636;
						@Pc(1671) Class67_Sub1_Sub2 local1671;
						if (arg1 == 5) {
							local1630 = 16;
							local1636 = (Interface7) Static3.method15(arg5, arg9, arg10);
							if (local1636 != null) {
								local1630 = Static108.method1650(local1636.method5410()).anInt2030;
							}
							if (local205) {
								local1671 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, 0, local1630 * Static101.anIntArray126[arg7], local1630 * Static336.anIntArray529[arg7], arg1, arg7);
								if (local1671.method5412()) {
									local1671.method5417(arg8);
								}
								local1588 = local1671;
							} else {
								local1588 = new Class67_Sub1_Sub1(arg8, local29, arg1, arg7, arg5, arg6, local152, local144, local160, arg2, 0, Static101.anIntArray126[arg7] * local1630, local1630 * Static336.anIntArray529[arg7], arg0);
							}
							Static237.method4185(arg5, arg9, arg10, local1588, null);
						} else if (arg1 == 6) {
							local1630 = 8;
							local1636 = (Interface7) Static3.method15(arg5, arg9, arg10);
							if (local1636 != null) {
								local1630 = Static108.method1650(local1636.method5410()).anInt2030 / 2;
							}
							if (local205) {
								local1671 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, arg7, local1630 * Static101.anIntArray126[arg7], Static336.anIntArray529[arg7] * local1630, arg1, arg7 + 4);
								local1588 = local1671;
								if (local1671.method5412()) {
									local1671.method5417(arg8);
								}
							} else {
								local1588 = new Class67_Sub1_Sub1(arg8, local29, arg1, arg7 + 4, arg5, arg6, local152, local144, local160, arg2, arg7, Static296.anIntArray484[arg7] * local1630, Static188.anIntArray298[arg7] * local1630, arg0);
							}
							Static237.method4185(arg5, arg9, arg10, local1588, null);
						} else if (arg1 == 7) {
							local1630 = arg7 + 2 & 0x3;
							if (local205) {
								@Pc(1868) Class67_Sub1_Sub2 local1868 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, local1630, 0, 0, arg1, local1630 + 4);
								if (local1868.method5412()) {
									local1868.method5417(arg8);
								}
								local1588 = local1868;
							} else {
								local1588 = new Class67_Sub1_Sub1(arg8, local29, arg1, local1630 + 4, arg5, arg6, local152, local144, local160, arg2, local1630, 0, 0, arg0);
							}
							Static237.method4185(arg5, arg9, arg10, local1588, null);
						} else if (arg1 == 8) {
							local338 = arg7 + 2 & 0x3;
							local403 = 8;
							@Pc(1902) Interface7 local1902 = (Interface7) Static3.method15(arg5, arg9, arg10);
							if (local1902 != null) {
								local403 = Static108.method1650(local1902.method5410()).anInt2030 / 2;
							}
							@Pc(1941) Class67_Sub1 local1941;
							@Pc(1959) Class67_Sub1 local1959;
							if (local205) {
								local1941 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, arg7, local403 * Static296.anIntArray484[arg7], local403 * Static188.anIntArray298[arg7], arg1, arg7 + 4);
								local1959 = new Class67_Sub1_Sub2(arg8, local29, arg6, local152, local144, local160, arg2, arg7, 0, 0, arg1, local338 + 4);
								if (local1941.method5412()) {
									local1941.method5417(arg8);
								}
								if (local1959.method5412()) {
									local1959.method5417(arg8);
								}
							} else {
								local1941 = new Class67_Sub1_Sub1(arg8, local29, arg1, arg7 + 4, arg5, arg6, local152, local144, local160, arg2, arg7, Static296.anIntArray484[arg7] * local403, Static188.anIntArray298[arg7] * local403, arg0);
								local1959 = new Class67_Sub1_Sub1(arg8, local29, arg1, local338 + 4, arg5, arg6, local152, local144, local160, arg2, arg7, 0, 0, arg0);
							}
							Static237.method4185(arg5, arg9, arg10, local1941, local1959);
						}
					}
				}
			}
		} else if (Static280.aBoolean11 || local29.anInt2016 != 0 || local29.anInt2006 == 1 || local29.aBoolean138) {
			@Pc(262) Class67_Sub4 local262;
			if (local205) {
				@Pc(252) Class67_Sub4_Sub1 local252 = new Class67_Sub4_Sub1(arg8, local29, arg6, local152, local144, local160, arg2, arg7, local171);
				if (local252.method5412()) {
					local252.method5417(arg8);
				}
				local262 = local252;
			} else {
				local262 = new Class67_Sub4_Sub2(arg8, local29, arg7, arg5, arg6, local152, local144, local160, arg2, arg0);
			}
			Static299.method5102(arg5, arg9, arg10, local262);
			if (local29.anInt2006 == 1 && arg11 != null) {
				arg11.method1754(arg9, arg10);
			}
		}
	}
}
