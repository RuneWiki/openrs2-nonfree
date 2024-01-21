import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class23 {

	@OriginalMember(owner = "client!f", name = "n", descriptor = "[I")
	private final int[] anIntArray95;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([I)V")
	public Class23(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray95 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray95[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = local5 - 1 & arg0[local52]; this.anIntArray95[local62 + local62 + 1] != -1; local62 = local5 - 1 & local62 + 1) {
			}
			this.anIntArray95[local62 + local62] = arg0[local52];
			this.anIntArray95[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	public int method501(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = this.anIntArray95.length - 2;
		@Pc(11) int local11 = local5 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray95[local11];
			if (arg0 == local25) {
				return this.anIntArray95[local11 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local11 = local11 + 2 & local5;
		}
	}
}
