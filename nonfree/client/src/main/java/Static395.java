import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_52 = new Class361();

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "Z")
	public static boolean aBoolean486 = false;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg0 + arg1 && arg1 < arg4 + arg6) {
			return arg3 < arg7 + arg2 && arg5 + arg3 > arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!pv;III)V")
	public static void method5807(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static362.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt9438 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub7Array6[arg0.anInt9438++] = Static478.aClass78Array1[local21 - 1].aClass6_Sub7_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt9438; local21 < 4; local21++) {
			arg0.aClass6_Sub7Array6[local21] = null;
		}
	}
}
