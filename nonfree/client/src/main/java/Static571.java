import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!or;")
	public static Class257 aClass257_2;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	public static int anInt9318;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_122 = new Class179(13, 2);

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(20) int local20 = arg2 - arg0;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + (1 - local60) * local32;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(120) int local120 = local40 * 3;
		@Pc(126) int local126 = local44 * (local56 - 3);
		@Pc(130) int local130 = local48 * 3;
		@Pc(136) int local136 = (local60 - 3) * local52;
		@Pc(138) int local138 = local103;
		@Pc(144) int local144 = local99 * (arg2 - 1);
		@Pc(146) int local146 = local111;
		@Pc(152) int local152 = (local20 - 1) * local107;
		@Pc(156) int[] local156 = Static543.anIntArrayArray57[arg1];
		Static134.method1841(local156, arg6 - arg5, -local16 + arg6, arg4);
		Static134.method1841(local156, arg6 - local16, local16 + arg6, arg3);
		Static134.method1841(local156, arg6 + local16, arg5 + arg6, arg4);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local138;
					local69 += local120;
					local138 += local103;
					local7++;
					local120 += local103;
				}
			}
			if (local201) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local146;
						local86 += local130;
						local146 += local111;
						local130 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local146;
					local86 += local130;
					local11++;
					local146 += local111;
					local130 += local111;
				}
				local86 += -local152;
				local95 += -local136;
				local152 -= local107;
				local136 -= local107;
			}
			if (local77 < 0) {
				local69 += local120;
				local77 += local138;
				local7++;
				local138 += local103;
				local120 += local103;
			}
			local69 += -local144;
			local77 += -local126;
			local144 -= local99;
			local9--;
			local126 -= local99;
			@Pc(341) int local341 = arg1 - local9;
			@Pc(345) int local345 = arg1 + local9;
			@Pc(349) int local349 = local7 + arg6;
			@Pc(354) int local354 = arg6 - local7;
			if (local201) {
				@Pc(360) int local360 = arg6 + local11;
				@Pc(365) int local365 = arg6 - local11;
				Static134.method1841(Static543.anIntArrayArray57[local341], local354, local365, arg4);
				Static134.method1841(Static543.anIntArrayArray57[local341], local365, local360, arg3);
				Static134.method1841(Static543.anIntArrayArray57[local341], local360, local349, arg4);
				Static134.method1841(Static543.anIntArrayArray57[local345], local354, local365, arg4);
				Static134.method1841(Static543.anIntArrayArray57[local345], local365, local360, arg3);
				Static134.method1841(Static543.anIntArrayArray57[local345], local360, local349, arg4);
			} else {
				Static134.method1841(Static543.anIntArrayArray57[local341], local354, local349, arg4);
				Static134.method1841(Static543.anIntArrayArray57[local345], local354, local349, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)Lclient!um;")
	public static Class99 method7828() {
		try {
			return new Class99_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class99) Class.forName("Class99_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class99_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIB)V")
	public static void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg1, 16);
		local8.method662();
		local8.anInt823 = arg0;
	}
}
