import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class190 {

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
	private final int[] anIntArray288;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([I)V")
	public Class190(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray288 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray288[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray288[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray288[local58 + local58] = arg0[local48];
			this.anIntArray288[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
	public int method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray288.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray288[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray288[local20 + local20]) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
