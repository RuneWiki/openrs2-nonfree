import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class174 {

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "[I")
	private final int[] anIntArray355;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([I)V")
	public Class174(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray355 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray355[local34] = -1;
		}
		@Pc(53) int local53 = 0;
		while (local53 < arg0.length) {
			@Pc(63) int local63;
			for (local63 = arg0[local53] & local5 - 1; this.anIntArray355[local63 + local63 + 1] != -1; local63 = local63 + 1 & local5 - 1) {
			}
			this.anIntArray355[local63 + local63] = arg0[local53];
			this.anIntArray355[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)I")
	public int method3675(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (this.anIntArray355.length >> 1) - 1;
		@Pc(22) int local22 = local18 & arg0;
		while (true) {
			@Pc(31) int local31 = this.anIntArray355[local22 + local22 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray355[local22 + local22]) {
				return local31;
			}
			local22 = local18 & local22 + 1;
		}
	}
}
