import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!ng;)V")
	public static void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub5 arg3) {
		@Pc(4) Class97 local4 = Static635.method8388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub5_1 = arg3;
		@Pc(16) int local16 = Static195.aClass199Array1 == Static510.aClass199Array3 ? 1 : 0;
		if (arg3.method9021()) {
			if (arg3.method9023()) {
				arg3.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local16];
				Static311.aClass20_Sub2Array11[local16] = arg3;
				return;
			}
			arg3.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local16];
			Static158.aClass20_Sub2Array7[local16] = arg3;
			Static133.aBoolean183 = true;
			return;
		}
		arg3.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local16];
		Static411.aClass20_Sub2Array12[local16] = arg3;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8921(@OriginalArg(0) Class100 arg0) {
		Static171.aClass52Array1 = new Class52[Static369.anIntArray417.length];
		for (@Pc(11) int local11 = 0; local11 < Static369.anIntArray417.length; local11++) {
			@Pc(17) int local17 = Static369.anIntArray417[local11];
			@Pc(22) Class133 local22 = Static308.method5208(local17, Static409.aClass353_74);
			@Pc(30) Class50 local30 = arg0.method8808(local22, Static651.method2403(Static375.aClass353_61, local17));
			Static171.aClass52Array1[local11] = new Class52(local30, local22);
		}
	}

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "(I)V")
	public static void method8924() {
		if (!Static280.aBoolean380) {
			return;
		}
		@Pc(11) Class302 local11 = Static110.method1816(Static30.anInt4466, Static453.anInt8081);
		if (local11 != null && local11.anObjectArray26 != null) {
			@Pc(20) Class6_Sub10 local20 = new Class6_Sub10();
			local20.aClass302_14 = local11;
			local20.anObjectArray1 = local11.anObjectArray26;
			Static244.method4193(local20);
		}
		Static351.anInt6586 = -1;
		Static133.anInt2549 = -1;
		Static280.aBoolean380 = false;
		if (local11 != null) {
			Static603.method8464(local11);
		}
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(B)V")
	public static void method8933() {
		Static117.aClass100_5.method8850(Static503.aClass154_8);
		Static117.aClass100_5.DA(Static182.anInt3752, Static195.anInt3963, Static477.anInt8313, Static34.anInt5144);
	}
}
