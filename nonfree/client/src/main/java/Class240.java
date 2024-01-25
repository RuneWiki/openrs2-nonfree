import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class240 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "[I")
	private final int[] anIntArray405;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "([I)V")
	public Class240(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray405 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray405[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray405[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray405[local57 + local57] = arg0[local47];
			this.anIntArray405[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)I")
	public int method6024(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (this.anIntArray405.length >> 1) - 1;
		@Pc(21) int local21 = arg0 & local17;
		while (true) {
			@Pc(30) int local30 = this.anIntArray405[local21 + local21 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray405[local21 + local21] == arg0) {
				return local30;
			}
			local21 = local17 & local21 + 1;
		}
	}
}
