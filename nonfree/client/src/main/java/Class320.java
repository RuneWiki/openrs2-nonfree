import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class320 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "[I")
	private final int[] anIntArray700;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([I)V")
	public Class320(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray700 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray700[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (arg0.length > local52) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray700[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 + -1) {
			}
			this.anIntArray700[local62 + local62] = arg0[local52];
			this.anIntArray700[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)I")
	public int method7990(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray700.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray700[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray700[local20 + local20]) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
