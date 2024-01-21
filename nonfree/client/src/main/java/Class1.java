import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
	private final int[] anIntArray4;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([I)V")
	public Class1(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray4 = new int[local3 + local3];
		for (@Pc(26) int local26 = 0; local26 < local3 + local3; local26++) {
			this.anIntArray4[local26] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local3 - 1 & arg0[local44]; this.anIntArray4[local53 + local53 + 1] != -1; local53 = local53 + 1 & local3 + -1) {
			}
			this.anIntArray4[local53 + local53] = arg0[local44];
			this.anIntArray4[local53 + local53 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public int method2(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = this.anIntArray4.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local5;
		while (true) {
			@Pc(25) int local25 = this.anIntArray4[local20];
			if (local25 == arg0) {
				return this.anIntArray4[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local5 & local20 + 2;
		}
	}
}
