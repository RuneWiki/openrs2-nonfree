import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!vt", name = "Gb", descriptor = "I")
	public static int anInt10189;

	@OriginalMember(owner = "client!vt", name = "Lb", descriptor = "I")
	public static int anInt10193;

	@OriginalMember(owner = "client!vt", name = "Sb", descriptor = "Lclient!pga;")
	public static Class32 aClass32_40;

	@OriginalMember(owner = "client!vt", name = "Ub", descriptor = "Lclient!om;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!vt", name = "Zb", descriptor = "I")
	public static int anInt10205 = 1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([SI)[S")
	public static short[] method8623(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static655.method5834(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILclient!ica;Lclient!ica;)V")
	public static void method8628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub3 arg3, @OriginalArg(4) Class20_Sub2_Sub3 arg4) {
		@Pc(4) Class97 local4 = Static635.method8388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub3_2 = arg3;
		local4.aClass20_Sub2_Sub3_1 = arg4;
		@Pc(19) int local19 = Static195.aClass199Array1 == Static510.aClass199Array3 ? 1 : 0;
		if (!arg3.method9021()) {
			arg3.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local19];
			Static411.aClass20_Sub2Array12[local19] = arg3;
		} else if (arg3.method9023()) {
			arg3.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local19];
			Static311.aClass20_Sub2Array11[local19] = arg3;
		} else {
			arg3.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local19];
			Static158.aClass20_Sub2Array7[local19] = arg3;
			Static133.aBoolean183 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9021()) {
			if (arg4.method9023()) {
				arg4.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local19];
				Static311.aClass20_Sub2Array11[local19] = arg4;
				return;
			}
			arg4.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local19];
			Static158.aClass20_Sub2Array7[local19] = arg4;
			Static133.aBoolean183 = true;
			return;
		}
		arg4.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local19];
		Static411.aClass20_Sub2Array12[local19] = arg4;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!rg;I)Lclient!ap;")
	public static Class22_Sub1 method8629(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(7) Class22 local7 = Static282.method4956(arg0);
		@Pc(11) int local11 = arg0.method8571();
		@Pc(15) int local15 = arg0.method8571();
		@Pc(19) int local19 = arg0.method8571();
		@Pc(23) int local23 = arg0.method8571();
		@Pc(27) int local27 = arg0.method8571();
		@Pc(36) int local36 = arg0.method8571();
		return new Class22_Sub1(local7.aClass238_9, local7.aClass79_14, local7.anInt5439, local7.anInt5436, local7.anInt5441, local7.anInt5435, local7.anInt5432, local7.anInt5438, local7.anInt5431, local11, local15, local19, local23, local27, local36);
	}
}
