import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class57 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
	public static final int[] anIntArray267 = new int[256];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
	private final int[] anIntArray266;

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(21) int local21 = local18;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1) == 1) {
					local21 = local21 >>> 1 ^ 0xEDB88320;
				} else {
					local21 >>>= 0x1;
				}
			}
			anIntArray267[local18] = local21;
		}
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I)V")
	public Class57(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray266 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray266[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray266[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray266[local53 + local53] = arg0[local43];
			this.anIntArray266[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
	public int method2064(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = (this.anIntArray266.length >> 1) - 1;
		@Pc(23) int local23 = local15 & arg0;
		while (true) {
			@Pc(33) int local33 = this.anIntArray266[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray266[local23 + local23]) {
				return local33;
			}
			local23 = local15 & local23 + 1;
		}
	}
}
