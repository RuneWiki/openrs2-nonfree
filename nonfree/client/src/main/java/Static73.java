import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "[I")
	public static final int[] anIntArray129 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLclient!lr;)V")
	public static void method1197(@OriginalArg(1) Class2_Sub7_Sub2 arg0) {
		arg0.method4495(Static277.aClass229_68.method4956());
		arg0.method4495(Static33.aClass229_8.method4956());
		arg0.method4495(Static248.aClass229_57.method4956());
		arg0.method4495(Static331.aClass229_80.method4956());
		arg0.method4495(Static48.aClass229_11.method4956());
		arg0.method4495(Static372.aClass229_89.method4956());
		arg0.method4495(Static106.aClass229_32.method4956());
		arg0.method4495(Static463.aClass229_106.method4956());
		arg0.method4495(Static241.aClass229_54.method4956());
		arg0.method4495(Static300.aClass229_70.method4956());
		arg0.method4495(Static16.aClass229_1.method4956());
		arg0.method4495(Static403.aClass229_125.method4956());
		arg0.method4495(Static399.aClass229_93.method4956());
		arg0.method4495(Static191.aClass229_45.method4956());
		arg0.method4495(Static391.aClass229_109.method4956());
		arg0.method4495(Static447.aClass229_105.method4956());
		arg0.method4495(Static72.aClass229_20.method4956());
		arg0.method4495(Static378.aClass229_90.method4956());
		arg0.method4495(Static187.aClass229_121.method4956());
		arg0.method4495(Static255.aClass229_62.method4956());
		arg0.method4495(Static309.aClass229_74.method4956());
		arg0.method4495(Static427.aClass229_97.method4956());
		arg0.method4495(Static402.aClass229_94.method4956());
		arg0.method4495(Static237.aClass229_52.method4956());
		arg0.method4495(Static579.aClass229_128.method4956());
		arg0.method4495(Static418.aClass229_96.method4956());
		arg0.method4495(Static572.aClass229_126.method4956());
		arg0.method4495(Static367.aClass229_88.method4956());
		arg0.method4495(Static466.aClass229_107.method4956());
		arg0.method4495(Static340.aClass229_83.method4956());
		arg0.method4495(Static248.aClass229_58.method4956());
		arg0.method4495(Static49.aClass229_31.method4956());
		arg0.method4495(Static331.method4763());
		arg0.method4495(Static207.method2570());
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([Lclient!caa;II)V")
	public static void method1200(@OriginalArg(0) Class12_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class12_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9377;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9377 > local27 + (local29 & 0x1)) {
				@Pc(44) Class12_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method1200(arg0, arg1, local10 - 1);
		method1200(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZIIIII)V")
	public static void method1204(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg2) / 2;
		@Pc(16) int local16 = arg5;
		@Pc(20) Class86_Sub1 local20 = Static495.aClass86_Sub1Array2[local14];
		Static495.aClass86_Sub1Array2[local14] = Static495.aClass86_Sub1Array2[arg2];
		Static495.aClass86_Sub1Array2[arg2] = local20;
		for (@Pc(32) int local32 = arg5; local32 < arg2; local32++) {
			if (Static310.method4444(local20, Static495.aClass86_Sub1Array2[local32], arg1, arg4, arg3, arg0) <= 0) {
				@Pc(52) Class86_Sub1 local52 = Static495.aClass86_Sub1Array2[local32];
				Static495.aClass86_Sub1Array2[local32] = Static495.aClass86_Sub1Array2[local16];
				Static495.aClass86_Sub1Array2[local16++] = local52;
			}
		}
		Static495.aClass86_Sub1Array2[arg2] = Static495.aClass86_Sub1Array2[local16];
		Static495.aClass86_Sub1Array2[local16] = local20;
		method1204(arg0, arg1, local16 - 1, arg3, arg4, arg5);
		method1204(arg0, arg1, arg2, arg3, arg4, local16 + 1);
	}
}
