import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class173 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "([I)V")
	public Class173(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray439 = new int[local5 + local5];
		@Pc(29) int local29;
		for (local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray439[local29] = -1;
		}
		local29 = 0;
		while (arg0.length > local29) {
			@Pc(64) int local64;
			for (local64 = local5 - 1 & arg0[local29]; this.anIntArray439[local64 + local64 + 1] != -1; local64 = local64 + 1 & local5 + -1) {
			}
			this.anIntArray439[local64 + local64] = arg0[local29];
			this.anIntArray439[local64 + local64 + 1] = local29++;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public int method4268(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (this.anIntArray439.length >> 1) - 1;
		@Pc(21) int local21 = arg0 & local17;
		while (true) {
			@Pc(30) int local30 = this.anIntArray439[local21 + local21 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray439[local21 + local21] == arg0) {
				return local30;
			}
			local21 = local17 & local21 + 1;
		}
	}
}
