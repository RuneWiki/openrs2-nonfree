import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class26 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private final int[] anIntArray37;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([I)V")
	public Class26(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray37 = new int[local5 + local5];
		for (@Pc(39) int local39 = 0; local39 < local5 + local5; local39++) {
			this.anIntArray37[local39] = -1;
		}
		@Pc(60) int local60 = 0;
		while (local60 < arg0.length) {
			@Pc(72) int local72;
			for (local72 = arg0[local60] & local5 - 1; this.anIntArray37[local72 + local72 + 1] != -1; local72 = local5 - 1 & local72 + 1) {
			}
			this.anIntArray37[local72 + local72] = arg0[local60];
			this.anIntArray37[local72 + local72 + 1] = local60++;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method501(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (this.anIntArray37.length >> 1) - 1;
		@Pc(26) int local26 = arg0 & local13;
		while (true) {
			@Pc(35) int local35 = this.anIntArray37[local26 + local26 + 1];
			if (local35 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray37[local26 + local26]) {
				return local35;
			}
			local26 = local26 + 1 & local13;
		}
	}
}
