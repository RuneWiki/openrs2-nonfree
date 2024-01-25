import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class113 {

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "[I")
	private final int[] anIntArray281;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "([I)V")
	public Class113(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray281 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray281[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = arg0[local44] & local5 - 1; this.anIntArray281[local54 + local54 + 1] != -1; local54 = local54 + 1 & local5 + -1) {
			}
			this.anIntArray281[local54 + local54] = arg0[local44];
			this.anIntArray281[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)I")
	public int method2767(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = (this.anIntArray281.length >> 1) - 1;
		@Pc(24) int local24 = arg0 & local20;
		while (true) {
			@Pc(33) int local33 = this.anIntArray281[local24 + local24 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray281[local24 + local24]) {
				return local33;
			}
			local24 = local20 & local24 + 1;
		}
	}
}
