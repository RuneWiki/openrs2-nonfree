import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class38 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "([I)V")
	public Class38(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray143 = new int[local5 + local5];
		@Pc(29) int local29;
		for (local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray143[local29] = -1;
		}
		local29 = 0;
		while (local29 < arg0.length) {
			@Pc(60) int local60;
			for (local60 = local5 - 1 & arg0[local29]; this.anIntArray143[local60 + local60 + 1] != -1; local60 = local60 + 1 & local5 + -1) {
			}
			this.anIntArray143[local60 + local60] = arg0[local29];
			this.anIntArray143[local60 + local60 + 1] = local29++;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
	public int method955(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray143.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(31) int local31 = this.anIntArray143[local15 + local15 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray143[local15 + local15]) {
				return local31;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
