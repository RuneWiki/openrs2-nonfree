import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class64 {

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "[I")
	private final int[] anIntArray308;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I)V")
	public Class64(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray308 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray308[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = arg0[local44] & local5 - 1; this.anIntArray308[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 + 1) {
			}
			this.anIntArray308[local54 + local54] = arg0[local44];
			this.anIntArray308[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)I")
	public int method1828(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = this.anIntArray308.length - 2;
		@Pc(11) int local11 = arg0 << 1 & local5;
		while (true) {
			@Pc(25) int local25 = this.anIntArray308[local11];
			if (arg0 == local25) {
				return this.anIntArray308[local11 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local11 = local11 + 2 & local5;
		}
	}
}
