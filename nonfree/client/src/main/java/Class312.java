import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class312 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[I")
	private final int[] anIntArray503;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([I)V")
	public Class312(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray503 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray503[local34] = -1;
		}
		@Pc(49) int local49 = 0;
		while (arg0.length > local49) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray503[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 + -1) {
			}
			this.anIntArray503[local59 + local59] = arg0[local49];
			this.anIntArray503[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	public int method7424(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray503.length >> 1) - 1;
		@Pc(23) int local23 = local11 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray503[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray503[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local11 & local23 + 1;
		}
	}
}
