import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "Lclient!mq;")
	public static Class71 aClass71_8;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "Lclient!in;")
	public static final Class169 aClass169_141 = new Class169(53, 2);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static457.anInt8209 <= arg0 && Static407.anInt7583 >= arg1 && Static427.anInt7845 <= arg2 && arg4 <= Static631.anInt10922) {
			Static248.method4406(arg4, arg2, arg6, arg0, arg5, arg3, arg1);
		} else {
			Static189.method3643(arg1, arg3, arg0, arg6, arg5, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([Lclient!nfa;II)V")
	public static void method4859(@OriginalArg(0) Class15_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class15_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11023;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11023 > local27 + (local29 & 0x1)) {
				@Pc(44) Class15_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4859(arg0, arg1, local10 - 1);
		method4859(arg0, local10 + 1, arg2);
	}
}
