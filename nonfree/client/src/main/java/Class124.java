import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class124 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
	private final int[] anIntArray308;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([I)V")
	public Class124(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray308 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray308[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray308[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray308[local57 + local57] = arg0[local47];
			this.anIntArray308[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I")
	public int method2688(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray308.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(31) int local31 = this.anIntArray308[local15 + local15 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (this.anIntArray308[local15 + local15] == arg0) {
				return local31;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
