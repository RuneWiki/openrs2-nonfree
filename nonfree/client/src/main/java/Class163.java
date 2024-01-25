import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class163 {

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "[I")
	private final int[] anIntArray273;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "([I)V")
	public Class163(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray273 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray273[local34] = -1;
		}
		@Pc(55) int local55 = 0;
		while (local55 < arg0.length) {
			@Pc(67) int local67;
			for (local67 = arg0[local55] & local5 - 1; this.anIntArray273[local67 + local67 + 1] != -1; local67 = local67 + 1 & local5 + -1) {
			}
			this.anIntArray273[local67 + local67] = arg0[local55];
			this.anIntArray273[local67 + local67 + 1] = local55++;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
	public int method4011(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray273.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(32) int local32 = this.anIntArray273[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray273[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
