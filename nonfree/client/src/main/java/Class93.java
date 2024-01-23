import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class93 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "([I)V")
	public Class93(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray514 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray514[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray514[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 - 1) {
			}
			this.anIntArray514[local57 + local57] = arg0[local47];
			this.anIntArray514[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)I")
	public int method2917(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray514.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray514[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray514[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
