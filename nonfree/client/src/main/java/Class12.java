import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class12 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	private final int[] anIntArray47;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([I)V")
	public Class12(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray47 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray47[local30] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray47[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 - -1) {
			}
			this.anIntArray47[local59 + local59] = arg0[local49];
			this.anIntArray47[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	public int method307(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = this.anIntArray47.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local5;
		while (true) {
			@Pc(25) int local25 = this.anIntArray47[local20];
			if (arg0 == local25) {
				return this.anIntArray47[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local5 & local20 + 2;
		}
	}
}
