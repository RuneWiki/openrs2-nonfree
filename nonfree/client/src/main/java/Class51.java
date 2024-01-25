import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class51 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
	private final int[] anIntArray96;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V")
	public Class51(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray96 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray96[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray96[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray96[local58 + local58] = arg0[local48];
			this.anIntArray96[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public int method1099(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray96.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray96[local15 + local15 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray96[local15 + local15]) {
				return local29;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
