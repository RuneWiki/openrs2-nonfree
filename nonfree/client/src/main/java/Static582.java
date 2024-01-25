import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_89 = new Class144(20, -1);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V")
	public static void method7516() {
		Static225.method3326();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILclient!jj;Lclient!ha;ILclient!jo;Lclient!pm;III)V")
	public static void method7517(@OriginalArg(1) Class193 arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class198 arg3, @OriginalArg(5) Class3_Sub48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg5 - arg7 / 2 - 5;
		@Pc(18) int local18 = arg6 + 2;
		if (arg3.anInt5132 != 0) {
			arg1.method9378(local18, local14, arg3.anInt5132, arg6 + arg2 * arg0.method4590() + 1 - local18, arg7 + 10);
		}
		if (arg3.anInt5144 != 0) {
			arg1.method9399(arg7 + 10, -local18 + 1 + arg6 + arg2 * arg0.method4590(), arg3.anInt5144, local14, local18);
		}
		@Pc(75) int local75 = arg3.anInt5147;
		if (arg4.aBoolean541 && arg3.anInt5142 != -1) {
			local75 = arg3.anInt5142;
		}
		for (@Pc(95) int local95 = 0; local95 < arg2; local95++) {
			@Pc(101) String local101 = Static486.aStringArray31[local95];
			if (arg2 - 1 > local95) {
				local101 = local101.substring(0, local101.length() - 4);
			}
			arg0.method4588(arg1, local101, arg5, arg6, local75);
			arg6 += arg0.method4590();
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(JJ)J")
	public static long method7519(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
