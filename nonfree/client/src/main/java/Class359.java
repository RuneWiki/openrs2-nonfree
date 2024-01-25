import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class359 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	private final int[] anIntArray584;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V")
	public Class359(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray584 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray584[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray584[local54 + local54 + 1] != -1; local54 = local54 + 1 & local5 + -1) {
			}
			this.anIntArray584[local54 + local54] = arg0[local44];
			this.anIntArray584[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)I")
	public int method8128(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray584.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray584[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray584[local20 + local20]) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
