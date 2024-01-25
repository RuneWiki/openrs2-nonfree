import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class346 {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
	private final int[] anIntArray573;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I)V")
	public Class346(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray573 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray573[local33] = -1;
		}
		@Pc(53) int local53 = 0;
		while (arg0.length > local53) {
			@Pc(63) int local63;
			for (local63 = local5 - 1 & arg0[local53]; this.anIntArray573[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray573[local63 + local63] = arg0[local53];
			this.anIntArray573[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	public int method7291(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray573.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray573[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray573[local20 + local20]) {
				return local30;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
