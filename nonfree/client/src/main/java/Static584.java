import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	public static int anInt9489;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
	public static final int[] anIntArray594 = new int[1000];

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "S")
	public static short aShort113 = 320;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIBI)V")
	public static void method8114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static578.method8088(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(42) int[] local42 = Static71.anIntArrayArray5[arg1];
		@Pc(46) int local46 = arg2 - local15;
		Static82.method1400(arg4, arg2 - arg3, local46, local42);
		@Pc(59) int local59 = arg2 + local15;
		Static82.method1400(arg0, local46, local59, local42);
		Static82.method1400(arg4, local59, arg3 + arg2, local42);
		while (local10 < local21) {
			local33 += 2;
			local31 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				Static100.anIntArray181[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(130) int[] local130;
			@Pc(135) int local135;
			@Pc(139) int local139;
			@Pc(179) int local179;
			@Pc(183) int local183;
			@Pc(188) int local188;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 >= local15) {
					local123 = Static71.anIntArrayArray5[local21 + arg1];
					local130 = Static71.anIntArrayArray5[arg1 - local21];
					local135 = arg2 + local10;
					local139 = arg2 - local10;
					Static82.method1400(arg4, local139, local135, local123);
					Static82.method1400(arg4, local139, local135, local130);
				} else {
					local123 = Static71.anIntArrayArray5[local21 + arg1];
					local130 = Static71.anIntArrayArray5[arg1 - local21];
					local135 = Static100.anIntArray181[local21];
					local139 = arg2 + local10;
					local179 = arg2 - local10;
					local183 = arg2 + local135;
					local188 = arg2 - local135;
					Static82.method1400(arg4, local179, local188, local123);
					Static82.method1400(arg0, local188, local183, local123);
					Static82.method1400(arg4, local183, local139, local123);
					Static82.method1400(arg4, local179, local188, local130);
					Static82.method1400(arg0, local188, local183, local130);
					Static82.method1400(arg4, local183, local139, local130);
				}
			}
			local123 = Static71.anIntArrayArray5[local10 + arg1];
			local130 = Static71.anIntArrayArray5[arg1 - local10];
			local135 = local21 + arg2;
			local139 = arg2 - local21;
			if (local10 >= local15) {
				Static82.method1400(arg4, local139, local135, local123);
				Static82.method1400(arg4, local139, local135, local130);
			} else {
				local179 = local10 > local26 ? Static100.anIntArray181[local10] : local26;
				local183 = local179 + arg2;
				local188 = arg2 - local179;
				Static82.method1400(arg4, local139, local188, local123);
				Static82.method1400(arg0, local188, local183, local123);
				Static82.method1400(arg4, local183, local135, local123);
				Static82.method1400(arg4, local139, local188, local130);
				Static82.method1400(arg0, local188, local183, local130);
				Static82.method1400(arg4, local183, local135, local130);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method8115(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class3_Sub27 local22 = Static59.method1040(Static325.aClass20_2, Static625.aClass314_145);
			local22.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg0));
			local22.aClass3_Sub9_Sub2_2.method5638(arg0);
			Static148.method2572(local22);
		}
	}
}
