import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class175 {

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "[I")
	private final int[] anIntArray269;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "([I)V")
	public Class175(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray269 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray269[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray269[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray269[local53 + local53] = arg0[local43];
			this.anIntArray269[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZ)I")
	public int method4069(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray269.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray269[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray269[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
