import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class361 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
	private final int[] anIntArray691;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([I)V")
	public Class361(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray691 = new int[local3 + local3];
		for (@Pc(30) int local30 = 0; local30 < local3 + local3; local30++) {
			this.anIntArray691[local30] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local48] & local3 - 1; this.anIntArray691[local57 + local57 + 1] != -1; local57 = local57 + 1 & local3 + -1) {
			}
			this.anIntArray691[local57 + local57] = arg0[local48];
			this.anIntArray691[local57 + local57 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I")
	public int method8286(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray691.length >> 1) - 1;
		@Pc(22) int local22 = arg0 & local11;
		while (true) {
			@Pc(31) int local31 = this.anIntArray691[local22 + local22 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (this.anIntArray691[local22 + local22] == arg0) {
				return local31;
			}
			local22 = local11 & local22 + 1;
		}
	}
}
