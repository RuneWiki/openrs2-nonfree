import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class20 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	private final int[] anIntArray75;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([I)V")
	public Class20(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray75 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray75[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray75[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 + 1) {
			}
			this.anIntArray75[local54 + local54] = arg0[local44];
			this.anIntArray75[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I")
	public int method789(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = (this.anIntArray75.length >> 1) - 1;
		@Pc(16) int local16 = local7 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray75[local16 + local16 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray75[local16 + local16]) {
				return local29;
			}
			local16 = local16 + 1 & local7;
		}
	}
}
