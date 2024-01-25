import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!s", name = "A", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!hs;")
	public static Class78 aClass78_5;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method4369(@OriginalArg(0) Class134 arg0) {
		Static172.aClass134_83 = arg0;
		Static282.anInt3511 = Static172.aClass134_83.method3020(15);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ps;III)V")
	public static void method4371(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4980 == 1) {
			Static169.method2996(arg0.anInt4947, -1, arg0.aString186, 0L, "", 18, 0);
		}
		if (arg0.anInt4980 == 2 && !Static265.aBoolean456) {
			@Pc(34) String local34 = Static107.method1708(arg0);
			if (local34 != null) {
				Static169.method2996(arg0.anInt4947, -1, local34, 0L, "<col=00ff00>" + arg0.aString194, 39, -1);
			}
		}
		if (arg0.anInt4980 == 3) {
			Static169.method2996(arg0.anInt4947, -1, Static340.aString261, 0L, "", 16, 0);
		}
		if (arg0.anInt4980 == 4) {
			Static169.method2996(arg0.anInt4947, -1, arg0.aString186, 0L, "", 58, 0);
		}
		if (arg0.anInt4980 == 5) {
			Static169.method2996(arg0.anInt4947, -1, arg0.aString186, 0L, "", 46, 0);
		}
		if (arg0.anInt4980 == 6 && Static50.aClass163_5 == null) {
			Static169.method2996(arg0.anInt4947, -1, arg0.aString186, 0L, "", 6, -1);
		}
		@Pc(160) int local160;
		@Pc(154) int local154;
		if (arg0.anInt4934 == 2) {
			local154 = 0;
			for (@Pc(156) int local156 = 0; local156 < arg0.anInt4933; local156++) {
				for (local160 = 0; local160 < arg0.anInt5009; local160++) {
					@Pc(170) int local170 = (arg0.anInt4916 + 32) * local160;
					@Pc(177) int local177 = (arg0.anInt4976 + 32) * local156;
					if (local154 < 20) {
						local177 += arg0.anIntArray455[local154];
						local170 += arg0.anIntArray465[local154];
					}
					if (arg1 >= local170 && arg2 >= local177 && arg1 < local170 + 32 && local177 + 32 > arg2) {
						Static242.aClass163_16 = arg0;
						Static228.anInt4756 = local154;
						if (arg0.anIntArray461[local154] > 0) {
							@Pc(233) Class1_Sub11 local233 = Static40.method857(arg0);
							@Pc(242) Class102 local242 = Static348.method5333(arg0.anIntArray461[local154] - 1);
							if (Static254.anInt5233 == 1 && local233.method1098()) {
								if (arg0.anInt4947 != Static223.anInt1490 || Static151.anInt3083 != local154) {
									Static169.method2996(arg0.anInt4947, Static318.anInt6339, Static319.aString120, (long) local242.anInt2383, Static142.aString102 + " -> <col=ff9040>" + local242.aString95, 22, local154);
								}
							} else if (Static265.aBoolean456 && local233.method1098()) {
								@Pc(606) Class1_Sub2_Sub19 local606 = Static61.anInt1411 == -1 ? null : Static262.method1693(Static61.anInt1411);
								if ((Static45.anInt1184 & 0x10) != 0 && (local606 == null || local242.method1996(local606.anInt6009, Static61.anInt1411) != local606.anInt6009)) {
									Static169.method2996(arg0.anInt4947, Static224.anInt4728, Static238.aString191, (long) local242.anInt2383, Static49.aString203 + " -> <col=ff9040>" + local242.aString95, 5, local154);
								}
							} else {
								@Pc(297) String[] local297 = local242.aStringArray23;
								@Pc(303) int local303;
								@Pc(318) byte local318;
								@Pc(313) int local313;
								if (local233.method1098()) {
									for (local303 = 4; local303 >= 3; local303--) {
										if (local297 != null && local297[local303] != null) {
											local313 = -1;
											if (local303 == 3) {
												local318 = 47;
											} else {
												local318 = 2;
											}
											if (local303 == local242.anInt2415) {
												local313 = local242.anInt2382;
											}
											if (local303 == local242.anInt2427) {
												local313 = local242.anInt2420;
											}
											Static169.method2996(arg0.anInt4947, local313, local297[local303], (long) local242.anInt2383, "<col=ff9040>" + local242.aString95, local318, local154);
										}
									}
								}
								if (local233.method1095()) {
									Static169.method2996(arg0.anInt4947, Static318.anInt6339, Static319.aString120, (long) local242.anInt2383, "<col=ff9040>" + local242.aString95, 34, local154);
								}
								if (local233.method1098() && local297 != null) {
									for (local303 = 2; local303 >= 0; local303--) {
										if (local297[local303] != null) {
											local318 = 0;
											if (local303 == 0) {
												local318 = 15;
											}
											local313 = -1;
											if (local303 == 1) {
												local318 = 30;
											}
											if (local303 == 2) {
												local318 = 19;
											}
											if (local242.anInt2415 == local303) {
												local313 = local242.anInt2382;
											}
											if (local303 == local242.anInt2427) {
												local313 = local242.anInt2420;
											}
											Static169.method2996(arg0.anInt4947, local313, local297[local303], (long) local242.anInt2383, "<col=ff9040>" + local242.aString95, local318, local154);
										}
									}
								}
								local297 = arg0.aStringArray34;
								if (local297 != null) {
									for (local303 = 4; local303 >= 0; local303--) {
										if (local297[local303] != null) {
											local318 = 0;
											local313 = -1;
											if (local303 == 0) {
												local318 = 51;
											}
											if (local303 == 1) {
												local318 = 1;
											}
											if (local303 == 2) {
												local318 = 23;
											}
											if (local303 == 3) {
												local318 = 10;
											}
											if (local242.anInt2415 == local303) {
												local313 = local242.anInt2382;
											}
											if (local303 == 4) {
												local318 = 25;
											}
											if (local303 == local242.anInt2427) {
												local313 = local242.anInt2420;
											}
											Static169.method2996(arg0.anInt4947, local313, local297[local303], (long) local242.anInt2383, "<col=ff9040>" + local242.aString95, local318, local154);
										}
									}
								}
								Static169.method2996(arg0.anInt4947, Static53.anInt1290, Static99.aString77, (long) local242.anInt2383, "<col=ff9040>" + local242.aString95, 1004, local154);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg0.aBoolean411) {
			return;
		}
		if (Static265.aBoolean456) {
			if (Static40.method857(arg0).method1092() && (Static45.anInt1184 & 0x20) != 0) {
				Static169.method2996(arg0.anInt4947, Static224.anInt4728, Static238.aString191, 0L, Static49.aString203 + " -> " + arg0.aString189, 32, arg0.anInt4923);
				return;
			}
			return;
		}
		@Pc(721) String local721;
		for (local154 = 9; local154 >= 5; local154--) {
			local721 = Static91.method1441(local154, arg0);
			if (local721 != null) {
				Static169.method2996(arg0.anInt4947, Static329.method5540(arg0, local154), local721, (long) (local154 + 1), arg0.aString189, 1003, arg0.anInt4923);
			}
		}
		local721 = Static107.method1708(arg0);
		if (local721 != null) {
			Static169.method2996(arg0.anInt4947, -1, local721, 0L, arg0.aString189, 39, arg0.anInt4923);
		}
		for (local160 = 4; local160 >= 0; local160--) {
			@Pc(780) String local780 = Static91.method1441(local160, arg0);
			if (local780 != null) {
				Static169.method2996(arg0.anInt4947, Static329.method5540(arg0, local160), local780, (long) (local160 + 1), arg0.aString189, 36, arg0.anInt4923);
			}
		}
		if (!Static40.method857(arg0).method1089()) {
			return;
		}
		if (arg0.aString187 == null) {
			Static169.method2996(arg0.anInt4947, -1, Static143.aString105, 0L, "", 6, arg0.anInt4923);
		} else {
			Static169.method2996(arg0.anInt4947, -1, arg0.aString187, 0L, "", 6, arg0.anInt4923);
		}
		return;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	public static void method4372() {
		Static59.aClass37_28.method919();
	}
}
