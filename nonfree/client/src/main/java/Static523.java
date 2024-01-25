import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_375 = new Class296(11, 3);

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "Lclient!aea;")
	public static Class7 aClass7_1 = new Class7();

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_376 = new Class296(62, -1);

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!vv", name = "A", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_11 = new Class64("", 10);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IBIIIII)V")
	public static void method7174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static358.anInt8908 <= arg3 && Static216.anInt4203 >= arg5 && Static99.anInt1988 <= arg2 && arg1 <= Static205.anInt4042) {
			if (arg4 == 1) {
				Static305.method4812(arg2, arg1, arg5, arg0, arg3);
			} else {
				Static42.method905(arg4, arg0, arg3, arg1, arg5, arg2);
			}
		} else if (arg4 == 1) {
			Static422.method6175(arg0, arg2, arg5, arg1, arg3);
		} else {
			Static57.method1094(arg1, arg3, arg4, arg5, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILclient!fd;IBIIIIIII)Z")
	public static boolean method7177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg6;
		@Pc(17) int local17 = arg8 - 64;
		@Pc(21) int local21 = arg6 - 64;
		Static160.anIntArrayArray35[64][64] = 99;
		Static186.anIntArrayArray38[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(37) int local37 = 0;
		Static398.anIntArray690[0] = arg8;
		@Pc(44) int local44 = local35 + 1;
		Static368.anIntArray663[0] = arg6;
		@Pc(49) int[][] local49 = arg2.anIntArrayArray30;
		while (true) {
			label282: while (true) {
				@Pc(83) int local83;
				@Pc(72) int local72;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(240) int local240;
				@Pc(283) int local283;
				do {
					do {
						do {
							label259: do {
								if (local44 == local37) {
									Static316.anInt5813 = local7;
									Static296.anInt4450 = local9;
									return false;
								}
								local9 = Static368.anIntArray663[local37];
								local7 = Static398.anIntArray690[local37];
								local72 = local9 - local21;
								local37 = local37 + 1 & 0xFFF;
								local83 = local7 - local17;
								local88 = local7 - arg2.anInt2571;
								local94 = local9 - arg2.anInt2587;
								if (arg0 == -4) {
									if (local7 == arg10 && local9 == arg9) {
										Static296.anInt4450 = local9;
										Static316.anInt5813 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static205.method3534(arg3, local9, arg3, arg9, arg10, arg1, arg5, local7)) {
										Static296.anInt4450 = local9;
										Static316.anInt5813 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg2.method2181(local9, arg10, arg5, arg1, arg3, arg3, arg9, arg4, local7)) {
										Static296.anInt4450 = local9;
										Static316.anInt5813 = local7;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg2.method2179(arg1, arg4, local7, arg9, arg5, local9, arg10, arg3)) {
										Static316.anInt5813 = local7;
										Static296.anInt4450 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg2.method2170(arg3, arg7, local7, local9, arg10, arg0, arg9)) {
										Static296.anInt4450 = local9;
										Static316.anInt5813 = local7;
										return true;
									}
								} else if (arg2.method2167(arg7, local9, local7, arg3, arg0, arg10, arg9)) {
									Static316.anInt5813 = local7;
									Static296.anInt4450 = local9;
									return true;
								}
								local240 = Static186.anIntArrayArray38[local83][local72] + 1;
								if (local83 > 0 && Static160.anIntArrayArray35[local83 - 1][local72] == 0 && (local49[local88 - 1][local94] & 0x43A40000) == 0 && (local49[local88 - 1][local94 + arg3 - 1] & 0x4E240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg3 - 1) {
											Static398.anIntArray690[local44] = local7 - 1;
											Static368.anIntArray663[local44] = local9;
											local44 = local44 + 1 & 0xFFF;
											Static160.anIntArrayArray35[local83 - 1][local72] = 2;
											Static186.anIntArrayArray38[local83 - 1][local72] = local240;
											break;
										}
										if ((local49[local88 - 1][local94 + local283] & 0x4FA40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local83 < 128 - arg3 && Static160.anIntArrayArray35[local83 + 1][local72] == 0 && (local49[arg3 + local88][local94] & 0x60E40000) == 0 && (local49[arg3 + local88][arg3 + local94 - 1] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg3 - 1 <= local283) {
											Static398.anIntArray690[local44] = local7 + 1;
											Static368.anIntArray663[local44] = local9;
											Static160.anIntArrayArray35[local83 + 1][local72] = 8;
											local44 = local44 + 1 & 0xFFF;
											Static186.anIntArrayArray38[local83 + 1][local72] = local240;
											break;
										}
										if ((local49[arg3 + local88][local94 + local283] & 0x78E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local72 > 0 && Static160.anIntArrayArray35[local83][local72 - 1] == 0 && (local49[local88][local94 - 1] & 0x43A40000) == 0 && (local49[arg3 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg3 - 1 <= local283) {
											Static398.anIntArray690[local44] = local7;
											Static368.anIntArray663[local44] = local9 - 1;
											Static160.anIntArrayArray35[local83][local72 - 1] = 1;
											local44 = local44 + 1 & 0xFFF;
											Static186.anIntArrayArray38[local83][local72 - 1] = local240;
											break;
										}
										if ((local49[local88 + local283][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg3 > local72 && Static160.anIntArrayArray35[local83][local72 + 1] == 0 && (local49[local88][local94 + arg3] & 0x4E240000) == 0 && (local49[local88 + arg3 - 1][arg3 + local94] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg3 - 1) {
											Static398.anIntArray690[local44] = local7;
											Static368.anIntArray663[local44] = local9 + 1;
											Static160.anIntArrayArray35[local83][local72 + 1] = 4;
											local44 = local44 + 1 & 0xFFF;
											Static186.anIntArrayArray38[local83][local72 + 1] = local240;
											break;
										}
										if ((local49[local283 + local88][arg3 + local94] & 0x7E240000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local83 > 0 && local72 > 0 && Static160.anIntArrayArray35[local83 - 1][local72 - 1] == 0 && (local49[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg3 <= local283) {
											Static398.anIntArray690[local44] = local7 - 1;
											Static368.anIntArray663[local44] = local9 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static160.anIntArrayArray35[local83 - 1][local72 - 1] = 3;
											Static186.anIntArrayArray38[local83 - 1][local72 - 1] = local240;
											break;
										}
										if ((local49[local88 - 1][local283 + local94 - 1] & 0x4FA40000) != 0 || (local49[local283 + local88 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg3 > local83 && local72 > 0 && Static160.anIntArrayArray35[local83 + 1][local72 - 1] == 0 && (local49[arg3 + local88][local94 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg3 <= local283) {
											Static398.anIntArray690[local44] = local7 + 1;
											Static368.anIntArray663[local44] = local9 - 1;
											Static160.anIntArrayArray35[local83 + 1][local72 - 1] = 9;
											local44 = local44 + 1 & 0xFFF;
											Static186.anIntArrayArray38[local83 + 1][local72 - 1] = local240;
											break;
										}
										if ((local49[arg3 + local88][local94 + local283 - 1] & 0x78E40000) != 0 || (local49[local88 + local283][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local83 > 0 && local72 < 128 - arg3 && Static160.anIntArrayArray35[local83 - 1][local72 + 1] == 0 && (local49[local88 - 1][arg3 + local94] & 0x4E240000) == 0) {
									for (local283 = 1; local283 < arg3; local283++) {
										if ((local49[local88 - 1][local283 + local94] & 0x4FA40000) != 0 || (local49[local88 + local283 - 1][local94 + arg3] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static398.anIntArray690[local44] = local7 - 1;
									Static368.anIntArray663[local44] = local9 + 1;
									local44 = local44 + 1 & 0xFFF;
									Static160.anIntArrayArray35[local83 - 1][local72 + 1] = 6;
									Static186.anIntArrayArray38[local83 - 1][local72 + 1] = local240;
								}
							} while (128 - arg3 <= local83);
						} while (128 - arg3 <= local72);
					} while (Static160.anIntArrayArray35[local83 + 1][local72 + 1] != 0);
				} while ((local49[local88 + arg3][local94 + arg3] & 0x78240000) != 0);
				for (local283 = 1; local283 < arg3; local283++) {
					if ((local49[local88 + local283][arg3 + local94] & 0x7E240000) != 0 || (local49[arg3 + local88][local283 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static398.anIntArray690[local44] = local7 + 1;
				Static368.anIntArray663[local44] = local9 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local83 + 1][local72 + 1] = 12;
				Static186.anIntArrayArray38[local83 + 1][local72 + 1] = local240;
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method7179(@OriginalArg(0) Class49_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static487.aClass37_88.method977(); local10 != null; local10 = (Class1_Sub10) Static487.aClass37_88.method971()) {
			if (arg0 == local10.aClass49_Sub2_Sub2_Sub2_1) {
				if (local10.aClass1_Sub16_Sub2_2 != null) {
					Static411.aClass1_Sub16_Sub1_2.method2231(local10.aClass1_Sub16_Sub2_2);
					local10.aClass1_Sub16_Sub2_2 = null;
				}
				local10.method7525();
				return;
			}
		}
	}
}
