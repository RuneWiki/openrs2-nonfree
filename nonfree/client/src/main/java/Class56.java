import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class56 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	private final int[] anIntArray468;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([I)V")
	public Class56(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray468 = new int[local3 + local3];
		for (@Pc(29) int local29 = 0; local29 < local3 + local3; local29++) {
			this.anIntArray468[local29] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(56) int local56;
			for (local56 = arg0[local47] & local3 - 1; this.anIntArray468[local56 + local56 + 1] != -1; local56 = local56 + 1 & local3 + -1) {
			}
			this.anIntArray468[local56 + local56] = arg0[local47];
			this.anIntArray468[local56 + local56 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)I")
	public int method2118(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray468.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(29) int local29 = this.anIntArray468[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray468[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
