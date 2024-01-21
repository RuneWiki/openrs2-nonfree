import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ra", name = "sb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_31;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2098 = Static118.method2249("null");

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "[Lclient!bh;")
	public static final Class6_Sub4_Sub1[] aClass6_Sub4_Sub1Array1 = new Class6_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
	public static int anInt3609 = 0;

	@OriginalMember(owner = "client!ra", name = "xb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2100 = Static118.method2249("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ra", name = "tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2099 = aClass65_2100;

	@OriginalMember(owner = "client!ra", name = "vb", descriptor = "Lclient!v;")
	public static final Class91 aClass91_18 = new Class91();

	@OriginalMember(owner = "client!ra", name = "Bb", descriptor = "[J")
	public static final long[] aLongArray7 = new long[500];

	@OriginalMember(owner = "client!ra", name = "Cb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2101 = Static118.method2249(" ");

	@OriginalMember(owner = "client!ra", name = "Db", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2102 = Static118.method2249("Loading fonts )2 ");

	@OriginalMember(owner = "client!ra", name = "Eb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2103 = Static118.method2249("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ra", name = "Fb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2104 = aClass65_2102;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!wd;I)Lclient!wd;")
	public static Class97 method2744(@OriginalArg(0) Class97 arg0) {
		@Pc(3) Class97 local3 = Static33.method638(arg0);
		if (local3 == null) {
			local3 = arg0.aClass97_17;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!wd;II)V")
	public static void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4309 == 1) {
			Static123.method2348(0, Static117.aClass65_1665, (short) 4, 0L, arg1.aClass65_2568, arg1.anInt4376);
		}
		if (arg1.anInt4309 == 2 && !Static138.aBoolean138) {
			@Pc(33) Class65 local33 = Static78.method1382(arg1);
			if (local33 != null) {
				Static123.method2348(-1, Static109.method2004(new Class65[] { Static193.aClass65_2483, arg1.aClass65_2564 }), (short) 17, 0L, local33, arg1.anInt4376);
			}
		}
		if (arg1.anInt4309 == 3) {
			Static123.method2348(0, Static117.aClass65_1665, (short) 49, 0L, Static46.aClass65_750, arg1.anInt4376);
		}
		if (arg1.anInt4309 == 4) {
			Static123.method2348(0, Static117.aClass65_1665, (short) 9, 0L, arg1.aClass65_2568, arg1.anInt4376);
		}
		if (arg1.anInt4309 == 5) {
			Static123.method2348(0, Static117.aClass65_1665, (short) 23, 0L, arg1.aClass65_2568, arg1.anInt4376);
		}
		if (arg1.anInt4309 == 6 && Static7.aClass97_1 == null) {
			Static123.method2348(-1, Static117.aClass65_1665, (short) 21, 0L, arg1.aClass65_2568, arg1.anInt4376);
		}
		@Pc(151) int local151;
		@Pc(145) int local145;
		if (arg1.anInt4329 == 2) {
			local145 = 0;
			for (@Pc(147) int local147 = 0; local147 < arg1.anInt4346; local147++) {
				for (local151 = 0; local151 < arg1.anInt4371; local151++) {
					@Pc(161) int local161 = (arg1.anInt4355 + 32) * local151;
					@Pc(169) int local169 = local147 * (arg1.anInt4362 + 32);
					if (local145 < 20) {
						local161 += arg1.anIntArray514[local145];
						local169 += arg1.anIntArray505[local145];
					}
					if (local161 <= arg0 && local169 <= arg2 && arg0 < local161 + 32 && arg2 < local169 + 32) {
						Static170.aClass97_12 = arg1;
						Static161.anInt3635 = local145;
						if (arg1.anIntArray512[local145] > 0) {
							@Pc(222) Class1_Sub2_Sub2 local222 = Static40.method700(arg1.anIntArray512[local145] - 1);
							if (Static145.anInt3438 == 1 && Static166.method2875(Static153.method2677(arg1))) {
								if (arg1.anInt4376 != Static157.anInt4276 || Static4.anInt85 != local145) {
									Static123.method2348(local145, Static109.method2004(new Class65[] { Static27.aClass65_569, Static147.aClass65_2004, local222.aClass65_229 }), (short) 8, (long) local222.anInt281, Static14.aClass65_253, arg1.anInt4376);
								}
							} else if (!Static138.aBoolean138 || !Static166.method2875(Static153.method2677(arg1))) {
								@Pc(242) Class65[] local242 = local222.aClass65Array4;
								if (Static48.aBoolean53) {
									local242 = Static35.method667(local242);
								}
								@Pc(260) int local260;
								@Pc(275) byte local275;
								if (Static166.method2875(Static153.method2677(arg1))) {
									for (local260 = 4; local260 >= 3; local260--) {
										if (local242 != null && local242[local260] != null) {
											if (local260 == 3) {
												local275 = 33;
											} else {
												local275 = 22;
											}
											Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), local275, (long) local222.anInt281, local242[local260], arg1.anInt4376);
										} else if (local260 == 4) {
											Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), (short) 22, (long) local222.anInt281, Static109.aClass65_1560, arg1.anInt4376);
										}
									}
								}
								if (Static13.method589(Static153.method2677(arg1))) {
									Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), (short) 25, (long) local222.anInt281, Static14.aClass65_253, arg1.anInt4376);
								}
								if (Static166.method2875(Static153.method2677(arg1)) && local242 != null) {
									for (local260 = 2; local260 >= 0; local260--) {
										if (local242[local260] != null) {
											local275 = 0;
											if (local260 == 0) {
												local275 = 44;
											}
											if (local260 == 1) {
												local275 = 57;
											}
											if (local260 == 2) {
												local275 = 47;
											}
											Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), local275, (long) local222.anInt281, local242[local260], arg1.anInt4376);
										}
									}
								}
								local242 = arg1.aClass65Array65;
								if (Static48.aBoolean53) {
									local242 = Static35.method667(local242);
								}
								if (local242 != null) {
									for (local260 = 4; local260 >= 0; local260--) {
										if (local242[local260] != null) {
											local275 = 0;
											if (local260 == 0) {
												local275 = 40;
											}
											if (local260 == 1) {
												local275 = 18;
											}
											if (local260 == 2) {
												local275 = 24;
											}
											if (local260 == 3) {
												local275 = 7;
											}
											if (local260 == 4) {
												local275 = 10;
											}
											Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), local275, (long) local222.anInt281, local242[local260], arg1.anInt4376);
										}
									}
								}
								Static123.method2348(local145, Static109.method2004(new Class65[] { Static48.aClass65_786, local222.aClass65_229 }), (short) 1004, (long) local222.anInt281, Static205.aClass65_2570, arg1.anInt4376);
							} else if ((Static50.anInt1407 & 0x10) == 16) {
								Static123.method2348(local145, Static109.method2004(new Class65[] { Static19.aClass65_481, Static147.aClass65_2004, local222.aClass65_229 }), (short) 41, (long) local222.anInt281, Static83.aClass65_1223, arg1.anInt4376);
							}
						}
					}
					local145++;
				}
			}
		}
		if (!arg1.aBoolean181) {
			return;
		}
		if (Static138.aBoolean138) {
			if (Static42.method719(Static153.method2677(arg1)) && (Static50.anInt1407 & 0x20) == 32) {
				Static123.method2348(arg1.anInt4330, Static109.method2004(new Class65[] { Static19.aClass65_481, Static140.aClass65_1963, arg1.aClass65_2565 }), (short) 13, 0L, Static83.aClass65_1223, arg1.anInt4376);
				return;
			}
			return;
		}
		@Pc(717) Class65 local717;
		for (local145 = 9; local145 >= 5; local145--) {
			local717 = Static130.method2451(local145, arg1);
			if (local717 != null) {
				Static123.method2348(arg1.anInt4330, arg1.aClass65_2565, (short) 1003, (long) (local145 + 1), local717, arg1.anInt4376);
			}
		}
		local717 = Static78.method1382(arg1);
		if (local717 != null) {
			Static123.method2348(arg1.anInt4330, arg1.aClass65_2565, (short) 17, 0L, local717, arg1.anInt4376);
		}
		for (local151 = 4; local151 >= 0; local151--) {
			@Pc(773) Class65 local773 = Static130.method2451(local151, arg1);
			if (local773 != null) {
				Static123.method2348(arg1.anInt4330, arg1.aClass65_2565, (short) 20, (long) (local151 + 1), local773, arg1.anInt4376);
			}
		}
		if (Static11.method204(Static153.method2677(arg1))) {
			Static123.method2348(arg1.anInt4330, Static117.aClass65_1665, (short) 21, 0L, Static114.aClass65_1617, arg1.anInt4376);
			return;
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	public static void method2747() {
		if (Static204.aBooleanArray19[96]) {
			Static189.anInt4155 += (-Static189.anInt4155 - 24) / 2;
		} else if (Static204.aBooleanArray19[97]) {
			Static189.anInt4155 += (24 - Static189.anInt4155) / 2;
		} else {
			Static189.anInt4155 /= 2;
		}
		Static82.anInt2025 += Static189.anInt4155 / 2;
		@Pc(54) int local54 = Static185.anInt4102 + Static201.aClass6_Sub4_Sub1_3.anInt3976;
		if (Static204.aBooleanArray19[98]) {
			Static132.anInt3294 += (12 - Static132.anInt3294) / 2;
		} else if (Static204.aBooleanArray19[99]) {
			Static132.anInt3294 += (-Static132.anInt3294 - 12) / 2;
		} else {
			Static132.anInt3294 /= 2;
		}
		@Pc(91) int local91 = Static201.aClass6_Sub4_Sub1_3.anInt3934 + Static8.anInt202;
		if (Static15.anInt404 - local91 < -500 || Static15.anInt404 - local91 > 500 || Static21.anInt649 - local54 < -500 || Static21.anInt649 - local54 > 500) {
			Static21.anInt649 = local54;
			Static15.anInt404 = local91;
		}
		if (Static21.anInt649 != local54) {
			Static21.anInt649 += (local54 - Static21.anInt649) / 16;
		}
		Static54.anInt3674 += Static132.anInt3294 / 2;
		if (local91 != Static15.anInt404) {
			Static15.anInt404 += (local91 - Static15.anInt404) / 16;
		}
		Static2.method49();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static173.method2925(arg4)) {
			Static86.method1464(Static99.aClass97ArrayArray1[arg4], arg0, arg1, -1, arg6, arg5, arg2, arg3);
		}
	}
}
