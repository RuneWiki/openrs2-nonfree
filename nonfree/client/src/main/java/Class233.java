import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class233 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
	private final int[] anIntArray397;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([I)V")
	public Class233(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray397 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray397[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray397[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray397[local53 + local53] = arg0[local43];
			this.anIntArray397[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
	public int method5397(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (this.anIntArray397.length >> 1) - 1;
		@Pc(21) int local21 = arg0 & local17;
		while (true) {
			@Pc(30) int local30 = this.anIntArray397[local21 + local21 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray397[local21 + local21]) {
				return local30;
			}
			local21 = local21 + 1 & local17;
		}
	}
}
