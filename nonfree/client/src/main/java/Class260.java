import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class260 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
	private final int[] anIntArray670;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([I)V")
	public Class260(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray670 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray670[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray670[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray670[local58 + local58] = arg0[local48];
			this.anIntArray670[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)I")
	public int method6520(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray670.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray670[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray670[local20 + local20] == arg0) {
				return local30;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
