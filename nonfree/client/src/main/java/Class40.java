import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class40 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([I)V")
	public Class40(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray130 = new int[local5 + local5];
		@Pc(33) int local33;
		for (local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray130[local33] = -1;
		}
		local33 = 0;
		while (local33 < arg0.length) {
			@Pc(68) int local68;
			for (local68 = arg0[local33] & local5 - 1; this.anIntArray130[local68 + local68 + 1] != -1; local68 = local68 + 1 & local5 + -1) {
			}
			this.anIntArray130[local68 + local68] = arg0[local33];
			this.anIntArray130[local68 + local68 + 1] = local33++;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public int method948(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray130.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray130[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray130[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
