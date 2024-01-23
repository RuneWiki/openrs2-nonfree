import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class79 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([I)V")
	public Class79(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray232 = new int[local5 + local5];
		@Pc(29) int local29;
		for (local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray232[local29] = -1;
		}
		local29 = 0;
		while (local29 < arg0.length) {
			@Pc(60) int local60;
			for (local60 = local5 - 1 & arg0[local29]; this.anIntArray232[local60 + local60 + 1] != -1; local60 = local60 + 1 & local5 + -1) {
			}
			this.anIntArray232[local60 + local60] = arg0[local29];
			this.anIntArray232[local60 + local60 + 1] = local29++;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public int method1993(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = (this.anIntArray232.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local15;
		while (true) {
			@Pc(32) int local32 = this.anIntArray232[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray232[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local15 & local23 + 1;
		}
	}
}
