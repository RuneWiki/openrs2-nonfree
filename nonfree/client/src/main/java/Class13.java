import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class13 {

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
	private final int[] anIntArray59;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([I)V")
	public Class13(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray59 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray59[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (arg0.length > local51) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray59[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray59[local61 + local61] = arg0[local51];
			this.anIntArray59[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)I")
	public int method323(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray59.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local9;
		while (true) {
			@Pc(25) int local25 = this.anIntArray59[local20];
			if (arg0 == local25) {
				return this.anIntArray59[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
