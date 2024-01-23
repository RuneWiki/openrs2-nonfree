import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!ph;")
	public static Class138 aClass138_41;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public static int anInt2559;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt2561;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!ed;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_2;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!to;")
	public static Class172 aClass172_3;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	public static int anInt2563;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
	public static int anInt2567;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	public static int anInt2568;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
	public static int anInt2569;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public static int anInt2570;

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
	public static int anInt2571;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!s;")
	private static Class156 aClass156_10 = new Class156(16);

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2558 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt2562 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!ad;")
	public static Class5 aClass5_11 = new Class5();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!sb;)V")
	public static void method2032(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt3290 < arg0.aByteArray34.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2595() == 1) {
					local7 = true;
					local9 = arg0.method2595();
					local11 = arg0.method2595();
				}
				@Pc(30) int local30 = arg0.method2595();
				@Pc(34) int local34 = arg0.method2595();
				@Pc(40) int local40 = local30 * 64 - anInt2560;
				@Pc(50) int local50 = anInt2563 + anInt2559 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2561 && local50 < anInt2563) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2598();
								if (local113 != 0) {
									if (aByteArrayArrayArray14[local68][local72] == null) {
										aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2598();
									if (aByteArrayArrayArray12[local68][local72] == null) {
										aByteArrayArrayArray12[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method2598();
					if (local113 != 0) {
						arg0.anInt3290++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method2033(@OriginalArg(0) int arg0) {
		aClass1_Sub1_Sub8_2 = (Class1_Sub1_Sub8) aClass156_10.method3821((long) arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "()Lclient!bo;")
	public static Class24 method2034() {
		@Pc(3) int local3 = anInt2565 - anInt2570;
		@Pc(7) int local7 = anInt2571 - anInt2564;
		@Pc(15) int local15 = (anInt2569 - anInt2568 << 16) / local3;
		@Pc(23) int local23 = (anInt2566 - anInt2567 << 16) / local7;
		return method2036(local15, local23);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V")
	private static void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt2565 - anInt2570;
		@Pc(7) int local7 = anInt2571 - anInt2564;
		if (anInt2565 < anInt2561) {
			local3++;
		}
		if (anInt2571 < anInt2563) {
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
				local50 = local17 + anInt2570 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray8.length - 1) {
					local142 = anIntArrayArrayArray8[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray13[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray16[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray14[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray12[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray15[local50];
					local28 += anInt2568;
					local38 += anInt2568;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt2567;
							local193 += anInt2567;
							local213 = local172 + anInt2564 >> 6;
							@Pc(219) int local219 = local172 + anInt2564 & 0x3F;
							@Pc(225) int local225 = local17 + anInt2570 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass1_Sub1_Sub8_2.anInt1052 != -1) {
									local250 = aClass1_Sub1_Sub8_2.anInt1052;
								} else if ((local17 + anInt2570 & 0x4) == (local172 + anInt2564 & 0x4)) {
									local250 = anIntArray204[Static307.anInt5799 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static41.method730(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray204[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray204[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static41.method730(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static41.method730(local28, local183, local42, local197, local316);
									} else {
										method2039(Static41.anIntArray62, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static41.method730(local28, local183, local42, local197, local332);
									}
									method2039(Static41.anIntArray62, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
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
										Static41.method741(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static41.method752(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static41.method741(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static41.method752(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static41.method741(local28, local183, local197, 16777215);
										Static41.method752(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static41.method741(local366, local183, local197, 16777215);
										Static41.method752(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static41.method741(local366, local183, local197, 16777215);
										Static41.method752(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static41.method741(local28, local183, local197, 16777215);
										Static41.method752(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static41.method752(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static41.method752(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static41.method752(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static41.method752(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static41.method752(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static41.method752(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt2568;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt2567;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt2567;
						local97 = local93 - local81;
						if (aClass1_Sub1_Sub8_2.anInt1052 != -1) {
							local104 = aClass1_Sub1_Sub8_2.anInt1052;
						} else if ((local17 + anInt2570 & 0x4) == (local68 + anInt2564 & 0x4)) {
							local104 = anIntArray204[Static307.anInt5799 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static41.method730(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt2568;
				local50 = local17 + anInt2570 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray7.length - 1) {
					local142 = anIntArrayArrayArray7[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt2567;
							@Pc(785) int local785 = local104 + anInt2564 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt2564 & 0x3F) << 6) + (local17 + anInt2570 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class79 local832 = Static97.method1400(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class103_Sub2 local855 = local832.method1788(local849, local213);
										if (local855 != null) {
											local231 = local42 * local855.anInt5857 / 4;
											local250 = local97 * local855.anInt5858 / 4;
											if (local832.aBoolean162) {
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
												if (local832.anInt2173 == 0) {
													local855.method4601(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method4607(local28, local81 + local97 - local250, local231, local250, local832.anInt2173);
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

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIII)Lclient!bo;")
	private static Class24 method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class24 local3 = new Class24();
		for (@Pc(8) Class1_Sub1_Sub10 local8 = (Class1_Sub1_Sub10) aClass5_11.method49(); local8 != null; local8 = (Class1_Sub1_Sub10) aClass5_11.method51()) {
			method2049(local8, arg0, arg1);
			local3.method473(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass172_3.anInt5300; local31++) {
			@Pc(40) Class1_Sub1_Sub10 local40 = aClass172_3.aClass1_Sub1_Sub10Array1[local31];
			@Pc(67) boolean local67 = aClass1_Sub1_Sub8_2.method940(aClass172_3.anIntArray489[local31] >> 14 & 0x3FFF, local29, aClass172_3.anIntArray489[local31] & 0x3FFF, aClass172_3.anIntArray489[local31] >> 28 & 0x3);
			if (local67) {
				local40.anInt1633 = local29[1] - anInt2560;
				local40.anInt1630 = anInt2563 + anInt2559 - local29[2] - 1;
				method2049(local40, arg0, arg1);
				local3.method473(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static78.anInt1465; local1++) {
			@Pc(8) Class59 local8 = Static229.method3600(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt1514;
				if (local14 >= 0 && !Static18.anInterface1_1.method1629(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt1510 >= 0) {
					local29 = local8.anInt1510;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static18.anIntArray26[Static48.method851(96, local57)];
				} else if (local14 >= 0) {
					local64 = Static18.anIntArray26[Static48.method851(96, Static18.anInterface1_1.method1625(local14))];
				} else if (local8.anInt1520 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt1520;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static18.anIntArray26[Static48.method851(96, local57)];
				}
				anIntArray204[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Lclient!ed;")
	public static Class1_Sub1_Sub8 method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub1_Sub8 local4 = (Class1_Sub1_Sub8) aClass156_10.method3822(); local4 != null; local4 = (Class1_Sub1_Sub8) aClass156_10.method3820()) {
			if (local4.aBoolean81 && local4.method943(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method2039(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static41.anInt825) {
			return;
		}
		if (arg1 < Static41.anInt828) {
			local1 = Static41.anInt828;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static41.anInt828) {
			return;
		}
		if (local14 > Static41.anInt825) {
			local14 = Static41.anInt825;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static41.anInt827) {
			return;
		}
		if (arg2 < Static41.anInt824) {
			local25 = Static41.anInt824;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static41.anInt824) {
			return;
		}
		if (local38 > Static41.anInt827) {
			local38 = Static41.anInt827;
		}
		@Pc(53) int local53 = local25 * Static41.anInt829 + local1;
		@Pc(59) int local59 = Static41.anInt829 + local1 - local14;
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

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)Lclient!ad;")
	public static Class5 method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class5 local3 = new Class5();
		for (@Pc(8) Class1_Sub1_Sub8 local8 = (Class1_Sub1_Sub8) aClass156_10.method3822(); local8 != null; local8 = (Class1_Sub1_Sub8) aClass156_10.method3820()) {
			if (local8.aBoolean81 && local8.method943(arg1, arg0)) {
				local3.method48(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ph;)V")
	public static void method2041(@OriginalArg(0) Class138 arg0) {
		aClass138_41 = arg0;
		aClass156_10.method3826();
		@Pc(9) int local9 = aClass138_41.method3331("details");
		@Pc(14) int[] local14 = aClass138_41.method3334(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass156_10.method3816((long) local14[local16], Static305.method4554(new Class1_Sub14(aClass138_41.method3346(local9, local14[local16])), local14[local16]));
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2570 = arg0;
		anInt2564 = arg1;
		anInt2565 = arg2;
		anInt2571 = arg3;
		anInt2568 = arg4;
		anInt2567 = arg5;
		anInt2569 = arg6;
		anInt2566 = arg7;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!sb;Z)V")
	public static void method2043(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt3290 < arg0.aByteArray34.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2595() == 1) {
					local7 = true;
					local9 = arg0.method2595();
					local11 = arg0.method2595();
				}
				@Pc(30) int local30 = arg0.method2595();
				@Pc(34) int local34 = arg0.method2595();
				@Pc(40) int local40 = local30 * 64 - anInt2560;
				@Pc(50) int local50 = anInt2563 + anInt2559 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2561 && local50 < anInt2563) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method2595();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method2595();
										if (aByteArrayArrayArray15[local68][local72] == null) {
											aByteArrayArrayArray15[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray15[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method2588();
										if (anIntArrayArrayArray7[local68][local72] == null) {
											anIntArrayArrayArray7[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray7[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method2593();
										@Pc(202) int local202 = arg0.method2595();
										local125--;
										@Pc(207) Class43 local207 = Static189.method3080(local125);
										if (local207.anIntArray97 != null) {
											local207 = local207.method1009();
											if (local207 == null || local207.anInt1168 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean90 || arg1) && local207.anInt1168 != -1) {
											@Pc(236) Class1_Sub1_Sub10 local236 = new Class1_Sub1_Sub10();
											local236.anInt1638 = local207.anInt1168;
											local236.anInt1635 = local202;
											local236.anInt1633 = local68 * 64 + local74;
											local236.anInt1630 = local72 * 64 + 64 - local79;
											aClass5_11.method48(local236);
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
					local72 = arg0.method2595();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt3290++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt3290 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt3290 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	public static void method2044() {
		@Pc(3) int local3 = anInt2565 - anInt2570;
		@Pc(7) int local7 = anInt2571 - anInt2564;
		@Pc(15) int local15 = (anInt2569 - anInt2568 << 16) / local3;
		@Pc(23) int local23 = (anInt2566 - anInt2567 << 16) / local7;
		method2035(local15, local23);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lclient!ed;")
	public static Class1_Sub1_Sub8 method2045(@OriginalArg(0) int arg0) {
		return (Class1_Sub1_Sub8) aClass156_10.method3821((long) arg0);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "()V")
	public static void method2046() {
		for (@Pc(1) int local1 = 0; local1 < aClass172_3.anInt5300; local1++) {
			if (aClass172_3.aClass1_Sub1_Sub10Array1[local1] != null) {
				aClass5_11.method48(aClass172_3.aClass1_Sub1_Sub10Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lclient!sb;)V")
	public static void method2047(@OriginalArg(0) Class1_Sub14 arg0) {
		label83: while (true) {
			if (arg0.anInt3290 < arg0.aByteArray34.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2595() == 1) {
					local7 = true;
					local9 = arg0.method2595();
					local11 = arg0.method2595();
				}
				@Pc(30) int local30 = arg0.method2595();
				@Pc(34) int local34 = arg0.method2595();
				@Pc(40) int local40 = local30 * 64 - anInt2560;
				@Pc(50) int local50 = anInt2563 + anInt2559 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2561 && local50 < anInt2563) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2598();
								if (local113 != 0) {
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2598();
									if (aByteArrayArrayArray16[local68][local72] == null) {
										aByteArrayArrayArray16[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray16[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method2598();
					if (local113 != 0) {
						arg0.anInt3290++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!gi;IIII)V")
	private static void method2049(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1632 = anInt2568 + (arg1 * (arg0.anInt1633 - anInt2570) >> 16);
		arg0.anInt1637 = anInt2567 + (arg2 * (arg0.anInt1630 - anInt2564) >> 16);
		@Pc(32) Class81 local32 = Static50.method874(arg0.anInt1638);
		if (local32.anInt2196 != -1) {
			@Pc(42) Class103 local42 = local32.method1805(false, true);
			if (local42 != null) {
				if (arg0.anInt1632 - (local42.anInt5857 + 1 >> 1) <= anInt2569 && arg0.anInt1632 + (local42.anInt5857 + 1 >> 1) >= anInt2568 && arg0.anInt1637 - (local42.anInt5858 + 1 >> 1) <= anInt2566 && arg0.anInt1637 + (local42.anInt5858 + 1 >> 1) >= anInt2567) {
					arg0.aBoolean127 = false;
				} else {
					arg0.aBoolean127 = true;
				}
				return;
			}
		}
		if (arg0.anInt1633 >= anInt2570 && arg0.anInt1633 <= anInt2565 && arg0.anInt1630 >= anInt2564 && arg0.anInt1630 <= anInt2571) {
			arg0.aBoolean127 = false;
		} else {
			arg0.aBoolean127 = true;
		}
	}
}
