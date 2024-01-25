import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class49 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "[I")
	private final int[] anIntArray161;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([I)V")
	public Class49(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray161 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray161[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = local5 - 1 & arg0[local43]; this.anIntArray161[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 + 1) {
			}
			this.anIntArray161[local53 + local53] = arg0[local43];
			this.anIntArray161[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
	public int method1130(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray161.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray161[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray161[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
