import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class67 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
	private final int[] anIntArray292;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([I)V")
	public Class67(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray292 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray292[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray292[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray292[local53 + local53] = arg0[local43];
			this.anIntArray292[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)I")
	public int method1895(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.anIntArray292.length - 2;
		@Pc(20) int local20 = local14 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray292[local20];
			if (arg0 == local25) {
				return this.anIntArray292[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local14 & local20 + 2;
		}
	}
}
