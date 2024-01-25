import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_130 = new Class56(52, 5);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class251 local13 = local7.aClass251_2; local13 != null; local13 = local13.aClass251_3) {
			@Pc(17) Class8_Sub3 local17 = local13.aClass8_Sub3_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort100 == arg1 && local17.aShort99 == arg2) {
				Static19.method281(local17);
				return;
			}
		}
	}
}
