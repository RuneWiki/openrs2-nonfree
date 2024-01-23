import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class44 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([I)V")
	public Class44(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray92 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray92[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray92[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray92[local53 + local53] = arg0[local43];
			this.anIntArray92[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
	public int method1083(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray92.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local11;
		while (true) {
			@Pc(32) int local32 = this.anIntArray92[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray92[local23 + local23]) {
				return local32;
			}
			local23 = local11 & local23 + 1;
		}
	}
}
