import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class52 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[I")
	private final int[] anIntArray206;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
	public Class52(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray206 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray206[local30] = -1;
		}
		@Pc(45) int local45 = 0;
		while (local45 < arg0.length) {
			@Pc(55) int local55;
			for (local55 = arg0[local45] & local5 - 1; this.anIntArray206[local55 + local55 + 1] != -1; local55 = local55 + 1 & local5 + -1) {
			}
			this.anIntArray206[local55 + local55] = arg0[local45];
			this.anIntArray206[local55 + local55 + 1] = local45++;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)I")
	public int method1301(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.anIntArray206.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local14;
		while (true) {
			@Pc(25) int local25 = this.anIntArray206[local20];
			if (local25 == arg0) {
				return this.anIntArray206[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
