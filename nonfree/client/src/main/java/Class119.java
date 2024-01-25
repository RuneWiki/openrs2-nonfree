import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class119 {

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private final int[] anIntArray230;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([I)V")
	public Class119(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray230 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray230[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray230[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray230[local57 + local57] = arg0[local47];
			this.anIntArray230[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)I")
	public int method3369(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray230.length >> 1) - 1;
		@Pc(23) int local23 = arg0 & local19;
		while (true) {
			@Pc(32) int local32 = this.anIntArray230[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray230[local23 + local23]) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
