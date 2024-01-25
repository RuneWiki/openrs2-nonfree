import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class87 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	private final int[] anIntArray170;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I)V")
	public Class87(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray170 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray170[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray170[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray170[local58 + local58] = arg0[local48];
			this.anIntArray170[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
	public int method1905(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray170.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray170[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray170[local20 + local20]) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
