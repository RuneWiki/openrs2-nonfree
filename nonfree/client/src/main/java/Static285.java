import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILclient!ao;Lclient!ao;)V")
	public static void method4818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1 arg3, @OriginalArg(4) Class15_Sub1 arg4) {
		@Pc(4) Class37 local4 = Static464.method6477(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass15_Sub1_3 = arg3;
			local4.aClass15_Sub1_2 = arg4;
		}
	}
}
