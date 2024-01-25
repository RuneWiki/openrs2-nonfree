import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public static int anInt2264;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	public static int anInt2283;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "[I")
	public static final int[] anIntArray288 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public static void method1853(@OriginalArg(1) int arg0) {
		if (Static306.anIntArray619 == null || arg0 > Static306.anIntArray619.length) {
			Static306.anIntArray619 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	public static void method1859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg1, 16);
		local8.method3004();
		local8.anInt3686 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
	public static void method1860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		method1853(arg3);
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg3 - arg1;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(27) int local27 = arg3;
		@Pc(30) int local30 = -arg3;
		@Pc(32) int local32 = local18;
		@Pc(35) int local35 = -local18;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static369.anIntArrayArray35[arg4];
		@Pc(48) int local48 = arg0 - local18;
		Static382.method5419(local43, arg0 - arg3, local48, arg5);
		@Pc(60) int local60 = arg0 + local18;
		Static382.method5419(local43, local48, local60, arg2);
		Static382.method5419(local43, local60, arg3 + arg0, arg5);
		while (local27 > local10) {
			local39 += 2;
			local37 += 2;
			local30 += local37;
			local35 += local39;
			if (local35 >= 0 && local32 >= 1) {
				Static306.anIntArray619[local32] = local10;
				local32--;
				local35 -= local32 << 1;
			}
			local10++;
			@Pc(118) int[] local118;
			@Pc(124) int[] local124;
			@Pc(128) int local128;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(140) int local140;
			@Pc(145) int local145;
			if (local30 >= 0) {
				local27--;
				if (local18 > local27) {
					local118 = Static369.anIntArrayArray35[arg4 + local27];
					local124 = Static369.anIntArrayArray35[arg4 - local27];
					local128 = Static306.anIntArray619[local27];
					local132 = local10 + arg0;
					local136 = arg0 - local10;
					local140 = local128 + arg0;
					local145 = arg0 - local128;
					Static382.method5419(local118, local136, local145, arg5);
					Static382.method5419(local118, local145, local140, arg2);
					Static382.method5419(local118, local140, local132, arg5);
					Static382.method5419(local124, local136, local145, arg5);
					Static382.method5419(local124, local145, local140, arg2);
					Static382.method5419(local124, local140, local132, arg5);
				} else {
					local118 = Static369.anIntArrayArray35[arg4 + local27];
					local124 = Static369.anIntArrayArray35[arg4 - local27];
					local128 = arg0 + local10;
					local132 = arg0 - local10;
					Static382.method5419(local118, local132, local128, arg5);
					Static382.method5419(local124, local132, local128, arg5);
				}
				local30 -= local27 << 1;
			}
			local118 = Static369.anIntArrayArray35[arg4 + local10];
			local124 = Static369.anIntArrayArray35[arg4 - local10];
			local128 = local27 + arg0;
			local132 = arg0 - local27;
			if (local10 >= local18) {
				Static382.method5419(local118, local132, local128, arg5);
				Static382.method5419(local124, local132, local128, arg5);
			} else {
				local136 = local32 >= local10 ? local32 : Static306.anIntArray619[local10];
				local140 = arg0 + local136;
				local145 = arg0 - local136;
				Static382.method5419(local118, local132, local145, arg5);
				Static382.method5419(local118, local145, local140, arg2);
				Static382.method5419(local118, local140, local128, arg5);
				Static382.method5419(local124, local132, local145, arg5);
				Static382.method5419(local124, local145, local140, arg2);
				Static382.method5419(local124, local140, local128, arg5);
			}
		}
	}
}
