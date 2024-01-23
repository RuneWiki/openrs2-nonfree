import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class66 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([I)V")
	public Class66(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray168 = new int[local5 + local5];
		@Pc(32) int local32;
		for (local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray168[local32] = -1;
		}
		local32 = 0;
		while (arg0.length > local32) {
			@Pc(63) int local63;
			for (local63 = arg0[local32] & local5 - 1; this.anIntArray168[local63 + local63 + 1] != -1; local63 = local5 - 1 & local63 + 1) {
			}
			this.anIntArray168[local63 + local63] = arg0[local32];
			this.anIntArray168[local63 + local63 + 1] = local32++;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public int method1564(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray168.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(29) int local29 = this.anIntArray168[local15 + local15 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray168[local15 + local15] == arg0) {
				return local29;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
