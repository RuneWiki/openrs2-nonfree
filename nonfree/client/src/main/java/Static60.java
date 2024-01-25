import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "Lclient!bi;")
	public static Class26 aClass26_13 = null;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
	public static int anInt1526 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static305.aClass103_62 = new Class103(arg1);
		Static177.aClass103_29 = new Class103(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!bi;I)V")
	public static void method1212(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt543 == 1) {
			Static198.method3544(arg1.anInt492, -1, arg1.aString48, 0L, "", 36, 0);
		}
		if (arg1.anInt543 == 2 && !Static253.aBoolean361) {
			@Pc(38) String local38 = Static313.method5074(arg1);
			if (local38 != null) {
				Static198.method3544(arg1.anInt492, -1, local38, 0L, "<col=00ff00>" + arg1.aString43, 42, -1);
			}
		}
		if (arg1.anInt543 == 3) {
			Static198.method3544(arg1.anInt492, -1, Static240.aString420, 0L, "", 30, 0);
		}
		if (arg1.anInt543 == 4) {
			Static198.method3544(arg1.anInt492, -1, arg1.aString48, 0L, "", 39, 0);
		}
		if (arg1.anInt543 == 5) {
			Static198.method3544(arg1.anInt492, -1, arg1.aString48, 0L, "", 25, 0);
		}
		if (arg1.anInt543 == 6 && Static165.aClass26_19 == null) {
			Static198.method3544(arg1.anInt492, -1, arg1.aString48, 0L, "", 60, -1);
		}
		@Pc(158) int local158;
		@Pc(152) int local152;
		if (arg1.anInt520 == 2) {
			local152 = 0;
			for (@Pc(154) int local154 = 0; local154 < arg1.anInt518; local154++) {
				for (local158 = 0; local158 < arg1.anInt483; local158++) {
					@Pc(167) int local167 = (arg1.anInt534 + 32) * local158;
					@Pc(174) int local174 = local154 * (arg1.anInt491 + 32);
					if (local152 < 20) {
						local167 += arg1.anIntArray62[local152];
						local174 += arg1.anIntArray60[local152];
					}
					if (local167 <= arg0 && local174 <= arg2 && local167 + 32 > arg0 && local174 + 32 > arg2) {
						Static162.aClass26_17 = arg1;
						Static26.anInt501 = local152;
						if (arg1.anIntArray72[local152] > 0) {
							@Pc(230) Class7_Sub27 local230 = Static45.method1034(arg1);
							@Pc(241) Class138 local241 = Static17.method4472(arg1.anIntArray72[local152] - 1);
							if (Static127.anInt2799 == 1 && local230.method3761()) {
								if (arg1.anInt492 != Static150.anInt1962 || Static341.anInt6489 != local152) {
									Static198.method3544(arg1.anInt492, Static232.anInt4617, Static256.aString313, (long) local241.anInt3978, Static205.aString266 + " -> <col=ff9040>" + local241.aString261, 20, local152);
								}
							} else if (Static253.aBoolean361 && local230.method3761()) {
								@Pc(265) Class7_Sub1_Sub2 local265 = Static88.anInt3954 == -1 ? null : Static113.method2182(Static88.anInt3954);
								if ((Static72.anInt1772 & 0x10) != 0 && (local265 == null || local241.method3591(Static88.anInt3954, local265.anInt267) != local265.anInt267)) {
									Static198.method3544(arg1.anInt492, Static301.anInt5782, Static85.aString150, (long) local241.anInt3978, Static277.aString348 + " -> <col=ff9040>" + local241.aString261, 58, local152);
								}
							} else {
								@Pc(311) String[] local311 = local241.aStringArray35;
								@Pc(317) int local317;
								@Pc(332) byte local332;
								@Pc(327) int local327;
								if (local230.method3761()) {
									for (local317 = 4; local317 >= 3; local317--) {
										if (local311 != null && local311[local317] != null) {
											local327 = -1;
											if (local317 == 3) {
												local332 = 5;
											} else {
												local332 = 16;
											}
											if (local317 == local241.anInt3958) {
												local327 = local241.anInt4000;
											}
											if (local241.anInt4009 == local317) {
												local327 = local241.anInt3975;
											}
											Static198.method3544(arg1.anInt492, local327, local311[local317], (long) local241.anInt3978, "<col=ff9040>" + local241.aString261, local332, local152);
										}
									}
								}
								if (local230.method3764()) {
									Static198.method3544(arg1.anInt492, Static232.anInt4617, Static256.aString313, (long) local241.anInt3978, "<col=ff9040>" + local241.aString261, 31, local152);
								}
								if (local230.method3761() && local311 != null) {
									for (local317 = 2; local317 >= 0; local317--) {
										if (local311[local317] != null) {
											local332 = 0;
											local327 = -1;
											if (local317 == 0) {
												local332 = 10;
											}
											if (local317 == 1) {
												local332 = 13;
											}
											if (local317 == local241.anInt3958) {
												local327 = local241.anInt4000;
											}
											if (local317 == 2) {
												local332 = 49;
											}
											if (local241.anInt4009 == local317) {
												local327 = local241.anInt3975;
											}
											Static198.method3544(arg1.anInt492, local327, local311[local317], (long) local241.anInt3978, "<col=ff9040>" + local241.aString261, local332, local152);
										}
									}
								}
								local311 = arg1.aStringArray5;
								if (local311 != null) {
									for (local317 = 4; local317 >= 0; local317--) {
										if (local311[local317] != null) {
											local332 = 0;
											if (local317 == 0) {
												local332 = 21;
											}
											local327 = -1;
											if (local317 == 1) {
												local332 = 40;
											}
											if (local317 == 2) {
												local332 = 34;
											}
											if (local317 == 3) {
												local332 = 1;
											}
											if (local241.anInt3958 == local317) {
												local327 = local241.anInt4000;
											}
											if (local317 == 4) {
												local332 = 18;
											}
											if (local241.anInt4009 == local317) {
												local327 = local241.anInt3975;
											}
											Static198.method3544(arg1.anInt492, local327, local311[local317], (long) local241.anInt3978, "<col=ff9040>" + local241.aString261, local332, local152);
										}
									}
								}
								Static198.method3544(arg1.anInt492, Static227.anInt6306, Static98.aString90, (long) local241.anInt3978, "<col=ff9040>" + local241.aString261, 1006, local152);
							}
						}
					}
					local152++;
				}
			}
		}
		if (!arg1.aBoolean36) {
			return;
		}
		if (Static253.aBoolean361) {
			if (Static45.method1034(arg1).method3756() && (Static72.anInt1772 & 0x20) != 0) {
				Static198.method3544(arg1.anInt492, Static301.anInt5782, Static85.aString150, 0L, Static277.aString348 + " -> " + arg1.aString49, 50, arg1.anInt550);
				return;
			}
			return;
		}
		@Pc(723) String local723;
		for (local152 = 9; local152 >= 5; local152--) {
			local723 = Static304.method4918(arg1, local152);
			if (local723 != null) {
				Static198.method3544(arg1.anInt492, Static70.method1374(local152, arg1), local723, (long) (local152 + 1), arg1.aString49, 1011, arg1.anInt550);
			}
		}
		local723 = Static313.method5074(arg1);
		if (local723 != null) {
			Static198.method3544(arg1.anInt492, -1, local723, 0L, arg1.aString49, 42, arg1.anInt550);
		}
		for (local158 = 4; local158 >= 0; local158--) {
			@Pc(784) String local784 = Static304.method4918(arg1, local158);
			if (local784 != null) {
				Static198.method3544(arg1.anInt492, Static70.method1374(local158, arg1), local784, (long) (local158 + 1), arg1.aString49, 15, arg1.anInt550);
			}
		}
		if (!Static45.method1034(arg1).method3758()) {
			return;
		}
		if (arg1.aString45 == null) {
			Static198.method3544(arg1.anInt492, -1, Static207.aString269, 0L, "", 60, arg1.anInt550);
		} else {
			Static198.method3544(arg1.anInt492, -1, arg1.aString45, 0L, "", 60, arg1.anInt550);
		}
		return;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!rk;)V")
	public static void method1213(@OriginalArg(1) Class180 arg0) {
		Static347.aClass180_98 = arg0;
	}
}
