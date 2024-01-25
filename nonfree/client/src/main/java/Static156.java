import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "Lclient!wd;")
	public static Class212 aClass212_15;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray70 = new String[200];

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public static int anInt5903 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public static void method5346(@OriginalArg(1) int arg0) {
		if (Static208.anIntArray360 == null || arg0 > Static208.anIntArray360.length) {
			Static208.anIntArray360 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(CI)Z")
	public static boolean method5348(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static2.method101(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static141.aCharArray2;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
			@Pc(50) char[] local50 = Static234.aCharArray3;
			for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
				@Pc(58) char local58 = local50[local52];
				if (local58 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ne;Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5349(@OriginalArg(0) Class146 arg0, @OriginalArg(1) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.indexOf("%1");
			if (local14 == -1) {
				while (true) {
					local14 = arg1.indexOf("%2");
					if (local14 == -1) {
						while (true) {
							local14 = arg1.indexOf("%3");
							if (local14 == -1) {
								while (true) {
									local14 = arg1.indexOf("%4");
									if (local14 == -1) {
										while (true) {
											local14 = arg1.indexOf("%5");
											if (local14 == -1) {
												while (true) {
													local14 = arg1.indexOf("%dns");
													if (local14 == -1) {
														return arg1;
													}
													@Pc(182) String local182 = "";
													if (Static103.aClass205_7 != null) {
														if (Static103.aClass205_7.anObject7 == null) {
															local182 = Static136.method2752(Static103.aClass205_7.anInt6372);
														} else {
															local182 = (String) Static103.aClass205_7.anObject7;
														}
													}
													arg1 = arg1.substring(0, local14) + local182 + arg1.substring(local14 + 4);
												}
											}
											arg1 = arg1.substring(0, local14) + Static238.method4175(Static143.method2886(arg0, 4)) + arg1.substring(local14 + 2);
										}
									}
									arg1 = arg1.substring(0, local14) + Static238.method4175(Static143.method2886(arg0, 3)) + arg1.substring(local14 + 2);
								}
							}
							arg1 = arg1.substring(0, local14) + Static238.method4175(Static143.method2886(arg0, 2)) + arg1.substring(local14 + 2);
						}
					}
					arg1 = arg1.substring(0, local14) + Static238.method4175(Static143.method2886(arg0, 1)) + arg1.substring(local14 + 2);
				}
			}
			arg1 = arg1.substring(0, local14) + Static238.method4175(Static143.method2886(arg0, 0)) + arg1.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZJ)V")
	public static void method5350(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static41.anInt982;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (local12 != Static17.anInt349) {
			local23 = local12 - Static17.anInt349;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local23 < local31) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static17.anInt349 += local31;
		}
		@Pc(76) int local76 = Static141.anInt2992;
		if (Static340.anInt6526 != local76) {
			local23 = local76 - Static340.anInt6526;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 <= 0) {
				if (local31 == 0) {
					local31 = -1;
				} else if (local31 < local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = 1;
			} else if (local31 > local23) {
				local31 = local23;
			}
			Static340.anInt6526 += local31;
		}
		if (!Static61.aBoolean94) {
			Static94.aFloat42 += Static214.aFloat83 * (float) arg0 / 40.0F * 8.0F;
			Static274.aFloat100 += Static232.aFloat44 * (float) arg0 / 40.0F * 8.0F;
		}
		Static235.method4146();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBIIII)V")
	public static void method5351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg3;
		@Pc(14) int local14 = arg1 - arg4;
		if (local14 == 0) {
			if (local9 != 0) {
				Static81.method2014(arg0, arg3, arg2, arg4);
			}
		} else if (local9 == 0) {
			Static176.method3605(arg3, arg4, arg2, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(58) boolean local58 = local14 < local9;
			@Pc(62) int local62;
			@Pc(66) int local66;
			if (local58) {
				local62 = arg4;
				arg4 = arg3;
				local66 = arg1;
				arg1 = arg0;
				arg3 = local62;
				arg0 = local66;
			}
			if (arg4 > arg1) {
				local62 = arg4;
				local66 = arg3;
				arg4 = arg1;
				arg1 = local62;
				arg3 = arg0;
				arg0 = local66;
			}
			local62 = arg3;
			local66 = arg1 - arg4;
			@Pc(107) int local107 = arg0 - arg3;
			@Pc(112) int local112 = -(local66 >> 1);
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(127) int local127 = arg0 > arg3 ? 1 : -1;
			@Pc(131) int local131;
			if (local58) {
				for (local131 = arg4; local131 <= arg1; local131++) {
					Static104.anIntArrayArray31[local131][local62] = arg2;
					local112 += local107;
					if (local112 > 0) {
						local62 += local127;
						local112 -= local66;
					}
				}
			} else {
				for (local131 = arg4; local131 <= arg1; local131++) {
					local112 += local107;
					Static104.anIntArrayArray31[local62][local131] = arg2;
					if (local112 > 0) {
						local112 -= local66;
						local62 += local127;
					}
				}
			}
		}
	}
}
