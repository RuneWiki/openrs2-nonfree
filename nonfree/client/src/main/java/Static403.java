import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_140 = new Class119(1, -1);

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public static int anInt6665 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIZI)V")
	public static void method5199(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg3 + arg5) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) Class117_Sub1 local28 = Static57.aClass117_Sub1Array3[local22];
		Static57.aClass117_Sub1Array3[local22] = Static57.aClass117_Sub1Array3[arg5];
		Static57.aClass117_Sub1Array3[arg5] = local28;
		for (@Pc(40) int local40 = arg3; local40 < arg5; local40++) {
			if (Static328.method4428(arg1, Static57.aClass117_Sub1Array3[local40], arg0, arg4, arg2, local28) <= 0) {
				@Pc(61) Class117_Sub1 local61 = Static57.aClass117_Sub1Array3[local40];
				Static57.aClass117_Sub1Array3[local40] = Static57.aClass117_Sub1Array3[local24];
				Static57.aClass117_Sub1Array3[local24++] = local61;
			}
		}
		Static57.aClass117_Sub1Array3[arg5] = Static57.aClass117_Sub1Array3[local24];
		Static57.aClass117_Sub1Array3[local24] = local28;
		method5199(arg0, arg1, arg2, arg3, arg4, local24 - 1);
		method5199(arg0, arg1, arg2, local24 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!mq;I)V")
	public static void method5202(@OriginalArg(0) Class156 arg0) {
		if (arg0.anInt4794 != Static307.anInt5463) {
			return;
		}
		if (Static379.aClass7_Sub2_Sub3_Sub2_2.aString36 == null) {
			arg0.anInt4815 = 0;
			arg0.anInt4816 = 0;
			return;
		}
		arg0.anInt4817 = 150;
		arg0.anInt4873 = (int) (Math.sin((double) Static253.anInt4787 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4816 = Static319.anInt1936;
		arg0.anInt4832 = 5;
		arg0.anInt4815 = Static48.method867(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36);
		arg0.anInt4860 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4350;
		arg0.anInt4851 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4355;
		arg0.lb = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4389;
		arg0.anInt4795 = 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI[BIII)V")
	public static void method5206(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		arg2 += arg0;
		@Pc(24) int local24 = arg3 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg2 = local39 + 1;
			arg1[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZB)V")
	public static void method5213(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static164.anInt3376++;
			Static300.method4232();
		}
		if (arg1) {
			Static231.anInt4308++;
			Static352.method4671();
		}
	}
}
