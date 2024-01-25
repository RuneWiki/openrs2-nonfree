import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class163 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "[I")
	private final int[] anIntArray424;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
	public Class163(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray424 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray424[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray424[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray424[local53 + local53] = arg0[local43];
			this.anIntArray424[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
	public int method4468(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray424.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray424[local15 + local15 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray424[local15 + local15]) {
				return local32;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
