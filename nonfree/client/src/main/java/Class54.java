import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class54 {

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
	private final int[] anIntArray315;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
	public Class54(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray315 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray315[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray315[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray315[local58 + local58] = arg0[local48];
			this.anIntArray315[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
	public int method1514(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.anIntArray315.length - 2;
		@Pc(15) int local15 = local9 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray315[local15];
			if (local25 == arg0) {
				return this.anIntArray315[local15 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local15 = local9 & local15 + 2;
		}
	}
}
