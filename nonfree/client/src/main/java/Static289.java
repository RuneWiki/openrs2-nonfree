import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Z")
	public static boolean aBoolean358;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Lclient!ns;")
	public static Class166 aClass166_205;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!si;")
	public static final Class217 aClass217_28 = new Class217(3, 5);

	@OriginalMember(owner = "client!om", name = "L", descriptor = "Lclient!si;")
	public static final Class217 aClass217_29 = new Class217(14, -1);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
	public static void method4025(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg1) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) long local30 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(44) Object local44 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local44;
		@Pc(64) int local64 = ~local30 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(66) int local66 = arg2; local66 < arg1; local66++) {
			if (arg0[local66] < (long) (local66 & local64) + local30) {
				@Pc(83) long local83 = arg0[local66];
				arg0[local66] = arg0[local26];
				arg0[local26] = local83;
				@Pc(97) Object local97 = arg3[local66];
				arg3[local66] = arg3[local26];
				arg3[local26++] = local97;
			}
		}
		arg0[arg1] = arg0[local26];
		arg0[local26] = local30;
		arg3[arg1] = arg3[local26];
		arg3[local26] = local44;
		method4025(arg0, local26 - 1, arg2, arg3);
		method4025(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ud;B)Z")
	public static boolean method4026(@OriginalArg(0) Class239 arg0) {
		return arg0 == Static6.aClass239_2 || arg0 == Static263.aClass239_5 || arg0 == Static124.aClass239_3 || Static3.aClass239_1 == arg0;
	}
}
