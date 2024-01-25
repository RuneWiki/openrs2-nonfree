import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!oa;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lclient!tn;")
	public static Class41_Sub2_Sub5 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass41_Sub2_Sub5_1 == null ? null : local7.aClass41_Sub2_Sub5_1;
	}
}
