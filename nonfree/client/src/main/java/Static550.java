import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "[Lclient!fq;")
	public static final Class108[] aClass108Array2 = new Class108[14];

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[I")
	public static final int[] anIntArray695 = new int[3];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method7575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg3 + 7) / 8);
		@Pc(39) int local39 = -((arg0 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(45) int local45 = local39; local45 < 0; local45++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
