import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[128][128];

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([ILclient!kw;II[IB)Lclient!tq;")
	public static Class1_Sub2 method6665(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(23) int local23 = local12 * arg3 + arg4[local12];
			for (@Pc(25) int local25 = 0; local25 < arg0[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg3, arg2, local10);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)S")
	public static short method6666(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(44) int local44 = local19 + local39;
		@Pc(53) int local53;
		if (local44 == 0) {
			local53 = local39 << 1;
		} else {
			local53 = (local39 << 8) / local44;
		}
		return (short) (local9 << 10 | local53 >> 4 << 7 | local44);
	}
}
