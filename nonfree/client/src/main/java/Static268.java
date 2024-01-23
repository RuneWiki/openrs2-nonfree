import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!th;")
	public static Class168 aClass168_90;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!uf;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public static int anInt2657;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!nc;")
	public static Class1_Sub3_Sub15 aClass1_Sub3_Sub15_2;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public static int anInt2659;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public static int anInt2661;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
	public static int anInt2667;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public static int anInt2668;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Lclient!vl;")
	private static Class186 aClass186_9 = new Class186(16);

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public static int anInt2658 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt2660 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!mg;")
	public static Class108 aClass108_11 = new Class108();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!qm;)V")
	public static void method1993(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt3000 < arg0.aByteArray55.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2199() == 1) {
					local7 = true;
					local9 = arg0.method2199();
					local11 = arg0.method2199();
				}
				@Pc(30) int local30 = arg0.method2199();
				@Pc(34) int local34 = arg0.method2199();
				@Pc(40) int local40 = local30 * 64 - anInt2655;
				@Pc(50) int local50 = anInt2659 + anInt2656 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2657 && local50 < anInt2659) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2212();
								if (local113 != 0) {
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2212();
									if (aByteArrayArrayArray10[local68][local72] == null) {
										aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method2212();
					if (local113 != 0) {
						arg0.anInt3000++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lclient!qm;)V")
	public static void method1995(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt3000 < arg0.aByteArray55.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2199() == 1) {
					local7 = true;
					local9 = arg0.method2199();
					local11 = arg0.method2199();
				}
				@Pc(30) int local30 = arg0.method2199();
				@Pc(34) int local34 = arg0.method2199();
				@Pc(40) int local40 = local30 * 64 - anInt2655;
				@Pc(50) int local50 = anInt2659 + anInt2656 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2657 && local50 < anInt2659) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2212();
								if (local113 != 0) {
									if (aByteArrayArrayArray11[local68][local72] == null) {
										aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2212();
									if (aByteArrayArrayArray9[local68][local72] == null) {
										aByteArrayArrayArray9[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray9[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method2212();
					if (local113 != 0) {
						arg0.anInt3000++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lclient!nc;")
	public static Class1_Sub3_Sub15 method1996(@OriginalArg(0) int arg0) {
		return (Class1_Sub3_Sub15) aClass186_9.method4570((long) arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static266.anInt5320; local1++) {
			@Pc(8) Class62 local8 = Static148.method2407(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt1983;
				if (local14 >= 0 && !Static237.anInterface1_1.method4603(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt1979 >= 0) {
					local29 = local8.anInt1979;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static237.anIntArray462[Static305.method4638(96, local57)];
				} else if (local14 >= 0) {
					local64 = Static237.anIntArray462[Static305.method4638(96, Static237.anInterface1_1.method4597(local14))];
				} else if (local8.anInt1980 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt1980;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static237.anIntArray462[Static305.method4638(96, local57)];
				}
				anIntArray269[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	private static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt2663 - anInt2661;
		@Pc(7) int local7 = anInt2664 - anInt2667;
		if (anInt2663 < anInt2657) {
			local3++;
		}
		if (anInt2664 < anInt2659) {
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
				local50 = local17 + anInt2661 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray5.length - 1) {
					local142 = anIntArrayArrayArray5[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray13[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray10[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray11[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray9[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray12[local50];
					local28 += anInt2662;
					local38 += anInt2662;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt2666;
							local193 += anInt2666;
							local213 = local172 + anInt2667 >> 6;
							@Pc(219) int local219 = local172 + anInt2667 & 0x3F;
							@Pc(225) int local225 = local17 + anInt2661 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass1_Sub3_Sub15_2.anInt3977 != -1) {
									local250 = aClass1_Sub3_Sub15_2.anInt3977;
								} else if ((local17 + anInt2661 & 0x4) == (local172 + anInt2667 & 0x4)) {
									local250 = anIntArray269[Static39.anInt965 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static231.method3630(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray269[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray269[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static231.method3630(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static231.method3630(local28, local183, local42, local197, local316);
									} else {
										method2004(Static231.anIntArray448, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static231.method3630(local28, local183, local42, local197, local332);
									}
									method2004(Static231.anIntArray448, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
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
										Static231.method3646(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static231.method3636(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static231.method3646(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static231.method3636(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static231.method3646(local28, local183, local197, 16777215);
										Static231.method3636(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static231.method3646(local366, local183, local197, 16777215);
										Static231.method3636(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static231.method3646(local366, local183, local197, 16777215);
										Static231.method3636(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static231.method3646(local28, local183, local197, 16777215);
										Static231.method3636(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static231.method3636(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static231.method3636(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static231.method3636(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static231.method3636(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static231.method3636(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static231.method3636(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt2662;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt2666;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt2666;
						local97 = local93 - local81;
						if (aClass1_Sub3_Sub15_2.anInt3977 != -1) {
							local104 = aClass1_Sub3_Sub15_2.anInt3977;
						} else if ((local17 + anInt2661 & 0x4) == (local68 + anInt2667 & 0x4)) {
							local104 = anIntArray269[Static39.anInt965 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static231.method3630(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt2662;
				local50 = local17 + anInt2661 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray6.length - 1) {
					local142 = anIntArrayArrayArray6[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt2666;
							@Pc(785) int local785 = local104 + anInt2667 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt2667 & 0x3F) << 6) + (local17 + anInt2661 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class44 local832 = Static102.method729(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class46_Sub1 local855 = local832.method1107(local213, local849);
										if (local855 != null) {
											local231 = local42 * local855.anInt4753 / 4;
											local250 = local97 * local855.anInt4751 / 4;
											if (local832.aBoolean93) {
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
												if (local832.anInt1341 == 0) {
													local855.method2477(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method2474(local28, local81 + local97 - local250, local231, local250, local832.anInt1341);
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

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!jn;IIII)V")
	private static void method1999(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt3106 = anInt2662 + (arg1 * (arg0.anInt3107 - anInt2661) >> 16);
		arg0.anInt3109 = anInt2666 + (arg2 * (arg0.anInt3102 - anInt2667) >> 16);
		@Pc(32) Class107 local32 = Static173.method2819(arg0.anInt3104);
		if (local32.anInt3781 != -1) {
			@Pc(42) Class46 local42 = local32.method2740(false, true);
			if (local42 != null) {
				if (arg0.anInt3106 - (local42.anInt4753 + 1 >> 1) <= anInt2665 && arg0.anInt3106 + (local42.anInt4753 + 1 >> 1) >= anInt2662 && arg0.anInt3109 - (local42.anInt4751 + 1 >> 1) <= anInt2668 && arg0.anInt3109 + (local42.anInt4751 + 1 >> 1) >= anInt2666) {
					arg0.aBoolean189 = false;
				} else {
					arg0.aBoolean189 = true;
				}
				return;
			}
		}
		if (arg0.anInt3107 >= anInt2661 && arg0.anInt3107 <= anInt2663 && arg0.anInt3102 >= anInt2667 && arg0.anInt3102 <= anInt2664) {
			arg0.aBoolean189 = false;
		} else {
			arg0.aBoolean189 = true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2661 = arg0;
		anInt2667 = arg1;
		anInt2663 = arg2;
		anInt2664 = arg3;
		anInt2662 = arg4;
		anInt2666 = arg5;
		anInt2665 = arg6;
		anInt2668 = arg7;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()Lclient!ci;")
	public static Class26 method2001() {
		@Pc(3) int local3 = anInt2663 - anInt2661;
		@Pc(7) int local7 = anInt2664 - anInt2667;
		@Pc(15) int local15 = (anInt2665 - anInt2662 << 16) / local3;
		@Pc(23) int local23 = (anInt2668 - anInt2666 << 16) / local7;
		return method2009(local15, local23);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!th;)V")
	public static void method2002(@OriginalArg(0) Class168 arg0) {
		aClass168_90 = arg0;
		aClass186_9.method4568();
		@Pc(9) int local9 = aClass168_90.method4069("details");
		@Pc(14) int[] local14 = aClass168_90.method4044(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass186_9.method4575((long) local14[local16], Static279.method4258(local14[local16], new Class1_Sub14(aClass168_90.method4058(local14[local16], local9))));
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method2003(@OriginalArg(0) int arg0) {
		aClass1_Sub3_Sub15_2 = (Class1_Sub3_Sub15) aClass186_9.method4570((long) arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method2004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static231.anInt4848) {
			return;
		}
		if (arg1 < Static231.anInt4849) {
			local1 = Static231.anInt4849;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static231.anInt4849) {
			return;
		}
		if (local14 > Static231.anInt4848) {
			local14 = Static231.anInt4848;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static231.anInt4853) {
			return;
		}
		if (arg2 < Static231.anInt4852) {
			local25 = Static231.anInt4852;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static231.anInt4852) {
			return;
		}
		if (local38 > Static231.anInt4853) {
			local38 = Static231.anInt4853;
		}
		@Pc(53) int local53 = local25 * Static231.anInt4851 + local1;
		@Pc(59) int local59 = Static231.anInt4851 + local1 - local14;
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

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
	public static void method2005() {
		for (@Pc(1) int local1 = 0; local1 < aClass174_2.anInt5618; local1++) {
			if (aClass174_2.aClass1_Sub3_Sub11Array1[local1] != null) {
				aClass108_11.method2753(aClass174_2.aClass1_Sub3_Sub11Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lclient!nc;")
	public static Class1_Sub3_Sub15 method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub3_Sub15 local4 = (Class1_Sub3_Sub15) aClass186_9.method4567(); local4 != null; local4 = (Class1_Sub3_Sub15) aClass186_9.method4579()) {
			if (local4.aBoolean250 && local4.method2929(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Lclient!mg;")
	public static Class108 method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class108 local3 = new Class108();
		for (@Pc(8) Class1_Sub3_Sub15 local8 = (Class1_Sub3_Sub15) aClass186_9.method4567(); local8 != null; local8 = (Class1_Sub3_Sub15) aClass186_9.method4579()) {
			if (local8.aBoolean250 && local8.method2929(arg1, arg0)) {
				local3.method2753(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
	public static void method2008() {
		@Pc(3) int local3 = anInt2663 - anInt2661;
		@Pc(7) int local7 = anInt2664 - anInt2667;
		@Pc(15) int local15 = (anInt2665 - anInt2662 << 16) / local3;
		@Pc(23) int local23 = (anInt2668 - anInt2666 << 16) / local7;
		method1998(local15, local23);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)Lclient!ci;")
	private static Class26 method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class26 local3 = new Class26();
		for (@Pc(8) Class1_Sub3_Sub11 local8 = (Class1_Sub3_Sub11) aClass108_11.method2754(); local8 != null; local8 = (Class1_Sub3_Sub11) aClass108_11.method2751()) {
			method1999(local8, arg0, arg1);
			local3.method668(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass174_2.anInt5618; local31++) {
			@Pc(40) Class1_Sub3_Sub11 local40 = aClass174_2.aClass1_Sub3_Sub11Array1[local31];
			@Pc(67) boolean local67 = aClass1_Sub3_Sub15_2.method2926(aClass174_2.anIntArray509[local31] & 0x3FFF, local29, aClass174_2.anIntArray509[local31] >> 14 & 0x3FFF, aClass174_2.anIntArray509[local31] >> 28 & 0x3);
			if (local67) {
				local40.anInt3107 = local29[1] - anInt2655;
				local40.anInt3102 = anInt2659 + anInt2656 - local29[2] - 1;
				method1999(local40, arg0, arg1);
				local3.method668(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!qm;Z)V")
	public static void method2010(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt3000 < arg0.aByteArray55.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2199() == 1) {
					local7 = true;
					local9 = arg0.method2199();
					local11 = arg0.method2199();
				}
				@Pc(30) int local30 = arg0.method2199();
				@Pc(34) int local34 = arg0.method2199();
				@Pc(40) int local40 = local30 * 64 - anInt2655;
				@Pc(50) int local50 = anInt2659 + anInt2656 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2657 && local50 < anInt2659) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method2199();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method2199();
										if (aByteArrayArrayArray12[local68][local72] == null) {
											aByteArrayArrayArray12[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method2215();
										if (anIntArrayArrayArray6[local68][local72] == null) {
											anIntArrayArrayArray6[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray6[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method2244();
										@Pc(202) int local202 = arg0.method2199();
										local125--;
										@Pc(207) Class92 local207 = Static166.method2725(local125);
										if (local207.anIntArray300 != null) {
											local207 = local207.method2323();
											if (local207 == null || local207.anInt3213 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean201 || arg1) && local207.anInt3213 != -1) {
											@Pc(236) Class1_Sub3_Sub11 local236 = new Class1_Sub3_Sub11();
											local236.anInt3104 = local207.anInt3213;
											local236.anInt3105 = local202;
											local236.anInt3107 = local68 * 64 + local74;
											local236.anInt3102 = local72 * 64 + 64 - local79;
											aClass108_11.method2753(local236);
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
					local72 = arg0.method2199();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt3000++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt3000 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt3000 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}
}
