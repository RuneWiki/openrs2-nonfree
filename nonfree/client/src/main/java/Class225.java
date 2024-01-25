import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class225 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
	private final int[] anIntArray612;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([I)V")
	public Class225(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray612 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray612[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray612[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray612[local57 + local57] = arg0[local47];
			this.anIntArray612[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	public int method5114(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray612.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(25) int local25 = this.anIntArray612[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray612[local15 + local15]) {
				return local25;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
