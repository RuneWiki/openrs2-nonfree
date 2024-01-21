import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class45 {

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
	private final int[] anIntArray229;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
	public Class45(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray229 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray229[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray229[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray229[local58 + local58] = arg0[local48];
			this.anIntArray229[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
	public int method1100(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anIntArray229.length - 2;
		@Pc(23) int local23 = local17 & arg0 << 1;
		while (true) {
			@Pc(28) int local28 = this.anIntArray229[local23];
			if (local28 == arg0) {
				return this.anIntArray229[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local17 & local23 + 2;
		}
	}
}
