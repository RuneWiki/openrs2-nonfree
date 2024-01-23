import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class147 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([I)V")
	public Class147(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray500 = new int[local5 + local5];
		@Pc(33) int local33;
		for (local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray500[local33] = -1;
		}
		local33 = 0;
		while (arg0.length > local33) {
			@Pc(69) int local69;
			for (local69 = local5 - 1 & arg0[local33]; this.anIntArray500[local69 + local69 + 1] != -1; local69 = local69 + 1 & local5 - 1) {
			}
			this.anIntArray500[local69 + local69] = arg0[local33];
			this.anIntArray500[local69 + local69 + 1] = local33++;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public int method3785(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray500.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray500[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray500[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local11;
		}
	}
}
