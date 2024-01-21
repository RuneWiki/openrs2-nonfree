import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class83 {

	@OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
	private final int[] anIntArray362;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
	public Class83(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray362 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray362[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray362[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray362[local58 + local58] = arg0[local48];
			this.anIntArray362[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
	public int method1961(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray362.length - 2;
		@Pc(20) int local20 = local9 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray362[local20];
			if (local25 == arg0) {
				return this.anIntArray362[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
