import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_94 = new Class77(39, -1);

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	public static int anInt3672 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ms;Z)V")
	public static void method3340(@OriginalArg(0) Class155 arg0) {
		if (!Static68.aBoolean110) {
			return;
		}
		Static19.method552(Static155.aClass41_79);
		Static39.aClass2_Sub13_Sub2_4.method4218(arg0.anInt4166);
		Static39.aClass2_Sub13_Sub2_4.method4190(Static206.anInt3826);
		Static39.aClass2_Sub13_Sub2_4.method4199(arg0.anInt4135);
		Static39.aClass2_Sub13_Sub2_4.method4199(Static106.anInt2069);
		Static39.aClass2_Sub13_Sub2_4.method4218(Static54.anInt1110);
		Static39.aClass2_Sub13_Sub2_4.method4212(arg0.anInt4212);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public static void method3341() {
		if (Static251.anInt4517 == 5) {
			Static251.anInt4517 = 6;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method3342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg0 == arg5 && arg7 == arg2 && arg6 == arg1) {
			Static160.method2671(arg4, arg0, arg8, arg1, arg7);
			return;
		}
		@Pc(37) int local37 = arg4;
		@Pc(39) int local39 = arg0;
		@Pc(43) int local43 = arg4 * 3;
		@Pc(47) int local47 = arg0 * 3;
		@Pc(51) int local51 = arg3 * 3;
		@Pc(55) int local55 = arg5 * 3;
		@Pc(59) int local59 = arg2 * 3;
		@Pc(63) int local63 = arg6 * 3;
		@Pc(73) int local73 = local51 + arg7 - local59 - arg4;
		@Pc(82) int local82 = local55 + arg1 - arg0 - local63;
		@Pc(91) int local91 = local43 + local59 - local51 - local51;
		@Pc(101) int local101 = local63 + local47 - local55 - local55;
		@Pc(105) int local105 = local51 - local43;
		@Pc(109) int local109 = local55 - local47;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local73 * local125;
			@Pc(133) int local133 = local125 * local82;
			@Pc(137) int local137 = local91 * local119;
			@Pc(141) int local141 = local119 * local101;
			@Pc(145) int local145 = local105 * local111;
			@Pc(149) int local149 = local111 * local109;
			@Pc(159) int local159 = (local145 + local129 + local137 >> 12) + arg4;
			@Pc(170) int local170 = arg0 + (local141 + local133 + local149 >> 12);
			Static160.method2671(local37, local39, arg8, local170, local159);
			local39 = local170;
			local37 = local159;
		}
	}
}
