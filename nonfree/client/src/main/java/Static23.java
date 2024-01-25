import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_14 = new Class332(260);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BFFF)I")
	public static int method301(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 < local26 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class66 local13 = local7.aClass66_1; local13 != null; local13 = local13.aClass66_2) {
			@Pc(17) Class29_Sub2 local17 = local13.aClass29_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort122 == arg1 && local17.aShort121 == arg2) {
				Static322.method4983(local17);
				return;
			}
		}
	}
}
