import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class75 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	private final int[] anIntArray88;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([I)V")
	public Class75(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray88 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray88[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray88[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray88[local58 + local58] = arg0[local48];
			this.anIntArray88[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	public int method1521(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray88.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray88[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray88[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
