import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class55 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
	private final int[] anIntArray325;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([I)V")
	public Class55(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray325 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray325[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray325[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray325[local53 + local53] = arg0[local43];
			this.anIntArray325[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)I")
	public int method1723(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = (this.anIntArray325.length >> 1) - 1;
		@Pc(20) int local20 = local12 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray325[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray325[local20 + local20]) {
				return local29;
			}
			local20 = local12 & local20 + 1;
		}
	}
}
