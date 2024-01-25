import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!md;")
	public static Class89 aClass89_5;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt7349 = 0;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!cv;")
	public static final Class51 aClass51_37 = new Class51(512);

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
	public static final int[] anIntArray554 = new int[1000];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
	public static void method5668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static370.method5894(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static283.anIntArrayArray30[arg4];
		@Pc(56) int local56 = arg2 - local15;
		@Pc(61) int local61 = arg2 + local15;
		Static23.method323(local40, arg2 - arg3, arg5, local56);
		Static23.method323(local40, local56, arg0, local61);
		Static23.method323(local40, local61, arg5, arg2 + arg3);
		while (local24 > local10) {
			local36 += 2;
			local34 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static304.anIntArray394[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(134) int[] local134;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local15 <= local24) {
					local134 = Static283.anIntArrayArray30[local24 + arg4];
					local141 = Static283.anIntArrayArray30[arg4 - local24];
					local145 = arg2 + local10;
					local150 = arg2 - local10;
					Static23.method323(local134, local150, arg5, local145);
					Static23.method323(local141, local150, arg5, local145);
				} else {
					local134 = Static283.anIntArrayArray30[local24 + arg4];
					local141 = Static283.anIntArrayArray30[arg4 - local24];
					local145 = Static304.anIntArray394[local24];
					local150 = local10 + arg2;
					local190 = arg2 - local10;
					local194 = local145 + arg2;
					local198 = arg2 - local145;
					Static23.method323(local134, local190, arg5, local198);
					Static23.method323(local134, local198, arg0, local194);
					Static23.method323(local134, local194, arg5, local150);
					Static23.method323(local141, local190, arg5, local198);
					Static23.method323(local141, local198, arg0, local194);
					Static23.method323(local141, local194, arg5, local150);
				}
			}
			local134 = Static283.anIntArrayArray30[local10 + arg4];
			local141 = Static283.anIntArrayArray30[arg4 - local10];
			local145 = arg2 + local24;
			local150 = arg2 - local24;
			if (local15 > local10) {
				local190 = local29 >= local10 ? local29 : Static304.anIntArray394[local10];
				local194 = arg2 + local190;
				local198 = arg2 - local190;
				Static23.method323(local134, local150, arg5, local198);
				Static23.method323(local134, local198, arg0, local194);
				Static23.method323(local134, local194, arg5, local145);
				Static23.method323(local141, local150, arg5, local198);
				Static23.method323(local141, local198, arg0, local194);
				Static23.method323(local141, local194, arg5, local145);
			} else {
				Static23.method323(local134, local150, arg5, local145);
				Static23.method323(local141, local150, arg5, local145);
			}
		}
	}
}
