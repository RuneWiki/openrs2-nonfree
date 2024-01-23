import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt5268 = 0;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method4008() {
		Static87.aClass79_13.method2489();
		Static266.aClass79_40.method2489();
		Static210.aClass79_30.method2489();
		Static218.aClass79_33.method2489();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4009(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(13) String local13 = Static13.method234(Static230.method4130(arg0));
		for (@Pc(20) int local20 = 0; local20 < Static238.anInt5146; local20++) {
			@Pc(28) Class9_Sub1_Sub1 local28 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local20]];
			if (local28 != null && local28.aString12 != null && local28.aString12.equalsIgnoreCase(local13)) {
				if (arg1 == 1) {
					Static171.aClass1_Sub13_Sub1_3.method1825(216);
					Static171.aClass1_Sub13_Sub1_3.method1766(0);
					Static171.aClass1_Sub13_Sub1_3.method1789(Static237.anIntArray447[local20]);
				} else if (arg1 == 4) {
					Static171.aClass1_Sub13_Sub1_3.method1825(3);
					Static171.aClass1_Sub13_Sub1_3.method1799(0);
					Static171.aClass1_Sub13_Sub1_3.method1807(Static237.anIntArray447[local20]);
				} else if (arg1 == 5) {
					Static171.aClass1_Sub13_Sub1_3.method1825(12);
					Static171.aClass1_Sub13_Sub1_3.method1789(Static237.anIntArray447[local20]);
					Static171.aClass1_Sub13_Sub1_3.method1799(0);
				} else if (arg1 == 6) {
					Static171.aClass1_Sub13_Sub1_3.method1825(183);
					Static171.aClass1_Sub13_Sub1_3.method1767(0);
					Static171.aClass1_Sub13_Sub1_3.method1807(Static237.anIntArray447[local20]);
				} else if (arg1 == 7) {
					Static171.aClass1_Sub13_Sub1_3.method1825(199);
					Static171.aClass1_Sub13_Sub1_3.method1796(Static237.anIntArray447[local20]);
					Static171.aClass1_Sub13_Sub1_3.method1766(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static50.method1013("", Static161.aString242 + local13, 0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)V")
	public static void method4016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static3.method36(Static202.anInt4469, arg0, Static94.anInt4237);
		@Pc(17) int local17 = Static3.method36(Static202.anInt4469, arg4, Static94.anInt4237);
		@Pc(23) int local23 = Static3.method36(Static167.anInt3907, arg2, Static150.anInt3860);
		@Pc(29) int local29 = Static3.method36(Static167.anInt3907, arg5, Static150.anInt3860);
		@Pc(37) int local37 = Static3.method36(Static202.anInt4469, arg3 + arg0, Static94.anInt4237);
		@Pc(46) int local46 = Static3.method36(Static202.anInt4469, arg4 - arg3, Static94.anInt4237);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static147.method2681(Static29.anIntArrayArray10[local48], arg1, local23, local29);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static147.method2681(Static29.anIntArrayArray10[local64], arg1, local23, local29);
		}
		@Pc(86) int local86 = Static3.method36(Static167.anInt3907, arg3 + arg2, Static150.anInt3860);
		@Pc(95) int local95 = Static3.method36(Static167.anInt3907, arg5 - arg3, Static150.anInt3860);
		for (@Pc(97) int local97 = local37; local97 <= local46; local97++) {
			@Pc(103) int[] local103 = Static29.anIntArrayArray10[local97];
			Static147.method2681(local103, arg1, local23, local86);
			Static147.method2681(local103, arg1, local95, local29);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method4018(@OriginalArg(1) int arg0) {
		Static249.anInt5332 = -1;
		Static39.anInt1086 = arg0;
		Static206.anInt4549 = -1;
		Static99.method2088();
	}
}
