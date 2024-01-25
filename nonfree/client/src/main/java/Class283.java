import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class283 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
	private final int[] anIntArray555;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([I)V")
	public Class283(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray555 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray555[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray555[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 - 1) {
			}
			this.anIntArray555[local58 + local58] = arg0[local48];
			this.anIntArray555[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	public int method6317(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray555.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray555[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray555[local20 + local20]) {
				return local30;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
