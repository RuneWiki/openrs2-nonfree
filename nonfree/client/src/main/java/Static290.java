import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public static int anInt5237;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public static int anInt5240;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg2 + arg0);
		@Pc(35) int local35 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 - arg2);
		Static335.method4533(local27, arg1, local35, Static162.anIntArrayArray58[arg3]);
		while (local7 < local9) {
			local19 += 2;
			local12 += local19;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local64 = arg3 - local9;
				local68 = local9 + arg3;
				if (local68 >= Static388.anInt6740 && local64 <= Static387.anInt6727) {
					local91 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 + local7);
					local100 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 - local7);
					if (local68 <= Static387.anInt6727) {
						Static335.method4533(local91, arg1, local100, Static162.anIntArrayArray58[local68]);
					}
					if (local64 >= Static388.anInt6740) {
						Static335.method4533(local91, arg1, local100, Static162.anIntArrayArray58[local64]);
					}
				}
			}
			local7++;
			local64 = arg3 - local7;
			local68 = arg3 + local7;
			if (local68 >= Static388.anInt6740 && Static387.anInt6727 >= local64) {
				local91 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 + local9);
				local100 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 - local9);
				if (Static387.anInt6727 >= local68) {
					Static335.method4533(local91, arg1, local100, Static162.anIntArrayArray58[local68]);
				}
				if (Static388.anInt6740 <= local64) {
					Static335.method4533(local91, arg1, local100, Static162.anIntArrayArray58[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBI)Z")
	public static boolean method4028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
