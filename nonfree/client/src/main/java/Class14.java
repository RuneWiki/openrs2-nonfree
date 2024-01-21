import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class14 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	private final int[] anIntArray48;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([I)V")
	public Class14(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray48 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray48[local29] = -1;
		}
		@Pc(49) int local49 = 0;
		while (arg0.length > local49) {
			@Pc(59) int local59;
			for (local59 = arg0[local49] & local5 - 1; this.anIntArray48[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 + 1) {
			}
			this.anIntArray48[local59 + local59] = arg0[local49];
			this.anIntArray48[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)I")
	public int method248(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray48.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local9;
		while (true) {
			@Pc(25) int local25 = this.anIntArray48[local20];
			if (arg0 == local25) {
				return this.anIntArray48[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local9 & local20 + 2;
		}
	}
}
