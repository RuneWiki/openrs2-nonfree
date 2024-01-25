import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
	public static boolean aBoolean886;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	public static int anInt10230;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class142 local14 = local7.aClass142_2; local14 != null; local14 = local14.aClass142_1) {
			@Pc(18) Class4_Sub2_Sub1 local18 = local14.aClass4_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort130 == arg1 && local18.aShort127 == arg2) {
				Static678.method9188(local18, false);
				return;
			}
		}
	}
}
