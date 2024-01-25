import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)Z")
	public static boolean method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIIII)V")
	public static void method3009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		@Pc(30) int local30 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 + arg3);
		@Pc(39) int local39 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3 - arg2);
		Static215.method3035(local39, local30, Static46.anIntArrayArray24[arg1], arg0);
		while (local7 < local9) {
			local22 += 2;
			local20 += local22;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(93) int local93;
			@Pc(102) int local102;
			if (local20 > 0) {
				local9--;
				local20 -= local9 << 1;
				local71 = arg1 - local9;
				local75 = local9 + arg1;
				if (local75 >= Static118.anInt2005 && local71 <= Static123.anInt2069) {
					local93 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3 + local7);
					local102 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3 - local7);
					if (local75 <= Static123.anInt2069) {
						Static215.method3035(local102, local93, Static46.anIntArrayArray24[local75], arg0);
					}
					if (local71 >= Static118.anInt2005) {
						Static215.method3035(local102, local93, Static46.anIntArrayArray24[local71], arg0);
					}
				}
			}
			local7++;
			local71 = arg1 - local7;
			local75 = local7 + arg1;
			if (local75 >= Static118.anInt2005 && local71 <= Static123.anInt2069) {
				local93 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local9 + arg3);
				local102 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3 - local9);
				if (local75 <= Static123.anInt2069) {
					Static215.method3035(local102, local93, Static46.anIntArrayArray24[local75], arg0);
				}
				if (local71 >= Static118.anInt2005) {
					Static215.method3035(local102, local93, Static46.anIntArrayArray24[local71], arg0);
				}
			}
		}
	}
}
