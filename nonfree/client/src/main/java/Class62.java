import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class62 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
	private final int[] anIntArray90;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([I)V")
	public Class62(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray90 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray90[local33] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = local5 - 1 & arg0[local52]; this.anIntArray90[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 + -1) {
			}
			this.anIntArray90[local62 + local62] = arg0[local52];
			this.anIntArray90[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	public int method1112(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray90.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(33) int local33 = this.anIntArray90[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (this.anIntArray90[local23 + local23] == arg0) {
				return local33;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
