import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class35 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
	private final int[] anIntArray158;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([I)V")
	public Class35(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray158 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray158[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray158[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray158[local57 + local57] = arg0[local47];
			this.anIntArray158[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
	public int method804(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.anIntArray158.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local14;
		while (true) {
			@Pc(25) int local25 = this.anIntArray158[local20];
			if (local25 == arg0) {
				return this.anIntArray158[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
