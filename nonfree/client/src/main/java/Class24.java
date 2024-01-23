import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class24 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([I)V")
	public Class24(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray124 = new int[local3 + local3];
		for (@Pc(29) int local29 = 0; local29 < local3 + local3; local29++) {
			this.anIntArray124[local29] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(56) int local56;
			for (local56 = arg0[local47] & local3 - 1; this.anIntArray124[local56 + local56 + 1] != -1; local56 = local56 + 1 & local3 + -1) {
			}
			this.anIntArray124[local56 + local56] = arg0[local47];
			this.anIntArray124[local56 + local56 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)I")
	public int method554(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray124.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray124[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray124[local20 + local20]) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
