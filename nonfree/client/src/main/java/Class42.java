import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class42 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	private final int[] anIntArray263;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V")
	public Class42(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray263 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray263[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray263[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray263[local58 + local58] = arg0[local48];
			this.anIntArray263[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public int method1183(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray263.length - 2;
		@Pc(19) int local19 = local9 & arg0 << 1;
		while (true) {
			@Pc(24) int local24 = this.anIntArray263[local19];
			if (arg0 == local24) {
				return this.anIntArray263[local19 + 1];
			}
			if (local24 == -1) {
				return -1;
			}
			local19 = local19 + 2 & local9;
		}
	}
}
