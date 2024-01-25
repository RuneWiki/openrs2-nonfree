import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!mga;")
	public static Class9_Sub1_Sub1 method5449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class181 local15 = local7.aClass181_3; local15 != null; local15 = local15.aClass181_2) {
			@Pc(19) Class9_Sub1_Sub1 local19 = local15.aClass9_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort123 == arg1 && local19.aShort120 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
