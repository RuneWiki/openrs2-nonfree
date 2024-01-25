import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!op", name = "Q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_141 = new Class136(24, -1);

	@OriginalMember(owner = "client!op", name = "R", descriptor = "I")
	public static int anInt5227 = 0;

	@OriginalMember(owner = "client!op", name = "S", descriptor = "[I")
	public static final int[] anIntArray331 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!op", name = "U", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(III)Z")
	public static boolean method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static234.anInt4001; local1++) {
			@Pc(6) Class103 local6 = Static368.aClass103Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2961 == 1) {
				local15 = local6.anInt2963 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2962 + (local6.anInt2958 * local15 >> 8);
					local37 = local6.anInt2960 + (local6.anInt2957 * local15 >> 8);
					local47 = local6.anInt2954 + (local6.anInt2956 * local15 >> 8);
					local57 = local6.anInt2967 + (local6.anInt2968 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2961 == 2) {
				local15 = arg0 - local6.anInt2963;
				if (local15 > 0) {
					local27 = local6.anInt2962 + (local6.anInt2958 * local15 >> 8);
					local37 = local6.anInt2960 + (local6.anInt2957 * local15 >> 8);
					local47 = local6.anInt2954 + (local6.anInt2956 * local15 >> 8);
					local57 = local6.anInt2967 + (local6.anInt2968 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2961 == 3) {
				local15 = local6.anInt2962 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2963 + (local6.anInt2966 * local15 >> 8);
					local37 = local6.anInt2964 + (local6.anInt2959 * local15 >> 8);
					local47 = local6.anInt2954 + (local6.anInt2956 * local15 >> 8);
					local57 = local6.anInt2967 + (local6.anInt2968 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2961 == 4) {
				local15 = arg2 - local6.anInt2962;
				if (local15 > 0) {
					local27 = local6.anInt2963 + (local6.anInt2966 * local15 >> 8);
					local37 = local6.anInt2964 + (local6.anInt2959 * local15 >> 8);
					local47 = local6.anInt2954 + (local6.anInt2956 * local15 >> 8);
					local57 = local6.anInt2967 + (local6.anInt2968 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2961 == 5) {
				local15 = arg1 - local6.anInt2954;
				if (local15 > 0) {
					local27 = local6.anInt2963 + (local6.anInt2966 * local15 >> 8);
					local37 = local6.anInt2964 + (local6.anInt2959 * local15 >> 8);
					local47 = local6.anInt2962 + (local6.anInt2958 * local15 >> 8);
					local57 = local6.anInt2960 + (local6.anInt2957 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
	public static void method4312() {
		if (Static413.aClass167_11.method5978()) {
			Static413.aClass167_11.method5968(Static151.aCanvas2);
			Static337.method4680();
			Static413.aClass167_11.method5959(Static151.aCanvas2);
			Static413.aClass167_11.method6023(Static151.aCanvas2);
		} else {
			Static299.method4264(Static402.anInt6656);
		}
		Static174.method2784();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(IIIIIII)V")
	public static void method4313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg0);
		@Pc(19) int local19 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg3);
		@Pc(25) int local25 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg4);
		@Pc(34) int local34 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg1);
		@Pc(42) int local42 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg0 + arg5);
		@Pc(53) int local53 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg3 - arg5);
		for (@Pc(55) int local55 = local11; local55 < local42; local55++) {
			Static201.method3084(Static296.anIntArrayArray42[local55], local25, local34, arg2);
		}
		for (@Pc(71) int local71 = local19; local71 > local53; local71--) {
			Static201.method3084(Static296.anIntArrayArray42[local71], local25, local34, arg2);
		}
		@Pc(93) int local93 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5 + arg4);
		@Pc(101) int local101 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg1 - arg5);
		for (@Pc(103) int local103 = local42; local103 <= local53; local103++) {
			@Pc(109) int[] local109 = Static296.anIntArrayArray42[local103];
			Static201.method3084(local109, local25, local93, arg2);
			Static201.method3084(local109, local101, local34, arg2);
		}
	}
}
