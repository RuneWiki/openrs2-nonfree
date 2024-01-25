import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_118 = new Class136(92, 5);

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
	public static final int[] anIntArray397 = new int[3];

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public static int anInt5495 = 2;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(FI)F")
	public static float method4942(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static616.method8512(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(28) int local28 = arg1;
		@Pc(31) int local31 = -arg1;
		@Pc(33) int local33 = local15;
		@Pc(36) int local36 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(67) int local67;
		@Pc(78) int local78;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (Static304.anInt4824 <= arg2 && Static231.anInt3977 >= arg2) {
			@Pc(56) int[] local56 = Static267.anIntArrayArray20[arg2];
			local67 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - arg1);
			local78 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 + arg1);
			local89 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - local15);
			local99 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local15 + arg4);
			Static260.method3979(arg0, local67, local56, local89);
			Static260.method3979(arg5, local89, local56, local99);
			Static260.method3979(arg0, local99, local56, local78);
		}
		@Pc(119) int local119 = -1;
		while (local10 < local28) {
			local119 += 2;
			local38 += 2;
			local31 += local38;
			local36 += local119;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				Static23.anIntArray36[local33] = local10;
				local36 -= local33 << 1;
			}
			local10++;
			@Pc(265) int local265;
			@Pc(274) int local274;
			@Pc(281) int[] local281;
			@Pc(170) int local170;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				local170 = arg2 - local28;
				local67 = arg2 + local28;
				if (local67 >= Static304.anInt4824 && Static231.anInt3977 >= local170) {
					if (local15 <= local28) {
						local78 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 + local10);
						local89 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - local10);
						if (Static231.anInt3977 >= local67) {
							Static260.method3979(arg0, local89, Static267.anIntArrayArray20[local67], local78);
						}
						if (local170 >= Static304.anInt4824) {
							Static260.method3979(arg0, local89, Static267.anIntArrayArray20[local170], local78);
						}
					} else {
						local78 = Static23.anIntArray36[local28];
						local89 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local10 + arg4);
						local99 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - local10);
						local265 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local78 + arg4);
						local274 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - local78);
						if (local67 <= Static231.anInt3977) {
							local281 = Static267.anIntArrayArray20[local67];
							Static260.method3979(arg0, local99, local281, local274);
							Static260.method3979(arg5, local274, local281, local265);
							Static260.method3979(arg0, local265, local281, local89);
						}
						if (local170 >= Static304.anInt4824) {
							local281 = Static267.anIntArrayArray20[local170];
							Static260.method3979(arg0, local99, local281, local274);
							Static260.method3979(arg5, local274, local281, local265);
							Static260.method3979(arg0, local265, local281, local89);
						}
					}
				}
			}
			local170 = arg2 - local10;
			local67 = local10 + arg2;
			if (local67 >= Static304.anInt4824 && Static231.anInt3977 >= local170) {
				local78 = arg4 + local28;
				local89 = arg4 - local28;
				if (local78 >= Static514.anInt8603 && Static487.anInt8320 >= local89) {
					local78 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local78);
					local89 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local89);
					if (local15 <= local10) {
						if (local67 <= Static231.anInt3977) {
							Static260.method3979(arg0, local89, Static267.anIntArrayArray20[local67], local78);
						}
						if (local170 >= Static304.anInt4824) {
							Static260.method3979(arg0, local89, Static267.anIntArrayArray20[local170], local78);
						}
					} else {
						local99 = local33 < local10 ? Static23.anIntArray36[local10] : local33;
						local265 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 + local99);
						local274 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg4 - local99);
						if (local67 <= Static231.anInt3977) {
							local281 = Static267.anIntArrayArray20[local67];
							Static260.method3979(arg0, local89, local281, local274);
							Static260.method3979(arg5, local274, local281, local265);
							Static260.method3979(arg0, local265, local281, local78);
						}
						if (local170 >= Static304.anInt4824) {
							local281 = Static267.anIntArrayArray20[local170];
							Static260.method3979(arg0, local89, local281, local274);
							Static260.method3979(arg5, local274, local281, local265);
							Static260.method3979(arg0, local265, local281, local78);
						}
					}
				}
			}
		}
	}
}
