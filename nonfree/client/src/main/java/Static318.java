import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!wt;")
	public static final Class393 aClass393_2 = new Class393();

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "[I")
	public static final int[] anIntArray477 = new int[8];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!nb;")
	public static Class28_Sub1_Sub1 method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class125 local14 = local7.aClass125_2; local14 != null; local14 = local14.aClass125_1) {
			@Pc(18) Class28_Sub1_Sub1 local18 = local14.aClass28_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort125 == arg1 && local18.aShort123 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
	public static int method4864() {
		return Static488.method7051(false);
	}
}
