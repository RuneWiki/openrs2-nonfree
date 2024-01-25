import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class296 {

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "[I")
	private final int[] anIntArray560;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "([I)V")
	public Class296(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray560 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray560[local29] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray560[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 + -1) {
			}
			this.anIntArray560[local59 + local59] = arg0[local49];
			this.anIntArray560[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I")
	public int method7292(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray560.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local11;
		while (true) {
			@Pc(32) int local32 = this.anIntArray560[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray560[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local11 & local23 + 1;
		}
	}
}
