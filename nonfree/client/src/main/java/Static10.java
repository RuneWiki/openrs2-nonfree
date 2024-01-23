import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	public static int anInt276 = -1;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
	public static int anInt290 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!n;I)V")
	public static void method302(@OriginalArg(0) Applet_Sub1 arg0) {
		Static86.method1496();
		if (Static71.aClass65_1 != null) {
			return;
		}
		if (!Static196.aBoolean380) {
			Static154.method2519();
		} else if (Static95.anInt2075 == 1) {
			@Pc(25) int local25 = Static141.anInt3120 / 5;
			@Pc(32) int local32 = Static30.anInt583 + local25 + 140;
			if (local32 <= Static20.anInt2218 && Static20.anInt2218 <= local32 + 14 && Static161.anInt3533 >= Static5.anInt224 + 4 && Static161.anInt3533 <= Static5.anInt224 + 18) {
				Static202.method3234(0, 0);
				return;
			}
			if (local32 + 15 <= Static20.anInt2218 && Static20.anInt2218 <= local32 + 80 && Static5.anInt224 + 4 <= Static161.anInt3533 && Static161.anInt3533 <= Static5.anInt224 + 18) {
				Static202.method3234(1, 0);
				return;
			}
			@Pc(94) int local94 = local25 + Static30.anInt583 + 250;
			if (Static20.anInt2218 >= local94 && local94 + 14 >= Static20.anInt2218 && Static5.anInt224 + 4 <= Static161.anInt3533 && Static5.anInt224 + 18 >= Static161.anInt3533) {
				Static202.method3234(0, 1);
				return;
			}
			if (local94 + 15 <= Static20.anInt2218 && Static20.anInt2218 <= local94 + 80 && Static161.anInt3533 >= Static5.anInt224 + 4 && Static161.anInt3533 <= Static5.anInt224 + 18) {
				Static202.method3234(1, 1);
				return;
			}
			@Pc(165) int local165 = Static30.anInt583 + local25 + 360;
			if (local165 <= Static20.anInt2218 && Static20.anInt2218 <= local165 + 14 && Static161.anInt3533 >= Static5.anInt224 + 4 && Static161.anInt3533 <= Static5.anInt224 + 18) {
				Static202.method3234(0, 2);
				return;
			}
			if (Static20.anInt2218 >= local165 + 15 && local165 + 80 >= Static20.anInt2218 && Static161.anInt3533 >= Static5.anInt224 + 4 && Static5.anInt224 + 18 >= Static161.anInt3533) {
				Static202.method3234(1, 2);
				return;
			}
			@Pc(243) int local243 = local25 + Static30.anInt583 + 470;
			if (local243 <= Static20.anInt2218 && Static20.anInt2218 <= local243 + 14 && Static5.anInt224 + 4 <= Static161.anInt3533 && Static161.anInt3533 <= Static5.anInt224 + 18) {
				Static202.method3234(0, 3);
				return;
			}
			if (local243 + 15 <= Static20.anInt2218 && local243 + 80 >= Static20.anInt2218 && Static5.anInt224 + 4 <= Static161.anInt3533 && Static5.anInt224 + 18 >= Static161.anInt3533) {
				Static202.method3234(1, 3);
				return;
			}
			if (Static61.anInt1490 != -1) {
				@Pc(315) Class54 local315 = Static8.aClass54Array1[Static61.anInt1490];
				if (local315.aBoolean173 == Static209.aBoolean396) {
					@Pc(339) byte[] local339 = Static149.method2437(new Class107[] { local315.aClass107_547, Static232.aClass107_1155 }).method3116();
					Static91.aString10 = new String(local339, 0, local339.length);
					Static170.anInt3689 = local315.anInt1917;
					if (Static88.anInt1920 != 0) {
						Static90.anInt1964 = Static170.anInt3689 + 40000;
						Static211.anInt4553 = Static90.anInt1964;
						Static155.anInt434 = Static170.anInt3689 + 50000;
					}
					if (Static160.aClass86_12 != null) {
						Static160.aClass86_12.aBoolean275 = true;
						Static16.method354(Static160.aClass86_12);
					}
					return;
				}
				@Pc(377) Class107 local377 = Static6.aClass107_822;
				if (Static88.anInt1920 != 0) {
					local377 = Static149.method2437(new Class107[] { Static147.aClass107_854, Static115.method2001(local315.anInt1917 + 7000) });
				}
				@Pc(469) Class107 local469 = Static149.method2437(new Class107[] { Static119.aClass107_707, local315.aClass107_547, Static232.aClass107_1155, local377, Static191.aClass107_1105, Static115.method2001(Static141.anInt3124), Static7.aClass107_104, Static115.method2001(Static156.anInt3410), Static225.aClass107_1322, Static115.method2001(0), Static154.aClass107_896, Static115.method2001(Static96.anInt2096), Static228.aClass107_1341, Static115.method2001(Static100.anInt2169) });
				try {
					arg0.getAppletContext().showDocument(local469.method3068(), "_self");
					return;
				} catch (@Pc(478) Exception local478) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!o;IIB)V")
	public static void method303(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt3290 == 1) {
			Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 10, 0, 0L, arg0.aClass107_862);
		}
		if (arg0.anInt3290 == 2 && !Static56.aBoolean124) {
			@Pc(31) Class107 local31 = Static213.method3436(arg0);
			if (local31 != null) {
				Static137.method2291(Static149.method2437(new Class107[] { Static7.aClass107_103, arg0.aClass107_865 }), arg0.anInt3239, (short) 11, -1, 0L, local31);
			}
		}
		if (arg0.anInt3290 == 3) {
			Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 47, 0, 0L, Static22.aClass107_151);
		}
		if (arg0.anInt3290 == 4) {
			Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 9, 0, 0L, arg0.aClass107_862);
		}
		if (arg0.anInt3290 == 5) {
			Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 7, 0, 0L, arg0.aClass107_862);
		}
		if (arg0.anInt3290 == 6 && Static184.aClass86_14 == null) {
			Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 40, -1, 0L, arg0.aClass107_862);
		}
		@Pc(157) int local157;
		@Pc(151) int local151;
		if (arg0.anInt3286 == 2) {
			local151 = 0;
			for (@Pc(153) int local153 = 0; local153 < arg0.anInt3244; local153++) {
				for (local157 = 0; local157 < arg0.anInt3288; local157++) {
					@Pc(166) int local166 = local157 * (arg0.anInt3247 + 32);
					@Pc(173) int local173 = (arg0.anInt3238 + 32) * local153;
					if (local151 < 20) {
						local166 += arg0.anIntArray284[local151];
						local173 += arg0.anIntArray279[local151];
					}
					if (local166 <= arg2 && local173 <= arg1 && arg2 < local166 + 32 && arg1 < local173 + 32) {
						Static82.anInt1781 = local151;
						Static233.aClass86_17 = arg0;
						if (arg0.anIntArray285[local151] > 0) {
							@Pc(241) Class75 local241 = Static128.method2147(arg0.anIntArray285[local151] - 1);
							if (Static167.anInt3590 == 1 && Static133.method2213(Static34.method676(arg0))) {
								if (arg0.anInt3239 != Static218.anInt4759 || Static49.anInt1274 != local151) {
									Static137.method2291(Static149.method2437(new Class107[] { Static6.aClass107_820, Static113.aClass107_672, local241.aClass107_737 }), arg0.anInt3239, (short) 21, local151, (long) local241.anInt2725, Static13.aClass107_124);
								}
							} else if (!Static56.aBoolean124 || !Static133.method2213(Static34.method676(arg0))) {
								@Pc(345) Class107[] local345 = local241.aClass107Array15;
								if (Static153.aBoolean297) {
									local345 = Static231.method3741(local345);
								}
								@Pc(360) int local360;
								@Pc(411) byte local411;
								if (Static133.method2213(Static34.method676(arg0))) {
									for (local360 = 4; local360 >= 3; local360--) {
										if (local345 != null && local345[local360] != null) {
											if (local360 == 3) {
												local411 = 3;
											} else {
												local411 = 5;
											}
											Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, local411, local151, (long) local241.anInt2725, local345[local360]);
										} else if (local360 == 4) {
											Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, (short) 5, local151, (long) local241.anInt2725, Static158.aClass107_925);
										}
									}
								}
								if (Static38.method715(Static34.method676(arg0))) {
									Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, (short) 45, local151, (long) local241.anInt2725, Static13.aClass107_124);
								}
								if (Static133.method2213(Static34.method676(arg0)) && local345 != null) {
									for (local360 = 2; local360 >= 0; local360--) {
										if (local345[local360] != null) {
											local411 = 0;
											if (local360 == 0) {
												local411 = 13;
											}
											if (local360 == 1) {
												local411 = 30;
											}
											if (local360 == 2) {
												local411 = 23;
											}
											Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, local411, local151, (long) local241.anInt2725, local345[local360]);
										}
									}
								}
								local345 = arg0.aClass107Array19;
								if (Static153.aBoolean297) {
									local345 = Static231.method3741(local345);
								}
								if (local345 != null) {
									for (local360 = 4; local360 >= 0; local360--) {
										if (local345[local360] != null) {
											local411 = 0;
											if (local360 == 0) {
												local411 = 41;
											}
											if (local360 == 1) {
												local411 = 16;
											}
											if (local360 == 2) {
												local411 = 4;
											}
											if (local360 == 3) {
												local411 = 51;
											}
											if (local360 == 4) {
												local411 = 38;
											}
											Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, local411, local151, (long) local241.anInt2725, local345[local360]);
										}
									}
								}
								Static137.method2291(Static149.method2437(new Class107[] { Static132.aClass107_768, local241.aClass107_737 }), arg0.anInt3239, (short) 1004, local151, (long) local241.anInt2725, Static188.aClass107_1098);
							} else if ((Static172.anInt3729 & 0x10) == 16) {
								Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static113.aClass107_672, local241.aClass107_737 }), arg0.anInt3239, (short) 39, local151, (long) local241.anInt2725, Static71.aClass107_470);
							}
						}
					}
					local151++;
				}
			}
		}
		if (!arg0.aBoolean280) {
			return;
		}
		if (!Static56.aBoolean124) {
			@Pc(687) Class107 local687;
			for (local151 = 9; local151 >= 5; local151--) {
				local687 = Static121.method2076(arg0, local151);
				if (local687 != null) {
					Static137.method2291(arg0.aClass107_863, arg0.anInt3239, (short) 1001, arg0.anInt3219, (long) (local151 + 1), local687);
				}
			}
			local687 = Static213.method3436(arg0);
			if (local687 != null) {
				Static137.method2291(arg0.aClass107_863, arg0.anInt3239, (short) 11, arg0.anInt3219, 0L, local687);
			}
			for (local157 = 4; local157 >= 0; local157--) {
				@Pc(743) Class107 local743 = Static121.method2076(arg0, local157);
				if (local743 != null) {
					Static137.method2291(arg0.aClass107_863, arg0.anInt3239, (short) 33, arg0.anInt3219, (long) (local157 + 1), local743);
				}
			}
			if (Static89.method1511(Static34.method676(arg0))) {
				Static137.method2291(Static63.aClass107_427, arg0.anInt3239, (short) 40, arg0.anInt3219, 0L, Static73.aClass107_488);
				return;
			}
			return;
		}
		if (Static154.method2514(Static34.method676(arg0)) && (Static172.anInt3729 & 0x20) == 32) {
			Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static21.aClass107_147, arg0.aClass107_863 }), arg0.anInt3239, (short) 8, arg0.anInt3219, 0L, Static71.aClass107_470);
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!jc;IIII)V")
	public static void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) long local9 = 0L;
		if (arg4 == 0) {
			local9 = Static222.method2957(arg3, arg5, arg0);
		} else if (arg4 == 1) {
			local9 = Static43.method856(arg3, arg5, arg0);
		} else if (arg4 == 2) {
			local9 = Static111.method1949(arg3, arg5, arg0);
		} else if (arg4 == 3) {
			local9 = Static59.method1131(arg3, arg5, arg0);
		}
		@Pc(68) int local68 = (int) (local9 >>> 32) & Integer.MAX_VALUE;
		@Pc(75) int local75 = (int) local9 >> 14 & 0x1F;
		@Pc(84) int local84 = (int) local9 >> 20 & 0x3;
		@Pc(88) Class101 local88 = Static170.method2725(local68);
		if (local88.method2847()) {
			Static54.method1093(local88, arg0, arg3, arg5);
		}
		if (local9 == 0L) {
			return;
		}
		if (arg4 == 0) {
			Static93.method2039(arg3, arg5, arg0);
			if (local88.anInt3921 != 0) {
				arg2.method1676(arg0, local75, local88.aBoolean346, local84, arg5);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			Static94.method1582(arg3, arg5, arg0);
			return;
		}
		if (arg4 == 2) {
			Static131.method2191(arg3, arg5, arg0);
			if (local88.anInt3921 != 0 && arg5 + local88.anInt3922 < 104 && arg0 + local88.anInt3922 < 104 && local88.anInt3904 + arg5 < 104 && arg0 + local88.anInt3904 < 104) {
				arg2.method1672(local84, local88.aBoolean346, local88.anInt3904, local88.anInt3922, arg5, arg0);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		Static147.method2400(arg3, arg5, arg0);
		if (local88.anInt3921 == 1) {
			arg2.method1680(arg5, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!qj;")
	public static Class1_Sub2_Sub16 method309(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static19.aClass8_1.method312((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static109.aClass28_42.method819(arg0, 26);
		local10 = new Class1_Sub2_Sub16();
		if (local22 != null) {
			local10.method2801(new Class1_Sub26(local22));
		}
		Static19.aClass8_1.method304(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	public static void method311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static141.anIntArray267[arg0] = arg1;
		@Pc(14) Class1_Sub12 local14 = (Class1_Sub12) Static158.aClass50_19.method1364((long) arg0);
		if (local14 == null) {
			local14 = new Class1_Sub12(Static209.method3309() + 500L);
			Static158.aClass50_19.method1362((long) arg0, local14);
		} else {
			local14.aLong53 = Static209.method3309() + 500L;
		}
	}
}
