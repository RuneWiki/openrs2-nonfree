import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILclient!al;Lclient!al;)V")
	public static void method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1 arg3, @OriginalArg(4) Class15_Sub1 arg4) {
		@Pc(4) Class133 local4 = Static90.method4174(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass15_Sub1_2 = arg3;
			local4.aClass15_Sub1_1 = arg4;
		}
	}
}
