import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class299 {

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "[I")
	private final int[] anIntArray589;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "([I)V")
	public Class299(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray589 = new int[local5 + local5];
		for (@Pc(35) int local35 = 0; local35 < local5 + local5; local35++) {
			this.anIntArray589[local35] = -1;
		}
		@Pc(52) int local52 = 0;
		while (arg0.length > local52) {
			@Pc(64) int local64;
			for (local64 = local5 - 1 & arg0[local52]; this.anIntArray589[local64 + local64 + 1] != -1; local64 = local5 - 1 & local64 + 1) {
			}
			this.anIntArray589[local64 + local64] = arg0[local52];
			this.anIntArray589[local64 + local64 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)I")
	public int method6956(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = (this.anIntArray589.length >> 1) - 1;
		@Pc(24) int local24 = arg0 & local20;
		while (true) {
			@Pc(33) int local33 = this.anIntArray589[local24 + local24 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray589[local24 + local24]) {
				return local33;
			}
			local24 = local24 + 1 & local20;
		}
	}
}
