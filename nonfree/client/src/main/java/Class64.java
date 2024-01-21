import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class64 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
	private final int[] anIntArray311;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
	public Class64(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray311 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray311[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (arg0.length > local51) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray311[local61 + local61 + 1] != -1; local61 = local61 + 1 & local5 + -1) {
			}
			this.anIntArray311[local61 + local61] = arg0[local51];
			this.anIntArray311[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public int method2302(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray311.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(25) int local25 = this.anIntArray311[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray311[local15 + local15]) {
				return local25;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
