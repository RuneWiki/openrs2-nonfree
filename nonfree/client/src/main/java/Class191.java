import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class191 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
	private final int[] anIntArray461;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "([I)V")
	public Class191(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray461 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray461[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray461[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 - 1) {
			}
			this.anIntArray461[local53 + local53] = arg0[local43];
			this.anIntArray461[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)I")
	public int method5380(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray461.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(33) int local33 = this.anIntArray461[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray461[local23 + local23]) {
				return local33;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
