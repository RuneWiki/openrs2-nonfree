import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class65 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([I)V")
	public Class65(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray216 = new int[local5 + local5];
		@Pc(32) int local32;
		for (local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray216[local32] = -1;
		}
		local32 = 0;
		while (local32 < arg0.length) {
			@Pc(63) int local63;
			for (local63 = local5 - 1 & arg0[local32]; this.anIntArray216[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray216[local63 + local63] = arg0[local32];
			this.anIntArray216[local63 + local63 + 1] = local32++;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public int method1948(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray216.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray216[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray216[local20 + local20]) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
