import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_17;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public static int anInt3869;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!c;")
	public static Class10 aClass10_134;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "J")
	public static long aLong228;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1150 = Static38.method685(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1149 = aClass6_1150;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!dd;")
	public static Class17 aClass17_27 = new Class17(30);

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1151 = Static38.method685("K");

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1152 = aClass6_1151;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1153 = Static38.method685("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1154 = aClass6_1151;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1155 = Static38.method685("compass");

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10 = new int[4][105][105];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILclient!ug;I)V")
	public static void method2624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3_Sub17 arg2, @OriginalArg(4) int arg3) {
		if (Static46.anInt1322 >= 400) {
			return;
		}
		if (arg2.anIntArray382 != null) {
			arg2 = arg2.method2651();
		}
		if (arg2 == null || !arg2.aBoolean157) {
			return;
		}
		@Pc(30) Class6 local30 = arg2.aClass6_1162;
		if (arg2.anInt3899 != 0) {
			local30 = Static58.method956(new Class6[] { local30, Static176.method2758(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt941, arg2.anInt3899), Static39.aClass6_302, Static140.aClass6_951, Static106.method2806(arg2.anInt3899), Static104.aClass6_719 });
		}
		if (Static122.anInt2841 == 1) {
			Static95.method1546(Static58.method956(new Class6[] { Static128.aClass6_856, Static82.aClass6_616, local30 }), 37, arg1, arg0, arg3, Static28.aClass6_201);
		} else if (!Static26.aBoolean28) {
			@Pc(89) Class6[] local89 = arg2.aClass6Array22;
			if (Static167.aBoolean158) {
				local89 = Static116.method1872(local89);
			}
			@Pc(99) int local99;
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && !local89[local99].method137(Static160.aClass6_166)) {
						@Pc(114) byte local114 = 0;
						if (local99 == 0) {
							local114 = 6;
						}
						if (local99 == 1) {
							local114 = 7;
						}
						if (local99 == 2) {
							local114 = 13;
						}
						if (local99 == 3) {
							local114 = 2;
						}
						if (local99 == 4) {
							local114 = 3;
						}
						Static95.method1546(Static58.method956(new Class6[] { Static52.aClass6_402, local30 }), local114, arg1, arg0, arg3, local89[local99]);
					}
				}
			}
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && local89[local99].method137(Static160.aClass6_166)) {
						@Pc(203) short local203 = 0;
						if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt941 < arg2.anInt3899) {
							local203 = 2000;
						}
						@Pc(216) int local216 = 0;
						if (local99 == 0) {
							local216 = local203 + 6;
						}
						if (local99 == 1) {
							local216 = local203 + 7;
						}
						if (local99 == 2) {
							local216 = local203 + 13;
						}
						if (local99 == 3) {
							local216 = local203 + 2;
						}
						if (local99 == 4) {
							local216 = local203 + 3;
						}
						Static95.method1546(Static58.method956(new Class6[] { Static52.aClass6_402, local30 }), local216, arg1, arg0, arg3, local89[local99]);
					}
				}
			}
			Static95.method1546(Static58.method956(new Class6[] { Static52.aClass6_402, local30 }), 1001, arg1, arg0, arg3, Static30.aClass6_213);
			return;
		} else if ((Static42.anInt1291 & 0x2) == 2) {
			Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static82.aClass6_616, local30 }), 30, arg1, arg0, arg3, Static3.aClass6_29);
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method2625(@OriginalArg(0) Class10 arg0) {
		Static160.aClass10_25 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!c;Lclient!c;IZ)Lclient!ud;")
	public static Class2_Sub3_Sub16 method2626(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method1597(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method1593(local12[local14], arg2);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(52) byte[] local52 = arg1.method1593(0, local44);
				if (local52 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub3_Sub16(arg0, arg1, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIB)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(19) Class2_Sub21 local19 = (Class2_Sub21) Static131.aClass84_11.method2694(); local19 != null; local19 = (Class2_Sub21) Static131.aClass84_11.method2697()) {
			if (local19.anInt3528 != -1 || local19.anIntArray351 != null) {
				@Pc(30) int local30 = 0;
				if (local19.anInt3523 < arg1) {
					local30 = arg1 - local19.anInt3523;
				} else if (local19.anInt3535 > arg1) {
					local30 = local19.anInt3535 - arg1;
				}
				if (local19.anInt3525 < arg0) {
					local30 += arg0 - local19.anInt3525;
				} else if (arg0 < local19.anInt3531) {
					local30 += local19.anInt3531 - arg0;
				}
				if (local30 - 64 > local19.anInt3533 || Static107.anInt2566 == 0 || local19.anInt3526 != arg2) {
					if (local19.aClass2_Sub10_Sub1_2 != null) {
						Static109.aClass2_Sub10_Sub4_12.method2747(local19.aClass2_Sub10_Sub1_2);
						local19.aClass2_Sub10_Sub1_2 = null;
					}
					if (local19.aClass2_Sub10_Sub1_3 != null) {
						Static109.aClass2_Sub10_Sub4_12.method2747(local19.aClass2_Sub10_Sub1_3);
						local19.aClass2_Sub10_Sub1_3 = null;
					}
				} else {
					local30 -= 64;
					if (local30 < 0) {
						local30 = 0;
					}
					@Pc(143) int local143 = Static107.anInt2566 * (local19.anInt3533 - local30) / local19.anInt3533;
					if (local19.aClass2_Sub10_Sub1_2 != null) {
						local19.aClass2_Sub10_Sub1_2.method790(local143);
					} else if (local19.anInt3528 >= 0) {
						@Pc(164) Class86 local164 = Static189.method2754(Static136.aClass10_Sub1_14, local19.anInt3528, 0);
						if (local164 != null) {
							@Pc(171) Class2_Sub19_Sub1 local171 = local164.method2751().method2108(Static179.aClass88_1);
							@Pc(176) Class2_Sub10_Sub1 local176 = Static186.method776(local171, local143);
							local176.method775(-1);
							Static109.aClass2_Sub10_Sub4_12.method2745(local176);
							local19.aClass2_Sub10_Sub1_2 = local176;
						}
					}
					if (local19.aClass2_Sub10_Sub1_3 != null) {
						local19.aClass2_Sub10_Sub1_3.method790(local143);
						if (!local19.aClass2_Sub10_Sub1_3.method2805()) {
							local19.aClass2_Sub10_Sub1_3 = null;
						}
					} else if (local19.anIntArray351 != null && (local19.anInt3532 -= arg3) <= 0) {
						@Pc(207) int local207 = (int) ((double) local19.anIntArray351.length * Math.random());
						@Pc(215) Class86 local215 = Static189.method2754(Static136.aClass10_Sub1_14, local19.anIntArray351[local207], 0);
						if (local215 != null) {
							@Pc(222) Class2_Sub19_Sub1 local222 = local215.method2751().method2108(Static179.aClass88_1);
							@Pc(227) Class2_Sub10_Sub1 local227 = Static186.method776(local222, local143);
							local227.method775(0);
							Static109.aClass2_Sub10_Sub4_12.method2745(local227);
							local19.aClass2_Sub10_Sub1_3 = local227;
							local19.anInt3532 = (int) ((double) (local19.anInt3524 - local19.anInt3522) * Math.random()) + local19.anInt3522;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public static void method2628() {
		aClass10_134 = null;
		aClass6_1154 = null;
		aClass6_1150 = null;
		aClass6_1155 = null;
		aClass6_1151 = null;
		aClass6_1153 = null;
		anIntArrayArrayArray10 = null;
		aClass10_Sub1_17 = null;
		aClass6_1149 = null;
		aClass17_27 = null;
		aClass6_1152 = null;
	}
}
