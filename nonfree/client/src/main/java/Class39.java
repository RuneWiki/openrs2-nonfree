import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class39 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	private final int[] anIntArray303;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([I)V")
	public Class39(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray303 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray303[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray303[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray303[local57 + local57] = arg0[local47];
			this.anIntArray303[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
	public int method1384(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.anIntArray303.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local14;
		while (true) {
			@Pc(25) int local25 = this.anIntArray303[local20];
			if (local25 == arg0) {
				return this.anIntArray303[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
