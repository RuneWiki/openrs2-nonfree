import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class19 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "[I")
	private final int[] anIntArray92;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([I)V")
	public Class19(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray92 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray92[local33] = -1;
		}
		@Pc(53) int local53 = 0;
		while (arg0.length > local53) {
			@Pc(63) int local63;
			for (local63 = local5 - 1 & arg0[local53]; this.anIntArray92[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray92[local63 + local63] = arg0[local53];
			this.anIntArray92[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)I")
	public int method809(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray92.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local7;
		while (true) {
			@Pc(30) int local30 = this.anIntArray92[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray92[local20 + local20]) {
				return local30;
			}
			local20 = local7 & local20 + 1;
		}
	}
}
