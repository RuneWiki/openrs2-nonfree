import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!nk;")
	public static Class121 aClass121_100;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!uc;")
	public static Class1_Sub2_Sub21 aClass1_Sub2_Sub21_3;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static int anInt4231;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!r;")
	public static Class150 aClass150_3;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public static int anInt4232;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public static int anInt4234;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public static int anInt4235;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public static int anInt4236;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public static int anInt4237;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	public static int anInt4238;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	public static int anInt4240;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
	public static int anInt4241;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
	public static int anInt4242;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!qb;")
	private static Class142 aClass142_20 = new Class142(16);

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt4230 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!tg;")
	public static Class170 aClass170_9 = new Class170();

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public static int anInt4233 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lclient!uc;")
	public static Class1_Sub2_Sub21 method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub2_Sub21 local4 = (Class1_Sub2_Sub21) aClass142_20.method3534(); local4 != null; local4 = (Class1_Sub2_Sub21) aClass142_20.method3530()) {
			if (local4.aBoolean347 && local4.method4340(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	public static void method3582() {
		@Pc(3) int local3 = anInt4238 - anInt4240;
		@Pc(7) int local7 = anInt4242 - anInt4237;
		@Pc(15) int local15 = (anInt4239 - anInt4241 << 16) / local3;
		@Pc(23) int local23 = (anInt4236 - anInt4235 << 16) / local7;
		method3585(local15, local23);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
	public static void method3583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static114.anInt2376; local1++) {
			@Pc(8) Class128 local8 = Static185.method3030(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt3874;
				if (local14 >= 0 && !Static215.anInterface5_1.method779(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt3875 >= 0) {
					local29 = local8.anInt3875;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static215.anIntArray340[Static310.method4733(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static215.anIntArray340[Static310.method4733(Static215.anInterface5_1.method777(local14), 96)];
				} else if (local8.anInt3878 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt3878;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static215.anIntArray340[Static310.method4733(local57, 96)];
				}
				anIntArray361[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method3584(@OriginalArg(0) int arg0) {
		aClass1_Sub2_Sub21_3 = (Class1_Sub2_Sub21) aClass142_20.method3543((long) arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	private static void method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt4238 - anInt4240;
		@Pc(7) int local7 = anInt4242 - anInt4237;
		if (anInt4238 < anInt4234) {
			local3++;
		}
		if (anInt4242 < anInt4231) {
			local7++;
		}
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(104) int local104;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(97) int local97;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(213) int local213;
		@Pc(231) int local231;
		@Pc(250) int local250;
		@Pc(316) int local316;
		@Pc(332) int local332;
		@Pc(142) int[][] local142;
		for (local17 = 0; local17 < local3; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local50 = local17 + anInt4240 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray12.length - 1) {
					local142 = anIntArrayArrayArray12[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray16[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray15[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray17[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray14[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray13[local50];
					local28 += anInt4241;
					local38 += anInt4241;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt4235;
							local193 += anInt4235;
							local213 = local172 + anInt4237 >> 6;
							@Pc(219) int local219 = local172 + anInt4237 & 0x3F;
							@Pc(225) int local225 = local17 + anInt4240 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass1_Sub2_Sub21_3.anInt5083 != -1) {
									local250 = aClass1_Sub2_Sub21_3.anInt5083;
								} else if ((local17 + anInt4240 & 0x4) == (local172 + anInt4237 & 0x4)) {
									local250 = anIntArray361[Static188.anInt3594 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static25.method385(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray361[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray361[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static25.method385(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static25.method385(local28, local183, local42, local197, local316);
									} else {
										method3587(Static25.anIntArray27, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static25.method385(local28, local183, local42, local197, local332);
									}
									method3587(Static25.anIntArray27, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
								}
							}
							if (local162[local213] != null) {
								@Pc(459) int local459 = local162[local213][local231] & 0xFF;
								if (local459 != 0) {
									if (local42 == 1) {
										local366 = local28;
									} else {
										local366 = local38 - 1;
									}
									@Pc(477) int local477;
									if (local197 == 1) {
										local477 = local183;
									} else {
										local477 = local193 - 1;
									}
									@Pc(484) int local484 = 13421772;
									if (local459 >= 5 && local459 <= 8 || local459 >= 13 && local459 <= 16 || local459 >= 21 && local459 <= 24 || local459 == 27 || local459 == 28) {
										local484 = 13369344;
										local459 -= 4;
									}
									if (local459 == 1) {
										Static25.method409(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static25.method398(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static25.method409(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static25.method398(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static25.method409(local28, local183, local197, 16777215);
										Static25.method398(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static25.method409(local366, local183, local197, 16777215);
										Static25.method398(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static25.method409(local366, local183, local197, 16777215);
										Static25.method398(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static25.method409(local28, local183, local197, 16777215);
										Static25.method398(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static25.method398(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static25.method398(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static25.method398(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static25.method398(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static25.method398(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static25.method398(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt4241;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt4235;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt4235;
						local97 = local93 - local81;
						if (aClass1_Sub2_Sub21_3.anInt5083 != -1) {
							local104 = aClass1_Sub2_Sub21_3.anInt5083;
						} else if ((local17 + anInt4240 & 0x4) == (local68 + anInt4237 & 0x4)) {
							local104 = anIntArray361[Static188.anInt3594 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static25.method385(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt4241;
				local50 = local17 + anInt4240 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray13.length - 1) {
					local142 = anIntArrayArrayArray13[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt4235;
							@Pc(785) int local785 = local104 + anInt4237 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt4237 & 0x3F) << 6) + (local17 + anInt4240 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class20 local832 = Static307.method4654(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class23_Sub1 local855 = local832.method502(local849, local213);
										if (local855 != null) {
											local231 = local42 * local855.anInt4473 / 4;
											local250 = local97 * local855.anInt4469 / 4;
											if (local832.aBoolean23) {
												local316 = local183 >> 16 & 0xF;
												local332 = local183 >> 20 & 0xF;
												if ((local213 & 0x1) == 1) {
													local213 = local316;
													local316 = local332;
													local332 = local213;
												}
												local231 = local316 * local42;
												local250 = local332 * local97;
											}
											if (local231 != 0 && local250 != 0) {
												if (local832.anInt550 == 0) {
													local855.method1496(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method1501(local28, local81 + local97 - local250, local231, local250, local832.anInt550);
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
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)Lclient!tg;")
	public static Class170 method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class170 local3 = new Class170();
		for (@Pc(8) Class1_Sub2_Sub21 local8 = (Class1_Sub2_Sub21) aClass142_20.method3534(); local8 != null; local8 = (Class1_Sub2_Sub21) aClass142_20.method3530()) {
			if (local8.aBoolean347 && local8.method4340(arg1, arg0)) {
				local3.method4210(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method3587(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static25.anInt422) {
			return;
		}
		if (arg1 < Static25.anInt418) {
			local1 = Static25.anInt418;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static25.anInt418) {
			return;
		}
		if (local14 > Static25.anInt422) {
			local14 = Static25.anInt422;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static25.anInt419) {
			return;
		}
		if (arg2 < Static25.anInt417) {
			local25 = Static25.anInt417;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static25.anInt417) {
			return;
		}
		if (local38 > Static25.anInt419) {
			local38 = Static25.anInt419;
		}
		@Pc(53) int local53 = local25 * Static25.anInt420 + local1;
		@Pc(59) int local59 = Static25.anInt420 + local1 - local14;
		local1 -= arg1;
		local14 -= arg1;
		local25 -= arg2;
		local38 -= arg2;
		@Pc(79) int local79 = arg5 - local14;
		@Pc(83) int local83 = arg5 - local1;
		@Pc(87) int local87 = arg6 - local38;
		@Pc(91) int local91 = arg6 - local25;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		@Pc(131) int local131;
		@Pc(136) int local136;
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local136 >= local131 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
	public static void method3588() {
		for (@Pc(1) int local1 = 0; local1 < aClass150_3.anInt4326; local1++) {
			if (aClass150_3.aClass1_Sub2_Sub12Array1[local1] != null) {
				aClass170_9.method4210(aClass150_3.aClass1_Sub2_Sub12Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!lf;)V")
	public static void method3589(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt1480 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1378() == 1) {
					local7 = true;
					local9 = arg0.method1378();
					local11 = arg0.method1378();
				}
				@Pc(30) int local30 = arg0.method1378();
				@Pc(34) int local34 = arg0.method1378();
				@Pc(40) int local40 = local30 * 64 - anInt4229;
				@Pc(50) int local50 = anInt4231 + anInt4232 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt4234 && local50 < anInt4231) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method1363();
								if (local113 != 0) {
									if (aByteArrayArrayArray17[local68][local72] == null) {
										aByteArrayArrayArray17[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray17[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method1363();
									if (aByteArrayArrayArray14[local68][local72] == null) {
										aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method1363();
					if (local113 != 0) {
						arg0.anInt1480++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!nk;)V")
	public static void method3590(@OriginalArg(0) Class121 arg0) {
		aClass121_100 = arg0;
		aClass142_20.method3542();
		@Pc(9) int local9 = aClass121_100.method3108("details");
		@Pc(14) int[] local14 = aClass121_100.method3135(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass142_20.method3537(Static174.method2938(new Class1_Sub14(aClass121_100.method3115(local9, local14[local16])), local14[local16]), (long) local14[local16]);
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()Lclient!gj;")
	public static Class59 method3591() {
		@Pc(3) int local3 = anInt4238 - anInt4240;
		@Pc(7) int local7 = anInt4242 - anInt4237;
		@Pc(15) int local15 = (anInt4239 - anInt4241 << 16) / local3;
		@Pc(23) int local23 = (anInt4236 - anInt4235 << 16) / local7;
		return method3597(local15, local23);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!lf;Z)V")
	public static void method3592(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt1480 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1378() == 1) {
					local7 = true;
					local9 = arg0.method1378();
					local11 = arg0.method1378();
				}
				@Pc(30) int local30 = arg0.method1378();
				@Pc(34) int local34 = arg0.method1378();
				@Pc(40) int local40 = local30 * 64 - anInt4229;
				@Pc(50) int local50 = anInt4231 + anInt4232 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt4234 && local50 < anInt4231) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method1378();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method1378();
										if (aByteArrayArrayArray13[local68][local72] == null) {
											aByteArrayArrayArray13[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method1352();
										if (anIntArrayArrayArray13[local68][local72] == null) {
											anIntArrayArrayArray13[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method1386();
										@Pc(202) int local202 = arg0.method1378();
										local125--;
										@Pc(207) Class71 local207 = Static255.method4052(local125);
										if (local207.anIntArray209 != null) {
											local207 = local207.method2039();
											if (local207 == null || local207.anInt2357 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean139 || arg1) && local207.anInt2357 != -1) {
											@Pc(236) Class1_Sub2_Sub12 local236 = new Class1_Sub2_Sub12();
											local236.anInt3591 = local207.anInt2357;
											local236.anInt3601 = local202;
											local236.anInt3598 = local68 * 64 + local74;
											local236.anInt3593 = local72 * 64 + 64 - local79;
											aClass170_9.method4210(local236);
										}
									}
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					local72 = arg0.method1378();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt1480++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt1480 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt1480 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ng;IIII)V")
	private static void method3593(@OriginalArg(0) Class1_Sub2_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt3599 = anInt4241 + (arg1 * (arg0.anInt3598 - anInt4240) >> 16);
		arg0.anInt3600 = anInt4235 + (arg2 * (arg0.anInt3593 - anInt4237) >> 16);
		@Pc(32) Class175 local32 = Static210.method3349(arg0.anInt3591);
		if (local32.anInt5031 != -1) {
			@Pc(42) Class23 local42 = local32.method4293(true, false);
			if (local42 != null) {
				if (arg0.anInt3599 - (local42.anInt4473 + 1 >> 1) <= anInt4239 && arg0.anInt3599 + (local42.anInt4473 + 1 >> 1) >= anInt4241 && arg0.anInt3600 - (local42.anInt4469 + 1 >> 1) <= anInt4236 && arg0.anInt3600 + (local42.anInt4469 + 1 >> 1) >= anInt4235) {
					arg0.aBoolean244 = false;
				} else {
					arg0.aBoolean244 = true;
				}
				return;
			}
		}
		if (arg0.anInt3598 >= anInt4240 && arg0.anInt3598 <= anInt4238 && arg0.anInt3593 >= anInt4237 && arg0.anInt3593 <= anInt4242) {
			arg0.aBoolean244 = false;
		} else {
			arg0.aBoolean244 = true;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!lf;)V")
	public static void method3594(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt1480 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1378() == 1) {
					local7 = true;
					local9 = arg0.method1378();
					local11 = arg0.method1378();
				}
				@Pc(30) int local30 = arg0.method1378();
				@Pc(34) int local34 = arg0.method1378();
				@Pc(40) int local40 = local30 * 64 - anInt4229;
				@Pc(50) int local50 = anInt4231 + anInt4232 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt4234 && local50 < anInt4231) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method1363();
								if (local113 != 0) {
									if (aByteArrayArrayArray16[local68][local72] == null) {
										aByteArrayArrayArray16[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray16[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method1363();
									if (aByteArrayArrayArray15[local68][local72] == null) {
										aByteArrayArrayArray15[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray15[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method1363();
					if (local113 != 0) {
						arg0.anInt1480++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Lclient!uc;")
	public static Class1_Sub2_Sub21 method3595(@OriginalArg(0) int arg0) {
		return (Class1_Sub2_Sub21) aClass142_20.method3543((long) arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4240 = arg0;
		anInt4237 = arg1;
		anInt4238 = arg2;
		anInt4242 = arg3;
		anInt4241 = arg4;
		anInt4235 = arg5;
		anInt4239 = arg6;
		anInt4236 = arg7;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)Lclient!gj;")
	private static Class59 method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class59 local3 = new Class59();
		for (@Pc(8) Class1_Sub2_Sub12 local8 = (Class1_Sub2_Sub12) aClass170_9.method4212(); local8 != null; local8 = (Class1_Sub2_Sub12) aClass170_9.method4207()) {
			method3593(local8, arg0, arg1);
			local3.method1706(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass150_3.anInt4326; local31++) {
			@Pc(40) Class1_Sub2_Sub12 local40 = aClass150_3.aClass1_Sub2_Sub12Array1[local31];
			@Pc(67) boolean local67 = aClass1_Sub2_Sub21_3.method4333(aClass150_3.anIntArray369[local31] >> 28 & 0x3, aClass150_3.anIntArray369[local31] & 0x3FFF, local29, aClass150_3.anIntArray369[local31] >> 14 & 0x3FFF);
			if (local67) {
				local40.anInt3598 = local29[1] - anInt4229;
				local40.anInt3593 = anInt4231 + anInt4232 - local29[2] - 1;
				method3593(local40, arg0, arg1);
				local3.method1706(local40);
			}
		}
		return local3;
	}
}
