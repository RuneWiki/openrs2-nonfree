import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_94;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!ho;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt5571;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!nf;")
	public static Class1_Sub5_Sub14 aClass1_Sub5_Sub14_3;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public static int anInt5573;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public static int anInt5574;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public static int anInt5575;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt5577;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
	public static int anInt5578;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
	public static int anInt5580;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public static int anInt5581;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
	public static int anInt5582;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	public static int anInt5583;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "[I")
	public static int[] anIntArray609;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!il;")
	private static Class86 aClass86_40 = new Class86(16);

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt5572 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!wg;")
	public static Class189 aClass189_13 = new Class189();

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	public static int anInt5576 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lclient!wg;")
	public static Class189 method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class189 local3 = new Class189();
		for (@Pc(8) Class1_Sub5_Sub14 local8 = (Class1_Sub5_Sub14) aClass86_40.method2134(); local8 != null; local8 = (Class1_Sub5_Sub14) aClass86_40.method2141()) {
			if (local8.aBoolean312 && local8.method3128(arg1, arg0)) {
				local3.method4603(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lclient!jo;")
	public static Class96 method4624() {
		@Pc(3) int local3 = anInt5582 - anInt5577;
		@Pc(7) int local7 = anInt5581 - anInt5578;
		@Pc(15) int local15 = (anInt5579 - anInt5584 << 16) / local3;
		@Pc(23) int local23 = (anInt5583 - anInt5580 << 16) / local7;
		return method4635(local15, local23);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method4625(@OriginalArg(0) Class1_Sub13 arg0) {
		label83: while (true) {
			if (arg0.anInt2018 < arg0.aByteArray63.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1853() == 1) {
					local7 = true;
					local9 = arg0.method1853();
					local11 = arg0.method1853();
				}
				@Pc(30) int local30 = arg0.method1853();
				@Pc(34) int local34 = arg0.method1853();
				@Pc(40) int local40 = local30 * 64 - anInt5573;
				@Pc(50) int local50 = anInt5574 + anInt5571 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt5575 && local50 < anInt5574) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method1829();
								if (local113 != 0) {
									if (aByteArrayArrayArray20[local68][local72] == null) {
										aByteArrayArrayArray20[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray20[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method1829();
									if (aByteArrayArrayArray19[local68][local72] == null) {
										aByteArrayArrayArray19[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray19[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method1829();
					if (local113 != 0) {
						arg0.anInt2018++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
	private static void method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt5582 - anInt5577;
		@Pc(7) int local7 = anInt5581 - anInt5578;
		if (anInt5582 < anInt5575) {
			local3++;
		}
		if (anInt5581 < anInt5574) {
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
				local50 = local17 + anInt5577 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray15.length - 1) {
					local142 = anIntArrayArrayArray15[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray16[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray18[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray20[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray19[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray17[local50];
					local28 += anInt5584;
					local38 += anInt5584;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt5580;
							local193 += anInt5580;
							local213 = local172 + anInt5578 >> 6;
							@Pc(219) int local219 = local172 + anInt5578 & 0x3F;
							@Pc(225) int local225 = local17 + anInt5577 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass1_Sub5_Sub14_3.anInt3529 != -1) {
									local250 = aClass1_Sub5_Sub14_3.anInt3529;
								} else if ((local17 + anInt5577 & 0x4) == (local172 + anInt5578 & 0x4)) {
									local250 = anIntArray609[Static154.anInt3085 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static77.method1596(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray609[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray609[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static77.method1596(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static77.method1596(local28, local183, local42, local197, local316);
									} else {
										method4633(Static77.anIntArray131, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static77.method1596(local28, local183, local42, local197, local332);
									}
									method4633(Static77.anIntArray131, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
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
										Static77.method1607(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static77.method1606(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static77.method1607(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static77.method1606(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static77.method1607(local28, local183, local197, 16777215);
										Static77.method1606(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static77.method1607(local366, local183, local197, 16777215);
										Static77.method1606(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static77.method1607(local366, local183, local197, 16777215);
										Static77.method1606(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static77.method1607(local28, local183, local197, 16777215);
										Static77.method1606(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static77.method1606(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static77.method1606(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static77.method1606(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static77.method1606(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static77.method1606(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static77.method1606(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt5584;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt5580;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt5580;
						local97 = local93 - local81;
						if (aClass1_Sub5_Sub14_3.anInt3529 != -1) {
							local104 = aClass1_Sub5_Sub14_3.anInt3529;
						} else if ((local17 + anInt5577 & 0x4) == (local68 + anInt5578 & 0x4)) {
							local104 = anIntArray609[Static154.anInt3085 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static77.method1596(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt5584;
				local50 = local17 + anInt5577 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray16.length - 1) {
					local142 = anIntArrayArrayArray16[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt5580;
							@Pc(785) int local785 = local104 + anInt5578 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt5578 & 0x3F) << 6) + (local17 + anInt5577 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class170 local832 = Static49.method907(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class57_Sub1 local855 = local832.method4243(local849, local213);
										if (local855 != null) {
											local231 = local42 * local855.anInt3768 / 4;
											local250 = local97 * local855.anInt3766 / 4;
											if (local832.aBoolean482) {
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
												if (local832.anInt5095 == 0) {
													local855.method1657(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method1652(local28, local81 + local97 - local250, local231, local250, local832.anInt5095);
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method4628(@OriginalArg(0) int arg0) {
		aClass1_Sub5_Sub14_3 = (Class1_Sub5_Sub14) aClass86_40.method2136((long) arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fh;Z)V")
	public static void method4629(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt2018 < arg0.aByteArray63.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1853() == 1) {
					local7 = true;
					local9 = arg0.method1853();
					local11 = arg0.method1853();
				}
				@Pc(30) int local30 = arg0.method1853();
				@Pc(34) int local34 = arg0.method1853();
				@Pc(40) int local40 = local30 * 64 - anInt5573;
				@Pc(50) int local50 = anInt5574 + anInt5571 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt5575 && local50 < anInt5574) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method1853();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method1853();
										if (aByteArrayArrayArray17[local68][local72] == null) {
											aByteArrayArrayArray17[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray17[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method1878();
										if (anIntArrayArrayArray16[local68][local72] == null) {
											anIntArrayArrayArray16[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray16[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method1879();
										@Pc(202) int local202 = arg0.method1853();
										local125--;
										@Pc(207) Class150 local207 = Static160.method2744(local125);
										if (local207.anIntArray507 != null) {
											local207 = local207.method3884();
											if (local207 == null || local207.anInt4544 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean422 || arg1) && local207.anInt4544 != -1) {
											@Pc(236) Class1_Sub5_Sub1 local236 = new Class1_Sub5_Sub1();
											local236.anInt359 = local207.anInt4544;
											local236.anInt365 = local202;
											local236.anInt369 = local68 * 64 + local74;
											local236.anInt361 = local72 * 64 + 64 - local79;
											aClass189_13.method4603(local236);
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
					local72 = arg0.method1853();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt2018++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt2018 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt2018 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!bb;IIII)V")
	private static void method4630(@OriginalArg(0) Class1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt368 = anInt5584 + (arg1 * (arg0.anInt369 - anInt5577) >> 16);
		arg0.anInt360 = anInt5580 + (arg2 * (arg0.anInt361 - anInt5578) >> 16);
		@Pc(32) Class136 local32 = Static160.method2739(arg0.anInt359);
		if (local32.anInt4062 != -1) {
			@Pc(42) Class57 local42 = local32.method3519(true, false);
			if (local42 != null) {
				if (arg0.anInt368 - (local42.anInt3768 + 1 >> 1) <= anInt5579 && arg0.anInt368 + (local42.anInt3768 + 1 >> 1) >= anInt5584 && arg0.anInt360 - (local42.anInt3766 + 1 >> 1) <= anInt5583 && arg0.anInt360 + (local42.anInt3766 + 1 >> 1) >= anInt5580) {
					arg0.aBoolean35 = false;
				} else {
					arg0.aBoolean35 = true;
				}
				return;
			}
		}
		if (arg0.anInt369 >= anInt5577 && arg0.anInt369 <= anInt5582 && arg0.anInt361 >= anInt5578 && arg0.anInt361 <= anInt5581) {
			arg0.aBoolean35 = false;
		} else {
			arg0.aBoolean35 = true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!nm;)V")
	public static void method4631(@OriginalArg(0) Class119 arg0) {
		aClass119_94 = arg0;
		aClass86_40.method2138();
		@Pc(9) int local9 = aClass119_94.method3241("details");
		@Pc(14) int[] local14 = aClass119_94.method3246(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass86_40.method2144(Static220.method3563(local14[local16], new Class1_Sub13(aClass119_94.method3235(local14[local16], local9))), (long) local14[local16]);
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
	public static void method4632() {
		for (@Pc(1) int local1 = 0; local1 < aClass78_3.anInt2253; local1++) {
			if (aClass78_3.aClass1_Sub5_Sub1Array1[local1] != null) {
				aClass189_13.method4603(aClass78_3.aClass1_Sub5_Sub1Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method4633(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static77.anInt1705) {
			return;
		}
		if (arg1 < Static77.anInt1708) {
			local1 = Static77.anInt1708;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static77.anInt1708) {
			return;
		}
		if (local14 > Static77.anInt1705) {
			local14 = Static77.anInt1705;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static77.anInt1707) {
			return;
		}
		if (arg2 < Static77.anInt1709) {
			local25 = Static77.anInt1709;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static77.anInt1709) {
			return;
		}
		if (local38 > Static77.anInt1707) {
			local38 = Static77.anInt1707;
		}
		@Pc(53) int local53 = local25 * Static77.anInt1706 + local1;
		@Pc(59) int local59 = Static77.anInt1706 + local1 - local14;
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

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Lclient!nf;")
	public static Class1_Sub5_Sub14 method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub5_Sub14 local4 = (Class1_Sub5_Sub14) aClass86_40.method2134(); local4 != null; local4 = (Class1_Sub5_Sub14) aClass86_40.method2141()) {
			if (local4.aBoolean312 && local4.method3128(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)Lclient!jo;")
	private static Class96 method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class96 local3 = new Class96();
		for (@Pc(8) Class1_Sub5_Sub1 local8 = (Class1_Sub5_Sub1) aClass189_13.method4600(); local8 != null; local8 = (Class1_Sub5_Sub1) aClass189_13.method4601()) {
			method4630(local8, arg0, arg1);
			local3.method2336(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass78_3.anInt2253; local31++) {
			@Pc(40) Class1_Sub5_Sub1 local40 = aClass78_3.aClass1_Sub5_Sub1Array1[local31];
			@Pc(67) boolean local67 = aClass1_Sub5_Sub14_3.method3125(local29, aClass78_3.anIntArray157[local31] & 0x3FFF, aClass78_3.anIntArray157[local31] >> 14 & 0x3FFF, aClass78_3.anIntArray157[local31] >> 28 & 0x3);
			if (local67) {
				local40.anInt369 = local29[1] - anInt5573;
				local40.anInt361 = anInt5574 + anInt5571 - local29[2] - 1;
				method4630(local40, arg0, arg1);
				local3.method2336(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V")
	public static void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static110.anInt2280; local1++) {
			@Pc(8) Class192 local8 = Static64.method1137(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt5629;
				if (local14 >= 0 && !Static119.anInterface5_1.method1472(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt5624 >= 0) {
					local29 = local8.anInt5624;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static119.anIntArray174[Static223.method3596(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static119.anIntArray174[Static223.method3596(Static119.anInterface5_1.method1486(local14), 96)];
				} else if (local8.anInt5619 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt5619;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static119.anIntArray174[Static223.method3596(local57, 96)];
				}
				anIntArray609[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt5577 = arg0;
		anInt5578 = arg1;
		anInt5582 = arg2;
		anInt5581 = arg3;
		anInt5584 = arg4;
		anInt5580 = arg5;
		anInt5579 = arg6;
		anInt5583 = arg7;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lclient!fh;)V")
	public static void method4638(@OriginalArg(0) Class1_Sub13 arg0) {
		label83: while (true) {
			if (arg0.anInt2018 < arg0.aByteArray63.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method1853() == 1) {
					local7 = true;
					local9 = arg0.method1853();
					local11 = arg0.method1853();
				}
				@Pc(30) int local30 = arg0.method1853();
				@Pc(34) int local34 = arg0.method1853();
				@Pc(40) int local40 = local30 * 64 - anInt5573;
				@Pc(50) int local50 = anInt5574 + anInt5571 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt5575 && local50 < anInt5574) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method1829();
								if (local113 != 0) {
									if (aByteArrayArrayArray16[local68][local72] == null) {
										aByteArrayArrayArray16[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray16[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method1829();
									if (aByteArrayArrayArray18[local68][local72] == null) {
										aByteArrayArrayArray18[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray18[local68][local72][(63 - local79 << 6) + local74] = local146;
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
					local113 = arg0.method1829();
					if (local113 != 0) {
						arg0.anInt2018++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	public static void method4639() {
		@Pc(3) int local3 = anInt5582 - anInt5577;
		@Pc(7) int local7 = anInt5581 - anInt5578;
		@Pc(15) int local15 = (anInt5579 - anInt5584 << 16) / local3;
		@Pc(23) int local23 = (anInt5583 - anInt5580 << 16) / local7;
		method4626(local15, local23);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Lclient!nf;")
	public static Class1_Sub5_Sub14 method4640(@OriginalArg(0) int arg0) {
		return (Class1_Sub5_Sub14) aClass86_40.method2136((long) arg0);
	}
}
