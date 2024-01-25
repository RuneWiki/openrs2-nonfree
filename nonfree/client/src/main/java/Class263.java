import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class263 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
	private final int[] anIntArray390;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([I)V")
	public Class263(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray390 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray390[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray390[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 - -1) {
			}
			this.anIntArray390[local57 + local57] = arg0[local47];
			this.anIntArray390[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
	public int method6328(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray390.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray390[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray390[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
