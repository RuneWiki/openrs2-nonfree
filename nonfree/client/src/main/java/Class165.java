import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class165 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
	private int[] anIntArray633;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([I)V")
	public Class165(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray633 = new int[local5 + local5];
		@Pc(32) int local32;
		for (local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray633[local32] = -1;
		}
		local32 = 0;
		while (arg0.length > local32) {
			@Pc(63) int local63;
			for (local63 = arg0[local32] & local5 - 1; this.anIntArray633[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray633[local63 + local63] = arg0[local32];
			this.anIntArray633[local63 + local63 + 1] = local32++;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	public int method4183(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray633.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray633[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray633[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
