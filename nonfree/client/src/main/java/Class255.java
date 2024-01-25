import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class255 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
	private final int[] anIntArray574;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([I)V")
	public Class255(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray574 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray574[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray574[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray574[local53 + local53] = arg0[local43];
			this.anIntArray574[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	public int method5370(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray574.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray574[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray574[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local11;
		}
	}
}
