import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!fh;")
	public static Class58 aClass58_65;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!wg;")
	public static Class4_Sub3_Sub22 aClass4_Sub3_Sub22_3;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2960;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!po;")
	public static Class141 aClass141_6;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt2961;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	public static int anInt2962;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public static int anInt2965;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public static int anInt2966;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	public static int anInt2968;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public static int anInt2969;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2971;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
	public static int anInt2972;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
	public static int anInt2973;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!ic;")
	private static Class85 aClass85_14 = new Class85(16);

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!uk;")
	public static Class178 aClass178_12 = new Class178();

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public static int anInt2963 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public static int anInt2964 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method2400(@OriginalArg(0) Class58 arg0) {
		aClass58_65 = arg0;
		aClass85_14.method1848();
		@Pc(9) int local9 = aClass58_65.method1362("details");
		@Pc(14) int[] local14 = aClass58_65.method1363(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass85_14.method1841(Static90.method1562(local14[local16], new Class4_Sub10(aClass58_65.method1372(local9, local14[local16]))), (long) local14[local16]);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!wg;")
	public static Class4_Sub3_Sub22 method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub3_Sub22 local4 = (Class4_Sub3_Sub22) aClass85_14.method1843(); local4 != null; local4 = (Class4_Sub3_Sub22) aClass85_14.method1844()) {
			if (local4.aBoolean421 && local4.method4791(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!uk;")
	public static Class178 method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class178 local3 = new Class178();
		for (@Pc(8) Class4_Sub3_Sub22 local8 = (Class4_Sub3_Sub22) aClass85_14.method1843(); local8 != null; local8 = (Class4_Sub3_Sub22) aClass85_14.method1844()) {
			if (local8.aBoolean421 && local8.method4791(arg0, arg1)) {
				local3.method4370(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	private static void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt2972 - anInt2973;
		@Pc(7) int local7 = anInt2966 - anInt2967;
		if (anInt2972 < anInt2965) {
			local3++;
		}
		if (anInt2966 < anInt2960) {
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
				local50 = local17 + anInt2973 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray7.length - 1) {
					local142 = anIntArrayArrayArray7[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray14[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray13[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray10[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray11[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray12[local50];
					local28 += anInt2969;
					local38 += anInt2969;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt2968;
							local193 += anInt2968;
							local213 = local172 + anInt2967 >> 6;
							@Pc(219) int local219 = local172 + anInt2967 & 0x3F;
							@Pc(225) int local225 = local17 + anInt2973 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass4_Sub3_Sub22_3.anInt5999 != -1) {
									local250 = aClass4_Sub3_Sub22_3.anInt5999;
								} else if ((local17 + anInt2973 & 0x4) == (local172 + anInt2967 & 0x4)) {
									local250 = anIntArray266[Static34.anInt549 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static270.method4242(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray266[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray266[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static270.method4242(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static270.method4242(local28, local183, local42, local197, local316);
									} else {
										method2416(Static270.anIntArray561, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static270.method4242(local28, local183, local42, local197, local332);
									}
									method2416(Static270.anIntArray561, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
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
										Static270.method4249(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static270.method4251(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static270.method4249(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static270.method4251(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static270.method4249(local28, local183, local197, 16777215);
										Static270.method4251(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static270.method4249(local366, local183, local197, 16777215);
										Static270.method4251(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static270.method4249(local366, local183, local197, 16777215);
										Static270.method4251(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static270.method4249(local28, local183, local197, 16777215);
										Static270.method4251(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static270.method4251(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static270.method4251(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static270.method4251(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static270.method4251(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static270.method4251(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static270.method4251(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt2969;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt2968;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt2968;
						local97 = local93 - local81;
						if (aClass4_Sub3_Sub22_3.anInt5999 != -1) {
							local104 = aClass4_Sub3_Sub22_3.anInt5999;
						} else if ((local17 + anInt2973 & 0x4) == (local68 + anInt2967 & 0x4)) {
							local104 = anIntArray266[Static34.anInt549 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static270.method4242(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt2969;
				local50 = local17 + anInt2973 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray6.length - 1) {
					local142 = anIntArrayArrayArray6[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt2968;
							@Pc(785) int local785 = local104 + anInt2967 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt2967 & 0x3F) << 6) + (local17 + anInt2973 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class146 local832 = Static80.method1400(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class56_Sub1 local855 = local832.method3594(local849, local213);
										if (local855 != null) {
											local231 = local42 * local855.anInt3408 / 4;
											local250 = local97 * local855.anInt3413 / 4;
											if (local832.aBoolean304) {
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
												if (local832.anInt4307 == 0) {
													local855.method1315(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method1316(local28, local81 + local97 - local250, local231, local250, local832.anInt4307);
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

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lclient!ll;")
	public static Class114 method2404() {
		@Pc(3) int local3 = anInt2972 - anInt2973;
		@Pc(7) int local7 = anInt2966 - anInt2967;
		@Pc(15) int local15 = (anInt2970 - anInt2969 << 16) / local3;
		@Pc(23) int local23 = (anInt2971 - anInt2968 << 16) / local7;
		return method2417(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;)V")
	public static void method2405(@OriginalArg(0) Class4_Sub10 arg0) {
		label83: while (true) {
			if (arg0.anInt5713 < arg0.aByteArray71.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method4666() == 1) {
					local7 = true;
					local9 = arg0.method4666();
					local11 = arg0.method4666();
				}
				@Pc(30) int local30 = arg0.method4666();
				@Pc(34) int local34 = arg0.method4666();
				@Pc(40) int local40 = local30 * 64 - anInt2962;
				@Pc(50) int local50 = anInt2960 + anInt2961 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2965 && local50 < anInt2960) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method4674();
								if (local113 != 0) {
									if (aByteArrayArrayArray14[local68][local72] == null) {
										aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method4674();
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method4674();
					if (local113 != 0) {
						arg0.anInt5713++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	public static void method2407() {
		for (@Pc(1) int local1 = 0; local1 < aClass141_6.anInt4220; local1++) {
			if (aClass141_6.aClass4_Sub3_Sub7Array1[local1] != null) {
				aClass178_12.method4370(aClass141_6.aClass4_Sub3_Sub7Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2973 = arg0;
		anInt2967 = arg1;
		anInt2972 = arg2;
		anInt2966 = arg3;
		anInt2969 = arg4;
		anInt2968 = arg5;
		anInt2970 = arg6;
		anInt2971 = arg7;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method2409(@OriginalArg(0) int arg0) {
		aClass4_Sub3_Sub22_3 = (Class4_Sub3_Sub22) aClass85_14.method1845((long) arg0);
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	public static void method2410() {
		@Pc(3) int local3 = anInt2972 - anInt2973;
		@Pc(7) int local7 = anInt2966 - anInt2967;
		@Pc(15) int local15 = (anInt2970 - anInt2969 << 16) / local3;
		@Pc(23) int local23 = (anInt2971 - anInt2968 << 16) / local7;
		method2403(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fg;IIII)V")
	private static void method2411(@OriginalArg(0) Class4_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1766 = anInt2969 + (arg1 * (arg0.anInt1768 - anInt2973) >> 16);
		arg0.anInt1764 = anInt2968 + (arg2 * (arg0.anInt1769 - anInt2967) >> 16);
		@Pc(32) Class83 local32 = Static142.method2192(arg0.anInt1760);
		if (local32.anInt2277 != -1) {
			@Pc(42) Class56 local42 = local32.method1812(false, true);
			if (local42 != null) {
				if (arg0.anInt1766 - (local42.anInt3408 + 1 >> 1) <= anInt2970 && arg0.anInt1766 + (local42.anInt3408 + 1 >> 1) >= anInt2969 && arg0.anInt1764 - (local42.anInt3413 + 1 >> 1) <= anInt2971 && arg0.anInt1764 + (local42.anInt3413 + 1 >> 1) >= anInt2968) {
					arg0.aBoolean106 = false;
				} else {
					arg0.aBoolean106 = true;
				}
				return;
			}
		}
		if (arg0.anInt1768 >= anInt2973 && arg0.anInt1768 <= anInt2972 && arg0.anInt1769 >= anInt2967 && arg0.anInt1769 <= anInt2966) {
			arg0.aBoolean106 = false;
		} else {
			arg0.aBoolean106 = true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lclient!wg;")
	public static Class4_Sub3_Sub22 method2412(@OriginalArg(0) int arg0) {
		return (Class4_Sub3_Sub22) aClass85_14.method1845((long) arg0);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!fd;)V")
	public static void method2413(@OriginalArg(0) Class4_Sub10 arg0) {
		label83: while (true) {
			if (arg0.anInt5713 < arg0.aByteArray71.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method4666() == 1) {
					local7 = true;
					local9 = arg0.method4666();
					local11 = arg0.method4666();
				}
				@Pc(30) int local30 = arg0.method4666();
				@Pc(34) int local34 = arg0.method4666();
				@Pc(40) int local40 = local30 * 64 - anInt2962;
				@Pc(50) int local50 = anInt2960 + anInt2961 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2965 && local50 < anInt2960) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method4674();
								if (local113 != 0) {
									if (aByteArrayArrayArray10[local68][local72] == null) {
										aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method4674();
									if (aByteArrayArrayArray11[local68][local72] == null) {
										aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method4674();
					if (local113 != 0) {
						arg0.anInt5713++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;Z)V")
	public static void method2414(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt5713 < arg0.aByteArray71.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method4666() == 1) {
					local7 = true;
					local9 = arg0.method4666();
					local11 = arg0.method4666();
				}
				@Pc(30) int local30 = arg0.method4666();
				@Pc(34) int local34 = arg0.method4666();
				@Pc(40) int local40 = local30 * 64 - anInt2962;
				@Pc(50) int local50 = anInt2960 + anInt2961 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt2965 && local50 < anInt2960) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method4666();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method4666();
										if (aByteArrayArrayArray12[local68][local72] == null) {
											aByteArrayArrayArray12[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method4655();
										if (anIntArrayArrayArray6[local68][local72] == null) {
											anIntArrayArrayArray6[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray6[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method4653();
										@Pc(202) int local202 = arg0.method4666();
										local125--;
										@Pc(207) Class184 local207 = Static6.method99(local125);
										if (local207.anIntArray631 != null) {
											local207 = local207.method4490();
											if (local207 == null || local207.anInt5527 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean376 || arg1) && local207.anInt5527 != -1) {
											@Pc(236) Class4_Sub3_Sub7 local236 = new Class4_Sub3_Sub7();
											local236.anInt1760 = local207.anInt5527;
											local236.anInt1763 = local202;
											local236.anInt1768 = local68 * 64 + local74;
											local236.anInt1769 = local72 * 64 + 64 - local79;
											aClass178_12.method4370(local236);
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
					local72 = arg0.method4666();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt5713++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt5713 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt5713 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	public static void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static76.anInt5720; local1++) {
			@Pc(8) Class129 local8 = Static182.method2948(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt3877;
				if (local14 >= 0 && !Static158.anInterface5_1.method441(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt3870 >= 0) {
					local29 = local8.anInt3870;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static158.anIntArray295[Static145.method2293(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static158.anIntArray295[Static145.method2293(Static158.anInterface5_1.method446(local14), 96)];
				} else if (local8.anInt3869 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt3869;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static158.anIntArray295[Static145.method2293(local57, 96)];
				}
				anIntArray266[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method2416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static270.anInt5187) {
			return;
		}
		if (arg1 < Static270.anInt5186) {
			local1 = Static270.anInt5186;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static270.anInt5186) {
			return;
		}
		if (local14 > Static270.anInt5187) {
			local14 = Static270.anInt5187;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static270.anInt5188) {
			return;
		}
		if (arg2 < Static270.anInt5184) {
			local25 = Static270.anInt5184;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static270.anInt5184) {
			return;
		}
		if (local38 > Static270.anInt5188) {
			local38 = Static270.anInt5188;
		}
		@Pc(53) int local53 = local25 * Static270.anInt5189 + local1;
		@Pc(59) int local59 = Static270.anInt5189 + local1 - local14;
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

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Lclient!ll;")
	private static Class114 method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class114 local3 = new Class114();
		for (@Pc(8) Class4_Sub3_Sub7 local8 = (Class4_Sub3_Sub7) aClass178_12.method4369(); local8 != null; local8 = (Class4_Sub3_Sub7) aClass178_12.method4377()) {
			method2411(local8, arg0, arg1);
			local3.method2625(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass141_6.anInt4220; local31++) {
			@Pc(40) Class4_Sub3_Sub7 local40 = aClass141_6.aClass4_Sub3_Sub7Array1[local31];
			@Pc(67) boolean local67 = aClass4_Sub3_Sub22_3.method4790(aClass141_6.anIntArray448[local31] & 0x3FFF, aClass141_6.anIntArray448[local31] >> 28 & 0x3, local29, aClass141_6.anIntArray448[local31] >> 14 & 0x3FFF);
			if (local67) {
				local40.anInt1768 = local29[1] - anInt2962;
				local40.anInt1769 = anInt2960 + anInt2961 - local29[2] - 1;
				method2411(local40, arg0, arg1);
				local3.method2625(local40);
			}
		}
		return local3;
	}
}
