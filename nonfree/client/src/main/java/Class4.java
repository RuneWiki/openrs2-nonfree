import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
	private final int[] anIntArray12;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([I)V")
	public Class4(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray12 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray12[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray12[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray12[local58 + local58] = arg0[local48];
			this.anIntArray12[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method76(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray12.length - 2;
		@Pc(15) int local15 = arg0 << 1 & local9;
		while (true) {
			@Pc(28) int local28 = this.anIntArray12[local15];
			if (local28 == arg0) {
				return this.anIntArray12[local15 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local15 = local9 & local15 + 2;
		}
	}
}
