import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class48 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[I")
	private final int[] anIntArray137;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([I)V")
	public Class48(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray137 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray137[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray137[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray137[local58 + local58] = arg0[local48];
			this.anIntArray137[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public int method1012(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray137.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray137[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray137[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
