import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class128 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V")
	public Class128(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray325 = new int[local5 + local5];
		@Pc(28) int local28;
		for (local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray325[local28] = -1;
		}
		local28 = 0;
		while (arg0.length > local28) {
			@Pc(59) int local59;
			for (local59 = arg0[local28] & local5 - 1; this.anIntArray325[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 + -1) {
			}
			this.anIntArray325[local59 + local59] = arg0[local28];
			this.anIntArray325[local59 + local59 + 1] = local28++;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I")
	public int method3209(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray325.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local7;
		while (true) {
			@Pc(24) int local24 = this.anIntArray325[local15 + local15 + 1];
			if (local24 == -1) {
				return -1;
			}
			if (this.anIntArray325[local15 + local15] == arg0) {
				return local24;
			}
			local15 = local7 & local15 + 1;
		}
	}
}
