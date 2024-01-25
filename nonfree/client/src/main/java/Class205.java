import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class205 {

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "[I")
	private final int[] anIntArray381;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([I)V")
	public Class205(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray381 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray381[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(61) int local61;
			for (local61 = arg0[local51] & local5 - 1; this.anIntArray381[local61 + local61 + 1] != -1; local61 = local61 + 1 & local5 + -1) {
			}
			this.anIntArray381[local61 + local61] = arg0[local51];
			this.anIntArray381[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
	public int method4703(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray381.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(24) int local24 = this.anIntArray381[local15 + local15 + 1];
			if (local24 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray381[local15 + local15]) {
				return local24;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
