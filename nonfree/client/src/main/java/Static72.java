import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!mf", name = "Bc", descriptor = "Lclient!qf;")
	private static Class60 aClass60_971 = Static59.method1195("To create a new account you need to");

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Lclient!qf;")
	public static Class60 aClass60_962 = aClass60_971;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "Lclient!qf;")
	public static Class60 aClass60_963 = Static59.method1195("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_964 = Static59.method1195("_");

	@OriginalMember(owner = "client!mf", name = "rb", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!mf", name = "ed", descriptor = "Lclient!qf;")
	private static Class60 aClass60_975 = Static59.method1195(" has logged out)3");

	@OriginalMember(owner = "client!mf", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_966 = aClass60_975;

	@OriginalMember(owner = "client!mf", name = "Jc", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!mf", name = "Oc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_972 = Static59.method1195(" weitere Optionen");

	@OriginalMember(owner = "client!mf", name = "dd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_974 = Static59.method1195("Angreifen");

	@OriginalMember(owner = "client!mf", name = "gd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_976 = Static59.method1195("<col=ffff00>");

	@OriginalMember(owner = "client!mf", name = "id", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!td;IIIILclient!qb;IIII)V")
	public static void method1494(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class58 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static51.anIntArrayArrayArray3[arg5][arg2][arg6];
		@Pc(23) int local23 = Static51.anIntArrayArrayArray3[arg5][arg2 + 1][arg6];
		@Pc(35) int local35 = Static51.anIntArrayArrayArray3[arg5][arg2 + 1][arg6 + 1];
		@Pc(45) int local45 = Static51.anIntArrayArrayArray3[arg5][arg2][arg6 + 1];
		@Pc(55) int local55 = local45 + local23 + local13 + local35 >> 2;
		@Pc(64) Class3_Sub1_Sub17 local64 = Static18.method517(arg8);
		@Pc(70) int local70 = arg7 + (arg3 << 6);
		@Pc(82) int local82 = (arg6 << 7) + arg2 + (arg8 << 14) + 1073741824;
		if (local64.anInt3417 == 1) {
			local70 += 256;
		}
		if (local64.anInt3424 == 0) {
			local82 += Integer.MIN_VALUE;
		}
		@Pc(125) Class3_Sub1_Sub1 local125;
		if (arg7 == 22) {
			if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
				local125 = local64.method2280(local35, arg3, local13, local45, 22, local23);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub2(arg8, 22, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
			}
			arg4.method1776(arg1, arg2, arg6, local55, local125, local82, local70);
			if (local64.anInt3436 == 1) {
				arg0.method2101(arg2, arg6);
			}
			return;
		}
		@Pc(217) int local217;
		if (arg7 == 10 || arg7 == 11) {
			if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
				local125 = local64.method2280(local35, arg3, local13, local45, 10, local23);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub2(arg8, 10, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
			}
			if (local125 != null) {
				@Pc(205) int local205 = 0;
				@Pc(214) int local214;
				if (arg3 == 1 || arg3 == 3) {
					local214 = local64.anInt3449;
					local217 = local64.anInt3441;
				} else {
					local214 = local64.anInt3441;
					local217 = local64.anInt3449;
				}
				if (arg7 == 11) {
					local205 += 256;
				}
				arg4.method1748(arg1, arg2, arg6, local55, local217, local214, local125, local205, local82, local70);
			}
			if (local64.anInt3436 != 0) {
				arg0.method2100(local64.anInt3449, local64.aBoolean130, arg6, arg2, local64.anInt3441, arg3);
			}
		} else if (arg7 >= 12) {
			if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
				local125 = local64.method2280(local35, arg3, local13, local45, arg7, local23);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub2(arg8, arg7, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
			}
			arg4.method1748(arg1, arg2, arg6, local55, 1, 1, local125, 0, local82, local70);
			if (local64.anInt3436 != 0) {
				arg0.method2100(local64.anInt3449, local64.aBoolean130, arg6, arg2, local64.anInt3441, arg3);
			}
		} else if (arg7 == 0) {
			if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
				local125 = local64.method2280(local35, arg3, local13, local45, 0, local23);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub2(arg8, 0, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
			}
			arg4.method1781(arg1, arg2, arg6, local55, local125, null, Static10.anIntArray48[arg3], 0, local82, local70);
			if (local64.anInt3436 != 0) {
				arg0.method2109(local64.aBoolean130, arg2, arg3, arg6, arg7);
			}
		} else if (arg7 == 1) {
			if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
				local125 = local64.method2280(local35, arg3, local13, local45, 1, local23);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub2(arg8, 1, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
			}
			arg4.method1781(arg1, arg2, arg6, local55, local125, null, Static56.anIntArray199[arg3], 0, local82, local70);
			if (local64.anInt3436 != 0) {
				arg0.method2109(local64.aBoolean130, arg2, arg3, arg6, arg7);
			}
		} else {
			@Pc(472) int local472;
			@Pc(512) Class3_Sub1_Sub1 local512;
			if (arg7 == 2) {
				local472 = arg3 + 1 & 0x3;
				@Pc(497) Class3_Sub1_Sub1 local497;
				if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
					local497 = local64.method2280(local35, arg3 + 4, local13, local45, 2, local23);
					local512 = local64.method2280(local35, local472, local13, local45, 2, local23);
				} else {
					local497 = new Class3_Sub1_Sub1_Sub2(arg8, 2, arg3 + 4, local13, local23, local35, local45, local64.anInt3437, true, null);
					local512 = new Class3_Sub1_Sub1_Sub2(arg8, 2, local472, local13, local23, local35, local45, local64.anInt3437, true, null);
				}
				arg4.method1781(arg1, arg2, arg6, local55, local497, local512, Static10.anIntArray48[arg3], Static10.anIntArray48[local472], local82, local70);
				if (local64.anInt3436 != 0) {
					arg0.method2109(local64.aBoolean130, arg2, arg3, arg6, arg7);
				}
			} else if (arg7 == 3) {
				if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
					local125 = local64.method2280(local35, arg3, local13, local45, 3, local23);
				} else {
					local125 = new Class3_Sub1_Sub1_Sub2(arg8, 3, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
				}
				arg4.method1781(arg1, arg2, arg6, local55, local125, null, Static56.anIntArray199[arg3], 0, local82, local70);
				if (local64.anInt3436 != 0) {
					arg0.method2109(local64.aBoolean130, arg2, arg3, arg6, arg7);
				}
			} else if (arg7 == 9) {
				if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
					local125 = local64.method2280(local35, arg3, local13, local45, arg7, local23);
				} else {
					local125 = new Class3_Sub1_Sub1_Sub2(arg8, arg7, arg3, local13, local23, local35, local45, local64.anInt3437, true, null);
				}
				arg4.method1748(arg1, arg2, arg6, local55, 1, 1, local125, 0, local82, local70);
				if (local64.anInt3436 != 0) {
					arg0.method2100(local64.anInt3449, local64.aBoolean130, arg6, arg2, local64.anInt3441, arg3);
				}
			} else {
				if (local64.aBoolean131) {
					if (arg3 == 1) {
						local472 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local472;
					} else if (arg3 == 2) {
						local472 = local45;
						local45 = local23;
						local23 = local472;
						local472 = local35;
						local35 = local13;
						local13 = local472;
					} else if (arg3 == 3) {
						local472 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local472;
					}
				}
				if (arg7 == 4) {
					if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
						local125 = local64.method2280(local35, 0, local13, local45, 4, local23);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub2(arg8, 4, 0, local13, local23, local35, local45, local64.anInt3437, true, null);
					}
					arg4.method1763(arg1, arg2, arg6, local55, local125, Static10.anIntArray48[arg3], arg3 * 512, 0, 0, local82, local70);
				} else if (arg7 == 5) {
					local472 = 16;
					local217 = arg4.method1745(arg1, arg2, arg6);
					if (local217 != 0) {
						local472 = Static18.method517(local217 >> 14 & 0x7FFF).anInt3446;
					}
					if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
						local512 = local64.method2280(local35, 0, local13, local45, 4, local23);
					} else {
						local512 = new Class3_Sub1_Sub1_Sub2(arg8, 4, 0, local13, local23, local35, local45, local64.anInt3437, true, null);
					}
					arg4.method1763(arg1, arg2, arg6, local55, local512, Static10.anIntArray48[arg3], arg3 * 512, local472 * Static21.anIntArray86[arg3], Static84.anIntArray268[arg3] * local472, local82, local70);
				} else if (arg7 == 6) {
					if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
						local125 = local64.method2280(local35, 0, local13, local45, 4, local23);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub2(arg8, 4, 0, local13, local23, local35, local45, local64.anInt3437, true, null);
					}
					arg4.method1763(arg1, arg2, arg6, local55, local125, 256, arg3, 0, 0, local82, local70);
				} else if (arg7 == 7) {
					if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
						local125 = local64.method2280(local35, 0, local13, local45, 4, local23);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub2(arg8, 4, 0, local13, local23, local35, local45, local64.anInt3437, true, null);
					}
					arg4.method1763(arg1, arg2, arg6, local55, local125, 512, arg3, 0, 0, local82, local70);
				} else if (arg7 == 8) {
					if (local64.anInt3437 == -1 && local64.anIntArray387 == null) {
						local125 = local64.method2280(local35, 0, local13, local45, 4, local23);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub2(arg8, 4, 0, local13, local23, local35, local45, local64.anInt3437, true, null);
					}
					arg4.method1763(arg1, arg2, arg6, local55, local125, 768, arg3, 0, 0, local82, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I")
	public static int method1499() {
		return 6;
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
	public static void method1500() {
		aClass60_975 = null;
		aClass60_966 = null;
		aClass3_Sub1_Sub2_Sub4_7 = null;
		aClass60_963 = null;
		aClass60_974 = null;
		aClass60_972 = null;
		aClass60_962 = null;
		aClass60_976 = null;
		aClass60_971 = null;
		aClass60_964 = null;
	}
}
