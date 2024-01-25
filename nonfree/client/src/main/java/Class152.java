import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class152 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
	private final int[] anIntArray259;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([I)V")
	public Class152(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray259 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray259[local34] = -1;
		}
		@Pc(54) int local54 = 0;
		while (arg0.length > local54) {
			@Pc(64) int local64;
			for (local64 = arg0[local54] & local5 - 1; this.anIntArray259[local64 + local64 + 1] != -1; local64 = local5 - 1 & local64 + 1) {
			}
			this.anIntArray259[local64 + local64] = arg0[local54];
			this.anIntArray259[local64 + local64 + 1] = local54++;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
	public int method3474(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = (this.anIntArray259.length >> 1) - 1;
		@Pc(25) int local25 = arg0 & local21;
		while (true) {
			@Pc(34) int local34 = this.anIntArray259[local25 + local25 + 1];
			if (local34 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray259[local25 + local25]) {
				return local34;
			}
			local25 = local21 & local25 + 1;
		}
	}
}
