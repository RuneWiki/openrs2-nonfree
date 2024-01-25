import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class219 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
	private final int[] anIntArray420;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([I)V")
	public Class219(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray420 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray420[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray420[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray420[local58 + local58] = arg0[local48];
			this.anIntArray420[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
	public int method4608(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray420.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray420[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray420[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
