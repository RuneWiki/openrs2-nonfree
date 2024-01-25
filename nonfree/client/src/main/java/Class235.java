import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class235 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
	private final int[] anIntArray503;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V")
	public Class235(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray503 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray503[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray503[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray503[local57 + local57] = arg0[local47];
			this.anIntArray503[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public int method5174(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray503.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray503[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray503[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
