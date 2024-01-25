import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array12;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_72 = new Class160(72, 7);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public static void method2379() {
		if (Static588.anInterface11Array1 == null) {
			return;
		}
		@Pc(8) Interface11[] local8 = Static588.anInterface11Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(15) Interface11 local15 = local8[local10];
			local15.method5414();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!jc;)Lclient!wn;")
	public static Class395 method2381(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7695(105);
		@Pc(16) Class258 local16 = Static428.method6432()[arg0.method7695(96)];
		@Pc(23) Class205 local23 = Static43.method711()[arg0.method7695(104)];
		@Pc(27) int local27 = arg0.method7752();
		@Pc(33) int local33 = arg0.method7752();
		@Pc(37) int local37 = arg0.method7717(-1978450544);
		@Pc(41) int local41 = arg0.method7717(-1978450544);
		@Pc(45) int local45 = arg0.method7748();
		@Pc(49) int local49 = arg0.method7748();
		@Pc(53) int local53 = arg0.method7748();
		@Pc(67) boolean local67 = arg0.method7695(126) == 1;
		return new Class395(local7, local16, local23, local27, local33, local37, local41, local45, local49, local53, local67);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILclient!ef;)V")
	public static void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3_Sub2 arg3) {
		@Pc(4) Class89 local4 = Static289.method4810(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub3_Sub2_1 = arg3;
		@Pc(19) int local19 = Static258.aClass159Array1 == Static346.aClass159Array2 ? 1 : 0;
		if (arg3.method9489()) {
			if (arg3.method9476()) {
				arg3.aClass4_Sub3_25 = Static111.aClass4_Sub3Array2[local19];
				Static111.aClass4_Sub3Array2[local19] = arg3;
				return;
			}
			arg3.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local19];
			Static664.aClass4_Sub3Array5[local19] = arg3;
			Static282.aBoolean384 = true;
			return;
		}
		arg3.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local19];
		Static170.aClass4_Sub3Array3[local19] = arg3;
	}
}
