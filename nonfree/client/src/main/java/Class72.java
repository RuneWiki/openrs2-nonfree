import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class72 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
	private final int[] anIntArray382;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([I)V")
	public Class72(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray382 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray382[local32] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray382[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 - 1) {
			}
			this.anIntArray382[local62 + local62] = arg0[local52];
			this.anIntArray382[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	public int method1860(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anIntArray382.length - 2;
		@Pc(23) int local23 = arg0 << 1 & local17;
		while (true) {
			@Pc(28) int local28 = this.anIntArray382[local23];
			if (arg0 == local28) {
				return this.anIntArray382[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local17 & local23 + 2;
		}
	}
}
