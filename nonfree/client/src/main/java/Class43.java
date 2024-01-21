import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class43 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
	private final int[] anIntArray215;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V")
	public Class43(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray215 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray215[local33] = -1;
		}
		@Pc(53) int local53 = 0;
		while (arg0.length > local53) {
			@Pc(63) int local63;
			for (local63 = arg0[local53] & local5 - 1; this.anIntArray215[local63 + local63 + 1] != -1; local63 = local63 + 1 & local5 + -1) {
			}
			this.anIntArray215[local63 + local63] = arg0[local53];
			this.anIntArray215[local63 + local63 + 1] = local53++;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public int method1359(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.anIntArray215.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local14;
		while (true) {
			@Pc(25) int local25 = this.anIntArray215[local20];
			if (arg0 == local25) {
				return this.anIntArray215[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
