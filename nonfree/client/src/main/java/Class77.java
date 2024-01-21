import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class77 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
	private final int[] anIntArray469;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([I)V")
	public Class77(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray469 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray469[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray469[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray469[local57 + local57] = arg0[local47];
			this.anIntArray469[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
	public int method2074(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.anIntArray469.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local9;
		while (true) {
			@Pc(25) int local25 = this.anIntArray469[local20];
			if (arg0 == local25) {
				return this.anIntArray469[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
