import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class48 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	private final int[] anIntArray62;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V")
	public Class48(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray62 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray62[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray62[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 - 1) {
			}
			this.anIntArray62[local58 + local58] = arg0[local48];
			this.anIntArray62[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public int method743(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray62.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(33) int local33 = this.anIntArray62[local15 + local15 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray62[local15 + local15]) {
				return local33;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
