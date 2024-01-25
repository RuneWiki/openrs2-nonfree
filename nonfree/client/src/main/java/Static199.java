import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
	public static int anInt4129 = 0;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	public static void method3260() {
		@Pc(9) int local9 = (int) ((double) Static338.anInt6508 * 34.46D);
		local9 <<= 0x2;
		if (Static39.aClass7_2.method7813()) {
			local9 += 512;
		}
		Static39.aClass7_2.GA(200, local9);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZ[Lclient!is;I)V")
	public static void method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class155[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class155 local9 = arg4[local3];
			if (local9 != null && arg0 == local9.anInt4769) {
				Static276.method4457(arg1, local9, arg2, arg3);
				Static145.method2520(arg1, arg2, local9);
				if (local9.anInt4778 - local9.anInt4806 < local9.anInt4758) {
					local9.anInt4758 = local9.anInt4778 - local9.anInt4806;
				}
				if (local9.anInt4801 - local9.anInt4831 < local9.anInt4762) {
					local9.anInt4762 = local9.anInt4801 - local9.anInt4831;
				}
				if (local9.anInt4758 < 0) {
					local9.anInt4758 = 0;
				}
				if (local9.anInt4762 < 0) {
					local9.anInt4762 = 0;
				}
				if (local9.anInt4796 == 0) {
					Static162.method2682(arg3, local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "(B)V")
	public static void method3262() {
		Static219.aClass167_17.method3961();
	}
}
