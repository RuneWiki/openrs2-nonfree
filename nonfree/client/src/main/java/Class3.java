import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
	private final int[] anIntArray4;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
	public Class3(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray4 = new int[local3 + local3];
		for (@Pc(25) int local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray4[local25] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local3 - 1 & arg0[local44]; this.anIntArray4[local53 + local53 + 1] != -1; local53 = local53 + 1 & local3 + -1) {
			}
			this.anIntArray4[local53 + local53] = arg0[local44];
			this.anIntArray4[local53 + local53 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	public int method53(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (this.anIntArray4.length >> 1) - 1;
		@Pc(21) int local21 = local17 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray4[local21 + local21 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray4[local21 + local21] == arg0) {
				return local30;
			}
			local21 = local17 & local21 + 1;
		}
	}
}
