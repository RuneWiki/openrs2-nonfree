import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILclient!ab;Lclient!ab;)V")
	public static void method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) Class3_Sub1 arg4) {
		@Pc(4) Class189 local4 = Static396.method5419(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub1_1 = arg3;
			local4.aClass3_Sub1_2 = arg4;
		}
	}
}
