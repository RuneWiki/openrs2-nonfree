import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_37 = new Class186(75, 8);

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_8 = new Class263(4, 1, 1, 1);

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method1020() {
		Static413.aClass30_12.ua(((float) Static126.aClass67_Sub1_1.anInt5842 * 0.1F + 0.7F) * Static155.aFloat89);
		Static413.aClass30_12.XA(Static28.anInt681, Static451.aFloat220, Static152.aFloat84, (float) (Static187.anInt3601 << 0), (float) (Static412.anInt7034 << 0), (float) (Static292.anInt5290 << 0));
		Static413.aClass30_12.method4667(Static186.aClass59_3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!vg;Lclient!vg;I)V")
	public static void method1021(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_262 != null) {
			arg1.method5854();
		}
		arg1.aClass4_261 = arg0;
		arg1.aClass4_262 = arg0.aClass4_262;
		arg1.aClass4_262.aClass4_261 = arg1;
		arg1.aClass4_261.aClass4_262 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!wq;I[IIIIII[IIIIIZ)I")
	public static int method1022(@OriginalArg(0) int arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static384.anIntArrayArray57[local7][local11] = 0;
				Static33.anIntArrayArray12[local7][local11] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg10 == 1) {
			local61 = Static328.method4470(arg7, arg5, arg12, arg2, arg4, arg8, arg6, arg11, arg0, arg1);
		} else if (arg10 == 2) {
			local61 = Static166.method2460(arg11, arg1, arg0, arg12, arg2, arg8, arg6, arg7, arg5, arg4);
		} else {
			local61 = Static306.method4228(arg6, arg1, arg5, arg12, arg8, arg7, arg0, arg10, arg2, arg11, arg4);
		}
		@Pc(95) int local95 = arg12 - 64;
		@Pc(99) int local99 = arg5 - 64;
		@Pc(101) int local101 = Static126.anInt2567;
		@Pc(103) int local103 = Static123.anInt6825;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		if (!local61) {
			if (!arg13) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local120 = arg2 - 10; local120 <= arg2 + 10; local120++) {
				for (@Pc(127) int local127 = arg11 - 10; local127 <= arg11 + 10; local127++) {
					@Pc(134) int local134 = local120 - local95;
					@Pc(139) int local139 = local127 - local99;
					if (local134 >= 0 && local139 >= 0 && local134 < 128 && local139 < 128 && Static33.anIntArrayArray12[local134][local139] < 100) {
						@Pc(163) int local163 = 0;
						if (local120 < arg2) {
							local163 = arg2 - local120;
						} else if (arg2 + arg0 - 1 < local120) {
							local163 = local120 + 1 - arg0 - arg2;
						}
						@Pc(196) int local196 = 0;
						if (arg11 > local127) {
							local196 = arg11 - local127;
						} else if (arg11 + arg7 - 1 < local127) {
							local196 = local127 + 1 - arg11 - arg7;
						}
						@Pc(236) int local236 = local163 * local163 + local196 * local196;
						if (local111 > local236 || local111 == local236 && Static33.anIntArrayArray12[local134][local139] < local113) {
							local103 = local127;
							local111 = local236;
							local101 = local120;
							local113 = Static33.anIntArrayArray12[local134][local139];
						}
					}
				}
			}
			if (local111 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local101 == arg12 && local103 == arg5) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static102.anIntArray137[0] = local101;
		local111 = local297 + 1;
		Static161.anIntArray252[0] = local103;
		@Pc(326) int local326;
		local113 = local326 = Static384.anIntArrayArray57[local101 - local95][local103 - local99];
		while (local101 != arg12 || local103 != arg5) {
			if (local113 != local326) {
				Static102.anIntArray137[local111] = local101;
				local326 = local113;
				Static161.anIntArray252[local111++] = local103;
			}
			if ((local113 & 0x2) != 0) {
				local101++;
			} else if ((local113 & 0x8) != 0) {
				local101--;
			}
			if ((local113 & 0x1) != 0) {
				local103++;
			} else if ((local113 & 0x4) != 0) {
				local103--;
			}
			local113 = Static384.anIntArrayArray57[local101 - local95][local103 - local99];
		}
		local120 = 0;
		while (local111-- > 0) {
			arg3[local120] = Static102.anIntArray137[local111];
			arg9[local120++] = Static161.anIntArray252[local111];
			if (arg3.length <= local120) {
				break;
			}
		}
		return local120;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)Z")
	public static boolean method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static265.anInt3300; local1++) {
			@Pc(6) Class224 local6 = Static31.aClass224Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6543 == 1) {
				local15 = local6.anInt6553 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6544 + (local6.anInt6551 * local15 >> 8);
					local37 = local6.anInt6546 + (local6.anInt6547 * local15 >> 8);
					local47 = local6.anInt6535 + (local6.anInt6538 * local15 >> 8);
					local57 = local6.anInt6549 + (local6.anInt6550 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6543 == 2) {
				local15 = arg0 - local6.anInt6553;
				if (local15 > 0) {
					local27 = local6.anInt6544 + (local6.anInt6551 * local15 >> 8);
					local37 = local6.anInt6546 + (local6.anInt6547 * local15 >> 8);
					local47 = local6.anInt6535 + (local6.anInt6538 * local15 >> 8);
					local57 = local6.anInt6549 + (local6.anInt6550 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6543 == 3) {
				local15 = local6.anInt6544 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6553 + (local6.anInt6540 * local15 >> 8);
					local37 = local6.anInt6541 + (local6.anInt6536 * local15 >> 8);
					local47 = local6.anInt6535 + (local6.anInt6538 * local15 >> 8);
					local57 = local6.anInt6549 + (local6.anInt6550 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6543 == 4) {
				local15 = arg2 - local6.anInt6544;
				if (local15 > 0) {
					local27 = local6.anInt6553 + (local6.anInt6540 * local15 >> 8);
					local37 = local6.anInt6541 + (local6.anInt6536 * local15 >> 8);
					local47 = local6.anInt6535 + (local6.anInt6538 * local15 >> 8);
					local57 = local6.anInt6549 + (local6.anInt6550 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6543 == 5) {
				local15 = arg1 - local6.anInt6535;
				if (local15 > 0) {
					local27 = local6.anInt6553 + (local6.anInt6540 * local15 >> 8);
					local37 = local6.anInt6541 + (local6.anInt6536 * local15 >> 8);
					local47 = local6.anInt6544 + (local6.anInt6551 * local15 >> 8);
					local57 = local6.anInt6546 + (local6.anInt6547 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
