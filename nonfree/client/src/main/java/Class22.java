import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class22 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([I)V")
	public Class22(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray79 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray79[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray79[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray79[local58 + local58] = arg0[local48];
			this.anIntArray79[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public int method614(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray79.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray79[local15 + local15 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray79[local15 + local15] == arg0) {
				return local32;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
