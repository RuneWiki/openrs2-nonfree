import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class183 {

	@OriginalMember(owner = "client!js", name = "h", descriptor = "[I")
	private final int[] anIntArray311;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "([I)V")
	public Class183(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray311 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray311[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray311[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray311[local57 + local57] = arg0[local47];
			this.anIntArray311[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	public int method3666(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray311.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(33) int local33 = this.anIntArray311[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (this.anIntArray311[local23 + local23] == arg0) {
				return local33;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
