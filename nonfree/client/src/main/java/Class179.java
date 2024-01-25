import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class179 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	private final int[] anIntArray520;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
	public Class179(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray520 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray520[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray520[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray520[local58 + local58] = arg0[local48];
			this.anIntArray520[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
	public int method4416(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray520.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray520[local15 + local15 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray520[local15 + local15] == arg0) {
				return local30;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
