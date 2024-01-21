import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class72 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
	private final int[] anIntArray345;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V")
	public Class72(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray345 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray345[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray345[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 + -1) {
			}
			this.anIntArray345[local62 + local62] = arg0[local52];
			this.anIntArray345[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)I")
	public int method1618(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = (this.anIntArray345.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local7;
		while (true) {
			@Pc(30) int local30 = this.anIntArray345[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray345[local20 + local20] == arg0) {
				return local30;
			}
			local20 = local20 + 1 & local7;
		}
	}
}
