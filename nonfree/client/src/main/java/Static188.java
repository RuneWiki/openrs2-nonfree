import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!lo", name = "T", descriptor = "Lclient!sd;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
	public static int anInt3800;

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_122 = new Class18(69, -1);

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_123 = new Class18(38, -1);

	@OriginalMember(owner = "client!lo", name = "U", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_132 = new Class217(56, 12);

	@OriginalMember(owner = "client!lo", name = "W", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_133 = new Class217(44, 6);

	@OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
	public static int anInt3801 = 0;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)Lclient!fo;")
	public static Class62 method3531(@OriginalArg(0) int arg0) {
		@Pc(10) Class62 local10 = (Class62) Static29.aClass21_28.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static96.aClass30_29.method1161(arg0, 29);
		local10 = new Class62();
		if (local20 != null) {
			local10.method1930(arg0, new Class1_Sub7(local20));
		}
		Static29.aClass21_28.method843(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([II[ILclient!wc;[I)V")
	public static void method3532(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class11_Sub2_Sub6_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = arg1[local11];
			@Pc(21) int local21 = arg0[local11];
			@Pc(25) int local25 = arg3[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && arg2.aClass163Array3.length > local27; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg2.aClass163Array3[local27] = null;
					} else {
						@Pc(41) Class199 local41 = Static161.method3066(local17);
						@Pc(44) int local44 = local41.anInt6015;
						@Pc(49) Class163 local49 = arg2.aClass163Array3[local27];
						if (local49 != null) {
							if (local49.anInt5050 == local17) {
								if (local44 == 0) {
									local49 = arg2.aClass163Array3[local27] = null;
								} else if (local44 == 1) {
									local49.anInt5051 = local25;
									local49.anInt5053 = 0;
									local49.anInt5052 = 1;
									local49.anInt5055 = 0;
									local49.anInt5048 = 0;
									Static96.method2060(local41, Static191.aClass11_Sub2_Sub6_Sub1_4 == arg2, arg2.aByte79, 0, arg2.anInt6729, arg2.anInt6726);
								} else if (local44 == 2) {
									local49.anInt5048 = 0;
								}
							} else if (local41.anInt6020 >= Static161.method3066(local49.anInt5050).anInt6020) {
								local49 = arg2.aClass163Array3[local27] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass163Array3[local27] = new Class163();
							local49.anInt5053 = 0;
							local49.anInt5048 = 0;
							local49.anInt5051 = local25;
							local49.anInt5052 = 1;
							local49.anInt5050 = local17;
							local49.anInt5055 = 0;
							Static96.method2060(local41, arg2 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg2.aByte79, 0, arg2.anInt6729, arg2.anInt6726);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!gk;Lclient!gk;I)V")
	public static void method3533(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_252 != null) {
			arg0.method6045();
		}
		arg0.aClass1_251 = arg1;
		arg0.aClass1_252 = arg1.aClass1_252;
		arg0.aClass1_252.aClass1_251 = arg0;
		arg0.aClass1_251.aClass1_252 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIILclient!kg;)V")
	public static void method3535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class112 arg2) {
		if (Static77.aBoolean119) {
			if (!Static44.method1079(arg2).method5751() || (Static127.anInt2772 & 0x20) == 0) {
				return;
			}
			Static295.method5151(Static62.anInt1506, arg2.anInt3376, false, true, Static365.aString65, 0L, Static196.aString39 + " -> " + arg2.aString25, 2, arg2.anInt3398);
			return;
		}
		@Pc(21) String local21;
		for (@Pc(14) int local14 = 9; local14 >= 5; local14--) {
			local21 = Static91.method6073(arg2, local14);
			if (local21 != null) {
				Static295.method5151(Static311.method5138(arg2, local14), arg2.anInt3376, false, true, local21, (long) (local14 + 1), arg2.aString25, 1004, arg2.anInt3398);
			}
		}
		local21 = Static334.method5882(arg2);
		if (local21 != null) {
			Static295.method5151(arg2.anInt3423, arg2.anInt3376, false, true, local21, 0L, arg2.aString25, 57, arg2.anInt3398);
		}
		for (@Pc(78) int local78 = 4; local78 >= 0; local78--) {
			@Pc(85) String local85 = Static91.method6073(arg2, local78);
			if (local85 != null) {
				Static295.method5151(Static311.method5138(arg2, local78), arg2.anInt3376, false, true, local85, (long) (local78 + 1), arg2.aString25, 13, arg2.anInt3398);
			}
		}
		if (!Static44.method1079(arg2).method5757()) {
			return;
		}
		if (arg2.lb == null) {
			Static295.method5151(-1, arg2.anInt3376, false, true, Static357.aClass106_231.method2927(Static254.anInt5172), 0L, "", 50, arg2.anInt3398);
			return;
		}
		Static295.method5151(-1, arg2.anInt3376, false, true, arg2.lb, 0L, "", 50, arg2.anInt3398);
		return;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)Lclient!kg;")
	public static Class112 method3536(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static341.aClass112ArrayArray1[local7] == null || Static341.aClass112ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static272.method4850(local7);
			if (!local25) {
				return null;
			}
		}
		return Static341.aClass112ArrayArray1[local7][local11];
	}
}
