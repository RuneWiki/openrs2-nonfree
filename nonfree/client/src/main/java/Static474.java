import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public static int anInt7600 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z")
	public static boolean method6404(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIBIII)V")
	public static void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static70.method967(arg1);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg1;
		@Pc(23) int local23 = -arg1;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(44) int[] local44 = Static543.anIntArrayArray57[arg2];
		@Pc(49) int local49 = arg3 - local14;
		@Pc(53) int local53 = local14 + arg3;
		Static134.method1841(local44, arg3 - arg1, local49, arg5);
		Static134.method1841(local44, local49, local53, arg4);
		Static134.method1841(local44, local53, arg1 + arg3, arg5);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local23 += local30;
			local28 += local32;
			if (local28 >= 0 && local25 >= 1) {
				Static486.anIntArray563[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(122) int[] local122;
			@Pc(129) int[] local129;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local14 <= local20) {
					local122 = Static543.anIntArrayArray57[local20 + arg2];
					local129 = Static543.anIntArrayArray57[arg2 - local20];
					local133 = local10 + arg3;
					local138 = arg3 - local10;
					Static134.method1841(local122, local138, local133, arg5);
					Static134.method1841(local129, local138, local133, arg5);
				} else {
					local122 = Static543.anIntArrayArray57[arg2 + local20];
					local129 = Static543.anIntArrayArray57[arg2 - local20];
					local133 = Static486.anIntArray563[local20];
					local138 = arg3 + local10;
					local180 = arg3 - local10;
					local185 = arg3 + local133;
					local190 = arg3 - local133;
					Static134.method1841(local122, local180, local190, arg5);
					Static134.method1841(local122, local190, local185, arg4);
					Static134.method1841(local122, local185, local138, arg5);
					Static134.method1841(local129, local180, local190, arg5);
					Static134.method1841(local129, local190, local185, arg4);
					Static134.method1841(local129, local185, local138, arg5);
				}
			}
			local122 = Static543.anIntArrayArray57[local10 + arg2];
			local129 = Static543.anIntArrayArray57[arg2 - local10];
			local133 = arg3 + local20;
			local138 = arg3 - local20;
			if (local10 < local14) {
				local180 = local10 > local25 ? Static486.anIntArray563[local10] : local25;
				local185 = local180 + arg3;
				local190 = arg3 - local180;
				Static134.method1841(local122, local138, local190, arg5);
				Static134.method1841(local122, local190, local185, arg4);
				Static134.method1841(local122, local185, local133, arg5);
				Static134.method1841(local129, local138, local190, arg5);
				Static134.method1841(local129, local190, local185, arg4);
				Static134.method1841(local129, local185, local133, arg5);
			} else {
				Static134.method1841(local122, local138, local133, arg5);
				Static134.method1841(local129, local138, local133, arg5);
			}
		}
	}
}
