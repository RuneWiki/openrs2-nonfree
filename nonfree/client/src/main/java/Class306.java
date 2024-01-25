import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class306 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
	private final int[] anIntArray514;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V")
	public Class306(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray514 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray514[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray514[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray514[local61 + local61] = arg0[local51];
			this.anIntArray514[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
	public int method6697(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray514.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(32) int local32 = this.anIntArray514[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray514[local23 + local23]) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
