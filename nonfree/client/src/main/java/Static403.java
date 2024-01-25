import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nl", name = "fb", descriptor = "[Lclient!rfa;")
	public static Class60_Sub1[] aClass60_Sub1Array5;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lclient!jea;")
	public static Class60_Sub1_Sub4 method6208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class60_Sub1_Sub4 local15 = local7.aClass60_Sub1_Sub4_1;
			local7.aClass60_Sub1_Sub4_1 = null;
			Static165.method3262(local15);
			return local15;
		}
	}
}
