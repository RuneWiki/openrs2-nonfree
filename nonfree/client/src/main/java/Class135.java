import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class135 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "[I")
	private final int[] anIntArray401;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "([I)V")
	public Class135(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray401 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray401[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray401[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 - 1) {
			}
			this.anIntArray401[local57 + local57] = arg0[local47];
			this.anIntArray401[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)I")
	public int method3188(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray401.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local11;
		while (true) {
			@Pc(32) int local32 = this.anIntArray401[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray401[local23 + local23]) {
				return local32;
			}
			local23 = local23 + 1 & local11;
		}
	}
}
