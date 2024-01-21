import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class74 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
	private final int[] anIntArray293;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V")
	public Class74(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray293 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray293[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray293[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 + -1) {
			}
			this.anIntArray293[local62 + local62] = arg0[local52];
			this.anIntArray293[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public int method1907(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.anIntArray293.length - 2;
		@Pc(23) int local23 = arg0 << 1 & local17;
		while (true) {
			@Pc(28) int local28 = this.anIntArray293[local23];
			if (local28 == arg0) {
				return this.anIntArray293[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local17 & local23 + 2;
		}
	}
}
