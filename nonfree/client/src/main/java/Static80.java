import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cw", name = "E", descriptor = "Lclient!im;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "[S")
	private static final short[] aShortArray25 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "[S")
	private static final short[] aShortArray26 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!cw", name = "B", descriptor = "[S")
	private static final short[] aShortArray28 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "[S")
	private static final short[] aShortArray27 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray25, aShortArray26, aShortArray28, aShortArray27 };

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
	public static int anInt2134 = 2;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg3 < 0 || arg0 >= Static345.anInt6228 - 1 || arg3 >= Static535.anInt9341 - 1) {
			return;
		}
		if (Static189.aClass333ArrayArrayArray1 == null) {
			return;
		}
		@Pc(33) Interface14 local33;
		if (arg4 == 0) {
			local33 = (Interface14) Static597.method8185(arg5, arg0, arg3);
			@Pc(39) Interface14 local39 = (Interface14) Static6.method60(arg5, arg0, arg3);
			if (local33 != null && arg1 != 2) {
				if (local33 instanceof Class25_Sub2_Sub3_Sub2) {
					((Class25_Sub2_Sub3_Sub2) local33).aClass97_3.method2671(arg2);
				} else {
					Static314.method4679(arg1, arg0, arg6, arg2, arg5, arg4, local33.method4958(), arg3);
				}
			}
			if (local39 != null) {
				if (local39 instanceof Class25_Sub2_Sub3_Sub2) {
					((Class25_Sub2_Sub3_Sub2) local39).aClass97_3.method2671(arg2);
				} else {
					Static314.method4679(arg1, arg0, arg6, arg2, arg5, arg4, local39.method4958(), arg3);
				}
			}
		} else if (arg4 == 1) {
			local33 = (Interface14) Static542.method7423(arg5, arg0, arg3);
			if (local33 != null) {
				if (local33 instanceof Class25_Sub2_Sub1_Sub2) {
					((Class25_Sub2_Sub1_Sub2) local33).aClass97_4.method2671(arg2);
				} else {
					@Pc(209) int local209 = local33.method4958();
					if (arg1 == 4 || arg1 == 5) {
						Static314.method4679(4, arg0, arg6, arg2, arg5, arg4, local209, arg3);
					} else if (arg1 == 6) {
						Static314.method4679(4, arg0, arg6 + 4, arg2, arg5, arg4, local209, arg3);
					} else if (arg1 == 7) {
						Static314.method4679(4, arg0, (arg6 + 2 & 0x3) + 4, arg2, arg5, arg4, local209, arg3);
					} else if (arg1 == 8) {
						Static314.method4679(4, arg0, arg6 + 4, arg2, arg5, arg4, local209, arg3);
						Static314.method4679(4, arg0, (arg6 + 2 & 0x3) + 4, arg2, arg5, arg4, local209, arg3);
					}
				}
			}
		} else if (arg4 == 2) {
			local33 = (Interface14) Static13.method122(arg5, arg0, arg3, ofa.class);
			if (local33 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local33 instanceof Class25_Sub2_Sub2_Sub3) {
					((Class25_Sub2_Sub2_Sub3) local33).aClass97_2.method2671(arg2);
				} else {
					Static314.method4679(arg1, arg0, arg6, arg2, arg5, arg4, local33.method4958(), arg3);
				}
			}
		} else if (arg4 == 3) {
			local33 = (Interface14) Static134.method2611(arg5, arg0, arg3);
			if (local33 != null) {
				if (local33 instanceof Class25_Sub2_Sub5_Sub2) {
					((Class25_Sub2_Sub5_Sub2) local33).aClass97_1.method2671(arg2);
				} else {
					Static314.method4679(arg1, arg0, arg6, arg2, arg5, arg4, local33.method4958(), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V")
	public static void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static84.method7340(arg1, arg3, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static269.method4097(arg2, arg1, arg3, arg4);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(62) boolean local62 = local10 > local15;
			@Pc(66) int local66;
			@Pc(68) int local68;
			if (local62) {
				local66 = arg3;
				local68 = arg2;
				arg3 = arg1;
				arg2 = arg0;
				arg1 = local66;
				arg0 = local68;
			}
			if (arg2 < arg3) {
				local66 = arg3;
				local68 = arg1;
				arg3 = arg2;
				arg2 = local66;
				arg1 = arg0;
				arg0 = local68;
			}
			local66 = arg1;
			local68 = arg2 - arg3;
			@Pc(107) int local107 = arg0 - arg1;
			@Pc(112) int local112 = -(local68 >> 1);
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(124) int local124 = arg0 > arg1 ? 1 : -1;
			@Pc(128) int local128;
			if (local62) {
				for (local128 = arg3; local128 <= arg2; local128++) {
					local112 += local107;
					Static570.anIntArrayArray100[local128][local66] = arg4;
					if (local112 > 0) {
						local112 -= local68;
						local66 += local124;
					}
				}
			} else {
				for (local128 = arg3; local128 <= arg2; local128++) {
					local112 += local107;
					Static570.anIntArrayArray100[local66][local128] = arg4;
					if (local112 > 0) {
						local112 -= local68;
						local66 += local124;
					}
				}
			}
		}
	}
}
