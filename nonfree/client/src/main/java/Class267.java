import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class267 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
	private final int[] anIntArray591;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([I)V")
	public Class267(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray591 = new int[local3 + local3];
		for (@Pc(26) int local26 = 0; local26 < local3 + local3; local26++) {
			this.anIntArray591[local26] = -1;
		}
		@Pc(40) int local40 = 0;
		while (arg0.length > local40) {
			@Pc(49) int local49;
			for (local49 = local3 - 1 & arg0[local40]; this.anIntArray591[local49 + local49 + 1] != -1; local49 = local49 + 1 & local3 - 1) {
			}
			this.anIntArray591[local49 + local49] = arg0[local40];
			this.anIntArray591[local49 + local49 + 1] = local40++;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)I")
	public int method6415(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray591.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray591[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray591[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
