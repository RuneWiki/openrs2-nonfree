import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class64 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	private final int[] anIntArray281;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([I)V")
	public Class64(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray281 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray281[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = local5 - 1 & arg0[local52]; this.anIntArray281[local62 + local62 + 1] != -1; local62 = local5 - 1 & local62 + 1) {
			}
			this.anIntArray281[local62 + local62] = arg0[local52];
			this.anIntArray281[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I")
	public int method1795(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anIntArray281.length - 2;
		@Pc(23) int local23 = local17 & arg0 << 1;
		while (true) {
			@Pc(28) int local28 = this.anIntArray281[local23];
			if (arg0 == local28) {
				return this.anIntArray281[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local17 & local23 + 2;
		}
	}
}
