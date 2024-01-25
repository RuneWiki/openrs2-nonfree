import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class149 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
	private final int[] anIntArray470;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V")
	public Class149(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray470 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray470[local30] = -1;
		}
		@Pc(45) int local45 = 0;
		while (arg0.length > local45) {
			@Pc(55) int local55;
			for (local55 = local5 - 1 & arg0[local45]; this.anIntArray470[local55 + local55 + 1] != -1; local55 = local5 - 1 & local55 + 1) {
			}
			this.anIntArray470[local55 + local55] = arg0[local45];
			this.anIntArray470[local55 + local55 + 1] = local45++;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public int method3906(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray470.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(24) int local24 = this.anIntArray470[local15 + local15 + 1];
			if (local24 == -1) {
				return -1;
			}
			if (this.anIntArray470[local15 + local15] == arg0) {
				return local24;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
