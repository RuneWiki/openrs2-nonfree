import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!qh;")
	public static Class93 aClass93_91;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array7;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt3081 = 0;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt3083 = -1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIB)I")
	public static int method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg5;
			arg5 = local6;
		}
		@Pc(14) int local14 = arg3 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg4;
		} else if (local14 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 1 + 7 - arg5 - arg4;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
	public static boolean method2481() {
		if (Static112.anInt2225 != 0) {
			try {
				Static104.aClass50_674.method1217(Static4.aClass87_1.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
	public static void method2482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class61 local13 = local7.aClass61_1;
		if (local13 != null) {
			local13.anInt2072 = local13.anInt2072 * arg3 / 16;
			local13.anInt2082 = local13.anInt2082 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!fj;")
	public static Class35 method2483(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class35_Sub2");
			@Pc(10) Class35 local10 = (Class35) local6.getDeclaredConstructor().newInstance();
			local10.method3261(arg2, arg1, arg0);
			return local10;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class35_Sub1 local30 = new Class35_Sub1();
			local30.method3261(arg2, arg1, arg0);
			return local30;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([Lclient!qh;IB)V")
	public static void method2484(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class93 local17 = arg0[local11];
			if (local17 != null && local17.anInt3660 == arg1 && (!local17.aBoolean156 || !Static35.method561(local17))) {
				if (local17.anInt3656 == 0) {
					if (!local17.aBoolean156 && Static35.method561(local17) && local17 != aClass93_91) {
						continue;
					}
					method2484(arg0, local17.anInt3603);
					if (local17.aClass93Array1 != null) {
						method2484(local17.aClass93Array1, local17.anInt3603);
					}
					@Pc(70) Class1_Sub13 local70 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local17.anInt3603);
					if (local70 != null) {
						Static194.method3147(local70.anInt1588);
					}
				}
				if (local17.anInt3656 == 6) {
					@Pc(101) int local101;
					if (local17.anInt3606 != -1 || local17.anInt3642 != -1) {
						@Pc(96) boolean local96 = Static31.method461(local17);
						if (local96) {
							local101 = local17.anInt3642;
						} else {
							local101 = local17.anInt3606;
						}
						if (local101 != -1) {
							@Pc(113) Class110 local113 = Static200.method3204(local101);
							if (local113 != null) {
								local17.anInt3654 += Static42.anInt921;
								while (local17.anInt3654 > local113.anIntArray460[local17.anInt3636]) {
									local17.anInt3654 -= local113.anIntArray460[local17.anInt3636];
									local17.anInt3636++;
									if (local17.anInt3636 >= local113.anIntArray458.length) {
										local17.anInt3636 -= local113.anInt4010;
										if (local17.anInt3636 < 0 || local113.anIntArray458.length <= local17.anInt3636) {
											local17.anInt3636 = 0;
										}
									}
									Static66.method999(local17);
								}
							}
						}
					}
					if (local17.anInt3671 != 0 && !local17.aBoolean156) {
						@Pc(201) int local201 = local17.anInt3671 >> 16;
						local101 = local17.anInt3671 << 16 >> 16;
						local101 *= Static42.anInt921;
						local17.anInt3624 = local101 + local17.anInt3624 & 0x7FF;
						@Pc(224) int local224 = local201 * Static42.anInt921;
						local17.anInt3607 = local17.anInt3607 + local224 & 0x7FF;
						Static66.method999(local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!pg;B)Lclient!ka;")
	public static Class13_Sub3 method2485(@OriginalArg(0) Class1_Sub17 arg0) {
		return new Class13_Sub3(arg0.method2167(), arg0.method2167(), arg0.method2167(), arg0.method2167(), arg0.method2135(), arg0.method2142());
	}
}
