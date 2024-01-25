import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class38 {

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "[I")
	private final int[] anIntArray48;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "([I)V")
	public Class38(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray48 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray48[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray48[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray48[local57 + local57] = arg0[local47];
			this.anIntArray48[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)I")
	public int method1248(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray48.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray48[local15 + local15 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray48[local15 + local15]) {
				return local30;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
