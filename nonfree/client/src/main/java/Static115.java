import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!oe;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1545 = Static122.method531("No reply from loginserver)3");

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1541 = aClass73_1545;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1542 = Static122.method531("Untersuchen");

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1543 = Static122.method531("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt2750 = -1;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1544 = Static122.method531(" loggt sich ein)3");

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array17 = new Class73[200];

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static final int anInt2754 = 50;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1546 = Static122.method531("gleiten:");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method2038() {
		aClass58_1 = null;
		aClass73_1541 = null;
		aClass73_1542 = null;
		aClass73_1546 = null;
		aClass73_1543 = null;
		aClass73Array17 = null;
		aClass73_1545 = null;
		aClass73_1544 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vd;III)V")
	public static void method2039(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3674 == 1) {
			Static63.method1125(0, 0, arg0.aClass73_1990, Static173.aClass73_2030, 30, arg0.anInt3676);
		}
		if (arg0.anInt3674 == 2 && !Static159.aBoolean233) {
			@Pc(35) Class73 local35 = Static46.method809(arg0);
			if (local35 != null) {
				Static63.method1125(0, -1, local35, Static19.method372(new Class73[] { Static86.aClass73_1045, arg0.aClass73_1988 }), 18, arg0.anInt3676);
			}
		}
		if (arg0.anInt3674 == 3) {
			Static63.method1125(0, 0, Static65.aClass73_817, Static173.aClass73_2030, 10, arg0.anInt3676);
		}
		if (arg0.anInt3674 == 4) {
			Static63.method1125(0, 0, arg0.aClass73_1990, Static173.aClass73_2030, 31, arg0.anInt3676);
		}
		if (arg0.anInt3674 == 5) {
			Static63.method1125(0, 0, arg0.aClass73_1990, Static173.aClass73_2030, 47, arg0.anInt3676);
		}
		if (arg0.anInt3674 == 6 && Static11.aClass83_3 == null) {
			Static63.method1125(0, -1, arg0.aClass73_1990, Static173.aClass73_2030, 43, arg0.anInt3676);
		}
		@Pc(160) int local160;
		@Pc(154) int local154;
		if (arg0.anInt3722 == 2) {
			local154 = 0;
			for (@Pc(156) int local156 = 0; local156 < arg0.anInt3708; local156++) {
				for (local160 = 0; local160 < arg0.anInt3670; local160++) {
					@Pc(169) int local169 = (arg0.anInt3700 + 32) * local160;
					@Pc(177) int local177 = (arg0.anInt3714 + 32) * local156;
					if (local154 < 20) {
						local177 += arg0.anIntArray393[local154];
						local169 += arg0.anIntArray391[local154];
					}
					if (arg2 >= local169 && arg1 >= local177 && arg2 < local169 + 32 && local177 + 32 > arg1) {
						Static25.anInt715 = local154;
						Static9.aClass83_2 = arg0;
						if (arg0.anIntArray388[local154] > 0) {
							@Pc(238) Class3_Sub1_Sub7 local238 = Static3.method42(arg0.anIntArray388[local154] - 1);
							if (Static4.anInt71 == 1 && Static76.method1299(Static127.method484(arg0))) {
								if (arg0.anInt3676 != Static92.anInt2038 || Static148.anInt3335 != local154) {
									Static63.method1125(local238.anInt1233, local154, Static63.aClass73_815, Static19.method372(new Class73[] { Static122.aClass73_397, Static141.aClass73_1787, local238.aClass73_680 }), 4, arg0.anInt3676);
								}
							} else if (!Static159.aBoolean233 || !Static76.method1299(Static127.method484(arg0))) {
								@Pc(264) Class73[] local264 = local238.aClass73Array9;
								if (Static125.aBoolean192) {
									local264 = Static149.method2458(local264);
								}
								@Pc(278) int local278;
								@Pc(326) byte local326;
								if (Static76.method1299(Static127.method484(arg0))) {
									for (local278 = 4; local278 >= 3; local278--) {
										if (local264 != null && local264[local278] != null) {
											if (local278 == 3) {
												local326 = 45;
											} else {
												local326 = 16;
											}
											Static63.method1125(local238.anInt1233, local154, local264[local278], Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), local326, arg0.anInt3676);
										} else if (local278 == 4) {
											Static63.method1125(local238.anInt1233, local154, Static92.aClass73_1162, Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), 16, arg0.anInt3676);
										}
									}
								}
								if (Static105.method1828(Static127.method484(arg0))) {
									Static63.method1125(local238.anInt1233, local154, Static63.aClass73_815, Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), 32, arg0.anInt3676);
								}
								if (Static76.method1299(Static127.method484(arg0)) && local264 != null) {
									for (local278 = 2; local278 >= 0; local278--) {
										if (local264[local278] != null) {
											local326 = 0;
											if (local278 == 0) {
												local326 = 51;
											}
											if (local278 == 1) {
												local326 = 46;
											}
											if (local278 == 2) {
												local326 = 33;
											}
											Static63.method1125(local238.anInt1233, local154, local264[local278], Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), local326, arg0.anInt3676);
										}
									}
								}
								local264 = arg0.aClass73Array27;
								if (Static125.aBoolean192) {
									local264 = Static149.method2458(local264);
								}
								if (local264 != null) {
									for (local278 = 4; local278 >= 0; local278--) {
										if (local264[local278] != null) {
											local326 = 0;
											if (local278 == 0) {
												local326 = 2;
											}
											if (local278 == 1) {
												local326 = 29;
											}
											if (local278 == 2) {
												local326 = 35;
											}
											if (local278 == 3) {
												local326 = 22;
											}
											if (local278 == 4) {
												local326 = 48;
											}
											Static63.method1125(local238.anInt1233, local154, local264[local278], Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), local326, arg0.anInt3676);
										}
									}
								}
								Static63.method1125(local238.anInt1233, local154, Static4.aClass73_52, Static19.method372(new Class73[] { Static32.aClass73_480, local238.aClass73_680 }), 1002, arg0.anInt3676);
							} else if ((Static44.anInt1025 & 0x10) == 16) {
								Static63.method1125(local238.anInt1233, local154, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static141.aClass73_1787, local238.aClass73_680 }), 21, arg0.anInt3676);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg0.aBoolean257) {
			return;
		}
		if (!Static159.aBoolean233) {
			@Pc(683) Class73 local683;
			for (local154 = 9; local154 >= 5; local154--) {
				local683 = Static108.method1935(local154, arg0);
				if (local683 != null) {
					Static63.method1125(local154 + 1, arg0.anInt3677, local683, arg0.aClass73_1983, 1004, arg0.anInt3676);
				}
			}
			local683 = Static46.method809(arg0);
			if (local683 != null) {
				Static63.method1125(0, arg0.anInt3677, local683, arg0.aClass73_1983, 18, arg0.anInt3676);
			}
			for (local160 = 4; local160 >= 0; local160--) {
				@Pc(738) Class73 local738 = Static108.method1935(local160, arg0);
				if (local738 != null) {
					Static63.method1125(local160 + 1, arg0.anInt3677, local738, arg0.aClass73_1983, 38, arg0.anInt3676);
				}
			}
			if (Static53.method2788(Static127.method484(arg0))) {
				Static63.method1125(0, arg0.anInt3677, Static62.aClass73_813, Static173.aClass73_2030, 43, arg0.anInt3676);
				return;
			}
			return;
		}
		if (Static146.method2395(Static127.method484(arg0)) && (Static44.anInt1025 & 0x20) == 32) {
			Static63.method1125(0, arg0.anInt3677, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static27.aClass73_418, arg0.aClass73_1983 }), 36, arg0.anInt3676);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!f;B)V")
	public static void method2040(@OriginalArg(0) Class13 arg0) {
		Static121.aClass13_23 = arg0;
		Static152.anInt3403 = Static121.aClass13_23.method353(16);
	}
}
