import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
	public static int anInt451;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_18 = new Class179(91, -2);

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "[I")
	public static final int[] anIntArray14 = new int[1];

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB[[B[I[B[[B[II)I")
	public static int method464(@OriginalArg(0) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2[arg6];
		@Pc(15) int local15 = arg5[arg6] + local9;
		@Pc(24) int local24 = arg2[arg0];
		@Pc(31) int local31 = local24 + arg5[arg0];
		@Pc(33) int local33 = local9;
		if (local9 < local24) {
			local33 = local24;
		}
		@Pc(40) int local40 = local15;
		if (local15 > local31) {
			local40 = local31;
		}
		@Pc(51) int local51 = arg3[arg6] & 0xFF;
		if ((arg3[arg0] & 0xFF) < local51) {
			local51 = arg3[arg0] & 0xFF;
		}
		@Pc(68) byte[] local68 = arg1[arg6];
		@Pc(72) byte[] local72 = arg4[arg0];
		@Pc(77) int local77 = local33 - local9;
		@Pc(82) int local82 = local33 - local24;
		for (@Pc(84) int local84 = local33; local84 < local40; local84++) {
			@Pc(96) int local96 = local72[local82++] + local68[local77++];
			if (local96 < local51) {
				local51 = local96;
			}
		}
		return -local51;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
	public static void method467() {
		if (!Static591.aBoolean690) {
			Static213.aFloat21 += (-24.0F - Static213.aFloat21) / 2.0F;
			Static70.aBoolean70 = true;
			Static591.aBoolean690 = true;
		}
	}
}
