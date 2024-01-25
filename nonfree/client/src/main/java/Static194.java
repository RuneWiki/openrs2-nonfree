import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array9;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
	public static void method3520() {
		Static195.anInt4052 = 0;
		@Pc(17) int local17 = (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9) + Static39.anInt4952;
		@Pc(24) int local24 = Static138.anInt3088 + (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static195.anInt4052 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static195.anInt4052 = 1;
		}
		if (Static195.anInt4052 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static195.anInt4052 = 0;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIII)V")
	public static void method3521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 + arg1;
		@Pc(15) int local15 = arg5 - arg1;
		for (@Pc(17) int local17 = arg3; local17 < local10; local17++) {
			Static208.method3687(arg2, arg0, Static454.anIntArrayArray71[local17], arg4);
		}
		for (@Pc(37) int local37 = arg5; local37 > local15; local37--) {
			Static208.method3687(arg2, arg0, Static454.anIntArrayArray71[local37], arg4);
		}
		@Pc(59) int local59 = arg1 + arg2;
		@Pc(69) int local69 = arg4 - arg1;
		for (@Pc(71) int local71 = local10; local71 <= local15; local71++) {
			@Pc(77) int[] local77 = Static454.anIntArrayArray71[local71];
			Static208.method3687(arg2, arg0, local77, local59);
			Static208.method3687(local69, arg0, local77, arg4);
		}
	}
}
