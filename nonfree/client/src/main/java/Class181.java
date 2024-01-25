import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class181 {

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "[I")
	private final int[] anIntArray345;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "([I)V")
	public Class181(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray345 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray345[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray345[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray345[local57 + local57] = arg0[local47];
			this.anIntArray345[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I")
	public int method4717(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray345.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(24) int local24 = this.anIntArray345[local15 + local15 + 1];
			if (local24 == -1) {
				return -1;
			}
			if (this.anIntArray345[local15 + local15] == arg0) {
				return local24;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
