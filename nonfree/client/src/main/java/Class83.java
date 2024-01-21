import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class83 {

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "[I")
	private final int[] anIntArray384;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([I)V")
	public Class83(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray384 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray384[local34] = -1;
		}
		@Pc(54) int local54 = 0;
		while (local54 < arg0.length) {
			@Pc(64) int local64;
			for (local64 = arg0[local54] & local5 - 1; this.anIntArray384[local64 + local64 + 1] != -1; local64 = local5 - 1 & local64 + 1) {
			}
			this.anIntArray384[local64 + local64] = arg0[local54];
			this.anIntArray384[local64 + local64 + 1] = local54++;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)I")
	public int method2654(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray384.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray384[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray384[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
