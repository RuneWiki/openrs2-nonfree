import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mha", name = "s", descriptor = "Lclient!qa;")
	public static Class109 aClass109_5;

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "Lclient!lga;")
	public static Class223 aClass223_78;

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
	public static int anInt6281;

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "Lclient!lga;")
	public static Class223 aClass223_79;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
	public static int anInt6283;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
	public static int anInt6284;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBI)Z")
	public static boolean method5634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static143.method439(arg2);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg2 - arg4;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(43) int local43 = -1;
		@Pc(47) int[] local47 = Static36.anIntArrayArray4[arg3];
		@Pc(52) int local52 = arg5 - local17;
		@Pc(56) int local56 = arg5 + local17;
		Static367.method5559(-7, arg5 - arg2, arg0, local47, local52);
		Static367.method5559(-7, local52, arg1, local47, local56);
		Static367.method5559(-7, local56, arg0, local47, arg5 + arg2);
		while (local26 > local12) {
			local36 += 2;
			local43 += 2;
			local34 += local43;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static318.anIntArray319[local31] = local12;
				local31--;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(130) int[] local130;
			@Pc(137) int[] local137;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(192) int local192;
			if (local29 >= 0) {
				local26--;
				if (local17 <= local26) {
					local130 = Static36.anIntArrayArray4[arg3 + local26];
					local137 = Static36.anIntArrayArray4[arg3 - local26];
					local141 = arg5 + local12;
					local145 = arg5 - local12;
					Static367.method5559(-7, local145, arg0, local130, local141);
					Static367.method5559(-7, local145, arg0, local137, local141);
				} else {
					local130 = Static36.anIntArrayArray4[local26 + arg3];
					local137 = Static36.anIntArrayArray4[arg3 - local26];
					local141 = Static318.anIntArray319[local26];
					local145 = local12 + arg5;
					local184 = arg5 - local12;
					local188 = local141 + arg5;
					local192 = arg5 - local141;
					Static367.method5559(-7, local184, arg0, local130, local192);
					Static367.method5559(-7, local192, arg1, local130, local188);
					Static367.method5559(-7, local188, arg0, local130, local145);
					Static367.method5559(-7, local184, arg0, local137, local192);
					Static367.method5559(-7, local192, arg1, local137, local188);
					Static367.method5559(-7, local188, arg0, local137, local145);
				}
				local29 -= local26 << 1;
			}
			local130 = Static36.anIntArrayArray4[arg3 + local12];
			local137 = Static36.anIntArrayArray4[arg3 - local12];
			local141 = local26 + arg5;
			local145 = arg5 - local26;
			if (local17 <= local12) {
				Static367.method5559(-7, local145, arg0, local130, local141);
				Static367.method5559(-7, local145, arg0, local137, local141);
			} else {
				local184 = local31 >= local12 ? local31 : Static318.anIntArray319[local12];
				local188 = arg5 + local184;
				local192 = arg5 - local184;
				Static367.method5559(-7, local145, arg0, local130, local192);
				Static367.method5559(-7, local192, arg1, local130, local188);
				Static367.method5559(-7, local188, arg0, local130, local141);
				Static367.method5559(-7, local145, arg0, local137, local192);
				Static367.method5559(-7, local192, arg1, local137, local188);
				Static367.method5559(-7, local188, arg0, local137, local141);
			}
		}
	}
}
