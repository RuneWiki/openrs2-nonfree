import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class72 {

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "[I")
	private final int[] anIntArray293;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([I)V")
	public Class72(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray293 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray293[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (arg0.length > local44) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray293[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 - -1) {
			}
			this.anIntArray293[local54 + local54] = arg0[local44];
			this.anIntArray293[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	public int method2006(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray293.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray293[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray293[local23 + local23]) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
