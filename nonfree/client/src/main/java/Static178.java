import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt3426;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public static int anInt3427 = -2;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
	public static int[] anIntArray288 = new int[128];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)I")
	public static int method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Lclient!sg;")
	public static Class161 method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt5733; local13++) {
			@Pc(22) Class161 local22 = local7.aClass161Array3[local13];
			if ((local22.aLong171 >> 29 & 0x3L) == 2L && local22.anInt4641 == arg1 && local22.anInt4636 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method2965() {
		Static274.aClass66ArrayArray1 = new Class66[Static263.aClass121_117.method3137()][];
		Static83.aBooleanArray5 = new boolean[Static263.aClass121_117.method3137()];
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static170.anInt3350 + arg0 * Static83.anInt1651 >> 16;
		@Pc(19) int local19 = arg3 * Static83.anInt1651 - arg0 * Static170.anInt3350 >> 16;
		@Pc(29) int local29 = arg1 * Static163.anInt3252 + local19 * Static165.anInt3265 >> 16;
		@Pc(39) int local39 = arg1 * Static165.anInt3265 - local19 * Static163.anInt3252 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static163.anInt3252 + local19 * Static165.anInt3265 >> 16;
		@Pc(76) int local76 = arg2 * Static165.anInt3265 - local19 * Static163.anInt3252 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static280.anInt5070 && local87 < Static280.anInt5070) {
			return false;
		} else if (local50 > Static130.anInt2601 && local87 > Static130.anInt2601) {
			return false;
		} else if (local56 < Static126.anInt1742 && local93 < Static126.anInt1742) {
			return false;
		} else {
			return local56 <= Static187.anInt3579 || local93 <= Static187.anInt3579;
		}
	}
}
