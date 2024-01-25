import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
	public static int anInt6919;

	@OriginalMember(owner = "client!mfa", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!mf;Lclient!mf;ZIB)I")
	public static int method5917(@OriginalArg(0) Class206_Sub1 arg0, @OriginalArg(1) Class206_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg0.anInt6899;
			local12 = arg1.anInt6899;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static613.method8964(arg1.method5902().aString105, Static476.anInt8915, arg0.method5902().aString105);
		} else if (arg3 == 3) {
			if (arg0.aString74.equals("-")) {
				if (arg1.aString74.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString74.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static613.method8964(arg1.aString74, Static476.anInt8915, arg0.aString74);
			}
		} else if (arg3 == 4) {
			if (arg0.method5898()) {
				return arg1.method5898() ? 0 : 1;
			} else if (arg1.method5898()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg0.method5901()) {
				return arg1.method5901() ? 0 : 1;
			} else if (arg1.method5901()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg0.method5896()) {
				return arg1.method5896() ? 0 : 1;
			} else if (arg1.method5896()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg0.method5894()) {
				return arg1.method5894() ? 0 : 1;
			} else if (arg1.method5894()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg0.anInt6907;
			local12 = arg1.anInt6907;
			if (arg2) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg0.anInt6906 - arg1.anInt6906;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "(II)V")
	public static void method5918(@OriginalArg(1) int arg0) {
		Static35.anInt773 = arg0;
		Static482.aClass169_51.method5009();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)V")
	public static void method5920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static487.anInt9598 = arg1;
		Static353.anInt7031 = arg0;
		if (Static66.anInt10075 == 0) {
			Static506.anInt9325 = Static83.anInt2550 * 2 + Static353.anInt7031;
			Static37.anInt816 = Static495.anInt9127 * 2 + Static487.anInt9598;
		} else if (Static66.anInt10075 == 1) {
			Static228.anInt5033 = Static26.anInt540 + Static487.anInt9598 / Static267.anInt5684 + 2;
			Static548.anInt9814 = Static298.anInt6265 + Static353.anInt7031 / Static11.anInt6559 + 2;
			Static37.anInt816 = Static267.anInt5684 * Static228.anInt5033;
			Static506.anInt9325 = Static11.anInt6559 * Static548.anInt9814;
			Static495.anInt9127 = Static37.anInt816 - Static487.anInt9598 >> 1;
			Static83.anInt2550 = Static506.anInt9325 - Static353.anInt7031 >> 1;
		} else if (Static66.anInt10075 == 2) {
			Static37.anInt816 = Static487.anInt9598;
			Static506.anInt9325 = Static353.anInt7031;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!at;)Ljava/lang/String;")
	public static String method5921(@OriginalArg(1) Class24 arg0) {
		if (Static76.method2235(arg0).method9008() == 0) {
			return null;
		} else if (arg0.aString4 == null || arg0.aString4.trim().length() == 0) {
			return Static591.aBoolean480 ? "Hidden-use" : null;
		} else {
			return arg0.aString4;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZIII)I")
	public static int method5922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static124.anInt11089 < 100) {
			return -2;
		}
		@Pc(23) int local23 = -2;
		@Pc(25) int local25 = Integer.MAX_VALUE;
		@Pc(29) int local29 = arg1 - Static303.anInt110;
		@Pc(33) int local33 = arg2 - Static303.anInt108;
		for (@Pc(38) Class2_Sub32 local38 = (Class2_Sub32) Static303.aClass341_2.method8524(); local38 != null; local38 = (Class2_Sub32) Static303.aClass341_2.method8519()) {
			if (local38.anInt6568 == arg0) {
				@Pc(47) int local47 = local38.anInt6572;
				@Pc(50) int local50 = local38.anInt6571;
				@Pc(61) int local61 = local50 + Static303.anInt108 | Static303.anInt110 + local47 << 14;
				@Pc(80) int local80 = (local33 - local50) * (-local50 + local33) + (local29 - local47) * (-local47 + local29);
				if (local23 < 0 || local80 < local25) {
					local25 = local80;
					local23 = local61;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "([BIII[[B[[B[I[I)I")
	public static int method5924(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(17) int local17 = arg5[arg2];
		@Pc(23) int local23 = arg6[arg2] + local17;
		@Pc(27) int local27 = arg5[arg1];
		@Pc(33) int local33 = arg6[arg1] + local27;
		@Pc(35) int local35 = local17;
		if (local27 > local17) {
			local35 = local27;
		}
		@Pc(46) int local46 = local23;
		if (local33 < local23) {
			local46 = local33;
		}
		@Pc(57) int local57 = arg0[arg2] & 0xFF;
		if (local57 > (arg0[arg1] & 0xFF)) {
			local57 = arg0[arg1] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg4[arg2];
		@Pc(78) byte[] local78 = arg3[arg1];
		@Pc(83) int local83 = local35 - local17;
		@Pc(88) int local88 = local35 - local27;
		for (@Pc(90) int local90 = local35; local90 < local46; local90++) {
			@Pc(102) int local102 = local78[local88++] + local74[local83++];
			if (local57 > local102) {
				local57 = local102;
			}
		}
		return -local57;
	}
}
