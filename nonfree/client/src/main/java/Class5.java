import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5 {

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "[I")
	private final int[] anIntArray30;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([I)V")
	public Class5(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray30 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray30[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray30[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray30[local58 + local58] = arg0[local48];
			this.anIntArray30[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public int method127(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray30.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(33) int local33 = this.anIntArray30[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (this.anIntArray30[local23 + local23] == arg0) {
				return local33;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
