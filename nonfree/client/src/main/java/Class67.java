import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class67 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
	private final int[] anIntArray301;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([I)V")
	public Class67(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray301 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray301[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray301[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray301[local58 + local58] = arg0[local48];
			this.anIntArray301[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
	public int method2043(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.anIntArray301.length - 2;
		@Pc(20) int local20 = local14 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray301[local20];
			if (local25 == arg0) {
				return this.anIntArray301[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local14 & local20 + 2;
		}
	}
}
