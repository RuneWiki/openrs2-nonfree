import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class155 {

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "([I)V")
	public Class155(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray372 = new int[local5 + local5];
		@Pc(32) int local32;
		for (local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray372[local32] = -1;
		}
		local32 = 0;
		while (local32 < arg0.length) {
			@Pc(67) int local67;
			for (local67 = local5 - 1 & arg0[local32]; this.anIntArray372[local67 + local67 + 1] != -1; local67 = local67 + 1 & local5 + -1) {
			}
			this.anIntArray372[local67 + local67] = arg0[local32];
			this.anIntArray372[local67 + local67 + 1] = local32++;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I")
	public int method3693(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray372.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local7;
		while (true) {
			@Pc(33) int local33 = this.anIntArray372[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (this.anIntArray372[local23 + local23] == arg0) {
				return local33;
			}
			local23 = local7 & local23 + 1;
		}
	}
}
