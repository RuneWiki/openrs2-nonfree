import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class47 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray212 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray212[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray212[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray212[local58 + local58] = arg0[local48];
			this.anIntArray212[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
	public int method1536(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray212.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray212[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray212[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
