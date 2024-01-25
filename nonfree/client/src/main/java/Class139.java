import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class139 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
	private final int[] anIntArray327;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([I)V")
	public Class139(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray327 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray327[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray327[local61 + local61 + 1] != -1; local61 = local61 + 1 & local5 + -1) {
			}
			this.anIntArray327[local61 + local61] = arg0[local51];
			this.anIntArray327[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)I")
	public int method3816(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray327.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray327[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray327[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
