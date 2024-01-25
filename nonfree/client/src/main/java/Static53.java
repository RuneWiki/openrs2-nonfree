import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!mo;")
	public static Class143 aClass143_37;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt1331 = 0;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
	public static boolean aBoolean87 = true;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Lclient!qb;")
	public static Class167 method1255(@OriginalArg(1) int arg0) {
		@Pc(15) Class167 local15 = (Class167) Static157.aClass11_72.method209((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static27.aClass143_17.method3745(0, arg0);
		local15 = new Class167();
		if (local25 != null) {
			local15.method4441(new Class14_Sub4(local25));
		}
		local15.method4437();
		Static157.aClass11_72.method219((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!ne;B)V")
	public static void method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2) {
		if (arg2.anInt4160 == 1) {
			Static223.method5291(0L, arg2.aString143, 0, -1, 22, arg2.anInt4214, "");
		}
		if (arg2.anInt4160 == 2 && !Static184.aBoolean241) {
			@Pc(43) String local43 = Static196.method3696(arg2);
			if (local43 != null) {
				Static223.method5291(0L, local43, -1, -1, 46, arg2.anInt4214, "<col=00ff00>" + arg2.aString142);
			}
		}
		if (arg2.anInt4160 == 3) {
			Static223.method5291(0L, Static171.aString125, 0, -1, 10, arg2.anInt4214, "");
		}
		if (arg2.anInt4160 == 4) {
			Static223.method5291(0L, arg2.aString143, 0, -1, 20, arg2.anInt4214, "");
		}
		if (arg2.anInt4160 == 5) {
			Static223.method5291(0L, arg2.aString143, 0, -1, 24, arg2.anInt4214, "");
		}
		if (arg2.anInt4160 == 6 && Static278.aClass146_51 == null) {
			Static223.method5291(0L, arg2.aString143, -1, -1, 25, arg2.anInt4214, "");
		}
		@Pc(159) int local159;
		@Pc(153) int local153;
		if (arg2.anInt4135 == 2) {
			local153 = 0;
			for (@Pc(155) int local155 = 0; local155 < arg2.anInt4129; local155++) {
				for (local159 = 0; local159 < arg2.anInt4125; local159++) {
					@Pc(168) int local168 = local159 * (arg2.anInt4172 + 32);
					@Pc(175) int local175 = local155 * (arg2.anInt4212 + 32);
					if (local153 < 20) {
						local175 += arg2.anIntArray363[local153];
						local168 += arg2.anIntArray371[local153];
					}
					if (local168 <= arg0 && local175 <= arg1 && local168 + 32 > arg0 && arg1 < local175 + 32) {
						Static67.anInt1610 = local153;
						Static294.aClass146_54 = arg2;
						if (arg2.anIntArray374[local153] > 0) {
							@Pc(228) Class14_Sub17 local228 = Static42.method1040(arg2);
							@Pc(237) Class220 local237 = Static296.method5066(arg2.anIntArray374[local153] - 1);
							if (Static312.anInt6025 == 1 && local228.method2577()) {
								if (Static247.anInt4790 != arg2.anInt4214 || local153 != Static228.anInt4500) {
									Static223.method5291((long) local237.anInt6680, Static2.aString1, local153, Static37.anInt891, 43, arg2.anInt4214, Static328.aString237 + " -> <col=ff9040>" + local237.aString251);
								}
							} else if (Static184.aBoolean241 && local228.method2577()) {
								@Pc(566) Class14_Sub2_Sub6 local566 = Static295.anInt5666 == -1 ? null : Static239.method5611(Static295.anInt5666);
								if ((Static103.anInt2305 & 0x10) != 0 && (local566 == null || local237.method5962(local566.anInt2022, Static295.anInt5666) != local566.anInt2022)) {
									Static223.method5291((long) local237.anInt6680, Static324.aString230, local153, Static5.anInt4503, 23, arg2.anInt4214, Static78.aString73 + " -> <col=ff9040>" + local237.aString251);
								}
							} else {
								@Pc(255) String[] local255 = local237.aStringArray77;
								@Pc(261) int local261;
								@Pc(274) byte local274;
								@Pc(280) int local280;
								if (local228.method2577()) {
									for (local261 = 4; local261 >= 3; local261--) {
										if (local255 != null && local255[local261] != null) {
											if (local261 == 3) {
												local274 = 12;
											} else {
												local274 = 8;
											}
											local280 = -1;
											if (local237.lb == local261) {
												local280 = local237.anInt6650;
											}
											if (local261 == local237.anInt6687) {
												local280 = local237.anInt6704;
											}
											Static223.method5291((long) local237.anInt6680, local255[local261], local153, local280, local274, arg2.anInt4214, "<col=ff9040>" + local237.aString251);
										}
									}
								}
								if (local228.method2578()) {
									Static223.method5291((long) local237.anInt6680, Static2.aString1, local153, Static37.anInt891, 7, arg2.anInt4214, "<col=ff9040>" + local237.aString251);
								}
								if (local228.method2577() && local255 != null) {
									for (local261 = 2; local261 >= 0; local261--) {
										if (local255[local261] != null) {
											local274 = 0;
											local280 = -1;
											if (local261 == 0) {
												local274 = 45;
											}
											if (local261 == 1) {
												local274 = 28;
											}
											if (local261 == 2) {
												local274 = 58;
											}
											if (local261 == local237.lb) {
												local280 = local237.anInt6650;
											}
											if (local237.anInt6687 == local261) {
												local280 = local237.anInt6704;
											}
											Static223.method5291((long) local237.anInt6680, local255[local261], local153, local280, local274, arg2.anInt4214, "<col=ff9040>" + local237.aString251);
										}
									}
								}
								local255 = arg2.aStringArray54;
								if (local255 != null) {
									for (local261 = 4; local261 >= 0; local261--) {
										if (local255[local261] != null) {
											local274 = 0;
											if (local261 == 0) {
												local274 = 17;
											}
											local280 = -1;
											if (local261 == 1) {
												local274 = 51;
											}
											if (local261 == 2) {
												local274 = 31;
											}
											if (local261 == 3) {
												local274 = 35;
											}
											if (local261 == 4) {
												local274 = 15;
											}
											if (local261 == local237.lb) {
												local280 = local237.anInt6650;
											}
											if (local261 == local237.anInt6687) {
												local280 = local237.anInt6704;
											}
											Static223.method5291((long) local237.anInt6680, local255[local261], local153, local280, local274, arg2.anInt4214, "<col=ff9040>" + local237.aString251);
										}
									}
								}
								Static223.method5291((long) local237.anInt6680, Static144.aString111, local153, Static29.anInt4705, 1003, arg2.anInt4214, "<col=ff9040>" + local237.aString251);
							}
						}
					}
					local153++;
				}
			}
		}
		if (!arg2.aBoolean260) {
			return;
		}
		if (Static184.aBoolean241) {
			if (Static42.method1040(arg2).method2576() && (Static103.anInt2305 & 0x20) != 0) {
				Static223.method5291(0L, Static324.aString230, arg2.anInt4126, Static5.anInt4503, 29, arg2.anInt4214, Static78.aString73 + " -> " + arg2.aString146);
				return;
			}
			return;
		}
		@Pc(710) String local710;
		for (local153 = 9; local153 >= 5; local153--) {
			local710 = Static183.method3537(local153, arg2);
			if (local710 != null) {
				Static223.method5291((long) (local153 + 1), local710, arg2.anInt4126, Static285.method4883(local153, arg2), 1004, arg2.anInt4214, arg2.aString146);
			}
		}
		local710 = Static196.method3696(arg2);
		if (local710 != null) {
			Static223.method5291(0L, local710, arg2.anInt4126, -1, 46, arg2.anInt4214, arg2.aString146);
		}
		for (local159 = 4; local159 >= 0; local159--) {
			@Pc(769) String local769 = Static183.method3537(local159, arg2);
			if (local769 != null) {
				Static223.method5291((long) (local159 + 1), local769, arg2.anInt4126, Static285.method4883(local159, arg2), 37, arg2.anInt4214, arg2.aString146);
			}
		}
		if (!Static42.method1040(arg2).method2579()) {
			return;
		}
		if (arg2.aString144 == null) {
			Static223.method5291(0L, Static7.aString5, arg2.anInt4126, -1, 25, arg2.anInt4214, "");
			return;
		}
		Static223.method5291(0L, arg2.aString144, arg2.anInt4126, -1, 25, arg2.anInt4214, "");
		return;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[IIB[Ljava/lang/Object;)V")
	public static void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg2];
		arg3[arg2] = local30;
		for (@Pc(42) int local42 = arg0; local42 < arg2; local42++) {
			if (arg1[local42] < (local42 & 0x1) + local16) {
				@Pc(57) int local57 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local57;
				@Pc(71) Object local71 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local71;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg3[arg2] = arg3[local12];
		arg3[local12] = local30;
		method1258(arg0, arg1, local12 - 1, arg3);
		method1258(local12 + 1, arg1, arg2, arg3);
	}
}
