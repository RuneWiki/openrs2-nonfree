import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class138 {

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "[I")
	private final int[] anIntArray220;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "([I)V")
	public Class138(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray220 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray220[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray220[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray220[local58 + local58] = arg0[local48];
			this.anIntArray220[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)I")
	public int method4263(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = (this.anIntArray220.length >> 1) - 1;
		@Pc(25) int local25 = local21 & arg0;
		while (true) {
			@Pc(34) int local34 = this.anIntArray220[local25 + local25 + 1];
			if (local34 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray220[local25 + local25]) {
				return local34;
			}
			local25 = local25 + 1 & local21;
		}
	}
}
