import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!na;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "[I")
	public static int[] anIntArray118 = new int[32];

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
	public static int anInt902 = -1;

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
	public static int anInt914 = -1;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
	public static void method767() {
		@Pc(7) int local7 = Static60.anInt1307;
		@Pc(9) int local9 = Static96.anInt2211;
		@Pc(11) int local11 = Static303.anInt6021;
		@Pc(13) int local13 = Static175.anInt266;
		if (Static294.aBoolean367) {
			Static156.method2537(local9, local11, local7, local13, 6116423);
			Static156.method2537(local9 + 1, local11 + 1, local7 - 2, 16, 0);
			Static156.method2540(local9 + 1, local11 + 18, local7 - 2, local13 + -19, 0);
		} else {
			Static231.method3630(local9, local11, local7, local13, 6116423);
			Static231.method3630(local9 + 1, local11 + 1, local7 - 2, 16, 0);
			Static231.method3626(local9 + 1, local11 + 18, local7 - 2, local13 + -19, 0);
		}
		Static176.aClass1_Sub3_Sub5_2.method3503(Static8.aString19, local9 + 3, local11 + 14, 6116423, -1);
		@Pc(101) int local101 = Static89.anInt5974;
		@Pc(103) int local103 = Static289.anInt5816;
		for (@Pc(105) int local105 = 0; local105 < Static181.anInt3973; local105++) {
			@Pc(120) int local120 = (Static181.anInt3973 - local105 - 1) * 15 + local11 + 31;
			@Pc(122) int local122 = 16777215;
			if (local9 < local101 && local7 + local9 > local101 && local103 > local120 - 13 && local103 < local120 + 3) {
				local122 = 16776960;
			}
			Static176.aClass1_Sub3_Sub5_2.method3503(Static56.method1051(local105), local9 + 3, local120, local122, 0);
		}
		Static163.method2578(Static96.anInt2211, Static60.anInt1307, Static175.anInt266, Static303.anInt6021);
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)V")
	public static void method769() {
		@Pc(13) Container local13;
		if (Static229.aFrame1 != null) {
			local13 = Static229.aFrame1;
		} else if (Static280.aFrame2 == null) {
			local13 = Static142.aClass112_2.anApplet1;
		} else {
			local13 = Static280.aFrame2;
		}
		Static163.anInt3557 = local13.getSize().width;
		Static7.anInt207 = local13.getSize().height;
		@Pc(36) Insets local36;
		if (local13 == Static280.aFrame2) {
			local36 = Static280.aFrame2.getInsets();
			Static7.anInt207 -= local36.bottom + local36.top;
			Static163.anInt3557 -= local36.left + local36.right;
		}
		if (Static217.method3458() < 2) {
			Static38.anInt950 = 765;
			Static69.anInt1438 = (Static163.anInt3557 - 765) / 2;
			Static270.anInt5412 = 503;
			Static146.anInt4438 = 0;
		} else {
			Static69.anInt1438 = 0;
			Static146.anInt4438 = 0;
			Static38.anInt950 = Static163.anInt3557;
			Static270.anInt5412 = Static7.anInt207;
		}
		if (Static294.aBoolean367) {
			Static294.method4504(Static38.anInt950, Static270.anInt5412);
		}
		Static108.aCanvas1.setSize(Static38.anInt950, Static270.anInt5412);
		if (Static280.aFrame2 == local13) {
			local36 = Static280.aFrame2.getInsets();
			Static108.aCanvas1.setLocation(Static69.anInt1438 + local36.left, Static146.anInt4438 + local36.top);
		} else {
			Static108.aCanvas1.setLocation(Static69.anInt1438, Static146.anInt4438);
		}
		if (anInt902 != -1) {
			Static210.method3373(true);
		}
		Static297.method4538();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public static void method770() {
		Static292.aClass89_49.method2266();
		Static54.aClass89_10.method2266();
		Static207.aClass89_30.method2266();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg7 + arg4 && arg4 < arg1 + arg5) {
			return arg3 < arg2 + arg0 && arg0 < arg3 + arg6;
		} else {
			return false;
		}
	}
}
