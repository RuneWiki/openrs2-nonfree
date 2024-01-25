import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class338 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[I")
	private final int[] anIntArray640;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([I)V")
	public Class338(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray640 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray640[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray640[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray640[local58 + local58] = arg0[local48];
			this.anIntArray640[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	public int method7133(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = (this.anIntArray640.length >> 1) - 1;
		@Pc(21) int local21 = local17 & arg0;
		while (true) {
			@Pc(31) int local31 = this.anIntArray640[local21 + local21 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray640[local21 + local21]) {
				return local31;
			}
			local21 = local21 + 1 & local17;
		}
	}
}
