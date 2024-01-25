import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class115 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
	private final int[] anIntArray203;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "([I)V")
	public Class115(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray203 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray203[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray203[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray203[local53 + local53] = arg0[local43];
			this.anIntArray203[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)I")
	public int method2598(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray203.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray203[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray203[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
