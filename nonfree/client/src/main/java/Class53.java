import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class53 {

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
	private final int[] anIntArray126;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([I)V")
	public Class53(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray126 = new int[local3 + local3];
		for (@Pc(30) int local30 = 0; local30 < local3 + local3; local30++) {
			this.anIntArray126[local30] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local3 - 1 & arg0[local44]; this.anIntArray126[local53 + local53 + 1] != -1; local53 = local3 - 1 & local53 + 1) {
			}
			this.anIntArray126[local53 + local53] = arg0[local44];
			this.anIntArray126[local53 + local53 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)I")
	public int method1549(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray126.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray126[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray126[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
