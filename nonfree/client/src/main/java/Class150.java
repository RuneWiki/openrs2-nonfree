import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class150 {

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "[I")
	private final int[] anIntArray395;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "([I)V")
	public Class150(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray395 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray395[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray395[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 - -1) {
			}
			this.anIntArray395[local57 + local57] = arg0[local47];
			this.anIntArray395[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)I")
	public int method4036(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray395.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(24) int local24 = this.anIntArray395[local15 + local15 + 1];
			if (local24 == -1) {
				return -1;
			}
			if (this.anIntArray395[local15 + local15] == arg0) {
				return local24;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
