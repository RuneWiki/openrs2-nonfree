import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class348 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "[I")
	private final int[] anIntArray633;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "([I)V")
	public Class348(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray633 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray633[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (arg0.length > local51) {
			@Pc(61) int local61;
			for (local61 = arg0[local51] & local5 - 1; this.anIntArray633[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray633[local61 + local61] = arg0[local51];
			this.anIntArray633[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)I")
	public int method7595(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray633.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray633[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray633[local20 + local20]) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
