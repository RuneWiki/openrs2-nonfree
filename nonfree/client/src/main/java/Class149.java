import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class149 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([I)V")
	public Class149(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray499 = new int[local5 + local5];
		@Pc(33) int local33;
		for (local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray499[local33] = -1;
		}
		local33 = 0;
		while (arg0.length > local33) {
			@Pc(64) int local64;
			for (local64 = arg0[local33] & local5 - 1; this.anIntArray499[local64 + local64 + 1] != -1; local64 = local5 - 1 & local64 + 1) {
			}
			this.anIntArray499[local64 + local64] = arg0[local33];
			this.anIntArray499[local64 + local64 + 1] = local33++;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I")
	public int method3864(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray499.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray499[local15 + local15 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray499[local15 + local15]) {
				return local29;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
