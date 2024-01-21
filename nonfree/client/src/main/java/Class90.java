import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class90 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	private final int[] anIntArray443;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V")
	public Class90(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray443 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray443[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray443[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray443[local58 + local58] = arg0[local48];
			this.anIntArray443[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I")
	public int method2898(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray443.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray443[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray443[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
