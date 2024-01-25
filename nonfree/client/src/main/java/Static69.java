import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public static int anInt1297 = 0;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "[Lclient!jm;")
	public static final Class111[] aClass111Array1 = new Class111[14];

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public static int anInt1301 = 0;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public static void method1038() {
		Static85.aClass129_2.method4955(Static106.anInt1978, Static117.aBoolean145 ? Static79.anInt5258 + 256 : -1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ms;)V")
	public static void method1039(@OriginalArg(1) Class137 arg0) {
		if (Static62.anInt1150 == arg0.anInt4045) {
			Static292.aBooleanArray22[arg0.anInt4047] = true;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I")
	public static int method1040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static245.method5576(arg0 + 91923, arg1 + 45365, 4) + (Static245.method5576(arg0 + 37821, arg1 - -10294, 2) - 128 >> 1) + (Static245.method5576(arg0, arg1, 1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
	public static void method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass67_Sub4_1 != null) {
			local7.aClass67_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)V")
	public static void method1045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static61.method917(Static240.anInt4829, arg1, Static166.anInt3315);
		@Pc(17) int local17 = Static61.method917(Static240.anInt4829, arg5, Static166.anInt3315);
		@Pc(23) int local23 = Static61.method917(Static280.anInt212, arg3, Static346.anInt6607);
		@Pc(29) int local29 = Static61.method917(Static280.anInt212, arg4, Static346.anInt6607);
		@Pc(37) int local37 = Static61.method917(Static240.anInt4829, arg1 + arg2, Static166.anInt3315);
		@Pc(45) int local45 = Static61.method917(Static240.anInt4829, arg5 - arg2, Static166.anInt3315);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static224.method5303(Static73.anIntArrayArray6[local47], local29, arg0, local23);
		}
		for (@Pc(67) int local67 = local17; local67 > local45; local67--) {
			Static224.method5303(Static73.anIntArrayArray6[local67], local29, arg0, local23);
		}
		@Pc(89) int local89 = Static61.method917(Static280.anInt212, arg2 + arg3, Static346.anInt6607);
		@Pc(100) int local100 = Static61.method917(Static280.anInt212, arg4 - arg2, Static346.anInt6607);
		for (@Pc(102) int local102 = local37; local102 <= local45; local102++) {
			@Pc(108) int[] local108 = Static73.anIntArrayArray6[local102];
			Static224.method5303(local108, local89, arg0, local23);
			Static224.method5303(local108, local29, arg0, local100);
		}
	}
}
