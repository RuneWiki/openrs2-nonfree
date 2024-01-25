import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!al", name = "J", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "I")
	public static int anInt603 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!rc;")
	public static Class20_Sub2_Sub4 method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class285 local14 = local7.aClass285_6; local14 != null; local14 = local14.aClass285_5) {
			@Pc(18) Class20_Sub2_Sub4 local18 = local14.aClass20_Sub2_Sub4_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort100 == arg1 && local18.aShort97 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
