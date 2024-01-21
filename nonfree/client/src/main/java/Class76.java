import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class76 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
	private final int[] anIntArray280;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([I)V")
	public Class76(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray280 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray280[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray280[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray280[local58 + local58] = arg0[local48];
			this.anIntArray280[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public int method2196(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (this.anIntArray280.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray280[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray280[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
