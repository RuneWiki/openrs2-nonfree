import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class272 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "[I")
	private final int[] anIntArray524;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "([I)V")
	public Class272(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray524 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray524[local34] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(63) int local63;
			for (local63 = local5 - 1 & arg0[local51]; this.anIntArray524[local63 + local63 + 1] != -1; local63 = local63 + 1 & local5 + -1) {
			}
			this.anIntArray524[local63 + local63] = arg0[local51];
			this.anIntArray524[local63 + local63 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)I")
	public int method6598(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (this.anIntArray524.length >> 1) - 1;
		@Pc(24) int local24 = arg0 & local13;
		while (true) {
			@Pc(33) int local33 = this.anIntArray524[local24 + local24 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray524[local24 + local24]) {
				return local33;
			}
			local24 = local24 + 1 & local13;
		}
	}
}
