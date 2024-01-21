import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class8 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
	private final int[] anIntArray40;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([I)V")
	public Class8(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray40 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray40[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray40[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray40[local61 + local61] = arg0[local51];
			this.anIntArray40[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)I")
	public int method181(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.anIntArray40.length - 2;
		@Pc(24) int local24 = arg0 << 1 & local9;
		while (true) {
			@Pc(29) int local29 = this.anIntArray40[local24];
			if (arg0 == local29) {
				return this.anIntArray40[local24 + 1];
			}
			if (local29 == -1) {
				return -1;
			}
			local24 = local9 & local24 + 2;
		}
	}
}
