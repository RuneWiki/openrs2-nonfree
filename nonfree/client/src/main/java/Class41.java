import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class41 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	private final int[] anIntArray183;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([I)V")
	public Class41(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray183 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray183[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray183[local62 + local62 + 1] != -1; local62 = local5 - 1 & local62 + 1) {
			}
			this.anIntArray183[local62 + local62] = arg0[local52];
			this.anIntArray183[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)I")
	public int method1254(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray183.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local11;
		while (true) {
			@Pc(30) int local30 = this.anIntArray183[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray183[local20 + local20] == arg0) {
				return local30;
			}
			local20 = local20 + 1 & local11;
		}
	}
}
