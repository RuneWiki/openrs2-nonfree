import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "J")
	public static long aLong6;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public static int anInt122;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!l;")
	public static Class45 aClass45_1 = new Class45(32);

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[B")
	public static byte[] aByteArray2 = new byte[520];

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!dd;")
	public static Class13 aClass13_35 = Static161.method2971(")4lang)4de");

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!dd;")
	private static Class13 aClass13_37 = Static161.method2971("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_36 = aClass13_37;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!th;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_38 = Static161.method2971("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!dd;")
	public static Class13 aClass13_39 = Static161.method2971("null");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!fd;I)V")
	public static void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		if (arg2.anInt1558 == 1) {
			Static12.method462(arg2.anInt1630, Static16.aClass13_253, arg2.aClass13_549, (short) 58, 0, 0L);
		}
		if (arg2.anInt1558 == 2 && !Static118.aBoolean233) {
			@Pc(37) Class13 local37 = Static17.method652(arg2);
			if (local37 != null) {
				Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static75.aClass13_724, arg2.aClass13_542 }), local37, (short) 31, -1, 0L);
			}
		}
		if (arg2.anInt1558 == 3) {
			Static12.method462(arg2.anInt1630, Static16.aClass13_253, Static135.aClass13_1152, (short) 33, 0, 0L);
		}
		if (arg2.anInt1558 == 4) {
			Static12.method462(arg2.anInt1630, Static16.aClass13_253, arg2.aClass13_549, (short) 37, 0, 0L);
		}
		if (arg2.anInt1558 == 5) {
			Static12.method462(arg2.anInt1630, Static16.aClass13_253, arg2.aClass13_549, (short) 22, 0, 0L);
		}
		if (arg2.anInt1558 == 6 && Static89.aClass20_7 == null) {
			Static12.method462(arg2.anInt1630, Static16.aClass13_253, arg2.aClass13_549, (short) 30, -1, 0L);
		}
		@Pc(155) int local155;
		@Pc(149) int local149;
		if (arg2.anInt1619 == 2) {
			local149 = 0;
			for (@Pc(151) int local151 = 0; local151 < arg2.anInt1603; local151++) {
				for (local155 = 0; local155 < arg2.anInt1559; local155++) {
					@Pc(164) int local164 = (arg2.anInt1617 + 32) * local155;
					@Pc(171) int local171 = local151 * (arg2.anInt1591 + 32);
					if (local149 < 20) {
						local164 += arg2.anIntArray164[local149];
						local171 += arg2.anIntArray166[local149];
					}
					if (local164 <= arg1 && arg0 >= local171 && arg1 < local164 + 32 && arg0 < local171 + 32) {
						Static133.anInt3348 = local149;
						Static11.aClass20_1 = arg2;
						if (arg2.anIntArray168[local149] > 0) {
							@Pc(231) Class1_Sub2_Sub6 local231 = Static184.method2994(arg2.anIntArray168[local149] - 1);
							if (Static116.anInt3103 == 1 && Static180.method2976(Static53.method1292(arg2))) {
								if (arg2.anInt1630 != Static140.anInt3474 || Static156.anInt3693 != local149) {
									Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static141.aClass13_1202, Static132.aClass13_1117, local231.aClass13_463 }), Static57.aClass13_608, (short) 3, local149, (long) local231.anInt1306);
								}
							} else if (!Static118.aBoolean233 || !Static180.method2976(Static53.method1292(arg2))) {
								@Pc(257) Class13[] local257 = local231.aClass13Array9;
								if (Static7.aBoolean235) {
									local257 = Static176.method2935(local257);
								}
								@Pc(275) int local275;
								@Pc(328) byte local328;
								if (Static180.method2976(Static53.method1292(arg2))) {
									for (local275 = 4; local275 >= 3; local275--) {
										if (local257 != null && local257[local275] != null) {
											if (local275 == 3) {
												local328 = 10;
											} else {
												local328 = 28;
											}
											Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), local257[local275], local328, local149, (long) local231.anInt1306);
										} else if (local275 == 4) {
											Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), Static186.aClass13_1432, (short) 28, local149, (long) local231.anInt1306);
										}
									}
								}
								if (Static15.method629(Static53.method1292(arg2))) {
									Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), Static57.aClass13_608, (short) 25, local149, (long) local231.anInt1306);
								}
								if (Static180.method2976(Static53.method1292(arg2)) && local257 != null) {
									for (local275 = 2; local275 >= 0; local275--) {
										if (local257[local275] != null) {
											local328 = 0;
											if (local275 == 0) {
												local328 = 9;
											}
											if (local275 == 1) {
												local328 = 8;
											}
											if (local275 == 2) {
												local328 = 5;
											}
											Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), local257[local275], local328, local149, (long) local231.anInt1306);
										}
									}
								}
								local257 = arg2.aClass13Array11;
								if (Static7.aBoolean235) {
									local257 = Static176.method2935(local257);
								}
								if (local257 != null) {
									for (local275 = 4; local275 >= 0; local275--) {
										if (local257[local275] != null) {
											local328 = 0;
											if (local275 == 0) {
												local328 = 13;
											}
											if (local275 == 1) {
												local328 = 44;
											}
											if (local275 == 2) {
												local328 = 42;
											}
											if (local275 == 3) {
												local328 = 51;
											}
											if (local275 == 4) {
												local328 = 38;
											}
											Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), local257[local275], local328, local149, (long) local231.anInt1306);
										}
									}
								}
								Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static185.aClass13_1419, local231.aClass13_463 }), Static46.aClass13_529, (short) 1004, local149, (long) local231.anInt1306);
							} else if ((Static111.anInt3019 & 0x10) == 16) {
								Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static132.aClass13_1117, local231.aClass13_463 }), Static113.aClass13_1022, (short) 17, local149, (long) local231.anInt1306);
							}
						}
					}
					local149++;
				}
			}
		}
		if (!arg2.aBoolean118) {
			return;
		}
		if (!Static118.aBoolean233) {
			@Pc(740) Class13 local740;
			for (local149 = 9; local149 >= 5; local149--) {
				local740 = Static121.method2235(arg2, local149);
				if (local740 != null) {
					Static12.method462(arg2.anInt1630, arg2.aClass13_540, local740, (short) 1007, arg2.anInt1608, (long) (local149 + 1));
				}
			}
			local740 = Static17.method652(arg2);
			if (local740 != null) {
				Static12.method462(arg2.anInt1630, arg2.aClass13_540, local740, (short) 31, arg2.anInt1608, 0L);
			}
			for (local155 = 4; local155 >= 0; local155--) {
				@Pc(798) Class13 local798 = Static121.method2235(arg2, local155);
				if (local798 != null) {
					Static12.method462(arg2.anInt1630, arg2.aClass13_540, local798, (short) 2, arg2.anInt1608, (long) (local155 + 1));
				}
			}
			if (Static28.method839(Static53.method1292(arg2))) {
				Static12.method462(arg2.anInt1630, Static16.aClass13_253, Static44.aClass13_504, (short) 30, arg2.anInt1608, 0L);
			}
		} else if (Static81.method1695(Static53.method1292(arg2)) && (Static111.anInt3019 & 0x20) == 32) {
			Static12.method462(arg2.anInt1630, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static144.aClass13_1215, arg2.aClass13_540 }), Static113.aClass13_1022, (short) 12, arg2.anInt1608, 0L);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!d;IIIII)V")
	public static void method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class1_Sub2_Sub14 local9 = method79(arg0);
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (arg5 == 1 || arg5 == 3) {
			local22 = local9.anInt3314;
			local25 = local9.anInt3302;
		} else {
			local25 = local9.anInt3314;
			local22 = local9.anInt3302;
		}
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (arg1 + local22 > 104) {
			local40 = arg1;
			local44 = arg1 + 1;
		} else {
			local44 = arg1 + (local22 + 1 >> 1);
			local40 = (local22 >> 1) + arg1;
		}
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local25 + arg2 > 104) {
			local68 = arg2;
			local72 = arg2 + 1;
		} else {
			local72 = arg2 + (local25 + 1 >> 1);
			local68 = arg2 + (local25 >> 1);
		}
		@Pc(96) int local96 = (local22 << 6) + (arg1 << 7);
		@Pc(100) int[][] local100 = Static183.anIntArrayArrayArray8[arg7];
		@Pc(126) int local126 = local100[local44][local72] + local100[local40][local72] + local100[local40][local68] + local100[local44][local68] >> 2;
		@Pc(134) int local134 = (arg2 << 7) + (local25 << 6);
		@Pc(151) long local151 = (long) ((arg5 | 0x400) << 20 | arg6 << 14 | arg2 << 7 | arg1);
		if (local9.anInt3319 == 0) {
			local151 |= Long.MIN_VALUE;
		}
		if (local9.anInt3326 == 1) {
			local151 |= 0x400000L;
		}
		local151 |= (long) arg0 << 32;
		@Pc(197) Class1_Sub2_Sub2 local197;
		if (arg6 == 22) {
			if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
				local197 = local9.method2373(arg5, local126, local100, local134, 22, local96);
			} else {
				local197 = new Class1_Sub2_Sub2_Sub6(arg0, 22, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
			}
			Static85.method1821(arg4, arg1, arg2, local126, local197, local151, local9.aBoolean255);
			if (local9.anInt3320 == 1) {
				arg3.method815(arg1, arg2);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
				local197 = local9.method2373(arg5, local126, local100, local134, 10, local96);
			} else {
				local197 = new Class1_Sub2_Sub2_Sub6(arg0, 10, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
			}
			if (local197 != null) {
				Static147.method2583(arg4, arg1, arg2, local126, local22, local25, local197, arg6 == 11 ? 256 : 0, local151);
			}
			if (local9.anInt3320 != 0) {
				arg3.method824(arg2, local9.aBoolean257, local25, local22, arg1);
			}
		} else if (arg6 >= 12) {
			if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
				local197 = local9.method2373(arg5, local126, local100, local134, arg6, local96);
			} else {
				local197 = new Class1_Sub2_Sub2_Sub6(arg0, arg6, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
			}
			Static147.method2583(arg4, arg1, arg2, local126, 1, 1, local197, 0, local151);
			if (local9.anInt3320 != 0) {
				arg3.method824(arg2, local9.aBoolean257, local25, local22, arg1);
			}
		} else if (arg6 == 0) {
			if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
				local197 = local9.method2373(arg5, local126, local100, local134, 0, local96);
			} else {
				local197 = new Class1_Sub2_Sub2_Sub6(arg0, 0, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
			}
			Static14.method536(arg4, arg1, arg2, local126, local197, null, Static51.anIntArray179[arg5], 0, local151);
			if (local9.anInt3320 != 0) {
				arg3.method823(arg5, arg6, local9.aBoolean257, arg1, arg2);
			}
		} else if (arg6 == 1) {
			if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
				local197 = local9.method2373(arg5, local126, local100, local134, 1, local96);
			} else {
				local197 = new Class1_Sub2_Sub2_Sub6(arg0, 1, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
			}
			Static14.method536(arg4, arg1, arg2, local126, local197, null, Static174.anIntArray146[arg5], 0, local151);
			if (local9.anInt3320 != 0) {
				arg3.method823(arg5, arg6, local9.aBoolean257, arg1, arg2);
			}
		} else {
			@Pc(516) int local516;
			if (arg6 == 2) {
				local516 = arg5 + 1 & 0x3;
				@Pc(547) Class1_Sub2_Sub2 local547;
				@Pc(537) Class1_Sub2_Sub2 local537;
				if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
					local537 = local9.method2373(arg5 + 4, local126, local100, local134, 2, local96);
					local547 = local9.method2373(local516, local126, local100, local134, 2, local96);
				} else {
					local537 = new Class1_Sub2_Sub2_Sub6(arg0, 2, arg5 + 4, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
					local547 = new Class1_Sub2_Sub2_Sub6(arg0, 2, local516, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
				}
				Static14.method536(arg4, arg1, arg2, local126, local537, local547, Static51.anIntArray179[arg5], Static51.anIntArray179[local516], local151);
				if (local9.anInt3320 != 0) {
					arg3.method823(arg5, arg6, local9.aBoolean257, arg1, arg2);
				}
			} else if (arg6 == 3) {
				if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
					local197 = local9.method2373(arg5, local126, local100, local134, 3, local96);
				} else {
					local197 = new Class1_Sub2_Sub2_Sub6(arg0, 3, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
				}
				Static14.method536(arg4, arg1, arg2, local126, local197, null, Static174.anIntArray146[arg5], 0, local151);
				if (local9.anInt3320 != 0) {
					arg3.method823(arg5, arg6, local9.aBoolean257, arg1, arg2);
				}
			} else if (arg6 == 9) {
				if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
					local197 = local9.method2373(arg5, local126, local100, local134, arg6, local96);
				} else {
					local197 = new Class1_Sub2_Sub2_Sub6(arg0, arg6, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
				}
				Static147.method2583(arg4, arg1, arg2, local126, 1, 1, local197, 0, local151);
				if (local9.anInt3320 != 0) {
					arg3.method824(arg2, local9.aBoolean257, local25, local22, arg1);
				}
			} else if (arg6 == 4) {
				if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
					local197 = local9.method2373(arg5, local126, local100, local134, 4, local96);
				} else {
					local197 = new Class1_Sub2_Sub2_Sub6(arg0, 4, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
				}
				Static171.method2893(arg4, arg1, arg2, local126, local197, null, Static51.anIntArray179[arg5], 0, 0, 0, local151);
			} else {
				@Pc(807) long local807;
				@Pc(844) Class1_Sub2_Sub2 local844;
				if (arg6 == 5) {
					local516 = 16;
					local807 = Static99.method1994(arg4, arg1, arg2);
					if (local807 != 0L) {
						local516 = method79(Integer.MAX_VALUE & (int) (local807 >>> 32)).anInt3337;
					}
					if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
						local844 = local9.method2373(arg5, local126, local100, local134, 4, local96);
					} else {
						local844 = new Class1_Sub2_Sub2_Sub6(arg0, 4, arg5, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
					}
					Static171.method2893(arg4, arg1, arg2, local126, local844, null, Static51.anIntArray179[arg5], 0, local516 * Static10.anIntArray48[arg5], local516 * Static118.anIntArray301[arg5], local151);
				} else if (arg6 == 6) {
					local807 = Static99.method1994(arg4, arg1, arg2);
					local516 = 8;
					if (local807 != 0L) {
						local516 = method79((int) (local807 >>> 32) & Integer.MAX_VALUE).anInt3337 / 2;
					}
					if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
						local844 = local9.method2373(arg5 + 4, local126, local100, local134, 4, local96);
					} else {
						local844 = new Class1_Sub2_Sub2_Sub6(arg0, 4, arg5 + 4, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
					}
					Static171.method2893(arg4, arg1, arg2, local126, local844, null, 256, arg5, local516 * Static43.anIntArray149[arg5], local516 * Static69.anIntArray211[arg5], local151);
				} else if (arg6 == 7) {
					@Pc(978) int local978 = arg5 + 2 & 0x3;
					if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
						local197 = local9.method2373(local978 + 4, local126, local100, local134, 4, local96);
					} else {
						local197 = new Class1_Sub2_Sub2_Sub6(arg0, 4, local978 + 4, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
					}
					Static171.method2893(arg4, arg1, arg2, local126, local197, null, 256, local978, 0, 0, local151);
				} else if (arg6 == 8) {
					local516 = 8;
					local807 = Static99.method1994(arg4, arg1, arg2);
					if (local807 != 0L) {
						local516 = method79((int) (local807 >>> 32) & Integer.MAX_VALUE).anInt3337 / 2;
					}
					@Pc(1061) int local1061 = arg5 + 2 & 0x3;
					@Pc(1102) Class1_Sub2_Sub2 local1102;
					if (local9.anInt3336 == -1 && local9.anIntArray326 == null) {
						local844 = local9.method2373(arg5 + 4, local126, local100, local134, 4, local96);
						local1102 = local9.method2373(local1061 + 4, local126, local100, local134, 4, local96);
					} else {
						local844 = new Class1_Sub2_Sub2_Sub6(arg0, 4, arg5 + 4, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
						local1102 = new Class1_Sub2_Sub2_Sub6(arg0, 4, local1061 + 4, arg7, arg1, arg2, local9.anInt3336, local9.aBoolean250, null);
					}
					Static171.method2893(arg4, arg1, arg2, local126, local844, local1102, 256, arg5, local516 * Static43.anIntArray149[arg5], local516 * Static69.anIntArray211[arg5], local151);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) long local10 = Static99.method1994(arg4, arg0, arg2);
		@Pc(50) int local50;
		@Pc(69) int local69;
		@Pc(40) int local40;
		@Pc(38) int local38;
		@Pc(23) int local23;
		if (local10 != 0L) {
			local23 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local38 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
			local40 = arg1;
			@Pc(43) int[] local43 = Static155.aClass1_Sub2_Sub1_Sub3_9.anIntArray45;
			local50 = (int) local10 >> 20 & 0x3;
			@Pc(54) Class1_Sub2_Sub14 local54 = method79(local23);
			if (local10 > 0L) {
				local40 = arg3;
			}
			local69 = (int) local10 >> 14 & 0x1F;
			if (local54.anInt3334 == -1) {
				if (local69 == 0 || local69 == 2) {
					if (local50 == 0) {
						local43[local38] = local40;
						local43[local38 + 512] = local40;
						local43[local38 + 1024] = local40;
						local43[local38 + 1536] = local40;
					} else if (local50 == 1) {
						local43[local38] = local40;
						local43[local38 + 1] = local40;
						local43[local38 + 2] = local40;
						local43[local38 + 3] = local40;
					} else if (local50 == 2) {
						local43[local38 + 3] = local40;
						local43[local38 + 512 + 3] = local40;
						local43[local38 + 3 + 1024] = local40;
						local43[local38 + 1539] = local40;
					} else if (local50 == 3) {
						local43[local38 + 1536] = local40;
						local43[local38 + 1537] = local40;
						local43[local38 + 1536 + 2] = local40;
						local43[local38 + 3 + 1536] = local40;
					}
				}
				if (local69 == 3) {
					if (local50 == 0) {
						local43[local38] = local40;
					} else if (local50 == 1) {
						local43[local38 + 3] = local40;
					} else if (local50 == 2) {
						local43[local38 + 1536 + 3] = local40;
					} else if (local50 == 3) {
						local43[local38 + 1536] = local40;
					}
				}
				if (local69 == 2) {
					if (local50 == 3) {
						local43[local38] = local40;
						local43[local38 + 512] = local40;
						local43[local38 + 1024] = local40;
						local43[local38 + 1536] = local40;
					} else if (local50 == 0) {
						local43[local38] = local40;
						local43[local38 + 1] = local40;
						local43[local38 + 2] = local40;
						local43[local38 + 3] = local40;
					} else if (local50 == 1) {
						local43[local38 + 3] = local40;
						local43[local38 + 3 + 512] = local40;
						local43[local38 + 1027] = local40;
						local43[local38 + 3 + 1536] = local40;
					} else if (local50 == 2) {
						local43[local38 + 1536] = local40;
						local43[local38 + 1537] = local40;
						local43[local38 + 1538] = local40;
						local43[local38 + 1539] = local40;
					}
				}
			} else {
				@Pc(79) Class1_Sub2_Sub1_Sub4 local79 = Static2.aClass1_Sub2_Sub1_Sub4Array1[local54.anInt3334];
				if (local79 != null) {
					@Pc(92) int local92 = (local54.anInt3302 * 4 - local79.anInt514) / 2;
					@Pc(102) int local102 = (local54.anInt3314 * 4 - local79.anInt512) / 2;
					local79.method570(local92 + arg0 * 4 + 48, (-local54.anInt3314 + -arg2 + 104) * 4 + 48 - -local102);
				}
			}
		}
		local10 = Static77.method1587(arg4, arg0, arg2);
		if (local10 != 0L) {
			local50 = (int) local10 >> 20 & 0x3;
			local69 = (int) local10 >> 14 & 0x1F;
			local40 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(470) Class1_Sub2_Sub14 local470 = method79(local40);
			@Pc(502) int local502;
			if (local470.anInt3334 != -1) {
				@Pc(576) Class1_Sub2_Sub1_Sub4 local576 = Static2.aClass1_Sub2_Sub1_Sub4Array1[local470.anInt3334];
				if (local576 != null) {
					local502 = (local470.anInt3314 * 4 - local576.anInt512) / 2;
					local23 = (local470.anInt3302 * 4 - local576.anInt514) / 2;
					local576.method570(local23 + arg0 * 4 + 48, (-arg2 + (104 - local470.anInt3314)) * 4 + 48 + local502);
				}
			} else if (local69 == 9) {
				local38 = 15658734;
				if (local10 > 0L) {
					local38 = 15597568;
				}
				local502 = arg0 * 4 + (52736 - arg2 * 512) * 4 + 24624;
				@Pc(505) int[] local505 = Static155.aClass1_Sub2_Sub1_Sub3_9.anIntArray45;
				if (local50 == 0 || local50 == 2) {
					local505[local502 + 1536] = local38;
					local505[local502 + 1024 + 1] = local38;
					local505[local502 + 514] = local38;
					local505[local502 + 3] = local38;
				} else {
					local505[local502] = local38;
					local505[local502 + 513] = local38;
					local505[local502 + 1024 + 2] = local38;
					local505[local502 + 3 + 1536] = local38;
				}
			}
		}
		local10 = Static50.method1243(arg4, arg0, arg2);
		if (local10 == 0L) {
			return;
		}
		local50 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(644) Class1_Sub2_Sub14 local644 = method79(local50);
		if (local644.anInt3334 == -1) {
			return;
		}
		@Pc(654) Class1_Sub2_Sub1_Sub4 local654 = Static2.aClass1_Sub2_Sub1_Sub4Array1[local644.anInt3334];
		if (local654 != null) {
			@Pc(667) int local667 = (local644.anInt3302 * 4 - local654.anInt514) / 2;
			local38 = (local644.anInt3314 * 4 - local654.anInt512) / 2;
			local654.method570(arg0 * 4 + local667 + 48, local38 + (-arg2 + 104 + -local644.anInt3314) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lclient!pb;")
	public static Class1_Sub2_Sub14 method79(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub14 local6 = (Class1_Sub2_Sub14) Static62.aClass47_18.method1999((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static171.aClass4_100.method2243(6, arg0);
		local6 = new Class1_Sub2_Sub14();
		local6.anInt3329 = arg0;
		if (local28 != null) {
			local6.method2384(new Class1_Sub8(local28));
		}
		local6.method2375();
		if (local6.aBoolean251) {
			local6.aBoolean257 = false;
			local6.anInt3320 = 0;
		}
		Static62.aClass47_18.method1998(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method80() {
		aClass13_37 = null;
		aClass82_1 = null;
		aClass13_39 = null;
		aClass13_35 = null;
		aClass13_38 = null;
		aClass13_36 = null;
		aByteArray2 = null;
		aClass45_1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!o;IZ)V")
	public static void method82(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static95.aClass1_Sub8_3 == null) {
			Static51.method1267(255, (byte) 0, 0, 255, true, null);
			Static144.aClass4_Sub1Array1[arg1] = arg0;
		} else {
			Static95.aClass1_Sub8_3.anInt2195 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static95.aClass1_Sub8_3.method1626();
			@Pc(20) int local20 = Static95.aClass1_Sub8_3.method1626();
			arg0.method2274(local16, local20);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZLclient!ug;)V")
	public static void method83(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub22 arg1) {
		@Pc(7) int local7 = (int) arg1.aLong158;
		@Pc(10) int local10 = arg1.anInt3978;
		arg1.method3056();
		if (arg0) {
			Static126.method2308(local10);
		}
		Static26.method808(local10);
		@Pc(25) Class20 local25 = Static119.method2230(local7);
		if (local25 != null) {
			Static125.method2300(local25);
		}
		Static46.aBoolean106 = false;
		Static53.anInt1722 = 0;
		Static186.method3019(Static164.anInt3861, Static51.anInt1676, Static85.anInt2436, Static101.anInt2829);
		if (Static82.anInt2319 != -1) {
			Static73.method1541(Static82.anInt2319, 1);
		}
	}
}
