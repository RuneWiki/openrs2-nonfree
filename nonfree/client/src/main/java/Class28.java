import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class28 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "([I)V")
	public Class28(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray91 = new int[local5 + local5];
		@Pc(28) int local28;
		for (local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray91[local28] = -1;
		}
		local28 = 0;
		while (local28 < arg0.length) {
			@Pc(60) int local60;
			for (local60 = arg0[local28] & local5 - 1; this.anIntArray91[local60 + local60 + 1] != -1; local60 = local5 - 1 & local60 - -1) {
			}
			this.anIntArray91[local60 + local60] = arg0[local28];
			this.anIntArray91[local60 + local60 + 1] = local28++;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	public int method798(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray91.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray91[local15 + local15 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray91[local15 + local15] == arg0) {
				return local29;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
