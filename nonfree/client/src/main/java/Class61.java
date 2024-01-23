import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class61 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([I)V")
	public Class61(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray209 = new int[local5 + local5];
		@Pc(28) int local28;
		for (local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray209[local28] = -1;
		}
		local28 = 0;
		while (local28 < arg0.length) {
			@Pc(63) int local63;
			for (local63 = arg0[local28] & local5 - 1; this.anIntArray209[local63 + local63 + 1] != -1; local63 = local63 + 1 & local5 + -1) {
			}
			this.anIntArray209[local63 + local63] = arg0[local28];
			this.anIntArray209[local63 + local63 + 1] = local28++;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I")
	public int method1482(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (this.anIntArray209.length >> 1) - 1;
		@Pc(22) int local22 = arg0 & local18;
		while (true) {
			@Pc(31) int local31 = this.anIntArray209[local22 + local22 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray209[local22 + local22]) {
				return local31;
			}
			local22 = local18 & local22 + 1;
		}
	}
}
