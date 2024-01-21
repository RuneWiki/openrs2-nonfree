import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class57 {

	@OriginalMember(owner = "client!p", name = "p", descriptor = "[I")
	private final int[] anIntArray299;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
	public Class57(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray299 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray299[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (arg0.length > local51) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray299[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray299[local61 + local61] = arg0[local51];
			this.anIntArray299[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public int method1556(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anIntArray299.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local10;
		while (true) {
			@Pc(25) int local25 = this.anIntArray299[local20];
			if (local25 == arg0) {
				return this.anIntArray299[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local10 & local20 + 2;
		}
	}
}
