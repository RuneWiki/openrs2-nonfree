import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class242 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	private final int[] anIntArray505;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "([I)V")
	public Class242(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray505 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray505[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray505[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 - -1) {
			}
			this.anIntArray505[local57 + local57] = arg0[local47];
			this.anIntArray505[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)I")
	public int method5159(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray505.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray505[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray505[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
