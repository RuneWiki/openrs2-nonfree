import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class37 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
	private final int[] anIntArray119;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I)V")
	public Class37(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray119 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray119[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray119[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray119[local53 + local53] = arg0[local43];
			this.anIntArray119[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)I")
	public int method1004(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray119.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray119[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray119[local20 + local20]) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
