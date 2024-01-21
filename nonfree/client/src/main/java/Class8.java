import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
	private final int[] anIntArray44;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([I)V")
	public Class8(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray44 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray44[local34] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = arg0[local49] & local5 - 1; this.anIntArray44[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 + -1) {
			}
			this.anIntArray44[local59 + local59] = arg0[local49];
			this.anIntArray44[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
	public int method239(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anIntArray44.length - 2;
		@Pc(23) int local23 = local17 & arg0 << 1;
		while (true) {
			@Pc(28) int local28 = this.anIntArray44[local23];
			if (local28 == arg0) {
				return this.anIntArray44[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local23 + 2 & local17;
		}
	}
}
