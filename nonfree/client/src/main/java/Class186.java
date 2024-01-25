import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class186 {

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "[I")
	private final int[] anIntArray322;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "([I)V")
	public Class186(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray322 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray322[local34] = -1;
		}
		@Pc(53) int local53 = 0;
		while (arg0.length > local53) {
			@Pc(63) int local63;
			for (local63 = local5 - 1 & arg0[local53]; this.anIntArray322[local63 + local63 + 1] != -1; local63 = local63 + 1 & local5 + -1) {
			}
			this.anIntArray322[local63 + local63] = arg0[local53];
			this.anIntArray322[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)I")
	public int method4776(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray322.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray322[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray322[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
