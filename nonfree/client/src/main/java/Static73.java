import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_33 = new Class130(48, 7);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)Z")
	public static boolean method1751(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static66.aCharArray1[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Lclient!uea;")
	public static Class3_Sub49 method1752() {
		if (Static110.aClass223_15 == null || Static106.aClass294_1 == null) {
			return null;
		}
		Static106.aClass294_1.method7324(Static110.aClass223_15);
		@Pc(23) Class3_Sub49 local23 = (Class3_Sub49) Static106.aClass294_1.method7321();
		if (local23 == null) {
			return null;
		} else {
			@Pc(35) Class36 local35 = Static110.aClass335_4.method8125(local23.anInt9434);
			return local35 != null && local35.aBoolean89 && local35.method1413(Static110.anInterface1_2) ? local23 : Static453.method3850();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method1754(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static68.anInt1696; local16++) {
			if (arg0.equalsIgnoreCase(Static422.aStringArray29[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public static void method1756() {
		if (Static485.anInt8420 == 3) {
			Static256.method4279(4);
		} else if (Static485.anInt8420 == 7) {
			Static256.method4279(8);
		} else if (Static485.anInt8420 == 10) {
			Static256.method4279(11);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg6 < 0 || Static634.anInt10129 - 1 <= arg2 || arg6 >= Static638.anInt10172 - 1) {
			return;
		}
		if (Static330.aClass77ArrayArrayArray2 == null) {
			return;
		}
		@Pc(40) Interface2 local40;
		if (arg5 == 0) {
			local40 = (Interface2) Static126.method2496(arg0, arg2, arg6);
			@Pc(46) Interface2 local46 = (Interface2) Static613.method8502(arg0, arg2, arg6);
			if (local40 != null && arg4 != 2) {
				if (local40 instanceof Class4_Sub1_Sub3_Sub1) {
					((Class4_Sub1_Sub3_Sub1) local40).aClass207_1.method5302(arg3);
				} else {
					Static147.method2683(local40.method7381(), arg4, arg5, arg0, arg3, arg1, arg2, arg6);
				}
			}
			if (local46 != null) {
				if (local46 instanceof Class4_Sub1_Sub3_Sub1) {
					((Class4_Sub1_Sub3_Sub1) local46).aClass207_1.method5302(arg3);
				} else {
					Static147.method2683(local46.method7381(), arg4, arg5, arg0, arg3, arg1, arg2, arg6);
				}
			}
		} else if (arg5 == 1) {
			local40 = (Interface2) Static610.method8465(arg0, arg2, arg6);
			if (local40 != null) {
				if (local40 instanceof Class4_Sub1_Sub4_Sub1) {
					((Class4_Sub1_Sub4_Sub1) local40).aClass207_2.method5302(arg3);
				} else {
					@Pc(212) int local212 = local40.method7381();
					if (arg4 == 4 || arg4 == 5) {
						Static147.method2683(local212, 4, arg5, arg0, arg3, arg1, arg2, arg6);
					} else if (arg4 == 6) {
						Static147.method2683(local212, 4, arg5, arg0, arg3, arg1 + 4, arg2, arg6);
					} else if (arg4 == 7) {
						Static147.method2683(local212, 4, arg5, arg0, arg3, (arg1 + 2 & 0x3) + 4, arg2, arg6);
					} else if (arg4 == 8) {
						Static147.method2683(local212, 4, arg5, arg0, arg3, arg1 + 4, arg2, arg6);
						Static147.method2683(local212, 4, arg5, arg0, arg3, (arg1 + 2 & 0x3) + 4, arg2, arg6);
					}
				}
			}
		} else if (arg5 == 2) {
			local40 = (Interface2) Static572.method8142(arg0, arg2, arg6, as.class);
			if (local40 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local40 instanceof Class4_Sub1_Sub2_Sub4) {
					((Class4_Sub1_Sub2_Sub4) local40).aClass207_3.method5302(arg3);
				} else {
					Static147.method2683(local40.method7381(), arg4, arg5, arg0, arg3, arg1, arg2, arg6);
				}
			}
		} else if (arg5 == 3) {
			local40 = (Interface2) Static625.method8735(arg0, arg2, arg6);
			if (local40 != null) {
				if (local40 instanceof Class4_Sub1_Sub5_Sub2) {
					((Class4_Sub1_Sub5_Sub2) local40).aClass207_4.method5302(arg3);
				} else {
					Static147.method2683(local40.method7381(), arg4, arg5, arg0, arg3, arg1, arg2, arg6);
				}
			}
		}
	}
}
