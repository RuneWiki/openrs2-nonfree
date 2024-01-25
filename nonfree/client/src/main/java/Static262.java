import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "Lclient!lp;")
	public static Class6_Sub8_Sub4 aClass6_Sub8_Sub4_8;

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lclient!ae;")
	public static Class8 aClass8_96;

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
	public static int anInt6203;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!lk;")
	public static Class209 aClass209_35 = new Class209(8);

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIILclient!jg;Lclient!jg;)V")
	public static void method5237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub4 arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4) {
		@Pc(4) Class351 local4 = Static31.method714(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub1_Sub4_2 = arg3;
		local4.aClass2_Sub1_Sub4_1 = arg4;
		@Pc(19) int local19 = Static289.aClass12Array3 == Static68.aClass12Array2 ? 1 : 0;
		if (!arg3.method8447()) {
			arg3.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local19];
			Static512.aClass2_Sub1Array4[local19] = arg3;
		} else if (arg3.method8446()) {
			arg3.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local19];
			Static643.aClass2_Sub1Array5[local19] = arg3;
		} else {
			arg3.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local19];
			Static229.aClass2_Sub1Array2[local19] = arg3;
			Static119.aBoolean126 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8447()) {
			if (arg4.method8446()) {
				arg4.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local19];
				Static643.aClass2_Sub1Array5[local19] = arg4;
				return;
			}
			arg4.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local19];
			Static229.aClass2_Sub1Array2[local19] = arg4;
			Static119.aBoolean126 = true;
			return;
		}
		arg4.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local19];
		Static512.aClass2_Sub1Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)[Lclient!ada;")
	public static Class7[] method5239() {
		return new Class7[] { Class2_Sub1_Sub4_Sub1.lb, Static656.aClass7_12, Static513.aClass7_10 };
	}
}
