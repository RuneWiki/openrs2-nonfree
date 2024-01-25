import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class147 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
	private final int[] anIntArray302;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([I)V")
	public Class147(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray302 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray302[local32] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(62) int local62;
			for (local62 = arg0[local52] & local5 - 1; this.anIntArray302[local62 + local62 + 1] != -1; local62 = local62 + 1 & local5 + -1) {
			}
			this.anIntArray302[local62 + local62] = arg0[local52];
			this.anIntArray302[local62 + local62 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)I")
	public int method3310(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray302.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray302[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray302[local20 + local20]) {
				return local30;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
