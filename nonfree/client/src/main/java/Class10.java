import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([I)V")
	public Class10(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray35 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray35[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray35[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 - -1) {
			}
			this.anIntArray35[local57 + local57] = arg0[local47];
			this.anIntArray35[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
	public int method191(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray35.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(25) int local25 = this.anIntArray35[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (this.anIntArray35[local15 + local15] == arg0) {
				return local25;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
