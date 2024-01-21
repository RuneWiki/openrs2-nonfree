import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "[I")
	private final int[] anIntArray69;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([I)V")
	public Class10(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray69 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray69[local29] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = arg0[local49] & local5 - 1; this.anIntArray69[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 - 1) {
			}
			this.anIntArray69[local59 + local59] = arg0[local49];
			this.anIntArray69[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)I")
	public int method264(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.anIntArray69.length - 2;
		@Pc(20) int local20 = local14 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray69[local20];
			if (arg0 == local25) {
				return this.anIntArray69[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local14 & local20 + 2;
		}
	}
}
