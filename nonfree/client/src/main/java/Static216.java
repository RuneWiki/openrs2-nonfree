import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt4233;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString139;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public static int anInt4237;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[J")
	public static long[] aLongArray90 = new long[32];

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIIII)V")
	public static void method3401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static206.anInt4065 = arg4;
		Static8.anInt140 = arg1;
		Static69.anInt1366 = arg2;
		Static106.anInt2119 = arg3;
		Static281.anInt5364 = arg0;
		if (Static69.anInt1366 >= 100) {
			@Pc(30) int local30 = Static206.anInt4065 * 128 + 64;
			@Pc(36) int local36 = Static106.anInt2119 * 128 + 64;
			@Pc(47) int local47 = Static104.method1648(Static295.anInt5586, local36, local30) - Static8.anInt140;
			@Pc(51) int local51 = local30 - Static105.anInt2016;
			@Pc(56) int local56 = local47 - Static141.anInt2760;
			@Pc(61) int local61 = local36 - Static243.anInt5653;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local61 * local61 + local51 * local51));
			Static140.anInt2757 = (int) (Math.atan2((double) local56, (double) local73) * 325.949D) & 0x7FF;
			Static262.anInt2349 = (int) (Math.atan2((double) local61, (double) local51) * -325.949D) & 0x7FF;
			if (Static140.anInt2757 < 128) {
				Static140.anInt2757 = 128;
			}
			if (Static140.anInt2757 > 383) {
				Static140.anInt2757 = 383;
			}
		}
		Static101.anInt1895 = 2;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method3402() {
		Static217.anIntArray341 = Static145.method2303(0.4F);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZI)V")
	public static void method3404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
		Static137.aClass1_Sub14_Sub1_6.method2631(20);
		Static137.aClass1_Sub14_Sub1_6.method2631(arg0);
		Static137.aClass1_Sub14_Sub1_6.method2631(arg1);
		Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		Static137.aClass1_Sub14_Sub1_6.method2637(arg2);
		Static282.anInt5385 = -3;
		Static34.anInt622 = 0;
		Static117.anInt2310 = 0;
		Static31.anInt560 = 1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!no;II)V")
	public static void method3405(@OriginalArg(1) Class22_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt4642 && arg1 != -1) {
			@Pc(19) Class167 local19 = Static313.method4648(arg1);
			@Pc(22) int local22 = local19.anInt5131;
			if (local22 == 1) {
				arg0.anInt4597 = 0;
				arg0.anInt4645 = 0;
				arg0.anInt4567 = 0;
				arg0.anInt4609 = 1;
				arg0.anInt4632 = arg2;
				Static212.method3338(arg0.anInt4601, false, arg0.anInt4597, local19, arg0.anInt4623);
			}
			if (local22 == 2) {
				arg0.anInt4567 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4642 == -1 || Static313.method4648(arg1).anInt5114 >= Static313.method4648(arg0.anInt4642).anInt5114) {
			arg0.anInt4597 = 0;
			arg0.anInt4609 = 1;
			arg0.anInt4632 = arg2;
			arg0.anInt4589 = arg0.anInt4580;
			arg0.anInt4642 = arg1;
			arg0.anInt4645 = 0;
			arg0.anInt4567 = 0;
			if (arg0.anInt4642 != -1) {
				Static212.method3338(arg0.anInt4601, false, arg0.anInt4597, Static313.method4648(arg0.anInt4642), arg0.anInt4623);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)I")
	public static int method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(20) int local20 = arg4;
			arg4 = arg2;
			arg2 = local20;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg1 - arg2;
		}
	}
}
