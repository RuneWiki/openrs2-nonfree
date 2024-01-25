import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Z")
	public static final boolean aBoolean372 = false;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
	public static void method4073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(16) int local16 = -arg1;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static290.method4092(Static89.anInt1576, arg1 + arg3, Static130.anInt2131);
		@Pc(34) int local34 = Static290.method4092(Static89.anInt1576, arg3 - arg1, Static130.anInt2131);
		Static437.method5735(local34, Static238.anIntArrayArray36[arg0], local26, arg2);
		while (local7 < local9) {
			local18 += 2;
			local16 += local18;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(85) int local85;
			@Pc(93) int local93;
			if (local16 > 0) {
				local9--;
				local16 -= local9 << 1;
				local63 = arg0 - local9;
				local67 = arg0 + local9;
				if (local67 >= Static275.anInt4756 && local63 <= Static48.anInt898) {
					local85 = Static290.method4092(Static89.anInt1576, local7 + arg3, Static130.anInt2131);
					local93 = Static290.method4092(Static89.anInt1576, arg3 - local7, Static130.anInt2131);
					if (Static48.anInt898 >= local67) {
						Static437.method5735(local93, Static238.anIntArrayArray36[local67], local85, arg2);
					}
					if (Static275.anInt4756 <= local63) {
						Static437.method5735(local93, Static238.anIntArrayArray36[local63], local85, arg2);
					}
				}
			}
			local7++;
			local63 = arg0 - local7;
			local67 = arg0 + local7;
			if (local67 >= Static275.anInt4756 && local63 <= Static48.anInt898) {
				local85 = Static290.method4092(Static89.anInt1576, local9 + arg3, Static130.anInt2131);
				local93 = Static290.method4092(Static89.anInt1576, arg3 - local9, Static130.anInt2131);
				if (local67 <= Static48.anInt898) {
					Static437.method5735(local93, Static238.anIntArrayArray36[local67], local85, arg2);
				}
				if (local63 >= Static275.anInt4756) {
					Static437.method5735(local93, Static238.anIntArrayArray36[local63], local85, arg2);
				}
			}
		}
	}
}
