import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	private final int[] anIntArray9;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
	public Class3(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray9 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray9[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray9[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 - -1) {
			}
			this.anIntArray9[local54 + local54] = arg0[local44];
			this.anIntArray9[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)I")
	public int method266(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray9.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray9[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray9[local20 + local20]) {
				return local30;
			}
			local20 = local20 + 1 & local11;
		}
	}
}
