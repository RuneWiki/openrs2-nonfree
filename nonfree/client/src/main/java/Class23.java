import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class23 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
	private final int[] anIntArray91;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([I)V")
	public Class23(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray91 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray91[local30] = -1;
		}
		@Pc(45) int local45 = 0;
		while (local45 < arg0.length) {
			@Pc(55) int local55;
			for (local55 = arg0[local45] & local5 - 1; this.anIntArray91[local55 + local55 + 1] != -1; local55 = local55 + 1 & local5 + -1) {
			}
			this.anIntArray91[local55 + local55] = arg0[local45];
			this.anIntArray91[local55 + local55 + 1] = local45++;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)I")
	public int method728(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray91.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(30) int local30 = this.anIntArray91[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray91[local20 + local20]) {
				return local30;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
