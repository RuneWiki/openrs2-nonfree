import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class207 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "[I")
	private final int[] anIntArray510;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([I)V")
	public Class207(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray510 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray510[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray510[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 - 1) {
			}
			this.anIntArray510[local58 + local58] = arg0[local48];
			this.anIntArray510[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I")
	public int method4852(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray510.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray510[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray510[local20 + local20] == arg0) {
				return local30;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
