import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class40 {

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
	private final int[] anIntArray188;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([I)V")
	public Class40(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray188 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray188[local33] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray188[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 - 1) {
			}
			this.anIntArray188[local59 + local59] = arg0[local49];
			this.anIntArray188[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	public int method882(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray188.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(32) int local32 = this.anIntArray188[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray188[local23 + local23]) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
