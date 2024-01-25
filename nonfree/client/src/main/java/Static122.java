import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString95 = "red:";

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public static int anInt2632 = 104;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "[I")
	public static int[] anIntArray164 = new int[2];

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method2150(@OriginalArg(1) int arg0) {
		Static329.anInt6339 = arg0;
		@Pc(11) Class198 local11 = Static182.aClass198_31;
		synchronized (Static182.aClass198_31) {
			Static182.aClass198_31.method5236();
		}
		local11 = Static336.aClass198_61;
		synchronized (Static336.aClass198_61) {
			Static336.aClass198_61.method5236();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBIIILclient!tj;ZIIIIZLclient!ao;)V")
	public static void method2151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) Class13 arg11) {
		if (!Static75.method1142() && !Static109.method1871(arg7, arg0, arg3, Static353.anInt6829)) {
			return;
		}
		if (Static137.anInt2556 > arg0) {
			Static137.anInt2556 = arg0;
		}
		@Pc(25) Class170 local25 = Static268.method4553(arg9);
		if (Static352.anInt6827 == 1 && local25.aBoolean311) {
			return;
		}
		@Pc(46) int local46;
		@Pc(43) int local43;
		if (arg8 == 1 || arg8 == 3) {
			local43 = local25.anInt5235;
			local46 = local25.anInt5251;
		} else {
			local43 = local25.anInt5251;
			local46 = local25.anInt5235;
		}
		@Pc(69) int local69;
		@Pc(78) int local78;
		if (Static162.anInt2152 >= local46 + arg3) {
			local69 = (local46 >> 1) + arg3;
			local78 = arg3 + (local46 + 1 >> 1);
		} else {
			local78 = arg3 + 1;
			local69 = arg3;
		}
		@Pc(97) int local97;
		@Pc(101) int local101;
		if (anInt2632 < local43 + arg7) {
			local97 = arg7;
			local101 = arg7 + 1;
		} else {
			local101 = (local43 + 1 >> 1) + arg7;
			local97 = arg7 + (local43 >> 1);
		}
		@Pc(122) Class22 local122 = Static69.aClass22Array1[arg1];
		@Pc(147) int local147 = local122.method4672(local69, local97) + local122.method4672(local78, local97) + local122.method4672(local69, local101) + local122.method4672(local78, local101) >> 2;
		@Pc(155) int local155 = (local46 << 6) + (arg3 << 7);
		@Pc(164) int local164 = (arg7 << 7) + (local43 << 6);
		@Pc(175) boolean local175 = arg10 && !arg5 && local25.aBoolean308;
		if (local25.method4400()) {
			Static118.method2064(arg7, null, arg8, arg3, local25, arg0, null);
		}
		@Pc(209) boolean local209 = arg6 == -1 && local25.anInt5219 == -1 && local25.anIntArray420 == null && local25.anIntArray424 == null && !local25.aBoolean305;
		if (Static85.aBoolean82 && local25.anInt5202 != 1) {
			return;
		}
		if (arg2 != 22) {
			@Pc(345) Class5_Sub4 local345;
			@Pc(309) Class5_Sub4_Sub5 local309;
			@Pc(343) int local343;
			@Pc(405) int local405;
			if (arg2 == 10 || arg2 == 11) {
				local309 = null;
				if (local209) {
					@Pc(339) Class5_Sub4_Sub5 local339 = new Class5_Sub4_Sub5(arg4, local25, arg0, arg1, local155, local147, local164, arg5, arg3, arg3 + local46 - 1, arg7, arg7 + local43 - 1, arg2, arg8, local175);
					local343 = local339.method5052();
					local345 = local339;
					local309 = local339;
				} else {
					local345 = new Class5_Sub4_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, arg3, arg3 + local46 - 1, arg7, local43 + arg7 - 1, arg6);
					local343 = 15;
				}
				if (Static321.method5272(local345, false)) {
					if (local309 != null && local309.method5338()) {
						local309.method5341(arg4);
					}
					if (local25.aBoolean317 && arg10) {
						if (local343 > 30) {
							local343 = 30;
						}
						for (local405 = 0; local405 <= local46; local405++) {
							for (@Pc(409) int local409 = 0; local409 <= local43; local409++) {
								local122.method4671(arg3 + local405, arg7 + local409, local343);
							}
						}
					}
				}
				if (local25.anInt5211 != 0 && arg11 != null) {
					arg11.method231(arg3, local25.aBoolean303, local46, !local25.aBoolean314, local43, arg7);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local209) {
					local309 = new Class5_Sub4_Sub5(arg4, local25, arg0, arg1, local155, local147, local164, arg5, arg3, arg3 + local46 - 1, arg7, arg7 + local43 - 1, arg2, arg8, local175);
					local345 = local309;
					if (local309.method5338()) {
						local309.method5341(arg4);
					}
				} else {
					local345 = new Class5_Sub4_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, arg3, local46 + arg3 - 1, arg7, arg7 + local43 - 1, arg6);
				}
				Static321.method5272(local345, false);
				if (arg10 && !arg5 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0 && local25.anInt5202 != 0) {
					Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x4);
				}
				if (local25.anInt5211 != 0 && arg11 != null) {
					arg11.method231(arg3, local25.aBoolean303, local46, !local25.aBoolean314, local43, arg7);
				}
			} else {
				@Pc(646) Class5_Sub5_Sub1 local646;
				@Pc(630) Class5_Sub5 local630;
				if (arg2 == 0) {
					if (local209) {
						local646 = new Class5_Sub5_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg2, arg8, local175);
						if (local646.method5338()) {
							local646.method5341(arg4);
						}
						local630 = local646;
					} else {
						local630 = new Class5_Sub5_Sub2(arg4, local25, 0, arg8, arg0, arg1, local155, local147, local164, arg5, arg6);
					}
					Static269.method4557(arg0, arg3, arg7, local630, null);
					if (arg10) {
						if (arg8 == 0) {
							if (local25.aBoolean317) {
								local122.method4671(arg3, arg7, 50);
								local122.method4671(arg3, arg7 + 1, 50);
							}
							if (local25.anInt5202 == 1 && !arg5) {
								Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x1);
							}
						} else if (arg8 == 1) {
							if (local25.aBoolean317) {
								local122.method4671(arg3, arg7 + 1, 50);
								local122.method4671(arg3 + 1, arg7 + 1, 50);
							}
							if (local25.anInt5202 == 1 && !arg5) {
								Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] | 0x2);
							}
						} else if (arg8 == 2) {
							if (local25.aBoolean317) {
								local122.method4671(arg3 + 1, arg7, 50);
								local122.method4671(arg3 + 1, arg7 - -1, 50);
							}
							if (local25.anInt5202 == 1 && !arg5) {
								Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] | 0x1);
							}
						} else if (arg8 == 3) {
							if (local25.aBoolean317) {
								local122.method4671(arg3, arg7, 50);
								local122.method4671(arg3 + 1, arg7, 50);
							}
							if (local25.anInt5202 == 1 && !arg5) {
								Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x2);
							}
						}
					}
					if (local25.anInt5211 != 0 && arg11 != null) {
						arg11.method245(local25.aBoolean303, arg7, arg2, arg3, arg8, !local25.aBoolean314);
					}
					if (local25.anInt5221 != 16) {
						Static171.method2841(arg0, arg3, arg7, local25.anInt5221);
					}
				} else if (arg2 == 1) {
					if (local209) {
						local646 = new Class5_Sub5_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg2, arg8, local175);
						if (local646.method5338()) {
							local646.method5341(arg4);
						}
						local630 = local646;
					} else {
						local630 = new Class5_Sub5_Sub2(arg4, local25, 1, arg8, arg0, arg1, local155, local147, local164, arg5, arg6);
					}
					Static269.method4557(arg0, arg3, arg7, local630, null);
					if (local25.aBoolean317 && arg10) {
						if (arg8 == 0) {
							local122.method4671(arg3, arg7 + 1, 50);
						} else if (arg8 == 1) {
							local122.method4671(arg3 + 1, arg7 - -1, 50);
						} else if (arg8 == 2) {
							local122.method4671(arg3 + 1, arg7, 50);
						} else if (arg8 == 3) {
							local122.method4671(arg3, arg7, 50);
						}
					}
					if (local25.anInt5211 != 0 && arg11 != null) {
						arg11.method245(local25.aBoolean303, arg7, arg2, arg3, arg8, !local25.aBoolean314);
					}
				} else if (arg2 == 2) {
					local343 = arg8 + 1 & 0x3;
					@Pc(1067) Class5_Sub5 local1067;
					if (local209) {
						@Pc(1085) Class5_Sub5_Sub1 local1085 = new Class5_Sub5_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg2, arg8 + 4, local175);
						@Pc(1099) Class5_Sub5_Sub1 local1099 = new Class5_Sub5_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg2, local343, local175);
						if (local1085.method5338()) {
							local1085.method5341(arg4);
						}
						local1067 = local1099;
						if (local1099.method5338()) {
							local1099.method5341(arg4);
						}
						local630 = local1085;
					} else {
						local630 = new Class5_Sub5_Sub2(arg4, local25, 2, arg8 + 4, arg0, arg1, local155, local147, local164, arg5, arg6);
						local1067 = new Class5_Sub5_Sub2(arg4, local25, 2, local343, arg0, arg1, local155, local147, local164, arg5, arg6);
					}
					Static269.method4557(arg0, arg3, arg7, local630, local1067);
					if (local25.anInt5202 == 1 && arg10 && !arg5) {
						if (arg8 == 0) {
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x1);
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] | 0x2);
						} else if (arg8 == 1) {
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7 + 1] | 0x2);
							Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] | 0x1);
						} else if (arg8 == 2) {
							Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3 + 1][arg7] | 0x1);
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x2);
						} else if (arg8 == 3) {
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x2);
							Static310.aByteArrayArrayArray14[arg0][arg3][arg7] = (byte) (Static310.aByteArrayArrayArray14[arg0][arg3][arg7] | 0x1);
						}
					}
					if (local25.anInt5211 != 0 && arg11 != null) {
						arg11.method245(local25.aBoolean303, arg7, arg2, arg3, arg8, !local25.aBoolean314);
					}
					if (local25.anInt5221 != 16) {
						Static171.method2841(arg0, arg3, arg7, local25.anInt5221);
					}
				} else if (arg2 == 3) {
					if (local209) {
						local646 = new Class5_Sub5_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg2, arg8, local175);
						local630 = local646;
						if (local646.method5338()) {
							local646.method5341(arg4);
						}
					} else {
						local630 = new Class5_Sub5_Sub2(arg4, local25, 3, arg8, arg0, arg1, local155, local147, local164, arg5, arg6);
					}
					Static269.method4557(arg0, arg3, arg7, local630, null);
					if (local25.aBoolean317 && arg10) {
						if (arg8 == 0) {
							local122.method4671(arg3, arg7 + 1, 50);
						} else if (arg8 == 1) {
							local122.method4671(arg3 + 1, arg7 - -1, 50);
						} else if (arg8 == 2) {
							local122.method4671(arg3 + 1, arg7, 50);
						} else if (arg8 == 3) {
							local122.method4671(arg3, arg7, 50);
						}
					}
					if (local25.anInt5211 != 0 && arg11 != null) {
						arg11.method245(local25.aBoolean303, arg7, arg2, arg3, arg8, !local25.aBoolean314);
					}
				} else if (arg2 == 9) {
					if (local209) {
						local309 = new Class5_Sub4_Sub5(arg4, local25, arg0, arg1, local155, local147, local164, arg5, arg3, arg3, arg7, arg7, arg2, arg8, local175);
						local345 = local309;
						if (local309.method5338()) {
							local309.method5341(arg4);
						}
					} else {
						local345 = new Class5_Sub4_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, arg3, arg3 + local46 - 1, arg7, local43 + arg7 - 1, arg6);
					}
					Static321.method5272(local345, false);
					if (local25.anInt5211 != 0 && arg11 != null) {
						arg11.method231(arg3, local25.aBoolean303, local46, !local25.aBoolean314, local43, arg7);
					}
					if (local25.anInt5221 != 16) {
						Static171.method2841(arg0, arg3, arg7, local25.anInt5221);
					}
				} else {
					@Pc(1598) Class5_Sub1 local1598;
					if (arg2 == 4) {
						if (local209) {
							@Pc(1616) Class5_Sub1_Sub1 local1616 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, 0, 0, 0, arg2, arg8);
							local1598 = local1616;
							if (local1616.method5338()) {
								local1616.method5341(arg4);
							}
						} else {
							local1598 = new Class5_Sub1_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, 0, 0, 0, arg6);
						}
						Static339.method4907(arg0, arg3, arg7, local1598, null);
					} else {
						@Pc(1642) int local1642;
						@Pc(1648) Interface5 local1648;
						@Pc(1711) Class5_Sub1_Sub1 local1711;
						if (arg2 == 5) {
							local1642 = 16;
							local1648 = (Interface5) Static132.method2235(arg0, arg3, arg7);
							if (local1648 != null) {
								local1642 = Static268.method4553(local1648.method5344()).anInt5221;
							}
							if (local209) {
								local1711 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, 0, Static131.anIntArray181[arg8] * local1642, Static30.anIntArray39[arg8] * local1642, arg2, arg8);
								if (local1711.method5338()) {
									local1711.method5341(arg4);
								}
								local1598 = local1711;
							} else {
								local1598 = new Class5_Sub1_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, 0, Static131.anIntArray181[arg8] * local1642, Static30.anIntArray39[arg8] * local1642, arg6);
							}
							Static339.method4907(arg0, arg3, arg7, local1598, null);
						} else if (arg2 == 6) {
							local1642 = 8;
							local1648 = (Interface5) Static132.method2235(arg0, arg3, arg7);
							if (local1648 != null) {
								local1642 = Static268.method4553(local1648.method5344()).anInt5221 / 2;
							}
							if (local209) {
								local1711 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg8, local1642 * Static131.anIntArray181[arg8], local1642 * Static30.anIntArray39[arg8], arg2, arg8 + 4);
								if (local1711.method5338()) {
									local1711.method5341(arg4);
								}
								local1598 = local1711;
							} else {
								local1598 = new Class5_Sub1_Sub2(arg4, local25, arg2, arg8 + 4, arg0, arg1, local155, local147, local164, arg5, arg8, local1642 * Static106.anIntArray131[arg8], local1642 * Static243.anIntArray392[arg8], arg6);
							}
							Static339.method4907(arg0, arg3, arg7, local1598, null);
						} else if (arg2 == 7) {
							local1642 = arg8 + 2 & 0x3;
							if (local209) {
								@Pc(1880) Class5_Sub1_Sub1 local1880 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, local1642, 0, 0, arg2, local1642 + 4);
								if (local1880.method5338()) {
									local1880.method5341(arg4);
								}
								local1598 = local1880;
							} else {
								local1598 = new Class5_Sub1_Sub2(arg4, local25, arg2, local1642 + 4, arg0, arg1, local155, local147, local164, arg5, local1642, 0, 0, arg6);
							}
							Static339.method4907(arg0, arg3, arg7, local1598, null);
						} else if (arg2 == 8) {
							local343 = arg8 + 2 & 0x3;
							local405 = 8;
							@Pc(1916) Interface5 local1916 = (Interface5) Static132.method2235(arg0, arg3, arg7);
							if (local1916 != null) {
								local405 = Static268.method4553(local1916.method5344()).anInt5221 / 2;
							}
							@Pc(1955) Class5_Sub1 local1955;
							@Pc(1973) Class5_Sub1 local1973;
							if (local209) {
								local1955 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg8, Static106.anIntArray131[arg8] * local405, Static243.anIntArray392[arg8] * local405, arg2, arg8 + 4);
								local1973 = new Class5_Sub1_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg8, 0, 0, arg2, local343 + 4);
								if (local1955.method5338()) {
									local1955.method5341(arg4);
								}
								if (local1973.method5338()) {
									local1973.method5341(arg4);
								}
							} else {
								local1955 = new Class5_Sub1_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, arg8, local405 * Static106.anIntArray131[arg8], Static243.anIntArray392[arg8] * local405, arg6);
								local1973 = new Class5_Sub1_Sub2(arg4, local25, arg2, arg8, arg0, arg1, local155, local147, local164, arg5, arg8, 0, 0, arg6);
							}
							Static339.method4907(arg0, arg3, arg7, local1955, local1973);
						}
					}
				}
			}
		} else if (Static271.aBoolean338 || local25.anInt5227 != 0 || local25.anInt5211 == 1 || local25.aBoolean316) {
			@Pc(249) Class5_Sub3 local249;
			if (local209) {
				@Pc(247) Class5_Sub3_Sub1 local247 = new Class5_Sub3_Sub1(arg4, local25, arg1, local155, local147, local164, arg5, arg8, local175);
				local249 = local247;
				if (local247.method5338()) {
					local247.method5341(arg4);
				}
			} else {
				local249 = new Class5_Sub3_Sub2(arg4, local25, arg8, arg0, arg1, local155, local147, local164, arg5, arg6);
			}
			Static241.method4148(arg0, arg3, arg7, local249);
			if (local25.anInt5211 == 1 && arg11 != null) {
				arg11.method242(arg7, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ir;B)I")
	public static int method2152(@OriginalArg(0) Class100 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method2289(Static334.anInt6502)) {
			local10++;
		}
		if (arg0.method2289(Static113.anInt6409)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
	public static void method2154(@OriginalArg(1) int arg0) {
		@Pc(1) Class198 local1 = Static250.aClass198_45;
		synchronized (Static250.aClass198_45) {
			Static250.aClass198_45.method5236();
			Static250.aClass198_45 = new Class198(arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)V")
	public static void method2155(@OriginalArg(1) int arg0) {
		Static195.anInt4016 = arg0;
		Static346.aClass198_62.method5236();
	}
}
