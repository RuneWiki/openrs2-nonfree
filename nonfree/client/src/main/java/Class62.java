import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class62 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
	private final int[] anIntArray335;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([I)V")
	public Class62(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray335 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray335[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray335[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray335[local58 + local58] = arg0[local48];
			this.anIntArray335[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
	public int method1901(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.anIntArray335.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local9;
		while (true) {
			@Pc(25) int local25 = this.anIntArray335[local20];
			if (local25 == arg0) {
				return this.anIntArray335[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
