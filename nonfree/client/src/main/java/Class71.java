import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class71 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
	private final int[] anIntArray349;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([I)V")
	public Class71(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray349 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray349[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray349[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 - 1) {
			}
			this.anIntArray349[local58 + local58] = arg0[local48];
			this.anIntArray349[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
	public int method1724(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray349.length - 2;
		@Pc(20) int local20 = local9 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray349[local20];
			if (local25 == arg0) {
				return this.anIntArray349[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
