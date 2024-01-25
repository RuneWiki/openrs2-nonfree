import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt5695 = 0;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
	public static final int[] anIntArray453 = new int[1];

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!vq;")
	public static final Class260 aClass260_6 = new Class260(128);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method4569(@OriginalArg(1) int arg0) {
		if (Static8.anInt119 == arg0) {
			return;
		}
		if (Static8.anInt119 == 0) {
			Static370.method4891();
		}
		if (arg0 == 12) {
			Static136.method1958(Static76.aString7, Static160.aString55, Static11.anInt178);
		}
		if (arg0 != 12 && Static85.aClass152_2 != null) {
			Static85.aClass152_2.method2924();
			Static85.aClass152_2 = null;
		}
		if (arg0 == 2) {
			Static48.method632(Static182.anInt3346 != Static343.anInt5688);
		}
		if (arg0 == 6) {
			Static335.method4428(Static182.anInt3346 != Static40.anInt665);
		}
		if (arg0 == 4) {
			Static1.method6(Static160.aString55, Static76.aString7);
		} else if (arg0 == 5) {
			Static136.method1958(Static76.aString7, Static160.aString55, Static11.anInt178);
		} else if (arg0 == 8) {
			Static136.method1958(Static76.aString7, Static160.aString55, Static11.anInt178);
		} else if (arg0 == 11) {
			Static1.method6(Static160.aString55, Static76.aString7);
		}
		if (Static229.method3102(Static8.anInt119)) {
			Static170.aClass211_95.anInt5388 = 2;
			Static108.aClass211_8.anInt5388 = 2;
			Static81.aClass211_22.anInt5388 = 2;
			Static11.aClass211_9.anInt5388 = 2;
			Static391.aClass211_85.anInt5388 = 2;
			Static75.aClass211_20.anInt5388 = 2;
			Static291.aClass211_72.anInt5388 = 2;
		}
		if (Static229.method3102(arg0)) {
			Static246.anInt4084 = 1;
			Static84.anInt5160 = 0;
			Static445.anInt7463 = 1;
			Static375.anInt6137 = 0;
			Static294.anInt4838 = 0;
			Static284.method3714(true);
			Static170.aClass211_95.anInt5388 = 1;
			Static108.aClass211_8.anInt5388 = 1;
			Static81.aClass211_22.anInt5388 = 1;
			Static11.aClass211_9.anInt5388 = 1;
			Static391.aClass211_85.anInt5388 = 1;
			Static75.aClass211_20.anInt5388 = 1;
			Static291.aClass211_72.anInt5388 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static222.method3020();
		}
		if (arg0 == 1) {
			Static123.method1735(Static39.aClass135_1, Static13.aClass211_11);
		} else {
			Static194.method5775();
		}
		@Pc(228) boolean local228 = arg0 == 1 || Static173.method2395(arg0) || Static405.method5418(arg0);
		@Pc(243) boolean local243 = Static8.anInt119 == 1 || Static173.method2395(Static8.anInt119) || Static405.method5418(Static8.anInt119);
		if (local228 != local243) {
			if (local228) {
				Static267.anInt4386 = Static232.anInt3970;
				if (Static413.aClass49_Sub1_1.anInt3203 == 0) {
					Static175.method2453();
				} else {
					Static406.method5510(Static231.aClass211_62, Static413.aClass49_Sub1_1.anInt3203, Static232.anInt3970);
				}
				Static373.aClass54_2.method1235(false);
			} else {
				Static175.method2453();
				Static373.aClass54_2.method1235(true);
			}
		}
		if (Static229.method3102(arg0) || arg0 == 12) {
			Static39.aClass135_1.method5361();
		}
		Static8.anInt119 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBILclient!ma;Lclient!l;IILclient!hd;)V")
	public static void method4570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class110 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static97.anInt1791 == 4) {
			local14 = (int) Static109.aFloat75 & 0x3FFF;
		} else {
			local14 = (int) Static109.aFloat75 + Static35.anInt575 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt2617 / 2, arg6.anInt2590 / 2) + 10;
		@Pc(55) int local55 = arg5 * arg5 + arg1 * arg1;
		if (local55 > local35 * local35) {
			return;
		}
		@Pc(65) int local65 = Class100.anIntArray206[local14];
		@Pc(69) int local69 = Class100.anIntArray208[local14];
		if (Static97.anInt1791 != 4) {
			local65 = local65 * 256 / (Static380.anInt6188 + 256);
			local69 = local69 * 256 / (Static380.anInt6188 + 256);
		}
		@Pc(100) int local100 = arg1 * local69 + arg5 * local65 >> 15;
		@Pc(111) int local111 = arg5 * local69 - arg1 * local65 >> 15;
		arg3.method5820(arg6.anInt2617 / 2 + arg4 + local100 - arg3.j() / 2, -local111 + arg0 - -(arg6.anInt2590 / 2) + -(arg3.T() / 2), arg2, arg4, arg0);
	}
}
