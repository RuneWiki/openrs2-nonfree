import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class49 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
	private final int[] anIntArray239;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
	public Class49(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray239 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray239[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray239[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray239[local57 + local57] = arg0[local47];
			this.anIntArray239[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I")
	public int method1464(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = this.anIntArray239.length - 2;
		@Pc(20) int local20 = local5 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray239[local20];
			if (arg0 == local25) {
				return this.anIntArray239[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local5 & local20 + 2;
		}
	}
}
