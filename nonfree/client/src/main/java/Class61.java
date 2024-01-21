import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class61 {

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	private final int[] anIntArray319;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([I)V")
	public Class61(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray319 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray319[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray319[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray319[local57 + local57] = arg0[local47];
			this.anIntArray319[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	public int method2494(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray319.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(25) int local25 = this.anIntArray319[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray319[local15 + local15]) {
				return local25;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
